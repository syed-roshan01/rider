package a2;

import android.graphics.RectF;
import android.text.Layout;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f898f;

    public a0(z zVar, i iVar, long j10) {
        this.f893a = zVar;
        this.f894b = iVar;
        this.f895c = j10;
        ArrayList arrayList = iVar.f939h;
        float fC = 0.0f;
        this.f896d = arrayList.isEmpty() ? 0.0f : ((a) ((m) arrayList.get(0)).f947a).f889d.c(0);
        ArrayList arrayList2 = iVar.f939h;
        if (!arrayList2.isEmpty()) {
            m mVar = (m) r8.p.L0(arrayList2);
            b2.v vVar = ((a) mVar.f947a).f889d;
            fC = vVar.c(vVar.f2579e - 1) + mVar.f952f;
        }
        this.f897e = fC;
        this.f898f = iVar.f938g;
    }

    public final l2.h a(int i10) {
        i iVar = this.f894b;
        iVar.d(i10);
        int length = iVar.f932a.f942a.f918a.length();
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(i10 == length ? d7.t.Y(arrayList) : o1.s.w(i10, arrayList));
        return ((a) mVar.f947a).f889d.f2578d.isRtlCharAt(mVar.a(i10)) ? l2.h.f11208b : l2.h.f11207a;
    }

    public final d1.d b(int i10) {
        float fH;
        float fH2;
        float fG;
        float fG2;
        i iVar = this.f894b;
        iVar.c(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.w(i10, arrayList));
        l lVar = mVar.f947a;
        int iA = mVar.a(i10);
        a aVar = (a) lVar;
        CharSequence charSequence = aVar.f890e;
        if (iA < 0 || iA >= charSequence.length()) {
            StringBuilder sbQ = a7.a.q("offset(", iA, ") is out of bounds [0,");
            sbQ.append(charSequence.length());
            sbQ.append(')');
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        b2.v vVar = aVar.f889d;
        Layout layout = vVar.f2578d;
        int lineForOffset = layout.getLineForOffset(iA);
        float f10 = vVar.f(lineForOffset);
        float fD = vVar.d(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iA);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fG = vVar.h(iA, false);
                fG2 = vVar.h(iA + 1, true);
            } else if (zIsRtlCharAt) {
                fG = vVar.g(iA, false);
                fG2 = vVar.g(iA + 1, true);
            } else {
                fH = vVar.h(iA, false);
                fH2 = vVar.h(iA + 1, true);
            }
            float f11 = fG;
            fH = fG2;
            fH2 = f11;
        } else {
            fH = vVar.g(iA, false);
            fH2 = vVar.g(iA + 1, true);
        }
        RectF rectF = new RectF(fH, f10, fH2, fD);
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        long jF = d9.i.f(0.0f, mVar.f952f);
        return new d1.d(d1.c.d(jF) + f12, d1.c.e(jF) + f13, d1.c.d(jF) + f14, d1.c.e(jF) + f15);
    }

    public final d1.d c(int i10) {
        i iVar = this.f894b;
        iVar.d(i10);
        int length = iVar.f932a.f942a.f918a.length();
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(i10 == length ? d7.t.Y(arrayList) : o1.s.w(i10, arrayList));
        l lVar = mVar.f947a;
        int iA = mVar.a(i10);
        a aVar = (a) lVar;
        CharSequence charSequence = aVar.f890e;
        if (iA < 0 || iA > charSequence.length()) {
            StringBuilder sbQ = a7.a.q("offset(", iA, ") is out of bounds [0,");
            sbQ.append(charSequence.length());
            sbQ.append(']');
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        b2.v vVar = aVar.f889d;
        float fG = vVar.g(iA, false);
        int lineForOffset = vVar.f2578d.getLineForOffset(iA);
        float f10 = vVar.f(lineForOffset);
        float fD = vVar.d(lineForOffset);
        long jF = d9.i.f(0.0f, mVar.f952f);
        return new d1.d(d1.c.d(jF) + fG, d1.c.e(jF) + f10, d1.c.d(jF) + fG, d1.c.e(jF) + fD);
    }

    public final float d(int i10) {
        i iVar = this.f894b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.x(i10, arrayList));
        l lVar = mVar.f947a;
        return ((a) lVar).f889d.d(i10 - mVar.f950d) + mVar.f952f;
    }

    public final int e(int i10, boolean z10) {
        int iE;
        i iVar = this.f894b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.x(i10, arrayList));
        l lVar = mVar.f947a;
        int i11 = i10 - mVar.f950d;
        b2.v vVar = ((a) lVar).f889d;
        if (z10) {
            Layout layout = vVar.f2578d;
            if (layout.getEllipsisStart(i11) == 0) {
                b2.g gVar = (b2.g) vVar.f2589o.getValue();
                Layout layout2 = gVar.f2538a;
                iE = gVar.c(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iE = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iE = vVar.e(i11);
        }
        return iE + mVar.f948b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return d7.a.d(this.f893a, a0Var.f893a) && d7.a.d(this.f894b, a0Var.f894b) && m2.k.a(this.f895c, a0Var.f895c) && this.f896d == a0Var.f896d && this.f897e == a0Var.f897e && d7.a.d(this.f898f, a0Var.f898f);
    }

    public final int f(int i10) {
        int iW;
        i iVar = this.f894b;
        int length = iVar.f932a.f942a.f918a.length();
        ArrayList arrayList = iVar.f939h;
        if (i10 >= length) {
            iW = d7.t.Y(arrayList);
        } else {
            iW = i10 < 0 ? 0 : o1.s.w(i10, arrayList);
        }
        m mVar = (m) arrayList.get(iW);
        return ((a) mVar.f947a).f889d.f2578d.getLineForOffset(mVar.a(i10)) + mVar.f950d;
    }

    public final int g(float f10) {
        int iY;
        i iVar = this.f894b;
        ArrayList arrayList = iVar.f939h;
        if (f10 <= 0.0f) {
            iY = 0;
        } else {
            iY = f10 >= iVar.f936e ? d7.t.Y(arrayList) : o1.s.y(arrayList, f10);
        }
        m mVar = (m) arrayList.get(iY);
        int i10 = mVar.f949c - mVar.f948b;
        int i11 = mVar.f950d;
        if (i10 == 0) {
            return i11;
        }
        float f11 = f10 - mVar.f952f;
        b2.v vVar = ((a) mVar.f947a).f889d;
        return i11 + vVar.f2578d.getLineForVertical(((int) f11) - vVar.f2580f);
    }

    public final float h(int i10) {
        i iVar = this.f894b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.x(i10, arrayList));
        l lVar = mVar.f947a;
        int i11 = i10 - mVar.f950d;
        b2.v vVar = ((a) lVar).f889d;
        return vVar.f2578d.getLineLeft(i11) + (i11 == vVar.f2579e + (-1) ? vVar.f2582h : 0.0f);
    }

    public final int hashCode() {
        return this.f898f.hashCode() + l.q.a(this.f897e, l.q.a(this.f896d, l.q.b(this.f895c, (this.f894b.hashCode() + (this.f893a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final float i(int i10) {
        i iVar = this.f894b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.x(i10, arrayList));
        l lVar = mVar.f947a;
        int i11 = i10 - mVar.f950d;
        b2.v vVar = ((a) lVar).f889d;
        return vVar.f2578d.getLineRight(i11) + (i11 == vVar.f2579e + (-1) ? vVar.f2583i : 0.0f);
    }

    public final int j(int i10) {
        i iVar = this.f894b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.x(i10, arrayList));
        l lVar = mVar.f947a;
        return ((a) lVar).f889d.f2578d.getLineStart(i10 - mVar.f950d) + mVar.f948b;
    }

    public final float k(int i10) {
        i iVar = this.f894b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(o1.s.x(i10, arrayList));
        l lVar = mVar.f947a;
        return ((a) lVar).f889d.f(i10 - mVar.f950d) + mVar.f952f;
    }

    public final int l(long j10) {
        int iY;
        i iVar = this.f894b;
        iVar.getClass();
        float fE = d1.c.e(j10);
        ArrayList arrayList = iVar.f939h;
        if (fE <= 0.0f) {
            iY = 0;
        } else {
            iY = d1.c.e(j10) >= iVar.f936e ? d7.t.Y(arrayList) : o1.s.y(arrayList, d1.c.e(j10));
        }
        m mVar = (m) arrayList.get(iY);
        int i10 = mVar.f949c;
        int i11 = mVar.f948b;
        if (i10 - i11 == 0) {
            return i11;
        }
        long jF = d9.i.f(d1.c.d(j10), d1.c.e(j10) - mVar.f952f);
        a aVar = (a) mVar.f947a;
        aVar.getClass();
        int iE = (int) d1.c.e(jF);
        b2.v vVar = aVar.f889d;
        int i12 = iE - vVar.f2580f;
        Layout layout = vVar.f2578d;
        int lineForVertical = layout.getLineForVertical(i12);
        return i11 + layout.getOffsetForHorizontal(lineForVertical, (vVar.b(lineForVertical) * (-1)) + d1.c.d(jF));
    }

    public final l2.h m(int i10) {
        i iVar = this.f894b;
        iVar.d(i10);
        int length = iVar.f932a.f942a.f918a.length();
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(i10 == length ? d7.t.Y(arrayList) : o1.s.w(i10, arrayList));
        l lVar = mVar.f947a;
        int iA = mVar.a(i10);
        b2.v vVar = ((a) lVar).f889d;
        return vVar.f2578d.getParagraphDirection(vVar.f2578d.getLineForOffset(iA)) == 1 ? l2.h.f11207a : l2.h.f11208b;
    }

    public final long n(int i10) {
        int iPreceding;
        int iPreceding2;
        int iFollowing;
        int iFollowing2;
        i iVar = this.f894b;
        iVar.d(i10);
        int length = iVar.f932a.f942a.f918a.length();
        ArrayList arrayList = iVar.f939h;
        m mVar = (m) arrayList.get(i10 == length ? d7.t.Y(arrayList) : o1.s.w(i10, arrayList));
        l lVar = mVar.f947a;
        int iA = mVar.a(i10);
        a aVar = (a) lVar;
        c2.b bVar = ((c2.a) aVar.f892g.getValue()).f2923a;
        bVar.a(iA);
        BreakIterator breakIterator = bVar.f2927d;
        if (bVar.e(breakIterator.preceding(iA))) {
            bVar.a(iA);
            iPreceding = iA;
            while (iPreceding != -1 && (!bVar.e(iPreceding) || bVar.c(iPreceding))) {
                bVar.a(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            bVar.a(iA);
            if (bVar.d(iA)) {
                iPreceding2 = (!breakIterator.isBoundary(iA) || bVar.b(iA)) ? breakIterator.preceding(iA) : iA;
            } else if (bVar.b(iA)) {
                iPreceding2 = breakIterator.preceding(iA);
            } else {
                iPreceding = -1;
            }
            iPreceding = iPreceding2;
        }
        if (iPreceding == -1) {
            iPreceding = iA;
        }
        c2.b bVar2 = ((c2.a) aVar.f892g.getValue()).f2923a;
        bVar2.a(iA);
        BreakIterator breakIterator2 = bVar2.f2927d;
        if (bVar2.c(breakIterator2.following(iA))) {
            bVar2.a(iA);
            iFollowing = iA;
            while (iFollowing != -1 && (bVar2.e(iFollowing) || !bVar2.c(iFollowing))) {
                bVar2.a(iFollowing);
                iFollowing = breakIterator2.following(iFollowing);
            }
        } else {
            bVar2.a(iA);
            if (bVar2.b(iA)) {
                iFollowing2 = (!breakIterator2.isBoundary(iA) || bVar2.d(iA)) ? breakIterator2.following(iA) : iA;
            } else if (bVar2.d(iA)) {
                iFollowing2 = breakIterator2.following(iA);
            } else {
                iFollowing = -1;
            }
            iFollowing = iFollowing2;
        }
        if (iFollowing != -1) {
            iA = iFollowing;
        }
        long jG = o1.s.g(iPreceding, iA);
        int i11 = b0.f904c;
        int i12 = mVar.f948b;
        return o1.s.g(((int) (jG >> 32)) + i12, ((int) (jG & 4294967295L)) + i12);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f893a + ", multiParagraph=" + this.f894b + ", size=" + ((Object) m2.k.b(this.f895c)) + ", firstBaseline=" + this.f896d + ", lastBaseline=" + this.f897e + ", placeholderRects=" + this.f898f + ')';
    }
}
