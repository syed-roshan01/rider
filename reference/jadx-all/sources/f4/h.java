package f4;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ride.accepter.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q {
    public static final String[] F = {"android:visibility:visibility", "android:visibility:parent"};
    public final int E;

    public h(int i10) {
        this.E = 3;
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.E = i10;
    }

    public static void I(x xVar) {
        int visibility = xVar.f6224b.getVisibility();
        HashMap map = xVar.f6223a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f6224b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static h0 K(x xVar, x xVar2) {
        h0 h0Var = new h0();
        h0Var.f6172a = false;
        h0Var.f6173b = false;
        if (xVar != null) {
            HashMap map = xVar.f6223a;
            if (map.containsKey("android:visibility:visibility")) {
                h0Var.f6174c = ((Integer) map.get("android:visibility:visibility")).intValue();
                h0Var.f6176e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                h0Var.f6174c = -1;
                h0Var.f6176e = null;
            }
        } else {
            h0Var.f6174c = -1;
            h0Var.f6176e = null;
        }
        if (xVar2 != null) {
            HashMap map2 = xVar2.f6223a;
            if (map2.containsKey("android:visibility:visibility")) {
                h0Var.f6175d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                h0Var.f6177f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                h0Var.f6175d = -1;
                h0Var.f6177f = null;
            }
        } else {
            h0Var.f6175d = -1;
            h0Var.f6177f = null;
        }
        if (xVar != null && xVar2 != null) {
            int i10 = h0Var.f6174c;
            int i11 = h0Var.f6175d;
            if (i10 != i11 || h0Var.f6176e != h0Var.f6177f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        h0Var.f6173b = false;
                        h0Var.f6172a = true;
                    } else if (i11 == 0) {
                        h0Var.f6173b = true;
                        h0Var.f6172a = true;
                    }
                } else if (h0Var.f6177f == null) {
                    h0Var.f6173b = false;
                    h0Var.f6172a = true;
                } else if (h0Var.f6176e == null) {
                    h0Var.f6173b = true;
                    h0Var.f6172a = true;
                }
            }
        } else if (xVar == null && h0Var.f6175d == 0) {
            h0Var.f6173b = true;
            h0Var.f6172a = true;
        } else if (xVar2 == null && h0Var.f6174c == 0) {
            h0Var.f6173b = false;
            h0Var.f6172a = true;
        }
        return h0Var;
    }

    public final ObjectAnimator J(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        z.f6227a.M(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, z.f6228b, f11);
        objectAnimatorOfFloat.addListener(new a4.h(view));
        a(new g(0, this, view));
        return objectAnimatorOfFloat;
    }

    @Override // f4.q
    public final void e(x xVar) {
        I(xVar);
    }

    @Override // f4.q
    public final void h(x xVar) {
        I(xVar);
        xVar.f6223a.put("android:fade:transitionAlpha", Float.valueOf(z.f6227a.L(xVar.f6224b)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0213  */
    /* JADX WARN: Code duplicated, block: B:90:0x0223  */
    /* JADX WARN: Code duplicated, block: B:93:0x022a  */
    @Override // f4.q
    public final Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        boolean z10;
        View view;
        int i10;
        Object obj;
        View view2;
        float f10;
        View view3;
        int id;
        ImageView imageView;
        boolean z11;
        boolean zIsAttachedToWindow;
        boolean z12;
        ViewGroup viewGroup2;
        int i11;
        int iRound;
        Bitmap bitmapCreateBitmap;
        float f11;
        float fFloatValue;
        ObjectAnimator objectAnimatorJ;
        Float f12;
        h0 h0VarK = K(xVar, xVar2);
        if (h0VarK.f6172a && (h0VarK.f6176e != null || h0VarK.f6177f != null)) {
            boolean z13 = false;
            if (h0VarK.f6173b) {
                if ((this.E & 1) != 1 || xVar2 == null) {
                    objectAnimatorJ = null;
                } else {
                    View view4 = xVar2.f6224b;
                    if (xVar == null) {
                        View view5 = (View) view4.getParent();
                        if (K(o(view5, false), r(view5, false)).f6172a) {
                            objectAnimatorJ = null;
                        }
                    }
                    float fFloatValue2 = (xVar == null || (f12 = (Float) xVar.f6223a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f12.floatValue();
                    objectAnimatorJ = J(view4, fFloatValue2 != 1.0f ? fFloatValue2 : 0.0f, 1.0f);
                }
                return objectAnimatorJ;
            }
            int i12 = h0VarK.f6175d;
            if ((this.E & 2) == 2 && xVar != null) {
                View view6 = xVar2 != null ? xVar2.f6224b : null;
                View view7 = xVar.f6224b;
                View view8 = (View) view7.getTag(R.id.save_overlay_view);
                if (view8 != null) {
                    xVar = xVar;
                    i10 = i12;
                    obj = "android:fade:transitionAlpha";
                    f10 = 1.0f;
                    z13 = true;
                    view2 = null;
                } else {
                    if (view6 == null || view6.getParent() == null) {
                        if (view6 != null) {
                            z10 = false;
                        }
                        view = null;
                        if (!z10) {
                            i10 = i12;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                            view8 = view6;
                            view2 = view;
                            f10 = 1.0f;
                            z13 = false;
                        } else if (view7.getParent() == null) {
                            xVar = xVar;
                            i10 = i12;
                            obj = "android:fade:transitionAlpha";
                            f10 = 1.0f;
                            view2 = view;
                            view8 = view7;
                        } else {
                            if (view7.getParent() instanceof View) {
                                view3 = (View) view7.getParent();
                                if (K(r(view3, true), o(view3, true)).f6172a) {
                                    i10 = i12;
                                    obj = "android:fade:transitionAlpha";
                                    view = view;
                                    id = view3.getId();
                                    if (view3.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                } else {
                                    boolean z14 = w.f6220a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                    d0 d0Var = z.f6227a;
                                    d0Var.N(view7, matrix);
                                    d0Var.O(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int iRound2 = Math.round(rectF.left);
                                    int iRound3 = Math.round(rectF.top);
                                    int iRound4 = Math.round(rectF.right);
                                    int iRound5 = Math.round(rectF.bottom);
                                    imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (w.f6220a) {
                                        z11 = !view7.isAttachedToWindow();
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    } else {
                                        z11 = false;
                                        zIsAttachedToWindow = false;
                                    }
                                    z12 = w.f6221b;
                                    if (z12 || !z11) {
                                        viewGroup2 = null;
                                        i11 = 0;
                                    } else {
                                        if (zIsAttachedToWindow) {
                                            ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                            int iIndexOfChild = viewGroup3.indexOfChild(view7);
                                            viewGroup.getOverlay().add(view7);
                                            viewGroup2 = viewGroup3;
                                            i11 = iIndexOfChild;
                                        } else {
                                            i10 = i12;
                                            obj = "android:fade:transitionAlpha";
                                            view = view;
                                            bitmapCreateBitmap = null;
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                        view8 = imageView;
                                    }
                                    i10 = i12;
                                    iRound = Math.round(rectF.width());
                                    int iRound6 = Math.round(rectF.height());
                                    if (iRound > 0 || iRound6 <= 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                        int iRound7 = Math.round(iRound * fMin);
                                        int iRound8 = Math.round(iRound6 * fMin);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(fMin, fMin);
                                        if (w.f6222c) {
                                            Picture picture = new Picture();
                                            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                            canvasBeginRecording.concat(matrix);
                                            view7.draw(canvasBeginRecording);
                                            picture.endRecording();
                                            bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (z12 && z11) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i11);
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                    imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                    view8 = imageView;
                                }
                                view2 = view;
                                f10 = 1.0f;
                                z13 = false;
                            } else {
                                i10 = i12;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                            }
                            view8 = view6;
                            view2 = view;
                            f10 = 1.0f;
                            z13 = false;
                        }
                    } else {
                        if (i12 == 4 || view7 == view6) {
                            view = view6;
                            z10 = false;
                            view6 = null;
                        }
                        if (!z10) {
                            i10 = i12;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                            view8 = view6;
                            view2 = view;
                            f10 = 1.0f;
                            z13 = false;
                        } else if (view7.getParent() == null) {
                            xVar = xVar;
                            i10 = i12;
                            obj = "android:fade:transitionAlpha";
                            f10 = 1.0f;
                            view2 = view;
                            view8 = view7;
                        } else {
                            if (view7.getParent() instanceof View) {
                                view3 = (View) view7.getParent();
                                if (K(r(view3, true), o(view3, true)).f6172a) {
                                    boolean z15 = w.f6220a;
                                    Matrix matrix2 = new Matrix();
                                    matrix2.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                    d0 d0Var2 = z.f6227a;
                                    d0Var2.N(view7, matrix2);
                                    d0Var2.O(viewGroup, matrix2);
                                    RectF rectF2 = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix2.mapRect(rectF2);
                                    int iRound9 = Math.round(rectF2.left);
                                    int iRound10 = Math.round(rectF2.top);
                                    int iRound11 = Math.round(rectF2.right);
                                    int iRound12 = Math.round(rectF2.bottom);
                                    imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (w.f6220a) {
                                        z11 = !view7.isAttachedToWindow();
                                        zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                    } else {
                                        z11 = false;
                                        zIsAttachedToWindow = false;
                                    }
                                    z12 = w.f6221b;
                                    if (z12) {
                                        viewGroup2 = null;
                                        i11 = 0;
                                        i10 = i12;
                                        iRound = Math.round(rectF2.width());
                                        int iRound13 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        } else {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        }
                                        if (z12) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i11);
                                        }
                                    } else {
                                        viewGroup2 = null;
                                        i11 = 0;
                                        i10 = i12;
                                        iRound = Math.round(rectF2.width());
                                        int iRound14 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        } else {
                                            obj = "android:fade:transitionAlpha";
                                            bitmapCreateBitmap = null;
                                        }
                                        if (z12) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i11);
                                        }
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                    imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                    view8 = imageView;
                                } else {
                                    i10 = i12;
                                    obj = "android:fade:transitionAlpha";
                                    view = view;
                                    id = view3.getId();
                                    if (view3.getParent() == null) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                                view2 = view;
                                f10 = 1.0f;
                                z13 = false;
                            } else {
                                i10 = i12;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                            }
                            view8 = view6;
                            view2 = view;
                            f10 = 1.0f;
                            z13 = false;
                        }
                    }
                    z10 = true;
                    view6 = null;
                    view = null;
                    if (!z10) {
                        i10 = i12;
                        obj = "android:fade:transitionAlpha";
                        view = view;
                        view8 = view6;
                        view2 = view;
                        f10 = 1.0f;
                        z13 = false;
                    } else if (view7.getParent() == null) {
                        xVar = xVar;
                        i10 = i12;
                        obj = "android:fade:transitionAlpha";
                        f10 = 1.0f;
                        view2 = view;
                        view8 = view7;
                    } else {
                        if (view7.getParent() instanceof View) {
                            view3 = (View) view7.getParent();
                            if (K(r(view3, true), o(view3, true)).f6172a) {
                                boolean z16 = w.f6220a;
                                Matrix matrix3 = new Matrix();
                                matrix3.setTranslate(-view3.getScrollX(), -view3.getScrollY());
                                d0 d0Var3 = z.f6227a;
                                d0Var3.N(view7, matrix3);
                                d0Var3.O(viewGroup, matrix3);
                                RectF rectF3 = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                matrix3.mapRect(rectF3);
                                int iRound15 = Math.round(rectF3.left);
                                int iRound16 = Math.round(rectF3.top);
                                int iRound17 = Math.round(rectF3.right);
                                int iRound18 = Math.round(rectF3.bottom);
                                imageView = new ImageView(view7.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (w.f6220a) {
                                    z11 = !view7.isAttachedToWindow();
                                    zIsAttachedToWindow = viewGroup.isAttachedToWindow();
                                } else {
                                    z11 = false;
                                    zIsAttachedToWindow = false;
                                }
                                z12 = w.f6221b;
                                if (z12) {
                                    viewGroup2 = null;
                                    i11 = 0;
                                    i10 = i12;
                                    iRound = Math.round(rectF3.width());
                                    int iRound19 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z12) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i11);
                                    }
                                } else {
                                    viewGroup2 = null;
                                    i11 = 0;
                                    i10 = i12;
                                    iRound = Math.round(rectF3.width());
                                    int iRound110 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        bitmapCreateBitmap = null;
                                    }
                                    if (z12) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i11);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound18 - iRound16, 1073741824));
                                imageView.layout(iRound15, iRound16, iRound17, iRound18);
                                view8 = imageView;
                            } else {
                                i10 = i12;
                                obj = "android:fade:transitionAlpha";
                                view = view;
                                id = view3.getId();
                                if (view3.getParent() == null) {
                                    viewGroup.findViewById(id);
                                }
                            }
                            view2 = view;
                            f10 = 1.0f;
                            z13 = false;
                        } else {
                            i10 = i12;
                            obj = "android:fade:transitionAlpha";
                            view = view;
                        }
                        view8 = view6;
                        view2 = view;
                        f10 = 1.0f;
                        z13 = false;
                    }
                }
                HashMap map = xVar.f6223a;
                if (view8 != null) {
                    if (!z13) {
                        int[] iArr = (int[]) map.get("android:visibility:screenLocation");
                        int i13 = iArr[0];
                        int i14 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view8.offsetLeftAndRight((i13 - iArr2[0]) - view8.getLeft());
                        view8.offsetTopAndBottom((i14 - iArr2[1]) - view8.getTop());
                        viewGroup.getOverlay().add(view8);
                    }
                    z.f6227a.getClass();
                    Float f13 = (Float) map.get(obj);
                    if (f13 != null) {
                        fFloatValue = f13.floatValue();
                        f11 = 0.0f;
                    } else {
                        f11 = 0.0f;
                        fFloatValue = f10;
                    }
                    ObjectAnimator objectAnimatorJ2 = J(view8, fFloatValue, f11);
                    if (z13) {
                        return objectAnimatorJ2;
                    }
                    if (objectAnimatorJ2 == null) {
                        viewGroup.getOverlay().remove(view8);
                        return objectAnimatorJ2;
                    }
                    view7.setTag(R.id.save_overlay_view, view8);
                    a(new f0(this, viewGroup, view8, view7));
                    return objectAnimatorJ2;
                }
                Object obj2 = obj;
                if (view2 != null) {
                    int visibility = view2.getVisibility();
                    d0 d0Var4 = z.f6227a;
                    d0Var4.J(view2, 0);
                    d0Var4.getClass();
                    Float f14 = (Float) map.get(obj2);
                    ObjectAnimator objectAnimatorJ3 = J(view2, f14 != null ? f14.floatValue() : f10, 0.0f);
                    if (objectAnimatorJ3 != null) {
                        g0 g0Var = new g0(view2, i10);
                        objectAnimatorJ3.addListener(g0Var);
                        objectAnimatorJ3.addPauseListener(g0Var);
                        a(g0Var);
                    } else {
                        d0Var4.J(view2, visibility);
                    }
                    return objectAnimatorJ3;
                }
            }
        }
        return null;
    }

    @Override // f4.q
    public final /* bridge */ /* synthetic */ String[] q() {
        return F;
    }

    @Override // f4.q
    public final boolean s(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f6223a.containsKey("android:visibility:visibility") != xVar.f6223a.containsKey("android:visibility:visibility")) {
            return false;
        }
        h0 h0VarK = K(xVar, xVar2);
        if (h0VarK.f6172a) {
            return h0VarK.f6174c == 0 || h0VarK.f6175d == 0;
        }
        return false;
    }
}
