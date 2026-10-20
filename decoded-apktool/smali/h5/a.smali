.class public final Lh5/a;
.super Lh1/c;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final f:Landroid/graphics/drawable/Drawable;

.field public final n:Lm0/n1;

.field public final o:Lm0/n1;

.field public final p:Lq8/i;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    const-string v0, "drawable"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lh1/c;-><init>()V

    iput-object p1, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lm0/o3;->a:Lm0/o3;

    invoke-static {v1, v2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Lh5/a;->n:Lm0/n1;

    sget-object v1, Lh5/c;->a:Lq8/c;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v1, v3}, Ld7/t;->j(FF)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    sget-wide v3, Ld1/f;->c:J

    :goto_0
    new-instance v1, Ld1/f;

    invoke-direct {v1, v3, v4}, Ld1/f;-><init>(J)V

    invoke-static {v1, v2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Lh5/a;->o:Lm0/n1;

    new-instance v1, Lu1/z0;

    const/16 v2, 0xd

    invoke-direct {v1, p0, v2}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lq8/i;

    invoke-direct {v2, v1}, Lq8/i;-><init>(Lc9/a;)V

    iput-object v2, p0, Lh5/a;->p:Lq8/i;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lh5/a;->p:Lq8/i;

    invoke-virtual {v0}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable$Callback;

    iget-object v1, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    instance-of v0, v1, Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_0

    check-cast v1, Landroid/graphics/drawable/Animatable;

    invoke-interface {v1}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 0

    invoke-virtual {p0}, Lh5/a;->d()V

    return-void
.end method

.method public final c(F)Z
    .locals 2

    const/16 v0, 0xff

    int-to-float v1, v0

    mul-float/2addr p1, v1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lz6/a;->r(III)I

    move-result p1

    iget-object v0, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/Animatable;

    invoke-interface {v1}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void
.end method

.method public final e(Le1/l;)Z
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Le1/l;->a:Landroid/graphics/ColorFilter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final f(Lm2/l;)V
    .locals 1

    const-string v0, "layoutDirection"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object p1, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    return-void
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Lh5/a;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/f;

    iget-wide v0, v0, Ld1/f;->a:J

    return-wide v0
.end method

.method public final i(Lg1/g;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object v0

    invoke-virtual {v0}, Lg1/b;->a()Le1/p;

    move-result-object v0

    iget-object v1, p0, Lh5/a;->n:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ld1/f;->d(J)F

    move-result v1

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v1

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld1/f;->b(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    const/4 v2, 0x0

    iget-object v3, p0, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, v2, v2, v1, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :try_start_0
    invoke-interface {v0}, Le1/p;->j()V

    invoke-static {v0}, Le1/e;->a(Le1/p;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Le1/p;->h()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Le1/p;->h()V

    throw p1
.end method
