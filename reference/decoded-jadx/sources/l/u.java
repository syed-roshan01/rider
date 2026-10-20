package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.f f10945b;

    public u(TextView textView) {
        this.f10944a = textView;
        this.f10945b = new k.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f10944a.getContext().obtainStyledAttributes(attributeSet, f.a.f5571g, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((x9.v) this.f10945b.f8599b).I(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
