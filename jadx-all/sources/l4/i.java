package l4;

import d7.t;
import java.io.IOException;
import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f11297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, u8.e eVar) {
        super(2, eVar);
        this.f11297a = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new i(this.f11297a, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        t.v0(obj);
        j jVar = this.f11297a;
        synchronized (jVar) {
            if (!jVar.f11310s || jVar.f11311t) {
                return q8.l.f13235a;
            }
            try {
                jVar.Q();
            } catch (IOException unused) {
                jVar.f11312u = true;
            }
            try {
                if (jVar.f11307p >= 2000) {
                    jVar.c0();
                }
            } catch (IOException unused2) {
                jVar.f11313v = true;
                jVar.f11308q = r9.a.b(new ja.e());
            }
            return q8.l.f13235a;
        }
    }
}
