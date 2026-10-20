.class public Lg8/d1;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/h0;


# instance fields
.field public volatile a:Z

.field public b:Lg8/j0;

.field public c:Lg8/h0;

.field public d:Le8/c2;

.field public e:Ljava/util/List;

.field public f:Lg8/c1;

.field public g:J

.field public h:J

.field public i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/d1;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "May only be called after start"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/d1;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->a(I)V

    goto :goto_1

    :cond_1
    new-instance v0, Lg8/z0;

    invoke-direct {v0, p0, p1, v1}, Lg8/z0;-><init>(Lg8/d1;II)V

    invoke-virtual {p0, v0}, Lg8/d1;->r(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public final b(I)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "May only be called before start"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v2, Lg8/z0;

    invoke-direct {v2, p0, p1, v1}, Lg8/z0;-><init>(Lg8/d1;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Z)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "May only be called after start"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/d1;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->c(Z)V

    goto :goto_1

    :cond_1
    new-instance v0, Lg8/b1;

    invoke-direct {v0, p0, p1, v1}, Lg8/b1;-><init>(Lg8/d1;ZI)V

    invoke-virtual {p0, v0}, Lg8/d1;->r(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public final d(Le8/s;)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v0, "compressor"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v1, Lg8/x1;

    const/16 v2, 0x9

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e(I)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v1, Lg8/z0;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lg8/z0;-><init>(Lg8/d1;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lg8/u;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    if-eqz v0, :cond_1

    const-string v0, "buffered_nanos"

    iget-wide v1, p0, Lg8/d1;->h:J

    iget-wide v3, p0, Lg8/d1;->g:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->f(Lg8/u;)V

    goto :goto_0

    :cond_1
    const-string v0, "buffered_nanos"

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-wide v3, p0, Lg8/d1;->g:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waiting_for_connection"

    invoke-virtual {p1, v0}, Lg8/u;->b(Ljava/lang/Object;)V

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final flush()V
    .locals 2

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lg8/d1;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->flush()V

    goto :goto_1

    :cond_1
    new-instance v0, Lg8/a1;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lg8/a1;-><init>(Lg8/d1;I)V

    invoke-virtual {p0, v0}, Lg8/d1;->r(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public final g(Le8/c0;)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v1, Lg8/x1;

    const/16 v2, 0xb

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h(Le8/e0;)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v0, "decompressorRegistry"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v1, Lg8/x1;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i(Le8/c2;)V
    .locals 5

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "May only be called after start"

    invoke-static {v3, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v0, "reason"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    if-nez v0, :cond_2

    sget-object v3, Lg8/d4;->a:Lg8/d4;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const-string v4, "realStream already set to %s"

    invoke-static {v0, v4, v2}, Ly3/e;->M(Ljava/lang/Object;Ljava/lang/String;Z)V

    iput-object v3, p0, Lg8/d1;->c:Lg8/h0;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, p0, Lg8/d1;->h:J

    iput-object p1, p0, Lg8/d1;->d:Le8/c2;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    move v1, v2

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    new-instance v0, Lg8/x1;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/d1;->r(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lg8/d1;->s()V

    invoke-virtual {p0, p1}, Lg8/d1;->t(Le8/c2;)V

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    sget-object v1, Lg8/i0;->a:Lg8/i0;

    new-instance v2, Le8/l1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, p1, v1, v2}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    :goto_3
    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j(Lg8/j0;)V
    .locals 4

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "already started"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/d1;->d:Le8/c2;

    iget-boolean v1, p0, Lg8/d1;->a:Z

    if-nez v1, :cond_1

    new-instance v2, Lg8/c1;

    invoke-direct {v2, p1}, Lg8/c1;-><init>(Lg8/j0;)V

    iput-object v2, p0, Lg8/d1;->f:Lg8/c1;

    move-object p1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_1
    iput-object p1, p0, Lg8/d1;->b:Lg8/j0;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, p0, Lg8/d1;->g:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    sget-object v1, Lg8/i0;->a:Lg8/i0;

    new-instance v2, Le8/l1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0, v1, v2}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void

    :cond_2
    if-eqz v1, :cond_4

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->j(Lg8/j0;)V

    :cond_4
    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lg8/d1;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->k()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Ljava/io/InputStream;)V
    .locals 2

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v0, "message"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lg8/d1;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/z5;->l(Ljava/io/InputStream;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lg8/x1;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/d1;->r(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called before start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const-string v0, "authority"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v1, Lg8/x1;

    const/16 v2, 0xc

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final n()V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "May only be called before start"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v2, Lg8/a1;

    invoke-direct {v2, p0, v1}, Lg8/a1;-><init>(Lg8/d1;I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    new-instance v0, Lg8/a1;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lg8/a1;-><init>(Lg8/d1;I)V

    invoke-virtual {p0, v0}, Lg8/d1;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p()Le8/c;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lg8/h0;->p()Le8/c;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Le8/c;->b:Le8/c;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final q(Z)V
    .locals 3

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "May only be called before start"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    new-instance v2, Lg8/b1;

    invoke-direct {v2, p0, p1, v1}, Lg8/b1;-><init>(Lg8/d1;ZI)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final r(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lg8/d1;->b:Lg8/j0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "May only be called after start"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lg8/d1;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/d1;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final s()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lg8/d1;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/d1;->e:Ljava/util/List;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg8/d1;->a:Z

    iget-object v2, p0, Lg8/d1;->f:Lg8/c1;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    monitor-enter v2

    :try_start_1
    iget-object v4, v2, Lg8/c1;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    iput-object v0, v2, Lg8/c1;->c:Ljava/util/List;

    iput-boolean v1, v2, Lg8/c1;->b:Z

    monitor-exit v2

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    iget-object v4, v2, Lg8/c1;->c:Ljava/util/List;

    iput-object v3, v2, Lg8/c1;->c:Ljava/util/List;

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Runnable;

    invoke-interface {v5}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :cond_1
    invoke-interface {v4}, Ljava/util/List;->clear()V

    move-object v3, v4

    goto :goto_1

    :goto_3
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    :goto_4
    return-void

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_3
    :try_start_3
    iget-object v1, p0, Lg8/d1;->e:Ljava/util/List;

    iput-object v0, p0, Lg8/d1;->e:Ljava/util/List;

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_5

    :cond_4
    invoke-interface {v1}, Ljava/util/List;->clear()V

    move-object v0, v1

    goto :goto_0

    :goto_6
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public t(Le8/c2;)V
    .locals 0

    return-void
.end method

.method public final u(Lg8/h0;)Lg8/a1;
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const-string v0, "stream"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    const-string v4, "realStream already set to %s"

    invoke-static {v0, v4, v3}, Ly3/e;->M(Ljava/lang/Object;Ljava/lang/String;Z)V

    iput-object p1, p0, Lg8/d1;->c:Lg8/h0;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    iput-wide v3, p0, Lg8/d1;->h:J

    iget-object p1, p0, Lg8/d1;->b:Lg8/j0;

    if-nez p1, :cond_2

    iput-object v1, p0, Lg8/d1;->e:Ljava/util/List;

    iput-boolean v2, p0, Lg8/d1;->a:Z

    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    return-object v1

    :cond_3
    iget-object v0, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Runnable;

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_4
    iput-object v1, p0, Lg8/d1;->i:Ljava/util/ArrayList;

    iget-object v0, p0, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0, p1}, Lg8/h0;->j(Lg8/j0;)V

    new-instance p1, Lg8/a1;

    invoke-direct {p1, p0, v2}, Lg8/a1;-><init>(Lg8/d1;I)V

    return-object p1

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
