.class public final Lt/a1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lu9/a;

.field public b:Ljava/lang/Object;

.field public c:Lt/b1;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:I

.field public final synthetic n:Lt/b1;

.field public final synthetic o:Lc9/c;


# direct methods
.method public constructor <init>(ILt/b1;Lc9/c;Lu8/e;)V
    .locals 0

    iput p1, p0, Lt/a1;->f:I

    iput-object p2, p0, Lt/a1;->n:Lt/b1;

    iput-object p3, p0, Lt/a1;->o:Lc9/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    new-instance v0, Lt/a1;

    iget-object v1, p0, Lt/a1;->o:Lc9/c;

    iget v2, p0, Lt/a1;->f:I

    iget-object v3, p0, Lt/a1;->n:Lt/b1;

    invoke-direct {v0, v2, v3, v1, p2}, Lt/a1;-><init>(ILt/b1;Lc9/c;Lu8/e;)V

    iput-object p1, v0, Lt/a1;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lt/a1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lt/a1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lt/a1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lt/a1;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lt/a1;->b:Ljava/lang/Object;

    check-cast v0, Lt/b1;

    iget-object v1, p0, Lt/a1;->a:Lu9/a;

    iget-object v2, p0, Lt/a1;->e:Ljava/lang/Object;

    check-cast v2, Lt/z0;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt/a1;->c:Lt/b1;

    iget-object v3, p0, Lt/a1;->b:Ljava/lang/Object;

    check-cast v3, Lc9/c;

    iget-object v5, p0, Lt/a1;->a:Lu9/a;

    iget-object v6, p0, Lt/a1;->e:Ljava/lang/Object;

    check-cast v6, Lt/z0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p1, v1

    :goto_0
    move-object v1, v5

    goto :goto_3

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lt/a1;->e:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v1, Lt/z0;

    invoke-interface {p1}, Lm9/d0;->q()Lu8/j;

    move-result-object p1

    sget-object v5, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p1, v5}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast p1, Lm9/f1;

    iget v5, p0, Lt/a1;->f:I

    invoke-direct {v1, v5, p1}, Lt/z0;-><init>(ILm9/f1;)V

    :goto_1
    iget-object p1, p0, Lt/a1;->n:Lt/b1;

    iget-object v5, p1, Lt/b1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt/z0;

    if-eqz v6, :cond_4

    iget v7, v1, Lt/z0;->a:I

    iget v8, v6, Lt/z0;->a:I

    invoke-static {v7, v8}, Lt/k;->a(II)I

    move-result v7

    if-ltz v7, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Current mutation had a higher priority"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    invoke-virtual {v5, v6, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    if-eqz v6, :cond_5

    new-instance v5, Lt/y0;

    const/4 v7, 0x0

    invoke-direct {v5, v7, v7}, Lt/y0;-><init>(II)V

    iget-object v6, v6, Lt/z0;->b:Lm9/f1;

    invoke-interface {v6, v5}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_5
    iput-object v1, p0, Lt/a1;->e:Ljava/lang/Object;

    iget-object v5, p1, Lt/b1;->b:Lu9/d;

    iput-object v5, p0, Lt/a1;->a:Lu9/a;

    iget-object v6, p0, Lt/a1;->o:Lc9/c;

    iput-object v6, p0, Lt/a1;->b:Ljava/lang/Object;

    iput-object p1, p0, Lt/a1;->c:Lt/b1;

    iput v3, p0, Lt/a1;->d:I

    invoke-virtual {v5, v4, p0}, Lu9/d;->c(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_6

    return-object v0

    :cond_6
    move-object v3, v6

    move-object v6, v1

    goto :goto_0

    :goto_3
    :try_start_1
    iput-object v6, p0, Lt/a1;->e:Ljava/lang/Object;

    iput-object v1, p0, Lt/a1;->a:Lu9/a;

    iput-object p1, p0, Lt/a1;->b:Ljava/lang/Object;

    iput-object v4, p0, Lt/a1;->c:Lt/b1;

    iput v2, p0, Lt/a1;->d:I

    invoke-interface {v3, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v0, :cond_7

    return-object v0

    :cond_7
    move-object v0, p1

    move-object p1, v2

    move-object v2, v6

    :goto_4
    :try_start_2
    iget-object v0, v0, Lt/b1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_8
    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eq v3, v2, :cond_8

    :goto_5
    check-cast v1, Lu9/d;

    invoke-virtual {v1, v4}, Lu9/d;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_1
    move-exception v0

    move-object v2, v6

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_6
    :try_start_3
    iget-object v0, v0, Lt/b1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_7
    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    goto :goto_7

    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p1

    check-cast v1, Lu9/d;

    invoke-virtual {v1, v4}, Lu9/d;->d(Ljava/lang/Object;)V

    throw p1

    :cond_b
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v6, :cond_4

    goto/16 :goto_1
.end method
