package m0;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends w8.i implements c9.e {
    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new f0(2, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        return Choreographer.getInstance();
    }
}
