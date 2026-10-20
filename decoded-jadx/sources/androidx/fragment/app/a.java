package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f1843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f1844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f1845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0 f1847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1849r;

    public a(x0 x0Var) {
        x0Var.z();
        m0 m0Var = x0Var.f2067t;
        if (m0Var != null) {
            m0Var.f1972b.getClassLoader();
        }
        this.f1832a = new ArrayList();
        this.f1846o = false;
        this.f1849r = -1;
        this.f1847p = x0Var;
    }

    @Override // androidx.fragment.app.v0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1838g) {
            return true;
        }
        x0 x0Var = this.f1847p;
        if (x0Var.f2051d == null) {
            x0Var.f2051d = new ArrayList();
        }
        x0Var.f2051d.add(this);
        return true;
    }

    public final void b(g1 g1Var) {
        this.f1832a.add(g1Var);
        g1Var.f1919d = this.f1833b;
        g1Var.f1920e = this.f1834c;
        g1Var.f1921f = this.f1835d;
        g1Var.f1922g = this.f1836e;
    }

    public final void c(int i10) {
        if (this.f1838g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f1832a.size();
            for (int i11 = 0; i11 < size; i11++) {
                g1 g1Var = (g1) this.f1832a.get(i11);
                d0 d0Var = g1Var.f1917b;
                if (d0Var != null) {
                    d0Var.mBackStackNesting += i10;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + g1Var.f1917b + " to " + g1Var.f1917b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int d(boolean z10) {
        if (this.f1848q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new q1());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1848q = true;
        boolean z11 = this.f1838g;
        x0 x0Var = this.f1847p;
        if (z11) {
            this.f1849r = x0Var.f2056i.getAndIncrement();
        } else {
            this.f1849r = -1;
        }
        x0Var.r(this, z10);
        return this.f1849r;
    }

    public final void e(int i10, d0 d0Var, String str) {
        String str2 = d0Var.mPreviousWho;
        if (str2 != null) {
            n3.c.d(d0Var, str2);
        }
        Class<?> cls = d0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = d0Var.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + d0Var + ": was " + d0Var.mTag + " now " + str);
            }
            d0Var.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + d0Var + " with tag " + str + " to container view with no id");
            }
            int i11 = d0Var.mFragmentId;
            if (i11 != 0 && i11 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + d0Var + ": was " + d0Var.mFragmentId + " now " + i10);
            }
            d0Var.mFragmentId = i10;
            d0Var.mContainerId = i10;
        }
        b(new g1(d0Var, 1));
        d0Var.mFragmentManager = this.f1847p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1839h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1849r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1848q);
            if (this.f1837f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1837f));
            }
            if (this.f1833b != 0 || this.f1834c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1833b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1834c));
            }
            if (this.f1835d != 0 || this.f1836e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1835d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1836e));
            }
            if (this.f1840i != 0 || this.f1841j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1840i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1841j);
            }
            if (this.f1842k != 0 || this.f1843l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1842k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1843l);
            }
        }
        if (this.f1832a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1832a.size();
        for (int i10 = 0; i10 < size; i10++) {
            g1 g1Var = (g1) this.f1832a.get(i10);
            switch (g1Var.f1916a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + g1Var.f1916a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(g1Var.f1917b);
            if (z10) {
                if (g1Var.f1919d != 0 || g1Var.f1920e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(g1Var.f1919d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(g1Var.f1920e));
                }
                if (g1Var.f1921f != 0 || g1Var.f1922g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(g1Var.f1921f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(g1Var.f1922g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1849r >= 0) {
            sb.append(" #");
            sb.append(this.f1849r);
        }
        if (this.f1839h != null) {
            sb.append(" ");
            sb.append(this.f1839h);
        }
        sb.append("}");
        return sb.toString();
    }
}
