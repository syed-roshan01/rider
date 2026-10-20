package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3566d;

    public k(byte[] bArr) {
        this.f3573a = 0;
        bArr.getClass();
        this.f3566d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public byte e(int i10) {
        return this.f3566d[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l) || size() != ((l) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof k)) {
            return obj.equals(this);
        }
        k kVar = (k) obj;
        int i10 = this.f3573a;
        int i11 = kVar.f3573a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > kVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > kVar.size()) {
            StringBuilder sbQ = a7.a.q("Ran off end of other: 0, ", size, ", ");
            sbQ.append(kVar.size());
            throw new IllegalArgumentException(sbQ.toString());
        }
        int iP = p() + size;
        int iP2 = p();
        int iP3 = kVar.p();
        while (iP2 < iP) {
            if (this.f3566d[iP2] != kVar.f3566d[iP3]) {
                return false;
            }
            iP2++;
            iP3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public void k(byte[] bArr, int i10) {
        System.arraycopy(this.f3566d, 0, bArr, 0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public byte n(int i10) {
        return this.f3566d[i10];
    }

    public int p() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l
    public int size() {
        return this.f3566d.length;
    }
}
