package e1;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4999d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f5001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5002g;

    public e0(List list, long j10, float f10, int i10) {
        this.f4998c = list;
        this.f5000e = j10;
        this.f5001f = f10;
        this.f5002g = i10;
    }

    @Override // e1.j0
    public final Shader b(long j10) {
        float fD;
        float fB;
        long j11 = d1.c.f4328d;
        long j12 = this.f5000e;
        if (j12 == j11) {
            long jV = d7.t.V(j10);
            fD = d1.c.d(jV);
            fB = d1.c.e(jV);
        } else {
            fD = d1.c.d(j12) == Float.POSITIVE_INFINITY ? d1.f.d(j10) : d1.c.d(j12);
            fB = d1.c.e(j12) == Float.POSITIVE_INFINITY ? d1.f.b(j10) : d1.c.e(j12);
        }
        long jF = d9.i.f(fD, fB);
        float fC = this.f5001f;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = d1.f.c(j10) / 2;
        }
        float f10 = fC;
        List list = this.f4998c;
        List list2 = this.f4999d;
        androidx.compose.ui.graphics.a.v(list, list2);
        float fD2 = d1.c.d(jF);
        float fE = d1.c.e(jF);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = androidx.compose.ui.graphics.a.s(((r) list.get(i10)).f5067a);
        }
        return new RadialGradient(fD2, fE, f10, iArr, androidx.compose.ui.graphics.a.n(list2, list), androidx.compose.ui.graphics.a.r(this.f5002g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return d7.a.d(this.f4998c, e0Var.f4998c) && d7.a.d(this.f4999d, e0Var.f4999d) && d1.c.b(this.f5000e, e0Var.f5000e) && this.f5001f == e0Var.f5001f && g0.h(this.f5002g, e0Var.f5002g);
    }

    public final int hashCode() {
        int iHashCode = this.f4998c.hashCode() * 31;
        List list = this.f4999d;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        int i10 = d1.c.f4329e;
        return Integer.hashCode(this.f5002g) + l.q.a(this.f5001f, l.q.b(this.f5000e, iHashCode2, 31), 31);
    }

    public final String toString() {
        String str;
        long j10 = this.f5000e;
        String str2 = "";
        if (d9.i.u(j10)) {
            str = "center=" + ((Object) d1.c.i(j10)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f5001f;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            str2 = "radius=" + f10 + ", ";
        }
        return "RadialGradient(colors=" + this.f4998c + ", stops=" + this.f4999d + ", " + str + str2 + "tileMode=" + ((Object) g0.i(this.f5002g)) + ')';
    }
}
