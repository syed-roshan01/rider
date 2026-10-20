package u1;

import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class x3 implements m0.t, androidx.lifecycle.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f15370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.t f15371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.r f15373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c9.e f15374e = q1.f15236a;

    public x3(w wVar, m0.x xVar) {
        this.f15370a = wVar;
        this.f15371b = xVar;
    }

    @Override // m0.t
    public final void a() {
        if (!this.f15372c) {
            this.f15372c = true;
            this.f15370a.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.r rVar = this.f15373d;
            if (rVar != null) {
                rVar.c(this);
            }
        }
        this.f15371b.a();
    }

    @Override // m0.t
    public final void e(c9.e eVar) {
        this.f15370a.setOnViewTreeOwnersAvailable(new u.s(23, this, eVar));
    }

    @Override // androidx.lifecycle.u
    public final void onStateChanged(androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        if (pVar == androidx.lifecycle.p.ON_DESTROY) {
            a();
        } else {
            if (pVar != androidx.lifecycle.p.ON_CREATE || this.f15372c) {
                return;
            }
            e(this.f15374e);
        }
    }
}
