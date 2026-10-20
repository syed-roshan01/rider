.class public abstract Lg8/b;
.super Lg8/l;

# interfaces
.implements Lg8/h0;
.implements Lg8/a4;


# static fields
.field public static final i:Ljava/util/logging/Logger;


# instance fields
.field public final c:Lg8/e6;

.field public final d:Lg8/p1;

.field public final e:Z

.field public final f:Z

.field public g:Le8/l1;

.field public volatile h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lg8/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/b;->i:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(La4/q;Lg8/y5;Lg8/e6;Le8/l1;Le8/h;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "headers"

    invoke-static {p4, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "transportTracer"

    invoke-static {p3, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lg8/b;->c:Lg8/e6;

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v0, Lg8/s1;->n:Lv6/d;

    invoke-virtual {p5, v0}, Le8/h;->a(Lv6/d;)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p3, p5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    iput-boolean p3, p0, Lg8/b;->e:Z

    iput-boolean p6, p0, Lg8/b;->f:Z

    if-nez p6, :cond_0

    new-instance p3, Lg8/b4;

    invoke-direct {p3, p0, p1, p2}, Lg8/b4;-><init>(Lg8/a4;La4/q;Lg8/y5;)V

    iput-object p3, p0, Lg8/b;->d:Lg8/p1;

    iput-object p4, p0, Lg8/b;->g:Le8/l1;

    goto :goto_0

    :cond_0
    new-instance p1, Lj0/b0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p0, p1, Lj0/b0;->e:Ljava/lang/Object;

    iput-object p4, p1, Lj0/b0;->b:Ljava/lang/Object;

    iput-object p2, p1, Lj0/b0;->c:Ljava/lang/Object;

    iput-object p1, p0, Lg8/b;->d:Lg8/p1;

    :goto_0
    return-void
.end method


# virtual methods
.method public final A(Lh8/t;ZZI)V
    .locals 5

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "null frame before EOS"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->o:Lk6/w4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lo8/b;->d()V

    if-nez p1, :cond_2

    :try_start_0
    sget-object p1, Lh8/l;->r:Lja/g;

    goto :goto_2

    :cond_2
    iget-object p1, p1, Lh8/t;->a:Lja/g;

    iget-wide v1, p1, Lja/g;->b:J

    long-to-int v1, v1

    if-lez v1, :cond_3

    iget-object v2, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v2, Lh8/l;

    iget-object v2, v2, Lh8/l;->n:Lh8/k;

    iget-object v3, v2, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget v4, v2, Lg8/f;->e:I

    add-int/2addr v4, v1

    iput v4, v2, Lg8/f;->e:I

    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    :cond_3
    :goto_2
    iget-object v1, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v1, Lh8/l;

    iget-object v1, v1, Lh8/l;->n:Lh8/k;

    iget-object v1, v1, Lh8/k;->x:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v2, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v2, Lh8/l;

    iget-object v2, v2, Lh8/l;->n:Lh8/k;

    invoke-static {v2, p1, p2, p3}, Lh8/k;->m(Lh8/k;Lja/g;ZZ)V

    iget-object p1, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast p1, Lh8/l;

    iget-object p1, p1, Lg8/b;->c:Lg8/e6;

    if-nez p4, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lg8/e6;->a:Lg8/c6;

    check-cast p1, Lg8/k4;

    invoke-virtual {p1}, Lg8/k4;->a()J

    :goto_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_6
    sget-object p2, Lo8/b;->a:Lo8/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
.end method

.method public final b(I)V
    .locals 1

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->n:Lh8/k;

    iget-object v0, v0, Lg8/f;->a:Lg8/r0;

    invoke-interface {v0, p1}, Lg8/r0;->b(I)V

    return-void
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Lg8/b;->d:Lg8/p1;

    invoke-interface {v0, p1}, Lg8/p1;->e(I)V

    return-void
.end method

.method public final f(Lg8/u;)V
    .locals 2

    move-object v0, p0

    check-cast v0, Lh8/l;

    sget-object v1, Le8/i;->a:Le8/b;

    iget-object v0, v0, Lh8/l;->p:Le8/c;

    iget-object v0, v0, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "remote_addr"

    invoke-virtual {p1, v0, v1}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Le8/c0;)V
    .locals 6

    iget-object v0, p0, Lg8/b;->g:Le8/l1;

    sget-object v1, Lg8/s1;->c:Le8/g1;

    invoke-virtual {v0, v1}, Le8/l1;->a(Le8/i1;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0}, Le8/c0;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iget-object p1, p0, Lg8/b;->g:Le8/l1;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    return-void
.end method

.method public final h(Le8/e0;)V
    .locals 3

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->n:Lh8/k;

    iget-object v1, v0, Lg8/a;->j:Lg8/j0;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Already called start"

    invoke-static {v2, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v1, "decompressorRegistry"

    invoke-static {p1, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, v0, Lg8/a;->l:Le8/e0;

    return-void
.end method

.method public final i(Le8/c2;)V
    .locals 4

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Should not cancel with OK status"

    invoke-static {v2, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    iput-boolean v1, p0, Lg8/b;->h:Z

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->o:Lk6/w4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object v2, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v2, Lh8/l;

    iget-object v2, v2, Lh8/l;->n:Lh8/k;

    iget-object v2, v2, Lh8/k;->x:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->n:Lh8/k;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, p1, v1}, Lh8/k;->n(Le8/l1;Le8/c2;Z)V

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_4
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final j(Lg8/j0;)V
    .locals 4

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v1, v0, Lh8/l;->n:Lh8/k;

    iget-object v2, v1, Lg8/a;->j:Lg8/j0;

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Already called setListener"

    invoke-static {v3, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-object p1, v1, Lg8/a;->j:Lg8/j0;

    iget-boolean p1, p0, Lg8/b;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lg8/b;->g:Le8/l1;

    iget-object v0, v0, Lh8/l;->o:Lk6/w4;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lk6/w4;->A(Le8/l1;[B)V

    iput-object v1, p0, Lg8/b;->g:Le8/l1;

    :cond_1
    return-void
.end method

.method public final k()Z
    .locals 1

    invoke-super {p0}, Lg8/l;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lg8/b;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()V
    .locals 2

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v1, v0, Lh8/l;->n:Lh8/k;

    iget-boolean v1, v1, Lg8/a;->o:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Lh8/l;->n:Lh8/k;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg8/a;->o:Z

    iget-object v0, p0, Lg8/b;->d:Lg8/p1;

    invoke-interface {v0}, Lg8/p1;->close()V

    :cond_0
    return-void
.end method

.method public final q(Z)V
    .locals 1

    move-object v0, p0

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->n:Lh8/k;

    iput-boolean p1, v0, Lg8/a;->k:Z

    return-void
.end method

.method public final s()Lg8/p1;
    .locals 1

    iget-object v0, p0, Lg8/b;->d:Lg8/p1;

    return-object v0
.end method
