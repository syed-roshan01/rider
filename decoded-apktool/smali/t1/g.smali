.class public abstract Lt1/g;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt1/e;

.field public static final b:Lm2/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt1/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt1/g;->a:Lt1/e;

    new-instance v0, Lm2/c;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, Lm2/c;-><init>(FF)V

    sput-object v0, Lt1/g;->b:Lm2/c;

    return-void
.end method

.method public static final A(Lt1/n;)Lt1/l1;
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p0

    iget-object p0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "This node does not have an owner."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final B(Lt1/u1;Lo1/n;)V
    .locals 10

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-eqz v1, :cond_b

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_a

    iget-object v2, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->e:Ly0/n;

    iget v2, v2, Ly0/n;->d:I

    const/high16 v3, 0x40000

    and-int/2addr v2, v3

    const/4 v4, 0x0

    if-eqz v2, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v2, v0, Ly0/n;->c:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_7

    move-object v2, v0

    move-object v5, v4

    :goto_2
    if-eqz v2, :cond_7

    instance-of v6, v2, Lt1/u1;

    if-eqz v6, :cond_0

    check-cast v2, Lt1/u1;

    invoke-interface {p0}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-static {p0, v2}, Ld9/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {p1, v2}, Lo1/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_6

    return-void

    :cond_0
    iget v6, v2, Ly0/n;->c:I

    and-int/2addr v6, v3

    if-eqz v6, :cond_6

    instance-of v6, v2, Lt1/o;

    if-eqz v6, :cond_6

    move-object v6, v2

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_5

    iget v9, v6, Ly0/n;->c:I

    and-int/2addr v9, v3

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v2, v6

    goto :goto_4

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, Lo0/i;

    const/16 v8, 0x10

    new-array v8, v8, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v5, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v4

    :cond_3
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_2

    :cond_7
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v0, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    goto/16 :goto_0

    :cond_9
    move-object v0, v4

    goto/16 :goto_0

    :cond_a
    return-void

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitAncestors called on an unattached node"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final C(Lt1/u1;Lc9/c;)V
    .locals 10

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-eqz v1, :cond_c

    new-instance v1, Lo0/i;

    const/16 v2, 0x10

    new-array v3, v2, [Ly0/n;

    invoke-direct {v1, v3}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iget-object v3, v0, Ly0/n;->f:Ly0/n;

    if-nez v3, :cond_0

    invoke-static {v1, v0}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lo0/i;->l()Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, v1, Lo0/i;->c:I

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    invoke-virtual {v1, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n;

    iget v4, v0, Ly0/n;->d:I

    const/high16 v5, 0x40000

    and-int/2addr v4, v5

    if-nez v4, :cond_2

    invoke-static {v1, v0}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v0, :cond_1

    iget v4, v0, Ly0/n;->c:I

    and-int/2addr v4, v5

    if-eqz v4, :cond_a

    const/4 v4, 0x0

    move-object v6, v4

    :goto_2
    if-eqz v0, :cond_1

    instance-of v7, v0, Lt1/u1;

    if-eqz v7, :cond_3

    check-cast v0, Lt1/u1;

    invoke-interface {p0}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-static {p0, v0}, Ld9/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {p1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    return-void

    :cond_3
    iget v7, v0, Ly0/n;->c:I

    and-int/2addr v7, v5

    if-eqz v7, :cond_9

    instance-of v7, v0, Lt1/o;

    if-eqz v7, :cond_9

    move-object v7, v0

    check-cast v7, Lt1/o;

    iget-object v7, v7, Lt1/o;->v:Ly0/n;

    const/4 v8, 0x0

    :goto_3
    if-eqz v7, :cond_8

    iget v9, v7, Ly0/n;->c:I

    and-int/2addr v9, v5

    if-eqz v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v3, :cond_4

    move-object v0, v7

    goto :goto_4

    :cond_4
    if-nez v6, :cond_5

    new-instance v6, Lo0/i;

    new-array v9, v2, [Ly0/n;

    invoke-direct {v6, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v6, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_6
    invoke-virtual {v6, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_8
    if-ne v8, v3, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v6}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_2

    :cond_a
    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_b
    return-void

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final D(Lt1/u1;Lc9/c;)V
    .locals 12

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-eqz v1, :cond_e

    new-instance v1, Lo0/i;

    const/16 v2, 0x10

    new-array v3, v2, [Ly0/n;

    invoke-direct {v1, v3}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iget-object v3, v0, Ly0/n;->f:Ly0/n;

    if-nez v3, :cond_0

    invoke-static {v1, v0}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lo0/i;->l()Z

    move-result v0

    if-eqz v0, :cond_d

    iget v0, v1, Lo0/i;->c:I

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    invoke-virtual {v1, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n;

    iget v4, v0, Ly0/n;->d:I

    const/high16 v5, 0x40000

    and-int/2addr v4, v5

    if-eqz v4, :cond_c

    move-object v4, v0

    :goto_1
    if-eqz v4, :cond_c

    iget v6, v4, Ly0/n;->c:I

    and-int/2addr v6, v5

    if-eqz v6, :cond_b

    const/4 v6, 0x0

    move-object v7, v4

    move-object v8, v6

    :goto_2
    if-eqz v7, :cond_b

    instance-of v9, v7, Lt1/u1;

    if-eqz v9, :cond_4

    check-cast v7, Lt1/u1;

    invoke-interface {p0}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v7}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-static {p0, v7}, Ld9/i;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {p1, v7}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt1/t1;

    goto :goto_3

    :cond_2
    sget-object v7, Lt1/t1;->a:Lt1/t1;

    :goto_3
    sget-object v9, Lt1/t1;->c:Lt1/t1;

    if-ne v7, v9, :cond_3

    return-void

    :cond_3
    sget-object v9, Lt1/t1;->b:Lt1/t1;

    if-eq v7, v9, :cond_1

    goto :goto_6

    :cond_4
    iget v9, v7, Ly0/n;->c:I

    and-int/2addr v9, v5

    if-eqz v9, :cond_a

    instance-of v9, v7, Lt1/o;

    if-eqz v9, :cond_a

    move-object v9, v7

    check-cast v9, Lt1/o;

    iget-object v9, v9, Lt1/o;->v:Ly0/n;

    const/4 v10, 0x0

    :goto_4
    if-eqz v9, :cond_9

    iget v11, v9, Ly0/n;->c:I

    and-int/2addr v11, v5

    if-eqz v11, :cond_8

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v3, :cond_5

    move-object v7, v9

    goto :goto_5

    :cond_5
    if-nez v8, :cond_6

    new-instance v8, Lo0/i;

    new-array v11, v2, [Ly0/n;

    invoke-direct {v8, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v7, :cond_7

    invoke-virtual {v8, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v7, v6

    :cond_7
    invoke-virtual {v8, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_8
    :goto_5
    iget-object v9, v9, Ly0/n;->f:Ly0/n;

    goto :goto_4

    :cond_9
    if-ne v10, v3, :cond_a

    goto :goto_2

    :cond_a
    :goto_6
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v7

    goto :goto_2

    :cond_b
    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_c
    invoke-static {v1, v0}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto/16 :goto_0

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitSubtreeIf called on an unattached node"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(FZ)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    int-to-long v0, p0

    if-eqz p1, :cond_0

    const-wide/16 p0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 p0, 0x0

    :goto_0
    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final b(Lo0/i;Ly0/n;)V
    .locals 2

    invoke-static {p1}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object p1

    iget v0, p1, Lo0/i;->c:I

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    iget-object p1, p1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_0
    aget-object v1, p1, v0

    check-cast v1, Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v1, Lt1/x0;->e:Ly0/n;

    invoke-virtual {p0, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_0

    :cond_1
    return-void
.end method

.method public static final c(Lt1/q0;Lr1/a;)I
    .locals 4

    invoke-virtual {p0}, Lt1/q0;->m0()Lt1/q0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lt1/q0;->s0()Lr1/k0;

    move-result-object v1

    invoke-interface {v1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, -0x80000000

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lt1/q0;->s0()Lr1/k0;

    move-result-object p0

    invoke-interface {p0}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lt1/q0;->p(Lr1/a;)I

    move-result v1

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    iput-boolean v2, v0, Lt1/q0;->f:Z

    iput-boolean v2, p0, Lt1/q0;->n:Z

    invoke-virtual {p0}, Lt1/q0;->x0()V

    const/4 v2, 0x0

    iput-boolean v2, v0, Lt1/q0;->f:Z

    iput-boolean v2, p0, Lt1/q0;->n:Z

    instance-of p0, p1, Lr1/o;

    if-eqz p0, :cond_2

    invoke-virtual {v0}, Lt1/q0;->v0()J

    move-result-wide p0

    sget v0, Lm2/i;->c:I

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    :goto_0
    long-to-int p0, p0

    add-int/2addr v1, p0

    move v2, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lt1/q0;->v0()J

    move-result-wide p0

    sget v0, Lm2/i;->c:I

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    goto :goto_0

    :cond_3
    :goto_1
    return v2

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Child of "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cannot be null when calculating alignment line"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final d(Lt1/d;)Z
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p0

    iget-object p0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p0, p0, Lt1/x0;->d:Lt1/s1;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"

    invoke-static {p0, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p0, p0, Lt1/s1;->u:Z

    return p0
.end method

.method public static final e(Lt1/n;I)Ly0/n;
    .locals 3

    check-cast p0, Ly0/n;

    iget-object p0, p0, Ly0/n;->a:Ly0/n;

    iget-object p0, p0, Ly0/n;->f:Ly0/n;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Ly0/n;->d:I

    and-int/2addr v1, p1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    iget v1, p0, Ly0/n;->c:I

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    and-int/2addr v1, p1

    if-eqz v1, :cond_3

    move-object v0, p0

    goto :goto_1

    :cond_3
    iget-object p0, p0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static final f(Lo0/i;)Ly0/n;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lo0/i;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lo0/i;->c:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly0/n;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final g(Ly0/n;)Lt1/b0;
    .locals 2

    iget v0, p0, Ly0/n;->c:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    instance-of v0, p0, Lt1/b0;

    if-eqz v0, :cond_0

    check-cast p0, Lt1/b0;

    return-object p0

    :cond_0
    instance-of v0, p0, Lt1/o;

    if-eqz v0, :cond_3

    check-cast p0, Lt1/o;

    iget-object p0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz p0, :cond_3

    instance-of v0, p0, Lt1/b0;

    if-eqz v0, :cond_1

    check-cast p0, Lt1/b0;

    return-object p0

    :cond_1
    instance-of v0, p0, Lt1/o;

    if-eqz v0, :cond_2

    iget v0, p0, Ly0/n;->c:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    check-cast p0, Lt1/o;

    iget-object p0, p0, Lt1/o;->v:Ly0/n;

    goto :goto_0

    :cond_2
    iget-object p0, p0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static final h(Ly0/n;)V
    .locals 2

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lt1/g;->i(Ly0/n;II)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "autoInvalidateInsertedNode called on unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Ly0/n;II)V
    .locals 2

    instance-of v0, p0, Lt1/o;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lt1/o;

    iget v1, v0, Lt1/o;->u:I

    and-int/2addr v1, p1

    invoke-static {p0, v1, p2}, Lt1/g;->j(Ly0/n;II)V

    iget p0, v0, Lt1/o;->u:I

    not-int p0, p0

    and-int/2addr p0, p1

    iget-object p1, v0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1, p0, p2}, Lt1/g;->i(Ly0/n;II)V

    iget-object p1, p1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    iget v0, p0, Ly0/n;->c:I

    and-int/2addr p1, v0

    invoke-static {p0, p1, p2}, Lt1/g;->j(Ly0/n;II)V

    :cond_1
    return-void
.end method

.method public static final j(Ly0/n;II)V
    .locals 9

    if-nez p2, :cond_0

    invoke-virtual {p0}, Ly0/n;->w0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    instance-of v0, p0, Lt1/b0;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lt1/b0;

    invoke-static {v0}, Lt1/g;->t(Lt1/b0;)V

    if-ne p2, v3, :cond_1

    invoke-static {p0, v3}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v0

    iput-boolean v4, v0, Lt1/c1;->s:Z

    iget-object v5, v0, Lt1/c1;->F:Lt/l0;

    invoke-virtual {v5}, Lt/l0;->invoke()Ljava/lang/Object;

    iget-object v5, v0, Lt1/c1;->H:Lt1/j1;

    if-eqz v5, :cond_1

    invoke-virtual {v0, v1, v2}, Lt1/c1;->c1(Lc9/c;Z)V

    :cond_1
    and-int/lit16 v0, p1, 0x100

    if-eqz v0, :cond_2

    instance-of v0, p0, Lt1/t;

    if-eqz v0, :cond_2

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->z()V

    :cond_2
    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_3

    instance-of v0, p0, Lt1/s;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lt1/s;

    invoke-static {v0}, Lt1/g;->s(Lt1/s;)V

    :cond_3
    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_4

    instance-of v0, p0, Lt1/r1;

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Lt1/r1;

    invoke-static {v0}, Lt1/g;->u(Lt1/r1;)V

    :cond_4
    and-int/lit8 v0, p1, 0x40

    if-eqz v0, :cond_5

    instance-of v0, p0, Lt1/o1;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Lt1/o1;

    invoke-static {v0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v5, v0, Lt1/n0;->o:Lt1/l0;

    iput-boolean v4, v5, Lt1/l0;->w:Z

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_5

    iput-boolean v4, v0, Lt1/k0;->A:Z

    :cond_5
    and-int/lit16 v0, p1, 0x400

    if-eqz v0, :cond_7

    instance-of v0, p0, Lc1/p;

    if-eqz v0, :cond_7

    if-ne p2, v3, :cond_6

    invoke-virtual {p0}, Ly0/n;->B0()V

    goto :goto_0

    :cond_6
    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    move-object v5, p0

    check-cast v5, Lc1/p;

    check-cast v0, Lc1/f;

    iget-object v0, v0, Lc1/f;->b:Lc1/d;

    iget-object v6, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v6, v5}, Lc1/d;->a(Ljava/util/LinkedHashSet;Ljava/lang/Object;)V

    :cond_7
    :goto_0
    and-int/lit16 v0, p1, 0x800

    if-eqz v0, :cond_15

    instance-of v0, p0, Lc1/j;

    if-eqz v0, :cond_15

    move-object v0, p0

    check-cast v0, Lc1/j;

    sput-object v1, Lt1/h;->b:Ljava/lang/Boolean;

    sget-object v5, Lt1/h;->a:Lt1/h;

    invoke-interface {v0, v5}, Lc1/j;->s0(Lc1/h;)V

    sget-object v5, Lt1/h;->b:Ljava/lang/Boolean;

    if-eqz v5, :cond_15

    if-ne p2, v3, :cond_14

    check-cast v0, Ly0/n;

    iget-object p2, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v0, p2, Ly0/n;->t:Z

    if-eqz v0, :cond_13

    new-instance v0, Lo0/i;

    const/16 v3, 0x10

    new-array v5, v3, [Ly0/n;

    invoke-direct {v0, v5}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iget-object v5, p2, Ly0/n;->f:Ly0/n;

    if-nez v5, :cond_8

    invoke-static {v0, p2}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_1

    :cond_8
    invoke-virtual {v0, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_9
    :goto_1
    invoke-virtual {v0}, Lo0/i;->l()Z

    move-result p2

    if-eqz p2, :cond_15

    iget p2, v0, Lo0/i;->c:I

    sub-int/2addr p2, v4

    invoke-virtual {v0, p2}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/n;

    iget v5, p2, Ly0/n;->d:I

    and-int/lit16 v5, v5, 0x400

    if-nez v5, :cond_a

    invoke-static {v0, p2}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_1

    :cond_a
    :goto_2
    if-eqz p2, :cond_9

    iget v5, p2, Ly0/n;->c:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_12

    move-object v5, v1

    :goto_3
    if-eqz p2, :cond_9

    instance-of v6, p2, Lc1/p;

    if-eqz v6, :cond_b

    check-cast p2, Lc1/p;

    invoke-static {p2}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v6

    check-cast v6, Lu1/w;

    invoke-virtual {v6}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v6

    check-cast v6, Lc1/f;

    iget-object v6, v6, Lc1/f;->b:Lc1/d;

    iget-object v7, v6, Lc1/d;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v6, v7, p2}, Lc1/d;->a(Ljava/util/LinkedHashSet;Ljava/lang/Object;)V

    goto :goto_6

    :cond_b
    iget v6, p2, Ly0/n;->c:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_11

    instance-of v6, p2, Lt1/o;

    if-eqz v6, :cond_11

    move-object v6, p2

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    move v7, v2

    :goto_4
    if-eqz v6, :cond_10

    iget v8, v6, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_f

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v4, :cond_c

    move-object p2, v6

    goto :goto_5

    :cond_c
    if-nez v5, :cond_d

    new-instance v5, Lo0/i;

    new-array v8, v3, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_d
    if-eqz p2, :cond_e

    invoke-virtual {v5, p2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object p2, v1

    :cond_e
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_f
    :goto_5
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_4

    :cond_10
    if-ne v7, v4, :cond_11

    goto :goto_3

    :cond_11
    :goto_6
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object p2

    goto :goto_3

    :cond_12
    iget-object p2, p2, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    invoke-static {v0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object p2

    check-cast p2, Lu1/w;

    invoke-virtual {p2}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p2

    check-cast p2, Lc1/f;

    iget-object p2, p2, Lc1/f;->b:Lc1/d;

    iget-object v1, p2, Lc1/d;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {p2, v1, v0}, Lc1/d;->a(Ljava/util/LinkedHashSet;Ljava/lang/Object;)V

    :cond_15
    and-int/lit16 p1, p1, 0x1000

    if-eqz p1, :cond_16

    instance-of p1, p0, Lc1/c;

    if-eqz p1, :cond_16

    check-cast p0, Lc1/c;

    invoke-static {p0}, Landroidx/compose/ui/focus/a;->q(Lc1/c;)V

    :cond_16
    return-void
.end method

.method public static final k(Ly0/n;)V
    .locals 2

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lt1/g;->i(Ly0/n;II)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final l(Ly0/m;)I
    .locals 2

    instance-of v0, p0, Lr1/v;

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    instance-of v1, p0, Lb1/f;

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    instance-of v1, p0, Ly1/k;

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x8

    :cond_2
    instance-of v1, p0, Ls1/d;

    if-nez v1, :cond_3

    instance-of v1, p0, Ls1/g;

    if-eqz v1, :cond_4

    :cond_3
    or-int/lit8 v0, v0, 0x20

    :cond_4
    instance-of v1, p0, Lr1/q0;

    if-eqz v1, :cond_5

    or-int/lit16 v0, v0, 0x100

    :cond_5
    instance-of v1, p0, Lr1/u0;

    if-eqz v1, :cond_6

    or-int/lit8 v0, v0, 0x40

    :cond_6
    instance-of p0, p0, Lr1/s0;

    if-eqz p0, :cond_7

    or-int/lit16 v0, v0, 0x80

    :cond_7
    return v0
.end method

.method public static final m(Ly0/n;)I
    .locals 2

    iget v0, p0, Ly0/n;->c:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    instance-of v0, p0, Lt1/b0;

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    instance-of v1, p0, Lt1/s;

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x4

    :cond_2
    instance-of v1, p0, Lt1/r1;

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x8

    :cond_3
    instance-of v1, p0, Lt1/p1;

    if-eqz v1, :cond_4

    or-int/lit8 v0, v0, 0x10

    :cond_4
    instance-of v1, p0, Ls1/f;

    if-eqz v1, :cond_5

    or-int/lit8 v0, v0, 0x20

    :cond_5
    instance-of v1, p0, Lt1/o1;

    if-eqz v1, :cond_6

    or-int/lit8 v0, v0, 0x40

    :cond_6
    instance-of v1, p0, Lt1/a0;

    if-eqz v1, :cond_7

    or-int/lit16 v0, v0, 0x80

    :cond_7
    instance-of v1, p0, Lt1/t;

    if-eqz v1, :cond_8

    or-int/lit16 v0, v0, 0x100

    :cond_8
    instance-of v1, p0, Lc1/p;

    if-eqz v1, :cond_9

    or-int/lit16 v0, v0, 0x400

    :cond_9
    instance-of v1, p0, Lc1/j;

    if-eqz v1, :cond_a

    or-int/lit16 v0, v0, 0x800

    :cond_a
    instance-of v1, p0, Lc1/c;

    if-eqz v1, :cond_b

    or-int/lit16 v0, v0, 0x1000

    :cond_b
    instance-of v1, p0, Lm1/c;

    if-eqz v1, :cond_c

    or-int/lit16 v0, v0, 0x2000

    :cond_c
    instance-of v1, p0, Lq1/a;

    if-eqz v1, :cond_d

    or-int/lit16 v0, v0, 0x4000

    :cond_d
    instance-of v1, p0, Lt1/m;

    if-eqz v1, :cond_e

    const v1, 0x8000

    or-int/2addr v0, v1

    :cond_e
    instance-of p0, p0, Lt1/u1;

    if-eqz p0, :cond_f

    const/high16 p0, 0x40000

    or-int/2addr v0, p0

    :cond_f
    return v0
.end method

.method public static final n(Ly0/n;)I
    .locals 2

    instance-of v0, p0, Lt1/o;

    if-eqz v0, :cond_0

    check-cast p0, Lt1/o;

    iget v0, p0, Lt1/o;->u:I

    iget-object p0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lt1/g;->n(Ly0/n;)I

    move-result v1

    or-int/2addr v0, v1

    iget-object p0, p0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lt1/g;->m(Ly0/n;)I

    move-result v0

    :cond_1
    return v0
.end method

.method public static final o(JJ)I
    .locals 5

    const-wide v0, 0xffffffffL

    and-long v2, p0, v0

    long-to-int v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-long/2addr v0, p2

    long-to-int v0, v0

    if-eqz v0, :cond_1

    move v3, v4

    :cond_1
    if-eq v2, v3, :cond_3

    if-eqz v2, :cond_2

    const/4 v4, -0x1

    :cond_2
    return v4

    :cond_3
    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    shr-long p1, p2, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    move-result p0

    float-to-int p0, p0

    return p0
.end method

.method public static final p(Lt1/m;Lm0/u1;)Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p0

    iget-object p0, p0, Landroidx/compose/ui/node/a;->A:Lm0/b0;

    check-cast p0, Lu0/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Ld7/t;->k0(Lm0/r1;Lm0/u1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final q([I)I
    .locals 3

    const/4 v0, 0x2

    aget v0, p0, v0

    const/4 v1, 0x0

    aget v1, p0, v1

    sub-int/2addr v0, v1

    const/4 v1, 0x3

    aget v1, p0, v1

    const/4 v2, 0x1

    aget p0, p0, v2

    sub-int/2addr v1, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static final r(I)Z
    .locals 0

    and-int/lit16 p0, p0, 0x80

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final s(Lt1/s;)V
    .locals 1

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object p0

    invoke-virtual {p0}, Lt1/c1;->P0()V

    :cond_0
    return-void
.end method

.method public static final t(Lt1/b0;)V
    .locals 0

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->z()V

    return-void
.end method

.method public static final u(Lt1/r1;)V
    .locals 0

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->A()V

    return-void
.end method

.method public static final v(Landroidx/compose/ui/node/a;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean p0, p0, Lt1/n0;->b:Z

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final w(Ly0/n;Lc9/a;)V
    .locals 2

    iget-object v0, p0, Ly0/n;->n:Lt1/g1;

    if-nez v0, :cond_0

    new-instance v0, Lt1/g1;

    move-object v1, p0

    check-cast v1, Lt1/f1;

    invoke-direct {v0, v1}, Lt1/g1;-><init>(Lt1/f1;)V

    iput-object v0, p0, Ly0/n;->n:Lt1/g1;

    :cond_0
    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object p0

    check-cast p0, Lu1/w;

    invoke-virtual {p0}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object p0

    sget-object v1, Lt1/f;->r:Lt1/f;

    invoke-virtual {p0, v0, v1, p1}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    return-void
.end method

.method public static final x(Lt1/n;I)Lt1/c1;
    .locals 2

    move-object v0, p0

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-object v0, v0, Ly0/n;->o:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lt1/g;->r(I)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final y(Lt1/n;)Landroidx/compose/ui/node/a;
    .locals 1

    check-cast p0, Ly0/n;

    iget-object p0, p0, Ly0/n;->a:Ly0/n;

    iget-object p0, p0, Ly0/n;->o:Lt1/c1;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final z(Landroidx/compose/ui/node/a;)Lt1/l1;
    .locals 1

    iget-object p0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "LayoutNode should be attached to an owner"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
