.class public final Lb0/w;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lv/h1;

.field public final synthetic b:Ly/t0;

.field public final synthetic c:Z

.field public final synthetic d:Lb0/h0;

.field public final synthetic e:F

.field public final synthetic f:Lb0/j;

.field public final synthetic n:Lc9/a;

.field public final synthetic o:Lc9/a;

.field public final synthetic p:Ly0/c;

.field public final synthetic q:Ly0/b;

.field public final synthetic r:I

.field public final synthetic s:Lb0/l0;


# direct methods
.method public constructor <init>(Lv/h1;Ly/t0;ZLb0/h0;FLb0/j;Lj9/e;Lc9/a;Ly0/c;Ly0/b;I)V
    .locals 1

    sget-object v0, Lb0/o0;->d:Lb0/l0;

    iput-object p1, p0, Lb0/w;->a:Lv/h1;

    iput-object p2, p0, Lb0/w;->b:Ly/t0;

    iput-boolean p3, p0, Lb0/w;->c:Z

    iput-object p4, p0, Lb0/w;->d:Lb0/h0;

    iput p5, p0, Lb0/w;->e:F

    iput-object p6, p0, Lb0/w;->f:Lb0/j;

    iput-object p7, p0, Lb0/w;->n:Lc9/a;

    iput-object p8, p0, Lb0/w;->o:Lc9/a;

    iput-object p9, p0, Lb0/w;->p:Ly0/c;

    iput-object p10, p0, Lb0/w;->q:Ly0/b;

    iput p11, p0, Lb0/w;->r:I

    iput-object v0, p0, Lb0/w;->s:Lb0/l0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 52

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    check-cast v0, La0/w;

    move-object/from16 v2, p2

    check-cast v2, Lm2/a;

    iget-wide v4, v2, Lm2/a;->a:J

    sget-object v15, Lv/h1;->a:Lv/h1;

    iget-object v2, v1, Lb0/w;->a:Lv/h1;

    if-ne v2, v15, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    move-object v6, v15

    goto :goto_1

    :cond_1
    sget-object v6, Lv/h1;->b:Lv/h1;

    :goto_1
    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/a;->h(JLv/h1;)V

    iget-object v6, v1, Lb0/w;->b:Ly/t0;

    if-eqz v3, :cond_2

    move-object v7, v0

    check-cast v7, La0/x;

    iget-object v8, v7, La0/x;->b:Lr1/i1;

    invoke-interface {v8}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v8

    invoke-interface {v6, v8}, Ly/t0;->a(Lm2/l;)F

    move-result v8

    iget-object v7, v7, La0/x;->b:Lr1/i1;

    invoke-interface {v7, v8}, Lm2/b;->J(F)I

    move-result v7

    goto :goto_2

    :cond_2
    move-object v7, v0

    check-cast v7, La0/x;

    iget-object v8, v7, La0/x;->b:Lr1/i1;

    invoke-interface {v8}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v8

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/a;->f(Ly/t0;Lm2/l;)F

    move-result v8

    iget-object v7, v7, La0/x;->b:Lr1/i1;

    invoke-interface {v7, v8}, Lm2/b;->J(F)I

    move-result v7

    :goto_2
    if-eqz v3, :cond_3

    move-object v8, v0

    check-cast v8, La0/x;

    iget-object v9, v8, La0/x;->b:Lr1/i1;

    invoke-interface {v9}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v9

    invoke-interface {v6, v9}, Ly/t0;->b(Lm2/l;)F

    move-result v9

    iget-object v8, v8, La0/x;->b:Lr1/i1;

    invoke-interface {v8, v9}, Lm2/b;->J(F)I

    move-result v8

    goto :goto_3

    :cond_3
    move-object v8, v0

    check-cast v8, La0/x;

    iget-object v9, v8, La0/x;->b:Lr1/i1;

    invoke-interface {v9}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v9

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/a;->e(Ly/t0;Lm2/l;)F

    move-result v9

    iget-object v8, v8, La0/x;->b:Lr1/i1;

    invoke-interface {v8, v9}, Lm2/b;->J(F)I

    move-result v8

    :goto_3
    invoke-interface {v6}, Ly/t0;->d()F

    move-result v9

    move-object v10, v0

    check-cast v10, La0/x;

    iget-object v11, v10, La0/x;->b:Lr1/i1;

    invoke-interface {v11, v9}, Lm2/b;->J(F)I

    move-result v9

    invoke-interface {v6}, Ly/t0;->c()F

    move-result v6

    iget-object v12, v10, La0/x;->b:Lr1/i1;

    invoke-interface {v12, v6}, Lm2/b;->J(F)I

    move-result v6

    add-int v10, v9, v6

    add-int v11, v7, v8

    if-eqz v3, :cond_4

    move/from16 v16, v10

    goto :goto_4

    :cond_4
    move/from16 v16, v11

    :goto_4
    iget-boolean v13, v1, Lb0/w;->c:Z

    if-eqz v3, :cond_5

    if-nez v13, :cond_5

    move v8, v9

    goto :goto_5

    :cond_5
    if-eqz v3, :cond_6

    if-eqz v13, :cond_6

    move v8, v6

    goto :goto_5

    :cond_6
    if-nez v3, :cond_7

    if-nez v13, :cond_7

    move v8, v7

    :cond_7
    :goto_5
    sub-int v21, v16, v8

    neg-int v6, v11

    neg-int v14, v10

    move/from16 v17, v8

    move/from16 v16, v9

    invoke-static {v4, v5, v6, v14}, Lo1/s;->a0(JII)J

    move-result-wide v8

    iget-object v14, v1, Lb0/w;->d:Lb0/h0;

    iput-object v0, v14, Lb0/h0;->q:Lm2/b;

    iget-object v6, v14, Lb0/h0;->e:Lb0/a0;

    move-object/from16 v18, v0

    iget v0, v1, Lb0/w;->e:F

    invoke-interface {v12, v0}, Lm2/b;->J(F)I

    move-result v0

    if-eqz v3, :cond_8

    invoke-static {v4, v5}, Lm2/a;->h(J)I

    move-result v19

    sub-int v19, v19, v10

    :goto_6
    move-object/from16 v20, v12

    move/from16 v12, v19

    goto :goto_7

    :cond_8
    invoke-static {v4, v5}, Lm2/a;->i(J)I

    move-result v19

    sub-int v19, v19, v11

    goto :goto_6

    :goto_7
    if-eqz v13, :cond_9

    if-lez v12, :cond_a

    :cond_9
    move/from16 v3, v16

    goto :goto_a

    :cond_a
    if-eqz v3, :cond_b

    goto :goto_8

    :cond_b
    add-int/2addr v7, v12

    :goto_8
    if-eqz v3, :cond_c

    add-int v3, v16, v12

    goto :goto_9

    :cond_c
    move/from16 v3, v16

    :goto_9
    invoke-static {v7, v3}, Li1/b;->c(II)J

    move-result-wide v22

    goto :goto_b

    :goto_a
    invoke-static {v7, v3}, Li1/b;->c(II)J

    move-result-wide v22

    :goto_b
    iget-object v3, v1, Lb0/w;->f:Lb0/j;

    check-cast v3, Lb0/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne v2, v15, :cond_d

    invoke-static {v8, v9}, Lm2/a;->i(J)I

    move-result v3

    goto :goto_c

    :cond_d
    move v3, v12

    :goto_c
    if-eq v2, v15, :cond_e

    invoke-static {v8, v9}, Lm2/a;->h(J)I

    move-result v2

    goto :goto_d

    :cond_e
    move v2, v12

    :goto_d
    const/4 v13, 0x5

    invoke-static {v3, v2, v13}, Lo1/s;->b(III)J

    move-result-wide v2

    iput-wide v2, v14, Lb0/h0;->z:J

    iget-object v2, v1, Lb0/w;->n:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lb0/t;

    add-int v3, v12, v0

    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, Lw0/i;->j()Lw0/i;

    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v13, v6, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v13}, Lm0/u2;->d()I

    move-result v13

    move-wide/from16 v24, v8

    iget-object v8, v6, Lb0/a0;->e:Ljava/lang/Object;

    invoke-static {v7, v8, v13}, Lf6/a;->F(La0/s;Ljava/lang/Object;I)I

    move-result v9

    if-eq v13, v9, :cond_f

    iget-object v8, v6, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v8, v9}, Lm0/u2;->f(I)V

    iget-object v6, v6, Lb0/a0;->f:La0/y;

    invoke-virtual {v6, v13}, La0/y;->b(I)V

    :cond_f
    invoke-static {v3, v14}, Ld9/i;->m(ILb0/h0;)I

    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static/range {v16 .. v16}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v2}, Lw0/i;->c()V

    iget-object v2, v14, Lb0/h0;->A:La0/a0;

    iget-object v6, v14, Lb0/h0;->v:La0/j;

    invoke-static {v7, v2, v6}, Lf6/a;->p(La0/s;La0/a0;La0/j;)Ljava/util/List;

    move-result-object v8

    iget-object v2, v1, Lb0/w;->o:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget-object v2, v1, Lb0/w;->a:Lv/h1;

    move-object/from16 v16, v8

    iget-object v8, v1, Lb0/w;->p:Ly0/c;

    move-object/from16 v26, v8

    iget-object v8, v1, Lb0/w;->q:Ly0/b;

    move-object/from16 v27, v8

    iget-boolean v8, v1, Lb0/w;->c:Z

    move/from16 v28, v8

    iget v8, v1, Lb0/w;->r:I

    move/from16 v29, v8

    new-instance v8, Lz/r;

    const/16 v30, 0x1

    move-object/from16 v31, v2

    move-object v2, v8

    move/from16 v32, v3

    move-object/from16 v3, v18

    move/from16 v33, v6

    move v6, v11

    move-object/from16 v34, v7

    move v7, v10

    move-object v1, v8

    move-object/from16 v10, v16

    move/from16 v11, v17

    move-object/from16 v16, v26

    move-object/from16 v17, v27

    move/from16 v26, v28

    move/from16 v27, v29

    move/from16 v8, v30

    invoke-direct/range {v2 .. v8}, Lz/r;-><init>(La0/w;JIII)V

    if-ltz v11, :cond_58

    if-ltz v21, :cond_57

    if-gez v32, :cond_10

    const/4 v7, 0x0

    goto :goto_e

    :cond_10
    move/from16 v7, v32

    :goto_e
    sget-object v28, Lr8/r;->a:Lr8/r;

    move/from16 v8, v33

    if-gtz v8, :cond_11

    neg-int v2, v11

    add-int v3, v12, v21

    invoke-static/range {v24 .. v25}, Lm2/a;->k(J)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {v24 .. v25}, Lm2/a;->j(J)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, Lb0/u;->b:Lb0/u;

    invoke-virtual {v1, v4, v5, v6}, Lz/r;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr1/k0;

    new-instance v4, Lb0/x;

    const/16 v26, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v17, v4

    move-object/from16 v18, v28

    move/from16 v19, v12

    move/from16 v20, v0

    move-object/from16 v22, v31

    move/from16 v23, v2

    move/from16 v24, v3

    move/from16 v25, v27

    move-object/from16 v27, v5

    move/from16 v28, v6

    move-object/from16 v31, v1

    invoke-direct/range {v17 .. v32}, Lb0/x;-><init>(Ljava/util/List;IIILv/h1;IIILb0/g;Lb0/g;FIZLr1/k0;Z)V

    move-object/from16 v5, p0

    move-object v13, v14

    :goto_f
    const/4 v0, 0x0

    goto/16 :goto_43

    :cond_11
    move-object/from16 v6, v31

    if-ne v6, v15, :cond_12

    invoke-static/range {v24 .. v25}, Lm2/a;->i(J)I

    move-result v2

    goto :goto_10

    :cond_12
    move v2, v12

    :goto_10
    if-eq v6, v15, :cond_13

    invoke-static/range {v24 .. v25}, Lm2/a;->h(J)I

    move-result v3

    :goto_11
    const/4 v4, 0x5

    goto :goto_12

    :cond_13
    move v3, v12

    goto :goto_11

    :goto_12
    invoke-static {v2, v3, v4}, Lo1/s;->b(III)J

    move-result-wide v29

    :goto_13
    if-lez v9, :cond_14

    if-lez v13, :cond_14

    add-int/lit8 v9, v9, -0x1

    sub-int/2addr v13, v7

    goto :goto_13

    :cond_14
    mul-int/lit8 v13, v13, -0x1

    if-lt v9, v8, :cond_15

    add-int/lit8 v9, v8, -0x1

    const/4 v13, 0x0

    :cond_15
    new-instance v4, Lr8/l;

    invoke-direct {v4}, Lr8/l;-><init>()V

    neg-int v5, v11

    if-gez v0, :cond_16

    move v2, v0

    goto :goto_14

    :cond_16
    const/4 v2, 0x0

    :goto_14
    add-int v3, v5, v2

    add-int/2addr v13, v3

    const/4 v2, 0x0

    :goto_15
    if-gez v13, :cond_17

    if-lez v9, :cond_17

    add-int/lit8 v19, v9, -0x1

    invoke-interface/range {v20 .. v20}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v31

    move v9, v2

    move-object/from16 v2, v18

    move-object/from16 v33, v1

    move v1, v3

    move/from16 v3, v19

    move/from16 v36, v5

    move-object/from16 v35, v15

    move-object v15, v4

    move-wide/from16 v4, v29

    move-object/from16 v37, v6

    move-object/from16 v6, v34

    move/from16 v38, v0

    move v0, v7

    move/from16 v39, v8

    move-wide/from16 v7, v22

    move/from16 v40, v1

    move v1, v9

    move-object/from16 v9, v37

    move-object/from16 v41, v10

    move-object/from16 v10, v17

    move/from16 v42, v11

    move-object/from16 v11, v16

    move/from16 v43, v12

    move-object/from16 v12, v31

    move/from16 v44, v13

    move/from16 v13, v26

    move/from16 p1, v0

    move-object/from16 v45, v14

    const/4 v0, 0x0

    move/from16 v14, v43

    invoke-static/range {v2 .. v14}, Lo7/d0;->y(La0/w;IJLb0/t;JLv/h1;Ly0/b;Ly0/c;Lm2/l;ZI)Lb0/g;

    move-result-object v2

    invoke-virtual {v15, v0, v2}, Lr8/l;->add(ILjava/lang/Object;)V

    iget v2, v2, Lb0/g;->k:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move/from16 v13, v44

    add-int v13, v13, p1

    move/from16 v7, p1

    move-object v4, v15

    move/from16 v9, v19

    move-object/from16 v1, v33

    move-object/from16 v15, v35

    move/from16 v5, v36

    move-object/from16 v6, v37

    move/from16 v0, v38

    move/from16 v8, v39

    move/from16 v3, v40

    move-object/from16 v10, v41

    move/from16 v11, v42

    move/from16 v12, v43

    move-object/from16 v14, v45

    goto :goto_15

    :cond_17
    move/from16 v38, v0

    move-object/from16 v33, v1

    move v1, v2

    move/from16 v36, v5

    move-object/from16 v37, v6

    move/from16 p1, v7

    move/from16 v39, v8

    move-object/from16 v41, v10

    move/from16 v42, v11

    move/from16 v43, v12

    move-object/from16 v45, v14

    move-object/from16 v35, v15

    const/4 v0, 0x0

    move-object v15, v4

    move v14, v3

    if-ge v13, v14, :cond_18

    move v3, v14

    goto :goto_16

    :cond_18
    move v3, v13

    :goto_16
    sub-int/2addr v3, v14

    move/from16 v13, v43

    add-int v31, v13, v21

    if-gez v31, :cond_19

    move v12, v0

    goto :goto_17

    :cond_19
    move/from16 v12, v31

    :goto_17
    neg-int v2, v3

    move v4, v0

    move v5, v4

    move v6, v9

    :goto_18
    iget v7, v15, Lr8/l;->c:I

    if-ge v4, v7, :cond_1b

    if-lt v2, v12, :cond_1a

    invoke-virtual {v15, v4}, Lr8/l;->i(I)Ljava/lang/Object;

    const/4 v5, 0x1

    goto :goto_18

    :cond_1a
    add-int/lit8 v6, v6, 0x1

    add-int v2, v2, p1

    add-int/lit8 v4, v4, 0x1

    goto :goto_18

    :cond_1b
    move v11, v1

    move v1, v2

    move/from16 v40, v5

    move v10, v6

    move/from16 v19, v9

    move/from16 v9, v39

    move/from16 v39, v3

    :goto_19
    if-ge v10, v9, :cond_1c

    if-lt v1, v12, :cond_1d

    if-lez v1, :cond_1d

    invoke-virtual {v15}, Lr8/l;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_1a

    :cond_1c
    move v0, v9

    move v4, v11

    move-object v14, v15

    move v15, v10

    goto/16 :goto_1d

    :cond_1d
    :goto_1a
    invoke-interface/range {v20 .. v20}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v43

    move-object/from16 v2, v18

    move v3, v10

    move-wide/from16 v4, v29

    move-object/from16 v6, v34

    move-wide/from16 v7, v22

    move v0, v9

    move-object/from16 v9, v37

    move-object/from16 v44, v15

    move v15, v10

    move-object/from16 v10, v17

    move/from16 v46, v11

    move-object/from16 v11, v16

    move/from16 v47, v12

    move-object/from16 v12, v43

    move/from16 v43, v13

    move/from16 v13, v26

    move/from16 v48, v14

    move/from16 v14, v43

    invoke-static/range {v2 .. v14}, Lo7/d0;->y(La0/w;IJLb0/t;JLv/h1;Ly0/b;Ly0/c;Lm2/l;ZI)Lb0/g;

    move-result-object v2

    add-int/lit8 v6, v0, -0x1

    if-ne v15, v6, :cond_1e

    move/from16 v12, v43

    goto :goto_1b

    :cond_1e
    move/from16 v12, p1

    :goto_1b
    add-int/2addr v1, v12

    move/from16 v5, v48

    if-gt v1, v5, :cond_1f

    if-eq v15, v6, :cond_1f

    add-int/lit8 v10, v15, 0x1

    sub-int v39, v39, p1

    move/from16 v19, v10

    move-object/from16 v14, v44

    move/from16 v11, v46

    const/16 v40, 0x1

    goto :goto_1c

    :cond_1f
    iget v3, v2, Lb0/g;->k:I

    move/from16 v4, v46

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    move-object/from16 v14, v44

    invoke-virtual {v14, v2}, Lr8/l;->addLast(Ljava/lang/Object;)V

    move v11, v3

    :goto_1c
    add-int/lit8 v10, v15, 0x1

    move v9, v0

    move-object v15, v14

    move/from16 v13, v43

    move/from16 v12, v47

    const/4 v0, 0x0

    move v14, v5

    goto :goto_19

    :goto_1d
    if-ge v1, v13, :cond_22

    sub-int v12, v13, v1

    sub-int v39, v39, v12

    add-int/2addr v1, v12

    move v12, v4

    move/from16 v11, v39

    move/from16 v10, v42

    :goto_1e
    if-ge v11, v10, :cond_20

    if-lez v19, :cond_20

    add-int/lit8 v19, v19, -0x1

    invoke-interface/range {v20 .. v20}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v39

    move-object/from16 v2, v18

    move/from16 v3, v19

    move-wide/from16 v4, v29

    move-object/from16 v6, v34

    move-wide/from16 v7, v22

    move-object/from16 v9, v37

    move/from16 v42, v10

    move-object/from16 v10, v17

    move/from16 v43, v11

    move-object/from16 v11, v16

    move/from16 v44, v15

    move v15, v12

    move-object/from16 v12, v39

    move/from16 v46, v13

    move/from16 v13, v26

    move/from16 v47, v0

    move-object v0, v14

    move/from16 v14, v46

    invoke-static/range {v2 .. v14}, Lo7/d0;->y(La0/w;IJLb0/t;JLv/h1;Ly0/b;Ly0/c;Lm2/l;ZI)Lb0/g;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lr8/l;->add(ILjava/lang/Object;)V

    iget v2, v2, Lb0/g;->k:I

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int v11, v43, p1

    move-object v14, v0

    move/from16 v10, v42

    move/from16 v15, v44

    move/from16 v13, v46

    move/from16 v0, v47

    goto :goto_1e

    :cond_20
    move/from16 v47, v0

    move/from16 v42, v10

    move/from16 v43, v11

    move/from16 v46, v13

    move-object v0, v14

    move/from16 v44, v15

    move v15, v12

    if-gez v43, :cond_21

    add-int v1, v1, v43

    const/4 v14, 0x0

    goto :goto_1f

    :cond_21
    move/from16 v14, v43

    goto :goto_1f

    :cond_22
    move/from16 v47, v0

    move/from16 v46, v13

    move-object v0, v14

    move/from16 v44, v15

    move v15, v4

    move/from16 v14, v39

    :goto_1f
    if-ltz v14, :cond_56

    neg-int v13, v14

    invoke-virtual {v0}, Lr8/l;->first()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb0/g;

    if-gtz v42, :cond_24

    if-gez v38, :cond_23

    goto :goto_20

    :cond_23
    move/from16 v12, p1

    move/from16 v39, v14

    move-object v14, v2

    goto :goto_22

    :cond_24
    :goto_20
    iget v3, v0, Lr8/l;->c:I

    move v4, v14

    const/4 v14, 0x0

    :goto_21
    if-ge v14, v3, :cond_25

    if-eqz v4, :cond_25

    move/from16 v12, p1

    if-gt v12, v4, :cond_26

    invoke-static {v0}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v5

    if-eq v14, v5, :cond_26

    sub-int/2addr v4, v12

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v0, v14}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb0/g;

    move/from16 p1, v12

    goto :goto_21

    :cond_25
    move/from16 v12, p1

    :cond_26
    move-object v14, v2

    move/from16 v39, v4

    :goto_22
    new-instance v11, Lb0/v;

    const/16 v42, 0x1

    move-object v2, v11

    move-object/from16 v3, v18

    move-wide/from16 v4, v29

    move-object/from16 v6, v34

    move-wide/from16 v7, v22

    move-object/from16 v9, v37

    move-object/from16 v10, v17

    move-object/from16 v49, v11

    move-object/from16 v11, v16

    move/from16 v50, v12

    move/from16 v12, v26

    move/from16 p1, v15

    move v15, v13

    move/from16 v13, v46

    move/from16 v43, v15

    move-object v15, v14

    move/from16 v14, v42

    invoke-direct/range {v2 .. v14}, Lb0/v;-><init>(La0/w;JLb0/t;JLv/h1;Ly0/b;Ly0/c;ZII)V

    sub-int v2, v19, v27

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v14, 0x1

    add-int/lit8 v3, v19, -0x1

    const/4 v13, 0x0

    if-gt v2, v3, :cond_28

    move-object v4, v13

    :goto_23
    if-nez v4, :cond_27

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v6, v49

    invoke-virtual {v6, v5}, Lb0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v3, v2, :cond_29

    add-int/lit8 v3, v3, -0x1

    move-object/from16 v49, v6

    goto :goto_23

    :cond_28
    move-object/from16 v6, v49

    move-object v4, v13

    :cond_29
    invoke-interface/range {v41 .. v41}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_24
    if-ge v5, v3, :cond_2c

    move-object/from16 v12, v41

    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-ge v7, v2, :cond_2b

    if-nez v4, :cond_2a

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_2a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Lb0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2b
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v41, v12

    goto :goto_24

    :cond_2c
    move-object/from16 v12, v41

    if-nez v4, :cond_2d

    move-object/from16 v11, v28

    goto :goto_25

    :cond_2d
    move-object v11, v4

    :goto_25
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v10, p1

    const/4 v3, 0x0

    :goto_26
    if-ge v3, v2, :cond_2e

    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb0/g;

    iget v4, v4, Lb0/g;->k:I

    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v10

    add-int/lit8 v3, v3, 0x1

    goto :goto_26

    :cond_2e
    invoke-virtual {v0}, Lr8/l;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb0/g;

    iget v9, v2, Lb0/g;->a:I

    new-instance v7, Lb0/v;

    const/16 v19, 0x0

    move-object v2, v7

    move-object/from16 v3, v18

    move-wide/from16 v4, v29

    move-object/from16 v6, v34

    move-object/from16 v51, v7

    move-wide/from16 v7, v22

    move/from16 v22, v9

    move-object/from16 v9, v37

    move/from16 v23, v10

    move-object/from16 v10, v17

    move-object/from16 p1, v11

    move-object/from16 v11, v16

    move-object/from16 v16, v12

    move/from16 v12, v26

    move/from16 v13, v46

    move/from16 v17, v1

    move v1, v14

    move/from16 v14, v19

    invoke-direct/range {v2 .. v14}, Lb0/v;-><init>(La0/w;JLb0/t;JLv/h1;Ly0/b;Ly0/c;ZII)V

    add-int v9, v22, v27

    add-int/lit8 v6, v47, -0x1

    invoke-static {v9, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/lit8 v9, v22, 0x1

    if-gt v9, v2, :cond_30

    const/4 v13, 0x0

    :goto_27
    if-nez v13, :cond_2f

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v13, v3

    :cond_2f
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v4, v51

    invoke-virtual {v4, v3}, Lb0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v9, v2, :cond_31

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v51, v4

    goto :goto_27

    :cond_30
    move-object/from16 v4, v51

    const/4 v13, 0x0

    :cond_31
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v3

    const/4 v14, 0x0

    :goto_28
    if-ge v14, v3, :cond_34

    move-object/from16 v5, v16

    invoke-interface {v5, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    add-int/lit8 v7, v2, 0x1

    move/from16 v8, v47

    if-gt v7, v6, :cond_33

    if-ge v6, v8, :cond_33

    if-nez v13, :cond_32

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :cond_32
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v6}, Lb0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_33
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v16, v5

    move/from16 v47, v8

    goto :goto_28

    :cond_34
    move/from16 v8, v47

    if-nez v13, :cond_35

    move-object/from16 v13, v28

    :cond_35
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v10, v23

    const/4 v14, 0x0

    :goto_29
    if-ge v14, v2, :cond_36

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb0/g;

    iget v3, v3, Lb0/g;->k:I

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v10

    add-int/lit8 v14, v14, 0x1

    goto :goto_29

    :cond_36
    invoke-virtual {v0}, Lr8/l;->first()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v15, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_37

    move v14, v1

    move-object/from16 v2, v35

    move-object/from16 v9, v37

    goto :goto_2a

    :cond_37
    move-object/from16 v2, v35

    move-object/from16 v9, v37

    const/4 v14, 0x0

    :goto_2a
    if-ne v9, v2, :cond_38

    move v5, v10

    :goto_2b
    move-wide/from16 v3, v24

    goto :goto_2c

    :cond_38
    move/from16 v5, v17

    goto :goto_2b

    :goto_2c
    invoke-static {v5, v3, v4}, Lo1/s;->q(IJ)I

    move-result v11

    if-ne v9, v2, :cond_39

    move/from16 v10, v17

    :cond_39
    invoke-static {v10, v3, v4}, Lo1/s;->p(IJ)I

    move-result v10

    if-ne v9, v2, :cond_3a

    move v7, v10

    :goto_2d
    move/from16 v12, v46

    goto :goto_2e

    :cond_3a
    move v7, v11

    goto :goto_2d

    :goto_2e
    invoke-static {v7, v12}, Ljava/lang/Math;->min(II)I

    move-result v3

    move/from16 v6, v17

    if-ge v6, v3, :cond_3b

    move v3, v1

    goto :goto_2f

    :cond_3b
    const/4 v3, 0x0

    :goto_2f
    if-eqz v3, :cond_3c

    if-nez v43, :cond_3d

    :cond_3c
    move/from16 v4, v43

    goto :goto_30

    :cond_3d
    const-string v0, "non-zero pagesScrollOffset="

    move/from16 v4, v43

    invoke-static {v0, v4}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_30
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lr8/l;->e()I

    move-result v16

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v17

    add-int v17, v17, v16

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v16

    add-int v1, v16, v17

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v3, :cond_48

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_47

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_47

    invoke-virtual {v0}, Lr8/l;->e()I

    move-result v1

    new-array v13, v1, [I

    const/4 v3, 0x0

    :goto_31
    if-ge v3, v1, :cond_3e

    aput v12, v13, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    :cond_3e
    new-array v4, v1, [I

    const/4 v3, 0x0

    :goto_32
    if-ge v3, v1, :cond_3f

    move-object/from16 v16, v5

    const/4 v5, 0x0

    aput v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v5, v16

    goto :goto_32

    :cond_3f
    move-object/from16 v16, v5

    move-object/from16 v3, v20

    move/from16 v5, v38

    invoke-interface {v3, v5}, Lm2/b;->o0(I)F

    move-result v3

    move-object/from16 v17, v4

    new-instance v4, Ly/h;

    move/from16 v38, v5

    move-object/from16 v28, v15

    const/4 v5, 0x0

    const/4 v15, 0x0

    invoke-direct {v4, v3, v5, v15}, Ly/h;-><init>(FZLy/j;)V

    sget-object v19, Lm2/l;->a:Lm2/l;

    if-ne v9, v2, :cond_40

    move-object v2, v4

    move-object/from16 v3, v18

    move v4, v7

    move-object/from16 v15, v16

    move/from16 v16, v38

    move-object v5, v13

    move v13, v6

    move-object/from16 v6, v19

    move/from16 v20, v7

    move-object/from16 v7, v17

    invoke-virtual/range {v2 .. v7}, Ly/h;->b(Lm2/b;I[ILm2/l;[I)V

    goto :goto_33

    :cond_40
    move/from16 v20, v7

    move-object/from16 v15, v16

    move/from16 v16, v38

    move v7, v6

    move-object v2, v4

    move-object/from16 v3, v18

    move/from16 v4, v20

    move-object v5, v13

    move-object/from16 v6, v19

    move v13, v7

    move-object/from16 v7, v17

    invoke-virtual/range {v2 .. v7}, Ly/h;->b(Lm2/b;I[ILm2/l;[I)V

    :goto_33
    invoke-static/range {v17 .. v17}, Lb9/b;->S([I)Li9/g;

    move-result-object v2

    if-nez v26, :cond_41

    goto :goto_34

    :cond_41
    iget v3, v2, Li9/e;->c:I

    neg-int v3, v3

    new-instance v4, Li9/e;

    iget v5, v2, Li9/e;->b:I

    iget v2, v2, Li9/e;->a:I

    invoke-direct {v4, v5, v2, v3}, Li9/e;-><init>(III)V

    move-object v2, v4

    :goto_34
    iget v3, v2, Li9/e;->a:I

    iget v4, v2, Li9/e;->b:I

    iget v2, v2, Li9/e;->c:I

    if-lez v2, :cond_42

    if-le v3, v4, :cond_43

    :cond_42
    if-gez v2, :cond_46

    if-gt v4, v3, :cond_46

    :cond_43
    :goto_35
    aget v5, v17, v3

    if-nez v26, :cond_44

    move v6, v3

    goto :goto_36

    :cond_44
    sub-int v6, v1, v3

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    :goto_36
    invoke-virtual {v0, v6}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb0/g;

    if-eqz v26, :cond_45

    sub-int v7, v20, v5

    iget v5, v6, Lb0/g;->b:I

    sub-int v5, v7, v5

    :cond_45
    invoke-virtual {v6, v5, v11, v10}, Lb0/g;->a(III)V

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v3, v4, :cond_46

    add-int/2addr v3, v2

    goto :goto_35

    :cond_46
    move v1, v13

    goto :goto_3a

    :cond_47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No extra pages"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_48
    move v1, v6

    move-object/from16 v28, v15

    move/from16 v16, v38

    move-object v15, v5

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    move v3, v4

    const/4 v5, 0x0

    :goto_37
    if-ge v5, v2, :cond_49

    move-object/from16 v6, p1

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb0/g;

    sub-int v3, v3, v32

    invoke-virtual {v7, v3, v11, v10}, Lb0/g;->a(III)V

    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_37

    :cond_49
    invoke-virtual {v0}, Lr8/l;->e()I

    move-result v2

    const/4 v3, 0x0

    :goto_38
    if-ge v3, v2, :cond_4a

    invoke-virtual {v0, v3}, Lr8/l;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb0/g;

    invoke-virtual {v5, v4, v11, v10}, Lb0/g;->a(III)V

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int v4, v4, v32

    add-int/lit8 v3, v3, 0x1

    goto :goto_38

    :cond_4a
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_39
    if-ge v3, v2, :cond_4b

    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb0/g;

    invoke-virtual {v5, v4, v11, v10}, Lb0/g;->a(III)V

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int v4, v4, v32

    add-int/lit8 v3, v3, 0x1

    goto :goto_39

    :cond_4b
    :goto_3a
    if-eqz v14, :cond_4c

    move-object v2, v15

    goto :goto_3c

    :cond_4c
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v14, 0x0

    :goto_3b
    if-ge v14, v3, :cond_4e

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lb0/g;

    iget v6, v5, Lb0/g;->a:I

    invoke-virtual {v0}, Lr8/l;->first()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb0/g;

    iget v7, v7, Lb0/g;->a:I

    if-lt v6, v7, :cond_4d

    invoke-virtual {v0}, Lr8/l;->last()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb0/g;

    iget v6, v6, Lb0/g;->a:I

    iget v5, v5, Lb0/g;->a:I

    if-gt v5, v6, :cond_4d

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4d
    add-int/lit8 v14, v14, 0x1

    goto :goto_3b

    :cond_4e
    :goto_3c
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4f

    move-object/from16 v5, p0

    move-object/from16 v6, v33

    const/4 v13, 0x0

    goto :goto_3e

    :cond_4f
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lb0/g;

    iget v4, v4, Lb0/g;->m:I

    move-object/from16 v5, p0

    move-object/from16 v6, v33

    iget-object v7, v5, Lb0/w;->s:Lb0/l0;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v7, Lb0/o0;->a:F

    int-to-float v7, v0

    int-to-float v0, v4

    sub-float/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    neg-float v0, v0

    invoke-static {v2}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v4

    const/4 v13, 0x1

    if-gt v13, v4, :cond_51

    move v14, v13

    :goto_3d
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v13, v17

    check-cast v13, Lb0/g;

    iget v13, v13, Lb0/g;->m:I

    sget v18, Lb0/o0;->a:F

    int-to-float v13, v13

    sub-float/2addr v13, v7

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    neg-float v13, v13

    invoke-static {v0, v13}, Ljava/lang/Float;->compare(FF)I

    move-result v18

    if-gez v18, :cond_50

    move v0, v13

    move-object/from16 v3, v17

    :cond_50
    if-eq v14, v4, :cond_51

    add-int/lit8 v14, v14, 0x1

    const/4 v13, 0x1

    goto :goto_3d

    :cond_51
    move-object v13, v3

    :goto_3e
    move-object v0, v13

    check-cast v0, Lb0/g;

    if-eqz v0, :cond_52

    iget v14, v0, Lb0/g;->m:I

    move/from16 v3, v50

    goto :goto_3f

    :cond_52
    move/from16 v3, v50

    const/4 v14, 0x0

    :goto_3f
    if-nez v3, :cond_53

    const/4 v3, 0x0

    goto :goto_40

    :cond_53
    int-to-float v4, v14

    neg-float v4, v4

    int-to-float v3, v3

    div-float/2addr v4, v3

    const/high16 v3, -0x41000000    # -0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-static {v4, v3, v7}, Lz6/a;->q(FFF)F

    move-result v3

    :goto_40
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v10, Lu/s;

    const/16 v11, 0x8

    move-object/from16 v13, v45

    iget-object v14, v13, Lb0/h0;->B:Lm0/g1;

    invoke-direct {v10, v11, v15, v14}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v4, v7, v10}, Lz/r;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/k0;

    move/from16 v6, v44

    if-lt v6, v8, :cond_55

    if-le v1, v12, :cond_54

    goto :goto_41

    :cond_54
    const/16 v30, 0x0

    goto :goto_42

    :cond_55
    :goto_41
    const/16 v30, 0x1

    :goto_42
    new-instance v1, Lb0/x;

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move/from16 v19, v12

    move/from16 v20, v16

    move-object/from16 v22, v9

    move/from16 v23, v36

    move/from16 v24, v31

    move/from16 v25, v27

    move-object/from16 v26, v28

    move-object/from16 v27, v0

    move/from16 v28, v3

    move/from16 v29, v39

    move-object/from16 v31, v4

    move/from16 v32, v40

    invoke-direct/range {v17 .. v32}, Lb0/x;-><init>(Ljava/util/List;IIILv/h1;IIILb0/g;Lb0/g;FIZLr1/k0;Z)V

    move-object v4, v1

    goto/16 :goto_f

    :goto_43
    invoke-virtual {v13, v4, v0}, Lb0/h0;->h(Lb0/x;Z)V

    return-object v4

    :cond_56
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid currentFirstPageScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_57
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative afterContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_58
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative beforeContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object v5, v1

    :try_start_3
    invoke-static/range {v16 .. v16}, Lw0/i;->p(Lw0/i;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_44

    :catchall_2
    move-exception v0

    move-object v5, v1

    :goto_44
    invoke-virtual {v2}, Lw0/i;->c()V

    throw v0
.end method
