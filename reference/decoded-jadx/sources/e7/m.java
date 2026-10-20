package e7;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w6.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f5183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f5184e;

    public m(int i10, int i11, l lVar, k kVar) {
        this.f5181b = i10;
        this.f5182c = i11;
        this.f5183d = lVar;
        this.f5184e = kVar;
    }

    public final int b() {
        l lVar = l.f5179e;
        int i10 = this.f5182c;
        l lVar2 = this.f5183d;
        if (lVar2 == lVar) {
            return i10;
        }
        if (lVar2 != l.f5176b && lVar2 != l.f5177c && lVar2 != l.f5178d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f5181b == this.f5181b && mVar.b() == b() && mVar.f5183d == this.f5183d && mVar.f5184e == this.f5184e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5181b), Integer.valueOf(this.f5182c), this.f5183d, this.f5184e);
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + this.f5183d + ", hashType: " + this.f5184e + ", " + this.f5182c + "-byte tags, and " + this.f5181b + "-byte key)";
    }
}
