package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class zzajl {
    public static final zzajl zza;
    public static final zzajl zzb;
    public static final zzajl zzc;
    public static final zzajl zzd;
    public static final zzajl zze;
    public static final zzajl zzf;
    public static final zzajl zzg;
    public static final zzajl zzh;
    public static final zzajl zzi;
    public static final zzajl zzj;
    private static final /* synthetic */ zzajl[] zzk;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        zzajl zzajlVar = new zzajl("VOID", 0, Void.class, Void.class, null);
        zza = zzajlVar;
        Class cls = Integer.TYPE;
        zzajl zzajlVar2 = new zzajl("INT", 1, cls, Integer.class, 0);
        zzb = zzajlVar2;
        zzajl zzajlVar3 = new zzajl("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzajlVar3;
        zzajl zzajlVar4 = new zzajl("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzajlVar4;
        zzajl zzajlVar5 = new zzajl("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        zze = zzajlVar5;
        zzajl zzajlVar6 = new zzajl("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzajlVar6;
        zzajl zzajlVar7 = new zzajl("STRING", 6, String.class, String.class, "");
        zzg = zzajlVar7;
        zzajl zzajlVar8 = new zzajl("BYTE_STRING", 7, zzahm.class, zzahm.class, zzahm.zza);
        zzh = zzajlVar8;
        zzajl zzajlVar9 = new zzajl("ENUM", 8, cls, Integer.class, null);
        zzi = zzajlVar9;
        zzajl zzajlVar10 = new zzajl("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzajlVar10;
        zzk = new zzajl[]{zzajlVar, zzajlVar2, zzajlVar3, zzajlVar4, zzajlVar5, zzajlVar6, zzajlVar7, zzajlVar8, zzajlVar9, zzajlVar10};
    }

    private zzajl(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzajl[] values() {
        return (zzajl[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzm;
    }
}
