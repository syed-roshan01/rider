package androidx.fragment.app;

import android.util.Log;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1998a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f2000c = new StringBuilder(128);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1999b = "FragmentManager";

    public final void a() {
        if (((StringBuilder) this.f2000c).length() > 0) {
            Log.d((String) this.f1999b, ((StringBuilder) this.f2000c).toString());
            CharSequence charSequence = this.f2000c;
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f1998a) {
            case 1:
                return append(charSequence);
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1998a) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f1998a) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i10) throws IOException {
        switch (this.f1998a) {
            case 1:
                ((Appendable) this.f1999b).append((char) i10);
                break;
            default:
                super.write(i10);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) {
        switch (this.f1998a) {
            case 1:
                return append(charSequence, i10, i11);
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) throws IOException {
        switch (this.f1998a) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f1999b).append(str, i10, i11 + i10);
                break;
            default:
                super.write(str, i10, i11);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        switch (this.f1998a) {
            case 1:
                ((Appendable) this.f1999b).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        switch (this.f1998a) {
            case 1:
                ((Appendable) this.f1999b).append(charSequence, i10, i11);
                return this;
            default:
                return super.append(charSequence, i10, i11);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        switch (this.f1998a) {
            case 0:
                for (int i12 = 0; i12 < i11; i12++) {
                    char c10 = cArr[i10 + i12];
                    if (c10 == '\n') {
                        a();
                    } else {
                        ((StringBuilder) this.f2000c).append(c10);
                    }
                }
                break;
            default:
                r7.u uVar = (r7.u) this.f2000c;
                uVar.getClass();
                uVar.getClass();
                ((Appendable) this.f1999b).append(uVar, i10, i11 + i10);
                break;
        }
    }
}
