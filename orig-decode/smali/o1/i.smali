.class public final Lo1/i;
.super Lo1/j;


# instance fields
.field public final b:Ly0/n;

.field public final c:Lp1/b;

.field public final d:Lq/l;

.field public e:Lt1/c1;

.field public f:Lo1/k;

.field public g:Z

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Ly0/n;)V
    .locals 2

    invoke-direct {p0}, Lo1/j;-><init>()V

    iput-object p1, p0, Lo1/i;->b:Ly0/n;

    new-instance p1, Lp1/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [J

    iput-object v1, p1, Lp1/b;->b:[J

    iput-object p1, p0, Lo1/i;->c:Lp1/b;

    new-instance p1, Lq/l;

    invoke-direct {p1, v0}, Lq/l;-><init>(I)V

    iput-object p1, p0, Lo1/i;->d:Lq/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo1/i;->h:Z

    iput-boolean p1, p0, Lo1/i;->i:Z

    return-void
.end method


# virtual methods
.method public final a(Lq/l;Lr1/s;Lo1/f;Z)Z
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-super/range {p0 .. p4}, Lo1/j;->a(Lq/l;Lr1/s;Lo1/f;Z)Z

    move-result v4

    iget-object v5, v0, Lo1/i;->b:Ly0/n;

    iget-boolean v6, v5, Ly0/n;->t:Z

    const/4 v7, 0x1

    if-nez v6, :cond_0

    return v7

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v5, :cond_8

    instance-of v10, v5, Lt1/p1;

    const/16 v11, 0x10

    if-eqz v10, :cond_1

    check-cast v5, Lt1/p1;

    invoke-static {v5, v11}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v5

    iput-object v5, v0, Lo1/i;->e:Lt1/c1;

    goto :goto_3

    :cond_1
    iget v10, v5, Ly0/n;->c:I

    and-int/2addr v10, v11

    if-eqz v10, :cond_7

    instance-of v10, v5, Lt1/o;

    if-eqz v10, :cond_7

    move-object v10, v5

    check-cast v10, Lt1/o;

    iget-object v10, v10, Lt1/o;->v:Ly0/n;

    const/4 v9, 0x0

    :goto_1
    if-eqz v10, :cond_6

    iget v12, v10, Ly0/n;->c:I

    and-int/2addr v12, v11

    if-eqz v12, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_2

    move-object v5, v10

    goto :goto_2

    :cond_2
    if-nez v8, :cond_3

    new-instance v8, Lo0/i;

    new-array v12, v11, [Ly0/n;

    invoke-direct {v8, v12}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v8, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 v5, 0x0

    :cond_4
    invoke-virtual {v8, v10}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object v10, v10, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_6
    if-ne v9, v7, :cond_7

    goto :goto_0

    :cond_7
    :goto_3
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v5

    goto :goto_0

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lq/l;->g()I

    move-result v5

    const/4 v8, 0x0

    :goto_4
    iget-object v10, v0, Lo1/i;->d:Lq/l;

    iget-object v11, v0, Lo1/i;->c:Lp1/b;

    if-ge v8, v5, :cond_e

    invoke-virtual {v1, v8}, Lq/l;->e(I)J

    move-result-wide v12

    invoke-virtual {v1, v8}, Lq/l;->h(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo1/u;

    iget v15, v11, Lp1/b;->a:I

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v15, :cond_d

    iget-object v7, v11, Lp1/b;->b:[J

    aget-wide v16, v7, v6

    cmp-long v7, v16, v12

    if-nez v7, :cond_c

    new-instance v6, Ljava/util/ArrayList;

    iget-object v7, v14, Lo1/u;->k:Ljava/util/List;

    sget-object v11, Lr8/r;->a:Lr8/r;

    if-nez v7, :cond_9

    move-object v7, v11

    :cond_9
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v7, v14, Lo1/u;->k:Ljava/util/List;

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    move-object v11, v7

    :goto_6
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    const/4 v15, 0x0

    :goto_7
    if-ge v15, v7, :cond_b

    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Lo1/d;

    move/from16 v36, v5

    new-instance v5, Lo1/d;

    move/from16 v37, v4

    iget-wide v3, v9, Lo1/d;->a:J

    move/from16 v23, v7

    iget-object v7, v0, Lo1/i;->e:Lt1/c1;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object/from16 v38, v10

    move-object/from16 v24, v11

    iget-wide v10, v9, Lo1/d;->b:J

    invoke-virtual {v7, v2, v10, v11}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide v19

    iget-wide v9, v9, Lo1/d;->c:J

    move-object/from16 v16, v5

    move-wide/from16 v17, v3

    move-wide/from16 v21, v9

    invoke-direct/range {v16 .. v22}, Lo1/d;-><init>(JJJ)V

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, p3

    move/from16 v7, v23

    move-object/from16 v11, v24

    move/from16 v5, v36

    move/from16 v4, v37

    move-object/from16 v10, v38

    goto :goto_7

    :cond_b
    move/from16 v37, v4

    move/from16 v36, v5

    move-object/from16 v38, v10

    iget-object v3, v0, Lo1/i;->e:Lt1/c1;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v4, v14, Lo1/u;->g:J

    invoke-virtual {v3, v2, v4, v5}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide v27

    iget-object v3, v0, Lo1/i;->e:Lt1/c1;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v4, v14, Lo1/u;->c:J

    invoke-virtual {v3, v2, v4, v5}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide v21

    iget-wide v3, v14, Lo1/u;->a:J

    iget-wide v9, v14, Lo1/u;->b:J

    iget-boolean v5, v14, Lo1/u;->d:Z

    iget-wide v1, v14, Lo1/u;->f:J

    iget-boolean v7, v14, Lo1/u;->h:Z

    iget v11, v14, Lo1/u;->i:I

    move-wide/from16 v39, v12

    iget-wide v12, v14, Lo1/u;->j:J

    iget v15, v14, Lo1/u;->e:F

    move-wide/from16 v32, v12

    iget-wide v12, v14, Lo1/u;->l:J

    new-instance v0, Lo1/u;

    move-object/from16 v16, v0

    move-wide/from16 v17, v3

    move-wide/from16 v19, v9

    move/from16 v23, v5

    move/from16 v24, v15

    move-wide/from16 v25, v1

    move/from16 v29, v7

    move/from16 v30, v11

    move-object/from16 v31, v6

    move-wide/from16 v34, v12

    invoke-direct/range {v16 .. v35}, Lo1/u;-><init>(JJJZFJJZILjava/util/List;JJ)V

    iget-object v1, v14, Lo1/u;->m:Lo1/c;

    iput-object v1, v0, Lo1/u;->m:Lo1/c;

    move-object/from16 v1, v38

    move-wide/from16 v2, v39

    invoke-virtual {v1, v0, v2, v3}, Lq/l;->f(Ljava/lang/Object;J)V

    goto :goto_8

    :cond_c
    move/from16 v37, v4

    move/from16 v36, v5

    move-object v1, v10

    move-wide v2, v12

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    goto/16 :goto_5

    :cond_d
    move/from16 v37, v4

    move/from16 v36, v5

    :goto_8
    add-int/lit8 v8, v8, 0x1

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v5, v36

    move/from16 v4, v37

    goto/16 :goto_4

    :cond_e
    move/from16 v37, v4

    move-object v1, v10

    invoke-virtual {v1}, Lq/l;->g()I

    move-result v0

    if-nez v0, :cond_f

    const/4 v0, 0x0

    iput v0, v11, Lp1/b;->a:I

    move-object/from16 v0, p0

    iget-object v1, v0, Lo1/j;->a:Lo0/i;

    invoke-virtual {v1}, Lo0/i;->g()V

    const/4 v2, 0x1

    return v2

    :cond_f
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iget v3, v11, Lp1/b;->a:I

    sub-int/2addr v3, v2

    :goto_9
    const/4 v2, -0x1

    if-ge v2, v3, :cond_11

    iget-object v2, v11, Lp1/b;->b:[J

    aget-wide v4, v2, v3

    move-object/from16 v2, p1

    invoke-virtual {v2, v4, v5}, Lq/l;->d(J)I

    move-result v4

    if-ltz v4, :cond_10

    goto :goto_a

    :cond_10
    invoke-virtual {v11, v3}, Lp1/b;->b(I)V

    :goto_a
    add-int/lit8 v3, v3, -0x1

    goto :goto_9

    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lq/l;->g()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Lq/l;->g()I

    move-result v3

    const/4 v4, 0x0

    :goto_b
    if-ge v4, v3, :cond_12

    invoke-virtual {v1, v4}, Lq/l;->h(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_12
    new-instance v1, Lo1/k;

    move-object/from16 v3, p3

    invoke-direct {v1, v2, v3}, Lo1/k;-><init>(Ljava/util/List;Lo1/f;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_c
    if-ge v5, v4, :cond_14

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lo1/u;

    iget-wide v7, v7, Lo1/u;->a:J

    invoke-virtual {v3, v7, v8}, Lo1/f;->a(J)Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_d

    :cond_13
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_14
    const/4 v6, 0x0

    :goto_d
    check-cast v6, Lo1/u;

    const/4 v2, 0x3

    if-eqz v6, :cond_1c

    iget-boolean v3, v6, Lo1/u;->d:Z

    if-nez p4, :cond_16

    const/4 v4, 0x0

    iput-boolean v4, v0, Lo1/i;->h:Z

    :cond_15
    const/4 v6, 0x1

    goto :goto_e

    :cond_16
    const/4 v4, 0x0

    iget-boolean v5, v0, Lo1/i;->h:Z

    if-nez v5, :cond_15

    if-nez v3, :cond_17

    iget-boolean v5, v6, Lo1/u;->h:Z

    if-eqz v5, :cond_15

    :cond_17
    iget-object v5, v0, Lo1/i;->e:Lt1/c1;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v7, v5, Lr1/x0;->c:J

    invoke-static {v6, v7, v8}, Lm9/e0;->D(Lo1/u;J)Z

    move-result v5

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    iput-boolean v5, v0, Lo1/i;->h:Z

    :goto_e
    iget-boolean v5, v0, Lo1/i;->h:Z

    iget-boolean v7, v0, Lo1/i;->g:Z

    const/4 v8, 0x5

    const/4 v9, 0x4

    if-eq v5, v7, :cond_1a

    iget v5, v1, Lo1/k;->c:I

    invoke-static {v5, v2}, Lo1/s;->t(II)Z

    move-result v5

    if-nez v5, :cond_18

    iget v5, v1, Lo1/k;->c:I

    invoke-static {v5, v9}, Lo1/s;->t(II)Z

    move-result v5

    if-nez v5, :cond_18

    iget v5, v1, Lo1/k;->c:I

    invoke-static {v5, v8}, Lo1/s;->t(II)Z

    move-result v5

    if-eqz v5, :cond_1a

    :cond_18
    iget-boolean v3, v0, Lo1/i;->h:Z

    if-eqz v3, :cond_19

    move v8, v9

    :cond_19
    iput v8, v1, Lo1/k;->c:I

    goto :goto_f

    :cond_1a
    iget v5, v1, Lo1/k;->c:I

    invoke-static {v5, v9}, Lo1/s;->t(II)Z

    move-result v5

    if-eqz v5, :cond_1b

    iget-boolean v5, v0, Lo1/i;->g:Z

    if-eqz v5, :cond_1b

    iget-boolean v5, v0, Lo1/i;->i:Z

    if-nez v5, :cond_1b

    iput v2, v1, Lo1/k;->c:I

    goto :goto_f

    :cond_1b
    iget v5, v1, Lo1/k;->c:I

    invoke-static {v5, v8}, Lo1/s;->t(II)Z

    move-result v5

    if-eqz v5, :cond_1d

    iget-boolean v5, v0, Lo1/i;->h:Z

    if-eqz v5, :cond_1d

    if-eqz v3, :cond_1d

    iput v2, v1, Lo1/k;->c:I

    goto :goto_f

    :cond_1c
    const/4 v4, 0x0

    const/4 v6, 0x1

    :cond_1d
    :goto_f
    if-nez v37, :cond_21

    iget v3, v1, Lo1/k;->c:I

    invoke-static {v3, v2}, Lo1/s;->t(II)Z

    move-result v2

    if-eqz v2, :cond_21

    iget-object v2, v0, Lo1/i;->f:Lo1/k;

    if-eqz v2, :cond_21

    iget-object v2, v2, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    iget-object v5, v1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-eq v3, v7, :cond_1e

    goto :goto_11

    :cond_1e
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    move v7, v4

    :goto_10
    if-ge v7, v3, :cond_20

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo1/u;

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo1/u;

    iget-wide v10, v8, Lo1/u;->c:J

    iget-wide v8, v9, Lo1/u;->c:J

    invoke-static {v10, v11, v8, v9}, Ld1/c;->b(JJ)Z

    move-result v8

    if-nez v8, :cond_1f

    goto :goto_11

    :cond_1f
    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_20
    move v7, v4

    goto :goto_12

    :cond_21
    :goto_11
    move v7, v6

    :goto_12
    iput-object v1, v0, Lo1/i;->f:Lo1/k;

    return v7
.end method

.method public final b(Lo1/f;)V
    .locals 13

    invoke-super {p0, p1}, Lo1/j;->b(Lo1/f;)V

    iget-object v0, p0, Lo1/i;->f:Lo1/k;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Lo1/i;->h:Z

    iput-boolean v1, p0, Lo1/i;->g:Z

    iget-object v1, v0, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo1/u;

    iget-boolean v6, v5, Lo1/u;->d:Z

    if-nez v6, :cond_3

    iget-wide v5, v5, Lo1/u;->a:J

    invoke-virtual {p1, v5, v6}, Lo1/f;->a(J)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-boolean v7, p0, Lo1/i;->h:Z

    if-nez v7, :cond_3

    :cond_1
    iget-object v7, p0, Lo1/i;->c:Lp1/b;

    iget v8, v7, Lp1/b;->a:I

    move v9, v3

    :goto_1
    if-ge v9, v8, :cond_3

    iget-object v10, v7, Lp1/b;->b:[J

    aget-wide v11, v10, v9

    cmp-long v10, v5, v11

    if-nez v10, :cond_2

    invoke-virtual {v7, v9}, Lp1/b;->b(I)V

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    iput-boolean v3, p0, Lo1/i;->h:Z

    iget p1, v0, Lo1/k;->c:I

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lo1/s;->t(II)Z

    move-result p1

    iput-boolean p1, p0, Lo1/i;->i:Z

    return-void
.end method

.method public final d()V
    .locals 9

    iget-object v0, p0, Lo1/j;->a:Lo0/i;

    iget v1, v0, Lo0/i;->c:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez v1, :cond_1

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    move v4, v3

    :cond_0
    aget-object v5, v0, v4

    check-cast v5, Lo1/i;

    invoke-virtual {v5}, Lo1/i;->d()V

    add-int/2addr v4, v2

    if-lt v4, v1, :cond_0

    :cond_1
    const/4 v0, 0x0

    iget-object v1, p0, Lo1/i;->b:Ly0/n;

    move-object v4, v0

    :goto_0
    if-eqz v1, :cond_9

    instance-of v5, v1, Lt1/p1;

    if-eqz v5, :cond_2

    check-cast v1, Lt1/p1;

    invoke-interface {v1}, Lt1/p1;->b0()V

    goto :goto_3

    :cond_2
    iget v5, v1, Ly0/n;->c:I

    const/16 v6, 0x10

    and-int/2addr v5, v6

    if-eqz v5, :cond_8

    instance-of v5, v1, Lt1/o;

    if-eqz v5, :cond_8

    move-object v5, v1

    check-cast v5, Lt1/o;

    iget-object v5, v5, Lt1/o;->v:Ly0/n;

    move v7, v3

    :goto_1
    if-eqz v5, :cond_7

    iget v8, v5, Ly0/n;->c:I

    and-int/2addr v8, v6

    if-eqz v8, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v2, :cond_3

    move-object v1, v5

    goto :goto_2

    :cond_3
    if-nez v4, :cond_4

    new-instance v4, Lo0/i;

    new-array v8, v6, [Ly0/n;

    invoke-direct {v4, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v4, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_5
    invoke-virtual {v4, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_7
    if-ne v7, v2, :cond_8

    goto :goto_0

    :cond_8
    :goto_3
    invoke-static {v4}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v1

    goto :goto_0

    :cond_9
    return-void
.end method

.method public final e(Lo1/f;)Z
    .locals 14

    iget-object v0, p0, Lo1/i;->d:Lq/l;

    invoke-virtual {v0}, Lq/l;->g()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lo1/i;->b:Ly0/n;

    iget-boolean v5, v1, Ly0/n;->t:Z

    if-nez v5, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v5, p0, Lo1/i;->f:Lo1/k;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, p0, Lo1/i;->e:Lt1/c1;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v6, v6, Lr1/x0;->c:J

    move-object v8, v1

    move-object v9, v4

    :goto_1
    if-eqz v8, :cond_a

    instance-of v10, v8, Lt1/p1;

    if-eqz v10, :cond_3

    check-cast v8, Lt1/p1;

    sget-object v10, Lo1/l;->c:Lo1/l;

    invoke-interface {v8, v5, v10, v6, v7}, Lt1/p1;->y(Lo1/k;Lo1/l;J)V

    goto :goto_4

    :cond_3
    iget v10, v8, Ly0/n;->c:I

    const/16 v11, 0x10

    and-int/2addr v10, v11

    if-eqz v10, :cond_9

    instance-of v10, v8, Lt1/o;

    if-eqz v10, :cond_9

    move-object v10, v8

    check-cast v10, Lt1/o;

    iget-object v10, v10, Lt1/o;->v:Ly0/n;

    move v12, v2

    :goto_2
    if-eqz v10, :cond_8

    iget v13, v10, Ly0/n;->c:I

    and-int/2addr v13, v11

    if-eqz v13, :cond_7

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v3, :cond_4

    move-object v8, v10

    goto :goto_3

    :cond_4
    if-nez v9, :cond_5

    new-instance v9, Lo0/i;

    new-array v13, v11, [Ly0/n;

    invoke-direct {v9, v13}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v8, :cond_6

    invoke-virtual {v9, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v8, v4

    :cond_6
    invoke-virtual {v9, v10}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    iget-object v10, v10, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_8
    if-ne v12, v3, :cond_9

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v9}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v8

    goto :goto_1

    :cond_a
    iget-boolean v1, v1, Ly0/n;->t:Z

    if-eqz v1, :cond_c

    iget-object v1, p0, Lo1/j;->a:Lo0/i;

    iget v5, v1, Lo0/i;->c:I

    if-lez v5, :cond_c

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_b
    aget-object v6, v1, v2

    check-cast v6, Lo1/i;

    invoke-virtual {v6, p1}, Lo1/i;->e(Lo1/f;)Z

    add-int/2addr v2, v3

    if-lt v2, v5, :cond_b

    :cond_c
    move v2, v3

    :goto_5
    invoke-virtual {p0, p1}, Lo1/i;->b(Lo1/f;)V

    invoke-virtual {v0}, Lq/l;->a()V

    iput-object v4, p0, Lo1/i;->e:Lt1/c1;

    return v2
.end method

.method public final f(Lo1/f;Z)Z
    .locals 13

    iget-object v0, p0, Lo1/i;->d:Lq/l;

    invoke-virtual {v0}, Lq/l;->g()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v0, p0, Lo1/i;->b:Ly0/n;

    iget-boolean v3, v0, Ly0/n;->t:Z

    if-nez v3, :cond_2

    goto/16 :goto_9

    :cond_2
    iget-object v3, p0, Lo1/i;->f:Lo1/k;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v4, p0, Lo1/i;->e:Lt1/c1;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v4, v4, Lr1/x0;->c:J

    const/4 v6, 0x0

    move-object v7, v0

    move-object v8, v6

    :goto_1
    const/16 v9, 0x10

    if-eqz v7, :cond_a

    instance-of v10, v7, Lt1/p1;

    if-eqz v10, :cond_3

    check-cast v7, Lt1/p1;

    sget-object v9, Lo1/l;->a:Lo1/l;

    invoke-interface {v7, v3, v9, v4, v5}, Lt1/p1;->y(Lo1/k;Lo1/l;J)V

    goto :goto_4

    :cond_3
    iget v10, v7, Ly0/n;->c:I

    and-int/2addr v10, v9

    if-eqz v10, :cond_9

    instance-of v10, v7, Lt1/o;

    if-eqz v10, :cond_9

    move-object v10, v7

    check-cast v10, Lt1/o;

    iget-object v10, v10, Lt1/o;->v:Ly0/n;

    move v11, v1

    :goto_2
    if-eqz v10, :cond_8

    iget v12, v10, Ly0/n;->c:I

    and-int/2addr v12, v9

    if-eqz v12, :cond_7

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v2, :cond_4

    move-object v7, v10

    goto :goto_3

    :cond_4
    if-nez v8, :cond_5

    new-instance v8, Lo0/i;

    new-array v12, v9, [Ly0/n;

    invoke-direct {v8, v12}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v7, :cond_6

    invoke-virtual {v8, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v7, v6

    :cond_6
    invoke-virtual {v8, v10}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    iget-object v10, v10, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_8
    if-ne v11, v2, :cond_9

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v7

    goto :goto_1

    :cond_a
    iget-boolean v7, v0, Ly0/n;->t:Z

    if-eqz v7, :cond_c

    iget-object v7, p0, Lo1/j;->a:Lo0/i;

    iget v8, v7, Lo0/i;->c:I

    if-lez v8, :cond_c

    iget-object v7, v7, Lo0/i;->a:[Ljava/lang/Object;

    move v10, v1

    :cond_b
    aget-object v11, v7, v10

    check-cast v11, Lo1/i;

    iget-object v12, p0, Lo1/i;->e:Lt1/c1;

    invoke-static {v12}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v11, p1, p2}, Lo1/i;->f(Lo1/f;Z)Z

    add-int/2addr v10, v2

    if-lt v10, v8, :cond_b

    :cond_c
    iget-boolean p1, v0, Ly0/n;->t:Z

    if-eqz p1, :cond_14

    move-object p1, v6

    :goto_5
    if-eqz v0, :cond_14

    instance-of p2, v0, Lt1/p1;

    if-eqz p2, :cond_d

    check-cast v0, Lt1/p1;

    sget-object p2, Lo1/l;->b:Lo1/l;

    invoke-interface {v0, v3, p2, v4, v5}, Lt1/p1;->y(Lo1/k;Lo1/l;J)V

    goto :goto_8

    :cond_d
    iget p2, v0, Ly0/n;->c:I

    and-int/2addr p2, v9

    if-eqz p2, :cond_13

    instance-of p2, v0, Lt1/o;

    if-eqz p2, :cond_13

    move-object p2, v0

    check-cast p2, Lt1/o;

    iget-object p2, p2, Lt1/o;->v:Ly0/n;

    move v7, v1

    :goto_6
    if-eqz p2, :cond_12

    iget v8, p2, Ly0/n;->c:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_11

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v2, :cond_e

    move-object v0, p2

    goto :goto_7

    :cond_e
    if-nez p1, :cond_f

    new-instance p1, Lo0/i;

    new-array v8, v9, [Ly0/n;

    invoke-direct {p1, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_f
    if-eqz v0, :cond_10

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v6

    :cond_10
    invoke-virtual {p1, p2}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_11
    :goto_7
    iget-object p2, p2, Ly0/n;->f:Ly0/n;

    goto :goto_6

    :cond_12
    if-ne v7, v2, :cond_13

    goto :goto_5

    :cond_13
    :goto_8
    invoke-static {p1}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_5

    :cond_14
    move v1, v2

    :goto_9
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Node(pointerInputFilter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo1/i;->b:Ly0/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", children="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo1/j;->a:Lo0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pointerIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo1/i;->c:Lp1/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
