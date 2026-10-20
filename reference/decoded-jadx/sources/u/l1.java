package u;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.FillElement;
import com.auto.accept.data.model.TransactionData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.ride.accepter.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k0.c4;
import k0.c5;
import m0.l3;
import m0.o3;
import m0.s2;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i10, Object obj, Object obj2) {
        super(3);
        this.f14843a = i10;
        this.f14844b = obj;
        this.f14845c = obj2;
    }

    private final void d(y.v vVar, m0.m mVar, int i10) {
        m0.q qVar;
        boolean z10;
        t1.i iVar;
        t1.i iVar2;
        t1.i iVar3;
        t1.i iVar4;
        t1.i iVar5;
        t1.i iVar6;
        t1.i iVar7;
        d7.a.m(vVar, "$this$Card");
        if ((i10 & 81) == 16) {
            m0.q qVar2 = (m0.q) mVar;
            if (qVar2.G()) {
                qVar2.U();
                return;
            }
        }
        y0.l lVar = y0.l.f16729b;
        y0.o oVarL = androidx.compose.foundation.layout.a.l(lVar, 16);
        m0.g1 g1Var = (m0.g1) this.f14844b;
        Context context = (Context) this.f14845c;
        m0.q qVar3 = (m0.q) mVar;
        qVar3.Z(-483455358);
        y.e eVar = y.k.f16607c;
        y0.e eVar2 = y0.a.f16715o;
        r1.j0 j0VarA = y.u.a(eVar, eVar2, qVar3);
        qVar3.Z(-1323940314);
        int i11 = qVar3.P;
        m0.r1 r1VarP = qVar3.p();
        t1.l.f14477k.getClass();
        t1.j jVar = t1.k.f14458b;
        u0.b bVarI = androidx.compose.ui.layout.a.i(oVarL);
        m0.d dVar = qVar3.f11630a;
        if (!(dVar instanceof m0.d)) {
            m9.e0.C();
            throw null;
        }
        qVar3.c0();
        if (qVar3.O) {
            qVar3.o(jVar);
        } else {
            qVar3.o0();
        }
        t1.i iVar8 = t1.k.f14461e;
        d7.t.s0(qVar3, j0VarA, iVar8);
        t1.i iVar9 = t1.k.f14460d;
        d7.t.s0(qVar3, r1VarP, iVar9);
        t1.i iVar10 = t1.k.f14462f;
        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i11))) {
            l.q.r(i11, qVar3, i11, iVar10);
        }
        l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
        FillElement fillElement = androidx.compose.foundation.layout.c.f1667a;
        y.f fVar = y.k.f16611g;
        y0.f fVar2 = y0.a.f16714n;
        qVar3.Z(693286680);
        r1.j0 j0VarA2 = y.z0.a(fVar, fVar2, qVar3);
        qVar3.Z(-1323940314);
        int i12 = qVar3.P;
        m0.r1 r1VarP2 = qVar3.p();
        u0.b bVarI2 = androidx.compose.ui.layout.a.i(fillElement);
        if (!(dVar instanceof m0.d)) {
            m9.e0.C();
            throw null;
        }
        qVar3.c0();
        if (qVar3.O) {
            qVar3.o(jVar);
        } else {
            qVar3.o0();
        }
        d7.t.s0(qVar3, j0VarA2, iVar8);
        d7.t.s0(qVar3, r1VarP2, iVar9);
        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i12))) {
            l.q.r(i12, qVar3, i12, iVar10);
        }
        l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
        qVar3.Z(693286680);
        y.d dVar2 = y.k.f16605a;
        r1.j0 j0VarA3 = y.z0.a(dVar2, fVar2, qVar3);
        qVar3.Z(-1323940314);
        int i13 = qVar3.P;
        m0.r1 r1VarP3 = qVar3.p();
        u0.b bVarI3 = androidx.compose.ui.layout.a.i(lVar);
        if (!(dVar instanceof m0.d)) {
            m9.e0.C();
            throw null;
        }
        qVar3.c0();
        if (qVar3.O) {
            qVar3.o(jVar);
        } else {
            qVar3.o0();
        }
        d7.t.s0(qVar3, j0VarA3, iVar8);
        d7.t.s0(qVar3, r1VarP3, iVar9);
        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i13))) {
            l.q.r(i13, qVar3, i13, iVar10);
        }
        bVarI3.e(new m0.l2(qVar3), qVar3, 0);
        qVar3.Z(2058660585);
        k0.e1.b(z6.a.I(), null, androidx.compose.foundation.layout.c.h(lVar, 22), e5.a.f5125a, qVar3, 432, 0);
        float f10 = 10;
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, f10), qVar3);
        f2.l lVar2 = f2.l.f6118f;
        long j10 = e5.a.f5136l;
        c5.b("How to Use", null, j10, o1.s.N(16), null, lVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 199686, 0, 131026);
        l.q.v(qVar3, false, true, false, false);
        i1.f fVarP = ((Boolean) g1Var.getValue()).booleanValue() ? f6.a.P() : z6.a.G();
        long j11 = e5.a.f5137m;
        k0.e1.b(fVarP, null, null, j11, qVar3, 48, 4);
        l.q.v(qVar3, false, true, false, false);
        qVar3.Z(-1578274958);
        if (((Boolean) g1Var.getValue()).booleanValue()) {
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 14), qVar3);
            float f11 = 4;
            y0.o oVarN = androidx.compose.foundation.layout.a.n(lVar, 0.0f, f11, 1);
            qVar3.Z(693286680);
            y0.f fVar3 = y0.a.f16713f;
            r1.j0 j0VarA4 = y.z0.a(dVar2, fVar3, qVar3);
            qVar3.Z(-1323940314);
            int i14 = qVar3.P;
            m0.r1 r1VarP4 = qVar3.p();
            u0.b bVarI4 = androidx.compose.ui.layout.a.i(oVarN);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarA4, iVar8);
            d7.t.s0(qVar3, r1VarP4, iVar9);
            if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i14))) {
                iVar = iVar10;
                l.q.r(i14, qVar3, i14, iVar);
            } else {
                iVar = iVar10;
            }
            l.q.s(0, bVarI4, new m0.l2(qVar3), qVar3, 2058660585);
            t1.i iVar11 = iVar;
            c5.b("\u1f310", null, 0L, o1.s.N(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 3078, 0, 131062);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, f10), qVar3);
            qVar3.Z(-483455358);
            r1.j0 j0VarA5 = y.u.a(eVar, eVar2, qVar3);
            qVar3.Z(-1323940314);
            int i15 = qVar3.P;
            m0.r1 r1VarP5 = qVar3.p();
            u0.b bVarI5 = androidx.compose.ui.layout.a.i(lVar);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarA5, iVar8);
            d7.t.s0(qVar3, r1VarP5, iVar9);
            if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i15))) {
                iVar2 = iVar11;
                l.q.r(i15, qVar3, i15, iVar2);
            } else {
                iVar2 = iVar11;
            }
            l.q.s(0, bVarI5, new m0.l2(qVar3), qVar3, 2058660585);
            f2.l lVar3 = f2.l.f6117e;
            t1.i iVar12 = iVar2;
            c5.b("Set App Language to English", null, j10, o1.s.N(13), null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 199686, 0, 131026);
            c5.b("Keep Ola, Uber, and Rapido apps in English language for best ride detection accuracy.", null, j11, o1.s.N(12), null, null, null, 0L, null, null, o1.s.N(16), 0, false, 0, 0, null, null, qVar3, 3078, 6, 130034);
            l.q.v(qVar3, false, true, false, false);
            l.q.v(qVar3, false, true, false, false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar3);
            long j12 = e5.a.f5133i;
            d7.t.d(null, 0.0f, e1.r.b(j12, 0.5f), qVar3, 0, 3);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar3);
            y0.o oVarN2 = androidx.compose.foundation.layout.a.n(lVar, 0.0f, f11, 1);
            qVar3.Z(693286680);
            r1.j0 j0VarA6 = y.z0.a(dVar2, fVar3, qVar3);
            qVar3.Z(-1323940314);
            int i16 = qVar3.P;
            m0.r1 r1VarP6 = qVar3.p();
            u0.b bVarI6 = androidx.compose.ui.layout.a.i(oVarN2);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarA6, iVar8);
            d7.t.s0(qVar3, r1VarP6, iVar9);
            if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i16))) {
                iVar3 = iVar12;
                l.q.r(i16, qVar3, i16, iVar3);
            } else {
                iVar3 = iVar12;
            }
            l.q.s(0, bVarI6, new m0.l2(qVar3), qVar3, 2058660585);
            t1.i iVar13 = iVar3;
            c5.b("\u26a1", null, 0L, o1.s.N(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 3078, 0, 131062);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, f10), qVar3);
            qVar3.Z(-483455358);
            r1.j0 j0VarA7 = y.u.a(eVar, eVar2, qVar3);
            qVar3.Z(-1323940314);
            int i17 = qVar3.P;
            m0.r1 r1VarP7 = qVar3.p();
            u0.b bVarI7 = androidx.compose.ui.layout.a.i(lVar);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarA7, iVar8);
            d7.t.s0(qVar3, r1VarP7, iVar9);
            if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i17))) {
                iVar4 = iVar13;
                l.q.r(i17, qVar3, i17, iVar4);
            } else {
                iVar4 = iVar13;
            }
            l.q.s(0, bVarI7, new m0.l2(qVar3), qVar3, 2058660585);
            t1.i iVar14 = iVar4;
            c5.b("Reduce Animations", null, j10, o1.s.N(13), null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 199686, 0, 131026);
            c5.b("Turn ON 'Reduce animations' in your phone's Accessibility settings. This removes ride app timers and makes ride acceptance faster.", null, j11, o1.s.N(12), null, null, null, 0L, null, null, o1.s.N(16), 0, false, 0, 0, null, null, qVar3, 3078, 6, 130034);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 6), qVar3);
            float f12 = 8;
            float f13 = 12;
            float f14 = 0;
            m9.e0.g(new k4.p(context, 8), androidx.compose.foundation.layout.c.c(lVar, 32), false, e0.f.a(f12), null, null, null, new y.u0(f13, f14, f13, f14), null, d5.q.f4731h, qVar3, 817889328, 372);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f12), qVar3);
            qVar = qVar3;
            androidx.compose.foundation.a.c(i1.b.B(R.drawable.animation_guide, qVar3), "Turn on Reduce Animations in Accessibility settings", androidx.compose.ui.draw.a.b(fillElement, e0.f.a(f10)), null, r1.k.f13393c, 0.0f, null, qVar3, 24632, 104);
            l.q.v(qVar, false, true, false, false);
            l.q.v(qVar, false, true, false, false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar);
            d7.t.d(null, 0.0f, e1.r.b(j12, 0.5f), qVar, 0, 3);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar);
            y0.o oVarN3 = androidx.compose.foundation.layout.a.n(lVar, 0.0f, f11, 1);
            qVar.Z(693286680);
            r1.j0 j0VarA8 = y.z0.a(dVar2, fVar3, qVar);
            qVar.Z(-1323940314);
            int i18 = qVar.P;
            m0.r1 r1VarP8 = qVar.p();
            u0.b bVarI8 = androidx.compose.ui.layout.a.i(oVarN3);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, j0VarA8, iVar8);
            d7.t.s0(qVar, r1VarP8, iVar9);
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i18))) {
                iVar5 = iVar14;
                l.q.r(i18, qVar, i18, iVar5);
            } else {
                iVar5 = iVar14;
            }
            l.q.s(0, bVarI8, new m0.l2(qVar), qVar, 2058660585);
            t1.i iVar15 = iVar5;
            c5.b("\u1f6e1\ufe0f", null, 0L, o1.s.N(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3078, 0, 131062);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, f10), qVar);
            qVar.Z(-483455358);
            r1.j0 j0VarA9 = y.u.a(eVar, eVar2, qVar);
            qVar.Z(-1323940314);
            int i19 = qVar.P;
            m0.r1 r1VarP9 = qVar.p();
            u0.b bVarI9 = androidx.compose.ui.layout.a.i(lVar);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, j0VarA9, iVar8);
            d7.t.s0(qVar, r1VarP9, iVar9);
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i19))) {
                iVar6 = iVar15;
                l.q.r(i19, qVar, i19, iVar6);
            } else {
                iVar6 = iVar15;
            }
            l.q.s(0, bVarI9, new m0.l2(qVar), qVar, 2058660585);
            t1.i iVar16 = iVar6;
            c5.b("Disable Play Protect", null, j10, o1.s.N(13), null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 199686, 0, 131026);
            c5.b("Google Play Protect may block or remove this app because ride apps restrict third-party automation. Turn off Play Protect scanning to keep the app installed.", null, j11, o1.s.N(12), null, null, null, 0L, null, null, o1.s.N(16), 0, false, 0, 0, null, null, qVar, 3078, 6, 130034);
            l.q.v(qVar, false, true, false, false);
            l.q.v(qVar, false, true, false, false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar);
            d7.t.d(null, 0.0f, e1.r.b(j12, 0.5f), qVar, 0, 3);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar);
            y0.o oVarN4 = androidx.compose.foundation.layout.a.n(lVar, 0.0f, f11, 1);
            qVar.Z(693286680);
            r1.j0 j0VarA10 = y.z0.a(dVar2, fVar3, qVar);
            qVar.Z(-1323940314);
            int i20 = qVar.P;
            m0.r1 r1VarP10 = qVar.p();
            u0.b bVarI10 = androidx.compose.ui.layout.a.i(oVarN4);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, j0VarA10, iVar8);
            d7.t.s0(qVar, r1VarP10, iVar9);
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i20))) {
                iVar7 = iVar16;
                l.q.r(i20, qVar, i20, iVar7);
            } else {
                iVar7 = iVar16;
            }
            l.q.s(0, bVarI10, new m0.l2(qVar), qVar, 2058660585);
            t1.i iVar17 = iVar7;
            c5.b("\u1f916", null, 0L, o1.s.N(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 3078, 0, 131062);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar, f10), qVar);
            qVar.Z(-483455358);
            r1.j0 j0VarA11 = y.u.a(eVar, eVar2, qVar);
            qVar.Z(-1323940314);
            int i21 = qVar.P;
            m0.r1 r1VarP11 = qVar.p();
            u0.b bVarI11 = androidx.compose.ui.layout.a.i(lVar);
            if (!(dVar instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, j0VarA11, iVar8);
            d7.t.s0(qVar, r1VarP11, iVar9);
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i21))) {
                l.q.r(i21, qVar, i21, iVar17);
            }
            l.q.s(0, bVarI11, new m0.l2(qVar), qVar, 2058660585);
            c5.b("How It Works", null, j10, o1.s.N(13), null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar, 199686, 0, 131026);
            c5.b("Ride Accepter uses AI-powered deep integration to detect ride requests from Ola, Rapido & other supported apps. It automatically accepts rides within your set fare range in milliseconds \u2014 even from floating overlays and notifications.", null, j11, l.q.d(lVar, f11, qVar, 12), null, null, null, 0L, null, null, o1.s.N(16), 0, false, 0, 0, null, null, qVar, 3078, 6, 130034);
            z10 = true;
            l.q.v(qVar, false, true, false, false);
            l.q.v(qVar, false, true, false, false);
        } else {
            qVar = qVar3;
            z10 = true;
        }
        l.q.v(qVar, false, false, z10, false);
        qVar.t(false);
    }

    public final y0.o a(y0.o oVar, m0.m mVar) {
        k0.y0 y0Var = m0.l.f11578a;
        int i10 = this.f14843a;
        Object obj = this.f14845c;
        Object obj2 = this.f14844b;
        switch (i10) {
            case 0:
                m0.q qVar = (m0.q) mVar;
                qVar.Z(-353972293);
                i1 i1Var = (i1) obj2;
                if (i1Var == null) {
                    i1Var = x1.f14978a;
                }
                j1 j1VarA = i1Var.a((x.l) obj, qVar);
                qVar.Z(1157296644);
                boolean zG = qVar.g(j1VarA);
                Object objP = qVar.P();
                if (zG || objP == y0Var) {
                    objP = new n1(j1VarA);
                    qVar.l0(objP);
                }
                qVar.t(false);
                n1 n1Var = (n1) objP;
                qVar.t(false);
                return n1Var;
            case 1:
                m0.q qVar2 = (m0.q) mVar;
                qVar2.Z(-102778667);
                qVar2.Z(773894976);
                qVar2.Z(-492369756);
                Object objP2 = qVar2.P();
                if (objP2 == y0Var) {
                    m0.d0 d0Var = new m0.d0(m0.s.h(qVar2));
                    qVar2.l0(d0Var);
                    objP2 = d0Var;
                }
                qVar2.t(false);
                m9.d0 d0Var2 = ((m0.d0) objP2).f11474a;
                Object objF = l.q.f(qVar2, false, -492369756);
                if (objF == y0Var) {
                    objF = d7.t.g0(null, o3.f11621a);
                    qVar2.l0(objF);
                }
                qVar2.t(false);
                m0.g1 g1Var = (m0.g1) objF;
                m0.g1 g1VarM0 = d7.t.m0((c9.c) obj2, qVar2);
                x.m mVar2 = (x.m) obj;
                qVar2.Z(922652220);
                boolean zG2 = qVar2.g(g1Var) | qVar2.g(mVar2);
                Object objP3 = qVar2.P();
                if (zG2 || objP3 == y0Var) {
                    objP3 = new s(11, g1Var, mVar2);
                    qVar2.l0(objP3);
                }
                qVar2.t(false);
                m0.s.a(mVar2, (c9.c) objP3, qVar2);
                y0.o oVarA = o1.c0.a(y0.l.f16729b, mVar2, new f0.v1(d0Var2, g1Var, mVar2, g1VarM0, null));
                qVar2.t(false);
                return oVarA;
            default:
                m0.q qVar3 = (m0.q) mVar;
                qVar3.Z(759876635);
                c9.a aVar = (c9.a) obj2;
                t.q qVar4 = h0.k0.f7420a;
                qVar3.Z(-1589795249);
                qVar3.Z(-492369756);
                Object objP4 = qVar3.P();
                if (objP4 == y0Var) {
                    objP4 = d7.t.R(aVar);
                    qVar3.l0(objP4);
                }
                qVar3.t(false);
                l3 l3Var = (l3) objP4;
                qVar3.Z(-492369756);
                Object objP5 = qVar3.P();
                if (objP5 == y0Var) {
                    objP5 = new t.d(new d1.c(((d1.c) l3Var.getValue()).f4330a), h0.k0.f7421b, new d1.c(h0.k0.f7422c), 8);
                    qVar3.l0(objP5);
                }
                qVar3.t(false);
                t.d dVar = (t.d) objP5;
                m0.s.b(q8.l.f13235a, new h0.j0(l3Var, dVar, null), qVar3);
                t.o oVar2 = dVar.f14110c;
                qVar3.t(false);
                c9.c cVar = (c9.c) obj;
                qVar3.Z(1227294510);
                boolean zG3 = qVar3.g(oVar2);
                Object objP6 = qVar3.P();
                if (zG3 || objP6 == y0Var) {
                    objP6 = new z.o(oVar2, 3);
                    qVar3.l0(objP6);
                }
                qVar3.t(false);
                y0.o oVar3 = (y0.o) cVar.invoke((c9.a) objP6);
                qVar3.t(false);
                return oVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0414  */
    /* JADX WARN: Code duplicated, block: B:102:0x0418  */
    /* JADX WARN: Code duplicated, block: B:109:0x0438  */
    /* JADX WARN: Code duplicated, block: B:111:0x0478  */
    /* JADX WARN: Code duplicated, block: B:113:0x047d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0489  */
    /* JADX WARN: Code duplicated, block: B:118:0x048e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0493  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:38:0x016e  */
    /* JADX WARN: Code duplicated, block: B:39:0x017b  */
    /* JADX WARN: Code duplicated, block: B:42:0x01db  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0259  */
    /* JADX WARN: Code duplicated, block: B:53:0x0280  */
    /* JADX WARN: Code duplicated, block: B:55:0x0287  */
    /* JADX WARN: Code duplicated, block: B:57:0x028c  */
    /* JADX WARN: Code duplicated, block: B:62:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x032b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0334  */
    /* JADX WARN: Code duplicated, block: B:79:0x0338  */
    /* JADX WARN: Code duplicated, block: B:86:0x0358  */
    /* JADX WARN: Code duplicated, block: B:89:0x0373  */
    /* JADX WARN: Code duplicated, block: B:91:0x0378  */
    /* JADX WARN: Code duplicated, block: B:93:0x037e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0381  */
    /* JADX WARN: Code duplicated, block: B:97:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:99:0x040d  */
    public final void b(y.v vVar, m0.m mVar, int i10) {
        e1.f0 f0Var;
        y.e eVar;
        r1.j0 j0VarA;
        int i11;
        m0.r1 r1VarP;
        u0.b bVarI;
        f2.l lVar;
        long j10;
        float f10;
        String strX;
        long j11;
        r1.j0 j0VarA2;
        int i12;
        m0.r1 r1VarP2;
        u0.b bVarI2;
        t1.i iVar;
        t1.i iVar2;
        float f11;
        String status;
        y0.l lVar2;
        float f12;
        long jB;
        e1.f0 f0Var2;
        float f13;
        y0.g gVar;
        y0.l lVar3;
        r1.j0 j0VarC;
        int i13;
        m0.r1 r1VarP3;
        u0.b bVarI3;
        String status2;
        long j12;
        boolean z10;
        boolean z11;
        r1.j0 j0VarC2;
        int i14;
        m0.r1 r1VarP4;
        u0.b bVarI4;
        boolean zF;
        Object objP;
        y0.e eVar2 = y0.a.f16715o;
        y0.f fVar = y0.a.f16714n;
        e1.f0 f0Var3 = e1.g0.f5008a;
        y0.e eVar3 = y0.a.f16717q;
        k0.y0 y0Var = m0.l.f11578a;
        y0.l lVar4 = y0.l.f16729b;
        int i15 = this.f14843a;
        Object obj = this.f14845c;
        Object obj2 = this.f14844b;
        switch (i15) {
            case 3:
                if ((i10 & 17) == 16) {
                    m0.q qVar = (m0.q) mVar;
                    if (qVar.G()) {
                        qVar.U();
                        return;
                    }
                }
                c4.d((c9.e) obj2, (c9.e) obj, mVar, 0);
                return;
            case 4:
            default:
                d7.a.m(vVar, "$this$Card");
                if ((i10 & 81) == 16) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                        return;
                    }
                }
                y0.o oVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.f1667a, 14);
                y.f fVar2 = y.k.f16611g;
                TransactionData transactionData = (TransactionData) obj2;
                MainViewModel mainViewModel = (MainViewModel) obj;
                m0.q qVar3 = (m0.q) mVar;
                qVar3.Z(693286680);
                r1.j0 j0VarA3 = y.z0.a(fVar2, fVar, qVar3);
                qVar3.Z(-1323940314);
                int i16 = qVar3.P;
                m0.r1 r1VarP5 = qVar3.p();
                t1.l.f14477k.getClass();
                t1.j jVar = t1.k.f14458b;
                u0.b bVarI5 = androidx.compose.ui.layout.a.i(oVarL);
                boolean z12 = qVar3.f11630a instanceof m0.d;
                if (!z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                t1.i iVar3 = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarA3, iVar3);
                t1.i iVar4 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP5, iVar4);
                t1.i iVar5 = t1.k.f14462f;
                if (!qVar3.O) {
                    f0Var = f0Var3;
                    if (!d7.a.d(qVar3.P(), Integer.valueOf(i16))) {
                    }
                    bVarI5.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    y0.o oVarA = y.a1.a();
                    qVar3.Z(-483455358);
                    eVar = y.k.f16607c;
                    j0VarA = y.u.a(eVar, eVar2, qVar3);
                    qVar3.Z(-1323940314);
                    i11 = qVar3.P;
                    r1VarP = qVar3.p();
                    bVarI = androidx.compose.ui.layout.a.i(oVarA);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar3);
                    d7.t.s0(qVar3, r1VarP, iVar4);
                    if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i11))) {
                        l.q.r(i11, qVar3, i11, iVar5);
                    }
                    l.q.u(qVar3, bVarI, qVar3, 0, 2058660585);
                    String orderId = transactionData.getOrderId();
                    long jN = o1.s.N(12);
                    lVar = f2.l.f6118f;
                    j10 = e1.r.f5061c;
                    c5.b(orderId, null, j10, jN, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, new a2.c0(0L, 0L, null, f2.e.f6103c, null, 16777183), qVar3, 200064, 0, 65490);
                    f10 = 4;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar4, f10), qVar3);
                    String planType = transactionData.getPlanType();
                    int amount = transactionData.getAmount();
                    if (transactionData.getCouponCode().length() > 0) {
                        strX = l.q.x(" \u2022 \u1f3ab ", transactionData.getCouponCode());
                    } else {
                        strX = "";
                    }
                    long jN2 = o1.s.N(11);
                    j11 = e5.a.f5137m;
                    c5.b(planType + " \u2022 \u20b9" + amount + strX, null, j11, jN2, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 3456, 0, 131058);
                    qVar3.Z(-1430208979);
                    if (transactionData.getCreatedAt() > 0) {
                        long createdAt = transactionData.getCreatedAt();
                        qVar3.Z(-1382376551);
                        zF = qVar3.f(createdAt);
                        objP = qVar3.P();
                        if (zF || objP == y0Var) {
                            objP = new SimpleDateFormat("dd MMM, hh:mm a", Locale.getDefault()).format(new Date(transactionData.getCreatedAt()));
                            qVar3.l0(objP);
                        }
                        String str = (String) objP;
                        qVar3.t(false);
                        long jN3 = o1.s.N(10);
                        long jB2 = e1.r.b(j11, 0.6f);
                        d7.a.j(str);
                        c5.b(str, null, jB2, jN3, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 3456, 0, 131058);
                    } else {
                        iVar3 = iVar3;
                    }
                    l.q.v(qVar3, false, false, true, false);
                    qVar3.t(false);
                    qVar3.Z(-483455358);
                    j0VarA2 = y.u.a(eVar, eVar3, qVar3);
                    qVar3.Z(-1323940314);
                    i12 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(lVar4);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = iVar3;
                    d7.t.s0(qVar3, j0VarA2, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar4);
                    if (qVar3.O && d7.a.d(qVar3.P(), Integer.valueOf(i12))) {
                        iVar2 = iVar5;
                    } else {
                        iVar2 = iVar5;
                        l.q.r(i12, qVar3, i12, iVar2);
                    }
                    l.q.u(qVar3, bVarI2, qVar3, 0, 2058660585);
                    f11 = 6;
                    y0.o oVarB = androidx.compose.ui.draw.a.b(lVar4, e0.f.a(f11));
                    status = transactionData.getStatus();
                    if (d7.a.d(status, "SUCCESS")) {
                        lVar2 = lVar4;
                        f12 = f10;
                        jB = e1.r.b(e5.a.f5139o, 0.15f);
                    } else {
                        lVar2 = lVar4;
                        f12 = f10;
                        if (d7.a.d(status, "PENDING")) {
                            jB = e1.r.b(e5.a.f5140p, 0.15f);
                        } else {
                            jB = e1.r.b(e5.a.f5138n, 0.15f);
                        }
                    }
                    f0Var2 = f0Var;
                    y0.o oVarE = androidx.compose.foundation.a.e(oVarB, jB, f0Var2);
                    f13 = 10;
                    y0.o oVarM = androidx.compose.foundation.layout.a.m(oVarE, f13, f12);
                    qVar3.Z(733328855);
                    gVar = y0.a.f16708a;
                    lVar3 = lVar2;
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i13 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarM);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar4);
                    if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i13))) {
                        l.q.r(i13, qVar3, i13, iVar2);
                    }
                    l.q.u(qVar3, bVarI3, qVar3, 0, 2058660585);
                    String status3 = transactionData.getStatus();
                    long jN4 = o1.s.N(10);
                    status2 = transactionData.getStatus();
                    if (d7.a.d(status2, "SUCCESS")) {
                        j12 = e5.a.f5139o;
                    } else if (d7.a.d(status2, "PENDING")) {
                        j12 = e5.a.f5140p;
                    } else {
                        j12 = e5.a.f5138n;
                    }
                    c5.b(status3, null, j12, jN4, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 199680, 0, 131026);
                    l.q.v(qVar3, false, true, false, false);
                    qVar3.Z(-1430206749);
                    if (d7.a.d(transactionData.getStatus(), "PENDING")) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f11), qVar3);
                        y0.o oVarM2 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.k(androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(lVar3, e0.f.a(f11)), e5.a.f5139o, f0Var2), new r0(19, mainViewModel, transactionData)), f13, 5);
                        qVar3.Z(733328855);
                        j0VarC2 = y.p.c(gVar, false, qVar3);
                        qVar3.Z(-1323940314);
                        i14 = qVar3.P;
                        r1VarP4 = qVar3.p();
                        bVarI4 = androidx.compose.ui.layout.a.i(oVarM2);
                        if (z12) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar3.c0();
                        if (qVar3.O) {
                            qVar3.o(jVar);
                        } else {
                            qVar3.o0();
                        }
                        d7.t.s0(qVar3, j0VarC2, iVar);
                        d7.t.s0(qVar3, r1VarP4, iVar4);
                        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i14))) {
                            l.q.r(i14, qVar3, i14, iVar2);
                        }
                        l.q.u(qVar3, bVarI4, qVar3, 0, 2058660585);
                        c5.b("VERIFY", null, j10, o1.s.N(10), null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 131026);
                        z10 = false;
                        z11 = true;
                        l.q.v(qVar3, false, true, false, false);
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                    l.q.v(qVar3, z10, z10, z11, z10);
                    l.q.v(qVar3, z10, z10, z11, z10);
                    qVar3.t(z10);
                    return;
                }
                f0Var = f0Var3;
                l.q.r(i16, qVar3, i16, iVar5);
                bVarI5.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                y0.o oVarA2 = y.a1.a();
                qVar3.Z(-483455358);
                eVar = y.k.f16607c;
                j0VarA = y.u.a(eVar, eVar2, qVar3);
                qVar3.Z(-1323940314);
                i11 = qVar3.P;
                r1VarP = qVar3.p();
                bVarI = androidx.compose.ui.layout.a.i(oVarA2);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar3);
                d7.t.s0(qVar3, r1VarP, iVar4);
                if (qVar3.O) {
                    l.q.r(i11, qVar3, i11, iVar5);
                } else {
                    l.q.r(i11, qVar3, i11, iVar5);
                }
                l.q.u(qVar3, bVarI, qVar3, 0, 2058660585);
                String orderId2 = transactionData.getOrderId();
                long jN5 = o1.s.N(12);
                lVar = f2.l.f6118f;
                j10 = e1.r.f5061c;
                c5.b(orderId2, null, j10, jN5, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, new a2.c0(0L, 0L, null, f2.e.f6103c, null, 16777183), qVar3, 200064, 0, 65490);
                f10 = 4;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar4, f10), qVar3);
                String planType2 = transactionData.getPlanType();
                int amount2 = transactionData.getAmount();
                if (transactionData.getCouponCode().length() > 0) {
                    strX = l.q.x(" \u2022 \u1f3ab ", transactionData.getCouponCode());
                } else {
                    strX = "";
                }
                long jN6 = o1.s.N(11);
                j11 = e5.a.f5137m;
                c5.b(planType2 + " \u2022 \u20b9" + amount2 + strX, null, j11, jN6, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 3456, 0, 131058);
                qVar3.Z(-1430208979);
                if (transactionData.getCreatedAt() > 0) {
                    long createdAt2 = transactionData.getCreatedAt();
                    qVar3.Z(-1382376551);
                    zF = qVar3.f(createdAt2);
                    objP = qVar3.P();
                    if (zF) {
                        objP = new SimpleDateFormat("dd MMM, hh:mm a", Locale.getDefault()).format(new Date(transactionData.getCreatedAt()));
                        qVar3.l0(objP);
                    } else {
                        objP = new SimpleDateFormat("dd MMM, hh:mm a", Locale.getDefault()).format(new Date(transactionData.getCreatedAt()));
                        qVar3.l0(objP);
                    }
                    String str2 = (String) objP;
                    qVar3.t(false);
                    long jN7 = o1.s.N(10);
                    long jB3 = e1.r.b(j11, 0.6f);
                    d7.a.j(str2);
                    c5.b(str2, null, jB3, jN7, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 3456, 0, 131058);
                } else {
                    iVar3 = iVar3;
                }
                l.q.v(qVar3, false, false, true, false);
                qVar3.t(false);
                qVar3.Z(-483455358);
                j0VarA2 = y.u.a(eVar, eVar3, qVar3);
                qVar3.Z(-1323940314);
                i12 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(lVar4);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = iVar3;
                d7.t.s0(qVar3, j0VarA2, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar4);
                if (qVar3.O) {
                    iVar2 = iVar5;
                    l.q.r(i12, qVar3, i12, iVar2);
                } else {
                    iVar2 = iVar5;
                    l.q.r(i12, qVar3, i12, iVar2);
                }
                l.q.u(qVar3, bVarI2, qVar3, 0, 2058660585);
                f11 = 6;
                y0.o oVarB2 = androidx.compose.ui.draw.a.b(lVar4, e0.f.a(f11));
                status = transactionData.getStatus();
                if (d7.a.d(status, "SUCCESS")) {
                    lVar2 = lVar4;
                    f12 = f10;
                    jB = e1.r.b(e5.a.f5139o, 0.15f);
                } else {
                    lVar2 = lVar4;
                    f12 = f10;
                    if (d7.a.d(status, "PENDING")) {
                        jB = e1.r.b(e5.a.f5140p, 0.15f);
                    } else {
                        jB = e1.r.b(e5.a.f5138n, 0.15f);
                    }
                }
                f0Var2 = f0Var;
                y0.o oVarE2 = androidx.compose.foundation.a.e(oVarB2, jB, f0Var2);
                f13 = 10;
                y0.o oVarM3 = androidx.compose.foundation.layout.a.m(oVarE2, f13, f12);
                qVar3.Z(733328855);
                gVar = y0.a.f16708a;
                lVar3 = lVar2;
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i13 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarM3);
                if (z12) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar4);
                if (qVar3.O) {
                    l.q.r(i13, qVar3, i13, iVar2);
                } else {
                    l.q.r(i13, qVar3, i13, iVar2);
                }
                l.q.u(qVar3, bVarI3, qVar3, 0, 2058660585);
                String status4 = transactionData.getStatus();
                long jN8 = o1.s.N(10);
                status2 = transactionData.getStatus();
                if (d7.a.d(status2, "SUCCESS")) {
                    j12 = e5.a.f5139o;
                } else if (d7.a.d(status2, "PENDING")) {
                    j12 = e5.a.f5140p;
                } else {
                    j12 = e5.a.f5138n;
                }
                c5.b(status4, null, j12, jN8, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 199680, 0, 131026);
                l.q.v(qVar3, false, true, false, false);
                qVar3.Z(-1430206749);
                if (d7.a.d(transactionData.getStatus(), "PENDING")) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f11), qVar3);
                    y0.o oVarM4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.k(androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(lVar3, e0.f.a(f11)), e5.a.f5139o, f0Var2), new r0(19, mainViewModel, transactionData)), f13, 5);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i14 = qVar3.P;
                    r1VarP4 = qVar3.p();
                    bVarI4 = androidx.compose.ui.layout.a.i(oVarM4);
                    if (z12) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP4, iVar4);
                    if (qVar3.O) {
                        l.q.r(i14, qVar3, i14, iVar2);
                    } else {
                        l.q.r(i14, qVar3, i14, iVar2);
                    }
                    l.q.u(qVar3, bVarI4, qVar3, 0, 2058660585);
                    c5.b("VERIFY", null, j10, o1.s.N(10), null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 131026);
                    z10 = false;
                    z11 = true;
                    l.q.v(qVar3, false, true, false, false);
                } else {
                    z10 = false;
                    z11 = true;
                }
                l.q.v(qVar3, z10, z10, z11, z10);
                l.q.v(qVar3, z10, z10, z11, z10);
                qVar3.t(z10);
                return;
            case 5:
                d7.a.m(vVar, "$this$Card");
                if ((i10 & 81) == 16) {
                    m0.q qVar4 = (m0.q) mVar;
                    if (qVar4.G()) {
                        qVar4.U();
                        return;
                    }
                }
                FillElement fillElement = androidx.compose.foundation.layout.c.f1667a;
                y0.o oVarL2 = androidx.compose.foundation.layout.a.l(fillElement, 16);
                y0.e eVar4 = y0.a.f16716p;
                m0.g1 g1Var = (m0.g1) obj2;
                m0.d1 d1Var = (m0.d1) obj;
                m0.q qVar5 = (m0.q) mVar;
                qVar5.Z(-483455358);
                r1.j0 j0VarA4 = y.u.a(y.k.f16607c, eVar4, qVar5);
                qVar5.Z(-1323940314);
                int i17 = qVar5.P;
                m0.r1 r1VarP6 = qVar5.p();
                t1.l.f14477k.getClass();
                t1.j jVar2 = t1.k.f14458b;
                u0.b bVarI6 = androidx.compose.ui.layout.a.i(oVarL2);
                if (!(qVar5.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar5.c0();
                if (qVar5.O) {
                    qVar5.o(jVar2);
                } else {
                    qVar5.o0();
                }
                d7.t.s0(qVar5, j0VarA4, t1.k.f14461e);
                d7.t.s0(qVar5, r1VarP6, t1.k.f14460d);
                t1.i iVar6 = t1.k.f14462f;
                if (qVar5.O || !d7.a.d(qVar5.P(), Integer.valueOf(i17))) {
                    l.q.r(i17, qVar5, i17, iVar6);
                }
                l.q.u(qVar5, bVarI6, qVar5, 0, 2058660585);
                c5.b(((Boolean) g1Var.getValue()).booleanValue() ? "Download Complete!" : "Downloading Update...", null, ((Boolean) g1Var.getValue()).booleanValue() ? e5.a.f5139o : e5.a.f5125a, o1.s.N(14), null, f2.l.f6117e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar5, 199680, 0, 131026);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar4, 12), qVar5);
                qVar5.Z(1265342804);
                Object objP2 = qVar5.P();
                if (objP2 == y0Var) {
                    objP2 = new u1.z0(d1Var, 11);
                    qVar5.l0(objP2);
                }
                c9.a aVar = (c9.a) objP2;
                qVar5.t(false);
                float f14 = 8;
                k0.b2.b(aVar, androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.c(fillElement, f14), e0.f.a(4)), ((Boolean) g1Var.getValue()).booleanValue() ? e5.a.f5139o : e5.a.f5125a, e5.a.f5133i, 0, qVar5, 3078, 16);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar4, f14), qVar5);
                c5.b(((int) (((s2) d1Var).d() * 100)) + "%", null, e5.a.f5137m, o1.s.N(13), null, f2.l.f6116d, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar5, 200064, 0, 131026);
                l.q.v(qVar5, false, true, false, false);
                return;
            case 6:
                d(vVar, mVar, i10);
                return;
            case 7:
                d7.a.m(vVar, "$this$Card");
                if ((i10 & 81) == 16) {
                    m0.q qVar6 = (m0.q) mVar;
                    if (qVar6.G()) {
                        qVar6.U();
                        return;
                    }
                }
                y0.o oVarL3 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.f1667a, 14);
                z4.f fVar3 = (z4.f) obj2;
                String str3 = (String) obj;
                m0.q qVar7 = (m0.q) mVar;
                qVar7.Z(693286680);
                r1.j0 j0VarA5 = y.z0.a(y.k.f16605a, fVar, qVar7);
                qVar7.Z(-1323940314);
                int i18 = qVar7.P;
                m0.r1 r1VarP7 = qVar7.p();
                t1.l.f14477k.getClass();
                t1.j jVar3 = t1.k.f14458b;
                u0.b bVarI7 = androidx.compose.ui.layout.a.i(oVarL3);
                boolean z13 = qVar7.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar7.c0();
                if (qVar7.O) {
                    qVar7.o(jVar3);
                } else {
                    qVar7.o0();
                }
                t1.i iVar7 = t1.k.f14461e;
                d7.t.s0(qVar7, j0VarA5, iVar7);
                t1.i iVar8 = t1.k.f14460d;
                d7.t.s0(qVar7, r1VarP7, iVar8);
                t1.i iVar9 = t1.k.f14462f;
                if (qVar7.O || !d7.a.d(qVar7.P(), Integer.valueOf(i18))) {
                    l.q.r(i18, qVar7, i18, iVar9);
                }
                l.q.u(qVar7, bVarI7, qVar7, 0, 2058660585);
                y0.o oVarE3 = androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(lVar4, 40), e0.f.f4988a), fVar3.f17233c ? e1.r.b(e5.a.f5139o, 0.15f) : e1.r.b(e5.a.f5140p, 0.15f), f0Var3);
                y0.g gVar2 = y0.a.f16710c;
                qVar7.Z(733328855);
                r1.j0 j0VarC3 = y.p.c(gVar2, false, qVar7);
                qVar7.Z(-1323940314);
                int i19 = qVar7.P;
                m0.r1 r1VarP8 = qVar7.p();
                u0.b bVarI8 = androidx.compose.ui.layout.a.i(oVarE3);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar7.c0();
                if (qVar7.O) {
                    qVar7.o(jVar3);
                } else {
                    qVar7.o0();
                }
                d7.t.s0(qVar7, j0VarC3, iVar7);
                d7.t.s0(qVar7, r1VarP8, iVar8);
                if (qVar7.O || !d7.a.d(qVar7.P(), Integer.valueOf(i19))) {
                    l.q.r(i19, qVar7, i19, iVar9);
                }
                l.q.u(qVar7, bVarI8, qVar7, 0, 2058660585);
                boolean z14 = fVar3.f17233c;
                k0.e1.b(z14 ? o7.d0.A() : f6.a.K(), null, androidx.compose.foundation.layout.c.h(lVar4, 20), z14 ? e5.a.f5139o : e5.a.f5140p, qVar7, 432, 0);
                l.q.v(qVar7, false, true, false, false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.k(lVar4, 12), qVar7);
                y0.o oVarA3 = y.a1.a();
                qVar7.Z(-483455358);
                y.e eVar5 = y.k.f16607c;
                r1.j0 j0VarA6 = y.u.a(eVar5, eVar2, qVar7);
                qVar7.Z(-1323940314);
                int i20 = qVar7.P;
                m0.r1 r1VarP9 = qVar7.p();
                u0.b bVarI9 = androidx.compose.ui.layout.a.i(oVarA3);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar7.c0();
                if (qVar7.O) {
                    qVar7.o(jVar3);
                } else {
                    qVar7.o0();
                }
                d7.t.s0(qVar7, j0VarA6, iVar7);
                d7.t.s0(qVar7, r1VarP9, iVar8);
                if (qVar7.O || !d7.a.d(qVar7.P(), Integer.valueOf(i20))) {
                    l.q.r(i20, qVar7, i20, iVar9);
                }
                l.q.u(qVar7, bVarI9, qVar7, 0, 2058660585);
                c5.b(fVar3.f17231a, null, e1.r.f5061c, o1.s.N(14), null, f2.l.f6118f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar7, 200064, 0, 131026);
                qVar7.Z(-266406758);
                if (!l9.i.R0(fVar3.f17235e)) {
                    c5.b(fVar3.f17235e, null, e5.a.f5137m, o1.s.N(11), null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, qVar7, 3456, 3120, 120818);
                }
                qVar7.t(false);
                d7.a.j(str3);
                long j13 = e5.a.f5137m;
                c5.b(str3, null, e1.r.b(j13, 0.7f), o1.s.N(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar7, 3456, 0, 131058);
                l.q.v(qVar7, false, true, false, false);
                qVar7.Z(-483455358);
                r1.j0 j0VarA7 = y.u.a(eVar5, eVar3, qVar7);
                qVar7.Z(-1323940314);
                int i21 = qVar7.P;
                m0.r1 r1VarP10 = qVar7.p();
                u0.b bVarI10 = androidx.compose.ui.layout.a.i(lVar4);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar7.c0();
                if (qVar7.O) {
                    qVar7.o(jVar3);
                } else {
                    qVar7.o0();
                }
                d7.t.s0(qVar7, j0VarA7, iVar7);
                d7.t.s0(qVar7, r1VarP10, iVar8);
                if (qVar7.O || !d7.a.d(qVar7.P(), Integer.valueOf(i21))) {
                    l.q.r(i21, qVar7, i21, iVar9);
                }
                bVarI10.e(new m0.l2(qVar7), qVar7, 0);
                qVar7.Z(2058660585);
                c5.b("\u20b9" + fVar3.f17232b, null, z14 ? e5.a.f5139o : j13, o1.s.N(16), null, f2.l.f6119n, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar7, 199680, 0, 131026);
                c5.b(z14 ? "Accepted" : "Skipped", null, e1.r.b(z14 ? e5.a.f5139o : e5.a.f5140p, 0.8f), o1.s.N(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, qVar7, 3072, 0, 131058);
                l.q.v(qVar7, false, true, false, false);
                l.q.v(qVar7, false, true, false, false);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        m0.q qVar;
        m0.g1 g1Var;
        Object objP;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f14843a;
        Object obj4 = this.f14845c;
        Object obj5 = this.f14844b;
        switch (i10) {
            case 0:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 1:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 2:
                ((Number) obj3).intValue();
                return a((y0.o) obj, (m0.m) obj2);
            case 3:
                b((y.v) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar;
            case 4:
                a2.x xVar = (a2.x) obj;
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) obj5;
                c9.g gVar = (c9.g) obj4;
                f2.e eVar = xVar.f1036f;
                f2.l lVar2 = xVar.f1033c;
                if (lVar2 == null) {
                    lVar2 = f2.l.f6115c;
                }
                f2.j jVar = xVar.f1034d;
                f2.j jVar2 = new f2.j(jVar != null ? jVar.f6112a : 0);
                f2.k kVar = xVar.f1035e;
                spannable.setSpan(new d2.m((Typeface) gVar.g(eVar, lVar2, jVar2, new f2.k(kVar != null ? kVar.f6113a : 1))), iIntValue, iIntValue2, 33);
                return lVar;
            case 5:
                b((y.v) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar;
            case 6:
                b((y.v) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar;
            case 7:
                b((y.v) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar;
            case 8:
                m0.m mVar = (m0.m) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                d7.a.m((y.a1) obj, "$this$TopAppBar");
                if ((iIntValue3 & 81) == 16) {
                    m0.q qVar2 = (m0.q) mVar;
                    if (qVar2.G()) {
                        qVar2.U();
                    } else if (!((List) obj5).isEmpty()) {
                        qVar = (m0.q) mVar;
                        qVar.Z(-2016375087);
                        g1Var = (m0.g1) obj4;
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = k1.b(14, g1Var, qVar);
                        }
                        qVar.t(false);
                        o7.d0.b((c9.a) objP, null, false, null, null, d5.r.f4749g, qVar, 196614, 30);
                    }
                } else if (!((List) obj5).isEmpty()) {
                    qVar = (m0.q) mVar;
                    qVar.Z(-2016375087);
                    g1Var = (m0.g1) obj4;
                    objP = qVar.P();
                    if (objP == m0.l.f11578a) {
                        objP = k1.b(14, g1Var, qVar);
                    }
                    qVar.t(false);
                    o7.d0.b((c9.a) objP, null, false, null, null, d5.r.f4749g, qVar, 196614, 30);
                }
                return lVar;
            default:
                b((y.v) obj, (m0.m) obj2, ((Number) obj3).intValue());
                return lVar;
        }
    }
}
