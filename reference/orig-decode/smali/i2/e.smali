.class public final Li2/e;
.super Landroid/text/TextPaint;


# instance fields
.field public final a:Le1/g;

.field public b:Ll2/j;

.field public c:Le1/k0;

.field public d:Lg1/h;


# direct methods
.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/text/TextPaint;-><init>(I)V

    iput p1, p0, Landroid/text/TextPaint;->density:F

    new-instance p1, Le1/g;

    invoke-direct {p1, p0}, Le1/g;-><init>(Landroid/graphics/Paint;)V

    iput-object p1, p0, Li2/e;->a:Le1/g;

    sget-object p1, Ll2/j;->b:Ll2/j;

    iput-object p1, p0, Li2/e;->b:Ll2/j;

    sget-object p1, Le1/k0;->d:Le1/k0;

    iput-object p1, p0, Li2/e;->c:Le1/k0;

    return-void
.end method


# virtual methods
.method public final a(Le1/n;JF)V
    .locals 6

    instance-of v0, p1, Le1/n0;

    iget-object v1, p0, Li2/e;->a:Le1/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le1/n0;

    iget-wide v2, v0, Le1/n0;->a:J

    sget-wide v4, Le1/r;->g:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Le1/j0;

    if-eqz v0, :cond_2

    sget-wide v2, Ld1/f;->c:J

    cmp-long v0, p2, v2

    if-eqz v0, :cond_2

    :goto_0
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p4, v1, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p4}, Landroid/graphics/Paint;->getAlpha()I

    move-result p4

    int-to-float p4, p4

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p4, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p4, v0, v2}, Lz6/a;->q(FFF)F

    move-result p4

    :goto_1
    invoke-virtual {p1, p4, p2, p3, v1}, Le1/n;->a(FJLe1/g;)V

    goto :goto_2

    :cond_2
    if-nez p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Le1/g;->h(Landroid/graphics/Shader;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final b(Lg1/h;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li2/e;->d:Lg1/h;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, Li2/e;->d:Lg1/h;

    sget-object v0, Lg1/j;->a:Lg1/j;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Li2/e;->a:Le1/g;

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Le1/g;->l(I)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lg1/k;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Le1/g;->l(I)V

    check-cast p1, Lg1/k;

    iget v0, p1, Lg1/k;->a:F

    invoke-virtual {v1, v0}, Le1/g;->k(F)V

    iget-object v0, v1, Le1/g;->a:Landroid/graphics/Paint;

    iget v2, p1, Lg1/k;->b:F

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    iget v0, p1, Lg1/k;->d:I

    invoke-virtual {v1, v0}, Le1/g;->j(I)V

    iget p1, p1, Lg1/k;->c:I

    invoke-virtual {v1, p1}, Le1/g;->i(I)V

    const/4 p1, 0x0

    iget-object v0, v1, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_2
    :goto_0
    return-void
.end method

.method public final c(Le1/k0;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li2/e;->c:Le1/k0;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Li2/e;->c:Le1/k0;

    sget-object v0, Le1/k0;->d:Le1/k0;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Li2/e;->c:Le1/k0;

    iget v0, p1, Le1/k0;->c:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-nez v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    iget-wide v1, p1, Le1/k0;->b:J

    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result p1

    iget-object v1, p0, Li2/e;->c:Le1/k0;

    iget-wide v1, v1, Le1/k0;->b:J

    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result v1

    iget-object v2, p0, Li2/e;->c:Le1/k0;

    iget-wide v2, v2, Le1/k0;->a:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v2

    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final d(Ll2/j;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li2/e;->b:Ll2/j;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Li2/e;->b:Ll2/j;

    iget p1, p1, Ll2/j;->a:I

    or-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget-object p1, p0, Li2/e;->b:Ll2/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p1, Ll2/j;->a:I

    or-int/lit8 v0, p1, 0x2

    if-ne v0, p1, :cond_2

    move v1, v2

    :cond_2
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    :cond_3
    return-void
.end method
