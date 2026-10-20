package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new d.a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f1854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1856f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CharSequence f1859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f1861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f1862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f1863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f1864u;

    public b(a aVar) {
        int size = aVar.f1832a.size();
        this.f1851a = new int[size * 6];
        if (!aVar.f1838g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1852b = new ArrayList(size);
        this.f1853c = new int[size];
        this.f1854d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            g1 g1Var = (g1) aVar.f1832a.get(i11);
            int i12 = i10 + 1;
            this.f1851a[i10] = g1Var.f1916a;
            ArrayList arrayList = this.f1852b;
            d0 d0Var = g1Var.f1917b;
            arrayList.add(d0Var != null ? d0Var.mWho : null);
            int[] iArr = this.f1851a;
            iArr[i12] = g1Var.f1918c ? 1 : 0;
            iArr[i10 + 2] = g1Var.f1919d;
            iArr[i10 + 3] = g1Var.f1920e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = g1Var.f1921f;
            i10 += 6;
            iArr[i13] = g1Var.f1922g;
            this.f1853c[i11] = g1Var.f1923h.ordinal();
            this.f1854d[i11] = g1Var.f1924i.ordinal();
        }
        this.f1855e = aVar.f1837f;
        this.f1856f = aVar.f1839h;
        this.f1857n = aVar.f1849r;
        this.f1858o = aVar.f1840i;
        this.f1859p = aVar.f1841j;
        this.f1860q = aVar.f1842k;
        this.f1861r = aVar.f1843l;
        this.f1862s = aVar.f1844m;
        this.f1863t = aVar.f1845n;
        this.f1864u = aVar.f1846o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1851a);
        parcel.writeStringList(this.f1852b);
        parcel.writeIntArray(this.f1853c);
        parcel.writeIntArray(this.f1854d);
        parcel.writeInt(this.f1855e);
        parcel.writeString(this.f1856f);
        parcel.writeInt(this.f1857n);
        parcel.writeInt(this.f1858o);
        TextUtils.writeToParcel(this.f1859p, parcel, 0);
        parcel.writeInt(this.f1860q);
        TextUtils.writeToParcel(this.f1861r, parcel, 0);
        parcel.writeStringList(this.f1862s);
        parcel.writeStringList(this.f1863t);
        parcel.writeInt(this.f1864u ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1851a = parcel.createIntArray();
        this.f1852b = parcel.createStringArrayList();
        this.f1853c = parcel.createIntArray();
        this.f1854d = parcel.createIntArray();
        this.f1855e = parcel.readInt();
        this.f1856f = parcel.readString();
        this.f1857n = parcel.readInt();
        this.f1858o = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1859p = (CharSequence) creator.createFromParcel(parcel);
        this.f1860q = parcel.readInt();
        this.f1861r = (CharSequence) creator.createFromParcel(parcel);
        this.f1862s = parcel.createStringArrayList();
        this.f1863t = parcel.createStringArrayList();
        this.f1864u = parcel.readInt() != 0;
    }
}
