.class public final Landroidx/lifecycle/v0;
.super Landroidx/lifecycle/d1;

# interfaces
.implements Landroidx/lifecycle/b1;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Landroidx/lifecycle/a1;

.field public final c:Landroid/os/Bundle;

.field public final d:Landroidx/lifecycle/r;

.field public final e:Lb4/e;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lb4/g;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/v0;->e:Lb4/e;

    invoke-interface {p2}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object p2

    iput-object p2, p0, Landroidx/lifecycle/v0;->d:Landroidx/lifecycle/r;

    iput-object p3, p0, Landroidx/lifecycle/v0;->c:Landroid/os/Bundle;

    iput-object p1, p0, Landroidx/lifecycle/v0;->a:Landroid/app/Application;

    if-eqz p1, :cond_1

    sget-object p2, Landroidx/lifecycle/a1;->c:Landroidx/lifecycle/a1;

    if-nez p2, :cond_0

    new-instance p2, Landroidx/lifecycle/a1;

    invoke-direct {p2, p1}, Landroidx/lifecycle/a1;-><init>(Landroid/app/Application;)V

    sput-object p2, Landroidx/lifecycle/a1;->c:Landroidx/lifecycle/a1;

    :cond_0
    sget-object p1, Landroidx/lifecycle/a1;->c:Landroidx/lifecycle/a1;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Landroidx/lifecycle/a1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/lifecycle/a1;-><init>(Landroid/app/Application;)V

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/v0;->b:Landroidx/lifecycle/a1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/x0;
    .locals 8

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/v0;->d:Landroidx/lifecycle/r;

    if-eqz v0, :cond_7

    const-class v1, Landroidx/lifecycle/a;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    iget-object v2, p0, Landroidx/lifecycle/v0;->a:Landroid/app/Application;

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    sget-object v3, Landroidx/lifecycle/w0;->a:Ljava/util/List;

    invoke-static {p1, v3}, Landroidx/lifecycle/w0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    goto :goto_0

    :cond_0
    sget-object v3, Landroidx/lifecycle/w0;->b:Ljava/util/List;

    invoke-static {p1, v3}, Landroidx/lifecycle/w0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_3

    if-eqz v2, :cond_1

    iget-object p2, p0, Landroidx/lifecycle/v0;->b:Landroidx/lifecycle/a1;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/a1;->create(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p2, Landroidx/lifecycle/c1;->a:Landroidx/lifecycle/c1;

    if-nez p2, :cond_2

    new-instance p2, Landroidx/lifecycle/c1;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    sput-object p2, Landroidx/lifecycle/c1;->a:Landroidx/lifecycle/c1;

    :cond_2
    sget-object p2, Landroidx/lifecycle/c1;->a:Landroidx/lifecycle/c1;

    invoke-static {p2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Landroidx/lifecycle/c1;->create(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    iget-object v4, p0, Landroidx/lifecycle/v0;->e:Lb4/e;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v4, p2}, Lb4/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    sget-object v6, Landroidx/lifecycle/p0;->f:[Ljava/lang/Class;

    iget-object v6, p0, Landroidx/lifecycle/v0;->c:Landroid/os/Bundle;

    invoke-static {v5, v6}, Lx9/v;->o(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/p0;

    move-result-object v5

    new-instance v6, Landroidx/lifecycle/q0;

    invoke-direct {v6, p2, v5}, Landroidx/lifecycle/q0;-><init>(Ljava/lang/String;Landroidx/lifecycle/p0;)V

    invoke-virtual {v6, v0, v4}, Landroidx/lifecycle/q0;->a(Landroidx/lifecycle/r;Lb4/e;)V

    invoke-virtual {v0}, Landroidx/lifecycle/r;->b()Landroidx/lifecycle/q;

    move-result-object p2

    sget-object v7, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q;

    if-eq p2, v7, :cond_5

    sget-object v7, Landroidx/lifecycle/q;->d:Landroidx/lifecycle/q;

    invoke-virtual {p2, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p2

    if-ltz p2, :cond_4

    goto :goto_2

    :cond_4
    new-instance p2, Landroidx/lifecycle/i;

    invoke-direct {p2, v0, v4}, Landroidx/lifecycle/i;-><init>(Landroidx/lifecycle/r;Lb4/e;)V

    invoke-virtual {v0, p2}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v4}, Lb4/e;->e()V

    :goto_3
    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    filled-new-array {v2, v5}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v3, p2}, Landroidx/lifecycle/w0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/x0;

    move-result-object p1

    goto :goto_4

    :cond_6
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v3, p2}, Landroidx/lifecycle/w0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/x0;

    move-result-object p1

    :goto_4
    const-string p2, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p1, p2, v6}, Landroidx/lifecycle/x0;->setTagIfAbsent(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/x0;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/v0;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object p1

    return-object p1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;Lq3/c;)Landroidx/lifecycle/x0;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/z0;->b:Landroidx/lifecycle/z0;

    .line 1
    invoke-virtual {p2, v0}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    sget-object v1, Landroidx/lifecycle/s0;->a:Landroidx/lifecycle/z0;

    .line 2
    invoke-virtual {p2, v1}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v1, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/z0;

    .line 3
    invoke-virtual {p2, v1}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v0, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    .line 4
    invoke-virtual {p2, v0}, Lq3/c;->a(Lq3/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    const-class v1, Landroidx/lifecycle/a;

    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 6
    sget-object v2, Landroidx/lifecycle/w0;->a:Ljava/util/List;

    .line 7
    invoke-static {p1, v2}, Landroidx/lifecycle/w0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    .line 8
    :cond_0
    sget-object v2, Landroidx/lifecycle/w0;->b:Ljava/util/List;

    .line 9
    invoke-static {p1, v2}, Landroidx/lifecycle/w0;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/v0;->b:Landroidx/lifecycle/a1;

    .line 10
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/a1;->create(Ljava/lang/Class;Lq3/c;)Landroidx/lifecycle/x0;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 11
    invoke-static {p2}, Landroidx/lifecycle/s0;->b(Lq3/c;)Landroidx/lifecycle/p0;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Landroidx/lifecycle/w0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/x0;

    move-result-object p1

    goto :goto_1

    .line 12
    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/s0;->b(Lq3/c;)Landroidx/lifecycle/p0;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Landroidx/lifecycle/w0;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/x0;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/v0;->d:Landroidx/lifecycle/r;

    if-eqz p2, :cond_4

    .line 13
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/v0;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object p1

    :goto_1
    return-object p1

    .line 14
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
