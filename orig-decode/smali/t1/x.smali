.class public final Lt1/x;
.super Lt1/c1;


# static fields
.field public static final P:Le1/g;


# instance fields
.field public final N:Lt1/s1;

.field public O:Lt1/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v0

    sget v1, Le1/r;->h:I

    sget-wide v1, Le1/r;->d:J

    invoke-virtual {v0, v1, v2}, Le1/g;->e(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Le1/g;->k(F)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Le1/g;->l(I)V

    sput-object v0, Lt1/x;->P:Le1/g;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 2

    invoke-direct {p0, p1}, Lt1/c1;-><init>(Landroidx/compose/ui/node/a;)V

    new-instance v0, Lt1/s1;

    invoke-direct {v0}, Ly0/n;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Ly0/n;->d:I

    iput-object v0, p0, Lt1/x;->N:Lt1/s1;

    iput-object p0, v0, Ly0/n;->o:Lt1/c1;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p1, :cond_0

    new-instance p1, Lt1/w;

    invoke-direct {p1, p0}, Lt1/w;-><init>(Lt1/x;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lt1/x;->O:Lt1/r0;

    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 1

    iget-object v0, p0, Lt1/x;->O:Lt1/r0;

    if-nez v0, :cond_0

    new-instance v0, Lt1/w;

    invoke-direct {v0, p0}, Lt1/w;-><init>(Lt1/x;)V

    iput-object v0, p0, Lt1/x;->O:Lt1/r0;

    :cond_0
    return-void
.end method

.method public final I0()Lt1/r0;
    .locals 1

    iget-object v0, p0, Lt1/x;->O:Lt1/r0;

    return-object v0
.end method

.method public final K0()Ly0/n;
    .locals 1

    iget-object v0, p0, Lt1/x;->N:Lt1/s1;

    return-object v0
.end method

.method public final O0(Lt1/z0;JLt1/v;ZZ)V
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v7, p2

    move-object/from16 v6, p4

    move-object/from16 v5, p1

    check-cast v5, Lx9/v;

    iget v1, v5, Lx9/v;->a:I

    const/4 v4, 0x1

    iget-object v2, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    const/16 v16, 0x0

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-boolean v1, v1, Ly1/j;->c:Z

    if-ne v1, v4, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move/from16 v1, v16

    :goto_0
    xor-int/2addr v1, v4

    if-eqz v1, :cond_3

    :pswitch_0
    invoke-static/range {p2 .. p3}, Ld9/i;->s(J)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lt1/c1;->H:Lt1/j1;

    if-eqz v1, :cond_4

    iget-boolean v3, v0, Lt1/c1;->t:Z

    if-eqz v3, :cond_4

    invoke-interface {v1, v7, v8}, Lt1/j1;->k(J)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz p5, :cond_3

    invoke-virtual/range {p0 .. p0}, Lt1/c1;->J0()J

    move-result-wide v9

    invoke-virtual {v0, v7, v8, v9, v10}, Lt1/c1;->B0(JJ)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    move v1, v4

    move/from16 v17, v16

    goto :goto_3

    :cond_3
    move/from16 v17, p6

    move/from16 v1, v16

    goto :goto_3

    :cond_4
    :goto_2
    move/from16 v17, p6

    move v1, v4

    :goto_3
    if-eqz v1, :cond_14

    iget v3, v6, Lt1/v;->c:I

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->s()Lo0/i;

    move-result-object v1

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_12

    sub-int/2addr v2, v4

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    move/from16 v18, v2

    :goto_4
    aget-object v2, v1, v18

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->D()Z

    move-result v9

    if-eqz v9, :cond_f

    iget v9, v5, Lx9/v;->a:I

    iget-object v15, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    packed-switch v9, :pswitch_data_1

    iget-object v2, v15, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v2, v7, v8}, Lt1/c1;->H0(J)J

    move-result-wide v11

    iget-object v9, v15, Lt1/x0;->c:Lt1/c1;

    sget-object v10, Lt1/c1;->M:Lx9/v;

    const/4 v14, 0x1

    move-object/from16 v13, p4

    move-object v2, v15

    move/from16 v15, v17

    invoke-virtual/range {v9 .. v15}, Lt1/c1;->N0(Lt1/z0;JLt1/v;ZZ)V

    move-object v9, v1

    move-object v10, v2

    move v11, v3

    move v12, v4

    move-object v13, v5

    move-object v14, v6

    goto :goto_5

    :pswitch_1
    move-object v9, v1

    move-object v10, v15

    move-object v1, v2

    move v11, v3

    move-wide/from16 v2, p2

    move v12, v4

    move-object/from16 v4, p4

    move-object v13, v5

    move/from16 v5, p5

    move-object v14, v6

    move/from16 v6, v17

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/node/a;->u(JLt1/v;ZZ)V

    :goto_5
    invoke-virtual/range {p4 .. p4}, Lt1/v;->e()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_10

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    if-eqz v1, :cond_10

    iget-object v1, v10, Lt1/x0;->c:Lt1/c1;

    const/16 v2, 0x10

    invoke-static {v2}, Lt1/g;->r(I)Z

    move-result v3

    invoke-virtual {v1, v3}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v1

    if-nez v1, :cond_5

    goto/16 :goto_b

    :cond_5
    iget-boolean v3, v1, Ly0/n;->t:Z

    if-eqz v3, :cond_13

    iget-object v1, v1, Ly0/n;->a:Ly0/n;

    iget-boolean v3, v1, Ly0/n;->t:Z

    if-eqz v3, :cond_e

    iget v3, v1, Ly0/n;->d:I

    and-int/2addr v3, v2

    if-eqz v3, :cond_13

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    :goto_6
    if-eqz v1, :cond_13

    iget v3, v1, Ly0/n;->c:I

    and-int/2addr v3, v2

    if-eqz v3, :cond_d

    const/4 v3, 0x0

    move-object v4, v1

    move-object v5, v3

    :goto_7
    if-eqz v4, :cond_d

    instance-of v6, v4, Lt1/p1;

    if-eqz v6, :cond_6

    check-cast v4, Lt1/p1;

    invoke-interface {v4}, Lt1/p1;->P()Z

    move-result v4

    if-eqz v4, :cond_c

    iget v1, v14, Lt1/v;->d:I

    sub-int/2addr v1, v12

    iput v1, v14, Lt1/v;->c:I

    goto :goto_a

    :cond_6
    iget v6, v4, Ly0/n;->c:I

    and-int/2addr v6, v2

    if-eqz v6, :cond_c

    instance-of v6, v4, Lt1/o;

    if-eqz v6, :cond_c

    move-object v6, v4

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    move/from16 v10, v16

    :goto_8
    if-eqz v6, :cond_b

    iget v15, v6, Ly0/n;->c:I

    and-int/2addr v15, v2

    if-eqz v15, :cond_a

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v12, :cond_7

    move-object v4, v6

    goto :goto_9

    :cond_7
    if-nez v5, :cond_8

    new-instance v5, Lo0/i;

    new-array v15, v2, [Ly0/n;

    invoke-direct {v5, v15}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v4, :cond_9

    invoke-virtual {v5, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_9
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_a
    :goto_9
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_8

    :cond_b
    if-ne v10, v12, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v4

    goto :goto_7

    :cond_d
    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_6

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "visitLocalDescendants called on an unattached node"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    move-object v9, v1

    move v11, v3

    move v12, v4

    move-object v13, v5

    move-object v14, v6

    :cond_10
    :goto_a
    add-int/lit8 v18, v18, -0x1

    if-gez v18, :cond_11

    goto :goto_b

    :cond_11
    move-object v1, v9

    move v3, v11

    move v4, v12

    move-object v5, v13

    move-object v6, v14

    goto/16 :goto_4

    :cond_12
    move v11, v3

    move-object v14, v6

    :cond_13
    :goto_b
    iput v11, v14, Lt1/v;->c:I

    :cond_14
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final Q(I)I
    .locals 3

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->d(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final U0(Le1/p;)V
    .locals 6

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-static {v0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->s()Lo0/i;

    move-result-object v0

    iget v2, v0, Lo0/i;->c:I

    if-lez v2, :cond_2

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, Landroidx/compose/ui/node/a;

    invoke-virtual {v4}, Landroidx/compose/ui/node/a;->D()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4, p1}, Landroidx/compose/ui/node/a;->i(Le1/p;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getShowLayoutBounds()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lt1/x;->P:Le1/g;

    invoke-virtual {p0, p1, v0}, Lt1/c1;->D0(Le1/p;Le1/g;)V

    :cond_3
    return-void
.end method

.method public final V(I)I
    .locals 3

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->b(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final X(I)I
    .locals 3

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->c(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final d0(JFLc9/c;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lt1/c1;->V0(JFLc9/c;)V

    iget-boolean p1, p0, Lt1/q0;->f:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lt1/c1;->T0()V

    iget-object p1, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p1, p1, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {p1}, Lt1/l0;->w0()V

    return-void
.end method

.method public final f(J)Lr1/x0;
    .locals 6

    invoke-virtual {p0, p1, p2}, Lr1/x0;->h0(J)V

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v1

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_1

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Landroidx/compose/ui/node/a;

    iget-object v4, v4, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v4, v4, Lt1/n0;->o:Lt1/l0;

    const/4 v5, 0x3

    iput v5, v4, Lt1/l0;->r:I

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_1
    iget-object v1, v0, Landroidx/compose/ui/node/a;->v:Lr1/j0;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, p0, v0, p1, p2}, Lr1/j0;->e(Lr1/l0;Ljava/util/List;J)Lr1/k0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt1/c1;->X0(Lr1/k0;)V

    invoke-virtual {p0}, Lt1/c1;->S0()V

    return-object p0
.end method

.method public final g(I)I
    .locals 3

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    invoke-virtual {v0}, Lt1/y;->a()Lr1/j0;

    move-result-object v1

    iget-object v0, v0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v2, v0, p1}, Lr1/j0;->a(Lt1/c1;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final j0(Lr1/a;)I
    .locals 5

    iget-object v0, p0, Lt1/x;->O:Lt1/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lt1/q0;->j0(Lr1/a;)I

    move-result p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget-boolean v1, v0, Lt1/l0;->s:Z

    const/4 v2, 0x1

    iget-object v3, v0, Lt1/l0;->A:Lt1/h0;

    if-nez v1, :cond_2

    iget-object v1, v0, Lt1/l0;->L:Lt1/n0;

    iget v4, v1, Lt1/n0;->c:I

    if-ne v4, v2, :cond_1

    iput-boolean v2, v3, Lt1/a;->f:Z

    iget-boolean v4, v3, Lt1/a;->b:Z

    if-eqz v4, :cond_2

    iput-boolean v2, v1, Lt1/n0;->e:Z

    iput-boolean v2, v1, Lt1/n0;->f:Z

    goto :goto_0

    :cond_1
    iput-boolean v2, v3, Lt1/a;->g:Z

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lt1/l0;->l()Lt1/x;

    move-result-object v1

    iput-boolean v2, v1, Lt1/q0;->n:Z

    invoke-virtual {v0}, Lt1/l0;->B()V

    invoke-virtual {v0}, Lt1/l0;->l()Lt1/x;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lt1/q0;->n:Z

    iget-object v0, v3, Lt1/a;->i:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_3
    const/high16 p1, -0x80000000

    :goto_1
    return p1
.end method
