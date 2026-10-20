.class public final Lw0/u;
.super Ljava/lang/Object;

# interfaces
.implements Lw0/g0;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Le9/b;


# instance fields
.field public a:Lw0/t;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw0/t;

    sget-object v1, Lq0/j;->b:Lq0/j;

    invoke-direct {v0, v1}, Lw0/t;-><init>(Lp0/d;)V

    iput-object v0, p0, Lw0/u;->a:Lw0/t;

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 7

    .line 25
    :cond_0
    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    .line 26
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 27
    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 29
    iget v2, v1, Lw0/t;->d:I

    .line 30
    iget-object v1, v1, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 31
    monitor-exit v0

    .line 32
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    .line 33
    invoke-interface {v1, p1, p2}, Lp0/d;->add(ILjava/lang/Object;)Lp0/d;

    move-result-object v3

    .line 34
    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 35
    invoke-static {v1, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    sget-object v4, Lw0/p;->b:Ljava/lang/Object;

    .line 37
    monitor-enter v4

    .line 38
    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v5

    .line 39
    invoke-static {v1, p0, v5}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 40
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :try_start_2
    iget v6, v1, Lw0/t;->d:I

    if-ne v6, v2, :cond_2

    .line 42
    iput-object v3, v1, Lw0/t;->c:Lp0/d;

    .line 43
    iget v2, v1, Lw0/t;->e:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 44
    iput v2, v1, Lw0/t;->e:I

    add-int/lit8 v6, v6, 0x1

    .line 45
    iput v6, v1, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 46
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    .line 47
    invoke-static {v5, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v3, :cond_0

    :goto_1
    return-void

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 48
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    :cond_0
    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    .line 2
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 3
    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 5
    iget v2, v1, Lw0/t;->d:I

    .line 6
    iget-object v1, v1, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 7
    monitor-exit v0

    .line 8
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    .line 9
    invoke-interface {v1, p1}, Lp0/d;->add(Ljava/lang/Object;)Lp0/d;

    move-result-object v3

    .line 10
    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 11
    invoke-static {v1, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    .line 13
    monitor-enter v5

    .line 14
    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    .line 15
    invoke-static {v1, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 16
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    :try_start_2
    iget v7, v1, Lw0/t;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 18
    iput-object v3, v1, Lw0/t;->c:Lp0/d;

    .line 19
    iget v2, v1, Lw0/t;->e:I

    add-int/2addr v2, v8

    .line 20
    iput v2, v1, Lw0/t;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 21
    iput v7, v1, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 22
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 23
    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_1
    return v4

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 24
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 1
    new-instance v0, Lu/k;

    invoke-direct {v0, p1, p2}, Lu/k;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, Lw0/u;->p(Lc9/c;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 9

    .line 2
    :cond_0
    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 4
    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 6
    iget v2, v1, Lw0/t;->d:I

    .line 7
    iget-object v1, v1, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    monitor-exit v0

    .line 9
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    .line 10
    invoke-interface {v1, p1}, Lp0/d;->addAll(Ljava/util/Collection;)Lp0/d;

    move-result-object v3

    .line 11
    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 12
    invoke-static {v1, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    .line 14
    monitor-enter v5

    .line 15
    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    .line 16
    invoke-static {v1, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 17
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :try_start_2
    iget v7, v1, Lw0/t;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    .line 19
    iput-object v3, v1, Lw0/t;->c:Lp0/d;

    .line 20
    iget v2, v1, Lw0/t;->e:I

    add-int/2addr v2, v8

    .line 21
    iput v2, v1, Lw0/t;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 22
    iput v7, v1, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 23
    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 24
    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_1
    return v4

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 25
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lw0/u;->a:Lw0/t;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v2

    invoke-static {v0, p0, v2}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v0

    check-cast v0, Lw0/t;

    sget-object v3, Lw0/v;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v4, Lq0/j;->b:Lq0/j;

    iput-object v4, v0, Lw0/t;->c:Lp0/d;

    iget v4, v0, Lw0/t;->d:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lw0/t;->d:I

    iget v4, v0, Lw0/t;->e:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lw0/t;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    invoke-static {v2, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit v1

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final e()Lw0/i0;
    .locals 1

    iget-object v0, p0, Lw0/u;->a:Lw0/t;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lw0/u;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lw0/i0;)V
    .locals 1

    iget-object v0, p0, Lw0/u;->a:Lw0/t;

    iput-object v0, p1, Lw0/i0;->b:Lw0/i0;

    check-cast p1, Lw0/t;

    iput-object p1, p0, Lw0/u;->a:Lw0/t;

    return-void
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 1
    new-instance v0, Lw0/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw0/c0;-><init>(Lw0/u;I)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    new-instance v0, Lw0/c0;

    invoke-direct {v0, p0, p1}, Lw0/c0;-><init>(Lw0/u;I)V

    return-object v0
.end method

.method public final n()Lw0/t;
    .locals 2

    iget-object v0, p0, Lw0/u;->a:Lw0/t;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lw0/p;->r(Lw0/i0;Lw0/g0;)Lw0/i0;

    move-result-object v0

    check-cast v0, Lw0/t;

    return-object v0
.end method

.method public final o()I
    .locals 2

    iget-object v0, p0, Lw0/u;->a:Lw0/t;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v0

    check-cast v0, Lw0/t;

    iget v0, v0, Lw0/t;->e:I

    return v0
.end method

.method public final p(Lc9/c;)Z
    .locals 8

    :cond_0
    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    iget v2, v1, Lw0/t;->d:I

    iget-object v1, v1, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v1}, Lp0/d;->builder()Lq0/f;

    move-result-object v3

    invoke-interface {p1, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, Lq0/f;->k()Lp0/d;

    move-result-object v3

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    invoke-static {v1, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v1, Lw0/t;->d:I

    if-ne v7, v2, :cond_1

    iput-object v3, v1, Lw0/t;->c:Lp0/d;

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, Lw0/t;->d:I

    iget v2, v1, Lw0/t;->e:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v1, Lw0/t;->e:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v3, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v5

    throw p1

    :cond_2
    :goto_3
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 2
    :cond_0
    sget-object v1, Lw0/v;->a:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lw0/u;->a:Lw0/t;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 4
    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {v2}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/t;

    .line 6
    iget v3, v2, Lw0/t;->d:I

    .line 7
    iget-object v2, v2, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    monitor-exit v1

    .line 9
    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    .line 10
    invoke-interface {v2, p1}, Lp0/d;->m(I)Lp0/d;

    move-result-object v4

    .line 11
    invoke-static {v4, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lw0/u;->a:Lw0/t;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 12
    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    .line 14
    monitor-enter v5

    .line 15
    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    .line 16
    invoke-static {v2, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/t;

    .line 17
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :try_start_2
    iget v7, v2, Lw0/t;->d:I

    if-ne v7, v3, :cond_2

    .line 19
    iput-object v4, v2, Lw0/t;->c:Lp0/d;

    .line 20
    iget v3, v2, Lw0/t;->e:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    .line 21
    iput v3, v2, Lw0/t;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 22
    iput v7, v2, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 23
    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 24
    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v4, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 25
    :goto_2
    :try_start_4
    monitor-exit v1

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 9

    .line 26
    :cond_0
    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    .line 27
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 28
    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 30
    iget v2, v1, Lw0/t;->d:I

    .line 31
    iget-object v1, v1, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 32
    monitor-exit v0

    .line 33
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Lq0/c;

    .line 34
    invoke-virtual {v3, p1}, Lr8/d;->indexOf(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    .line 35
    invoke-interface {v3, v4}, Lp0/d;->m(I)Lp0/d;

    move-result-object v3

    .line 36
    :cond_1
    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    .line 37
    invoke-static {v1, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    .line 39
    monitor-enter v5

    .line 40
    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    .line 41
    invoke-static {v1, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    .line 42
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    :try_start_2
    iget v7, v1, Lw0/t;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_3

    .line 44
    iput-object v3, v1, Lw0/t;->c:Lp0/d;

    .line 45
    iget v2, v1, Lw0/t;->e:I

    add-int/2addr v2, v8

    .line 46
    iput v2, v1, Lw0/t;->e:I

    add-int/lit8 v7, v7, 0x1

    .line 47
    iput v7, v1, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 48
    :cond_3
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    .line 49
    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v4, :cond_0

    move v4, v8

    :goto_1
    return v4

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 50
    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 9

    :cond_0
    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    iget v2, v1, Lw0/t;->d:I

    iget-object v1, v1, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Lq0/c;

    new-instance v4, Lq0/b;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p1}, Lq0/b;-><init>(ILjava/util/Collection;)V

    invoke-interface {v3, v4}, Lp0/d;->h(Lq0/b;)Lp0/d;

    move-result-object v3

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lw0/u;->a:Lw0/t;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    invoke-static {v1, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/t;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v1, Lw0/t;->d:I

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    iput-object v3, v1, Lw0/t;->c:Lp0/d;

    iget v2, v1, Lw0/t;->e:I

    add-int/2addr v2, v8

    iput v2, v1, Lw0/t;->e:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v5, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v5, :cond_0

    move v5, v8

    :goto_1
    return v5

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v0

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 2

    new-instance v0, Lq0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lq0/b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, Lw0/u;->p(Lc9/c;)Z

    move-result p1

    return p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0, p1}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    sget-object v1, Lw0/v;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lw0/u;->a:Lw0/t;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/t;

    iget v3, v2, Lw0/t;->d:I

    iget-object v2, v2, Lw0/t;->c:Lp0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v2, p1, p2}, Lp0/d;->set(ILjava/lang/Object;)Lp0/d;

    move-result-object v4

    invoke-static {v4, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lw0/u;->a:Lw0/t;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    invoke-static {v2, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/t;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v2, Lw0/t;->d:I

    if-ne v7, v3, :cond_2

    iput-object v4, v2, Lw0/t;->c:Lp0/d;

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lw0/t;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v2, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v1

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v5

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final size()I
    .locals 1

    invoke-virtual {p0}, Lw0/u;->n()Lw0/t;

    move-result-object v0

    iget-object v0, v0, Lw0/t;->c:Lp0/d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Lw0/u;->size()I

    move-result v0

    if-gt p2, v0, :cond_0

    new-instance v0, Lw0/k0;

    invoke-direct {v0, p0, p1, p2}, Lw0/k0;-><init>(Lw0/u;II)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "fromIndex or toIndex are out of bounds"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Ld9/i;->v(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Ld9/i;->w(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
