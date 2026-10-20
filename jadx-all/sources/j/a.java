package j;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import h6.g;
import i3.k;
import i3.n;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k6.d4;
import k6.f5;
import l5.o;
import l5.v;
import p5.f;
import q5.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8194a;

    public /* synthetic */ a(Context context) {
        this.f8194a = context;
    }

    @Override // i3.k
    public final void a(g gVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new i3.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new n(this, gVar, threadPoolExecutor, 0));
    }

    public final l5.k b() {
        Context context = this.f8194a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l5.k kVar = new l5.k();
        kVar.f11351a = n5.a.a(l5.n.f11359a);
        n5.c cVar = new n5.c(context);
        kVar.f11352b = cVar;
        o oVar = t5.b.f14660a;
        o oVar2 = t5.b.f14661b;
        int i10 = 0;
        kVar.f11353c = n5.a.a(new m5.g(cVar, new m5.e(cVar, oVar, oVar2, i10)));
        n5.c cVar2 = kVar.f11352b;
        int i11 = 1;
        kVar.f11354d = new m5.e(cVar2, r5.e.f13483a, r5.e.f13484b, i11);
        p8.a aVarA = n5.a.a(new v(oVar, oVar2, r5.e.f13485c, kVar.f11354d, n5.a.a(new p5.e(cVar2, i11)), 2));
        kVar.f11355e = aVarA;
        p5.e eVar = new p5.e(oVar, i10);
        n5.c cVar3 = kVar.f11352b;
        f fVar = new f(cVar3, aVarA, eVar, oVar2, 0);
        p8.a aVar = kVar.f11351a;
        p8.a aVar2 = kVar.f11353c;
        kVar.f11356f = n5.a.a(new v(oVar, oVar2, new v(aVar, aVar2, fVar, aVarA, aVarA, 1), new j(cVar3, aVar2, aVarA, fVar, aVar, aVarA, aVarA), new f(aVar, aVarA, fVar, aVarA, 1), 0));
        return kVar;
    }

    public final ApplicationInfo c(int i10, String str) {
        return this.f8194a.getPackageManager().getApplicationInfo(str, i10);
    }

    public final PackageInfo d(int i10, String str) {
        return this.f8194a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean e() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return f6.a.X(this.f8194a);
        }
        String nameForUid = this.f8194a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return this.f8194a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final d4 f() {
        d4 d4Var = f5.a(this.f8194a, null, null).f10032i;
        f5.d(d4Var);
        return d4Var;
    }

    public a(Context context, int i10) {
        if (i10 != 4) {
            this.f8194a = context.getApplicationContext();
        } else {
            f6.a.x(context);
            this.f8194a = context;
        }
    }
}
