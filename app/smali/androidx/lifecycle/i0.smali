.class public final Landroidx/lifecycle/i0;
.super Landroidx/lifecycle/j;


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/k0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/i0;->this$0:Landroidx/lifecycle/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    invoke-static {p1, p2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p2, v0, :cond_0

    sget p2, Landroidx/lifecycle/n0;->b:I

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string p2, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p1, p2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"

    invoke-static {p1, p2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/lifecycle/n0;

    iget-object p2, p0, Landroidx/lifecycle/i0;->this$0:Landroidx/lifecycle/k0;

    iget-object p2, p2, Landroidx/lifecycle/k0;->o:Landroidx/lifecycle/j0;

    iput-object p2, p1, Landroidx/lifecycle/n0;->a:Landroidx/lifecycle/j0;

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/i0;->this$0:Landroidx/lifecycle/k0;

    iget v0, p1, Landroidx/lifecycle/k0;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroidx/lifecycle/k0;->b:I

    if-nez v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/k0;->e:Landroid/os/Handler;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p1, p1, Landroidx/lifecycle/k0;->n:Landroidx/activity/d;

    const-wide/16 v1, 0x2bc

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string p2, "activity"

    invoke-static {p1, p2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroidx/lifecycle/h0;

    iget-object v0, p0, Landroidx/lifecycle/i0;->this$0:Landroidx/lifecycle/k0;

    invoke-direct {p2, v0}, Landroidx/lifecycle/h0;-><init>(Landroidx/lifecycle/k0;)V

    invoke-static {p1, p2}, Landroidx/lifecycle/g0;->a(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/i0;->this$0:Landroidx/lifecycle/k0;

    iget v0, p1, Landroidx/lifecycle/k0;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Landroidx/lifecycle/k0;->a:I

    if-nez v0, :cond_0

    iget-boolean v0, p1, Landroidx/lifecycle/k0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/lifecycle/k0;->d:Z

    :cond_0
    return-void
.end method
