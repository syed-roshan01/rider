.class public final Ll/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/h;->a:I

    iput-object p2, p0, Ll/h;->c:Ljava/lang/Object;

    iput-object p3, p0, Ll/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Ll/h;->a:I

    iput-object p1, p0, Ll/h;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk6/p7;Ljava/lang/Runnable;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xd

    iput v0, p0, Ll/h;->a:I

    iput-object p1, p0, Ll/h;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    iget v0, v1, Ll/h;->a:I

    const/4 v2, 0x2

    const/16 v3, 0x1e

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :try_start_0
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lu8/k;->a:Lu8/k;

    invoke-static {v2, v0}, Lh6/g;->n0(Lu8/j;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    sget-object v2, Lr9/i;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0}, Lr9/i;->f0()Ljava/lang/Runnable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iput-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    add-int/2addr v8, v7

    const/16 v0, 0x10

    if-lt v8, v0, :cond_0

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->c:Lm9/z;

    invoke-virtual {v0}, Lm9/z;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v2, v0, Lr9/i;->c:Lm9/z;

    invoke-virtual {v2, v0, v1}, Lm9/z;->c0(Lu8/j;Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :pswitch_0
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lm9/k;

    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Ln9/d;

    invoke-interface {v0, v2}, Lm9/k;->d(Lm9/z;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lm9/k;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lm9/z;

    invoke-interface {v0, v2}, Lm9/k;->d(Lm9/z;)V

    return-void

    :pswitch_2
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lg8/m;

    iget-wide v2, v0, Lg8/m;->a:J

    const-wide/16 v4, 0x2

    mul-long/2addr v4, v2

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object v0, v0, Lg8/m;->b:Lg8/n;

    iget-object v6, v0, Lg8/n;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6, v2, v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lg8/n;->c:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-object v0, v0, Lg8/n;->a:Ljava/lang/String;

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Increased {0} to {1}"

    invoke-virtual {v2, v3, v4, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void

    :pswitch_3
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lf8/b;

    iget-object v0, v0, Lf8/b;->b:Landroid/content/Context;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lf8/a;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lf8/b;

    iget-object v0, v0, Lf8/b;->c:Landroid/net/ConnectivityManager;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lr4/h;

    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void

    :pswitch_5
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    :try_start_1
    check-cast v0, Ljava/util/concurrent/Future;

    invoke-static {v0}, Lf6/a;->M(Ljava/util/concurrent/Future;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Ll/t;

    iget-object v2, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v2, Lk6/y5;

    invoke-virtual {v2}, Lk6/q3;->l()V

    iget-object v2, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v2, Lk6/y5;

    iput-boolean v8, v2, Lk6/y5;->i:Z

    invoke-virtual {v2}, Lk6/y5;->P()V

    iget-object v2, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v2, Lk6/y5;

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    iget-object v0, v0, Ll/t;->b:Ljava/lang/Object;

    check-cast v0, Lk6/i7;

    iget-object v0, v0, Lk6/i7;->a:Ljava/lang/String;

    iget-object v2, v2, Lk6/d4;->m:Lk6/f4;

    const-string v3, "registerTriggerAsync ran. uri"

    invoke-virtual {v2, v3, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :goto_2
    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Ll/t;

    invoke-virtual {v2, v0}, Ll/t;->f(Ljava/lang/Throwable;)V

    goto :goto_4

    :goto_3
    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Ll/t;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/t;->f(Ljava/lang/Throwable;)V

    :goto_4
    return-void

    :pswitch_6
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/p7;

    invoke-virtual {v0}, Lk6/p7;->zzl()Lk6/z4;

    move-result-object v2

    invoke-virtual {v2}, Lk6/z4;->l()V

    new-instance v2, Lk6/r4;

    invoke-direct {v2, v0}, Lk6/r4;-><init>(Lk6/p7;)V

    iput-object v2, v0, Lk6/p7;->k:Lk6/r4;

    new-instance v2, Lk6/k;

    invoke-direct {v2, v0}, Lk6/k;-><init>(Lk6/p7;)V

    invoke-virtual {v2}, Lk6/m7;->q()V

    iput-object v2, v0, Lk6/p7;->c:Lk6/k;

    invoke-virtual {v0}, Lk6/p7;->H()Lk6/f;

    move-result-object v2

    iget-object v3, v0, Lk6/p7;->a:Lk6/t4;

    invoke-static {v3}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object v3, v2, Lk6/f;->c:Lk6/g;

    new-instance v2, Lk6/c7;

    invoke-direct {v2, v0}, Lk6/c7;-><init>(Lk6/p7;)V

    invoke-virtual {v2}, Lk6/m7;->q()V

    iput-object v2, v0, Lk6/p7;->i:Lk6/c7;

    new-instance v2, Lk6/z7;

    invoke-direct {v2, v0}, Lk6/m7;-><init>(Lk6/p7;)V

    invoke-virtual {v2}, Lk6/m7;->q()V

    iput-object v2, v0, Lk6/p7;->f:Lk6/z7;

    new-instance v2, Lk6/o6;

    invoke-direct {v2, v0}, Lk6/m7;-><init>(Lk6/p7;)V

    invoke-virtual {v2}, Lk6/m7;->q()V

    iput-object v2, v0, Lk6/p7;->h:Lk6/o6;

    new-instance v2, Lk6/j7;

    invoke-direct {v2, v0}, Lk6/j7;-><init>(Lk6/p7;)V

    invoke-virtual {v2}, Lk6/m7;->q()V

    iput-object v2, v0, Lk6/p7;->e:Lk6/j7;

    new-instance v2, Lk6/k4;

    invoke-direct {v2, v0}, Lk6/k4;-><init>(Lk6/p7;)V

    iput-object v2, v0, Lk6/p7;->d:Lk6/k4;

    iget v2, v0, Lk6/p7;->r:I

    iget v3, v0, Lk6/p7;->s:I

    if-eq v2, v3, :cond_3

    invoke-virtual {v0}, Lk6/p7;->zzj()Lk6/d4;

    move-result-object v2

    iget v3, v0, Lk6/p7;->r:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, v0, Lk6/p7;->s:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    const-string v8, "Not all upload components initialized"

    invoke-virtual {v2, v8, v3, v4}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    iput-boolean v7, v0, Lk6/p7;->m:Z

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/p7;

    invoke-virtual {v0}, Lk6/p7;->zzl()Lk6/z4;

    move-result-object v2

    invoke-virtual {v2}, Lk6/z4;->l()V

    iget-object v2, v0, Lk6/p7;->c:Lk6/k;

    invoke-static {v2}, Lk6/p7;->o(Lk6/m7;)V

    invoke-virtual {v2}, Lk6/k;->h0()V

    iget-object v2, v0, Lk6/p7;->i:Lk6/c7;

    iget-object v2, v2, Lk6/c7;->g:Lk6/p4;

    invoke-virtual {v2}, Lk6/p4;->a()J

    move-result-wide v2

    cmp-long v2, v2, v5

    if-nez v2, :cond_4

    iget-object v2, v0, Lk6/p7;->i:Lk6/c7;

    iget-object v2, v2, Lk6/c7;->g:Lk6/p4;

    invoke-virtual {v0}, Lk6/p7;->zzb()Le6/b;

    move-result-object v3

    check-cast v3, Le6/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lk6/p4;->b(J)V

    :cond_4
    invoke-virtual {v0}, Lk6/p7;->v()V

    return-void

    :pswitch_7
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lk6/f5;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Ll/t;

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/p2;->s()V

    if-eqz v2, :cond_6

    iget-object v3, v0, Lk6/y5;->d:Lk6/v5;

    if-eq v2, v3, :cond_6

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    move v7, v8

    :goto_5
    const-string v3, "EventInterceptor already set."

    invoke-static {v3, v7}, Lf6/a;->z(Ljava/lang/String;Z)V

    :cond_6
    iput-object v2, v0, Lk6/y5;->d:Lk6/v5;

    return-void

    :pswitch_8
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/p7;

    invoke-virtual {v0}, Lk6/p7;->N()V

    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/p7;

    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Runnable;

    invoke-virtual {v0}, Lk6/p7;->zzl()Lk6/z4;

    move-result-object v3

    invoke-virtual {v3}, Lk6/z4;->l()V

    iget-object v3, v0, Lk6/p7;->p:Ljava/util/ArrayList;

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lk6/p7;->p:Ljava/util/ArrayList;

    :cond_7
    iget-object v0, v0, Lk6/p7;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/p7;

    invoke-virtual {v0}, Lk6/p7;->P()V

    return-void

    :pswitch_9
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/z6;

    iget-object v0, v0, Lk6/z6;->c:Lk6/s6;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/ComponentName;

    invoke-virtual {v0}, Lk6/q3;->l()V

    iget-object v3, v0, Lk6/s6;->d:Lk6/y3;

    if-eqz v3, :cond_8

    iput-object v4, v0, Lk6/s6;->d:Lk6/y3;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v3

    const-string v4, "Disconnected from device MeasurementService"

    iget-object v3, v3, Lk6/d4;->n:Lk6/f4;

    invoke-virtual {v3, v4, v2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/s6;->A()V

    :cond_8
    return-void

    :pswitch_a
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lk6/s6;

    iget-object v3, v2, Lk6/s6;->d:Lk6/y3;

    if-nez v3, :cond_9

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    const-string v2, "Failed to send current screen to service"

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v0, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_8

    :cond_9
    :try_start_2
    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lk6/q6;

    if-nez v4, :cond_a

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v3 .. v8}, Lk6/y3;->h(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :cond_a
    move-object v4, v2

    check-cast v4, Lk6/q6;

    iget-wide v6, v4, Lk6/q6;->c:J

    move-object v4, v2

    check-cast v4, Lk6/q6;

    iget-object v4, v4, Lk6/q6;->a:Ljava/lang/String;

    check-cast v2, Lk6/q6;

    iget-object v5, v2, Lk6/q6;->b:Ljava/lang/String;

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-interface/range {v3 .. v8}, Lk6/y3;->h(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :goto_6
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/s6;

    invoke-virtual {v0}, Lk6/s6;->F()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_8

    :goto_7
    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Lk6/s6;

    invoke-virtual {v2}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    const-string v3, "Failed to send current screen to the service"

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v2, v3, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_8
    return-void

    :pswitch_b
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v0

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lk6/o;

    invoke-virtual {v0}, Lf4/y;->l()V

    invoke-virtual {v0}, Lf4/y;->l()V

    invoke-virtual {v0}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v5, "dma_consent_settings"

    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lk6/o;->b(Ljava/lang/String;)Lk6/o;

    move-result-object v3

    iget v4, v2, Lk6/o;->a:I

    iget v3, v3, Lk6/o;->a:I

    sget-object v5, Lk6/s5;->c:Lk6/s5;

    if-gt v4, v3, :cond_b

    invoke-virtual {v0}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "dma_consent_settings"

    iget-object v2, v2, Lk6/o;->b:Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    invoke-virtual {v0}, Lk6/q3;->q()Lk6/s6;

    move-result-object v0

    invoke-virtual {v0, v8}, Lk6/s6;->z(Z)V

    goto :goto_9

    :cond_b
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lk6/o;

    iget v2, v2, Lk6/o;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, v0, Lk6/d4;->l:Lk6/f4;

    const-string v3, "Lower precedence consent source ignored, proposed source"

    invoke-virtual {v0, v3, v2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_9
    return-void

    :pswitch_c
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v7}, Lk6/y5;->y(Ljava/lang/Boolean;Z)V

    return-void

    :pswitch_d
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    invoke-virtual {v0}, Lk6/q3;->r()Lk6/d7;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpr;->zza()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Lf4/y;->h()Lk6/f;

    move-result-object v2

    sget-object v3, Lk6/x;->v0:Lk6/x3;

    invoke-virtual {v2, v4, v3}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v2

    invoke-virtual {v2}, Lk6/l4;->u()Lk6/s5;

    move-result-object v2

    sget-object v3, Lk6/r5;->c:Lk6/r5;

    invoke-virtual {v2, v3}, Lk6/s5;->f(Lk6/r5;)Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    const-string v2, "Analytics storage consent denied; will not get session id"

    iget-object v0, v0, Lk6/d4;->k:Lk6/f4;

    invoke-virtual {v0, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_c
    :goto_a
    move-object v0, v4

    goto :goto_b

    :cond_d
    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v2

    invoke-virtual {v0}, Lf4/y;->zzb()Le6/b;

    move-result-object v3

    check-cast v3, Le6/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, Lk6/l4;->q(J)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v2

    iget-object v2, v2, Lk6/l4;->p:Lk6/p4;

    invoke-virtual {v2}, Lk6/p4;->a()J

    move-result-wide v2

    cmp-long v2, v2, v5

    if-nez v2, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v0

    iget-object v0, v0, Lk6/l4;->p:Lk6/p4;

    invoke-virtual {v0}, Lk6/p4;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_b

    :cond_f
    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    const-string v2, "getSessionId has been disabled."

    iget-object v0, v0, Lk6/d4;->k:Lk6/f4;

    invoke-virtual {v0, v2}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_a

    :goto_b
    if-eqz v0, :cond_10

    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Lk6/y5;

    iget-object v2, v2, Lf4/y;->a:Ljava/lang/Object;

    check-cast v2, Lk6/f5;

    iget-object v2, v2, Lk6/f5;->l:Lk6/u7;

    invoke-static {v2}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v3, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lk6/u7;->F(Lcom/google/android/gms/internal/measurement/zzcv;J)V

    goto :goto_c

    :cond_10
    :try_start_3
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_c

    :catch_4
    move-exception v0

    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Lk6/y5;

    iget-object v2, v2, Lf4/y;->a:Ljava/lang/Object;

    check-cast v2, Lk6/f5;

    iget-object v2, v2, Lk6/f5;->i:Lk6/d4;

    invoke-static {v2}, Lk6/f5;->d(Lk6/o5;)V

    const-string v3, "getSessionId failed with exception"

    iget-object v2, v2, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v2, v3, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_c
    return-void

    :pswitch_e
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lk6/q3;->m()Lk6/z3;

    move-result-object v3

    iget-object v4, v3, Lk6/z3;->p:Ljava/lang/String;

    if-eqz v4, :cond_11

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_d

    :cond_11
    move v7, v8

    :goto_d
    iput-object v2, v3, Lk6/z3;->p:Ljava/lang/String;

    if-eqz v7, :cond_12

    invoke-virtual {v0}, Lk6/q3;->m()Lk6/z3;

    move-result-object v0

    invoke-virtual {v0}, Lk6/z3;->x()V

    :cond_12
    return-void

    :pswitch_f
    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/y5;

    iget-object v2, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-virtual {v0}, Lk6/q3;->l()V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v3, :cond_16

    invoke-virtual {v0}, Lf4/y;->j()Lk6/l4;

    move-result-object v3

    invoke-virtual {v3}, Lk6/l4;->t()Landroid/util/SparseArray;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk6/i7;

    iget v5, v4, Lk6/i7;->c:I

    invoke-static {v3, v5}, Lb3/s1;->e(Landroid/util/SparseArray;I)Z

    move-result v5

    if-eqz v5, :cond_14

    iget v5, v4, Lk6/i7;->c:I

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-wide v7, v4, Lk6/i7;->b:J

    cmp-long v5, v5, v7

    if-gez v5, :cond_13

    :cond_14
    invoke-virtual {v0}, Lk6/y5;->Q()Ljava/util/PriorityQueue;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_15
    invoke-virtual {v0}, Lk6/y5;->P()V

    :cond_16
    return-void

    :pswitch_10
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/h5;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    invoke-virtual {v0}, Lk6/p7;->N()V

    iget-object v0, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/e;

    iget-object v0, v0, Lk6/e;->c:Lk6/t7;

    invoke-virtual {v0}, Lk6/t7;->e()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_17

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/h5;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lk6/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lk6/e;->a:Ljava/lang/String;

    invoke-static {v3}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lk6/p7;->B(Ljava/lang/String;)Lk6/x7;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-virtual {v0, v2, v3}, Lk6/p7;->l(Lk6/e;Lk6/x7;)V

    goto :goto_f

    :cond_17
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/h5;

    iget-object v0, v0, Lk6/h5;->a:Lk6/p7;

    iget-object v2, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v2, Lk6/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lk6/e;->a:Ljava/lang/String;

    invoke-static {v3}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lk6/p7;->B(Ljava/lang/String;)Lk6/x7;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-virtual {v0, v2, v3}, Lk6/p7;->y(Lk6/e;Lk6/x7;)V

    :cond_18
    :goto_f
    return-void

    :pswitch_11
    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v9, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v9, Lk6/w5;

    iget-object v10, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v10}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {v10}, Lk6/z4;->l()V

    new-instance v10, Lk6/r;

    invoke-direct {v10, v0}, Lk6/o5;-><init>(Lk6/f5;)V

    invoke-virtual {v10}, Lk6/o5;->n()V

    iput-object v10, v0, Lk6/f5;->v:Lk6/r;

    new-instance v10, Lk6/z3;

    iget-wide v11, v9, Lk6/w5;->f:J

    invoke-direct {v10, v0}, Lk6/p2;-><init>(Lk6/f5;)V

    iput-wide v5, v10, Lk6/z3;->o:J

    iput-object v4, v10, Lk6/z3;->p:Ljava/lang/String;

    iput-wide v11, v10, Lk6/z3;->h:J

    invoke-virtual {v10}, Lk6/p2;->t()V

    iput-object v10, v0, Lk6/f5;->w:Lk6/z3;

    new-instance v9, Lk6/b4;

    invoke-direct {v9, v0}, Lk6/b4;-><init>(Lk6/f5;)V

    invoke-virtual {v9}, Lk6/p2;->t()V

    iput-object v9, v0, Lk6/f5;->t:Lk6/b4;

    new-instance v9, Lk6/s6;

    invoke-direct {v9, v0}, Lk6/s6;-><init>(Lk6/f5;)V

    invoke-virtual {v9}, Lk6/p2;->t()V

    iput-object v9, v0, Lk6/f5;->u:Lk6/s6;

    iget-object v9, v0, Lk6/f5;->l:Lk6/u7;

    iget-boolean v11, v9, Lk6/o5;->b:Z

    if-nez v11, :cond_44

    invoke-virtual {v9}, Lk6/u7;->y0()V

    iget-object v11, v9, Lf4/y;->a:Ljava/lang/Object;

    check-cast v11, Lk6/f5;

    iget-object v11, v11, Lk6/f5;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iput-boolean v7, v9, Lk6/o5;->b:Z

    iget-object v11, v0, Lk6/f5;->h:Lk6/l4;

    iget-boolean v12, v11, Lk6/o5;->b:Z

    if-nez v12, :cond_43

    invoke-virtual {v11}, Lk6/l4;->v()V

    iget-object v12, v11, Lf4/y;->a:Ljava/lang/Object;

    check-cast v12, Lk6/f5;

    iget-object v12, v12, Lk6/f5;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iput-boolean v7, v11, Lk6/o5;->b:Z

    iget-object v11, v0, Lk6/f5;->w:Lk6/z3;

    iget-boolean v12, v11, Lk6/p2;->b:Z

    if-nez v12, :cond_42

    invoke-virtual {v11}, Lk6/z3;->y()V

    iget-object v12, v11, Lf4/y;->a:Ljava/lang/Object;

    check-cast v12, Lk6/f5;

    iget-object v12, v12, Lk6/f5;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iput-boolean v7, v11, Lk6/p2;->b:Z

    iget-object v11, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {v11}, Lk6/f5;->d(Lk6/o5;)V

    const-wide/32 v12, 0x14051

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const-string v13, "App measurement initialized, version"

    iget-object v14, v11, Lk6/d4;->l:Lk6/f4;

    invoke-virtual {v14, v13, v12}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v11}, Lk6/f5;->d(Lk6/o5;)V

    const-string v12, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {v14, v12}, Lk6/f4;->b(Ljava/lang/String;)V

    invoke-virtual {v10}, Lk6/z3;->v()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v0, Lk6/f5;->b:Ljava/lang/String;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_1b

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_19

    goto :goto_10

    :cond_19
    invoke-virtual {v9}, Lf4/y;->h()Lk6/f;

    move-result-object v9

    const-string v12, "debug.firebase.analytics.app"

    invoke-virtual {v9, v12}, Lk6/f;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    invoke-static {v11}, Lk6/f5;->d(Lk6/o5;)V

    const-string v9, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    invoke-virtual {v14, v9}, Lk6/f4;->b(Ljava/lang/String;)V

    goto :goto_11

    :cond_1a
    :goto_10
    invoke-static {v11}, Lk6/f5;->d(Lk6/o5;)V

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v14, v9}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_1b
    :goto_11
    invoke-static {v11}, Lk6/f5;->d(Lk6/o5;)V

    const-string v9, "Debug-level message logging enabled"

    iget-object v10, v11, Lk6/d4;->m:Lk6/f4;

    invoke-virtual {v10, v9}, Lk6/f4;->b(Ljava/lang/String;)V

    iget v9, v0, Lk6/f5;->E:I

    iget-object v10, v0, Lk6/f5;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v12

    if-eq v9, v12, :cond_1c

    invoke-static {v11}, Lk6/f5;->d(Lk6/o5;)V

    iget v9, v0, Lk6/f5;->E:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v11, v11, Lk6/d4;->f:Lk6/f4;

    const-string v12, "Not all components initialized"

    invoke-virtual {v11, v12, v9, v10}, Lk6/f4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1c
    iput-boolean v7, v0, Lk6/f5;->x:Z

    iget-object v0, v1, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v9, v1, Ll/h;->b:Ljava/lang/Object;

    check-cast v9, Lk6/w5;

    iget-object v9, v9, Lk6/w5;->g:Lcom/google/android/gms/internal/measurement/zzdd;

    iget-object v10, v0, Lk6/f5;->j:Lk6/z4;

    invoke-static {v10}, Lk6/f5;->d(Lk6/o5;)V

    invoke-virtual {v10}, Lk6/z4;->l()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpg;->zza()Z

    move-result v10

    iget-object v11, v0, Lk6/f5;->l:Lk6/u7;

    iget-object v12, v0, Lk6/f5;->g:Lk6/f;

    const-wide/16 v13, 0x1

    if-eqz v10, :cond_1d

    sget-object v10, Lk6/x;->D0:Lk6/x3;

    invoke-virtual {v12, v4, v10}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-static {v11}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v11}, Lf4/y;->l()V

    invoke-virtual {v11}, Lk6/u7;->p0()J

    move-result-wide v15

    cmp-long v10, v15, v13

    if-nez v10, :cond_1d

    invoke-virtual {v11}, Lf4/y;->l()V

    new-instance v10, Landroid/content/IntentFilter;

    invoke-direct {v10}, Landroid/content/IntentFilter;-><init>()V

    const-string v15, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v10, v15}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v15, Lk6/y7;

    iget-object v13, v11, Lf4/y;->a:Ljava/lang/Object;

    check-cast v13, Lk6/f5;

    invoke-direct {v15, v13}, Lk6/y7;-><init>(Lk6/f5;)V

    invoke-virtual {v11}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v13

    invoke-static {v13, v15, v10, v2}, Lr2/k;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    invoke-virtual {v11}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v2

    const-string v10, "Registered app receiver"

    iget-object v2, v2, Lk6/d4;->m:Lk6/f4;

    invoke-virtual {v2, v10}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_1d
    iget-object v2, v0, Lk6/f5;->h:Lk6/l4;

    invoke-static {v2}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v2}, Lk6/l4;->u()Lk6/s5;

    move-result-object v10

    const-string v13, "google_analytics_default_allow_ad_storage"

    invoke-virtual {v12, v13}, Lk6/f;->w(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v13

    const-string v14, "google_analytics_default_allow_analytics_storage"

    invoke-virtual {v12, v14}, Lk6/f;->w(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v14

    iget-wide v5, v0, Lk6/f5;->H:J

    iget-object v15, v0, Lk6/f5;->p:Lk6/y5;

    const/16 v7, -0xa

    if-nez v13, :cond_1e

    if-eqz v14, :cond_1f

    :cond_1e
    invoke-virtual {v2, v7}, Lk6/l4;->p(I)Z

    move-result v18

    if-eqz v18, :cond_1f

    new-instance v8, Lk6/s5;

    invoke-direct {v8, v13, v14, v7}, Lk6/s5;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    goto :goto_13

    :cond_1f
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v8

    invoke-virtual {v8}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_21

    iget v8, v10, Lk6/s5;->b:I

    if-eqz v8, :cond_20

    if-eq v8, v3, :cond_20

    const/16 v13, 0xa

    if-eq v8, v13, :cond_20

    if-eq v8, v3, :cond_20

    if-eq v8, v3, :cond_20

    const/16 v13, 0x28

    if-ne v8, v13, :cond_21

    :cond_20
    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v8, Lk6/s5;

    invoke-direct {v8, v4, v4, v7}, Lk6/s5;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    invoke-virtual {v15, v8, v5, v6}, Lk6/y5;->J(Lk6/s5;J)V

    goto :goto_12

    :cond_21
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v8

    invoke-virtual {v8}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_23

    if-eqz v9, :cond_23

    iget-object v8, v9, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v8, :cond_23

    invoke-virtual {v2, v3}, Lk6/l4;->p(I)Z

    move-result v8

    if-eqz v8, :cond_23

    iget-object v8, v9, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    invoke-static {v3, v8}, Lk6/s5;->b(ILandroid/os/Bundle;)Lk6/s5;

    move-result-object v8

    iget-object v13, v8, Lk6/s5;->a:Ljava/util/EnumMap;

    invoke-virtual {v13}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_22
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_23

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    if-eqz v14, :cond_22

    goto :goto_13

    :cond_23
    :goto_12
    move-object v8, v4

    :goto_13
    if-eqz v8, :cond_24

    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v15, v8, v5, v6}, Lk6/y5;->J(Lk6/s5;J)V

    move-object v10, v8

    :cond_24
    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v15, v10}, Lk6/y5;->I(Lk6/s5;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznp;->zza()Z

    move-result v8

    if-eqz v8, :cond_2b

    sget-object v8, Lk6/x;->I0:Lk6/x3;

    invoke-virtual {v12, v4, v8}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v8

    if-eqz v8, :cond_2b

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v8

    const-string v10, "dma_consent_settings"

    invoke-interface {v8, v10, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lk6/o;->b(Ljava/lang/String;)Lk6/o;

    move-result-object v8

    iget v8, v8, Lk6/o;->a:I

    const-string v10, "google_analytics_default_allow_ad_user_data"

    invoke-virtual {v12, v10}, Lk6/f;->w(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    if-eqz v10, :cond_25

    if-gt v7, v8, :cond_25

    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v3, Lk6/o;

    invoke-direct {v3, v10, v7, v4, v4}, Lk6/o;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v15, v3}, Lk6/y5;->H(Lk6/o;)V

    goto/16 :goto_15

    :cond_25
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v10

    invoke-virtual {v10}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_27

    if-eqz v8, :cond_26

    if-ne v8, v3, :cond_27

    :cond_26
    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v3, Lk6/o;

    invoke-direct {v3, v4, v7, v4, v4}, Lk6/o;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v15, v3}, Lk6/y5;->H(Lk6/o;)V

    goto/16 :goto_15

    :cond_27
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v7

    invoke-virtual {v7}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_29

    if-eqz v9, :cond_29

    iget-object v7, v9, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v7, :cond_29

    if-gt v3, v8, :cond_29

    invoke-static {v3, v7}, Lk6/o;->a(ILandroid/os/Bundle;)Lk6/o;

    move-result-object v3

    iget-object v7, v3, Lk6/o;->e:Ljava/util/EnumMap;

    invoke-virtual {v7}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_28
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_29

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    if-eqz v8, :cond_28

    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v15, v3}, Lk6/y5;->H(Lk6/o;)V

    :cond_29
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v3

    invoke-virtual {v3}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2b

    if-eqz v9, :cond_2b

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v3, :cond_2b

    iget-object v3, v2, Lk6/l4;->l:Lj0/b0;

    invoke-virtual {v3}, Lj0/b0;->j()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2b

    iget-object v3, v9, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-nez v3, :cond_2a

    move-object v3, v4

    goto :goto_14

    :cond_2a
    const-string v7, "ad_personalization"

    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lk6/s5;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    :goto_14
    if-eqz v3, :cond_2b

    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v7, v9, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    const-string v8, "allow_personalized_ads"

    invoke-virtual {v3}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-virtual {v15, v7, v8, v3, v9}, Lk6/y5;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_2b
    :goto_15
    iget-object v3, v2, Lk6/l4;->e:Lk6/p4;

    invoke-virtual {v3}, Lk6/p4;->a()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    iget-object v8, v0, Lk6/f5;->i:Lk6/d4;

    if-nez v7, :cond_2c

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-object v9, v8, Lk6/d4;->n:Lk6/f4;

    const-string v10, "Persisting first open"

    invoke-virtual {v9, v10, v7}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v5, v6}, Lk6/p4;->b(J)V

    :cond_2c
    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v7, v15, Lk6/y5;->n:Lk6/g5;

    invoke-virtual {v7}, Lk6/g5;->c()Z

    move-result v9

    if-eqz v9, :cond_2d

    invoke-virtual {v7}, Lk6/g5;->d()Z

    move-result v9

    if-eqz v9, :cond_2d

    iget-object v7, v7, Lk6/g5;->a:Lk6/f5;

    iget-object v7, v7, Lk6/f5;->h:Lk6/l4;

    invoke-static {v7}, Lk6/f5;->c(Lk6/o5;)V

    iget-object v7, v7, Lk6/l4;->v:Lj0/b0;

    invoke-virtual {v7, v4}, Lj0/b0;->k(Ljava/lang/String;)V

    :cond_2d
    invoke-virtual {v0}, Lk6/f5;->f()Z

    move-result v7

    if-nez v7, :cond_33

    invoke-virtual {v0}, Lk6/f5;->e()Z

    move-result v3

    if-eqz v3, :cond_32

    invoke-static {v11}, Lk6/f5;->c(Lk6/o5;)V

    const-string v3, "android.permission.INTERNET"

    invoke-virtual {v11, v3}, Lk6/u7;->m0(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2e

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v3, "App is missing INTERNET permission"

    iget-object v5, v8, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v5, v3}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_2e
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v11, v3}, Lk6/u7;->m0(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2f

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v3, "App is missing ACCESS_NETWORK_STATE permission"

    iget-object v5, v8, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v5, v3}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_2f
    iget-object v0, v0, Lk6/f5;->a:Landroid/content/Context;

    invoke-static {v0}, Lf6/b;->a(Landroid/content/Context;)Lj/a;

    move-result-object v3

    invoke-virtual {v3}, Lj/a;->e()Z

    move-result v3

    if-nez v3, :cond_31

    invoke-virtual {v12}, Lk6/f;->A()Z

    move-result v3

    if-nez v3, :cond_31

    invoke-static {v0}, Lk6/u7;->Q(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_30

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v3, "AppMeasurementReceiver not registered/enabled"

    iget-object v5, v8, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v5, v3}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_30
    invoke-static {v0}, Lk6/u7;->j0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_31

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v0, "AppMeasurementService not registered/enabled"

    iget-object v3, v8, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v3, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_31
    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v0, "Uploading is not possible. App measurement disabled"

    iget-object v3, v8, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v3, v0}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_32
    move-object/from16 v17, v11

    goto/16 :goto_1c

    :cond_33
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v7

    invoke-virtual {v7}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    iget-object v9, v2, Lk6/l4;->f:Lj0/b0;

    if-eqz v7, :cond_35

    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v7

    invoke-virtual {v7}, Lk6/p2;->s()V

    iget-object v7, v7, Lk6/z3;->m:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_34

    goto :goto_16

    :cond_34
    move-object/from16 v17, v11

    goto/16 :goto_18

    :cond_35
    :goto_16
    invoke-virtual {v0}, Lk6/f5;->n()V

    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v7

    invoke-virtual {v7}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v10

    const-string v13, "gmp_app_id"

    invoke-interface {v10, v13, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v14

    invoke-virtual {v14}, Lk6/p2;->s()V

    iget-object v14, v14, Lk6/z3;->m:Ljava/lang/String;

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v1

    move-object/from16 v17, v11

    const-string v11, "admob_app_id"

    invoke-interface {v1, v11, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v10, v14, v1}, Lk6/u7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v1, "Rechecking which service to use due to a GMP App Id change"

    iget-object v7, v8, Lk6/d4;->l:Lk6/f4;

    invoke-virtual {v7, v1}, Lk6/f4;->b(Ljava/lang/String;)V

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v7, "measurement_enabled"

    invoke-interface {v1, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v1

    const/4 v10, 0x1

    invoke-interface {v1, v7, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_17

    :cond_36
    move-object v1, v4

    :goto_17
    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-eqz v1, :cond_37

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    const-string v10, "measurement_enabled"

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v7, v10, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_37
    iget-object v1, v0, Lk6/f5;->t:Lk6/b4;

    invoke-static {v1}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v1, v0, Lk6/f5;->t:Lk6/b4;

    invoke-virtual {v1}, Lk6/b4;->x()V

    iget-object v1, v0, Lk6/f5;->u:Lk6/s6;

    invoke-virtual {v1}, Lk6/s6;->B()V

    iget-object v1, v0, Lk6/f5;->u:Lk6/s6;

    invoke-virtual {v1}, Lk6/s6;->A()V

    invoke-virtual {v3, v5, v6}, Lk6/p4;->b(J)V

    invoke-virtual {v9, v4}, Lj0/b0;->k(Ljava/lang/String;)V

    :cond_38
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v1

    invoke-virtual {v1}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v13, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v1

    invoke-virtual {v1}, Lk6/p2;->s()V

    iget-object v1, v1, Lk6/z3;->m:Ljava/lang/String;

    invoke-virtual {v2}, Lf4/y;->l()V

    invoke-virtual {v2}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v11, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_18
    invoke-virtual {v2}, Lk6/l4;->u()Lk6/s5;

    move-result-object v1

    sget-object v3, Lk6/r5;->c:Lk6/r5;

    invoke-virtual {v1, v3}, Lk6/s5;->f(Lk6/r5;)Z

    move-result v1

    if-nez v1, :cond_39

    invoke-virtual {v9, v4}, Lj0/b0;->k(Ljava/lang/String;)V

    :cond_39
    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v9}, Lj0/b0;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v1}, Lk6/y5;->z(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznv;->zza()Z

    move-result v1

    if-eqz v1, :cond_3a

    sget-object v1, Lk6/x;->l0:Lk6/x3;

    invoke-virtual {v12, v4, v1}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v1

    if-eqz v1, :cond_3a

    invoke-static/range {v17 .. v17}, Lk6/f5;->c(Lk6/o5;)V

    :try_start_4
    invoke-virtual/range {v17 .. v17}, Lf4/y;->zza()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v3, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_19

    :catch_5
    iget-object v1, v2, Lk6/l4;->u:Lj0/b0;

    invoke-virtual {v1}, Lj0/b0;->j()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3a

    invoke-static {v8}, Lk6/f5;->d(Lk6/o5;)V

    const-string v3, "Remote config removed with active feature rollouts"

    iget-object v5, v8, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {v5, v3}, Lk6/f4;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lj0/b0;->k(Ljava/lang/String;)V

    :cond_3a
    :goto_19
    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v1

    invoke-virtual {v1}, Lk6/z3;->w()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-virtual {v0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v1

    invoke-virtual {v1}, Lk6/p2;->s()V

    iget-object v1, v1, Lk6/z3;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_40

    :cond_3b
    invoke-virtual {v0}, Lk6/f5;->e()Z

    move-result v1

    iget-object v3, v2, Lk6/l4;->c:Landroid/content/SharedPreferences;

    if-nez v3, :cond_3c

    goto :goto_1a

    :cond_3c
    const-string v5, "deferred_analytics_collection"

    invoke-interface {v3, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3e

    :goto_1a
    const-string v3, "firebase_analytics_collection_deactivated"

    invoke-virtual {v12, v3}, Lk6/f;->w(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_3d

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3d

    goto :goto_1b

    :cond_3d
    xor-int/lit8 v3, v1, 0x1

    invoke-virtual {v2, v3}, Lk6/l4;->r(Z)V

    :cond_3e
    :goto_1b
    if-eqz v1, :cond_3f

    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    invoke-virtual {v15}, Lk6/y5;->M()V

    :cond_3f
    iget-object v1, v0, Lk6/f5;->k:Lk6/d7;

    invoke-static {v1}, Lk6/f5;->b(Lk6/p2;)V

    iget-object v1, v1, Lk6/d7;->e:Lk6/w4;

    invoke-virtual {v1}, Lk6/w4;->W()V

    invoke-virtual {v0}, Lk6/f5;->m()Lk6/s6;

    move-result-object v1

    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v1, v3}, Lk6/s6;->w(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {v0}, Lk6/f5;->m()Lk6/s6;

    move-result-object v0

    iget-object v1, v2, Lk6/l4;->x:Li3/a0;

    invoke-virtual {v1}, Li3/a0;->h()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0}, Lk6/q3;->l()V

    invoke-virtual {v0}, Lk6/p2;->s()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lk6/s6;->H(Z)Lk6/x7;

    move-result-object v5

    new-instance v3, Ly2/a;

    const/16 v6, 0xf

    invoke-direct {v3, v0, v5, v1, v6}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v3}, Lk6/s6;->v(Ljava/lang/Runnable;)V

    :cond_40
    :goto_1c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpg;->zza()Z

    move-result v0

    if-eqz v0, :cond_41

    sget-object v0, Lk6/x;->D0:Lk6/x3;

    invoke-virtual {v12, v4, v0}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v0

    if-eqz v0, :cond_41

    invoke-static/range {v17 .. v17}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual/range {v17 .. v17}, Lf4/y;->l()V

    invoke-virtual/range {v17 .. v17}, Lk6/u7;->p0()J

    move-result-wide v0

    const-wide/16 v3, 0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_41

    new-instance v0, Ljava/lang/Thread;

    invoke-static {v15}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v1, Lk6/e5;

    const/4 v3, 0x0

    invoke-direct {v1, v15, v3}, Lk6/e5;-><init>(Lk6/y5;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_41
    iget-object v0, v2, Lk6/l4;->n:Lk6/n4;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lk6/n4;->a(Z)V

    return-void

    :cond_42
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_44
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_12
    move-object v3, v1

    move v1, v7

    iget-object v0, v3, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/p5;

    invoke-interface {v0}, Lk6/p5;->zzd()Lk6/h;

    invoke-static {}, Lk6/h;->b()Z

    move-result v0

    if-eqz v0, :cond_45

    iget-object v0, v3, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Lk6/p5;

    invoke-interface {v0}, Lk6/p5;->zzl()Lk6/z4;

    move-result-object v0

    invoke-virtual {v0, v3}, Lk6/z4;->u(Ljava/lang/Runnable;)V

    goto :goto_1e

    :cond_45
    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/n;

    iget-wide v4, v0, Lk6/n;->c:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_46

    goto :goto_1d

    :cond_46
    const/4 v1, 0x0

    :goto_1d
    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/n;

    iput-wide v6, v0, Lk6/n;->c:J

    if-eqz v1, :cond_47

    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Lk6/n;

    invoke-virtual {v0}, Lk6/n;->c()V

    :cond_47
    :goto_1e
    return-void

    :pswitch_13
    move-object v3, v1

    iget-object v0, v3, Ll/h;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly5/k;

    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Ly5/m;

    iget v0, v0, Ly5/m;->a:I

    const-string v2, "Timing out request: "

    monitor-enter v1

    :try_start_5
    iget-object v5, v1, Ly5/k;->e:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly5/m;

    if-eqz v5, :cond_48

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v6, "MessengerIpcClient"

    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, v1, Ly5/k;->e:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->remove(I)V

    const-string v0, "Timed out waiting for response"

    new-instance v2, Ly5/n;

    invoke-direct {v2, v0, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v5, v2}, Ly5/m;->a(Ly5/n;)V

    invoke-virtual {v1}, Ly5/k;->c()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_48
    monitor-exit v1

    goto :goto_1f

    :catchall_1
    move-exception v0

    goto :goto_20

    :goto_1f
    return-void

    :goto_20
    monitor-exit v1

    throw v0

    :pswitch_14
    move-object v3, v1

    iget-object v0, v3, Ll/h;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly5/k;

    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/IBinder;

    monitor-enter v1

    if-nez v0, :cond_49

    :try_start_6
    const-string v0, "Null service connection"

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ly5/k;->a(ILjava/lang/String;)V

    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_21

    :catchall_2
    move-exception v0

    goto :goto_22

    :cond_49
    :try_start_7
    new-instance v4, Ll/t;

    invoke-direct {v4, v0}, Ll/t;-><init>(Landroid/os/IBinder;)V

    iput-object v4, v1, Ly5/k;->c:Ll/t;
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    iput v2, v1, Ly5/k;->a:I

    iget-object v0, v1, Ly5/k;->f:Ly5/o;

    iget-object v0, v0, Ly5/o;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Ly5/i;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4}, Ly5/i;-><init>(Ly5/k;I)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    monitor-exit v1

    goto :goto_21

    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ly5/k;->a(ILjava/lang/String;)V

    monitor-exit v1

    :goto_21
    return-void

    :goto_22
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    :pswitch_15
    move-object v3, v1

    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Ll/k;

    iget-object v0, v0, Ll/k;->c:Lk/l;

    if-eqz v0, :cond_4a

    iget-object v1, v0, Lk/l;->e:Lk/j;

    if-eqz v1, :cond_4a

    invoke-interface {v1, v0}, Lk/j;->m(Lk/l;)V

    :cond_4a
    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Ll/k;

    iget-object v0, v0, Ll/k;->n:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_4d

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_4d

    iget-object v0, v3, Ll/h;->b:Ljava/lang/Object;

    check-cast v0, Ll/f;

    invoke-virtual {v0}, Lk/q;->b()Z

    move-result v1

    if-eqz v1, :cond_4b

    goto :goto_23

    :cond_4b
    iget-object v1, v0, Lk/q;->f:Landroid/view/View;

    if-nez v1, :cond_4c

    goto :goto_24

    :cond_4c
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Lk/q;->d(IIZZ)V

    :goto_23
    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Ll/k;

    iget-object v1, v3, Ll/h;->b:Ljava/lang/Object;

    check-cast v1, Ll/f;

    iput-object v1, v0, Ll/k;->y:Ll/f;

    :cond_4d
    :goto_24
    iget-object v0, v3, Ll/h;->c:Ljava/lang/Object;

    check-cast v0, Ll/k;

    iput-object v4, v0, Ll/k;->A:Ll/h;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Ll/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Ll/h;->c:Ljava/lang/Object;

    check-cast v1, Ll/t;

    new-instance v2, Ll/z2;

    invoke-direct {v2}, Ll/z2;-><init>()V

    iget-object v3, v0, Lq6/g;->c:Ll/z2;

    iput-object v2, v3, Ll/z2;->d:Ljava/lang/Object;

    iput-object v2, v0, Lq6/g;->c:Ll/z2;

    iput-object v1, v2, Ll/z2;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method
