package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10952a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10953b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10956e;

    public w(ImageView imageView) {
        this.f10954c = imageView;
    }

    public final void a() {
        t2 t2Var;
        Drawable drawable = ((ImageView) this.f10954c).getDrawable();
        if (drawable != null) {
            v0.a(drawable);
        }
        if (drawable == null || (t2Var = (t2) this.f10955d) == null) {
            return;
        }
        s.d(drawable, t2Var, ((ImageView) this.f10954c).getDrawableState());
    }

    public final void b(int i10) {
        int iZ;
        Context context = ((ImageView) this.f10954c).getContext();
        int[] iArr = f.a.f5569e;
        z2 z2VarI = z2.I(context, null, iArr, i10);
        ImageView imageView = (ImageView) this.f10954c;
        b3.q0.c(imageView, imageView.getContext(), iArr, null, (TypedArray) z2VarI.f10984c, i10);
        try {
            Drawable drawable = ((ImageView) this.f10954c).getDrawable();
            if (drawable == null && (iZ = z2VarI.z(1, -1)) != -1 && (drawable = o7.d0.C(((ImageView) this.f10954c).getContext(), iZ)) != null) {
                ((ImageView) this.f10954c).setImageDrawable(drawable);
            }
            if (drawable != null) {
                v0.a(drawable);
            }
            if (z2VarI.D(2)) {
                e3.d.c((ImageView) this.f10954c, z2VarI.q(2));
            }
            if (z2VarI.D(3)) {
                e3.d.d((ImageView) this.f10954c, v0.c(z2VarI.v(3, -1), null));
            }
        } finally {
            z2VarI.K();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            Drawable drawableC = o7.d0.C(((ImageView) this.f10954c).getContext(), i10);
            if (drawableC != null) {
                v0.a(drawableC);
            }
            ((ImageView) this.f10954c).setImageDrawable(drawableC);
        } else {
            ((ImageView) this.f10954c).setImageDrawable(null);
        }
        a();
    }

    public final String toString() {
        switch (this.f10952a) {
            case 1:
                StringBuilder sb = new StringBuilder(200);
                sb.append("<<\n mode: ");
                sb.append((b8.b) this.f10954c);
                sb.append("\n ecLevel: ");
                sb.append((Object) null);
                sb.append("\n version: ");
                sb.append((b8.c) this.f10955d);
                sb.append("\n maskPattern: ");
                sb.append(this.f10953b);
                if (((k3.b) this.f10956e) == null) {
                    sb.append("\n matrix: null\n");
                } else {
                    sb.append("\n matrix:\n");
                    sb.append((k3.b) this.f10956e);
                }
                sb.append(">>\n");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
