.class public final Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;
.super Ljava/lang/Object;


# instance fields
.field private extras:Lq3/c;

.field private handle:Landroidx/lifecycle/p0;

.field private final nonComponentActivity:Z


# direct methods
.method public constructor <init>(Lq3/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->nonComponentActivity:Z

    iput-object p1, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    return-void
.end method

.method public getSavedStateHandle()Landroidx/lifecycle/p0;
    .locals 4

    invoke-static {}, Ldagger/hilt/android/internal/ThreadUtil;->ensureMainThread()V

    iget-boolean v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->nonComponentActivity:Z

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity that does not extend ComponentActivity cannot use SavedStateHandle"

    invoke-static {v0, v2, v1}, Ldagger/hilt/internal/Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->handle:Landroidx/lifecycle/p0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    const-string v1, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()"

    invoke-static {v0, v1}, Ldagger/hilt/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lq3/d;

    iget-object v1, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    invoke-direct {v0, v1}, Lq3/d;-><init>(Lq3/c;)V

    sget-object v1, Landroidx/lifecycle/s0;->c:Landroidx/lifecycle/z0;

    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iget-object v3, v0, Lq3/c;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    invoke-static {v0}, Landroidx/lifecycle/s0;->b(Lq3/c;)Landroidx/lifecycle/p0;

    move-result-object v0

    iput-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->handle:Landroidx/lifecycle/p0;

    const/4 v1, 0x0

    iput-object v1, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    return-object v0
.end method

.method public isInvalid()Z
    .locals 1

    iget-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->handle:Landroidx/lifecycle/p0;

    if-nez v0, :cond_0

    iget-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setExtras(Lq3/c;)V
    .locals 1

    iget-object v0, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->handle:Landroidx/lifecycle/p0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Ldagger/hilt/android/internal/managers/SavedStateHandleHolder;->extras:Lq3/c;

    return-void
.end method
