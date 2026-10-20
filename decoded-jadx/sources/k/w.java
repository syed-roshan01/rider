package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class w extends l implements SubMenu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f8706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f8707w;

    public w(Context context, l lVar, m mVar) {
        super(context);
        this.f8706v = lVar;
        this.f8707w = mVar;
    }

    @Override // k.l
    public final boolean d(m mVar) {
        return this.f8706v.d(mVar);
    }

    @Override // k.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f8706v.e(lVar, menuItem);
    }

    @Override // k.l
    public final boolean f(m mVar) {
        return this.f8706v.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f8707w;
    }

    @Override // k.l
    public final l j() {
        return this.f8706v.j();
    }

    @Override // k.l
    public final boolean l() {
        return this.f8706v.l();
    }

    @Override // k.l
    public final boolean m() {
        return this.f8706v.m();
    }

    @Override // k.l
    public final boolean n() {
        return this.f8706v.n();
    }

    @Override // k.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f8706v.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f8707w.setIcon(drawable);
        return this;
    }

    @Override // k.l, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f8706v.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        q(0, null, i10, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        q(i10, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f8707w.setIcon(i10);
        return this;
    }
}
