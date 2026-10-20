.class public final Lm/b;
.super Lo7/d0;


# static fields
.field public static volatile y:Lm/b;


# instance fields
.field public final x:Lm/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm/e;

    invoke-direct {v0}, Lm/e;-><init>()V

    iput-object v0, p0, Lm/b;->x:Lm/e;

    return-void
.end method

.method public static o0()Lm/b;
    .locals 2

    sget-object v0, Lm/b;->y:Lm/b;

    if-eqz v0, :cond_0

    sget-object v0, Lm/b;->y:Lm/b;

    return-object v0

    :cond_0
    const-class v0, Lm/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm/b;->y:Lm/b;

    if-nez v1, :cond_1

    new-instance v1, Lm/b;

    invoke-direct {v1}, Lm/b;-><init>()V

    sput-object v1, Lm/b;->y:Lm/b;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lm/b;->y:Lm/b;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
