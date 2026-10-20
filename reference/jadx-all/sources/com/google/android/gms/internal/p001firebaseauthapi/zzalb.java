package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzalb<E> extends zzahg<E> implements RandomAccess {
    private static final zzalb<Object> zza = new zzalb<>(new Object[0], 0, false);
    private E[] zzb;
    private int zzc;

    public zzalb() {
        this(new Object[10], 0, true);
    }

    private final String zzb(int i10) {
        return q.i("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzc(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i10));
        }
    }

    public static <E> zzalb<E> zzd() {
        return (zzalb<E>) zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final void add(int i10, E e4) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i10));
        }
        E[] eArr = this.zzb;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[a.h(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.zzb, i10, eArr2, i10 + 1, this.zzc - i10);
            this.zzb = eArr2;
        }
        this.zzb[i10] = e4;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        zzc(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        zza();
        zzc(i10);
        E[] eArr = this.zzb;
        E e4 = eArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahg, java.util.AbstractList, java.util.List
    public final E set(int i10, E e4) {
        zza();
        zzc(i10);
        E[] eArr = this.zzb;
        E e10 = eArr[i10];
        eArr[i10] = e4;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajg
    public final /* synthetic */ zzajg zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzalb(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzalb(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.zzb = eArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        zza();
        int i10 = this.zzc;
        E[] eArr = this.zzb;
        if (i10 == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        eArr2[i11] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
