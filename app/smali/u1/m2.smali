.class public final Lu1/m2;
.super Ljava/lang/Object;

# interfaces
.implements Lu1/v1;


# instance fields
.field public final a:Landroid/graphics/RenderNode;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lu1/l2;->e()Landroid/graphics/RenderNode;

    move-result-object v0

    iput-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    return-void
.end method


# virtual methods
.method public final A(Z)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/l2;->h(Landroid/graphics/RenderNode;Z)V

    return-void
.end method

.method public final B(I)V
    .locals 2

    const/4 v0, 0x1

    invoke-static {p1, v0}, Le1/g0;->c(II)Z

    move-result v0

    iget-object v1, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    if-eqz v0, :cond_0

    invoke-static {v1}, Lu1/l2;->g(Landroid/graphics/RenderNode;)V

    invoke-static {v1}, Lu1/l2;->l(Landroid/graphics/RenderNode;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-static {p1, v0}, Le1/g0;->c(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Lu1/l2;->n(Landroid/graphics/RenderNode;)V

    invoke-static {v1}, Lu1/l2;->o(Landroid/graphics/RenderNode;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lu1/l2;->n(Landroid/graphics/RenderNode;)V

    invoke-static {v1}, Lu1/l2;->l(Landroid/graphics/RenderNode;)V

    :goto_0
    return-void
.end method

.method public final C(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->e(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->k(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public final E(Landroid/graphics/Outline;)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->h(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)V

    return-void
.end method

.method public final F(I)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->o(Landroid/graphics/RenderNode;I)V

    return-void
.end method

.method public final G(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->z(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final H()Z
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->p(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public final I(Landroid/graphics/Matrix;)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->g(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final J()F
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->a(Landroid/graphics/RenderNode;)F

    move-result v0

    return v0
.end method

.method public final a()I
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->l(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/l2;->k(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/l2;->a(Landroid/graphics/RenderNode;)F

    move-result v0

    return v0
.end method

.method public final d(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->D(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final e(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->B(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final f(I)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->x(Landroid/graphics/RenderNode;I)V

    return-void
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->v(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public final getLeft()I
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->b(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public final getRight()I
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/l2;->b(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/l2;->m(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Lu1/n2;->a:Lu1/n2;

    iget-object v1, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu1/n2;->a(Landroid/graphics/RenderNode;Le1/h0;)V

    :cond_0
    return-void
.end method

.method public final j(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {p1, v0}, Lu1/n1;->c(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->s(Landroid/graphics/RenderNode;)I

    move-result v0

    return v0
.end method

.method public final l(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->y(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final m(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->q(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final n(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->A(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final o(Z)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->i(Landroid/graphics/RenderNode;Z)V

    return-void
.end method

.method public final p(IIII)Z
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1, p2, p3, p4}, Lu1/l2;->j(Landroid/graphics/RenderNode;IIII)Z

    move-result p1

    return p1
.end method

.method public final q(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->C(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final r(Lk/f;Le1/d0;Lc9/c;)V
    .locals 4

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/l2;->d(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    move-result-object v1

    iget-object v2, p1, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Le1/d;

    iget-object v3, v2, Le1/d;->a:Landroid/graphics/Canvas;

    iput-object v1, v2, Le1/d;->a:Landroid/graphics/Canvas;

    if-eqz p2, :cond_0

    invoke-virtual {v2}, Le1/d;->j()V

    const/4 v1, 0x1

    invoke-virtual {v2, p2, v1}, Le1/d;->t(Le1/d0;I)V

    :cond_0
    invoke-interface {p3, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Le1/d;->h()V

    :cond_1
    iget-object p1, p1, Lk/f;->b:Ljava/lang/Object;

    check-cast p1, Le1/d;

    iput-object v3, p1, Le1/d;->a:Landroid/graphics/Canvas;

    invoke-static {v0}, Lu1/n1;->d(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/n1;->m(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public final t(I)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->f(Landroid/graphics/RenderNode;I)V

    return-void
.end method

.method public final u(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->w(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final v(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->t(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final w(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->r(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final x(F)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->n(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final y()Z
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0}, Lu1/l2;->i(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public final z(I)V
    .locals 1

    iget-object v0, p0, Lu1/m2;->a:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Lu1/n1;->u(Landroid/graphics/RenderNode;I)V

    return-void
.end method
