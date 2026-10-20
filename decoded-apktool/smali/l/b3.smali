.class public final Ll/b3;
.super Ljava/lang/Object;

# interfaces
.implements Ll/n;
.implements Lk/j;


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/b3;->a:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public final g(Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Ll/b3;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final m(Lk/l;)V
    .locals 2

    iget-object v0, p0, Ll/b3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->z:Ll/k;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/k;->y:Ll/f;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk/q;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->N:Lb3/m;

    iget-object v0, v0, Lb3/m;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/o;

    check-cast v1, Landroidx/fragment/app/r0;

    iget-object v1, v1, Landroidx/fragment/app/r0;->a:Landroidx/fragment/app/x0;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/x0;->o(Landroid/view/Menu;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
