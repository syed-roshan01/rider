.class public final Lu/l0;
.super Lu1/x1;

# interfaces
.implements Lb1/f;


# instance fields
.field public final c:Lu/j;


# direct methods
.method public constructor <init>(Lu/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/l0;->c:Lu/j;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lu/l0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lu/l0;

    iget-object p1, p1, Lu/l0;->c:Lu/j;

    iget-object v0, p0, Lu/l0;->c:Lu/j;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lu/l0;->c:Lu/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i(Lg1/e;)V
    .locals 11

    check-cast p1, Lt1/i0;

    invoke-virtual {p1}, Lt1/i0;->a()V

    iget-object v0, p0, Lu/l0;->c:Lu/j;

    iget-wide v1, v0, Lu/j;->p:J

    invoke-static {v1, v2}, Ld1/f;->e(J)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-object v1, p1, Lt1/i0;->a:Lg1/c;

    iget-object v1, v1, Lg1/c;->b:Lg1/b;

    invoke-virtual {v1}, Lg1/b;->a()Le1/p;

    move-result-object v1

    iget-object v2, v0, Lu/j;->m:Lm0/l1;

    invoke-virtual {v2}, Lm0/u2;->d()I

    move-result v2

    iput v2, v0, Lu/j;->l:I

    invoke-static {v1}, Le1/e;->a(Le1/p;)Landroid/graphics/Canvas;

    move-result-object v1

    iget-object v2, v0, Lu/j;->j:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, v2, v1}, Lu/j;->h(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :goto_0
    iget-object v3, v0, Lu/j;->e:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_2

    invoke-virtual {v0, p1, v3, v1}, Lu/j;->g(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v5

    invoke-static {v3}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    invoke-static {v2, v3}, Lf6/a;->e0(Landroid/widget/EdgeEffect;F)V

    goto :goto_1

    :cond_2
    move v5, v6

    :goto_1
    iget-object v2, v0, Lu/j;->h:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpg-float v3, v3, v4

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p1, v2, v1}, Lu/j;->f(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :goto_2
    iget-object v3, v0, Lu/j;->c:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v7

    iget-object v8, v0, Lu/j;->a:Lu/z1;

    const/4 v9, 0x1

    if-nez v7, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    iget-object v10, v8, Lu/z1;->b:Ly/t0;

    invoke-interface {v10}, Ly/t0;->d()F

    move-result v10

    invoke-virtual {p1, v10}, Lt1/i0;->v(F)F

    move-result v10

    invoke-virtual {v1, v4, v10}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v3, v1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v10

    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    if-nez v10, :cond_5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    move v5, v6

    goto :goto_4

    :cond_5
    :goto_3
    move v5, v9

    :goto_4
    invoke-static {v3}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    invoke-static {v2, v3}, Lf6/a;->e0(Landroid/widget/EdgeEffect;F)V

    :cond_6
    iget-object v2, v0, Lu/j;->k:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpg-float v3, v3, v4

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v0, p1, v2, v1}, Lu/j;->g(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :goto_5
    iget-object v3, v0, Lu/j;->f:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-virtual {v0, p1, v3, v1}, Lu/j;->h(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v7

    if-nez v7, :cond_9

    if-eqz v5, :cond_8

    goto :goto_6

    :cond_8
    move v5, v6

    goto :goto_7

    :cond_9
    :goto_6
    move v5, v9

    :goto_7
    invoke-static {v3}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    invoke-static {v2, v3}, Lf6/a;->e0(Landroid/widget/EdgeEffect;F)V

    :cond_a
    iget-object v2, v0, Lu/j;->i:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpg-float v3, v3, v4

    if-nez v3, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    iget-object v7, v8, Lu/z1;->b:Ly/t0;

    invoke-interface {v7}, Ly/t0;->d()F

    move-result v7

    invoke-virtual {p1, v7}, Lt1/i0;->v(F)F

    move-result v7

    invoke-virtual {v1, v4, v7}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->finish()V

    :goto_8
    iget-object v3, v0, Lu/j;->d:Landroid/widget/EdgeEffect;

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v4

    if-nez v4, :cond_e

    invoke-virtual {v0, p1, v3, v1}, Lu/j;->f(Lg1/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    if-nez p1, :cond_c

    if-eqz v5, :cond_d

    :cond_c
    move v6, v9

    :cond_d
    invoke-static {v3}, Lf6/a;->L(Landroid/widget/EdgeEffect;)F

    move-result p1

    invoke-static {v2, p1}, Lf6/a;->e0(Landroid/widget/EdgeEffect;F)V

    move v5, v6

    :cond_e
    if-eqz v5, :cond_f

    invoke-virtual {v0}, Lu/j;->i()V

    :cond_f
    :goto_9
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DrawOverscrollModifier(overscrollEffect="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lu/l0;->c:Lu/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
