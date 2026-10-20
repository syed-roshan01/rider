.class public final Lo9/b;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/i2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lm9/l;

.field public final synthetic c:Lo9/c;


# direct methods
.method public constructor <init>(Lo9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/b;->c:Lo9/c;

    sget-object p1, Lo9/e;->p:Li3/u;

    iput-object p1, p0, Lo9/b;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lr9/t;I)V
    .locals 1

    iget-object v0, p0, Lo9/b;->b:Lm9/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lm9/l;->a(Lr9/t;I)V

    :cond_0
    return-void
.end method

.method public final b(Lw8/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v7, p0

    const/4 v0, 0x0

    sget-object v1, Lo9/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v8, v7, Lo9/b;->c:Lo9/c;

    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo9/k;

    :goto_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lo9/c;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/4 v9, 0x1

    invoke-virtual {v8, v2, v3, v9}, Lo9/c;->w(JZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v0, Lo9/e;->l:Li3/u;

    iput-object v0, v7, Lo9/b;->a:Ljava/lang/Object;

    invoke-virtual {v8}, Lo9/c;->q()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_8

    :cond_0
    sget v1, Lr9/u;->a:I

    throw v0

    :cond_1
    sget-object v2, Lo9/c;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v10

    sget v2, Lo9/e;->b:I

    int-to-long v2, v2

    div-long v4, v10, v2

    rem-long v2, v10, v2

    long-to-int v12, v2

    iget-wide v2, v1, Lr9/t;->c:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    invoke-virtual {v8, v4, v5, v1}, Lo9/c;->p(JLo9/k;)Lo9/k;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v13, v2

    goto :goto_1

    :cond_3
    move-object v13, v1

    :goto_1
    move-object v1, v8

    move-object v2, v13

    move v3, v12

    move-wide v4, v10

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lo9/c;->E(Lo9/k;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v14, Lo9/e;->m:Li3/u;

    if-eq v1, v14, :cond_13

    sget-object v15, Lo9/e;->o:Li3/u;

    if-ne v1, v15, :cond_5

    invoke-virtual {v8}, Lo9/c;->u()J

    move-result-wide v1

    cmp-long v1, v10, v1

    if-gez v1, :cond_4

    invoke-virtual {v13}, Lr9/d;->a()V

    :cond_4
    move-object v1, v13

    goto :goto_0

    :cond_5
    sget-object v0, Lo9/e;->n:Li3/u;

    if-ne v1, v0, :cond_12

    iget-object v0, v7, Lo9/b;->c:Lo9/c;

    invoke-static/range {p1 .. p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v1

    invoke-static {v1}, Ld7/a;->w(Lu8/e;)Lm9/l;

    move-result-object v6

    :try_start_0
    iput-object v6, v7, Lo9/b;->b:Lm9/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v1, v0

    move-object v2, v13

    move v3, v12

    move-wide v4, v10

    move-object v9, v6

    move-object/from16 v6, p0

    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lo9/c;->E(Lo9/k;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_6

    invoke-virtual {v7, v13, v12}, Lo9/b;->a(Lr9/t;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_6

    :cond_6
    const/4 v12, 0x0

    iget-object v14, v9, Lm9/l;->e:Lu8/j;

    iget-object v6, v0, Lo9/c;->b:Lc9/c;

    if-ne v1, v15, :cond_11

    :try_start_2
    invoke-virtual {v0}, Lo9/c;->u()J

    move-result-wide v1

    cmp-long v1, v10, v1

    if-gez v1, :cond_7

    invoke-virtual {v13}, Lr9/d;->a()V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_7
    :goto_2
    sget-object v1, Lo9/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo9/k;

    :goto_3
    sget-object v2, Lo9/c;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/4 v10, 0x1

    invoke-virtual {v0, v2, v3, v10}, Lo9/c;->w(JZ)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, v7, Lo9/b;->b:Lm9/l;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iput-object v12, v7, Lo9/b;->b:Lm9/l;

    sget-object v1, Lo9/e;->l:Li3/u;

    iput-object v1, v7, Lo9/b;->a:Ljava/lang/Object;

    invoke-virtual {v8}, Lo9/c;->q()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_8

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_8
    invoke-static {v1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_9
    sget-object v2, Lo9/c;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v15

    sget v2, Lo9/e;->b:I

    int-to-long v2, v2

    div-long v4, v15, v2

    rem-long v2, v15, v2

    long-to-int v11, v2

    iget-wide v2, v1, Lr9/t;->c:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_b

    invoke-virtual {v0, v4, v5, v1}, Lo9/c;->p(JLo9/k;)Lo9/k;

    move-result-object v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_a
    move-object v13, v2

    goto :goto_4

    :cond_b
    move-object v13, v1

    :goto_4
    move-object v1, v0

    move-object v2, v13

    move v3, v11

    move-wide v4, v15

    move-object v10, v6

    move-object/from16 v6, p0

    invoke-virtual/range {v1 .. v6}, Lo9/c;->E(Lo9/k;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lo9/e;->m:Li3/u;

    if-ne v1, v2, :cond_c

    invoke-virtual {v7, v13, v11}, Lo9/b;->a(Lr9/t;I)V

    goto :goto_6

    :cond_c
    sget-object v2, Lo9/e;->o:Li3/u;

    if-ne v1, v2, :cond_e

    invoke-virtual {v0}, Lo9/c;->u()J

    move-result-wide v1

    cmp-long v1, v15, v1

    if-gez v1, :cond_d

    invoke-virtual {v13}, Lr9/d;->a()V

    :cond_d
    move-object v6, v10

    move-object v1, v13

    goto :goto_3

    :cond_e
    sget-object v0, Lo9/e;->n:Li3/u;

    if-eq v1, v0, :cond_10

    invoke-virtual {v13}, Lr9/d;->a()V

    iput-object v1, v7, Lo9/b;->a:Ljava/lang/Object;

    iput-object v12, v7, Lo9/b;->b:Lm9/l;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eqz v10, :cond_f

    invoke-static {v10, v1, v14}, Ld7/a;->f(Lc9/c;Ljava/lang/Object;Lu8/j;)Lb/g;

    move-result-object v12

    :cond_f
    :goto_5
    invoke-virtual {v9, v12, v0}, Lm9/l;->o(Lc9/c;Ljava/lang/Object;)V

    goto :goto_6

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object v10, v6

    invoke-virtual {v13}, Lr9/d;->a()V

    iput-object v1, v7, Lo9/b;->a:Ljava/lang/Object;

    iput-object v12, v7, Lo9/b;->b:Lm9/l;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eqz v10, :cond_f

    invoke-static {v10, v1, v14}, Ld7/a;->f(Lc9/c;Ljava/lang/Object;Lu8/j;)Lb/g;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :goto_6
    invoke-virtual {v9}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lv8/a;->a:Lv8/a;

    return-object v0

    :catchall_1
    move-exception v0

    move-object v9, v6

    :goto_7
    invoke-virtual {v9}, Lm9/l;->C()V

    throw v0

    :cond_12
    invoke-virtual {v13}, Lr9/d;->a()V

    iput-object v1, v7, Lo9/b;->a:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_8
    return-object v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unreachable"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo9/b;->a:Ljava/lang/Object;

    sget-object v1, Lo9/e;->p:Li3/u;

    if-eq v0, v1, :cond_1

    iput-object v1, p0, Lo9/b;->a:Ljava/lang/Object;

    sget-object v1, Lo9/e;->l:Li3/u;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lo9/b;->c:Lo9/c;

    invoke-virtual {v0}, Lo9/c;->s()Ljava/lang/Throwable;

    move-result-object v0

    sget v1, Lr9/u;->a:I

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
