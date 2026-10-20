.class public final Lm0/g3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lq/t;

.field public b:Lc9/c;

.field public c:Lo9/g;

.field public d:Lw0/f;

.field public e:Ljava/lang/Object;

.field public f:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lc9/a;


# direct methods
.method public constructor <init>(Lc9/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm0/g3;->o:Lc9/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lm0/g3;

    iget-object v1, p0, Lm0/g3;->o:Lc9/a;

    invoke-direct {v0, v1, p2}, Lm0/g3;-><init>(Lc9/a;Lu8/e;)V

    iput-object p1, v0, Lm0/g3;->n:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp9/g;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lm0/g3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lm0/g3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lm0/g3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v2, v1, Lm0/g3;->f:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x7

    const/4 v7, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v7, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v2, v1, Lm0/g3;->e:Ljava/lang/Object;

    iget-object v8, v1, Lm0/g3;->d:Lw0/f;

    iget-object v9, v1, Lm0/g3;->c:Lo9/g;

    iget-object v10, v1, Lm0/g3;->b:Lc9/c;

    iget-object v11, v1, Lm0/g3;->a:Lq/t;

    iget-object v12, v1, Lm0/g3;->n:Ljava/lang/Object;

    check-cast v12, Lp9/g;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v1

    move v1, v4

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lm0/g3;->e:Ljava/lang/Object;

    iget-object v8, v1, Lm0/g3;->d:Lw0/f;

    iget-object v9, v1, Lm0/g3;->c:Lo9/g;

    iget-object v10, v1, Lm0/g3;->b:Lc9/c;

    iget-object v11, v1, Lm0/g3;->a:Lq/t;

    iget-object v12, v1, Lm0/g3;->n:Ljava/lang/Object;

    check-cast v12, Lp9/g;

    :try_start_1
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v14, p1

    move-object v13, v1

    goto/16 :goto_2

    :cond_2
    iget-object v2, v1, Lm0/g3;->e:Ljava/lang/Object;

    iget-object v8, v1, Lm0/g3;->d:Lw0/f;

    iget-object v9, v1, Lm0/g3;->c:Lo9/g;

    iget-object v10, v1, Lm0/g3;->b:Lc9/c;

    iget-object v11, v1, Lm0/g3;->a:Lq/t;

    iget-object v12, v1, Lm0/g3;->n:Ljava/lang/Object;

    check-cast v12, Lp9/g;

    :try_start_2
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v1, Lm0/g3;->n:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Lp9/g;

    new-instance v11, Lq/t;

    invoke-direct {v11}, Lq/t;-><init>()V

    new-instance v10, Lq/w;

    const/16 v2, 0x1a

    invoke-direct {v10, v11, v2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    const v2, 0x7fffffff

    const/4 v8, 0x6

    invoke-static {v2, v3, v8}, Lz6/a;->a(ILo9/a;I)Lo9/c;

    move-result-object v9

    new-instance v2, Ls/i;

    invoke-direct {v2, v9, v6}, Ls/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lk0/y0;->f(Ls/i;)Lw0/h;

    move-result-object v8

    :try_start_3
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v2

    invoke-virtual {v2, v10}, Lw0/i;->t(Lc9/c;)Lw0/i;

    move-result-object v2

    iget-object v13, v1, Lm0/g3;->o:Lc9/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v2}, Lw0/i;->j()Lw0/i;

    move-result-object v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    invoke-interface {v13}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-static {v14}, Lw0/i;->p(Lw0/i;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-virtual {v2}, Lw0/i;->c()V

    iput-object v12, v1, Lm0/g3;->n:Ljava/lang/Object;

    iput-object v11, v1, Lm0/g3;->a:Lq/t;

    iput-object v10, v1, Lm0/g3;->b:Lc9/c;

    iput-object v9, v1, Lm0/g3;->c:Lo9/g;

    iput-object v8, v1, Lm0/g3;->d:Lw0/f;

    iput-object v13, v1, Lm0/g3;->e:Ljava/lang/Object;

    iput v5, v1, Lm0/g3;->f:I

    invoke-interface {v12, v13, v1}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    return-object v0

    :cond_4
    move-object v2, v13

    :goto_0
    move-object v13, v1

    :goto_1
    iput-object v12, v13, Lm0/g3;->n:Ljava/lang/Object;

    iput-object v11, v13, Lm0/g3;->a:Lq/t;

    iput-object v10, v13, Lm0/g3;->b:Lc9/c;

    iput-object v9, v13, Lm0/g3;->c:Lo9/g;

    iput-object v8, v13, Lm0/g3;->d:Lw0/f;

    iput-object v2, v13, Lm0/g3;->e:Ljava/lang/Object;

    iput v7, v13, Lm0/g3;->f:I

    invoke-interface {v9, v13}, Lo9/s;->i(Lw8/i;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    check-cast v14, Ljava/util/Set;

    const/16 v16, 0x0

    :goto_3
    if-nez v16, :cond_b

    iget-object v3, v11, Lq/x;->b:[Ljava/lang/Object;

    iget-object v5, v11, Lq/x;->a:[J

    array-length v15, v5

    sub-int/2addr v15, v7

    move-object/from16 v17, v0

    if-ltz v15, :cond_a

    const/4 v7, 0x0

    :goto_4
    aget-wide v0, v5, v7

    move-object/from16 v18, v5

    not-long v4, v0

    shl-long/2addr v4, v6

    and-long/2addr v4, v0

    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v4, v19

    cmp-long v4, v4, v19

    if-eqz v4, :cond_9

    sub-int v4, v7, v15

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v4, :cond_8

    const-wide/16 v20, 0xff

    and-long v20, v0, v20

    const-wide/16 v22, 0x80

    cmp-long v20, v20, v22

    if-gez v20, :cond_7

    shl-int/lit8 v20, v7, 0x3

    add-int v20, v20, v6

    aget-object v5, v3, v20

    invoke-interface {v14, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_6

    :cond_6
    const/16 v5, 0x8

    :cond_7
    shr-long/2addr v0, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_8
    if-ne v4, v5, :cond_a

    :cond_9
    if-eq v7, v15, :cond_a

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v5, v18

    const/4 v4, 0x3

    const/4 v6, 0x7

    goto :goto_4

    :cond_a
    const/4 v0, 0x0

    goto :goto_7

    :cond_b
    move-object/from16 v17, v0

    :goto_6
    const/4 v0, 0x1

    :goto_7
    invoke-interface {v9}, Lo9/s;->m()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lo9/i;

    if-nez v3, :cond_c

    goto :goto_8

    :cond_c
    const/4 v1, 0x0

    :goto_8
    move-object v14, v1

    check-cast v14, Ljava/util/Set;

    if-nez v14, :cond_f

    if-eqz v0, :cond_e

    invoke-virtual {v11}, Lq/t;->d()V

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-virtual {v0, v10}, Lw0/i;->t(Lc9/c;)Lw0/i;

    move-result-object v1

    iget-object v0, v13, Lm0/g3;->o:Lc9/a;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v1}, Lw0/i;->j()Lw0/i;

    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    invoke-virtual {v1}, Lw0/i;->c()V

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    iput-object v12, v13, Lm0/g3;->n:Ljava/lang/Object;

    iput-object v11, v13, Lm0/g3;->a:Lq/t;

    iput-object v10, v13, Lm0/g3;->b:Lc9/c;

    iput-object v9, v13, Lm0/g3;->c:Lo9/g;

    iput-object v8, v13, Lm0/g3;->d:Lw0/f;

    iput-object v0, v13, Lm0/g3;->e:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v13, Lm0/g3;->f:I

    invoke-interface {v12, v0, v13}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-object/from16 v3, v17

    if-ne v2, v3, :cond_d

    return-object v3

    :cond_d
    move-object v2, v0

    move-object v0, v3

    :goto_9
    move v4, v1

    :goto_a
    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x7

    const/4 v7, 0x2

    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_e
    move-object/from16 v3, v17

    const/4 v1, 0x3

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_c
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V

    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_d
    invoke-virtual {v1}, Lw0/i;->c()V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :goto_b
    move v4, v1

    move-object v0, v3

    goto :goto_a

    :cond_f
    move-object/from16 v1, p0

    move/from16 v16, v0

    move-object/from16 v0, v17

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x7

    const/4 v7, 0x2

    goto/16 :goto_3

    :catchall_3
    move-exception v0

    move-object v1, v0

    :try_start_e
    invoke-static {v14}, Lw0/i;->p(Lw0/i;)V

    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_f
    invoke-virtual {v2}, Lw0/i;->c()V

    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :goto_c
    check-cast v8, Lw0/h;

    invoke-virtual {v8}, Lw0/h;->a()V

    throw v0
.end method
