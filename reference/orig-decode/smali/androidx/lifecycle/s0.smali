.class public abstract Landroidx/lifecycle/s0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroidx/lifecycle/z0;

.field public static final b:Landroidx/lifecycle/z0;

.field public static final c:Landroidx/lifecycle/z0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/z0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/s0;->a:Landroidx/lifecycle/z0;

    new-instance v0, Landroidx/lifecycle/z0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/z0;

    new-instance v0, Landroidx/lifecycle/z0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/s0;->c:Landroidx/lifecycle/z0;

    return-void
.end method

.method public static final a(Landroidx/lifecycle/x0;Lb4/e;Landroidx/lifecycle/r;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/x0;->getTag(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/q0;

    if-eqz p0, :cond_2

    iget-boolean v0, p0, Landroidx/lifecycle/q0;->c:Z

    if-nez v0, :cond_2

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/q0;->a(Landroidx/lifecycle/r;Lb4/e;)V

    invoke-virtual {p2}, Landroidx/lifecycle/r;->b()Landroidx/lifecycle/q;

    move-result-object p0

    sget-object v0, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q;

    if-eq p0, v0, :cond_1

    sget-object v0, Landroidx/lifecycle/q;->d:Landroidx/lifecycle/q;

    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Landroidx/lifecycle/i;

    invoke-direct {p0, p2, p1}, Landroidx/lifecycle/i;-><init>(Landroidx/lifecycle/r;Lb4/e;)V

    invoke-virtual {p2, p0}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lb4/e;->e()V

    :cond_2
    :goto_1
    return-void
.end method

.method public static final b(Lq3/c;)Landroidx/lifecycle/p0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/s0;->a:Landroidx/lifecycle/z0;

    invoke-virtual {p0, v0}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb4/g;

    if-eqz v0, :cond_8

    sget-object v1, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/z0;

    invoke-virtual {p0, v1}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/g1;

    if-eqz v1, :cond_7

    sget-object v2, Landroidx/lifecycle/s0;->c:Landroidx/lifecycle/z0;

    invoke-virtual {p0, v2}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/z0;->b:Landroidx/lifecycle/z0;

    invoke-virtual {p0, v3}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_6

    invoke-interface {v0}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object v0

    invoke-virtual {v0}, Lb4/e;->b()Lb4/d;

    move-result-object v0

    instance-of v3, v0, Landroidx/lifecycle/t0;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v0, Landroidx/lifecycle/t0;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_5

    new-instance v3, Landroidx/lifecycle/e1;

    new-instance v5, Landroidx/lifecycle/r0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-direct {v3, v1, v5}, Landroidx/lifecycle/e1;-><init>(Landroidx/lifecycle/g1;Landroidx/lifecycle/b1;)V

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesVM"

    const-class v5, Landroidx/lifecycle/u0;

    invoke-virtual {v3, v5, v1}, Landroidx/lifecycle/e1;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/u0;

    iget-object v1, v1, Landroidx/lifecycle/u0;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/p0;

    if-nez v3, :cond_4

    sget-object v3, Landroidx/lifecycle/p0;->f:[Ljava/lang/Class;

    invoke-virtual {v0}, Landroidx/lifecycle/t0;->b()V

    iget-object v3, v0, Landroidx/lifecycle/t0;->c:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    iget-object v5, v0, Landroidx/lifecycle/t0;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_2

    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_2
    iget-object v5, v0, Landroidx/lifecycle/t0;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_3

    iput-object v4, v0, Landroidx/lifecycle/t0;->c:Landroid/os/Bundle;

    :cond_3
    invoke-static {v3, v2}, Lx9/v;->o(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/p0;

    move-result-object v3

    invoke-interface {v1, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v3

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Lb4/g;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/r;->b()Landroidx/lifecycle/q;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/q;->c:Landroidx/lifecycle/q;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object v0

    invoke-virtual {v0}, Lb4/e;->b()Lb4/d;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/t0;

    invoke-interface {p0}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Landroidx/lifecycle/g1;

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/t0;-><init>(Lb4/e;Landroidx/lifecycle/g1;)V

    invoke-interface {p0}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object v1

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v1, v2, v0}, Lb4/e;->d(Ljava/lang/String;Lb4/d;)V

    invoke-interface {p0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/f;

    invoke-direct {v1, v0}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/t0;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    :cond_2
    return-void
.end method
