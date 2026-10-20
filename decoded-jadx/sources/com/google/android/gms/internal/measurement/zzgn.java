package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.q;
import o7.d0;
import q6.a;
import q6.h;
import q6.m;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgn<T> {
    private static volatile zzgu zzb;
    private static volatile boolean zzc;
    private final zzgv zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzgn<?>>> zzd = new AtomicReference<>();
    private static zzgy zze = new zzgy(new zzhb() { // from class: com.google.android.gms.internal.measurement.zzgo
        @Override // com.google.android.gms.internal.measurement.zzhb
        public final boolean zza() {
            return zzgn.zzd();
        }
    });
    private static final AtomicInteger zzf = new AtomicInteger();

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Boolean bool, boolean z10) {
        return new zzgq(zzgvVar, str, bool, true);
    }

    private final T zzb(zzgu zzguVar) {
        zzgb zzgbVarZza;
        Object objZza;
        if (this.zzg.zzb == null) {
            zzgbVarZza = zzgw.zza(zzguVar.zza(), this.zzg.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                @Override // java.lang.Runnable
                public final void run() {
                    zzgn.zzc();
                }
            });
        } else if (zzgl.zza(zzguVar.zza(), this.zzg.zzb)) {
            zzgbVarZza = this.zzg.zzg ? zzfy.zza(zzguVar.zza().getContentResolver(), zzgk.zza(zzgk.zza(zzguVar.zza(), this.zzg.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                @Override // java.lang.Runnable
                public final void run() {
                    zzgn.zzc();
                }
            }) : zzfy.zza(zzguVar.zza().getContentResolver(), this.zzg.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                @Override // java.lang.Runnable
                public final void run() {
                    zzgn.zzc();
                }
            });
        } else {
            zzgbVarZza = null;
        }
        if (zzgbVarZza == null || (objZza = zzgbVarZza.zza(zzb())) == null) {
            return null;
        }
        return zza(objZza);
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public abstract T zza(Object obj);

    private zzgn(zzgv zzgvVar, String str, T t10, boolean z10) {
        this.zzj = -1;
        String str2 = zzgvVar.zza;
        if (str2 == null && zzgvVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzgvVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzgvVar;
        this.zzh = str;
        this.zzi = t10;
        this.zzl = z10;
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Double d10, boolean z10) {
        return new zzgt(zzgvVar, str, d10, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Long l10, boolean z10) {
        return new zzgr(zzgvVar, str, l10, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, String str2, boolean z10) {
        return new zzgs(zzgvVar, str, str2, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0027, B:14:0x0037, B:20:0x0053, B:22:0x005e, B:35:0x007c, B:38:0x0084, B:39:0x0087, B:40:0x008b, B:25:0x0065, B:34:0x007a, B:28:0x006c, B:31:0x0073, B:41:0x008f), top: B:47:0x001c }] */
    public final T zza() {
        T tZzb;
        if (!this.zzl) {
            e.N("Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.", zze.zza(this.zzh));
        }
        int i10 = zzf.get();
        if (this.zzj < i10) {
            synchronized (this) {
                try {
                    if (this.zzj < i10) {
                        zzgu zzguVar = zzb;
                        h hVar = a.f13200a;
                        String strZza = null;
                        if (zzguVar != null) {
                            hVar = (h) zzguVar.zzb().get();
                            if (hVar.b()) {
                                zzgh zzghVar = (zzgh) hVar.a();
                                zzgv zzgvVar = this.zzg;
                                strZza = zzghVar.zza(zzgvVar.zzb, zzgvVar.zza, zzgvVar.zzd, this.zzh);
                            }
                        }
                        e.N("Must call PhenotypeFlagInitializer.maybeInit() first", zzguVar != null);
                        if (this.zzg.zzf) {
                            tZzb = zza(zzguVar);
                            if (tZzb == null && (tZzb = zzb(zzguVar)) == null) {
                                tZzb = this.zzi;
                            }
                        } else {
                            tZzb = zzb(zzguVar);
                            if (tZzb == null && (tZzb = zza(zzguVar)) == null) {
                                tZzb = this.zzi;
                            }
                        }
                        if (hVar.b()) {
                            tZzb = strZza == null ? this.zzi : zza((Object) strZza);
                        }
                        this.zzk = tZzb;
                        this.zzj = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzk;
    }

    public final String zzb() {
        return zza(this.zzg.zzd);
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb == null) {
                    synchronized (obj) {
                        try {
                            zzgu zzguVar = zzb;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzguVar == null || zzguVar.zza() != context) {
                                zzfy.zzc();
                                zzgw.zza();
                                zzgg.zza();
                                zzb = new zzfv(context, d0.S(new m() { // from class: com.google.android.gms.internal.measurement.zzgp
                                    @Override // q6.m
                                    public final Object get() {
                                        return zzgj.zza.zza(context);
                                    }
                                }));
                                zzf.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final T zza(zzgu zzguVar) {
        q6.e eVar;
        zzgv zzgvVar = this.zzg;
        if (!zzgvVar.zze && ((eVar = zzgvVar.zzh) == null || ((Boolean) eVar.apply(zzguVar.zza())).booleanValue())) {
            zzgg zzggVarZza = zzgg.zza(zzguVar.zza());
            zzgv zzgvVar2 = this.zzg;
            Object objZza = zzggVarZza.zza(zzgvVar2.zze ? null : zza(zzgvVar2.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? q.j(str, this.zzh) : this.zzh;
    }
}
