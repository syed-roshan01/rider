package l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f10849a;

    public n1(o1 o1Var) {
        this.f10849a = o1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        y yVar;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        o1 o1Var = this.f10849a;
        if (action == 0 && (yVar = o1Var.C) != null && yVar.isShowing() && x10 >= 0 && x10 < o1Var.C.getWidth() && y10 >= 0 && y10 < o1Var.C.getHeight()) {
            o1Var.f10883y.postDelayed(o1Var.f10879u, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        o1Var.f10883y.removeCallbacks(o1Var.f10879u);
        return false;
    }
}
