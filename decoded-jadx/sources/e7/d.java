package e7;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w6.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f5161d;

    public d(int i10, int i11, c cVar) {
        this.f5159b = i10;
        this.f5160c = i11;
        this.f5161d = cVar;
    }

    public final int b() {
        c cVar = c.f5157e;
        int i10 = this.f5160c;
        c cVar2 = this.f5161d;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 != c.f5154b && cVar2 != c.f5155c && cVar2 != c.f5156d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f5159b == this.f5159b && dVar.b() == b() && dVar.f5161d == this.f5161d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5159b), Integer.valueOf(this.f5160c), this.f5161d);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.f5161d + ", " + this.f5160c + "-byte tags, and " + this.f5159b + "-byte key)";
    }
}
