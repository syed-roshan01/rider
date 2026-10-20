package b4;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import c5.q;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f2703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f2705e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.g f2701a = new n.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2706f = true;

    public final Bundle a(String str) {
        d7.a.m(str, "key");
        if (!this.f2704d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f2703c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f2703c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2703c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2703c = null;
        }
        return bundle2;
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f2701a.iterator();
        do {
            n.e eVar = (n.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            d7.a.l(entry, "components");
            str = (String) entry.getKey();
            dVar = (d) entry.getValue();
        } while (!d7.a.d(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(r rVar) {
        if (!(!this.f2702b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        rVar.a(new q(this, 2));
        this.f2702b = true;
    }

    public final void d(String str, d dVar) {
        Object obj;
        d7.a.m(str, "key");
        d7.a.m(dVar, "provider");
        n.g gVar = this.f2701a;
        n.c cVarE = gVar.e(str);
        if (cVarE != null) {
            obj = cVarE.f12030b;
        } else {
            n.c cVar = new n.c(str, dVar);
            gVar.f12041d++;
            n.c cVar2 = gVar.f12039b;
            if (cVar2 == null) {
                gVar.f12038a = cVar;
                gVar.f12039b = cVar;
            } else {
                cVar2.f12031c = cVar;
                cVar.f12032d = cVar2;
                gVar.f12039b = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void e() {
        if (!this.f2706f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        a aVar = this.f2705e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f2705e = aVar;
        try {
            m.class.getDeclaredConstructor(new Class[0]);
            a aVar2 = this.f2705e;
            if (aVar2 != null) {
                aVar2.f2699a.add(m.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + m.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
