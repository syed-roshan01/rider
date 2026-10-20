.class public final Lba/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lw4/f;

.field public volatile b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic c:Lba/i;


# direct methods
.method public constructor <init>(Lba/i;Lw4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/f;->c:Lba/i;

    iput-object p2, p0, Lba/f;->a:Lw4/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lba/f;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    const-string v0, "Callback failure for "

    const-string v1, "canceled due to "

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OkHttp "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lba/f;->c:Lba/i;

    iget-object v3, v3, Lba/i;->b:Ll/r;

    iget-object v3, v3, Ll/r;->b:Ljava/lang/Object;

    check-cast v3, Lx9/s;

    invoke-virtual {v3}, Lx9/s;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lba/f;->c:Lba/i;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    iget-object v2, v3, Lba/i;->f:Lba/h;

    invoke-virtual {v2}, Lja/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v3}, Lba/i;->f()Lx9/b0;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v6, 0x1

    :try_start_2
    iget-object v7, p0, Lba/f;->a:Lw4/f;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v7, Lw4/f;->b:Lm9/k;

    invoke-interface {v7, v2}, Lu8/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, v3, Lba/i;->a:Lx9/w;

    iget-object v0, v0, Lx9/w;->a:Lx9/l;

    :goto_0
    invoke-virtual {v0, p0}, Lx9/l;->b(Lba/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    goto :goto_9

    :goto_1
    move v2, v6

    goto :goto_3

    :goto_2
    move v2, v6

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :catchall_2
    move-exception v0

    :goto_3
    :try_start_4
    invoke-virtual {v3}, Lba/i;->d()V

    if-nez v2, :cond_0

    new-instance v2, Ljava/io/IOException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lba/f;->a:Lw4/f;

    invoke-virtual {v1, v3, v2}, Lw4/f;->a(Lba/i;Ljava/io/IOException;)V

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_8

    :cond_0
    :goto_4
    throw v0

    :catch_1
    move-exception v1

    :goto_5
    if-eqz v2, :cond_1

    sget-object v2, Lfa/m;->a:Lfa/m;

    sget-object v2, Lfa/m;->a:Lfa/m;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lba/i;->a(Lba/i;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lfa/m;->i(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_1
    iget-object v0, p0, Lba/f;->a:Lw4/f;

    invoke-virtual {v0, v3, v1}, Lw4/f;->a(Lba/i;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_6
    :try_start_5
    iget-object v0, v3, Lba/i;->a:Lx9/w;

    iget-object v0, v0, Lx9/w;->a:Lx9/l;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :goto_7
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_8
    :try_start_6
    iget-object v1, v3, Lba/i;->a:Lx9/w;

    iget-object v1, v1, Lx9/w;->a:Lx9/l;

    invoke-virtual {v1, p0}, Lx9/l;->b(Lba/f;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_9
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0
.end method
