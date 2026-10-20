package l;

import android.content.Context;
import android.view.View;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k.q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10734m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f10735n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context, k.l lVar, j jVar) {
        super(R.attr.actionOverflowMenuStyle, 0, context, jVar, lVar, true);
        this.f10735n = kVar;
        this.f8682g = 8388613;
        k.f fVar = kVar.C;
        this.f8684i = fVar;
        k.n nVar = this.f8685j;
        if (nVar != null) {
            nVar.h(fVar);
        }
    }

    @Override // k.q
    public final void c() {
        int i10 = this.f10734m;
        k kVar = this.f10735n;
        switch (i10) {
            case 0:
                kVar.f10819z = null;
                super.c();
                break;
            default:
                k.l lVar = kVar.f10803c;
                if (lVar != null) {
                    lVar.c(true);
                }
                kVar.f10818y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context, k.w wVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, wVar, false);
        this.f10735n = kVar;
        if (!wVar.f8707w.d()) {
            View view2 = kVar.f10808o;
            this.f8681f = view2 == null ? kVar.f10807n : view2;
        }
        k.f fVar = kVar.C;
        this.f8684i = fVar;
        k.n nVar = this.f8685j;
        if (nVar != null) {
            nVar.h(fVar);
        }
    }
}
