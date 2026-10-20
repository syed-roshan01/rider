.class public final La2/k;
.super Ljava/lang/Object;

# interfaces
.implements La2/o;


# instance fields
.field public final a:La2/e;

.field public final b:Ljava/util/List;

.field public final c:Lq8/c;

.field public final d:Lq8/c;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La2/e;La2/c0;Ljava/util/List;Lm2/b;Lf2/d;)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, La2/k;->a:La2/e;

    move-object/from16 v3, p3

    iput-object v3, v0, La2/k;->b:Ljava/util/List;

    sget-object v3, Lq8/d;->a:[Lq8/d;

    new-instance v3, La2/j;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, La2/j;-><init>(La2/k;I)V

    invoke-static {v3}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v3

    iput-object v3, v0, La2/k;->c:Lq8/c;

    new-instance v3, La2/j;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, La2/j;-><init>(La2/k;I)V

    invoke-static {v3}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v3

    iput-object v3, v0, La2/k;->d:Lq8/c;

    sget-object v3, La2/f;->a:La2/e;

    iget-object v3, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sget-object v5, Lr8/r;->a:Lr8/r;

    iget-object v6, v1, La2/e;->c:Ljava/util/List;

    if-nez v6, :cond_0

    move-object v6, v5

    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    move v9, v4

    move v10, v9

    :goto_0
    iget-object v11, v2, La2/c0;->b:La2/p;

    if-ge v9, v8, :cond_2

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La2/d;

    iget-object v13, v12, La2/d;->a:Ljava/lang/Object;

    check-cast v13, La2/p;

    iget v14, v12, La2/d;->b:I

    if-eq v14, v10, :cond_1

    new-instance v15, La2/d;

    invoke-direct {v15, v11, v10, v14}, La2/d;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v10, La2/d;

    invoke-virtual {v11, v13}, La2/p;->a(La2/p;)La2/p;

    move-result-object v11

    iget v12, v12, La2/d;->c:I

    invoke-direct {v10, v11, v14, v12}, La2/d;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move v10, v12

    goto :goto_0

    :cond_2
    if-eq v10, v3, :cond_3

    new-instance v6, La2/d;

    invoke-direct {v6, v11, v10, v3}, La2/d;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, La2/d;

    invoke-direct {v3, v11, v4, v4}, La2/d;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v8, v4

    :goto_1
    if-ge v8, v6, :cond_c

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La2/d;

    iget v10, v9, La2/d;->b:I

    iget v12, v9, La2/d;->c:I

    if-eq v10, v12, :cond_5

    iget-object v13, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v13, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    const-string v14, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v13, v14}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    move-object/from16 v18, v13

    goto :goto_3

    :cond_5
    const-string v13, ""

    goto :goto_2

    :goto_3
    invoke-static {v1, v10, v12}, La2/f;->b(La2/e;II)Ljava/util/List;

    move-result-object v10

    iget-object v13, v9, La2/d;->a:Ljava/lang/Object;

    check-cast v13, La2/p;

    iget v14, v13, La2/p;->b:I

    const/high16 v15, -0x80000000

    invoke-static {v14, v15}, Ll2/k;->a(II)Z

    move-result v14

    if-nez v14, :cond_6

    move-object/from16 v34, v3

    move-object/from16 v30, v5

    move/from16 v31, v6

    move-object/from16 v32, v7

    move/from16 v33, v8

    goto :goto_4

    :cond_6
    iget v14, v11, La2/p;->b:I

    iget v15, v13, La2/p;->a:I

    move-object/from16 v30, v5

    iget-wide v4, v13, La2/p;->c:J

    iget-object v1, v13, La2/p;->d:Ll2/q;

    move/from16 v31, v6

    iget-object v6, v13, La2/p;->e:La2/r;

    move-object/from16 v32, v7

    iget-object v7, v13, La2/p;->f:Ll2/g;

    move/from16 v33, v8

    iget v8, v13, La2/p;->g:I

    move-object/from16 v34, v3

    iget v3, v13, La2/p;->h:I

    iget-object v13, v13, La2/p;->i:Ll2/r;

    new-instance v16, La2/p;

    move-object/from16 v19, v16

    move/from16 v20, v15

    move/from16 v21, v14

    move-wide/from16 v22, v4

    move-object/from16 v24, v1

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    move/from16 v27, v8

    move/from16 v28, v3

    move-object/from16 v29, v13

    invoke-direct/range {v19 .. v29}, La2/p;-><init>(IIJLl2/q;La2/r;Ll2/g;IILl2/r;)V

    move-object/from16 v13, v16

    :goto_4
    new-instance v1, La2/n;

    new-instance v15, La2/c0;

    invoke-virtual {v11, v13}, La2/p;->a(La2/p;)La2/p;

    move-result-object v3

    iget-object v4, v2, La2/c0;->a:La2/x;

    invoke-direct {v15, v4, v3}, La2/c0;-><init>(La2/x;La2/p;)V

    if-nez v10, :cond_7

    move-object/from16 v19, v30

    goto :goto_5

    :cond_7
    move-object/from16 v19, v10

    :goto_5
    iget-object v3, v0, La2/k;->b:Ljava/util/List;

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_6
    iget v7, v9, La2/d;->b:I

    if-ge v6, v5, :cond_9

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, La2/d;

    iget v13, v10, La2/d;->b:I

    iget v10, v10, La2/d;->c:I

    invoke-static {v7, v12, v13, v10}, La2/f;->c(IIII)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_9
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_b

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La2/d;

    iget v9, v8, La2/d;->b:I

    if-gt v7, v9, :cond_a

    iget v10, v8, La2/d;->c:I

    if-gt v10, v12, :cond_a

    new-instance v13, La2/d;

    sub-int/2addr v9, v7

    sub-int/2addr v10, v7

    iget-object v8, v8, La2/d;->a:Ljava/lang/Object;

    invoke-direct {v13, v8, v9, v10}, La2/d;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "placeholder can not overlap with paragraph."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v4, Li2/d;

    move-object v14, v4

    move-object/from16 v16, p5

    move-object/from16 v17, p4

    move-object/from16 v20, v3

    invoke-direct/range {v14 .. v20}, Li2/d;-><init>(La2/c0;Lf2/d;Lm2/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-direct {v1, v4, v7, v12}, La2/n;-><init>(Li2/d;II)V

    move-object/from16 v3, v34

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v33, 0x1

    move-object/from16 v1, p1

    move-object/from16 v5, v30

    move/from16 v6, v31

    move-object/from16 v7, v32

    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_c
    iput-object v3, v0, La2/k;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget-object v0, p0, La2/k;->c:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 5

    iget-object v0, p0, La2/k;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La2/n;

    iget-object v4, v4, La2/n;->a:La2/o;

    invoke-interface {v4}, La2/o;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, La2/k;->d:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method
