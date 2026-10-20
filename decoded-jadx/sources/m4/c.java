package m4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.n f11833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11834c;

    public /* synthetic */ c(Object obj, s4.n nVar, int i10) {
        this.f11832a = i10;
        this.f11834c = obj;
        this.f11833b = nVar;
    }

    @Override // m4.g
    public final Object a(u8.e eVar) {
        int i10 = this.f11832a;
        s4.n nVar = this.f11833b;
        Object obj = this.f11834c;
        switch (i10) {
            case 0:
                return new d(new BitmapDrawable(nVar.f14022a.getResources(), (Bitmap) obj), false, k4.f.f9755b);
            case 1:
                try {
                    ja.g gVar = new ja.g();
                    gVar.write((ByteBuffer) obj);
                    ((ByteBuffer) obj).position(0);
                    Context context = nVar.f14022a;
                    return new n(new r(gVar, null), null, k4.f.f9755b);
                } catch (Throwable th) {
                    ((ByteBuffer) obj).position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = w4.e.f16163a;
                boolean z10 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof g4.c);
                if (z10) {
                    bitmapDrawable = new BitmapDrawable(nVar.f14022a.getResources(), w4.g.a(bitmapDrawable, nVar.f14023b, nVar.f14025d, nVar.f14026e, nVar.f14027f));
                }
                return new d(bitmapDrawable, z10, k4.f.f9755b);
        }
    }
}
