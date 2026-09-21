package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: renamed from: ad */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0004ad {

    /* JADX INFO: renamed from: a */
    public int f35a;

    /* JADX INFO: renamed from: b */
    public int f36b;

    /* JADX INFO: renamed from: c */
    public int f37c;

    /* JADX INFO: renamed from: d */
    public Reader f38d;

    /* JADX INFO: renamed from: e */
    public char[] f39e;

    /* JADX INFO: renamed from: f */
    public StringBuffer f40f = new StringBuffer();

    public C0004ad(InputStream inputStream, int i) {
        this.f38d = new InputStreamReader(inputStream);
        this.f39e = new char[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m40a() throws IOException {
        if (this.f38d != null) {
            this.f38d.close();
            this.f38d = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41b() {
        return this.f37c == -1;
    }

    /* JADX INFO: renamed from: c */
    public final String m42c() throws IOException {
        if (this.f38d == null) {
            throw new IOException("LineReader already closed");
        }
        while (true) {
            if (this.f36b == this.f37c) {
                this.f40f.append(this.f39e, this.f35a, this.f36b - this.f35a);
                this.f37c = this.f38d.read(this.f39e);
                this.f36b = 0;
                this.f35a = 0;
                if (this.f37c == -1 && this.f40f.length() > 0) {
                    String string = this.f40f.toString();
                    this.f40f = new StringBuffer();
                    return string;
                }
            }
            int i = this.f35a;
            while (true) {
                this.f36b = i;
                if (this.f36b < this.f37c) {
                    if (this.f39e[this.f36b] == '\n' || this.f39e[this.f36b] == '\r') {
                        this.f40f.append(this.f39e, this.f35a, this.f36b - this.f35a);
                        this.f36b++;
                        this.f35a = this.f36b;
                        if (this.f40f.length() > 0) {
                            String string2 = this.f40f.toString();
                            this.f40f = new StringBuffer();
                            return string2;
                        }
                    }
                    i = this.f36b + 1;
                }
            }
        }
    }
}
