.class public Lb3/p1;
.super Lb3/o1;


# instance fields
.field public n:Lu2/c;

.field public o:Lu2/c;

.field public p:Lu2/c;


# direct methods
.method public constructor <init>(Lb3/u1;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb3/o1;-><init>(Lb3/u1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lb3/p1;->n:Lu2/c;

    iput-object p1, p0, Lb3/p1;->o:Lu2/c;

    iput-object p1, p0, Lb3/p1;->p:Lu2/c;

    return-void
.end method


# virtual methods
.method public h()Lu2/c;
    .locals 1

    iget-object v0, p0, Lb3/p1;->o:Lu2/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroidx/activity/u;->y(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lu2/c;->c(Landroid/graphics/Insets;)Lu2/c;

    move-result-object v0

    iput-object v0, p0, Lb3/p1;->o:Lu2/c;

    :cond_0
    iget-object v0, p0, Lb3/p1;->o:Lu2/c;

    return-object v0
.end method

.method public j()Lu2/c;
    .locals 1

    iget-object v0, p0, Lb3/p1;->n:Lu2/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroidx/activity/u;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lu2/c;->c(Landroid/graphics/Insets;)Lu2/c;

    move-result-object v0

    iput-object v0, p0, Lb3/p1;->n:Lu2/c;

    :cond_0
    iget-object v0, p0, Lb3/p1;->n:Lu2/c;

    return-object v0
.end method

.method public l()Lu2/c;
    .locals 1

    iget-object v0, p0, Lb3/p1;->p:Lu2/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroidx/activity/u;->t(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lu2/c;->c(Landroid/graphics/Insets;)Lu2/c;

    move-result-object v0

    iput-object v0, p0, Lb3/p1;->p:Lu2/c;

    :cond_0
    iget-object v0, p0, Lb3/p1;->p:Lu2/c;

    return-object v0
.end method

.method public m(IIII)Lb3/u1;
    .locals 1

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/activity/u;->e(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lb3/u1;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lb3/u1;

    move-result-object p1

    return-object p1
.end method

.method public s(Lu2/c;)V
    .locals 0

    return-void
.end method
