.class public abstract Lm9/w0;
.super Lm9/z;


# static fields
.field public static final synthetic f:I


# instance fields
.field public c:J

.field public d:Z

.field public e:Lr8/l;


# virtual methods
.method public final f0(Z)V
    .locals 4

    iget-wide v0, p0, Lm9/w0;->c:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    sub-long/2addr v0, v2

    iput-wide v0, p0, Lm9/w0;->c:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, Lm9/w0;->d:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lm9/w0;->shutdown()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final g0(Lm9/l0;)V
    .locals 1

    iget-object v0, p0, Lm9/w0;->e:Lr8/l;

    if-nez v0, :cond_0

    new-instance v0, Lr8/l;

    invoke-direct {v0}, Lr8/l;-><init>()V

    iput-object v0, p0, Lm9/w0;->e:Lr8/l;

    :cond_0
    invoke-virtual {v0, p1}, Lr8/l;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract h0()Ljava/lang/Thread;
.end method

.method public final i0(Z)V
    .locals 4

    iget-wide v0, p0, Lm9/w0;->c:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Lm9/w0;->c:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/w0;->d:Z

    :cond_1
    return-void
.end method

.method public final j0()Z
    .locals 4

    iget-wide v0, p0, Lm9/w0;->c:J

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract k0()J
.end method

.method public final l0()Z
    .locals 3

    iget-object v0, p0, Lm9/w0;->e:Lr8/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lr8/l;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lr8/l;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Lm9/l0;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lm9/l0;->run()V

    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method public m0(JLm9/t0;)V
    .locals 1

    sget-object v0, Lm9/f0;->q:Lm9/f0;

    invoke-virtual {v0, p1, p2, p3}, Lm9/v0;->q0(JLm9/t0;)V

    return-void
.end method

.method public abstract shutdown()V
.end method
