package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ IBinder f12808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f12809o;

    public c0(b bVar, IBinder iBinder) {
        this.f12809o = bVar;
        this.f12808n = iBinder;
    }

    @Override // p6.w
    public final void b() {
        b bVar = this.f12809o;
        c cVar = bVar.f12792a;
        cVar.f12807n = (IInterface) cVar.f12802i.a(this.f12808n);
        c cVar2 = bVar.f12792a;
        cVar2.f12795b.b("linkToDeath", new Object[0]);
        try {
            cVar2.f12807n.asBinder().linkToDeath(cVar2.f12804k, 0);
        } catch (RemoteException e4) {
            cVar2.f12795b.a(e4, "linkToDeath failed", new Object[0]);
        }
        cVar2.f12800g = false;
        Iterator it = cVar2.f12797d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        cVar2.f12797d.clear();
    }
}
