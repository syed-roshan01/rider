package g8;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7309b;

    public /* synthetic */ z3(Object obj, int i10) {
        this.f7308a = i10;
        this.f7309b = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7308a) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f7308a) {
            case 1:
                break;
            default:
                super.flush();
                break;
        }
    }

    public final String toString() {
        switch (this.f7308a) {
            case 1:
                return ((ja.g) this.f7309b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = this.f7308a;
        Object obj = this.f7309b;
        switch (i12) {
            case 0:
                ((b4) obj).i(bArr, i10, i11);
                break;
            default:
                d7.a.m(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                ((ja.g) obj).f0(bArr, i10, i11);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(b4 b4Var) {
        this(b4Var, 0);
        this.f7308a = 0;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        switch (this.f7308a) {
            case 0:
                write(new byte[]{(byte) i10}, 0, 1);
                break;
            default:
                ((ja.g) this.f7309b).h0(i10);
                break;
        }
    }
}
