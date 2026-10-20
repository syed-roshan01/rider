package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10862d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f10864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f10865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ride.accepter.R.attr.autoCompleteTextViewStyle);
        s2.a(context);
        r2.a(this, getContext());
        z2 z2VarI = z2.I(getContext(), attributeSet, f10862d, com.ride.accepter.R.attr.autoCompleteTextViewStyle);
        if (z2VarI.D(0)) {
            setDropDownBackgroundDrawable(z2VarI.t(0));
        }
        z2VarI.K();
        p pVar = new p(this);
        this.f10863a = pVar;
        pVar.d(attributeSet, com.ride.accepter.R.attr.autoCompleteTextViewStyle);
        g0 g0Var = new g0(this);
        this.f10864b = g0Var;
        g0Var.d(attributeSet, com.ride.accepter.R.attr.autoCompleteTextViewStyle);
        g0Var.b();
        t tVar = new t((EditText) this);
        this.f10865c = tVar;
        TypedArray typedArrayObtainStyledAttributes = ((EditText) tVar.f10928b).getContext().obtainStyledAttributes(attributeSet, f.a.f5571g, com.ride.accepter.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((x9.v) ((k3.b) tVar.f10929c).f9722d).I(z10);
            KeyListener keyListener = getKeyListener();
            boolean z11 = !(keyListener instanceof NumberKeyListener);
            if (z11) {
                boolean zIsFocusable = super.isFocusable();
                boolean zIsClickable = super.isClickable();
                boolean zIsLongClickable = super.isLongClickable();
                int inputType = super.getInputType();
                KeyListener keyListenerU = z11 ? ((x9.v) ((k3.b) tVar.f10929c).f9722d).u(keyListener) : keyListener;
                if (keyListenerU == keyListener) {
                    return;
                }
                super.setKeyListener(keyListenerU);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f10863a;
        if (pVar != null) {
            pVar.a();
        }
        g0 g0Var = this.f10864b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof e3.r ? ((e3.r) customSelectionActionModeCallback).f5119a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f10863a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f10863a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t2 t2Var = this.f10864b.f10746h;
        if (t2Var != null) {
            return (ColorStateList) t2Var.f10942c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t2 t2Var = this.f10864b.f10746h;
        if (t2Var != null) {
            return (PorterDuff.Mode) t2Var.f10943d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        k3.b bVar = (k3.b) this.f10865c.f10929c;
        if (inputConnectionOnCreateInputConnection != null) {
            return ((x9.v) bVar.f9722d).E(inputConnectionOnCreateInputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f10863a;
        if (pVar != null) {
            pVar.f10888b = -1;
            pVar.f(null);
            pVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        p pVar = this.f10863a;
        if (pVar != null) {
            pVar.e(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10864b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g0 g0Var = this.f10864b;
        if (g0Var != null) {
            g0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i1.b.N(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(o7.d0.C(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((x9.v) ((k3.b) this.f10865c.f10929c).f9722d).I(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        t tVar = this.f10865c;
        tVar.getClass();
        if (!(keyListener instanceof NumberKeyListener)) {
            keyListener = ((x9.v) ((k3.b) tVar.f10929c).f9722d).u(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f10863a;
        if (pVar != null) {
            pVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f10863a;
        if (pVar != null) {
            pVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        g0 g0Var = this.f10864b;
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
        g0 g0Var = this.f10864b;
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
        g0 g0Var = this.f10864b;
        if (g0Var != null) {
            g0Var.e(context, i10);
        }
    }
}
