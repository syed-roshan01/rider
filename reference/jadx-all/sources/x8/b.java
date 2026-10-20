package x8;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import l.q;
import r8.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f16318a;

    public b(Enum[] enumArr) {
        d7.a.m(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.f16318a = enumArr;
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        d7.a.m(r10, "element");
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f16318a;
        d7.a.m(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal > enumArr.length - 1) ? null : enumArr[iOrdinal]) == r10;
    }

    @Override // r8.a
    public final int e() {
        return this.f16318a.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f16318a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(q.i("index: ", i10, ", size: ", length));
        }
        return enumArr[i10];
    }

    @Override // r8.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        d7.a.m(r10, "element");
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f16318a;
        d7.a.m(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal > enumArr.length + (-1)) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // r8.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        d7.a.m(r10, "element");
        return indexOf(r10);
    }
}
