.class public final Lu/g2;
.super Lu/e2;


# virtual methods
.method public final a(JJF)V
    .locals 2

    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    iget-object v1, p0, Lu/e2;->a:Landroid/widget/Magnifier;

    if-nez v0, :cond_0

    invoke-virtual {v1, p5}, Landroid/widget/Magnifier;->setZoom(F)V

    :cond_0
    invoke-static {p3, p4}, Ld9/i;->u(J)Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p5

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    invoke-static {p3, p4}, Ld1/c;->d(J)F

    move-result p2

    invoke-static {p3, p4}, Ld1/c;->e(J)F

    move-result p3

    invoke-virtual {v1, p5, p1, p2, p3}, Landroid/widget/Magnifier;->show(FFFF)V

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p3

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    invoke-virtual {v1, p3, p1}, Landroid/widget/Magnifier;->show(FF)V

    :goto_0
    return-void
.end method
