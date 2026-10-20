.class public final Lg8/f3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/i3;


# direct methods
.method public synthetic constructor <init>(Lg8/i3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/f3;->a:I

    iput-object p1, p0, Lg8/f3;->b:Lg8/i3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lg8/f3;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/f3;->b:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    invoke-virtual {v0}, Lg8/l3;->C()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lg8/f3;->b:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lg8/l3;->h0:Lg8/t2;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lg8/f3;->b:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lg8/f3;->b:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->A:Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/h3;

    const-string v3, "Channel is forcefully shutdown"

    invoke-virtual {v2, v3, v1}, Lg8/v0;->cancel(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg8/f3;->b:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->E:Li3/a0;

    sget-object v1, Lg8/l3;->d0:Le8/c2;

    invoke-virtual {v0, v1}, Li3/a0;->c(Le8/c2;)V

    iget-object v2, v0, Li3/a0;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, v0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg8/h0;

    invoke-interface {v3, v1}, Lg8/h0;->i(Le8/c2;)V

    goto :goto_1

    :cond_2
    iget-object v0, v0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lg8/l3;

    iget-object v0, v0, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v0, v1}, Lg8/y0;->c(Le8/c2;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lg8/f3;->b:Lg8/i3;

    iget-object v2, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v2, v2, Lg8/l3;->A:Ljava/util/Collection;

    if-nez v2, :cond_4

    iget-object v2, v0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lg8/l3;->h0:Lg8/t2;

    if-ne v2, v3, :cond_3

    iget-object v2, v0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->E:Li3/a0;

    sget-object v1, Lg8/l3;->e0:Le8/c2;

    invoke-virtual {v0, v1}, Li3/a0;->c(Le8/c2;)V

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
