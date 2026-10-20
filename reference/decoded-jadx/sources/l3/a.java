package l3;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11230b;

    public a(f fVar) {
        this.f11230b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f11229a;
            f fVar = this.f11230b;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) fVar.f11233a.available())) {
                    return -1;
                }
                fVar.b(j10);
                this.f11229a = j10;
            }
            if (i11 > fVar.f11233a.available()) {
                i11 = fVar.f11233a.available();
            }
            int i12 = fVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f11229a += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f11229a = -1L;
        return -1;
    }
}
