package w6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f16217e;

    public k(int i10, int i11, int i12, j jVar) {
        this.f16214b = i10;
        this.f16215c = i11;
        this.f16216d = i12;
        this.f16217e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f16214b == this.f16214b && kVar.f16215c == this.f16215c && kVar.f16216d == this.f16216d && kVar.f16217e == this.f16217e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16214b), Integer.valueOf(this.f16215c), Integer.valueOf(this.f16216d), this.f16217e);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + this.f16217e + ", " + this.f16215c + "-byte IV, " + this.f16216d + "-byte tag, and " + this.f16214b + "-byte key)";
    }
}
