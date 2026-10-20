package u1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f15367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.c f15368b;

    public x0(Configuration configuration, x1.c cVar) {
        this.f15367a = configuration;
        this.f15368b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f15367a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f15368b.f16290a.entrySet().iterator();
        while (it.hasNext()) {
            x1.a aVar = (x1.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f16287b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f15368b.f16290a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f15368b.f16290a.clear();
    }
}
