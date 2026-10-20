package z6;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d9.u;
import e1.n0;
import e1.r;
import e8.a1;
import e8.e1;
import e8.t1;
import e8.v0;
import e9.b;
import f5.f0;
import g8.j4;
import i1.e;
import i1.f;
import i1.h0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import l.q;
import m9.a2;
import m9.b1;
import m9.d0;
import m9.d2;
import m9.e0;
import m9.e2;
import m9.f1;
import m9.g2;
import m9.h2;
import m9.i0;
import m9.j1;
import m9.k0;
import m9.l0;
import m9.m0;
import m9.o0;
import m9.p0;
import m9.p1;
import m9.q1;
import m9.r1;
import m9.w;
import m9.w0;
import m9.x1;
import n9.d;
import o9.g;
import o9.o;
import q8.c;
import q8.m;
import r6.j0;
import r6.v;
import r6.y;
import r8.p;
import r9.s;
import r9.t;
import u8.h;
import u8.i;
import u8.j;
import u8.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f17300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f17301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f17302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f17303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f17304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f17305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f17306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static f f17307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static f f17308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static f f17309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static f f17310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static f f17311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static f f17312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f f17313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f f17314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static f f17315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f17316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f17317r = 0;

    public static final boolean A(int i10, int i11) {
        return i10 == i11;
    }

    public static final byte[] A0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return z0(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final boolean B(int i10, int i11) {
        return i10 == i11;
    }

    public static final j C(j jVar, j jVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        w wVar = w.f12014c;
        boolean zBooleanValue = ((Boolean) jVar.e(bool, wVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) jVar2.e(bool, wVar)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return jVar.O(jVar2);
        }
        u uVar = new u();
        uVar.f4952a = jVar2;
        k kVar = k.f15438a;
        j jVar3 = (j) jVar.e(kVar, new f0(3, uVar, z10));
        if (zBooleanValue2) {
            uVar.f4952a = ((j) uVar.f4952a).e(kVar, w.f12013b);
        }
        return jVar3.O((j) uVar.f4952a);
    }

    public static h D(h hVar, i iVar) {
        d7.a.m(iVar, "key");
        if (d7.a.d(hVar.getKey(), iVar)) {
            return hVar;
        }
        return null;
    }

    public static final f E() {
        f fVar = f17300a;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.AlternateEmail", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = t.k.c(7, 12.0f, 2.0f);
        fVarC.u(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVarC.H(4.48f, 10.0f, 10.0f, 10.0f);
        fVarC.A(5.0f);
        fVarC.K(-2.0f);
        fVarC.A(-5.0f);
        fVarC.v(-4.34f, 0.0f, -8.0f, -3.66f, -8.0f, -8.0f);
        fVarC.H(3.66f, -8.0f, 8.0f, -8.0f);
        fVarC.H(8.0f, 3.66f, 8.0f, 8.0f);
        fVarC.K(1.43f);
        fVarC.v(0.0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f);
        fVarC.H(-1.5f, -0.78f, -1.5f, -1.57f);
        fVarC.B(17.0f, 12.0f);
        fVarC.v(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        fVarC.H(-5.0f, 2.24f, -5.0f, 5.0f);
        fVarC.H(2.24f, 5.0f, 5.0f, 5.0f);
        fVarC.v(1.38f, 0.0f, 2.64f, -0.56f, 3.54f, -1.47f);
        fVarC.v(0.65f, 0.89f, 1.77f, 1.47f, 2.96f, 1.47f);
        fVarC.v(1.97f, 0.0f, 3.5f, -1.6f, 3.5f, -3.57f);
        fVarC.B(22.0f, 12.0f);
        fVarC.v(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        fVarC.p();
        fVarC.D(12.0f, 15.0f);
        fVarC.v(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        fVarC.H(1.34f, -3.0f, 3.0f, -3.0f);
        fVarC.H(3.0f, 1.34f, 3.0f, 3.0f);
        fVarC.H(-1.34f, 3.0f, -3.0f, 3.0f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f17300a = fVarB;
        return fVarB;
    }

    public static void F(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
    }

    public static final f G() {
        f fVar = f17307h;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(7.41f, 8.59f);
        fVar2.B(12.0f, 13.17f);
        fVar2.C(4.59f, -4.58f);
        fVar2.B(18.0f, 10.0f);
        fVar2.C(-6.0f, 6.0f);
        fVar2.C(-6.0f, -6.0f);
        fVar2.C(1.41f, -1.41f);
        fVar2.p();
        e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        f fVarB = eVar.b();
        f17307h = fVarB;
        return fVarB;
    }

    public static final f H() {
        f fVar = f17308i;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(18.0f, 8.0f);
        fVar2.A(-1.0f);
        fVar2.B(17.0f, 6.0f);
        fVar2.v(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        fVar2.G(7.0f, 3.24f, 7.0f, 6.0f);
        fVar2.K(2.0f);
        fVar2.B(6.0f, 8.0f);
        fVar2.v(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar2.K(10.0f);
        fVar2.v(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        fVar2.A(12.0f);
        fVar2.v(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar2.B(20.0f, 10.0f);
        fVar2.v(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        fVar2.p();
        fVar2.D(12.0f, 17.0f);
        fVar2.v(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        fVar2.H(0.9f, -2.0f, 2.0f, -2.0f);
        fVar2.H(2.0f, 0.9f, 2.0f, 2.0f);
        fVar2.H(-0.9f, 2.0f, -2.0f, 2.0f);
        fVar2.p();
        fVar2.D(15.1f, 8.0f);
        fVar2.B(8.9f, 8.0f);
        fVar2.B(8.9f, 6.0f);
        fVar2.v(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        fVar2.v(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        fVar2.K(2.0f);
        fVar2.p();
        e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        f fVarB = eVar.b();
        f17308i = fVarB;
        return fVarB;
    }

    public static final f I() {
        f fVar = f17309j;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.MenuBook", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        long j10 = r.f5060b;
        n0 n0Var = new n0(j10);
        k.f fVarC = t.k.c(7, 21.0f, 5.0f);
        fVarC.v(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f);
        fVarC.v(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        fVarC.v(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        fVarC.G(2.45f, 4.9f, 1.0f, 6.0f);
        fVarC.K(14.65f);
        fVarC.v(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
        fVarC.v(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f);
        fVarC.u(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        fVarC.v(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
        fVarC.v(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        fVarC.v(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
        fVarC.v(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
        fVarC.v(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f);
        fVarC.J(6.0f);
        fVarC.u(22.4f, 5.55f, 21.75f, 5.25f, 21.0f, 5.0f);
        fVarC.p();
        fVarC.D(21.0f, 18.5f);
        fVarC.v(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        fVarC.v(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        fVarC.J(8.0f);
        fVarC.v(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        fVarC.v(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
        fVarC.J(18.5f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        n0 n0Var2 = new n0(j10);
        k.f fVarC2 = t.k.c(7, 17.5f, 10.5f);
        fVarC2.v(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        fVarC2.J(9.24f);
        fVarC2.u(19.21f, 9.09f, 18.36f, 9.0f, 17.5f, 9.0f);
        fVarC2.v(-1.7f, 0.0f, -3.24f, 0.29f, -4.5f, 0.83f);
        fVarC2.K(1.66f);
        fVarC2.u(14.13f, 10.85f, 15.7f, 10.5f, 17.5f, 10.5f);
        fVarC2.p();
        e.a(eVar, (ArrayList) fVarC2.f8599b, n0Var2);
        n0 n0Var3 = new n0(j10);
        k.f fVar2 = new k.f(7);
        fVar2.D(13.0f, 12.49f);
        fVar2.K(1.66f);
        fVar2.v(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f);
        fVar2.v(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        fVar2.J(11.9f);
        fVar2.v(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f);
        fVar2.u(15.8f, 11.66f, 14.26f, 11.96f, 13.0f, 12.49f);
        fVar2.p();
        e.a(eVar, (ArrayList) fVar2.f8599b, n0Var3);
        n0 n0Var4 = new n0(j10);
        k.f fVarC3 = t.k.c(7, 17.5f, 14.33f);
        fVarC3.v(-1.7f, 0.0f, -3.24f, 0.29f, -4.5f, 0.83f);
        fVarC3.K(1.66f);
        fVarC3.v(1.13f, -0.64f, 2.7f, -0.99f, 4.5f, -0.99f);
        fVarC3.v(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        fVarC3.K(-1.52f);
        fVarC3.u(19.21f, 14.41f, 18.36f, 14.33f, 17.5f, 14.33f);
        fVarC3.p();
        e.a(eVar, (ArrayList) fVarC3.f8599b, n0Var4);
        f fVarB = eVar.b();
        f17309j = fVarB;
        return fVarB;
    }

    public static final t J(Object obj) {
        if (obj != r9.a.f13689b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final f K() {
        f fVar = f17313n;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.SystemUpdateAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(12.0f, 16.5f);
        fVar2.C(4.0f, -4.0f);
        fVar2.A(-3.0f);
        fVar2.K(-9.0f);
        fVar2.A(-2.0f);
        fVar2.K(9.0f);
        fVar2.B(8.0f, 12.5f);
        fVar2.C(4.0f, 4.0f);
        fVar2.p();
        fVar2.D(21.0f, 3.5f);
        fVar2.A(-6.0f);
        fVar2.K(1.99f);
        fVar2.A(6.0f);
        fVar2.K(14.03f);
        fVar2.B(3.0f, 19.52f);
        fVar2.B(3.0f, 5.49f);
        fVar2.A(6.0f);
        fVar2.B(9.0f, 3.5f);
        fVar2.B(3.0f, 3.5f);
        fVar2.v(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar2.K(14.0f);
        fVar2.v(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        fVar2.A(18.0f);
        fVar2.v(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar2.K(-14.0f);
        fVar2.v(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        fVar2.p();
        e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        f fVarB = eVar.b();
        f17313n = fVarB;
        return fVarB;
    }

    public static final f L() {
        f fVar = f17314o;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f7832a;
        n0 n0Var = new n0(r.f5060b);
        k.f fVarC = t.k.c(7, 12.0f, 4.5f);
        fVarC.u(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
        fVarC.v(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        fVarC.H(9.27f, -3.11f, 11.0f, -7.5f);
        fVarC.v(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        fVarC.p();
        fVarC.D(12.0f, 17.0f);
        fVarC.v(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        fVarC.H(2.24f, -5.0f, 5.0f, -5.0f);
        fVarC.H(5.0f, 2.24f, 5.0f, 5.0f);
        fVarC.H(-2.24f, 5.0f, -5.0f, 5.0f);
        fVarC.p();
        fVarC.D(12.0f, 9.0f);
        fVarC.v(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        fVarC.H(1.34f, 3.0f, 3.0f, 3.0f);
        fVarC.H(3.0f, -1.34f, 3.0f, -3.0f);
        fVarC.H(-1.34f, -3.0f, -3.0f, -3.0f);
        fVarC.p();
        e.a(eVar, (ArrayList) fVarC.f8599b, n0Var);
        f fVarB = eVar.b();
        f17314o = fVarB;
        return fVarB;
    }

    public static boolean M(Iterable iterable, Comparator comparator) {
        Object objComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = y.f13589a;
            }
        } else {
            if (!(iterable instanceof j0)) {
                return false;
            }
            objComparator = ((v) ((j0) iterable)).f13585d;
        }
        return comparator.equals(objComparator);
    }

    public static /* synthetic */ o0 N(f1 f1Var, boolean z10, j1 j1Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return ((p1) f1Var).U(z10, (i10 & 2) != 0, j1Var);
    }

    public static final boolean O(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean P(Object obj) {
        return obj == r9.a.f13689b;
    }

    public static x1 Q(d0 d0Var, d dVar, int i10, c9.e eVar, int i11) {
        j jVar = dVar;
        if ((i11 & 1) != 0) {
            jVar = k.f15438a;
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        j jVarW = W(d0Var, jVar);
        x1 r1Var = i10 == 2 ? new r1(jVarW, eVar) : new x1(jVarW, true);
        r1Var.k0(i10, r1Var, eVar);
        return r1Var;
    }

    public static c R(c9.a aVar) {
        q8.d[] dVarArr = q8.d.f13224a;
        q8.k kVar = q8.k.f13234a;
        m mVar = new m();
        mVar.f13236a = aVar;
        mVar.f13237b = kVar;
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public static List S(Class cls, List list, ClassLoader classLoader, r7.e eVar) {
        ?? Load;
        boolean zH;
        Object objNewInstance;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused) {
                    objNewInstance = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            switch (eVar.f13598a) {
                case 10:
                    zH = ((a1) obj).h();
                    break;
                case 11:
                    zH = ((e1) obj).b();
                    break;
                default:
                    zH = ((t1) obj).P();
                    break;
            }
            if (zH) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new u1.n0(eVar, 2)));
        return Collections.unmodifiableList(arrayList);
    }

    public static int T(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static int U(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static j V(h hVar, i iVar) {
        d7.a.m(iVar, "key");
        return d7.a.d(hVar.getKey(), iVar) ? k.f15438a : hVar;
    }

    public static final j W(d0 d0Var, j jVar) {
        j jVarC = C(d0Var.q(), jVar, true);
        t9.d dVar = m0.f11969a;
        return (jVarC == dVar || jVarC.f(u8.f.f15436a) != null) ? jVarC : jVarC.O(dVar);
    }

    public static final boolean X(String str) {
        d7.a.m(str, FirebaseAnalytics.Param.METHOD);
        return (d7.a.d(str, "GET") || d7.a.d(str, "HEAD")) ? false : true;
    }

    public static final Object Z(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static o9.c a(int i10, o9.a aVar, int i11) {
        o9.c oVar;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        int i12 = i11 & 2;
        o9.a aVar2 = o9.a.f12668a;
        if (i12 != 0) {
            aVar = aVar2;
        }
        if (i10 != -2) {
            if (i10 == -1) {
                if (aVar == aVar2) {
                    return new o(1, o9.a.f12669b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    return aVar == aVar2 ? new o9.c(i10, null) : new o(i10, aVar, null);
                }
                return new o9.c(Integer.MAX_VALUE, null);
            }
            oVar = aVar == aVar2 ? new o9.c(0, null) : new o(1, aVar, null);
        } else if (aVar == aVar2) {
            g.f12708j.getClass();
            oVar = new o9.c(o9.f.f12707b, null);
        } else {
            oVar = new o(1, aVar, null);
        }
        return oVar;
    }

    public static final String a0(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        d7.a.l(string, "toString(...)");
        return string;
    }

    public static void b(StringBuilder sb, Object obj, c9.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int b0(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iI0 = i0(obj);
        int i11 = iI0 & i10;
        int iK0 = k0(i11, obj3);
        if (iK0 == 0) {
            return -1;
        }
        int i12 = ~i10;
        int i13 = iI0 & i12;
        int i14 = -1;
        while (true) {
            int i15 = iK0 - 1;
            int i16 = iArr[i15];
            if ((i16 & i12) == i13 && y3.e.f0(obj, objArr[i15]) && (objArr2 == null || y3.e.f0(obj2, objArr2[i15]))) {
                int i17 = i16 & i10;
                if (i14 == -1) {
                    l0(obj3, i11, i17);
                } else {
                    iArr[i14] = U(iArr[i14], i17, i10);
                }
                return i15;
            }
            int i18 = i16 & i10;
            if (i18 == 0) {
                return -1;
            }
            i14 = i15;
            iK0 = i18;
        }
    }

    public static Collection c(Collection collection) {
        if ((collection instanceof e9.a) && !(collection instanceof b)) {
            m0(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e4) {
            d7.a.B(a.class.getName(), e4);
            throw e4;
        }
    }

    public static final void c0(l0 l0Var, u8.e eVar, boolean z10) {
        Object objI = l0Var.i();
        Throwable thF = l0Var.f(objI);
        Object objN = thF != null ? d7.t.N(thF) : l0Var.g(objI);
        if (!z10) {
            eVar.resumeWith(objN);
            return;
        }
        d7.a.k(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        r9.h hVar = (r9.h) eVar;
        u8.e eVar2 = hVar.f13703e;
        j context = eVar2.getContext();
        Object objT = r9.a.t(context, hVar.f13705n);
        g2 g2VarT0 = objT != r9.a.f13693f ? t0(eVar2, context, objT) : null;
        try {
            eVar2.resumeWith(objN);
        } finally {
            if (g2VarT0 == null || g2VarT0.l0()) {
                r9.a.k(context, objT);
            }
        }
    }

    public static Map d(AbstractMap abstractMap) {
        if (!(abstractMap instanceof e9.a) || (abstractMap instanceof e9.d)) {
            return abstractMap;
        }
        m0(abstractMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static final Object d0(j jVar, c9.e eVar) throws Throwable {
        w0 w0VarA;
        j jVarC;
        Thread threadCurrentThread = Thread.currentThread();
        i iVar = u8.f.f15436a;
        u8.g gVar = (u8.g) jVar.f(iVar);
        k kVar = k.f15438a;
        if (gVar == null) {
            w0VarA = a2.a();
            jVarC = C(kVar, jVar.O(w0VarA), true);
            t9.d dVar = m0.f11969a;
            if (jVarC != dVar && jVarC.f(iVar) == null) {
                jVarC = jVarC.O(dVar);
            }
        } else {
            if (gVar instanceof w0) {
            }
            w0VarA = (w0) a2.f11904a.get();
            jVarC = C(kVar, jVar, true);
            t9.d dVar2 = m0.f11969a;
            if (jVarC != dVar2 && jVarC.f(iVar) == null) {
                jVarC = jVarC.O(dVar2);
            }
        }
        m9.g gVar2 = new m9.g(jVarC, threadCurrentThread, w0VarA);
        gVar2.k0(1, gVar2, eVar);
        w0 w0Var = gVar2.f11945e;
        if (w0Var != null) {
            int i10 = w0.f12016f;
            w0Var.i0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jK0 = w0Var != null ? w0Var.k0() : Long.MAX_VALUE;
                if (!(gVar2.N() instanceof b1)) {
                    if (w0Var != null) {
                        int i11 = w0.f12016f;
                        w0Var.f0(false);
                    }
                    Object objN = e0.N(gVar2.N());
                    m9.u uVar = objN instanceof m9.u ? (m9.u) objN : null;
                    if (uVar == null) {
                        return objN;
                    }
                    throw uVar.f12005a;
                }
                LockSupport.parkNanos(gVar2, jK0);
            } catch (Throwable th) {
                if (w0Var != null) {
                    int i12 = w0.f12016f;
                    w0Var.f0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        gVar2.z(interruptedException);
        throw interruptedException;
    }

    public static i0 e(d0 d0Var, d dVar, c9.e eVar, int i10) {
        j jVar = dVar;
        if ((i10 & 1) != 0) {
            jVar = k.f15438a;
        }
        int i11 = (i10 & 2) != 0 ? 1 : 0;
        j jVarW = W(d0Var, jVar);
        i0 q1Var = i11 == 2 ? new q1(jVarW, eVar) : new i0(jVarW, true);
        q1Var.k0(i11, q1Var, eVar);
        return q1Var;
    }

    public static void e0(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            d3.a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            d3.a.a(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i13 < 0 || i11 > length) {
            f0(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            f0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            f0(editorInfo, charSequence, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i11, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        f0(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public static void f(int i10, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof q8.a) {
                if (obj instanceof d9.g) {
                    arity = ((d9.g) obj).getArity();
                } else if (obj instanceof c9.a) {
                    arity = 0;
                } else if (obj instanceof c9.c) {
                    arity = 1;
                } else if (obj instanceof c9.e) {
                    arity = 2;
                } else if (obj instanceof c9.f) {
                    arity = 3;
                } else if (obj instanceof c9.g) {
                    arity = 4;
                } else {
                    boolean z10 = obj instanceof u0.a;
                    if (z10) {
                        arity = 5;
                    } else if (z10) {
                        arity = 6;
                    } else if (obj instanceof c9.h) {
                        arity = 7;
                    } else if (z10) {
                        arity = 8;
                    } else if (z10) {
                        arity = 9;
                    } else if (z10) {
                        arity = 10;
                    } else if (z10) {
                        arity = 11;
                    } else if (z10) {
                        arity = 13;
                    } else if (z10) {
                        arity = 14;
                    } else if (z10) {
                        arity = 15;
                    } else if (z10) {
                        arity = 16;
                    } else if (z10) {
                        arity = 17;
                    } else if (z10) {
                        arity = 18;
                    } else if (z10) {
                        arity = 19;
                    } else if (z10) {
                        arity = 20;
                    } else {
                        arity = z10 ? 21 : -1;
                    }
                }
                if (arity == i10) {
                    return;
                }
            }
            m0(obj, "kotlin.jvm.functions.Function" + i10);
            throw null;
        }
    }

    public static void f0(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    public static void g(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static final Object g0(e2 e2Var, c9.e eVar) throws Throwable {
        Object uVar;
        Object objY;
        e2Var.U(false, true, new p0(d7.t.W(e2Var.f13726d.getContext()).Q(e2Var.f11936e, e2Var, e2Var.f11900c), 0));
        try {
            f(2, eVar);
            uVar = eVar.invoke(e2Var, e2Var);
        } catch (Throwable th) {
            uVar = new m9.u(th, false);
        }
        v8.a aVar = v8.a.f15963a;
        if (uVar == aVar || (objY = e2Var.Y(uVar)) == e0.f11928e) {
            return aVar;
        }
        if (objY instanceof m9.u) {
            Throwable th2 = ((m9.u) objY).f12005a;
            if (!(th2 instanceof d2) || ((d2) th2).f11921a != e2Var) {
                throw th2;
            }
            if (uVar instanceof m9.u) {
                throw ((m9.u) uVar).f12005a;
            }
        } else {
            uVar = e0.N(objY);
        }
        return uVar;
    }

    public static final void h(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
        }
    }

    public static int h0(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static void i(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(q.g("at index ", i11));
            }
        }
    }

    public static int i0(Object obj) {
        return h0(obj == null ? 0 : obj.hashCode());
    }

    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static i9.e j0(i9.g gVar, int i10) {
        d7.a.m(gVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        d7.a.m(numValueOf, "step");
        if (z10) {
            if (gVar.f8185c <= 0) {
                i10 = -i10;
            }
            return new i9.e(gVar.f8183a, gVar.f8184b, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final void k(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", i11));
        }
    }

    public static int k0(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static final void l(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(q.i("fromIndex: ", i10, " > toIndex: ", i11));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static void l0(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static float m(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static void m0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(a7.a.n(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        d7.a.B(a.class.getName(), classCastException);
        throw classCastException;
    }

    public static long n(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10;
    }

    public static final q8.f n0(Object obj, Serializable serializable) {
        return new q8.f(obj, serializable);
    }

    public static float o(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final Map o0(Map map) {
        d7.a.m(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        d7.a.l(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static double p(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static String p0(int i10) {
        if (z(i10, 0)) {
            return "None";
        }
        if (z(i10, 1)) {
            return "Characters";
        }
        if (z(i10, 2)) {
            return "Words";
        }
        return z(i10, 3) ? "Sentences" : "Invalid";
    }

    public static float q(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static String q0(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        d7.a.m(str, "<this>");
        List listU0 = l9.i.U0(str);
        List list = listU0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!l9.i.R0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(f9.a.y0(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!d7.a.y(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listU0.size();
        int iY = d7.t.Y(listU0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i10 = length + 1;
            if (length < 0) {
                d7.t.u0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iY) && l9.i.R0(str3)) {
                strSubstring = null;
            } else {
                d7.a.m(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(q.h("Requested character count ", iIntValue, " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                d7.a.l(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i10;
        }
        StringBuilder sb = new StringBuilder(length3);
        p.I0(arrayList3, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        String string = sb.toString();
        d7.a.l(string, "toString(...)");
        return string;
    }

    public static int r(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static String r0(String str) {
        d7.a.m(str, "<this>");
        if (!(!l9.i.R0("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listU0 = l9.i.U0(str);
        int length = str.length();
        listU0.size();
        int iY = d7.t.Y(listU0);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU0.iterator();
        int i10 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                p.I0(arrayList, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
                String string = sb.toString();
                d7.a.l(string, "toString(...)");
                return string;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                d7.t.u0();
                throw null;
            }
            String str2 = (String) next;
            if ((i10 != 0 && i10 != iY) || !l9.i.R0(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!d7.a.y(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && l9.i.g1(i12, str2, "|", false)) {
                    strSubstring = str2.substring(i12 + 1);
                    d7.a.l(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
    }

    public static long s(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static i9.g s0(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new i9.g(i10, i11 - 1, 1);
        }
        i9.g gVar = i9.g.f8190d;
        return i9.g.f8190d;
    }

    public static Comparable t(Float f10, i9.d dVar) {
        d7.a.m(f10, "<this>");
        if (dVar.a()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
        }
        float f11 = dVar.f8181a;
        if (i9.d.b(f10, Float.valueOf(f11)) && !i9.d.b(Float.valueOf(f11), f10)) {
            return Float.valueOf(f11);
        }
        float f12 = dVar.f8182b;
        return (!i9.d.b(Float.valueOf(f12), f10) || i9.d.b(f10, Float.valueOf(f12))) ? f10 : Float.valueOf(f12);
    }

    public static final g2 t0(u8.e eVar, j jVar, Object obj) {
        g2 g2Var = null;
        if (!(eVar instanceof w8.d)) {
            return null;
        }
        if (jVar.f(h2.f11950a) != null) {
            w8.d callerFrame = (w8.d) eVar;
            while (!(callerFrame instanceof k0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof g2) {
                    g2Var = (g2) callerFrame;
                    break;
                }
            }
            if (g2Var != null) {
                g2Var.m0(jVar, obj);
            }
        }
        return g2Var;
    }

    public static byte[] u(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final Object u0(j jVar, c9.e eVar, u8.e eVar2) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objN;
        j context = eVar2.getContext();
        j jVarO = !((Boolean) jVar.e(Boolean.FALSE, w.f12014c)).booleanValue() ? context.O(jVar) : C(context, jVar, false);
        h6.g.S(jVarO);
        if (jVarO == context) {
            s sVar = new s(eVar2, jVarO);
            objN = o7.d0.i0(sVar, sVar, eVar);
        } else {
            u8.f fVar = u8.f.f15436a;
            if (d7.a.d(jVarO.f(fVar), context.f(fVar))) {
                g2 g2Var = new g2(eVar2, jVarO);
                j jVar2 = g2Var.f11900c;
                Object objT = r9.a.t(jVar2, null);
                try {
                    Object objI0 = o7.d0.i0(g2Var, g2Var, eVar);
                    r9.a.k(jVar2, objT);
                    objN = objI0;
                } catch (Throwable th) {
                    r9.a.k(jVar2, objT);
                    throw th;
                }
            } else {
                k0 k0Var = new k0(eVar2, jVarO);
                h6.g.v0(eVar, k0Var, k0Var);
                do {
                    atomicIntegerFieldUpdater = k0.f11956e;
                    int i10 = atomicIntegerFieldUpdater.get(k0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                        objN = e0.N(k0Var.N());
                        if (objN instanceof m9.u) {
                            throw ((m9.u) objN).f12005a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(k0Var, 0, 1));
                objN = v8.a.f15963a;
            }
        }
        v8.a aVar = v8.a.f15963a;
        return objN;
    }

    public static void v(FileInputStream fileInputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = fileInputStream.read(bArr);
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            i10 = fileInputStream.read(bArr);
        }
    }

    public static final Object v0(j jVar, Object obj, Object obj2, c9.e eVar, u8.e eVar2) {
        Object objT = r9.a.t(jVar, obj2);
        try {
            q9.y yVar = new q9.y(eVar2, jVar);
            f(2, eVar);
            Object objInvoke = eVar.invoke(obj, yVar);
            r9.a.k(jVar, objT);
            if (objInvoke == v8.a.f15963a) {
                d7.a.m(eVar2, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            r9.a.k(jVar, objT);
            throw th;
        }
    }

    public static Object w(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(q.g("must be power of 2 between 2^1 and 2^30: ", i10));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static final Object w0(long j10, c9.e eVar, w8.c cVar) throws Throwable {
        if (j10 <= 0) {
            throw new d2("Timed out immediately", null);
        }
        Object objG0 = g0(new e2(j10, cVar), eVar);
        v8.a aVar = v8.a.f15963a;
        return objG0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:20:0x0046, B:23:0x004d), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object x(p9.g r6, o9.q r7, boolean r8, u8.e r9) {
        /*
            boolean r0 = r9 instanceof p9.h
            if (r0 == 0) goto L13
            r0 = r9
            p9.h r0 = (p9.h) r0
            int r1 = r0.f12901f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12901f = r1
            goto L18
        L13:
            p9.h r0 = new p9.h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f12900e
            v8.a r1 = v8.a.f15963a
            int r2 = r0.f12901f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f12899d
            o9.b r6 = r0.f12898c
            o9.s r7 = r0.f12897b
            p9.g r2 = r0.f12896a
            d7.t.v0(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L53
        L34:
            r6 = move-exception
            goto L8e
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f12899d
            o9.b r6 = r0.f12898c
            o9.s r7 = r0.f12897b
            p9.g r2 = r0.f12896a
            d7.t.v0(r9)     // Catch: java.lang.Throwable -> L34
            goto L68
        L4a:
            d7.t.v0(r9)
            o9.g r9 = r7.f12722d     // Catch: java.lang.Throwable -> L34
            o9.b r9 = r9.iterator()     // Catch: java.lang.Throwable -> L34
        L53:
            r0.f12896a = r6     // Catch: java.lang.Throwable -> L34
            r0.f12897b = r7     // Catch: java.lang.Throwable -> L34
            r0.f12898c = r9     // Catch: java.lang.Throwable -> L34
            r0.f12899d = r8     // Catch: java.lang.Throwable -> L34
            r0.f12901f = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L64
            return r1
        L64:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L85
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f12896a = r2     // Catch: java.lang.Throwable -> L34
            r0.f12897b = r7     // Catch: java.lang.Throwable -> L34
            r0.f12898c = r6     // Catch: java.lang.Throwable -> L34
            r0.f12899d = r8     // Catch: java.lang.Throwable -> L34
            r0.f12901f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
            return r1
        L85:
            if (r8 == 0) goto L8b
            r6 = 0
            h6.g.c(r7, r6)
        L8b:
            q8.l r6 = q8.l.f13235a
            return r6
        L8e:
            throw r6     // Catch: java.lang.Throwable -> L8f
        L8f:
            r9 = move-exception
            if (r8 == 0) goto L95
            h6.g.c(r7, r6)
        L95:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.a.x(p9.g, o9.q, boolean, u8.e):java.lang.Object");
    }

    public static void x0(p7.p pVar, v7.b bVar) {
        com.google.gson.internal.bind.p.f4043z.c(bVar, pVar);
    }

    public static final x8.b y(Enum[] enumArr) {
        d7.a.m(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        return new x8.b(enumArr);
    }

    public static final void y0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean z(int i10, int i11) {
        return i10 == i11;
    }

    public static final byte[] z0(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    public abstract v0 Y(j4 j4Var);
}
