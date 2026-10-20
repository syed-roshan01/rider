package u1;

import android.view.View;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0.g2 f15154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f15155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m0.g2 g2Var, View view, u8.e eVar) {
        super(2, eVar);
        this.f15154b = g2Var;
        this.f15155c = view;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new k3(this.f15154b, this.f15155c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k3) create((m9.d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f15153a;
        q8.l lVar = q8.l.f13235a;
        m0.g2 g2Var = this.f15154b;
        View view = this.f15155c;
        try {
            if (i10 == 0) {
                d7.t.v0(obj);
                this.f15153a = 1;
                Object objW = h6.g.W(g2Var.f11536r, new m0.b2(2, null), this);
                if (objW != aVar) {
                    objW = lVar;
                }
                if (objW == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d7.t.v0(obj);
            }
            if (u3.b(view) == g2Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return lVar;
        } catch (Throwable th) {
            if (u3.b(view) == g2Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th;
        }
    }
}
