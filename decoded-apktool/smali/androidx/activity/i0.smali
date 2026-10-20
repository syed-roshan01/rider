.class public final Landroidx/activity/i0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lr8/l;

.field public c:Landroidx/activity/y;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/i0;->a:Ljava/lang/Runnable;

    new-instance p1, Lr8/l;

    invoke-direct {p1}, Lr8/l;-><init>()V

    iput-object p1, p0, Landroidx/activity/i0;->b:Lr8/l;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    sget-object p1, Landroidx/activity/e0;->a:Landroidx/activity/e0;

    new-instance v0, Landroidx/activity/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/activity/z;-><init>(Landroidx/activity/i0;I)V

    new-instance v2, Landroidx/activity/z;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Landroidx/activity/z;-><init>(Landroidx/activity/i0;I)V

    new-instance v4, Landroidx/activity/a0;

    invoke-direct {v4, p0, v1}, Landroidx/activity/a0;-><init>(Landroidx/activity/i0;I)V

    new-instance v1, Landroidx/activity/a0;

    invoke-direct {v1, p0, v3}, Landroidx/activity/a0;-><init>(Landroidx/activity/i0;I)V

    invoke-virtual {p1, v0, v2, v4, v1}, Landroidx/activity/e0;->a(Lc9/c;Lc9/c;Lc9/a;Lc9/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/activity/c0;->a:Landroidx/activity/c0;

    new-instance v0, Landroidx/activity/a0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Landroidx/activity/a0;-><init>(Landroidx/activity/i0;I)V

    invoke-virtual {p1, v0}, Landroidx/activity/c0;->a(Lc9/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Landroidx/activity/i0;->d:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/w;Landroidx/activity/y;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/r;->b()Landroidx/lifecycle/q;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/q;->a:Landroidx/lifecycle/q;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/activity/f0;

    invoke-direct {v0, p0, p1, p2}, Landroidx/activity/f0;-><init>(Landroidx/activity/i0;Landroidx/lifecycle/r;Landroidx/activity/y;)V

    iget-object p1, p2, Landroidx/activity/y;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/activity/i0;->d()V

    new-instance p1, Landroidx/activity/h0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Landroidx/activity/h0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p2, Landroidx/activity/y;->c:Lc9/a;

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Landroidx/activity/i0;->c:Landroidx/activity/y;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/activity/i0;->b:Lr8/l;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroidx/activity/y;

    iget-boolean v3, v3, Landroidx/activity/y;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Landroidx/activity/y;

    :cond_2
    iput-object v1, p0, Landroidx/activity/i0;->c:Landroidx/activity/y;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/activity/y;->a()V

    return-void

    :cond_3
    iget-object v0, p0, Landroidx/activity/i0;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_4
    return-void
.end method

.method public final c(Z)V
    .locals 5

    iget-object v0, p0, Landroidx/activity/i0;->e:Landroid/window/OnBackInvokedDispatcher;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/activity/i0;->d:Landroid/window/OnBackInvokedCallback;

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    sget-object v3, Landroidx/activity/c0;->a:Landroidx/activity/c0;

    if-eqz p1, :cond_0

    iget-boolean v4, p0, Landroidx/activity/i0;->f:Z

    if-nez v4, :cond_0

    invoke-virtual {v3, v0, v2, v1}, Landroidx/activity/c0;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/activity/i0;->f:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Landroidx/activity/i0;->f:Z

    if-eqz p1, :cond_1

    invoke-virtual {v3, v0, v1}, Landroidx/activity/c0;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/activity/i0;->f:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 4

    iget-boolean v0, p0, Landroidx/activity/i0;->g:Z

    iget-object v1, p0, Landroidx/activity/i0;->b:Lr8/l;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lr8/l;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/activity/y;

    iget-boolean v2, v2, Landroidx/activity/y;->a:Z

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Landroidx/activity/i0;->g:Z

    if-eq v3, v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_3

    invoke-virtual {p0, v3}, Landroidx/activity/i0;->c(Z)V

    :cond_3
    return-void
.end method
