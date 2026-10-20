.class public final Lu1/o2;
.super Ljava/lang/Object;

# interfaces
.implements Lt1/j1;


# instance fields
.field public final a:Lu1/w;

.field public b:Lc9/c;

.field public c:Lc9/a;

.field public d:Z

.field public final e:Lu1/j2;

.field public f:Z

.field public n:Z

.field public o:Le1/g;

.field public final p:Lu1/g2;

.field public final q:Lk/f;

.field public r:J

.field public final s:Lu1/v1;

.field public t:I


# direct methods
.method public constructor <init>(Lu1/w;Lh1/b;Lt/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/o2;->a:Lu1/w;

    iput-object p2, p0, Lu1/o2;->b:Lc9/c;

    iput-object p3, p0, Lu1/o2;->c:Lc9/a;

    new-instance p2, Lu1/j2;

    invoke-virtual {p1}, Lu1/w;->getDensity()Lm2/b;

    move-result-object p3

    invoke-direct {p2, p3}, Lu1/j2;-><init>(Lm2/b;)V

    iput-object p2, p0, Lu1/o2;->e:Lu1/j2;

    new-instance p2, Lu1/g2;

    sget-object p3, Lu1/o0;->d:Lu1/o0;

    invoke-direct {p2, p3}, Lu1/g2;-><init>(Lu1/o0;)V

    iput-object p2, p0, Lu1/o2;->p:Lu1/g2;

    new-instance p2, Lk/f;

    const/4 p3, 0x6

    invoke-direct {p2, p3}, Lk/f;-><init>(I)V

    iput-object p2, p0, Lu1/o2;->q:Lk/f;

    sget-wide p2, Le1/p0;->b:J

    iput-wide p2, p0, Lu1/o2;->r:J

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1d

    if-lt p2, p3, :cond_0

    new-instance p1, Lu1/m2;

    invoke-direct {p1}, Lu1/m2;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p2, Lu1/k2;

    invoke-direct {p2, p1}, Lu1/k2;-><init>(Lu1/w;)V

    move-object p1, p2

    :goto_0
    invoke-interface {p1}, Lu1/v1;->H()Z

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lu1/v1;->o(Z)V

    iput-object p1, p0, Lu1/o2;->s:Lu1/v1;

    return-void
.end method


# virtual methods
.method public final a(JZ)J
    .locals 2

    iget-object v0, p0, Lu1/o2;->s:Lu1/v1;

    iget-object v1, p0, Lu1/o2;->p:Lu1/g2;

    if-eqz p3, :cond_1

    invoke-virtual {v1, v0}, Lu1/g2;->a(Ljava/lang/Object;)[F

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3, p1, p2}, Le1/a0;->a([FJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget p1, Ld1/c;->e:I

    sget-wide p1, Ld1/c;->c:J

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0}, Lu1/g2;->b(Ljava/lang/Object;)[F

    move-result-object p3

    invoke-static {p3, p1, p2}, Le1/a0;->a([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final b(J)V
    .locals 7

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    iget-wide v4, p0, Lu1/o2;->r:J

    sget p2, Le1/p0;->c:I

    shr-long/2addr v4, v0

    long-to-int p2, v4

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    int-to-float v0, v1

    mul-float/2addr p2, v0

    iget-object v4, p0, Lu1/o2;->s:Lu1/v1;

    invoke-interface {v4, p2}, Lu1/v1;->m(F)V

    iget-wide v5, p0, Lu1/o2;->r:J

    and-long/2addr v2, v5

    long-to-int p2, v2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    int-to-float v2, p1

    mul-float/2addr p2, v2

    invoke-interface {v4, p2}, Lu1/v1;->u(F)V

    invoke-interface {v4}, Lu1/v1;->getLeft()I

    move-result p2

    invoke-interface {v4}, Lu1/v1;->k()I

    move-result v3

    invoke-interface {v4}, Lu1/v1;->getLeft()I

    move-result v5

    add-int/2addr v5, v1

    invoke-interface {v4}, Lu1/v1;->k()I

    move-result v1

    add-int/2addr v1, p1

    invoke-interface {v4, p2, v3, v5, v1}, Lu1/v1;->p(IIII)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v0, v2}, Ld7/t;->j(FF)J

    move-result-wide p1

    iget-object v0, p0, Lu1/o2;->e:Lu1/j2;

    iget-wide v1, v0, Lu1/j2;->d:J

    invoke-static {v1, v2, p1, p2}, Ld1/f;->a(JJ)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-wide p1, v0, Lu1/j2;->d:J

    iput-boolean v2, v0, Lu1/j2;->h:Z

    :cond_0
    invoke-virtual {v0}, Lu1/j2;->b()Landroid/graphics/Outline;

    move-result-object p1

    invoke-interface {v4, p1}, Lu1/v1;->E(Landroid/graphics/Outline;)V

    iget-boolean p1, p0, Lu1/o2;->d:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lu1/o2;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lu1/o2;->a:Lu1/w;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0, v2}, Lu1/o2;->m(Z)V

    :cond_1
    iget-object p1, p0, Lu1/o2;->p:Lu1/g2;

    invoke-virtual {p1}, Lu1/g2;->c()V

    :cond_2
    return-void
.end method

.method public final c([F)V
    .locals 2

    iget-object v0, p0, Lu1/o2;->p:Lu1/g2;

    iget-object v1, p0, Lu1/o2;->s:Lu1/v1;

    invoke-virtual {v0, v1}, Lu1/g2;->b(Ljava/lang/Object;)[F

    move-result-object v0

    invoke-static {p1, v0}, Le1/a0;->d([F[F)V

    return-void
.end method

.method public final d([F)V
    .locals 2

    iget-object v0, p0, Lu1/o2;->p:Lu1/g2;

    iget-object v1, p0, Lu1/o2;->s:Lu1/v1;

    invoke-virtual {v0, v1}, Lu1/g2;->a(Ljava/lang/Object;)[F

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Le1/a0;->d([F[F)V

    :cond_0
    return-void
.end method

.method public final e(Le1/i0;Lm2/l;Lm2/b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v1, Le1/i0;->a:I

    iget v3, v0, Lu1/o2;->t:I

    or-int/2addr v2, v3

    and-int/lit16 v3, v2, 0x1000

    if-eqz v3, :cond_0

    iget-wide v4, v1, Le1/i0;->u:J

    iput-wide v4, v0, Lu1/o2;->r:J

    :cond_0
    iget-object v4, v0, Lu1/o2;->s:Lu1/v1;

    invoke-interface {v4}, Lu1/v1;->y()Z

    move-result v5

    const/4 v6, 0x1

    iget-object v7, v0, Lu1/o2;->e:Lu1/j2;

    const/4 v8, 0x0

    if-eqz v5, :cond_1

    iget-boolean v5, v7, Lu1/j2;->i:Z

    xor-int/2addr v5, v6

    if-nez v5, :cond_1

    move v5, v6

    goto :goto_0

    :cond_1
    move v5, v8

    :goto_0
    and-int/lit8 v9, v2, 0x1

    if-eqz v9, :cond_2

    iget v9, v1, Le1/i0;->b:F

    invoke-interface {v4, v9}, Lu1/v1;->q(F)V

    :cond_2
    and-int/lit8 v9, v2, 0x2

    if-eqz v9, :cond_3

    iget v9, v1, Le1/i0;->c:F

    invoke-interface {v4, v9}, Lu1/v1;->w(F)V

    :cond_3
    and-int/lit8 v9, v2, 0x4

    if-eqz v9, :cond_4

    iget v9, v1, Le1/i0;->d:F

    invoke-interface {v4, v9}, Lu1/v1;->e(F)V

    :cond_4
    and-int/lit8 v9, v2, 0x8

    if-eqz v9, :cond_5

    iget v9, v1, Le1/i0;->e:F

    invoke-interface {v4, v9}, Lu1/v1;->v(F)V

    :cond_5
    and-int/lit8 v9, v2, 0x10

    if-eqz v9, :cond_6

    iget v9, v1, Le1/i0;->f:F

    invoke-interface {v4, v9}, Lu1/v1;->n(F)V

    :cond_6
    and-int/lit8 v9, v2, 0x20

    if-eqz v9, :cond_7

    iget v9, v1, Le1/i0;->n:F

    invoke-interface {v4, v9}, Lu1/v1;->x(F)V

    :cond_7
    and-int/lit8 v9, v2, 0x40

    if-eqz v9, :cond_8

    iget-wide v9, v1, Le1/i0;->o:J

    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v9

    invoke-interface {v4, v9}, Lu1/v1;->t(I)V

    :cond_8
    and-int/lit16 v9, v2, 0x80

    if-eqz v9, :cond_9

    iget-wide v9, v1, Le1/i0;->p:J

    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v9

    invoke-interface {v4, v9}, Lu1/v1;->F(I)V

    :cond_9
    and-int/lit16 v9, v2, 0x400

    if-eqz v9, :cond_a

    iget v9, v1, Le1/i0;->s:F

    invoke-interface {v4, v9}, Lu1/v1;->l(F)V

    :cond_a
    and-int/lit16 v9, v2, 0x100

    if-eqz v9, :cond_b

    iget v9, v1, Le1/i0;->q:F

    invoke-interface {v4, v9}, Lu1/v1;->G(F)V

    :cond_b
    and-int/lit16 v9, v2, 0x200

    if-eqz v9, :cond_c

    iget v9, v1, Le1/i0;->r:F

    invoke-interface {v4, v9}, Lu1/v1;->d(F)V

    :cond_c
    and-int/lit16 v9, v2, 0x800

    if-eqz v9, :cond_d

    iget v9, v1, Le1/i0;->t:F

    invoke-interface {v4, v9}, Lu1/v1;->C(F)V

    :cond_d
    if-eqz v3, :cond_e

    iget-wide v9, v0, Lu1/o2;->r:J

    sget v3, Le1/p0;->c:I

    const/16 v3, 0x20

    shr-long/2addr v9, v3

    long-to-int v3, v9

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {v4}, Lu1/v1;->b()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v3, v9

    invoke-interface {v4, v3}, Lu1/v1;->m(F)V

    iget-wide v9, v0, Lu1/o2;->r:J

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    long-to-int v3, v9

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {v4}, Lu1/v1;->a()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v3, v9

    invoke-interface {v4, v3}, Lu1/v1;->u(F)V

    :cond_e
    iget-boolean v3, v1, Le1/i0;->w:Z

    sget-object v9, Le1/g0;->a:Le1/f0;

    if-eqz v3, :cond_f

    iget-object v3, v1, Le1/i0;->v:Le1/l0;

    if-eq v3, v9, :cond_f

    move v3, v6

    goto :goto_1

    :cond_f
    move v3, v8

    :goto_1
    and-int/lit16 v10, v2, 0x6000

    if-eqz v10, :cond_11

    invoke-interface {v4, v3}, Lu1/v1;->A(Z)V

    iget-boolean v10, v1, Le1/i0;->w:Z

    if-eqz v10, :cond_10

    iget-object v10, v1, Le1/i0;->v:Le1/l0;

    if-ne v10, v9, :cond_10

    move v9, v6

    goto :goto_2

    :cond_10
    move v9, v8

    :goto_2
    invoke-interface {v4, v9}, Lu1/v1;->o(Z)V

    :cond_11
    const/high16 v9, 0x20000

    and-int/2addr v9, v2

    if-eqz v9, :cond_12

    invoke-interface {v4}, Lu1/v1;->i()V

    :cond_12
    const v9, 0x8000

    and-int/2addr v9, v2

    if-eqz v9, :cond_13

    iget v9, v1, Le1/i0;->x:I

    invoke-interface {v4, v9}, Lu1/v1;->B(I)V

    :cond_13
    iget-object v10, v0, Lu1/o2;->e:Lu1/j2;

    iget-object v11, v1, Le1/i0;->v:Le1/l0;

    iget v12, v1, Le1/i0;->d:F

    iget v14, v1, Le1/i0;->n:F

    move v13, v3

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    invoke-virtual/range {v10 .. v16}, Lu1/j2;->d(Le1/l0;FZFLm2/l;Lm2/b;)Z

    move-result v9

    iget-boolean v10, v7, Lu1/j2;->h:Z

    if-eqz v10, :cond_14

    invoke-virtual {v7}, Lu1/j2;->b()Landroid/graphics/Outline;

    move-result-object v10

    invoke-interface {v4, v10}, Lu1/v1;->E(Landroid/graphics/Outline;)V

    :cond_14
    if-eqz v3, :cond_15

    iget-boolean v3, v7, Lu1/j2;->i:Z

    xor-int/2addr v3, v6

    if-nez v3, :cond_15

    move v8, v6

    :cond_15
    iget-object v3, v0, Lu1/o2;->a:Lu1/w;

    if-ne v5, v8, :cond_17

    if-eqz v8, :cond_16

    if-eqz v9, :cond_16

    goto :goto_3

    :cond_16
    sget-object v5, Lu1/y3;->a:Lu1/y3;

    invoke-virtual {v5, v3}, Lu1/y3;->a(Lu1/w;)V

    goto :goto_4

    :cond_17
    :goto_3
    iget-boolean v5, v0, Lu1/o2;->d:Z

    if-nez v5, :cond_18

    iget-boolean v5, v0, Lu1/o2;->f:Z

    if-nez v5, :cond_18

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0, v6}, Lu1/o2;->m(Z)V

    :cond_18
    :goto_4
    iget-boolean v3, v0, Lu1/o2;->n:Z

    if-nez v3, :cond_19

    invoke-interface {v4}, Lu1/v1;->J()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_19

    iget-object v3, v0, Lu1/o2;->c:Lc9/a;

    if-eqz v3, :cond_19

    invoke-interface {v3}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_19
    and-int/lit16 v2, v2, 0x1f1b

    if-eqz v2, :cond_1a

    iget-object v2, v0, Lu1/o2;->p:Lu1/g2;

    invoke-virtual {v2}, Lu1/g2;->c()V

    :cond_1a
    iget v1, v1, Le1/i0;->a:I

    iput v1, v0, Lu1/o2;->t:I

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lu1/o2;->s:Lu1/v1;

    invoke-interface {v0}, Lu1/v1;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lu1/v1;->s()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lu1/o2;->b:Lc9/c;

    iput-object v0, p0, Lu1/o2;->c:Lc9/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/o2;->f:Z

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lu1/o2;->m(Z)V

    iget-object v1, p0, Lu1/o2;->a:Lu1/w;

    iput-boolean v0, v1, Lu1/w;->C:Z

    iget-object v0, v1, Lu1/w;->I:Lu1/z1;

    if-eqz v0, :cond_1

    sget-object v0, Lu1/b3;->w:Lu1/z2;

    :cond_1
    iget-object v0, v1, Lu1/w;->t0:Lu1/f3;

    iget-object v2, v0, Lu1/f3;->b:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v2

    iget-object v3, v0, Lu1/f3;->a:Lo0/i;

    if-eqz v2, :cond_2

    invoke-virtual {v3, v2}, Lo0/i;->m(Ljava/lang/Object;)Z

    :cond_2
    if-nez v2, :cond_1

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v0, v0, Lu1/f3;->b:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v1, p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v3, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(J)V
    .locals 6

    iget-object v0, p0, Lu1/o2;->s:Lu1/v1;

    invoke-interface {v0}, Lu1/v1;->getLeft()I

    move-result v1

    invoke-interface {v0}, Lu1/v1;->k()I

    move-result v2

    sget v3, Lm2/i;->c:I

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    if-ne v1, v3, :cond_0

    if-eq v2, p1, :cond_3

    :cond_0
    if-eq v1, v3, :cond_1

    sub-int/2addr v3, v1

    invoke-interface {v0, v3}, Lu1/v1;->f(I)V

    :cond_1
    if-eq v2, p1, :cond_2

    sub-int/2addr p1, v2

    invoke-interface {v0, p1}, Lu1/v1;->z(I)V

    :cond_2
    sget-object p1, Lu1/y3;->a:Lu1/y3;

    iget-object p2, p0, Lu1/o2;->a:Lu1/w;

    invoke-virtual {p1, p2}, Lu1/y3;->a(Lu1/w;)V

    iget-object p1, p0, Lu1/o2;->p:Lu1/g2;

    invoke-virtual {p1}, Lu1/g2;->c()V

    :cond_3
    return-void
.end method

.method public final h()V
    .locals 4

    iget-boolean v0, p0, Lu1/o2;->d:Z

    iget-object v1, p0, Lu1/o2;->s:Lu1/v1;

    if-nez v0, :cond_0

    invoke-interface {v1}, Lu1/v1;->D()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    invoke-interface {v1}, Lu1/v1;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/o2;->e:Lu1/j2;

    iget-boolean v2, v0, Lu1/j2;->i:Z

    xor-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lu1/j2;->e()V

    iget-object v0, v0, Lu1/j2;->g:Le1/d0;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lu1/o2;->b:Lc9/c;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu1/o2;->q:Lk/f;

    invoke-interface {v1, v3, v0, v2}, Lu1/v1;->r(Lk/f;Le1/d0;Lc9/c;)V

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu1/o2;->m(Z)V

    :cond_3
    return-void
.end method

.method public final i(Lt/l0;Lh1/b;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu1/o2;->m(Z)V

    iput-boolean v0, p0, Lu1/o2;->f:Z

    iput-boolean v0, p0, Lu1/o2;->n:Z

    sget-wide v0, Le1/p0;->b:J

    iput-wide v0, p0, Lu1/o2;->r:J

    iput-object p2, p0, Lu1/o2;->b:Lc9/c;

    iput-object p1, p0, Lu1/o2;->c:Lc9/a;

    return-void
.end method

.method public final invalidate()V
    .locals 1

    iget-boolean v0, p0, Lu1/o2;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lu1/o2;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu1/o2;->a:Lu1/w;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lu1/o2;->m(Z)V

    :cond_0
    return-void
.end method

.method public final j(Ld1/b;Z)V
    .locals 2

    iget-object v0, p0, Lu1/o2;->s:Lu1/v1;

    iget-object v1, p0, Lu1/o2;->p:Lu1/g2;

    if-eqz p2, :cond_1

    invoke-virtual {v1, v0}, Lu1/g2;->a(Ljava/lang/Object;)[F

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    iput p2, p1, Ld1/b;->a:F

    iput p2, p1, Ld1/b;->b:F

    iput p2, p1, Ld1/b;->c:F

    iput p2, p1, Ld1/b;->d:F

    goto :goto_0

    :cond_0
    invoke-static {p2, p1}, Le1/a0;->b([FLd1/b;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0}, Lu1/g2;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-static {p2, p1}, Le1/a0;->b([FLd1/b;)V

    :goto_0
    return-void
.end method

.method public final k(J)Z
    .locals 5

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v0

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result v1

    iget-object v2, p0, Lu1/o2;->s:Lu1/v1;

    invoke-interface {v2}, Lu1/v1;->h()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    const/4 p1, 0x0

    cmpg-float p2, p1, v0

    if-gtz p2, :cond_0

    invoke-interface {v2}, Lu1/v1;->b()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    invoke-interface {v2}, Lu1/v1;->a()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v1, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    return v4

    :cond_1
    invoke-interface {v2}, Lu1/v1;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu1/o2;->e:Lu1/j2;

    invoke-virtual {v0, p1, p2}, Lu1/j2;->c(J)Z

    move-result p1

    return p1

    :cond_2
    return v4
.end method

.method public final l(Le1/p;)V
    .locals 10

    invoke-static {p1}, Le1/e;->a(Le1/p;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v1

    const/4 v6, 0x0

    iget-object v7, p0, Lu1/o2;->s:Lu1/v1;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lu1/o2;->h()V

    invoke-interface {v7}, Lu1/v1;->J()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    const/4 v6, 0x1

    :cond_0
    iput-boolean v6, p0, Lu1/o2;->n:Z

    if-eqz v6, :cond_1

    invoke-interface {p1}, Le1/p;->r()V

    :cond_1
    invoke-interface {v7, v0}, Lu1/v1;->j(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lu1/o2;->n:Z

    if-eqz v0, :cond_8

    invoke-interface {p1}, Le1/p;->m()V

    goto :goto_1

    :cond_2
    invoke-interface {v7}, Lu1/v1;->getLeft()I

    move-result v1

    int-to-float v8, v1

    invoke-interface {v7}, Lu1/v1;->k()I

    move-result v1

    int-to-float v9, v1

    invoke-interface {v7}, Lu1/v1;->getRight()I

    move-result v1

    int-to-float v3, v1

    invoke-interface {v7}, Lu1/v1;->g()I

    move-result v1

    int-to-float v4, v1

    invoke-interface {v7}, Lu1/v1;->c()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    iget-object v1, p0, Lu1/o2;->o:Le1/g;

    if-nez v1, :cond_3

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v1

    iput-object v1, p0, Lu1/o2;->o:Le1/g;

    :cond_3
    invoke-interface {v7}, Lu1/v1;->c()F

    move-result v2

    invoke-virtual {v1, v2}, Le1/g;->c(F)V

    iget-object v5, v1, Le1/g;->a:Landroid/graphics/Paint;

    move v1, v8

    move v2, v9

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Le1/p;->j()V

    :goto_0
    invoke-interface {p1, v8, v9}, Le1/p;->e(FF)V

    iget-object v0, p0, Lu1/o2;->p:Lu1/g2;

    invoke-virtual {v0, v7}, Lu1/g2;->b(Ljava/lang/Object;)[F

    move-result-object v0

    invoke-interface {p1, v0}, Le1/p;->q([F)V

    invoke-interface {v7}, Lu1/v1;->y()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {v7}, Lu1/v1;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    iget-object v0, p0, Lu1/o2;->e:Lu1/j2;

    invoke-virtual {v0, p1}, Lu1/j2;->a(Le1/p;)V

    :cond_6
    iget-object v0, p0, Lu1/o2;->b:Lc9/c;

    if-eqz v0, :cond_7

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-interface {p1}, Le1/p;->h()V

    invoke-virtual {p0, v6}, Lu1/o2;->m(Z)V

    :cond_8
    :goto_1
    return-void
.end method

.method public final m(Z)V
    .locals 1

    iget-boolean v0, p0, Lu1/o2;->d:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lu1/o2;->d:Z

    iget-object v0, p0, Lu1/o2;->a:Lu1/w;

    invoke-virtual {v0, p0, p1}, Lu1/w;->t(Lt1/j1;Z)V

    :cond_0
    return-void
.end method
