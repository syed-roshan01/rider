.class public final Lg8/x0;
.super Lg8/d1;


# instance fields
.field public final j:Lg8/j4;

.field public final k:Le8/b0;

.field public final l:[Le8/p;

.field public final synthetic m:Lg8/y0;


# direct methods
.method public constructor <init>(Lg8/y0;Lg8/j4;[Le8/p;)V
    .locals 0

    iput-object p1, p0, Lg8/x0;->m:Lg8/y0;

    invoke-direct {p0}, Lg8/d1;-><init>()V

    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object p1

    iput-object p1, p0, Lg8/x0;->k:Le8/b0;

    iput-object p2, p0, Lg8/x0;->j:Lg8/j4;

    iput-object p3, p0, Lg8/x0;->l:[Le8/p;

    return-void
.end method


# virtual methods
.method public final f(Lg8/u;)V
    .locals 2

    iget-object v0, p0, Lg8/x0;->j:Lg8/j4;

    iget-object v0, v0, Lg8/j4;->a:Le8/h;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v0, v0, Le8/h;->h:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "wait_for_ready"

    invoke-virtual {p1, v0}, Lg8/u;->b(Ljava/lang/Object;)V

    :cond_0
    invoke-super {p0, p1}, Lg8/d1;->f(Lg8/u;)V

    return-void
.end method

.method public final i(Le8/c2;)V
    .locals 2

    invoke-super {p0, p1}, Lg8/d1;->i(Le8/c2;)V

    iget-object p1, p0, Lg8/x0;->m:Lg8/y0;

    iget-object p1, p1, Lg8/y0;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lg8/x0;->m:Lg8/y0;

    iget-object v1, v0, Lg8/y0;->g:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg8/y0;->i:Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lg8/x0;->m:Lg8/y0;

    invoke-virtual {v1}, Lg8/y0;->h()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/x0;->m:Lg8/y0;

    iget-object v1, v0, Lg8/y0;->d:Le8/h2;

    iget-object v0, v0, Lg8/y0;->f:Lg8/w0;

    invoke-virtual {v1, v0}, Le8/h2;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lg8/x0;->m:Lg8/y0;

    iget-object v1, v0, Lg8/y0;->j:Le8/c2;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lg8/y0;->d:Le8/h2;

    iget-object v0, v0, Lg8/y0;->g:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Le8/h2;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lg8/x0;->m:Lg8/y0;

    const/4 v1, 0x0

    iput-object v1, v0, Lg8/y0;->g:Ljava/lang/Runnable;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lg8/x0;->m:Lg8/y0;

    iget-object p1, p1, Lg8/y0;->d:Le8/h2;

    invoke-virtual {p1}, Le8/h2;->a()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final t(Le8/c2;)V
    .locals 4

    iget-object v0, p0, Lg8/x0;->l:[Le8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lo7/d0;->j0(Le8/c2;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
