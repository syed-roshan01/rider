package l3;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f11233a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j10) throws IOException {
        int i10 = this.f11235c;
        if (i10 > j10) {
            this.f11235c = 0;
            this.f11233a.reset();
        } else {
            j10 -= (long) i10;
        }
        a((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f11233a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
