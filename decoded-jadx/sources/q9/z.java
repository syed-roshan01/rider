package q9;

import p9.c0;
import p9.o0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends c0 implements o0 {
    @Override // p9.o0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f12874o;
            d7.a.j(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f12875p + ((long) ((int) ((o() + ((long) this.f12877r)) - this.f12875p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void v(int i10) {
        synchronized (this) {
            Object[] objArr = this.f12874o;
            d7.a.j(objArr);
            f(Integer.valueOf(((Number) objArr[((int) ((this.f12875p + ((long) ((int) ((o() + ((long) this.f12877r)) - this.f12875p)))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
