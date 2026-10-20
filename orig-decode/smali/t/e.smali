.class public abstract Lt/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/p;

.field public static final b:Lt/q;

.field public static final c:Lt/r;

.field public static final d:Lt/s;

.field public static final e:Lt/p;

.field public static final f:Lt/q;

.field public static final g:Lt/r;

.field public static final h:Lt/s;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt/p;

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-direct {v0, v1}, Lt/p;-><init>(F)V

    sput-object v0, Lt/e;->a:Lt/p;

    new-instance v0, Lt/q;

    invoke-direct {v0, v1, v1}, Lt/q;-><init>(FF)V

    sput-object v0, Lt/e;->b:Lt/q;

    new-instance v0, Lt/r;

    invoke-direct {v0, v1, v1, v1}, Lt/r;-><init>(FFF)V

    sput-object v0, Lt/e;->c:Lt/r;

    new-instance v0, Lt/s;

    invoke-direct {v0, v1, v1, v1, v1}, Lt/s;-><init>(FFFF)V

    sput-object v0, Lt/e;->d:Lt/s;

    new-instance v0, Lt/p;

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-direct {v0, v1}, Lt/p;-><init>(F)V

    sput-object v0, Lt/e;->e:Lt/p;

    new-instance v0, Lt/q;

    invoke-direct {v0, v1, v1}, Lt/q;-><init>(FF)V

    sput-object v0, Lt/e;->f:Lt/q;

    new-instance v0, Lt/r;

    invoke-direct {v0, v1, v1, v1}, Lt/r;-><init>(FFF)V

    sput-object v0, Lt/e;->g:Lt/r;

    new-instance v0, Lt/s;

    invoke-direct {v0, v1, v1, v1, v1}, Lt/s;-><init>(FFFF)V

    sput-object v0, Lt/e;->h:Lt/s;

    return-void
.end method

.method public static a(F)Lt/d;
    .locals 4

    new-instance v0, Lt/d;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    sget-object v1, Lt/y1;->a:Lt/x1;

    const v2, 0x3c23d70a    # 0.01f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x8

    invoke-direct {v0, p0, v1, v2, v3}, Lt/d;-><init>(Ljava/lang/Object;Lt/x1;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static b(FF)Lt/o;
    .locals 10

    const-wide/high16 v4, -0x8000000000000000L

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    new-instance v9, Lt/o;

    sget-object v1, Lt/y1;->a:Lt/x1;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Lt/p;

    invoke-direct {v3, p1}, Lt/p;-><init>(F)V

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;JJZ)V

    return-object v9
.end method

.method public static final c(Lt/o;Lt/j;JLc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    instance-of v2, v1, Lt/f1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lt/f1;

    iget v3, v2, Lt/f1;->f:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt/f1;->f:I

    :goto_0
    move-object v10, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lt/f1;

    invoke-direct {v2, v1}, Lw8/c;-><init>(Lu8/e;)V

    goto :goto_0

    :goto_1
    iget-object v1, v10, Lt/f1;->e:Ljava/lang/Object;

    sget-object v11, Lv8/a;->a:Lv8/a;

    iget v2, v10, Lt/f1;->f:I

    sget-object v12, Lu1/c2;->a:Lu1/c2;

    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v15, :cond_2

    if-ne v2, v14, :cond_1

    iget-object v2, v10, Lt/f1;->d:Ld9/u;

    iget-object v0, v10, Lt/f1;->c:Lc9/c;

    iget-object v3, v10, Lt/f1;->b:Lt/j;

    iget-object v4, v10, Lt/f1;->a:Lt/o;

    :try_start_0
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    move-object v0, v3

    move v3, v14

    goto/16 :goto_4

    :catch_0
    move-exception v0

    move-object v9, v4

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v10, Lt/f1;->d:Ld9/u;

    iget-object v0, v10, Lt/f1;->c:Lc9/c;

    iget-object v3, v10, Lt/f1;->b:Lt/j;

    iget-object v4, v10, Lt/f1;->a:Lt/o;

    :try_start_1
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v8, v0

    move-object v0, v3

    goto/16 :goto_4

    :cond_3
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Lt/j;->b(J)Ljava/lang/Object;

    move-result-object v17

    invoke-interface {v0, v1, v2}, Lt/j;->f(J)Lt/t;

    move-result-object v19

    new-instance v8, Ld9/u;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v1, p2, v1

    if-nez v1, :cond_5

    :try_start_2
    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {v1}, Lt/e;->o(Lu8/j;)F

    move-result v7

    new-instance v6, Lt/i1;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v6

    move-object v2, v8

    move-object/from16 v3, v17

    move-object/from16 v4, p1

    move-object/from16 v5, v19

    move-object v14, v6

    move-object/from16 v6, p0

    move-object v13, v8

    move-object/from16 v8, p4

    :try_start_3
    invoke-direct/range {v1 .. v8}, Lt/i1;-><init>(Ld9/u;Ljava/lang/Object;Lt/j;Lt/t;Lt/o;FLc9/c;)V

    iput-object v9, v10, Lt/f1;->a:Lt/o;

    iput-object v0, v10, Lt/f1;->b:Lt/j;

    move-object/from16 v8, p4

    iput-object v8, v10, Lt/f1;->c:Lc9/c;

    iput-object v13, v10, Lt/f1;->d:Ld9/u;

    iput v15, v10, Lt/f1;->f:I

    invoke-interface/range {p1 .. p1}, Lt/j;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-interface {v1, v12}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v1

    invoke-static {v1}, Lt/k;->d(Lu8/h;)V

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {v1}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v1

    invoke-interface {v1, v14, v10}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_2

    :cond_4
    new-instance v1, Lt/k1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v14}, Lt/k1;-><init>(ILc9/c;)V

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v2

    invoke-static {v2}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v2

    invoke-interface {v2, v1, v10}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    :goto_2
    if-ne v1, v11, :cond_6

    return-object v11

    :goto_3
    move-object v2, v13

    goto/16 :goto_6

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v13, v8

    goto :goto_3

    :cond_5
    move-object v13, v8

    move-object/from16 v8, p4

    new-instance v14, Lt/m;

    invoke-interface/range {p1 .. p1}, Lt/j;->d()Lt/x1;

    move-result-object v18

    invoke-interface/range {p1 .. p1}, Lt/j;->e()Ljava/lang/Object;

    move-result-object v22

    new-instance v1, Lt/h1;

    invoke-direct {v1, v9, v15}, Lt/h1;-><init>(Lt/o;I)V

    move-object/from16 v16, v14

    move-wide/from16 v20, p2

    move-wide/from16 v23, p2

    move-object/from16 v25, v1

    invoke-direct/range {v16 .. v25}, Lt/m;-><init>(Ljava/lang/Object;Lt/x1;Lt/t;JLjava/lang/Object;JLt/h1;)V

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {v1}, Lt/e;->o(Lu8/j;)F

    move-result v4

    move-object v1, v14

    move-wide/from16 v2, p2

    move-object/from16 v5, p1

    move-object/from16 v6, p0

    move-object/from16 v7, p4

    invoke-static/range {v1 .. v7}, Lt/e;->n(Lt/m;JFLt/j;Lt/o;Lc9/c;)V

    iput-object v14, v13, Ld9/u;->a:Ljava/lang/Object;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_6
    move-object v4, v9

    move-object v2, v13

    :cond_7
    :goto_4
    :try_start_4
    iget-object v1, v2, Ld9/u;->a:Ljava/lang/Object;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v1, Lt/m;

    iget-object v1, v1, Lt/m;->i:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {v1}, Lt/e;->o(Lu8/j;)F

    move-result v17

    new-instance v1, Lt/j1;

    move-object v15, v1

    move-object/from16 v16, v2

    move-object/from16 v18, v0

    move-object/from16 v19, v4

    move-object/from16 v20, v8

    invoke-direct/range {v15 .. v20}, Lt/j1;-><init>(Ld9/u;FLt/j;Lt/o;Lc9/c;)V

    iput-object v4, v10, Lt/f1;->a:Lt/o;

    iput-object v0, v10, Lt/f1;->b:Lt/j;

    iput-object v8, v10, Lt/f1;->c:Lc9/c;

    iput-object v2, v10, Lt/f1;->d:Ld9/u;

    const/4 v3, 0x2

    iput v3, v10, Lt/f1;->f:I

    invoke-interface {v0}, Lt/j;->a()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v5

    invoke-interface {v5, v12}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v5

    invoke-static {v5}, Lt/k;->d(Lu8/h;)V

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v5

    invoke-static {v5}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v5

    invoke-interface {v5, v1, v10}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_5

    :cond_8
    new-instance v5, Lt/k1;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v1}, Lt/k1;-><init>(ILc9/c;)V

    invoke-interface {v10}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {v1}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v1

    invoke-interface {v1, v5, v10}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_5
    if-ne v1, v11, :cond_7

    return-object v11

    :cond_9
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :goto_6
    iget-object v1, v2, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Lt/m;

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    iget-object v1, v1, Lt/m;->i:Lm0/n1;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_7
    iget-object v1, v2, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Lt/m;

    if-eqz v1, :cond_b

    iget-wide v1, v1, Lt/m;->g:J

    iget-wide v3, v9, Lt/o;->d:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_b

    const/4 v1, 0x0

    iput-boolean v1, v9, Lt/o;->f:Z

    :cond_b
    throw v0
.end method

.method public static d(FLt/n;Lv/p1;Lu8/e;)Ljava/lang/Object;
    .locals 15

    sget-object v6, Lt/y1;->a:Lt/x1;

    new-instance v7, Ljava/lang/Float;

    const/4 v0, 0x0

    invoke-direct {v7, v0}, Ljava/lang/Float;-><init>(F)V

    new-instance v4, Ljava/lang/Float;

    move v1, p0

    invoke-direct {v4, p0}, Ljava/lang/Float;-><init>(F)V

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    sget-object v0, Lt/g1;->n:Lt/g1;

    invoke-virtual {v0, v1}, Lt/g1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt/t;

    if-nez v1, :cond_0

    invoke-virtual {v0, v7}, Lt/g1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/t;

    invoke-virtual {v0}, Lt/t;->c()Lt/t;

    move-result-object v1

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {v1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v8, v1

    new-instance v10, Lt/l1;

    move-object v0, v10

    move-object/from16 v1, p1

    move-object v2, v6

    move-object v3, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    new-instance v9, Lt/o;

    const/16 v0, 0x38

    invoke-direct {v9, v6, v7, v8, v0}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;I)V

    new-instance v13, Lt/e1;

    const/4 v0, 0x0

    move-object/from16 v1, p2

    invoke-direct {v13, v0, v1, v6}, Lt/e1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/high16 v11, -0x8000000000000000L

    move-object/from16 v14, p3

    invoke-static/range {v9 .. v14}, Lt/e;->c(Lt/o;Lt/j;JLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lv8/a;->a:Lv8/a;

    sget-object v2, Lq8/l;->a:Lq8/l;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-ne v0, v1, :cond_2

    move-object v2, v0

    :cond_2
    return-object v2
.end method

.method public static final e(Lt/o;Lt/y;ZLc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lt/o;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lt/o;->c:Lt/t;

    new-instance v3, Lt/x;

    iget-object v2, p0, Lt/o;->a:Lt/x1;

    invoke-direct {v3, p1, v2, v0, v1}, Lt/x;-><init>(Lt/y;Lt/x1;Ljava/lang/Object;Lt/t;)V

    if-eqz p2, :cond_0

    iget-wide p1, p0, Lt/o;->d:J

    :goto_0
    move-wide v4, p1

    goto :goto_1

    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    goto :goto_0

    :goto_1
    move-object v2, p0

    move-object v6, p3

    move-object v7, p4

    invoke-static/range {v2 .. v7}, Lt/e;->c(Lt/o;Lt/j;JLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lv8/a;->a:Lv8/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lq8/l;->a:Lq8/l;

    return-object p0
.end method

.method public static final f(Lt/p0;FFLt/j0;Ljava/lang/String;Lm0/m;II)Lt/k0;
    .locals 8

    check-cast p5, Lm0/q;

    const p6, -0x266e6c59

    invoke-virtual {p5, p6}, Lm0/q;->Z(I)V

    and-int/lit8 p6, p7, 0x8

    if-eqz p6, :cond_0

    const-string p4, "FloatAnimation"

    :cond_0
    move-object v5, p4

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-object v3, Lt/y1;->a:Lt/x1;

    const/4 v7, 0x0

    move-object v0, p0

    move-object v4, p3

    move-object v6, p5

    invoke-static/range {v0 .. v7}, Lt/e;->i(Lt/p0;Ljava/lang/Number;Ljava/lang/Number;Lt/x1;Lt/j0;Ljava/lang/String;Lm0/m;I)Lt/k0;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p5, p1}, Lm0/q;->t(Z)V

    return-object p0
.end method

.method public static final g(Lt/o;Ljava/lang/Float;Lt/n;ZLc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 8

    iget-object v1, p0, Lt/o;->b:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v4, p0, Lt/o;->a:Lt/x1;

    iget-object v7, p0, Lt/o;->c:Lt/t;

    new-instance v1, Lt/l1;

    move-object v2, v1

    move-object v3, p2

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    if-eqz p3, :cond_0

    iget-wide v2, p0, Lt/o;->d:J

    goto :goto_0

    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    :goto_0
    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lt/e;->c(Lt/o;Lt/j;JLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lv8/a;->a:Lv8/a;

    if-ne v0, v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method

.method public static synthetic h(Lt/o;Ljava/lang/Float;Lt/d1;Lu8/e;)Ljava/lang/Object;
    .locals 6

    const/4 v3, 0x1

    sget-object v4, Lt/g1;->b:Lt/g1;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lt/e;->g(Lt/o;Ljava/lang/Float;Lt/n;ZLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lt/p0;Ljava/lang/Number;Ljava/lang/Number;Lt/x1;Lt/j0;Ljava/lang/String;Lm0/m;I)Lt/k0;
    .locals 6

    check-cast p6, Lm0/q;

    const p5, -0x3f59c4ef

    invoke-virtual {p6, p5}, Lm0/q;->Z(I)V

    const p5, -0x1d58f75c

    invoke-virtual {p6, p5}, Lm0/q;->Z(I)V

    invoke-virtual {p6}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p5

    sget-object p7, Lm0/l;->a:Lk0/y0;

    if-ne p5, p7, :cond_0

    new-instance p5, Lt/k0;

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lt/k0;-><init>(Lt/p0;Ljava/lang/Number;Ljava/lang/Number;Lt/x1;Lt/n;)V

    invoke-virtual {p6, p5}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p6, p3}, Lm0/q;->t(Z)V

    check-cast p5, Lt/k0;

    new-instance p7, Lt/q0;

    invoke-direct {p7, p1, p5, p2, p4}, Lt/q0;-><init>(Ljava/lang/Number;Lt/k0;Ljava/lang/Number;Lt/j0;)V

    invoke-static {p7, p6}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    new-instance p1, Lt/e1;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0, p5}, Lt/e1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p5, p1, p6}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual {p6, p3}, Lm0/q;->t(Z)V

    return-object p5
.end method

.method public static final j(Lt/t;)Lt/t;
    .locals 4

    invoke-virtual {p0}, Lt/t;->c()Lt/t;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lt/t;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Lt/t;->a(I)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lt/t;->e(IF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static k(Lt/o;FFI)Lt/o;
    .locals 17

    move-object/from16 v0, p0

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lt/o;->b:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, p3, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lt/o;->c:Lt/t;

    check-cast v2, Lt/p;

    iget v2, v2, Lt/p;->a:F

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, p3, 0x4

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_2

    iget-wide v6, v0, Lt/o;->d:J

    move-wide v12, v6

    goto :goto_2

    :cond_2
    move-wide v12, v4

    :goto_2
    and-int/lit8 v3, p3, 0x8

    if-eqz v3, :cond_3

    iget-wide v4, v0, Lt/o;->e:J

    :cond_3
    move-wide v14, v4

    and-int/lit8 v3, p3, 0x10

    if-eqz v3, :cond_4

    iget-boolean v3, v0, Lt/o;->f:Z

    :goto_3
    move/from16 v16, v3

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    goto :goto_3

    :goto_4
    new-instance v3, Lt/o;

    iget-object v9, v0, Lt/o;->a:Lt/x1;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    new-instance v11, Lt/p;

    invoke-direct {v11, v2}, Lt/p;-><init>(F)V

    move-object v8, v3

    invoke-direct/range {v8 .. v16}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;JJZ)V

    return-object v3
.end method

.method public static final l(Lt/u1;Lt/x1;Ljava/lang/String;Lm0/m;I)Lt/n1;
    .locals 3

    check-cast p3, Lm0/q;

    const v0, -0x662b6f20

    invoke-virtual {p3, v0}, Lm0/q;->Z(I)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, "DeferredAnimation"

    :cond_0
    const p4, 0x44faf204

    invoke-virtual {p3, p4}, Lm0/q;->Z(I)V

    invoke-virtual {p3, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_1

    sget-object p4, Lm0/l;->a:Lk0/y0;

    if-ne v0, p4, :cond_2

    :cond_1
    new-instance v0, Lt/n1;

    invoke-direct {v0, p0, p1, p2}, Lt/n1;-><init>(Lt/u1;Lt/x1;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lm0/q;->t(Z)V

    check-cast v0, Lt/n1;

    new-instance p2, Lt/e1;

    const/4 p4, 0x3

    invoke-direct {p2, p4, p0, v0}, Lt/e1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, p2, p3}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result p0

    if-eqz p0, :cond_3

    iget-object p0, v0, Lt/n1;->b:Lm0/n1;

    invoke-virtual {p0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt/m1;

    if-eqz p0, :cond_3

    iget-object p2, p0, Lt/m1;->c:Lc9/c;

    iget-object p4, v0, Lt/n1;->c:Lt/u1;

    invoke-virtual {p4}, Lt/u1;->c()Lt/o1;

    move-result-object v1

    invoke-interface {v1}, Lt/o1;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v1, p0, Lt/m1;->c:Lc9/c;

    invoke-virtual {p4}, Lt/u1;->c()Lt/o1;

    move-result-object v2

    invoke-interface {v2}, Lt/o1;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lt/m1;->b:Lc9/c;

    invoke-virtual {p4}, Lt/u1;->c()Lt/o1;

    move-result-object p4

    invoke-interface {v2, p4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lt/e0;

    iget-object p0, p0, Lt/m1;->a:Lt/q1;

    invoke-virtual {p0, p2, v1, p4}, Lt/q1;->e(Ljava/lang/Object;Ljava/lang/Object;Lt/e0;)V

    :cond_3
    invoke-virtual {p3, p1}, Lm0/q;->t(Z)V

    return-object v0
.end method

.method public static final m(Lt/u1;Ljava/lang/Object;Ljava/lang/Object;Lt/e0;Lt/x1;Lm0/m;)Lt/q1;
    .locals 3

    check-cast p5, Lm0/q;

    const v0, -0x122b33ce

    invoke-virtual {p5, v0}, Lm0/q;->Z(I)V

    const v0, 0x44faf204

    invoke-virtual {p5, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p5, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p5}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lm0/l;->a:Lk0/y0;

    if-nez v0, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    new-instance v1, Lt/q1;

    iget-object v0, p4, Lt/x1;->a:Lc9/c;

    invoke-interface {v0, p2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/t;

    invoke-virtual {v0}, Lt/t;->d()V

    invoke-direct {v1, p0, p1, v0, p4}, Lt/q1;-><init>(Lt/u1;Ljava/lang/Object;Lt/t;Lt/x1;)V

    invoke-virtual {p5, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    const/4 p4, 0x0

    invoke-virtual {p5, p4}, Lm0/q;->t(Z)V

    check-cast v1, Lt/q1;

    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, p1, p2, p3}, Lt/q1;->e(Ljava/lang/Object;Ljava/lang/Object;Lt/e0;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, p2, p3}, Lt/q1;->f(Ljava/lang/Object;Lt/e0;)V

    :goto_0
    const p1, -0x21705737

    invoke-virtual {p5, p1}, Lm0/q;->Z(I)V

    invoke-virtual {p5, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p5, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {p5}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v2, :cond_4

    :cond_3
    new-instance p2, Lt/e1;

    const/4 p1, 0x4

    invoke-direct {p2, p1, p0, v1}, Lt/e1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p5, p2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lc9/c;

    invoke-virtual {p5, p4}, Lm0/q;->t(Z)V

    invoke-static {v1, p2, p5}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual {p5, p4}, Lm0/q;->t(Z)V

    return-object v1
.end method

.method public static final n(Lt/m;JFLt/j;Lt/o;Lc9/c;)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-nez v0, :cond_0

    invoke-interface {p4}, Lt/j;->c()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lt/m;->c:J

    sub-long v0, p1, v0

    long-to-float v0, v0

    div-float/2addr v0, p3

    float-to-long v0, v0

    :goto_0
    iput-wide p1, p0, Lt/m;->g:J

    invoke-interface {p4, v0, v1}, Lt/j;->b(J)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lt/m;->e:Lm0/n1;

    invoke-virtual {p2, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-interface {p4, v0, v1}, Lt/j;->f(J)Lt/t;

    move-result-object p1

    iput-object p1, p0, Lt/m;->f:Lt/t;

    invoke-interface {p4, v0, v1}, Lt/j;->g(J)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide p1, p0, Lt/m;->g:J

    iput-wide p1, p0, Lt/m;->h:J

    iget-object p1, p0, Lt/m;->i:Lm0/n1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-static {p0, p5}, Lt/e;->t(Lt/m;Lt/o;)V

    invoke-interface {p6, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o(Lu8/j;)F
    .locals 1

    sget-object v0, Ly0/a;->r:Ly0/a;

    invoke-interface {p0, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p0

    check-cast p0, Ly0/p;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ly0/p;->P()F

    move-result p0

    goto :goto_0

    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "negative scale factor"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p(Lt/z;II)Lt/j0;
    .locals 2

    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    int-to-long v0, p2

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    new-instance p2, Lt/j0;

    invoke-direct {p2, p0, p1, v0, v1}, Lt/j0;-><init>(Lt/z;IJ)V

    return-object p2
.end method

.method public static final q(Ljava/lang/String;Lm0/m;I)Lt/p0;
    .locals 1

    check-cast p1, Lm0/q;

    const p0, 0x3c6b1875

    invoke-virtual {p1, p0}, Lm0/q;->Z(I)V

    const p0, -0x1d58f75c

    invoke-virtual {p1, p0}, Lm0/q;->Z(I)V

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lm0/l;->a:Lk0/y0;

    if-ne p0, p2, :cond_0

    new-instance p0, Lt/p0;

    invoke-direct {p0}, Lt/p0;-><init>()V

    invoke-virtual {p1, p0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lm0/q;->t(Z)V

    check-cast p0, Lt/p0;

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Lt/p0;->a(Lm0/m;I)V

    invoke-virtual {p1, p2}, Lm0/q;->t(Z)V

    return-object p0
.end method

.method public static r(FLjava/lang/Object;I)Lt/d1;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x2

    if-eqz v1, :cond_1

    const p0, 0x44bb8000    # 1500.0f

    :cond_1
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_2

    const/4 p1, 0x0

    :cond_2
    new-instance p2, Lt/d1;

    invoke-direct {p2, v0, p0, p1}, Lt/d1;-><init>(FFLjava/lang/Object;)V

    return-object p2
.end method

.method public static s(IILt/a0;I)Lt/w1;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    const/16 p0, 0x12c

    :cond_0
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    sget-object p2, Lt/d0;->a:Lt/w;

    :cond_2
    new-instance p3, Lt/w1;

    invoke-direct {p3, p0, p1, p2}, Lt/w1;-><init>(IILt/a0;)V

    return-object p3
.end method

.method public static final t(Lt/m;Lt/o;)V
    .locals 5

    iget-object v0, p0, Lt/m;->e:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lt/o;->b:Lm0/n1;

    invoke-virtual {v1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p1, Lt/o;->c:Lt/t;

    iget-object v1, p0, Lt/m;->f:Lt/t;

    invoke-virtual {v0}, Lt/t;->b()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Lt/t;->a(I)F

    move-result v4

    invoke-virtual {v0, v3, v4}, Lt/t;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lt/m;->h:J

    iput-wide v0, p1, Lt/o;->e:J

    iget-wide v0, p0, Lt/m;->g:J

    iput-wide v0, p1, Lt/o;->d:J

    iget-object p0, p0, Lt/m;->i:Lm0/n1;

    invoke-virtual {p0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, p1, Lt/o;->f:Z

    return-void
.end method

.method public static final u(Ljava/lang/Object;Ljava/lang/String;Lm0/m;II)Lt/u1;
    .locals 2

    check-cast p2, Lm0/q;

    const v0, 0x78f2a0ad

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    const p4, -0x1d58f75c

    invoke-virtual {p2, p4}, Lm0/q;->Z(I)V

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne p4, v0, :cond_1

    new-instance p4, Lt/u1;

    new-instance v1, Lt/x0;

    invoke-direct {v1, p0}, Lt/x0;-><init>(Ljava/lang/Object;)V

    invoke-direct {p4, v1, p1}, Lt/u1;-><init>(Lt/x0;Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lm0/q;->t(Z)V

    check-cast p4, Lt/u1;

    and-int/lit8 v1, p3, 0x8

    or-int/lit8 v1, v1, 0x30

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p3, v1

    invoke-virtual {p4, p0, p2, p3}, Lt/u1;->a(Ljava/lang/Object;Lm0/m;I)V

    const p0, -0x2170f804

    invoke-virtual {p2, p0}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p3

    if-nez p0, :cond_2

    if-ne p3, v0, :cond_3

    :cond_2
    new-instance p3, Lq/w;

    const/4 p0, 0x4

    invoke-direct {p3, p4, p0}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_3
    check-cast p3, Lc9/c;

    invoke-virtual {p2, p1}, Lm0/q;->t(Z)V

    invoke-static {p4, p3, p2}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual {p2, p1}, Lm0/q;->t(Z)V

    return-object p4
.end method
