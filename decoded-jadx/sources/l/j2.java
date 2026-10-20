package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10787a;

    public /* synthetic */ j2(int i10) {
        this.f10787a = i10;
    }

    public static m0.n1 a(Parcel parcel, ClassLoader classLoader) {
        m0.z2 z2Var;
        if (classLoader == null) {
            classLoader = j2.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            z2Var = m0.h1.f11552a;
        } else if (i10 == 1) {
            z2Var = m0.o3.f11621a;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(q.h("Unsupported MutableState policy ", i10, " was restored"));
            }
            z2Var = m0.h2.f11553a;
        }
        return new m0.n1(value, z2Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f10787a) {
            case 0:
                return new k2(parcel, classLoader);
            case 1:
                return new h3(parcel, classLoader);
            case 2:
                return a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return h3.b.f7542b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new androidx.fragment.app.c0(parcel, classLoader);
            default:
                return new a4.n0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f10787a) {
            case 0:
                return new k2[i10];
            case 1:
                return new h3[i10];
            case 2:
                return new m0.n1[i10];
            case 3:
                return new h3.b[i10];
            case 4:
                return new androidx.fragment.app.c0[i10];
            default:
                return new a4.n0[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10787a) {
            case 0:
                return new k2(parcel, null);
            case 1:
                return new h3(parcel, null);
            case 2:
                return a(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return h3.b.f7542b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new androidx.fragment.app.c0(parcel, null);
            default:
                return new a4.n0(parcel, null);
        }
    }
}
