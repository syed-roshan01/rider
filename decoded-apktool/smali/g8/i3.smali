.class public final Lg8/i3;
.super Le8/j0;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Ljava/lang/String;

.field public final c:Lg8/e3;

.field public final synthetic d:Lg8/l3;


# direct methods
.method public constructor <init>(Lg8/l3;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/i3;->d:Lg8/l3;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lg8/l3;->h0:Lg8/t2;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lg8/e3;

    invoke-direct {p1, p0}, Lg8/e3;-><init>(Lg8/i3;)V

    iput-object p1, p0, Lg8/i3;->c:Lg8/e3;

    const-string p1, "authority"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/i3;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/i3;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final m(Le8/p1;Le8/h;)Le8/k;
    .locals 6

    iget-object v0, p0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lg8/l3;->h0:Lg8/t2;

    if-eq v1, v2, :cond_0

    invoke-virtual {p0, p1, p2}, Lg8/i3;->s(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lg8/i3;->d:Lg8/l3;

    iget-object v3, v1, Lg8/l3;->m:Le8/h2;

    new-instance v4, Lg8/f3;

    const/4 v5, 0x2

    invoke-direct {v4, p0, v5}, Lg8/f3;-><init>(Lg8/i3;I)V

    invoke-virtual {v3, v4}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v2, :cond_1

    invoke-virtual {p0, p1, p2}, Lg8/i3;->s(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, v1, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lg8/g3;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :cond_2
    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object v0

    new-instance v2, Lg8/h3;

    invoke-direct {v2, p0, v0, p1, p2}, Lg8/h3;-><init>(Lg8/i3;Le8/b0;Le8/p1;Le8/h;)V

    new-instance p1, Lg8/x1;

    const/16 p2, 0x16

    invoke-direct {p1, p2, p0, v2}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, v1, Lg8/l3;->m:Le8/h2;

    invoke-virtual {p2, p1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-object v2
.end method

.method public final s(Le8/p1;Le8/h;)Le8/k;
    .locals 7

    iget-object v0, p0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Le8/o0;

    iget-object v3, p0, Lg8/i3;->c:Lg8/e3;

    if-nez v2, :cond_0

    invoke-virtual {v3, p1, p2}, Lg8/e3;->m(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v2, Lg8/r3;

    if-eqz v0, :cond_4

    check-cast v2, Lg8/r3;

    iget-object v0, v2, Lg8/r3;->b:Lg8/s3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Le8/p1;->b:Ljava/lang/String;

    iget-object v2, v0, Lg8/s3;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/q3;

    if-nez v1, :cond_1

    iget-object v1, v0, Lg8/s3;->c:Ljava/util/Map;

    iget-object v2, p1, Le8/p1;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/q3;

    :cond_1
    if-nez v1, :cond_2

    iget-object v1, v0, Lg8/s3;->a:Lg8/q3;

    :cond_2
    if-eqz v1, :cond_3

    sget-object v0, Lg8/q3;->g:Lv6/d;

    invoke-virtual {p2, v0, v1}, Le8/h;->c(Lv6/d;Ljava/lang/Object;)Le8/h;

    move-result-object p2

    :cond_3
    invoke-virtual {v3, p1, p2}, Lg8/e3;->m(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance v0, Lg8/z2;

    iget-object v1, p0, Lg8/i3;->d:Lg8/l3;

    iget-object v4, v1, Lg8/l3;->h:Ljava/util/concurrent/Executor;

    move-object v1, v0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lg8/z2;-><init>(Le8/o0;Lg8/e3;Ljava/util/concurrent/Executor;Le8/p1;Le8/h;)V

    return-object v0
.end method

.method public final t(Le8/o0;)V
    .locals 2

    iget-object v0, p0, Lg8/i3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/o0;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object p1, Lg8/l3;->h0:Lg8/t2;

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lg8/i3;->d:Lg8/l3;

    iget-object p1, p1, Lg8/l3;->A:Ljava/util/Collection;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/h3;

    invoke-virtual {v0}, Lg8/h3;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method
