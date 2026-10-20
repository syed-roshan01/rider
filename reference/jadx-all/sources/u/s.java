package u;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CancellationException;
import m0.l3;
import u1.t2;
import u1.w3;
import u1.x3;
import v.m3;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        super(1);
        this.f14923a = i10;
        this.f14925c = obj;
        this.f14924b = obj2;
    }

    public final m0.n0 a(m0.o0 o0Var) {
        int i10 = this.f14923a;
        Object obj = this.f14924b;
        Object obj2 = this.f14925c;
        switch (i10) {
            case 6:
                y.j1 j1Var = (y.j1) obj2;
                View view = (View) obj;
                if (j1Var.f16603s == 0) {
                    Field field = b3.q0.f2670a;
                    y.g0 g0Var = j1Var.f16604t;
                    b3.h0.u(view, g0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(g0Var);
                    b3.q0.f(view, g0Var);
                }
                j1Var.f16603s++;
                return new t.r0(4, j1Var, view);
            case 7:
                a0.o0 o0Var2 = (a0.o0) obj2;
                o0Var2.f836c.remove(obj);
                return new t.r0(5, o0Var2, obj);
            case 11:
                return new t.r0(6, (m0.g1) obj2, (x.m) obj);
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                Context context = (Context) obj2;
                u1.x0 x0Var = (u1.x0) obj;
                context.getApplicationContext().registerComponentCallbacks(x0Var);
                return new t.r0(7, context, x0Var);
            case 27:
                o2.r rVar = (o2.r) obj2;
                rVar.setPositionProvider((o2.t) obj);
                rVar.l();
                return new o2.g();
            default:
                d7.a.m(o0Var, "$this$DisposableEffect");
                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) obj2).getSystemService(ConnectivityManager.class);
                Network activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
                m0.g1 g1Var = (m0.g1) obj;
                g1Var.setValue(Boolean.valueOf(networkCapabilities != null && networkCapabilities.hasCapability(12)));
                r4.h hVar = new r4.h(g1Var, 2);
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), hVar);
                return new t.r0(8, connectivityManager, hVar);
        }
    }

    public final void b(g1.e eVar) {
        int i10 = this.f14923a;
        Object obj = this.f14925c;
        switch (i10) {
            case 0:
                ((t1.i0) eVar).a();
                a7.a.w(obj);
                throw null;
            default:
                t1.i0 i0Var = (t1.i0) eVar;
                i0Var.a();
                g1.g.D(i0Var, (e1.d0) obj, (e1.n) this.f14924b, 0.0f, null, 60);
                return;
        }
    }

    public final void d(Throwable th) {
        Throwable th2 = null;
        switch (this.f14923a) {
            case 3:
                ((v.l) this.f14925c).f15664a.m((v.p) this.f14924b);
                return;
            case 15:
                m0.g gVar = (m0.g) this.f14925c;
                Object obj = gVar.f11511b;
                d9.u uVar = (d9.u) this.f14924b;
                synchronized (obj) {
                    List list = gVar.f11513d;
                    Object obj2 = uVar.f4952a;
                    if (obj2 == null) {
                        d7.a.D("awaiter");
                        throw null;
                    }
                    list.remove((m0.f) obj2);
                }
                return;
            case Code.UNAUTHENTICATED /* 16 */:
                m0.x0 x0Var = (m0.x0) this.f14925c;
                Object obj3 = x0Var.f11749a;
                m9.k kVar = (m9.k) this.f14924b;
                synchronized (obj3) {
                    x0Var.f11750b.remove(kVar);
                }
                return;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                m0.g2 g2Var = (m0.g2) this.f14925c;
                Object obj4 = g2Var.f11520b;
                Throwable th3 = (Throwable) this.f14924b;
                synchronized (obj4) {
                    if (th3 != null) {
                        if (th != null) {
                            try {
                                if (!(true ^ (th instanceof CancellationException))) {
                                    th = null;
                                }
                                if (th != null) {
                                    d7.a.c(th3, th);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        th2 = th3;
                    }
                    g2Var.f11522d = th2;
                    g2Var.f11536r.i(m0.a2.f11447a);
                }
                return;
            case 21:
                u1.e1 e1Var = (u1.e1) this.f14925c;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.f14924b;
                synchronized (e1Var.f15076e) {
                    e1Var.f15078n.remove(frameCallback);
                }
                return;
            case 22:
                ((u1.g1) this.f14925c).f15096a.removeFrameCallback((Choreographer.FrameCallback) this.f14924b);
                return;
            default:
                Object obj5 = this.f14925c;
                if (th == null) {
                    androidx.concurrent.futures.k kVar2 = (androidx.concurrent.futures.k) obj5;
                    Object objG = ((m9.h0) this.f14924b).g();
                    kVar2.f1785d = true;
                    androidx.concurrent.futures.m mVar = kVar2.f1783b;
                    if (mVar == null || !mVar.f1788b.set(objG)) {
                        return;
                    }
                    kVar2.f1782a = null;
                    kVar2.f1783b = null;
                    kVar2.f1784c = null;
                    return;
                }
                if (th instanceof CancellationException) {
                    androidx.concurrent.futures.k kVar3 = (androidx.concurrent.futures.k) obj5;
                    kVar3.f1785d = true;
                    androidx.concurrent.futures.m mVar2 = kVar3.f1783b;
                    if (mVar2 == null || !mVar2.f1788b.cancel(true)) {
                        return;
                    }
                    kVar3.f1782a = null;
                    kVar3.f1783b = null;
                    kVar3.f1784c = null;
                    return;
                }
                androidx.concurrent.futures.k kVar4 = (androidx.concurrent.futures.k) obj5;
                kVar4.f1785d = true;
                androidx.concurrent.futures.m mVar3 = kVar4.f1783b;
                if (mVar3 == null || !mVar3.f1788b.setException(th)) {
                    return;
                }
                kVar4.f1782a = null;
                kVar4.f1783b = null;
                kVar4.f1784c = null;
                return;
        }
    }

    public final void f(r1.w0 w0Var) {
        int i10;
        int i11;
        int i12 = this.f14923a;
        Object obj = this.f14924b;
        Object obj2 = this.f14925c;
        switch (i12) {
            case 8:
                List list = (List) obj2;
                int size = list.size();
                int i13 = 0;
                while (i13 < size) {
                    b0.g gVar = (b0.g) list.get(i13);
                    if (gVar.f2388n == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first".toString());
                    }
                    List list2 = gVar.f2377c;
                    int size2 = list2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        r1.x0 x0Var = (r1.x0) list2.get(i14);
                        int i15 = i14 * 2;
                        int[] iArr = gVar.f2386l;
                        long jC = i1.b.c(iArr[i15], iArr[i15 + 1]);
                        boolean z10 = gVar.f2383i;
                        boolean z11 = gVar.f2384j;
                        if (z10) {
                            if (z11) {
                                int i16 = m2.i.f11808c;
                                i10 = (int) (jC >> 32);
                            } else {
                                int i17 = m2.i.f11808c;
                                i10 = (gVar.f2388n - ((int) (jC >> 32))) - (z11 ? x0Var.f13424b : x0Var.f13423a);
                            }
                            if (z11) {
                                i11 = (gVar.f2388n - ((int) (jC & 4294967295L))) - (z11 ? x0Var.f13424b : x0Var.f13423a);
                            } else {
                                i11 = (int) (jC & 4294967295L);
                            }
                            jC = i1.b.c(i10, i11);
                        } else {
                            i13 = i13;
                        }
                        int i18 = m2.i.f11808c;
                        int i19 = size;
                        long j10 = gVar.f2378d;
                        b0.g gVar2 = gVar;
                        long jC2 = i1.b.c(((int) (jC >> 32)) + ((int) (j10 >> 32)), ((int) (jC & 4294967295L)) + ((int) (j10 & 4294967295L)));
                        if (z11) {
                            r1.w0.m(w0Var, x0Var, jC2, null, 6);
                        } else {
                            r1.w0.i(w0Var, x0Var, jC2, null, 6);
                        }
                        i14++;
                        i13 = i13;
                        gVar = gVar2;
                        size = i19;
                    }
                    i13++;
                }
                ((m0.g1) obj).getValue();
                return;
            default:
                r1.w0.k(w0Var, (r1.x0) obj2, 0, 0, ((e1.m0) obj).K, 4);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    public final Boolean h(KeyEvent keyEvent) {
        int i10 = this.f14923a;
        boolean zB = true;
        Object obj = this.f14924b;
        Object obj2 = this.f14925c;
        switch (i10) {
            case 9:
                if (((f0.c2) obj2).a() == f0.o0.f5837b && keyEvent.getKeyCode() == 4 && z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 1)) {
                    ((h0.v0) obj).g(null);
                } else {
                    zB = false;
                }
                return Boolean.valueOf(zB);
            default:
                InputDevice device = keyEvent.getDevice();
                if (device == null || !device.supportsSource(513) || device.isVirtual() || !z6.a.B(androidx.compose.ui.input.key.a.b(keyEvent), 2)) {
                    zB = false;
                } else if (m9.e0.m(19, keyEvent)) {
                    zB = ((c1.f) ((c1.e) obj2)).b(5);
                } else if (m9.e0.m(20, keyEvent)) {
                    zB = ((c1.f) ((c1.e) obj2)).b(6);
                } else if (m9.e0.m(21, keyEvent)) {
                    zB = ((c1.f) ((c1.e) obj2)).b(3);
                } else if (m9.e0.m(22, keyEvent)) {
                    zB = ((c1.f) ((c1.e) obj2)).b(4);
                } else if (m9.e0.m(23, keyEvent)) {
                    t2 t2Var = ((f0.c2) obj).f5638c;
                    if (t2Var != null) {
                        g2.b0 b0Var = ((u1.u1) t2Var).f15307a;
                        if (((g2.h0) b0Var.f6513b.get()) != null) {
                            ((g2.e0) b0Var.f6512a).a(g2.c0.f6516c);
                        }
                    }
                } else {
                    zB = false;
                }
                return Boolean.valueOf(zB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    @Override // c9.c
    public final Object invoke(Object obj) {
        Object objM;
        String strConcat;
        int i10 = 1;
        switch (this.f14923a) {
            case 0:
                b((g1.e) obj);
                return q8.l.f13235a;
            case 1:
                b((g1.e) obj);
                return q8.l.f13235a;
            case 2:
            default:
                return a((m0.o0) obj);
            case 3:
                d((Throwable) obj);
                return q8.l.f13235a;
            case 4:
                long jH = ((d1.c) obj).f4330a;
                v.l2 l2Var = (v.l2) this.f14925c;
                v.r1 r1Var = (v.r1) this.f14924b;
                if (l2Var.f15672d) {
                    jH = d1.c.h(-1.0f, jH);
                }
                long jA = l2Var.a(r1Var, jH, 2);
                if (l2Var.f15672d) {
                    jA = d1.c.h(-1.0f, jA);
                }
                return new d1.c(jA);
            case 5:
                ((Number) obj).longValue();
                m3 m3Var = (m3) this.f14925c;
                float f10 = m3Var.f15708e;
                m3Var.f15708e = 0.0f;
                ((c9.c) this.f14924b).invoke(Float.valueOf(f10));
                return q8.l.f13235a;
            case 6:
                return a((m0.o0) obj);
            case 7:
                return a((m0.o0) obj);
            case 8:
                f((r1.w0) obj);
                return q8.l.f13235a;
            case 9:
                return h(((m1.b) obj).f11786a);
            case 10:
                return h(((m1.b) obj).f11786a);
            case 11:
                return a((m0.o0) obj);
            case 12:
                o1.u uVar = (o1.u) obj;
                if (((h0.l) this.f14925c).c(uVar.f12416c, (h0.s) this.f14924b)) {
                    uVar.a();
                }
                return q8.l.f13235a;
            case 13:
                g1.g gVar = (g1.g) obj;
                float fV = gVar.v(k0.e2.f8866c);
                l3 l3Var = (l3) this.f14925c;
                float f11 = 2;
                float f12 = fV / f11;
                gVar.u0(((e1.r) l3Var.getValue()).f5067a, (120 & 2) != 0 ? d1.f.c(gVar.e()) / 2.0f : gVar.v(l0.n.f11099a / f11) - f12, (120 & 4) != 0 ? gVar.O() : 0L, (120 & 8) != 0 ? 1.0f : 0.0f, (120 & 16) != 0 ? g1.j.f6502a : new g1.k(fV, 0.0f, 0, 0, 30), null, (120 & 64) != 0 ? 3 : 0);
                l3 l3Var2 = (l3) this.f14924b;
                if (Float.compare(((m2.e) l3Var2.getValue()).f11798a, 0) > 0) {
                    gVar.u0(((e1.r) l3Var.getValue()).f5067a, (120 & 2) != 0 ? d1.f.c(gVar.e()) / 2.0f : gVar.v(((m2.e) l3Var2.getValue()).f11798a) - f12, (120 & 4) != 0 ? gVar.O() : 0L, (120 & 8) != 0 ? 1.0f : 0.0f, (120 & 16) != 0 ? g1.j.f6502a : g1.j.f6502a, null, (120 & 64) != 0 ? 3 : 0);
                }
                return q8.l.f13235a;
            case Code.UNAVAILABLE /* 14 */:
                ((k0.j1) this.f14925c).f9064a.setValue(new y.b0((y.i1) this.f14924b, (y.i1) obj));
                return q8.l.f13235a;
            case 15:
                d((Throwable) obj);
                return q8.l.f13235a;
            case Code.UNAUTHENTICATED /* 16 */:
                d((Throwable) obj);
                return q8.l.f13235a;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                d((Throwable) obj);
                return q8.l.f13235a;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((m0.x) ((m0.e0) this.f14925c)).z(obj);
                o0.d dVar = (o0.d) this.f14924b;
                if (dVar != null) {
                    dVar.add(obj);
                }
                return q8.l.f13235a;
            case 19:
                f((r1.w0) obj);
                return q8.l.f13235a;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                return a((m0.o0) obj);
            case 21:
                d((Throwable) obj);
                return q8.l.f13235a;
            case 22:
                d((Throwable) obj);
                return q8.l.f13235a;
            case 23:
                u1.q qVar = (u1.q) obj;
                x3 x3Var = (x3) this.f14925c;
                if (!x3Var.f15372c) {
                    androidx.lifecycle.r lifecycle = qVar.f15215a.getLifecycle();
                    c9.e eVar = (c9.e) this.f14924b;
                    x3Var.f15374e = eVar;
                    if (x3Var.f15373d == null) {
                        x3Var.f15373d = lifecycle;
                        lifecycle.a(x3Var);
                    } else if (lifecycle.b().compareTo(androidx.lifecycle.q.f2171c) >= 0) {
                        x3Var.f15371b.e(new u0.b(-2000640158, new w3(x3Var, eVar, i10), true));
                    }
                }
                return q8.l.f13235a;
            case 24:
                f2.i iVar = ((f2.f) this.f14925c).f6107d;
                f2.t tVar = (f2.t) this.f14924b;
                iVar.getClass();
                f2.e eVar2 = tVar.f6127a;
                f2.n nVar = ((f2.f) this.f14925c).f6108e;
                f2.t tVar2 = (f2.t) this.f14924b;
                nVar.getClass();
                f2.e eVar3 = tVar2.f6127a;
                x9.v vVar = nVar.f6125a;
                int i11 = tVar2.f6129c;
                f2.l lVar = tVar2.f6128b;
                Object vVar2 = null;
                if (eVar3 != null && !(eVar3 instanceof f2.b)) {
                    if (eVar3 instanceof f2.m) {
                        f2.m mVar = (f2.m) eVar3;
                        switch (vVar.f16473a) {
                            case 0:
                                objM = x9.v.m(mVar.f6123d, lVar, i11);
                                break;
                            default:
                                String strJ = mVar.f6123d;
                                int i12 = lVar.f6122a / 100;
                                if (i12 >= 0 && i12 < 2) {
                                    strJ = l.q.j(strJ, "-thin");
                                } else if (2 <= i12 && i12 < 4) {
                                    strJ = l.q.j(strJ, "-light");
                                } else if (i12 != 4) {
                                    if (i12 == 5) {
                                        strJ = l.q.j(strJ, "-medium");
                                    } else if ((6 > i12 || i12 >= 8) && 8 <= i12 && i12 < 11) {
                                        strJ = l.q.j(strJ, "-black");
                                    }
                                }
                                if (strJ.length() != 0) {
                                    Typeface typefaceN = x9.v.n(strJ, lVar, i11);
                                    if (!d7.a.d(typefaceN, Typeface.create(Typeface.DEFAULT, o1.s.B(lVar, i11))) && !d7.a.d(typefaceN, x9.v.n(null, lVar, i11))) {
                                        vVar2 = typefaceN;
                                    }
                                }
                                if (vVar2 == null) {
                                    vVar2 = x9.v.n(mVar.f6123d, lVar, i11);
                                }
                                objM = vVar2;
                                break;
                        }
                    }
                    if (vVar2 != null) {
                        return vVar2;
                    }
                    throw new IllegalStateException("Could not load font");
                }
                switch (vVar.f16473a) {
                    case 0:
                        objM = x9.v.m(null, lVar, i11);
                        break;
                    default:
                        objM = x9.v.n(null, lVar, i11);
                        break;
                }
                vVar2 = new f2.v(objM, true);
                if (vVar2 != null) {
                    return vVar2;
                }
                throw new IllegalStateException("Could not load font");
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                f2.w wVar = (f2.w) obj;
                f2.u uVar2 = (f2.u) this.f14925c;
                a4.q qVar2 = uVar2.f6132a;
                f2.t tVar3 = (f2.t) this.f14924b;
                synchronized (qVar2) {
                    try {
                        f2.v vVar3 = (f2.v) wVar;
                        if (vVar3.f6135b) {
                            uVar2.f6133b.b(tVar3, vVar3);
                        } else {
                            uVar2.f6133b.c(tVar3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q8.l.f13235a;
            case 26:
                g2.i iVar2 = (g2.i) obj;
                String str = ((g2.i) this.f14925c) == iVar2 ? " > " : "   ";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                ((g2.j) this.f14924b).getClass();
                if (iVar2 instanceof g2.a) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    g2.a aVar = (g2.a) iVar2;
                    sb2.append(aVar.f6507a.f918a.length());
                    sb2.append(", newCursorPosition=");
                    strConcat = a7.a.o(sb2, aVar.f6508b, ')');
                } else if (iVar2 instanceof g2.y) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    g2.y yVar = (g2.y) iVar2;
                    sb3.append(yVar.f6608a.f918a.length());
                    sb3.append(", newCursorPosition=");
                    strConcat = a7.a.o(sb3, yVar.f6609b, ')');
                } else if ((iVar2 instanceof g2.x) || (iVar2 instanceof g2.g) || (iVar2 instanceof g2.h) || (iVar2 instanceof g2.z) || (iVar2 instanceof g2.l) || (iVar2 instanceof g2.f)) {
                    strConcat = iVar2.toString();
                } else {
                    String strB = d9.v.a(iVar2.getClass()).b();
                    if (strB == null) {
                        strB = "{anonymous EditCommand}";
                    }
                    strConcat = "Unknown EditCommand: ".concat(strB);
                }
                sb.append(strConcat);
                return sb.toString();
            case 27:
                return a((m0.o0) obj);
            case 28:
                d((Throwable) obj);
                return q8.l.f13235a;
        }
    }
}
