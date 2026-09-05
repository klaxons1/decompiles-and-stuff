package p000;

import com.mascotcapsule.eruption.docomostar.BufferPool;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class DirectBufferManager {
    private static BufferPool[] batchBuffer;
    private static BufferPool[] buffer;

    DirectBufferManager() {
    }

    public static BufferPool getBBS() {
        return buffer[2];
    }

    public static BufferPool getBatchBBS() {
        return batchBuffer[2];
    }

    public static BufferPool[] getBatchBuffer() {
        return batchBuffer;
    }

    public static BufferPool getBatchIBS() {
        return batchBuffer[1];
    }

    public static BufferPool getBatchVBS() {
        return batchBuffer[0];
    }

    public static BufferPool[] getBuffer() {
        return buffer;
    }

    public static BufferPool getIBS() {
        return buffer[1];
    }

    public static BufferPool getVBS() {
        return buffer[0];
    }

    public static void init() {
        buffer = new BufferPool[3];
        batchBuffer = new BufferPool[3];
        buffer[0] = new BufferPool(1, 51, 25600);
        buffer[1] = new BufferPool(2, 0, 46080);
        buffer[2] = new BufferPool(3, 0, 2160640);
        batchBuffer[0] = new BufferPool(1, 1048627, 1200);
        batchBuffer[1] = buffer[1];
        batchBuffer[2] = buffer[2];
    }
}
