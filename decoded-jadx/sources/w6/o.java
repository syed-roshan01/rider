package w6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f16229e;

    public o(int i10, int i11, int i12, n nVar) {
        this.f16226b = i10;
        this.f16227c = i11;
        this.f16228d = i12;
        this.f16229e = nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f16226b == this.f16226b && oVar.f16227c == this.f16227c && oVar.f16228d == this.f16228d && oVar.f16229e == this.f16229e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16226b), Integer.valueOf(this.f16227c), Integer.valueOf(this.f16228d), this.f16229e);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + this.f16229e + ", " + this.f16227c + "-byte IV, " + this.f16228d + "-byte tag, and " + this.f16226b + "-byte key)";
    }
}
