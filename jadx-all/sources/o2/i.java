package o2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, int i10) {
        super(1);
        this.f12475a = i10;
        this.f12476b = rVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f12475a;
        r rVar = this.f12476b;
        switch (i10) {
            case 0:
                r1.s sVarJ = ((r1.s) obj).j();
                d7.a.j(sVarJ);
                rVar.k(sVarJ);
                break;
            case 1:
                rVar.m7215setPopupContentSizefhxjrPA(new m2.k(((m2.k) obj).f11814a));
                rVar.l();
                break;
            default:
                c9.a aVar = (c9.a) obj;
                Handler handler = rVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = rVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new u1.v(aVar, 1));
                    }
                } else {
                    aVar.invoke();
                }
                break;
        }
        return lVar;
    }
}
