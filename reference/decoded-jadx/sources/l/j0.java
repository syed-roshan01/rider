package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f10781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f10782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f10783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k.f f10785f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Future f10786n;

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f10783d == null) {
            this.f10783d = new u(this);
        }
        return this.f10783d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f10780a;
        if (pVar != null) {
            pVar.a();
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o3.f10886a) {
            return super.getAutoSizeMaxTextSize();
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            return Math.round(g0Var.f10747i.f10900e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (o3.f10886a) {
            return super.getAutoSizeMinTextSize();
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            return Math.round(g0Var.f10747i.f10899d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (o3.f10886a) {
            return super.getAutoSizeStepGranularity();
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            return Math.round(g0Var.f10747i.f10898c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (o3.f10886a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        g0 g0Var = this.f10781b;
        return g0Var != null ? g0Var.f10747i.f10901f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (o3.f10886a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            return g0Var.f10747i.f10896a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof e3.r ? ((e3.r) customSelectionActionModeCallback).f5119a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public h0 getSuperCaller() {
        if (this.f10785f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f10785f = new i0(this);
            } else {
                this.f10785f = new k.f((Object) this, 4);
            }
        }
        return this.f10785f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f10780a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f10780a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t2 t2Var = this.f10781b.f10746h;
        if (t2Var != null) {
            return (ColorStateList) t2Var.f10942c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t2 t2Var = this.f10781b.f10746h;
        if (t2Var != null) {
            return (PorterDuff.Mode) t2Var.f10943d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        o();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        t tVar;
        if (Build.VERSION.SDK_INT >= 28 || (tVar = this.f10782c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) tVar.f10929c;
        return textClassifier == null ? z.a((TextView) tVar.f10928b) : textClassifier;
    }

    public z2.b getTextMetricsParamsCompat() {
        return i1.b.t(this);
    }

    public final void o() {
        Future future = this.f10786n;
        if (future == null) {
            return;
        }
        try {
            this.f10786n = null;
            a7.a.w(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            i1.b.t(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f10781b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            z6.a.e0(editorInfo, getText());
        }
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g0 g0Var = this.f10781b;
        if (g0Var == null || o3.f10886a) {
            return;
        }
        g0Var.f10747i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        o();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        g0 g0Var = this.f10781b;
        if (g0Var == null || o3.f10886a) {
            return;
        }
        q0 q0Var = g0Var.f10747i;
        if (q0Var.f10896a != 0) {
            q0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        ((x9.v) getEmojiTextViewHelper().f10945b.f8599b).H(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (o3.f10886a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            q0 q0Var = g0Var.f10747i;
            DisplayMetrics displayMetrics = q0Var.f10905j.getResources().getDisplayMetrics();
            q0Var.i(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (q0Var.g()) {
                q0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (o3.f10886a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            q0 q0Var = g0Var.f10747i;
            q0Var.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = q0Var.f10905j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                q0Var.f10901f = q0.b(iArrCopyOf);
                if (!q0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                q0Var.f10902g = false;
            }
            if (q0Var.g()) {
                q0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (o3.f10886a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            q0 q0Var = g0Var.f10747i;
            if (i10 == 0) {
                q0Var.f10896a = 0;
                q0Var.f10899d = -1.0f;
                q0Var.f10900e = -1.0f;
                q0Var.f10898c = -1.0f;
                q0Var.f10901f = new int[0];
                q0Var.f10897b = false;
                return;
            }
            if (i10 != 1) {
                q0Var.getClass();
                throw new IllegalArgumentException(q.g("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = q0Var.f10905j.getResources().getDisplayMetrics();
            q0Var.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (q0Var.g()) {
                q0Var.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f10780a;
        if (pVar != null) {
            pVar.f10888b = -1;
            pVar.f(null);
            pVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        p pVar = this.f10780a;
        if (pVar != null) {
            pVar.e(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i1.b.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((x9.v) getEmojiTextViewHelper().f10945b.f8599b).I(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((x9.v) getEmojiTextViewHelper().f10945b.f8599b).s(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i10);
        } else {
            i1.b.G(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i10);
        } else {
            i1.b.H(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(z2.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i1.b.t(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f10780a;
        if (pVar != null) {
            pVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f10780a;
        if (pVar != null) {
            pVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        g0 g0Var = this.f10781b;
        if (g0Var.f10746h == null) {
            g0Var.f10746h = new t2();
        }
        t2 t2Var = g0Var.f10746h;
        t2Var.f10942c = colorStateList;
        t2Var.f10941b = colorStateList != null;
        g0Var.f10740b = t2Var;
        g0Var.f10741c = t2Var;
        g0Var.f10742d = t2Var;
        g0Var.f10743e = t2Var;
        g0Var.f10744f = t2Var;
        g0Var.f10745g = t2Var;
        g0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        g0 g0Var = this.f10781b;
        if (g0Var.f10746h == null) {
            g0Var.f10746h = new t2();
        }
        t2 t2Var = g0Var.f10746h;
        t2Var.f10943d = mode;
        t2Var.f10940a = mode != null;
        g0Var.f10740b = t2Var;
        g0Var.f10741c = t2Var;
        g0Var.f10742d = t2Var;
        g0Var.f10743e = t2Var;
        g0Var.f10744f = t2Var;
        g0Var.f10745g = t2Var;
        g0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        t tVar;
        if (Build.VERSION.SDK_INT >= 28 || (tVar = this.f10782c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            tVar.f10929c = textClassifier;
        }
    }

    public void setTextFuture(Future<z2.c> future) {
        this.f10786n = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(z2.b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bVar.f17196b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        e3.n.h(this, i10);
        getPaint().set(bVar.f17195a);
        e3.o.e(this, bVar.f17197c);
        e3.o.h(this, bVar.f17198d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = o3.f10886a;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        g0 g0Var = this.f10781b;
        if (g0Var == null || z10) {
            return;
        }
        q0 q0Var = g0Var.f10747i;
        if (q0Var.f10896a != 0) {
            return;
        }
        q0Var.f(i10, f10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f10784e) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            k.f fVar = u2.f.f15400a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f10784e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f10784e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s2.a(context);
        this.f10784e = false;
        this.f10785f = null;
        r2.a(this, getContext());
        p pVar = new p(this);
        this.f10780a = pVar;
        pVar.d(attributeSet, i10);
        g0 g0Var = new g0(this);
        this.f10781b = g0Var;
        g0Var.d(attributeSet, i10);
        g0Var.b();
        this.f10782c = new t((TextView) this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? o7.d0.C(context, i10) : null, i11 != 0 ? o7.d0.C(context, i11) : null, i12 != 0 ? o7.d0.C(context, i12) : null, i13 != 0 ? o7.d0.C(context, i13) : null);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? o7.d0.C(context, i10) : null, i11 != 0 ? o7.d0.C(context, i11) : null, i12 != 0 ? o7.d0.C(context, i12) : null, i13 != 0 ? o7.d0.C(context, i13) : null);
        g0 g0Var = this.f10781b;
        if (g0Var != null) {
            g0Var.b();
        }
    }
}
