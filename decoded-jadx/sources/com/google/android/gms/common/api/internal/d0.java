package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements com.google.android.gms.common.api.j, com.google.android.gms.common.api.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.d f3174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.x f3176d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f3180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3181i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f3185m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f3173a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f3177e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3178f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3182j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z5.b f3183k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3184l = 0;

    public d0(f fVar, com.google.android.gms.common.api.i iVar) {
        this.f3185m = fVar;
        com.google.android.gms.common.api.d dVarZab = iVar.zab(fVar.f3205n.getLooper(), this);
        this.f3174b = dVarZab;
        this.f3175c = iVar.getApiKey();
        this.f3176d = new androidx.fragment.app.x();
        this.f3179g = iVar.zaa();
        if (!dVarZab.requiresSignIn()) {
            this.f3180h = null;
        } else {
            this.f3180h = iVar.zac(fVar.f3196e, fVar.f3205n);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        f fVar = this.f3185m;
        if (looperMyLooper == fVar.f3205n.getLooper()) {
            h(i10);
        } else {
            fVar.f3205n.post(new c0(this, i10, 0));
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void b(z5.b bVar) {
        p(bVar, null);
    }

    public final void c(z5.b bVar) {
        HashSet hashSet = this.f3177e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        a7.a.w(it.next());
        if (y3.e.g0(bVar, z5.b.f17239e)) {
            this.f3174b.getEndpointPackageName();
        }
        throw null;
    }

    public final void d(Status status) {
        f6.a.s(this.f3185m.f3205n);
        e(status, null, false);
    }

    public final void e(Status status, RuntimeException runtimeException, boolean z10) {
        f6.a.s(this.f3185m.f3205n);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f3173a.iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            if (!z10 || t0Var.f3252a == 2) {
                if (status != null) {
                    t0Var.a(status);
                } else {
                    t0Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        LinkedList linkedList = this.f3173a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            t0 t0Var = (t0) arrayList.get(i10);
            if (!this.f3174b.isConnected()) {
                return;
            }
            if (k(t0Var)) {
                linkedList.remove(t0Var);
            }
        }
    }

    public final void g() {
        f fVar = this.f3185m;
        f6.a.s(fVar.f3205n);
        this.f3183k = null;
        c(z5.b.f17239e);
        if (this.f3181i) {
            zaq zaqVar = fVar.f3205n;
            a aVar = this.f3175c;
            zaqVar.removeMessages(11, aVar);
            fVar.f3205n.removeMessages(9, aVar);
            this.f3181i = false;
        }
        Iterator it = this.f3178f.values().iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
        f();
        i();
    }

    public final void h(int i10) {
        f fVar = this.f3185m;
        f6.a.s(fVar.f3205n);
        this.f3183k = null;
        this.f3181i = true;
        String lastDisconnectMessage = this.f3174b.getLastDisconnectMessage();
        androidx.fragment.app.x xVar = this.f3176d;
        xVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        xVar.o(new Status(20, sb.toString()), true);
        zaq zaqVar = fVar.f3205n;
        a aVar = this.f3175c;
        zaqVar.sendMessageDelayed(Message.obtain(zaqVar, 9, aVar), 5000L);
        zaq zaqVar2 = fVar.f3205n;
        zaqVar2.sendMessageDelayed(Message.obtain(zaqVar2, 11, aVar), 120000L);
        ((SparseIntArray) fVar.f3198g.f10928b).clear();
        Iterator it = this.f3178f.values().iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
    }

    public final void i() {
        f fVar = this.f3185m;
        zaq zaqVar = fVar.f3205n;
        a aVar = this.f3175c;
        zaqVar.removeMessages(12, aVar);
        zaq zaqVar2 = fVar.f3205n;
        zaqVar2.sendMessageDelayed(zaqVar2.obtainMessage(12, aVar), fVar.f3192a);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void j() {
        Looper looperMyLooper = Looper.myLooper();
        f fVar = this.f3185m;
        if (looperMyLooper == fVar.f3205n.getLooper()) {
            g();
        } else {
            fVar.f3205n.post(new n0(this, 1));
        }
    }

    public final boolean k(t0 t0Var) {
        z5.d dVar;
        if (!(t0Var instanceof j0)) {
            com.google.android.gms.common.api.d dVar2 = this.f3174b;
            t0Var.d(this.f3176d, dVar2.requiresSignIn());
            try {
                t0Var.c(this);
            } catch (DeadObjectException unused) {
                a(1);
                dVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        j0 j0Var = (j0) t0Var;
        z5.d[] dVarArrG = j0Var.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
            break;
        }
        z5.d[] availableFeatures = this.f3174b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new z5.d[0];
        }
        q.f fVar = new q.f(availableFeatures.length);
        for (z5.d dVar3 : availableFeatures) {
            fVar.put(dVar3.f17247a, Long.valueOf(dVar3.e()));
        }
        int length = dVarArrG.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrG[i10];
            Long l10 = (Long) fVar.get(dVar.f17247a);
            if (l10 == null || l10.longValue() < dVar.e()) {
                break;
            }
            i10++;
        }
        if (dVar == null) {
            com.google.android.gms.common.api.d dVar4 = this.f3174b;
            t0Var.d(this.f3176d, dVar4.requiresSignIn());
            try {
                t0Var.c(this);
            } catch (DeadObjectException unused2) {
                a(1);
                dVar4.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f3174b.getClass().getName();
        String str = dVar.f17247a;
        long jE = dVar.e();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(jE);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f3185m.f3206o || !j0Var.f(this)) {
            j0Var.b(new com.google.android.gms.common.api.n(dVar));
            return true;
        }
        e0 e0Var = new e0(this.f3175c, dVar);
        int iIndexOf = this.f3182j.indexOf(e0Var);
        if (iIndexOf >= 0) {
            e0 e0Var2 = (e0) this.f3182j.get(iIndexOf);
            this.f3185m.f3205n.removeMessages(15, e0Var2);
            zaq zaqVar = this.f3185m.f3205n;
            Message messageObtain = Message.obtain(zaqVar, 15, e0Var2);
            this.f3185m.getClass();
            zaqVar.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.f3182j.add(e0Var);
            zaq zaqVar2 = this.f3185m.f3205n;
            Message messageObtain2 = Message.obtain(zaqVar2, 15, e0Var);
            this.f3185m.getClass();
            zaqVar2.sendMessageDelayed(messageObtain2, 5000L);
            zaq zaqVar3 = this.f3185m.f3205n;
            Message messageObtain3 = Message.obtain(zaqVar3, 16, e0Var);
            this.f3185m.getClass();
            zaqVar3.sendMessageDelayed(messageObtain3, 120000L);
            z5.b bVar = new z5.b(2, null);
            if (!l(bVar)) {
                this.f3185m.c(bVar, this.f3179g);
            }
        }
        return false;
    }

    public final boolean l(z5.b bVar) {
        synchronized (f.f3190r) {
            try {
                f fVar = this.f3185m;
                int i10 = 0;
                if (fVar.f3202k == null || !fVar.f3203l.contains(this.f3175c)) {
                    return false;
                }
                x xVar = this.f3185m.f3202k;
                int i11 = this.f3179g;
                xVar.getClass();
                u0 u0Var = new u0(bVar, i11);
                AtomicReference atomicReference = xVar.f3266b;
                while (!atomicReference.compareAndSet(null, u0Var)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                xVar.f3267c.post(new v0(i10, xVar, u0Var));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(boolean z10) {
        f6.a.s(this.f3185m.f3205n);
        com.google.android.gms.common.api.d dVar = this.f3174b;
        if (dVar.isConnected() && this.f3178f.size() == 0) {
            androidx.fragment.app.x xVar = this.f3176d;
            if (((Map) xVar.f2046a).isEmpty() && ((Map) xVar.f2047b).isEmpty()) {
                dVar.disconnect("Timing out service connection.");
                return true;
            }
            if (z10) {
                i();
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.d, m6.c] */
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
    public final void n() {
        f fVar = this.f3185m;
        f6.a.s(fVar.f3205n);
        com.google.android.gms.common.api.d dVar = this.f3174b;
        if (dVar.isConnected() || dVar.isConnecting()) {
            return;
        }
        try {
            int iH = fVar.f3198g.h(fVar.f3196e, dVar);
            if (iH != 0) {
                z5.b bVar = new z5.b(iH, null);
                String name = dVar.getClass().getName();
                String string = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                p(bVar, null);
                return;
            }
            f0 f0Var = new f0(fVar, dVar, this.f3175c);
            if (dVar.requiresSignIn()) {
                o0 o0Var = this.f3180h;
                f6.a.x(o0Var);
                m6.c cVar = o0Var.f3237f;
                if (cVar != null) {
                    cVar.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(o0Var));
                com.google.android.gms.common.internal.h hVar = o0Var.f3236e;
                hVar.f3306g = numValueOf;
                w5.b bVar2 = o0Var.f3234c;
                Context context = o0Var.f3232a;
                Handler handler = o0Var.f3233b;
                o0Var.f3237f = bVar2.buildClient(context, handler.getLooper(), hVar, (Object) hVar.f3305f, (com.google.android.gms.common.api.j) o0Var, (com.google.android.gms.common.api.k) o0Var);
                o0Var.f3238g = f0Var;
                Set set = o0Var.f3235d;
                if (set == null || set.isEmpty()) {
                    handler.post(new n0(o0Var, 0));
                } else {
                    o0Var.f3237f.b();
                }
            }
            try {
                dVar.connect(f0Var);
            } catch (SecurityException e4) {
                p(new z5.b(10), e4);
            }
        } catch (IllegalStateException e10) {
            p(new z5.b(10), e10);
        }
    }

    public final void o(t0 t0Var) {
        f6.a.s(this.f3185m.f3205n);
        boolean zIsConnected = this.f3174b.isConnected();
        LinkedList linkedList = this.f3173a;
        if (zIsConnected) {
            if (k(t0Var)) {
                i();
                return;
            } else {
                linkedList.add(t0Var);
                return;
            }
        }
        linkedList.add(t0Var);
        z5.b bVar = this.f3183k;
        if (bVar == null || bVar.f17241b == 0 || bVar.f17242c == null) {
            n();
        } else {
            p(bVar, null);
        }
    }

    public final void p(z5.b bVar, RuntimeException runtimeException) {
        m6.c cVar;
        f6.a.s(this.f3185m.f3205n);
        o0 o0Var = this.f3180h;
        if (o0Var != null && (cVar = o0Var.f3237f) != null) {
            cVar.disconnect();
        }
        f6.a.s(this.f3185m.f3205n);
        this.f3183k = null;
        ((SparseIntArray) this.f3185m.f3198g.f10928b).clear();
        c(bVar);
        if ((this.f3174b instanceof b6.c) && bVar.f17241b != 24) {
            f fVar = this.f3185m;
            fVar.f3193b = true;
            zaq zaqVar = fVar.f3205n;
            zaqVar.sendMessageDelayed(zaqVar.obtainMessage(19), 300000L);
        }
        if (bVar.f17241b == 4) {
            d(f.f3189q);
            return;
        }
        if (this.f3173a.isEmpty()) {
            this.f3183k = bVar;
            return;
        }
        if (runtimeException != null) {
            f6.a.s(this.f3185m.f3205n);
            e(null, runtimeException, false);
            return;
        }
        if (!this.f3185m.f3206o) {
            d(f.d(this.f3175c, bVar));
            return;
        }
        e(f.d(this.f3175c, bVar), null, true);
        if (this.f3173a.isEmpty() || l(bVar) || this.f3185m.c(bVar, this.f3179g)) {
            return;
        }
        if (bVar.f17241b == 18) {
            this.f3181i = true;
        }
        if (!this.f3181i) {
            d(f.d(this.f3175c, bVar));
            return;
        }
        zaq zaqVar2 = this.f3185m.f3205n;
        Message messageObtain = Message.obtain(zaqVar2, 9, this.f3175c);
        this.f3185m.getClass();
        zaqVar2.sendMessageDelayed(messageObtain, 5000L);
    }

    public final void q() {
        f6.a.s(this.f3185m.f3205n);
        Status status = f.f3188p;
        d(status);
        androidx.fragment.app.x xVar = this.f3176d;
        xVar.getClass();
        xVar.o(status, false);
        for (k kVar : (k[]) this.f3178f.keySet().toArray(new k[0])) {
            o(new r0(new TaskCompletionSource()));
        }
        c(new z5.b(4));
        com.google.android.gms.common.api.d dVar = this.f3174b;
        if (dVar.isConnected()) {
            dVar.onUserSignOut(new z(this));
        }
    }
}
