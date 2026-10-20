.class public final La2/i;
.super Ljava/lang/Object;


# instance fields
.field public final a:La2/k;

.field public final b:I

.field public final c:Z

.field public final d:F

.field public final e:F

.field public final f:I

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La2/k;JIZ)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, La2/i;->a:La2/k;

    move/from16 v2, p4

    iput v2, v0, La2/i;->b:I

    invoke-static/range {p2 .. p3}, Lm2/a;->k(J)I

    move-result v2

    if-nez v2, :cond_a

    invoke-static/range {p2 .. p3}, Lm2/a;->j(J)I

    move-result v2

    if-nez v2, :cond_a

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v1, La2/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v6, v3, :cond_4

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La2/n;

    iget-object v8, v7, La2/n;->a:La2/o;

    invoke-static/range {p2 .. p3}, Lm2/a;->i(J)I

    move-result v9

    invoke-static/range {p2 .. p3}, Lm2/a;->d(J)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-static/range {p2 .. p3}, Lm2/a;->h(J)I

    move-result v10

    float-to-double v14, v13

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-float v12, v14

    float-to-int v12, v12

    sub-int/2addr v10, v12

    if-gez v10, :cond_1

    const/4 v10, 0x0

    goto :goto_1

    :cond_0
    invoke-static/range {p2 .. p3}, Lm2/a;->h(J)I

    move-result v10

    :cond_1
    :goto_1
    const/4 v12, 0x5

    invoke-static {v9, v10, v12}, Lo1/s;->b(III)J

    move-result-wide v18

    iget v9, v0, La2/i;->b:I

    sub-int v16, v9, v11

    new-instance v9, La2/a;

    const-string v10, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics"

    invoke-static {v8, v10}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v8

    check-cast v15, Li2/d;

    move-object v14, v9

    move/from16 v17, p5

    invoke-direct/range {v14 .. v19}, La2/a;-><init>(Li2/d;IZJ)V

    invoke-virtual {v9}, La2/a;->b()F

    move-result v8

    add-float v15, v8, v13

    iget-object v14, v9, La2/a;->d:Lb2/v;

    iget v8, v14, Lb2/v;->e:I

    add-int v12, v11, v8

    new-instance v10, La2/m;

    iget v8, v7, La2/n;->b:I

    iget v7, v7, La2/n;->c:I

    move/from16 v16, v7

    move-object v7, v10

    move/from16 v17, v8

    move-object v8, v9

    move/from16 v9, v17

    move-object v5, v10

    move/from16 v10, v16

    move/from16 p4, v12

    move-object v4, v14

    move v14, v15

    invoke-direct/range {v7 .. v14}, La2/m;-><init>(La2/a;IIIIFF)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v4, v4, Lb2/v;->c:Z

    if-nez v4, :cond_3

    iget v4, v0, La2/i;->b:I

    move/from16 v11, p4

    if-ne v11, v4, :cond_2

    iget-object v4, v0, La2/i;->a:La2/k;

    iget-object v4, v4, La2/k;->e:Ljava/util/ArrayList;

    invoke-static {v4}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v4

    if-eq v6, v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    move v13, v15

    goto/16 :goto_0

    :cond_3
    move/from16 v11, p4

    :goto_2
    const/4 v1, 0x1

    move v13, v15

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    iput v13, v0, La2/i;->e:F

    iput v11, v0, La2/i;->f:I

    iput-boolean v1, v0, La2/i;->c:Z

    iput-object v2, v0, La2/i;->h:Ljava/util/ArrayList;

    invoke-static/range {p2 .. p3}, Lm2/a;->i(J)I

    move-result v1

    int-to-float v1, v1

    iput v1, v0, La2/i;->d:F

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_4
    const/4 v5, 0x0

    if-ge v4, v3, :cond_7

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La2/m;

    iget-object v7, v6, La2/m;->a:La2/l;

    check-cast v7, La2/a;

    iget-object v7, v7, La2/a;->f:Ljava/util/List;

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v9, :cond_6

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld1/d;

    if-eqz v11, :cond_5

    iget v12, v6, La2/m;->f:F

    const/4 v13, 0x0

    invoke-static {v13, v12}, Ld9/i;->f(FF)J

    move-result-wide v14

    invoke-virtual {v11, v14, v15}, Ld1/d;->g(J)Ld1/d;

    move-result-object v11

    goto :goto_6

    :cond_5
    const/4 v13, 0x0

    move-object v11, v5

    :goto_6
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_6
    const/4 v13, 0x0

    invoke-static {v8, v1}, Lr8/n;->A0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v3, v0, La2/i;->a:La2/k;

    iget-object v3, v3, La2/k;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    iget-object v2, v0, La2/i;->a:La2/k;

    iget-object v2, v2, La2/k;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v2, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v2, :cond_8

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_8
    invoke-static {v3, v1}, Lr8/p;->P0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    :cond_9
    iput-object v1, v0, La2/i;->g:Ljava/util/ArrayList;

    return-void

    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static a(La2/i;Le1/p;JLe1/k0;Ll2/j;Lg1/h;)V
    .locals 13

    const/4 v8, 0x3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Le1/p;->j()V

    move-object v0, p0

    iget-object v9, v0, La2/i;->h:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v0, 0x0

    move v11, v0

    :goto_0
    if-ge v11, v10, :cond_0

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, La2/m;

    iget-object v0, v12, La2/m;->a:La2/l;

    check-cast v0, La2/a;

    move-object v1, p1

    move-wide v2, p2

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move v7, v8

    invoke-virtual/range {v0 .. v7}, La2/a;->e(Le1/p;JLe1/k0;Ll2/j;Lg1/h;I)V

    iget-object v0, v12, La2/m;->a:La2/l;

    check-cast v0, La2/a;

    invoke-virtual {v0}, La2/a;->b()F

    move-result v0

    const/4 v1, 0x0

    move-object v2, p1

    invoke-interface {p1, v1, v0}, Le1/p;->e(FF)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    move-object v2, p1

    invoke-interface {p1}, Le1/p;->h()V

    return-void
.end method

.method public static b(La2/i;Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;)V
    .locals 16

    move-object/from16 v2, p2

    const/4 v8, 0x3

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface/range {p1 .. p1}, Le1/p;->j()V

    move-object/from16 v0, p0

    iget-object v9, v0, La2/i;->h:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-gt v1, v3, :cond_1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move v7, v8

    invoke-static/range {v0 .. v7}, Lo1/s;->s(La2/i;Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;I)V

    :cond_0
    :goto_0
    move-object/from16 v2, p1

    goto/16 :goto_3

    :cond_1
    instance-of v1, v2, Le1/n0;

    if-eqz v1, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move v7, v8

    invoke-static/range {v0 .. v7}, Lo1/s;->s(La2/i;Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;I)V

    goto :goto_0

    :cond_2
    instance-of v0, v2, Le1/j0;

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v10, 0x0

    move v3, v1

    move v4, v10

    move v5, v4

    :goto_1
    if-ge v3, v0, :cond_3

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La2/m;

    iget-object v7, v6, La2/m;->a:La2/l;

    check-cast v7, La2/a;

    invoke-virtual {v7}, La2/a;->b()F

    move-result v7

    add-float/2addr v5, v7

    iget-object v6, v6, La2/m;->a:La2/l;

    check-cast v6, La2/a;

    invoke-virtual {v6}, La2/a;->c()F

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    move-result v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v2

    check-cast v0, Le1/j0;

    invoke-static {v4, v5}, Ld7/t;->j(FF)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Le1/j0;->b(J)Landroid/graphics/Shader;

    move-result-object v11

    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v13

    move v14, v1

    :goto_2
    if-ge v14, v13, :cond_0

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, La2/m;

    iget-object v0, v15, La2/m;->a:La2/l;

    new-instance v2, Le1/o;

    invoke-direct {v2, v11}, Le1/o;-><init>(Landroid/graphics/Shader;)V

    check-cast v0, La2/a;

    move-object/from16 v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move v7, v8

    invoke-virtual/range {v0 .. v7}, La2/a;->f(Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;I)V

    iget-object v0, v15, La2/m;->a:La2/l;

    check-cast v0, La2/a;

    invoke-virtual {v0}, La2/a;->b()F

    move-result v1

    move-object/from16 v2, p1

    invoke-interface {v2, v10, v1}, Le1/p;->e(FF)V

    invoke-virtual {v0}, La2/a;->b()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {v12, v10, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-virtual {v11, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :goto_3
    invoke-interface/range {p1 .. p1}, Le1/p;->h()V

    return-void
.end method


# virtual methods
.method public final c(I)V
    .locals 3

    iget-object v0, p0, La2/i;->a:La2/k;

    if-ltz p1, :cond_0

    iget-object v1, v0, La2/k;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p1, v1, :cond_0

    return-void

    :cond_0
    const-string v1, "offset("

    const-string v2, ") is out of bounds [0, "

    invoke-static {v1, p1, v2}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, v0, La2/k;->a:La2/e;

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(I)V
    .locals 3

    iget-object v0, p0, La2/i;->a:La2/k;

    if-ltz p1, :cond_0

    iget-object v1, v0, La2/k;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    const-string v1, "offset("

    const-string v2, ") is out of bounds [0, "

    invoke-static {v1, p1, v2}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, v0, La2/k;->a:La2/e;

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(I)V
    .locals 3

    iget v0, p0, La2/i;->f:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lineIndex("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0, "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
