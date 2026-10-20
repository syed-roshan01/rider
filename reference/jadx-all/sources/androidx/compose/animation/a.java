package androidx.compose.animation;

import d7.t;
import e1.p0;
import i1.b;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.y0;
import m0.g1;
import m0.l;
import m0.m;
import m0.o3;
import m0.q;
import m2.i;
import m2.k;
import o1.s;
import s.b1;
import s.h0;
import s.j0;
import s.k0;
import s.q0;
import s.r0;
import s.s0;
import s.w0;
import t.d1;
import t.e;
import t.e0;
import t.i2;
import t.n1;
import t.u1;
import t.w1;
import t.x1;
import t.y1;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f1592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f1593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f1594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1 f1595d;

    static {
        h0 h0Var = h0.f13786d;
        h0 h0Var2 = h0.f13787e;
        x1 x1Var = y1.f14355a;
        f1592a = new x1(h0Var, h0Var2);
        f1593b = e.r(400.0f, null, 5);
        int i10 = i.f11808c;
        Map map = i2.f14207a;
        f1594c = e.r(400.0f, new i(b.c(1, 1)), 1);
        f1595d = e.r(400.0f, new k(s.e(1, 1)), 1);
    }

    public static final o a(u1 u1Var, q0 q0Var, r0 r0Var, m mVar, int i10) {
        n1 n1VarL;
        n1 n1VarL2;
        q qVar = (q) mVar;
        qVar.Z(914000546);
        qVar.Z(21614502);
        qVar.Z(1157296644);
        boolean zG = qVar.g(u1Var);
        Object objP = qVar.P();
        y0 y0Var = l.f11578a;
        o3 o3Var = o3.f11621a;
        if (zG || objP == y0Var) {
            objP = t.g0(q0Var, o3Var);
            qVar.l0(objP);
        }
        qVar.t(false);
        g1 g1Var = (g1) objP;
        Object objB = u1Var.b();
        m0.n1 n1Var = u1Var.f14321c;
        Object value = n1Var.getValue();
        j0 j0Var = j0.f13802b;
        if (objB == value && u1Var.b() == j0Var) {
            if (u1Var.d()) {
                g1Var.setValue(q0Var);
            } else {
                g1Var.setValue(q0.f13857b);
            }
        } else if (n1Var.getValue() == j0Var) {
            g1Var.setValue(((q0) g1Var.getValue()).b(q0Var));
        }
        q0 q0Var2 = (q0) g1Var.getValue();
        qVar.t(false);
        qVar.Z(-1363864804);
        qVar.Z(1157296644);
        boolean zG2 = qVar.g(u1Var);
        Object objP2 = qVar.P();
        if (zG2 || objP2 == y0Var) {
            objP2 = t.g0(r0Var, o3Var);
            qVar.l0(objP2);
        }
        qVar.t(false);
        g1 g1Var2 = (g1) objP2;
        boolean z10 = true;
        if (u1Var.b() == n1Var.getValue() && u1Var.b() == j0Var) {
            if (u1Var.d()) {
                g1Var2.setValue(r0Var);
            } else {
                g1Var2.setValue(r0.f13859b);
            }
        } else if (n1Var.getValue() != j0Var) {
            b1 b1Var = ((r0) g1Var2.getValue()).f13861a;
            s0 s0Var = b1Var.f13754a;
            if (s0Var == null) {
                s0Var = r0Var.f13861a.f13754a;
            }
            r0Var.f13861a.getClass();
            b1 b1Var2 = r0Var.f13861a;
            b1Var2.getClass();
            w0 w0Var = b1Var.f13755b;
            if (w0Var == null) {
                w0Var = b1Var2.f13755b;
            }
            boolean z11 = b1Var.f13756c || b1Var2.f13756c;
            Map map = b1Var.f13757d;
            d7.a.m(map, "<this>");
            Map map2 = b1Var2.f13757d;
            d7.a.m(map2, "map");
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(map2);
            g1Var2.setValue(new r0(new b1(s0Var, w0Var, z11, linkedHashMap)));
        }
        r0 r0Var2 = (r0) g1Var2.getValue();
        qVar.t(false);
        q0Var2.f13858a.getClass();
        r0Var2.f13861a.getClass();
        b1 b1Var3 = q0Var2.f13858a;
        b1Var3.getClass();
        b1 b1Var4 = r0Var2.f13861a;
        b1Var4.getClass();
        qVar.Z(1657242209);
        qVar.t(false);
        qVar.Z(1657242379);
        qVar.t(false);
        qVar.Z(1657242547);
        qVar.t(false);
        b1Var4.getClass();
        qVar.Z(642253525);
        boolean z12 = (b1Var3.f13754a == null && b1Var4.f13754a == null) ? false : true;
        if (b1Var3.f13755b == null && b1Var4.f13755b == null) {
            z10 = false;
        }
        qVar.Z(-1158245383);
        if (z12) {
            x1 x1Var = y1.f14355a;
            qVar.Z(-492369756);
            Object objP3 = qVar.P();
            if (objP3 == y0Var) {
                objP3 = "Built-in alpha";
                qVar.l0("Built-in alpha");
            }
            qVar.t(false);
            n1VarL = e.l(u1Var, x1Var, (String) objP3, qVar, 0);
        } else {
            n1VarL = null;
        }
        qVar.t(false);
        qVar.Z(-1158245186);
        if (z10) {
            x1 x1Var2 = y1.f14355a;
            qVar.Z(-492369756);
            Object objP4 = qVar.P();
            if (objP4 == y0Var) {
                objP4 = "Built-in scale";
                qVar.l0("Built-in scale");
            }
            qVar.t(false);
            n1VarL2 = e.l(u1Var, x1Var2, (String) objP4, qVar, 0);
        } else {
            n1VarL2 = null;
        }
        qVar.t(false);
        k0 k0Var = new k0(n1VarL, n1VarL2, u1Var, q0Var2, r0Var2, z10 ? e.l(u1Var, f1592a, "TransformOriginInterruptionHandling", qVar, 0) : null);
        qVar.t(false);
        o oVarJ = androidx.compose.ui.graphics.a.k(y0.l.f16729b, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 126975).j(new EnterExitTransitionElement(u1Var, q0Var2, r0Var2, k0Var));
        qVar.t(false);
        return oVarJ;
    }

    public static q0 b(w1 w1Var, int i10) {
        e0 e0VarR = w1Var;
        if ((i10 & 1) != 0) {
            e0VarR = e.r(400.0f, null, 5);
        }
        return new q0(new b1(new s0(0.0f, e0VarR), null, false, null, 62));
    }

    public static r0 c(w1 w1Var, int i10) {
        e0 e0VarR = w1Var;
        if ((i10 & 1) != 0) {
            e0VarR = e.r(400.0f, null, 5);
        }
        return new r0(new b1(new s0(0.0f, e0VarR), null, false, null, 62));
    }

    public static q0 d(w1 w1Var) {
        return new q0(new b1(null, new w0(0.92f, p0.f5055b, w1Var), false, null, 55));
    }
}
