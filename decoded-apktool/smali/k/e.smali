.class public final Lk/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p5, p0, Lk/e;->a:I

    iput-object p1, p0, Lk/e;->e:Ljava/lang/Object;

    iput-object p2, p0, Lk/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lk/e;->c:Ljava/lang/Object;

    iput-object p4, p0, Lk/e;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget v0, p0, Lk/e;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lg8/w5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Lg8/u5;

    iget v1, v1, Lg8/u5;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    :try_start_1
    iget-object v1, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v1, Lg8/v5;

    iget-object v2, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v1, Lr7/e;

    iget v1, v1, Lr7/e;->a:I

    packed-switch v1, :pswitch_data_1

    check-cast v2, Ljava/util/concurrent/Executor;

    packed-switch v1, :pswitch_data_2

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    goto :goto_0

    :pswitch_0
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    goto :goto_0

    :pswitch_1
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    goto :goto_0

    :pswitch_2
    check-cast v2, Ljava/util/concurrent/Executor;

    packed-switch v1, :pswitch_data_3

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    goto :goto_0

    :pswitch_3
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    :try_start_2
    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v1, Lg8/w5;

    iget-object v1, v1, Lg8/w5;->a:Ljava/util/IdentityHashMap;

    iget-object v2, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v2, Lg8/v5;

    invoke-virtual {v1, v2}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v1, Lg8/w5;

    iget-object v1, v1, Lg8/w5;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v1, Lg8/w5;

    iget-object v1, v1, Lg8/w5;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v1, Lg8/w5;

    iput-object v3, v1, Lg8/w5;->c:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catchall_1
    move-exception v1

    iget-object v2, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v2, Lg8/w5;

    iget-object v2, v2, Lg8/w5;->a:Ljava/util/IdentityHashMap;

    iget-object v4, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v4, Lg8/v5;

    invoke-virtual {v2, v4}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v2, Lg8/w5;

    iget-object v2, v2, Lg8/w5;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v2}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v2, Lg8/w5;

    iget-object v2, v2, Lg8/w5;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iget-object v2, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v2, Lg8/w5;

    iput-object v3, v2, Lg8/w5;->c:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_0
    throw v1

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :pswitch_4
    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iput-boolean v1, v0, Lg8/y2;->z:Z

    iget-object v0, v0, Lg8/y2;->u:Lg8/j0;

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Le8/c2;

    iget-object v2, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v2, Lg8/i0;

    iget-object v3, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v3, Le8/l1;

    invoke-interface {v0, v1, v2, v3}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lg8/c1;

    iget-object v0, v0, Lg8/c1;->a:Lg8/j0;

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Le8/c2;

    iget-object v2, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v2, Lg8/i0;

    iget-object v3, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v3, Le8/l1;

    invoke-interface {v0, v1, v2, v3}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lg8/a;

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Le8/c2;

    iget-object v2, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v2, Lg8/i0;

    iget-object v3, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v3, Le8/l1;

    invoke-virtual {v0, v1, v2, v3}, Lg8/a;->f(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lk6/q7;

    iget-object v1, v0, Lk6/q7;->a:Lk6/p7;

    invoke-virtual {v1}, Lk6/p7;->M()Lk6/u7;

    move-result-object v2

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v4, Landroid/os/Bundle;

    const-string v5, "auto"

    iget-object v6, v0, Lk6/q7;->a:Lk6/p7;

    invoke-virtual {v6}, Lk6/p7;->zzb()Le6/b;

    move-result-object v6

    check-cast v6, Le6/c;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v8}, Lk6/u7;->z(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lk6/v;

    move-result-object v2

    iget-object v0, v0, Lk6/q7;->a:Lk6/p7;

    invoke-static {v2}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-virtual {v0, v2, v1}, Lk6/p7;->m(Lk6/v;Ljava/lang/String;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Lk/e;->d:Ljava/lang/Object;

    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    :try_start_3
    move-object v2, v1

    check-cast v2, Lk6/s6;

    iget-object v2, v2, Lk6/s6;->d:Lk6/y3;

    if-nez v2, :cond_2

    move-object v2, v1

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    const-string v4, "Discarding data. Failed to send event to service to bundle"

    invoke-virtual {v2, v4}, Lk6/f4;->b(Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v0, v3}, Lk6/u7;->J(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    goto :goto_4

    :catchall_2
    move-exception v2

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_3

    :cond_2
    :try_start_4
    iget-object v4, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v4, Lk6/v;

    iget-object v5, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-interface {v2, v4, v5}, Lk6/y3;->k(Lk6/v;Ljava/lang/String;)[B

    move-result-object v3

    move-object v2, v1

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lk6/s6;->F()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v0, v3}, Lk6/u7;->J(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    goto :goto_4

    :goto_3
    :try_start_5
    move-object v4, v1

    check-cast v4, Lk6/s6;

    invoke-virtual {v4}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v4

    iget-object v4, v4, Lk6/d4;->f:Lk6/f4;

    const-string v5, "Failed to send event to the service to bundle"

    invoke-virtual {v4, v5, v2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v0, v3}, Lk6/u7;->J(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    :goto_4
    return-void

    :goto_5
    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v0, v3}, Lk6/u7;->J(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    throw v2

    :pswitch_9
    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->m()Lk6/s6;

    move-result-object v0

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzcv;

    iget-object v1, p0, Lk/e;->c:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, p0, Lk/e;->d:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/p2;->s()V

    invoke-virtual {v0, v2}, Lk6/s6;->H(Z)Lk6/x7;

    move-result-object v7

    new-instance v1, Lb3/a1;

    const/4 v9, 0x2

    move-object v3, v1

    move-object v4, v0

    invoke-direct/range {v3 .. v9}, Lb3/a1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lk6/s6;->v(Ljava/lang/Runnable;)V

    return-void

    :pswitch_a
    iget-object v0, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_6
    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lk6/s6;

    iget-object v2, v2, Lk6/s6;->d:Lk6/y3;

    if-nez v2, :cond_3

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    iget-object v1, v1, Lk6/d4;->f:Lk6/f4;

    const-string v2, "Failed to get trigger URIs; not connected to service"

    invoke-virtual {v1, v2}, Lk6/f4;->b(Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v1

    goto :goto_a

    :catchall_4
    move-exception v1

    goto :goto_9

    :catch_1
    move-exception v1

    goto :goto_6

    :cond_3
    :try_start_8
    iget-object v1, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v1, Lk6/x7;

    invoke-static {v1}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v3, Lk6/x7;

    iget-object v4, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v4, Landroid/os/Bundle;

    invoke-interface {v2, v4, v3}, Lk6/y3;->c(Landroid/os/Bundle;Lk6/x7;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v1, Lk6/s6;

    invoke-virtual {v1}, Lk6/s6;->F()V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_7

    :goto_6
    :try_start_a
    iget-object v2, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    const-string v3, "Failed to get trigger URIs; remote exception"

    invoke-virtual {v2, v3, v1}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :try_start_b
    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    :goto_7
    monitor-exit v0

    :goto_8
    return-void

    :goto_9
    iget-object v2, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :goto_a
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    throw v1

    :pswitch_b
    iget-object v0, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->m()Lk6/s6;

    move-result-object v0

    iget-object v1, p0, Lk/e;->b:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzcv;

    iget-object v1, p0, Lk/e;->c:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lk6/v;

    iget-object v1, p0, Lk/e;->d:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/p2;->s()V

    invoke-virtual {v0}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    sget-object v3, Lz5/f;->b:Lz5/f;

    invoke-virtual {v1}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v1

    const v4, 0xbdfcb8

    invoke-virtual {v3, v1, v4}, Lz5/f;->c(Landroid/content/Context;I)I

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v1

    const-string v3, "Not bundling data. Service unavailable or out of date"

    iget-object v1, v1, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {v1, v3}, Lk6/f4;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    new-array v1, v2, [B

    invoke-virtual {v0, v7, v1}, Lk6/u7;->J(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    goto :goto_b

    :cond_4
    new-instance v1, Lk/e;

    const/4 v8, 0x4

    move-object v3, v1

    move-object v4, v0

    invoke-direct/range {v3 .. v8}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lk6/s6;->v(Ljava/lang/Runnable;)V

    :goto_b
    return-void

    :pswitch_c
    iget-object v0, p0, Lk/e;->b:Ljava/lang/Object;

    check-cast v0, Lk/g;

    if-eqz v0, :cond_5

    iget-object v4, p0, Lk/e;->e:Ljava/lang/Object;

    check-cast v4, Lk/f;

    iget-object v5, v4, Lk/f;->b:Ljava/lang/Object;

    check-cast v5, Lk/h;

    iput-boolean v1, v5, Lk/h;->H:Z

    iget-object v0, v0, Lk/g;->b:Lk/l;

    invoke-virtual {v0, v2}, Lk/l;->c(Z)V

    iget-object v0, v4, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iput-boolean v2, v0, Lk/h;->H:Z

    :cond_5
    iget-object v0, p0, Lk/e;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lk/e;->d:Ljava/lang/Object;

    check-cast v1, Lk/l;

    const/4 v2, 0x4

    invoke-virtual {v1, v0, v3, v2}, Lk/l;->p(Landroid/view/MenuItem;Lk/s;I)Z

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x15
        :pswitch_3
    .end packed-switch
.end method
