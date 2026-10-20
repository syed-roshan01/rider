.class public final Lj0/c;
.super Lj0/u;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final b:Z

.field public final c:F

.field public final d:Lm0/l3;

.field public final e:Lm0/l3;

.field public final f:Lw0/x;


# direct methods
.method public constructor <init>(ZFLm0/g1;Lm0/g1;)V
    .locals 0

    invoke-direct {p0, p1, p4}, Lj0/u;-><init>(ZLm0/g1;)V

    iput-boolean p1, p0, Lj0/c;->b:Z

    iput p2, p0, Lj0/c;->c:F

    iput-object p3, p0, Lj0/c;->d:Lm0/l3;

    iput-object p4, p0, Lj0/c;->e:Lm0/l3;

    new-instance p1, Lw0/x;

    invoke-direct {p1}, Lw0/x;-><init>()V

    iput-object p1, p0, Lj0/c;->f:Lw0/x;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lj0/c;->f:Lw0/x;

    invoke-virtual {v0}, Lw0/x;->clear()V

    return-void
.end method

.method public final c(Lg1/e;)V
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lj0/c;->d:Lm0/l3;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le1/r;

    iget-wide v1, v1, Le1/r;->a:J

    move-object/from16 v11, p1

    check-cast v11, Lt1/i0;

    invoke-virtual {v11}, Lt1/i0;->a()V

    iget v3, v0, Lj0/c;->c:F

    invoke-virtual {v0, v11, v3, v1, v2}, Lj0/u;->f(Lg1/g;FJ)V

    iget-object v3, v0, Lj0/c;->f:Lw0/x;

    iget-object v3, v3, Lw0/x;->b:Lw0/q;

    invoke-virtual {v3}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    move-object v3, v12

    check-cast v3, Lw0/f0;

    invoke-virtual {v3}, Lw0/f0;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v3, v12

    check-cast v3, Lw0/e0;

    invoke-virtual {v3}, Lw0/e0;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/p;

    iget-object v4, v0, Lj0/c;->e:Lm0/l3;

    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj0/h;

    iget v4, v4, Lj0/h;->d:F

    const/4 v5, 0x0

    cmpg-float v5, v4, v5

    if-nez v5, :cond_0

    move-wide/from16 v16, v1

    goto/16 :goto_3

    :cond_0
    invoke-static {v1, v2, v4}, Le1/r;->b(JF)J

    move-result-wide v4

    iget-object v6, v3, Lj0/p;->d:Ljava/lang/Float;

    iget-object v7, v11, Lt1/i0;->a:Lg1/c;

    if-nez v6, :cond_1

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v8

    sget v6, Lj0/q;->a:F

    invoke-static {v8, v9}, Ld1/f;->d(J)F

    move-result v6

    invoke-static {v8, v9}, Ld1/f;->b(J)F

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    move-result v6

    const v8, 0x3e99999a    # 0.3f

    mul-float/2addr v6, v8

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    iput-object v6, v3, Lj0/p;->d:Ljava/lang/Float;

    :cond_1
    iget-object v6, v3, Lj0/p;->e:Ljava/lang/Float;

    iget-boolean v8, v3, Lj0/p;->c:Z

    if-nez v6, :cond_3

    iget v6, v3, Lj0/p;->b:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v9

    invoke-static {v11, v8, v9, v10}, Lj0/q;->a(Lm2/b;ZJ)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    goto :goto_1

    :cond_2
    invoke-virtual {v11, v6}, Lt1/i0;->v(F)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    :goto_1
    iput-object v6, v3, Lj0/p;->e:Ljava/lang/Float;

    :cond_3
    iget-object v6, v3, Lj0/p;->a:Ld1/c;

    if-nez v6, :cond_4

    invoke-interface {v7}, Lg1/g;->O()J

    move-result-wide v9

    new-instance v6, Ld1/c;

    invoke-direct {v6, v9, v10}, Ld1/c;-><init>(J)V

    iput-object v6, v3, Lj0/p;->a:Ld1/c;

    :cond_4
    iget-object v6, v3, Lj0/p;->f:Ld1/c;

    if-nez v6, :cond_5

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/f;->d(J)F

    move-result v6

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v6, v9

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v13

    invoke-static {v13, v14}, Ld1/f;->b(J)F

    move-result v10

    div-float/2addr v10, v9

    invoke-static {v6, v10}, Ld9/i;->f(FF)J

    move-result-wide v9

    new-instance v6, Ld1/c;

    invoke-direct {v6, v9, v10}, Ld1/c;-><init>(J)V

    iput-object v6, v3, Lj0/p;->f:Ld1/c;

    :cond_5
    iget-object v6, v3, Lj0/p;->l:Lm0/n1;

    invoke-virtual {v6}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v3, Lj0/p;->k:Lm0/n1;

    invoke-virtual {v6}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_6

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_6
    iget-object v6, v3, Lj0/p;->g:Lt/d;

    invoke-virtual {v6}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    :goto_2
    iget-object v9, v3, Lj0/p;->d:Ljava/lang/Float;

    invoke-static {v9}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    iget-object v10, v3, Lj0/p;->e:Ljava/lang/Float;

    invoke-static {v10}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v10

    iget-object v13, v3, Lj0/p;->h:Lt/d;

    invoke-virtual {v13}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    invoke-static {v9, v10, v13}, Lo1/s;->W(FFF)F

    move-result v9

    iget-object v10, v3, Lj0/p;->a:Ld1/c;

    invoke-static {v10}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v13, v10, Ld1/c;->a:J

    invoke-static {v13, v14}, Ld1/c;->d(J)F

    move-result v10

    iget-object v13, v3, Lj0/p;->f:Ld1/c;

    invoke-static {v13}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v13, v13, Ld1/c;->a:J

    invoke-static {v13, v14}, Ld1/c;->d(J)F

    move-result v13

    iget-object v14, v3, Lj0/p;->i:Lt/d;

    invoke-virtual {v14}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    move-result v15

    invoke-static {v10, v13, v15}, Lo1/s;->W(FFF)F

    move-result v10

    iget-object v13, v3, Lj0/p;->a:Ld1/c;

    invoke-static {v13}, Ld7/a;->j(Ljava/lang/Object;)V

    move-wide/from16 v16, v1

    iget-wide v0, v13, Ld1/c;->a:J

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    iget-object v1, v3, Lj0/p;->f:Ld1/c;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v1, v1, Ld1/c;->a:J

    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result v1

    invoke-virtual {v14}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v0, v1, v2}, Lo1/s;->W(FFF)F

    move-result v0

    invoke-static {v10, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    invoke-static {v4, v5}, Le1/r;->d(J)F

    move-result v2

    mul-float/2addr v2, v6

    invoke-static {v4, v5, v2}, Le1/r;->b(JF)J

    move-result-wide v4

    if-eqz v8, :cond_7

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld1/f;->d(J)F

    move-result v21

    invoke-interface {v7}, Lg1/g;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld1/f;->b(J)F

    move-result v22

    const/16 v23, 0x1

    iget-object v2, v7, Lg1/c;->b:Lg1/b;

    invoke-virtual {v2}, Lg1/b;->b()J

    move-result-wide v13

    invoke-virtual {v2}, Lg1/b;->a()Le1/p;

    move-result-object v3

    invoke-interface {v3}, Le1/p;->j()V

    iget-object v3, v2, Lg1/b;->a:Lg1/d;

    iget-object v3, v3, Lg1/d;->a:Lg1/b;

    invoke-virtual {v3}, Lg1/b;->a()Le1/p;

    move-result-object v18

    invoke-interface/range {v18 .. v23}, Le1/p;->d(FFFFI)V

    const/4 v10, 0x0

    const/16 v15, 0x78

    move-object v3, v11

    move v6, v9

    move-wide v7, v0

    move-object v9, v10

    move v10, v15

    invoke-static/range {v3 .. v10}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    invoke-virtual {v2}, Lg1/b;->a()Le1/p;

    move-result-object v0

    invoke-interface {v0}, Le1/p;->h()V

    invoke-virtual {v2, v13, v14}, Lg1/b;->c(J)V

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    const/16 v10, 0x78

    move-object v3, v11

    move v6, v9

    move-wide v7, v0

    move-object v9, v2

    invoke-static/range {v3 .. v10}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    :goto_3
    move-object/from16 v0, p0

    move-wide/from16 v1, v16

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lj0/c;->f:Lw0/x;

    invoke-virtual {v0}, Lw0/x;->clear()V

    return-void
.end method

.method public final e(Lx/o;Lm9/d0;)V
    .locals 6

    iget-object v0, p0, Lj0/c;->f:Lw0/x;

    iget-object v1, v0, Lw0/x;->b:Lw0/q;

    invoke-virtual {v1}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj0/p;

    iget-object v3, v2, Lj0/p;->l:Lm0/n1;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object v3, Lq8/l;->a:Lq8/l;

    iget-object v2, v2, Lj0/p;->j:Lm9/s;

    invoke-virtual {v2, v3}, Lm9/p1;->X(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iget-boolean v2, p0, Lj0/c;->b:Z

    if-eqz v2, :cond_1

    iget-wide v3, p1, Lx/o;->a:J

    new-instance v5, Ld1/c;

    invoke-direct {v5, v3, v4}, Ld1/c;-><init>(J)V

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    new-instance v3, Lj0/p;

    iget v4, p0, Lj0/c;->c:F

    invoke-direct {v3, v5, v4, v2}, Lj0/p;-><init>(Ld1/c;FZ)V

    invoke-virtual {v0, p1, v3}, Lw0/x;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lj0/b;

    invoke-direct {v0, v3, p0, p1, v1}, Lj0/b;-><init>(Lj0/p;Lj0/c;Lx/o;Lu8/e;)V

    const/4 p1, 0x3

    const/4 v2, 0x0

    invoke-static {p2, v1, v2, v0, p1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void
.end method

.method public final g(Lx/o;)V
    .locals 2

    iget-object v0, p0, Lj0/c;->f:Lw0/x;

    invoke-virtual {v0, p1}, Lw0/x;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/p;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lj0/p;->l:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget-object p1, p1, Lj0/p;->j:Lm9/s;

    invoke-virtual {p1, v0}, Lm9/p1;->X(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
