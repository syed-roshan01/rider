.class public final La0/f0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/i2;
.implements La0/c0;
.implements Ljava/lang/Runnable;
.implements Landroid/view/Choreographer$FrameCallback;


# static fields
.field public static r:J


# instance fields
.field public final a:La0/d0;

.field public final b:Lr1/h1;

.field public final c:La0/q;

.field public final d:Landroid/view/View;

.field public final e:Lo0/i;

.field public f:J

.field public n:J

.field public o:Z

.field public final p:Landroid/view/Choreographer;

.field public q:Z


# direct methods
.method public constructor <init>(La0/d0;Lr1/h1;La0/q;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/f0;->a:La0/d0;

    iput-object p2, p0, La0/f0;->b:Lr1/h1;

    iput-object p3, p0, La0/f0;->c:La0/q;

    iput-object p4, p0, La0/f0;->d:Landroid/view/View;

    new-instance p1, Lo0/i;

    const/16 p2, 0x10

    new-array p2, p2, [La0/e0;

    invoke-direct {p1, p2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, La0/f0;->e:Lo0/i;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, La0/f0;->p:Landroid/view/Choreographer;

    sget-wide p1, La0/f0;->r:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_1

    invoke-virtual {p4}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p4}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    const/high16 p2, 0x41f00000    # 30.0f

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p1, 0x42700000    # 60.0f

    :goto_0
    const p2, 0x3b9aca00

    int-to-float p2, p2

    div-float/2addr p2, p1

    float-to-long p1, p2

    sput-wide p1, La0/f0;->r:J

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, La0/f0;->a:La0/d0;

    iput-object p0, v0, La0/d0;->a:La0/c0;

    const/4 v0, 0x1

    iput-boolean v0, p0, La0/f0;->q:Z

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, La0/f0;->q:Z

    iget-object v0, p0, La0/f0;->a:La0/d0;

    const/4 v1, 0x0

    iput-object v1, v0, La0/d0;->a:La0/c0;

    iget-object v0, p0, La0/f0;->d:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, La0/f0;->p:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public final doFrame(J)V
    .locals 0

    iget-boolean p1, p0, La0/f0;->q:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, La0/f0;->d:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final run()V
    .locals 20

    move-object/from16 v1, p0

    iget-object v0, v1, La0/f0;->e:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->k()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_d

    iget-boolean v2, v1, La0/f0;->o:Z

    if-eqz v2, :cond_d

    iget-boolean v2, v1, La0/f0;->q:Z

    if-eqz v2, :cond_d

    iget-object v2, v1, La0/f0;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWindowVisibility()I

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_c

    :cond_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    sget-wide v6, La0/f0;->r:J

    add-long/2addr v4, v6

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    cmp-long v2, v6, v4

    if-lez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    move v7, v3

    :goto_1
    invoke-virtual {v0}, Lo0/i;->l()Z

    move-result v8

    if-eqz v8, :cond_b

    if-nez v7, :cond_b

    iget-object v8, v0, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v8, v8, v3

    check-cast v8, La0/e0;

    iget-object v9, v1, La0/f0;->c:La0/q;

    iget-object v10, v9, La0/q;->b:Lc9/a;

    invoke-interface {v10}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La0/s;

    iget-boolean v11, v8, La0/e0;->d:Z

    if-nez v11, :cond_a

    invoke-interface {v10}, La0/s;->c()I

    move-result v11

    iget v12, v8, La0/e0;->a:I

    if-ltz v12, :cond_a

    if-ge v12, v11, :cond_a

    iget-object v11, v8, La0/e0;->c:Lr1/f1;

    const/4 v13, 0x3

    const/4 v14, 0x4

    const-wide/16 v15, 0x0

    if-nez v11, :cond_5

    const-string v11, "compose:lazylist:prefetch:compose"

    invoke-static {v11}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v17

    move/from16 v19, v7

    iget-wide v6, v1, La0/f0;->f:J

    add-long v6, v17, v6

    cmp-long v6, v6, v4

    if-gez v6, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_4

    :goto_2
    invoke-interface {v10, v12}, La0/s;->a(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v10, v12}, La0/s;->d(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v9, v12, v2, v6}, La0/q;->a(ILjava/lang/Object;Ljava/lang/Object;)Lc9/e;

    move-result-object v6

    iget-object v7, v1, La0/f0;->b:Lr1/h1;

    invoke-virtual {v7}, Lr1/h1;->a()Lr1/f0;

    move-result-object v7

    invoke-virtual {v7, v2, v6}, Lr1/f0;->g(Ljava/lang/Object;Lc9/e;)Lr1/f1;

    move-result-object v2

    iput-object v2, v8, La0/e0;->c:Lr1/f1;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long v6, v6, v17

    iget-wide v8, v1, La0/f0;->f:J

    cmp-long v2, v8, v15

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    int-to-long v14, v14

    div-long/2addr v8, v14

    int-to-long v12, v13

    mul-long/2addr v8, v12

    div-long/2addr v6, v14

    add-long/2addr v6, v8

    :goto_3
    iput-wide v6, v1, La0/f0;->f:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v2, v3

    move/from16 v7, v19

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_4
    const/4 v7, 0x1

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_1

    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_5
    move/from16 v19, v7

    const-string v6, "compose:lazylist:prefetch:measure"

    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    iget-wide v9, v1, La0/f0;->n:J

    add-long/2addr v9, v6

    cmp-long v9, v9, v4

    if-gez v9, :cond_6

    goto :goto_6

    :cond_6
    if-eqz v2, :cond_9

    :goto_6
    iget-object v2, v8, La0/e0;->c:Lr1/f1;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v2}, Lr1/f1;->b()I

    move-result v9

    move v10, v3

    :goto_7
    if-ge v10, v9, :cond_7

    iget-wide v11, v8, La0/e0;->b:J

    invoke-interface {v2, v10, v11, v12}, Lr1/f1;->c(IJ)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    sub-long/2addr v8, v6

    iget-wide v6, v1, La0/f0;->n:J

    cmp-long v2, v6, v15

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    int-to-long v10, v14

    div-long/2addr v6, v10

    int-to-long v12, v13

    mul-long/2addr v6, v12

    div-long/2addr v8, v10

    add-long/2addr v8, v6

    :goto_8
    iput-wide v8, v1, La0/f0;->n:J

    invoke-virtual {v0, v3}, Lo0/i;->n(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v2, v3

    move/from16 v7, v19

    goto :goto_9

    :cond_9
    const/4 v7, 0x1

    :goto_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_1

    :goto_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_a
    move/from16 v19, v7

    invoke-virtual {v0, v3}, Lo0/i;->n(I)Ljava/lang/Object;

    move/from16 v7, v19

    goto/16 :goto_1

    :cond_b
    move/from16 v19, v7

    if-eqz v19, :cond_c

    iget-object v0, v1, La0/f0;->p:Landroid/view/Choreographer;

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_b

    :cond_c
    iput-boolean v3, v1, La0/f0;->o:Z

    :goto_b
    return-void

    :cond_d
    :goto_c
    iput-boolean v3, v1, La0/f0;->o:Z

    return-void
.end method
