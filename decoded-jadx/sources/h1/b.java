package h1;

import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.firebase.remoteconfig.internal.Code;
import d9.j;
import e1.i0;
import e1.p;
import i1.c0;
import java.util.Map;
import m9.k;
import o1.h0;
import o7.i2;
import q8.l;
import r1.f0;
import r1.f1;
import r8.e;
import t1.c1;
import t1.f;
import t1.g;
import t1.n1;
import u.r0;
import u1.b2;
import u1.w;
import u1.w1;
import u9.i;
import y0.m;
import y1.t;
import y1.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7528b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(1);
        this.f7527a = i10;
        this.f7528b = obj;
    }

    public final void a(Throwable th) {
        int i10 = this.f7527a;
        Object obj = this.f7528b;
        switch (i10) {
            case 2:
                h0 h0Var = (h0) obj;
                k kVar = h0Var.f12377c;
                if (kVar != null) {
                    kVar.l(th);
                }
                h0Var.f12377c = null;
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                ((k) obj).resumeWith(l.f13235a);
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((i) obj).b();
                break;
            default:
                ((CancellationTokenSource) obj).cancel();
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        l lVar = l.f13235a;
        int i10 = this.f7527a;
        boolean z10 = false;
        Object obj2 = this.f7528b;
        switch (i10) {
            case 1:
                c0 c0Var = (c0) obj;
                i1.c cVar = (i1.c) obj2;
                cVar.g(c0Var);
                c9.c cVar2 = cVar.f7740i;
                if (cVar2 != null) {
                    cVar2.invoke(c0Var);
                }
                return lVar;
            case 2:
                a((Throwable) obj);
                return lVar;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                f1 f1Var = (f1) entry.getValue();
                f0 f0Var = (f0) obj2;
                int iJ = f0Var.f13371t.j(key);
                if (iJ < 0 || iJ >= f0Var.f13363e) {
                    f1Var.a();
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 4:
                t1.b bVar = (t1.b) obj;
                if (bVar.G()) {
                    if (bVar.d().f14369b) {
                        bVar.B();
                    }
                    t1.a aVar = (t1.a) obj2;
                    for (Map.Entry entry2 : bVar.d().f14376i.entrySet()) {
                        t1.a.a(aVar, (r1.a) entry2.getKey(), ((Number) entry2.getValue()).intValue(), bVar.l());
                    }
                    c1 c1Var = bVar.l().f14397r;
                    d7.a.j(c1Var);
                    while (!d7.a.d(c1Var, aVar.f14368a.l())) {
                        for (r1.a aVar2 : aVar.c(c1Var).keySet()) {
                            t1.a.a(aVar, aVar2, aVar.d(c1Var, aVar2), c1Var);
                        }
                        c1Var = c1Var.f14397r;
                        d7.a.j(c1Var);
                    }
                }
                return lVar;
            case 5:
                ((o0.i) obj2).c((m) obj);
                return Boolean.TRUE;
            case 6:
                p pVar = (p) obj;
                c1 c1Var2 = (c1) obj2;
                if (c1Var2.f14395p.D()) {
                    n1 snapshotObserver = ((w) g.z(c1Var2.f14395p)).getSnapshotObserver();
                    i0 i0Var = c1.I;
                    snapshotObserver.a(c1Var2, f.f14422p, new r0(14, c1Var2, pVar));
                    c1Var2.G = false;
                } else {
                    c1Var2.G = true;
                }
                return lVar;
            case 7:
                return new b.c((w1) obj2, 6);
            case 8:
                if (b2.f15032b.compareAndSet(false, true)) {
                    ((o9.g) obj2).n(lVar);
                }
                return lVar;
            case 9:
                t.d((v) obj, ((y1.g) obj2).f16757a);
                return lVar;
            case 10:
                f2.t tVar = (f2.t) obj;
                return ((f2.v) ((f2.f) obj2).a(new f2.t(null, tVar.f6128b, tVar.f6129c, tVar.f6130d, tVar.f6131e))).f6134a;
            case 11:
            default:
                a((Throwable) obj);
                return lVar;
            case 12:
                ((l4.j) obj2).f11309r = true;
                return lVar;
            case 13:
                ((MainViewModel) obj2).f3081b.f17209c.edit().putBoolean("ride_alert_enabled", ((Boolean) obj).booleanValue()).apply();
                return lVar;
            case Code.UNAVAILABLE /* 14 */:
                return obj == ((r8.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 15:
                Map.Entry entry3 = (Map.Entry) obj;
                d7.a.m(entry3, "it");
                e eVar = (e) obj2;
                eVar.getClass();
                StringBuilder sb = new StringBuilder();
                Object key2 = entry3.getKey();
                sb.append(key2 == eVar ? "(this Map)" : String.valueOf(key2));
                sb.append('=');
                Object value = entry3.getValue();
                sb.append(value != eVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case Code.UNAUTHENTICATED /* 16 */:
                i9.g gVar = (i9.g) obj;
                d7.a.m(gVar, "it");
                return l9.i.i1((CharSequence) obj2, gVar);
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                a((Throwable) obj);
                return lVar;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                a((Throwable) obj);
                return lVar;
        }
    }
}
