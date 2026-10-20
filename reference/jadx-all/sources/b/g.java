package b;

import a0.h0;
import a2.b0;
import a2.x;
import a2.z;
import android.content.Context;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.activity.i0;
import androidx.fragment.app.a0;
import androidx.lifecycle.w;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.data.model.SupportedApp;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import d9.q;
import e1.k0;
import e1.n;
import e1.p;
import e1.r;
import f0.c2;
import f0.d2;
import f0.e2;
import f0.p1;
import f0.t0;
import h0.a1;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l.t;
import l2.m;
import l2.o;
import m0.g1;
import m0.l3;
import m0.n0;
import m0.o0;
import m9.e0;
import m9.f1;
import o7.d0;
import o7.i2;
import r1.l0;
import r1.w0;
import r1.x0;
import r8.v;
import s.j0;
import s.r0;
import t1.t1;
import t1.u1;
import u1.y1;
import v.r1;
import v.s;
import w0.u;
import y.p0;
import y.q0;
import y.s0;
import y.v0;
import y.y0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f2306a = i10;
        this.f2307b = obj;
        this.f2308c = obj2;
        this.f2309d = obj3;
    }

    public final n0 a(o0 o0Var) {
        int i10 = this.f2306a;
        int i11 = 1;
        Object obj = this.f2309d;
        Object obj2 = this.f2308c;
        Object obj3 = this.f2307b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                ((i0) obj3).a((w) obj2, hVar);
                return new c(hVar, i11);
            case 1:
                return new s.j((u) obj3, obj2, (s.w) obj);
            default:
                v0.j jVar = (v0.j) obj3;
                if (!jVar.f15867b.containsKey(obj2)) {
                    jVar.f15866a.remove(obj2);
                    v0.i iVar = (v0.i) obj;
                    jVar.f15867b.put(obj2, iVar);
                    return new s.j(iVar, jVar, obj2);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
    }

    public final void b(Throwable th) throws IllegalAccessException, InvocationTargetException {
        int i10 = this.f2306a;
        Object obj = this.f2308c;
        Object obj2 = this.f2309d;
        Object obj3 = this.f2307b;
        switch (i10) {
            case 19:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                t4.h hVar = (t4.h) obj2;
                ((t4.i) obj3).getClass();
                if (!viewTreeObserver.isAlive()) {
                    throw null;
                }
                viewTreeObserver.removeOnPreDrawListener(hVar);
                return;
            case 23:
                if (obj3 == o9.e.f12698l) {
                    return;
                }
                c9.c cVar = ((o9.c) obj).f12685b;
                a7.a.w(obj2);
                throw null;
            default:
                u8.j jVar = (u8.j) obj2;
                a0 a0VarG = d7.a.g((c9.c) obj3, obj, null);
                if (a0VarG != null) {
                    h6.g.n0(jVar, a0VarG);
                    return;
                }
                return;
        }
    }

    public final void d(w0 w0Var) {
        y.a0 a0Var;
        int i10 = this.f2306a;
        Object obj = this.f2309d;
        Object obj2 = this.f2308c;
        Object obj3 = this.f2307b;
        switch (i10) {
            case 5:
                p0 p0Var = (p0) obj3;
                if (p0Var.f16656w) {
                    l0 l0Var = (l0) obj;
                    w0.g(w0Var, (x0) obj2, l0Var.J(p0Var.f16654u), l0Var.J(p0Var.f16655v));
                } else {
                    l0 l0Var2 = (l0) obj;
                    int iJ = l0Var2.J(p0Var.f16654u);
                    int iJ2 = l0Var2.J(p0Var.f16655v);
                    w0Var.getClass();
                    w0.c((x0) obj2, iJ, iJ2, 0.0f);
                }
                break;
            case 6:
                q0 q0Var = (q0) obj3;
                long j10 = ((m2.i) q0Var.f16663u.invoke((l0) obj2)).f11809a;
                if (q0Var.f16664v) {
                    w0.h(w0Var, (x0) obj, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                } else {
                    w0.k(w0Var, (x0) obj, (int) (j10 >> 32), (int) (j10 & 4294967295L), null, 12);
                }
                break;
            case 7:
                s0 s0Var = (s0) obj3;
                if (s0Var.f16680y) {
                    l0 l0Var3 = (l0) obj;
                    w0.g(w0Var, (x0) obj2, l0Var3.J(s0Var.f16676u), l0Var3.J(s0Var.f16677v));
                } else {
                    l0 l0Var4 = (l0) obj;
                    int iJ3 = l0Var4.J(s0Var.f16676u);
                    int iJ4 = l0Var4.J(s0Var.f16677v);
                    w0Var.getClass();
                    w0.c((x0) obj2, iJ3, iJ4, 0.0f);
                }
                break;
            case 8:
                l0 l0Var5 = (l0) obj2;
                v0 v0Var = (v0) obj;
                int iJ5 = l0Var5.J(v0Var.f16686u.a(l0Var5.getLayoutDirection()));
                int iJ6 = l0Var5.J(v0Var.f16686u.d());
                w0Var.getClass();
                w0.c((x0) obj3, iJ5, iJ6, 0.0f);
                break;
            default:
                y.x0 x0Var = (y.x0) obj3;
                a4.k kVar = (a4.k) obj2;
                m2.l layoutDirection = ((l0) obj).getLayoutDirection();
                x0Var.getClass();
                for (int i11 = kVar.f1140b; i11 < kVar.f1141c; i11++) {
                    x0 x0Var2 = x0Var.f16700f[i11];
                    d7.a.j(x0Var2);
                    Object objA = ((r1.i0) x0Var.f16699e.get(i11)).a();
                    y0 y0Var = objA instanceof y0 ? (y0) objA : null;
                    if (y0Var == null || (a0Var = y0Var.f16705c) == null) {
                        a0Var = x0Var.f16698d;
                    }
                    int i12 = x0Var.f16695a;
                    int iA = a0Var.a(kVar.f1139a - (i12 == 1 ? x0Var2.f13424b : x0Var2.f13423a), i12 == 1 ? m2.l.f11815a : layoutDirection);
                    int i13 = kVar.f1140b;
                    int[] iArr = kVar.f1142d;
                    if (i12 == 1) {
                        int i14 = iArr[i11 - i13];
                        w0Var.getClass();
                        w0.c(x0Var2, i14, iA, 0.0f);
                    } else {
                        int i15 = iArr[i11 - i13];
                        w0Var.getClass();
                        w0.c(x0Var2, iA, i15, 0.0f);
                    }
                }
                break;
        }
    }

    public final void f(boolean z10) {
        int i10 = this.f2306a;
        Object obj = this.f2309d;
        Object obj2 = this.f2307b;
        Object obj3 = this.f2308c;
        switch (i10) {
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                ((g1) obj).setValue(Boolean.valueOf(z10));
                MainViewModel mainViewModel = (MainViewModel) obj2;
                String name = ((SupportedApp) obj3).getName();
                mainViewModel.getClass();
                d7.a.m(name, "appName");
                z4.d dVar = mainViewModel.f3081b;
                dVar.getClass();
                dVar.f17209c.edit().putBoolean("app_enabled_".concat(name), z10).commit();
                p9.q0 q0Var = dVar.J;
                LinkedHashMap linkedHashMapI0 = v.I0((Map) q0Var.getValue());
                linkedHashMapI0.put(name, Boolean.valueOf(z10));
                q0Var.i(linkedHashMapI0);
                break;
            default:
                if (!((Boolean) ((g1) obj3).getValue()).booleanValue()) {
                    Toast.makeText((Context) obj2, "Enable Shizuku first to use this feature", 0).show();
                    break;
                } else {
                    ((g1) obj).setValue(Boolean.valueOf(z10));
                    if (d0.P()) {
                        String str = z10 ? "0" : "1";
                        try {
                            d0.b0(new String[]{"settings", "put", "global", "window_animation_scale", str});
                            d0.b0(new String[]{"settings", "put", "global", "transition_animation_scale", str});
                            d0.b0(new String[]{"settings", "put", "global", "animator_duration_scale", str});
                            Log.d("ShellTapExecutor", "⚡ Zero Animation Mode set to scale=".concat(str));
                        } catch (Exception e4) {
                            a7.a.t("Zero Animation Mode failed: ", e4.getMessage(), "ShellTapExecutor");
                        }
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c9.c
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        e1.d0 d0VarG;
        Integer numD;
        Integer numC;
        Integer numC2;
        Integer numD2;
        a2.a0 a0Var;
        a2.a0 a0Var2;
        d2 d2Var;
        d2 d2Var2;
        a2.a0 a0Var3;
        a2.a0 a0Var4;
        d2 d2Var3;
        d2 d2Var4;
        Integer numC3;
        Integer numD3;
        Integer numD4;
        Integer numC4;
        t tVar;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f2306a;
        boolean z10 = false;
        int i11 = 3;
        e1.p0 p0Var = null;
        g2.a0 a0Var5 = null;
        a0Var = null;
        g2.a0 a0Var6 = null;
        p0Var = null;
        Object obj2 = this.f2309d;
        Object obj3 = this.f2307b;
        Object obj4 = this.f2308c;
        switch (i10) {
            case 0:
                return a((o0) obj);
            case 1:
                return a((o0) obj);
            case 2:
                l3 l3Var = (l3) obj3;
                e1.i0 i0Var = (e1.i0) ((e1.w) obj);
                i0Var.a(l3Var != null ? ((Number) l3Var.getValue()).floatValue() : 1.0f);
                l3 l3Var2 = (l3) obj4;
                i0Var.b(l3Var2 != null ? ((Number) l3Var2.getValue()).floatValue() : 1.0f);
                i0Var.d(l3Var2 != null ? ((Number) l3Var2.getValue()).floatValue() : 1.0f);
                l3 l3Var3 = (l3) obj2;
                i0Var.f(l3Var3 != null ? ((e1.p0) l3Var3.getValue()).f5057a : e1.p0.f5055b);
                return lVar;
            case 3:
                int iOrdinal = ((j0) obj).ordinal();
                if (iOrdinal == 0) {
                    s.w0 w0Var = ((s.q0) obj4).f13858a.f13755b;
                    if (w0Var != null) {
                        p0Var = new e1.p0(w0Var.f13885b);
                    } else {
                        s.w0 w0Var2 = ((r0) obj2).f13861a.f13755b;
                        if (w0Var2 != null) {
                            p0Var = new e1.p0(w0Var2.f13885b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    p0Var = (e1.p0) obj3;
                } else {
                    if (iOrdinal != 2) {
                        throw new a0();
                    }
                    s.w0 w0Var3 = ((r0) obj2).f13861a.f13755b;
                    if (w0Var3 != null) {
                        p0Var = new e1.p0(w0Var3.f13885b);
                    } else {
                        s.w0 w0Var4 = ((s.q0) obj4).f13858a.f13755b;
                        if (w0Var4 != null) {
                            p0Var = new e1.p0(w0Var4.f13885b);
                        }
                    }
                }
                return new e1.p0(p0Var != null ? p0Var.f5057a : e1.p0.f5055b);
            case 4:
                float fFloatValue = ((Number) obj).floatValue();
                float f10 = ((s) obj3).f15767w ? 1.0f : -1.0f;
                float fA = ((r1) obj4).a(f10 * fFloatValue) * f10;
                if (Math.abs(fA) < Math.abs(fFloatValue)) {
                    ((f1) obj2).a(d7.a.a("Scroll animation cancelled because scroll was not consumed (" + fA + " < " + fFloatValue + ')', null));
                }
                return lVar;
            case 5:
                d((w0) obj);
                return lVar;
            case 6:
                d((w0) obj);
                return lVar;
            case 7:
                d((w0) obj);
                return lVar;
            case 8:
                d((w0) obj);
                return lVar;
            case 9:
                d((w0) obj);
                return lVar;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                a0.s sVar = (a0.s) ((c9.a) obj3).invoke();
                if (iIntValue >= 0 && iIntValue < sVar.c()) {
                    z6.a.Q((m9.d0) obj4, null, 0, new a0.l0((h0) obj2, iIntValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder sbQ = a7.a.q("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
                sbQ.append(sVar.c());
                sbQ.append(')');
                throw new IllegalArgumentException(sbQ.toString().toString());
            case 11:
                g2.a0 a0Var7 = (g2.a0) obj;
                ((g1) obj4).setValue(a0Var7);
                g1 g1Var = (g1) obj2;
                boolean z11 = !d7.a.d((String) g1Var.getValue(), a0Var7.f6509a.f918a);
                a2.e eVar = a0Var7.f6509a;
                g1Var.setValue(eVar.f918a);
                if (z11) {
                    ((c9.c) obj3).invoke(eVar.f918a);
                }
                return lVar;
            case 12:
                g1.g gVar = (g1.g) obj;
                c2 c2Var = (c2) obj3;
                d2 d2VarD = c2Var.d();
                if (d2VarD != null) {
                    g2.a0 a0Var8 = (g2.a0) obj4;
                    g2.s sVar2 = (g2.s) obj2;
                    p pVarA = gVar.A().a();
                    boolean zB = b0.b(a0Var8.f6510b);
                    a2.a0 a0Var9 = d2VarD.f5667a;
                    if (!zB) {
                        long j10 = a0Var8.f6510b;
                        int iB = sVar2.b(b0.e(j10));
                        int iB2 = sVar2.b(b0.d(j10));
                        if (iB != iB2) {
                            a2.i iVar = a0Var9.f894b;
                            a2.k kVar = iVar.f932a;
                            if (iB < 0 || iB > iB2 || iB2 > kVar.f942a.f918a.length()) {
                                throw new IllegalArgumentException(("Start(" + iB + ") or End(" + iB2 + ") is out of range [0.." + kVar.f942a.f918a.length() + "), or start > end!").toString());
                            }
                            if (iB == iB2) {
                                d0VarG = androidx.compose.ui.graphics.a.g();
                            } else {
                                e1.i iVarG = androidx.compose.ui.graphics.a.g();
                                o1.s.z(iVar.f939h, o1.s.g(iB, iB2), new f0.p0(iVarG, iB, iB2));
                                d0VarG = iVarG;
                            }
                            pVarA.k(d0VarG, c2Var.f5657v);
                        }
                    }
                    long j11 = a0Var9.f895c;
                    float f11 = (int) (j11 >> 32);
                    a2.i iVar2 = a0Var9.f894b;
                    boolean z12 = f11 < iVar2.f935d || iVar2.f934c || ((float) ((int) (j11 & 4294967295L))) < iVar2.f936e;
                    z zVar = a0Var9.f893a;
                    if (z12 && !h6.g.T(zVar.f1057f, 3)) {
                        z10 = true;
                    }
                    if (z10) {
                        long j12 = a0Var9.f895c;
                        d1.d dVarH = e0.h(d1.c.f4326b, d7.t.j((int) (j12 >> 32), (int) (4294967295L & j12)));
                        pVarA.j();
                        p.o(pVarA, dVarH);
                    }
                    x xVar = zVar.f1053b.f911a;
                    l2.j jVar = xVar.f1043m;
                    o oVar = xVar.f1031a;
                    if (jVar == null) {
                        jVar = l2.j.f11211b;
                    }
                    l2.j jVar2 = jVar;
                    k0 k0Var = xVar.f1044n;
                    if (k0Var == null) {
                        k0Var = k0.f5038d;
                    }
                    k0 k0Var2 = k0Var;
                    g1.h hVar = xVar.f1046p;
                    if (hVar == null) {
                        hVar = g1.j.f6502a;
                    }
                    g1.h hVar2 = hVar;
                    try {
                        n nVarE = oVar.e();
                        m mVar = m.f11216a;
                        if (nVarE != null) {
                            a2.i.b(a0Var9.f894b, pVarA, nVarE, oVar != mVar ? oVar.c() : 1.0f, k0Var2, jVar2, hVar2);
                        } else {
                            a2.i.a(a0Var9.f894b, pVarA, oVar != mVar ? oVar.d() : r.f5060b, k0Var2, jVar2, hVar2);
                        }
                    } finally {
                        if (z10) {
                            pVarA.h();
                        }
                    }
                }
                return lVar;
            case 13:
                c9.c cVar = (c9.c) obj4;
                g2.h0 h0Var = (g2.h0) ((d9.u) obj2).f4952a;
                g2.a0 a0VarA = ((g2.j) obj3).a((List) obj);
                if (h0Var != null) {
                    h0Var.a(null, a0VarA);
                }
                cVar.invoke(a0VarA);
                return lVar;
            case Code.UNAVAILABLE /* 14 */:
                h0.r0 r0Var = (h0.r0) obj;
                switch (((t0) obj3).ordinal()) {
                    case 0:
                        f0.j jVar3 = f0.j.f5782e;
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (b0.b(r0Var.f7397f)) {
                                jVar3.invoke(r0Var);
                            } else if (r0Var.e()) {
                                int iE = b0.e(r0Var.f7397f);
                                r0Var.l(iE, iE);
                            } else {
                                int iD = b0.d(r0Var.f7397f);
                                r0Var.l(iD, iD);
                            }
                        }
                        return lVar;
                    case 1:
                        f0.j jVar4 = f0.j.f5783f;
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (b0.b(r0Var.f7397f)) {
                                jVar4.invoke(r0Var);
                            } else if (r0Var.e()) {
                                int iD2 = b0.d(r0Var.f7397f);
                                r0Var.l(iD2, iD2);
                            } else {
                                int iE2 = b0.e(r0Var.f7397f);
                                r0Var.l(iE2, iE2);
                            }
                        }
                        return lVar;
                    case 2:
                        a1 a1Var = r0Var.f7396e;
                        a1Var.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numC = r0Var.c()) != null) {
                                    int iIntValue2 = numC.intValue();
                                    r0Var.l(iIntValue2, iIntValue2);
                                }
                            } else {
                                a1Var.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numD = r0Var.d()) != null) {
                                    int iIntValue3 = numD.intValue();
                                    r0Var.l(iIntValue3, iIntValue3);
                                }
                            }
                        }
                        return lVar;
                    case 3:
                        a1 a1Var2 = r0Var.f7396e;
                        a1Var2.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var2.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numD2 = r0Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    r0Var.l(iIntValue4, iIntValue4);
                                }
                            } else {
                                a1Var2.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numC2 = r0Var.c()) != null) {
                                    int iIntValue5 = numC2.intValue();
                                    r0Var.l(iIntValue5, iIntValue5);
                                }
                            }
                        }
                        return lVar;
                    case 4:
                        r0Var.g();
                        return lVar;
                    case 5:
                        r0Var.h();
                        return lVar;
                    case 6:
                        r0Var.j();
                        return lVar;
                    case 7:
                        r0Var.i();
                        return lVar;
                    case 8:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.j();
                            } else {
                                r0Var.i();
                            }
                        }
                        return lVar;
                    case 9:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.i();
                            } else {
                                r0Var.j();
                            }
                        }
                        return lVar;
                    case 10:
                        if (r0Var.f7398g.f918a.length() > 0 && (a0Var = r0Var.f7394c) != null) {
                            int iF = r0Var.f(a0Var, -1);
                            r0Var.l(iF, iF);
                        }
                        return lVar;
                    case 11:
                        if (r0Var.f7398g.f918a.length() > 0 && (a0Var2 = r0Var.f7394c) != null) {
                            int iF2 = r0Var.f(a0Var2, 1);
                            r0Var.l(iF2, iF2);
                        }
                        return lVar;
                    case 12:
                        if (r0Var.f7398g.f918a.length() > 0 && (d2Var = r0Var.f7455i) != null) {
                            int iO = r0Var.o(d2Var, -1);
                            r0Var.l(iO, iO);
                        }
                        return lVar;
                    case 13:
                        if (r0Var.f7398g.f918a.length() > 0 && (d2Var2 = r0Var.f7455i) != null) {
                            int iO2 = r0Var.o(d2Var2, 1);
                            r0Var.l(iO2, iO2);
                        }
                        return lVar;
                    case Code.UNAVAILABLE /* 14 */:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            r0Var.l(0, 0);
                        }
                        return lVar;
                    case 15:
                        r0Var.f7396e.f7345a = null;
                        a2.e eVar2 = r0Var.f7398g;
                        if (eVar2.f918a.length() > 0) {
                            int length = eVar2.f918a.length();
                            r0Var.l(length, length);
                        }
                        return lVar;
                    case Code.UNAUTHENTICATED /* 16 */:
                        ((p1) obj4).f5847b.d(false);
                        return lVar;
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        ((p1) obj4).f5847b.m();
                        return lVar;
                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        ((p1) obj4).f5847b.f();
                        return lVar;
                    case 19:
                        List listN = r0Var.n(f0.j.f5784n);
                        if (listN != null) {
                            ((p1) obj4).a(listN);
                        }
                        return lVar;
                    case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                        List listN2 = r0Var.n(f0.j.f5785o);
                        if (listN2 != null) {
                            ((p1) obj4).a(listN2);
                        }
                        return lVar;
                    case 21:
                        List listN3 = r0Var.n(f0.j.f5786p);
                        if (listN3 != null) {
                            ((p1) obj4).a(listN3);
                        }
                        return lVar;
                    case 22:
                        List listN4 = r0Var.n(f0.j.f5787q);
                        if (listN4 != null) {
                            ((p1) obj4).a(listN4);
                        }
                        return lVar;
                    case 23:
                        List listN5 = r0Var.n(f0.j.f5788r);
                        if (listN5 != null) {
                            ((p1) obj4).a(listN5);
                        }
                        return lVar;
                    case 24:
                        List listN6 = r0Var.n(f0.j.f5789s);
                        if (listN6 != null) {
                            ((p1) obj4).a(listN6);
                        }
                        return lVar;
                    case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                        r0Var.f7396e.f7345a = null;
                        a2.e eVar3 = r0Var.f7398g;
                        if (eVar3.f918a.length() > 0) {
                            r0Var.l(0, eVar3.f918a.length());
                        }
                        return lVar;
                    case 26:
                        a1 a1Var3 = r0Var.f7396e;
                        a1Var3.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var3.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0) {
                                    String str = r0Var.f7398g.f918a;
                                    long j13 = r0Var.f7397f;
                                    int i12 = b0.f904c;
                                    int iU = d7.t.U((int) (4294967295L & j13), str);
                                    if (iU != -1) {
                                        r0Var.l(iU, iU);
                                    }
                                }
                            } else {
                                a1Var3.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0) {
                                    String str2 = r0Var.f7398g.f918a;
                                    long j14 = r0Var.f7397f;
                                    int i13 = b0.f904c;
                                    int iT = d7.t.T((int) (4294967295L & j14), str2);
                                    if (iT != -1) {
                                        r0Var.l(iT, iT);
                                    }
                                }
                            }
                        }
                        r0Var.k();
                        return lVar;
                    case 27:
                        a1 a1Var4 = r0Var.f7396e;
                        a1Var4.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var4.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0) {
                                    String str3 = r0Var.f7398g.f918a;
                                    long j15 = r0Var.f7397f;
                                    int i14 = b0.f904c;
                                    int iT2 = d7.t.T((int) (4294967295L & j15), str3);
                                    if (iT2 != -1) {
                                        r0Var.l(iT2, iT2);
                                    }
                                }
                            } else {
                                a1Var4.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0) {
                                    String str4 = r0Var.f7398g.f918a;
                                    long j16 = r0Var.f7397f;
                                    int i15 = b0.f904c;
                                    int iU2 = d7.t.U((int) (4294967295L & j16), str4);
                                    if (iU2 != -1) {
                                        r0Var.l(iU2, iU2);
                                    }
                                }
                            }
                        }
                        r0Var.k();
                        return lVar;
                    case 28:
                        if (r0Var.f7398g.f918a.length() > 0 && (a0Var3 = r0Var.f7394c) != null) {
                            int iF3 = r0Var.f(a0Var3, -1);
                            r0Var.l(iF3, iF3);
                        }
                        r0Var.k();
                        return lVar;
                    case 29:
                        if (r0Var.f7398g.f918a.length() > 0 && (a0Var4 = r0Var.f7394c) != null) {
                            int iF4 = r0Var.f(a0Var4, 1);
                            r0Var.l(iF4, iF4);
                        }
                        r0Var.k();
                        return lVar;
                    case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                        if (r0Var.f7398g.f918a.length() > 0 && (d2Var3 = r0Var.f7455i) != null) {
                            int iO3 = r0Var.o(d2Var3, -1);
                            r0Var.l(iO3, iO3);
                        }
                        r0Var.k();
                        return lVar;
                    case 31:
                        if (r0Var.f7398g.f918a.length() > 0 && (d2Var4 = r0Var.f7455i) != null) {
                            int iO4 = r0Var.o(d2Var4, 1);
                            r0Var.l(iO4, iO4);
                        }
                        r0Var.k();
                        return lVar;
                    case 32:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            r0Var.l(0, 0);
                        }
                        r0Var.k();
                        return lVar;
                    case 33:
                        r0Var.f7396e.f7345a = null;
                        a2.e eVar4 = r0Var.f7398g;
                        if (eVar4.f918a.length() > 0) {
                            int length2 = eVar4.f918a.length();
                            r0Var.l(length2, length2);
                        }
                        r0Var.k();
                        return lVar;
                    case 34:
                        a1 a1Var5 = r0Var.f7396e;
                        a1Var5.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var5.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numD3 = r0Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    r0Var.l(iIntValue6, iIntValue6);
                                }
                            } else {
                                a1Var5.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numC3 = r0Var.c()) != null) {
                                    int iIntValue7 = numC3.intValue();
                                    r0Var.l(iIntValue7, iIntValue7);
                                }
                            }
                        }
                        r0Var.k();
                        return lVar;
                    case 35:
                        a1 a1Var6 = r0Var.f7396e;
                        a1Var6.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var6.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numC4 = r0Var.c()) != null) {
                                    int iIntValue8 = numC4.intValue();
                                    r0Var.l(iIntValue8, iIntValue8);
                                }
                            } else {
                                a1Var6.f7345a = null;
                                if (r0Var.f7398g.f918a.length() > 0 && (numD4 = r0Var.d()) != null) {
                                    int iIntValue9 = numD4.intValue();
                                    r0Var.l(iIntValue9, iIntValue9);
                                }
                            }
                        }
                        r0Var.k();
                        return lVar;
                    case 36:
                        r0Var.g();
                        r0Var.k();
                        return lVar;
                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                        r0Var.h();
                        r0Var.k();
                        return lVar;
                    case 38:
                        r0Var.j();
                        r0Var.k();
                        return lVar;
                    case 39:
                        r0Var.i();
                        r0Var.k();
                        return lVar;
                    case 40:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.j();
                            } else {
                                r0Var.i();
                            }
                        }
                        r0Var.k();
                        return lVar;
                    case 41:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            if (r0Var.e()) {
                                r0Var.i();
                            } else {
                                r0Var.j();
                            }
                        }
                        r0Var.k();
                        return lVar;
                    case 42:
                        r0Var.f7396e.f7345a = null;
                        if (r0Var.f7398g.f918a.length() > 0) {
                            long j17 = r0Var.f7397f;
                            int i16 = b0.f904c;
                            int i17 = (int) (j17 & 4294967295L);
                            r0Var.l(i17, i17);
                        }
                        return lVar;
                    case 43:
                        p1 p1Var = (p1) obj4;
                        if (p1Var.f5850e) {
                            p1Var.f5846a.f5656u.invoke(new g2.n(p1Var.f5857l));
                        } else {
                            p1Var.a(d7.t.d0(new g2.a("\n", 1)));
                        }
                        return lVar;
                    case 44:
                        p1 p1Var2 = (p1) obj4;
                        if (p1Var2.f5850e) {
                            ((q) obj2).f4948a = false;
                        } else {
                            p1Var2.a(d7.t.d0(new g2.a("\t", 1)));
                        }
                        return lVar;
                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                        p1 p1Var3 = (p1) obj4;
                        e2 e2Var = p1Var3.f5853h;
                        if (e2Var != null) {
                            e2Var.a(g2.a0.a(r0Var.f7454h, r0Var.f7398g, r0Var.f7397f, 4));
                        }
                        e2 e2Var2 = p1Var3.f5853h;
                        if (e2Var2 != null) {
                            t tVar2 = e2Var2.f5688b;
                            if (tVar2 != null && (tVar = (t) tVar2.f10928b) != null) {
                                e2Var2.f5688b = tVar;
                                e2Var2.f5690d -= ((g2.a0) tVar2.f10929c).f6509a.f918a.length();
                                e2Var2.f5689c = new t(i11, e2Var2.f5689c, (g2.a0) tVar2.f10929c);
                                a0Var6 = (g2.a0) tVar.f10929c;
                            }
                            if (a0Var6 != null) {
                                p1Var3.f5856k.invoke(a0Var6);
                            }
                        }
                        return lVar;
                    case 46:
                        p1 p1Var4 = (p1) obj4;
                        e2 e2Var3 = p1Var4.f5853h;
                        if (e2Var3 != null) {
                            t tVar3 = e2Var3.f5689c;
                            if (tVar3 != null) {
                                e2Var3.f5689c = (t) tVar3.f10928b;
                                g2.a0 a0Var10 = (g2.a0) tVar3.f10929c;
                                e2Var3.f5688b = new t(i11, e2Var3.f5688b, a0Var10);
                                e2Var3.f5690d = a0Var10.f6509a.f918a.length() + e2Var3.f5690d;
                                a0Var5 = (g2.a0) tVar3.f10929c;
                            }
                            if (a0Var5 != null) {
                                p1Var4.f5856k.invoke(a0Var5);
                            }
                        }
                        return lVar;
                    default:
                        return lVar;
                }
            case 15:
            default:
                b((Throwable) obj);
                return lVar;
            case Code.UNAUTHENTICATED /* 16 */:
                return a((o0) obj);
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                a1.e eVar5 = (a1.e) obj;
                q qVar = (q) obj3;
                boolean z13 = qVar.f4948a;
                boolean zG0 = eVar5.G0((a1.a) obj4);
                a1.e eVar6 = (a1.e) obj2;
                if (zG0) {
                    ((y1) ((u1.w) t1.g.A(eVar6)).getDragAndDropManager()).f15383b.add(eVar5);
                }
                qVar.f4948a = z13 | zG0;
                return Boolean.TRUE;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                u1 u1Var = (u1) obj;
                if (u1Var instanceof a1.c) {
                    a1.c cVar2 = (a1.c) u1Var;
                    if (((y1) ((u1.w) t1.g.A((a1.e) obj4)).getDragAndDropManager()).f15383b.contains(cVar2)) {
                        a1.a aVar = (a1.a) obj2;
                        if (d9.i.i(cVar2, d9.i.f(aVar.f882a.getX(), aVar.f882a.getY()))) {
                            ((d9.u) obj3).f4952a = u1Var;
                            return t1.f14556c;
                        }
                    }
                }
                return t1.f14554a;
            case 19:
                b((Throwable) obj);
                return lVar;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                f(((Boolean) obj).booleanValue());
                return lVar;
            case 21:
                f(((Boolean) obj).booleanValue());
                return lVar;
            case 22:
                String str5 = (String) obj;
                d7.a.m(str5, "it");
                String upperCase = str5.toUpperCase(Locale.ROOT);
                d7.a.l(upperCase, "toUpperCase(...)");
                ((g1) obj4).setValue(upperCase);
                if (((CouponData) ((l3) obj2).getValue()) != null) {
                    MainViewModel mainViewModel = (MainViewModel) obj3;
                    mainViewModel.f3117t0.i(null);
                    mainViewModel.f3121v0.i(null);
                }
                return lVar;
            case 23:
                b((Throwable) obj);
                return lVar;
        }
    }
}
