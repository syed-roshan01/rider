package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10893g;

    public p(View view) {
        this.f10887a = 0;
        this.f10888b = -1;
        this.f10889c = view;
        this.f10890d = s.a();
    }

    public final void a() {
        View view = (View) this.f10889c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((t2) this.f10891e) != null) {
                if (((t2) this.f10893g) == null) {
                    this.f10893g = new t2();
                }
                t2 t2Var = (t2) this.f10893g;
                t2Var.f10942c = null;
                t2Var.f10941b = false;
                t2Var.f10943d = null;
                t2Var.f10940a = false;
                Field field = b3.q0.f2670a;
                ColorStateList colorStateListG = b3.h0.g(view);
                if (colorStateListG != null) {
                    t2Var.f10941b = true;
                    t2Var.f10942c = colorStateListG;
                }
                PorterDuff.Mode modeH = b3.h0.h(view);
                if (modeH != null) {
                    t2Var.f10940a = true;
                    t2Var.f10943d = modeH;
                }
                if (t2Var.f10941b || t2Var.f10940a) {
                    s.d(background, t2Var, view.getDrawableState());
                    return;
                }
            }
            t2 t2Var2 = (t2) this.f10892f;
            if (t2Var2 != null) {
                s.d(background, t2Var2, view.getDrawableState());
                return;
            }
            t2 t2Var3 = (t2) this.f10891e;
            if (t2Var3 != null) {
                s.d(background, t2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        Object obj = this.f10892f;
        if (((t2) obj) != null) {
            return (ColorStateList) ((t2) obj).f10942c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        Object obj = this.f10892f;
        if (((t2) obj) != null) {
            return (PorterDuff.Mode) ((t2) obj).f10943d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListH;
        Object obj = this.f10889c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = f.a.f5585u;
        z2 z2VarI = z2.I(context, attributeSet, iArr, i10);
        b3.q0.c(view, view.getContext(), iArr, attributeSet, (TypedArray) z2VarI.f10984c, i10);
        try {
            if (z2VarI.D(0)) {
                this.f10888b = z2VarI.z(0, -1);
                s sVar = (s) this.f10890d;
                Context context2 = ((View) obj).getContext();
                int i11 = this.f10888b;
                synchronized (sVar) {
                    colorStateListH = sVar.f10925a.h(context2, i11);
                }
                if (colorStateListH != null) {
                    f(colorStateListH);
                }
            }
            if (z2VarI.D(1)) {
                b3.h0.q((View) obj, z2VarI.q(1));
            }
            if (z2VarI.D(2)) {
                b3.h0.r((View) obj, v0.c(z2VarI.v(2, -1), null));
            }
            z2VarI.K();
        } catch (Throwable th) {
            z2VarI.K();
            throw th;
        }
    }

    public final void e(int i10) {
        ColorStateList colorStateListH;
        this.f10888b = i10;
        s sVar = (s) this.f10890d;
        if (sVar != null) {
            Context context = ((View) this.f10889c).getContext();
            synchronized (sVar) {
                colorStateListH = sVar.f10925a.h(context, i10);
            }
        } else {
            colorStateListH = null;
        }
        f(colorStateListH);
        a();
    }

    public final void f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((t2) this.f10891e) == null) {
                this.f10891e = new t2();
            }
            Object obj = this.f10891e;
            ((t2) obj).f10942c = colorStateList;
            ((t2) obj).f10941b = true;
        } else {
            this.f10891e = null;
        }
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (((t2) this.f10892f) == null) {
            this.f10892f = new t2();
        }
        t2 t2Var = (t2) this.f10892f;
        t2Var.f10942c = colorStateList;
        t2Var.f10941b = true;
        a();
    }

    public final void h(PorterDuff.Mode mode) {
        if (((t2) this.f10892f) == null) {
            this.f10892f = new t2();
        }
        t2 t2Var = (t2) this.f10892f;
        t2Var.f10943d = mode;
        t2Var.f10940a = true;
        a();
    }

    public final String toString() {
        switch (this.f10887a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f10889c) + ", mProviderPackage: " + ((String) this.f10890d) + ", mQuery: " + ((String) this.f10891e) + ", mCertificates:");
                for (int i10 = 0; i10 < ((List) this.f10892f).size(); i10++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f10892f).get(i10);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f10888b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public p(String str, String str2, String str3, List list) {
        this.f10887a = 1;
        str.getClass();
        this.f10889c = str;
        str2.getClass();
        this.f10890d = str2;
        this.f10891e = str3;
        list.getClass();
        this.f10892f = list;
        this.f10888b = 0;
        this.f10893g = str + "-" + str2 + "-" + str3;
    }
}
