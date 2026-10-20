.class public final Landroidx/activity/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/activity/j;->a:I

    iput-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 2

    iget v0, p0, Landroidx/activity/j;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    if-ne p2, v0, :cond_0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p2, v0, :cond_0

    iget-object p2, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    invoke-static {p2}, Landroidx/activity/p;->access$100(Landroidx/activity/p;)Landroidx/activity/i0;

    move-result-object p2

    check-cast p1, Landroidx/activity/p;

    invoke-static {p1}, Landroidx/activity/l;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "invoker"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p2, Landroidx/activity/i0;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, p2, Landroidx/activity/i0;->g:Z

    invoke-virtual {p2, p1}, Landroidx/activity/i0;->c(Z)V

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    invoke-virtual {p1}, Landroidx/activity/p;->ensureViewModelStore()V

    invoke-virtual {p1}, Landroidx/activity/p;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    return-void

    :pswitch_1
    sget-object p1, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_2
    return-void

    :pswitch_2
    sget-object p1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_4

    iget-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    iget-object p1, p1, Landroidx/activity/p;->mContextAwareHelper:Lc/a;

    iput-object v1, p1, Lc/a;->b:Landroid/content/Context;

    iget-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    invoke-virtual {p1}, Landroidx/activity/p;->getViewModelStore()Landroidx/lifecycle/f1;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/f1;->a()V

    :cond_3
    iget-object p1, p0, Landroidx/activity/j;->b:Landroidx/activity/p;

    iget-object p1, p1, Landroidx/activity/p;->mReportFullyDrawnExecutor:Landroidx/activity/n;

    check-cast p1, Landroidx/activity/o;

    invoke-virtual {p1}, Landroidx/activity/o;->a()V

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
