.class public final Lh0/t0;
.super Ljava/lang/Object;

# interfaces
.implements Lf0/k1;


# instance fields
.field public final synthetic a:Lh0/v0;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lh0/v0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/t0;->a:Lh0/v0;

    iput-boolean p2, p0, Lh0/t0;->b:Z

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lh0/t0;->a:Lh0/v0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lh0/v0;->b(Lh0/v0;Lf0/n0;)V

    invoke-static {v0, v1}, Lh0/v0;->a(Lh0/v0;Ld1/c;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lh0/v0;->p(Z)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lh0/t0;->a:Lh0/v0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lh0/v0;->b(Lh0/v0;Lf0/n0;)V

    invoke-static {v0, v1}, Lh0/v0;->a(Lh0/v0;Ld1/c;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lh0/v0;->p(Z)V

    return-void
.end method

.method public final f(J)V
    .locals 0

    return-void
.end method

.method public final g()V
    .locals 4

    iget-boolean v0, p0, Lh0/t0;->b:Z

    if-eqz v0, :cond_0

    sget-object v1, Lf0/n0;->b:Lf0/n0;

    goto :goto_0

    :cond_0
    sget-object v1, Lf0/n0;->c:Lf0/n0;

    :goto_0
    iget-object v2, p0, Lh0/t0;->a:Lh0/v0;

    invoke-static {v2, v1}, Lh0/v0;->b(Lh0/v0;Lf0/n0;)V

    invoke-virtual {v2, v0}, Lh0/v0;->j(Z)J

    move-result-wide v0

    sget v3, Lh0/d0;->a:F

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v3

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    invoke-static {v3, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    iget-object v3, v2, Lh0/v0;->d:Lf0/c2;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lf0/c2;->d()Lf0/d2;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, v0, v1}, Lf0/d2;->e(J)J

    move-result-wide v0

    iput-wide v0, v2, Lh0/v0;->l:J

    new-instance v3, Ld1/c;

    invoke-direct {v3, v0, v1}, Ld1/c;-><init>(J)V

    iget-object v0, v2, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v0, v3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-wide v0, Ld1/c;->b:J

    iput-wide v0, v2, Lh0/v0;->n:J

    const/4 v0, -0x1

    iput v0, v2, Lh0/v0;->q:I

    iget-object v0, v2, Lh0/v0;->d:Lf0/c2;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, v0, Lf0/c2;->q:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lh0/v0;->p(Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final h(J)V
    .locals 9

    iget-object v8, p0, Lh0/t0;->a:Lh0/v0;

    iget-wide v0, v8, Lh0/v0;->n:J

    invoke-static {v0, v1, p1, p2}, Ld1/c;->g(JJ)J

    move-result-wide p1

    iput-wide p1, v8, Lh0/v0;->n:J

    iget-wide v0, v8, Lh0/v0;->l:J

    invoke-static {v0, v1, p1, p2}, Ld1/c;->g(JJ)J

    move-result-wide p1

    new-instance v0, Ld1/c;

    invoke-direct {v0, p1, p2}, Ld1/c;-><init>(J)V

    iget-object p1, v8, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    invoke-virtual {v8}, Lh0/v0;->i()Ld1/c;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v2, p1, Ld1/c;->a:J

    const/4 v4, 0x0

    iget-boolean v5, p0, Lh0/t0;->b:Z

    sget-object v6, Lh0/r;->d:Lb0/l0;

    const/4 v7, 0x1

    move-object v0, v8

    invoke-static/range {v0 .. v7}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    const/4 p1, 0x0

    invoke-virtual {v8, p1}, Lh0/v0;->p(Z)V

    return-void
.end method
