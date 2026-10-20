package a4;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(e0 e0Var, int i10) {
        super(e0Var);
        this.f1187b = i10;
    }

    @Override // a4.t
    public final int b(View view) {
        int i10 = this.f1187b;
        e0 e0Var = this.f1189a;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                e0Var.getClass();
                return view.getRight() + ((f0) view.getLayoutParams()).f1108a.right + ((ViewGroup.MarginLayoutParams) f0Var).rightMargin;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                e0Var.getClass();
                return view.getBottom() + ((f0) view.getLayoutParams()).f1108a.bottom + ((ViewGroup.MarginLayoutParams) f0Var2).bottomMargin;
        }
    }

    @Override // a4.t
    public final int c(View view) {
        int i10 = this.f1187b;
        e0 e0Var = this.f1189a;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                e0Var.getClass();
                return (view.getLeft() - ((f0) view.getLayoutParams()).f1108a.left) - ((ViewGroup.MarginLayoutParams) f0Var).leftMargin;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                e0Var.getClass();
                return (view.getTop() - ((f0) view.getLayoutParams()).f1108a.top) - ((ViewGroup.MarginLayoutParams) f0Var2).topMargin;
        }
    }

    @Override // a4.t
    public final int d() {
        int i10 = this.f1187b;
        e0 e0Var = this.f1189a;
        switch (i10) {
            case 0:
                return e0Var.f1104f - e0Var.u();
            default:
                return e0Var.f1105g - e0Var.s();
        }
    }

    @Override // a4.t
    public final int e() {
        int i10 = this.f1187b;
        e0 e0Var = this.f1189a;
        switch (i10) {
            case 0:
                return e0Var.t();
            default:
                return e0Var.v();
        }
    }

    @Override // a4.t
    public final int f() {
        int i10 = this.f1187b;
        e0 e0Var = this.f1189a;
        switch (i10) {
            case 0:
                return (e0Var.f1104f - e0Var.t()) - e0Var.u();
            default:
                return (e0Var.f1105g - e0Var.v()) - e0Var.s();
        }
    }
}
