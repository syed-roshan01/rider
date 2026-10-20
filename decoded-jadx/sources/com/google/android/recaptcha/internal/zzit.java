package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzin;
import com.google.android.recaptcha.internal.zzit;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzit<MessageType extends zzit<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> extends zzgf<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzlm zzc = zzlm.zzc();

    public static Object zzA(zzke zzkeVar, String str, Object[] objArr) {
        return new zzkp(zzkeVar, str, objArr);
    }

    public static void zzD(Class cls, zzit zzitVar) {
        zzitVar.zzC();
        zzb.put(cls, zzitVar);
    }

    public static final boolean zzF(zzit zzitVar, boolean z10) {
        byte bByteValue = ((Byte) zzitVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzkn.zza().zzb(zzitVar.getClass()).zzl(zzitVar);
        if (z10) {
            zzitVar.zzh(2, true != zZzl ? null : zzitVar, null);
        }
        return zZzl;
    }

    private final int zzf(zzkr zzkrVar) {
        return zzkn.zza().zzb(getClass()).zza(this);
    }

    private static zzit zzg(zzit zzitVar) throws zzje {
        if (zzitVar == null || zzitVar.zzo()) {
            return zzitVar;
        }
        zzje zzjeVarZza = new zzlk(zzitVar).zza();
        zzjeVarZza.zzh(zzitVar);
        throw zzjeVarZza;
    }

    private static zzit zzi(zzit zzitVar, byte[] bArr, int i10, int i11, zzie zzieVar) throws zzje {
        zzit zzitVarZzs = zzitVar.zzs();
        try {
            zzkr zzkrVarZzb = zzkn.zza().zzb(zzitVarZzs.getClass());
            zzkrVarZzb.zzi(zzitVarZzs, bArr, 0, i11, new zzgj(zzieVar));
            zzkrVarZzb.zzf(zzitVarZzs);
            return zzitVarZzs;
        } catch (zzje e4) {
            e = e4;
            if (e.zzl()) {
                e = new zzje(e);
            }
            e.zzh(zzitVarZzs);
            throw e;
        } catch (zzlk e10) {
            zzje zzjeVarZza = e10.zza();
            zzjeVarZza.zzh(zzitVarZzs);
            throw zzjeVarZza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzje) {
                throw ((zzje) e11.getCause());
            }
            zzje zzjeVar = new zzje(e11);
            zzjeVar.zzh(zzitVarZzs);
            throw zzjeVar;
        } catch (IndexOutOfBoundsException unused) {
            zzje zzjeVarZzj = zzje.zzj();
            zzjeVarZzj.zzh(zzitVarZzs);
            throw zzjeVarZzj;
        }
    }

    public static zzir zzq(zzke zzkeVar, Object obj, zzke zzkeVar2, zziw zziwVar, int i10, zzmb zzmbVar, Class cls) {
        return new zzir(zzkeVar, "", null, new zziq(null, i10, zzmbVar, false, false), cls);
    }

    public static zzit zzr(Class cls) {
        Map map = zzb;
        zzit zzitVar = (zzit) map.get(cls);
        if (zzitVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzitVar = (zzit) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzitVar == null) {
            zzitVar = (zzit) ((zzit) zzlv.zze(cls)).zzh(6, null, null);
            if (zzitVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzitVar);
        }
        return zzitVar;
    }

    public static zzit zzt(zzit zzitVar, InputStream inputStream) throws zzje {
        zzhc zzhaVar;
        if (inputStream == null) {
            byte[] bArr = zzjc.zzd;
            int length = bArr.length;
            zzhaVar = zzhc.zzH(bArr, 0, 0, false);
        } else {
            zzhaVar = new zzha(inputStream, 4096, null);
        }
        zzie zzieVar = zzie.zza;
        zzit zzitVarZzs = zzitVar.zzs();
        try {
            zzkr zzkrVarZzb = zzkn.zza().zzb(zzitVarZzs.getClass());
            zzkrVarZzb.zzh(zzitVarZzs, zzhd.zzq(zzhaVar), zzieVar);
            zzkrVarZzb.zzf(zzitVarZzs);
            zzg(zzitVarZzs);
            return zzitVarZzs;
        } catch (zzje e4) {
            e = e4;
            if (e.zzl()) {
                e = new zzje(e);
            }
            e.zzh(zzitVarZzs);
            throw e;
        } catch (zzlk e10) {
            zzje zzjeVarZza = e10.zza();
            zzjeVarZza.zzh(zzitVarZzs);
            throw zzjeVarZza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzje) {
                throw ((zzje) e11.getCause());
            }
            zzje zzjeVar = new zzje(e11);
            zzjeVar.zzh(zzitVarZzs);
            throw zzjeVar;
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzje) {
                throw ((zzje) e12.getCause());
            }
            throw e12;
        }
    }

    public static zzit zzu(zzit zzitVar, byte[] bArr) throws zzje {
        zzit zzitVarZzi = zzi(zzitVar, bArr, 0, bArr.length, zzie.zza);
        zzg(zzitVarZzi);
        return zzitVarZzi;
    }

    public static zziy zzv() {
        return zziu.zzf();
    }

    public static zzja zzw() {
        return zzjt.zzf();
    }

    public static zzjb zzx() {
        return zzko.zze();
    }

    public static zzjb zzy(zzjb zzjbVar) {
        int size = zzjbVar.size();
        return zzjbVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzz(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzkn.zza().zzb(getClass()).zzk(this, (zzit) obj);
    }

    public final int hashCode() {
        if (zzG()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzkg.zza(this, super.toString());
    }

    public final void zzB() {
        zzkn.zza().zzb(getClass()).zzf(this);
        zzC();
    }

    public final void zzC() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzE(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzG() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final /* synthetic */ zzkd zzW() {
        return (zzin) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final /* synthetic */ zzkd zzX() {
        zzin zzinVar = (zzin) zzh(5, null, null);
        zzinVar.zzg(this);
        return zzinVar;
    }

    @Override // com.google.android.recaptcha.internal.zzkf
    public final /* synthetic */ zzke zzY() {
        return (zzit) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzgf
    public final int zza(zzkr zzkrVar) {
        if (zzG()) {
            int iZza = zzkrVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(q.g("serialized size must be non-negative, was ", iZza));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzkrVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(q.g("serialized size must be non-negative, was ", iZza2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final void zze(zzhh zzhhVar) {
        zzkn.zza().zzb(getClass()).zzj(this, zzhi.zza(zzhhVar));
    }

    public abstract Object zzh(int i10, Object obj, Object obj2);

    public final int zzm() {
        return zzkn.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final int zzn() {
        int iZzf;
        if (zzG()) {
            iZzf = zzf(null);
            if (iZzf < 0) {
                throw new IllegalStateException(q.g("serialized size must be non-negative, was ", iZzf));
            }
        } else {
            iZzf = this.zzd & Integer.MAX_VALUE;
            if (iZzf == Integer.MAX_VALUE) {
                iZzf = zzf(null);
                if (iZzf < 0) {
                    throw new IllegalStateException(q.g("serialized size must be non-negative, was ", iZzf));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzkf
    public final boolean zzo() {
        return zzF(this, true);
    }

    public final zzin zzp() {
        return (zzin) zzh(5, null, null);
    }

    public final zzit zzs() {
        return (zzit) zzh(4, null, null);
    }
}
