.class public final Lu/s;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lu/s;->a:I

    iput-object p2, p0, Lu/s;->c:Ljava/lang/Object;

    iput-object p3, p0, Lu/s;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/o0;)Lm0/n0;
    .locals 5

    iget v0, p0, Lu/s;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, Lu/s;->b:Ljava/lang/Object;

    iget-object v3, p0, Lu/s;->c:Ljava/lang/Object;

    sparse-switch v0, :sswitch_data_0

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/content/Context;

    const-class p1, Landroid/net/ConnectivityManager;

    invoke-virtual {v3, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v2, Lm0/g1;

    const/4 v3, 0x0

    const/16 v4, 0xc

    if-eqz v0, :cond_1

    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v2, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    new-instance v0, Lr4/h;

    const/4 v1, 0x2

    invoke-direct {v0, v2, v1}, Lr4/h;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v1, v4}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    new-instance v1, Lt/r0;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p1, v0}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :sswitch_0
    check-cast v3, Lo2/r;

    check-cast v2, Lo2/t;

    invoke-virtual {v3, v2}, Lo2/r;->setPositionProvider(Lo2/t;)V

    invoke-virtual {v3}, Lo2/r;->l()V

    new-instance p1, Lo2/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :sswitch_1
    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast v2, Lu1/x0;

    invoke-virtual {p1, v2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    new-instance p1, Lt/r0;

    const/4 v0, 0x7

    invoke-direct {p1, v0, v3, v2}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :sswitch_2
    check-cast v3, Lm0/g1;

    check-cast v2, Lx/m;

    new-instance p1, Lt/r0;

    const/4 v0, 0x6

    invoke-direct {p1, v0, v3, v2}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :sswitch_3
    check-cast v3, La0/o0;

    iget-object p1, v3, La0/o0;->c:Ljava/util/LinkedHashSet;

    invoke-interface {p1, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    new-instance p1, Lt/r0;

    const/4 v0, 0x5

    invoke-direct {p1, v0, v3, v2}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :sswitch_4
    check-cast v3, Ly/j1;

    check-cast v2, Landroid/view/View;

    iget p1, v3, Ly/j1;->s:I

    if-nez p1, :cond_3

    sget-object p1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    iget-object p1, v3, Ly/j1;->t:Ly/g0;

    invoke-static {v2, p1}, Lb3/h0;->u(Landroid/view/View;Lb3/t;)V

    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->requestApplyInsets()V

    :cond_2
    invoke-virtual {v2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-static {v2, p1}, Lb3/q0;->f(Landroid/view/View;Ly/g0;)V

    :cond_3
    iget p1, v3, Ly/j1;->s:I

    add-int/2addr p1, v1

    iput p1, v3, Ly/j1;->s:I

    new-instance p1, Lt/r0;

    const/4 v0, 0x4

    invoke-direct {p1, v0, v3, v2}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_4
        0x7 -> :sswitch_3
        0xb -> :sswitch_2
        0x14 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Lg1/e;)V
    .locals 8

    iget v0, p0, Lu/s;->a:I

    iget-object v1, p0, Lu/s;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    move-object v2, p1

    check-cast v2, Lt1/i0;

    invoke-virtual {v2}, Lt1/i0;->a()V

    move-object v3, v1

    check-cast v3, Le1/d0;

    iget-object p1, p0, Lu/s;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Le1/n;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3c

    invoke-static/range {v2 .. v7}, Lg1/g;->D(Lg1/g;Le1/d0;Le1/n;FLg1/k;I)V

    return-void

    :pswitch_0
    check-cast p1, Lt1/i0;

    invoke-virtual {p1}, Lt1/i0;->a()V

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 6

    iget v0, p0, Lu/s;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lu/s;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    instance-of v3, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_0

    check-cast v0, Landroidx/concurrent/futures/k;

    iput-boolean v2, v0, Landroidx/concurrent/futures/k;->d:Z

    iget-object p1, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroidx/concurrent/futures/m;->b:Landroidx/concurrent/futures/l;

    invoke-virtual {p1, v2}, Landroidx/concurrent/futures/j;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v1, v0, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    iput-object v1, v0, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/o;

    goto :goto_0

    :cond_0
    check-cast v0, Landroidx/concurrent/futures/k;

    iput-boolean v2, v0, Landroidx/concurrent/futures/k;->d:Z

    iget-object v2, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    if-eqz v2, :cond_2

    iget-object v2, v2, Landroidx/concurrent/futures/m;->b:Landroidx/concurrent/futures/l;

    invoke-virtual {v2, p1}, Landroidx/concurrent/futures/j;->setException(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v1, v0, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    iput-object v1, v0, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/o;

    goto :goto_0

    :cond_1
    check-cast v0, Landroidx/concurrent/futures/k;

    iget-object p1, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast p1, Lm9/h0;

    invoke-interface {p1}, Lm9/h0;->g()Ljava/lang/Object;

    move-result-object p1

    iput-boolean v2, v0, Landroidx/concurrent/futures/k;->d:Z

    iget-object v2, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    if-eqz v2, :cond_2

    iget-object v2, v2, Landroidx/concurrent/futures/m;->b:Landroidx/concurrent/futures/l;

    invoke-virtual {v2, p1}, Landroidx/concurrent/futures/j;->set(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v1, v0, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    iput-object v1, v0, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/o;

    :cond_2
    :goto_0
    return-void

    :sswitch_0
    iget-object p1, p0, Lu/s;->c:Ljava/lang/Object;

    check-cast p1, Lu1/g1;

    iget-object p1, p1, Lu1/g1;->a:Landroid/view/Choreographer;

    iget-object v0, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void

    :sswitch_1
    iget-object p1, p0, Lu/s;->c:Ljava/lang/Object;

    check-cast p1, Lu1/e1;

    iget-object v0, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/Choreographer$FrameCallback;

    iget-object v1, p1, Lu1/e1;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object p1, p1, Lu1/e1;->n:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :sswitch_2
    iget-object v0, p0, Lu/s;->c:Ljava/lang/Object;

    check-cast v0, Lm0/g2;

    iget-object v3, v0, Lm0/g2;->b:Ljava/lang/Object;

    iget-object v4, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Throwable;

    monitor-enter v3

    if-eqz v4, :cond_5

    if-eqz p1, :cond_4

    :try_start_1
    instance-of v5, p1, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v2, v5

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_4

    invoke-static {v4, p1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    move-object v1, v4

    :cond_5
    iput-object v1, v0, Lm0/g2;->d:Ljava/lang/Throwable;

    iget-object p1, v0, Lm0/g2;->r:Lp9/q0;

    sget-object v0, Lm0/a2;->a:Lm0/a2;

    invoke-virtual {p1, v0}, Lp9/q0;->i(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v3

    return-void

    :goto_3
    monitor-exit v3

    throw p1

    :sswitch_3
    iget-object p1, p0, Lu/s;->c:Ljava/lang/Object;

    check-cast p1, Lm0/x0;

    iget-object v0, p1, Lm0/x0;->a:Ljava/lang/Object;

    iget-object v1, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast v1, Lm9/k;

    monitor-enter v0

    :try_start_2
    iget-object p1, p1, Lm0/x0;->b:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v0

    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1

    :sswitch_4
    iget-object p1, p0, Lu/s;->c:Ljava/lang/Object;

    check-cast p1, Lm0/g;

    iget-object v0, p1, Lm0/g;->b:Ljava/lang/Object;

    iget-object v2, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast v2, Ld9/u;

    monitor-enter v0

    :try_start_3
    iget-object p1, p1, Lm0/g;->d:Ljava/util/List;

    iget-object v2, v2, Ld9/u;->a:Ljava/lang/Object;

    if-eqz v2, :cond_6

    check-cast v2, Lm0/f;

    invoke-interface {p1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    monitor-exit v0

    return-void

    :catchall_3
    move-exception p1

    goto :goto_4

    :cond_6
    :try_start_4
    const-string p1, "awaiter"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_4
    monitor-exit v0

    throw p1

    :sswitch_5
    iget-object p1, p0, Lu/s;->c:Ljava/lang/Object;

    check-cast p1, Lv/l;

    iget-object p1, p1, Lv/l;->a:Lo0/i;

    iget-object v0, p0, Lu/s;->b:Ljava/lang/Object;

    check-cast v0, Lv/p;

    invoke-virtual {p1, v0}, Lo0/i;->m(Ljava/lang/Object;)Z

    return-void

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_5
        0xf -> :sswitch_4
        0x10 -> :sswitch_3
        0x11 -> :sswitch_2
        0x15 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public final f(Lr1/w0;)V
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lu/s;->a:I

    iget-object v2, v0, Lu/s;->b:Ljava/lang/Object;

    iget-object v3, v0, Lu/s;->c:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v5, v3

    check-cast v5, Lr1/x0;

    const/4 v6, 0x0

    const/4 v7, 0x0

    check-cast v2, Le1/m0;

    iget-object v8, v2, Le1/m0;->K:Lq/w;

    const/4 v9, 0x4

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v9}, Lr1/w0;->k(Lr1/w0;Lr1/x0;IILq/w;I)V

    return-void

    :pswitch_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_8

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb0/g;

    iget v7, v6, Lb0/g;->n:I

    const/high16 v8, -0x80000000

    if-eq v7, v8, :cond_7

    iget-object v7, v6, Lb0/g;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_6

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lr1/x0;

    mul-int/lit8 v10, v9, 0x2

    iget-object v11, v6, Lb0/g;->l:[I

    aget v13, v11, v10

    add-int/lit8 v10, v10, 0x1

    aget v10, v11, v10

    invoke-static {v13, v10}, Li1/b;->c(II)J

    move-result-wide v10

    iget-boolean v13, v6, Lb0/g;->i:Z

    iget-boolean v14, v6, Lb0/g;->j:Z

    const-wide v15, 0xffffffffL

    const/16 v17, 0x20

    if-eqz v13, :cond_4

    if-eqz v14, :cond_0

    sget v13, Lm2/i;->c:I

    move/from16 v18, v5

    shr-long v4, v10, v17

    long-to-int v4, v4

    goto :goto_3

    :cond_0
    move/from16 v18, v5

    sget v4, Lm2/i;->c:I

    shr-long v4, v10, v17

    long-to-int v4, v4

    iget v5, v6, Lb0/g;->n:I

    sub-int/2addr v5, v4

    if-eqz v14, :cond_1

    iget v4, v12, Lr1/x0;->b:I

    goto :goto_2

    :cond_1
    iget v4, v12, Lr1/x0;->a:I

    :goto_2
    sub-int v4, v5, v4

    :goto_3
    if-eqz v14, :cond_3

    and-long/2addr v10, v15

    long-to-int v5, v10

    iget v10, v6, Lb0/g;->n:I

    sub-int/2addr v10, v5

    if-eqz v14, :cond_2

    iget v5, v12, Lr1/x0;->b:I

    goto :goto_4

    :cond_2
    iget v5, v12, Lr1/x0;->a:I

    :goto_4
    sub-int/2addr v10, v5

    goto :goto_5

    :cond_3
    and-long/2addr v10, v15

    long-to-int v10, v10

    :goto_5
    invoke-static {v4, v10}, Li1/b;->c(II)J

    move-result-wide v10

    goto :goto_6

    :cond_4
    move/from16 v18, v5

    :goto_6
    sget v4, Lm2/i;->c:I

    shr-long v4, v10, v17

    long-to-int v4, v4

    move v5, v1

    iget-wide v0, v6, Lb0/g;->d:J

    move/from16 v20, v5

    move-object/from16 v19, v6

    shr-long v5, v0, v17

    long-to-int v5, v5

    add-int/2addr v4, v5

    and-long v5, v10, v15

    long-to-int v5, v5

    and-long/2addr v0, v15

    long-to-int v0, v0

    add-int/2addr v5, v0

    invoke-static {v4, v5}, Li1/b;->c(II)J

    move-result-wide v0

    if-eqz v14, :cond_5

    const/4 v15, 0x0

    const/16 v16, 0x6

    move-object/from16 v11, p1

    move-wide v13, v0

    invoke-static/range {v11 .. v16}, Lr1/w0;->m(Lr1/w0;Lr1/x0;JLa0/g;I)V

    goto :goto_7

    :cond_5
    const/4 v15, 0x0

    const/16 v16, 0x6

    move-object/from16 v11, p1

    move-wide v13, v0

    invoke-static/range {v11 .. v16}, Lr1/w0;->i(Lr1/w0;Lr1/x0;JLa0/g;I)V

    :goto_7
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move/from16 v5, v18

    move-object/from16 v6, v19

    move/from16 v1, v20

    goto/16 :goto_1

    :cond_6
    move/from16 v20, v1

    move/from16 v18, v5

    add-int/lit8 v5, v18, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "position() should be called first"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    check-cast v2, Lm0/g1;

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 7

    iget v0, p0, Lu/s;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, Lu/s;->b:Ljava/lang/Object;

    const/4 v3, 0x4

    iget-object v4, p0, Lu/s;->c:Ljava/lang/Object;

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move v1, v5

    goto/16 :goto_1

    :cond_1
    const/16 v6, 0x201

    invoke-virtual {v0, v6}, Landroid/view/InputDevice;->supportsSource(I)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/view/InputDevice;->isVirtual()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result v0

    const/4 v6, 0x2

    invoke-static {v0, v6}, Lz6/a;->B(II)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/16 v0, 0x13

    invoke-static {v0, p1}, Lm9/e0;->m(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_5

    check-cast v4, Lc1/e;

    const/4 p1, 0x5

    check-cast v4, Lc1/f;

    invoke-virtual {v4, p1}, Lc1/f;->b(I)Z

    move-result v1

    goto :goto_1

    :cond_5
    const/16 v0, 0x14

    invoke-static {v0, p1}, Lm9/e0;->m(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_6

    check-cast v4, Lc1/e;

    const/4 p1, 0x6

    check-cast v4, Lc1/f;

    invoke-virtual {v4, p1}, Lc1/f;->b(I)Z

    move-result v1

    goto :goto_1

    :cond_6
    const/16 v0, 0x15

    invoke-static {v0, p1}, Lm9/e0;->m(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_7

    check-cast v4, Lc1/e;

    const/4 p1, 0x3

    check-cast v4, Lc1/f;

    invoke-virtual {v4, p1}, Lc1/f;->b(I)Z

    move-result v1

    goto :goto_1

    :cond_7
    const/16 v0, 0x16

    invoke-static {v0, p1}, Lm9/e0;->m(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_8

    check-cast v4, Lc1/e;

    check-cast v4, Lc1/f;

    invoke-virtual {v4, v3}, Lc1/f;->b(I)Z

    move-result v1

    goto :goto_1

    :cond_8
    const/16 v0, 0x17

    invoke-static {v0, p1}, Lm9/e0;->m(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    check-cast v2, Lf0/c2;

    iget-object p1, v2, Lf0/c2;->c:Lu1/t2;

    if-eqz p1, :cond_9

    check-cast p1, Lu1/u1;

    iget-object p1, p1, Lu1/u1;->a:Lg2/b0;

    iget-object v0, p1, Lg2/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/h0;

    if-eqz v0, :cond_9

    iget-object p1, p1, Lg2/b0;->a:Lg2/v;

    check-cast p1, Lg2/e0;

    sget-object v0, Lg2/c0;->c:Lg2/c0;

    invoke-virtual {p1, v0}, Lg2/e0;->a(Lg2/c0;)V

    :cond_9
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v4, Lf0/c2;

    invoke-virtual {v4}, Lf0/c2;->a()Lf0/o0;

    move-result-object v0

    sget-object v4, Lf0/o0;->b:Lf0/o0;

    if-ne v0, v4, :cond_a

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    if-ne v0, v3, :cond_a

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result p1

    invoke-static {p1, v1}, Lz6/a;->B(II)Z

    move-result p1

    if-eqz p1, :cond_a

    check-cast v2, Lh0/v0;

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lh0/v0;->g(Ld1/c;)V

    goto :goto_2

    :cond_a
    move v1, v5

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lu/s;->a:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lu/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_2
    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lu/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v0, Lg2/i;

    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v2, Lg2/i;

    if-ne v2, v0, :cond_0

    const-string v2, " > "

    goto :goto_0

    :cond_0
    const-string v2, "   "

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v2, Lg2/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v0, Lg2/a;

    const-string v4, ", newCursorPosition="

    const/16 v5, 0x29

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "CommitTextCommand(text.length="

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Lg2/a;

    iget-object v6, v0, Lg2/a;->a:La2/e;

    iget-object v6, v6, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lg2/a;->b:I

    invoke-static {v2, v0, v5}, La7/a;->o(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_1
    instance-of v2, v0, Lg2/y;

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "SetComposingTextCommand(text.length="

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Lg2/y;

    iget-object v6, v0, Lg2/y;->a:La2/e;

    iget-object v6, v6, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lg2/y;->b:I

    invoke-static {v2, v0, v5}, La7/a;->o(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    instance-of v2, v0, Lg2/x;

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    instance-of v2, v0, Lg2/g;

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    instance-of v2, v0, Lg2/h;

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    instance-of v2, v0, Lg2/z;

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_6
    instance-of v2, v0, Lg2/l;

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_7
    instance-of v2, v0, Lg2/f;

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ld9/v;->a(Ljava/lang/Class;)Ld9/e;

    move-result-object v0

    invoke-virtual {v0}, Ld9/e;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v0, "{anonymous EditCommand}"

    :cond_9
    const-string v2, "Unknown EditCommand: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v0, Lf2/w;

    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v2, Lf2/u;

    iget-object v3, v2, Lf2/u;->a:La4/q;

    iget-object v4, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v4, Lf2/t;

    monitor-enter v3

    :try_start_0
    check-cast v0, Lf2/v;

    iget-boolean v5, v0, Lf2/v;->b:Z

    if-eqz v5, :cond_a

    iget-object v2, v2, Lf2/u;->b:Le2/b;

    invoke-virtual {v2, v4, v0}, Le2/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_a
    iget-object v0, v2, Lf2/u;->b:Le2/b;

    invoke-virtual {v0, v4}, Le2/b;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v3

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :goto_3
    monitor-exit v3

    throw v0

    :pswitch_5
    check-cast v0, Lc9/c;

    iget-object v0, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v0, Lf2/f;

    iget-object v0, v0, Lf2/f;->d:Lf2/i;

    iget-object v2, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v2, Lf2/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Lf2/t;->a:Lf2/e;

    iget-object v0, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v0, Lf2/f;

    iget-object v0, v0, Lf2/f;->e:Lf2/n;

    iget-object v2, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v2, Lf2/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v2, Lf2/t;->a:Lf2/e;

    iget-object v0, v0, Lf2/n;->a:Lx9/v;

    iget v6, v2, Lf2/t;->c:I

    iget-object v2, v2, Lf2/t;->b:Lf2/l;

    const/4 v7, 0x0

    if-nez v5, :cond_b

    goto :goto_4

    :cond_b
    instance-of v8, v5, Lf2/b;

    if-eqz v8, :cond_c

    :goto_4
    iget v0, v0, Lx9/v;->a:I

    packed-switch v0, :pswitch_data_1

    invoke-static {v7, v2, v6}, Lx9/v;->n(Ljava/lang/String;Lf2/l;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_6
    invoke-static {v7, v2, v6}, Lx9/v;->m(Ljava/lang/String;Lf2/l;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto/16 :goto_7

    :cond_c
    instance-of v8, v5, Lf2/m;

    if-eqz v8, :cond_16

    check-cast v5, Lf2/m;

    iget v0, v0, Lx9/v;->a:I

    packed-switch v0, :pswitch_data_2

    iget-object v0, v5, Lf2/m;->d:Ljava/lang/String;

    iget v8, v2, Lf2/l;->a:I

    div-int/lit8 v8, v8, 0x64

    if-ltz v8, :cond_d

    if-ge v8, v4, :cond_d

    const-string v4, "-thin"

    invoke-static {v0, v4}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_d
    const/4 v9, 0x4

    if-gt v4, v8, :cond_e

    if-ge v8, v9, :cond_e

    const-string v4, "-light"

    invoke-static {v0, v4}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_e
    if-ne v8, v9, :cond_f

    goto :goto_5

    :cond_f
    const/4 v4, 0x5

    if-ne v8, v4, :cond_10

    const-string v4, "-medium"

    invoke-static {v0, v4}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_10
    const/4 v4, 0x6

    const/16 v9, 0x8

    if-gt v4, v8, :cond_11

    if-ge v8, v9, :cond_11

    goto :goto_5

    :cond_11
    if-gt v9, v8, :cond_12

    const/16 v4, 0xb

    if-ge v8, v4, :cond_12

    const-string v4, "-black"

    invoke-static {v0, v4}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_12
    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_13

    goto :goto_6

    :cond_13
    invoke-static {v0, v2, v6}, Lx9/v;->n(Ljava/lang/String;Lf2/l;I)Landroid/graphics/Typeface;

    move-result-object v0

    sget-object v4, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v6}, Lo1/s;->B(Lf2/l;I)I

    move-result v8

    invoke-static {v4, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v0, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    invoke-static {v7, v2, v6}, Lx9/v;->n(Ljava/lang/String;Lf2/l;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v0, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    move-object v7, v0

    :cond_14
    :goto_6
    if-nez v7, :cond_15

    iget-object v0, v5, Lf2/m;->d:Ljava/lang/String;

    invoke-static {v0, v2, v6}, Lx9/v;->n(Ljava/lang/String;Lf2/l;I)Landroid/graphics/Typeface;

    move-result-object v7

    :cond_15
    move-object v0, v7

    goto :goto_7

    :pswitch_7
    iget-object v0, v5, Lf2/m;->d:Ljava/lang/String;

    invoke-static {v0, v2, v6}, Lx9/v;->m(Ljava/lang/String;Lf2/l;I)Landroid/graphics/Typeface;

    move-result-object v0

    :goto_7
    new-instance v7, Lf2/v;

    invoke-direct {v7, v0, v3}, Lf2/v;-><init>(Ljava/lang/Object;Z)V

    :cond_16
    if-eqz v7, :cond_17

    return-object v7

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Could not load font"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_8
    check-cast v0, Lu1/q;

    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v2, Lu1/x3;

    iget-boolean v4, v2, Lu1/x3;->c:Z

    if-nez v4, :cond_19

    iget-object v0, v0, Lu1/q;->a:Landroidx/lifecycle/w;

    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    iget-object v4, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v4, Lc9/e;

    iput-object v4, v2, Lu1/x3;->e:Lc9/e;

    iget-object v5, v2, Lu1/x3;->d:Landroidx/lifecycle/r;

    if-nez v5, :cond_18

    iput-object v0, v2, Lu1/x3;->d:Landroidx/lifecycle/r;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    goto :goto_8

    :cond_18
    invoke-virtual {v0}, Landroidx/lifecycle/r;->b()Landroidx/lifecycle/q;

    move-result-object v0

    sget-object v5, Landroidx/lifecycle/q;->c:Landroidx/lifecycle/q;

    invoke-virtual {v0, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_19

    iget-object v0, v2, Lu1/x3;->b:Lm0/t;

    new-instance v5, Lu1/w3;

    invoke-direct {v5, v2, v4, v3}, Lu1/w3;-><init>(Lu1/x3;Lc9/e;I)V

    new-instance v2, Lu0/b;

    const v4, -0x773f589e

    invoke-direct {v2, v4, v5, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    invoke-interface {v0, v2}, Lm0/t;->e(Lc9/e;)V

    :cond_19
    :goto_8
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_9
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_a
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_b
    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lu/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v0, Lr1/w0;

    invoke-virtual {v1, v0}, Lu/s;->f(Lr1/w0;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_d
    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v2, Lm0/e0;

    check-cast v2, Lm0/x;

    invoke-virtual {v2, v0}, Lm0/x;->z(Ljava/lang/Object;)V

    iget-object v2, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v2, Lo0/d;

    if-eqz v2, :cond_1a

    invoke-virtual {v2, v0}, Lo0/d;->add(Ljava/lang/Object;)Z

    :cond_1a
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_e
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_f
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_10
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_11
    check-cast v0, Ly/i1;

    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v2, Lk0/j1;

    iget-object v3, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v3, Ly/i1;

    new-instance v4, Ly/b0;

    invoke-direct {v4, v3, v0}, Ly/b0;-><init>(Ly/i1;Ly/i1;)V

    iget-object v0, v2, Lk0/j1;->a:Lm0/n1;

    invoke-virtual {v0, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_12
    check-cast v0, Lg1/g;

    sget v2, Lk0/e2;->c:F

    invoke-interface {v0, v2}, Lm2/b;->v(F)F

    move-result v6

    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lm0/l3;

    invoke-interface {v11}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1/r;

    iget-wide v12, v2, Le1/r;->a:J

    sget v2, Ll0/n;->a:F

    int-to-float v3, v4

    div-float/2addr v2, v3

    invoke-interface {v0, v2}, Lm2/b;->v(F)F

    move-result v2

    div-float v14, v6, v3

    sub-float v15, v2, v14

    const-wide/16 v16, 0x0

    new-instance v18, Lg1/k;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1e

    move-object/from16 v5, v18

    invoke-direct/range {v5 .. v10}, Lg1/k;-><init>(FFIII)V

    const/16 v9, 0x6c

    move-object v2, v0

    move-wide v3, v12

    move v5, v15

    move-wide/from16 v6, v16

    move-object/from16 v8, v18

    invoke-static/range {v2 .. v9}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    iget-object v2, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v2, Lm0/l3;

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm2/e;

    iget v3, v3, Lm2/e;->a:F

    const/4 v4, 0x0

    int-to-float v4, v4

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-lez v3, :cond_1b

    invoke-interface {v11}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le1/r;

    iget-wide v3, v3, Le1/r;->a:J

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm2/e;

    iget v2, v2, Lm2/e;->a:F

    invoke-interface {v0, v2}, Lm2/b;->v(F)F

    move-result v2

    sub-float v5, v2, v14

    const-wide/16 v6, 0x0

    sget-object v8, Lg1/j;->a:Lg1/j;

    const/16 v9, 0x6c

    move-object v2, v0

    invoke-static/range {v2 .. v9}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    :cond_1b
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_13
    check-cast v0, Lo1/u;

    iget-object v2, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v2, Lh0/l;

    iget-wide v3, v0, Lo1/u;->c:J

    iget-object v5, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v5, Lh0/s;

    invoke-interface {v2, v3, v4, v5}, Lh0/l;->c(JLh0/s;)Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-virtual {v0}, Lo1/u;->a()V

    :cond_1c
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_14
    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lu/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v0, Lm1/b;

    iget-object v0, v0, Lm1/b;->a:Landroid/view/KeyEvent;

    invoke-virtual {v1, v0}, Lu/s;->h(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_16
    check-cast v0, Lm1/b;

    iget-object v0, v0, Lm1/b;->a:Landroid/view/KeyEvent;

    invoke-virtual {v1, v0}, Lu/s;->h(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_17
    check-cast v0, Lr1/w0;

    invoke-virtual {v1, v0}, Lu/s;->f(Lr1/w0;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_18
    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lu/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_19
    check-cast v0, Lm0/o0;

    invoke-virtual {v1, v0}, Lu/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    iget-object v0, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v0, Lv/m3;

    iget v2, v0, Lv/m3;->e:F

    const/4 v3, 0x0

    iput v3, v0, Lv/m3;->e:F

    iget-object v0, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v0, Lc9/c;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_1b
    check-cast v0, Ld1/c;

    iget-wide v2, v0, Ld1/c;->a:J

    iget-object v0, v1, Lu/s;->c:Ljava/lang/Object;

    check-cast v0, Lv/l2;

    iget-object v5, v1, Lu/s;->b:Ljava/lang/Object;

    check-cast v5, Lv/r1;

    iget-boolean v6, v0, Lv/l2;->d:Z

    const/high16 v7, -0x40800000    # -1.0f

    if-eqz v6, :cond_1d

    invoke-static {v7, v2, v3}, Ld1/c;->h(FJ)J

    move-result-wide v2

    :cond_1d
    invoke-virtual {v0, v5, v2, v3, v4}, Lv/l2;->a(Lv/r1;JI)J

    move-result-wide v2

    iget-boolean v0, v0, Lv/l2;->d:Z

    if-eqz v0, :cond_1e

    invoke-static {v7, v2, v3}, Ld1/c;->h(FJ)J

    move-result-wide v2

    :cond_1e
    new-instance v0, Ld1/c;

    invoke-direct {v0, v2, v3}, Ld1/c;-><init>(J)V

    return-object v0

    :pswitch_1c
    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Lu/s;->d(Ljava/lang/Throwable;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_1d
    check-cast v0, Lg1/e;

    invoke-virtual {v1, v0}, Lu/s;->b(Lg1/e;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_1e
    check-cast v0, Lg1/e;

    invoke-virtual {v1, v0}, Lu/s;->b(Lg1/e;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_7
    .end packed-switch
.end method
