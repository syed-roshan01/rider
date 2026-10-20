.class public Lw0/c;
.super Lw0/i;


# static fields
.field public static final o:[I


# instance fields
.field public final f:Lc9/c;

.field public final g:Lc9/c;

.field public h:I

.field public i:Lo0/d;

.field public j:Ljava/util/ArrayList;

.field public k:Lw0/n;

.field public l:[I

.field public m:I

.field public n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lw0/c;->o:[I

    return-void
.end method

.method public constructor <init>(ILw0/n;Lc9/c;Lc9/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw0/i;-><init>(ILw0/n;)V

    iput-object p3, p0, Lw0/c;->f:Lc9/c;

    iput-object p4, p0, Lw0/c;->g:Lc9/c;

    sget-object p1, Lw0/n;->e:Lw0/n;

    iput-object p1, p0, Lw0/c;->k:Lw0/n;

    sget-object p1, Lw0/c;->o:[I

    iput-object p1, p0, Lw0/c;->l:[I

    const/4 p1, 0x1

    iput p1, p0, Lw0/c;->m:I

    return-void
.end method


# virtual methods
.method public A(Lc9/c;Lc9/c;)Lw0/c;
    .locals 9

    iget-boolean v0, p0, Lw0/i;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lw0/c;->n:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lw0/i;->d:I

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unsupported operation on a disposed or applied snapshot"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lw0/c;->y(I)V

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v3, Lw0/p;->d:I

    add-int/lit8 v2, v3, 0x1

    sput v2, Lw0/p;->d:I

    sget-object v2, Lw0/p;->c:Lw0/n;

    invoke-virtual {v2, v3}, Lw0/n;->o(I)Lw0/n;

    move-result-object v2

    sput-object v2, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->e()Lw0/n;

    move-result-object v2

    invoke-virtual {v2, v3}, Lw0/n;->o(I)Lw0/n;

    move-result-object v4

    invoke-virtual {p0, v4}, Lw0/i;->r(Lw0/n;)V

    new-instance v8, Lw0/d;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v4

    add-int/2addr v4, v1

    invoke-static {v4, v3, v2}, Lw0/p;->d(IILw0/n;)Lw0/n;

    move-result-object v4

    iget-object v2, p0, Lw0/c;->f:Lc9/c;

    invoke-static {p1, v2, v1}, Lw0/p;->j(Lc9/c;Lc9/c;Z)Lc9/c;

    move-result-object v5

    iget-object p1, p0, Lw0/c;->g:Lc9/c;

    invoke-static {p2, p1}, Lw0/p;->a(Lc9/c;Lc9/c;)Lc9/c;

    move-result-object v6

    move-object v2, v8

    move-object v7, p0

    invoke-direct/range {v2 .. v7}, Lw0/d;-><init>(ILw0/n;Lc9/c;Lc9/c;Lw0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    iget-boolean p1, p0, Lw0/c;->n:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lw0/i;->c:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result p1

    monitor-enter v0

    :try_start_1
    sget p2, Lw0/p;->d:I

    add-int/lit8 v2, p2, 0x1

    sput v2, Lw0/p;->d:I

    invoke-virtual {p0, p2}, Lw0/i;->q(I)V

    sget-object p2, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v2

    invoke-virtual {p2, v2}, Lw0/n;->o(I)Lw0/n;

    move-result-object p2

    sput-object p2, Lw0/p;->c:Lw0/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-virtual {p0}, Lw0/i;->e()Lw0/n;

    move-result-object p2

    add-int/2addr p1, v1

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v0

    invoke-static {p1, v0, p2}, Lw0/p;->d(IILw0/n;)Lw0/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw0/i;->r(Lw0/n;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_2
    :goto_1
    return-object v8

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot use a disposed snapshot"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 2

    sget-object v0, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lw0/n;->i(I)Lw0/n;

    move-result-object v0

    iget-object v1, p0, Lw0/c;->k:Lw0/n;

    invoke-virtual {v0, v1}, Lw0/n;->e(Lw0/n;)Lw0/n;

    move-result-object v0

    sput-object v0, Lw0/p;->c:Lw0/n;

    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Lw0/i;->c:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw0/i;->c:Z

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lw0/i;->d:I

    if-ltz v1, :cond_0

    invoke-static {v1}, Lw0/p;->s(I)V

    const/4 v1, -0x1

    iput v1, p0, Lw0/i;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    invoke-virtual {p0}, Lw0/c;->l()V

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()Lc9/c;
    .locals 1

    iget-object v0, p0, Lw0/c;->f:Lc9/c;

    return-object v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lw0/c;->h:I

    return v0
.end method

.method public final i()Lc9/c;
    .locals 1

    iget-object v0, p0, Lw0/c;->g:Lc9/c;

    return-object v0
.end method

.method public k()V
    .locals 1

    iget v0, p0, Lw0/c;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lw0/c;->m:I

    return-void
.end method

.method public l()V
    .locals 8

    iget v0, p0, Lw0/c;->m:I

    if-lez v0, :cond_6

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lw0/c;->m:I

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lw0/c;->n:Z

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lw0/c;->w()Lo0/d;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v1, p0, Lw0/c;->n:Z

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lw0/c;->z(Lo0/d;)V

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    iget-object v2, v0, Lo0/d;->b:[Ljava/lang/Object;

    iget v0, v0, Lo0/d;->a:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_4

    aget-object v5, v2, v4

    const-string v6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v5, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lw0/g0;

    invoke-interface {v5}, Lw0/g0;->e()Lw0/i0;

    move-result-object v5

    :goto_1
    if-eqz v5, :cond_2

    iget v6, v5, Lw0/i0;->a:I

    if-eq v6, v1, :cond_0

    iget-object v7, p0, Lw0/c;->k:Lw0/n;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v7, v6}, Lr8/p;->D0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    :cond_0
    iput v3, v5, Lw0/i0;->a:I

    :cond_1
    iget-object v5, v5, Lw0/i0;->b:Lw0/i0;

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported operation on a snapshot that has been applied"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, Lw0/i;->a()V

    :cond_5
    return-void

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no pending nested snapshots"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()V
    .locals 1

    iget-boolean v0, p0, Lw0/c;->n:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lw0/i;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lw0/c;->u()V

    :cond_1
    :goto_0
    return-void
.end method

.method public n(Lw0/g0;)V
    .locals 1

    invoke-virtual {p0}, Lw0/c;->w()Lo0/d;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lo0/d;

    invoke-direct {v0}, Lo0/d;-><init>()V

    invoke-virtual {p0, v0}, Lw0/c;->z(Lo0/d;)V

    :cond_0
    invoke-virtual {v0, p1}, Lo0/d;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lw0/c;->l:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lw0/c;->l:[I

    aget v2, v2, v1

    invoke-static {v2}, Lw0/p;->s(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lw0/i;->d:I

    if-ltz v0, :cond_1

    invoke-static {v0}, Lw0/p;->s(I)V

    const/4 v0, -0x1

    iput v0, p0, Lw0/i;->d:I

    :cond_1
    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Lw0/c;->h:I

    return-void
.end method

.method public t(Lc9/c;)Lw0/i;
    .locals 5

    iget-boolean v0, p0, Lw0/i;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lw0/c;->n:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lw0/i;->d:I

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unsupported operation on a disposed or applied snapshot"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v0

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    invoke-virtual {p0, v1}, Lw0/c;->y(I)V

    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget v2, Lw0/p;->d:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lw0/p;->d:I

    sget-object v3, Lw0/p;->c:Lw0/n;

    invoke-virtual {v3, v2}, Lw0/n;->o(I)Lw0/n;

    move-result-object v3

    sput-object v3, Lw0/p;->c:Lw0/n;

    new-instance v3, Lw0/e;

    invoke-virtual {p0}, Lw0/i;->e()Lw0/n;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0, v2, v4}, Lw0/p;->d(IILw0/n;)Lw0/n;

    move-result-object v0

    invoke-direct {v3, v2, v0, p1, p0}, Lw0/e;-><init>(ILw0/n;Lc9/c;Lw0/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v1

    iget-boolean p1, p0, Lw0/c;->n:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lw0/i;->c:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result p1

    monitor-enter v1

    :try_start_1
    sget v0, Lw0/p;->d:I

    add-int/lit8 v2, v0, 0x1

    sput v2, Lw0/p;->d:I

    invoke-virtual {p0, v0}, Lw0/i;->q(I)V

    sget-object v0, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v2

    invoke-virtual {v0, v2}, Lw0/n;->o(I)Lw0/n;

    move-result-object v0

    sput-object v0, Lw0/p;->c:Lw0/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    invoke-virtual {p0}, Lw0/i;->e()Lw0/n;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v1

    invoke-static {p1, v1, v0}, Lw0/p;->d(IILw0/n;)Lw0/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw0/i;->r(Lw0/n;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_2
    :goto_1
    return-object v3

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot use a disposed snapshot"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u()V
    .locals 4

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lw0/c;->y(I)V

    iget-boolean v0, p0, Lw0/c;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lw0/i;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v0

    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget v2, Lw0/p;->d:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lw0/p;->d:I

    invoke-virtual {p0, v2}, Lw0/i;->q(I)V

    sget-object v2, Lw0/p;->c:Lw0/n;

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Lw0/n;->o(I)Lw0/n;

    move-result-object v2

    sput-object v2, Lw0/p;->c:Lw0/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    invoke-virtual {p0}, Lw0/i;->e()Lw0/n;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lw0/i;->d()I

    move-result v2

    invoke-static {v0, v2, v1}, Lw0/p;->d(IILw0/n;)Lw0/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lw0/i;->r(Lw0/n;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public v()Ly/a0;
    .locals 9

    invoke-virtual {p0}, Lw0/c;->w()Lo0/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw0/c;

    sget-object v4, Lw0/p;->c:Lw0/n;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw0/b;

    iget v2, v2, Lw0/i;->b:I

    invoke-virtual {v4, v2}, Lw0/n;->i(I)Lw0/n;

    move-result-object v2

    invoke-static {v3, p0, v2}, Lw0/p;->b(Lw0/c;Lw0/c;Lw0/n;)Ljava/util/HashMap;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    sget-object v3, Lr8/r;->a:Lr8/r;

    sget-object v4, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    invoke-static {p0}, Lw0/p;->c(Lw0/i;)V

    if-eqz v0, :cond_3

    iget v5, v0, Lo0/d;->a:I

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    sget-object v3, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw0/b;

    sget v5, Lw0/p;->d:I

    sget-object v6, Lw0/p;->c:Lw0/n;

    iget v7, v3, Lw0/i;->b:I

    invoke-virtual {v6, v7}, Lw0/n;->i(I)Lw0/n;

    move-result-object v6

    invoke-virtual {p0, v5, v2, v6}, Lw0/c;->x(ILjava/util/HashMap;Lw0/n;)Ly/a0;

    move-result-object v2

    sget-object v5, Lw0/k;->a:Lw0/k;

    invoke-static {v2, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_2

    monitor-exit v4

    return-object v2

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lw0/c;->b()V

    sget-object v2, Lw0/o;->c:Lw0/o;

    invoke-static {v3, v2}, Lw0/p;->t(Lw0/i;Lc9/c;)Ljava/lang/Object;

    iget-object v2, v3, Lw0/c;->i:Lo0/d;

    invoke-virtual {p0, v1}, Lw0/c;->z(Lo0/d;)V

    iput-object v1, v3, Lw0/c;->i:Lo0/d;

    sget-object v3, Lw0/p;->g:Ljava/util/List;

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lw0/c;->b()V

    sget-object v2, Lw0/p;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw0/b;

    sget-object v5, Lw0/o;->c:Lw0/o;

    invoke-static {v2, v5}, Lw0/p;->t(Lw0/i;Lc9/c;)Ljava/lang/Object;

    iget-object v2, v2, Lw0/c;->i:Lo0/d;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lo0/d;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    sget-object v3, Lw0/p;->g:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_5
    :goto_2
    move-object v2, v1

    :goto_3
    monitor-exit v4

    const/4 v4, 0x1

    iput-boolean v4, p0, Lw0/c;->n:Z

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lo0/d;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    move v6, v4

    :goto_4
    if-ge v6, v5, :cond_7

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc9/e;

    invoke-interface {v7, v2, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lo0/d;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_7

    :cond_8
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    move v6, v4

    :goto_6
    if-ge v6, v5, :cond_9

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc9/e;

    invoke-interface {v7, v0, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    sget-object v3, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2
    invoke-virtual {p0}, Lw0/c;->o()V

    invoke-static {}, Lw0/p;->f()V

    if-eqz v2, :cond_a

    iget-object v5, v2, Lo0/d;->b:[Ljava/lang/Object;

    iget v2, v2, Lo0/d;->a:I

    move v6, v4

    :goto_8
    if-ge v6, v2, :cond_a

    aget-object v7, v5, v6

    const-string v8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v7, v8}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lw0/g0;

    invoke-static {v7}, Lw0/p;->o(Lw0/g0;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :catchall_1
    move-exception v0

    goto :goto_b

    :cond_a
    if-eqz v0, :cond_b

    iget-object v2, v0, Lo0/d;->b:[Ljava/lang/Object;

    iget v0, v0, Lo0/d;->a:I

    move v5, v4

    :goto_9
    if-ge v5, v0, :cond_b

    aget-object v6, v2, v5

    const-string v7, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v6, v7}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lw0/g0;

    invoke-static {v6}, Lw0/p;->o(Lw0/g0;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_b
    iget-object v0, p0, Lw0/c;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_a
    if-ge v4, v2, :cond_c

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw0/g0;

    invoke-static {v5}, Lw0/p;->o(Lw0/g0;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_c
    iput-object v1, p0, Lw0/c;->j:Ljava/util/ArrayList;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    sget-object v0, Lw0/k;->a:Lw0/k;

    return-object v0

    :goto_b
    monitor-exit v3

    throw v0

    :goto_c
    monitor-exit v4

    throw v0
.end method

.method public w()Lo0/d;
    .locals 1

    iget-object v0, p0, Lw0/c;->i:Lo0/d;

    return-object v0
.end method

.method public final x(ILjava/util/HashMap;Lw0/n;)Ly/a0;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Lw0/i;->e()Lw0/n;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lw0/i;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Lw0/n;->o(I)Lw0/n;

    move-result-object v2

    iget-object v3, v1, Lw0/c;->k:Lw0/n;

    invoke-virtual {v2, v3}, Lw0/n;->n(Lw0/n;)Lw0/n;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lw0/c;->w()Lo0/d;

    move-result-object v3

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v4, v3, Lo0/d;->b:[Ljava/lang/Object;

    iget v5, v3, Lo0/d;->a:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v8, v5, :cond_d

    aget-object v11, v4, v8

    const-string v12, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v11, v12}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lw0/g0;

    invoke-interface {v11}, Lw0/g0;->e()Lw0/i0;

    move-result-object v12

    move/from16 v13, p1

    move-object/from16 v14, p3

    invoke-static {v12, v13, v14}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v15

    if-nez v15, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lw0/i;->d()I

    move-result v7

    invoke-static {v12, v7, v2}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v7

    if-nez v7, :cond_3

    :cond_1
    :goto_1
    move-object/from16 v17, v2

    :cond_2
    :goto_2
    const/4 v2, 0x0

    goto/16 :goto_4

    :cond_3
    invoke-static {v15, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_1

    invoke-virtual/range {p0 .. p0}, Lw0/i;->d()I

    move-result v6

    move-object/from16 v17, v2

    invoke-virtual/range {p0 .. p0}, Lw0/i;->e()Lw0/n;

    move-result-object v2

    invoke-static {v12, v6, v2}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v2

    if-eqz v2, :cond_c

    if-eqz v0, :cond_4

    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw0/i0;

    if-nez v6, :cond_5

    :cond_4
    invoke-interface {v11, v7, v15, v2}, Lw0/g0;->i(Lw0/i0;Lw0/i0;Lw0/i0;)Lw0/i0;

    move-result-object v6

    :cond_5
    if-nez v6, :cond_6

    new-instance v0, Lw0/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_6
    invoke-static {v6, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v6, v15}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    if-nez v9, :cond_7

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    invoke-virtual {v15}, Lw0/i0;->b()Lw0/i0;

    move-result-object v2

    new-instance v6, Lq8/f;

    invoke-direct {v6, v11, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v10, :cond_8

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_8
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    if-nez v9, :cond_a

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_a
    invoke-static {v6, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    new-instance v2, Lq8/f;

    invoke-direct {v2, v11, v6}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_b
    invoke-virtual {v7}, Lw0/i0;->b()Lw0/i0;

    move-result-object v2

    new-instance v6, Lq8/f;

    invoke-direct {v6, v11, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v6

    :goto_3
    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_c
    invoke-static {}, Lw0/p;->p()V

    const/4 v2, 0x0

    throw v2

    :goto_4
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v17

    goto/16 :goto_0

    :cond_d
    if-eqz v9, :cond_e

    invoke-virtual/range {p0 .. p0}, Lw0/c;->u()V

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v0, :cond_e

    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    iget-object v5, v4, Lq8/f;->a:Ljava/lang/Object;

    check-cast v5, Lw0/g0;

    iget-object v4, v4, Lq8/f;->b:Ljava/lang/Object;

    check-cast v4, Lw0/i0;

    invoke-virtual/range {p0 .. p0}, Lw0/i;->d()I

    move-result v6

    iput v6, v4, Lw0/i0;->a:I

    sget-object v6, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    invoke-interface {v5}, Lw0/g0;->e()Lw0/i0;

    move-result-object v7

    iput-object v7, v4, Lw0/i0;->b:Lw0/i0;

    invoke-interface {v5, v4}, Lw0/g0;->k(Lw0/i0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v6

    throw v0

    :cond_e
    if-eqz v10, :cond_11

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    const/4 v7, 0x0

    :goto_6
    if-ge v7, v0, :cond_f

    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw0/g0;

    invoke-virtual {v3, v2}, Lo0/d;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_f
    iget-object v0, v1, Lw0/c;->j:Ljava/util/ArrayList;

    if-nez v0, :cond_10

    goto :goto_7

    :cond_10
    invoke-static {v10, v0}, Lr8/p;->P0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v10

    :goto_7
    iput-object v10, v1, Lw0/c;->j:Ljava/util/ArrayList;

    :cond_11
    sget-object v0, Lw0/k;->a:Lw0/k;

    return-object v0
.end method

.method public final y(I)V
    .locals 2

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/c;->k:Lw0/n;

    invoke-virtual {v1, p1}, Lw0/n;->o(I)Lw0/n;

    move-result-object p1

    iput-object p1, p0, Lw0/c;->k:Lw0/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public z(Lo0/d;)V
    .locals 0

    iput-object p1, p0, Lw0/c;->i:Lo0/d;

    return-void
.end method
