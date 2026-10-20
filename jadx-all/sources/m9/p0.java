package m9;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11988f;

    public p0(Object obj, int i10) {
        this.f11987e = i10;
        this.f11988f = obj;
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        q8.l lVar = q8.l.f13235a;
        switch (this.f11987e) {
            case 0:
                n((Throwable) obj);
                break;
            case 1:
                n((Throwable) obj);
                break;
            case 2:
                n((Throwable) obj);
                break;
            default:
                n((Throwable) obj);
                break;
        }
        return lVar;
    }

    @Override // m9.j1
    public final void n(Throwable th) throws IllegalAccessException, InvocationTargetException {
        int i10 = this.f11987e;
        Object obj = this.f11988f;
        switch (i10) {
            case 0:
                ((o0) obj).a();
                break;
            case 1:
                ((c9.c) obj).invoke(th);
                break;
            case 2:
                Object objN = m().N();
                if (!(objN instanceof u)) {
                    ((l) obj).resumeWith(e0.N(objN));
                } else {
                    ((l) obj).resumeWith(d7.t.N(((u) objN).f12005a));
                }
                break;
            default:
                ((u8.e) obj).resumeWith(q8.l.f13235a);
                break;
        }
    }
}
