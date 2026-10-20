.class public final Lg8/c0;
.super Lg8/q0;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg8/f0;)V
    .locals 2

    sget-object v0, Lo8/a;->b:La4/q;

    const/4 v1, 0x1

    iput v1, p0, Lg8/c0;->c:I

    iput-object p1, p0, Lg8/c0;->e:Ljava/lang/Object;

    iput-object v0, p0, Lg8/c0;->d:Ljava/lang/Object;

    .line 3
    iget-object p1, p1, Lg8/f0;->c:Lg8/g0;

    .line 4
    iget-object p1, p1, Lg8/g0;->f:Le8/b0;

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lg8/v0;Lg8/u0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg8/c0;->c:I

    iput-object p1, p0, Lg8/c0;->e:Ljava/lang/Object;

    iput-object p2, p0, Lg8/c0;->d:Ljava/lang/Object;

    .line 1
    iget-object p1, p1, Lg8/v0;->c:Le8/b0;

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget v0, p0, Lg8/c0;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/c0;->d:Ljava/lang/Object;

    check-cast v0, Lg8/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lg8/u0;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    iput-object v1, v0, Lg8/u0;->c:Ljava/util/List;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg8/u0;->b:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    iget-object v2, v0, Lg8/u0;->c:Ljava/util/List;

    iput-object v1, v0, Lg8/u0;->c:Ljava/util/List;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Runnable;

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->clear()V

    move-object v1, v2

    goto :goto_0

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Lg8/c0;->e:Ljava/lang/Object;

    invoke-static {}, Lo8/b;->d()V

    :try_start_2
    move-object v1, v0

    check-cast v1, Lg8/f0;

    iget-object v1, v1, Lg8/f0;->c:Lg8/g0;

    iget-object v1, v1, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    invoke-static {}, Lo8/b;->b()V

    move-object v1, v0

    check-cast v1, Lg8/f0;

    iget-object v1, v1, Lg8/f0;->b:Le8/c2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    :try_start_3
    move-object v1, v0

    check-cast v1, Lg8/f0;

    iget-object v1, v1, Lg8/f0;->a:Le8/j;

    invoke-virtual {v1}, Le8/j;->onReady()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_4
    check-cast v0, Lg8/f0;

    sget-object v2, Le8/c2;->f:Le8/c2;

    invoke-virtual {v2, v1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object v1

    const-string v2, "Failed to call onReady."

    invoke-virtual {v1, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    iput-object v1, v0, Lg8/f0;->b:Le8/c2;

    iget-object v0, v0, Lg8/f0;->c:Lg8/g0;

    iget-object v0, v0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v0, v1}, Lg8/h0;->i(Le8/c2;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_2
    move-exception v0

    :try_start_5
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
