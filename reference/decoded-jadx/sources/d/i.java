package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4307a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4308b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4309c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4310d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient HashMap f4311e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f4312f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f4313g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        c cVar;
        String str = (String) this.f4307a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g gVar = (g) this.f4311e.get(str);
        if (gVar == null || (cVar = gVar.f4303a) == null || !this.f4310d.contains(str)) {
            this.f4312f.remove(str);
            this.f4313g.putParcelable(str, new b(intent, i11));
            return true;
        }
        cVar.a(gVar.f4304b.c(intent, i11));
        this.f4310d.remove(str);
        return true;
    }

    public abstract void b(int i10, e.b bVar, Object obj);

    public final f c(String str, w wVar, e.b bVar, c cVar) {
        r lifecycle = wVar.getLifecycle();
        if (lifecycle.b().compareTo(q.f2172d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + wVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.f4309c;
        h hVar = (h) map.get(str);
        if (hVar == null) {
            hVar = new h(lifecycle);
        }
        e eVar = new e(this, str, cVar, bVar);
        hVar.f4305a.a(eVar);
        hVar.f4306b.add(eVar);
        map.put(str, hVar);
        return new f(this, str, bVar, 0);
    }

    public final f d(String str, e.b bVar, c cVar) {
        e(str);
        this.f4311e.put(str, new g(bVar, cVar));
        HashMap map = this.f4312f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            cVar.a(obj);
        }
        Bundle bundle = this.f4313g;
        b bVar2 = (b) bundle.getParcelable(str);
        if (bVar2 != null) {
            bundle.remove(str);
            cVar.a(bVar.c(bVar2.f4294b, bVar2.f4293a));
        }
        return new f(this, str, bVar, 1);
    }

    public final void e(String str) {
        HashMap map = this.f4308b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        g9.d.f7313a.getClass();
        int iNextInt = g9.d.f7314b.c().nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            HashMap map2 = this.f4307a;
            if (!map2.containsKey(Integer.valueOf(i10))) {
                map2.put(Integer.valueOf(i10), str);
                map.put(str, Integer.valueOf(i10));
                return;
            } else {
                g9.d.f7313a.getClass();
                iNextInt = g9.d.f7314b.c().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f4310d.contains(str) && (num = (Integer) this.f4308b.remove(str)) != null) {
            this.f4307a.remove(num);
        }
        this.f4311e.remove(str);
        HashMap map = this.f4312f;
        if (map.containsKey(str)) {
            StringBuilder sbR = a7.a.r("Dropping pending result for request ", str, ": ");
            sbR.append(map.get(str));
            Log.w("ActivityResultRegistry", sbR.toString());
            map.remove(str);
        }
        Bundle bundle = this.f4313g;
        if (bundle.containsKey(str)) {
            StringBuilder sbR2 = a7.a.r("Dropping pending result for request ", str, ": ");
            sbR2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbR2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f4309c;
        h hVar = (h) map2.get(str);
        if (hVar != null) {
            ArrayList arrayList = hVar.f4306b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hVar.f4305a.c((u) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
