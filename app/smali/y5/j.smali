.class public final synthetic Ly5/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/internal/p0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ly5/j;->a:I

    iput-object p1, p0, Ly5/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly5/k;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ly5/j;->a:I

    iput-object p1, p0, Ly5/j;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    iget v0, p0, Ly5/j;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v0, "Timeout waiting for ServiceConnection callback "

    iget v5, p1, Landroid/os/Message;->what:I

    if-eqz v5, :cond_4

    if-eq v5, v3, :cond_0

    move v3, v4

    goto/16 :goto_4

    :cond_0
    iget-object v4, p0, Ly5/j;->b:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/common/internal/p0;

    iget-object v5, v4, Lcom/google/android/gms/common/internal/p0;->d:Ljava/util/HashMap;

    monitor-enter v5

    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/internal/n0;

    iget-object v4, p0, Ly5/j;->b:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/common/internal/p0;

    iget-object v4, v4, Lcom/google/android/gms/common/internal/p0;->d:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/common/internal/o0;

    if-eqz v4, :cond_3

    iget v6, v4, Lcom/google/android/gms/common/internal/o0;->b:I

    if-ne v6, v2, :cond_3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/Exception;

    invoke-direct {v6}, Ljava/lang/Exception;-><init>()V

    const-string v7, "GmsClientSupervisor"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, v4, Lcom/google/android/gms/common/internal/o0;->f:Landroid/content/ComponentName;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Landroid/content/ComponentName;

    iget-object p1, p1, Lcom/google/android/gms/common/internal/n0;->b:Ljava/lang/String;

    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    const-string v0, "unknown"

    invoke-direct {v1, p1, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v4, v1}, Lcom/google/android/gms/common/internal/o0;->onServiceDisconnected(Landroid/content/ComponentName;)V

    :cond_3
    monitor-exit v5

    goto :goto_4

    :goto_2
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    iget-object v0, p0, Ly5/j;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/internal/p0;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/p0;->d:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/internal/n0;

    iget-object v1, p0, Ly5/j;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/internal/p0;

    iget-object v1, v1, Lcom/google/android/gms/common/internal/p0;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/internal/o0;

    if-eqz v1, :cond_6

    iget-object v2, v1, Lcom/google/android/gms/common/internal/o0;->a:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-boolean v2, v1, Lcom/google/android/gms/common/internal/o0;->c:Z

    if-eqz v2, :cond_5

    iget-object v2, v1, Lcom/google/android/gms/common/internal/o0;->n:Lcom/google/android/gms/common/internal/p0;

    iget-object v2, v2, Lcom/google/android/gms/common/internal/p0;->f:Lcom/google/android/gms/internal/common/zzi;

    iget-object v5, v1, Lcom/google/android/gms/common/internal/o0;->e:Lcom/google/android/gms/common/internal/n0;

    invoke-virtual {v2, v3, v5}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v2, v1, Lcom/google/android/gms/common/internal/o0;->n:Lcom/google/android/gms/common/internal/p0;

    iget-object v5, v2, Lcom/google/android/gms/common/internal/p0;->g:Ld6/a;

    iget-object v2, v2, Lcom/google/android/gms/common/internal/p0;->e:Landroid/content/Context;

    invoke-virtual {v5, v2, v1}, Ld6/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    iput-boolean v4, v1, Lcom/google/android/gms/common/internal/o0;->c:Z

    const/4 v2, 0x2

    iput v2, v1, Lcom/google/android/gms/common/internal/o0;->b:I

    :cond_5
    iget-object v1, p0, Ly5/j;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/internal/p0;

    iget-object v1, v1, Lcom/google/android/gms/common/internal/p0;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_3
    monitor-exit v0

    :goto_4
    return v3

    :goto_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :pswitch_0
    const-string v0, "Received response for unknown request: "

    const-string v5, "MessengerIpcClient"

    iget v6, p1, Landroid/os/Message;->arg1:I

    invoke-static {v5, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Received response to request: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "MessengerIpcClient"

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    iget-object v2, p0, Ly5/j;->b:Ljava/lang/Object;

    check-cast v2, Ly5/k;

    monitor-enter v2

    :try_start_2
    iget-object v5, v2, Ly5/k;->e:Landroid/util/SparseArray;

    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly5/m;

    if-nez v5, :cond_8

    const-string p1, "MessengerIpcClient"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v2

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_7

    :cond_8
    iget-object v0, v2, Ly5/k;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v6}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {v2}, Ly5/k;->c()V

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "unsupported"

    invoke-virtual {p1, v0, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string p1, "Not supported by GmsCore"

    new-instance v0, Ly5/n;

    invoke-direct {v0, p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v5, v0}, Ly5/m;->a(Ly5/n;)V

    goto :goto_6

    :cond_9
    check-cast v5, Ly5/l;

    iget v0, v5, Ly5/l;->e:I

    packed-switch v0, :pswitch_data_1

    const-string v0, "data"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_a

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_a
    invoke-virtual {v5, p1}, Ly5/m;->b(Landroid/os/Bundle;)V

    goto :goto_6

    :pswitch_1
    const-string v0, "ack"

    invoke-virtual {p1, v0, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v5, v1}, Ly5/m;->b(Landroid/os/Bundle;)V

    goto :goto_6

    :cond_b
    new-instance p1, Ly5/n;

    const-string v0, "Invalid response to one way request"

    invoke-direct {p1, v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v5, p1}, Ly5/m;->a(Ly5/n;)V

    :goto_6
    return v3

    :goto_7
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
