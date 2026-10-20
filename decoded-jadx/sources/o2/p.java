package o2;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.i0;
import androidx.activity.j0;
import androidx.fragment.app.a0;
import com.ride.accepter.R;
import java.util.UUID;
import u1.z2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.activity.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c9.a f12490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f12491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f12492f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f12493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12494o;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(c9.a aVar, o oVar, View view, m2.l lVar, m2.b bVar, UUID uuid) {
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 31) {
            oVar.getClass();
        }
        super(new ContextThemeWrapper(context, R.style.DialogWindowTheme), 0);
        this.f12490d = aVar;
        this.f12491e = oVar;
        this.f12492f = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.f12494o = window.getAttributes().softInputMode & 240;
        int i10 = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f12491e.getClass();
        o1.s.k0(window, true);
        n nVar = new n(getContext(), window);
        nVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        nVar.setClipChildren(false);
        nVar.setElevation(bVar.v(f10));
        nVar.setOutlineProvider(new z2(i10));
        this.f12493n = nVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(nVar);
        o1.s.i0(nVar, o1.s.A(view));
        i1.b.F(nVar, i1.b.p(view));
        y3.e.C0(nVar, y3.e.j0(view));
        e(this.f12490d, this.f12491e, lVar);
        i0 i0Var = this.f1421c;
        a aVar2 = new a(this, i10);
        d7.a.m(i0Var, "<this>");
        i0Var.a(this, new j0(aVar2, true));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof n) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(c9.a aVar, o oVar, m2.l lVar) {
        Window window;
        Window window2;
        this.f12490d = aVar;
        this.f12491e = oVar;
        v vVar = oVar.f12489c;
        boolean zB = j.b(this.f12492f);
        int iOrdinal = vVar.ordinal();
        int i10 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new a0();
                }
                zB = false;
            }
        }
        Window window3 = getWindow();
        d7.a.j(window3);
        window3.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = lVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                throw new a0();
            }
            i10 = 1;
        }
        n nVar = this.f12493n;
        nVar.setLayoutDirection(i10);
        if (!nVar.f12485r && (window2 = getWindow()) != null) {
            window2.setLayout(-2, -2);
        }
        nVar.f12485r = true;
        if (Build.VERSION.SDK_INT >= 31 || (window = getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(this.f12494o);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f12491e.f12488b) {
            this.f12490d.invoke();
        }
        return zOnTouchEvent;
    }
}
