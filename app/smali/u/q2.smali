.class public final Lu/q2;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lu/q2;->a:I

    iput-object p1, p0, Lu/q2;->c:Ljava/lang/Object;

    iput p2, p0, Lu/q2;->b:I

    iput-object p3, p0, Lu/q2;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lq8/l;->a:Lq8/l;

    const/4 v2, 0x2

    iget v4, v0, Lu/q2;->a:I

    iget-object v6, v0, Lu/q2;->d:Ljava/lang/Object;

    iget v7, v0, Lu/q2;->b:I

    iget-object v8, v0, Lu/q2;->c:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_0

    move-object/from16 v4, p1

    check-cast v4, Lm0/t;

    check-cast v8, Lm0/x1;

    iget v9, v8, Lm0/x1;->e:I

    if-ne v9, v7, :cond_a

    check-cast v6, Lq/r;

    iget-object v9, v8, Lm0/x1;->f:Lq/r;

    invoke-static {v6, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    instance-of v9, v4, Lm0/x;

    if-eqz v9, :cond_a

    iget-object v9, v6, Lq/r;->a:[J

    array-length v10, v9

    sub-int/2addr v10, v2

    if-ltz v10, :cond_9

    const/4 v11, 0x0

    :goto_0
    aget-wide v12, v9, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_8

    sub-int v14, v11, v10

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v14, :cond_7

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_6

    shl-int/lit8 v17, v11, 0x3

    add-int v3, v17, v5

    iget-object v15, v6, Lq/r;->b:[Ljava/lang/Object;

    aget-object v15, v15, v3

    iget-object v2, v6, Lq/r;->c:[I

    aget v2, v2, v3

    if-eq v2, v7, :cond_0

    const/4 v2, 0x1

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_3

    move-object/from16 v19, v9

    move-object v9, v4

    check-cast v9, Lm0/x;

    move-object/from16 v20, v4

    iget-object v4, v9, Lm0/x;->n:Lo0/j;

    invoke-virtual {v4, v15, v8}, Lo0/j;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    instance-of v4, v15, Lm0/k0;

    if-eqz v4, :cond_1

    move-object v4, v15

    check-cast v4, Lm0/k0;

    goto :goto_3

    :cond_1
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_4

    iget-object v15, v9, Lm0/x;->n:Lo0/j;

    iget-object v15, v15, Lo0/j;->a:Lq/s;

    invoke-virtual {v15, v4}, Lq/s;->b(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2

    iget-object v9, v9, Lm0/x;->p:Lo0/j;

    invoke-virtual {v9, v4}, Lo0/j;->c(Ljava/lang/Object;)V

    :cond_2
    iget-object v9, v8, Lm0/x1;->g:Lq/s;

    if-eqz v9, :cond_4

    invoke-virtual {v9, v4}, Lq/s;->i(Ljava/lang/Object;)V

    iget v4, v9, Lq/s;->e:I

    if-nez v4, :cond_4

    const/4 v4, 0x0

    iput-object v4, v8, Lm0/x1;->g:Lq/s;

    goto :goto_4

    :cond_3
    move-object/from16 v20, v4

    move-object/from16 v19, v9

    :cond_4
    :goto_4
    if-eqz v2, :cond_5

    invoke-virtual {v6, v3}, Lq/r;->g(I)V

    :cond_5
    const/16 v2, 0x8

    goto :goto_5

    :cond_6
    move-object/from16 v20, v4

    move-object/from16 v19, v9

    move v2, v15

    :goto_5
    shr-long/2addr v12, v2

    add-int/lit8 v5, v5, 0x1

    move v15, v2

    move-object/from16 v9, v19

    move-object/from16 v4, v20

    goto :goto_1

    :cond_7
    move-object/from16 v20, v4

    move-object/from16 v19, v9

    move v2, v15

    if-ne v14, v2, :cond_9

    goto :goto_6

    :cond_8
    move-object/from16 v20, v4

    move-object/from16 v19, v9

    :goto_6
    if-eq v11, v10, :cond_9

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v9, v19

    move-object/from16 v4, v20

    goto/16 :goto_0

    :cond_9
    iget v2, v6, Lq/r;->e:I

    if-nez v2, :cond_a

    const/4 v2, 0x0

    iput-object v2, v8, Lm0/x1;->f:Lq/r;

    :cond_a
    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ld1/c;

    iget-wide v3, v1, Ld1/c;->a:J

    check-cast v8, Lv/l2;

    iget-object v1, v8, Lv/l2;->f:Ln1/d;

    invoke-virtual {v1}, Ln1/d;->c()Ln1/g;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1, v7, v3, v4}, Ln1/g;->g0(IJ)J

    move-result-wide v9

    goto :goto_7

    :cond_b
    sget-wide v9, Ld1/c;->b:J

    :goto_7
    invoke-static {v3, v4, v9, v10}, Ld1/c;->f(JJ)J

    move-result-wide v3

    iget-object v1, v8, Lv/l2;->b:Lv/h1;

    sget-object v5, Lv/h1;->b:Lv/h1;

    if-ne v1, v5, :cond_c

    const/4 v1, 0x1

    invoke-static {v3, v4, v1}, Ld1/c;->a(JI)J

    move-result-wide v1

    goto :goto_8

    :cond_c
    invoke-static {v3, v4, v2}, Ld1/c;->a(JI)J

    move-result-wide v1

    :goto_8
    iget-boolean v7, v8, Lv/l2;->d:Z

    const/high16 v11, -0x40800000    # -1.0f

    if-eqz v7, :cond_d

    invoke-static {v11, v1, v2}, Ld1/c;->h(FJ)J

    move-result-wide v1

    :cond_d
    iget-object v7, v8, Lv/l2;->b:Lv/h1;

    if-ne v7, v5, :cond_e

    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result v1

    goto :goto_9

    :cond_e
    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result v1

    :goto_9
    check-cast v6, Lv/r1;

    invoke-interface {v6, v1}, Lv/r1;->a(F)F

    move-result v1

    invoke-virtual {v8, v1}, Lv/l2;->d(F)J

    move-result-wide v1

    iget-boolean v5, v8, Lv/l2;->d:Z

    if-eqz v5, :cond_f

    invoke-static {v11, v1, v2}, Ld1/c;->h(FJ)J

    move-result-wide v1

    :cond_f
    invoke-static {v3, v4, v1, v2}, Ld1/c;->f(JJ)J

    move-result-wide v14

    iget-object v3, v8, Lv/l2;->f:Ln1/d;

    iget v4, v0, Lu/q2;->b:I

    invoke-virtual {v3}, Ln1/d;->c()Ln1/g;

    move-result-object v11

    if-eqz v11, :cond_10

    move-wide v12, v1

    move/from16 v16, v4

    invoke-virtual/range {v11 .. v16}, Ln1/g;->V(JJI)J

    move-result-wide v3

    goto :goto_a

    :cond_10
    sget-wide v3, Ld1/c;->b:J

    :goto_a
    invoke-static {v9, v10, v1, v2}, Ld1/c;->g(JJ)J

    move-result-wide v1

    invoke-static {v1, v2, v3, v4}, Ld1/c;->g(JJ)J

    move-result-wide v1

    new-instance v3, Ld1/c;

    invoke-direct {v3, v1, v2}, Ld1/c;-><init>(J)V

    return-object v3

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    check-cast v8, Lu/r2;

    iget-object v3, v8, Lu/r2;->u:Lu/p2;

    iget-object v3, v3, Lu/p2;->a:Lm0/l1;

    invoke-virtual {v3}, Lm0/u2;->d()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v7}, Lz6/a;->r(III)I

    move-result v3

    iget-boolean v5, v8, Lu/r2;->v:Z

    if-eqz v5, :cond_11

    sub-int/2addr v3, v7

    goto :goto_b

    :cond_11
    neg-int v3, v3

    :goto_b
    iget-boolean v5, v8, Lu/r2;->w:Z

    if-eqz v5, :cond_12

    move v7, v4

    goto :goto_c

    :cond_12
    move v7, v3

    :goto_c
    if-eqz v5, :cond_13

    move v5, v3

    goto :goto_d

    :cond_13
    move v5, v4

    :goto_d
    check-cast v6, Lr1/x0;

    invoke-static {v2, v6, v7, v5}, Lr1/w0;->h(Lr1/w0;Lr1/x0;II)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
