package q4;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f13143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f13144b;

    public i(int i10, m mVar) {
        this.f13143a = mVar;
        this.f13144b = new h(i10, this);
    }

    @Override // q4.l
    public final d a(c cVar) {
        g gVar = (g) this.f13144b.get(cVar);
        if (gVar != null) {
            return new d(gVar.f13138a, gVar.f13139b);
        }
        return null;
    }

    @Override // q4.l
    public final void b(int i10) {
        h hVar = this.f13144b;
        if (i10 >= 40) {
            hVar.evictAll();
        } else {
            if (10 > i10 || i10 >= 20) {
                return;
            }
            hVar.trimToSize(hVar.size() / 2);
        }
    }

    @Override // q4.l
    public final void c(c cVar, Bitmap bitmap, Map map) {
        int iJ = f6.a.J(bitmap);
        h hVar = this.f13144b;
        if (iJ <= hVar.maxSize()) {
            hVar.put(cVar, new g(bitmap, map, iJ));
        } else {
            hVar.remove(cVar);
            this.f13143a.c(cVar, bitmap, map, iJ);
        }
    }
}
