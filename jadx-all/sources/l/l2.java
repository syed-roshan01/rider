package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f10825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f10826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10828f;

    public l2(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f10827e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f10824b = rect3;
        Rect rect4 = new Rect();
        this.f10826d = rect4;
        Rect rect5 = new Rect();
        this.f10825c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f10823a = searchAutoComplete;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z11 = this.f10828f;
                if (z11 && !this.f10826d.contains(x10, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            } else if (action != 3) {
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f10828f;
                this.f10828f = false;
            }
            z12 = z11;
            z10 = true;
        } else if (this.f10824b.contains(x10, y10)) {
            this.f10828f = true;
            z10 = true;
        } else {
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f10825c;
        View view = this.f10823a;
        if (!z10 || rect.contains(x10, y10)) {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
