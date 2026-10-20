.class public final Lg8/j2;
.super Ljava/lang/Object;

# interfaces
.implements Le8/p0;


# instance fields
.field public final a:Le8/q0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lr7/e;

.field public final e:Lg8/v2;

.field public final f:Lg8/m0;

.field public final g:Ljava/util/concurrent/ScheduledExecutorService;

.field public final h:Le8/n0;

.field public final i:Lg8/y;

.field public final j:Le8/i;

.field public final k:Le8/h2;

.field public final l:Lk3/b;

.field public volatile m:Ljava/util/List;

.field public n:Lg8/i1;

.field public final o:Lq6/l;

.field public p:Lv6/d;

.field public q:Lv6/d;

.field public r:Lg8/u3;

.field public final s:Ljava/util/ArrayList;

.field public final t:Lg8/z1;

.field public u:Lg8/o0;

.field public volatile v:Lg8/u3;

.field public volatile w:Le8/y;

.field public x:Le8/c2;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lr7/e;Lg8/x;Ljava/util/concurrent/ScheduledExecutorService;Lq6/m;Le8/h2;Lg8/v2;Le8/n0;Lg8/y;Lg8/b0;Le8/q0;Lg8/z;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lg8/j2;->s:Ljava/util/ArrayList;

    new-instance v4, Lg8/z1;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lg8/z1;-><init>(Le8/p0;I)V

    iput-object v4, v0, Lg8/j2;->t:Lg8/z1;

    sget-object v4, Le8/x;->d:Le8/x;

    invoke-static {v4}, Le8/y;->a(Le8/x;)Le8/y;

    move-result-object v4

    iput-object v4, v0, Lg8/j2;->w:Le8/y;

    const-string v4, "addressGroups"

    invoke-static {p1, v4}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    const-string v5, "addressGroups is empty"

    invoke-static {v5, v4}, Ly3/e;->G(Ljava/lang/String;Z)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "addressGroups contains null entry"

    invoke-static {v5, v6}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lg8/j2;->m:Ljava/util/List;

    new-instance v4, Lk3/b;

    invoke-direct {v4, v1}, Lk3/b;-><init>(Ljava/util/List;)V

    iput-object v4, v0, Lg8/j2;->l:Lk3/b;

    move-object v1, p2

    iput-object v1, v0, Lg8/j2;->b:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, v0, Lg8/j2;->c:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lg8/j2;->d:Lr7/e;

    move-object v1, p4

    iput-object v1, v0, Lg8/j2;->f:Lg8/m0;

    move-object v1, p5

    iput-object v1, v0, Lg8/j2;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p6}, Lq6/m;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq6/l;

    iput-object v1, v0, Lg8/j2;->o:Lq6/l;

    move-object v1, p7

    iput-object v1, v0, Lg8/j2;->k:Le8/h2;

    move-object v1, p8

    iput-object v1, v0, Lg8/j2;->e:Lg8/v2;

    move-object/from16 v1, p9

    iput-object v1, v0, Lg8/j2;->h:Le8/n0;

    move-object/from16 v1, p10

    iput-object v1, v0, Lg8/j2;->i:Lg8/y;

    const-string v1, "channelTracer"

    move-object/from16 v4, p11

    invoke-static {v4, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "logId"

    invoke-static {v2, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lg8/j2;->a:Le8/q0;

    const-string v1, "channelLogger"

    invoke-static {v3, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, v0, Lg8/j2;->j:Le8/i;

    return-void
.end method

.method public static g(Lg8/j2;Le8/x;)V
    .locals 1

    iget-object v0, p0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    invoke-static {p1}, Le8/y;->a(Le8/x;)Le8/y;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg8/j2;->i(Le8/y;)V

    return-void
.end method

.method public static h(Lg8/j2;)V
    .locals 8

    iget-object v0, p0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iget-object v1, p0, Lg8/j2;->p:Lv6/d;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const-string v3, "Should have no reconnectTask scheduled"

    invoke-static {v3, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v1, p0, Lg8/j2;->l:Lk3/b;

    iget v3, v1, Lk3/b;->b:I

    if-nez v3, :cond_1

    iget v3, v1, Lk3/b;->c:I

    if-nez v3, :cond_1

    iget-object v3, p0, Lg8/j2;->o:Lq6/l;

    iput-boolean v2, v3, Lq6/l;->a:Z

    invoke-virtual {v3}, Lq6/l;->b()V

    :cond_1
    iget-object v2, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget v3, v1, Lk3/b;->b:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/g0;

    iget-object v2, v2, Le8/g0;->a:Ljava/util/List;

    iget v3, v1, Lk3/b;->c:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/SocketAddress;

    instance-of v3, v2, Le8/k0;

    if-eqz v3, :cond_2

    check-cast v2, Le8/k0;

    iget-object v3, v2, Le8/k0;->b:Ljava/net/InetSocketAddress;

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    :goto_1
    iget-object v4, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget v1, v1, Lk3/b;->b:I

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/g0;

    iget-object v1, v1, Le8/g0;->b:Le8/c;

    sget-object v4, Le8/g0;->d:Le8/b;

    iget-object v5, v1, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v5, v4}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lg8/l0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const-string v6, "unknown-authority"

    iput-object v6, v5, Lg8/l0;->a:Ljava/lang/String;

    sget-object v6, Le8/c;->b:Le8/c;

    iput-object v6, v5, Lg8/l0;->b:Le8/c;

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    iget-object v4, p0, Lg8/j2;->b:Ljava/lang/String;

    :goto_2
    const-string v6, "authority"

    invoke-static {v4, v6}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v4, v5, Lg8/l0;->a:Ljava/lang/String;

    iput-object v1, v5, Lg8/l0;->b:Le8/c;

    iget-object v1, p0, Lg8/j2;->c:Ljava/lang/String;

    iput-object v1, v5, Lg8/l0;->c:Ljava/lang/String;

    iput-object v2, v5, Lg8/l0;->d:Le8/k0;

    new-instance v1, Lg8/i2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lg8/j2;->a:Le8/q0;

    iput-object v2, v1, Lg8/i2;->d:Le8/q0;

    new-instance v2, Lg8/f2;

    iget-object v4, p0, Lg8/j2;->f:Lg8/m0;

    invoke-interface {v4, v3, v5, v1}, Lg8/m0;->a0(Ljava/net/SocketAddress;Lg8/l0;Lg8/i2;)Lg8/o0;

    move-result-object v3

    iget-object v4, p0, Lg8/j2;->i:Lg8/y;

    invoke-direct {v2, v3, v4}, Lg8/f2;-><init>(Lg8/o0;Lg8/y;)V

    invoke-virtual {v2}, Lg8/m1;->b()Le8/q0;

    move-result-object v3

    iput-object v3, v1, Lg8/i2;->d:Le8/q0;

    iget-object v3, p0, Lg8/j2;->h:Le8/n0;

    iget-object v3, v3, Le8/n0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lg8/m1;->b()Le8/q0;

    move-result-object v4

    iget-wide v4, v4, Le8/q0;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/p0;

    iput-object v2, p0, Lg8/j2;->u:Lg8/o0;

    iget-object v3, p0, Lg8/j2;->s:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lg8/h2;

    invoke-direct {v3, p0, v2}, Lg8/h2;-><init>(Lg8/j2;Lg8/f2;)V

    invoke-virtual {v2, v3}, Lg8/m1;->e(Lg8/t3;)Ljava/lang/Runnable;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v0, v2}, Le8/h2;->b(Ljava/lang/Runnable;)V

    :cond_4
    iget-object v0, v1, Lg8/i2;->d:Le8/q0;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object p0, p0, Lg8/j2;->j:Le8/i;

    const-string v1, "Started transport {0}"

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1, v0}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static j(Le8/c2;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le8/c2;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object p0, p0, Le8/c2;->c:Ljava/lang/Throwable;

    if-eqz p0, :cond_1

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Le8/q0;
    .locals 1

    iget-object v0, p0, Lg8/j2;->a:Le8/q0;

    return-object v0
.end method

.method public final i(Le8/y;)V
    .locals 5

    iget-object v0, p0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iget-object v0, p0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    iget-object v1, p1, Le8/y;->a:Le8/x;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    sget-object v1, Le8/x;->e:Le8/x;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Cannot transition out of SHUTDOWN to "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-object p1, p0, Lg8/j2;->w:Le8/y;

    iget-object v0, p0, Lg8/j2;->e:Lg8/v2;

    iget-object v0, v0, Lg8/v2;->a:Ljava/lang/Object;

    check-cast v0, Le8/y0;

    if-eqz v0, :cond_1

    move v2, v3

    :cond_1
    const-string v1, "listener is null"

    invoke-static {v1, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    invoke-interface {v0, p1}, Le8/y0;->a(Le8/y;)V

    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Lg8/j2;->a:Le8/q0;

    iget-wide v1, v1, Le8/q0;->c:J

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Lq6/g;->b(Ljava/lang/String;J)V

    const-string v1, "addressGroups"

    iget-object v2, p0, Lg8/j2;->m:Ljava/util/List;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
