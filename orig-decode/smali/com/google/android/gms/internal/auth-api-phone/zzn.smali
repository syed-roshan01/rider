.class public final Lcom/google/android/gms/internal/auth-api-phone/zzn;
.super Lcom/google/android/gms/common/api/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/i;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/common/api/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/e;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/common/api/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/f;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzn;->zza:Lcom/google/android/gms/common/api/e;

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api-phone/zzr;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzn;->zzb:Lcom/google/android/gms/common/api/a;

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "SmsCodeAutofill.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzn;->zzc:Lcom/google/android/gms/common/api/f;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6

    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzn;->zzc:Lcom/google/android/gms/common/api/f;

    const/4 v4, 0x0

    .line 3
    sget-object v5, Lcom/google/android/gms/common/api/h;->c:Lcom/google/android/gms/common/api/h;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    .line 4
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/i;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/internal/u;Lcom/google/android/gms/common/api/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzn;->zzc:Lcom/google/android/gms/common/api/f;

    const/4 v4, 0x0

    .line 1
    sget-object v5, Lcom/google/android/gms/common/api/h;->c:Lcom/google/android/gms/common/api/h;

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/api/i;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/internal/u;Lcom/google/android/gms/common/api/h;)V

    return-void
.end method


# virtual methods
.method public final checkPermissionState()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/t;->a()Lcom/google/android/gms/common/api/internal/s;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zza:Lz5/d;

    filled-new-array {v1}, [Lz5/d;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzp;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzp;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzn;)V

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/s;->a()Lcom/google/android/gms/common/api/internal/p0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/i;->doRead(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final hasOngoingSmsRequest(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The package name cannot be empty."

    invoke-static {v1, v0}, Lf6/a;->q(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/t;->a()Lcom/google/android/gms/common/api/internal/s;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zza:Lz5/d;

    filled-new-array {v1}, [Lz5/d;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzo;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api-phone/zzo;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzn;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/s;->a()Lcom/google/android/gms/common/api/internal/p0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/i;->doRead(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final startSmsCodeRetriever()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/t;->a()Lcom/google/android/gms/common/api/internal/s;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zza:Lz5/d;

    filled-new-array {v1}, [Lz5/d;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzm;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzm;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzn;)V

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/s;->a()Lcom/google/android/gms/common/api/internal/p0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/i;->doWrite(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
