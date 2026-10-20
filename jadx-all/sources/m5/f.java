package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f11876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f11877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11878c;

    public f(Context context, d dVar) {
        t tVar = new t(context);
        this.f11878c = new HashMap();
        this.f11876a = tVar;
        this.f11877b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f11878c.containsKey(str)) {
            return (h) this.f11878c.get(str);
        }
        CctBackendFactory cctBackendFactoryD = this.f11876a.d(str);
        if (cctBackendFactoryD == null) {
            return null;
        }
        d dVar = this.f11877b;
        h hVarCreate = cctBackendFactoryD.create(new b(dVar.f11869a, dVar.f11870b, dVar.f11871c, str));
        this.f11878c.put(str, hVarCreate);
        return hVarCreate;
    }
}
