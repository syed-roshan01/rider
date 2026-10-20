package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements w2.b {
    public MenuItem.OnActionExpandListener A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f8653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f8654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f8655h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f8657j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8659l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f8661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f8662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f8664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8665r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f8673z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8656i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8658k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8660m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f8666s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f8667t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8668u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8669v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8670w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8671x = 16;
    public boolean B = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8672y = 0;

    public m(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f8661n = lVar;
        this.f8648a = i11;
        this.f8649b = i10;
        this.f8650c = i12;
        this.f8651d = i13;
        this.f8652e = charSequence;
    }

    public static void a(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f8670w && (this.f8668u || this.f8669v)) {
            drawable = drawable.mutate();
            if (this.f8668u) {
                v2.b.h(drawable, this.f8666s);
            }
            if (this.f8669v) {
                v2.b.i(drawable, this.f8667t);
            }
            this.f8670w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f8672y & 8) == 0 || this.f8673z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f8672y & 8) == 0) {
            return false;
        }
        if (this.f8673z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f8661n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f8671x & 32) == 32;
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f8671x |= 32;
        } else {
            this.f8671x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f8661n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f8673z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f8658k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f8657j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f8664q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f8649b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f8659l;
        if (drawable != null) {
            return b(drawable);
        }
        int i10 = this.f8660m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableC = d0.C(this.f8661n.f8628a, i10);
        this.f8660m = 0;
        this.f8659l = drawableC;
        return b(drawableC);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f8666s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f8667t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f8654g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f8648a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f8656i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f8655h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f8650c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f8662o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f8652e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8653f;
        return charSequence != null ? charSequence : this.f8652e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f8665r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f8662o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f8671x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f8671x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f8671x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f8671x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f8673z = view;
        if (view != null && view.getId() == -1 && (i10 = this.f8648a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f8661n;
        lVar.f8638k = true;
        lVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f8657j == c10) {
            return this;
        }
        this.f8657j = Character.toLowerCase(c10);
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f8671x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f8671x = i11;
        if (i10 != i11) {
            this.f8661n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f8671x;
        if ((i10 & 4) != 0) {
            l lVar = this.f8661n;
            lVar.getClass();
            ArrayList arrayList = lVar.f8633f;
            int size = arrayList.size();
            lVar.s();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList.get(i11);
                if (mVar.f8649b == this.f8649b && (mVar.f8671x & 4) != 0 && mVar.isCheckable()) {
                    boolean z11 = mVar == this;
                    int i12 = mVar.f8671x;
                    int i13 = (z11 ? 2 : 0) | (i12 & (-3));
                    mVar.f8671x = i13;
                    if (i12 != i13) {
                        mVar.f8661n.o(false);
                    }
                }
            }
            lVar.r();
        } else {
            int i14 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f8671x = i14;
            if (i10 != i14) {
                this.f8661n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f8671x |= 16;
        } else {
            this.f8671x &= -17;
        }
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f8660m = 0;
        this.f8659l = drawable;
        this.f8670w = true;
        this.f8661n.o(false);
        return this;
    }

    @Override // w2.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8666s = colorStateList;
        this.f8668u = true;
        this.f8670w = true;
        this.f8661n.o(false);
        return this;
    }

    @Override // w2.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8667t = mode;
        this.f8669v = true;
        this.f8670w = true;
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f8654g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f8655h == c10) {
            return this;
        }
        this.f8655h = c10;
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8663p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f8655h = c10;
        this.f8657j = Character.toLowerCase(c11);
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f8672y = i10;
        l lVar = this.f8661n;
        lVar.f8638k = true;
        lVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8652e = charSequence;
        this.f8661n.o(false);
        w wVar = this.f8662o;
        if (wVar != null) {
            wVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8653f = charSequence;
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f8671x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f8671x = i11;
        if (i10 != i11) {
            l lVar = this.f8661n;
            lVar.f8635h = true;
            lVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f8652e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // w2.b, android.view.MenuItem
    public final w2.b setContentDescription(CharSequence charSequence) {
        this.f8664q = charSequence;
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f8659l = null;
        this.f8660m = i10;
        this.f8670w = true;
        this.f8661n.o(false);
        return this;
    }

    @Override // w2.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f8655h == c10 && this.f8656i == i10) {
            return this;
        }
        this.f8655h = c10;
        this.f8656i = KeyEvent.normalizeMetaState(i10);
        this.f8661n.o(false);
        return this;
    }

    @Override // w2.b, android.view.MenuItem
    public final w2.b setTooltipText(CharSequence charSequence) {
        this.f8665r = charSequence;
        this.f8661n.o(false);
        return this;
    }

    @Override // w2.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f8657j == c10 && this.f8658k == i10) {
            return this;
        }
        this.f8657j = Character.toLowerCase(c10);
        this.f8658k = KeyEvent.normalizeMetaState(i10);
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f8655h = c10;
        this.f8656i = KeyEvent.normalizeMetaState(i10);
        this.f8657j = Character.toLowerCase(c11);
        this.f8658k = KeyEvent.normalizeMetaState(i11);
        this.f8661n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f8661n.f8628a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f8661n.f8628a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f8673z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f8648a) > 0) {
            viewInflate.setId(i11);
        }
        l lVar = this.f8661n;
        lVar.f8638k = true;
        lVar.o(true);
        return this;
    }
}
