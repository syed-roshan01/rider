package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.ride.accepter.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static w1 f10958g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f10960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f10961b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f10962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f10964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f10957f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1 f10959h = new v1(6);

    public static synchronized w1 c() {
        try {
            if (f10958g == null) {
                f10958g = new w1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10958g;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        v1 v1Var = f10959h;
        v1Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) v1Var.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                q.l lVar = (q.l) this.f10961b.get(context);
                if (lVar == null) {
                    lVar = new q.l((Object) null);
                    this.f10961b.put(context, lVar);
                }
                lVar.f(new WeakReference(constantState), j10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i10) {
        if (this.f10962c == null) {
            this.f10962c = new TypedValue();
        }
        TypedValue typedValue = this.f10962c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j10);
        if (drawableD != null) {
            return drawableD;
        }
        LayerDrawable layerDrawableF = null;
        if (this.f10964e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableF = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableF = r.f(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableF = r.f(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableF = r.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableF != null) {
            layerDrawableF.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j10, layerDrawableF);
        }
        return layerDrawableF;
    }

    public final synchronized Drawable d(Context context, long j10) {
        q.l lVar = (q.l) this.f10961b.get(context);
        if (lVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) lVar.c(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = r.a.b(lVar.f13000b, lVar.f13002d, j10);
            if (iB >= 0) {
                Object[] objArr = lVar.f13001c;
                Object obj = objArr[iB];
                Object obj2 = q.m.f13003a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    lVar.f12999a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i10) {
        return f(context, i10);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002c, B:18:0x0036, B:20:0x003c, B:27:0x0054, B:25:0x0050, B:28:0x0059, B:32:0x0070, B:39:0x00a6, B:40:0x00cd, B:42:0x00d2, B:6:0x0006, B:8:0x0012, B:10:0x0016, B:46:0x00d8, B:47:0x00e1), top: B:50:0x0001 }] */
    public final synchronized Drawable f(Context context, int i10) {
        Drawable drawableB;
        try {
            if (!this.f10963d) {
                this.f10963d = true;
                Drawable drawableE = e(context, R.drawable.abc_vector_test);
                if (drawableE == null || (!(drawableE instanceof g4.c) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                    this.f10963d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i10);
            if (drawableB == null) {
                drawableB = r2.k.getDrawable(context, i10);
            }
            if (drawableB != null) {
                ColorStateList colorStateListH = h(context, i10);
                if (colorStateListH != null) {
                    int[] iArr = v0.f10949a;
                    drawableB = drawableB.mutate();
                    v2.b.h(drawableB, colorStateListH);
                    PorterDuff.Mode mode = null;
                    if (this.f10964e != null && i10 == R.drawable.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode != null) {
                        v2.b.i(drawableB, mode);
                    }
                } else if (this.f10964e == null) {
                    i(context, i10, drawableB);
                } else if (i10 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawableB;
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int iC = r2.c(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = s.f10923b;
                    r.j(drawableFindDrawableByLayerId, iC, mode2);
                    r.j(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), r2.c(context, R.attr.colorControlNormal), mode2);
                    r.j(layerDrawable.findDrawableByLayerId(android.R.id.progress), r2.c(context, R.attr.colorControlActivated), mode2);
                } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawableB;
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int iB = r2.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = s.f10923b;
                    r.j(drawableFindDrawableByLayerId2, iB, mode3);
                    r.j(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), r2.c(context, R.attr.colorControlActivated), mode3);
                    r.j(layerDrawable2.findDrawableByLayerId(android.R.id.progress), r2.c(context, R.attr.colorControlActivated), mode3);
                } else {
                    i(context, i10, drawableB);
                }
            }
            if (drawableB != null) {
                v0.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList h(Context context, int i10) {
        ColorStateList colorStateList;
        q.a0 a0Var;
        WeakHashMap weakHashMap = this.f10960a;
        ColorStateList colorStateListG = null;
        colorStateList = (weakHashMap == null || (a0Var = (q.a0) weakHashMap.get(context)) == null) ? null : (ColorStateList) a0Var.c(i10);
        if (colorStateList == null) {
            r rVar = this.f10964e;
            if (rVar != null) {
                colorStateListG = rVar.g(context, i10);
            }
            if (colorStateListG != null) {
                if (this.f10960a == null) {
                    this.f10960a = new WeakHashMap();
                }
                q.a0 a0Var2 = (q.a0) this.f10960a.get(context);
                if (a0Var2 == null) {
                    a0Var2 = new q.a0();
                    this.f10960a.put(context, a0Var2);
                }
                a0Var2.a(i10, colorStateListG);
            }
            colorStateList = colorStateListG;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public final boolean i(Context context, int i10, Drawable drawable) {
        int i11;
        boolean z10;
        int iRound;
        Drawable drawableMutate;
        int iC;
        r rVar = this.f10964e;
        if (rVar == null) {
            return false;
        }
        PorterDuff.Mode mode = s.f10923b;
        if (r.b((int[]) rVar.f10910b, i10)) {
            i11 = R.attr.colorControlNormal;
        } else if (r.b((int[]) rVar.f10912d, i10)) {
            i11 = R.attr.colorControlActivated;
        } else {
            if (!r.b((int[]) rVar.f10913e, i10)) {
                if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                    z10 = true;
                    iRound = Math.round(40.8f);
                    i11 = 16842800;
                } else {
                    if (i10 != R.drawable.abc_dialog_material_background) {
                        i11 = 0;
                        z10 = false;
                    }
                    iRound = -1;
                }
                if (z10) {
                    return false;
                }
                int[] iArr = v0.f10949a;
                drawableMutate = drawable.mutate();
                iC = r2.c(context, i11);
                synchronized (s.class) {
                    PorterDuffColorFilter porterDuffColorFilterG = g(iC, mode);
                }
                drawableMutate.setColorFilter(porterDuffColorFilterG);
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i11 = 16842801;
        }
        z10 = true;
        iRound = -1;
        if (z10) {
            return false;
        }
        int[] iArr2 = v0.f10949a;
        drawableMutate = drawable.mutate();
        iC = r2.c(context, i11);
        synchronized (s.class) {
            PorterDuffColorFilter porterDuffColorFilterG2 = g(iC, mode);
            drawableMutate.setColorFilter(porterDuffColorFilterG2);
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }
}
