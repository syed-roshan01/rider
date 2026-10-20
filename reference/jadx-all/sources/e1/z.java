package e1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5076d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5079g;

    public z(List list, long j10, long j11, int i10) {
        this.f5075c = list;
        this.f5077e = j10;
        this.f5078f = j11;
        this.f5079g = i10;
    }

    @Override // e1.j0
    public final Shader b(long j10) {
        long j11 = this.f5077e;
        float fD = d1.c.d(j11) == Float.POSITIVE_INFINITY ? d1.f.d(j10) : d1.c.d(j11);
        float fB = d1.c.e(j11) == Float.POSITIVE_INFINITY ? d1.f.b(j10) : d1.c.e(j11);
        long j12 = this.f5078f;
        float fD2 = d1.c.d(j12) == Float.POSITIVE_INFINITY ? d1.f.d(j10) : d1.c.d(j12);
        float fB2 = d1.c.e(j12) == Float.POSITIVE_INFINITY ? d1.f.b(j10) : d1.c.e(j12);
        long jF = d9.i.f(fD, fB);
        long jF2 = d9.i.f(fD2, fB2);
        List list = this.f5075c;
        List list2 = this.f5076d;
        androidx.compose.ui.graphics.a.v(list, list2);
        float fD3 = d1.c.d(jF);
        float fE = d1.c.e(jF);
        float fD4 = d1.c.d(jF2);
        float fE2 = d1.c.e(jF2);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = androidx.compose.ui.graphics.a.s(((r) list.get(i10)).f5067a);
        }
        return new LinearGradient(fD3, fE, fD4, fE2, iArr, androidx.compose.ui.graphics.a.n(list2, list), androidx.compose.ui.graphics.a.r(this.f5079g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return d7.a.d(this.f5075c, zVar.f5075c) && d7.a.d(this.f5076d, zVar.f5076d) && d1.c.b(this.f5077e, zVar.f5077e) && d1.c.b(this.f5078f, zVar.f5078f) && g0.h(this.f5079g, zVar.f5079g);
    }

    public final int hashCode() {
        int iHashCode = this.f5075c.hashCode() * 31;
        List list = this.f5076d;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        int i10 = d1.c.f4329e;
        return Integer.hashCode(this.f5079g) + l.q.b(this.f5078f, l.q.b(this.f5077e, iHashCode2, 31), 31);
    }

    public final String toString() {
        String str;
        long j10 = this.f5077e;
        String str2 = "";
        if (d9.i.s(j10)) {
            str = "start=" + ((Object) d1.c.i(j10)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f5078f;
        if (d9.i.s(j11)) {
            str2 = "end=" + ((Object) d1.c.i(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f5075c + ", stops=" + this.f5076d + ", " + str + str2 + "tileMode=" + ((Object) g0.i(this.f5079g)) + ')';
    }
}
