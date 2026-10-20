.class public final Lg8/f0;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/j0;


# instance fields
.field public final a:Le8/j;

.field public b:Le8/c2;

.field public final synthetic c:Lg8/g0;


# direct methods
.method public constructor <init>(Lg8/g0;Le8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/f0;->c:Lg8/g0;

    const-string p1, "observer"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/f0;->a:Le8/j;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 2

    iget-object v0, p0, Lg8/f0;->c:Lg8/g0;

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object v1, v0, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    invoke-static {}, Lo8/b;->c()V

    iget-object v0, v0, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lg8/d0;

    invoke-direct {v1, p0, p1}, Lg8/d0;-><init>(Lg8/f0;Lg8/a6;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lg8/f0;->c:Lg8/g0;

    iget-object v1, v0, Lg8/g0;->a:Le8/p1;

    iget-object v1, v1, Le8/p1;->a:Le8/o1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Le8/o1;->a:Le8/o1;

    if-eq v1, v2, :cond_1

    sget-object v2, Le8/o1;->b:Le8/o1;

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->a()V

    invoke-static {}, Lo8/b;->c()V

    iget-object v0, v0, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lg8/c0;

    invoke-direct {v1, p0}, Lg8/c0;-><init>(Lg8/f0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_1
    :goto_1
    return-void
.end method

.method public final c(Le8/c2;Lg8/i0;Le8/l1;)V
    .locals 0

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object p2, p0, Lg8/f0;->c:Lg8/g0;

    iget-object p2, p2, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    invoke-virtual {p0, p1, p3}, Lg8/f0;->e(Le8/c2;Le8/l1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object p2, Lo8/b;->a:Lo8/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final d(Le8/l1;)V
    .locals 2

    iget-object v0, p0, Lg8/f0;->c:Lg8/g0;

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object v1, v0, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    invoke-static {}, Lo8/b;->c()V

    iget-object v0, v0, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lg8/d0;

    invoke-direct {v1, p0, p1}, Lg8/d0;-><init>(Lg8/f0;Le8/l1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final e(Le8/c2;Le8/l1;)V
    .locals 4

    iget-object v0, p0, Lg8/f0;->c:Lg8/g0;

    iget-object v1, v0, Lg8/g0;->i:Le8/h;

    iget-object v1, v1, Le8/h;->a:Le8/c0;

    iget-object v2, v0, Lg8/g0;->f:Le8/b0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :cond_0
    iget-object v2, p1, Le8/c2;->a:Le8/z1;

    sget-object v3, Le8/z1;->d:Le8/z1;

    if-ne v2, v3, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Le8/c0;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Lg8/u;

    invoke-direct {p1}, Lg8/u;-><init>()V

    iget-object p2, v0, Lg8/g0;->j:Lg8/h0;

    invoke-interface {p2, p1}, Lg8/h0;->f(Lg8/u;)V

    sget-object p2, Le8/c2;->h:Le8/c2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ClientCall was cancelled at or after deadline. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance p2, Le8/l1;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :cond_1
    invoke-static {}, Lo8/b;->c()V

    new-instance v1, Lg8/e0;

    invoke-direct {v1, p0, p1, p2}, Lg8/e0;-><init>(Lg8/f0;Le8/c2;Le8/l1;)V

    iget-object p1, v0, Lg8/g0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
