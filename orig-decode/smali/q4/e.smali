.class public final Lq4/e;
.super Ljava/lang/Object;


# instance fields
.field public final a:Li4/i;

.field public final b:Ll/z2;


# direct methods
.method public constructor <init>(Li4/i;Ll/z2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq4/e;->a:Li4/i;

    iput-object p2, p0, Lq4/e;->b:Ll/z2;

    return-void
.end method

.method public static c(Ln4/l;Ls4/j;Lq4/c;Lq4/d;)Ls4/q;
    .locals 9

    new-instance v8, Ls4/q;

    iget-object v0, p1, Ls4/j;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p3, Lq4/d;->a:Landroid/graphics/Bitmap;

    invoke-direct {v1, v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    sget-object v3, Lk4/f;->a:Lk4/f;

    const-string v0, "coil#disk_cache_key"

    iget-object p3, p3, Lq4/d;->b:Ljava/util/Map;

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/String;

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    const-string v0, "coil#is_sampled"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    instance-of v0, p3, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    move-object v4, p3

    check-cast v4, Ljava/lang/Boolean;

    :cond_1
    const/4 p3, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v6, v0

    goto :goto_1

    :cond_2
    move v6, p3

    :goto_1
    sget-object v0, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    instance-of v0, p0, Ln4/l;

    if-eqz v0, :cond_3

    iget-boolean p0, p0, Ln4/l;->g:Z

    if-eqz p0, :cond_3

    const/4 p0, 0x1

    move v7, p0

    goto :goto_2

    :cond_3
    move v7, p3

    :goto_2
    move-object v0, v8

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Ls4/q;-><init>(Landroid/graphics/drawable/Drawable;Ls4/j;Lk4/f;Lq4/c;Ljava/lang/String;ZZ)V

    return-object v8
.end method


# virtual methods
.method public final a(Ls4/j;Lq4/c;Lt4/f;Lt4/e;)Lq4/d;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v1, Ls4/j;->t:Ls4/b;

    iget-boolean v4, v4, Ls4/b;->a:Z

    const/4 v5, 0x0

    if-nez v4, :cond_0

    return-object v5

    :cond_0
    iget-object v4, v0, Lq4/e;->a:Li4/i;

    check-cast v4, Li4/o;

    iget-object v4, v4, Li4/o;->b:Lq8/c;

    invoke-interface {v4}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq4/f;

    if-eqz v4, :cond_1

    iget-object v6, v4, Lq4/f;->a:Lq4/l;

    invoke-interface {v6, v2}, Lq4/l;->a(Lq4/c;)Lq4/d;

    move-result-object v6

    if-nez v6, :cond_2

    iget-object v4, v4, Lq4/f;->b:Lq4/m;

    invoke-interface {v4, v2}, Lq4/m;->a(Lq4/c;)Lq4/d;

    move-result-object v6

    goto :goto_0

    :cond_1
    move-object v6, v5

    :cond_2
    :goto_0
    if-eqz v6, :cond_15

    iget-object v4, v6, Lq4/d;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v7

    if-nez v7, :cond_3

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_3
    iget-object v8, v0, Lq4/e;->b:Ll/z2;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v7, v8, :cond_4

    iget-boolean v7, v1, Ls4/j;->q:Z

    if-nez v7, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string v7, "coil#is_sampled"

    iget-object v8, v6, Lq4/d;->b:Ljava/util/Map;

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/Boolean;

    if-eqz v8, :cond_5

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_1

    :cond_5
    move-object v7, v5

    :goto_1
    const/4 v8, 0x0

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_2

    :cond_6
    move v7, v8

    :goto_2
    sget-object v9, Lt4/f;->c:Lt4/f;

    invoke-static {v3, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    if-eqz v7, :cond_7

    goto/16 :goto_8

    :cond_7
    :goto_3
    move-object/from16 v16, v6

    goto/16 :goto_9

    :cond_8
    const-string v9, "coil#transformation_size"

    iget-object v2, v2, Lq4/c;->b:Ljava/util/Map;

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual/range {p3 .. p3}, Lt4/f;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_3

    :cond_9
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget-object v9, v3, Lt4/f;->a:Lf6/a;

    instance-of v10, v9, Lt4/a;

    const v11, 0x7fffffff

    if-eqz v10, :cond_a

    check-cast v9, Lt4/a;

    iget v9, v9, Lt4/a;->z:I

    goto :goto_4

    :cond_a
    move v9, v11

    :goto_4
    iget-object v3, v3, Lt4/f;->b:Lf6/a;

    instance-of v10, v3, Lt4/a;

    if-eqz v10, :cond_b

    check-cast v3, Lt4/a;

    iget v3, v3, Lt4/a;->z:I

    move-object/from16 v10, p4

    goto :goto_5

    :cond_b
    move-object/from16 v10, p4

    move v3, v11

    :goto_5
    invoke-static {v2, v4, v9, v3, v10}, Lh6/g;->f(IIIILt4/e;)D

    move-result-wide v12

    invoke-static/range {p1 .. p1}, Lw4/d;->a(Ls4/j;)Z

    move-result v1

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    if-eqz v1, :cond_d

    cmpl-double v8, v12, v14

    if-lez v8, :cond_c

    move-wide v10, v14

    goto :goto_6

    :cond_c
    move-wide v10, v12

    :goto_6
    int-to-double v8, v9

    move-object/from16 v16, v6

    int-to-double v5, v2

    mul-double/2addr v5, v10

    sub-double/2addr v8, v5

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    cmpg-double v2, v5, v14

    if-lez v2, :cond_16

    int-to-double v2, v3

    int-to-double v4, v4

    mul-double/2addr v10, v4

    sub-double/2addr v2, v10

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v2, v2, v14

    if-gtz v2, :cond_12

    goto :goto_9

    :cond_d
    move-object/from16 v16, v6

    const/4 v5, 0x1

    const/high16 v6, -0x80000000

    if-eq v9, v6, :cond_e

    if-ne v9, v11, :cond_f

    :cond_e
    move v8, v5

    :cond_f
    if-nez v8, :cond_10

    sub-int/2addr v9, v2

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gt v2, v5, :cond_12

    :cond_10
    if-eq v3, v6, :cond_16

    if-ne v3, v11, :cond_11

    goto :goto_9

    :cond_11
    sub-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gt v2, v5, :cond_12

    goto :goto_9

    :cond_12
    cmpg-double v2, v12, v14

    if-nez v2, :cond_13

    goto :goto_7

    :cond_13
    if-nez v1, :cond_14

    goto :goto_8

    :cond_14
    :goto_7
    cmpl-double v1, v12, v14

    if-lez v1, :cond_16

    if-eqz v7, :cond_16

    :cond_15
    :goto_8
    const/4 v5, 0x0

    goto :goto_a

    :cond_16
    :goto_9
    move-object/from16 v5, v16

    :goto_a
    return-object v5
.end method

.method public final b(Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;)Lq4/c;
    .locals 7

    iget-object p4, p1, Ls4/j;->e:Lq4/c;

    if-eqz p4, :cond_0

    return-object p4

    :cond_0
    iget-object p4, p0, Lq4/e;->a:Li4/i;

    check-cast p4, Li4/o;

    iget-object p4, p4, Li4/o;->d:Li4/c;

    iget-object p4, p4, Li4/c;->c:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_2

    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    iget-object v5, v4, Lq8/f;->a:Ljava/lang/Object;

    check-cast v5, Lo4/b;

    iget-object v4, v4, Lq8/f;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>"

    invoke-static {v5, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, p2, p3}, Lo4/b;->a(Ljava/lang/Object;Ls4/n;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_1
    if-nez v4, :cond_3

    return-object v3

    :cond_3
    iget-object p2, p1, Ls4/j;->D:Ls4/o;

    iget-object p2, p2, Ls4/o;->a:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p4

    sget-object v0, Lr8/s;->a:Lr8/s;

    if-eqz p4, :cond_4

    move-object p4, v0

    goto :goto_2

    :cond_4
    new-instance p4, Ljava/util/LinkedHashMap;

    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_8

    :goto_2
    iget-object p1, p1, Ls4/j;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p1, Lq4/c;

    invoke-direct {p1, v4, v0}, Lq4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1

    :cond_5
    invoke-static {p4}, Lr8/v;->I0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    move-object p4, p1

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_7

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p4

    if-gtz p4, :cond_6

    iget-object p1, p3, Ls4/n;->d:Lt4/f;

    invoke-virtual {p1}, Lt4/f;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "coil#transformation_size"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    throw v3

    :cond_7
    :goto_3
    new-instance p1, Lq4/c;

    invoke-direct {p1, v4, p2}, Lq4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1

    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    throw v3
.end method
