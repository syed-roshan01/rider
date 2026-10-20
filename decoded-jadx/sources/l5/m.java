package l5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5.c f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11358b;

    public m(i5.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f11357a = cVar;
        this.f11358b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f11357a.equals(mVar.f11357a)) {
            return Arrays.equals(this.f11358b, mVar.f11358b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11357a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11358b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f11357a + ", bytes=[...]}";
    }
}
