package m5;

import android.content.Context;
import l5.o;
import r5.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.a f11873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8.a f11874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8.a f11875d;

    public /* synthetic */ e(p8.a aVar, o oVar, o oVar2, int i10) {
        this.f11872a = i10;
        this.f11873b = aVar;
        this.f11874c = oVar;
        this.f11875d = oVar2;
    }

    @Override // p8.a
    public final Object get() {
        int i10 = this.f11872a;
        p8.a aVar = this.f11875d;
        p8.a aVar2 = this.f11874c;
        p8.a aVar3 = this.f11873b;
        switch (i10) {
            case 0:
                return new d((Context) aVar3.get(), (t5.a) aVar2.get(), (t5.a) aVar.get());
            default:
                return new p(((Integer) aVar.get()).intValue(), (Context) aVar3.get(), (String) aVar2.get());
        }
    }
}
