.class public final Ln9/d;
.super Ln9/e;


# instance fields
.field private volatile _immediate:Ln9/d;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ln9/d;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Ln9/d;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm9/z;-><init>()V

    iput-object p1, p0, Ln9/d;->c:Landroid/os/Handler;

    iput-object p2, p0, Ln9/d;->d:Ljava/lang/String;

    iput-boolean p3, p0, Ln9/d;->e:Z

    if-eqz p3, :cond_0

    move-object p3, p0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-object p3, p0, Ln9/d;->_immediate:Ln9/d;

    iget-object p3, p0, Ln9/d;->_immediate:Ln9/d;

    if-nez p3, :cond_1

    .line 2
    new-instance p3, Ln9/d;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Ln9/d;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    iput-object p3, p0, Ln9/d;->_immediate:Ln9/d;

    :cond_1
    iput-object p3, p0, Ln9/d;->f:Ln9/d;

    return-void
.end method


# virtual methods
.method public final M(JLm9/l;)V
    .locals 4

    new-instance v0, Ll/h;

    const/16 v1, 0x15

    invoke-direct {v0, p3, p0, v1}, Ll/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v3, p1, v1

    if-lez v3, :cond_0

    move-wide p1, v1

    :cond_0
    iget-object v1, p0, Ln9/d;->c:Landroid/os/Handler;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ld5/i1;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0, v0}, Ld5/i1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lm9/l;->v(Lc9/c;)V

    goto :goto_0

    :cond_1
    iget-object p1, p3, Lm9/l;->e:Lu8/j;

    invoke-virtual {p0, p1, v0}, Ln9/d;->f0(Lu8/j;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final Q(JLjava/lang/Runnable;Lu8/j;)Lm9/o0;
    .locals 3

    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    move-wide p1, v0

    :cond_0
    iget-object v0, p0, Ln9/d;->c:Landroid/os/Handler;

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ln9/c;

    invoke-direct {p1, p0, p3}, Ln9/c;-><init>(Ln9/d;Ljava/lang/Runnable;)V

    return-object p1

    :cond_1
    invoke-virtual {p0, p4, p3}, Ln9/d;->f0(Lu8/j;Ljava/lang/Runnable;)V

    sget-object p1, Lm9/u1;->a:Lm9/u1;

    return-object p1
.end method

.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ln9/d;->c:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Ln9/d;->f0(Lu8/j;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final d0()Z
    .locals 2

    iget-boolean v0, p0, Ln9/d;->e:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ln9/d;->c:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ln9/d;

    if-eqz v0, :cond_0

    check-cast p1, Ln9/d;

    iget-object p1, p1, Ln9/d;->c:Landroid/os/Handler;

    iget-object v0, p0, Ln9/d;->c:Landroid/os/Handler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p1, v1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v1

    check-cast v1, Lm9/f1;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    sget-object v0, Lm9/m0;->b:Lt9/c;

    invoke-virtual {v0, p1, p2}, Lt9/c;->c0(Lu8/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ln9/d;->c:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lm9/m0;->a:Lt9/d;

    sget-object v0, Lr9/o;->a:Lm9/s1;

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    check-cast v0, Ln9/d;

    iget-object v0, v0, Ln9/d;->f:Ln9/d;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    iget-object v0, p0, Ln9/d;->d:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Ln9/d;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-boolean v1, p0, Ln9/d;->e:Z

    if-eqz v1, :cond_3

    const-string v1, ".immediate"

    invoke-static {v0, v1}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_3
    return-object v0
.end method
