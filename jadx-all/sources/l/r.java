package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ride.accepter.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f10911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10915g;

    public r(x9.s sVar, String str, x9.q qVar, x9.z zVar, Map map) {
        this.f10909a = 2;
        d7.a.m(str, FirebaseAnalytics.Param.METHOD);
        this.f10910b = sVar;
        this.f10911c = str;
        this.f10912d = qVar;
        this.f10913e = zVar;
        this.f10914f = map;
    }

    public static boolean b(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i10) {
        int iC = r2.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{r2.f10917b, r2.f10919d, r2.f10918c, r2.f10921f}, new int[]{r2.b(context, R.attr.colorButtonNormal), u2.a.b(iC, i10), u2.a.b(iC, i10), i10});
    }

    public static LayerDrawable f(w1 w1Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableE = w1Var.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = w1Var.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void j(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterG;
        int[] iArr = v0.f10949a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = s.f10923b;
        }
        PorterDuff.Mode mode2 = s.f10923b;
        synchronized (s.class) {
            porterDuffColorFilterG = w1.g(i10, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public final void a(String str, String str2) {
        Map map = (Map) this.f10915g;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final l5.i c() {
        String strJ = ((String) this.f10910b) == null ? " transportName" : "";
        if (((l5.m) this.f10912d) == null) {
            strJ = strJ.concat(" encodedPayload");
        }
        if (((Long) this.f10913e) == null) {
            strJ = q.j(strJ, " eventMillis");
        }
        if (((Long) this.f10914f) == null) {
            strJ = q.j(strJ, " uptimeMillis");
        }
        if (((Map) this.f10915g) == null) {
            strJ = q.j(strJ, " autoMetadata");
        }
        if (strJ.isEmpty()) {
            return new l5.i((String) this.f10910b, (Integer) this.f10911c, (l5.m) this.f10912d, ((Long) this.f10913e).longValue(), ((Long) this.f10914f).longValue(), (Map) this.f10915g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }

    public final x9.c d() {
        x9.c cVar = (x9.c) this.f10915g;
        if (cVar != null) {
            return cVar;
        }
        x9.c cVar2 = x9.c.f16358n;
        x9.c cVarL = q8.k.l((x9.q) this.f10912d);
        this.f10915g = cVarL;
        return cVarL;
    }

    public final ColorStateList g(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return r2.k.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return r2.k.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, r2.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return e(context, r2.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return r2.k.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f10911c, i10)) {
                return r2.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f10914f, i10)) {
                return r2.k.getColorStateList(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f10915g, i10)) {
                return r2.k.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return r2.k.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = r2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = r2.f10917b;
            iArr2[0] = r2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = r2.f10920e;
            iArr2[1] = r2.c(context, R.attr.colorControlActivated);
            iArr[2] = r2.f10921f;
            iArr2[2] = r2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = r2.f10917b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = r2.f10920e;
            iArr2[1] = r2.c(context, R.attr.colorControlActivated);
            iArr[2] = r2.f10921f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final x9.y h() {
        x9.y yVar = new x9.y();
        yVar.f16504d = new LinkedHashMap();
        yVar.f16501a = (x9.s) this.f10910b;
        yVar.f16502b = (String) this.f10911c;
        yVar.f16504d = ((Map) this.f10914f).isEmpty() ? new LinkedHashMap() : r8.v.I0((Map) this.f10914f);
        yVar.f16503c = ((x9.q) this.f10912d).k();
        return yVar;
    }

    public final void i(l5.m mVar) {
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.f10912d = mVar;
    }

    public final String toString() {
        switch (this.f10909a) {
            case 2:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f10911c);
                sb.append(", url=");
                sb.append((x9.s) this.f10910b);
                if (((x9.q) this.f10912d).size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = ((x9.q) this.f10912d).iterator();
                    int i10 = 0;
                    while (true) {
                        o0.b bVar = (o0.b) it;
                        if (bVar.hasNext()) {
                            Object next = bVar.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                d7.t.u0();
                                throw null;
                            }
                            q8.f fVar = (q8.f) next;
                            String str = (String) fVar.f13225a;
                            String str2 = (String) fVar.f13226b;
                            if (i10 > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i10 = i11;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!((Map) this.f10914f).isEmpty()) {
                    sb.append(", tags=");
                    sb.append((Map) this.f10914f);
                }
                sb.append('}');
                String string = sb.toString();
                d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.io.Serializable] */
    public r(int i10) {
        this.f10909a = i10;
        if (i10 != 1) {
            this.f10910b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            this.f10911c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            this.f10912d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            this.f10913e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            this.f10914f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            this.f10915g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
        }
    }
}
