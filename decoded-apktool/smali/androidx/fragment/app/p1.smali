.class public final Landroidx/fragment/app/p1;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/l;
.implements Lb4/g;
.implements Landroidx/lifecycle/g1;


# instance fields
.field public final a:Landroidx/fragment/app/d0;

.field public final b:Landroidx/lifecycle/f1;

.field public c:Landroidx/lifecycle/y;

.field public d:Lb4/f;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d0;Landroidx/lifecycle/f1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    iput-object v0, p0, Landroidx/fragment/app/p1;->d:Lb4/f;

    iput-object p1, p0, Landroidx/fragment/app/p1;->a:Landroidx/fragment/app/d0;

    iput-object p2, p0, Landroidx/fragment/app/p1;->b:Landroidx/lifecycle/f1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/p;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/y;

    invoke-direct {v0, p0}, Landroidx/lifecycle/y;-><init>(Landroidx/lifecycle/w;)V

    iput-object v0, p0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    invoke-static {p0}, Lx9/v;->l(Lb4/g;)Lb4/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/p1;->d:Lb4/f;

    invoke-virtual {v0}, Lb4/f;->a()V

    invoke-static {p0}, Landroidx/lifecycle/s0;->c(Lb4/g;)V

    :cond_0
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()Lq3/c;
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/p1;->a:Landroidx/fragment/app/d0;

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Lq3/d;

    invoke-direct {v2}, Lq3/d;-><init>()V

    iget-object v3, v2, Lq3/c;->a:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_2

    sget-object v4, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, Landroidx/lifecycle/s0;->a:Landroidx/lifecycle/z0;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/z0;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v1, Landroidx/lifecycle/s0;->c:Landroidx/lifecycle/z0;

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final getLifecycle()Landroidx/lifecycle/r;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/p1;->b()V

    iget-object v0, p0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lb4/e;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/p1;->b()V

    iget-object v0, p0, Landroidx/fragment/app/p1;->d:Lb4/f;

    iget-object v0, v0, Lb4/f;->b:Lb4/e;

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/f1;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/p1;->b()V

    iget-object v0, p0, Landroidx/fragment/app/p1;->b:Landroidx/lifecycle/f1;

    return-object v0
.end method
