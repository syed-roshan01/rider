.class public final Lg8/k3;
.super Le8/x0;


# instance fields
.field public final a:Le8/u0;

.field public final b:Le8/q0;

.field public final c:Lg8/z;

.field public final d:Lg8/b0;

.field public e:Ljava/util/List;

.field public f:Lg8/j2;

.field public g:Z

.field public h:Z

.field public i:Lv6/d;

.field public final synthetic j:Lg8/l3;


# direct methods
.method public constructor <init>(Lg8/l3;Le8/u0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/k3;->j:Lg8/l3;

    iget-object v0, p2, Le8/u0;->b:Ljava/util/List;

    iput-object v0, p0, Lg8/k3;->e:Ljava/util/List;

    sget-object v0, Lg8/l3;->b0:Ljava/util/logging/Logger;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lg8/k3;->a:Le8/u0;

    iget-object v0, p1, Lg8/l3;->t:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Le8/q0;

    sget-object v2, Le8/q0;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    const-string v4, "Subchannel"

    invoke-direct {v1, v4, v0, v2, v3}, Le8/q0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iput-object v1, p0, Lg8/k3;->b:Le8/q0;

    new-instance v0, Lg8/b0;

    iget-object p1, p1, Lg8/l3;->l:Lg8/c6;

    move-object v2, p1

    check-cast v2, Lg8/k4;

    invoke-virtual {v2}, Lg8/k4;->a()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Subchannel for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p2, Le8/u0;->b:Ljava/util/List;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, v2, v3, p2}, Lg8/b0;-><init>(Le8/q0;JLjava/lang/String;)V

    iput-object v0, p0, Lg8/k3;->d:Lg8/b0;

    new-instance p2, Lg8/z;

    invoke-direct {p2, v0, p1}, Lg8/z;-><init>(Lg8/b0;Lg8/c6;)V

    iput-object p2, p0, Lg8/k3;->c:Lg8/z;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lg8/k3;->j:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iget-boolean v0, p0, Lg8/k3;->g:Z

    const-string v1, "not started"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/k3;->e:Ljava/util/List;

    return-object v0
.end method

.method public final c()Le8/c;
    .locals 1

    iget-object v0, p0, Lg8/k3;->a:Le8/u0;

    iget-object v0, v0, Le8/u0;->c:Le8/c;

    return-object v0
.end method

.method public final d()Le8/i;
    .locals 1

    iget-object v0, p0, Lg8/k3;->c:Lg8/z;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lg8/k3;->g:Z

    const-string v1, "Subchannel is not started"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/k3;->f:Lg8/j2;

    return-object v0
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lg8/k3;->j:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iget-boolean v0, p0, Lg8/k3;->g:Z

    const-string v1, "not started"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/k3;->f:Lg8/j2;

    iget-object v1, v0, Lg8/j2;->v:Lg8/u3;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lg8/j2;->k:Le8/h2;

    new-instance v2, Lg8/a2;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lg8/a2;-><init>(Lg8/j2;I)V

    invoke-virtual {v1, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final g()V
    .locals 8

    iget-object v0, p0, Lg8/k3;->j:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1}, Le8/h2;->d()V

    iget-object v1, p0, Lg8/k3;->f:Lg8/j2;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, Lg8/k3;->h:Z

    return-void

    :cond_0
    iget-boolean v1, p0, Lg8/k3;->h:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lg8/l3;->H:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg8/k3;->i:Lv6/d;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lv6/d;->c()V

    const/4 v1, 0x0

    iput-object v1, p0, Lg8/k3;->i:Lv6/d;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    iput-boolean v2, p0, Lg8/k3;->h:Z

    :goto_0
    iget-boolean v1, v0, Lg8/l3;->H:Z

    if-nez v1, :cond_3

    iget-object v2, v0, Lg8/l3;->m:Le8/h2;

    new-instance v3, Lg8/r2;

    new-instance v1, Lg8/t0;

    const/4 v4, 0x7

    invoke-direct {v1, p0, v4}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v3, v1}, Lg8/r2;-><init>(Ljava/lang/Runnable;)V

    const-wide/16 v4, 0x5

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, v0, Lg8/l3;->f:Lg8/x;

    iget-object v0, v0, Lg8/x;->a:Lg8/m0;

    invoke-interface {v0}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v7

    invoke-virtual/range {v2 .. v7}, Le8/h2;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lv6/d;

    move-result-object v0

    iput-object v0, p0, Lg8/k3;->i:Lv6/d;

    return-void

    :cond_3
    iget-object v0, p0, Lg8/k3;->f:Lg8/j2;

    sget-object v1, Lg8/l3;->e0:Le8/c2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lg8/b2;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lg8/b2;-><init>(Lg8/j2;Le8/c2;I)V

    iget-object v0, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h(Le8/y0;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lg8/k3;->j:Lg8/l3;

    iget-object v2, v1, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v2}, Le8/h2;->d()V

    iget-boolean v2, v0, Lg8/k3;->g:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    const-string v4, "already started"

    invoke-static {v4, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v2, v0, Lg8/k3;->h:Z

    xor-int/2addr v2, v3

    const-string v4, "already shutdown"

    invoke-static {v4, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v2, v1, Lg8/l3;->H:Z

    xor-int/2addr v2, v3

    const-string v4, "Channel is being terminated"

    invoke-static {v4, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-boolean v3, v0, Lg8/k3;->g:Z

    new-instance v2, Lg8/j2;

    iget-object v3, v0, Lg8/k3;->a:Le8/u0;

    iget-object v6, v3, Le8/u0;->b:Ljava/util/List;

    iget-object v3, v1, Lg8/l3;->t:Le8/j0;

    invoke-virtual {v3}, Le8/j0;->g()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v1, Lg8/l3;->s:Lr7/e;

    iget-object v9, v1, Lg8/l3;->f:Lg8/x;

    iget-object v3, v9, Lg8/x;->a:Lg8/m0;

    invoke-interface {v3}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v10

    iget-object v11, v1, Lg8/l3;->p:Lq6/m;

    iget-object v12, v1, Lg8/l3;->m:Le8/h2;

    new-instance v13, Lg8/v2;

    move-object/from16 v3, p1

    invoke-direct {v13, v0, v3}, Lg8/v2;-><init>(Lg8/k3;Le8/y0;)V

    iget-object v14, v1, Lg8/l3;->O:Le8/n0;

    new-instance v15, Lg8/y;

    iget-object v3, v1, Lg8/l3;->K:Lg8/v2;

    iget-object v3, v3, Lg8/v2;->a:Ljava/lang/Object;

    check-cast v3, Lg8/c6;

    invoke-direct {v15, v3}, Lg8/y;-><init>(Lg8/c6;)V

    iget-object v3, v0, Lg8/k3;->d:Lg8/b0;

    iget-object v4, v0, Lg8/k3;->b:Le8/q0;

    iget-object v5, v0, Lg8/k3;->c:Lg8/z;

    move-object/from16 v18, v5

    move-object v5, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    invoke-direct/range {v5 .. v18}, Lg8/j2;-><init>(Ljava/util/List;Ljava/lang/String;Lr7/e;Lg8/x;Ljava/util/concurrent/ScheduledExecutorService;Lq6/m;Le8/h2;Lg8/v2;Le8/n0;Lg8/y;Lg8/b0;Le8/q0;Lg8/z;)V

    const/4 v10, 0x0

    const-string v6, "Child Subchannel started"

    sget-object v7, Le8/l0;->a:Le8/l0;

    iget-object v3, v1, Lg8/l3;->l:Lg8/c6;

    check-cast v3, Lg8/k4;

    invoke-virtual {v3}, Lg8/k4;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "timestampNanos"

    invoke-static {v3, v4}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Le8/m0;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    move-object v5, v4

    move-object v11, v2

    invoke-direct/range {v5 .. v11}, Le8/m0;-><init>(Ljava/lang/String;Le8/l0;JLe8/p0;Le8/p0;)V

    iget-object v3, v1, Lg8/l3;->M:Lg8/b0;

    invoke-virtual {v3, v4}, Lg8/b0;->b(Le8/m0;)V

    iput-object v2, v0, Lg8/k3;->f:Lg8/j2;

    iget-object v3, v1, Lg8/l3;->O:Le8/n0;

    iget-object v3, v3, Le8/n0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Lg8/j2;->b()Le8/q0;

    move-result-object v4

    iget-wide v4, v4, Le8/q0;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/p0;

    iget-object v1, v1, Lg8/l3;->z:Ljava/util/HashSet;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i(Ljava/util/List;)V
    .locals 4

    iget-object v0, p0, Lg8/k3;->j:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iput-object p1, p0, Lg8/k3;->e:Ljava/util/List;

    iget-object v0, p0, Lg8/k3;->f:Lg8/j2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "newAddressGroups"

    invoke-static {p1, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "newAddressGroups contains null entry"

    invoke-static {v2, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "newAddressGroups is empty"

    invoke-static {v2, v1}, Ly3/e;->G(Ljava/lang/String;Z)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lg8/x1;

    const/16 v2, 0x12

    invoke-direct {v1, v2, v0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {p1, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/k3;->b:Le8/q0;

    invoke-virtual {v0}, Le8/q0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
