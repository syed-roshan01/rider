.class public final Lg8/b3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final a:Lg8/e4;

.field public b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lg8/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/b3;->a:Lg8/e4;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/b3;->b:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg8/b3;->a:Lg8/e4;

    check-cast v1, Lg8/l1;

    iget v2, v1, Lg8/l1;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v1, v1, Lg8/l1;->b:Ljava/lang/Object;

    check-cast v1, Lg8/v5;

    invoke-static {v1, v0}, Lg8/w5;->b(Lg8/v5;Ljava/util/concurrent/Executor;)V

    :pswitch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lg8/b3;->b:Ljava/util/concurrent/Executor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/b3;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/b3;->a:Lg8/e4;

    check-cast v0, Lg8/l1;

    iget v1, v0, Lg8/l1;->a:I

    iget-object v0, v0, Lg8/l1;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lg8/v5;

    invoke-static {v0}, Lg8/w5;->a(Lg8/v5;)Ljava/lang/Object;

    move-result-object v0

    :pswitch_0
    check-cast v0, Ljava/util/concurrent/Executor;

    const-string v1, "%s.getObject()"

    iget-object v2, p0, Lg8/b3;->b:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    iput-object v0, p0, Lg8/b3;->b:Ljava/util/concurrent/Executor;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Lf6/a;->c0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lg8/b3;->b:Ljava/util/concurrent/Executor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_1
    monitor-exit p0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
