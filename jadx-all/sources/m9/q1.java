package m9;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u8.e f11992d;

    public q1(u8.j jVar, c9.e eVar) {
        super(jVar, false);
        this.f11992d = d7.t.M(this, this, eVar);
    }

    @Override // m9.p1
    public final void d0() throws IllegalAccessException, InvocationTargetException {
        try {
            r9.a.l(d7.t.b0(this.f11992d), q8.l.f13235a, null);
        } catch (Throwable th) {
            resumeWith(d7.t.N(th));
            throw th;
        }
    }
}
