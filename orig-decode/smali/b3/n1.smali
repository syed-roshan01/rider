.class public Lb3/n1;
.super Lb3/m1;


# instance fields
.field public m:Lu2/c;


# direct methods
.method public constructor <init>(Lb3/u1;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb3/m1;-><init>(Lb3/u1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lb3/n1;->m:Lu2/c;

    return-void
.end method


# virtual methods
.method public b()Lb3/u1;
    .locals 2

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lb3/u1;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lb3/u1;

    move-result-object v0

    return-object v0
.end method

.method public c()Lb3/u1;
    .locals 2

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lb3/u1;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lb3/u1;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lu2/c;
    .locals 4

    iget-object v0, p0, Lb3/n1;->m:Lu2/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v0

    invoke-static {v1, v2, v3, v0}, Lu2/c;->b(IIII)Lu2/c;

    move-result-object v0

    iput-object v0, p0, Lb3/n1;->m:Lu2/c;

    :cond_0
    iget-object v0, p0, Lb3/n1;->m:Lu2/c;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public s(Lu2/c;)V
    .locals 0

    iput-object p1, p0, Lb3/n1;->m:Lu2/c;

    return-void
.end method
