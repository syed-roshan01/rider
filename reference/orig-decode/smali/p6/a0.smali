.class public final Lp6/a0;
.super Lp6/w;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lp6/a0;->n:I

    iput-object p1, p0, Lp6/a0;->o:Ljava/lang/Object;

    invoke-direct {p0}, Lp6/w;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 7

    iget v0, p0, Lp6/a0;->n:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v0, Lp6/b;

    iget-object v3, v0, Lp6/b;->a:Lp6/c;

    iget-object v4, v3, Lp6/c;->b:Lp6/v;

    new-array v5, v2, [Ljava/lang/Object;

    const-string v6, "unlinkToDeath"

    invoke-virtual {v4, v6, v5}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, v3, Lp6/c;->n:Landroid/os/IInterface;

    invoke-interface {v4}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    iget-object v3, v3, Lp6/c;->k:Lp6/y;

    invoke-interface {v4, v3, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    iget-object v0, v0, Lp6/b;->a:Lp6/c;

    iput-object v1, v0, Lp6/c;->n:Landroid/os/IInterface;

    iput-boolean v2, v0, Lp6/c;->g:Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v0, Lp6/c;

    iget-object v0, v0, Lp6/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v3, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v3, Lp6/c;

    iget-object v3, v3, Lp6/c;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    if-lez v3, :cond_1

    iget-object v3, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v3, Lp6/c;

    iget-object v3, v3, Lp6/c;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v1, Lp6/c;

    iget-object v1, v1, Lp6/c;->b:Lp6/v;

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v3, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v3, Lp6/c;

    iget-object v4, v3, Lp6/c;->n:Landroid/os/IInterface;

    if-eqz v4, :cond_2

    iget-object v3, v3, Lp6/c;->b:Lp6/v;

    const-string v4, "Unbind from service."

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v3, Lp6/c;

    iget-object v4, v3, Lp6/c;->a:Landroid/content/Context;

    iget-object v3, v3, Lp6/c;->m:Lp6/b;

    invoke-virtual {v4, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v3, p0, Lp6/a0;->o:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lp6/c;

    iput-boolean v2, v4, Lp6/c;->g:Z

    move-object v2, v3

    check-cast v2, Lp6/c;

    iput-object v1, v2, Lp6/c;->n:Landroid/os/IInterface;

    check-cast v3, Lp6/c;

    iput-object v1, v3, Lp6/c;->m:Lp6/b;

    :cond_2
    iget-object v1, p0, Lp6/a0;->o:Ljava/lang/Object;

    check-cast v1, Lp6/c;

    invoke-virtual {v1}, Lp6/c;->d()V

    monitor-exit v0

    :goto_1
    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
