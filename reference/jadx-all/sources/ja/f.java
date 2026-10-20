package ja;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8531b;

    public /* synthetic */ f(i iVar, int i10) {
        this.f8530a = i10;
        this.f8531b = iVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i10 = this.f8530a;
        i iVar = this.f8531b;
        switch (i10) {
            case 0:
                return (int) Math.min(((g) iVar).f8534b, Integer.MAX_VALUE);
            default:
                a0 a0Var = (a0) iVar;
                if (a0Var.f8503c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(a0Var.f8502b.f8534b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f8530a) {
            case 0:
                break;
            default:
                ((a0) this.f8531b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f8530a;
        i iVar = this.f8531b;
        switch (i12) {
            case 0:
                d7.a.m(bArr, "sink");
                return ((g) iVar).u(bArr, i10, i11);
            default:
                d7.a.m(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                a0 a0Var = (a0) iVar;
                if (a0Var.f8503c) {
                    throw new IOException("closed");
                }
                o7.d0.m(bArr.length, i10, i11);
                g gVar = a0Var.f8502b;
                if (gVar.f8534b == 0 && a0Var.f8501a.I(gVar, 8192L) == -1) {
                    return -1;
                }
                return gVar.u(bArr, i10, i11);
        }
    }

    public final String toString() {
        int i10 = this.f8530a;
        i iVar = this.f8531b;
        switch (i10) {
            case 0:
                return ((g) iVar) + ".inputStream()";
            default:
                return ((a0) iVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f8530a;
        i iVar = this.f8531b;
        switch (i10) {
            case 0:
                g gVar = (g) iVar;
                if (gVar.f8534b > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                a0 a0Var = (a0) iVar;
                if (!a0Var.f8503c) {
                    g gVar2 = a0Var.f8502b;
                    if (gVar2.f8534b == 0 && a0Var.f8501a.I(gVar2, 8192L) == -1) {
                        return -1;
                    }
                    return gVar2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }
}
