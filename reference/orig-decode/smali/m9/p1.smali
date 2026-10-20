.class public Lm9/p1;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/f1;
.implements Lm9/q;
.implements Lm9/w1;


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state"

    const-class v1, Lm9/p1;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm9/p1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    sget-object p1, Lm9/e0;->j:Lm9/q0;

    goto :goto_0

    :cond_0
    sget-object p1, Lm9/e0;->i:Lm9/q0;

    :goto_0
    iput-object p1, p0, Lm9/p1;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static a0(Lr9/j;)Lm9/p;
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lr9/j;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lr9/j;->h()Lr9/j;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v1, Lr9/j;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr9/j;

    :goto_1
    invoke-virtual {p0}, Lr9/j;->l()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr9/j;

    goto :goto_1

    :cond_1
    move-object p0, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lr9/j;->k()Lr9/j;

    move-result-object p0

    invoke-virtual {p0}, Lr9/j;->l()Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Lm9/p;

    if-eqz v0, :cond_3

    check-cast p0, Lm9/p;

    return-object p0

    :cond_3
    instance-of v0, p0, Lm9/t1;

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0
.end method

.method public static g0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Lm9/m1;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p0, Lm9/m1;

    invoke-virtual {p0}, Lm9/m1;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm9/m1;->e()Z

    move-result p0

    if-eqz p0, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lm9/b1;

    if-eqz v0, :cond_3

    check-cast p0, Lm9/b1;

    invoke-interface {p0}, Lm9/b1;->b()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p0, p0, Lm9/u;

    if-eqz p0, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method


# virtual methods
.method public A(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm9/p1;->z(Ljava/lang/Object;)Z

    return-void
.end method

.method public final B(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lm9/p1;->V()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    sget-object v2, Lm9/p1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/o;

    if-eqz v2, :cond_4

    sget-object v3, Lm9/u1;->a:Lm9/u1;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lm9/o;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public D(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lm9/p1;->z(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lm9/p1;->K()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final E(Lm9/b1;Ljava/lang/Object;)V
    .locals 7

    sget-object v0, Lm9/p1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/o;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lm9/o0;->a()V

    sget-object v1, Lm9/u1;->a:Lm9/u1;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    instance-of v0, p2, Lm9/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lm9/u;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Lm9/u;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    instance-of v0, p1, Lm9/j1;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Lm9/j1;

    invoke-virtual {v0, p2}, Lm9/j1;->n(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    new-instance v0, Landroidx/fragment/app/a0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lm9/p1;->R(Landroidx/fragment/app/a0;)V

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Lm9/b1;->f()Lm9/t1;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lr9/j;->j()Ljava/lang/Object;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr9/j;

    :goto_2
    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v0, Lm9/j1;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Lm9/j1;

    :try_start_1
    invoke-virtual {v4, p2}, Lm9/j1;->n(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    if-eqz v1, :cond_4

    invoke-static {v1, v5}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    new-instance v1, Landroidx/fragment/app/a0;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lr9/j;->k()Lr9/j;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1}, Lm9/p1;->R(Landroidx/fragment/app/a0;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final F(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 4

    instance-of v0, p1, Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Throwable;

    goto :goto_1

    :cond_0
    check-cast p1, Lm9/w1;

    check-cast p1, Lm9/p1;

    invoke-virtual {p1}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/m1;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lm9/m1;

    invoke-virtual {v1}, Lm9/m1;->c()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lm9/u;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lm9/u;

    iget-object v1, v1, Lm9/u;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lm9/b1;

    if-nez v1, :cond_5

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_3
    if-nez v2, :cond_4

    new-instance v2, Lm9/g1;

    invoke-static {v0}, Lm9/p1;->g0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p1}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    :cond_4
    move-object p1, v2

    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final G(Lm9/m1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lm9/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm9/u;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lm9/u;->a:Ljava/lang/Throwable;

    :cond_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lm9/m1;->d()Z

    invoke-virtual {p1, v1}, Lm9/m1;->g(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lm9/p1;->J(Lm9/m1;Ljava/util/ArrayList;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-gt v4, v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/util/IdentityHashMap;

    invoke-direct {v5, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Throwable;

    if-eq v5, v2, :cond_3

    if-eq v5, v2, :cond_3

    instance-of v6, v5, Ljava/util/concurrent/CancellationException;

    if-nez v6, :cond_3

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v2, v5}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    :goto_2
    monitor-exit p1

    const/4 v0, 0x0

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    new-instance p2, Lm9/u;

    invoke-direct {p2, v2, v0}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    :goto_3
    if-eqz v2, :cond_8

    invoke-virtual {p0, v2}, Lm9/p1;->B(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0, v2}, Lm9/p1;->Q(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, Lm9/u;

    sget-object v2, Lm9/u;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    :cond_8
    invoke-virtual {p0, p2}, Lm9/p1;->c0(Ljava/lang/Object;)V

    sget-object v0, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Lm9/b1;

    if-eqz v1, :cond_9

    new-instance v1, Lm9/c1;

    move-object v2, p2

    check-cast v2, Lm9/b1;

    invoke-direct {v1, v2}, Lm9/c1;-><init>(Lm9/b1;)V

    goto :goto_4

    :cond_9
    move-object v1, p2

    :cond_a
    :goto_4
    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_a

    :goto_5
    invoke-virtual {p0, p1, p2}, Lm9/p1;->E(Lm9/b1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final H()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/m1;

    const/4 v2, 0x0

    const-string v3, "Job is still new or active: "

    if-eqz v1, :cond_3

    check-cast v0, Lm9/m1;

    invoke-virtual {v0}, Lm9/m1;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v2, :cond_6

    new-instance v2, Lm9/g1;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lm9/p1;->C()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {v2, v1, v0, p0}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v1, v0, Lm9/b1;

    if-nez v1, :cond_7

    instance-of v1, v0, Lm9/u;

    if-eqz v1, :cond_5

    check-cast v0, Lm9/u;

    iget-object v0, v0, Lm9/u;->a:Ljava/lang/Throwable;

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_4
    if-nez v2, :cond_6

    new-instance v1, Lm9/g1;

    invoke-virtual {p0}, Lm9/p1;->C()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    move-object v2, v1

    goto :goto_0

    :cond_5
    new-instance v0, Lm9/g1;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    move-object v2, v0

    :cond_6
    :goto_0
    return-object v2

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/b1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    instance-of v1, v0, Lm9/u;

    if-nez v1, :cond_0

    invoke-static {v0}, Lm9/e0;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Lm9/u;

    iget-object v0, v0, Lm9/u;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J(Lm9/m1;Ljava/util/ArrayList;)Ljava/lang/Throwable;
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lm9/m1;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lm9/g1;

    invoke-virtual {p0}, Lm9/p1;->C()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    instance-of v0, p1, Lm9/d2;

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    if-eq v2, p1, :cond_5

    instance-of v2, v2, Lm9/d2;

    if-eqz v2, :cond_5

    move-object v1, v0

    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_7

    return-object v1

    :cond_7
    return-object p1
.end method

.method public K()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public L()Z
    .locals 0

    instance-of p0, p0, Lm9/s;

    return p0
.end method

.method public final M(Lm9/b1;)Lm9/t1;
    .locals 3

    invoke-interface {p1}, Lm9/b1;->f()Lm9/t1;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lm9/q0;

    if-eqz v0, :cond_0

    new-instance v0, Lm9/t1;

    invoke-direct {v0}, Lr9/j;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lm9/j1;

    if-eqz v0, :cond_1

    check-cast p1, Lm9/j1;

    invoke-virtual {p0, p1}, Lm9/p1;->e0(Lm9/j1;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State should have list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final N()Ljava/lang/Object;
    .locals 2

    :goto_0
    sget-object v0, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr9/p;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lr9/p;

    invoke-virtual {v0, p0}, Lr9/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ld7/a;->A(Lu8/j;Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public R(Landroidx/fragment/app/a0;)V
    .locals 0

    throw p1
.end method

.method public final S(Lm9/f1;)V
    .locals 5

    sget-object v0, Lm9/u1;->a:Lm9/u1;

    sget-object v1, Lm9/p1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-nez p1, :cond_0

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    check-cast p1, Lm9/p1;

    :goto_0
    invoke-virtual {p1}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Lm9/p1;->f0(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lm9/p;

    invoke-direct {v2, p0}, Lm9/p;-><init>(Lm9/p1;)V

    const/4 v4, 0x2

    invoke-static {p1, v3, v2, v4}, Lz6/a;->N(Lm9/f1;ZLm9/j1;I)Lm9/o0;

    move-result-object p1

    check-cast p1, Lm9/o;

    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lm9/b1;

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lm9/o0;->a()V

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final U(ZZLc9/c;)Lm9/o0;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p3, Lm9/h1;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lm9/h1;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    new-instance v1, Lm9/e1;

    invoke-direct {v1, p3}, Lm9/e1;-><init>(Lc9/c;)V

    goto :goto_2

    :cond_1
    instance-of v1, p3, Lm9/j1;

    if-eqz v1, :cond_2

    move-object v1, p3

    check-cast v1, Lm9/j1;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lm9/p0;

    const/4 v2, 0x1

    invoke-direct {v1, p3, v2}, Lm9/p0;-><init>(Ljava/lang/Object;I)V

    :cond_4
    :goto_2
    iput-object p0, v1, Lm9/j1;->d:Lm9/p1;

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lm9/q0;

    if-eqz v3, :cond_c

    move-object v3, v2

    check-cast v3, Lm9/q0;

    iget-boolean v4, v3, Lm9/q0;->a:Z

    if-eqz v4, :cond_8

    sget-object v4, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v4, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    return-object v1

    :cond_7
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v2, :cond_6

    goto :goto_3

    :cond_8
    new-instance v2, Lm9/t1;

    invoke-direct {v2}, Lr9/j;-><init>()V

    iget-boolean v4, v3, Lm9/q0;->a:Z

    if-eqz v4, :cond_9

    move-object v4, v2

    goto :goto_4

    :cond_9
    new-instance v4, Lm9/a1;

    invoke-direct {v4, v2}, Lm9/a1;-><init>(Lm9/t1;)V

    :cond_a
    :goto_4
    sget-object v2, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v3, :cond_a

    goto :goto_3

    :cond_c
    instance-of v3, v2, Lm9/b1;

    if-eqz v3, :cond_15

    move-object v3, v2

    check-cast v3, Lm9/b1;

    invoke-interface {v3}, Lm9/b1;->f()Lm9/t1;

    move-result-object v3

    if-nez v3, :cond_d

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm9/j1;

    invoke-virtual {p0, v2}, Lm9/p1;->e0(Lm9/j1;)V

    goto :goto_3

    :cond_d
    sget-object v4, Lm9/u1;->a:Lm9/u1;

    if-eqz p1, :cond_12

    instance-of v5, v2, Lm9/m1;

    if-eqz v5, :cond_12

    monitor-enter v2

    :try_start_0
    move-object v5, v2

    check-cast v5, Lm9/m1;

    invoke-virtual {v5}, Lm9/m1;->c()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_e

    instance-of v6, p3, Lm9/p;

    if-eqz v6, :cond_11

    move-object v6, v2

    check-cast v6, Lm9/m1;

    invoke-virtual {v6}, Lm9/m1;->e()Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_e
    :goto_5
    invoke-virtual {p0, v2, v3, v1}, Lm9/p1;->s(Ljava/lang/Object;Lm9/t1;Lm9/j1;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_f

    monitor-exit v2

    goto/16 :goto_3

    :cond_f
    if-nez v5, :cond_10

    monitor-exit v2

    return-object v1

    :cond_10
    move-object v4, v1

    :cond_11
    monitor-exit v2

    goto :goto_7

    :goto_6
    monitor-exit v2

    throw p1

    :cond_12
    move-object v5, v0

    :goto_7
    if-eqz v5, :cond_14

    if-eqz p2, :cond_13

    invoke-interface {p3, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    return-object v4

    :cond_14
    invoke-virtual {p0, v2, v3, v1}, Lm9/p1;->s(Ljava/lang/Object;Lm9/t1;Lm9/j1;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v1

    :cond_15
    if-eqz p2, :cond_18

    instance-of p1, v2, Lm9/u;

    if-eqz p1, :cond_16

    check-cast v2, Lm9/u;

    goto :goto_8

    :cond_16
    move-object v2, v0

    :goto_8
    if-eqz v2, :cond_17

    iget-object v0, v2, Lm9/u;->a:Ljava/lang/Throwable;

    :cond_17
    invoke-interface {p3, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    sget-object p1, Lm9/u1;->a:Lm9/u1;

    return-object p1
.end method

.method public V()Z
    .locals 0

    instance-of p0, p0, Lm9/g;

    return p0
.end method

.method public final W(Lu8/e;)Ljava/lang/Object;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/b1;

    sget-object v2, Lq8/l;->a:Lq8/l;

    if-nez v1, :cond_1

    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object p1

    invoke-static {p1}, Lh6/g;->S(Lu8/j;)V

    return-object v2

    :cond_1
    invoke-virtual {p0, v0}, Lm9/p1;->f0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    new-instance v0, Lm9/l;

    invoke-static {p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p1, Lm9/p0;

    const/4 v3, 0x3

    invoke-direct {p1, v0, v3}, Lm9/p0;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v1, p1}, Lm9/p1;->U(ZZLc9/c;)Lm9/o0;

    move-result-object p1

    new-instance v3, Lm9/i;

    invoke-direct {v3, p1, v1}, Lm9/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v3}, Lm9/l;->v(Lc9/c;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lv8/a;->a:Lv8/a;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object p1

    :cond_3
    return-object v2
.end method

.method public final X(Ljava/lang/Object;)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lm9/p1;->h0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm9/e0;->d:Li3/u;

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, Lm9/e0;->e:Li3/u;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    sget-object v1, Lm9/e0;->f:Li3/u;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lm9/p1;->t(Ljava/lang/Object;)V

    return v2
.end method

.method public final Y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lm9/p1;->h0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm9/e0;->d:Li3/u;

    if-eq v0, v1, :cond_1

    sget-object v1, Lm9/e0;->f:Li3/u;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Job "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    instance-of v2, p1, Lm9/u;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    check-cast p1, Lm9/u;

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_3

    iget-object v3, p1, Lm9/u;->a:Ljava/lang/Throwable;

    :cond_3
    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public Z()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Lm9/g1;

    invoke-virtual {p0}, Lm9/p1;->C()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lm9/g1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm9/f1;)V

    :cond_0
    invoke-virtual {p0, p1}, Lm9/p1;->A(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/b1;

    if-eqz v1, :cond_0

    check-cast v0, Lm9/b1;

    invoke-interface {v0}, Lm9/b1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b0(Lm9/t1;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lr9/j;->j()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr9/j;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lm9/h1;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm9/j1;

    :try_start_0
    invoke-virtual {v2, p2}, Lm9/j1;->n(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Landroidx/fragment/app/a0;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception in completion handler "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lr9/j;->k()Lr9/j;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lm9/p1;->R(Landroidx/fragment/app/a0;)V

    :cond_3
    invoke-virtual {p0, p2}, Lm9/p1;->B(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public c0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public d0()V
    .locals 0

    return-void
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e0(Lm9/j1;)V
    .locals 3

    new-instance v0, Lm9/t1;

    invoke-direct {v0}, Lr9/j;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lr9/j;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lr9/j;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Lr9/j;->j()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Lr9/j;->i(Lr9/j;)V

    :goto_1
    invoke-virtual {p1}, Lr9/j;->k()Lr9/j;

    move-result-object v2

    :cond_1
    sget-object v0, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    :goto_2
    return-void

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_0
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->D(Lu8/h;Lu8/i;)Lu8/h;

    move-result-object p1

    return-object p1
.end method

.method public final f0(Ljava/lang/Object;)I
    .locals 5

    instance-of v0, p1, Lm9/q0;

    const/4 v1, 0x1

    const/4 v2, -0x1

    sget-object v3, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lm9/q0;

    iget-boolean v0, v0, Lm9/q0;->a:Z

    if-eqz v0, :cond_0

    return v4

    :cond_0
    sget-object v0, Lm9/e0;->j:Lm9/q0;

    :cond_1
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lm9/p1;->d0()V

    return v1

    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_1

    return v2

    :cond_3
    instance-of v0, p1, Lm9/a1;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lm9/a1;

    iget-object v0, v0, Lm9/a1;->a:Lm9/t1;

    :cond_4
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0}, Lm9/p1;->d0()V

    return v1

    :cond_5
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_4

    return v2

    :cond_6
    return v4
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm9/p1;->I()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Lu8/i;
    .locals 1

    sget-object v0, Lm9/a0;->b:Lm9/a0;

    return-object v0
.end method

.method public final h0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lm9/b1;

    if-nez v0, :cond_0

    sget-object p1, Lm9/e0;->d:Li3/u;

    return-object p1

    :cond_0
    instance-of v0, p1, Lm9/q0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lm9/j1;

    if-eqz v0, :cond_5

    :cond_1
    instance-of v0, p1, Lm9/p;

    if-nez v0, :cond_5

    instance-of v0, p2, Lm9/u;

    if-nez v0, :cond_5

    move-object v0, p1

    check-cast v0, Lm9/b1;

    instance-of p1, p2, Lm9/b1;

    if-eqz p1, :cond_2

    new-instance p1, Lm9/c1;

    move-object v1, p2

    check-cast v1, Lm9/b1;

    invoke-direct {p1, v1}, Lm9/c1;-><init>(Lm9/b1;)V

    move-object v1, p1

    goto :goto_0

    :cond_2
    move-object v1, p2

    :cond_3
    :goto_0
    sget-object p1, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, p2}, Lm9/p1;->c0(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Lm9/p1;->E(Lm9/b1;Ljava/lang/Object;)V

    return-object p2

    :cond_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_3

    sget-object p1, Lm9/e0;->f:Li3/u;

    return-object p1

    :cond_5
    check-cast p1, Lm9/b1;

    invoke-virtual {p0, p1}, Lm9/p1;->M(Lm9/b1;)Lm9/t1;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object p1, Lm9/e0;->f:Li3/u;

    goto/16 :goto_7

    :cond_6
    instance-of v1, p1, Lm9/m1;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    move-object v1, p1

    check-cast v1, Lm9/m1;

    goto :goto_1

    :cond_7
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_8

    new-instance v1, Lm9/m1;

    invoke-direct {v1, v0, v2}, Lm9/m1;-><init>(Lm9/t1;Ljava/lang/Throwable;)V

    :cond_8
    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Lm9/m1;->e()Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object p1, Lm9/e0;->d:Li3/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto/16 :goto_7

    :cond_9
    :try_start_1
    sget-object v3, Lm9/m1;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    if-eq v1, p1, :cond_c

    sget-object v3, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_a
    invoke-virtual {v3, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, p1, :cond_a

    sget-object p1, Lm9/e0;->f:Li3/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto/16 :goto_7

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_c
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Lm9/m1;->d()Z

    move-result v3

    instance-of v5, p2, Lm9/u;

    if-eqz v5, :cond_d

    move-object v5, p2

    check-cast v5, Lm9/u;

    goto :goto_3

    :cond_d
    move-object v5, v2

    :goto_3
    if-eqz v5, :cond_e

    iget-object v5, v5, Lm9/u;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Lm9/m1;->a(Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v1}, Lm9/m1;->c()Ljava/lang/Throwable;

    move-result-object v5

    xor-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_f

    goto :goto_4

    :cond_f
    move-object v5, v2

    :goto_4
    monitor-exit v1

    if-eqz v5, :cond_10

    invoke-virtual {p0, v0, v5}, Lm9/p1;->b0(Lm9/t1;Ljava/lang/Throwable;)V

    :cond_10
    instance-of v0, p1, Lm9/p;

    if-eqz v0, :cond_11

    move-object v0, p1

    check-cast v0, Lm9/p;

    goto :goto_5

    :cond_11
    move-object v0, v2

    :goto_5
    if-nez v0, :cond_12

    invoke-interface {p1}, Lm9/b1;->f()Lm9/t1;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-static {p1}, Lm9/p1;->a0(Lr9/j;)Lm9/p;

    move-result-object v2

    goto :goto_6

    :cond_12
    move-object v2, v0

    :cond_13
    :goto_6
    if-eqz v2, :cond_16

    :cond_14
    new-instance p1, Lm9/l1;

    invoke-direct {p1, p0, v1, v2, p2}, Lm9/l1;-><init>(Lm9/p1;Lm9/m1;Lm9/p;Ljava/lang/Object;)V

    iget-object v0, v2, Lm9/p;->e:Lm9/q;

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v4}, Lz6/a;->N(Lm9/f1;ZLm9/j1;I)Lm9/o0;

    move-result-object p1

    sget-object v0, Lm9/u1;->a:Lm9/u1;

    if-eq p1, v0, :cond_15

    sget-object p1, Lm9/e0;->e:Li3/u;

    goto :goto_7

    :cond_15
    invoke-static {v2}, Lm9/p1;->a0(Lr9/j;)Lm9/p;

    move-result-object v2

    if-nez v2, :cond_14

    :cond_16
    invoke-virtual {p0, v1, p2}, Lm9/p1;->G(Lm9/m1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1

    :goto_8
    monitor-exit v1

    throw p1
.end method

.method public final s(Ljava/lang/Object;Lm9/t1;Lm9/j1;)Z
    .locals 6

    new-instance v0, Lm9/n1;

    invoke-direct {v0, p3, p0, p1}, Lm9/n1;-><init>(Lr9/j;Lm9/p1;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lr9/j;->h()Lr9/j;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object v1, Lr9/j;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr9/j;

    :goto_1
    invoke-virtual {p1}, Lr9/j;->l()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr9/j;

    goto :goto_1

    :cond_1
    :goto_2
    sget-object v1, Lr9/j;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lr9/j;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, v0, Lm9/n1;->c:Lr9/j;

    :cond_2
    invoke-virtual {v1, p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v0, p1}, Lr9/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move p1, v5

    goto :goto_3

    :cond_3
    move p1, v4

    goto :goto_3

    :cond_4
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p2, :cond_2

    move p1, v3

    :goto_3
    if-eq p1, v5, :cond_5

    if-eq p1, v4, :cond_6

    goto :goto_0

    :cond_5
    move v3, v5

    :cond_6
    return v3
.end method

.method public t(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lm9/p1;->Z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lm9/p1;->g0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lm9/e0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->V(Lu8/h;Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm9/p1;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public final y(Lu8/e;)Ljava/lang/Object;
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/b1;

    if-nez v1, :cond_2

    instance-of p1, v0, Lm9/u;

    if-nez p1, :cond_1

    invoke-static {v0}, Lm9/e0;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, Lm9/u;

    iget-object p1, v0, Lm9/u;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-virtual {p0, v0}, Lm9/p1;->f0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    new-instance v0, Lm9/k1;

    invoke-static {p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lm9/k1;-><init>(Lu8/e;Lm9/p1;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p1, Lm9/p0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Lm9/p0;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2, p1}, Lm9/p1;->U(ZZLc9/c;)Lm9/o0;

    move-result-object p1

    new-instance v1, Lm9/i;

    invoke-direct {v1, p1, v2}, Lm9/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lm9/l;->v(Lc9/c;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public final z(Ljava/lang/Object;)Z
    .locals 9

    sget-object v0, Lm9/e0;->d:Li3/u;

    invoke-virtual {p0}, Lm9/p1;->L()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    :cond_0
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/b1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lm9/m1;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lm9/m1;

    invoke-virtual {v1}, Lm9/m1;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lm9/u;

    invoke-virtual {p0, p1}, Lm9/p1;->F(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v1, v4, v2}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0, v1}, Lm9/p1;->h0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm9/e0;->f:Li3/u;

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lm9/e0;->d:Li3/u;

    :goto_1
    sget-object v1, Lm9/e0;->e:Li3/u;

    if-ne v0, v1, :cond_3

    return v3

    :cond_3
    sget-object v1, Lm9/e0;->d:Li3/u;

    if-ne v0, v1, :cond_11

    const/4 v0, 0x0

    move-object v1, v0

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lm9/m1;

    if-eqz v5, :cond_9

    monitor-enter v4

    :try_start_0
    move-object v5, v4

    check-cast v5, Lm9/m1;

    sget-object v6, Lm9/m1;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lm9/e0;->h:Li3/u;

    if-ne v5, v6, :cond_5

    sget-object p1, Lm9/e0;->g:Li3/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    :goto_3
    move-object v0, p1

    goto/16 :goto_6

    :cond_5
    :try_start_1
    move-object v5, v4

    check-cast v5, Lm9/m1;

    invoke-virtual {v5}, Lm9/m1;->d()Z

    move-result v5

    if-nez v1, :cond_6

    invoke-virtual {p0, p1}, Lm9/p1;->F(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_4
    move-object p1, v4

    check-cast p1, Lm9/m1;

    invoke-virtual {p1, v1}, Lm9/m1;->a(Ljava/lang/Throwable;)V

    move-object p1, v4

    check-cast p1, Lm9/m1;

    invoke-virtual {p1}, Lm9/m1;->c()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v5, 0x1

    if-eqz v1, :cond_7

    move-object v0, p1

    :cond_7
    monitor-exit v4

    if-eqz v0, :cond_8

    check-cast v4, Lm9/m1;

    iget-object p1, v4, Lm9/m1;->a:Lm9/t1;

    invoke-virtual {p0, p1, v0}, Lm9/p1;->b0(Lm9/t1;Ljava/lang/Throwable;)V

    :cond_8
    sget-object p1, Lm9/e0;->d:Li3/u;

    goto :goto_3

    :goto_5
    monitor-exit v4

    throw p1

    :cond_9
    instance-of v5, v4, Lm9/b1;

    if-eqz v5, :cond_10

    if-nez v1, :cond_a

    invoke-virtual {p0, p1}, Lm9/p1;->F(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_a
    move-object v5, v4

    check-cast v5, Lm9/b1;

    invoke-interface {v5}, Lm9/b1;->b()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {p0, v5}, Lm9/p1;->M(Lm9/b1;)Lm9/t1;

    move-result-object v6

    if-nez v6, :cond_b

    goto :goto_2

    :cond_b
    new-instance v7, Lm9/m1;

    invoke-direct {v7, v6, v1}, Lm9/m1;-><init>(Lm9/t1;Ljava/lang/Throwable;)V

    :cond_c
    sget-object v4, Lm9/p1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v4, p0, v5, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {p0, v6, v1}, Lm9/p1;->b0(Lm9/t1;Ljava/lang/Throwable;)V

    sget-object p1, Lm9/e0;->d:Li3/u;

    goto :goto_3

    :cond_d
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v5, :cond_c

    goto/16 :goto_2

    :cond_e
    new-instance v5, Lm9/u;

    invoke-direct {v5, v1, v2}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v4, v5}, Lm9/p1;->h0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lm9/e0;->d:Li3/u;

    if-eq v5, v6, :cond_f

    sget-object v4, Lm9/e0;->f:Li3/u;

    if-eq v5, v4, :cond_4

    move-object v0, v5

    goto :goto_6

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot happen in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    sget-object p1, Lm9/e0;->g:Li3/u;

    goto/16 :goto_3

    :cond_11
    :goto_6
    sget-object p1, Lm9/e0;->d:Li3/u;

    if-ne v0, p1, :cond_12

    :goto_7
    move v2, v3

    goto :goto_8

    :cond_12
    sget-object p1, Lm9/e0;->e:Li3/u;

    if-ne v0, p1, :cond_13

    goto :goto_7

    :cond_13
    sget-object p1, Lm9/e0;->g:Li3/u;

    if-ne v0, p1, :cond_14

    goto :goto_8

    :cond_14
    invoke-virtual {p0, v0}, Lm9/p1;->t(Ljava/lang/Object;)V

    goto :goto_7

    :goto_8
    return v2
.end method
