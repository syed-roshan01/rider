.class public final Ls/i;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ls/i;->a:I

    iput-object p1, p0, Ls/i;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 8

    iget v0, p0, Ls/i;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls/i;->b:Ljava/lang/Object;

    check-cast v0, Lw0/a0;

    :goto_0
    iget-object v4, v0, Lw0/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    move-object v6, p1

    check-cast v6, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    instance-of v6, v5, Ljava/util/Set;

    if-eqz v6, :cond_1

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/util/Set;

    aput-object v5, v6, v2

    aput-object p1, v6, v3

    invoke-static {v6}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    goto :goto_1

    :cond_1
    instance-of v6, v5, Ljava/util/List;

    if-eqz v6, :cond_5

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-static {p1}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7, v6}, Lr8/p;->P0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {v0}, Lw0/a0;->a(Lw0/a0;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lt/l0;

    const/16 v1, 0x11

    invoke-direct {p1, v0, v1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iget-object v0, v0, Lw0/a0;->a:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void

    :cond_4
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v5, :cond_2

    goto :goto_0

    :cond_5
    const-string p1, "Unexpected notification"

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lw0/h0;

    if-eqz v2, :cond_8

    check-cast v1, Lw0/h0;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lw0/h0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_8
    iget-object v0, p0, Ls/i;->b:Ljava/lang/Object;

    check-cast v0, Lo9/g;

    invoke-interface {v0, p1}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_2
    return-void

    :pswitch_1
    iget-object v0, p0, Ls/i;->b:Ljava/lang/Object;

    check-cast v0, Lm0/g2;

    iget-object v4, v0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v0, Lm0/g2;->r:Lp9/q0;

    invoke-virtual {v5}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/a2;

    sget-object v6, Lm0/a2;->e:Lm0/a2;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-ltz v5, :cond_e

    instance-of v1, p1, Lo0/d;

    if-eqz v1, :cond_b

    check-cast p1, Lo0/d;

    iget-object v1, p1, Lo0/d;->b:[Ljava/lang/Object;

    iget p1, p1, Lo0/d;->a:I

    :goto_3
    if-ge v2, p1, :cond_d

    aget-object v5, v1, v2

    const-string v6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v5, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v5, Lw0/h0;

    if-eqz v6, :cond_a

    move-object v6, v5

    check-cast v6, Lw0/h0;

    invoke-virtual {v6, v3}, Lw0/h0;->b(I)Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_a
    iget-object v6, v0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v6, v5}, Lo0/d;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lw0/h0;

    if-eqz v2, :cond_c

    move-object v2, v1

    check-cast v2, Lw0/h0;

    invoke-virtual {v2, v3}, Lw0/h0;->b(I)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_5

    :cond_c
    iget-object v2, v0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v2, v1}, Lo0/d;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    invoke-virtual {v0}, Lm0/g2;->u()Lm9/k;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_e
    monitor-exit v4

    if-eqz v1, :cond_f

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-interface {v1, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_f
    return-void

    :goto_6
    monitor-exit v4

    throw p1

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lm0/m;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    iget v1, v0, Ls/i;->a:I

    iget-object v2, v0, Ls/i;->b:Ljava/lang/Object;

    const/4 v3, 0x2

    packed-switch v1, :pswitch_data_0

    and-int/lit8 v1, p2, 0xb

    if-ne v1, v3, :cond_1

    move-object v1, v11

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    sget-object v1, Lz6/a;->k:Li1/f;

    if-eqz v1, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v13, "Filled.OpenInNew"

    const/16 v21, 0x0

    new-instance v1, Li1/e;

    const/high16 v14, 0x41c00000    # 24.0f

    const/high16 v15, 0x41c00000    # 24.0f

    const/high16 v16, 0x41c00000    # 24.0f

    const/high16 v17, 0x41c00000    # 24.0f

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x60

    move-object v12, v1

    invoke-direct/range {v12 .. v22}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v3, Li1/h0;->a:I

    new-instance v3, Le1/n0;

    sget-wide v4, Le1/r;->b:J

    invoke-direct {v3, v4, v5}, Le1/n0;-><init>(J)V

    new-instance v4, Lk/f;

    const/4 v5, 0x7

    invoke-direct {v4, v5}, Lk/f;-><init>(I)V

    const/high16 v5, 0x41980000    # 19.0f

    invoke-virtual {v4, v5, v5}, Lk/f;->D(FF)V

    const/high16 v6, 0x40a00000    # 5.0f

    invoke-virtual {v4, v6}, Lk/f;->z(F)V

    invoke-virtual {v4, v6}, Lk/f;->J(F)V

    const/high16 v7, 0x40e00000    # 7.0f

    invoke-virtual {v4, v7}, Lk/f;->A(F)V

    const/high16 v8, 0x40400000    # 3.0f

    invoke-virtual {v4, v8}, Lk/f;->J(F)V

    invoke-virtual {v4, v6}, Lk/f;->z(F)V

    const v13, -0x4071eb85    # -1.11f

    const/4 v14, 0x0

    const/high16 v15, -0x40000000    # -2.0f

    const v16, 0x3f666666    # 0.9f

    const/high16 v17, -0x40000000    # -2.0f

    const/high16 v18, 0x40000000    # 2.0f

    move-object v12, v4

    invoke-virtual/range {v12 .. v18}, Lk/f;->v(FFFFFF)V

    const/high16 v6, 0x41600000    # 14.0f

    invoke-virtual {v4, v6}, Lk/f;->K(F)V

    const/4 v13, 0x0

    const v14, 0x3f8ccccd    # 1.1f

    const v15, 0x3f63d70a    # 0.89f

    const/high16 v16, 0x40000000    # 2.0f

    const/high16 v17, 0x40000000    # 2.0f

    invoke-virtual/range {v12 .. v18}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v4, v6}, Lk/f;->A(F)V

    const v13, 0x3f8ccccd    # 1.1f

    const/4 v14, 0x0

    const/high16 v15, 0x40000000    # 2.0f

    const v16, -0x4099999a    # -0.9f

    const/high16 v18, -0x40000000    # -2.0f

    invoke-virtual/range {v12 .. v18}, Lk/f;->v(FFFFFF)V

    const/high16 v9, -0x3f200000    # -7.0f

    invoke-virtual {v4, v9}, Lk/f;->K(F)V

    const/high16 v10, -0x40000000    # -2.0f

    invoke-virtual {v4, v10}, Lk/f;->A(F)V

    invoke-virtual {v4, v7}, Lk/f;->K(F)V

    invoke-virtual {v4}, Lk/f;->p()V

    invoke-virtual {v4, v6, v8}, Lk/f;->D(FF)V

    const/high16 v6, 0x40000000    # 2.0f

    invoke-virtual {v4, v6}, Lk/f;->K(F)V

    const v7, 0x4065c28f    # 3.59f

    invoke-virtual {v4, v7}, Lk/f;->A(F)V

    const v7, -0x3ee2b852    # -9.83f

    const v10, 0x411d47ae    # 9.83f

    invoke-virtual {v4, v7, v10}, Lk/f;->C(FF)V

    const v7, 0x3fb47ae1    # 1.41f

    invoke-virtual {v4, v7, v7}, Lk/f;->C(FF)V

    const v7, 0x40cd1eb8    # 6.41f

    invoke-virtual {v4, v5, v7}, Lk/f;->B(FF)V

    const/high16 v5, 0x41200000    # 10.0f

    invoke-virtual {v4, v5}, Lk/f;->J(F)V

    invoke-virtual {v4, v6}, Lk/f;->A(F)V

    invoke-virtual {v4, v8}, Lk/f;->J(F)V

    invoke-virtual {v4, v9}, Lk/f;->A(F)V

    invoke-virtual {v4}, Lk/f;->p()V

    iget-object v4, v4, Lk/f;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-static {v1, v4, v3}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v1}, Li1/e;->b()Li1/f;

    move-result-object v1

    sput-object v1, Lz6/a;->k:Li1/f;

    :goto_1
    check-cast v2, Lcom/auto/accept/data/model/SupportedApp;

    invoke-virtual {v2}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Open "

    invoke-static {v3, v2}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    sget-wide v4, Le5/a;->a:J

    const/4 v7, 0x0

    const/4 v8, 0x4

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, Lk0/e1;->b(Li1/f;Ljava/lang/String;Ly0/o;JLm0/m;II)V

    :goto_2
    return-void

    :pswitch_0
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v3, :cond_4

    move-object v1, v11

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_4

    :cond_4
    :goto_3
    new-instance v1, Lc5/i;

    check-cast v2, Landroid/app/Activity;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lc5/i;-><init>(Landroid/app/Activity;I)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lc5/c;->g:Lu0/b;

    const/high16 v12, 0x30000000

    const/16 v13, 0x1fe

    move-object/from16 v11, p1

    invoke-static/range {v1 .. v13}, Lm9/e0;->j(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    :goto_4
    return-void

    :pswitch_1
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v3, :cond_6

    move-object v1, v11

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_6

    :cond_6
    :goto_5
    check-cast v2, Lu1/a;

    const/16 v1, 0x8

    invoke-virtual {v2, v11, v1}, Lu1/a;->a(Lm0/m;I)V

    :goto_6
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(JLm2/l;)J
    .locals 9

    iget v0, p0, Ls/i;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Ls/i;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Ly0/b;

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    long-to-int p1, p1

    check-cast v2, Ly0/e;

    invoke-virtual {v2, v1, p1, p3}, Ly0/e;->a(IILm2/l;)I

    move-result p1

    invoke-static {p1, v1}, Li1/b;->c(II)J

    move-result-wide p1

    return-wide p1

    :pswitch_0
    check-cast v2, Ly0/d;

    const-wide/16 v4, 0x0

    move-object v3, v2

    check-cast v3, Ly0/g;

    move-wide v6, p1

    move-object v8, p3

    invoke-virtual/range {v3 .. v8}, Ly0/g;->a(JJLm2/l;)J

    move-result-wide p1

    return-wide p1

    :pswitch_1
    check-cast v2, Ly0/c;

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    check-cast v2, Ly0/f;

    invoke-virtual {v2, v1, p1}, Ly0/f;->a(II)I

    move-result p1

    invoke-static {v1, p1}, Li1/b;->c(II)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/i;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Ls/i;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    check-cast p2, Lu8/h;

    invoke-interface {p2}, Lu8/h;->getKey()Lu8/i;

    move-result-object p1

    check-cast v5, Lq9/u;

    iget-object v0, v5, Lq9/u;->b:Lu8/j;

    invoke-interface {v0, p1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    sget-object v2, Lm9/a0;->b:Lm9/a0;

    if-eq p1, v2, :cond_1

    if-eq p2, v0, :cond_0

    const/high16 p1, -0x80000000

    goto :goto_0

    :cond_0
    add-int/lit8 p1, v1, 0x1

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_5

    :cond_1
    move-object v2, v0

    check-cast v2, Lm9/f1;

    check-cast p2, Lm9/f1;

    :goto_1
    if-nez p2, :cond_2

    goto :goto_3

    :cond_2
    if-ne p2, v2, :cond_3

    :goto_2
    move-object v3, p2

    goto :goto_3

    :cond_3
    instance-of p1, p2, Lr9/s;

    if-nez p1, :cond_6

    goto :goto_2

    :goto_3
    if-ne v3, v2, :cond_5

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_5
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expected child of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    check-cast p2, Lm9/p1;

    sget-object p1, Lm9/p1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/o;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Lm9/o;->getParent()Lm9/f1;

    move-result-object p1

    move-object p2, p1

    goto :goto_1

    :cond_7
    move-object p2, v3

    goto :goto_1

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/i;->b(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/i;->b(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/i;->b(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Ly0/o;

    check-cast p2, Ly0/m;

    instance-of v0, p2, Ly0/j;

    if-eqz v0, :cond_8

    check-cast p2, Ly0/j;

    iget-object p2, p2, Ly0/j;->c:Lc9/f;

    const-string v0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>"

    invoke-static {p2, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {v0, p2}, Lz6/a;->f(ILjava/lang/Object;)V

    sget-object v0, Ly0/l;->b:Ly0/l;

    check-cast v5, Lm0/m;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v5, v1}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/o;

    invoke-static {v5, p2}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object p2

    :cond_8
    invoke-interface {p1, p2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/util/Set;

    check-cast p2, Lw0/i;

    invoke-virtual {p0, p1}, Ls/i;->a(Ljava/util/Set;)V

    return-object v0

    :pswitch_5
    check-cast p1, Ljava/util/Set;

    check-cast p2, Lw0/i;

    invoke-virtual {p0, p1}, Ls/i;->a(Ljava/util/Set;)V

    return-object v0

    :pswitch_6
    check-cast p1, Ljava/util/Set;

    check-cast p2, Lw0/i;

    invoke-virtual {p0, p1}, Ls/i;->a(Ljava/util/Set;)V

    return-object v0

    :pswitch_7
    check-cast p1, Lo1/u;

    check-cast p2, Ld1/c;

    iget-wide p1, p2, Ld1/c;->a:J

    check-cast v5, Lf0/k1;

    invoke-interface {v5, p1, p2}, Lf0/k1;->h(J)V

    return-object v0

    :pswitch_8
    check-cast p1, Lv0/d;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    invoke-static {v5}, La7/a;->w(Ljava/lang/Object;)V

    sget-object p1, Lh0/n0;->a:Lm0/p0;

    return-object v3

    :pswitch_9
    check-cast p1, Lm2/k;

    iget-wide v0, p1, Lm2/k;->a:J

    check-cast p2, Lm2/l;

    invoke-virtual {p0, v0, v1, p2}, Ls/i;->d(JLm2/l;)J

    move-result-wide p1

    new-instance v0, Lm2/i;

    invoke-direct {v0, p1, p2}, Lm2/i;-><init>(J)V

    return-object v0

    :pswitch_a
    check-cast p1, Lm2/k;

    iget-wide v0, p1, Lm2/k;->a:J

    check-cast p2, Lm2/l;

    invoke-virtual {p0, v0, v1, p2}, Ls/i;->d(JLm2/l;)J

    move-result-wide p1

    new-instance v0, Lm2/i;

    invoke-direct {v0, p1, p2}, Lm2/i;-><init>(J)V

    return-object v0

    :pswitch_b
    check-cast p1, Lm2/k;

    iget-wide v0, p1, Lm2/k;->a:J

    check-cast p2, Lm2/l;

    invoke-virtual {p0, v0, v1, p2}, Ls/i;->d(JLm2/l;)J

    move-result-wide p1

    new-instance v0, Lm2/i;

    invoke-direct {v0, p1, p2}, Lm2/i;-><init>(J)V

    return-object v0

    :pswitch_c
    check-cast p1, Ls/j0;

    check-cast p2, Ls/j0;

    sget-object v0, Ls/j0;->c:Ls/j0;

    if-ne p1, v0, :cond_9

    if-ne p2, v0, :cond_9

    check-cast v5, Ls/r0;

    iget-object p1, v5, Ls/r0;->a:Ls/b1;

    iget-boolean p1, p1, Ls/b1;->c:Z

    if-nez p1, :cond_9

    move v2, v4

    :cond_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
