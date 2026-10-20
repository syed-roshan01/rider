.class public final Lm0/d2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lw0/h;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lm0/g2;

.field public final synthetic e:Lc9/f;

.field public final synthetic f:Lm0/a1;


# direct methods
.method public constructor <init>(Lm0/g2;Lc9/f;Lm0/a1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm0/d2;->d:Lm0/g2;

    iput-object p2, p0, Lm0/d2;->e:Lc9/f;

    iput-object p3, p0, Lm0/d2;->f:Lm0/a1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    new-instance v0, Lm0/d2;

    iget-object v1, p0, Lm0/d2;->e:Lc9/f;

    iget-object v2, p0, Lm0/d2;->f:Lm0/a1;

    iget-object v3, p0, Lm0/d2;->d:Lm0/g2;

    invoke-direct {v0, v3, v1, v2, p2}, Lm0/d2;-><init>(Lm0/g2;Lc9/f;Lm0/a1;Lu8/e;)V

    iput-object p1, v0, Lm0/d2;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lm0/d2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lm0/d2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lm0/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lm0/d2;->b:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lm0/d2;->a:Lw0/h;

    iget-object v1, p0, Lm0/d2;->c:Ljava/lang/Object;

    check-cast v1, Lm9/f1;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lm0/d2;->c:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    invoke-interface {p1}, Lm9/d0;->q()Lu8/j;

    move-result-object p1

    invoke-static {p1}, Lh6/g;->g0(Lu8/j;)Lm9/f1;

    move-result-object v1

    iget-object p1, p0, Lm0/d2;->d:Lm0/g2;

    iget-object v4, p1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget-object v5, p1, Lm0/g2;->d:Ljava/lang/Throwable;

    if-nez v5, :cond_d

    iget-object v5, p1, Lm0/g2;->r:Lp9/q0;

    invoke-virtual {v5}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/a2;

    sget-object v6, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_c

    iget-object v5, p1, Lm0/g2;->c:Lm9/f1;

    if-nez v5, :cond_b

    iput-object v1, p1, Lm0/g2;->c:Lm9/f1;

    invoke-virtual {p1}, Lm0/g2;->u()Lm9/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    monitor-exit v4

    new-instance p1, Ls/i;

    iget-object v4, p0, Lm0/d2;->d:Lm0/g2;

    const/4 v5, 0x6

    invoke-direct {p1, v4, v5}, Ls/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lk0/y0;->f(Ls/i;)Lw0/h;

    move-result-object p1

    sget-object v4, Lm0/g2;->v:Lp9/q0;

    iget-object v4, p0, Lm0/d2;->d:Lm0/g2;

    iget-object v4, v4, Lm0/g2;->u:Lk/f;

    :cond_2
    sget-object v5, Lm0/g2;->v:Lp9/q0;

    invoke-virtual {v5}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp0/g;

    move-object v7, v6

    check-cast v7, Ls0/b;

    iget-object v8, v7, Ls0/b;->c:Lr0/d;

    invoke-virtual {v8, v4}, Lr0/d;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v7}, Lr8/a;->isEmpty()Z

    move-result v9

    sget-object v10, Lt0/b;->a:Lt0/b;

    if-eqz v9, :cond_4

    new-instance v7, Ls0/a;

    invoke-direct {v7, v10, v10}, Ls0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v4, v7}, Lr0/d;->b(Ljava/lang/Object;Ls0/a;)Lr0/d;

    move-result-object v7

    new-instance v8, Ls0/b;

    invoke-direct {v8, v4, v4, v7}, Ls0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr0/d;)V

    move-object v7, v8

    goto :goto_0

    :cond_4
    iget-object v9, v7, Ls0/b;->b:Ljava/lang/Object;

    invoke-virtual {v8, v9}, Lr0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v11, Ls0/a;

    new-instance v12, Ls0/a;

    iget-object v11, v11, Ls0/a;->a:Ljava/lang/Object;

    invoke-direct {v12, v11, v4}, Ls0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v9, v12}, Lr0/d;->b(Ljava/lang/Object;Ls0/a;)Lr0/d;

    move-result-object v8

    new-instance v11, Ls0/a;

    invoke-direct {v11, v9, v10}, Ls0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v4, v11}, Lr0/d;->b(Ljava/lang/Object;Ls0/a;)Lr0/d;

    move-result-object v8

    new-instance v9, Ls0/b;

    iget-object v7, v7, Ls0/b;->a:Ljava/lang/Object;

    invoke-direct {v9, v7, v4, v8}, Ls0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr0/d;)V

    move-object v7, v9

    :goto_0
    if-eq v6, v7, :cond_6

    sget-object v8, Lq9/c;->b:Li3/u;

    if-nez v6, :cond_5

    move-object v6, v8

    :cond_5
    invoke-virtual {v5, v6, v7}, Lp9/q0;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_6
    :try_start_2
    iget-object v4, p0, Lm0/d2;->d:Lm0/g2;

    iget-object v5, v4, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v4}, Lm0/g2;->x()Ljava/util/List;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    monitor-exit v5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_7

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm0/e0;

    check-cast v7, Lm0/x;

    invoke-virtual {v7}, Lm0/x;->t()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :goto_2
    move-object v13, v0

    move-object v0, p1

    move-object p1, v13

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_7
    new-instance v4, Lm0/c2;

    iget-object v5, p0, Lm0/d2;->e:Lc9/f;

    iget-object v6, p0, Lm0/d2;->f:Lm0/a1;

    invoke-direct {v4, v5, v6, v3}, Lm0/c2;-><init>(Lc9/f;Lm0/a1;Lu8/e;)V

    iput-object v1, p0, Lm0/d2;->c:Ljava/lang/Object;

    iput-object p1, p0, Lm0/d2;->a:Lw0/h;

    iput v2, p0, Lm0/d2;->b:I

    invoke-static {v4, p0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne v2, v0, :cond_8

    return-object v0

    :cond_8
    move-object v0, p1

    :goto_3
    invoke-virtual {v0}, Lw0/h;->a()V

    iget-object p1, p0, Lm0/d2;->d:Lm0/g2;

    iget-object v0, p1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_5
    iget-object v2, p1, Lm0/g2;->c:Lm9/f1;

    if-ne v2, v1, :cond_9

    iput-object v3, p1, Lm0/g2;->c:Lm9/f1;

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_9
    :goto_4
    invoke-virtual {p1}, Lm0/g2;->u()Lm9/k;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit v0

    sget-object p1, Lm0/g2;->v:Lp9/q0;

    iget-object p1, p0, Lm0/d2;->d:Lm0/g2;

    iget-object p1, p1, Lm0/g2;->u:Lk/f;

    invoke-static {p1}, Lk0/y0;->a(Lk/f;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :goto_5
    monitor-exit v0

    throw p1

    :catchall_3
    move-exception v0

    :try_start_6
    monitor-exit v5

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_6
    invoke-virtual {v0}, Lw0/h;->a()V

    iget-object v0, p0, Lm0/d2;->d:Lm0/g2;

    iget-object v2, v0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_7
    iget-object v4, v0, Lm0/g2;->c:Lm9/f1;

    if-ne v4, v1, :cond_a

    iput-object v3, v0, Lm0/g2;->c:Lm9/f1;

    goto :goto_7

    :catchall_4
    move-exception p1

    goto :goto_8

    :cond_a
    :goto_7
    invoke-virtual {v0}, Lm0/g2;->u()Lm9/k;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    monitor-exit v2

    sget-object v0, Lm0/g2;->v:Lp9/q0;

    iget-object v0, p0, Lm0/d2;->d:Lm0/g2;

    iget-object v0, v0, Lm0/g2;->u:Lk/f;

    invoke-static {v0}, Lk0/y0;->a(Lk/f;)V

    throw p1

    :goto_8
    monitor-exit v2

    throw p1

    :catchall_5
    move-exception p1

    goto :goto_9

    :cond_b
    :try_start_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recomposer already running"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recomposer shut down"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    throw v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :goto_9
    monitor-exit v4

    throw p1
.end method
