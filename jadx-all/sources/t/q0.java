package t;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.auto.accept.data.model.SupportedApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.m2;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Number number, k0 k0Var, Number number2, j0 j0Var) {
        super(0);
        this.f14281a = 0;
        this.f14282b = number;
        this.f14284d = k0Var;
        this.f14283c = number2;
        this.f14285e = j0Var;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14281a) {
            case 0:
                m8210invoke();
                break;
            case 1:
                m8210invoke();
                break;
            case 2:
                m8210invoke();
                break;
            default:
                m8210invoke();
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f14281a = i10;
        this.f14282b = obj;
        this.f14283c = obj2;
        this.f14284d = obj3;
        this.f14285e = obj4;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8210invoke() {
        Object next;
        int i10 = this.f14281a;
        Object obj = this.f14284d;
        Object obj2 = this.f14285e;
        Object obj3 = this.f14283c;
        Object obj4 = this.f14282b;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj;
                if (d7.a.d(obj4, k0Var.f14217a) && d7.a.d(obj3, k0Var.f14218b)) {
                    return;
                }
                Object obj5 = this.f14282b;
                Object obj6 = this.f14283c;
                k0Var.f14217a = obj5;
                k0Var.f14218b = obj6;
                k0Var.f14221e = new l1((j0) obj2, k0Var.f14219c, obj5, obj6, null);
                k0Var.f14225p.f14274b.setValue(Boolean.TRUE);
                k0Var.f14222f = false;
                k0Var.f14223n = true;
                return;
            case 1:
                m0.q qVar = (m0.q) obj4;
                n0.b bVar = qVar.L;
                n0.a aVar = (n0.a) obj3;
                m2 m2Var = (m2) obj;
                m0.c1 c1Var = (m0.c1) obj2;
                n0.a aVar2 = bVar.f12045b;
                try {
                    bVar.f12045b = aVar;
                    m2 m2Var2 = qVar.F;
                    int[] iArr = qVar.f11643n;
                    o0.e eVar = qVar.f11650u;
                    qVar.f11643n = null;
                    qVar.f11650u = null;
                    try {
                        qVar.F = m2Var;
                        boolean z10 = bVar.f12048e;
                        try {
                            bVar.f12048e = false;
                            c1Var.getClass();
                            c1Var.getClass();
                            c1Var.getClass();
                            m0.q.b(qVar, null, null);
                            bVar.f12048e = z10;
                            qVar.F = m2Var2;
                            qVar.f11643n = iArr;
                            qVar.f11650u = eVar;
                            bVar.f12045b = aVar2;
                            return;
                        } catch (Throwable th) {
                            bVar.f12048e = z10;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        qVar.F = m2Var2;
                        qVar.f11643n = iArr;
                        qVar.f11650u = eVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar.f12045b = aVar2;
                    throw th3;
                }
            case 2:
                ((o2.p) obj4).e((c9.a) obj3, (o2.o) obj, (m2.l) obj2);
                return;
            default:
                SupportedApp supportedApp = (SupportedApp) obj3;
                List<String> packageKeywords = (List) ((Map) obj4).get(supportedApp.getName());
                if (packageKeywords == null) {
                    packageKeywords = supportedApp.getPackageKeywords();
                }
                PackageManager packageManager = (PackageManager) obj2;
                Iterator<T> it = packageKeywords.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        try {
                            packageManager.getPackageInfo((String) next, 0);
                        } catch (Exception unused) {
                        }
                    } else {
                        next = null;
                    }
                }
                String str = (String) next;
                Intent launchIntentForPackage = str != null ? packageManager.getLaunchIntentForPackage(str) : null;
                if (launchIntentForPackage != null) {
                    try {
                        ((Context) obj).startActivity(launchIntentForPackage);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
