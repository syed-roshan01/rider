package x3;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import d7.t;
import m9.l;
import x2.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f16302a;

    public b(Context context) {
        Object systemService = context.getSystemService((Class<Object>) c3.d.c());
        d7.a.l(systemService, "context.getSystemService\u2026:class.java\n            )");
        this.f16302a = c3.d.a(systemService);
    }

    @Override // x3.c
    public Object a(u8.e eVar) {
        l lVar = new l(1, t.b0(eVar));
        lVar.t();
        this.f16302a.getMeasurementApiStatus(new m.a(2), new i(lVar));
        Object objS = lVar.s();
        v8.a aVar = v8.a.f15963a;
        return objS;
    }

    @Override // x3.c
    public Object b(Uri uri, InputEvent inputEvent, u8.e eVar) {
        l lVar = new l(1, t.b0(eVar));
        lVar.t();
        this.f16302a.registerSource(uri, inputEvent, new m.a(6), new i(lVar));
        Object objS = lVar.s();
        return objS == v8.a.f15963a ? objS : q8.l.f13235a;
    }

    @Override // x3.c
    public Object c(Uri uri, u8.e eVar) {
        l lVar = new l(1, t.b0(eVar));
        lVar.t();
        this.f16302a.registerTrigger(uri, new m.a(3), new i(lVar));
        Object objS = lVar.s();
        return objS == v8.a.f15963a ? objS : q8.l.f13235a;
    }

    public Object e(a aVar, u8.e eVar) {
        new l(1, t.b0(eVar)).t();
        c3.d.d();
        throw null;
    }

    public Object f(d dVar, u8.e eVar) {
        new l(1, t.b0(eVar)).t();
        c3.d.i();
        throw null;
    }

    public Object g(e eVar, u8.e eVar2) {
        new l(1, t.b0(eVar2)).t();
        c3.d.j();
        throw null;
    }
}
