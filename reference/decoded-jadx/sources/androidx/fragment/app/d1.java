package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new d.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1885f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bundle f1889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f1892t;

    public d1(d0 d0Var) {
        this.f1880a = d0Var.getClass().getName();
        this.f1881b = d0Var.mWho;
        this.f1882c = d0Var.mFromLayout;
        this.f1883d = d0Var.mFragmentId;
        this.f1884e = d0Var.mContainerId;
        this.f1885f = d0Var.mTag;
        this.f1886n = d0Var.mRetainInstance;
        this.f1887o = d0Var.mRemoving;
        this.f1888p = d0Var.mDetached;
        this.f1889q = d0Var.mArguments;
        this.f1890r = d0Var.mHidden;
        this.f1891s = d0Var.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1880a);
        sb.append(" (");
        sb.append(this.f1881b);
        sb.append(")}:");
        if (this.f1882c) {
            sb.append(" fromLayout");
        }
        int i10 = this.f1884e;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f1885f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1886n) {
            sb.append(" retainInstance");
        }
        if (this.f1887o) {
            sb.append(" removing");
        }
        if (this.f1888p) {
            sb.append(" detached");
        }
        if (this.f1890r) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1880a);
        parcel.writeString(this.f1881b);
        parcel.writeInt(this.f1882c ? 1 : 0);
        parcel.writeInt(this.f1883d);
        parcel.writeInt(this.f1884e);
        parcel.writeString(this.f1885f);
        parcel.writeInt(this.f1886n ? 1 : 0);
        parcel.writeInt(this.f1887o ? 1 : 0);
        parcel.writeInt(this.f1888p ? 1 : 0);
        parcel.writeBundle(this.f1889q);
        parcel.writeInt(this.f1890r ? 1 : 0);
        parcel.writeBundle(this.f1892t);
        parcel.writeInt(this.f1891s);
    }

    public d1(Parcel parcel) {
        this.f1880a = parcel.readString();
        this.f1881b = parcel.readString();
        this.f1882c = parcel.readInt() != 0;
        this.f1883d = parcel.readInt();
        this.f1884e = parcel.readInt();
        this.f1885f = parcel.readString();
        this.f1886n = parcel.readInt() != 0;
        this.f1887o = parcel.readInt() != 0;
        this.f1888p = parcel.readInt() != 0;
        this.f1889q = parcel.readBundle();
        this.f1890r = parcel.readInt() != 0;
        this.f1892t = parcel.readBundle();
        this.f1891s = parcel.readInt();
    }
}
