.class public final Lh8/c;
.super Ljava/lang/Object;

# interfaces
.implements Lja/e0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lja/g;

.field public final c:Lg8/r5;

.field public final d:Lh8/d;

.field public final e:I

.field public f:Z

.field public n:Z

.field public o:Z

.field public p:Lja/e0;

.field public q:Ljava/net/Socket;

.field public r:Z

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Lg8/r5;Lh8/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh8/c;->a:Ljava/lang/Object;

    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh8/c;->b:Lja/g;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh8/c;->f:Z

    iput-boolean v0, p0, Lh8/c;->n:Z

    iput-boolean v0, p0, Lh8/c;->o:Z

    const-string v0, "executor"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lh8/c;->c:Lg8/r5;

    const-string p1, "exceptionHandler"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lh8/c;->d:Lh8/d;

    const/16 p1, 0x2710

    iput p1, p0, Lh8/c;->e:I

    return-void
.end method


# virtual methods
.method public final a(Lja/b;Ljava/net/Socket;)V
    .locals 2

    iget-object v0, p0, Lh8/c;->p:Lja/e0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "AsyncSink\'s becomeConnected should only be called once."

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-object p1, p0, Lh8/c;->p:Lja/e0;

    iput-object p2, p0, Lh8/c;->q:Ljava/net/Socket;

    return-void
.end method

.method public final b0(Lja/g;J)V
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lh8/c;->o:Z

    if-nez v0, :cond_4

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object v0, p0, Lh8/c;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lh8/c;->b:Lja/g;

    invoke-virtual {v1, p1, p2, p3}, Lja/g;->b0(Lja/g;J)V

    iget p1, p0, Lh8/c;->t:I

    iget p2, p0, Lh8/c;->s:I

    add-int/2addr p1, p2

    iput p1, p0, Lh8/c;->t:I

    const/4 p2, 0x0

    iput p2, p0, Lh8/c;->s:I

    iget-boolean p3, p0, Lh8/c;->r:Z

    const/4 v1, 0x1

    if-nez p3, :cond_0

    iget p3, p0, Lh8/c;->e:I

    if-le p1, p3, :cond_0

    iput-boolean v1, p0, Lh8/c;->r:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    iget-boolean p1, p0, Lh8/c;->f:Z

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lh8/c;->n:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lh8/c;->b:Lja/g;

    invoke-virtual {p1}, Lja/g;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-gtz p1, :cond_1

    goto :goto_2

    :cond_1
    iput-boolean v1, p0, Lh8/c;->f:Z

    move v1, p2

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    :try_start_2
    iget-object p1, p0, Lh8/c;->q:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    :try_start_3
    iget-object p2, p0, Lh8/c;->d:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    :try_start_4
    iget-object p1, p0, Lh8/c;->c:Lg8/r5;

    new-instance p3, Lh8/a;

    invoke-direct {p3, p0, p2}, Lh8/a;-><init>(Lh8/c;I)V

    invoke-virtual {p1, p3}, Lg8/r5;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    sget-object p1, Lo8/b;->a:Lo8/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :goto_3
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_4
    :try_start_8
    sget-object p2, Lo8/b;->a:Lo8/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lja/i0;
    .locals 1

    sget-object v0, Lja/i0;->d:Lja/h0;

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lh8/c;->o:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh8/c;->o:Z

    new-instance v0, Lh/a;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Lh/a;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lh8/c;->c:Lg8/r5;

    invoke-virtual {v1, v0}, Lg8/r5;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final flush()V
    .locals 3

    iget-boolean v0, p0, Lh8/c;->o:Z

    if-nez v0, :cond_1

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    iget-object v0, p0, Lh8/c;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Lh8/c;->n:Z

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :try_start_2
    iput-boolean v1, p0, Lh8/c;->n:Z

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lh8/c;->c:Lg8/r5;

    new-instance v2, Lh8/a;

    invoke-direct {v2, p0, v1}, Lh8/a;-><init>(Lh8/c;I)V

    invoke-virtual {v0, v2}, Lg8/r5;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_1
    move-exception v0

    goto :goto_1

    :goto_0
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_1
    :try_start_6
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
