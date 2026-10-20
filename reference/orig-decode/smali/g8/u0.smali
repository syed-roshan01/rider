.class public final Lg8/u0;
.super Le8/j;


# instance fields
.field public final a:Le8/j;

.field public volatile b:Z

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>(Le8/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/u0;->c:Ljava/util/List;

    iput-object p1, p0, Lg8/u0;->a:Le8/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lg8/u0;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/u0;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onClose(Le8/c2;Le8/l1;)V
    .locals 2

    new-instance v0, Ly2/a;

    const/16 v1, 0x13

    invoke-direct {v0, p0, p1, p2, v1}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/u0;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onHeaders(Le8/l1;)V
    .locals 2

    iget-boolean v0, p0, Lg8/u0;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/u0;->a:Le8/j;

    invoke-virtual {v0, p1}, Le8/j;->onHeaders(Le8/l1;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/x1;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/u0;->a(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final onMessage(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lg8/u0;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/u0;->a:Le8/j;

    invoke-virtual {v0, p1}, Le8/j;->onMessage(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/x1;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lg8/u0;->a(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final onReady()V
    .locals 2

    iget-boolean v0, p0, Lg8/u0;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/u0;->a:Le8/j;

    invoke-virtual {v0}, Le8/j;->onReady()V

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/t0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lg8/u0;->a(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
