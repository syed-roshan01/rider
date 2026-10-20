.class public final Lw0/x;
.super Ljava/lang/Object;

# interfaces
.implements Lw0/g0;
.implements Ljava/util/Map;
.implements Le9/d;


# instance fields
.field public a:Lw0/w;

.field public final b:Lw0/q;

.field public final c:Lw0/q;

.field public final d:Lw0/q;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw0/w;

    sget-object v1, Lr0/d;->c:Lr0/d;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lw0/w;-><init>(Lp0/f;)V

    iput-object v0, p0, Lw0/x;->a:Lw0/w;

    new-instance v0, Lw0/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw0/q;-><init>(Lw0/x;I)V

    iput-object v0, p0, Lw0/x;->b:Lw0/q;

    new-instance v0, Lw0/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lw0/q;-><init>(Lw0/x;I)V

    iput-object v0, p0, Lw0/x;->c:Lw0/q;

    new-instance v0, Lw0/q;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lw0/q;-><init>(Lw0/x;I)V

    iput-object v0, p0, Lw0/x;->d:Lw0/q;

    return-void
.end method


# virtual methods
.method public final a()Lw0/w;
    .locals 2

    iget-object v0, p0, Lw0/x;->a:Lw0/w;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lw0/p;->r(Lw0/i0;Lw0/g0;)Lw0/i0;

    move-result-object v0

    check-cast v0, Lw0/w;

    return-object v0
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lw0/x;->a:Lw0/w;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v0

    check-cast v0, Lw0/w;

    sget-object v1, Lr0/d;->c:Lr0/d;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lw0/w;->c:Lp0/f;

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lw0/x;->a:Lw0/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v3

    invoke-static {v0, p0, v3}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v0

    check-cast v0, Lw0/w;

    sget-object v4, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v1, v0, Lw0/w;->c:Lp0/f;

    iget v1, v0, Lw0/w;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lw0/w;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    invoke-static {v3, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v4

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit v2

    throw v0

    :cond_0
    :goto_1
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lw0/x;->a()Lw0/w;

    move-result-object v0

    iget-object v0, v0, Lw0/w;->c:Lp0/f;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lw0/x;->a()Lw0/w;

    move-result-object v0

    iget-object v0, v0, Lw0/w;->c:Lp0/f;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()Lw0/i0;
    .locals 1

    iget-object v0, p0, Lw0/x;->a:Lw0/w;

    return-object v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lw0/x;->b:Lw0/q;

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw0/x;->a()Lw0/w;

    move-result-object v0

    iget-object v0, v0, Lw0/w;->c:Lp0/f;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lw0/x;->a()Lw0/w;

    move-result-object v0

    iget-object v0, v0, Lw0/w;->c:Lp0/f;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final k(Lw0/i0;)V
    .locals 0

    check-cast p1, Lw0/w;

    iput-object p1, p0, Lw0/x;->a:Lw0/w;

    return-void
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lw0/x;->c:Lw0/q;

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    :cond_0
    sget-object v0, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/x;->a:Lw0/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/w;

    iget-object v2, v1, Lw0/w;->c:Lp0/f;

    iget v1, v1, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v2}, Lp0/f;->builder()Lp0/e;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Lp0/e;->build()Lp0/f;

    move-result-object v3

    invoke-static {v3, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lw0/x;->a:Lw0/w;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    invoke-static {v2, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/w;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v2, Lw0/w;->d:I

    if-ne v7, v1, :cond_1

    iput-object v3, v2, Lw0/w;->c:Lp0/f;

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v1, :cond_0

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
    return-object v4

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 7

    :cond_0
    sget-object v0, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/x;->a:Lw0/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/w;

    iget-object v2, v1, Lw0/w;->c:Lp0/f;

    iget v1, v1, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v2}, Lp0/f;->builder()Lp0/e;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v3}, Lp0/e;->build()Lp0/f;

    move-result-object v3

    invoke-static {v3, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lw0/x;->a:Lw0/w;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/w;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v6, v2, Lw0/w;->d:I

    if-ne v6, v1, :cond_1

    iput-object v3, v2, Lw0/w;->c:Lp0/f;

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v1, :cond_0

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
    monitor-exit v4

    throw p1

    :cond_2
    :goto_3
    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    :cond_0
    sget-object v0, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/x;->a:Lw0/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v1

    check-cast v1, Lw0/w;

    iget-object v2, v1, Lw0/w;->c:Lp0/f;

    iget v1, v1, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v2}, Lp0/f;->builder()Lp0/e;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Lp0/e;->build()Lp0/f;

    move-result-object v3

    invoke-static {v3, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lw0/x;->a:Lw0/w;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v5

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v6

    invoke-static {v2, p0, v6}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v2

    check-cast v2, Lw0/w;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v7, v2, Lw0/w;->d:I

    if-ne v7, v1, :cond_1

    iput-object v3, v2, Lw0/w;->c:Lp0/f;

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v5

    invoke-static {v6, p0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v1, :cond_0

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
    return-object v4

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final size()I
    .locals 1

    invoke-virtual {p0}, Lw0/x;->a()Lw0/w;

    move-result-object v0

    iget-object v0, v0, Lw0/w;->c:Lp0/f;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lw0/x;->d:Lw0/q;

    return-object v0
.end method
