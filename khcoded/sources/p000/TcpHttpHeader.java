package p000;

import com.docomostar.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class TcpHttpHeader {
    private int status;
    private final byte HEADER_SPLIT_NUM = 2;
    private final String HEADER_SPLIT = ": ";
    private int headerSize = 0;
    private int contentSize = 0;

    TcpHttpHeader() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[Catch: Exception -> 0x00d9, TryCatch #4 {Exception -> 0x00d9, blocks: (B:12:0x0029, B:14:0x002e, B:16:0x0033), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #4 {Exception -> 0x00d9, blocks: (B:12:0x0029, B:14:0x002e, B:16:0x0033), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: Exception -> 0x0094, TryCatch #7 {Exception -> 0x0094, blocks: (B:29:0x0086, B:31:0x008b, B:33:0x0090), top: B:70:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[Catch: Exception -> 0x0094, TRY_LEAVE, TryCatch #7 {Exception -> 0x0094, blocks: (B:29:0x0086, B:31:0x008b, B:33:0x0090), top: B:70:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[Catch: Exception -> 0x00bf, TryCatch #0 {Exception -> 0x00bf, blocks: (B:43:0x00b1, B:45:0x00b6, B:47:0x00bb), top: B:66:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[Catch: Exception -> 0x00bf, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bf, blocks: (B:43:0x00b1, B:45:0x00b6, B:47:0x00bb), top: B:66:0x00b1 }] */
    public boolean analyzeHeader(byte[] bArr) throws Throwable {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        InputStream inputStreamByte2InputStream;
        boolean z = false;
        try {
            inputStreamByte2InputStream = Util.byte2InputStream(bArr);
            try {
                inputStreamReader = new InputStreamReader(inputStreamByte2InputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        int i = new String(bArr).indexOf("\r\n") != -1 ? 2 : 1;
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.length() <= 0) {
                                this.headerSize = i + this.headerSize;
                                z = true;
                                break;
                            }
                            this.headerSize += line.length() + i;
                            int iIndexOf = line.indexOf(": ");
                            if (iIndexOf != -1) {
                                String[] strArr = {line.substring(0, iIndexOf), line.substring(iIndexOf + 2, line.length())};
                                if (strArr[0].equals("Content-Length")) {
                                    this.contentSize = Util.s2i(strArr[1]);
                                }
                            } else if (line.indexOf("HTTP/1.1 ") != -1) {
                                this.status = Util.s2i(line.substring(9, 12));
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (inputStreamByte2InputStream != null) {
                                    inputStreamByte2InputStream.close();
                                }
                            } catch (Exception e) {
                            }
                        } else {
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (inputStreamByte2InputStream != null) {
                                inputStreamByte2InputStream.close();
                            }
                        }
                    } catch (Exception e2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (inputStreamByte2InputStream != null) {
                                    inputStreamByte2InputStream.close();
                                }
                            } catch (Exception e3) {
                            }
                        } else {
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (inputStreamByte2InputStream != null) {
                                inputStreamByte2InputStream.close();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (inputStreamByte2InputStream != null) {
                                    inputStreamByte2InputStream.close();
                                }
                            } catch (Exception e4) {
                                throw th;
                            }
                        } else {
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (inputStreamByte2InputStream != null) {
                                inputStreamByte2InputStream.close();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Exception e6) {
                bufferedReader = null;
                inputStreamReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader = null;
            }
        } catch (Exception e7) {
            bufferedReader = null;
            inputStreamReader = null;
            inputStreamByte2InputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            inputStreamReader = null;
            inputStreamByte2InputStream = null;
        }
        return z;
    }

    public int getContentSize() {
        return this.contentSize;
    }

    public int getHeaderSize() {
        return this.headerSize;
    }

    public int getStatus() {
        return this.status;
    }
}
