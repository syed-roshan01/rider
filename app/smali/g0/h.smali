.class public final Lg0/h;
.super Ly0/n;

# interfaces
.implements Lt1/b0;
.implements Lt1/s;
.implements Lt1/r1;


# instance fields
.field public A:I

.field public B:I

.field public C:Ljava/util/List;

.field public D:Lc9/c;

.field public E:Ljava/util/Map;

.field public F:Lg0/d;

.field public G:Lg0/g;

.field public final H:Lm0/n1;

.field public u:La2/e;

.field public v:La2/c0;

.field public w:Lf2/d;

.field public x:Lc9/c;

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(La2/e;La2/c0;Lf2/d;Lc9/c;IZIILjava/util/List;Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lg0/h;->u:La2/e;

    iput-object p2, p0, Lg0/h;->v:La2/c0;

    iput-object p3, p0, Lg0/h;->w:Lf2/d;

    iput-object p4, p0, Lg0/h;->x:Lc9/c;

    iput p5, p0, Lg0/h;->y:I

    iput-boolean p6, p0, Lg0/h;->z:Z

    iput p7, p0, Lg0/h;->A:I

    iput p8, p0, Lg0/h;->B:I

    iput-object p9, p0, Lg0/h;->C:Ljava/util/List;

    iput-object p10, p0, Lg0/h;->D:Lc9/c;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lg0/h;->H:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final G0(ZZZZ)V
    .locals 6

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lg0/h;->G:Lg0/g;

    if-eqz v0, :cond_2

    :cond_1
    invoke-static {p0}, Lt1/g;->u(Lt1/r1;)V

    :cond_2
    if-nez p2, :cond_3

    if-nez p3, :cond_3

    if-eqz p4, :cond_4

    :cond_3
    invoke-virtual {p0}, Lg0/h;->H0()Lg0/d;

    move-result-object p2

    iget-object p3, p0, Lg0/h;->u:La2/e;

    iget-object p4, p0, Lg0/h;->v:La2/c0;

    iget-object v0, p0, Lg0/h;->w:Lf2/d;

    iget v1, p0, Lg0/h;->y:I

    iget-boolean v2, p0, Lg0/h;->z:Z

    iget v3, p0, Lg0/h;->A:I

    iget v4, p0, Lg0/h;->B:I

    iget-object v5, p0, Lg0/h;->C:Ljava/util/List;

    iput-object p3, p2, Lg0/d;->a:La2/e;

    iput-object p4, p2, Lg0/d;->b:La2/c0;

    iput-object v0, p2, Lg0/d;->c:Lf2/d;

    iput v1, p2, Lg0/d;->d:I

    iput-boolean v2, p2, Lg0/d;->e:Z

    iput v3, p2, Lg0/d;->f:I

    iput v4, p2, Lg0/d;->g:I

    iput-object v5, p2, Lg0/d;->h:Ljava/util/List;

    const/4 p3, 0x0

    iput-object p3, p2, Lg0/d;->l:La2/k;

    iput-object p3, p2, Lg0/d;->n:La2/a0;

    const/4 p3, -0x1

    iput p3, p2, Lg0/d;->p:I

    iput p3, p2, Lg0/d;->o:I

    invoke-static {p0}, Lt1/g;->t(Lt1/b0;)V

    invoke-static {p0}, Lt1/g;->s(Lt1/s;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-static {p0}, Lt1/g;->s(Lt1/s;)V

    :cond_5
    return-void
.end method

.method public final H0()Lg0/d;
    .locals 10

    iget-object v0, p0, Lg0/h;->F:Lg0/d;

    if-nez v0, :cond_0

    new-instance v0, Lg0/d;

    iget-object v2, p0, Lg0/h;->u:La2/e;

    iget-object v3, p0, Lg0/h;->v:La2/c0;

    iget-object v4, p0, Lg0/h;->w:Lf2/d;

    iget v5, p0, Lg0/h;->y:I

    iget-boolean v6, p0, Lg0/h;->z:Z

    iget v7, p0, Lg0/h;->A:I

    iget v8, p0, Lg0/h;->B:I

    iget-object v9, p0, Lg0/h;->C:Ljava/util/List;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lg0/d;-><init>(La2/e;La2/c0;Lf2/d;IZIILjava/util/List;)V

    iput-object v0, p0, Lg0/h;->F:Lg0/d;

    :cond_0
    iget-object v0, p0, Lg0/h;->F:Lg0/d;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final I0(Lm2/b;)Lg0/d;
    .locals 2

    invoke-virtual {p0}, Lg0/h;->J0()Lg0/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lg0/f;->c:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg0/f;->d:Lg0/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg0/d;->c(Lm2/b;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lg0/h;->H0()Lg0/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg0/d;->c(Lm2/b;)V

    return-object v0
.end method

.method public final J0()Lg0/f;
    .locals 1

    iget-object v0, p0, Lg0/h;->H:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/f;

    return-object v0
.end method

.method public final K0(Lc9/c;Lc9/c;)Z
    .locals 2

    iget-object v0, p0, Lg0/h;->x:Lc9/c;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lg0/h;->x:Lc9/c;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lg0/h;->D:Lc9/c;

    invoke-static {v0, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p2, p0, Lg0/h;->D:Lc9/c;

    move p1, v1

    :cond_1
    const/4 p2, 0x0

    invoke-static {p2, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    move v1, p1

    :goto_1
    return v1
.end method

.method public final L0(La2/c0;Ljava/util/List;IIZLf2/d;I)Z
    .locals 2

    iget-object v0, p0, Lg0/h;->v:La2/c0;

    invoke-virtual {v0, p1}, La2/c0;->c(La2/c0;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Lg0/h;->v:La2/c0;

    iget-object p1, p0, Lg0/h;->C:Ljava/util/List;

    invoke-static {p1, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iput-object p2, p0, Lg0/h;->C:Ljava/util/List;

    move v0, v1

    :cond_0
    iget p1, p0, Lg0/h;->B:I

    if-eq p1, p3, :cond_1

    iput p3, p0, Lg0/h;->B:I

    move v0, v1

    :cond_1
    iget p1, p0, Lg0/h;->A:I

    if-eq p1, p4, :cond_2

    iput p4, p0, Lg0/h;->A:I

    move v0, v1

    :cond_2
    iget-boolean p1, p0, Lg0/h;->z:Z

    if-eq p1, p5, :cond_3

    iput-boolean p5, p0, Lg0/h;->z:Z

    move v0, v1

    :cond_3
    iget-object p1, p0, Lg0/h;->w:Lf2/d;

    invoke-static {p1, p6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iput-object p6, p0, Lg0/h;->w:Lf2/d;

    move v0, v1

    :cond_4
    iget p1, p0, Lg0/h;->y:I

    invoke-static {p1, p7}, Lh6/g;->T(II)Z

    move-result p1

    if-nez p1, :cond_5

    iput p7, p0, Lg0/h;->y:I

    goto :goto_0

    :cond_5
    move v1, v0

    :goto_0
    return v1
.end method

.method public final Q(Ly1/j;)V
    .locals 6

    iget-object v0, p0, Lg0/h;->G:Lg0/g;

    if-nez v0, :cond_0

    new-instance v0, Lg0/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg0/g;-><init>(Lg0/h;I)V

    iput-object v0, p0, Lg0/h;->G:Lg0/g;

    :cond_0
    iget-object v1, p0, Lg0/h;->u:La2/e;

    sget-object v2, Ly1/t;->a:[Lj9/f;

    sget-object v2, Ly1/r;->u:Ly1/u;

    invoke-static {v1}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/h;->J0()Lg0/f;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, v1, Lg0/f;->b:La2/e;

    sget-object v3, Ly1/r;->v:Ly1/u;

    sget-object v4, Ly1/t;->a:[Lj9/f;

    const/16 v5, 0xc

    aget-object v5, v4, v5

    invoke-virtual {v3, p1, v2}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    iget-boolean v1, v1, Lg0/f;->c:Z

    sget-object v2, Ly1/r;->w:Ly1/u;

    const/16 v3, 0xd

    aget-object v3, v4, v3

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, p1, v1}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Lg0/g;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg0/g;-><init>(Lg0/h;I)V

    sget-object v2, Ly1/i;->i:Ly1/u;

    new-instance v3, Ly1/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v2, v3}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    new-instance v1, Lg0/g;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lg0/g;-><init>(Lg0/h;I)V

    sget-object v2, Ly1/i;->j:Ly1/u;

    new-instance v3, Ly1/a;

    invoke-direct {v3, v4, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v2, v3}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    new-instance v1, Lt/l0;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    sget-object v2, Ly1/i;->k:Ly1/u;

    new-instance v3, Ly1/a;

    invoke-direct {v3, v4, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v2, v3}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ly1/t;->c(Ly1/v;Lc9/c;)V

    return-void
.end method

.method public final a(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/h;->I0(Lm2/b;)Lg0/d;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lg0/d;->a(ILm2/l;)I

    move-result p1

    return p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/h;->I0(Lm2/b;)Lg0/d;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Lg0/d;->d(Lm2/l;)La2/k;

    move-result-object p1

    invoke-virtual {p1}, La2/k;->c()F

    move-result p1

    invoke-static {p1}, Ld9/i;->n(F)I

    move-result p1

    return p1
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/h;->I0(Lm2/b;)Lg0/d;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Lg0/d;->d(Lm2/l;)La2/k;

    move-result-object p1

    invoke-virtual {p1}, La2/k;->a()F

    move-result p1

    invoke-static {p1}, Ld9/i;->n(F)I

    move-result p1

    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 7

    invoke-virtual {p0, p1}, Lg0/h;->I0(Lm2/b;)Lg0/d;

    move-result-object v0

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v1

    iget v2, v0, Lg0/d;->g:I

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    iget-object v2, v0, Lg0/d;->i:Lg0/b;

    iget-object v4, v0, Lg0/d;->b:La2/c0;

    iget-object v5, v0, Lg0/d;->k:Lm2/b;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, v0, Lg0/d;->c:Lf2/d;

    invoke-static {v2, v1, v4, v5, v6}, La/a;->a(Lg0/b;Lm2/l;La2/c0;Lm2/b;Lf2/d;)Lg0/b;

    move-result-object v2

    iput-object v2, v0, Lg0/d;->i:Lg0/b;

    iget v4, v0, Lg0/d;->g:I

    invoke-virtual {v2, v4, p3, p4}, Lg0/b;->a(IJ)J

    move-result-wide p3

    :cond_0
    iget-object v2, v0, Lg0/d;->n:La2/a0;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v4, v2, La2/a0;->b:La2/i;

    iget-object v5, v4, La2/i;->a:La2/k;

    invoke-virtual {v5}, La2/k;->b()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, v2, La2/a0;->a:La2/z;

    iget-object v5, v2, La2/z;->h:Lm2/l;

    if-eq v1, v5, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v5, v2, La2/z;->j:J

    invoke-static {p3, p4, v5, v6}, Lm2/a;->c(JJ)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result v2

    invoke-static {v5, v6}, Lm2/a;->i(J)I

    move-result v5

    if-eq v2, v5, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v2

    int-to-float v2, v2

    iget v5, v4, La2/i;->e:F

    cmpg-float v2, v2, v5

    if-ltz v2, :cond_8

    iget-boolean v2, v4, La2/i;->c:Z

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    iget-object v2, v0, Lg0/d;->n:La2/a0;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v2, v2, La2/a0;->a:La2/z;

    iget-wide v4, v2, La2/z;->j:J

    invoke-static {p3, p4, v4, v5}, Lm2/a;->c(JJ)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v3, 0x0

    goto :goto_2

    :cond_7
    iget-object v2, v0, Lg0/d;->n:La2/a0;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v2, v2, La2/a0;->b:La2/i;

    invoke-virtual {v0, v1, p3, p4, v2}, Lg0/d;->e(Lm2/l;JLa2/i;)La2/a0;

    move-result-object p3

    iput-object p3, v0, Lg0/d;->n:La2/a0;

    goto :goto_2

    :cond_8
    :goto_1
    invoke-virtual {v0, p3, p4, v1}, Lg0/d;->b(JLm2/l;)La2/i;

    move-result-object v2

    invoke-virtual {v0, v1, p3, p4, v2}, Lg0/d;->e(Lm2/l;JLa2/i;)La2/a0;

    move-result-object p3

    iput-object p3, v0, Lg0/d;->n:La2/a0;

    :goto_2
    iget-object p3, v0, Lg0/d;->n:La2/a0;

    if-eqz p3, :cond_c

    iget-object p4, p3, La2/a0;->b:La2/i;

    iget-object p4, p4, La2/i;->a:La2/k;

    invoke-virtual {p4}, La2/k;->b()Z

    if-eqz v3, :cond_a

    const/4 p4, 0x2

    invoke-static {p0, p4}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object p4

    invoke-virtual {p4}, Lt1/c1;->P0()V

    iget-object p4, p0, Lg0/h;->x:Lc9/c;

    if-eqz p4, :cond_9

    invoke-interface {p4, p3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    sget-object p4, Lr1/d;->a:Lr1/o;

    iget v0, p3, La2/a0;->d:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lq8/f;

    invoke-direct {v1, p4, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p4, Lr1/d;->b:Lr1/o;

    iget v0, p3, La2/a0;->e:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Lq8/f;

    invoke-direct {v2, p4, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Lq8/f;

    move-result-object p4

    invoke-static {p4}, Lr8/v;->D0([Lq8/f;)Ljava/util/Map;

    move-result-object p4

    iput-object p4, p0, Lg0/h;->E:Ljava/util/Map;

    :cond_a
    iget-object p4, p0, Lg0/h;->D:Lc9/c;

    if-eqz p4, :cond_b

    iget-object v0, p3, La2/a0;->f:Ljava/util/List;

    invoke-interface {p4, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    const/16 p4, 0x20

    iget-wide v0, p3, La2/a0;->c:J

    shr-long p3, v0, p4

    long-to-int p3, p3

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p4, v0

    invoke-static {p3, p4}, Lm9/e0;->x(II)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget-object v0, p0, Lg0/h;->E:Ljava/util/Map;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    new-instance v1, Ls/z;

    const/4 v2, 0x6

    invoke-direct {v1, p2, v2}, Ls/z;-><init>(Lr1/x0;I)V

    invoke-interface {p1, p3, p4, v0, v1}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You must call layoutWithConstraints first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/h;->I0(Lm2/b;)Lg0/d;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lg0/d;->a(ILm2/l;)I

    move-result p1

    return p1
.end method

.method public final i(Lg1/e;)V
    .locals 12

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    check-cast v0, Lt1/i0;

    iget-object v0, v0, Lt1/i0;->a:Lg1/c;

    iget-object v0, v0, Lg1/c;->b:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->a()Le1/p;

    move-result-object v0

    invoke-virtual {p0, p1}, Lg0/h;->I0(Lm2/b;)Lg0/d;

    move-result-object v1

    iget-object v1, v1, Lg0/d;->n:La2/a0;

    if-eqz v1, :cond_10

    iget-object v2, v1, La2/a0;->b:La2/i;

    iget-wide v3, v1, La2/a0;->c:J

    const/16 v1, 0x20

    shr-long v5, v3, v1

    long-to-int v5, v5

    int-to-float v5, v5

    iget v6, v2, La2/i;->d:F

    cmpg-float v5, v5, v6

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide v8, 0xffffffffL

    if-gez v5, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v5, v2, La2/i;->c:Z

    if-nez v5, :cond_3

    and-long v10, v3, v8

    long-to-int v5, v10

    int-to-float v5, v5

    iget v10, v2, La2/i;->e:F

    cmpg-float v5, v5, v10

    if-gez v5, :cond_2

    goto :goto_0

    :cond_2
    move v5, v7

    goto :goto_1

    :cond_3
    :goto_0
    move v5, v6

    :goto_1
    if-eqz v5, :cond_4

    iget v5, p0, Lg0/h;->y:I

    const/4 v10, 0x3

    invoke-static {v5, v10}, Lh6/g;->T(II)Z

    move-result v5

    if-nez v5, :cond_4

    move v10, v6

    goto :goto_2

    :cond_4
    move v10, v7

    :goto_2
    if-eqz v10, :cond_5

    shr-long v5, v3, v1

    long-to-int v1, v5

    int-to-float v1, v1

    and-long/2addr v3, v8

    long-to-int v3, v3

    int-to-float v3, v3

    sget-wide v4, Ld1/c;->b:J

    invoke-static {v1, v3}, Ld7/t;->j(FF)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v1

    invoke-interface {v0}, Le1/p;->j()V

    invoke-static {v0, v1}, Le1/p;->o(Le1/p;Ld1/d;)V

    :cond_5
    :try_start_0
    iget-object v1, p0, Lg0/h;->v:La2/c0;

    iget-object v1, v1, La2/c0;->a:La2/x;

    iget-object v3, v1, La2/x;->m:Ll2/j;

    if-nez v3, :cond_6

    sget-object v3, Ll2/j;->b:Ll2/j;

    :cond_6
    move-object v6, v3

    iget-object v3, v1, La2/x;->n:Le1/k0;

    if-nez v3, :cond_7

    sget-object v3, Le1/k0;->d:Le1/k0;

    :cond_7
    move-object v5, v3

    iget-object v3, v1, La2/x;->p:Lg1/h;

    if-nez v3, :cond_8

    sget-object v3, Lg1/j;->a:Lg1/j;

    :cond_8
    move-object v7, v3

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_7

    :goto_3
    iget-object v1, v1, La2/x;->a:Ll2/o;

    invoke-interface {v1}, Ll2/o;->e()Le1/n;

    move-result-object v3

    if-eqz v3, :cond_9

    iget-object v1, p0, Lg0/h;->v:La2/c0;

    iget-object v1, v1, La2/c0;->a:La2/x;

    iget-object v1, v1, La2/x;->a:Ll2/o;

    invoke-interface {v1}, Ll2/o;->c()F

    move-result v4

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v7}, La2/i;->b(La2/i;Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;)V

    goto :goto_5

    :cond_9
    sget-wide v3, Le1/r;->g:J

    cmp-long v1, v3, v3

    if-eqz v1, :cond_a

    goto :goto_4

    :cond_a
    iget-object v1, p0, Lg0/h;->v:La2/c0;

    invoke-virtual {v1}, La2/c0;->b()J

    move-result-wide v8

    cmp-long v1, v8, v3

    if-eqz v1, :cond_b

    iget-object v1, p0, Lg0/h;->v:La2/c0;

    invoke-virtual {v1}, La2/c0;->b()J

    move-result-wide v3

    goto :goto_4

    :cond_b
    sget-wide v3, Le1/r;->b:J

    :goto_4
    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v7}, La2/i;->a(La2/i;Le1/p;JLe1/k0;Ll2/j;Lg1/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_5
    if-eqz v10, :cond_c

    invoke-interface {v0}, Le1/p;->h()V

    :cond_c
    iget-object v0, p0, Lg0/h;->C:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_6

    :cond_d
    check-cast p1, Lt1/i0;

    invoke-virtual {p1}, Lt1/i0;->a()V

    :cond_e
    :goto_6
    return-void

    :goto_7
    if-eqz v10, :cond_f

    invoke-interface {v0}, Le1/p;->h()V

    :cond_f
    throw p1

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You must call layoutWithConstraints first"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
