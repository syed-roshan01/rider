.class public final Lt1/x0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/compose/ui/node/a;

.field public final b:Lt1/x;

.field public c:Lt1/c1;

.field public final d:Lt1/s1;

.field public e:Ly0/n;

.field public f:Lo0/i;

.field public g:Lo0/i;

.field public h:Lt1/w0;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/x0;->a:Landroidx/compose/ui/node/a;

    new-instance v0, Lt1/x;

    invoke-direct {v0, p1}, Lt1/x;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object v0, p0, Lt1/x0;->b:Lt1/x;

    iput-object v0, p0, Lt1/x0;->c:Lt1/c1;

    iget-object p1, v0, Lt1/x;->N:Lt1/s1;

    iput-object p1, p0, Lt1/x0;->d:Lt1/s1;

    iput-object p1, p0, Lt1/x0;->e:Ly0/n;

    return-void
.end method

.method public static final a(Lt1/x0;Ly0/n;Lt1/c1;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Ly0/n;->e:Ly0/n;

    :goto_0
    if-eqz p1, :cond_3

    sget-object v0, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lt1/x0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p1, p1, Lt1/x0;->b:Lt1/x;

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p2, Lt1/c1;->r:Lt1/c1;

    iput-object p2, p0, Lt1/x0;->c:Lt1/c1;

    goto :goto_2

    :cond_1
    iget v0, p1, Ly0/n;->c:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, p2}, Ly0/n;->F0(Lt1/c1;)V

    iget-object p1, p1, Ly0/n;->e:Ly0/n;

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public static b(Ly0/m;Ly0/n;)Ly0/n;
    .locals 2

    instance-of v0, p0, Lt1/u0;

    if-eqz v0, :cond_0

    check-cast p0, Lt1/u0;

    invoke-virtual {p0}, Lt1/u0;->l()Ly0/n;

    move-result-object p0

    invoke-static {p0}, Lt1/g;->n(Ly0/n;)I

    move-result v0

    iput v0, p0, Ly0/n;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt1/d;

    invoke-direct {v0}, Ly0/n;-><init>()V

    invoke-static {p0}, Lt1/g;->l(Ly0/m;)I

    move-result v1

    iput v1, v0, Ly0/n;->c:I

    iput-object p0, v0, Lt1/d;->u:Ly0/m;

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    iput-object p0, v0, Lt1/d;->w:Ljava/util/HashSet;

    move-object p0, v0

    :goto_0
    iget-boolean v0, p0, Ly0/n;->t:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Ly0/n;->p:Z

    iget-object v0, p1, Ly0/n;->f:Ly0/n;

    if-eqz v0, :cond_1

    iput-object p0, v0, Ly0/n;->e:Ly0/n;

    iput-object v0, p0, Ly0/n;->f:Ly0/n;

    :cond_1
    iput-object p0, p1, Ly0/n;->f:Ly0/n;

    iput-object p1, p0, Ly0/n;->e:Ly0/n;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "A ModifierNodeElement cannot return an already attached node from create() "

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ly0/n;)Ly0/n;
    .locals 3

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lt1/g;->i(Ly0/n;II)V

    invoke-virtual {p0}, Ly0/n;->E0()V

    invoke-virtual {p0}, Ly0/n;->y0()V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    iget-object v0, p0, Ly0/n;->f:Ly0/n;

    iget-object v1, p0, Ly0/n;->e:Ly0/n;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iput-object v1, v0, Ly0/n;->e:Ly0/n;

    iput-object v2, p0, Ly0/n;->f:Ly0/n;

    :cond_2
    if-eqz v1, :cond_3

    iput-object v0, v1, Ly0/n;->f:Ly0/n;

    iput-object v2, p0, Ly0/n;->e:Ly0/n;

    :cond_3
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v1
.end method

.method public static h(Ly0/m;Ly0/m;Ly0/n;)V
    .locals 2

    instance-of p0, p0, Lt1/u0;

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    instance-of p0, p1, Lt1/u0;

    if-eqz p0, :cond_1

    check-cast p1, Lt1/u0;

    sget-object p0, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    const-string p0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    invoke-static {p2, p0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lt1/u0;->m(Ly0/n;)V

    iget-boolean p0, p2, Ly0/n;->t:Z

    if-eqz p0, :cond_0

    invoke-static {p2}, Lt1/g;->k(Ly0/n;)V

    goto :goto_0

    :cond_0
    iput-boolean v0, p2, Ly0/n;->q:Z

    goto :goto_0

    :cond_1
    instance-of p0, p2, Lt1/d;

    if-eqz p0, :cond_5

    move-object p0, p2

    check-cast p0, Lt1/d;

    iget-boolean v1, p0, Ly0/n;->t:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lt1/d;->H0()V

    :cond_2
    iput-object p1, p0, Lt1/d;->u:Ly0/m;

    invoke-static {p1}, Lt1/g;->l(Ly0/m;)I

    move-result p1

    iput p1, p0, Ly0/n;->c:I

    iget-boolean p1, p0, Ly0/n;->t:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lt1/d;->G0(Z)V

    :cond_3
    iget-boolean p0, p2, Ly0/n;->t:Z

    if-eqz p0, :cond_4

    invoke-static {p2}, Lt1/g;->k(Ly0/n;)V

    goto :goto_0

    :cond_4
    iput-boolean v0, p2, Ly0/n;->q:Z

    :goto_0
    return-void

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unknown Modifier.Node type"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final d(I)Z
    .locals 1

    iget-object v0, p0, Lt1/x0;->e:Ly0/n;

    iget v0, v0, Ly0/n;->d:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lt1/x0;->e:Ly0/n;

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ly0/n;->D0()V

    iget-boolean v1, v0, Ly0/n;->p:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lt1/g;->h(Ly0/n;)V

    :cond_0
    iget-boolean v1, v0, Ly0/n;->q:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Lt1/g;->k(Ly0/n;)V

    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, v0, Ly0/n;->p:Z

    iput-boolean v1, v0, Ly0/n;->q:Z

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f(ILo0/i;Lo0/i;Ly0/n;Z)V
    .locals 29

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    iget-object v0, v7, Lt1/x0;->h:Lt1/w0;

    if-nez v0, :cond_0

    new-instance v11, Lt1/w0;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p5

    invoke-direct/range {v0 .. v6}, Lt1/w0;-><init>(Lt1/x0;Ly0/n;ILo0/i;Lo0/i;Z)V

    iput-object v11, v7, Lt1/x0;->h:Lt1/w0;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p4

    iput-object v1, v0, Lt1/w0;->a:Ly0/n;

    iput v8, v0, Lt1/w0;->b:I

    iput-object v9, v0, Lt1/w0;->c:Lo0/i;

    iput-object v10, v0, Lt1/w0;->d:Lo0/i;

    move/from16 v1, p5

    iput-boolean v1, v0, Lt1/w0;->e:Z

    :goto_0
    iget v1, v9, Lo0/i;->c:I

    sub-int/2addr v1, v8

    iget v2, v10, Lo0/i;->c:I

    sub-int/2addr v2, v8

    add-int v3, v1, v2

    const/4 v4, 0x1

    add-int/2addr v3, v4

    const/4 v5, 0x2

    div-int/2addr v3, v5

    new-instance v6, La4/c0;

    mul-int/lit8 v8, v3, 0x3

    const/4 v9, 0x0

    invoke-direct {v6, v8, v9}, La4/c0;-><init>(II)V

    new-instance v8, La4/c0;

    mul-int/lit8 v10, v3, 0x4

    invoke-direct {v8, v10, v9}, La4/c0;-><init>(II)V

    invoke-virtual {v8, v9, v1, v9, v2}, La4/c0;->m(IIII)V

    mul-int/2addr v3, v5

    add-int/2addr v3, v4

    new-array v10, v3, [I

    new-array v11, v3, [I

    const/4 v12, 0x5

    new-array v12, v12, [I

    :goto_1
    iget v13, v8, La4/c0;->a:I

    if-eqz v13, :cond_1b

    invoke-virtual {v8}, La4/c0;->k()I

    move-result v13

    invoke-virtual {v8}, La4/c0;->k()I

    move-result v15

    invoke-virtual {v8}, La4/c0;->k()I

    move-result v14

    invoke-virtual {v8}, La4/c0;->k()I

    move-result v9

    sub-int v5, v14, v9

    sub-int v7, v13, v15

    if-lt v5, v4, :cond_1

    if-ge v7, v4, :cond_2

    :cond_1
    move/from16 v23, v1

    move/from16 v24, v2

    move/from16 p5, v3

    goto/16 :goto_14

    :cond_2
    add-int v16, v5, v7

    add-int/lit8 v16, v16, 0x1

    const/16 v17, 0x2

    div-int/lit8 v4, v16, 0x2

    div-int/lit8 v16, v3, 0x2

    add-int/lit8 v17, v16, 0x1

    aput v9, v10, v17

    aput v14, v11, v17

    move/from16 p5, v3

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v4, :cond_1a

    sub-int v17, v5, v7

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(I)I

    move-result v18

    move/from16 v20, v4

    const/16 v19, 0x2

    rem-int/lit8 v4, v18, 0x2

    move/from16 v18, v5

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    neg-int v5, v3

    move/from16 v19, v7

    move v7, v5

    :goto_4
    const/16 v21, 0x4

    if-gt v7, v3, :cond_c

    if-eq v7, v5, :cond_6

    if-eq v7, v3, :cond_4

    add-int/lit8 v22, v7, 0x1

    add-int v22, v22, v16

    move/from16 v23, v1

    aget v1, v10, v22

    add-int/lit8 v22, v7, -0x1

    add-int v22, v22, v16

    move/from16 v24, v2

    aget v2, v10, v22

    if-le v1, v2, :cond_5

    goto :goto_5

    :cond_4
    move/from16 v23, v1

    move/from16 v24, v2

    :cond_5
    add-int/lit8 v1, v7, -0x1

    add-int v1, v1, v16

    aget v1, v10, v1

    add-int/lit8 v2, v1, 0x1

    goto :goto_6

    :cond_6
    move/from16 v23, v1

    move/from16 v24, v2

    :goto_5
    add-int/lit8 v1, v7, 0x1

    add-int v1, v1, v16

    aget v1, v10, v1

    move v2, v1

    :goto_6
    sub-int v22, v2, v9

    add-int v22, v22, v15

    sub-int v22, v22, v7

    if-eqz v3, :cond_8

    if-eq v2, v1, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v25, v22, -0x1

    goto :goto_8

    :cond_8
    :goto_7
    move/from16 v25, v22

    :goto_8
    move/from16 v28, v22

    move-object/from16 v22, v8

    move/from16 v8, v28

    :goto_9
    if-ge v2, v14, :cond_9

    if-ge v8, v13, :cond_9

    invoke-virtual {v0, v2, v8}, Lt1/w0;->a(II)Z

    move-result v26

    if-eqz v26, :cond_9

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_9
    add-int v26, v16, v7

    aput v2, v10, v26

    move/from16 v26, v4

    if-eqz v4, :cond_a

    sub-int v4, v17, v7

    move-object/from16 v27, v6

    add-int/lit8 v6, v5, 0x1

    if-lt v4, v6, :cond_b

    add-int/lit8 v6, v3, -0x1

    if-gt v4, v6, :cond_b

    add-int v4, v16, v4

    aget v4, v11, v4

    if-gt v4, v2, :cond_b

    const/4 v4, 0x0

    aput v1, v12, v4

    const/4 v1, 0x1

    aput v25, v12, v1

    const/4 v1, 0x2

    aput v2, v12, v1

    const/4 v1, 0x3

    aput v8, v12, v1

    aput v4, v12, v21

    move/from16 v25, v13

    move/from16 v26, v14

    const/4 v1, 0x1

    const/4 v2, 0x3

    goto/16 :goto_10

    :cond_a
    move-object/from16 v27, v6

    :cond_b
    add-int/lit8 v7, v7, 0x2

    move-object/from16 v8, v22

    move/from16 v1, v23

    move/from16 v2, v24

    move/from16 v4, v26

    move-object/from16 v6, v27

    goto/16 :goto_4

    :cond_c
    move/from16 v23, v1

    move/from16 v24, v2

    move-object/from16 v27, v6

    move-object/from16 v22, v8

    rem-int/lit8 v1, v17, 0x2

    if-nez v1, :cond_d

    const/4 v1, 0x1

    goto :goto_a

    :cond_d
    const/4 v1, 0x0

    :goto_a
    move v2, v5

    :goto_b
    if-gt v2, v3, :cond_19

    if-eq v2, v5, :cond_f

    if-eq v2, v3, :cond_e

    add-int/lit8 v4, v2, 0x1

    add-int v4, v4, v16

    aget v4, v11, v4

    add-int/lit8 v6, v2, -0x1

    add-int v6, v6, v16

    aget v6, v11, v6

    if-ge v4, v6, :cond_e

    goto :goto_c

    :cond_e
    add-int/lit8 v4, v2, -0x1

    add-int v4, v4, v16

    aget v4, v11, v4

    add-int/lit8 v6, v4, -0x1

    goto :goto_d

    :cond_f
    :goto_c
    add-int/lit8 v4, v2, 0x1

    add-int v4, v4, v16

    aget v4, v11, v4

    move v6, v4

    :goto_d
    sub-int v7, v14, v6

    sub-int/2addr v7, v2

    sub-int v7, v13, v7

    if-eqz v3, :cond_11

    if-eq v6, v4, :cond_10

    goto :goto_e

    :cond_10
    add-int/lit8 v8, v7, 0x1

    goto :goto_f

    :cond_11
    :goto_e
    move v8, v7

    :goto_f
    if-le v6, v9, :cond_12

    if-le v7, v15, :cond_12

    move/from16 v25, v13

    add-int/lit8 v13, v6, -0x1

    move/from16 v26, v14

    add-int/lit8 v14, v7, -0x1

    invoke-virtual {v0, v13, v14}, Lt1/w0;->a(II)Z

    move-result v13

    if-eqz v13, :cond_13

    add-int/lit8 v6, v6, -0x1

    add-int/lit8 v7, v7, -0x1

    move/from16 v13, v25

    move/from16 v14, v26

    goto :goto_f

    :cond_12
    move/from16 v25, v13

    move/from16 v26, v14

    :cond_13
    add-int v13, v16, v2

    aput v6, v11, v13

    if-eqz v1, :cond_18

    sub-int v13, v17, v2

    if-lt v13, v5, :cond_18

    if-gt v13, v3, :cond_18

    add-int v13, v16, v13

    aget v13, v10, v13

    if-lt v13, v6, :cond_18

    const/4 v13, 0x0

    aput v6, v12, v13

    const/4 v1, 0x1

    aput v7, v12, v1

    const/4 v2, 0x2

    aput v4, v12, v2

    const/4 v2, 0x3

    aput v8, v12, v2

    aput v1, v12, v21

    :goto_10
    invoke-static {v12}, Lt1/g;->q([I)I

    move-result v3

    if-lez v3, :cond_17

    aget v3, v12, v2

    aget v2, v12, v1

    sub-int/2addr v3, v2

    const/4 v1, 0x2

    aget v4, v12, v1

    const/4 v1, 0x0

    aget v5, v12, v1

    sub-int/2addr v4, v5

    if-eq v3, v4, :cond_16

    aget v1, v12, v21

    if-eqz v1, :cond_14

    invoke-static {v12}, Lt1/g;->q([I)I

    move-result v1

    move-object/from16 v6, v27

    invoke-virtual {v6, v5, v2, v1}, La4/c0;->l(III)V

    goto :goto_11

    :cond_14
    move-object/from16 v6, v27

    if-le v3, v4, :cond_15

    add-int/lit8 v2, v2, 0x1

    invoke-static {v12}, Lt1/g;->q([I)I

    move-result v1

    invoke-virtual {v6, v5, v2, v1}, La4/c0;->l(III)V

    goto :goto_11

    :cond_15
    add-int/lit8 v5, v5, 0x1

    invoke-static {v12}, Lt1/g;->q([I)I

    move-result v1

    invoke-virtual {v6, v5, v2, v1}, La4/c0;->l(III)V

    goto :goto_11

    :cond_16
    move-object/from16 v6, v27

    invoke-virtual {v6, v5, v2, v4}, La4/c0;->l(III)V

    :goto_11
    const/4 v1, 0x0

    goto :goto_12

    :cond_17
    move-object/from16 v6, v27

    goto :goto_11

    :goto_12
    aget v2, v12, v1

    const/4 v1, 0x1

    aget v3, v12, v1

    move-object/from16 v4, v22

    invoke-virtual {v4, v9, v2, v15, v3}, La4/c0;->m(IIII)V

    const/4 v1, 0x2

    aget v2, v12, v1

    const/4 v1, 0x3

    aget v1, v12, v1

    move/from16 v7, v25

    move/from16 v8, v26

    invoke-virtual {v4, v2, v8, v1, v7}, La4/c0;->m(IIII)V

    :goto_13
    const/4 v5, 0x2

    move-object/from16 v7, p0

    move/from16 v3, p5

    move-object v8, v4

    move/from16 v1, v23

    move/from16 v2, v24

    const/4 v9, 0x0

    const/4 v4, 0x1

    goto/16 :goto_1

    :cond_18
    move-object/from16 v4, v22

    move/from16 v7, v25

    move/from16 v8, v26

    move-object/from16 v6, v27

    add-int/lit8 v2, v2, 0x2

    move-object/from16 v22, v4

    move-object/from16 v27, v6

    move v13, v7

    move v14, v8

    goto/16 :goto_b

    :cond_19
    move v7, v13

    move v8, v14

    move-object/from16 v4, v22

    move-object/from16 v6, v27

    add-int/lit8 v3, v3, 0x1

    move/from16 v5, v18

    move/from16 v7, v19

    move/from16 v1, v23

    move/from16 v2, v24

    move-object v8, v4

    move/from16 v4, v20

    goto/16 :goto_2

    :cond_1a
    move/from16 v23, v1

    move/from16 v24, v2

    :goto_14
    move-object v4, v8

    goto :goto_13

    :cond_1b
    move/from16 v23, v1

    move/from16 v24, v2

    iget v1, v6, La4/c0;->a:I

    rem-int/lit8 v2, v1, 0x3

    if-nez v2, :cond_27

    const/4 v2, 0x3

    if-le v1, v2, :cond_1c

    sub-int/2addr v1, v2

    const/4 v4, 0x0

    invoke-virtual {v6, v4, v1}, La4/c0;->n(II)V

    :goto_15
    move/from16 v1, v23

    move/from16 v2, v24

    goto :goto_16

    :cond_1c
    const/4 v4, 0x0

    goto :goto_15

    :goto_16
    invoke-virtual {v6, v1, v2, v4}, La4/c0;->l(III)V

    move v1, v4

    move v2, v1

    move v3, v2

    :cond_1d
    iget v5, v6, La4/c0;->a:I

    if-ge v1, v5, :cond_25

    iget-object v5, v6, La4/c0;->b:Ljava/lang/Object;

    move-object v7, v5

    check-cast v7, [I

    aget v7, v7, v1

    add-int/lit8 v8, v1, 0x2

    move-object v9, v5

    check-cast v9, [I

    aget v9, v9, v8

    sub-int/2addr v7, v9

    add-int/lit8 v9, v1, 0x1

    move-object v10, v5

    check-cast v10, [I

    aget v9, v10, v9

    move-object v10, v5

    check-cast v10, [I

    aget v10, v10, v8

    sub-int/2addr v9, v10

    check-cast v5, [I

    aget v5, v5, v8

    add-int/lit8 v1, v1, 0x3

    :goto_17
    iget-object v8, v0, Lt1/w0;->f:Lt1/x0;

    if-ge v2, v7, :cond_20

    iget-object v10, v0, Lt1/w0;->a:Ly0/n;

    iget-object v10, v10, Ly0/n;->f:Ly0/n;

    invoke-static {v10}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v11, v10, Ly0/n;->c:I

    const/4 v12, 0x2

    and-int/2addr v11, v12

    if-eqz v11, :cond_1f

    iget-object v11, v10, Ly0/n;->o:Lt1/c1;

    invoke-static {v11}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v13, v11, Lt1/c1;->r:Lt1/c1;

    iget-object v11, v11, Lt1/c1;->q:Lt1/c1;

    invoke-static {v11}, Ld7/a;->j(Ljava/lang/Object;)V

    if-nez v13, :cond_1e

    goto :goto_18

    :cond_1e
    iput-object v11, v13, Lt1/c1;->q:Lt1/c1;

    :goto_18
    iput-object v13, v11, Lt1/c1;->r:Lt1/c1;

    iget-object v13, v0, Lt1/w0;->a:Ly0/n;

    invoke-static {v8, v13, v11}, Lt1/x0;->a(Lt1/x0;Ly0/n;Lt1/c1;)V

    :cond_1f
    invoke-static {v10}, Lt1/x0;->c(Ly0/n;)Ly0/n;

    move-result-object v8

    iput-object v8, v0, Lt1/w0;->a:Ly0/n;

    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_20
    const/4 v12, 0x2

    :goto_19
    if-ge v3, v9, :cond_23

    iget v7, v0, Lt1/w0;->b:I

    add-int/2addr v7, v3

    iget-object v10, v0, Lt1/w0;->a:Ly0/n;

    iget-object v11, v0, Lt1/w0;->d:Lo0/i;

    iget-object v11, v11, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v7, v11, v7

    check-cast v7, Ly0/m;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v10}, Lt1/x0;->b(Ly0/m;Ly0/n;)Ly0/n;

    move-result-object v7

    iput-object v7, v0, Lt1/w0;->a:Ly0/n;

    iget-boolean v10, v0, Lt1/w0;->e:Z

    if-eqz v10, :cond_22

    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, v7, Ly0/n;->o:Lt1/c1;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v10, v0, Lt1/w0;->a:Ly0/n;

    invoke-static {v10}, Lt1/g;->g(Ly0/n;)Lt1/b0;

    move-result-object v10

    if-eqz v10, :cond_21

    new-instance v11, Lt1/c0;

    iget-object v13, v8, Lt1/x0;->a:Landroidx/compose/ui/node/a;

    invoke-direct {v11, v13, v10}, Lt1/c0;-><init>(Landroidx/compose/ui/node/a;Lt1/b0;)V

    iget-object v10, v0, Lt1/w0;->a:Ly0/n;

    invoke-virtual {v10, v11}, Ly0/n;->F0(Lt1/c1;)V

    iget-object v10, v0, Lt1/w0;->a:Ly0/n;

    invoke-static {v8, v10, v11}, Lt1/x0;->a(Lt1/x0;Ly0/n;Lt1/c1;)V

    iget-object v10, v7, Lt1/c1;->r:Lt1/c1;

    iput-object v10, v11, Lt1/c1;->r:Lt1/c1;

    iput-object v7, v11, Lt1/c1;->q:Lt1/c1;

    iput-object v11, v7, Lt1/c1;->r:Lt1/c1;

    goto :goto_1a

    :cond_21
    iget-object v10, v0, Lt1/w0;->a:Ly0/n;

    invoke-virtual {v10, v7}, Ly0/n;->F0(Lt1/c1;)V

    :goto_1a
    iget-object v7, v0, Lt1/w0;->a:Ly0/n;

    invoke-virtual {v7}, Ly0/n;->x0()V

    iget-object v7, v0, Lt1/w0;->a:Ly0/n;

    invoke-virtual {v7}, Ly0/n;->D0()V

    iget-object v7, v0, Lt1/w0;->a:Ly0/n;

    invoke-static {v7}, Lt1/g;->h(Ly0/n;)V

    const/4 v10, 0x1

    goto :goto_1b

    :cond_22
    const/4 v10, 0x1

    iput-boolean v10, v7, Ly0/n;->p:Z

    :goto_1b
    add-int/lit8 v3, v3, 0x1

    goto :goto_19

    :cond_23
    const/4 v10, 0x1

    :goto_1c
    add-int/lit8 v7, v5, -0x1

    if-lez v5, :cond_1d

    iget-object v5, v0, Lt1/w0;->a:Ly0/n;

    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iput-object v5, v0, Lt1/w0;->a:Ly0/n;

    iget-object v5, v0, Lt1/w0;->c:Lo0/i;

    iget v9, v0, Lt1/w0;->b:I

    add-int v11, v9, v2

    iget-object v5, v5, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v5, v5, v11

    check-cast v5, Ly0/m;

    iget-object v11, v0, Lt1/w0;->d:Lo0/i;

    add-int/2addr v9, v3

    iget-object v11, v11, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v9, v11, v9

    check-cast v9, Ly0/m;

    invoke-static {v5, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_24

    iget-object v11, v0, Lt1/w0;->a:Ly0/n;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v9, v11}, Lt1/x0;->h(Ly0/m;Ly0/m;Ly0/n;)V

    goto :goto_1d

    :cond_24
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1d
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, v3, 0x1

    move v5, v7

    goto :goto_1c

    :cond_25
    move-object/from16 v1, p0

    iget-object v0, v1, Lt1/x0;->d:Lt1/s1;

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    move v9, v4

    :goto_1e
    if-eqz v0, :cond_26

    sget-object v2, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    if-eq v0, v2, :cond_26

    iget v2, v0, Ly0/n;->c:I

    or-int/2addr v9, v2

    iput v9, v0, Ly0/n;->d:I

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_1e

    :cond_26
    return-void

    :cond_27
    move-object/from16 v1, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Array size not a multiple of 3"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()V
    .locals 5

    iget-object v0, p0, Lt1/x0;->d:Lt1/s1;

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    iget-object v1, p0, Lt1/x0;->b:Lt1/x;

    :goto_0
    iget-object v2, p0, Lt1/x0;->a:Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lt1/g;->g(Ly0/n;)Lt1/b0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, v0, Ly0/n;->o:Lt1/c1;

    if-eqz v4, :cond_0

    check-cast v4, Lt1/c0;

    iget-object v2, v4, Lt1/c0;->N:Lt1/b0;

    iput-object v3, v4, Lt1/c0;->N:Lt1/b0;

    if-eq v2, v0, :cond_1

    iget-object v2, v4, Lt1/c1;->H:Lt1/j1;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lt1/j1;->invalidate()V

    goto :goto_1

    :cond_0
    new-instance v4, Lt1/c0;

    invoke-direct {v4, v2, v3}, Lt1/c0;-><init>(Landroidx/compose/ui/node/a;Lt1/b0;)V

    invoke-virtual {v0, v4}, Ly0/n;->F0(Lt1/c1;)V

    :cond_1
    :goto_1
    iput-object v4, v1, Lt1/c1;->r:Lt1/c1;

    iput-object v1, v4, Lt1/c1;->q:Lt1/c1;

    move-object v1, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Ly0/n;->F0(Lt1/c1;)V

    :goto_2
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    iput-object v0, v1, Lt1/c1;->r:Lt1/c1;

    iput-object v1, p0, Lt1/x0;->c:Lt1/c1;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt1/x0;->e:Ly0/n;

    iget-object v2, p0, Lt1/x0;->d:Lt1/s1;

    const-string v3, "]"

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Ly0/n;->f:Ly0/n;

    if-ne v4, v2, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
