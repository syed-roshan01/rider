.class public final Lj0/a;
.super Lj0/u;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final b:Z

.field public final c:F

.field public final d:Lm0/l3;

.field public final e:Lm0/l3;

.field public final f:Landroid/view/ViewGroup;

.field public n:Lj0/r;

.field public final o:Lm0/n1;

.field public final p:Lm0/n1;

.field public q:J

.field public r:I

.field public final s:Lt/l0;


# direct methods
.method public constructor <init>(ZFLm0/g1;Lm0/g1;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0, p1, p4}, Lj0/u;-><init>(ZLm0/g1;)V

    iput-boolean p1, p0, Lj0/a;->b:Z

    iput p2, p0, Lj0/a;->c:F

    iput-object p3, p0, Lj0/a;->d:Lm0/l3;

    iput-object p4, p0, Lj0/a;->e:Lm0/l3;

    iput-object p5, p0, Lj0/a;->f:Landroid/view/ViewGroup;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p2

    iput-object p2, p0, Lj0/a;->o:Lm0/n1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lj0/a;->p:Lm0/n1;

    sget-wide p1, Ld1/f;->b:J

    iput-wide p1, p0, Lj0/a;->q:J

    const/4 p1, -0x1

    iput p1, p0, Lj0/a;->r:I

    new-instance p1, Lt/l0;

    const/16 p2, 0xe

    invoke-direct {p1, p0, p2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lj0/a;->s:Lt/l0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    invoke-virtual {p0}, Lj0/a;->h()V

    return-void
.end method

.method public final c(Lg1/e;)V
    .locals 10

    move-object v0, p1

    check-cast v0, Lt1/i0;

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v1}, Lg1/g;->e()J

    move-result-wide v1

    iput-wide v1, p0, Lj0/a;->q:J

    iget v1, p0, Lj0/a;->c:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v2}, Lg1/g;->e()J

    move-result-wide v2

    iget-boolean v4, p0, Lj0/a;->b:Z

    invoke-static {p1, v4, v2, v3}, Lj0/q;->a(Lm2/b;ZJ)F

    move-result v2

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v2

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v2, v1}, Lm2/b;->J(F)I

    move-result v2

    :goto_0
    iput v2, p0, Lj0/a;->r:I

    iget-object v2, p0, Lj0/a;->d:Lm0/l3;

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1/r;

    iget-wide v7, v2, Le1/r;->a:J

    iget-object v2, p0, Lj0/a;->e:Lm0/l3;

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj0/h;

    iget v9, v2, Lj0/h;->d:F

    invoke-virtual {v0}, Lt1/i0;->a()V

    invoke-virtual {p0, p1, v1, v7, v8}, Lj0/u;->f(Lg1/g;FJ)V

    check-cast p1, Lt1/i0;

    iget-object p1, p1, Lt1/i0;->a:Lg1/c;

    iget-object p1, p1, Lg1/c;->b:Lg1/b;

    invoke-virtual {p1}, Lg1/b;->a()Le1/p;

    move-result-object p1

    iget-object v1, p0, Lj0/a;->p:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v1, p0, Lj0/a;->o:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj0/t;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lt1/i0;->a:Lg1/c;

    invoke-interface {v0}, Lg1/g;->e()J

    move-result-wide v4

    iget v6, p0, Lj0/a;->r:I

    move-object v3, v1

    invoke-virtual/range {v3 .. v9}, Lj0/t;->e(JIJF)V

    invoke-static {p1}, Le1/e;->a(Le1/p;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 0

    invoke-virtual {p0}, Lj0/a;->h()V

    return-void
.end method

.method public final e(Lx/o;Lm9/d0;)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lj0/a;->n:Lj0/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, v0, Lj0/a;->f:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Lj0/r;

    if-eqz v6, :cond_1

    check-cast v5, Lj0/r;

    iput-object v5, v0, Lj0/a;->n:Lj0/r;

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v3, v0, Lj0/a;->n:Lj0/r;

    if-nez v3, :cond_3

    new-instance v3, Lj0/r;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Lj0/r;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v3, v0, Lj0/a;->n:Lj0/r;

    :cond_3
    iget-object v1, v0, Lj0/a;->n:Lj0/r;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_2
    iget-object v3, v1, Lj0/r;->d:Lj0/s;

    iget-object v4, v3, Lj0/s;->a:Ljava/util/HashMap;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj0/t;

    if-eqz v4, :cond_4

    goto/16 :goto_6

    :cond_4
    iget-object v4, v1, Lj0/r;->c:Ljava/util/ArrayList;

    const-string v5, "<this>"

    invoke-static {v4, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    move-object v4, v6

    goto :goto_3

    :cond_5
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    :goto_3
    check-cast v4, Lj0/t;

    iget-object v5, v3, Lj0/s;->b:Ljava/util/HashMap;

    iget-object v3, v3, Lj0/s;->a:Ljava/util/HashMap;

    if-nez v4, :cond_a

    iget v4, v1, Lj0/r;->e:I

    iget-object v7, v1, Lj0/r;->b:Ljava/util/ArrayList;

    invoke-static {v7}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v8

    if-le v4, v8, :cond_6

    new-instance v4, Lj0/t;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    iget v4, v1, Lj0/r;->e:I

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj0/t;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj0/a;

    if-eqz v7, :cond_8

    iget-object v8, v7, Lj0/a;->o:Lm0/n1;

    invoke-virtual {v8, v6}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj0/t;

    if-eqz v6, :cond_7

    invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj0/a;

    :cond_7
    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lj0/t;->c()V

    :cond_8
    :goto_4
    iget v6, v1, Lj0/r;->e:I

    iget v7, v1, Lj0/r;->a:I

    add-int/lit8 v7, v7, -0x1

    if-ge v6, v7, :cond_9

    add-int/lit8 v6, v6, 0x1

    iput v6, v1, Lj0/r;->e:I

    goto :goto_5

    :cond_9
    iput v2, v1, Lj0/r;->e:I

    :cond_a
    :goto_5
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_6
    iget-boolean v8, v0, Lj0/a;->b:Z

    iget-wide v9, v0, Lj0/a;->q:J

    iget v11, v0, Lj0/a;->r:I

    iget-object v1, v0, Lj0/a;->d:Lm0/l3;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le1/r;

    iget-wide v12, v1, Le1/r;->a:J

    iget-object v1, v0, Lj0/a;->e:Lm0/l3;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj0/h;

    iget v14, v1, Lj0/h;->d:F

    iget-object v15, v0, Lj0/a;->s:Lt/l0;

    move-object v6, v4

    move-object/from16 v7, p1

    invoke-virtual/range {v6 .. v15}, Lj0/t;->b(Lx/o;ZJIJFLt/l0;)V

    iget-object v1, v0, Lj0/a;->o:Lm0/n1;

    invoke-virtual {v1, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Lx/o;)V
    .locals 0

    iget-object p1, p0, Lj0/a;->o:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/t;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj0/t;->d()V

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Lj0/a;->n:Lj0/r;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lj0/a;->o:Lm0/n1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lj0/r;->d:Lj0/s;

    iget-object v2, v1, Lj0/s;->a:Ljava/util/HashMap;

    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj0/t;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lj0/t;->c()V

    iget-object v3, v1, Lj0/s;->a:Ljava/util/HashMap;

    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj0/t;

    if-eqz v4, :cond_0

    iget-object v1, v1, Lj0/s;->b:Ljava/util/HashMap;

    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj0/a;

    :cond_0
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lj0/r;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
