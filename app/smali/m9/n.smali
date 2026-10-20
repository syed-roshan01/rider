.class public final Lm9/n;
.super Lm9/h1;


# instance fields
.field public final e:Lm9/l;


# direct methods
.method public constructor <init>(Lm9/l;)V
    .locals 0

    invoke-direct {p0}, Lr9/j;-><init>()V

    iput-object p1, p0, Lm9/n;->e:Lm9/l;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/n;->n(Ljava/lang/Throwable;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0}, Lm9/j1;->m()Lm9/p1;

    move-result-object p1

    iget-object v0, p0, Lm9/n;->e:Lm9/l;

    invoke-virtual {v0, p1}, Lm9/l;->r(Lm9/p1;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0}, Lm9/l;->z()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lm9/l;->d:Lu8/e;

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lr9/h;

    :goto_0
    sget-object v2, Lr9/h;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lr9/a;->d:Li3/u;

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_1
    invoke-virtual {v2, v1, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_1
    invoke-virtual {v0, p1}, Lm9/l;->l(Ljava/lang/Throwable;)Z

    invoke-virtual {v0}, Lm9/l;->z()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v0}, Lm9/l;->p()V

    :cond_5
    :goto_2
    return-void

    :cond_6
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v3, :cond_4

    goto :goto_0
.end method
