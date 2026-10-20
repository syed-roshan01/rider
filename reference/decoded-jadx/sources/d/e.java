package d;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f4296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.b f4297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f4298d;

    public e(i iVar, String str, c cVar, e.b bVar) {
        this.f4298d = iVar;
        this.f4295a = str;
        this.f4296b = cVar;
        this.f4297c = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(w wVar, p pVar) {
        boolean zEquals = p.ON_START.equals(pVar);
        String str = this.f4295a;
        i iVar = this.f4298d;
        if (!zEquals) {
            if (p.ON_STOP.equals(pVar)) {
                iVar.f4311e.remove(str);
                return;
            } else {
                if (p.ON_DESTROY.equals(pVar)) {
                    iVar.f(str);
                    return;
                }
                return;
            }
        }
        HashMap map = iVar.f4311e;
        e.b bVar = this.f4297c;
        c cVar = this.f4296b;
        map.put(str, new g(bVar, cVar));
        HashMap map2 = iVar.f4312f;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            cVar.a(obj);
        }
        Bundle bundle = iVar.f4313g;
        b bVar2 = (b) bundle.getParcelable(str);
        if (bVar2 != null) {
            bundle.remove(str);
            cVar.a(bVar.c(bVar2.f4294b, bVar2.f4293a));
        }
    }
}
