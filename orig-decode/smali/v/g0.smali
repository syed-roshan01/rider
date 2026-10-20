.class public final Lv/g0;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:Lo1/k;

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ld9/u;

.field public final synthetic n:Ld9/u;


# direct methods
.method public constructor <init>(Ld9/u;Ld9/u;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/g0;->f:Ld9/u;

    iput-object p2, p0, Lv/g0;->n:Ld9/u;

    invoke-direct {p0, p3}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lv/g0;

    iget-object v1, p0, Lv/g0;->f:Ld9/u;

    iget-object v2, p0, Lv/g0;->n:Ld9/u;

    invoke-direct {v0, v1, v2, p2}, Lv/g0;-><init>(Ld9/u;Ld9/u;Lu8/e;)V

    iput-object p1, v0, Lv/g0;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/g0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/g0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/g0;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, v0, Lv/g0;->c:I

    iget-object v7, v0, Lv/g0;->b:Lo1/k;

    iget-object v8, v0, Lv/g0;->e:Ljava/lang/Object;

    check-cast v8, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    move-object v6, v0

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lv/g0;->c:I

    iget-object v7, v0, Lv/g0;->e:Ljava/lang/Object;

    check-cast v7, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    move-object v8, v7

    move-object v7, v0

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lv/g0;->e:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    move-object v8, v0

    move-object v7, v2

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_12

    sget-object v9, Lo1/l;->b:Lo1/l;

    iput-object v7, v8, Lv/g0;->e:Ljava/lang/Object;

    iput-object v5, v8, Lv/g0;->b:Lo1/k;

    iput v2, v8, Lv/g0;->c:I

    iput v3, v8, Lv/g0;->d:I

    invoke-virtual {v7, v9, v8}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_3

    return-object v1

    :cond_3
    move-object/from16 v16, v8

    move-object v8, v7

    move-object/from16 v7, v16

    :goto_1
    check-cast v9, Lo1/k;

    iget-object v10, v9, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v11, :cond_5

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo1/u;

    invoke-static {v13}, Lm9/e0;->t(Lo1/u;)Z

    move-result v13

    if-nez v13, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_5
    move v2, v3

    :goto_3
    iget-object v10, v9, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v11, :cond_8

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo1/u;

    invoke-virtual {v13}, Lo1/u;->b()Z

    move-result v14

    if-nez v14, :cond_7

    iget-object v14, v8, Lo1/h0;->e:Lo1/j0;

    iget-wide v14, v14, Lo1/j0;->A:J

    invoke-virtual {v8}, Lo1/h0;->f()J

    move-result-wide v5

    invoke-static {v13, v14, v15, v5, v6}, Lm9/e0;->E(Lo1/u;JJ)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v12, v12, 0x1

    const/4 v5, 0x0

    goto :goto_4

    :cond_7
    :goto_5
    move v2, v3

    :cond_8
    sget-object v5, Lo1/l;->c:Lo1/l;

    iput-object v8, v7, Lv/g0;->e:Ljava/lang/Object;

    iput-object v9, v7, Lv/g0;->b:Lo1/k;

    iput v2, v7, Lv/g0;->c:I

    iput v4, v7, Lv/g0;->d:I

    invoke-virtual {v8, v5, v7}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_9

    return-object v1

    :cond_9
    move-object v6, v7

    move-object v7, v9

    :goto_6
    check-cast v5, Lo1/k;

    iget-object v5, v5, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v9, :cond_b

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo1/u;

    invoke-virtual {v11}, Lo1/u;->b()Z

    move-result v11

    if-eqz v11, :cond_a

    move v2, v3

    goto :goto_8

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_b
    :goto_8
    iget-object v5, v6, Lv/g0;->f:Ld9/u;

    iget-object v9, v5, Ld9/u;->a:Ljava/lang/Object;

    check-cast v9, Lo1/u;

    iget-wide v9, v9, Lo1/u;->a:J

    invoke-static {v7, v9, v10}, Lv/j0;->d(Lo1/k;J)Z

    move-result v9

    iget-object v10, v6, Lv/g0;->n:Ld9/u;

    iget-object v7, v7, Lo1/k;->a:Ljava/util/List;

    if-eqz v9, :cond_f

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v9, :cond_d

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lo1/u;

    iget-boolean v13, v13, Lo1/u;->d:Z

    if-eqz v13, :cond_c

    goto :goto_a

    :cond_c
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_d
    const/4 v12, 0x0

    :goto_a
    check-cast v12, Lo1/u;

    if-eqz v12, :cond_e

    iput-object v12, v5, Ld9/u;->a:Ljava/lang/Object;

    iput-object v12, v10, Ld9/u;->a:Ljava/lang/Object;

    goto :goto_e

    :cond_e
    move v2, v3

    move-object v7, v8

    :goto_b
    const/4 v5, 0x0

    move-object v8, v6

    goto/16 :goto_0

    :cond_f
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_c
    if-ge v11, v9, :cond_11

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lo1/u;

    iget-wide v13, v13, Lo1/u;->a:J

    iget-object v15, v5, Ld9/u;->a:Ljava/lang/Object;

    check-cast v15, Lo1/u;

    iget-wide v3, v15, Lo1/u;->a:J

    invoke-static {v13, v14, v3, v4}, Lo1/t;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_d

    :cond_10
    add-int/lit8 v11, v11, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x2

    goto :goto_c

    :cond_11
    const/4 v12, 0x0

    :goto_d
    iput-object v12, v10, Ld9/u;->a:Ljava/lang/Object;

    :goto_e
    move-object v7, v8

    const/4 v3, 0x1

    const/4 v4, 0x2

    goto :goto_b

    :cond_12
    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
