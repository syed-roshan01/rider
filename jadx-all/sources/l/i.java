package l;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f10774q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, View view) {
        super(view);
        this.f10774q = jVar;
    }

    @Override // l.e1
    public final k.n b() {
        f fVar = this.f10774q.f10779d.f10818y;
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    @Override // l.e1
    public final boolean c() {
        this.f10774q.f10779d.k();
        return true;
    }

    @Override // l.e1
    public final boolean d() {
        k kVar = this.f10774q.f10779d;
        if (kVar.A != null) {
            return false;
        }
        kVar.g();
        return true;
    }
}
