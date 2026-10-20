.class public final Lh/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lh/a;->a:I

    iput-object p1, p0, Lh/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget v0, p0, Lh/a;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v1, v0, Lh8/n;->o:Ljava/util/concurrent/Executor;

    iget-object v0, v0, Lh8/n;->t:Lk6/v6;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh/a;->b:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lh8/n;

    const v3, 0x7fffffff

    iput v3, v2, Lh8/n;->D:I

    check-cast v1, Lh8/n;

    invoke-virtual {v1}, Lh8/n;->t()Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :pswitch_1
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    :try_start_2
    move-object v1, v0

    check-cast v1, Lh8/c;

    iget-object v1, v1, Lh8/c;->p:Lja/e0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh8/c;

    iget-object v1, v1, Lh8/c;->b:Lja/g;

    iget-wide v1, v1, Lja/g;->b:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh8/c;

    iget-object v1, v1, Lh8/c;->p:Lja/e0;

    move-object v2, v0

    check-cast v2, Lh8/c;

    iget-object v2, v2, Lh8/c;->b:Lja/g;

    move-object v3, v0

    check-cast v3, Lh8/c;

    iget-object v3, v3, Lh8/c;->b:Lja/g;

    iget-wide v3, v3, Lja/g;->b:J

    invoke-interface {v1, v2, v3, v4}, Lja/e0;->b0(Lja/g;J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v2, v0

    check-cast v2, Lh8/c;

    iget-object v2, v2, Lh8/c;->d:Lh8/d;

    check-cast v2, Lh8/n;

    invoke-virtual {v2, v1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    move-object v1, v0

    check-cast v1, Lh8/c;

    iget-object v2, v1, Lh8/c;->b:Lja/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_3
    move-object v2, v0

    check-cast v2, Lh8/c;

    iget-object v2, v2, Lh8/c;->p:Lja/e0;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lh8/c;

    iget-object v2, v2, Lh8/c;->p:Lja/e0;

    invoke-interface {v2}, Lja/e0;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    iget-object v3, v1, Lh8/c;->d:Lh8/d;

    check-cast v3, Lh8/n;

    invoke-virtual {v3, v2}, Lh8/n;->p(Ljava/lang/Exception;)V

    :cond_1
    :goto_1
    :try_start_4
    move-object v2, v0

    check-cast v2, Lh8/c;

    iget-object v2, v2, Lh8/c;->q:Ljava/net/Socket;

    if-eqz v2, :cond_2

    check-cast v0, Lh8/c;

    iget-object v0, v0, Lh8/c;->q:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    iget-object v1, v1, Lh8/c;->d:Lh8/d;

    check-cast v1, Lh8/n;

    invoke-virtual {v1, v0}, Lh8/n;->p(Ljava/lang/Exception;)V

    :cond_2
    :goto_2
    return-void

    :pswitch_2
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lo6/a;

    iget-object v1, v0, Lo6/a;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_5
    invoke-virtual {v0}, Lo6/a;->b()Z

    move-result v2

    if-nez v2, :cond_3

    monitor-exit v1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_3
    const-string v2, "WakeLock"

    iget-object v3, v0, Lo6/a;->j:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " ** IS FORCE-RELEASED ON TIMEOUT **"

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Lo6/a;->d()V

    invoke-virtual {v0}, Lo6/a;->b()Z

    move-result v2

    if-nez v2, :cond_4

    monitor-exit v1

    goto :goto_3

    :cond_4
    iput v6, v0, Lo6/a;->c:I

    invoke-virtual {v0}, Lo6/a;->e()V

    monitor-exit v1

    :goto_3
    return-void

    :goto_4
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :pswitch_3
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lk6/f5;

    iget-object v1, v0, Lk6/f5;->l:Lk6/u7;

    invoke-static {v1}, Lk6/f5;->c(Lk6/o5;)V

    invoke-virtual {v1}, Lf4/y;->l()V

    invoke-virtual {v1}, Lk6/u7;->p0()J

    move-result-wide v3

    const-wide/16 v5, 0x1

    cmp-long v1, v3, v5

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/Thread;

    iget-object v0, v0, Lk6/f5;->p:Lk6/y5;

    invoke-static {v0}, Lk6/f5;->b(Lk6/p2;)V

    new-instance v3, Lk6/e5;

    invoke-direct {v3, v0, v2}, Lk6/e5;-><init>(Lk6/y5;I)V

    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_5

    :cond_5
    iget-object v0, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    const-string v1, "registerTrigger called but app not eligible"

    iget-object v0, v0, Lk6/d4;->i:Lk6/f4;

    invoke-virtual {v0, v1}, Lk6/f4;->b(Ljava/lang/String;)V

    :goto_5
    return-void

    :pswitch_4
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lk6/g7;

    iget-object v2, v0, Lk6/g7;->c:Ll/t;

    iget-wide v11, v0, Lk6/g7;->a:J

    iget-object v3, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lk6/d7;

    invoke-virtual {v3}, Lk6/q3;->l()V

    iget-object v3, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lk6/d7;

    invoke-virtual {v3}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v3

    const-string v4, "Application going to the background"

    iget-object v3, v3, Lk6/d4;->m:Lk6/f4;

    invoke-virtual {v3, v4}, Lk6/f4;->b(Ljava/lang/String;)V

    iget-object v3, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lk6/d7;

    invoke-virtual {v3}, Lf4/y;->j()Lk6/l4;

    move-result-object v3

    iget-object v3, v3, Lk6/l4;->r:Lk6/n4;

    invoke-virtual {v3, v6}, Lk6/n4;->a(Z)V

    iget-object v3, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lk6/d7;

    invoke-virtual {v3}, Lk6/q3;->l()V

    iput-boolean v6, v3, Lk6/d7;->d:Z

    iget-object v3, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lk6/d7;

    invoke-virtual {v3}, Lf4/y;->h()Lk6/f;

    move-result-object v3

    invoke-virtual {v3}, Lk6/f;->z()Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Lk6/d7;

    iget-object v3, v3, Lk6/d7;->f:Lk6/h7;

    iget-wide v6, v0, Lk6/g7;->b:J

    iget-object v0, v3, Lk6/h7;->c:Lk6/f6;

    invoke-virtual {v0}, Lk6/n;->a()V

    iget-object v0, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Lk6/d7;

    iget-object v0, v0, Lk6/d7;->f:Lk6/h7;

    invoke-virtual {v0, v5, v5, v6, v7}, Lk6/h7;->a(ZZJ)Z

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpm;->zza()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Lk6/d7;

    invoke-virtual {v0}, Lf4/y;->h()Lk6/f;

    move-result-object v0

    sget-object v3, Lk6/x;->B0:Lk6/x3;

    invoke-virtual {v0, v1, v3}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Lk6/d7;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    const-string v1, "Application backgrounded at: timestamp_millis"

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v0, v0, Lk6/d4;->l:Lk6/f4;

    invoke-virtual {v0, v1, v2}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_7
    iget-object v0, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Lk6/d7;

    invoke-virtual {v0}, Lk6/q3;->o()Lk6/y5;

    move-result-object v7

    const-string v8, "auto"

    const-string v9, "_ab"

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    invoke-virtual/range {v7 .. v12}, Lk6/y5;->C(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    :goto_6
    return-void

    :pswitch_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "TIMEOUT"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Rpc"

    const-string v1, "No response"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    return-void

    :pswitch_6
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Le3/e;

    iget-boolean v1, v0, Le3/e;->v:Z

    if-nez v1, :cond_9

    goto/16 :goto_8

    :cond_9
    iget-boolean v1, v0, Le3/e;->t:Z

    if-eqz v1, :cond_a

    iput-boolean v5, v0, Le3/e;->t:Z

    iget-object v1, v0, Le3/e;->a:Le3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    iput-wide v6, v1, Le3/a;->e:J

    const-wide/16 v8, -0x1

    iput-wide v8, v1, Le3/a;->g:J

    iput-wide v6, v1, Le3/a;->f:J

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v1, Le3/a;->h:F

    :cond_a
    iget-object v1, v0, Le3/e;->a:Le3/a;

    iget-wide v6, v1, Le3/a;->g:J

    cmp-long v2, v6, v3

    if-lez v2, :cond_b

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    iget-wide v8, v1, Le3/a;->g:J

    iget v2, v1, Le3/a;->i:I

    int-to-long v10, v2

    add-long/2addr v8, v10

    cmp-long v2, v6, v8

    if-lez v2, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Le3/e;->f()Z

    move-result v2

    if-nez v2, :cond_c

    :goto_7
    iput-boolean v5, v0, Le3/e;->v:Z

    goto :goto_8

    :cond_c
    iget-boolean v2, v0, Le3/e;->u:Z

    if-eqz v2, :cond_d

    iput-boolean v5, v0, Le3/e;->u:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide v6, v8

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    iget-object v5, v0, Le3/e;->c:Landroid/view/View;

    invoke-virtual {v5, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    :cond_d
    iget-wide v5, v1, Le3/a;->f:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_e

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Le3/a;->a(J)F

    move-result v4

    const/high16 v5, -0x3f800000    # -4.0f

    mul-float/2addr v5, v4

    mul-float/2addr v5, v4

    const/high16 v6, 0x40800000    # 4.0f

    mul-float/2addr v4, v6

    add-float/2addr v4, v5

    iget-wide v5, v1, Le3/a;->f:J

    sub-long v5, v2, v5

    iput-wide v2, v1, Le3/a;->f:J

    long-to-float v2, v5

    mul-float/2addr v2, v4

    iget v1, v1, Le3/a;->d:F

    mul-float/2addr v2, v1

    float-to-int v1, v2

    iget-object v2, v0, Le3/e;->x:Landroid/widget/ListView;

    invoke-static {v2, v1}, Le3/f;->b(Landroid/widget/ListView;I)V

    iget-object v0, v0, Le3/e;->c:Landroid/view/View;

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0, p0}, Lb3/b0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    :goto_8
    return-void

    :cond_e
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lu1/w;

    invoke-virtual {v7, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v8, v7, Lu1/w;->r0:Landroid/view/MotionEvent;

    if-eqz v8, :cond_12

    invoke-virtual {v8, v5}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    if-ne v0, v2, :cond_f

    move v5, v6

    :cond_f
    invoke-virtual {v8}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v5, :cond_10

    const/16 v1, 0xa

    if-eq v0, v1, :cond_12

    if-eq v0, v6, :cond_12

    goto :goto_9

    :cond_10
    if-eq v0, v6, :cond_12

    :goto_9
    const/4 v1, 0x7

    if-eq v0, v1, :cond_11

    const/16 v2, 0x9

    if-eq v0, v2, :cond_11

    const/4 v0, 0x2

    move v9, v0

    goto :goto_a

    :cond_11
    move v9, v1

    :goto_a
    iget-wide v10, v7, Lu1/w;->s0:J

    const/4 v12, 0x0

    invoke-virtual/range {v7 .. v12}, Lu1/w;->C(Landroid/view/MotionEvent;IJZ)V

    :cond_12
    return-void

    :pswitch_8
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_13

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->z:Ll/k;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ll/k;->k()Z

    :cond_13
    return-void

    :pswitch_9
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Ll/b1;

    iput-object v1, v0, Ll/b1;->s:Lh/a;

    invoke-virtual {v0}, Ll/b1;->drawableStateChanged()V

    return-void

    :pswitch_a
    iget-object v0, p0, Lh/a;->b:Ljava/lang/Object;

    check-cast v0, Lh/c;

    invoke-virtual {v0, v6}, Lh/c;->a(Z)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
