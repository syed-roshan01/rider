.class public final Le8/u1;
.super Lo7/d0;


# instance fields
.field public final synthetic x:Le8/v1;


# direct methods
.method public constructor <init>(Le8/v1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/u1;->x:Le8/v1;

    return-void
.end method


# virtual methods
.method public final a0(Ljava/net/URI;Le8/q1;)Lg8/g1;
    .locals 4

    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, Le8/u1;->x:Le8/v1;

    monitor-enter v2

    :try_start_0
    iget-object v3, v2, Le8/v1;->d:Lr6/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    check-cast v3, Lr6/f0;

    invoke-virtual {v3, v0}, Lr6/f0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/t1;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, p2}, Lo7/d0;->a0(Ljava/net/URI;Le8/q1;)Lg8/g1;

    move-result-object v1

    :goto_0
    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public final o0()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Le8/u1;->x:Le8/v1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le8/u1;->x:Le8/v1;

    iget-object v1, v1, Le8/v1;->b:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
