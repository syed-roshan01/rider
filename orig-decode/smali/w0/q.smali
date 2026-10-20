.class public final Lw0/q;
.super Lw0/r;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lw0/x;I)V
    .locals 0

    iput p2, p0, Lw0/q;->b:I

    invoke-direct {p0, p1}, Lw0/r;-><init>(Lw0/x;)V

    return-void
.end method

.method private e(Ljava/util/Collection;)Z
    .locals 11

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v0

    invoke-static {v0}, Lz6/a;->T(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lw0/r;->a:Lw0/x;

    const/4 v0, 0x0

    move v2, v0

    :cond_2
    sget-object v3, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v4, p1, Lw0/x;->a:Lw0/w;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v4

    check-cast v4, Lw0/w;

    iget-object v5, v4, Lw0/w;->c:Lp0/f;

    iget v4, v4, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v3

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v5}, Lp0/f;->builder()Lp0/e;

    move-result-object v3

    iget-object v6, p1, Lw0/x;->b:Lw0/q;

    invoke-virtual {v6}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    move-object v7, v6

    check-cast v7, Lw0/f0;

    invoke-virtual {v7}, Lw0/f0;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_5

    move-object v7, v6

    check-cast v7, Lw0/e0;

    invoke-virtual {v7}, Lw0/e0;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_4
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v8

    goto :goto_1

    :cond_5
    invoke-interface {v3}, Lp0/e;->build()Lp0/f;

    move-result-object v3

    invoke-static {v3, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, p1, Lw0/x;->a:Lw0/w;

    const-string v6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v5, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v6

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v7

    invoke-static {v5, p1, v7}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v5

    check-cast v5, Lw0/w;

    sget-object v9, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v10, v5, Lw0/w;->d:I

    if-ne v10, v4, :cond_6

    iput-object v3, v5, Lw0/w;->c:Lp0/f;

    add-int/lit8 v10, v10, 0x1

    iput v10, v5, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_6
    move v8, v0

    :goto_2
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v6

    invoke-static {v7, p1}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v8, :cond_2

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_4

    :goto_3
    :try_start_4
    monitor-exit v9

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v6

    throw p1

    :cond_7
    :goto_5
    return v2

    :catchall_2
    move-exception p1

    monitor-exit v3

    throw p1
.end method

.method private i(Ljava/util/Collection;)Z
    .locals 11

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lr8/p;->a1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lw0/r;->a:Lw0/x;

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    sget-object v3, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v4, v0, Lw0/x;->a:Lw0/w;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v4

    check-cast v4, Lw0/w;

    iget-object v5, v4, Lw0/w;->c:Lp0/f;

    iget v4, v4, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v3

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v5}, Lp0/f;->builder()Lp0/e;

    move-result-object v3

    iget-object v6, v0, Lw0/x;->b:Lw0/q;

    invoke-virtual {v6}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    move-object v7, v6

    check-cast v7, Lw0/f0;

    invoke-virtual {v7}, Lw0/f0;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    move-object v7, v6

    check-cast v7, Lw0/e0;

    invoke-virtual {v7}, Lw0/e0;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    xor-int/2addr v9, v8

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v8

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lp0/e;->build()Lp0/f;

    move-result-object v3

    invoke-static {v3, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, v0, Lw0/x;->a:Lw0/w;

    const-string v6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v5, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v6

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v7

    invoke-static {v5, v0, v7}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v5

    check-cast v5, Lw0/w;

    sget-object v9, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v10, v5, Lw0/w;->d:I

    if-ne v10, v4, :cond_3

    iput-object v3, v5, Lw0/w;->c:Lp0/f;

    add-int/lit8 v10, v10, 0x1

    iput v10, v5, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    move v8, v1

    :goto_1
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v6

    invoke-static {v7, v0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v8, :cond_0

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v9

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v6

    throw p1

    :cond_4
    :goto_4
    return v2

    :catchall_2
    move-exception p1

    monitor-exit v3

    throw p1
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lw0/q;->b:I

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    invoke-static {}, Lw0/y;->a()V

    throw v0

    :pswitch_0
    invoke-static {}, Lw0/y;->a()V

    throw v0

    :pswitch_1
    packed-switch v1, :pswitch_data_2

    invoke-static {}, Lw0/y;->a()V

    throw v0

    :pswitch_2
    invoke-static {}, Lw0/y;->a()V

    throw v0

    :pswitch_3
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {}, Lw0/y;->a()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2
    .end packed-switch
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    const/4 p1, 0x0

    iget v0, p0, Lw0/q;->b:I

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_0
    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_1
    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_2
    packed-switch v0, :pswitch_data_2

    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_3
    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_4
    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_5
    packed-switch v0, :pswitch_data_3

    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_6
    invoke-static {}, Lw0/y;->a()V

    throw p1

    :pswitch_7
    invoke-static {}, Lw0/y;->a()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Lw0/q;->b:I

    iget-object v1, p0, Lw0/r;->a:Lw0/x;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1, p1}, Lw0/x;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-virtual {v1, p1}, Lw0/x;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_1
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_1

    instance-of v0, p1, Le9/a;

    if-eqz v0, :cond_0

    instance-of v0, p1, Le9/c;

    if-eqz v0, :cond_1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lw0/x;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 4

    iget v0, p0, Lw0/q;->b:I

    iget-object v1, p0, Lw0/r;->a:Lw0/x;

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v2, v3

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lw0/x;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return v2

    :pswitch_0
    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    move v2, v3

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lw0/x;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_1
    return v2

    :pswitch_1
    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move v2, v3

    goto :goto_2

    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lw0/q;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :goto_2
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    iget v0, p0, Lw0/q;->b:I

    iget-object v1, p0, Lw0/r;->a:Lw0/x;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lw0/e0;

    invoke-virtual {v1}, Lw0/x;->a()Lw0/w;

    move-result-object v2

    iget-object v2, v2, Lw0/w;->c:Lp0/f;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Lp0/c;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lw0/e0;-><init>(Lw0/x;Ljava/util/Iterator;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lw0/e0;

    invoke-virtual {v1}, Lw0/x;->a()Lw0/w;

    move-result-object v2

    iget-object v2, v2, Lw0/w;->c:Lp0/f;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Lp0/c;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lw0/e0;-><init>(Lw0/x;Ljava/util/Iterator;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Lw0/e0;

    invoke-virtual {v1}, Lw0/x;->a()Lw0/w;

    move-result-object v2

    iget-object v2, v2, Lw0/w;->c:Lp0/f;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Lp0/c;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lw0/e0;-><init>(Lw0/x;Ljava/util/Iterator;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    iget v0, p0, Lw0/q;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lw0/r;->a:Lw0/x;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v3, Lw0/x;->b:Lw0/q;

    invoke-virtual {v0}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    move-object v4, v0

    check-cast v4, Lw0/f0;

    invoke-virtual {v4}, Lw0/f0;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v0

    check-cast v4, Lw0/e0;

    invoke-virtual {v4}, Lw0/e0;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    check-cast v4, Ljava/util/Map$Entry;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    :cond_2
    return v1

    :pswitch_0
    invoke-virtual {v3, p1}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    return v1

    :pswitch_1
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_5

    instance-of v0, p1, Le9/a;

    if-eqz v0, :cond_4

    instance-of v0, p1, Le9/c;

    if-eqz v0, :cond_5

    :cond_4
    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 11

    iget v0, p0, Lw0/q;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lr8/p;->a1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lw0/r;->a:Lw0/x;

    move v3, v1

    :cond_0
    sget-object v4, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v0, Lw0/x;->a:Lw0/w;

    const-string v6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v5, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v5

    check-cast v5, Lw0/w;

    iget-object v6, v5, Lw0/w;->c:Lp0/f;

    iget v5, v5, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v4

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v6}, Lp0/f;->builder()Lp0/e;

    move-result-object v4

    iget-object v7, v0, Lw0/x;->b:Lw0/q;

    invoke-virtual {v7}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_0
    move-object v8, v7

    check-cast v8, Lw0/f0;

    invoke-virtual {v8}, Lw0/f0;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v7

    check-cast v8, Lw0/e0;

    invoke-virtual {v8}, Lw0/e0;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v2

    goto :goto_0

    :cond_2
    invoke-interface {v4}, Lp0/e;->build()Lp0/f;

    move-result-object v4

    invoke-static {v4, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    iget-object v6, v0, Lw0/x;->a:Lw0/w;

    const-string v7, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v6, v7}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v7

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v8

    invoke-static {v6, v0, v8}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v6

    check-cast v6, Lw0/w;

    sget-object v9, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v10, v6, Lw0/w;->d:I

    if-ne v10, v5, :cond_3

    iput-object v4, v6, Lw0/w;->c:Lp0/f;

    add-int/lit8 v10, v10, 0x1

    iput v10, v6, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v4, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    move v4, v1

    :goto_1
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v7

    invoke-static {v8, v0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v4, :cond_0

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v9

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v7

    throw p1

    :cond_4
    :goto_4
    return v3

    :catchall_2
    move-exception p1

    monitor-exit v4

    throw p1

    :pswitch_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    move v0, v1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lw0/r;->a:Lw0/x;

    invoke-virtual {v4, v3}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_6

    if-eqz v0, :cond_5

    :cond_6
    move v0, v2

    goto :goto_5

    :cond_7
    return v0

    :pswitch_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    move v0, v1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lw0/r;->a:Lw0/x;

    invoke-virtual {v4, v3}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_9

    if-eqz v0, :cond_8

    :cond_9
    move v0, v2

    goto :goto_6

    :cond_a
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 11

    iget v0, p0, Lw0/q;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lr8/p;->a1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lw0/r;->a:Lw0/x;

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    sget-object v3, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v4, v0, Lw0/x;->a:Lw0/w;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lw0/p;->h(Lw0/i0;)Lw0/i0;

    move-result-object v4

    check-cast v4, Lw0/w;

    iget-object v5, v4, Lw0/w;->c:Lp0/f;

    iget v4, v4, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v3

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-interface {v5}, Lp0/f;->builder()Lp0/e;

    move-result-object v3

    iget-object v6, v0, Lw0/x;->b:Lw0/q;

    invoke-virtual {v6}, Lw0/q;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    move-object v7, v6

    check-cast v7, Lw0/f0;

    invoke-virtual {v7}, Lw0/f0;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    move-object v7, v6

    check-cast v7, Lw0/e0;

    invoke-virtual {v7}, Lw0/e0;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    xor-int/2addr v9, v8

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v8

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lp0/e;->build()Lp0/f;

    move-result-object v3

    invoke-static {v3, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, v0, Lw0/x;->a:Lw0/w;

    const-string v6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v5, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v6

    :try_start_1
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v7

    invoke-static {v5, v0, v7}, Lw0/p;->u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;

    move-result-object v5

    check-cast v5, Lw0/w;

    sget-object v9, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget v10, v5, Lw0/w;->d:I

    if-ne v10, v4, :cond_3

    iput-object v3, v5, Lw0/w;->c:Lp0/f;

    add-int/lit8 v10, v10, 0x1

    iput v10, v5, Lw0/w;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    move v8, v1

    :goto_1
    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v6

    invoke-static {v7, v0}, Lw0/p;->l(Lw0/i;Lw0/g0;)V

    if-eqz v8, :cond_0

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v9

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v6

    throw p1

    :cond_4
    :goto_4
    return v2

    :catchall_2
    move-exception p1

    monitor-exit v3

    throw p1

    :pswitch_0
    invoke-direct {p0, p1}, Lw0/q;->i(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-direct {p0, p1}, Lw0/q;->e(Ljava/util/Collection;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
