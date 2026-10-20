package k;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import b3.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l implements w2.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f8627u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f8629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f8632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f8633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f8636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f8637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f8639l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f8646s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8640m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8641n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8642o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8643p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f8644q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f8645r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8647t = false;

    public l(Context context) {
        Resources resources;
        int identifier;
        boolean z10 = false;
        this.f8628a = context;
        Resources resources2 = context.getResources();
        this.f8629b = resources2;
        this.f8633f = new ArrayList();
        this.f8634g = new ArrayList();
        this.f8635h = true;
        this.f8636i = new ArrayList();
        this.f8637j = new ArrayList();
        this.f8638k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : s0.b(viewConfiguration)) {
                z10 = true;
            }
        }
        this.f8631d = z10;
    }

    public final m a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f8627u[i14] << 16) | (65535 & i12);
        m mVar = new m(this, i10, i11, i12, i15, charSequence);
        ArrayList arrayList = this.f8633f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((m) arrayList.get(size)).f8651d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, mVar);
                o(true);
                return mVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, mVar);
        o(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f8628a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m mVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            mVarA.setIcon(resolveInfo.loadIcon(packageManager));
            mVarA.f8654g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = mVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(s sVar, Context context) {
        this.f8645r.add(new WeakReference(sVar));
        sVar.i(context, this);
        this.f8638k = true;
    }

    public final void c(boolean z10) {
        if (this.f8643p) {
            return;
        }
        this.f8643p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8645r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            s sVar = (s) weakReference.get();
            if (sVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                sVar.c(this, z10);
            }
        }
        this.f8643p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f8646s;
        if (mVar != null) {
            d(mVar);
        }
        this.f8633f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f8639l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8645r;
        boolean zD = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f8646s == mVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                s sVar = (s) weakReference.get();
                if (sVar != null) {
                    zD = sVar.d(mVar);
                    if (zD) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zD) {
                this.f8646s = null;
            }
        }
        return zD;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f8632e;
        return jVar != null && jVar.g(menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8645r;
        boolean zA = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            s sVar = (s) weakReference.get();
            if (sVar != null) {
                zA = sVar.a(mVar);
                if (zA) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zA) {
            this.f8646s = mVar;
        }
        return zA;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f8648a == i10) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f8662o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final m g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f8644q;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean zM = m();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            char c10 = zM ? mVar.f8657j : mVar.f8655h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zM && c10 == '\b' && i10 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f8633f.get(i10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList2 = this.f8633f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList2.get(i11);
                if (mVar.hasSubMenu()) {
                    mVar.f8662o.h(arrayList, i10, keyEvent);
                }
                char c10 = zM ? mVar.f8657j : mVar.f8655h;
                if ((modifiers & 69647) == ((zM ? mVar.f8658k : mVar.f8656i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if (c10 != cArr[0] && c10 != cArr[2]) {
                        if (zM && c10 == '\b') {
                            if (i10 == 67) {
                            }
                        }
                    }
                    if (mVar.isEnabled()) {
                        arrayList.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f8638k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8645r;
            boolean zJ = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                s sVar = (s) weakReference.get();
                if (sVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ |= sVar.j();
                }
            }
            ArrayList arrayList = this.f8636i;
            ArrayList arrayList2 = this.f8637j;
            if (zJ) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m mVar = (m) arrayListK.get(i10);
                    if (mVar.d()) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f8638k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public l j() {
        return this;
    }

    public final ArrayList k() {
        boolean z10 = this.f8635h;
        ArrayList arrayList = this.f8634g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f8633f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList2.get(i10);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f8635h = false;
        this.f8638k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f8647t;
    }

    public boolean m() {
        return this.f8630c;
    }

    public boolean n() {
        return this.f8631d;
    }

    public final void o(boolean z10) {
        if (this.f8640m) {
            this.f8641n = true;
            if (z10) {
                this.f8642o = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f8635h = true;
            this.f8638k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8645r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            s sVar = (s) weakReference.get();
            if (sVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                sVar.f();
            }
        }
        r();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public final boolean p(MenuItem menuItem, s sVar, int i10) {
        boolean zExpandActionView;
        m mVar = (m) menuItem;
        boolean zB = false;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mVar.f8663p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mVar)) {
            l lVar = mVar.f8661n;
            if (lVar.e(lVar, mVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = mVar.f8654g;
                if (intent != null) {
                    try {
                        lVar.f8628a.startActivity(intent);
                        zExpandActionView = true;
                    } catch (ActivityNotFoundException e4) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
                        zExpandActionView = false;
                    }
                }
                zExpandActionView = false;
            }
        } else {
            zExpandActionView = true;
        }
        if (mVar.c()) {
            zExpandActionView |= mVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (mVar.hasSubMenu()) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!mVar.hasSubMenu()) {
                w wVar = new w(this.f8628a, this, mVar);
                mVar.f8662o = wVar;
                wVar.setHeaderTitle(mVar.f8652e);
            }
            w wVar2 = mVar.f8662o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f8645r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zB = sVar != null ? sVar.b(wVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    s sVar2 = (s) weakReference.get();
                    if (sVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zB) {
                        zB = sVar2.b(wVar2);
                    }
                }
            }
            zExpandActionView |= zB;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return p(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        m mVarG = g(i10, keyEvent);
        boolean zP = mVarG != null ? p(mVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i10, CharSequence charSequence, int i11, View view) {
        if (view != null) {
            this.f8639l = null;
        } else {
            if (i10 > 0) {
                this.f8639l = this.f8629b.getText(i10);
            } else if (charSequence != null) {
                this.f8639l = charSequence;
            }
            if (i11 > 0) {
                r2.k.getDrawable(this.f8628a, i11);
            }
        }
        o(false);
    }

    public final void r() {
        this.f8640m = false;
        if (this.f8641n) {
            this.f8641n = false;
            o(this.f8642o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((m) arrayList.get(i12)).f8649b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((m) arrayList.get(i12)).f8649b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f8633f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((m) arrayList.get(i11)).f8648a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f8633f;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            o(true);
        }
    }

    public final void s() {
        if (this.f8640m) {
            return;
        }
        this.f8640m = true;
        this.f8641n = false;
        this.f8642o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f8649b == i10) {
                mVar.f8671x = (mVar.f8671x & (-5)) | (z11 ? 4 : 0);
                mVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f8647t = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f8649b == i10) {
                mVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f8633f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f8649b == i10) {
                int i12 = mVar.f8671x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                mVar.f8671x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f8630c = z10;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8633f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f8629b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f8629b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        m mVarA = a(i10, i11, i12, charSequence);
        w wVar = new w(this.f8628a, this, mVarA);
        mVarA.f8662o = wVar;
        wVar.setHeaderTitle(mVarA.f8652e);
        return wVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f8629b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f8629b.getString(i13));
    }
}
