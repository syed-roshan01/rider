package j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import b3.n;
import java.lang.reflect.Constructor;
import k.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public CharSequence A;
    public final /* synthetic */ e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f8198a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f8208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f8209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f8211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f8213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f8221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f8222y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f8223z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8199b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8200c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8201d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8202e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8203f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8204g = true;

    public d(e eVar, Menu menu) {
        this.D = eVar;
        this.f8198a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f8228c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z10 = false;
        menuItem.setChecked(this.f8216s).setVisible(this.f8217t).setEnabled(this.f8218u).setCheckable(this.f8215r >= 1).setTitleCondensed(this.f8209l).setIcon(this.f8210m);
        int i10 = this.f8219v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f8222y;
        e eVar = this.D;
        if (str != null) {
            if (eVar.f8228c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (eVar.f8229d == null) {
                eVar.f8229d = e.a(eVar.f8228c);
            }
            Object obj = eVar.f8229d;
            String str2 = this.f8222y;
            c cVar = new c();
            cVar.f8196a = obj;
            Class<?> cls = obj.getClass();
            try {
                cVar.f8197b = cls.getMethod(str2, c.f8195c);
                menuItem.setOnMenuItemClickListener(cVar);
            } catch (Exception e4) {
                StringBuilder sbR = a7.a.r("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbR.append(cls.getName());
                InflateException inflateException = new InflateException(sbR.toString());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f8215r >= 2 && (menuItem instanceof m)) {
            m mVar = (m) menuItem;
            mVar.f8671x = (mVar.f8671x & (-5)) | 4;
        }
        String str3 = this.f8221x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, e.f8224e, eVar.f8226a));
            z10 = true;
        }
        int i11 = this.f8220w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        CharSequence charSequence = this.f8223z;
        boolean z11 = menuItem instanceof w2.b;
        if (z11) {
            ((w2.b) menuItem).setContentDescription(charSequence);
        } else {
            n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z11) {
            ((w2.b) menuItem).setTooltipText(charSequence2);
        } else {
            n.m(menuItem, charSequence2);
        }
        char c10 = this.f8211n;
        int i12 = this.f8212o;
        if (z11) {
            ((w2.b) menuItem).setAlphabeticShortcut(c10, i12);
        } else {
            n.g(menuItem, c10, i12);
        }
        char c11 = this.f8213p;
        int i13 = this.f8214q;
        if (z11) {
            ((w2.b) menuItem).setNumericShortcut(c11, i13);
        } else {
            n.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z11) {
                ((w2.b) menuItem).setIconTintMode(mode);
            } else {
                n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z11) {
                ((w2.b) menuItem).setIconTintList(colorStateList);
            } else {
                n.i(menuItem, colorStateList);
            }
        }
    }
}
