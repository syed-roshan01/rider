package h;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import d1.f;
import d7.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7338b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f7337a = i10;
        this.f7338b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7337a) {
            case 0:
                break;
            case 1:
                ((g4.a) this.f7338b).invalidateSelf();
                break;
            default:
                d7.a.m(drawable, "d");
                h5.a aVar = (h5.a) this.f7338b;
                aVar.f7556n.setValue(Integer.valueOf(((Number) aVar.f7556n.getValue()).intValue() + 1));
                h5.a aVar2 = (h5.a) this.f7338b;
                Drawable drawable2 = aVar2.f7555f;
                q8.c cVar = h5.c.f7560a;
                aVar2.f7557o.setValue(new f((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? f.f4345c : t.j(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f7337a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7338b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                }
                break;
            case 1:
                ((g4.a) this.f7338b).scheduleSelf(runnable, j10);
                break;
            default:
                d7.a.m(drawable, "d");
                d7.a.m(runnable, "what");
                ((Handler) h5.c.f7560a.getValue()).postAtTime(runnable, j10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7337a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7338b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            case 1:
                ((g4.a) this.f7338b).unscheduleSelf(runnable);
                break;
            default:
                d7.a.m(drawable, "d");
                d7.a.m(runnable, "what");
                ((Handler) h5.c.f7560a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}
