.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/x1;

.field public static final b:Lt/d1;

.field public static final c:Lt/d1;

.field public static final d:Lt/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Ls/h0;->d:Ls/h0;

    sget-object v1, Ls/h0;->e:Ls/h0;

    sget-object v2, Lt/y1;->a:Lt/x1;

    new-instance v2, Lt/x1;

    invoke-direct {v2, v0, v1}, Lt/x1;-><init>(Lc9/c;Lc9/c;)V

    sput-object v2, Landroidx/compose/animation/a;->a:Lt/x1;

    const/4 v0, 0x0

    const/high16 v1, 0x43c80000    # 400.0f

    const/4 v2, 0x5

    invoke-static {v1, v0, v2}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/a;->b:Lt/d1;

    sget v0, Lm2/i;->c:I

    sget-object v0, Lt/i2;->a:Ljava/util/Map;

    const/4 v0, 0x1

    invoke-static {v0, v0}, Li1/b;->c(II)J

    move-result-wide v2

    new-instance v4, Lm2/i;

    invoke-direct {v4, v2, v3}, Lm2/i;-><init>(J)V

    invoke-static {v1, v4, v0}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v2

    sput-object v2, Landroidx/compose/animation/a;->c:Lt/d1;

    invoke-static {v0, v0}, Lo1/s;->e(II)J

    move-result-wide v2

    new-instance v4, Lm2/k;

    invoke-direct {v4, v2, v3}, Lm2/k;-><init>(J)V

    invoke-static {v1, v4, v0}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/a;->d:Lt/d1;

    return-void
.end method

.method public static final a(Lt/u1;Ls/q0;Ls/r0;Lm0/m;I)Ly0/o;
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v8, p3

    check-cast v8, Lm0/q;

    const v2, 0x367a8aa2

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    const v2, 0x149cfa6

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    const v2, 0x44faf204

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v8, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lm0/l;->a:Lk0/y0;

    sget-object v6, Lm0/o3;->a:Lm0/o3;

    if-nez v3, :cond_0

    if-ne v4, v5, :cond_1

    :cond_0
    invoke-static {v0, v6}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v4

    invoke-virtual {v8, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    check-cast v4, Lm0/g1;

    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v10, v7, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v10}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Ls/j0;->b:Ls/j0;

    if-ne v3, v11, :cond_3

    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_3

    invoke-virtual/range {p0 .. p0}, Lt/u1;->d()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v4, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object v0, Ls/q0;->b:Ls/q0;

    invoke-interface {v4, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v10}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_4

    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls/q0;

    invoke-virtual {v3, v0}, Ls/q0;->b(Ls/q0;)Ls/q0;

    move-result-object v0

    invoke-interface {v4, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ls/q0;

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    const v0, -0x514aece4

    invoke-virtual {v8, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v8, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v8}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    if-ne v2, v5, :cond_6

    :cond_5
    invoke-static {v1, v6}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v2

    invoke-virtual {v8, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    check-cast v2, Lm0/g1;

    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    if-ne v0, v3, :cond_8

    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_8

    invoke-virtual/range {p0 .. p0}, Lt/u1;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2, v1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    sget-object v0, Ls/r0;->b:Ls/r0;

    invoke-interface {v2, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v10}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v12, :cond_d

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls/r0;

    new-instance v3, Ls/r0;

    new-instance v6, Ls/b1;

    iget-object v0, v0, Ls/r0;->a:Ls/b1;

    iget-object v10, v0, Ls/b1;->a:Ls/s0;

    if-nez v10, :cond_9

    iget-object v10, v1, Ls/r0;->a:Ls/b1;

    iget-object v10, v10, Ls/b1;->a:Ls/s0;

    :cond_9
    iget-object v12, v1, Ls/r0;->a:Ls/b1;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Ls/r0;->a:Ls/b1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v0, Ls/b1;->b:Ls/w0;

    if-nez v12, :cond_a

    iget-object v12, v1, Ls/b1;->b:Ls/w0;

    :cond_a
    iget-boolean v13, v0, Ls/b1;->c:Z

    if-nez v13, :cond_c

    iget-boolean v13, v1, Ls/b1;->c:Z

    if-eqz v13, :cond_b

    goto :goto_1

    :cond_b
    move v13, v9

    goto :goto_2

    :cond_c
    :goto_1
    move v13, v4

    :goto_2
    const-string v14, "<this>"

    iget-object v0, v0, Ls/b1;->d:Ljava/util/Map;

    invoke-static {v0, v14}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "map"

    iget-object v1, v1, Ls/b1;->d:Ljava/util/Map;

    invoke-static {v1, v14}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v14, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    invoke-direct {v6, v10, v12, v13, v14}, Ls/b1;-><init>(Ls/s0;Ls/w0;ZLjava/util/Map;)V

    invoke-direct {v3, v6}, Ls/r0;-><init>(Ls/b1;)V

    invoke-interface {v2, v3}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    :cond_d
    :goto_3
    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ls/r0;

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    iget-object v0, v11, Ls/q0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v10, Ls/r0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v11, Ls/q0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v10, Ls/r0;->a:Ls/b1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x62c78261

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    const v2, 0x62c7830b

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    const v2, 0x62c783b3

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x264802d5

    invoke-virtual {v8, v2}, Lm0/q;->Z(I)V

    iget-object v2, v0, Ls/b1;->a:Ls/s0;

    if-nez v2, :cond_f

    iget-object v2, v1, Ls/b1;->a:Ls/s0;

    if-eqz v2, :cond_e

    goto :goto_4

    :cond_e
    move v2, v9

    goto :goto_5

    :cond_f
    :goto_4
    move v2, v4

    :goto_5
    iget-object v0, v0, Ls/b1;->b:Ls/w0;

    if-nez v0, :cond_11

    iget-object v0, v1, Ls/b1;->b:Ls/w0;

    if-eqz v0, :cond_10

    goto :goto_6

    :cond_10
    move v4, v9

    :cond_11
    :goto_6
    const v0, -0x45096c07

    invoke-virtual {v8, v0}, Lm0/q;->Z(I)V

    const/4 v0, 0x0

    const v1, -0x1d58f75c

    if-eqz v2, :cond_13

    sget-object v2, Lt/y1;->a:Lt/x1;

    invoke-virtual {v8, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v8}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_12

    const-string v3, "Built-in alpha"

    invoke-virtual {v8, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_12
    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    check-cast v3, Ljava/lang/String;

    invoke-static {v7, v2, v3, v8, v9}, Lt/e;->l(Lt/u1;Lt/x1;Ljava/lang/String;Lm0/m;I)Lt/n1;

    move-result-object v2

    goto :goto_7

    :cond_13
    move-object v2, v0

    :goto_7
    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    const v3, -0x45096b42

    invoke-virtual {v8, v3}, Lm0/q;->Z(I)V

    if-eqz v4, :cond_15

    sget-object v3, Lt/y1;->a:Lt/x1;

    invoke-virtual {v8, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v8}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_14

    const-string v1, "Built-in scale"

    invoke-virtual {v8, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_14
    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    check-cast v1, Ljava/lang/String;

    invoke-static {v7, v3, v1, v8, v9}, Lt/e;->l(Lt/u1;Lt/x1;Ljava/lang/String;Lm0/m;I)Lt/n1;

    move-result-object v1

    move-object v3, v1

    goto :goto_8

    :cond_15
    move-object v3, v0

    :goto_8
    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    if-eqz v4, :cond_16

    sget-object v0, Landroidx/compose/animation/a;->a:Lt/x1;

    const-string v1, "TransformOriginInterruptionHandling"

    invoke-static {v7, v0, v1, v8, v9}, Lt/e;->l(Lt/u1;Lt/x1;Ljava/lang/String;Lm0/m;I)Lt/n1;

    move-result-object v0

    :cond_16
    move-object v6, v0

    new-instance v12, Ls/k0;

    move-object v0, v12

    move-object v1, v2

    move-object v2, v3

    move-object/from16 v3, p0

    move-object v4, v11

    move-object v5, v10

    invoke-direct/range {v0 .. v6}, Ls/k0;-><init>(Lt/n1;Lt/n1;Lt/u1;Ls/q0;Ls/r0;Lt/n1;)V

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    sget-object v13, Ly0/l;->b:Ly0/l;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1efff

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object v0

    new-instance v1, Landroidx/compose/animation/EnterExitTransitionElement;

    invoke-direct {v1, v7, v11, v10, v12}, Landroidx/compose/animation/EnterExitTransitionElement;-><init>(Lt/u1;Ls/q0;Ls/r0;Ls/k0;)V

    invoke-interface {v0, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-virtual {v8, v9}, Lm0/q;->t(Z)V

    return-object v0
.end method

.method public static b(Lt/w1;I)Ls/q0;
    .locals 7

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x5

    const/4 p1, 0x0

    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {v0, p1, p0}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p0

    :cond_0
    new-instance p1, Ls/q0;

    new-instance v6, Ls/b1;

    new-instance v1, Ls/s0;

    const/4 v0, 0x0

    invoke-direct {v1, v0, p0}, Ls/s0;-><init>(FLt/e0;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ls/b1;-><init>(Ls/s0;Ls/w0;ZLjava/util/LinkedHashMap;I)V

    invoke-direct {p1, v6}, Ls/q0;-><init>(Ls/b1;)V

    return-object p1
.end method

.method public static c(Lt/w1;I)Ls/r0;
    .locals 7

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x5

    const/4 p1, 0x0

    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {v0, p1, p0}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p0

    :cond_0
    new-instance p1, Ls/r0;

    new-instance v6, Ls/b1;

    new-instance v1, Ls/s0;

    const/4 v0, 0x0

    invoke-direct {v1, v0, p0}, Ls/s0;-><init>(FLt/e0;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ls/b1;-><init>(Ls/s0;Ls/w0;ZLjava/util/LinkedHashMap;I)V

    invoke-direct {p1, v6}, Ls/r0;-><init>(Ls/b1;)V

    return-object p1
.end method

.method public static d(Lt/w1;)Ls/q0;
    .locals 10

    sget-wide v0, Le1/p0;->b:J

    new-instance v2, Ls/q0;

    new-instance v9, Ls/b1;

    const/4 v4, 0x0

    new-instance v5, Ls/w0;

    const v3, 0x3f6b851f    # 0.92f

    invoke-direct {v5, v3, v0, v1, p0}, Ls/w0;-><init>(FJLt/e0;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x37

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ls/b1;-><init>(Ls/s0;Ls/w0;ZLjava/util/LinkedHashMap;I)V

    invoke-direct {v2, v9}, Ls/q0;-><init>(Ls/b1;)V

    return-object v2
.end method
