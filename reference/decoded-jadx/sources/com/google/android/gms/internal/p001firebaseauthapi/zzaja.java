package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzaja.zzb;
import com.google.android.gms.internal.p001firebaseauthapi.zzaja;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaja<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahd<MessageType, BuilderType> {
    private static Map<Object, zzaja<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzame zzb = zzame.zzc();

    public static class zza<T extends zzaja<T, ?>> extends zzahh<T> {
        private final T zza;

        public zza(T t10) {
            this.zza = t10;
        }
    }

    public static final class zzc implements zzaiu<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final zzamo zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final zzamy zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final zzakn zza(zzakn zzaknVar, zzakk zzakkVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaiu
        public final zzakt zza(zzakt zzaktVar, zzakt zzaktVar2) {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzaja<MessageType, BuilderType> implements zzakm {
        protected zzais<zzc> zzc = zzais.zzb();

        public final zzais<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzais) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static final enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    public static class zzf<ContainingType extends zzakk, Type> extends zzaim<ContainingType, Type> {
    }

    private final int zza() {
        return zzaky.zza().zza(this).zzb(this);
    }

    private final int zzb(zzalc<?> zzalcVar) {
        return zzalcVar == null ? zzaky.zza().zza(this).zza(this) : zzalcVar.zza(this);
    }

    public static <E> zzajg<E> zzo() {
        return zzalb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaky.zza().zza(this).zzb(this, (zzaja) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzv()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzakp.zza(this, super.toString());
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahd
    public final int zzh() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final int zzk() {
        return zza((zzalc) null);
    }

    public final <MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzl() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzm() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzn() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzp() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzq() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakm
    public final /* synthetic */ zzakk zzr() {
        return (zzaja) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzs() {
        zzaky.zza().zza(this).zzc(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakm
    public final boolean zzu() {
        return zza(this, true);
    }

    public final boolean zzv() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahd
    public final int zza(zzalc zzalcVar) {
        if (zzv()) {
            int iZzb = zzb((zzalc<?>) zzalcVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException(q.g("serialized size must be non-negative, was ", iZzb));
        }
        if (zzh() != Integer.MAX_VALUE) {
            return zzh();
        }
        int iZzb2 = zzb((zzalc<?>) zzalcVar);
        zzb(iZzb2);
        return iZzb2;
    }

    private static <T extends zzaja<T, ?>> T zzb(T t10, zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        zzaib zzaibVarZzc = zzahmVar.zzc();
        T t11 = (T) zza(t10, zzaibVarZzc, zzaipVar);
        try {
            zzaibVarZzc.zzb(0);
            return t11;
        } catch (zzajj e4) {
            throw e4.zza(t11);
        }
    }

    public static abstract class zzb<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzv()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzn();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahf
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzg();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzv()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahf
        /* JADX INFO: renamed from: zzc */
        public final /* synthetic */ zzahf clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zzg();
            if (messagetype.zzu()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
        /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
        public MessageType zzg() {
            if (!this.zza.zzv()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        public final void zzh() {
            if (this.zza.zzv()) {
                return;
            }
            zzi();
        }

        public void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzn();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakm
        public final /* synthetic */ zzakk zzr() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakm
        public final boolean zzu() {
            return zzaja.zza(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaky.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahd
    public final void zzb(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(q.g("serialized size must be non-negative, was ", i10));
        }
        this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    private static <T extends zzaja<T, ?>> T zza(T t10) throws zzajj {
        if (t10 == null || t10.zzu()) {
            return t10;
        }
        throw new zzamc(t10).zza().zza(t10);
    }

    public static <T extends zzaja<?, ?>> T zza(Class<T> cls) {
        zzaja<?, ?> zzajaVar = zzc.get(cls);
        if (zzajaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajaVar = zzc.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzajaVar == null) {
            zzajaVar = (T) ((zzaja) zzamh.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzajaVar != null) {
                zzc.put(cls, zzajaVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzajaVar;
    }

    public static <T extends zzaja<T, ?>> T zza(T t10, zzahm zzahmVar, zzaip zzaipVar) {
        return (T) zza(zzb(t10, zzahmVar, zzaipVar));
    }

    public static <T extends zzaja<T, ?>> T zza(T t10, InputStream inputStream, zzaip zzaipVar) {
        zzaib zzaicVar;
        if (inputStream == null) {
            byte[] bArr = zzajc.zzb;
            zzaicVar = zzaib.zza(bArr, 0, bArr.length, false);
        } else {
            zzaicVar = new zzaic(inputStream);
        }
        return (T) zza(zza(t10, zzaicVar, zzaipVar));
    }

    public static <T extends zzaja<T, ?>> T zza(T t10, byte[] bArr, zzaip zzaipVar) {
        return (T) zza(zza(t10, bArr, 0, bArr.length, zzaipVar));
    }

    private static <T extends zzaja<T, ?>> T zza(T t10, zzaib zzaibVar, zzaip zzaipVar) throws zzajj {
        T t11 = (T) t10.zzn();
        try {
            zzalc zzalcVarZza = zzaky.zza().zza(t11);
            zzalcVarZza.zza(t11, zzaig.zza(zzaibVar), zzaipVar);
            zzalcVarZza.zzc(t11);
            return t11;
        } catch (zzajj e4) {
            e = e4;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t11);
        } catch (zzamc e10) {
            throw e10.zza().zza(t11);
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzajj) {
                throw ((zzajj) e11.getCause());
            }
            throw new zzajj(e11).zza(t11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzajj) {
                throw ((zzajj) e12.getCause());
            }
            throw e12;
        }
    }

    private static <T extends zzaja<T, ?>> T zza(T t10, byte[] bArr, int i10, int i11, zzaip zzaipVar) throws zzajj {
        T t11 = (T) t10.zzn();
        try {
            zzalc zzalcVarZza = zzaky.zza().zza(t11);
            zzalcVarZza.zza(t11, bArr, 0, i11, new zzahl(zzaipVar));
            zzalcVarZza.zzc(t11);
            return t11;
        } catch (zzajj e4) {
            e = e4;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t11);
        } catch (zzamc e10) {
            throw e10.zza().zza(t11);
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzajj) {
                throw ((zzajj) e11.getCause());
            }
            throw new zzajj(e11).zza(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzajj.zzi().zza(t11);
        }
    }

    public static <E> zzajg<E> zza(zzajg<E> zzajgVar) {
        int size = zzajgVar.size();
        return zzajgVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zza(zzakk zzakkVar, String str, Object[] objArr) {
        return new zzala(zzakkVar, str, objArr);
    }

    public static <T extends zzaja<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzt();
        zzc.put(cls, t10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakk
    public final void zza(zzaii zzaiiVar) {
        zzaky.zza().zza(this).zza(this, zzaik.zza(zzaiiVar));
    }

    public static final <T extends zzaja<T, ?>> boolean zza(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zza(zze.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = zzaky.zza().zza(t10).zzd(t10);
        if (z10) {
            t10.zza(zze.zzb, zZzd ? t10 : null, null);
        }
        return zZzd;
    }
}
