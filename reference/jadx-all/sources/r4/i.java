package r4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import i4.o;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f13471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f13472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f13473c;

    public i(ConnectivityManager connectivityManager, f fVar) {
        this.f13471a = connectivityManager;
        this.f13472b = fVar;
        h hVar = new h(this, 0);
        this.f13473c = hVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), hVar);
    }

    public static final void b(i iVar, Network network, boolean z10) {
        l lVar;
        boolean z11 = false;
        for (Network network2 : iVar.f13471a.getAllNetworks()) {
            if (!d7.a.d(network2, network)) {
                NetworkCapabilities networkCapabilities = iVar.f13471a.getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z11 = true;
                    break;
                }
            } else {
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        w4.l lVar2 = (w4.l) iVar.f13472b;
        if (((o) lVar2.f16186b.get()) != null) {
            lVar2.f16188d = z11;
            lVar = l.f13235a;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            lVar2.a();
        }
    }

    @Override // r4.g
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f13471a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // r4.g
    public final void shutdown() {
        this.f13471a.unregisterNetworkCallback(this.f13473c);
    }
}
