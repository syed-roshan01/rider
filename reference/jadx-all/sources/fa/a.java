package fa;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ga.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f6388d = new v(24, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6389e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6390c;

    static {
        boolean z10 = false;
        if (d7.a.d("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        f6389e = z10;
    }

    public a() {
        ga.l lVar;
        ga.l lVar2;
        n[] nVarArr = new n[4];
        nVarArr[0] = (!d7.a.d("Dalvik", System.getProperty("java.vm.name")) || Build.VERSION.SDK_INT < 29) ? null : new ga.a();
        nVarArr[1] = new ga.m(ga.f.f7320f);
        switch (ga.k.f7331a.f6416a) {
            case 4:
                lVar = ga.h.f7327b;
                break;
            default:
                lVar = ga.k.f7332b;
                break;
        }
        nVarArr[2] = new ga.m(lVar);
        switch (ga.h.f7326a.f6416a) {
            case 4:
                lVar2 = ga.h.f7327b;
                break;
            default:
                lVar2 = ga.k.f7332b;
                break;
        }
        nVarArr[3] = new ga.m(lVar2);
        ArrayList arrayListR = b9.b.R(nVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f6390c = arrayList;
    }

    @Override // fa.m
    public final f6.a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ga.b bVar = x509TrustManagerExtensions != null ? new ga.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new ia.a(c(x509TrustManager));
    }

    @Override // fa.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        d7.a.m(list, "protocols");
        Iterator it = this.f6390c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // fa.m
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f6390c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n) next).a(sSLSocket));
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    @Override // fa.m
    public final boolean h(String str) {
        d7.a.m(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
