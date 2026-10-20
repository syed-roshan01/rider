package m9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.c f11999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f12001e;

    public t(Object obj, j jVar, c9.c cVar, Object obj2, Throwable th) {
        this.f11997a = obj;
        this.f11998b = jVar;
        this.f11999c = cVar;
        this.f12000d = obj2;
        this.f12001e = th;
    }

    public static t a(t tVar, j jVar, CancellationException cancellationException, int i10) {
        Object obj = (i10 & 1) != 0 ? tVar.f11997a : null;
        if ((i10 & 2) != 0) {
            jVar = tVar.f11998b;
        }
        j jVar2 = jVar;
        c9.c cVar = (i10 & 4) != 0 ? tVar.f11999c : null;
        Object obj2 = (i10 & 8) != 0 ? tVar.f12000d : null;
        Throwable th = cancellationException;
        if ((i10 & 16) != 0) {
            th = tVar.f12001e;
        }
        tVar.getClass();
        return new t(obj, jVar2, cVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return d7.a.d(this.f11997a, tVar.f11997a) && d7.a.d(this.f11998b, tVar.f11998b) && d7.a.d(this.f11999c, tVar.f11999c) && d7.a.d(this.f12000d, tVar.f12000d) && d7.a.d(this.f12001e, tVar.f12001e);
    }

    public final int hashCode() {
        Object obj = this.f11997a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f11998b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        c9.c cVar = this.f11999c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f12000d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f12001e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f11997a + ", cancelHandler=" + this.f11998b + ", onCancellation=" + this.f11999c + ", idempotentResume=" + this.f12000d + ", cancelCause=" + this.f12001e + ')';
    }

    public /* synthetic */ t(Object obj, j jVar, c9.c cVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? null : cVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
