.class public Lb3/j1;
.super Lb3/l1;


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lb3/l1;-><init>()V

    .line 2
    invoke-static {}, Landroidx/activity/u;->b()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lb3/u1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lb3/l1;-><init>(Lb3/u1;)V

    .line 4
    invoke-virtual {p1}, Lb3/u1;->b()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Landroidx/activity/u;->c(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Landroidx/activity/u;->b()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lb3/u1;
    .locals 3

    invoke-virtual {p0}, Lb3/l1;->a()V

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, Landroidx/activity/u;->d(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lb3/u1;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lb3/u1;

    move-result-object v0

    iget-object v1, p0, Lb3/l1;->b:[Lu2/c;

    iget-object v2, v0, Lb3/u1;->a:Lb3/r1;

    invoke-virtual {v2, v1}, Lb3/r1;->q([Lu2/c;)V

    return-object v0
.end method

.method public d(Lu2/c;)V
    .locals 1

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lu2/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/activity/u;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(Lu2/c;)V
    .locals 1

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lu2/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/activity/u;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(Lu2/c;)V
    .locals 1

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lu2/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/activity/u;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(Lu2/c;)V
    .locals 1

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lu2/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/activity/u;->x(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(Lu2/c;)V
    .locals 1

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lu2/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/activity/u;->r(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
