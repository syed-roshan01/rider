.class public final Lk/w;
.super Lk/l;

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public final v:Lk/l;

.field public final w:Lk/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk/l;Lk/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lk/l;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lk/w;->v:Lk/l;

    iput-object p3, p0, Lk/w;->w:Lk/m;

    return-void
.end method


# virtual methods
.method public final d(Lk/m;)Z
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0, p1}, Lk/l;->d(Lk/m;)Z

    move-result p1

    return p1
.end method

.method public final e(Lk/l;Landroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lk/l;->e(Lk/l;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0, p1, p2}, Lk/l;->e(Lk/l;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final f(Lk/m;)Z
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0, p1}, Lk/l;->f(Lk/m;)Z

    move-result p1

    return p1
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lk/w;->w:Lk/m;

    return-object v0
.end method

.method public final j()Lk/l;
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0}, Lk/l;->j()Lk/l;

    move-result-object v0

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0}, Lk/l;->l()Z

    move-result v0

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0}, Lk/l;->m()Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0}, Lk/l;->n()Z

    move-result v0

    return v0
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0, p1}, Lk/l;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1, v1}, Lk/l;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p1, v0}, Lk/l;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v1, v0, v1}, Lk/l;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v1, p1, v1, v0}, Lk/l;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1, p1}, Lk/l;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lk/w;->w:Lk/m;

    .line 2
    invoke-virtual {v0, p1}, Lk/m;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lk/w;->w:Lk/m;

    .line 1
    invoke-virtual {v0, p1}, Lk/m;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    iget-object v0, p0, Lk/w;->v:Lk/l;

    invoke-virtual {v0, p1}, Lk/l;->setQwertyMode(Z)V

    return-void
.end method
