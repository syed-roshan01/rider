package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends c implements k0, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3565b;

    static {
        new j0(10).f3525a = false;
    }

    public j0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final e0 a(int i10) {
        ArrayList arrayList = this.f3565b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new j0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        e();
        this.f3565b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3565b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final k0 b() {
        return this.f3525a ? new r1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final Object c(int i10) {
        return this.f3565b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f3565b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final List d() {
        return Collections.unmodifiableList(this.f3565b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f3565b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            lVar.getClass();
            Charset charset = f0.f3534a;
            if (lVar.size() == 0) {
                str = "";
            } else {
                k kVar = (k) lVar;
                str = new String(kVar.f3566d, kVar.p(), kVar.size(), charset);
            }
            k kVar2 = (k) lVar;
            int iP = kVar2.p();
            if (z1.f3643a.t0(kVar2.f3566d, iP, kVar2.size() + iP) == 0) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, f0.f3534a);
            if (z1.f3643a.t0(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void l(l lVar) {
        e();
        this.f3565b.add(lVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        e();
        Object objRemove = this.f3565b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof l)) {
            return new String((byte[]) objRemove, f0.f3534a);
        }
        l lVar = (l) objRemove;
        lVar.getClass();
        Charset charset = f0.f3534a;
        if (lVar.size() == 0) {
            return "";
        }
        k kVar = (k) lVar;
        return new String(kVar.f3566d, kVar.p(), kVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e();
        Object obj2 = this.f3565b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof l)) {
            return new String((byte[]) obj2, f0.f3534a);
        }
        l lVar = (l) obj2;
        lVar.getClass();
        Charset charset = f0.f3534a;
        if (lVar.size() == 0) {
            return "";
        }
        k kVar = (k) lVar;
        return new String(kVar.f3566d, kVar.p(), kVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3565b.size();
    }

    public j0(ArrayList arrayList) {
        this.f3565b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        e();
        if (collection instanceof k0) {
            collection = ((k0) collection).d();
        }
        boolean zAddAll = this.f3565b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
