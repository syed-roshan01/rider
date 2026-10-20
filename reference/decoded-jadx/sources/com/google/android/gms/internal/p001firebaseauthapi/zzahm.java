package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzahm implements Serializable, Iterable<Byte> {
    public static final zzahm zza = new zzahw(zzajc.zzb);
    private static final zzaht zzb = new zzahz();
    private static final Comparator<zzahm> zzc = new zzaho();
    private int zzd = 0;

    public static zzahm zzb(byte[] bArr) {
        return new zzahw(bArr);
    }

    public static zzahv zzc(int i10) {
        return new zzahv(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzd;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzd = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzahp(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        objArr[2] = zzb() <= 50 ? zzalx.zza(this) : q.j(zzalx.zza(zza(0, 47)), "...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public final int zza() {
        return this.zzd;
    }

    public abstract zzahm zza(int i10, int i11);

    public abstract String zza(Charset charset);

    public abstract void zza(zzahn zzahnVar);

    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzaib zzc();

    public final String zzd() {
        return zzb() == 0 ? "" : zza(zzajc.zza);
    }

    public final boolean zze() {
        return zzb() == 0;
    }

    public abstract boolean zzf();

    public final byte[] zzg() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzajc.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }

    public static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    public static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(q.h("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(q.i("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(q.i("End index: ", i11, " >= ", i12));
    }

    public static zzahm zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzahm zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzahw(zzb.zza(bArr, i10, i11));
    }

    public static zzahm zza(String str) {
        return new zzahw(str.getBytes(zzajc.zza));
    }
}
