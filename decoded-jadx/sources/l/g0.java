package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2 f10740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t2 f10741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t2 f10742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t2 f10743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2 f10744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t2 f10745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t2 f10746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q0 f10747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10748j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10749k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f10750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10751m;

    public g0(TextView textView) {
        this.f10739a = textView;
        this.f10747i = new q0(textView);
    }

    public static t2 c(Context context, s sVar, int i10) {
        ColorStateList colorStateListH;
        synchronized (sVar) {
            colorStateListH = sVar.f10925a.h(context, i10);
        }
        if (colorStateListH == null) {
            return null;
        }
        t2 t2Var = new t2();
        t2Var.f10941b = true;
        t2Var.f10942c = colorStateListH;
        return t2Var;
    }

    public final void a(Drawable drawable, t2 t2Var) {
        if (drawable == null || t2Var == null) {
            return;
        }
        s.d(drawable, t2Var, this.f10739a.getDrawableState());
    }

    public final void b() {
        t2 t2Var = this.f10740b;
        TextView textView = this.f10739a;
        if (t2Var != null || this.f10741c != null || this.f10742d != null || this.f10743e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f10740b);
            a(compoundDrawables[1], this.f10741c);
            a(compoundDrawables[2], this.f10742d);
            a(compoundDrawables[3], this.f10743e);
        }
        if (this.f10744f == null && this.f10745g == null) {
            return;
        }
        Drawable[] drawableArrA = c0.a(textView);
        a(drawableArrA[0], this.f10744f);
        a(drawableArrA[2], this.f10745g);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x025d  */
    public final void d(AttributeSet attributeSet, int i10) {
        boolean zP;
        boolean z10;
        String strB;
        String strB2;
        int i11;
        int i12;
        int i13;
        int resourceId;
        int i14;
        TextView textView = this.f10739a;
        Context context = textView.getContext();
        s sVarA = s.a();
        int[] iArr = f.a.f5570f;
        z2 z2VarI = z2.I(context, attributeSet, iArr, i10);
        b3.q0.c(textView, textView.getContext(), iArr, attributeSet, (TypedArray) z2VarI.f10984c, i10);
        int i15 = 0;
        int iZ = z2VarI.z(0, -1);
        if (z2VarI.D(3)) {
            this.f10740b = c(context, sVarA, z2VarI.z(3, 0));
        }
        if (z2VarI.D(1)) {
            this.f10741c = c(context, sVarA, z2VarI.z(1, 0));
        }
        if (z2VarI.D(4)) {
            this.f10742d = c(context, sVarA, z2VarI.z(4, 0));
        }
        if (z2VarI.D(2)) {
            this.f10743e = c(context, sVarA, z2VarI.z(2, 0));
        }
        int i16 = Build.VERSION.SDK_INT;
        if (z2VarI.D(5)) {
            this.f10744f = c(context, sVarA, z2VarI.z(5, 0));
        }
        if (z2VarI.D(6)) {
            this.f10745g = c(context, sVarA, z2VarI.z(6, 0));
        }
        z2VarI.K();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f5583s;
        if (iZ != -1) {
            z2 z2Var = new z2(i15, context, context.obtainStyledAttributes(iZ, iArr2));
            if (z11 || !z2Var.D(14)) {
                zP = false;
                z10 = false;
            } else {
                zP = z2Var.p(14, false);
                z10 = true;
            }
            f(context, z2Var);
            if (z2Var.D(15)) {
                strB = z2Var.B(15);
                i14 = 13;
            } else {
                i14 = 13;
                strB = null;
            }
            strB2 = z2Var.D(i14) ? z2Var.B(i14) : null;
            z2Var.K();
        } else {
            zP = false;
            z10 = false;
            strB = null;
            strB2 = null;
        }
        z2 z2Var2 = new z2(i15, context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z11 && z2Var2.D(14)) {
            zP = z2Var2.p(14, false);
            z10 = true;
        }
        if (z2Var2.D(15)) {
            strB = z2Var2.B(15);
        }
        if (z2Var2.D(13)) {
            strB2 = z2Var2.B(13);
        }
        String str = strB2;
        if (i16 >= 28 && z2Var2.D(0) && z2Var2.s(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, z2Var2);
        z2Var2.K();
        if (!z11 && z10) {
            textView.setAllCaps(zP);
        }
        Typeface typeface = this.f10750l;
        if (typeface != null) {
            if (this.f10749k == -1) {
                textView.setTypeface(typeface, this.f10748j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            e0.d(textView, str);
        }
        if (strB != null) {
            d0.b(textView, d0.a(strB));
        }
        int[] iArr3 = f.a.f5571g;
        q0 q0Var = this.f10747i;
        Context context2 = q0Var.f10905j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = q0Var.f10904i;
        b3.q0.c(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i10);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            q0Var.f10896a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = typedArrayObtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                q0Var.f10901f = q0.b(iArr4);
                q0Var.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (q0Var.f10896a == 1) {
            if (!q0Var.f10902g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                q0Var.i(dimension2, dimension3, dimension);
            }
            q0Var.g();
        }
        if (!o3.f10886a || q0Var.f10896a == 0) {
            i11 = 0;
        } else {
            int[] iArr5 = q0Var.f10901f;
            if (iArr5.length <= 0) {
                i11 = 0;
            } else if (e0.a(textView) != -1.0f) {
                i11 = 0;
                e0.b(textView, Math.round(q0Var.f10899d), Math.round(q0Var.f10900e), Math.round(q0Var.f10898c), 0);
            } else {
                i11 = 0;
                e0.c(textView, iArr5, 0);
            }
        }
        z2 z2Var3 = new z2(i11, context, context.obtainStyledAttributes(attributeSet, iArr3));
        int iZ2 = z2Var3.z(8, -1);
        Drawable drawableB = iZ2 != -1 ? sVarA.b(context, iZ2) : null;
        int iZ3 = z2Var3.z(13, -1);
        Drawable drawableB2 = iZ3 != -1 ? sVarA.b(context, iZ3) : null;
        int iZ4 = z2Var3.z(9, -1);
        Drawable drawableB3 = iZ4 != -1 ? sVarA.b(context, iZ4) : null;
        int iZ5 = z2Var3.z(6, -1);
        Drawable drawableB4 = iZ5 != -1 ? sVarA.b(context, iZ5) : null;
        int iZ6 = z2Var3.z(10, -1);
        Drawable drawableB5 = iZ6 != -1 ? sVarA.b(context, iZ6) : null;
        int iZ7 = z2Var3.z(7, -1);
        Drawable drawableB6 = iZ7 != -1 ? sVarA.b(context, iZ7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = c0.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            c0.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = c0.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                c0.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (z2Var3.D(11)) {
            e3.o.f(textView, z2Var3.q(11));
        }
        if (z2Var3.D(12)) {
            i12 = -1;
            e3.o.g(textView, v0.c(z2Var3.v(12, -1), null));
        } else {
            i12 = -1;
        }
        int iS = z2Var3.s(15, i12);
        int iS2 = z2Var3.s(18, i12);
        int iS3 = z2Var3.s(19, i12);
        z2Var3.K();
        if (iS != i12) {
            i1.b.G(textView, iS);
        }
        if (iS2 != i12) {
            i1.b.H(textView, iS2);
        }
        if (iS3 != i12) {
            if (iS3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (iS3 != fontMetricsInt) {
                textView.setLineSpacing(iS3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void e(Context context, int i10) {
        String strB;
        z2 z2Var = new z2(0, context, context.obtainStyledAttributes(i10, f.a.f5583s));
        boolean zD = z2Var.D(14);
        TextView textView = this.f10739a;
        if (zD) {
            textView.setAllCaps(z2Var.p(14, false));
        }
        if (z2Var.D(0) && z2Var.s(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, z2Var);
        if (z2Var.D(13) && (strB = z2Var.B(13)) != null) {
            e0.d(textView, strB);
        }
        z2Var.K();
        Typeface typeface = this.f10750l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f10748j);
        }
    }

    public final void f(Context context, z2 z2Var) {
        String strB;
        this.f10748j = z2Var.v(2, this.f10748j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iV = z2Var.v(11, -1);
            this.f10749k = iV;
            if (iV != -1) {
                this.f10748j &= 2;
            }
        }
        if (!z2Var.D(10) && !z2Var.D(12)) {
            if (z2Var.D(1)) {
                this.f10751m = false;
                int iV2 = z2Var.v(1, 1);
                if (iV2 == 1) {
                    this.f10750l = Typeface.SANS_SERIF;
                    return;
                } else if (iV2 == 2) {
                    this.f10750l = Typeface.SERIF;
                    return;
                } else {
                    if (iV2 != 3) {
                        return;
                    }
                    this.f10750l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f10750l = null;
        int i11 = z2Var.D(12) ? 12 : 10;
        int i12 = this.f10749k;
        int i13 = this.f10748j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceU = z2Var.u(i11, this.f10748j, new a0(this, i12, i13, new WeakReference(this.f10739a)));
                if (typefaceU != null) {
                    if (i10 < 28 || this.f10749k == -1) {
                        this.f10750l = typefaceU;
                    } else {
                        this.f10750l = f0.a(Typeface.create(typefaceU, 0), this.f10749k, (this.f10748j & 2) != 0);
                    }
                }
                this.f10751m = this.f10750l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f10750l != null || (strB = z2Var.B(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f10749k == -1) {
            this.f10750l = Typeface.create(strB, this.f10748j);
        } else {
            this.f10750l = f0.a(Typeface.create(strB, 0), this.f10749k, (this.f10748j & 2) != 0);
        }
    }
}
