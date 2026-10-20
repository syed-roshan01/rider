.class public abstract Lu1/r0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ld1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld1/d;

    const/4 v1, 0x0

    const/high16 v2, 0x41200000    # 10.0f

    invoke-direct {v0, v1, v1, v2, v2}, Ld1/d;-><init>(FFFF)V

    sput-object v0, Lu1/r0;->a:Ld1/d;

    return-void
.end method

.method public static final a(Ly1/o;)Z
    .locals 1

    invoke-virtual {p0}, Ly1/o;->h()Ly1/j;

    move-result-object p0

    sget-object v0, Ly1/r;->i:Ly1/u;

    invoke-static {p0, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(ILjava/util/ArrayList;)Lu1/r2;
    .locals 3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu1/r2;

    iget v2, v2, Lu1/r2;->a:I

    if-ne v2, p0, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu1/r2;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ly1/g;->a(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "android.widget.Button"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, Ly1/g;->a(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "android.widget.CheckBox"

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    invoke-static {p0, v0}, Ly1/g;->a(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "android.widget.RadioButton"

    goto :goto_0

    :cond_2
    const/4 v0, 0x5

    invoke-static {p0, v0}, Ly1/g;->a(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "android.widget.ImageView"

    goto :goto_0

    :cond_3
    const/4 v0, 0x6

    invoke-static {p0, v0}, Ly1/g;->a(II)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "android.widget.Spinner"

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/node/a;Lu1/s;)Landroidx/compose/ui/node/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p1, p0}, Lu1/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Landroid/graphics/Region;Ly1/o;Ljava/util/LinkedHashMap;Ly1/o;Landroid/graphics/Region;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    iget-object v5, v3, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->D()Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    iget-object v8, v3, Ly1/o;->c:Landroidx/compose/ui/node/a;

    if-eqz v5, :cond_1

    invoke-virtual {v8}, Landroidx/compose/ui/node/a;->C()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v6

    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Region;->isEmpty()Z

    move-result v9

    iget v10, v1, Ly1/o;->g:I

    iget v11, v3, Ly1/o;->g:I

    if-eqz v9, :cond_2

    if-ne v11, v10, :cond_3

    :cond_2
    if-eqz v5, :cond_4

    iget-boolean v5, v3, Ly1/o;->e:Z

    if-nez v5, :cond_4

    :cond_3
    return-void

    :cond_4
    iget-object v5, v3, Ly1/o;->d:Ly1/j;

    iget-boolean v9, v5, Ly1/j;->b:Z

    iget-object v12, v3, Ly1/o;->a:Ly0/n;

    if-eqz v9, :cond_5

    invoke-static {v8}, Lo1/s;->K(Landroidx/compose/ui/node/a;)Lt1/r1;

    move-result-object v8

    if-eqz v8, :cond_5

    move-object v12, v8

    :cond_5
    check-cast v12, Ly0/n;

    iget-object v8, v12, Ly0/n;->a:Ly0/n;

    sget-object v9, Ly1/i;->b:Ly1/u;

    iget-object v5, v5, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6

    const/4 v5, 0x0

    :cond_6
    if-eqz v5, :cond_7

    move v5, v6

    goto :goto_2

    :cond_7
    move v5, v7

    :goto_2
    iget-object v9, v8, Ly0/n;->a:Ly0/n;

    iget-boolean v9, v9, Ly0/n;->t:Z

    sget-object v12, Ld1/d;->e:Ld1/d;

    if-nez v9, :cond_8

    goto/16 :goto_4

    :cond_8
    const/16 v9, 0x8

    if-nez v5, :cond_9

    invoke-static {v8, v9}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v5

    invoke-static {v5}, Landroidx/compose/ui/layout/a;->d(Lr1/s;)Lr1/s;

    move-result-object v8

    invoke-interface {v8, v5, v6}, Lr1/s;->b(Lr1/s;Z)Ld1/d;

    move-result-object v12

    goto/16 :goto_4

    :cond_9
    invoke-static {v8, v9}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v5

    invoke-virtual {v5}, Lt1/c1;->K0()Ly0/n;

    move-result-object v8

    iget-boolean v8, v8, Ly0/n;->t:Z

    if-nez v8, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {v5}, Landroidx/compose/ui/layout/a;->d(Lr1/s;)Lr1/s;

    move-result-object v8

    iget-object v9, v5, Lt1/c1;->C:Ld1/b;

    if-nez v9, :cond_b

    new-instance v9, Ld1/b;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    const/4 v13, 0x0

    iput v13, v9, Ld1/b;->a:F

    iput v13, v9, Ld1/b;->b:F

    iput v13, v9, Ld1/b;->c:F

    iput v13, v9, Ld1/b;->d:F

    iput-object v9, v5, Lt1/c1;->C:Ld1/b;

    :cond_b
    invoke-virtual {v5}, Lt1/c1;->J0()J

    move-result-wide v13

    invoke-virtual {v5, v13, v14}, Lt1/c1;->A0(J)J

    move-result-wide v13

    invoke-static {v13, v14}, Ld1/f;->d(J)F

    move-result v15

    neg-float v15, v15

    iput v15, v9, Ld1/b;->a:F

    invoke-static {v13, v14}, Ld1/f;->b(J)F

    move-result v15

    neg-float v15, v15

    iput v15, v9, Ld1/b;->b:F

    invoke-virtual {v5}, Lr1/x0;->b0()I

    move-result v15

    int-to-float v15, v15

    invoke-static {v13, v14}, Ld1/f;->d(J)F

    move-result v16

    add-float v15, v16, v15

    iput v15, v9, Ld1/b;->c:F

    invoke-virtual {v5}, Lr1/x0;->a0()I

    move-result v15

    int-to-float v15, v15

    invoke-static {v13, v14}, Ld1/f;->b(J)F

    move-result v13

    add-float/2addr v13, v15

    iput v13, v9, Ld1/b;->d:F

    :goto_3
    if-eq v5, v8, :cond_d

    invoke-virtual {v5, v9, v7, v6}, Lt1/c1;->W0(Ld1/b;ZZ)V

    invoke-virtual {v9}, Ld1/b;->b()Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_4

    :cond_c
    iget-object v5, v5, Lt1/c1;->r:Lt1/c1;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_3

    :cond_d
    new-instance v12, Ld1/d;

    iget v5, v9, Ld1/b;->a:F

    iget v8, v9, Ld1/b;->b:F

    iget v13, v9, Ld1/b;->c:F

    iget v9, v9, Ld1/b;->d:F

    invoke-direct {v12, v5, v8, v13, v9}, Ld1/d;-><init>(FFFF)V

    :goto_4
    iget v5, v12, Ld1/d;->a:F

    invoke-static {v5}, Ld7/t;->p0(F)I

    move-result v5

    iget v8, v12, Ld1/d;->b:F

    invoke-static {v8}, Ld7/t;->p0(F)I

    move-result v8

    iget v9, v12, Ld1/d;->c:F

    invoke-static {v9}, Ld7/t;->p0(F)I

    move-result v9

    iget v12, v12, Ld1/d;->d:F

    invoke-static {v12}, Ld7/t;->p0(F)I

    move-result v12

    invoke-virtual {v4, v5, v8, v9, v12}, Landroid/graphics/Region;->set(IIII)Z

    const/4 v13, -0x1

    if-ne v11, v10, :cond_e

    move v11, v13

    :cond_e
    sget-object v10, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {v4, v0, v10}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-instance v11, Lu1/s2;

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v14

    invoke-direct {v11, v3, v14}, Lu1/s2;-><init>(Ly1/o;Landroid/graphics/Rect;)V

    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v7, v6}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v6

    :goto_5
    if-ge v13, v10, :cond_f

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly1/o;

    invoke-static {v0, v1, v2, v6, v4}, Lu1/r0;->e(Landroid/graphics/Region;Ly1/o;Ljava/util/LinkedHashMap;Ly1/o;Landroid/graphics/Region;)V

    add-int/lit8 v10, v10, -0x1

    goto :goto_5

    :cond_f
    invoke-static/range {p3 .. p3}, Lu1/r0;->g(Ly1/o;)Z

    move-result v1

    if-eqz v1, :cond_13

    sget-object v6, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object/from16 v0, p0

    move v1, v5

    move v2, v8

    move v3, v9

    move v4, v12

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    goto :goto_7

    :cond_10
    iget-boolean v0, v3, Ly1/o;->e:Z

    if-eqz v0, :cond_12

    invoke-virtual/range {p3 .. p3}, Ly1/o;->i()Ly1/o;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v1, v0, Ly1/o;->c:Landroidx/compose/ui/node/a;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v1

    if-ne v1, v6, :cond_11

    invoke-virtual {v0}, Ly1/o;->e()Ld1/d;

    move-result-object v0

    goto :goto_6

    :cond_11
    sget-object v0, Lu1/r0;->a:Ld1/d;

    :goto_6
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Lu1/s2;

    new-instance v5, Landroid/graphics/Rect;

    iget v6, v0, Ld1/d;->a:F

    invoke-static {v6}, Ld7/t;->p0(F)I

    move-result v6

    iget v7, v0, Ld1/d;->b:F

    invoke-static {v7}, Ld7/t;->p0(F)I

    move-result v7

    iget v8, v0, Ld1/d;->c:F

    invoke-static {v8}, Ld7/t;->p0(F)I

    move-result v8

    iget v0, v0, Ld1/d;->d:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-direct {v5, v6, v7, v8, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {v4, v3, v5}, Lu1/s2;-><init>(Ly1/o;Landroid/graphics/Rect;)V

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_12
    if-ne v11, v13, :cond_13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lu1/s2;

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lu1/s2;-><init>(Ly1/o;Landroid/graphics/Rect;)V

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    :goto_7
    return-void
.end method

.method public static final f(Landroidx/compose/ui/node/a;Landroidx/compose/ui/node/a;)Z
    .locals 2

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p1, p0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p0, p1}, Lu1/r0;->f(Landroidx/compose/ui/node/a;Landroidx/compose/ui/node/a;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public static final g(Ly1/o;)Z
    .locals 1

    iget-object p0, p0, Ly1/o;->d:Ly1/j;

    iget-boolean v0, p0, Ly1/j;->b:Z

    if-nez v0, :cond_3

    iget-object p0, p0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/u;

    iget-boolean v0, v0, Ly1/u;->c:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p0, 0x1

    :goto_2
    return p0
.end method

.method public static final h(Lu1/j1;I)V
    .locals 2

    invoke-virtual {p0}, Lu1/j1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/node/a;

    iget v1, v1, Landroidx/compose/ui/node/a;->b:I

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La7/a;->w(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
