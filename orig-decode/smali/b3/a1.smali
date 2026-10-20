.class public final Lb3/a1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p6, p0, Lb3/a1;->a:I

    iput-object p1, p0, Lb3/a1;->f:Ljava/lang/Object;

    iput-object p2, p0, Lb3/a1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb3/a1;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb3/a1;->d:Ljava/lang/Object;

    iput-object p5, p0, Lb3/a1;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lb3/a1;->a:I

    iput-object p1, p0, Lb3/a1;->f:Ljava/lang/Object;

    iput-object p2, p0, Lb3/a1;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lb3/a1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb3/a1;->d:Ljava/lang/Object;

    iput-object p4, p0, Lb3/a1;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, Lb3/a1;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/a1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/g5;

    iget-object v3, p0, Lb3/a1;->c:Ljava/lang/Object;

    check-cast v3, Lg8/g5;

    if-eq v2, v3, :cond_0

    iget-object v2, v2, Lg8/g5;->a:Lg8/h0;

    sget-object v3, Lg8/y2;->G:Le8/c2;

    invoke-interface {v2, v3}, Lg8/h0;->i(Le8/c2;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb3/a1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Future;

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_2
    iget-object v0, p0, Lb3/a1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Future;

    if-eqz v0, :cond_3

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    iget-object v0, p0, Lb3/a1;->f:Ljava/lang/Object;

    check-cast v0, Lg8/y2;

    iget-object v1, v0, Lg8/y2;->D:Lz5/k;

    iget-object v1, v1, Lz5/k;->a:Ljava/lang/Object;

    check-cast v1, Lg8/l3;

    iget-object v1, v1, Lg8/l3;->E:Li3/a0;

    iget-object v2, v1, Li3/a0;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v1, Li3/a0;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v0, v1, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, v1, Li3/a0;->c:Ljava/lang/Object;

    check-cast v0, Le8/c2;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, v1, Li3/a0;->b:Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_5

    iget-object v1, v1, Li3/a0;->d:Ljava/lang/Object;

    check-cast v1, Lg8/l3;

    iget-object v1, v1, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v1, v0}, Lg8/y0;->f(Le8/c2;)V

    :cond_5
    return-void

    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lb3/a1;->d:Ljava/lang/Object;

    iget-object v1, p0, Lb3/a1;->c:Ljava/lang/Object;

    iget-object v2, p0, Lb3/a1;->b:Ljava/lang/Object;

    iget-object v3, p0, Lb3/a1;->e:Ljava/lang/Object;

    iget-object v4, p0, Lb3/a1;->f:Ljava/lang/Object;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :try_start_2
    move-object v6, v4

    check-cast v6, Lk6/s6;

    iget-object v6, v6, Lk6/s6;->d:Lk6/y3;

    if-nez v6, :cond_6

    move-object v0, v4

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    const-string v6, "Failed to get conditional properties; not connected to service"

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v0, v6, v7, v8}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    check-cast v4, Lk6/s6;

    invoke-virtual {v4}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v3, v5}, Lk6/u7;->H(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/util/ArrayList;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_6
    :try_start_3
    move-object v7, v0

    check-cast v7, Lk6/x7;

    invoke-static {v7}, Lf6/a;->x(Ljava/lang/Object;)V

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    check-cast v0, Lk6/x7;

    invoke-interface {v6, v7, v8, v0}, Lk6/y3;->m(Ljava/lang/String;Ljava/lang/String;Lk6/x7;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lk6/u7;->e0(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    move-object v0, v4

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lk6/s6;->F()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    check-cast v4, Lk6/s6;

    invoke-virtual {v4}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v3, v5}, Lk6/u7;->H(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/util/ArrayList;)V

    goto :goto_4

    :goto_3
    :try_start_4
    move-object v6, v4

    check-cast v6, Lk6/s6;

    invoke-virtual {v6}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v6

    iget-object v6, v6, Lk6/d4;->f:Lk6/f4;

    const-string v7, "Failed to get conditional properties; remote exception"

    check-cast v2, Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v6, v7, v2, v1, v0}, Lk6/f4;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    check-cast v4, Lk6/s6;

    invoke-virtual {v4}, Lf4/y;->k()Lk6/u7;

    move-result-object v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v3, v5}, Lk6/u7;->H(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/util/ArrayList;)V

    :goto_4
    return-void

    :goto_5
    check-cast v4, Lk6/s6;

    invoke-virtual {v4}, Lf4/y;->k()Lk6/u7;

    move-result-object v1

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v3, v5}, Lk6/u7;->H(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/util/ArrayList;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lb3/a1;->f:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    iget-object v0, v0, Lf4/y;->a:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    invoke-virtual {v0}, Lk6/f5;->m()Lk6/s6;

    move-result-object v0

    iget-object v2, p0, Lb3/a1;->b:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lb3/a1;->d:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    iget-object v2, p0, Lb3/a1;->e:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/p2;->s()V

    invoke-virtual {v0, v1}, Lk6/s6;->H(Z)Lk6/x7;

    move-result-object v7

    new-instance v1, Lk6/n6;

    move-object v2, v1

    move-object v3, v0

    invoke-direct/range {v2 .. v7}, Lk6/n6;-><init>(Lk6/s6;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Lk6/x7;)V

    invoke-virtual {v0, v1}, Lk6/s6;->v(Ljava/lang/Runnable;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lb3/a1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lb3/c1;->g(Landroid/view/View;)V

    iget-object v0, p0, Lb3/a1;->e:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
