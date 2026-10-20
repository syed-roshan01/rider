.class public abstract Lh0/h;
.super Ljava/lang/Object;


# instance fields
.field public final a:La2/e;

.field public final b:J

.field public final c:La2/a0;

.field public final d:Lg2/s;

.field public final e:Lh0/a1;

.field public f:J

.field public final g:La2/e;


# direct methods
.method public constructor <init>(La2/e;JLa2/a0;Lg2/s;Lh0/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/h;->a:La2/e;

    iput-wide p2, p0, Lh0/h;->b:J

    iput-object p4, p0, Lh0/h;->c:La2/a0;

    iput-object p5, p0, Lh0/h;->d:Lg2/s;

    iput-object p6, p0, Lh0/h;->e:Lh0/a1;

    iput-wide p2, p0, Lh0/h;->f:J

    iput-object p1, p0, Lh0/h;->g:La2/e;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, Lh0/h;->c:La2/a0;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lh0/h;->f:J

    invoke-static {v1, v2}, La2/b0;->d(J)I

    move-result v1

    iget-object v2, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {v2, v1}, Lg2/s;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, La2/a0;->f(I)I

    move-result v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, La2/a0;->e(IZ)I

    move-result v0

    invoke-interface {v2, v0}, Lg2/s;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lh0/h;->c:La2/a0;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lh0/h;->f:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result v1

    iget-object v2, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {v2, v1}, Lg2/s;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, La2/a0;->f(I)I

    move-result v1

    invoke-virtual {v0, v1}, La2/a0;->j(I)I

    move-result v0

    invoke-interface {v2, v0}, Lg2/s;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 6

    iget-object v0, p0, Lh0/h;->c:La2/a0;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lh0/h;->m()I

    move-result v1

    :goto_0
    iget-object v2, p0, Lh0/h;->a:La2/e;

    iget-object v3, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_0

    iget-object v0, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Lh0/h;->g:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-virtual {v0, v2}, La2/a0;->n(I)J

    move-result-wide v2

    sget v4, La2/b0;->c:I

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    if-gt v2, v1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {v0, v2}, Lg2/s;->a(I)I

    move-result v0

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 5

    iget-object v0, p0, Lh0/h;->c:La2/a0;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lh0/h;->m()I

    move-result v1

    :goto_0
    if-gtz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Lh0/h;->g:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-virtual {v0, v2}, La2/a0;->n(I)J

    move-result-wide v2

    sget v4, La2/b0;->c:I

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    if-lt v2, v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {v0, v2}, Lg2/s;->a(I)I

    move-result v0

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return-object v0
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Lh0/h;->c:La2/a0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/h;->m()I

    move-result v1

    invoke-virtual {v0, v1}, La2/a0;->m(I)Ll2/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Ll2/h;->b:Ll2/h;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final f(La2/a0;I)I
    .locals 5

    invoke-virtual {p0}, Lh0/h;->m()I

    move-result v0

    iget-object v1, p0, Lh0/h;->e:Lh0/a1;

    iget-object v2, v1, Lh0/a1;->a:Ljava/lang/Float;

    if-nez v2, :cond_0

    invoke-virtual {p1, v0}, La2/a0;->c(I)Ld1/d;

    move-result-object v2

    iget v2, v2, Ld1/d;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput-object v2, v1, Lh0/a1;->a:Ljava/lang/Float;

    :cond_0
    invoke-virtual {p1, v0}, La2/a0;->f(I)I

    move-result v0

    add-int/2addr v0, p2

    if-gez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p2, p1, La2/a0;->b:La2/i;

    iget p2, p2, La2/i;->f:I

    if-lt v0, p2, :cond_2

    iget-object p1, p0, Lh0/h;->g:La2/e;

    iget-object p1, p1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1, v0}, La2/a0;->d(I)F

    move-result p2

    const/4 v2, 0x1

    int-to-float v3, v2

    sub-float/2addr p2, v3

    iget-object v1, v1, Lh0/a1;->a:Ljava/lang/Float;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {p0}, Lh0/h;->e()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v0}, La2/a0;->i(I)F

    move-result v4

    cmpl-float v4, v3, v4

    if-gez v4, :cond_4

    :cond_3
    invoke-virtual {p0}, Lh0/h;->e()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p1, v0}, La2/a0;->h(I)F

    move-result v4

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_5

    :cond_4
    invoke-virtual {p1, v0, v2}, La2/a0;->e(IZ)I

    move-result p1

    return p1

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0, p2}, Ld9/i;->f(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, La2/a0;->l(J)I

    move-result p1

    iget-object p2, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {p2, p1}, Lg2/s;->a(I)I

    move-result p1

    return p1
.end method

.method public final g()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lh0/h;->e:Lh0/a1;

    iput-object v0, v1, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lh0/h;->g:La2/e;

    iget-object v1, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    iget-wide v1, p0, Lh0/h;->f:J

    invoke-static {v1, v2}, La2/b0;->d(J)I

    move-result v1

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lf6/a;->G(ILjava/lang/String;)I

    move-result v1

    iget-wide v2, p0, Lh0/h;->f:J

    invoke-static {v2, v3}, La2/b0;->d(J)I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1, v0}, Lf6/a;->G(ILjava/lang/String;)I

    move-result v1

    :cond_0
    invoke-virtual {p0, v1, v1}, Lh0/h;->l(II)V

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lh0/h;->e:Lh0/a1;

    iput-object v0, v1, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lh0/h;->g:La2/e;

    iget-object v1, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    iget-wide v1, p0, Lh0/h;->f:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result v1

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lf6/a;->H(ILjava/lang/String;)I

    move-result v1

    iget-wide v2, p0, Lh0/h;->f:J

    invoke-static {v2, v3}, La2/b0;->e(J)I

    move-result v2

    if-ne v1, v2, :cond_0

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, v0}, Lf6/a;->H(ILjava/lang/String;)I

    move-result v1

    :cond_0
    invoke-virtual {p0, v1, v1}, Lh0/h;->l(II)V

    :cond_1
    return-void
.end method

.method public final i()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lh0/h;->e:Lh0/a1;

    iput-object v0, v1, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lh0/h;->g:La2/e;

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lh0/h;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v0}, Lh0/h;->l(II)V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lh0/h;->e:Lh0/a1;

    iput-object v0, v1, Lh0/a1;->a:Ljava/lang/Float;

    iget-object v0, p0, Lh0/h;->g:La2/e;

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lh0/h;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v0}, Lh0/h;->l(II)V

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, Lh0/h;->g:La2/e;

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, La2/b0;->c:I

    const/16 v0, 0x20

    iget-wide v1, p0, Lh0/h;->b:J

    shr-long v0, v1, v0

    long-to-int v0, v0

    iget-wide v1, p0, Lh0/h;->f:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo1/s;->g(II)J

    move-result-wide v0

    iput-wide v0, p0, Lh0/h;->f:J

    :cond_0
    return-void
.end method

.method public final l(II)V
    .locals 0

    invoke-static {p1, p2}, Lo1/s;->g(II)J

    move-result-wide p1

    iput-wide p1, p0, Lh0/h;->f:J

    return-void
.end method

.method public final m()I
    .locals 4

    iget-wide v0, p0, Lh0/h;->f:J

    sget v2, La2/b0;->c:I

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {v1, v0}, Lg2/s;->b(I)I

    move-result v0

    return v0
.end method
