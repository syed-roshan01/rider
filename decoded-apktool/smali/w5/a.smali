.class public abstract Lw5/a;
.super Lcom/google/android/gms/common/api/i;


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

    sput-object v0, Lw5/a;->zza:Lcom/google/android/gms/common/api/e;

    new-instance v1, Lw5/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lw5/b;-><init>(I)V

    sput-object v1, Lw5/a;->zzb:Lcom/google/android/gms/common/api/a;

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Lw5/a;->zzc:Lcom/google/android/gms/common/api/f;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6

    sget-object v3, Lw5/a;->zzc:Lcom/google/android/gms/common/api/f;

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

    sget-object v3, Lw5/a;->zzc:Lcom/google/android/gms/common/api/f;

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
