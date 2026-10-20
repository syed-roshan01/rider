.class public final Lcom/google/android/gms/internal/auth-api-phone/zzaa;
.super Ljava/lang/Object;


# static fields
.field public static final zza:Lz5/d;

.field public static final zzb:Lz5/d;

.field public static final zzc:Lz5/d;

.field public static final zzd:[Lz5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lz5/d;

    const-string v1, "sms_code_autofill"

    const-wide/16 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Lz5/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zza:Lz5/d;

    new-instance v1, Lz5/d;

    const-string v2, "sms_retrieve"

    const-wide/16 v3, 0x1

    invoke-direct {v1, v2, v3, v4}, Lz5/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zzb:Lz5/d;

    new-instance v2, Lz5/d;

    const-string v3, "user_consent"

    const-wide/16 v4, 0x3

    invoke-direct {v2, v3, v4, v5}, Lz5/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zzc:Lz5/d;

    filled-new-array {v0, v1, v2}, [Lz5/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zzd:[Lz5/d;

    return-void
.end method
