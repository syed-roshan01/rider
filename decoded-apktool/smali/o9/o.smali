.class public final Lo9/o;
.super Lo9/c;


# instance fields
.field public final s:Lo9/a;


# direct methods
.method public constructor <init>(ILo9/a;Lc9/c;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lo9/c;-><init>(ILc9/c;)V

    iput-object p2, p0, Lo9/o;->s:Lo9/a;

    sget-object p3, Lo9/a;->a:Lo9/a;

    if-eq p2, p3, :cond_1

    const/4 p2, 0x1

    if-lt p1, p2, :cond_0

    return-void

    :cond_0
    const-string p2, "Buffered channel capacity must be at least 1, but "

    const-string p3, " was specified"

    invoke-static {p2, p1, p3}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "This implementation does not support suspension for senders, use "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class p2, Lo9/c;

    invoke-static {p2}, Ld9/v;->a(Ljava/lang/Class;)Ld9/e;

    move-result-object p2

    invoke-virtual {p2}, Ld9/e;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " instead"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 20

    move-object/from16 v8, p0

    sget-object v0, Lo9/a;->c:Lo9/a;

    sget-object v9, Lq8/l;->a:Lq8/l;

    iget-object v1, v8, Lo9/o;->s:Lo9/a;

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-ne v1, v0, :cond_3

    invoke-super/range {p0 .. p1}, Lo9/c;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo9/i;

    xor-int/2addr v1, v11

    if-nez v1, :cond_2

    instance-of v1, v0, Lo9/h;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_10

    iget-object v0, v8, Lo9/c;->b:Lc9/c;

    if-eqz v0, :cond_10

    move-object/from16 v12, p1

    invoke-static {v0, v12, v10}, Ld7/a;->g(Lc9/c;Ljava/lang/Object;Landroidx/fragment/app/a0;)Landroidx/fragment/app/a0;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    throw v0

    :cond_2
    :goto_0
    move-object v9, v0

    goto/16 :goto_5

    :cond_3
    move-object/from16 v12, p1

    sget-object v13, Lo9/e;->d:Li3/u;

    sget-object v0, Lo9/c;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo9/k;

    :goto_1
    sget-object v1, Lo9/c;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v14, v1, v3

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v2, v3}, Lo9/c;->w(JZ)Z

    move-result v16

    sget v7, Lo9/e;->b:I

    int-to-long v4, v7

    div-long v1, v14, v4

    rem-long v10, v14, v4

    long-to-int v10, v10

    move-wide/from16 v17, v4

    iget-wide v3, v0, Lr9/t;->c:J

    cmp-long v3, v3, v1

    if-eqz v3, :cond_6

    invoke-static {v8, v1, v2, v0}, Lo9/c;->b(Lo9/c;JLo9/k;)Lo9/k;

    move-result-object v1

    if-nez v1, :cond_5

    if-eqz v16, :cond_4

    invoke-virtual/range {p0 .. p0}, Lo9/c;->t()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v9, Lo9/h;

    invoke-direct {v9, v0}, Lo9/h;-><init>(Ljava/lang/Throwable;)V

    goto/16 :goto_5

    :cond_4
    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_1

    :cond_5
    move-object v11, v1

    goto :goto_2

    :cond_6
    move-object v11, v0

    :goto_2
    move-object/from16 v0, p0

    move-object v1, v11

    move v2, v10

    move-object/from16 v3, p1

    move-wide v4, v14

    move-object v6, v13

    move/from16 v19, v7

    move/from16 v7, v16

    invoke-static/range {v0 .. v7}, Lo9/c;->e(Lo9/c;Lo9/k;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    if-eq v0, v1, :cond_10

    const/4 v2, 0x2

    if-eq v0, v2, :cond_b

    const/4 v2, 0x3

    if-eq v0, v2, :cond_a

    const/4 v2, 0x4

    if-eq v0, v2, :cond_8

    const/4 v2, 0x5

    if-eq v0, v2, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v11}, Lr9/d;->a()V

    :goto_3
    move-object v0, v11

    const/4 v10, 0x0

    move v11, v1

    goto :goto_1

    :cond_8
    sget-object v0, Lo9/c;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v0, v14, v0

    if-gez v0, :cond_9

    invoke-virtual {v11}, Lr9/d;->a()V

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lo9/c;->t()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v9, Lo9/h;

    invoke-direct {v9, v0}, Lo9/h;-><init>(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    if-eqz v16, :cond_c

    invoke-virtual {v11}, Lr9/t;->h()V

    invoke-virtual/range {p0 .. p0}, Lo9/c;->t()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v9, Lo9/h;

    invoke-direct {v9, v0}, Lo9/h;-><init>(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_c
    instance-of v0, v13, Lm9/i2;

    if-eqz v0, :cond_d

    move-object v0, v13

    check-cast v0, Lm9/i2;

    goto :goto_4

    :cond_d
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_e

    add-int v7, v10, v19

    invoke-interface {v0, v11, v7}, Lm9/i2;->a(Lr9/t;I)V

    :cond_e
    iget-wide v0, v11, Lr9/t;->c:J

    mul-long v0, v0, v17

    int-to-long v2, v10

    add-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lo9/c;->l(J)V

    goto :goto_5

    :cond_f
    invoke-virtual {v11}, Lr9/d;->a()V

    :cond_10
    :goto_5
    return-object v9
.end method

.method public final h(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lo9/o;->H(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Lo9/h;

    if-eqz v0, :cond_2

    if-eqz v0, :cond_0

    check-cast p2, Lo9/h;

    :cond_0
    iget-object p2, p0, Lo9/c;->b:Lc9/c;

    if-eqz p2, :cond_1

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Ld7/a;->g(Lc9/c;Ljava/lang/Object;Landroidx/fragment/app/a0;)Landroidx/fragment/app/a0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lo9/c;->t()Ljava/lang/Throwable;

    move-result-object p2

    invoke-static {p1, p2}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lo9/c;->t()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_2
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo9/o;->H(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x()Z
    .locals 2

    sget-object v0, Lo9/a;->b:Lo9/a;

    iget-object v1, p0, Lo9/o;->s:Lo9/a;

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
