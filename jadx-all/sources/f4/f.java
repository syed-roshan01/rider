package f4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b3.q0;
import java.lang.reflect.Field;
import java.util.HashMap;
import l.o2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q {
    public static final String[] E = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final o2 F;
    public static final o2 G;
    public static final o2 H;
    public static final o2 I;
    public static final o2 J;

    static {
        new b(PointF.class, "boundsOrigin").f6145a = new Rect();
        F = new o2(PointF.class, "topLeft", 1);
        G = new o2(PointF.class, "bottomRight", 2);
        H = new o2(PointF.class, "bottomRight", 3);
        I = new o2(PointF.class, "topLeft", 4);
        J = new o2(PointF.class, "position", 5);
    }

    public static void I(x xVar) {
        View view = xVar.f6224b;
        Field field = q0.f2670a;
        if (!b3.e0.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = xVar.f6223a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", xVar.f6224b.getParent());
    }

    @Override // f4.q
    public final void e(x xVar) {
        I(xVar);
    }

    @Override // f4.q
    public final void h(x xVar) {
        I(xVar);
    }

    @Override // f4.q
    public final Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        f fVar;
        Animator animatorOfObject;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        HashMap map = xVar.f6223a;
        HashMap map2 = xVar2.f6223a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i10 = 0;
        } else {
            i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i23 = i10;
        if (i23 <= 0) {
            return null;
        }
        View view = xVar2.f6224b;
        z.a(view, i11, i13, i15, i17);
        if (i23 != 2) {
            fVar = this;
            if (i11 == i12 && i13 == i14) {
                fVar.A.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, H, (TypeConverter) null, x9.v.w(i15, i17, i16, i18));
            } else {
                fVar.A.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, I, (TypeConverter) null, x9.v.w(i11, i13, i12, i14));
            }
        } else if (i19 == i21 && i20 == i22) {
            fVar = this;
            fVar.A.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, J, (TypeConverter) null, x9.v.w(i11, i13, i12, i14));
        } else {
            fVar = this;
            e eVar = new e();
            eVar.f6156e = view;
            fVar.A.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, F, (TypeConverter) null, x9.v.w(i11, i13, i12, i14));
            fVar.A.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, G, (TypeConverter) null, x9.v.w(i15, i17, i16, i18));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new c(eVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            o7.d0.k0(viewGroup4, true);
            fVar.a(new d(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // f4.q
    public final String[] q() {
        return E;
    }
}
