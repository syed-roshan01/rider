.class public abstract Ly/p;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ly/s;

.field public static final b:Ly/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly/s;

    sget-object v1, Ly0/a;->a:Ly0/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly/s;-><init>(Ly0/g;Z)V

    sput-object v0, Ly/p;->a:Ly/s;

    sget-object v0, Ly/o;->a:Ly/o;

    sput-object v0, Ly/p;->b:Ly/o;

    return-void
.end method

.method public static final a(Ly0/o;Lm0/m;I)V
    .locals 7

    check-cast p1, Lm0/q;

    const v0, -0xc96ce69

    invoke-virtual {p1, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p2, 0xe

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v0, v0, 0xb

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lm0/q;->U()V

    goto :goto_4

    :cond_3
    :goto_2
    const v0, 0x207baf9a

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    iget v0, p1, Lm0/q;->P:I

    invoke-static {p1, p0}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object v1

    invoke-virtual {p1}, Lm0/q;->p()Lm0/r1;

    move-result-object v3

    sget-object v4, Lt1/l;->k:Lt1/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt1/k;->b:Lt1/j;

    const v5, 0x53ca7ea5

    invoke-virtual {p1, v5}, Lm0/q;->Z(I)V

    iget-object v5, p1, Lm0/q;->a:Lm0/d;

    instance-of v5, v5, Lm0/d;

    if-eqz v5, :cond_8

    invoke-virtual {p1}, Lm0/q;->c0()V

    iget-boolean v5, p1, Lm0/q;->O:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_4

    new-instance v5, Lu/e1;

    invoke-direct {v5, v4, v6}, Lu/e1;-><init>(Lc9/a;I)V

    invoke-virtual {p1, v5}, Lm0/q;->o(Lc9/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lm0/q;->o0()V

    :goto_3
    sget-object v4, Lt1/k;->e:Lt1/i;

    sget-object v5, Ly/p;->b:Ly/o;

    invoke-static {p1, v5, v4}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v4, Lt1/k;->d:Lt1/i;

    invoke-static {p1, v3, v4}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v3, Lt1/k;->c:Lt1/i;

    invoke-static {p1, v1, v3}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->f:Lt1/i;

    iget-boolean v3, p1, Lm0/q;->O:Z

    if-nez v3, :cond_5

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v0, p1, v0, v1}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_6
    invoke-virtual {p1, v6}, Lm0/q;->t(Z)V

    invoke-virtual {p1, v2}, Lm0/q;->t(Z)V

    invoke-virtual {p1, v2}, Lm0/q;->t(Z)V

    :goto_4
    invoke-virtual {p1}, Lm0/q;->x()Lm0/x1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Ly/m;

    invoke-direct {v0, p0, p2, v2}, Ly/m;-><init>(Ly0/o;II)V

    iput-object v0, p1, Lm0/x1;->d:Lc9/e;

    :cond_7
    return-void

    :cond_8
    invoke-static {}, Lm9/e0;->C()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(Lr1/w0;Lr1/x0;Lr1/i0;Lm2/l;IILy0/d;)V
    .locals 7

    invoke-interface {p2}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ly/l;

    if-eqz v0, :cond_0

    check-cast p2, Ly/l;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Ly/l;->u:Ly0/d;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p6, p2

    :cond_2
    :goto_1
    iget p2, p1, Lr1/x0;->a:I

    iget v0, p1, Lr1/x0;->b:I

    invoke-static {p2, v0}, Lo1/s;->e(II)J

    move-result-wide v2

    invoke-static {p4, p5}, Lo1/s;->e(II)J

    move-result-wide v4

    move-object v1, p6

    check-cast v1, Ly0/g;

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Ly0/g;->a(JJLm2/l;)J

    move-result-wide p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p3, p0}, Lr1/w0;->e(Lr1/x0;JF)V

    return-void
.end method

.method public static final c(Ly0/g;ZLm0/m;)Lr1/j0;
    .locals 3

    check-cast p2, Lm0/q;

    const v0, 0x35e7844

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    sget-object v0, Ly0/a;->a:Ly0/g;

    invoke-static {p0, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    sget-object p0, Ly/p;->a:Ly/s;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v2, 0x1e7b2b64

    invoke-virtual {p2, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p2, v0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Ly/s;

    invoke-direct {v2, p0, p1}, Ly/s;-><init>(Ly0/g;Z)V

    invoke-virtual {p2, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p2, v1}, Lm0/q;->t(Z)V

    move-object p0, v2

    check-cast p0, Lr1/j0;

    :goto_0
    invoke-virtual {p2, v1}, Lm0/q;->t(Z)V

    return-object p0
.end method
