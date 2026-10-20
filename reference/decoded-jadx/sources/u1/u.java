package u1;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class u extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f15305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i10) {
        super(0);
        this.f15304a = i10;
        this.f15305b = wVar;
    }

    @Override // c9.a
    public final Object invoke() {
        int actionMasked;
        int i10 = this.f15304a;
        w wVar = this.f15305b;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = wVar.f15342r0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    wVar.f15344s0 = SystemClock.uptimeMillis();
                    wVar.post(wVar.f15350v0);
                }
                return q8.l.f13235a;
            default:
                return wVar.get_viewTreeOwners();
        }
    }
}
