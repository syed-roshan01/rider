package c5;

import com.auto.accept.ui.viewmodel.MainViewModel;
import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f2997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MainViewModel mainViewModel, u8.e eVar) {
        super(2, eVar);
        this.f2997a = mainViewModel;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new n(this.f2997a, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((d0) obj, (u8.e) obj2);
        q8.l lVar = q8.l.f13235a;
        nVar.invokeSuspend(lVar);
        return lVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        d7.t.v0(obj);
        this.f2997a.f3111q0.i(null);
        return q8.l.f13235a;
    }
}
