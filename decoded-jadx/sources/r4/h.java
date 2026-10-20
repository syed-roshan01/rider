package r4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.widget.TextView;
import com.auto.accept.service.OverlayService;
import m0.g1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13468c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13470b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f13469a = i10;
        this.f13470b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        int i10 = this.f13469a;
        Object obj = this.f13470b;
        switch (i10) {
            case 0:
                i.b((i) obj, network, true);
                break;
            case 1:
                d7.a.m(network, "network");
                OverlayService overlayService = (OverlayService) obj;
                TextView textViewM1487 = OverlayService.m1487(overlayService);
                if (textViewM1487 != null) {
                    textViewM1487.post(new b5.f(overlayService, 0));
                }
                break;
            case 2:
                d7.a.m(network, "network");
                ((g1) obj).setValue(Boolean.TRUE);
                break;
            default:
                ((f8.b) obj).f6381a.t();
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        switch (this.f13469a) {
            case 3:
                if (!z10) {
                    ((f8.b) this.f13470b).f6381a.t();
                }
                break;
            default:
                super.onBlockedStatusChanged(network, z10);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f13469a) {
            case 2:
                d7.a.m(network, "network");
                d7.a.m(networkCapabilities, "caps");
                ((g1) this.f13470b).setValue(Boolean.valueOf(networkCapabilities.hasCapability(12)));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i10 = this.f13469a;
        Object obj = this.f13470b;
        switch (i10) {
            case 0:
                i.b((i) obj, network, false);
                break;
            case 1:
                d7.a.m(network, "network");
                OverlayService overlayService = (OverlayService) obj;
                TextView textViewM1487 = OverlayService.m1487(overlayService);
                if (textViewM1487 != null) {
                    textViewM1487.post(new b5.f(overlayService, 1));
                }
                break;
            case 2:
                d7.a.m(network, "network");
                ((g1) obj).setValue(Boolean.FALSE);
                break;
            default:
                super.onLost(network);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(f8.b bVar) {
        this(bVar, 3);
        this.f13469a = 3;
    }
}
