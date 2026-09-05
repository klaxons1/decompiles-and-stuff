package p000;

import com.docomostar.media.MediaSound;
import com.docomostar.ui.AudioPresenter;
import com.docomostar.ui.MediaListener;
import com.docomostar.ui.MediaPresenter;
import com.jcraft.jzlib.ZInputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Sound implements MediaListener {
    private static AudioPresenter[] AUDIO = null;
    private static final int MAX_SOUND_NUM = 4;
    public static final int SECTION_FIX = 0;
    public static final int SECTION_MAX = 13;
    public static final int SECTION_STAGE = 1;
    public static final int TYPE_BGM = 0;
    public static final int TYPE_SE = 1;
    public static int[][] volumBase = {new int[]{0, 25, 50, 100}, new int[]{0, 25, 50, 100}};
    private static int[] _NOW_ = {-1, -1, -1, -1};
    private static int[] _SET_ = {-1, -1, -1, -1};
    private static int[] NOW_BGM = {-1, -1, -1, -1};
    private static final Sound sound = new Sound();
    private static byte[][][] sePort = new byte[13][][];
    private static MediaSound[][][] MSND = new MediaSound[13][][];

    Sound() {
    }

    public static void FreeAllSoundData() {
        if (MSND == null) {
            return;
        }
        for (int i = 0; i < MSND.length; i++) {
            FreeSoundData(i);
        }
    }

    public static void FreeSoundData(int i) {
        int sectionIndex = getSectionIndex(i);
        if (MSND == null || MSND[sectionIndex] == null) {
            return;
        }
        for (int i2 = 0; i2 < MSND[sectionIndex].length; i2++) {
            Util.FreeData(MSND[sectionIndex][i2], 2);
        }
        if (sectionIndex <= 1) {
            for (int i3 = 0; i3 < _NOW_.length; i3++) {
                _NOW_[i3] = -1;
                _SET_[i3] = -1;
                NOW_BGM[i3] = -1;
            }
            sePort[sectionIndex] = (byte[][]) null;
            init();
        }
    }

    public static void LoadSEPortData(int i, ZInputStream zInputStream, int i2) {
        int sectionIndex = getSectionIndex(i2);
        sePort[sectionIndex] = (byte[][]) null;
        try {
            sePort[sectionIndex] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, 2);
            for (int i3 = 0; i3 < sePort[sectionIndex].length; i3++) {
                for (int i4 = 0; i4 < sePort[sectionIndex][i3].length; i4++) {
                    sePort[sectionIndex][i3][i4] = (byte) zInputStream.read();
                }
            }
        } catch (Exception e) {
        }
    }

    public static void LoadSoundData(ZInputStream zInputStream, int i, int i2) throws Exception {
        int sectionIndex = getSectionIndex(i2);
        if (MSND[sectionIndex] == null) {
            MSND[sectionIndex] = new MediaSound[2][];
        }
        MSND[sectionIndex][i] = (MediaSound[]) Util.ReadData(zInputStream, 2, i2);
    }

    public static void LoadSoundData(String[] strArr, int i) {
        int sectionIndex = getSectionIndex(i);
        MSND[sectionIndex] = new MediaSound[2][];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= MSND[sectionIndex].length) {
                return;
            }
            if (strArr[i3] != null && strArr[i3].length() > 0) {
                MSND[sectionIndex][i3] = (MediaSound[]) Util.ReadData(strArr[i3], 2, i);
            }
            i2 = i3 + 1;
        }
    }

    public static void bgmReplay() {
        try {
            Util.Sleep(50);
            for (int i = 0; i < AUDIO.length; i++) {
                if (NOW_BGM[i] >= 0 && AUDIO[i] != null && AUDIO[i].getMediaResource() != null) {
                    _SET_[i] = NOW_BGM[i];
                    AUDIO[i].play(playTime(i));
                }
            }
        } catch (Exception e) {
        }
    }

    public static int getNowSoundNo(int i) {
        int i2 = _NOW_[i];
        int i3 = _SET_[i];
        return i3 >= 0 ? i3 : i2;
    }

    public static int getPortNo(int i, int i2) {
        return sePort[getSectionIndex(i)][i2][0];
    }

    private static int getSectionIndex(int i) {
        return i >= 65535 ? ((i >> 16) - 1) + 2 : i;
    }

    public static void init() {
        AUDIO = new AudioPresenter[4];
        for (int i = 0; i < AUDIO.length; i++) {
            AUDIO[i] = AudioPresenter.getAudioPresenter(i);
            AUDIO[i].setMediaListener(sound);
        }
        setVolume();
    }

    public static int movieBgm(int i, MediaSound mediaSound) {
        try {
            if (AUDIO[i].getMediaResource() != null) {
                AUDIO[i].stop();
            }
            AUDIO[i].setSound(mediaSound);
            AUDIO[i].play();
            NOW_BGM[i] = 255;
            _SET_[i] = NOW_BGM[i];
            return AUDIO[i].getTotalTime();
        } catch (Exception e) {
            return 0;
        }
    }

    public static int playTime(int i) {
        return AUDIO[i].getCurrentTime();
    }

    public static void play_se(int i, int i2, int i3) {
        byte b;
        int sectionIndex = getSectionIndex(i);
        try {
            if (i2 == 0) {
                int nowSoundNo = getNowSoundNo(0);
                if (nowSoundNo >= 0 && (nowSoundNo >> 16) == sectionIndex && (nowSoundNo & 65535) == i3) {
                    return;
                } else {
                    b = 0;
                }
            } else {
                byte b2 = sePort[sectionIndex][i3][0];
                int nowSoundNo2 = getNowSoundNo(b2);
                if (nowSoundNo2 >= 0 && sePort[nowSoundNo2 >> 16][nowSoundNo2 & 65535][1] > sePort[sectionIndex][i3][1]) {
                    return;
                } else {
                    b = b2;
                }
            }
            NOW_BGM[b] = (sectionIndex << 16) + i3;
            try {
                MediaSound mediaResource = AUDIO[b].getMediaResource();
                if (mediaResource != null) {
                    AUDIO[b].stop();
                }
                if (mediaResource != MSND[sectionIndex][i2][i3]) {
                    AUDIO[b].setSound(MSND[sectionIndex][i2][i3]);
                }
            } catch (Exception e) {
                AUDIO[b].setSound(MSND[sectionIndex][i2][i3]);
            }
            _SET_[b] = (sectionIndex << 16) + i3;
            AUDIO[b].play();
        } catch (Exception e2) {
        }
    }

    public static void setVolume() {
        if (AUDIO != null) {
            int i = 0;
            while (i < AUDIO.length) {
                AUDIO[i].setAttribute(4, volumBase[i == 0 ? (char) 0 : (char) 1][GameStatus.systemData[2]]);
                i++;
            }
        }
    }

    public static void setVolume(int i) {
        if (AUDIO != null) {
            for (int i2 = 0; i2 < AUDIO.length; i2++) {
                AUDIO[i2].setAttribute(4, i);
            }
        }
    }

    public static void soundPause(int i, boolean z) {
        if (z) {
            AUDIO[i].pause();
        } else {
            AUDIO[i].restart();
        }
    }

    public static void soundStop(int i) {
        try {
            if (AUDIO[i] == null || AUDIO[i].getMediaResource() == null) {
                return;
            }
            AUDIO[i].stop();
            NOW_BGM[i] = -1;
            int[] iArr = _NOW_;
            _SET_[i] = -1;
            iArr[i] = -1;
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void mediaAction(MediaPresenter mediaPresenter, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 1:
                while (i3 < AUDIO.length) {
                    if (_SET_[i3] >= 0 && AUDIO[i3] == mediaPresenter) {
                        _NOW_[i3] = _SET_[i3];
                        _SET_[i3] = -1;
                    }
                    i3++;
                }
                break;
            case 2:
            case 3:
                while (i3 < AUDIO.length) {
                    if (AUDIO[i3] == mediaPresenter) {
                        _NOW_[i3] = -1;
                        if (i == 3) {
                            NOW_BGM[i3] = -1;
                        }
                    } else {
                        i3++;
                    }
                    break;
                }
                break;
        }
    }
}
