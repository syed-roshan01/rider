.class public final Lt1/t0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/compose/ui/node/a;

.field public final b:Lt1/r;

.field public c:Z

.field public final d:Lt1/i1;

.field public final e:Lo0/i;

.field public final f:J

.field public final g:Lo0/i;

.field public h:Lm2/a;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    new-instance p1, Lt1/r;

    invoke-direct {p1}, Lt1/r;-><init>()V

    iput-object p1, p0, Lt1/t0;->b:Lt1/r;

    new-instance p1, Lt1/i1;

    invoke-direct {p1}, Lt1/i1;-><init>()V

    iput-object p1, p0, Lt1/t0;->d:Lt1/i1;

    new-instance p1, Lo0/i;

    const/16 v0, 0x10

    new-array v1, v0, [Lt1/k1;

    invoke-direct {p1, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lt1/t0;->e:Lo0/i;

    const-wide/16 v1, 0x1

    iput-wide v1, p0, Lt1/t0;->f:J

    new-instance p1, Lo0/i;

    new-array v0, v0, [Lt1/s0;

    invoke-direct {p1, v0}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lt1/t0;->g:Lo0/i;

    return-void
.end method

.method public static f(Landroidx/compose/ui/node/a;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lt1/t0;->g(Landroidx/compose/ui/node/a;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g(Landroidx/compose/ui/node/a;)Z
    .locals 2

    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p0, p0, Lt1/n0;->o:Lt1/l0;

    iget v0, p0, Lt1/l0;->r:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object p0, p0, Lt1/l0;->A:Lt1/h0;

    invoke-virtual {p0}, Lt1/a;->f()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final a(Z)V
    .locals 6

    iget-object v0, p0, Lt1/t0;->d:Lt1/i1;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, v0, Lt1/i1;->a:Lo0/i;

    invoke-virtual {p1}, Lo0/i;->g()V

    iget-object v2, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {p1, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    iput-boolean v1, v2, Landroidx/compose/ui/node/a;->I:Z

    :cond_0
    sget-object p1, Lt1/h1;->a:Lt1/h1;

    iget-object v2, v0, Lt1/i1;->a:Lo0/i;

    iget-object v3, v2, Lo0/i;->a:[Ljava/lang/Object;

    iget v4, v2, Lo0/i;->c:I

    const-string v5, "<this>"

    invoke-static {v3, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    iget p1, v2, Lo0/i;->c:I

    iget-object v3, v0, Lt1/i1;->b:[Landroidx/compose/ui/node/a;

    if-eqz v3, :cond_1

    array-length v4, v3

    if-ge v4, p1, :cond_2

    :cond_1
    const/16 v3, 0x10

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result v3

    new-array v3, v3, [Landroidx/compose/ui/node/a;

    :cond_2
    const/4 v4, 0x0

    iput-object v4, v0, Lt1/i1;->b:[Landroidx/compose/ui/node/a;

    :goto_0
    if-ge v5, p1, :cond_3

    iget-object v4, v2, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v4, v4, v5

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lo0/i;->g()V

    sub-int/2addr p1, v1

    :goto_1
    const/4 v1, -0x1

    if-ge v1, p1, :cond_5

    aget-object v1, v3, p1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-boolean v2, v1, Landroidx/compose/ui/node/a;->I:Z

    if-eqz v2, :cond_4

    invoke-static {v1}, Lt1/i1;->a(Landroidx/compose/ui/node/a;)V

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_5
    iput-object v3, v0, Lt1/i1;->b:[Landroidx/compose/ui/node/a;

    return-void
.end method

.method public final b(Landroidx/compose/ui/node/a;Lm2/a;)Z
    .locals 4

    iget-object v0, p1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-eqz p2, :cond_2

    if-eqz v0, :cond_1

    iget-object v0, v2, Lt1/n0;->p:Lt1/k0;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v2, p2, Lm2/a;->a:J

    invoke-virtual {v0, v2, v3}, Lt1/k0;->w0(J)Z

    move-result p2

    goto :goto_1

    :cond_1
    move p2, v1

    goto :goto_1

    :cond_2
    iget-object p2, v2, Lt1/n0;->p:Lt1/k0;

    if-eqz p2, :cond_3

    iget-object v2, p2, Lt1/k0;->t:Lm2/a;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    invoke-static {p2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v2, v2, Lm2/a;->a:J

    invoke-virtual {p2, v2, v3}, Lt1/k0;->w0(J)Z

    move-result p2

    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz p2, :cond_6

    if-eqz v0, :cond_6

    iget-object v2, v0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-nez v2, :cond_4

    invoke-virtual {p0, v0, v1}, Lt1/t0;->q(Landroidx/compose/ui/node/a;Z)Z

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->p()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    invoke-virtual {p0, v0, v1}, Lt1/t0;->o(Landroidx/compose/ui/node/a;Z)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->p()I

    move-result p1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_6

    invoke-virtual {p0, v0, v1}, Lt1/t0;->n(Landroidx/compose/ui/node/a;Z)Z

    :cond_6
    :goto_2
    return p2
.end method

.method public final c(Landroidx/compose/ui/node/a;Lm2/a;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x3

    if-eqz p2, :cond_1

    iget v2, p1, Landroidx/compose/ui/node/a;->K:I

    if-ne v2, v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->e()V

    :cond_0
    iget-object v1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->o:Lt1/l0;

    iget-wide v2, p2, Lm2/a;->a:J

    invoke-virtual {v1, v2, v3}, Lt1/l0;->y0(J)Z

    move-result p2

    goto :goto_1

    :cond_1
    iget-object p2, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p2, p2, Lt1/n0;->o:Lt1/l0;

    iget-boolean v2, p2, Lt1/l0;->p:Z

    if-eqz v2, :cond_2

    iget-wide v2, p2, Lr1/x0;->d:J

    new-instance p2, Lm2/a;

    invoke-direct {p2, v2, v3}, Lm2/a;-><init>(J)V

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_4

    iget v2, p1, Landroidx/compose/ui/node/a;->K:I

    if-ne v2, v1, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->e()V

    :cond_3
    iget-object v1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->o:Lt1/l0;

    iget-wide v2, p2, Lm2/a;->a:J

    invoke-virtual {v1, v2, v3}, Lt1/l0;->y0(J)Z

    move-result p2

    goto :goto_1

    :cond_4
    move p2, v0

    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz p2, :cond_6

    if-eqz v1, :cond_6

    iget-object p1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p1, p1, Lt1/n0;->o:Lt1/l0;

    iget p1, p1, Lt1/l0;->r:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_5

    invoke-virtual {p0, v1, v0}, Lt1/t0;->q(Landroidx/compose/ui/node/a;Z)Z

    goto :goto_2

    :cond_5
    const/4 v2, 0x2

    if-ne p1, v2, :cond_6

    invoke-virtual {p0, v1, v0}, Lt1/t0;->p(Landroidx/compose/ui/node/a;Z)Z

    :cond_6
    :goto_2
    return p2
.end method

.method public final d(Landroidx/compose/ui/node/a;Z)V
    .locals 1

    iget-object v0, p0, Lt1/t0;->b:Lt1/r;

    if-eqz p2, :cond_0

    iget-object v0, v0, Lt1/r;->a:Lt1/q;

    :goto_0
    iget-object v0, v0, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lt1/r;->b:Lt1/q;

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lt1/t0;->c:Z

    if-eqz v0, :cond_4

    if-eqz p2, :cond_2

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->g:Z

    goto :goto_2

    :cond_2
    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->d:Z

    :goto_2
    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, p2}, Lt1/t0;->e(Landroidx/compose/ui/node/a;Z)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "node not yet measured"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Landroidx/compose/ui/node/a;Z)V
    .locals 9

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v1, v0, Lo0/i;->c:I

    iget-object v2, p0, Lt1/t0;->b:Lt1/r;

    const/4 v3, 0x0

    if-lez v1, :cond_b

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    move v4, v3

    :cond_0
    aget-object v5, v0, v4

    check-cast v5, Landroidx/compose/ui/node/a;

    const/4 v6, 0x1

    if-nez p2, :cond_1

    invoke-static {v5}, Lt1/t0;->g(Landroidx/compose/ui/node/a;)Z

    move-result v7

    if-nez v7, :cond_2

    :cond_1
    if-eqz p2, :cond_a

    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->p()I

    move-result v7

    if-eq v7, v6, :cond_2

    iget-object v7, v5, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v7, v7, Lt1/n0;->p:Lt1/k0;

    if-eqz v7, :cond_a

    iget-object v7, v7, Lt1/k0;->w:Lt1/o0;

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lt1/a;->f()Z

    move-result v7

    if-ne v7, v6, :cond_a

    :cond_2
    invoke-static {v5}, Lt1/g;->v(Landroidx/compose/ui/node/a;)Z

    move-result v7

    iget-object v8, v5, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-eqz v7, :cond_4

    if-nez p2, :cond_4

    iget-boolean v7, v8, Lt1/n0;->g:Z

    if-eqz v7, :cond_3

    iget-object v7, v2, Lt1/r;->a:Lt1/q;

    invoke-virtual {v7, v5}, Lt1/q;->b(Landroidx/compose/ui/node/a;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {p0, v5, v6, v3}, Lt1/t0;->k(Landroidx/compose/ui/node/a;ZZ)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v5, v6}, Lt1/t0;->d(Landroidx/compose/ui/node/a;Z)V

    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    iget-boolean v6, v8, Lt1/n0;->g:Z

    goto :goto_1

    :cond_5
    iget-boolean v6, v8, Lt1/n0;->d:Z

    :goto_1
    if-eqz v6, :cond_8

    iget-object v6, v2, Lt1/r;->a:Lt1/q;

    invoke-virtual {v6, v5}, Lt1/q;->b(Landroidx/compose/ui/node/a;)Z

    move-result v6

    if-eqz p2, :cond_6

    if-eqz v6, :cond_8

    goto :goto_2

    :cond_6
    if-nez v6, :cond_7

    iget-object v6, v2, Lt1/r;->b:Lt1/q;

    invoke-virtual {v6, v5}, Lt1/q;->b(Landroidx/compose/ui/node/a;)Z

    move-result v6

    if-eqz v6, :cond_8

    :cond_7
    :goto_2
    invoke-virtual {p0, v5, p2, v3}, Lt1/t0;->k(Landroidx/compose/ui/node/a;ZZ)Z

    :cond_8
    if-eqz p2, :cond_9

    iget-boolean v6, v8, Lt1/n0;->g:Z

    goto :goto_3

    :cond_9
    iget-boolean v6, v8, Lt1/n0;->d:Z

    :goto_3
    if-nez v6, :cond_a

    invoke-virtual {p0, v5, p2}, Lt1/t0;->e(Landroidx/compose/ui/node/a;Z)V

    :cond_a
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v1, :cond_0

    :cond_b
    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-eqz p2, :cond_c

    iget-boolean v0, v0, Lt1/n0;->g:Z

    goto :goto_4

    :cond_c
    iget-boolean v0, v0, Lt1/n0;->d:Z

    :goto_4
    if-eqz v0, :cond_f

    iget-object v0, v2, Lt1/r;->a:Lt1/q;

    invoke-virtual {v0, p1}, Lt1/q;->b(Landroidx/compose/ui/node/a;)Z

    move-result v0

    if-eqz p2, :cond_d

    if-eqz v0, :cond_f

    goto :goto_5

    :cond_d
    if-nez v0, :cond_e

    iget-object v0, v2, Lt1/r;->b:Lt1/q;

    invoke-virtual {v0, p1}, Lt1/q;->b(Landroidx/compose/ui/node/a;)Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    :goto_5
    invoke-virtual {p0, p1, p2, v3}, Lt1/t0;->k(Landroidx/compose/ui/node/a;ZZ)Z

    :cond_f
    return-void
.end method

.method public final h(Lu1/u;)Z
    .locals 8

    iget-object v0, p0, Lt1/t0;->b:Lt1/r;

    iget-object v1, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-boolean v2, p0, Lt1/t0;->c:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_8

    iget-object v2, p0, Lt1/t0;->h:Lm2/a;

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iput-boolean v3, p0, Lt1/t0;->c:Z

    :try_start_0
    invoke-virtual {v0}, Lt1/r;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v4

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lt1/r;->b()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v6, v0, Lt1/r;->a:Lt1/q;

    if-eqz v5, :cond_2

    :try_start_1
    iget-object v5, v6, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v3

    if-eqz v5, :cond_1

    iget-object v7, v6, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/node/a;

    :goto_1
    invoke-virtual {v6, v7}, Lt1/q;->c(Landroidx/compose/ui/node/a;)Z

    goto :goto_2

    :cond_1
    iget-object v6, v0, Lt1/r;->b:Lt1/q;

    iget-object v7, v6, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/node/a;

    goto :goto_1

    :goto_2
    invoke-virtual {p0, v7, v5, v3}, Lt1/t0;->k(Landroidx/compose/ui/node/a;ZZ)Z

    move-result v5

    if-ne v7, v1, :cond_0

    if-eqz v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lu1/u;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    move v2, v4

    :cond_4
    :goto_3
    iput-boolean v4, p0, Lt1/t0;->c:Z

    goto :goto_5

    :goto_4
    iput-boolean v4, p0, Lt1/t0;->c:Z

    throw p1

    :cond_5
    move v2, v4

    :goto_5
    iget-object p1, p0, Lt1/t0;->e:Lo0/i;

    iget v0, p1, Lo0/i;->c:I

    if-lez v0, :cond_7

    iget-object v1, p1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_6
    aget-object v5, v1, v4

    check-cast v5, Lt1/k1;

    check-cast v5, Landroidx/compose/ui/node/a;

    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->I()V

    add-int/2addr v4, v3

    if-lt v4, v0, :cond_6

    :cond_7
    invoke-virtual {p1}, Lo0/i;->g()V

    return v2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "performMeasureAndLayout called during measure layout"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "performMeasureAndLayout called with unplaced root"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "performMeasureAndLayout called with unattached root"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Landroidx/compose/ui/node/a;J)V
    .locals 4

    iget-boolean v0, p1, Landroidx/compose/ui/node/a;->J:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->C()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->D()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lt1/t0;->c:Z

    xor-int/2addr v0, v2

    if-eqz v0, :cond_7

    iget-object v0, p0, Lt1/t0;->h:Lm2/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iput-boolean v2, p0, Lt1/t0;->c:Z

    :try_start_0
    iget-object v0, p0, Lt1/t0;->b:Lt1/r;

    iget-object v3, v0, Lt1/r;->a:Lt1/q;

    invoke-virtual {v3, p1}, Lt1/q;->c(Landroidx/compose/ui/node/a;)Z

    iget-object v0, v0, Lt1/r;->b:Lt1/q;

    invoke-virtual {v0, p1}, Lt1/q;->c(Landroidx/compose/ui/node/a;)Z

    new-instance v0, Lm2/a;

    invoke-direct {v0, p2, p3}, Lm2/a;-><init>(J)V

    invoke-virtual {p0, p1, v0}, Lt1/t0;->b(Landroidx/compose/ui/node/a;Lm2/a;)Z

    move-result v0

    new-instance v3, Lm2/a;

    invoke-direct {v3, p2, p3}, Lm2/a;-><init>(J)V

    invoke-virtual {p0, p1, v3}, Lt1/t0;->c(Landroidx/compose/ui/node/a;Lm2/a;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-nez v0, :cond_1

    :try_start_1
    iget-boolean p3, p2, Lt1/n0;->h:Z

    if-eqz p3, :cond_2

    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->E()Ljava/lang/Boolean;

    move-result-object p3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->F()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    iget-boolean p2, p2, Lt1/n0;->e:Z

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->D()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->M()V

    iget-object p2, p0, Lt1/t0;->d:Lt1/i1;

    iget-object p2, p2, Lt1/i1;->a:Lo0/i;

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    iput-boolean v2, p1, Landroidx/compose/ui/node/a;->I:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    iput-boolean v1, p0, Lt1/t0;->c:Z

    goto :goto_2

    :goto_1
    iput-boolean v1, p0, Lt1/t0;->c:Z

    throw p1

    :cond_4
    :goto_2
    iget-object p1, p0, Lt1/t0;->e:Lo0/i;

    iget p2, p1, Lo0/i;->c:I

    if-lez p2, :cond_6

    iget-object p3, p1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_5
    aget-object v0, p3, v1

    check-cast v0, Lt1/k1;

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->I()V

    add-int/2addr v1, v2

    if-lt v1, p2, :cond_5

    :cond_6
    invoke-virtual {p1}, Lo0/i;->g()V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "performMeasureAndLayout called during measure layout"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "performMeasureAndLayout called with unplaced root"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "performMeasureAndLayout called with unattached root"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "measureAndLayout called on root"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {v0}, Lt1/r;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lt1/t0;->c:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt1/t0;->h:Lm2/a;

    if-eqz v2, :cond_5

    iput-boolean v3, p0, Lt1/t0;->c:Z

    const/4 v2, 0x0

    :try_start_0
    iget-object v0, v0, Lt1/r;->a:Lt1/q;

    iget-object v0, v0, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, v3}, Lt1/t0;->m(Landroidx/compose/ui/node/a;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Lt1/t0;->l(Landroidx/compose/ui/node/a;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, v1, v2}, Lt1/t0;->m(Landroidx/compose/ui/node/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p0, Lt1/t0;->c:Z

    goto :goto_2

    :goto_1
    iput-boolean v2, p0, Lt1/t0;->c:Z

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "performMeasureAndLayout called during measure layout"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "performMeasureAndLayout called with unplaced root"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "performMeasureAndLayout called with unattached root"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    return-void
.end method

.method public final k(Landroidx/compose/ui/node/a;ZZ)Z
    .locals 6

    iget-boolean v0, p1, Landroidx/compose/ui/node/a;->J:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v0

    const/4 v2, 0x1

    iget-object v3, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-nez v0, :cond_2

    iget-object v0, v3, Lt1/n0;->o:Lt1/l0;

    iget-boolean v0, v0, Lt1/l0;->z:Z

    if-nez v0, :cond_2

    invoke-static {p1}, Lt1/t0;->f(Landroidx/compose/ui/node/a;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->E()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, v3, Lt1/n0;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->p()I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v0, v3, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lt1/k0;->w:Lt1/o0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt1/a;->f()Z

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v3, Lt1/n0;->o:Lt1/l0;

    iget-object v0, v0, Lt1/l0;->A:Lt1/h0;

    invoke-virtual {v0}, Lt1/a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v3, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_14

    iget-object v0, v0, Lt1/k0;->w:Lt1/o0;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lt1/a;->f()Z

    move-result v0

    if-ne v0, v2, :cond_14

    :cond_2
    :goto_0
    iget-boolean v0, v3, Lt1/n0;->g:Z

    iget-object v4, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    if-nez v0, :cond_4

    iget-boolean v0, v3, Lt1/n0;->d:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    move v5, v0

    goto :goto_4

    :cond_4
    :goto_1
    if-ne p1, v4, :cond_5

    iget-object v0, p0, Lt1/t0;->h:Lm2/a;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    iget-boolean v5, v3, Lt1/n0;->g:Z

    if-eqz v5, :cond_6

    if-eqz p2, :cond_6

    invoke-virtual {p0, p1, v0}, Lt1/t0;->b(Landroidx/compose/ui/node/a;Lm2/a;)Z

    move-result v5

    goto :goto_3

    :cond_6
    move v5, v1

    :goto_3
    invoke-virtual {p0, p1, v0}, Lt1/t0;->c(Landroidx/compose/ui/node/a;Lm2/a;)Z

    move-result v0

    :goto_4
    if-eqz p3, :cond_e

    if-nez v5, :cond_7

    iget-boolean p3, v3, Lt1/n0;->h:Z

    if-eqz p3, :cond_8

    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->E()Ljava/lang/Boolean;

    move-result-object p3

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->F()V

    :cond_8
    iget-boolean p2, v3, Lt1/n0;->e:Z

    if-eqz p2, :cond_e

    if-eq p1, v4, :cond_9

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->D()Z

    move-result p2

    if-ne p2, v2, :cond_e

    iget-object p2, v3, Lt1/n0;->o:Lt1/l0;

    iget-boolean p2, p2, Lt1/l0;->z:Z

    if-eqz p2, :cond_e

    :cond_9
    if-ne p1, v4, :cond_d

    iget p2, p1, Landroidx/compose/ui/node/a;->K:I

    const/4 p3, 0x3

    if-ne p2, p3, :cond_a

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->f()V

    :cond_a
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_b

    iget-object p2, p2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p2, p2, Lt1/x0;->b:Lt1/x;

    if-eqz p2, :cond_b

    iget-object p2, p2, Lt1/q0;->o:Lr1/g0;

    if-nez p2, :cond_c

    :cond_b
    invoke-static {p1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object p2

    check-cast p2, Lu1/w;

    invoke-virtual {p2}, Lu1/w;->getPlacementScope()Lr1/w0;

    move-result-object p2

    :cond_c
    iget-object p3, v3, Lt1/n0;->o:Lt1/l0;

    invoke-static {p2, p3, v1, v1}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    goto :goto_5

    :cond_d
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->M()V

    :goto_5
    iget-object p2, p0, Lt1/t0;->d:Lt1/i1;

    iget-object p2, p2, Lt1/i1;->a:Lo0/i;

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    iput-boolean v2, p1, Landroidx/compose/ui/node/a;->I:Z

    :cond_e
    iget-object p1, p0, Lt1/t0;->g:Lo0/i;

    invoke-virtual {p1}, Lo0/i;->l()Z

    move-result p2

    if-eqz p2, :cond_13

    iget p2, p1, Lo0/i;->c:I

    if-lez p2, :cond_12

    iget-object p3, p1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_f
    aget-object v2, p3, v1

    check-cast v2, Lt1/s0;

    iget-object v3, v2, Lt1/s0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->C()Z

    move-result v3

    if-eqz v3, :cond_11

    iget-boolean v3, v2, Lt1/s0;->b:Z

    iget-boolean v4, v2, Lt1/s0;->c:Z

    iget-object v2, v2, Lt1/s0;->a:Landroidx/compose/ui/node/a;

    if-nez v3, :cond_10

    invoke-virtual {p0, v2, v4}, Lt1/t0;->q(Landroidx/compose/ui/node/a;Z)Z

    goto :goto_6

    :cond_10
    invoke-virtual {p0, v2, v4}, Lt1/t0;->o(Landroidx/compose/ui/node/a;Z)Z

    :cond_11
    :goto_6
    add-int/lit8 v1, v1, 0x1

    if-lt v1, p2, :cond_f

    :cond_12
    invoke-virtual {p1}, Lo0/i;->g()V

    :cond_13
    move v1, v0

    :cond_14
    return v1
.end method

.method public final l(Landroidx/compose/ui/node/a;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object p1

    iget v0, p1, Lo0/i;->c:I

    if-lez v0, :cond_3

    iget-object p1, p1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-static {v2}, Lt1/t0;->g(Landroidx/compose/ui/node/a;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Lt1/g;->v(Landroidx/compose/ui/node/a;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3}, Lt1/t0;->m(Landroidx/compose/ui/node/a;Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lt1/t0;->l(Landroidx/compose/ui/node/a;)V

    :cond_2
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_3
    return-void
.end method

.method public final m(Landroidx/compose/ui/node/a;Z)V
    .locals 1

    iget-object v0, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lt1/t0;->h:Lm2/a;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p0, p1, v0}, Lt1/t0;->b(Landroidx/compose/ui/node/a;Lm2/a;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v0}, Lt1/t0;->c(Landroidx/compose/ui/node/a;Lm2/a;)Z

    :goto_1
    return-void
.end method

.method public final n(Landroidx/compose/ui/node/a;Z)Z
    .locals 4

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->c:I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    move v1, v2

    goto/16 :goto_4

    :cond_2
    :goto_1
    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v3, v0, Lt1/n0;->g:Z

    if-nez v3, :cond_3

    iget-boolean v3, v0, Lt1/n0;->h:Z

    if-eqz v3, :cond_4

    :cond_3
    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    iput-boolean v1, v0, Lt1/n0;->h:Z

    iput-boolean v1, v0, Lt1/n0;->i:Z

    iput-boolean v1, v0, Lt1/n0;->e:Z

    iput-boolean v1, v0, Lt1/n0;->f:Z

    iget-boolean p2, p1, Landroidx/compose/ui/node/a;->J:Z

    if-eqz p2, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->E()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Lt1/t0;->b:Lt1/r;

    if-eqz v0, :cond_8

    if-eqz p2, :cond_6

    iget-object v0, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->g:Z

    if-ne v0, v1, :cond_6

    goto :goto_2

    :cond_6
    if-eqz p2, :cond_7

    iget-object v0, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->h:Z

    if-ne v0, v1, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v3, p1, v1}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->D()Z

    move-result v0

    if-eqz v0, :cond_b

    if-eqz p2, :cond_9

    iget-object v0, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->e:Z

    if-ne v0, v1, :cond_9

    goto :goto_3

    :cond_9
    if-eqz p2, :cond_a

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean p2, p2, Lt1/n0;->d:Z

    if-ne p2, v1, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {v3, p1, v2}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    :cond_b
    :goto_3
    iget-boolean p1, p0, Lt1/t0;->c:Z

    if-nez p1, :cond_1

    :goto_4
    return v1
.end method

.method public final o(Landroidx/compose/ui/node/a;Z)Z
    .locals 5

    iget-object v0, p1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_b

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v0, Lt1/n0;->c:I

    invoke-static {v1}, Lt/k;->e(I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    if-eq v1, v2, :cond_0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_a

    const/4 v4, 0x3

    if-eq v1, v4, :cond_a

    const/4 v4, 0x4

    if-ne v1, v4, :cond_9

    iget-boolean v1, v0, Lt1/n0;->g:Z

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    move v2, v3

    goto/16 :goto_2

    :cond_1
    iput-boolean v2, v0, Lt1/n0;->g:Z

    iput-boolean v2, v0, Lt1/n0;->d:Z

    iget-boolean p2, p1, Landroidx/compose/ui/node/a;->J:Z

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->E()Ljava/lang/Boolean;

    move-result-object p2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iget-object v1, p0, Lt1/t0;->b:Lt1/r;

    if-nez p2, :cond_3

    iget-boolean p2, v0, Lt1/n0;->g:Z

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->p()I

    move-result p2

    if-eq p2, v2, :cond_3

    iget-object p2, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz p2, :cond_4

    iget-object p2, p2, Lt1/k0;->w:Lt1/o0;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lt1/a;->f()Z

    move-result p2

    if-ne p2, v2, :cond_4

    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean p2, p2, Lt1/n0;->g:Z

    if-ne p2, v2, :cond_7

    :cond_4
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->D()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-static {p1}, Lt1/t0;->f(Landroidx/compose/ui/node/a;)Z

    move-result p2

    if-eqz p2, :cond_8

    :cond_5
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_6

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean p2, p2, Lt1/n0;->d:Z

    if-ne p2, v2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v1, p1, v3}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    goto :goto_1

    :cond_7
    invoke-virtual {v1, p1, v2}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    :cond_8
    :goto_1
    iget-boolean p1, p0, Lt1/t0;->c:Z

    if-nez p1, :cond_0

    goto :goto_2

    :cond_9
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_a
    new-instance v0, Lt1/s0;

    invoke-direct {v0, p1, v2, p2}, Lt1/s0;-><init>(Landroidx/compose/ui/node/a;ZZ)V

    iget-object p1, p0, Lt1/t0;->g:Lo0/i;

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :goto_2
    return v2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p(Landroidx/compose/ui/node/a;Z)Z
    .locals 4

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->c:I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_6

    const/4 v3, 0x4

    if-ne v0, v3, :cond_5

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->D()Z

    move-result p2

    iget-object v3, v0, Lt1/n0;->o:Lt1/l0;

    iget-boolean v3, v3, Lt1/l0;->z:Z

    if-ne p2, v3, :cond_0

    iget-boolean p2, v0, Lt1/n0;->d:Z

    if-nez p2, :cond_6

    iget-boolean p2, v0, Lt1/n0;->e:Z

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean v2, v0, Lt1/n0;->e:Z

    iput-boolean v2, v0, Lt1/n0;->f:Z

    iget-boolean p2, p1, Landroidx/compose/ui/node/a;->J:Z

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, v0, Lt1/n0;->o:Lt1/l0;

    iget-boolean p2, p2, Lt1/l0;->z:Z

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object v0, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v0, v0, Lt1/n0;->e:Z

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean p2, p2, Lt1/n0;->d:Z

    if-ne p2, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {p2, p1, v1}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    :cond_4
    :goto_0
    iget-boolean p1, p0, Lt1/t0;->c:Z

    if-nez p1, :cond_6

    move v1, v2

    goto :goto_1

    :cond_5
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_6
    :goto_1
    return v1
.end method

.method public final q(Landroidx/compose/ui/node/a;Z)Z
    .locals 4

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->c:I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    const/4 v2, 0x1

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_6

    const/4 v3, 0x4

    if-ne v0, v3, :cond_5

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean v3, v0, Lt1/n0;->d:Z

    if-eqz v3, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean v2, v0, Lt1/n0;->d:Z

    iget-boolean p2, p1, Landroidx/compose/ui/node/a;->J:Z

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->D()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Lt1/t0;->f(Landroidx/compose/ui/node/a;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-boolean p2, p2, Lt1/n0;->d:Z

    if-ne p2, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {p2, p1, v1}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    :cond_4
    :goto_0
    iget-boolean p1, p0, Lt1/t0;->c:Z

    if-nez p1, :cond_7

    move v1, v2

    goto :goto_1

    :cond_5
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_6
    new-instance v0, Lt1/s0;

    invoke-direct {v0, p1, v1, p2}, Lt1/s0;-><init>(Landroidx/compose/ui/node/a;ZZ)V

    iget-object p1, p0, Lt1/t0;->g:Lo0/i;

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_1
    return v1
.end method

.method public final r(J)V
    .locals 2

    iget-object v0, p0, Lt1/t0;->h:Lm2/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, v0, Lm2/a;->a:J

    invoke-static {v0, v1, p1, p2}, Lm2/a;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_0
    iget-boolean v0, p0, Lt1/t0;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    new-instance v0, Lm2/a;

    invoke-direct {v0, p1, p2}, Lm2/a;-><init>(J)V

    iput-object v0, p0, Lt1/t0;->h:Lm2/a;

    iget-object p1, p0, Lt1/t0;->a:Landroidx/compose/ui/node/a;

    iget-object p2, p1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-eqz p2, :cond_1

    iput-boolean v1, v0, Lt1/n0;->g:Z

    :cond_1
    iput-boolean v1, v0, Lt1/n0;->d:Z

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iget-object p2, p0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {p2, p1, v1}, Lt1/r;->a(Landroidx/compose/ui/node/a;Z)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "updateRootConstraints called while measuring"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    return-void
.end method
