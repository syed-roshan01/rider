.class public final Lv/h0;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:Lo1/u;

.field public c:Ld9/t;

.field public d:Lo1/h0;

.field public e:Lv/i1;

.field public f:Ld9/t;

.field public n:Lo1/u;

.field public o:F

.field public p:J

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lc9/c;

.field public final synthetic t:Lc9/e;

.field public final synthetic u:Lc9/a;

.field public final synthetic v:Lc9/a;


# direct methods
.method public constructor <init>(Lc9/c;Lc9/e;Lc9/a;Lc9/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/h0;->s:Lc9/c;

    iput-object p2, p0, Lv/h0;->t:Lc9/e;

    iput-object p3, p0, Lv/h0;->u:Lc9/a;

    iput-object p4, p0, Lv/h0;->v:Lc9/a;

    invoke-direct {p0, p5}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance v6, Lv/h0;

    iget-object v1, p0, Lv/h0;->s:Lc9/c;

    iget-object v2, p0, Lv/h0;->t:Lc9/e;

    iget-object v3, p0, Lv/h0;->u:Lc9/a;

    iget-object v4, p0, Lv/h0;->v:Lc9/a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv/h0;-><init>(Lc9/c;Lc9/e;Lc9/a;Lc9/a;Lu8/e;)V

    iput-object p1, v6, Lv/h0;->r:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/h0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/h0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/h0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/h0;->q:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v9, v0

    move-object/from16 v0, p1

    goto/16 :goto_d

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-wide v2, v0, Lv/h0;->p:J

    iget v8, v0, Lv/h0;->o:F

    iget-object v9, v0, Lv/h0;->n:Lo1/u;

    iget-object v10, v0, Lv/h0;->f:Ld9/t;

    iget-object v11, v0, Lv/h0;->e:Lv/i1;

    iget-object v12, v0, Lv/h0;->d:Lo1/h0;

    iget-object v13, v0, Lv/h0;->c:Ld9/t;

    iget-object v14, v0, Lv/h0;->b:Lo1/u;

    iget-object v15, v0, Lv/h0;->r:Ljava/lang/Object;

    check-cast v15, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v20, v12

    move-object v12, v0

    move-object v0, v11

    move-object/from16 v21, v14

    move v14, v8

    move-object/from16 v8, v21

    move-object/from16 v22, v15

    move-object v15, v10

    move-wide v10, v2

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    goto/16 :goto_a

    :cond_2
    iget-wide v2, v0, Lv/h0;->p:J

    iget v8, v0, Lv/h0;->o:F

    iget-object v9, v0, Lv/h0;->f:Ld9/t;

    iget-object v10, v0, Lv/h0;->e:Lv/i1;

    iget-object v11, v0, Lv/h0;->d:Lo1/h0;

    iget-object v12, v0, Lv/h0;->c:Ld9/t;

    iget-object v13, v0, Lv/h0;->b:Lo1/u;

    iget-object v14, v0, Lv/h0;->r:Ljava/lang/Object;

    check-cast v14, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    move-object v15, v9

    move-object v9, v12

    move-object v12, v0

    move-object/from16 v20, v14

    move v14, v8

    move-object v8, v13

    move-object v13, v10

    move-wide/from16 v21, v2

    move-object v2, v11

    move-wide/from16 v10, v21

    move-object/from16 v3, v20

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, Lv/h0;->r:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lv/h0;->r:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    iput-object v2, v0, Lv/h0;->r:Ljava/lang/Object;

    iput v3, v0, Lv/h0;->q:I

    invoke-static {v2, v0, v4}, Lv/k3;->c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_0
    check-cast v3, Lo1/u;

    new-instance v8, Ld9/t;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    sget-wide v9, Ld1/c;->b:J

    iput-wide v9, v8, Ld9/t;->a:J

    move-object v9, v0

    :goto_1
    iget-wide v10, v3, Lo1/u;->a:J

    sget-object v12, Lv/j0;->c:Lv/d0;

    iget-object v13, v2, Lo1/h0;->e:Lo1/j0;

    iget-object v13, v13, Lo1/j0;->w:Lo1/k;

    invoke-static {v13, v10, v11}, Lv/j0;->d(Lo1/k;J)Z

    move-result v13

    if-eqz v13, :cond_6

    move-object v0, v7

    goto/16 :goto_b

    :cond_6
    invoke-virtual {v2}, Lo1/h0;->g()Lu1/y2;

    move-result-object v13

    iget v14, v3, Lo1/u;->i:I

    invoke-static {v14, v4}, Lo1/s;->u(II)Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v13}, Lu1/y2;->e()F

    move-result v13

    sget v14, Lv/j0;->d:F

    mul-float/2addr v13, v14

    goto :goto_2

    :cond_7
    invoke-interface {v13}, Lu1/y2;->e()F

    move-result v13

    :goto_2
    new-instance v14, Ld9/t;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    iput-wide v10, v14, Ld9/t;->a:J

    sget-wide v10, Ld1/c;->b:J

    move-object v15, v14

    move v14, v13

    move-object v13, v12

    move-object v12, v9

    move-object v9, v8

    move-object v8, v3

    move-object v3, v2

    :goto_3
    iput-object v3, v12, Lv/h0;->r:Ljava/lang/Object;

    iput-object v8, v12, Lv/h0;->b:Lo1/u;

    iput-object v9, v12, Lv/h0;->c:Ld9/t;

    iput-object v2, v12, Lv/h0;->d:Lo1/h0;

    iput-object v13, v12, Lv/h0;->e:Lv/i1;

    iput-object v15, v12, Lv/h0;->f:Ld9/t;

    iput-object v7, v12, Lv/h0;->n:Lo1/u;

    iput v14, v12, Lv/h0;->o:F

    iput-wide v10, v12, Lv/h0;->p:J

    iput v4, v12, Lv/h0;->q:I

    sget-object v4, Lo1/l;->b:Lo1/l;

    invoke-virtual {v2, v4, v12}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    return-object v1

    :cond_8
    :goto_4
    check-cast v4, Lo1/k;

    iget-object v5, v4, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    const/16 v16, 0x0

    move/from16 v6, v16

    :goto_5
    if-ge v6, v7, :cond_a

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v0, v17

    check-cast v0, Lo1/u;

    move-object/from16 p1, v1

    iget-wide v0, v0, Lo1/u;->a:J

    move/from16 v19, v7

    move-object/from16 v18, v8

    iget-wide v7, v15, Ld9/t;->a:J

    invoke-static {v0, v1, v7, v8}, Lo1/t;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, v18

    move/from16 v7, v19

    goto :goto_5

    :cond_a
    move-object/from16 p1, v1

    move-object/from16 v18, v8

    const/16 v17, 0x0

    :goto_6
    move-object/from16 v0, v17

    check-cast v0, Lo1/u;

    if-nez v0, :cond_b

    :goto_7
    move-object/from16 v1, p1

    move-object v2, v3

    move-object v8, v9

    move-object v9, v12

    move-object/from16 v3, v18

    const/4 v0, 0x0

    const/4 v6, 0x3

    goto/16 :goto_b

    :cond_b
    invoke-virtual {v0}, Lo1/u;->b()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {v0}, Lm9/e0;->t(Lo1/u;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v0, v4, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v4, v16

    :goto_8
    if-ge v4, v1, :cond_e

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lo1/u;

    iget-boolean v6, v6, Lo1/u;->d:Z

    if-eqz v6, :cond_d

    goto :goto_9

    :cond_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_e
    const/4 v5, 0x0

    :goto_9
    check-cast v5, Lo1/u;

    if-nez v5, :cond_f

    goto :goto_7

    :cond_f
    iget-wide v0, v5, Lo1/u;->a:J

    iput-wide v0, v15, Ld9/t;->a:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, v18

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x0

    goto/16 :goto_3

    :cond_10
    iget-wide v4, v0, Lo1/u;->c:J

    iget-wide v6, v0, Lo1/u;->g:J

    invoke-static {v4, v5, v6, v7}, Ld1/c;->f(JJ)J

    move-result-wide v4

    invoke-static {v10, v11, v4, v5}, Ld1/c;->g(JJ)J

    move-result-wide v4

    check-cast v13, Lv/d0;

    invoke-virtual {v13, v4, v5}, Lv/d0;->a(J)F

    move-result v1

    cmpg-float v1, v1, v14

    if-gez v1, :cond_13

    sget-object v1, Lo1/l;->c:Lo1/l;

    iput-object v3, v12, Lv/h0;->r:Ljava/lang/Object;

    move-object/from16 v8, v18

    iput-object v8, v12, Lv/h0;->b:Lo1/u;

    iput-object v9, v12, Lv/h0;->c:Ld9/t;

    iput-object v2, v12, Lv/h0;->d:Lo1/h0;

    iput-object v13, v12, Lv/h0;->e:Lv/i1;

    iput-object v15, v12, Lv/h0;->f:Ld9/t;

    iput-object v0, v12, Lv/h0;->n:Lo1/u;

    iput v14, v12, Lv/h0;->o:F

    iput-wide v4, v12, Lv/h0;->p:J

    const/4 v6, 0x3

    iput v6, v12, Lv/h0;->q:I

    invoke-virtual {v2, v1, v12}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v7, p1

    if-ne v1, v7, :cond_11

    return-object v7

    :cond_11
    move-wide v10, v4

    move-object v1, v7

    move-object/from16 v20, v9

    move-object v9, v0

    move-object v0, v13

    move-object/from16 v13, v20

    :goto_a
    invoke-virtual {v9}, Lo1/u;->b()Z

    move-result v4

    if-eqz v4, :cond_12

    move-object v2, v3

    move-object v3, v8

    move-object v9, v12

    move-object v8, v13

    const/4 v0, 0x0

    goto :goto_b

    :cond_12
    move-object v9, v13

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v7, 0x0

    move-object v13, v0

    move-object/from16 v0, p0

    goto/16 :goto_3

    :cond_13
    move-object/from16 v7, p1

    move-object/from16 v8, v18

    const/4 v6, 0x3

    invoke-virtual {v13, v14, v4, v5}, Lv/d0;->b(FJ)J

    move-result-wide v4

    invoke-virtual {v0}, Lo1/u;->a()V

    iput-wide v4, v9, Ld9/t;->a:J

    invoke-virtual {v0}, Lo1/u;->b()Z

    move-result v1

    if-eqz v1, :cond_19

    move-object v2, v3

    move-object v1, v7

    move-object v3, v8

    move-object v8, v9

    move-object v9, v12

    :goto_b
    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lo1/u;->b()Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_c

    :cond_14
    move-object/from16 v0, p0

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_15
    :goto_c
    if-eqz v0, :cond_18

    new-instance v3, Ld1/c;

    iget-wide v4, v0, Lo1/u;->c:J

    invoke-direct {v3, v4, v5}, Ld1/c;-><init>(J)V

    iget-object v4, v9, Lv/h0;->s:Lc9/c;

    invoke-interface {v4, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, v8, Ld9/t;->a:J

    new-instance v5, Ld1/c;

    invoke-direct {v5, v3, v4}, Ld1/c;-><init>(J)V

    iget-object v3, v9, Lv/h0;->t:Lc9/e;

    invoke-interface {v3, v0, v5}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lq/w;

    const/16 v5, 0x9

    invoke-direct {v4, v3, v5}, Lq/w;-><init>(Ljava/lang/Object;I)V

    const/4 v5, 0x0

    iput-object v5, v9, Lv/h0;->r:Ljava/lang/Object;

    iput-object v5, v9, Lv/h0;->b:Lo1/u;

    iput-object v5, v9, Lv/h0;->c:Ld9/t;

    iput-object v5, v9, Lv/h0;->d:Lo1/h0;

    iput-object v5, v9, Lv/h0;->e:Lv/i1;

    iput-object v5, v9, Lv/h0;->f:Ld9/t;

    iput-object v5, v9, Lv/h0;->n:Lo1/u;

    const/4 v10, 0x4

    iput v10, v9, Lv/h0;->q:I

    iget-wide v5, v0, Lo1/u;->a:J

    invoke-static {v2, v5, v6, v4, v9}, Lv/j0;->c(Lo1/h0;JLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_16

    return-object v1

    :cond_16
    :goto_d
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, v9, Lv/h0;->u:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    goto :goto_e

    :cond_17
    iget-object v0, v9, Lv/h0;->v:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_18
    :goto_e
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :cond_19
    const/4 v5, 0x0

    const/4 v10, 0x4

    sget-wide v0, Ld1/c;->b:J

    const/4 v4, 0x2

    move-wide/from16 v20, v0

    move-object/from16 v0, p0

    move-object v1, v7

    move-object v7, v5

    move v5, v10

    move-wide/from16 v10, v20

    goto/16 :goto_3
.end method
