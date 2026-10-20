.class public abstract Lr1/e1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lk1/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lk1/b;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lk1/b;-><init>(I)V

    sput-object v0, Lr1/e1;->a:Lk1/b;

    return-void
.end method

.method public static final a(Lr1/h1;Ly0/o;Lc9/e;Lm0/m;II)V
    .locals 7

    check-cast p3, Lm0/q;

    const v0, -0x1e845847

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    sget-object p1, Ly0/l;->b:Ly0/l;

    :cond_0
    move-object v2, p1

    iget p1, p3, Lm0/q;->P:I

    invoke-static {p3}, Lm9/e0;->K(Lm0/m;)Lm0/o;

    move-result-object v0

    invoke-static {p3, v2}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object v1

    invoke-virtual {p3}, Lm0/q;->p()Lm0/r1;

    move-result-object v3

    sget-object v4, Lt1/j;->c:Lt1/j;

    const v5, 0x53ca7ea5

    invoke-virtual {p3, v5}, Lm0/q;->Z(I)V

    iget-object v5, p3, Lm0/q;->a:Lm0/d;

    instance-of v5, v5, Lm0/d;

    if-eqz v5, :cond_6

    invoke-virtual {p3}, Lm0/q;->c0()V

    iget-boolean v5, p3, Lm0/q;->O:Z

    if-eqz v5, :cond_1

    new-instance v5, Lu/e1;

    const/4 v6, 0x4

    invoke-direct {v5, v4, v6}, Lu/e1;-><init>(Lc9/a;I)V

    invoke-virtual {p3, v5}, Lm0/q;->o(Lc9/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lm0/q;->o0()V

    :goto_0
    iget-object v4, p0, Lr1/h1;->c:Lr1/g1;

    invoke-static {p3, p0, v4}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-object v4, p0, Lr1/h1;->d:Lr1/g1;

    invoke-static {p3, v0, v4}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    iget-object v0, p0, Lr1/h1;->e:Lr1/g1;

    invoke-static {p3, p2, v0}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/l;->k:Lt1/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt1/k;->d:Lt1/i;

    invoke-static {p3, v3, v0}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/k;->c:Lt1/i;

    invoke-static {p3, v1, v0}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/k;->f:Lt1/i;

    iget-boolean v1, p3, Lm0/q;->O:Z

    if-nez v1, :cond_2

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {p1, p3, p1, v0}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_3
    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Lm0/q;->t(Z)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lm0/q;->t(Z)V

    invoke-virtual {p3}, Lm0/q;->G()Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Lt/l0;

    const/16 v0, 0x17

    invoke-direct {p1, p0, v0}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p3}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    :cond_4
    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p3, La0/r;

    const/4 v6, 0x4

    move-object v0, p3

    move-object v1, p0

    move-object v3, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, La0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq8/a;III)V

    iput-object p3, p1, Lm0/x1;->d:Lc9/e;

    :cond_5
    return-void

    :cond_6
    invoke-static {}, Lm9/e0;->C()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(Ly0/o;Lc9/e;Lm0/m;II)V
    .locals 8

    move-object v6, p2

    check-cast v6, Lm0/q;

    const v0, -0x4d634bd0    # -1.824273E-8f

    invoke-virtual {v6, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_2

    invoke-virtual {v6, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x70

    if-nez v3, :cond_5

    invoke-virtual {v6, p1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-virtual {v6}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lm0/q;->U()V

    move-object v1, p0

    goto :goto_6

    :cond_7
    :goto_4
    if-eqz v0, :cond_8

    sget-object v0, Ly0/l;->b:Ly0/l;

    move-object v7, v0

    goto :goto_5

    :cond_8
    move-object v7, p0

    :goto_5
    const v0, -0x1d58f75c

    invoke-virtual {v6, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v6}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    if-ne v0, v1, :cond_9

    new-instance v0, Lr1/h1;

    sget-object v1, Lr1/k;->e:Lr1/k;

    invoke-direct {v0, v1}, Lr1/h1;-><init>(Lr1/k1;)V

    invoke-virtual {v6, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lm0/q;->t(Z)V

    check-cast v0, Lr1/h1;

    shl-int/lit8 v1, v2, 0x3

    and-int/lit8 v2, v1, 0x70

    or-int/lit8 v2, v2, 0x8

    and-int/lit16 v1, v1, 0x380

    or-int v4, v2, v1

    const/4 v5, 0x0

    move-object v1, v7

    move-object v2, p1

    move-object v3, v6

    invoke-static/range {v0 .. v5}, Lr1/e1;->a(Lr1/h1;Ly0/o;Lc9/e;Lm0/m;II)V

    move-object v1, v7

    :goto_6
    invoke-virtual {v6}, Lm0/q;->x()Lm0/x1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v7, Lh0/p0;

    const/4 v5, 0x1

    move-object v0, v7

    move-object v2, p1

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lh0/p0;-><init>(Ly0/o;Lc9/e;III)V

    iput-object v7, v6, Lm0/x1;->d:Lc9/e;

    :cond_a
    return-void
.end method

.method public static final c(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
