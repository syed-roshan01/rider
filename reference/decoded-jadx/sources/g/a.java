package g;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6419a;

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.f6419a = 0;
        this.f6419a = aVar.f6419a;
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6419a = 0;
    }
}
