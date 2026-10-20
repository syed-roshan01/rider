package i4;

import a4.q;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ja.x;
import java.io.File;
import m9.m0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i10) {
        super(0);
        this.f8029a = i10;
        this.f8030b = hVar;
    }

    @Override // c9.a
    public final Object invoke() {
        q4.l aVar;
        int i10;
        int largeMemoryClass;
        l4.n nVarA;
        switch (this.f8029a) {
            case 0:
                Context context = this.f8030b.f8032a;
                q4.b bVar = new q4.b(context);
                q4.m kVar = bVar.f13129c ? new q4.k() : new q();
                if (bVar.f13128b) {
                    double d10 = bVar.f13127a;
                    if (d10 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        Bitmap.Config[] configArr = w4.e.f16163a;
                        try {
                            Object systemService = r2.k.getSystemService(context, ActivityManager.class);
                            d7.a.j(systemService);
                            ActivityManager activityManager = (ActivityManager) systemService;
                            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused) {
                            largeMemoryClass = 256;
                        }
                        double d11 = d10 * ((double) largeMemoryClass);
                        double d12 = 1024;
                        i10 = (int) (d11 * d12 * d12);
                    } else {
                        i10 = 0;
                    }
                    aVar = i10 > 0 ? new q4.i(i10, kVar) : new q4.a(kVar);
                    break;
                } else {
                    aVar = new q4.a(kVar);
                }
                return new q4.f(aVar, kVar);
            default:
                w4.k kVar2 = w4.k.f16183a;
                Context context2 = this.f8030b.f8032a;
                synchronized (kVar2) {
                    nVarA = w4.k.f16184b;
                    if (nVarA == null) {
                        l4.a aVar2 = new l4.a();
                        aVar2.f11274b = ja.m.f8558a;
                        aVar2.f11275c = 0.02d;
                        aVar2.f11276d = 10485760L;
                        aVar2.f11277e = 262144000L;
                        aVar2.f11278f = m0.f11970b;
                        File fileU = b9.b.U(w4.e.c(context2));
                        String str = x.f8577b;
                        aVar2.f11273a = fa.l.j(fileU);
                        nVarA = aVar2.a();
                        w4.k.f16184b = nVarA;
                    }
                    break;
                }
                return nVarA;
        }
    }
}
