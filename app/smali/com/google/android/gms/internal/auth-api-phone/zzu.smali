.class public final Lcom/google/android/gms/internal/auth-api-phone/zzu;
.super Lw5/a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lw5/a;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw5/a;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final startSmsRetriever()Lcom/google/android/gms/tasks/Task;
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

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzx;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzu;)V

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zzb:Lz5/d;

    filled-new-array {v1}, [Lz5/d;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/s;->a()Lcom/google/android/gms/common/api/internal/p0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/i;->doWrite(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final startSmsUserConsent(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/t;->a()Lcom/google/android/gms/common/api/internal/s;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzw;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api-phone/zzw;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzu;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/s;->c:Ljava/lang/Object;

    sget-object p1, Lcom/google/android/gms/internal/auth-api-phone/zzaa;->zzc:Lz5/d;

    filled-new-array {p1}, [Lz5/d;

    move-result-object p1

    iput-object p1, v0, Lcom/google/android/gms/common/api/internal/s;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/s;->a()Lcom/google/android/gms/common/api/internal/p0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/i;->doWrite(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
