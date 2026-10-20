.class public abstract Lcom/google/android/gms/common/api/i;
.super Ljava/lang/Object;


# instance fields
.field protected final zaa:Lcom/google/android/gms/common/api/internal/f;

.field private final zab:Landroid/content/Context;

.field private final zac:Ljava/lang/String;

.field private final zad:Lcom/google/android/gms/common/api/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/f;"
        }
    .end annotation
.end field

.field private final zae:Lcom/google/android/gms/common/api/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/b;"
        }
    .end annotation
.end field

.field private final zaf:Lcom/google/android/gms/common/api/internal/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/a;"
        }
    .end annotation
.end field

.field private final zag:Landroid/os/Looper;

.field private final zah:I

.field private final zai:Lcom/google/android/gms/common/api/l;

.field private final zaj:Lcom/google/android/gms/common/api/internal/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/internal/u;Lcom/google/android/gms/common/api/h;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_6

    if-eqz p3, :cond_5

    if-eqz p5, :cond_4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->zab:Landroid/content/Context;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v3, "getAttributionTag"

    new-array v4, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    :catch_0
    :cond_1
    iput-object v1, p0, Lcom/google/android/gms/common/api/i;->zac:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/common/api/i;->zad:Lcom/google/android/gms/common/api/f;

    iput-object p4, p0, Lcom/google/android/gms/common/api/i;->zae:Lcom/google/android/gms/common/api/b;

    iget-object p1, p5, Lcom/google/android/gms/common/api/h;->b:Landroid/os/Looper;

    iput-object p1, p0, Lcom/google/android/gms/common/api/i;->zag:Landroid/os/Looper;

    new-instance p1, Lcom/google/android/gms/common/api/internal/a;

    invoke-direct {p1, p3, p4, v1}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/internal/u;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/i;->zaf:Lcom/google/android/gms/common/api/internal/a;

    new-instance p3, Lcom/google/android/gms/common/api/internal/g0;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/common/api/i;->zai:Lcom/google/android/gms/common/api/l;

    iget-object p3, p0, Lcom/google/android/gms/common/api/i;->zab:Landroid/content/Context;

    invoke-static {p3}, Lcom/google/android/gms/common/api/internal/f;->f(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/f;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/common/api/i;->zaa:Lcom/google/android/gms/common/api/internal/f;

    iget-object p4, p3, Lcom/google/android/gms/common/api/internal/f;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p4

    iput p4, p0, Lcom/google/android/gms/common/api/i;->zah:I

    iget-object p4, p5, Lcom/google/android/gms/common/api/h;->a:Lcom/google/android/gms/common/api/internal/r;

    iput-object p4, p0, Lcom/google/android/gms/common/api/i;->zaj:Lcom/google/android/gms/common/api/internal/r;

    if-eqz p2, :cond_3

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_3

    invoke-static {p2}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getFragment(Landroid/app/Activity;)Lcom/google/android/gms/common/api/internal/j;

    move-result-object p2

    const-string p4, "ConnectionlessLifecycleHelper"

    const-class p5, Lcom/google/android/gms/common/api/internal/x;

    invoke-interface {p2, p5, p4}, Lcom/google/android/gms/common/api/internal/j;->b(Ljava/lang/Class;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/common/api/internal/x;

    if-nez p4, :cond_2

    new-instance p4, Lcom/google/android/gms/common/api/internal/x;

    sget-object p5, Lz5/e;->c:Ljava/lang/Object;

    invoke-direct {p4, p2, p3}, Lcom/google/android/gms/common/api/internal/x;-><init>(Lcom/google/android/gms/common/api/internal/j;Lcom/google/android/gms/common/api/internal/f;)V

    :cond_2
    iget-object p2, p4, Lcom/google/android/gms/common/api/internal/x;->e:Lq/g;

    invoke-virtual {p2, p1}, Lq/g;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p4}, Lcom/google/android/gms/common/api/internal/f;->a(Lcom/google/android/gms/common/api/internal/x;)V

    :cond_3
    iget-object p1, p3, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/4 p2, 0x7

    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Api must not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null context is not permitted."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v11, v0, Lcom/google/android/gms/common/api/i;->zaa:Lcom/google/android/gms/common/api/internal/f;

    iget-object v12, v0, Lcom/google/android/gms/common/api/i;->zaj:Lcom/google/android/gms/common/api/internal/r;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v1, Lcom/google/android/gms/common/api/internal/t;->c:I

    iget-object v13, v11, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    if-eqz v5, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/common/api/i;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    move-result-object v6

    invoke-virtual {v11}, Lcom/google/android/gms/common/api/internal/f;->b()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/q;->a()Lcom/google/android/gms/common/internal/q;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/common/internal/q;->a:Lcom/google/android/gms/common/internal/r;

    const/4 v7, 0x1

    if-eqz v3, :cond_5

    iget-boolean v8, v3, Lcom/google/android/gms/common/internal/r;->b:Z

    if-nez v8, :cond_1

    goto :goto_2

    :cond_1
    iget-object v8, v11, Lcom/google/android/gms/common/api/internal/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/common/api/internal/d0;

    if-eqz v8, :cond_4

    iget-object v9, v8, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    instance-of v10, v9, Lcom/google/android/gms/common/internal/f;

    if-nez v10, :cond_2

    goto :goto_2

    :cond_2
    check-cast v9, Lcom/google/android/gms/common/internal/f;

    invoke-virtual {v9}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v9}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    move-result v10

    if-nez v10, :cond_4

    invoke-static {v8, v9, v5}, Lcom/google/android/gms/common/api/internal/k0;->a(Lcom/google/android/gms/common/api/internal/d0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/i;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    iget v4, v8, Lcom/google/android/gms/common/api/internal/d0;->l:I

    add-int/2addr v4, v7

    iput v4, v8, Lcom/google/android/gms/common/api/internal/d0;->l:I

    iget-boolean v7, v3, Lcom/google/android/gms/common/internal/i;->c:Z

    goto :goto_0

    :cond_4
    iget-boolean v7, v3, Lcom/google/android/gms/common/internal/r;->c:Z

    :cond_5
    :goto_0
    new-instance v14, Lcom/google/android/gms/common/api/internal/k0;

    const-wide/16 v3, 0x0

    if-eqz v7, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    goto :goto_1

    :cond_6
    move-wide v8, v3

    :goto_1
    if-eqz v7, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    :cond_7
    move-wide v15, v3

    move-object v3, v14

    move-object v4, v11

    move-wide v7, v8

    move-wide v9, v15

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/common/api/internal/k0;-><init>(Lcom/google/android/gms/common/api/internal/f;ILcom/google/android/gms/common/api/internal/a;JJ)V

    move-object v4, v14

    :goto_2
    if-eqz v4, :cond_8

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lcom/google/android/gms/common/api/internal/a0;

    invoke-direct {v5, v13}, Lcom/google/android/gms/common/api/internal/a0;-><init>(Lcom/google/android/gms/internal/base/zaq;)V

    invoke-virtual {v3, v5, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    :cond_8
    new-instance v3, Lcom/google/android/gms/common/api/internal/s0;

    move/from16 v4, p1

    invoke-direct {v3, v4, v1, v2, v12}, Lcom/google/android/gms/common/api/internal/s0;-><init>(ILcom/google/android/gms/common/api/internal/t;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/common/api/internal/r;)V

    new-instance v1, Lcom/google/android/gms/common/api/internal/m0;

    iget-object v4, v11, Lcom/google/android/gms/common/api/internal/f;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    invoke-direct {v1, v3, v4, v0}, Lcom/google/android/gms/common/api/internal/m0;-><init>(Lcom/google/android/gms/common/api/internal/j0;ILcom/google/android/gms/common/api/i;)V

    const/4 v3, 0x4

    invoke-virtual {v13, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v13, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    return-object v1
.end method

.method public asGoogleApiClient()Lcom/google/android/gms/common/api/l;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zai:Lcom/google/android/gms/common/api/l;

    return-object v0
.end method

.method public createClientSettingsBuilder()Lcom/google/android/gms/common/internal/g;
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/internal/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/common/internal/g;->a:Landroid/accounts/Account;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/common/internal/g;->b:Lq/g;

    if-nez v2, :cond_0

    new-instance v2, Lq/g;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lq/g;-><init>(I)V

    iput-object v2, v0, Lcom/google/android/gms/common/internal/g;->b:Lq/g;

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/common/internal/g;->b:Lq/g;

    invoke-virtual {v2, v1}, Lq/g;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->zab:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/internal/g;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->zab:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/common/internal/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public disconnectService()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zaa:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/android/gms/common/api/internal/y;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/i;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/internal/y;-><init>(Lcom/google/android/gms/common/api/internal/a;)V

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/y;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public doBestEffortWrite(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/d;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public doBestEffortWrite(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/t;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/i;->a(ILcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doRead(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/d;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public doRead(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/t;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/i;->a(ILcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doRegisterEventListener(Lcom/google/android/gms/common/api/internal/o;Lcom/google/android/gms/common/api/internal/u;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/o;",
            "U:",
            "Lcom/google/android/gms/common/api/internal/u;",
            ">(TT;TU;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public doRegisterEventListener(Lcom/google/android/gms/common/api/internal/p;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/p;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/k;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/k;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/i;->doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/k;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public doUnregisterEventListener(Lcom/google/android/gms/common/api/internal/k;I)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/k;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Listener key cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public doWrite(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/d;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/d;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 p1, 0x0

    .line 1
    throw p1
.end method

.method public doWrite(Lcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/d;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/t;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/common/api/i;->a(ILcom/google/android/gms/common/api/internal/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final getApiKey()Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/internal/a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zaf:Lcom/google/android/gms/common/api/internal/a;

    return-object v0
.end method

.method public getApiOptions()Lcom/google/android/gms/common/api/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/b;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zae:Lcom/google/android/gms/common/api/b;

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zab:Landroid/content/Context;

    return-object v0
.end method

.method public getContextAttributionTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getContextFeatureId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zac:Ljava/lang/String;

    return-object v0
.end method

.method public getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zag:Landroid/os/Looper;

    return-object v0
.end method

.method public registerListener(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/common/api/internal/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/internal/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zag:Landroid/os/Looper;

    if-eqz p1, :cond_1

    const-string v1, "Looper must not be null"

    invoke-static {v0, v1}, Lf6/a;->y(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance v1, Lcom/google/android/gms/common/api/internal/l;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/common/zzi;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/common/zzi;-><init>(Landroid/os/Looper;)V

    iput-object p1, v1, Lcom/google/android/gms/common/api/internal/l;->a:Ljava/lang/Object;

    invoke-static {p2}, Lf6/a;->u(Ljava/lang/String;)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Listener type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Listener must not be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zaa()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/i;->zah:I

    return v0
.end method

.method public final zab(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/d0;)Lcom/google/android/gms/common/api/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/api/internal/d0;",
            ")",
            "Lcom/google/android/gms/common/api/d;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/i;->createClientSettingsBuilder()Lcom/google/android/gms/common/internal/g;

    move-result-object v0

    new-instance v4, Lcom/google/android/gms/common/internal/h;

    iget-object v1, v0, Lcom/google/android/gms/common/internal/g;->a:Landroid/accounts/Account;

    iget-object v2, v0, Lcom/google/android/gms/common/internal/g;->b:Lq/g;

    iget-object v3, v0, Lcom/google/android/gms/common/internal/g;->c:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/g;->d:Ljava/lang/String;

    invoke-direct {v4, v1, v2, v3, v0}, Lcom/google/android/gms/common/internal/h;-><init>(Landroid/accounts/Account;Lq/g;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->zad:Lcom/google/android/gms/common/api/f;

    iget-object v1, v0, Lcom/google/android/gms/common/api/f;->a:Lcom/google/android/gms/common/api/a;

    invoke-static {v1}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/common/api/i;->zab:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/common/api/i;->zae:Lcom/google/android/gms/common/api/b;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/common/api/a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/j;Lcom/google/android/gms/common/api/k;)Lcom/google/android/gms/common/api/d;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/i;->getContextAttributionTag()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/common/internal/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/internal/f;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/f;->setAttributionTag(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_2

    instance-of p2, p1, Lcom/google/android/gms/common/api/internal/m;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/common/api/internal/m;

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final zac(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/o0;
    .locals 6

    new-instance v0, Lcom/google/android/gms/common/api/internal/o0;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/i;->createClientSettingsBuilder()Lcom/google/android/gms/common/internal/g;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/common/internal/h;

    iget-object v3, v1, Lcom/google/android/gms/common/internal/g;->a:Landroid/accounts/Account;

    iget-object v4, v1, Lcom/google/android/gms/common/internal/g;->b:Lq/g;

    iget-object v5, v1, Lcom/google/android/gms/common/internal/g;->c:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/common/internal/g;->d:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/google/android/gms/common/internal/h;-><init>(Landroid/accounts/Account;Lq/g;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, v2}, Lcom/google/android/gms/common/api/internal/o0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/h;)V

    return-object v0
.end method
