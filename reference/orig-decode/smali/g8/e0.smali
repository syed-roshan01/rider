.class public final Lg8/e0;
.super Lg8/q0;


# instance fields
.field public final synthetic c:Le8/c2;

.field public final synthetic d:Le8/l1;

.field public final synthetic e:Lg8/f0;


# direct methods
.method public constructor <init>(Lg8/f0;Le8/c2;Le8/l1;)V
    .locals 0

    iput-object p1, p0, Lg8/e0;->e:Lg8/f0;

    iput-object p2, p0, Lg8/e0;->c:Le8/c2;

    iput-object p3, p0, Lg8/e0;->d:Le8/l1;

    iget-object p1, p1, Lg8/f0;->c:Lg8/g0;

    iget-object p1, p1, Lg8/g0;->f:Le8/b0;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object v0, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v0, v0, Lg8/f0;->c:Lg8/g0;

    iget-object v0, v0, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lg8/e0;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lg8/e0;->c:Le8/c2;

    iget-object v1, p0, Lg8/e0;->d:Le8/l1;

    iget-object v2, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v2, v2, Lg8/f0;->b:Le8/c2;

    if-eqz v2, :cond_0

    new-instance v1, Le8/l1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object v0, v2

    :cond_0
    iget-object v2, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v2, v2, Lg8/f0;->c:Lg8/g0;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lg8/g0;->k:Z

    :try_start_0
    iget-object v2, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v3, v2, Lg8/f0;->c:Lg8/g0;

    iget-object v2, v2, Lg8/f0;->a:Le8/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v0, v1}, Le8/j;->onClose(Le8/c2;Le8/l1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v1, v1, Lg8/f0;->c:Lg8/g0;

    invoke-virtual {v1}, Lg8/g0;->b()V

    iget-object v1, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v1, v1, Lg8/f0;->c:Lg8/g0;

    iget-object v1, v1, Lg8/g0;->e:Lg8/y;

    invoke-virtual {v0}, Le8/c2;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lg8/y;->c:Lg8/s2;

    invoke-interface {v0}, Lg8/s2;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, v1, Lg8/y;->d:Lg8/s2;

    invoke-interface {v0}, Lg8/s2;->a()V

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v2, v2, Lg8/f0;->c:Lg8/g0;

    invoke-virtual {v2}, Lg8/g0;->b()V

    iget-object v2, p0, Lg8/e0;->e:Lg8/f0;

    iget-object v2, v2, Lg8/f0;->c:Lg8/g0;

    iget-object v2, v2, Lg8/g0;->e:Lg8/y;

    invoke-virtual {v0}, Le8/c2;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v2, Lg8/y;->c:Lg8/s2;

    invoke-interface {v0}, Lg8/s2;->a()V

    goto :goto_1

    :cond_2
    iget-object v0, v2, Lg8/y;->d:Lg8/s2;

    invoke-interface {v0}, Lg8/s2;->a()V

    :goto_1
    throw v1
.end method
