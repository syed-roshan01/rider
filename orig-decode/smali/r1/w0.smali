.class public abstract Lr1/w0;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Lr1/w0;)Lm2/l;
    .locals 1

    check-cast p0, Lr1/g0;

    iget v0, p0, Lr1/g0;->a:I

    iget-object p0, p0, Lr1/g0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p0, Lt1/l1;

    check-cast p0, Lu1/w;

    invoke-virtual {p0}, Lu1/w;->getLayoutDirection()Lm2/l;

    move-result-object p0

    goto :goto_0

    :pswitch_0
    check-cast p0, Lt1/q0;

    invoke-interface {p0}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p0

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lr1/w0;)I
    .locals 1

    check-cast p0, Lr1/g0;

    iget v0, p0, Lr1/g0;->a:I

    iget-object p0, p0, Lr1/g0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p0, Lt1/l1;

    check-cast p0, Lu1/w;

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object p0

    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p0, p0, Lt1/n0;->o:Lt1/l0;

    iget p0, p0, Lr1/x0;->a:I

    goto :goto_0

    :pswitch_0
    check-cast p0, Lt1/q0;

    invoke-virtual {p0}, Lr1/x0;->b0()I

    move-result p0

    :goto_0
    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Lr1/x0;IIF)V
    .locals 6

    invoke-static {p1, p2}, Li1/b;->c(II)J

    move-result-wide p1

    iget-wide v0, p0, Lr1/x0;->e:J

    sget v2, Lm2/i;->c:I

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    shr-long v4, v0, v2

    long-to-int v2, v4

    add-int/2addr v3, v2

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    and-long/2addr v0, v4

    long-to-int p2, v0

    add-int/2addr p1, p2

    invoke-static {v3, p1}, Li1/b;->c(II)J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lr1/x0;->d0(JFLc9/c;)V

    return-void
.end method

.method public static synthetic d(Lr1/w0;Lr1/x0;II)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p3, p0}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void
.end method

.method public static e(Lr1/x0;JF)V
    .locals 6

    iget-wide v0, p0, Lr1/x0;->e:J

    sget v2, Lm2/i;->c:I

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    shr-long v4, v0, v2

    long-to-int v2, v4

    add-int/2addr v3, v2

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    and-long/2addr v0, v4

    long-to-int p2, v0

    add-int/2addr p1, p2

    invoke-static {v3, p1}, Li1/b;->c(II)J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lr1/x0;->d0(JFLc9/c;)V

    return-void
.end method

.method public static synthetic f(Lr1/w0;Lr1/x0;J)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p3, p0}, Lr1/w0;->e(Lr1/x0;JF)V

    return-void
.end method

.method public static g(Lr1/w0;Lr1/x0;II)V
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-static {p0}, Lr1/w0;->a(Lr1/w0;)Lm2/l;

    move-result-object v0

    sget-object v1, Lm2/l;->a:Lm2/l;

    const/4 v2, 0x0

    const-wide v3, 0xffffffffL

    const/16 v5, 0x20

    const/4 v6, 0x0

    if-eq v0, v1, :cond_1

    invoke-static {p0}, Lr1/w0;->b(Lr1/w0;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lr1/w0;->b(Lr1/w0;)I

    move-result p0

    iget v0, p1, Lr1/x0;->a:I

    sub-int/2addr p0, v0

    sget v0, Lm2/i;->c:I

    shr-long v0, p2, v5

    long-to-int v0, v0

    sub-int/2addr p0, v0

    and-long/2addr p2, v3

    long-to-int p2, p2

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    iget-wide v0, p1, Lr1/x0;->e:J

    shr-long v7, p2, v5

    long-to-int p0, v7

    shr-long v7, v0, v5

    long-to-int v5, v7

    add-int/2addr p0, v5

    and-long/2addr p2, v3

    long-to-int p2, p2

    and-long/2addr v0, v3

    long-to-int p3, v0

    add-int/2addr p2, p3

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v2, v6}, Lr1/x0;->d0(JFLc9/c;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide v0, p1, Lr1/x0;->e:J

    sget p0, Lm2/i;->c:I

    shr-long v7, p2, v5

    long-to-int p0, v7

    shr-long v7, v0, v5

    long-to-int v5, v7

    add-int/2addr p0, v5

    and-long/2addr p2, v3

    long-to-int p2, p2

    and-long/2addr v0, v3

    long-to-int p3, v0

    add-int/2addr p2, p3

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v2, v6}, Lr1/x0;->d0(JFLc9/c;)V

    :goto_1
    return-void
.end method

.method public static h(Lr1/w0;Lr1/x0;II)V
    .locals 9

    sget v0, Lr1/z0;->b:I

    sget-object v0, Lr1/y0;->b:Lr1/y0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-static {p0}, Lr1/w0;->a(Lr1/w0;)Lm2/l;

    move-result-object v1

    sget-object v2, Lm2/l;->a:Lm2/l;

    const/4 v3, 0x0

    const-wide v4, 0xffffffffL

    const/16 v6, 0x20

    if-eq v1, v2, :cond_1

    invoke-static {p0}, Lr1/w0;->b(Lr1/w0;)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lr1/w0;->b(Lr1/w0;)I

    move-result p0

    iget v1, p1, Lr1/x0;->a:I

    sub-int/2addr p0, v1

    sget v1, Lm2/i;->c:I

    shr-long v1, p2, v6

    long-to-int v1, v1

    sub-int/2addr p0, v1

    and-long/2addr p2, v4

    long-to-int p2, p2

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    iget-wide v1, p1, Lr1/x0;->e:J

    shr-long v7, p2, v6

    long-to-int p0, v7

    shr-long v6, v1, v6

    long-to-int v6, v6

    add-int/2addr p0, v6

    and-long/2addr p2, v4

    long-to-int p2, p2

    and-long/2addr v1, v4

    long-to-int p3, v1

    add-int/2addr p2, p3

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v3, v0}, Lr1/x0;->d0(JFLc9/c;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide v1, p1, Lr1/x0;->e:J

    sget p0, Lm2/i;->c:I

    shr-long v7, p2, v6

    long-to-int p0, v7

    shr-long v6, v1, v6

    long-to-int v6, v6

    add-int/2addr p0, v6

    and-long/2addr p2, v4

    long-to-int p2, p2

    and-long/2addr v1, v4

    long-to-int p3, v1

    add-int/2addr p2, p3

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v3, v0}, Lr1/x0;->d0(JFLc9/c;)V

    :goto_1
    return-void
.end method

.method public static i(Lr1/w0;Lr1/x0;JLa0/g;I)V
    .locals 9

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget p4, Lr1/z0;->b:I

    sget-object p4, Lr1/y0;->b:Lr1/y0;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lr1/w0;->a(Lr1/w0;)Lm2/l;

    move-result-object p5

    sget-object v0, Lm2/l;->a:Lm2/l;

    const/4 v1, 0x0

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    if-eq p5, v0, :cond_2

    invoke-static {p0}, Lr1/w0;->b(Lr1/w0;)I

    move-result p5

    if-nez p5, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lr1/w0;->b(Lr1/w0;)I

    move-result p0

    iget p5, p1, Lr1/x0;->a:I

    sub-int/2addr p0, p5

    sget p5, Lm2/i;->c:I

    shr-long v5, p2, v4

    long-to-int p5, v5

    sub-int/2addr p0, p5

    and-long/2addr p2, v2

    long-to-int p2, p2

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    iget-wide v5, p1, Lr1/x0;->e:J

    shr-long v7, p2, v4

    long-to-int p0, v7

    shr-long v7, v5, v4

    long-to-int p5, v7

    add-int/2addr p0, p5

    and-long/2addr p2, v2

    long-to-int p2, p2

    and-long/2addr v2, v5

    long-to-int p3, v2

    add-int/2addr p2, p3

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v1, p4}, Lr1/x0;->d0(JFLc9/c;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-wide v5, p1, Lr1/x0;->e:J

    sget p0, Lm2/i;->c:I

    shr-long v7, p2, v4

    long-to-int p0, v7

    shr-long v7, v5, v4

    long-to-int p5, v7

    add-int/2addr p0, p5

    and-long/2addr p2, v2

    long-to-int p2, p2

    and-long/2addr v2, v5

    long-to-int p3, v2

    add-int/2addr p2, p3

    invoke-static {p0, p2}, Li1/b;->c(II)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v1, p4}, Lr1/x0;->d0(JFLc9/c;)V

    :goto_1
    return-void
.end method

.method public static j(Lr1/x0;IIFLc9/c;)V
    .locals 6

    invoke-static {p1, p2}, Li1/b;->c(II)J

    move-result-wide p1

    iget-wide v0, p0, Lr1/x0;->e:J

    sget v2, Lm2/i;->c:I

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    shr-long v4, v0, v2

    long-to-int v2, v4

    add-int/2addr v3, v2

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    and-long/2addr v0, v4

    long-to-int p2, v0

    add-int/2addr p1, p2

    invoke-static {v3, p1}, Li1/b;->c(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lr1/x0;->d0(JFLc9/c;)V

    return-void
.end method

.method public static synthetic k(Lr1/w0;Lr1/x0;IILq/w;I)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget p4, Lr1/z0;->b:I

    sget-object p4, Lr1/y0;->b:Lr1/y0;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p3, p0, p4}, Lr1/w0;->j(Lr1/x0;IIFLc9/c;)V

    return-void
.end method

.method public static l(Lr1/x0;JFLc9/c;)V
    .locals 6

    iget-wide v0, p0, Lr1/x0;->e:J

    sget v2, Lm2/i;->c:I

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    shr-long v4, v0, v2

    long-to-int v2, v4

    add-int/2addr v3, v2

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    and-long/2addr v0, v4

    long-to-int p2, v0

    add-int/2addr p1, p2

    invoke-static {v3, p1}, Li1/b;->c(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lr1/x0;->d0(JFLc9/c;)V

    return-void
.end method

.method public static synthetic m(Lr1/w0;Lr1/x0;JLa0/g;I)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget p4, Lr1/z0;->b:I

    sget-object p4, Lr1/y0;->b:Lr1/y0;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p3, p0, p4}, Lr1/w0;->l(Lr1/x0;JFLc9/c;)V

    return-void
.end method
