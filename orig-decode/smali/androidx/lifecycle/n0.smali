.class public final Landroidx/lifecycle/n0;
.super Landroid/app/Fragment;


# static fields
.field public static final synthetic b:I


# instance fields
.field public a:Landroidx/lifecycle/j0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/p;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "activity"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lx9/v;->p(Landroid/app/Activity;Landroidx/lifecycle/p;)V

    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/n0;->a(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/n0;->a(Landroidx/lifecycle/p;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/lifecycle/n0;->a:Landroidx/lifecycle/j0;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Landroidx/lifecycle/p;->ON_PAUSE:Landroidx/lifecycle/p;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/n0;->a(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, Landroidx/lifecycle/n0;->a:Landroidx/lifecycle/j0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/lifecycle/j0;->a:Landroidx/lifecycle/k0;

    invoke-virtual {v0}, Landroidx/lifecycle/k0;->a()V

    :cond_0
    sget-object v0, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/n0;->a(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Landroidx/lifecycle/n0;->a:Landroidx/lifecycle/j0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/lifecycle/j0;->a:Landroidx/lifecycle/k0;

    iget v1, v0, Landroidx/lifecycle/k0;->a:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Landroidx/lifecycle/k0;->a:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Landroidx/lifecycle/k0;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    sget-object v2, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/lifecycle/k0;->d:Z

    :cond_0
    sget-object v0, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/n0;->a(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/n0;->a(Landroidx/lifecycle/p;)V

    return-void
.end method
