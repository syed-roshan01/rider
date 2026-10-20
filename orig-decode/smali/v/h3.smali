.class public final Lv/h3;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ld9/u;

.field public e:J

.field public f:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lm9/d0;

.field public final synthetic p:Lc9/f;

.field public final synthetic q:Lc9/c;

.field public final synthetic r:Lc9/c;

.field public final synthetic s:Lc9/c;

.field public final synthetic t:Lv/l1;


# direct methods
.method public constructor <init>(Lm9/d0;Lc9/f;Lc9/c;Lc9/c;Lc9/c;Lv/l1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/h3;->o:Lm9/d0;

    iput-object p2, p0, Lv/h3;->p:Lc9/f;

    iput-object p3, p0, Lv/h3;->q:Lc9/c;

    iput-object p4, p0, Lv/h3;->r:Lc9/c;

    iput-object p5, p0, Lv/h3;->s:Lc9/c;

    iput-object p6, p0, Lv/h3;->t:Lv/l1;

    invoke-direct {p0, p7}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 9

    new-instance v8, Lv/h3;

    iget-object v1, p0, Lv/h3;->o:Lm9/d0;

    iget-object v2, p0, Lv/h3;->p:Lc9/f;

    iget-object v3, p0, Lv/h3;->q:Lc9/c;

    iget-object v4, p0, Lv/h3;->r:Lc9/c;

    iget-object v5, p0, Lv/h3;->s:Lc9/c;

    iget-object v6, p0, Lv/h3;->t:Lv/l1;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lv/h3;-><init>(Lm9/d0;Lc9/f;Lc9/c;Lc9/c;Lc9/c;Lv/l1;Lu8/e;)V

    iput-object p1, v8, Lv/h3;->n:Ljava/lang/Object;

    return-object v8
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/h3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/h3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/h3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/h3;->f:I

    const/4 v3, 0x0

    iget-object v4, v0, Lv/h3;->o:Lm9/d0;

    const/4 v5, 0x0

    const/4 v6, 0x3

    iget-object v7, v0, Lv/h3;->p:Lc9/f;

    iget-object v8, v0, Lv/h3;->s:Lc9/c;

    iget-object v9, v0, Lv/h3;->q:Lc9/c;

    iget-object v10, v0, Lv/h3;->t:Lv/l1;

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v2, v5

    goto/16 :goto_7

    :pswitch_1
    iget-object v2, v0, Lv/h3;->c:Ljava/lang/Object;

    check-cast v2, Lo1/u;

    iget-object v7, v0, Lv/h3;->b:Ljava/lang/Object;

    check-cast v7, Ld9/u;

    iget-object v11, v0, Lv/h3;->n:Ljava/lang/Object;

    check-cast v11, Lo1/h0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lo1/m; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_8

    :pswitch_2
    iget-wide v11, v0, Lv/h3;->e:J

    iget-object v2, v0, Lv/h3;->b:Ljava/lang/Object;

    check-cast v2, Ld9/u;

    iget-object v13, v0, Lv/h3;->n:Ljava/lang/Object;

    check-cast v13, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v16, v7

    move-object v7, v2

    move-object/from16 v2, p1

    move-wide/from16 v24, v11

    move-object v11, v13

    move-wide/from16 v12, v24

    goto/16 :goto_6

    :pswitch_3
    iget-wide v11, v0, Lv/h3;->e:J

    iget-object v2, v0, Lv/h3;->b:Ljava/lang/Object;

    check-cast v2, Ld9/u;

    iget-object v13, v0, Lv/h3;->n:Ljava/lang/Object;

    check-cast v13, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_4
    iget-wide v11, v0, Lv/h3;->e:J

    iget-object v2, v0, Lv/h3;->d:Ld9/u;

    iget-object v13, v0, Lv/h3;->c:Ljava/lang/Object;

    check-cast v13, Ld9/u;

    iget-object v14, v0, Lv/h3;->b:Ljava/lang/Object;

    check-cast v14, Lo1/u;

    iget-object v15, v0, Lv/h3;->n:Ljava/lang/Object;

    check-cast v15, Lo1/h0;

    :try_start_1
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catch Lo1/m; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v3, p1

    goto/16 :goto_2

    :catch_0
    move-object v2, v13

    :catch_1
    move-object v13, v15

    goto/16 :goto_3

    :pswitch_5
    iget-object v2, v0, Lv/h3;->n:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v11, p1

    :cond_0
    move-object v15, v2

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lv/h3;->n:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    iput-object v2, v0, Lv/h3;->n:Ljava/lang/Object;

    const/4 v11, 0x1

    iput v11, v0, Lv/h3;->f:I

    invoke-static {v2, v0, v6}, Lv/k3;->c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v1, :cond_0

    return-object v1

    :goto_0
    move-object v14, v11

    check-cast v14, Lo1/u;

    invoke-virtual {v14}, Lo1/u;->a()V

    new-instance v2, Lv/w2;

    invoke-direct {v2, v10, v5}, Lv/w2;-><init>(Lv/l1;Lu8/e;)V

    invoke-static {v4, v5, v3, v2, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    sget-object v2, Lv/k3;->a:Lv/p0;

    if-eq v7, v2, :cond_1

    new-instance v2, Lv/x2;

    invoke-direct {v2, v7, v10, v14, v5}, Lv/x2;-><init>(Lc9/f;Lv/l1;Lo1/u;Lu8/e;)V

    invoke-static {v4, v5, v3, v2, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_1
    if-eqz v9, :cond_2

    invoke-virtual {v15}, Lo1/h0;->g()Lu1/y2;

    move-result-object v2

    invoke-interface {v2}, Lu1/y2;->d()J

    move-result-wide v11

    goto :goto_1

    :cond_2
    const-wide v11, 0x3fffffffffffffffL    # 1.9999999999999998

    :goto_1
    new-instance v2, Ld9/u;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    :try_start_2
    new-instance v13, Lv/y2;

    invoke-direct {v13, v5}, Lw8/h;-><init>(Lu8/e;)V

    iput-object v15, v0, Lv/h3;->n:Ljava/lang/Object;

    iput-object v14, v0, Lv/h3;->b:Ljava/lang/Object;

    iput-object v2, v0, Lv/h3;->c:Ljava/lang/Object;

    iput-object v2, v0, Lv/h3;->d:Ld9/u;

    iput-wide v11, v0, Lv/h3;->e:J

    const/4 v3, 0x2

    iput v3, v0, Lv/h3;->f:I

    invoke-virtual {v15, v11, v12, v13, v0}, Lo1/h0;->h(JLc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Lo1/m; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v13, v2

    :goto_2
    :try_start_3
    iput-object v3, v2, Ld9/u;->a:Ljava/lang/Object;

    iget-object v2, v13, Ld9/u;->a:Ljava/lang/Object;

    if-nez v2, :cond_4

    new-instance v2, Lv/z2;

    invoke-direct {v2, v10, v5}, Lv/z2;-><init>(Lv/l1;Lu8/e;)V

    const/4 v3, 0x0

    invoke-static {v4, v5, v3, v2, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_5

    :cond_4
    check-cast v2, Lo1/u;

    invoke-virtual {v2}, Lo1/u;->a()V

    new-instance v2, Lv/a3;

    invoke-direct {v2, v10, v5}, Lv/a3;-><init>(Lv/l1;Lu8/e;)V

    const/4 v3, 0x0

    invoke-static {v4, v5, v3, v2, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;
    :try_end_3
    .catch Lo1/m; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_5

    :goto_3
    if-eqz v9, :cond_5

    iget-wide v14, v14, Lo1/u;->c:J

    new-instance v3, Ld1/c;

    invoke-direct {v3, v14, v15}, Ld1/c;-><init>(J)V

    invoke-interface {v9, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v13, v0, Lv/h3;->n:Ljava/lang/Object;

    iput-object v2, v0, Lv/h3;->b:Ljava/lang/Object;

    iput-object v5, v0, Lv/h3;->c:Ljava/lang/Object;

    iput-object v5, v0, Lv/h3;->d:Ld9/u;

    iput-wide v11, v0, Lv/h3;->e:J

    iput v6, v0, Lv/h3;->f:I

    invoke-static {v13, v0}, Lv/k3;->a(Lo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    return-object v1

    :cond_6
    :goto_4
    new-instance v3, Lv/b3;

    invoke-direct {v3, v10, v5}, Lv/b3;-><init>(Lv/l1;Lu8/e;)V

    const/4 v14, 0x0

    invoke-static {v4, v5, v14, v3, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-object v15, v13

    move-object v13, v2

    :goto_5
    iget-object v2, v13, Ld9/u;->a:Ljava/lang/Object;

    if-eqz v2, :cond_e

    iget-object v3, v0, Lv/h3;->r:Lc9/c;

    if-nez v3, :cond_7

    if-eqz v8, :cond_e

    check-cast v2, Lo1/u;

    new-instance v1, Ld1/c;

    iget-wide v2, v2, Lo1/u;->c:J

    invoke-direct {v1, v2, v3}, Ld1/c;-><init>(J)V

    invoke-interface {v8, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_7
    check-cast v2, Lo1/u;

    iput-object v15, v0, Lv/h3;->n:Ljava/lang/Object;

    iput-object v13, v0, Lv/h3;->b:Ljava/lang/Object;

    iput-object v5, v0, Lv/h3;->c:Ljava/lang/Object;

    iput-object v5, v0, Lv/h3;->d:Ld9/u;

    iput-wide v11, v0, Lv/h3;->e:J

    const/4 v3, 0x4

    iput v3, v0, Lv/h3;->f:I

    sget-object v3, Lv/k3;->a:Lv/p0;

    invoke-virtual {v15}, Lo1/h0;->g()Lu1/y2;

    move-result-object v3

    move-object/from16 v16, v7

    invoke-interface {v3}, Lu1/y2;->b()J

    move-result-wide v6

    new-instance v3, Lv/n2;

    invoke-direct {v3, v2, v5}, Lv/n2;-><init>(Lo1/u;Lu8/e;)V

    invoke-virtual {v15, v6, v7, v3, v0}, Lo1/h0;->i(JLv/n2;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v7, v13

    move-wide v12, v11

    move-object v11, v15

    :goto_6
    check-cast v2, Lo1/u;

    if-nez v2, :cond_9

    if-eqz v8, :cond_e

    iget-object v1, v7, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Lo1/u;

    iget-wide v1, v1, Lo1/u;->c:J

    new-instance v3, Ld1/c;

    invoke-direct {v3, v1, v2}, Ld1/c;-><init>(J)V

    invoke-interface {v8, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_9
    new-instance v3, Lv/c3;

    invoke-direct {v3, v10, v5}, Lv/c3;-><init>(Lv/l1;Lu8/e;)V

    const/4 v6, 0x0

    const/4 v14, 0x3

    invoke-static {v4, v5, v6, v3, v14}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    sget-object v3, Lv/k3;->a:Lv/p0;

    move-object/from16 v15, v16

    if-eq v15, v3, :cond_a

    new-instance v3, Lv/d3;

    invoke-direct {v3, v15, v10, v2, v5}, Lv/d3;-><init>(Lc9/f;Lv/l1;Lo1/u;Lu8/e;)V

    invoke-static {v4, v5, v6, v3, v14}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_a
    :try_start_4
    new-instance v3, Lv/g3;

    iget-object v6, v0, Lv/h3;->o:Lm9/d0;

    iget-object v15, v0, Lv/h3;->r:Lc9/c;

    iget-object v14, v0, Lv/h3;->s:Lc9/c;

    iget-object v5, v0, Lv/h3;->t:Lv/l1;

    const/16 v23, 0x0

    move-object/from16 v17, v3

    move-object/from16 v18, v6

    move-object/from16 v19, v15

    move-object/from16 v20, v14

    move-object/from16 v21, v7

    move-object/from16 v22, v5

    invoke-direct/range {v17 .. v23}, Lv/g3;-><init>(Lm9/d0;Lc9/c;Lc9/c;Ld9/u;Lv/l1;Lu8/e;)V

    iput-object v11, v0, Lv/h3;->n:Ljava/lang/Object;

    iput-object v7, v0, Lv/h3;->b:Ljava/lang/Object;

    iput-object v2, v0, Lv/h3;->c:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v0, Lv/h3;->f:I

    invoke-virtual {v11, v12, v13, v3, v0}, Lo1/h0;->h(JLc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catch Lo1/m; {:try_start_4 .. :try_end_4} :catch_2

    if-ne v2, v1, :cond_e

    return-object v1

    :catch_2
    if-eqz v8, :cond_b

    iget-object v3, v7, Ld9/u;->a:Ljava/lang/Object;

    check-cast v3, Lo1/u;

    iget-wide v5, v3, Lo1/u;->c:J

    new-instance v3, Ld1/c;

    invoke-direct {v3, v5, v6}, Ld1/c;-><init>(J)V

    invoke-interface {v8, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    if-eqz v9, :cond_c

    iget-wide v2, v2, Lo1/u;->c:J

    new-instance v5, Ld1/c;

    invoke-direct {v5, v2, v3}, Ld1/c;-><init>(J)V

    invoke-interface {v9, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    const/4 v2, 0x0

    iput-object v2, v0, Lv/h3;->n:Ljava/lang/Object;

    iput-object v2, v0, Lv/h3;->b:Ljava/lang/Object;

    iput-object v2, v0, Lv/h3;->c:Ljava/lang/Object;

    const/4 v3, 0x6

    iput v3, v0, Lv/h3;->f:I

    invoke-static {v11, v0}, Lv/k3;->a(Lo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_d

    return-object v1

    :cond_d
    :goto_7
    new-instance v1, Lv/v2;

    invoke-direct {v1, v10, v2}, Lv/v2;-><init>(Lv/l1;Lu8/e;)V

    const/4 v3, 0x0

    const/4 v5, 0x3

    invoke-static {v4, v2, v3, v1, v5}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_e
    :goto_8
    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
