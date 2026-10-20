package p6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12792a;

    public /* synthetic */ b(c cVar) {
        this.f12792a = cVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f12792a;
        cVar.f12795b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        cVar.a().post(new c0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar = this.f12792a;
        cVar.f12795b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        cVar.a().post(new a0(this, 1));
    }
}
