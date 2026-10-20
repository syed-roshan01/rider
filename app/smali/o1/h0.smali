.class public final Lo1/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lm2/b;
.implements Lu8/e;


# instance fields
.field public final a:Lu8/e;

.field public final synthetic b:Lo1/j0;

.field public c:Lm9/k;

.field public d:Lo1/l;

.field public final synthetic e:Lo1/j0;


# direct methods
.method public constructor <init>(Lo1/j0;Lm9/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/h0;->e:Lo1/j0;

    iput-object p2, p0, Lo1/h0;->a:Lu8/e;

    iput-object p1, p0, Lo1/h0;->b:Lo1/j0;

    sget-object p1, Lo1/l;->b:Lo1/l;

    iput-object p1, p0, Lo1/h0;->d:Lo1/l;

    return-void
.end method


# virtual methods
.method public final E(J)I
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1, p2}, Lm2/b;->E(J)I

    move-result p1

    return p1
.end method

.method public final F(J)F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    return p1
.end method

.method public final J(F)I
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1}, Lm2/b;->J(F)I

    move-result p1

    return p1
.end method

.method public final S(J)J
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1, p2}, Lm2/b;->S(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Z(J)F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    return p1
.end method

.method public final a(Lo1/l;Lw8/a;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    iput-object p1, p0, Lo1/h0;->d:Lo1/l;

    iput-object v0, p0, Lo1/h0;->c:Lm9/k;

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-virtual {v0}, Lo1/j0;->c()F

    move-result v0

    return v0
.end method

.method public final e0(F)J
    .locals 2

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1}, Lm2/b;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()J
    .locals 9

    iget-object v0, p0, Lo1/h0;->e:Lo1/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v1

    iget-object v1, v1, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    invoke-interface {v1}, Lu1/y2;->f()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lm2/b;->S(J)J

    move-result-wide v1

    iget-wide v3, v0, Lo1/j0;->A:J

    invoke-static {v1, v2}, Ld1/f;->d(J)F

    move-result v0

    const/16 v5, 0x20

    shr-long v5, v3, v5

    long-to-int v5, v5

    int-to-float v5, v5

    sub-float/2addr v0, v5

    const/4 v5, 0x0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v0, v6

    invoke-static {v1, v2}, Ld1/f;->b(J)F

    move-result v1

    const-wide v7, 0xffffffffL

    and-long v2, v3, v7

    long-to-int v2, v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr v1, v6

    invoke-static {v0, v1}, Ld7/t;->j(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Lu1/y2;
    .locals 1

    iget-object v0, p0, Lo1/h0;->e:Lo1/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    return-object v0
.end method

.method public final getContext()Lu8/j;
    .locals 1

    sget-object v0, Lu8/k;->a:Lu8/k;

    return-object v0
.end method

.method public final h(JLc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lo1/e0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lo1/e0;

    iget v1, v0, Lo1/e0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo1/e0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo1/e0;

    invoke-direct {v0, p0, p4}, Lo1/e0;-><init>(Lo1/h0;Lu8/e;)V

    :goto_0
    iget-object p4, v0, Lo1/e0;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lo1/e0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lo1/e0;->a:Lm9/x1;

    :try_start_0
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    cmp-long p4, p1, v4

    if-gtz p4, :cond_3

    iget-object p4, p0, Lo1/h0;->c:Lm9/k;

    if-eqz p4, :cond_3

    new-instance v2, Lo1/m;

    invoke-direct {v2, p1, p2}, Lo1/m;-><init>(J)V

    invoke-static {v2}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v2

    invoke-interface {p4, v2}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    iget-object p4, p0, Lo1/h0;->e:Lo1/j0;

    invoke-virtual {p4}, Ly0/n;->v0()Lm9/d0;

    move-result-object p4

    new-instance v2, Lo1/f0;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p2, p0, v4}, Lo1/f0;-><init>(JLo1/h0;Lu8/e;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p4, v4, p2, v2, p1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p1

    :try_start_1
    iput-object p1, v0, Lo1/e0;->a:Lm9/x1;

    iput v3, v0, Lo1/e0;->d:I

    invoke-interface {p3, p0, v0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p2, Lo1/b;->a:Lo1/b;

    invoke-interface {p1, p2}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    return-object p4

    :goto_2
    sget-object p3, Lo1/b;->a:Lo1/b;

    invoke-interface {p1, p3}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    throw p2
.end method

.method public final i(JLv/n2;Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lo1/g0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lo1/g0;

    iget v1, v0, Lo1/g0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo1/g0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo1/g0;

    invoke-direct {v0, p0, p4}, Lo1/g0;-><init>(Lo1/h0;Lu8/e;)V

    :goto_0
    iget-object p4, v0, Lo1/g0;->a:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lo1/g0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lo1/m; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Lo1/g0;->c:I

    invoke-virtual {p0, p1, p2, p3, v0}, Lo1/h0;->h(JLc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Lo1/m; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p4, v1, :cond_3

    return-object v1

    :catch_0
    const/4 p4, 0x0

    :cond_3
    :goto_1
    return-object p4
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-virtual {v0}, Lo1/j0;->m()F

    move-result v0

    return v0
.end method

.method public final o0(I)F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1}, Lm2/b;->o0(I)F

    move-result p1

    return p1
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-virtual {v0}, Lo1/j0;->c()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lo1/h0;->e:Lo1/j0;

    iget-object v1, v0, Lo1/j0;->x:Lo0/i;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lo1/j0;->x:Lo0/i;

    invoke-virtual {v0, p0}, Lo0/i;->m(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v0, p0, Lo1/h0;->a:Lu8/e;

    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final t(F)J
    .locals 2

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(J)J
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-interface {v0, p1, p2}, Lm2/b;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final v(F)F
    .locals 1

    iget-object v0, p0, Lo1/h0;->b:Lo1/j0;

    invoke-virtual {v0}, Lo1/j0;->c()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method
