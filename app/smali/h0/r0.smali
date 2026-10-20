.class public final Lh0/r0;
.super Lh0/h;


# instance fields
.field public final h:Lg2/a0;

.field public final i:Lf0/d2;


# direct methods
.method public constructor <init>(Lg2/a0;Lg2/s;Lf0/d2;Lh0/a1;)V
    .locals 7

    iget-object v1, p1, Lg2/a0;->a:La2/e;

    iget-wide v2, p1, Lg2/a0;->b:J

    if-eqz p3, :cond_0

    iget-object v0, p3, Lf0/d2;->a:La2/a0;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    move-object v0, p0

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lh0/h;-><init>(La2/e;JLa2/a0;Lg2/s;Lh0/a1;)V

    iput-object p1, p0, Lh0/r0;->h:Lg2/a0;

    iput-object p3, p0, Lh0/r0;->i:Lf0/d2;

    return-void
.end method


# virtual methods
.method public final n(Lf0/j;)Ljava/util/List;
    .locals 4

    iget-wide v0, p0, Lh0/h;->f:J

    invoke-static {v0, v1}, La2/b0;->b(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p0}, Lf0/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg2/i;

    if-eqz p1, :cond_0

    invoke-static {p1}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [Lg2/i;

    new-instance v0, Lg2/a;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg2/a;-><init>(Ljava/lang/String;I)V

    aput-object v0, p1, v2

    new-instance v0, Lg2/z;

    iget-wide v1, p0, Lh0/h;->f:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result v1

    iget-wide v2, p0, Lh0/h;->f:J

    invoke-static {v2, v3}, La2/b0;->e(J)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lg2/z;-><init>(II)V

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-static {p1}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final o(Lf0/d2;I)I
    .locals 5

    iget-object v0, p1, Lf0/d2;->b:Lr1/s;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lf0/d2;->c:Lr1/s;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lr1/s;->b(Lr1/s;Z)Ld1/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Ld1/d;->e:Ld1/d;

    :cond_2
    iget-object v1, p0, Lh0/r0;->h:Lg2/a0;

    iget-wide v1, v1, Lg2/a0;->b:J

    sget v3, La2/b0;->c:I

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    iget-object v2, p0, Lh0/h;->d:Lg2/s;

    invoke-interface {v2, v1}, Lg2/s;->b(I)I

    move-result v1

    iget-object p1, p1, Lf0/d2;->a:La2/a0;

    invoke-virtual {p1, v1}, La2/a0;->c(I)Ld1/d;

    move-result-object v1

    invoke-virtual {v0}, Ld1/d;->c()F

    move-result v3

    invoke-virtual {v0}, Ld1/d;->b()F

    move-result v0

    invoke-static {v3, v0}, Ld7/t;->j(FF)J

    move-result-wide v3

    invoke-static {v3, v4}, Ld1/f;->b(J)F

    move-result v0

    int-to-float p2, p2

    mul-float/2addr v0, p2

    iget p2, v1, Ld1/d;->b:F

    add-float/2addr v0, p2

    iget p2, v1, Ld1/d;->a:F

    invoke-static {p2, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, La2/a0;->l(J)I

    move-result p1

    invoke-interface {v2, p1}, Lg2/s;->a(I)I

    move-result p1

    return p1
.end method
