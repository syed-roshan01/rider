.class public final Lg8/d0;
.super Lg8/q0;


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg8/f0;Le8/l1;)V
    .locals 2

    sget-object v0, Lo8/a;->b:La4/q;

    const/4 v1, 0x1

    iput v1, p0, Lg8/d0;->c:I

    iput-object p1, p0, Lg8/d0;->f:Ljava/lang/Object;

    iput-object v0, p0, Lg8/d0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lg8/d0;->e:Ljava/lang/Object;

    .line 5
    iget-object p1, p1, Lg8/f0;->c:Lg8/g0;

    .line 6
    iget-object p1, p1, Lg8/g0;->f:Le8/b0;

    const/4 p2, 0x0

    .line 7
    invoke-direct {p0, p1, p2}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lg8/f0;Lg8/a6;)V
    .locals 2

    sget-object v0, Lo8/a;->b:La4/q;

    const/4 v1, 0x2

    iput v1, p0, Lg8/d0;->c:I

    iput-object p1, p0, Lg8/d0;->f:Ljava/lang/Object;

    iput-object v0, p0, Lg8/d0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lg8/d0;->e:Ljava/lang/Object;

    .line 8
    iget-object p1, p1, Lg8/f0;->c:Lg8/g0;

    .line 9
    iget-object p1, p1, Lg8/g0;->f:Le8/b0;

    const/4 p2, 0x0

    .line 10
    invoke-direct {p0, p1, p2}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lg8/g0;Le8/j;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg8/d0;->c:I

    iput-object p1, p0, Lg8/d0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lg8/d0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lg8/d0;->e:Ljava/lang/Object;

    .line 3
    iget-object p1, p1, Lg8/g0;->f:Le8/b0;

    .line 4
    invoke-direct {p0, p1, v0}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lg8/v0;Le8/j;Le8/c2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lg8/d0;->c:I

    iput-object p1, p0, Lg8/d0;->f:Ljava/lang/Object;

    .line 1
    iget-object p1, p1, Lg8/v0;->c:Le8/b0;

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lg8/d0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lg8/d0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg8/z2;Le8/j;Le8/c2;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lg8/d0;->c:I

    iput-object p1, p0, Lg8/d0;->f:Ljava/lang/Object;

    iput-object p2, p0, Lg8/d0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lg8/d0;->e:Ljava/lang/Object;

    .line 11
    iget-object p1, p1, Lg8/z2;->e:Le8/b0;

    const/4 p2, 0x0

    .line 12
    invoke-direct {p0, p1, p2}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget v0, p0, Lg8/d0;->c:I

    iget-object v1, p0, Lg8/d0;->f:Ljava/lang/Object;

    iget-object v2, p0, Lg8/d0;->e:Ljava/lang/Object;

    iget-object v3, p0, Lg8/d0;->d:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Le8/j;

    check-cast v2, Le8/c2;

    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v2, v0}, Le8/j;->onClose(Le8/c2;Le8/l1;)V

    return-void

    :pswitch_0
    check-cast v3, Le8/j;

    check-cast v2, Le8/c2;

    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v2, v0}, Le8/j;->onClose(Le8/c2;Le8/l1;)V

    return-void

    :pswitch_1
    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    check-cast v1, Lg8/f0;

    iget-object v0, v1, Lg8/f0;->c:Lg8/g0;

    iget-object v0, v0, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    invoke-static {}, Lo8/b;->b()V

    invoke-virtual {p0}, Lg8/d0;->c()V
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

    :pswitch_2
    invoke-static {}, Lo8/b;->d()V

    :try_start_2
    move-object v0, v1

    check-cast v0, Lg8/f0;

    iget-object v0, v0, Lg8/f0;->c:Lg8/g0;

    iget-object v0, v0, Lg8/g0;->b:Lo8/c;

    invoke-static {}, Lo8/b;->a()V

    invoke-static {}, Lo8/b;->b()V

    move-object v0, v1

    check-cast v0, Lg8/f0;

    iget-object v0, v0, Lg8/f0;->b:Le8/c2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :try_start_3
    move-object v0, v1

    check-cast v0, Lg8/f0;

    iget-object v0, v0, Lg8/f0;->a:Le8/j;

    check-cast v2, Le8/l1;

    invoke-virtual {v0, v2}, Le8/j;->onHeaders(Le8/l1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    :try_start_4
    check-cast v1, Lg8/f0;

    sget-object v2, Le8/c2;->f:Le8/c2;

    invoke-virtual {v2, v0}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object v0

    const-string v2, "Failed to read headers"

    invoke-virtual {v0, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    iput-object v0, v1, Lg8/f0;->b:Le8/c2;

    iget-object v1, v1, Lg8/f0;->c:Lg8/g0;

    iget-object v1, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v1, v0}, Lg8/h0;->i(Le8/c2;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_1
    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_3
    move-exception v0

    :try_start_5
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :pswitch_3
    check-cast v1, Lg8/g0;

    check-cast v3, Le8/j;

    sget-object v0, Le8/c2;->l:Le8/c2;

    check-cast v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v4, "Unable to find compressor by name %s"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    new-instance v2, Le8/l1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v0, v2}, Le8/j;->onClose(Le8/c2;Le8/l1;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Lg8/d0;->f:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg8/f0;

    iget-object v2, v1, Lg8/f0;->b:Le8/c2;

    iget-object v3, p0, Lg8/d0;->e:Ljava/lang/Object;

    if-eqz v2, :cond_1

    check-cast v3, Lg8/a6;

    sget-object v0, Lg8/s1;->a:Ljava/util/logging/Logger;

    :goto_0
    invoke-interface {v3}, Lg8/a6;->next()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lg8/s1;->b(Ljava/io/Closeable;)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_1
    :try_start_0
    move-object v2, v3

    check-cast v2, Lg8/a6;

    invoke-interface {v2}, Lg8/a6;->next()Ljava/io/InputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    :try_start_1
    move-object v4, v0

    check-cast v4, Lg8/f0;

    iget-object v4, v4, Lg8/f0;->a:Le8/j;

    move-object v5, v0

    check-cast v5, Lg8/f0;

    iget-object v5, v5, Lg8/f0;->c:Lg8/g0;

    iget-object v5, v5, Lg8/g0;->a:Le8/p1;

    invoke-virtual {v5, v2}, Le8/p1;->c(Ljava/io/InputStream;)Lcom/google/protobuf/t1;

    move-result-object v5

    invoke-virtual {v4, v5}, Le8/j;->onMessage(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-static {v2}, Lg8/s1;->b(Ljava/io/Closeable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    check-cast v3, Lg8/a6;

    sget-object v2, Lg8/s1;->a:Ljava/util/logging/Logger;

    :goto_3
    invoke-interface {v3}, Lg8/a6;->next()Ljava/io/InputStream;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lg8/s1;->b(Ljava/io/Closeable;)V

    goto :goto_3

    :cond_2
    sget-object v2, Le8/c2;->f:Le8/c2;

    invoke-virtual {v2, v0}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object v0

    const-string v2, "Failed to read message."

    invoke-virtual {v0, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    iput-object v0, v1, Lg8/f0;->b:Le8/c2;

    iget-object v1, v1, Lg8/f0;->c:Lg8/g0;

    iget-object v1, v1, Lg8/g0;->j:Lg8/h0;

    invoke-interface {v1, v0}, Lg8/h0;->i(Le8/c2;)V

    :cond_3
    return-void
.end method
