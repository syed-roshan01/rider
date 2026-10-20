.class public abstract Landroidx/fragment/app/g0;
.super Landroidx/activity/p;

# interfaces
.implements Lq2/f;
.implements Lq2/g;


# static fields
.field static final LIFECYCLE_TAG:Ljava/lang/String; = "android:support:lifecycle"


# instance fields
.field mCreated:Z

.field final mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

.field final mFragments:Landroidx/fragment/app/l0;

.field mResumed:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/activity/p;-><init>()V

    new-instance v0, Landroidx/fragment/app/f0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/f0;-><init>(Landroidx/fragment/app/g0;)V

    new-instance v1, Landroidx/fragment/app/l0;

    invoke-direct {v1, v0}, Landroidx/fragment/app/l0;-><init>(Landroidx/fragment/app/f0;)V

    iput-object v1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    new-instance v0, Landroidx/lifecycle/y;

    invoke-direct {v0, p0}, Landroidx/lifecycle/y;-><init>(Landroidx/lifecycle/w;)V

    iput-object v0, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g0;->mStopped:Z

    invoke-virtual {p0}, Landroidx/activity/p;->getSavedStateRegistry()Lb4/e;

    move-result-object v1

    new-instance v2, Landroidx/activity/f;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Landroidx/activity/f;-><init>(Ljava/lang/Object;I)V

    const-string v3, "android:support:lifecycle"

    invoke-virtual {v1, v3, v2}, Lb4/e;->d(Ljava/lang/String;Lb4/d;)V

    new-instance v1, Landroidx/fragment/app/e0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/e0;-><init>(Landroidx/fragment/app/g0;I)V

    invoke-virtual {p0, v1}, Landroidx/activity/p;->addOnConfigurationChangedListener(La3/a;)V

    new-instance v1, Landroidx/fragment/app/e0;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/e0;-><init>(Landroidx/fragment/app/g0;I)V

    invoke-virtual {p0, v1}, Landroidx/activity/p;->addOnNewIntentListener(La3/a;)V

    new-instance v1, Landroidx/activity/g;

    invoke-direct {v1, p0, v0}, Landroidx/activity/g;-><init>(Landroidx/activity/p;I)V

    invoke-virtual {p0, v1}, Landroidx/activity/p;->addOnContextAvailableListener(Lc/b;)V

    return-void
.end method

.method public static c(Landroidx/fragment/app/g0;)V
    .locals 2

    iget-object p0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object p0, p0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, p0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p0, v1}, Landroidx/fragment/app/x0;->b(Landroidx/fragment/app/m0;Landroidx/fragment/app/j0;Landroidx/fragment/app/d0;)V

    return-void
.end method

.method public static synthetic d(Landroidx/fragment/app/g0;)Landroid/os/Bundle;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/g0;->markFragmentsCreated()V

    iget-object p0, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v0, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    return-object p0
.end method

.method public static e(Landroidx/fragment/app/x0;)Z
    .locals 5

    iget-object p0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {p0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/d0;->getHost()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/d0;->getChildFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v2

    invoke-static {v2}, Landroidx/fragment/app/g0;->e(Landroidx/fragment/app/x0;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    sget-object v3, Landroidx/lifecycle/q;->d:Landroidx/lifecycle/q;

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/fragment/app/p1;->b()V

    iget-object v2, v2, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    iget-object v2, v2, Landroidx/lifecycle/y;->c:Landroidx/lifecycle/q;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_3

    iget-object v0, v1, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object v0, v0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    invoke-virtual {v0}, Landroidx/lifecycle/y;->h()V

    move v0, v4

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    iget-object v2, v2, Landroidx/lifecycle/y;->c:Landroidx/lifecycle/q;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    invoke-virtual {v0}, Landroidx/lifecycle/y;->h()V

    move v0, v4

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v0, v0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->f:Landroidx/fragment/app/o0;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/o0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Lq2/m;->shouldDumpInternalState([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/g0;->mCreated:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/g0;->mResumed:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/g0;->mStopped:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Lr3/a;->a(Landroidx/lifecycle/w;)Lr3/c;

    move-result-object v1

    invoke-virtual {v1, v0, p3}, Lr3/c;->b(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v0, v0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/x0;->q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public getSupportFragmentManager()Landroidx/fragment/app/x0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v0, v0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    return-object v0
.end method

.method public getSupportLoaderManager()Lr3/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lr3/a;->a(Landroidx/lifecycle/w;)Lr3/c;

    move-result-object v0

    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/g0;->getSupportFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    invoke-static {v0}, Landroidx/fragment/app/g0;->e(Landroidx/fragment/app/x0;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {v0}, Landroidx/fragment/app/l0;->a()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/p;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/d0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/activity/p;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v0, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iget-object p1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object p1, p1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object p1, p1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v0, p1, Landroidx/fragment/app/x0;->F:Z

    iget-object v1, p1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v1, Landroidx/fragment/app/b1;->f:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/x0;->p(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/g0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/g0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v0, v0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->j()V

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/activity/p;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object p1, p1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object p1, p1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/x0;->h(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/g0;->mResumed:Z

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v0, v0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->p(I)V

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_PAUSE:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/g0;->onResumeFragments()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {v0}, Landroidx/fragment/app/l0;->a()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/p;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {v0}, Landroidx/fragment/app/l0;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g0;->mResumed:Z

    iget-object v1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v1, v1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/x0;->t(Z)Z

    return-void
.end method

.method public onResumeFragments()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v0, v0, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v1, v0, Landroidx/fragment/app/x0;->F:Z

    iget-object v2, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v2, Landroidx/fragment/app/b1;->f:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->p(I)V

    return-void
.end method

.method public onStart()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {v0}, Landroidx/fragment/app/l0;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/g0;->mStopped:Z

    iget-boolean v1, p0, Landroidx/fragment/app/g0;->mCreated:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, Landroidx/fragment/app/g0;->mCreated:Z

    iget-object v1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v1, v1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->F:Z

    iget-object v3, v1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v3, Landroidx/fragment/app/b1;->f:Z

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroidx/fragment/app/x0;->p(I)V

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v1, v1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    invoke-virtual {v1, v2}, Landroidx/fragment/app/x0;->t(Z)Z

    iget-object v1, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v2, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iget-object v1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v1, v1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->F:Z

    iget-object v2, v1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v2, Landroidx/fragment/app/b1;->f:Z

    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Landroidx/fragment/app/x0;->p(I)V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {v0}, Landroidx/fragment/app/l0;->a()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g0;->mStopped:Z

    invoke-virtual {p0}, Landroidx/fragment/app/g0;->markFragmentsCreated()V

    iget-object v1, p0, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    iget-object v1, v1, Landroidx/fragment/app/l0;->a:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->F:Z

    iget-object v2, v1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v2, Landroidx/fragment/app/b1;->f:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroidx/fragment/app/x0;->p(I)V

    iget-object v0, p0, Landroidx/fragment/app/g0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public setEnterSharedElementCallback(Lq2/r0;)V
    .locals 0

    sget p1, Lq2/h;->a:I

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lq2/b;->c(Landroid/app/Activity;Landroid/app/SharedElementCallback;)V

    return-void
.end method

.method public setExitSharedElementCallback(Lq2/r0;)V
    .locals 0

    sget p1, Lq2/h;->a:I

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lq2/b;->d(Landroid/app/Activity;Landroid/app/SharedElementCallback;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/d0;Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/g0;->startActivityFromFragment(Landroidx/fragment/app/d0;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/d0;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 2
    sget p1, Lq2/h;->a:I

    .line 3
    invoke-static {p0, p2, v0, p4}, Lq2/a;->b(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Landroidx/fragment/app/d0;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderFromFragment(Landroidx/fragment/app/d0;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    move v3, p3

    if-ne v3, v0, :cond_0

    sget v0, Lq2/h;->a:I

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v8}, Lq2/a;->c(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p8}, Landroidx/fragment/app/d0;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public supportFinishAfterTransition()V
    .locals 1

    sget v0, Lq2/h;->a:I

    invoke-static {p0}, Lq2/b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 1

    sget v0, Lq2/h;->a:I

    invoke-static {p0}, Lq2/b;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 1

    sget v0, Lq2/h;->a:I

    invoke-static {p0}, Lq2/b;->e(Landroid/app/Activity;)V

    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
