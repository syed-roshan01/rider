package i2;

import a2.c0;
import a2.o;
import a2.p;
import a2.r;
import a2.t;
import a2.x;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import e1.j0;
import e1.k0;
import e1.n0;
import i3.e0;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import l.z2;
import l2.q;
import m0.l3;
import m2.n;
import o1.s;
import u.l1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f7916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2.d f7919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2.b f7920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f7921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f7922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2.h f7923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z2 f7924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7926l;

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x06ed: MOVE (r9v3 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    public d(c0 c0Var, f2.d dVar, m2.b bVar, String str, List list, List list2) {
        boolean zBooleanValue;
        Locale locale;
        int i10;
        c cVar;
        long j10;
        ?? arrayList;
        CharSequence charSequenceG;
        int length;
        Spannable spannable;
        ArrayList arrayList2;
        Integer[] numArr;
        x xVar;
        m2.b bVar2;
        int i11;
        Object eVar;
        List list3;
        int i12;
        int i13;
        int i14;
        r rVar;
        int length2;
        this.f7915a = str;
        this.f7916b = c0Var;
        this.f7917c = list;
        this.f7918d = list2;
        this.f7919e = dVar;
        this.f7920f = bVar;
        e eVar2 = new e(bVar.c());
        this.f7921g = eVar2;
        int i15 = 0;
        if (s.i(c0Var)) {
            g gVar = i.f7936a;
            g gVar2 = i.f7936a;
            l3 l3VarA = gVar2.f7934a;
            if (l3VarA == null) {
                if (i3.l.c()) {
                    l3VarA = gVar2.a();
                    gVar2.f7934a = l3VarA;
                } else {
                    l3VarA = j.f7937a;
                }
            }
            zBooleanValue = ((Boolean) l3VarA.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f7925k = zBooleanValue;
        p pVar = c0Var.f912b;
        int i16 = pVar.f958b;
        x xVar2 = c0Var.f911a;
        h2.d dVar2 = xVar2.f1041k;
        if (l2.k.a(i16, 4)) {
            i10 = 2;
        } else if (l2.k.a(i16, 5)) {
            i10 = 3;
        } else if (l2.k.a(i16, 1)) {
            i10 = 0;
        } else if (l2.k.a(i16, 2)) {
            i10 = 1;
        } else {
            if (!l2.k.a(i16, 3) && !l2.k.a(i16, Integer.MIN_VALUE)) {
                throw new IllegalStateException("Invalid TextDirection.".toString());
            }
            if (dVar2 != null) {
                h2.e eVar3 = ((h2.c) dVar2.f7539a.get(0)).f7538a;
                d7.a.k(eVar3, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                locale = ((h2.a) eVar3).f7534a;
                locale = locale == null ? Locale.getDefault() : locale;
            }
            int i17 = z2.e.f17199a;
            int iA = z2.d.a(locale);
            if (iA == 0 || iA != 1) {
                i10 = 2;
            } else {
                i10 = 3;
            }
        }
        this.f7926l = i10;
        c cVar2 = new c(this, i15);
        l2.r rVar2 = pVar.f965i;
        rVar2 = rVar2 == null ? l2.r.f11225c : rVar2;
        eVar2.setFlags(rVar2.f11228b ? eVar2.getFlags() | 128 : eVar2.getFlags() & (-129));
        int i18 = rVar2.f11227a;
        if (i18 == 1) {
            eVar2.setFlags(eVar2.getFlags() | 64);
            eVar2.setHinting(0);
        } else if (i18 == 2) {
            eVar2.getFlags();
            eVar2.setHinting(1);
        } else if (i18 == 3) {
            eVar2.getFlags();
            eVar2.setHinting(0);
        } else {
            eVar2.getFlags();
        }
        boolean z10 = !list.isEmpty();
        long jB = n.b(xVar2.f1032b);
        boolean zA = m2.o.a(jB, 4294967296L);
        long j11 = xVar2.f1032b;
        if (zA) {
            eVar2.setTextSize(bVar.Z(j11));
        } else if (m2.o.a(jB, 8589934592L)) {
            eVar2.setTextSize(n.c(j11) * eVar2.getTextSize());
        }
        f2.l lVar = xVar2.f1033c;
        f2.j jVar = xVar2.f1034d;
        f2.e eVar4 = xVar2.f1036f;
        if (eVar4 == null && jVar == null && lVar == null) {
            cVar = cVar2;
        } else {
            lVar = lVar == null ? f2.l.f6115c : lVar;
            f2.j jVar2 = new f2.j(jVar != null ? jVar.f6112a : 0);
            f2.k kVar = xVar2.f1035e;
            f2.k kVar2 = new f2.k(kVar != null ? kVar.f6113a : 1);
            cVar = cVar2;
            eVar2.setTypeface((Typeface) cVar.g(eVar4, lVar, jVar2, kVar2));
        }
        j2.a aVar = j2.a.f8334a;
        h2.d dVar3 = xVar2.f1041k;
        if (dVar3 != null && !d7.a.d(dVar3, h2.f.f7541a.a())) {
            aVar.b(eVar2, dVar3);
        }
        String str2 = xVar2.f1037g;
        if (str2 != null && !d7.a.d(str2, "")) {
            eVar2.setFontFeatureSettings(str2);
        }
        l2.p pVar2 = xVar2.f1040j;
        if (pVar2 != null && !d7.a.d(pVar2, l2.p.f11219c)) {
            eVar2.setTextScaleX(eVar2.getTextScaleX() * pVar2.f11220a);
            eVar2.setTextSkewX(eVar2.getTextSkewX() + pVar2.f11221b);
        }
        l2.o oVar = xVar2.f1031a;
        long jD = oVar.d();
        long j12 = e1.r.f5065g;
        if (jD != j12) {
            e1.g gVar3 = eVar2.f7927a;
            gVar3.e(jD);
            gVar3.h(null);
        }
        eVar2.a(oVar.e(), d1.f.f4345c, oVar.c());
        eVar2.c(xVar2.f1044n);
        eVar2.d(xVar2.f1043m);
        eVar2.b(xVar2.f1046p);
        long j13 = xVar2.f1038h;
        if (!m2.o.a(n.b(j13), 4294967296L) || n.c(j13) == 0.0f) {
            j10 = j12;
            if (m2.o.a(n.b(j13), 8589934592L)) {
                eVar2.setLetterSpacing(n.c(j13));
            }
        } else {
            float textScaleX = eVar2.getTextScaleX() * eVar2.getTextSize();
            float fZ = bVar.Z(j13);
            if (textScaleX != 0.0f) {
                eVar2.setLetterSpacing(fZ / textScaleX);
            }
            j10 = j12;
        }
        boolean z11 = z10 && m2.o.a(n.b(j13), 4294967296L) && n.c(j13) != 0.0f;
        long j14 = xVar2.f1042l;
        long j15 = j10;
        boolean z12 = (e1.r.c(j14, j15) || e1.r.c(j14, e1.r.f5064f)) ? false : true;
        l2.a aVar2 = xVar2.f1039i;
        boolean z13 = (aVar2 == null || Float.compare(aVar2.f11194a, 0.0f) == 0) ? false : true;
        x xVar3 = (z11 || z12 || z13) ? new x(0L, 0L, null, null, null, null, null, z11 ? j13 : n.f11820c, z13 ? aVar2 : null, null, null, z12 ? j14 : j15, null, null, 63103) : null;
        if (xVar3 != null) {
            int size = list.size() + 1;
            arrayList = new ArrayList(size);
            int i19 = 0;
            while (i19 < size) {
                arrayList.add(i19 == 0 ? new a2.d(xVar3, 0, this.f7915a.length()) : (a2.d) this.f7917c.get(i19 - 1));
                i19++;
            }
        } else {
            arrayList = list;
        }
        String str3 = this.f7915a;
        float textSize = this.f7921g.getTextSize();
        c0 c0Var2 = this.f7916b;
        List list4 = this.f7918d;
        m2.b bVar3 = this.f7920f;
        boolean z14 = this.f7925k;
        a aVar3 = b.f7912a;
        if (z14 && i3.l.c()) {
            i3.l lVarA = i3.l.a();
            if (str3 == null) {
                length2 = 0;
            } else {
                lVarA.getClass();
                length2 = str3.length();
            }
            charSequenceG = lVarA.g(0, length2, str3);
            d7.a.j(charSequenceG);
        } else {
            charSequenceG = str3;
        }
        if (!arrayList.isEmpty() || !list4.isEmpty() || !d7.a.d(c0Var2.f912b.f960d, q.f11222c) || !s.V(c0Var2.f912b.f959c)) {
            Spannable spannableString = charSequenceG instanceof Spannable ? (Spannable) charSequenceG : new SpannableString(charSequenceG);
            if (d7.a.d(c0Var2.f911a.f1043m, l2.j.f11212c)) {
                spannableString.setSpan(b.f7912a, 0, str3.length(), 33);
            }
            t tVar = c0Var2.f913c;
            boolean z15 = (tVar == null || (rVar = tVar.f973b) == null) ? false : rVar.f969a;
            p pVar3 = c0Var2.f912b;
            if (z15 && pVar3.f962f == null) {
                float fH0 = s.h0(pVar3.f959c, textSize, bVar3);
                if (!Float.isNaN(fH0)) {
                    spannableString.setSpan(new d2.g(fH0), 0, spannableString.length(), 33);
                }
            } else {
                l2.g gVar4 = pVar3.f962f;
                gVar4 = gVar4 == null ? l2.g.f11204c : gVar4;
                float fH1 = s.h0(pVar3.f959c, textSize, bVar3);
                if (!Float.isNaN(fH1)) {
                    if (spannableString.length() == 0) {
                        length = spannableString.length() + 1;
                    } else {
                        if (spannableString.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        if (spannableString.charAt(l9.i.L0(spannableString)) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                    }
                    int i20 = length;
                    int i21 = gVar4.f11206b;
                    spannableString.setSpan(new d2.h(fH1, i20, (i21 & 1) > 0, (i21 & 16) > 0, gVar4.f11205a), 0, spannableString.length(), 33);
                }
            }
            q qVar = pVar3.f960d;
            if (qVar != null) {
                long jN = s.N(0);
                long j16 = qVar.f11223a;
                boolean zA2 = n.a(j16, jN);
                long j17 = qVar.f11224b;
                spannable = spannableString;
                if ((!zA2 || !n.a(j17, s.N(0))) && !s.V(j16) && !s.V(j17)) {
                    long jB2 = n.b(j16);
                    float fZ2 = m2.o.a(jB2, 4294967296L) ? bVar3.Z(j16) : m2.o.a(jB2, 8589934592L) ? n.c(j16) * textSize : 0.0f;
                    long jB3 = n.b(j17);
                    spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fZ2), (int) Math.ceil(m2.o.a(jB3, 4294967296L) ? bVar3.Z(j17) : m2.o.a(jB3, 8589934592L) ? n.c(j17) * textSize : 0.0f)), 0, spannable.length(), 33);
                }
            } else {
                spannable = spannableString;
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i22 = 0; i22 < size2; i22++) {
                Object obj = arrayList.get(i22);
                Object obj2 = ((a2.d) obj).f914a;
                x xVar4 = (x) obj2;
                if (xVar4.f1036f != null || xVar4.f1034d != null || xVar4.f1033c != null || ((x) obj2).f1035e != null) {
                    arrayList3.add(obj);
                }
            }
            x xVar5 = c0Var2.f911a;
            f2.e eVar5 = xVar5.f1036f;
            x xVar6 = (eVar5 == null && xVar5.f1034d == null && xVar5.f1033c == null && xVar5.f1035e == null) ? null : new x(0L, 0L, xVar5.f1033c, xVar5.f1034d, xVar5.f1035e, eVar5, null, 0L, null, null, null, 0L, null, null, 65475);
            l1 l1Var = new l1(4, spannable, cVar);
            if (arrayList3.size() > 1) {
                int size3 = arrayList3.size();
                int i23 = size3 * 2;
                Integer[] numArr2 = new Integer[i23];
                for (int i24 = 0; i24 < i23; i24++) {
                    numArr2[i24] = 0;
                }
                int size4 = arrayList3.size();
                for (int i25 = 0; i25 < size4; i25++) {
                    a2.d dVar4 = (a2.d) arrayList3.get(i25);
                    numArr2[i25] = Integer.valueOf(dVar4.f915b);
                    numArr2[i25 + size3] = Integer.valueOf(dVar4.f916c);
                }
                Integer[] numArr3 = numArr2;
                if (numArr3.length > 1) {
                    Arrays.sort(numArr3);
                }
                if (i23 == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                int iIntValue = numArr2[0].intValue();
                int i26 = 0;
                while (i26 < i23) {
                    int iIntValue2 = numArr2[i26].intValue();
                    if (iIntValue2 == iIntValue) {
                        arrayList2 = arrayList3;
                        numArr = numArr2;
                        xVar = xVar6;
                    } else {
                        int size5 = arrayList3.size();
                        x xVarC = xVar6;
                        int i27 = 0;
                        while (i27 < size5) {
                            ArrayList arrayList4 = arrayList3;
                            a2.d dVar5 = (a2.d) arrayList3.get(i27);
                            Integer[] numArr4 = numArr2;
                            int i28 = dVar5.f915b;
                            x xVar7 = xVar6;
                            int i29 = dVar5.f916c;
                            if (i28 != i29 && a2.f.c(iIntValue, iIntValue2, i28, i29)) {
                                x xVar8 = (x) dVar5.f914a;
                                xVarC = xVarC != null ? xVarC.c(xVar8) : xVar8;
                            }
                            i27++;
                            arrayList3 = arrayList4;
                            numArr2 = numArr4;
                            xVar6 = xVar7;
                        }
                        arrayList2 = arrayList3;
                        numArr = numArr2;
                        xVar = xVar6;
                        if (xVarC != null) {
                            l1Var.e(xVarC, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                        }
                        iIntValue = iIntValue2;
                    }
                    i26++;
                    i23 = i23;
                    arrayList3 = arrayList2;
                    numArr2 = numArr;
                    xVar6 = xVar;
                }
            } else if (!arrayList3.isEmpty()) {
                x xVar9 = (x) ((a2.d) arrayList3.get(0)).f914a;
                l1Var.e(xVar6 != null ? xVar6.c(xVar9) : xVar9, Integer.valueOf(((a2.d) arrayList3.get(0)).f915b), Integer.valueOf(((a2.d) arrayList3.get(0)).f916c));
            }
            int size6 = arrayList.size();
            boolean z16 = false;
            int i30 = 0;
            while (i30 < size6) {
                a2.d dVar6 = (a2.d) arrayList.get(i30);
                int i31 = dVar6.f915b;
                if (i31 < 0 || i31 >= spannable.length() || (i12 = dVar6.f916c) <= i31 || i12 > spannable.length()) {
                    size6 = size6;
                    list3 = list4;
                } else {
                    int i32 = dVar6.f915b;
                    int i33 = dVar6.f916c;
                    x xVar10 = (x) dVar6.f914a;
                    l2.a aVar4 = xVar10.f1039i;
                    if (aVar4 != null) {
                        spannable.setSpan(new d2.a(aVar4.f11194a), i32, i33, 33);
                    }
                    l2.o oVar2 = xVar10.f1031a;
                    s.j0(spannable, oVar2.d(), i32, i33);
                    e1.n nVarE = oVar2.e();
                    float fC = oVar2.c();
                    if (nVarE != null) {
                        if (nVarE instanceof n0) {
                            s.j0(spannable, ((n0) nVarE).f5052a, i32, i33);
                        } else if (nVarE instanceof j0) {
                            spannable.setSpan(new k2.b((j0) nVarE, fC), i32, i33, 33);
                        }
                    }
                    l2.j jVar3 = xVar10.f1043m;
                    if (jVar3 != null) {
                        int i34 = jVar3.f11214a;
                        spannable.setSpan(new d2.l((i34 | 1) == i34, (i34 | 2) == i34), i32, i33, 33);
                    }
                    s.l0(spannable, xVar10.f1032b, bVar3, i32, i33);
                    String str4 = xVar10.f1037g;
                    if (str4 != null) {
                        d2.b bVar4 = new d2.b(str4);
                        i13 = 33;
                        spannable.setSpan(bVar4, i32, i33, 33);
                    } else {
                        i13 = 33;
                    }
                    l2.p pVar4 = xVar10.f1040j;
                    if (pVar4 != null) {
                        spannable.setSpan(new ScaleXSpan(pVar4.f11220a), i32, i33, i13);
                        spannable.setSpan(new d2.k(pVar4.f11221b), i32, i33, i13);
                    }
                    h2.d dVar7 = xVar10.f1041k;
                    if (dVar7 != null) {
                        spannable.setSpan(aVar.a(dVar7), i32, i33, i13);
                    }
                    long j18 = e1.r.f5065g;
                    list3 = list4;
                    long j19 = xVar10.f1042l;
                    if (j19 != j18) {
                        spannable.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a.s(j19)), i32, i33, 33);
                    }
                    k0 k0Var = xVar10.f1044n;
                    if (k0Var != null) {
                        int iS = androidx.compose.ui.graphics.a.s(k0Var.f5039a);
                        long j20 = k0Var.f5040b;
                        float fD = d1.c.d(j20);
                        float fE = d1.c.e(j20);
                        float f10 = k0Var.f5041c;
                        d2.j jVar4 = new d2.j(fD, fE, f10 == 0.0f ? Float.MIN_VALUE : f10, iS);
                        i14 = 33;
                        spannable.setSpan(jVar4, i32, i33, 33);
                    } else {
                        i14 = 33;
                    }
                    g1.h hVar = xVar10.f1046p;
                    if (hVar != null) {
                        spannable.setSpan(new k2.a(hVar), i32, i33, i14);
                    }
                    long j21 = xVar10.f1038h;
                    if (m2.o.a(n.b(j21), 4294967296L) || m2.o.a(n.b(j21), 8589934592L)) {
                        z16 = true;
                    }
                }
                i30++;
                bVar3 = bVar3;
                size6 = size6;
                list4 = list3;
            }
            List list5 = list4;
            m2.b bVar5 = bVar3;
            if (z16) {
                int size7 = arrayList.size();
                int i35 = 0;
                while (i35 < size7) {
                    a2.d dVar8 = (a2.d) arrayList.get(i35);
                    int i36 = dVar8.f915b;
                    x xVar11 = (x) dVar8.f914a;
                    if (i36 < 0 || i36 >= spannable.length() || (i11 = dVar8.f916c) <= i36 || i11 > spannable.length()) {
                        bVar2 = bVar5;
                    } else {
                        long j22 = xVar11.f1038h;
                        long jB4 = n.b(j22);
                        if (m2.o.a(jB4, 4294967296L)) {
                            bVar2 = bVar5;
                            eVar = new d2.f(bVar2.Z(j22));
                        } else {
                            bVar2 = bVar5;
                            eVar = m2.o.a(jB4, 8589934592L) ? new d2.e(n.c(j22)) : null;
                        }
                        if (eVar != null) {
                            spannable.setSpan(eVar, i36, i11, 33);
                        }
                    }
                    i35++;
                    bVar5 = bVar2;
                }
            }
            if (list5.size() > 0) {
                a2.d dVar9 = (a2.d) list5.get(0);
                a7.a.w(dVar9.f914a);
                for (Object obj3 : spannable.getSpans(dVar9.f915b, dVar9.f916c, e0.class)) {
                    spannable.removeSpan((e0) obj3);
                }
                throw null;
            }
            charSequenceG = spannable;
        }
        this.f7922h = charSequenceG;
        this.f7923i = new b2.h(charSequenceG, this.f7921g, this.f7926l);
    }

    @Override // a2.o
    public final float a() {
        b2.h hVar = this.f7923i;
        if (!Float.isNaN(hVar.f2547e)) {
            return hVar.f2547e;
        }
        TextPaint textPaint = hVar.f2544b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hVar.f2543a;
        lineInstance.setText(new b2.c(charSequence, charSequence.length()));
        PriorityQueue<q8.f> priorityQueue = new PriorityQueue(10, new m0.r(2));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new q8.f(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                q8.f fVar = (q8.f) priorityQueue.peek();
                if (fVar != null && ((Number) fVar.f13226b).intValue() - ((Number) fVar.f13225a).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new q8.f(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        float fMax = 0.0f;
        for (q8.f fVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) fVar2.f13225a).intValue(), ((Number) fVar2.f13226b).intValue(), textPaint));
        }
        hVar.f2547e = fMax;
        return fMax;
    }

    @Override // a2.o
    public final boolean b() {
        z2 z2Var = this.f7924j;
        if (z2Var == null || !z2Var.H()) {
            if (!this.f7925k && s.i(this.f7916b)) {
                g gVar = i.f7936a;
                g gVar2 = i.f7936a;
                l3 l3VarA = gVar2.f7934a;
                if (l3VarA == null) {
                    if (i3.l.c()) {
                        l3VarA = gVar2.a();
                        gVar2.f7934a = l3VarA;
                    } else {
                        l3VarA = j.f7937a;
                    }
                }
                if (((Boolean) l3VarA.getValue()).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // a2.o
    public final float c() {
        return this.f7923i.b();
    }
}
