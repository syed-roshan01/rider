package u1;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f15116a = new i2();

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i10);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
