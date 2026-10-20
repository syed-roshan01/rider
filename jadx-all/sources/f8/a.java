package f8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6379a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f6380b;

    public a(b bVar) {
        this.f6380b = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z10 = this.f6379a;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.f6379a = z11;
        if (!z11 || z10) {
            return;
        }
        this.f6380b.f6381a.t();
    }
}
