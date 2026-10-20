.class public final Lb0/a;
.super Ljava/lang/Object;

# interfaces
.implements Ln1/a;


# instance fields
.field public final a:Lb0/h0;

.field public final b:Lv/h1;


# direct methods
.method public constructor <init>(Lb0/h0;)V
    .locals 1

    sget-object v0, Lv/h1;->b:Lv/h1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/a;->a:Lb0/h0;

    iput-object v0, p0, Lb0/a;->b:Lv/h1;

    return-void
.end method


# virtual methods
.method public final L(JJLu8/e;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Lv/h1;->a:Lv/h1;

    iget-object p2, p0, Lb0/a;->b:Lv/h1;

    const/4 p5, 0x0

    if-ne p2, p1, :cond_0

    const/4 p1, 0x2

    invoke-static {p3, p4, p5, p5, p1}, Lm2/p;->a(JFFI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-static {p3, p4, p5, p5, p1}, Lm2/p;->a(JFFI)J

    move-result-wide p1

    :goto_0
    new-instance p3, Lm2/p;

    invoke-direct {p3, p1, p2}, Lm2/p;-><init>(J)V

    return-object p3
.end method

.method public final V(JJI)J
    .locals 0

    const/4 p1, 0x2

    if-ne p5, p1, :cond_1

    sget-wide p1, Ld1/c;->b:J

    invoke-static {p3, p4, p1, p2}, Ld1/c;->b(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    sget-wide p1, Ld1/c;->b:J

    return-wide p1
.end method

.method public final g0(IJ)J
    .locals 6

    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lb0/a;->a:Lb0/h0;

    iget-object v0, p1, Lb0/h0;->e:Lb0/a0;

    iget-object v0, v0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    iget-object v0, p1, Lb0/h0;->e:Lb0/a0;

    iget-object v1, v0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v1}, Lm0/s2;->d()F

    move-result v1

    invoke-virtual {p1}, Lb0/h0;->l()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {p1}, Lb0/h0;->j()Lb0/q;

    move-result-object v2

    check-cast v2, Lb0/x;

    iget v2, v2, Lb0/x;->b:I

    invoke-virtual {p1}, Lb0/h0;->j()Lb0/q;

    move-result-object v3

    check-cast v3, Lb0/x;

    iget v3, v3, Lb0/x;->c:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, v0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v3}, Lm0/s2;->d()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    neg-float v3, v3

    mul-float/2addr v2, v3

    add-float/2addr v2, v1

    iget-object v0, v0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    move v5, v2

    move v2, v1

    move v1, v5

    :cond_0
    sget-object v0, Lv/h1;->b:Lv/h1;

    iget-object v3, p0, Lb0/a;->b:Lv/h1;

    if-ne v3, v0, :cond_1

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v4

    goto :goto_0

    :cond_1
    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v4

    :goto_0
    invoke-static {v4, v1, v2}, Lz6/a;->q(FFF)F

    move-result v1

    neg-float v1, v1

    iget-object p1, p1, Lb0/h0;->k:Lv/y;

    invoke-virtual {p1, v1}, Lv/y;->e(F)F

    move-result p1

    neg-float p1, p1

    if-ne v3, v0, :cond_2

    move v0, p1

    goto :goto_1

    :cond_2
    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v0

    :goto_1
    sget-object v1, Lv/h1;->a:Lv/h1;

    if-ne v3, v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result p1

    :goto_2
    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    goto :goto_3

    :cond_4
    sget-wide p1, Ld1/c;->b:J

    :goto_3
    return-wide p1
.end method
