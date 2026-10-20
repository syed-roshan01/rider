package a4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1109b;

    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1108a = new Rect();
        this.f1109b = true;
    }

    public f0(int i10, int i11) {
        super(i10, i11);
        this.f1108a = new Rect();
        this.f1109b = true;
    }

    public f0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1108a = new Rect();
        this.f1109b = true;
    }

    public f0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1108a = new Rect();
        this.f1109b = true;
    }

    public f0(f0 f0Var) {
        super((ViewGroup.LayoutParams) f0Var);
        this.f1108a = new Rect();
        this.f1109b = true;
    }
}
