.class public final Lz/t;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lz/g0;

.field public final synthetic b:Z

.field public final synthetic c:Ly/t0;

.field public final synthetic d:Z

.field public final synthetic e:Lc9/a;

.field public final synthetic f:Ly/i;

.field public final synthetic n:Ly/g;

.field public final synthetic o:I

.field public final synthetic p:Ly0/b;

.field public final synthetic q:Ly0/c;


# direct methods
.method public constructor <init>(Lz/g0;ZLy/t0;ZLj9/e;Ly/i;Ly/g;ILy0/b;Ly0/c;)V
    .locals 0

    iput-object p1, p0, Lz/t;->a:Lz/g0;

    iput-boolean p2, p0, Lz/t;->b:Z

    iput-object p3, p0, Lz/t;->c:Ly/t0;

    iput-boolean p4, p0, Lz/t;->d:Z

    iput-object p5, p0, Lz/t;->e:Lc9/a;

    iput-object p6, p0, Lz/t;->f:Ly/i;

    iput-object p7, p0, Lz/t;->n:Ly/g;

    iput p8, p0, Lz/t;->o:I

    iput-object p9, p0, Lz/t;->p:Ly0/b;

    iput-object p10, p0, Lz/t;->q:Ly0/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    check-cast v0, La0/w;

    move-object/from16 v2, p2

    check-cast v2, Lm2/a;

    iget-wide v14, v2, Lm2/a;->a:J

    iget-object v13, v1, Lz/t;->a:Lz/g0;

    iget-boolean v2, v13, Lz/g0;->a:Z

    iget-object v12, v13, Lz/g0;->c:Lz/z;

    const/16 v18, 0x1

    if-nez v2, :cond_1

    move-object v2, v0

    check-cast v2, La0/x;

    iget-object v2, v2, La0/x;->b:Lr1/i1;

    invoke-interface {v2}, Lr1/q;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v27, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move/from16 v27, v18

    :goto_1
    sget-object v2, Lv/h1;->b:Lv/h1;

    sget-object v3, Lv/h1;->a:Lv/h1;

    iget-boolean v4, v1, Lz/t;->b:Z

    if-eqz v4, :cond_2

    move-object v2, v3

    :cond_2
    invoke-static {v14, v15, v2}, Landroidx/compose/foundation/a;->h(JLv/h1;)V

    iget-object v2, v1, Lz/t;->c:Ly/t0;

    if-eqz v4, :cond_3

    move-object v3, v0

    check-cast v3, La0/x;

    iget-object v5, v3, La0/x;->b:Lr1/i1;

    invoke-interface {v5}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v5

    invoke-interface {v2, v5}, Ly/t0;->a(Lm2/l;)F

    move-result v5

    iget-object v3, v3, La0/x;->b:Lr1/i1;

    invoke-interface {v3, v5}, Lm2/b;->J(F)I

    move-result v3

    goto :goto_2

    :cond_3
    move-object v3, v0

    check-cast v3, La0/x;

    iget-object v5, v3, La0/x;->b:Lr1/i1;

    invoke-interface {v5}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/a;->f(Ly/t0;Lm2/l;)F

    move-result v5

    iget-object v3, v3, La0/x;->b:Lr1/i1;

    invoke-interface {v3, v5}, Lm2/b;->J(F)I

    move-result v3

    :goto_2
    if-eqz v4, :cond_4

    move-object v5, v0

    check-cast v5, La0/x;

    iget-object v6, v5, La0/x;->b:Lr1/i1;

    invoke-interface {v6}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v6

    invoke-interface {v2, v6}, Ly/t0;->b(Lm2/l;)F

    move-result v6

    iget-object v5, v5, La0/x;->b:Lr1/i1;

    invoke-interface {v5, v6}, Lm2/b;->J(F)I

    move-result v5

    goto :goto_3

    :cond_4
    move-object v5, v0

    check-cast v5, La0/x;

    iget-object v6, v5, La0/x;->b:Lr1/i1;

    invoke-interface {v6}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/a;->e(Ly/t0;Lm2/l;)F

    move-result v6

    iget-object v5, v5, La0/x;->b:Lr1/i1;

    invoke-interface {v5, v6}, Lm2/b;->J(F)I

    move-result v5

    :goto_3
    invoke-interface {v2}, Ly/t0;->d()F

    move-result v6

    move-object v7, v0

    check-cast v7, La0/x;

    iget-object v8, v7, La0/x;->b:Lr1/i1;

    invoke-interface {v8, v6}, Lm2/b;->J(F)I

    move-result v6

    invoke-interface {v2}, Ly/t0;->c()F

    move-result v2

    iget-object v10, v7, La0/x;->b:Lr1/i1;

    invoke-interface {v10, v2}, Lm2/b;->J(F)I

    move-result v2

    add-int v9, v6, v2

    add-int v8, v3, v5

    if-eqz v4, :cond_5

    move v7, v9

    :goto_4
    move-object/from16 v16, v12

    goto :goto_5

    :cond_5
    move v7, v8

    goto :goto_4

    :goto_5
    iget-boolean v12, v1, Lz/t;->d:Z

    if-eqz v4, :cond_6

    if-nez v12, :cond_6

    move v5, v6

    goto :goto_6

    :cond_6
    if-eqz v4, :cond_7

    if-eqz v12, :cond_7

    move v5, v2

    goto :goto_6

    :cond_7
    if-nez v4, :cond_8

    if-nez v12, :cond_8

    move v5, v3

    :cond_8
    :goto_6
    sub-int v28, v7, v5

    neg-int v2, v8

    neg-int v7, v9

    move/from16 p2, v5

    move/from16 p1, v6

    invoke-static {v14, v15, v2, v7}, Lo1/s;->a0(JII)J

    move-result-wide v5

    iput-object v0, v13, Lz/g0;->g:Lm2/b;

    iget-object v2, v1, Lz/t;->e:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lz/m;

    iget-object v2, v7, Lz/m;->c:Lz/c;

    invoke-static {v5, v6}, Lm2/a;->i(J)I

    move-result v11

    move-object/from16 v19, v13

    invoke-static {v5, v6}, Lm2/a;->h(J)I

    move-result v13

    move-object/from16 v20, v0

    iget-object v0, v2, Lz/c;->a:Lm0/l1;

    invoke-virtual {v0, v11}, Lm0/u2;->f(I)V

    iget-object v0, v2, Lz/c;->b:Lm0/l1;

    invoke-virtual {v0, v13}, Lm0/u2;->f(I)V

    iget-object v0, v1, Lz/t;->n:Ly/g;

    const-string v21, "null verticalArrangement when isVertical == true"

    iget-object v13, v1, Lz/t;->f:Ly/i;

    if-eqz v4, :cond_a

    if-eqz v13, :cond_9

    invoke-interface {v13}, Ly/i;->a()F

    move-result v2

    goto :goto_7

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    if-eqz v0, :cond_74

    invoke-interface {v0}, Ly/g;->a()F

    move-result v2

    :goto_7
    invoke-interface {v10, v2}, Lm2/b;->J(F)I

    move-result v41

    iget-object v2, v7, Lz/m;->b:Lz/g;

    invoke-virtual {v2}, Lz/g;->f0()La0/q0;

    move-result-object v2

    iget v11, v2, La0/q0;->b:I

    if-eqz v4, :cond_b

    invoke-static {v14, v15}, Lm2/a;->h(J)I

    move-result v2

    sub-int/2addr v2, v9

    goto :goto_8

    :cond_b
    invoke-static {v14, v15}, Lm2/a;->i(J)I

    move-result v2

    sub-int/2addr v2, v8

    :goto_8
    if-eqz v12, :cond_c

    if-lez v2, :cond_d

    :cond_c
    move/from16 v4, p1

    goto :goto_c

    :cond_d
    if-eqz v4, :cond_e

    goto :goto_9

    :cond_e
    add-int/2addr v3, v2

    :goto_9
    if-eqz v4, :cond_f

    add-int v4, p1, v2

    goto :goto_a

    :cond_f
    move/from16 v4, p1

    :goto_a
    invoke-static {v3, v4}, Li1/b;->c(II)J

    move-result-wide v3

    :goto_b
    move-wide/from16 v22, v3

    goto :goto_d

    :goto_c
    invoke-static {v3, v4}, Li1/b;->c(II)J

    move-result-wide v3

    goto :goto_b

    :goto_d
    new-instance v3, Lz/s;

    iget-boolean v4, v1, Lz/t;->b:Z

    move-object/from16 v24, v10

    iget-object v10, v1, Lz/t;->p:Ly0/b;

    move/from16 v25, v12

    iget-object v12, v1, Lz/t;->q:Ly0/c;

    move-object/from16 v26, v13

    iget-boolean v13, v1, Lz/t;->d:Z

    move-object/from16 v29, v0

    iget-object v0, v1, Lz/t;->a:Lz/g0;

    move/from16 v42, v2

    move-object v2, v3

    move-object v1, v3

    move/from16 v30, v4

    move-wide v3, v5

    move-wide/from16 v51, v5

    move/from16 v6, p2

    move-wide/from16 p1, v51

    move/from16 v5, v30

    move/from16 v30, v6

    move-object v6, v7

    move-object/from16 v43, v7

    move-object/from16 v7, v20

    move/from16 v31, v8

    move v8, v11

    move/from16 v32, v9

    move/from16 v9, v41

    move-object/from16 v44, v24

    move/from16 v45, v11

    move-object v11, v12

    move-object/from16 v46, v16

    move/from16 v24, v25

    move v12, v13

    move-object/from16 v47, v19

    move-object/from16 v48, v26

    move/from16 v13, v30

    move-wide/from16 v25, v14

    move/from16 v14, v28

    move-wide/from16 v15, v22

    move-object/from16 v17, v0

    invoke-direct/range {v2 .. v17}, Lz/s;-><init>(JZLz/m;La0/w;IILy0/b;Ly0/c;ZIIJLz/g0;)V

    iget-wide v2, v1, Lz/s;->c:J

    move-object/from16 v0, v47

    iput-wide v2, v0, Lz/g0;->r:J

    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, Lw0/i;->j()Lw0/i;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v4, v46

    :try_start_1
    iget-object v5, v4, Lz/z;->a:Lm0/l1;

    invoke-virtual {v5}, Lm0/u2;->d()I

    move-result v5

    iget-object v6, v4, Lz/z;->d:Ljava/lang/Object;

    move-object/from16 v7, v43

    invoke-static {v7, v6, v5}, Lf6/a;->F(La0/s;Ljava/lang/Object;I)I

    move-result v9

    if-eq v5, v9, :cond_10

    iget-object v6, v4, Lz/z;->a:Lm0/l1;

    invoke-virtual {v6, v9}, Lm0/u2;->f(I)V

    iget-object v6, v4, Lz/z;->e:La0/y;

    invoke-virtual {v6, v5}, La0/y;->b(I)V

    goto :goto_e

    :catchall_0
    move-exception v0

    goto/16 :goto_4c

    :cond_10
    :goto_e
    iget-object v4, v4, Lz/z;->b:Lm0/l1;

    invoke-virtual {v4}, Lm0/u2;->d()I

    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, Lw0/i;->c()V

    iget-object v2, v0, Lz/g0;->s:La0/a0;

    iget-object v3, v0, Lz/g0;->q:La0/j;

    invoke-static {v7, v2, v3}, Lf6/a;->p(La0/s;La0/a0;La0/j;)Ljava/util/List;

    move-result-object v10

    invoke-interface/range {v44 .. v44}, Lr1/q;->q()Z

    move-result v2

    if-nez v2, :cond_12

    if-nez v27, :cond_11

    goto :goto_10

    :cond_11
    iget-object v2, v0, Lz/g0;->y:Lt/o;

    iget-object v2, v2, Lt/o;->b:Lm0/n1;

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    :goto_f
    move-object/from16 v12, p0

    move-object v13, v1

    move v1, v2

    goto :goto_11

    :cond_12
    :goto_10
    iget v2, v0, Lz/g0;->f:F

    goto :goto_f

    :goto_11
    iget-boolean v14, v12, Lz/t;->b:Z

    sget-object v37, Lr8/r;->a:Lr8/r;

    iget-object v15, v0, Lz/g0;->p:Lz/j;

    invoke-interface/range {v44 .. v44}, Lr1/q;->q()Z

    move-result v8

    iget-object v7, v0, Lz/g0;->b:Lz/w;

    iget-object v2, v0, Lz/g0;->x:Lm9/d0;

    if-eqz v2, :cond_73

    new-instance v6, Lz/r;

    const/16 v16, 0x0

    move-object v2, v6

    move-object/from16 v3, v20

    move-wide/from16 v4, v25

    move-object/from16 v49, v6

    move/from16 v6, v31

    move/from16 v17, v11

    move-object v11, v7

    move/from16 v7, v32

    move/from16 v31, v8

    move/from16 v8, v16

    invoke-direct/range {v2 .. v8}, Lz/r;-><init>(La0/w;JIII)V

    move/from16 v2, v30

    if-ltz v2, :cond_72

    if-ltz v28, :cond_71

    move/from16 v8, v45

    if-gtz v8, :cond_13

    invoke-static/range {p1 .. p2}, Lm2/a;->k(J)I

    move-result v1

    invoke-static/range {p1 .. p2}, Lm2/a;->j(J)I

    move-result v3

    const/16 v20, 0x0

    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v15

    move/from16 v21, v1

    move/from16 v22, v3

    move-object/from16 v24, v13

    move/from16 v25, v14

    move/from16 v26, v31

    invoke-virtual/range {v19 .. v27}, Lz/j;->a(IIILjava/util/ArrayList;Lz/s;ZZZ)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lz/v;->b:Lz/v;

    move-object/from16 v7, v49

    invoke-virtual {v7, v1, v3, v4}, Lz/r;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Lr1/k0;

    neg-int v1, v2

    move/from16 v6, v42

    add-int v39, v6, v28

    new-instance v2, Lz/w;

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v40, 0x0

    move-object/from16 v29, v2

    move/from16 v38, v1

    invoke-direct/range {v29 .. v41}, Lz/w;-><init>(Lz/x;IZFLr1/k0;FZLjava/util/List;IIII)V

    move-object v4, v0

    goto/16 :goto_4b

    :cond_13
    move/from16 v6, v42

    move-object/from16 v7, v49

    if-lt v9, v8, :cond_14

    add-int/lit8 v9, v8, -0x1

    const/16 v17, 0x0

    :cond_14
    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v3

    sub-int v4, v17, v3

    if-nez v9, :cond_15

    if-gez v4, :cond_15

    add-int/2addr v3, v4

    const/4 v4, 0x0

    :cond_15
    new-instance v5, Lr8/l;

    invoke-direct {v5}, Lr8/l;-><init>()V

    move/from16 v16, v9

    neg-int v9, v2

    move-object/from16 v49, v7

    if-gez v41, :cond_16

    move/from16 v17, v41

    goto :goto_12

    :cond_16
    const/16 v17, 0x0

    :goto_12
    add-int v7, v9, v17

    add-int/2addr v4, v7

    move/from16 v17, v9

    const/4 v9, 0x0

    :goto_13
    if-gez v4, :cond_17

    if-lez v16, :cond_17

    move-object/from16 v47, v0

    add-int/lit8 v0, v16, -0x1

    move-object/from16 v19, v15

    invoke-virtual {v13, v0}, Lz/s;->a(I)Lz/x;

    move-result-object v15

    move/from16 v16, v0

    const/4 v0, 0x0

    invoke-virtual {v5, v0, v15}, Lr8/l;->add(ILjava/lang/Object;)V

    iget v0, v15, Lz/x;->p:I

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    iget v0, v15, Lz/x;->o:I

    add-int/2addr v4, v0

    move-object/from16 v15, v19

    move-object/from16 v0, v47

    goto :goto_13

    :cond_17
    move-object/from16 v47, v0

    move-object/from16 v19, v15

    if-ge v4, v7, :cond_18

    add-int/2addr v3, v4

    move v4, v7

    :cond_18
    sub-int/2addr v4, v7

    add-int v39, v6, v28

    if-gez v39, :cond_19

    const/4 v0, 0x0

    goto :goto_14

    :cond_19
    move/from16 v0, v39

    :goto_14
    neg-int v15, v4

    move/from16 v23, v4

    move/from16 v26, v9

    move v4, v15

    move/from16 v25, v16

    const/4 v15, 0x0

    const/16 v22, 0x0

    :goto_15
    iget v9, v5, Lr8/l;->c:I

    if-ge v15, v9, :cond_1b

    if-lt v4, v0, :cond_1a

    invoke-virtual {v5, v15}, Lr8/l;->i(I)Ljava/lang/Object;

    move/from16 v22, v18

    goto :goto_15

    :cond_1a
    add-int/lit8 v25, v25, 0x1

    invoke-virtual {v5, v15}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lz/x;

    iget v9, v9, Lz/x;->o:I

    add-int/2addr v4, v9

    add-int/lit8 v15, v15, 0x1

    goto :goto_15

    :cond_1b
    move/from16 v36, v22

    move/from16 v15, v25

    move/from16 v9, v26

    :goto_16
    if-ge v15, v8, :cond_1d

    if-lt v4, v0, :cond_1c

    if-lez v4, :cond_1c

    invoke-virtual {v5}, Lr8/l;->isEmpty()Z

    move-result v22

    if-eqz v22, :cond_1d

    :cond_1c
    move/from16 v22, v0

    goto :goto_17

    :cond_1d
    move/from16 v25, v14

    goto :goto_19

    :goto_17
    invoke-virtual {v13, v15}, Lz/s;->a(I)Lz/x;

    move-result-object v0

    move/from16 v25, v14

    iget v14, v0, Lz/x;->o:I

    add-int/2addr v4, v14

    if-gt v4, v7, :cond_1e

    move/from16 v26, v4

    add-int/lit8 v4, v8, -0x1

    if-eq v15, v4, :cond_1f

    add-int/lit8 v0, v15, 0x1

    sub-int v23, v23, v14

    move/from16 v16, v0

    move/from16 v36, v18

    goto :goto_18

    :cond_1e
    move/from16 v26, v4

    :cond_1f
    iget v4, v0, Lz/x;->p:I

    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v5, v0}, Lr8/l;->addLast(Ljava/lang/Object;)V

    move v9, v4

    :goto_18
    add-int/lit8 v15, v15, 0x1

    move/from16 v0, v22

    move/from16 v14, v25

    move/from16 v4, v26

    goto :goto_16

    :goto_19
    if-ge v4, v6, :cond_22

    sub-int v0, v6, v4

    sub-int v23, v23, v0

    add-int/2addr v4, v0

    move/from16 v7, v23

    :goto_1a
    if-ge v7, v2, :cond_20

    if-lez v16, :cond_20

    add-int/lit8 v14, v16, -0x1

    move/from16 v28, v15

    invoke-virtual {v13, v14}, Lz/s;->a(I)Lz/x;

    move-result-object v15

    move/from16 v16, v14

    const/4 v14, 0x0

    invoke-virtual {v5, v14, v15}, Lr8/l;->add(ILjava/lang/Object;)V

    iget v14, v15, Lz/x;->p:I

    invoke-static {v9, v14}, Ljava/lang/Math;->max(II)I

    move-result v9

    iget v14, v15, Lz/x;->o:I

    add-int/2addr v7, v14

    move/from16 v15, v28

    goto :goto_1a

    :cond_20
    move/from16 v28, v15

    add-int/2addr v0, v3

    if-gez v7, :cond_21

    add-int/2addr v0, v7

    add-int/2addr v4, v7

    const/4 v7, 0x0

    :cond_21
    :goto_1b
    move/from16 v51, v9

    move v9, v4

    move/from16 v4, v51

    goto :goto_1c

    :cond_22
    move/from16 v28, v15

    move v0, v3

    move/from16 v7, v23

    goto :goto_1b

    :goto_1c
    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v14

    if-gez v14, :cond_23

    const/4 v14, -0x1

    goto :goto_1d

    :cond_23
    if-lez v14, :cond_24

    move/from16 v14, v18

    goto :goto_1d

    :cond_24
    const/4 v14, 0x0

    :goto_1d
    if-gez v0, :cond_25

    const/4 v15, -0x1

    goto :goto_1e

    :cond_25
    if-lez v0, :cond_26

    move/from16 v15, v18

    goto :goto_1e

    :cond_26
    const/4 v15, 0x0

    :goto_1e
    if-ne v14, v15, :cond_27

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    move-result v14

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v15

    if-lt v14, v15, :cond_27

    int-to-float v14, v0

    goto :goto_1f

    :cond_27
    move v14, v1

    :goto_1f
    sub-float/2addr v1, v14

    move/from16 v15, v31

    if-eqz v15, :cond_28

    if-le v0, v3, :cond_28

    const/16 v23, 0x0

    cmpg-float v26, v1, v23

    if-gtz v26, :cond_28

    sub-int/2addr v0, v3

    int-to-float v0, v0

    add-float/2addr v0, v1

    move/from16 v35, v0

    goto :goto_20

    :cond_28
    const/16 v35, 0x0

    :goto_20
    if-ltz v7, :cond_70

    neg-int v0, v7

    invoke-virtual {v5}, Lr8/l;->first()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/x;

    if-gtz v2, :cond_2a

    if-gez v41, :cond_29

    goto :goto_21

    :cond_29
    move/from16 v31, v7

    goto :goto_23

    :cond_2a
    :goto_21
    iget v2, v5, Lr8/l;->c:I

    const/4 v3, 0x0

    :goto_22
    if-ge v3, v2, :cond_2b

    invoke-virtual {v5, v3}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v30, v1

    move-object/from16 v1, v26

    check-cast v1, Lz/x;

    iget v1, v1, Lz/x;->o:I

    if-eqz v7, :cond_2c

    if-gt v1, v7, :cond_2c

    move/from16 v26, v2

    invoke-static {v5}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v2

    if-eq v3, v2, :cond_2c

    sub-int/2addr v7, v1

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v5, v3}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/x;

    move/from16 v2, v26

    goto :goto_22

    :cond_2b
    move-object/from16 v30, v1

    :cond_2c
    move/from16 v31, v7

    move-object/from16 v1, v30

    :goto_23
    iget v2, v12, Lz/t;->o:I

    sub-int v3, v16, v2

    const/4 v7, 0x0

    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v7, v16, -0x1

    if-gt v3, v7, :cond_2e

    const/16 v16, 0x0

    :goto_24
    if-nez v16, :cond_2d

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    :cond_2d
    move-object/from16 v12, v16

    move/from16 v16, v4

    invoke-virtual {v13, v7}, Lz/s;->a(I)Lz/x;

    move-result-object v4

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v7, v3, :cond_2f

    add-int/lit8 v7, v7, -0x1

    move/from16 v4, v16

    move-object/from16 v16, v12

    goto :goto_24

    :cond_2e
    move/from16 v16, v4

    const/4 v12, 0x0

    :cond_2f
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, -0x1

    add-int/2addr v4, v7

    if-ltz v4, :cond_33

    :goto_25
    add-int/lit8 v7, v4, -0x1

    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ge v4, v3, :cond_31

    if-nez v12, :cond_30

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_30
    invoke-virtual {v13, v4}, Lz/s;->a(I)Lz/x;

    move-result-object v4

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_31
    if-gez v7, :cond_32

    goto :goto_26

    :cond_32
    move v4, v7

    goto :goto_25

    :cond_33
    :goto_26
    if-nez v12, :cond_34

    move-object/from16 v12, v37

    :cond_34
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v4, v16

    const/4 v7, 0x0

    :goto_27
    if-ge v7, v3, :cond_35

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v26, v3

    move-object/from16 v3, v16

    check-cast v3, Lz/x;

    iget v3, v3, Lz/x;->p:I

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    add-int/lit8 v7, v7, 0x1

    move/from16 v3, v26

    goto :goto_27

    :cond_35
    invoke-static {v5}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/x;

    iget v3, v3, Lz/x;->a:I

    add-int/2addr v3, v2

    add-int/lit8 v2, v8, -0x1

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v5}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz/x;

    iget v7, v7, Lz/x;->a:I

    add-int/lit8 v7, v7, 0x1

    if-gt v7, v3, :cond_37

    const/16 v16, 0x0

    :goto_28
    if-nez v16, :cond_36

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    :cond_36
    move/from16 v26, v4

    move-object/from16 v4, v16

    move/from16 v16, v0

    invoke-virtual {v13, v7}, Lz/s;->a(I)Lz/x;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v7, v3, :cond_38

    add-int/lit8 v7, v7, 0x1

    move/from16 v0, v16

    move-object/from16 v16, v4

    move/from16 v4, v26

    goto :goto_28

    :cond_37
    move/from16 v16, v0

    move/from16 v26, v4

    const/4 v4, 0x0

    :cond_38
    if-eqz v15, :cond_4b

    if-eqz v11, :cond_4b

    iget-object v0, v11, Lz/w;->g:Ljava/util/List;

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    if-eqz v7, :cond_4b

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    move-object/from16 v22, v4

    :goto_29
    const/4 v4, -0x1

    if-ge v4, v7, :cond_3b

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v32

    check-cast v32, Lz/k;

    move-object/from16 v4, v32

    check-cast v4, Lz/x;

    iget v4, v4, Lz/x;->a:I

    if-le v4, v3, :cond_3a

    if-eqz v7, :cond_39

    add-int/lit8 v4, v7, -0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz/k;

    check-cast v4, Lz/x;

    iget v4, v4, Lz/x;->a:I

    if-gt v4, v3, :cond_3a

    :cond_39
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz/k;

    goto :goto_2a

    :cond_3a
    add-int/lit8 v7, v7, -0x1

    goto :goto_29

    :cond_3b
    const/4 v4, 0x0

    :goto_2a
    invoke-static {v0}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/k;

    if-eqz v4, :cond_41

    check-cast v4, Lz/x;

    move-object v7, v0

    check-cast v7, Lz/x;

    iget v7, v7, Lz/x;->a:I

    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v4, v4, Lz/x;->a:I

    if-gt v4, v2, :cond_41

    move v7, v4

    move-object/from16 v4, v22

    :goto_2b
    if-eqz v4, :cond_3e

    move/from16 v32, v15

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v15

    move/from16 v33, v9

    const/4 v9, 0x0

    :goto_2c
    if-ge v9, v15, :cond_3d

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    move/from16 v34, v15

    move-object/from16 v15, v22

    check-cast v15, Lz/x;

    iget v15, v15, Lz/x;->a:I

    if-ne v15, v7, :cond_3c

    goto :goto_2d

    :cond_3c
    add-int/lit8 v9, v9, 0x1

    move/from16 v15, v34

    goto :goto_2c

    :cond_3d
    const/16 v22, 0x0

    :goto_2d
    check-cast v22, Lz/x;

    goto :goto_2e

    :cond_3e
    move/from16 v33, v9

    move/from16 v32, v15

    const/16 v22, 0x0

    :goto_2e
    if-nez v22, :cond_40

    if-nez v4, :cond_3f

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_3f
    invoke-virtual {v13, v7}, Lz/s;->a(I)Lz/x;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_40
    if-eq v7, v2, :cond_42

    add-int/lit8 v7, v7, 0x1

    move/from16 v15, v32

    move/from16 v9, v33

    goto :goto_2b

    :cond_41
    move/from16 v33, v9

    move/from16 v32, v15

    move-object/from16 v4, v22

    :cond_42
    check-cast v0, Lz/x;

    iget v2, v0, Lz/x;->m:I

    iget v7, v11, Lz/w;->i:I

    sub-int/2addr v7, v2

    iget v2, v0, Lz/x;->n:I

    sub-int/2addr v7, v2

    int-to-float v2, v7

    sub-float/2addr v2, v14

    const/4 v7, 0x0

    cmpl-float v7, v2, v7

    if-lez v7, :cond_4c

    iget v0, v0, Lz/x;->a:I

    add-int/lit8 v0, v0, 0x1

    const/4 v11, 0x0

    :goto_2f
    if-ge v0, v8, :cond_4c

    int-to-float v7, v11

    cmpg-float v7, v7, v2

    if-gez v7, :cond_4c

    if-gt v0, v3, :cond_45

    invoke-virtual {v5}, Lr8/l;->e()I

    move-result v7

    const/4 v9, 0x0

    :goto_30
    if-ge v9, v7, :cond_44

    invoke-virtual {v5, v9}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v15

    move/from16 v22, v2

    move-object v2, v15

    check-cast v2, Lz/x;

    iget v2, v2, Lz/x;->a:I

    if-ne v2, v0, :cond_43

    goto :goto_31

    :cond_43
    add-int/lit8 v9, v9, 0x1

    move/from16 v2, v22

    goto :goto_30

    :cond_44
    move/from16 v22, v2

    const/4 v15, 0x0

    :goto_31
    check-cast v15, Lz/x;

    goto :goto_34

    :cond_45
    move/from16 v22, v2

    if-eqz v4, :cond_48

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_32
    if-ge v7, v2, :cond_47

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, Lz/x;

    iget v15, v15, Lz/x;->a:I

    if-ne v15, v0, :cond_46

    goto :goto_33

    :cond_46
    add-int/lit8 v7, v7, 0x1

    goto :goto_32

    :cond_47
    const/4 v9, 0x0

    :goto_33
    move-object v15, v9

    check-cast v15, Lz/x;

    goto :goto_34

    :cond_48
    const/4 v15, 0x0

    :goto_34
    if-eqz v15, :cond_49

    add-int/lit8 v0, v0, 0x1

    iget v2, v15, Lz/x;->o:I

    :goto_35
    add-int/2addr v11, v2

    move/from16 v2, v22

    goto :goto_2f

    :cond_49
    if-nez v4, :cond_4a

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_4a
    invoke-virtual {v13, v0}, Lz/s;->a(I)Lz/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/x;

    iget v2, v2, Lz/x;->o:I

    goto :goto_35

    :cond_4b
    move-object/from16 v22, v4

    move/from16 v33, v9

    move/from16 v32, v15

    move-object/from16 v4, v22

    :cond_4c
    if-eqz v4, :cond_4d

    invoke-static {v4}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/x;

    iget v0, v0, Lz/x;->a:I

    if-le v0, v3, :cond_4d

    invoke-static {v4}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/x;

    iget v3, v0, Lz/x;->a:I

    :cond_4d
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v11, 0x0

    :goto_36
    if-ge v11, v0, :cond_50

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-le v2, v3, :cond_4f

    if-nez v4, :cond_4e

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_4e
    invoke-virtual {v13, v2}, Lz/s;->a(I)Lz/x;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4f
    add-int/lit8 v11, v11, 0x1

    goto :goto_36

    :cond_50
    if-nez v4, :cond_51

    move-object/from16 v4, v37

    :cond_51
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v2, v26

    const/4 v11, 0x0

    :goto_37
    if-ge v11, v0, :cond_52

    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/x;

    iget v3, v3, Lz/x;->p:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v11, v11, 0x1

    goto :goto_37

    :cond_52
    invoke-virtual {v5}, Lr8/l;->first()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_53

    move/from16 v11, v18

    goto :goto_38

    :cond_53
    const/4 v11, 0x0

    :goto_38
    move-wide/from16 v9, p1

    if-eqz v25, :cond_54

    move v0, v2

    goto :goto_39

    :cond_54
    move/from16 v0, v33

    :goto_39
    invoke-static {v0, v9, v10}, Lo1/s;->q(IJ)I

    move-result v0

    if-eqz v25, :cond_55

    move/from16 v2, v33

    :cond_55
    invoke-static {v2, v9, v10}, Lo1/s;->p(IJ)I

    move-result v9

    if-eqz v25, :cond_56

    move v10, v9

    goto :goto_3a

    :cond_56
    move v10, v0

    :goto_3a
    invoke-static {v10, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    move/from16 v15, v33

    if-ge v15, v2, :cond_57

    move/from16 v2, v18

    goto :goto_3b

    :cond_57
    const/4 v2, 0x0

    :goto_3b
    if-eqz v2, :cond_59

    if-nez v16, :cond_58

    goto :goto_3c

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "non-zero itemsScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    :goto_3c
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lr8/l;->e()I

    move-result v3

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v22

    add-int v22, v22, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    add-int v3, v3, v22

    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v2, :cond_66

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_65

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_65

    invoke-virtual {v5}, Lr8/l;->e()I

    move-result v12

    new-array v4, v12, [I

    const/4 v2, 0x0

    :goto_3d
    if-ge v2, v12, :cond_5b

    if-nez v24, :cond_5a

    move v3, v2

    goto :goto_3e

    :cond_5a
    sub-int v3, v12, v2

    add-int/lit8 v3, v3, -0x1

    :goto_3e
    invoke-virtual {v5, v3}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/x;

    iget v3, v3, Lz/x;->n:I

    aput v3, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3d

    :cond_5b
    new-array v3, v12, [I

    const/4 v2, 0x0

    :goto_3f
    if-ge v2, v12, :cond_5c

    const/16 v16, 0x0

    aput v16, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3f

    :cond_5c
    if-eqz v25, :cond_5e

    move-object/from16 v2, v48

    if-eqz v2, :cond_5d

    move-object/from16 p1, v5

    move-object/from16 v5, v20

    invoke-interface {v2, v5, v10, v4, v3}, Ly/i;->c(Lm2/b;I[I[I)V

    move-object/from16 v33, v1

    move-object/from16 v20, v3

    move/from16 v42, v6

    move-object/from16 v50, v49

    move-object/from16 v1, p1

    move/from16 p1, v11

    move-object v11, v7

    goto :goto_40

    :cond_5d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5e
    move-object/from16 p1, v5

    move-object/from16 v5, v20

    if-eqz v29, :cond_64

    sget-object v16, Lm2/l;->a:Lm2/l;

    move-object/from16 v2, v29

    move-object/from16 v20, v3

    move-object v3, v5

    move-object v5, v4

    move v4, v10

    move-object/from16 v33, v1

    move-object/from16 v1, p1

    move/from16 p1, v11

    move v11, v6

    move-object/from16 v6, v16

    move/from16 v42, v11

    move-object/from16 v50, v49

    move-object v11, v7

    move-object/from16 v7, v20

    invoke-interface/range {v2 .. v7}, Ly/g;->b(Lm2/b;I[ILm2/l;[I)V

    :goto_40
    invoke-static/range {v20 .. v20}, Lb9/b;->S([I)Li9/g;

    move-result-object v2

    if-nez v24, :cond_5f

    goto :goto_41

    :cond_5f
    iget v3, v2, Li9/e;->c:I

    neg-int v3, v3

    new-instance v4, Li9/e;

    iget v5, v2, Li9/e;->b:I

    iget v2, v2, Li9/e;->a:I

    invoke-direct {v4, v5, v2, v3}, Li9/e;-><init>(III)V

    move-object v2, v4

    :goto_41
    iget v3, v2, Li9/e;->a:I

    iget v4, v2, Li9/e;->b:I

    iget v2, v2, Li9/e;->c:I

    if-lez v2, :cond_60

    if-le v3, v4, :cond_61

    :cond_60
    if-gez v2, :cond_69

    if-gt v4, v3, :cond_69

    :cond_61
    :goto_42
    aget v5, v20, v3

    if-nez v24, :cond_62

    move v6, v3

    goto :goto_43

    :cond_62
    sub-int v6, v12, v3

    add-int/lit8 v6, v6, -0x1

    :goto_43
    invoke-virtual {v1, v6}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz/x;

    if-eqz v24, :cond_63

    sub-int v5, v10, v5

    iget v7, v6, Lz/x;->n:I

    sub-int/2addr v5, v7

    :cond_63
    invoke-virtual {v6, v5, v0, v9}, Lz/x;->c(III)V

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v3, v4, :cond_69

    add-int/2addr v3, v2

    goto :goto_42

    :cond_64
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null horizontalArrangement when isVertical == false"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_65
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no extra items"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_66
    move-object/from16 v33, v1

    move-object v1, v5

    move/from16 v42, v6

    move/from16 p1, v11

    move-object/from16 v50, v49

    move-object v11, v7

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v5, v16

    const/4 v3, 0x0

    :goto_44
    if-ge v3, v2, :cond_67

    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz/x;

    iget v7, v6, Lz/x;->o:I

    sub-int/2addr v5, v7

    invoke-virtual {v6, v5, v0, v9}, Lz/x;->c(III)V

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_44

    :cond_67
    invoke-virtual {v1}, Lr8/l;->e()I

    move-result v2

    move/from16 v3, v16

    const/4 v5, 0x0

    :goto_45
    if-ge v5, v2, :cond_68

    invoke-virtual {v1, v5}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz/x;

    invoke-virtual {v6, v3, v0, v9}, Lz/x;->c(III)V

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v6, v6, Lz/x;->o:I

    add-int/2addr v3, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_45

    :cond_68
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_46
    if-ge v5, v2, :cond_69

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz/x;

    invoke-virtual {v6, v3, v0, v9}, Lz/x;->c(III)V

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v6, v6, Lz/x;->o:I

    add-int/2addr v3, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_46

    :cond_69
    float-to-int v2, v14

    move/from16 v20, v2

    move/from16 v21, v0

    move/from16 v22, v9

    move-object/from16 v23, v11

    move-object/from16 v24, v13

    move/from16 v26, v32

    invoke-virtual/range {v19 .. v27}, Lz/j;->a(IIILjava/util/ArrayList;Lz/s;ZZZ)V

    move/from16 v2, v28

    if-lt v2, v8, :cond_6b

    move/from16 v2, v42

    if-le v15, v2, :cond_6a

    goto :goto_47

    :cond_6a
    const/16 v18, 0x0

    :cond_6b
    :goto_47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lu/z;

    move-object/from16 v4, v47

    iget-object v5, v4, Lz/g0;->v:Lm0/g1;

    move/from16 v6, v32

    const/4 v7, 0x0

    invoke-direct {v3, v11, v7, v6, v5}, Lu/z;-><init>(Ljava/util/ArrayList;Lz/x;ZLm0/g1;)V

    move-object/from16 v5, v50

    invoke-virtual {v5, v0, v2, v3}, Lz/r;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v34, v0

    check-cast v34, Lr1/k0;

    if-eqz p1, :cond_6c

    move-object/from16 v37, v11

    goto :goto_4a

    :cond_6c
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_48
    if-ge v3, v2, :cond_6f

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lz/x;

    iget v7, v6, Lz/x;->a:I

    invoke-virtual {v1}, Lr8/l;->first()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lz/x;

    iget v9, v9, Lz/x;->a:I

    if-lt v7, v9, :cond_6e

    invoke-virtual {v1}, Lr8/l;->last()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz/x;

    iget v7, v7, Lz/x;->a:I

    iget v6, v6, Lz/x;->a:I

    if-le v6, v7, :cond_6d

    goto :goto_49

    :cond_6d
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6e
    :goto_49
    add-int/lit8 v3, v3, 0x1

    goto :goto_48

    :cond_6f
    move-object/from16 v37, v0

    :goto_4a
    new-instance v2, Lz/w;

    move-object/from16 v29, v2

    move-object/from16 v30, v33

    move/from16 v32, v18

    move/from16 v33, v14

    move/from16 v38, v17

    move/from16 v40, v8

    invoke-direct/range {v29 .. v41}, Lz/w;-><init>(Lz/x;IZFLr1/k0;FZLjava/util/List;IIII)V

    :goto_4b
    invoke-interface/range {v44 .. v44}, Lr1/q;->q()Z

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v2, v0, v1}, Lz/g0;->f(Lz/w;ZZ)V

    return-object v2

    :cond_70
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative currentFirstItemScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_71
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid afterContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_72
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid beforeContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_73
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "coroutineScope should be not null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_4c
    :try_start_3
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-virtual {v2}, Lw0/i;->c()V

    throw v0

    :cond_74
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null horizontalAlignment when isVertical == false"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
