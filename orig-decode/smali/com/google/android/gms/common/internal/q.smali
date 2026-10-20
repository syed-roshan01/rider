.class public final Lcom/google/android/gms/common/internal/q;
.super Ljava/lang/Object;


# static fields
.field public static b:Lcom/google/android/gms/common/internal/q;

.field public static final c:Lcom/google/android/gms/common/internal/r;


# instance fields
.field public a:Lcom/google/android/gms/common/internal/r;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lcom/google/android/gms/common/internal/r;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/r;-><init>(IZZII)V

    sput-object v6, Lcom/google/android/gms/common/internal/q;->c:Lcom/google/android/gms/common/internal/r;

    return-void
.end method

.method public static declared-synchronized a()Lcom/google/android/gms/common/internal/q;
    .locals 2

    const-class v0, Lcom/google/android/gms/common/internal/q;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/internal/q;->b:Lcom/google/android/gms/common/internal/q;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/common/internal/q;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lcom/google/android/gms/common/internal/q;->b:Lcom/google/android/gms/common/internal/q;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/common/internal/q;->b:Lcom/google/android/gms/common/internal/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method
