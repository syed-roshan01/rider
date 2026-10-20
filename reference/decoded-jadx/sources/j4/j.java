package j4;

import a4.c0;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements u4.a, t4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f8352a;

    @Override // u4.a
    public void a(Drawable drawable) {
        l lVar = this.f8352a;
        lVar.k(new d(drawable != null ? lVar.j(drawable) : null));
    }

    @Override // u4.a
    public void b() {
    }

    @Override // t4.g
    public Object c(i4.l lVar) {
        return h6.g.V(new c0(this.f8352a.f8357n, 0), lVar);
    }

    @Override // u4.a
    public void d() {
    }
}
