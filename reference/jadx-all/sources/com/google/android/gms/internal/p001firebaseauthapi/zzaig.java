package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.remoteconfig.internal.Code;
import java.util.List;
import java.util.Map;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
final class zzaig implements zzald {
    private final zzaib zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzaig(zzaib zzaibVar) {
        zzaib zzaibVar2 = (zzaib) zzajc.zza(zzaibVar, "input");
        this.zza = zzaibVar2;
        zzaibVar2.zzd = this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final double zza() throws zzaji {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final float zzb() throws zzaji {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        if (i11 == 0 || i11 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zze() throws zzaji {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzf() throws zzaji {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzg() throws zzaji {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzh() throws zzaji {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzi() throws zzaji {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final int zzj() throws zzaji {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final long zzk() throws zzaji {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final long zzl() throws zzaji {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final long zzm() throws zzaji {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final long zzn() throws zzaji {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final long zzo() throws zzaji {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final zzahm zzp() throws zzaji {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final String zzq() throws zzaji {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final String zzr() throws zzaji {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final boolean zzs() throws zzaji {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final boolean zzt() {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i10);
    }

    private final <T> void zzc(T t10, zzalc<T> zzalcVar, zzaip zzaipVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalcVar.zza(t10, this, zzaipVar);
            if (this.zzb != this.zzc) {
                throw zzajj.zzg();
            }
            this.zzc = i10;
        } catch (Throwable th) {
            this.zzc = i10;
            throw th;
        }
    }

    private final <T> void zzd(T t10, zzalc<T> zzalcVar, zzaip zzaipVar) throws zzajj {
        int iZzj = this.zza.zzj();
        zzaib zzaibVar = this.zza;
        if (zzaibVar.zza >= zzaibVar.zzb) {
            throw new zzajj("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZza = zzaibVar.zza(iZzj);
        this.zza.zza++;
        zzalcVar.zza(t10, this, zzaipVar);
        this.zza.zzb(0);
        zzaib zzaibVar2 = this.zza;
        zzaibVar2.zza--;
        zzaibVar2.zzc(iZza);
    }

    public static zzaig zza(zzaib zzaibVar) {
        zzaig zzaigVar = zzaibVar.zzd;
        return zzaigVar != null ? zzaigVar : new zzaig(zzaibVar);
    }

    private final <T> T zzb(zzalc<T> zzalcVar, zzaip zzaipVar) throws zzajj {
        T tZza = zzalcVar.zza();
        zzd(tZza, zzalcVar, zzaipVar);
        zzalcVar.zzc(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zze(List<Integer> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajdVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 != 5) {
            throw zzajj.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zze());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzf(List<Long> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzajzVar.zza(this.zza.zzk());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajzVar.zza(this.zza.zzk());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzg(List<Float> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzaiy)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzaiy zzaiyVar = (zzaiy) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzaiyVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 != 5) {
            throw zzajj.zza();
        }
        do {
            zzaiyVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzh(List<Integer> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzf());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzf());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzi(List<Long> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajzVar.zza(this.zza.zzl());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzj(List<Integer> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajdVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 != 5) {
            throw zzajj.zza();
        }
        do {
            zzajdVar.zzc(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzk(List<Long> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzajzVar.zza(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajzVar.zza(this.zza.zzn());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzl(List<Integer> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzh());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzm(List<Long> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajzVar.zza(this.zza.zzo());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzn(List<String> list) throws zzaji {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzo(List<String> list) throws zzaji {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzp(List<Integer> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzj());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzj());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzq(List<Long> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajzVar.zza(this.zza.zzp());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    private final Object zza(zzamo zzamoVar, Class<?> cls, zzaip zzaipVar) throws zzaji {
        switch (zzaij.zza[zzamoVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzaky.zza().zza((Class) cls), zzaipVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case Code.UNAVAILABLE /* 14 */:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case Code.UNAUTHENTICATED /* 16 */:
                return Integer.valueOf(zzj());
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzc(List<Double> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzain)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzain zzainVar = (zzain) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzainVar.zza(this.zza.zza());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzainVar.zza(this.zza.zza());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final <T> void zzb(T t10, zzalc<T> zzalcVar, zzaip zzaipVar) throws zzajj {
        zzb(2);
        zzd(t10, zzalcVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzb(List<zzahm> list) throws zzaji {
        int iZzi;
        if ((this.zzb & 7) != 2) {
            throw zzajj.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == this.zzb);
        this.zzd = iZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final <T> void zzb(List<T> list, zzalc<T> zzalcVar, zzaip zzaipVar) throws zzaji {
        int iZzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzajj.zza();
        }
        do {
            list.add(zzb(zzalcVar, zzaipVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i10);
        this.zzd = iZzi;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zzd(List<Integer> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajd)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzajd zzajdVar = (zzajd) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajdVar.zzc(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzajdVar.zzc(this.zza.zzd());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    private final void zzb(int i10) throws zzaji {
        if ((this.zzb & 7) != i10) {
            throw zzajj.zza();
        }
    }

    private final <T> T zza(zzalc<T> zzalcVar, zzaip zzaipVar) {
        T tZza = zzalcVar.zza();
        zzc(tZza, zzalcVar, zzaipVar);
        zzalcVar.zzc(tZza);
        return tZza;
    }

    private static void zzc(int i10) throws zzajj {
        if ((i10 & 3) != 0) {
            throw zzajj.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final <T> void zza(T t10, zzalc<T> zzalcVar, zzaip zzaipVar) throws zzaji {
        zzb(3);
        zzc(t10, zzalcVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final void zza(List<Boolean> list) throws zzajj {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzahk)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzajj.zza();
        }
        zzahk zzahkVar = (zzahk) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzahkVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                zzahkVar.zza(this.zza.zzu());
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzajj.zza();
    }

    private static void zzd(int i10) throws zzajj {
        if ((i10 & 7) != 0) {
            throw zzajj.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    @Deprecated
    public final <T> void zza(List<T> list, zzalc<T> zzalcVar, zzaip zzaipVar) throws zzaji {
        int iZzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzajj.zza();
        }
        do {
            list.add(zza(zzalcVar, zzaipVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i10);
        this.zzd = iZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzald
    public final <K, V> void zza(Map<K, V> map, zzakf<K, V> zzakfVar, zzaip zzaipVar) throws zzaji {
        zzb(2);
        int iZza = this.zza.zza(this.zza.zzj());
        Object objZza = zzakfVar.zzb;
        Object objZza2 = zzakfVar.zzd;
        while (true) {
            try {
                int iZzc = zzc();
                if (iZzc == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (iZzc == 1) {
                    objZza = zza(zzakfVar.zza, (Class<?>) null, (zzaip) null);
                } else if (iZzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzajj("Unable to parse map entry.");
                        }
                    } catch (zzaji unused) {
                        if (!zzt()) {
                            throw new zzajj("Unable to parse map entry.");
                        }
                    }
                } else {
                    objZza2 = zza(zzakfVar.zzc, zzakfVar.zzd.getClass(), zzaipVar);
                }
            } catch (Throwable th) {
                this.zza.zzc(iZza);
                throw th;
            }
        }
        map.put(objZza, objZza2);
        this.zza.zzc(iZza);
    }

    private final void zza(List<String> list, boolean z10) throws zzaji {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) == 2) {
            if (!(list instanceof zzajq) || z10) {
                do {
                    list.add(z10 ? zzr() : zzq());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            zzajq zzajqVar = (zzajq) list;
            do {
                zzajqVar.zza(zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        throw zzajj.zza();
    }

    private final void zza(int i10) throws zzajj {
        if (this.zza.zzc() != i10) {
            throw zzajj.zzi();
        }
    }
}
