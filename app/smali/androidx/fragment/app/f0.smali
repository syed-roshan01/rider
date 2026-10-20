.class public final Landroidx/fragment/app/f0;
.super Landroidx/fragment/app/m0;

# interfaces
.implements Lr2/n;
.implements Lr2/o;
.implements Lq2/o0;
.implements Lq2/p0;
.implements Landroidx/lifecycle/g1;
.implements Landroidx/activity/k0;
.implements Ld/j;
.implements Lb4/g;
.implements Landroidx/fragment/app/c1;
.implements Lb3/i;


# instance fields
.field public final synthetic e:Landroidx/fragment/app/g0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g0;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-direct {p0, p1}, Landroidx/fragment/app/m0;-><init>(Landroidx/fragment/app/g0;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/d0;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/g0;->onAttachFragment(Landroidx/fragment/app/d0;)V

    return-void
.end method

.method public final addMenuProvider(Lb3/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->addMenuProvider(Lb3/o;)V

    return-void
.end method

.method public final addOnConfigurationChangedListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->addOnConfigurationChangedListener(La3/a;)V

    return-void
.end method

.method public final addOnMultiWindowModeChangedListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->addOnMultiWindowModeChangedListener(La3/a;)V

    return-void
.end method

.method public final addOnPictureInPictureModeChangedListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->addOnPictureInPictureModeChangedListener(La3/a;)V

    return-void
.end method

.method public final addOnTrimMemoryListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->addOnTrimMemoryListener(La3/a;)V

    return-void
.end method

.method public final b(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getActivityResultRegistry()Ld/i;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0}, Landroidx/activity/p;->getActivityResultRegistry()Ld/i;

    move-result-object v0

    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/r;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    iget-object v0, v0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    return-object v0
.end method

.method public final getOnBackPressedDispatcher()Landroidx/activity/i0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0}, Landroidx/activity/p;->getOnBackPressedDispatcher()Landroidx/activity/i0;

    move-result-object v0

    return-object v0
.end method

.method public final getSavedStateRegistry()Lb4/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0}, Landroidx/activity/p;->getSavedStateRegistry()Lb4/e;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/f1;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0}, Landroidx/activity/p;->getViewModelStore()Landroidx/lifecycle/f1;

    move-result-object v0

    return-object v0
.end method

.method public final removeMenuProvider(Lb3/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->removeMenuProvider(Lb3/o;)V

    return-void
.end method

.method public final removeOnConfigurationChangedListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->removeOnConfigurationChangedListener(La3/a;)V

    return-void
.end method

.method public final removeOnMultiWindowModeChangedListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->removeOnMultiWindowModeChangedListener(La3/a;)V

    return-void
.end method

.method public final removeOnPictureInPictureModeChangedListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->removeOnPictureInPictureModeChangedListener(La3/a;)V

    return-void
.end method

.method public final removeOnTrimMemoryListener(La3/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {v0, p1}, Landroidx/activity/p;->removeOnTrimMemoryListener(La3/a;)V

    return-void
.end method
