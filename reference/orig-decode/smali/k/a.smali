.class public final Lk/a;
.super Ll/e1;


# instance fields
.field public final synthetic q:Landroidx/appcompat/view/menu/ActionMenuItemView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 0

    iput-object p1, p0, Lk/a;->q:Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-direct {p0, p1}, Ll/e1;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lk/n;
    .locals 2

    iget-object v0, p0, Lk/a;->q:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->t:Lk/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Ll/g;

    iget-object v0, v0, Ll/g;->a:Ll/k;

    iget-object v0, v0, Ll/k;->z:Ll/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/q;->a()Lk/n;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Lk/a;->q:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->r:Lk/k;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->o:Lk/m;

    invoke-interface {v1, v0}, Lk/k;->a(Lk/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/a;->b()Lk/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk/u;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method
