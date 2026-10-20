package u2;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f15394e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15398d;

    public c(int i10, int i11, int i12, int i13) {
        this.f15395a = i10;
        this.f15396b = i11;
        this.f15397c = i12;
        this.f15398d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f15395a, cVar2.f15395a), Math.max(cVar.f15396b, cVar2.f15396b), Math.max(cVar.f15397c, cVar2.f15397c), Math.max(cVar.f15398d, cVar2.f15398d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f15394e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f15395a, this.f15396b, this.f15397c, this.f15398d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15398d == cVar.f15398d && this.f15395a == cVar.f15395a && this.f15397c == cVar.f15397c && this.f15396b == cVar.f15396b;
    }

    public final int hashCode() {
        return (((((this.f15395a * 31) + this.f15396b) * 31) + this.f15397c) * 31) + this.f15398d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f15395a);
        sb.append(", top=");
        sb.append(this.f15396b);
        sb.append(", right=");
        sb.append(this.f15397c);
        sb.append(", bottom=");
        return a7.a.o(sb, this.f15398d, '}');
    }
}
