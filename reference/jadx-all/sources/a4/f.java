package a4;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.firebase.messaging.ServiceStarter;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1107b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f1106a = i10;
        this.f1107b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1106a;
        Object obj = this.f1107b;
        switch (i10) {
            case 0:
                j jVar = (j) obj;
                int i11 = jVar.f1137v;
                ValueAnimator valueAnimator = jVar.f1136u;
                if (i11 == 1) {
                    valueAnimator.cancel();
                } else if (i11 != 2) {
                }
                jVar.f1137v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(ServiceStarter.ERROR_UNKNOWN);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).K();
                break;
        }
    }
}
