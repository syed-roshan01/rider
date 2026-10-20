.class public abstract Lw0/p;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/h3;

.field public static final b:Ljava/lang/Object;

.field public static c:Lw0/n;

.field public static d:I

.field public static final e:Lw0/l;

.field public static final f:Lw0/b0;

.field public static g:Ljava/util/List;

.field public static h:Ljava/util/List;

.field public static final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final j:Lw0/i;

.field public static final k:Lm0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lm0/h3;

    invoke-direct {v0}, Lm0/h3;-><init>()V

    sput-object v0, Lw0/p;->a:Lm0/h3;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw0/p;->b:Ljava/lang/Object;

    sget-object v0, Lw0/n;->e:Lw0/n;

    sput-object v0, Lw0/p;->c:Lw0/n;

    const/4 v1, 0x1

    sput v1, Lw0/p;->d:I

    new-instance v1, Lw0/l;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/16 v2, 0x10

    new-array v3, v2, [I

    iput-object v3, v1, Lw0/l;->b:[I

    new-array v3, v2, [I

    iput-object v3, v1, Lw0/l;->c:[I

    new-array v3, v2, [I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_0

    add-int/lit8 v6, v5, 0x1

    aput v6, v3, v5

    move v5, v6

    goto :goto_0

    :cond_0
    iput-object v3, v1, Lw0/l;->d:[I

    sput-object v1, Lw0/p;->e:Lw0/l;

    new-instance v1, Lw0/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-array v3, v2, [I

    iput-object v3, v1, Lw0/b0;->b:[I

    new-array v2, v2, [Lm0/p3;

    iput-object v2, v1, Lw0/b0;->c:[Lm0/p3;

    sput-object v1, Lw0/p;->f:Lw0/b0;

    sget-object v1, Lr8/r;->a:Lr8/r;

    sput-object v1, Lw0/p;->g:Ljava/util/List;

    sput-object v1, Lw0/p;->h:Ljava/util/List;

    new-instance v1, Lw0/b;

    sget v2, Lw0/p;->d:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lw0/p;->d:I

    invoke-direct {v1, v2, v0}, Lw0/b;-><init>(ILw0/n;)V

    sget-object v0, Lw0/p;->c:Lw0/n;

    iget v2, v1, Lw0/i;->b:I

    invoke-virtual {v0, v2}, Lw0/n;->o(I)Lw0/n;

    move-result-object v0

    sput-object v0, Lw0/p;->c:Lw0/n;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/i;

    sput-object v0, Lw0/p;->j:Lw0/i;

    new-instance v0, Lm0/e;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lw0/p;->k:Lm0/e;

    return-void
.end method

.method public static final a(Lc9/c;Lc9/c;)Lc9/c;
    .locals 2

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lw0/a;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, v1}, Lw0/a;-><init>(Lc9/c;Lc9/c;I)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    move-object p0, p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final b(Lw0/c;Lw0/c;Lw0/n;)Ljava/util/HashMap;
    .locals 12

    invoke-virtual {p1}, Lw0/c;->w()Lo0/d;

    move-result-object v0

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lw0/i;->e()Lw0/n;

    move-result-object v2

    invoke-virtual {p1}, Lw0/i;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Lw0/n;->o(I)Lw0/n;

    move-result-object v2

    iget-object v3, p1, Lw0/c;->k:Lw0/n;

    invoke-virtual {v2, v3}, Lw0/n;->n(Lw0/n;)Lw0/n;

    move-result-object v2

    iget-object v3, v0, Lo0/d;->b:[Ljava/lang/Object;

    iget v0, v0, Lo0/d;->a:I

    const/4 v4, 0x0

    move-object v5, v1

    :goto_0
    if-ge v4, v0, :cond_6

    aget-object v6, v3, v4

    const-string v7, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v6, v7}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lw0/g0;

    invoke-interface {v6}, Lw0/g0;->e()Lw0/i0;

    move-result-object v7

    invoke-static {v7, p0, p2}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v7, p0, v2}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v9

    if-nez v9, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v8, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {p1}, Lw0/i;->d()I

    move-result v10

    invoke-virtual {p1}, Lw0/i;->e()Lw0/n;

    move-result-object v11

    invoke-static {v7, v10, v11}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-interface {v6, v9, v8, v7}, Lw0/g0;->i(Lw0/i0;Lw0/i0;Lw0/i0;)Lw0/i0;

    move-result-object v6

    if-eqz v6, :cond_7

    if-nez v5, :cond_3

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_3
    move-object v7, v5

    invoke-interface {v5, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v7

    goto :goto_1

    :cond_4
    invoke-static {}, Lw0/p;->p()V

    throw v1

    :cond_5
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    move-object v1, v5

    :cond_7
    :goto_2
    return-object v1
.end method

.method public static final c(Lw0/i;)V
    .locals 3

    sget-object v0, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lw0/n;->k(I)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Snapshot is not open: id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", disposed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lw0/i;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", applied="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    instance-of v1, p0, Lw0/c;

    if-eqz v1, :cond_0

    check-cast p0, Lw0/c;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    iget-boolean p0, p0, Lw0/c;->n:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_1

    :cond_1
    const-string p0, "read-only"

    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", lowestPin="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    sget-object v1, Lw0/p;->e:Lw0/l;

    iget v2, v1, Lw0/l;->a:I

    if-lez v2, :cond_2

    iget-object v1, v1, Lw0/l;->b:[I

    const/4 v2, 0x0

    aget v1, v1, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_2
    const/4 v1, -0x1

    :goto_2
    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    return-void
.end method

.method public static final d(IILw0/n;)Lw0/n;
    .locals 0

    :goto_0
    if-ge p0, p1, :cond_0

    invoke-virtual {p2, p0}, Lw0/n;->o(I)Lw0/n;

    move-result-object p2

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public static final e(Lc9/c;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lw0/p;->j:Lw0/i;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lw0/b;

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lw0/b;

    iget-object v2, v2, Lw0/c;->i:Lo0/d;

    if-eqz v2, :cond_0

    sget-object v3, Lw0/p;->k:Lm0/e;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_6

    :cond_0
    :goto_0
    move-object v3, v1

    check-cast v3, Lw0/i;

    invoke-static {v3, p0}, Lw0/p;->t(Lw0/i;Lc9/c;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    const/4 v3, -0x1

    :try_start_1
    sget-object v4, Lw0/p;->g:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    move v6, v0

    :goto_1
    if-ge v6, v5, :cond_1

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc9/e;

    invoke-interface {v7, v2, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :cond_1
    sget-object v1, Lw0/p;->k:Lm0/e;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    goto :goto_3

    :goto_2
    sget-object v0, Lw0/p;->k:Lm0/e;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    throw p0

    :cond_2
    :goto_3
    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    invoke-static {}, Lw0/p;->f()V

    if-eqz v2, :cond_3

    iget-object v3, v2, Lo0/d;->b:[Ljava/lang/Object;

    iget v2, v2, Lo0/d;->a:I

    :goto_4
    if-ge v0, v2, :cond_3

    aget-object v4, v3, v0

    const-string v5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lw0/g0;

    invoke-static {v4}, Lw0/p;->o(Lw0/g0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :catchall_2
    move-exception p0

    goto :goto_5

    :cond_3
    monitor-exit v1

    return-object p0

    :goto_5
    monitor-exit v1

    throw p0

    :goto_6
    monitor-exit v0

    throw p0
.end method

.method public static final f()V
    .locals 7

    sget-object v0, Lw0/p;->f:Lw0/b0;

    iget v1, v0, Lw0/b0;->a:I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v3, v1, :cond_3

    iget-object v6, v0, Lw0/b0;->c:[Lm0/p3;

    aget-object v6, v6, v3

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    :cond_0
    if-eqz v5, :cond_2

    check-cast v5, Lw0/g0;

    invoke-static {v5}, Lw0/p;->n(Lw0/g0;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-nez v5, :cond_2

    if-eq v4, v3, :cond_1

    iget-object v5, v0, Lw0/b0;->c:[Lm0/p3;

    aput-object v6, v5, v4

    iget-object v5, v0, Lw0/b0;->b:[I

    aget v6, v5, v3

    aput v6, v5, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_1
    if-ge v3, v1, :cond_4

    iget-object v6, v0, Lw0/b0;->c:[Lm0/p3;

    aput-object v5, v6, v3

    iget-object v6, v0, Lw0/b0;->b:[I

    aput v2, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v4, v1, :cond_5

    iput v4, v0, Lw0/b0;->a:I

    :cond_5
    return-void
.end method

.method public static final g(Lw0/i;Lc9/c;Z)Lw0/i;
    .locals 8

    instance-of v0, p0, Lw0/c;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lw0/m0;

    invoke-direct {v0, p0, p1, p2}, Lw0/m0;-><init>(Lw0/i;Lc9/c;Z)V

    goto :goto_3

    :cond_1
    :goto_0
    new-instance v7, Lw0/l0;

    if-eqz v0, :cond_2

    check-cast p0, Lw0/c;

    :goto_1
    move-object v2, p0

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v7

    move-object v3, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lw0/l0;-><init>(Lw0/c;Lc9/c;Lc9/c;ZZ)V

    move-object v0, v7

    :goto_3
    return-object v0
.end method

.method public static final h(Lw0/i0;)Lw0/i0;
    .locals 3

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0}, Lw0/i;->e()Lw0/n;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v1

    invoke-virtual {v1}, Lw0/i;->d()I

    move-result v2

    invoke-virtual {v1}, Lw0/i;->e()Lw0/n;

    move-result-object v1

    invoke-static {p0, v2, v1}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lw0/p;->p()V

    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final i()Lw0/i;
    .locals 1

    sget-object v0, Lw0/p;->a:Lm0/h3;

    invoke-virtual {v0}, Lm0/h3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/i;

    if-nez v0, :cond_0

    sget-object v0, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/i;

    :cond_0
    return-object v0
.end method

.method public static final j(Lc9/c;Lc9/c;Z)Lc9/c;
    .locals 1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    invoke-static {p0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p2, Lw0/a;

    const/4 v0, 0x2

    invoke-direct {p2, p0, p1, v0}, Lw0/a;-><init>(Lc9/c;Lc9/c;I)V

    move-object p0, p2

    goto :goto_1

    :cond_1
    if-nez p0, :cond_2

    move-object p0, p1

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final k(Lw0/i0;Lw0/g0;)Lw0/i0;
    .locals 12

    invoke-interface {p1}, Lw0/g0;->e()Lw0/i0;

    move-result-object v0

    sget v1, Lw0/p;->d:I

    sget-object v2, Lw0/p;->e:Lw0/l;

    iget v3, v2, Lw0/l;->a:I

    const/4 v4, 0x0

    if-lez v3, :cond_0

    iget-object v1, v2, Lw0/l;->b:[I

    aget v1, v1, v4

    :cond_0
    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    move-object v5, v3

    :goto_0
    if-eqz v0, :cond_7

    iget v6, v0, Lw0/i0;->a:I

    if-nez v6, :cond_1

    :goto_1
    move-object v3, v0

    goto :goto_5

    :cond_1
    if-eqz v6, :cond_6

    if-gt v6, v1, :cond_6

    add-int/lit8 v6, v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x1

    const/16 v11, 0x40

    if-ltz v6, :cond_2

    if-ge v6, v11, :cond_2

    shl-long/2addr v9, v6

    and-long/2addr v9, v7

    cmp-long v6, v9, v7

    if-eqz v6, :cond_3

    :goto_2
    move v6, v2

    goto :goto_3

    :cond_2
    if-lt v6, v11, :cond_3

    const/16 v11, 0x80

    if-ge v6, v11, :cond_3

    add-int/lit8 v6, v6, -0x40

    shl-long/2addr v9, v6

    and-long/2addr v9, v7

    cmp-long v6, v9, v7

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    move v6, v4

    :goto_3
    if-nez v6, :cond_6

    if-nez v5, :cond_4

    move-object v5, v0

    goto :goto_4

    :cond_4
    iget v1, v0, Lw0/i0;->a:I

    iget v2, v5, Lw0/i0;->a:I

    if-ge v1, v2, :cond_5

    goto :goto_1

    :cond_5
    move-object v3, v5

    goto :goto_5

    :cond_6
    :goto_4
    iget-object v0, v0, Lw0/i0;->b:Lw0/i0;

    goto :goto_0

    :cond_7
    :goto_5
    const v0, 0x7fffffff

    if-eqz v3, :cond_8

    iput v0, v3, Lw0/i0;->a:I

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Lw0/i0;->b()Lw0/i0;

    move-result-object v3

    iput v0, v3, Lw0/i0;->a:I

    invoke-interface {p1}, Lw0/g0;->e()Lw0/i0;

    move-result-object p0

    iput-object p0, v3, Lw0/i0;->b:Lw0/i0;

    invoke-interface {p1, v3}, Lw0/g0;->k(Lw0/i0;)V

    :goto_6
    return-object v3
.end method

.method public static final l(Lw0/i;Lw0/g0;)V
    .locals 1

    invoke-virtual {p0}, Lw0/i;->h()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lw0/i;->s(I)V

    invoke-virtual {p0}, Lw0/i;->i()Lc9/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final m(Lw0/i0;Lw0/g0;Lw0/i;Lw0/i0;)Lw0/i0;
    .locals 2

    invoke-virtual {p2}, Lw0/i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lw0/i;->n(Lw0/g0;)V

    :cond_0
    invoke-virtual {p2}, Lw0/i;->d()I

    move-result v0

    iget v1, p3, Lw0/i0;->a:I

    if-ne v1, v0, :cond_1

    return-object p3

    :cond_1
    sget-object p3, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter p3

    :try_start_0
    invoke-static {p0, p1}, Lw0/p;->k(Lw0/i0;Lw0/g0;)Lw0/i0;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p3

    iput v0, p0, Lw0/i0;->a:I

    invoke-virtual {p2, p1}, Lw0/i;->n(Lw0/g0;)V

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p3

    throw p0
.end method

.method public static final n(Lw0/g0;)Z
    .locals 10

    invoke-interface {p0}, Lw0/g0;->e()Lw0/i0;

    move-result-object v0

    sget v1, Lw0/p;->d:I

    sget-object v2, Lw0/p;->e:Lw0/l;

    iget v3, v2, Lw0/l;->a:I

    const/4 v4, 0x0

    if-lez v3, :cond_0

    iget-object v1, v2, Lw0/l;->b:[I

    aget v1, v1, v4

    :cond_0
    const/4 v2, 0x0

    move-object v3, v2

    move v5, v4

    :goto_0
    if-eqz v0, :cond_9

    iget v6, v0, Lw0/i0;->a:I

    if-eqz v6, :cond_8

    if-ge v6, v1, :cond_7

    if-nez v2, :cond_1

    add-int/lit8 v5, v5, 0x1

    move-object v2, v0

    goto :goto_4

    :cond_1
    iget v7, v2, Lw0/i0;->a:I

    if-ge v6, v7, :cond_2

    move-object v6, v2

    move-object v2, v0

    goto :goto_1

    :cond_2
    move-object v6, v0

    :goto_1
    if-nez v3, :cond_6

    invoke-interface {p0}, Lw0/g0;->e()Lw0/i0;

    move-result-object v3

    move-object v7, v3

    :goto_2
    if-eqz v3, :cond_5

    iget v8, v3, Lw0/i0;->a:I

    if-lt v8, v1, :cond_3

    goto :goto_3

    :cond_3
    iget v9, v7, Lw0/i0;->a:I

    if-ge v9, v8, :cond_4

    move-object v7, v3

    :cond_4
    iget-object v3, v3, Lw0/i0;->b:Lw0/i0;

    goto :goto_2

    :cond_5
    move-object v3, v7

    :cond_6
    :goto_3
    iput v4, v2, Lw0/i0;->a:I

    invoke-virtual {v2, v3}, Lw0/i0;->a(Lw0/i0;)V

    move-object v2, v6

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v5, 0x1

    :cond_8
    :goto_4
    iget-object v0, v0, Lw0/i0;->b:Lw0/i0;

    goto :goto_0

    :cond_9
    const/4 p0, 0x1

    if-le v5, p0, :cond_a

    move v4, p0

    :cond_a
    return v4
.end method

.method public static final o(Lw0/g0;)V
    .locals 10

    invoke-static {p0}, Lw0/p;->n(Lw0/g0;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Lw0/p;->f:Lw0/b0;

    iget v1, v0, Lw0/b0;->a:I

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-lez v1, :cond_d

    iget v5, v0, Lw0/b0;->a:I

    add-int/lit8 v5, v5, -0x1

    move v6, v3

    :goto_0
    if-gt v6, v5, :cond_c

    add-int v7, v6, v5

    ushr-int/lit8 v7, v7, 0x1

    iget-object v8, v0, Lw0/b0;->b:[I

    aget v8, v8, v7

    if-ge v8, v2, :cond_0

    add-int/lit8 v6, v7, 0x1

    goto :goto_0

    :cond_0
    if-le v8, v2, :cond_1

    add-int/lit8 v5, v7, -0x1

    goto :goto_0

    :cond_1
    iget-object v5, v0, Lw0/b0;->c:[Lm0/p3;

    aget-object v5, v5, v7

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    if-ne p0, v5, :cond_3

    move v4, v7

    goto :goto_8

    :cond_3
    add-int/lit8 v5, v7, -0x1

    :goto_2
    if-ge v4, v5, :cond_7

    iget-object v8, v0, Lw0/b0;->b:[I

    aget v8, v8, v5

    if-eq v8, v2, :cond_4

    goto :goto_4

    :cond_4
    iget-object v8, v0, Lw0/b0;->c:[Lm0/p3;

    aget-object v8, v8, v5

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v8

    goto :goto_3

    :cond_5
    move-object v8, v6

    :goto_3
    if-ne v8, p0, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_7
    :goto_4
    add-int/lit8 v7, v7, 0x1

    iget v4, v0, Lw0/b0;->a:I

    move v5, v7

    :goto_5
    if-ge v5, v4, :cond_b

    iget-object v7, v0, Lw0/b0;->b:[I

    aget v7, v7, v5

    if-eq v7, v2, :cond_8

    add-int/lit8 v5, v5, 0x1

    neg-int v5, v5

    goto :goto_7

    :cond_8
    iget-object v7, v0, Lw0/b0;->c:[Lm0/p3;

    aget-object v7, v7, v5

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    goto :goto_6

    :cond_9
    move-object v7, v6

    :goto_6
    if-ne v7, p0, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    iget v4, v0, Lw0/b0;->a:I

    add-int/lit8 v4, v4, 0x1

    neg-int v5, v4

    :goto_7
    move v4, v5

    goto :goto_8

    :cond_c
    add-int/lit8 v6, v6, 0x1

    neg-int v4, v6

    :goto_8
    if-ltz v4, :cond_d

    goto :goto_a

    :cond_d
    add-int/lit8 v4, v4, 0x1

    neg-int v4, v4

    iget-object v5, v0, Lw0/b0;->c:[Lm0/p3;

    array-length v6, v5

    if-ne v1, v6, :cond_e

    mul-int/lit8 v6, v6, 0x2

    new-array v7, v6, [Lm0/p3;

    new-array v6, v6, [I

    add-int/lit8 v8, v4, 0x1

    invoke-static {v8, v4, v1, v5, v7}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iget-object v5, v0, Lw0/b0;->c:[Lm0/p3;

    const/4 v9, 0x6

    invoke-static {v5, v7, v3, v4, v9}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v3, v0, Lw0/b0;->b:[I

    invoke-static {v8, v4, v1, v3, v6}, Lb9/b;->G(III[I[I)V

    iget-object v1, v0, Lw0/b0;->b:[I

    invoke-static {v1, v6, v4, v9}, Lb9/b;->K([I[III)V

    iput-object v7, v0, Lw0/b0;->c:[Lm0/p3;

    iput-object v6, v0, Lw0/b0;->b:[I

    goto :goto_9

    :cond_e
    add-int/lit8 v3, v4, 0x1

    invoke-static {v3, v4, v1, v5, v5}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iget-object v5, v0, Lw0/b0;->b:[I

    invoke-static {v3, v4, v1, v5, v5}, Lb9/b;->G(III[I[I)V

    :goto_9
    iget-object v1, v0, Lw0/b0;->c:[Lm0/p3;

    new-instance v3, Lm0/p3;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    aput-object v3, v1, v4

    iget-object p0, v0, Lw0/b0;->b:[I

    aput v2, p0, v4

    iget p0, v0, Lw0/b0;->a:I

    add-int/lit8 p0, p0, 0x1

    iput p0, v0, Lw0/b0;->a:I

    :cond_f
    :goto_a
    return-void
.end method

.method public static final p()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final q(Lw0/i0;ILw0/n;)Lw0/i0;
    .locals 4

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_2

    iget v2, p0, Lw0/i0;->a:I

    if-eqz v2, :cond_1

    if-gt v2, p1, :cond_1

    invoke-virtual {p2, v2}, Lw0/n;->k(I)Z

    move-result v2

    if-nez v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v2, v1, Lw0/i0;->a:I

    iget v3, p0, Lw0/i0;->a:I

    if-ge v2, v3, :cond_1

    :goto_1
    move-object v1, p0

    :cond_1
    iget-object p0, p0, Lw0/i0;->b:Lw0/i0;

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public static final r(Lw0/i0;Lw0/g0;)Lw0/i0;
    .locals 2

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->f()Lc9/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0}, Lw0/i;->e()Lw0/n;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-interface {p1}, Lw0/g0;->e()Lw0/i0;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9"

    invoke-static {p1, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0}, Lw0/i;->e()Lw0/n;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    move-object p0, p1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-static {}, Lw0/p;->p()V

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static final s(I)V
    .locals 8

    sget-object v0, Lw0/p;->e:Lw0/l;

    iget-object v1, v0, Lw0/l;->d:[I

    aget v1, v1, p0

    iget v2, v0, Lw0/l;->a:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, Lw0/l;->b(II)V

    iget v2, v0, Lw0/l;->a:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lw0/l;->a:I

    iget-object v2, v0, Lw0/l;->b:[I

    aget v3, v2, v1

    move v4, v1

    :goto_0
    if-lez v4, :cond_0

    add-int/lit8 v5, v4, 0x1

    shr-int/lit8 v5, v5, 0x1

    add-int/lit8 v5, v5, -0x1

    aget v6, v2, v5

    if-le v6, v3, :cond_0

    invoke-virtual {v0, v5, v4}, Lw0/l;->b(II)V

    move v4, v5

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lw0/l;->b:[I

    iget v3, v0, Lw0/l;->a:I

    shr-int/lit8 v3, v3, 0x1

    :goto_1
    if-ge v1, v3, :cond_2

    add-int/lit8 v4, v1, 0x1

    shl-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v4, -0x1

    iget v6, v0, Lw0/l;->a:I

    if-ge v4, v6, :cond_1

    aget v6, v2, v4

    aget v7, v2, v5

    if-ge v6, v7, :cond_1

    aget v5, v2, v1

    if-ge v6, v5, :cond_2

    invoke-virtual {v0, v4, v1}, Lw0/l;->b(II)V

    move v1, v4

    goto :goto_1

    :cond_1
    aget v4, v2, v5

    aget v6, v2, v1

    if-ge v4, v6, :cond_2

    invoke-virtual {v0, v5, v1}, Lw0/l;->b(II)V

    move v1, v5

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lw0/l;->d:[I

    iget v2, v0, Lw0/l;->e:I

    aput v2, v1, p0

    iput p0, v0, Lw0/l;->e:I

    return-void
.end method

.method public static final t(Lw0/i;Lc9/c;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lw0/n;->i(I)Lw0/n;

    move-result-object v0

    invoke-interface {p1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Lw0/p;->d:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lw0/p;->d:I

    sget-object v2, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Lw0/n;->i(I)Lw0/n;

    move-result-object v2

    sput-object v2, Lw0/p;->c:Lw0/n;

    sget-object v3, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v4, Lw0/b;

    invoke-direct {v4, v1, v2}, Lw0/b;-><init>(ILw0/n;)V

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lw0/i;->c()V

    sget-object p0, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0, v1}, Lw0/n;->o(I)Lw0/n;

    move-result-object p0

    sput-object p0, Lw0/p;->c:Lw0/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final u(Lw0/i0;Lw0/g0;Lw0/i;)Lw0/i0;
    .locals 2

    invoke-virtual {p2}, Lw0/i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lw0/i;->n(Lw0/g0;)V

    :cond_0
    invoke-virtual {p2}, Lw0/i;->d()I

    move-result v0

    invoke-virtual {p2}, Lw0/i;->e()Lw0/n;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object p0

    if-eqz p0, :cond_2

    iget v0, p0, Lw0/i0;->a:I

    invoke-virtual {p2}, Lw0/i;->d()I

    move-result v1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0, p1}, Lw0/p;->k(Lw0/i0;Lw0/g0;)Lw0/i0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lw0/i0;->a(Lw0/i0;)V

    invoke-virtual {p2}, Lw0/i;->d()I

    move-result p0

    iput p0, v1, Lw0/i0;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p2, p1}, Lw0/i;->n(Lw0/g0;)V

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_2
    invoke-static {}, Lw0/p;->p()V

    const/4 p0, 0x0

    throw p0
.end method
