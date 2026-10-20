.class public final Lk4/r;
.super Lk4/o;


# instance fields
.field public final a:Lo7/d0;

.field public b:Z

.field public final c:Lja/i;


# direct methods
.method public constructor <init>(Lja/i;Lo7/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk4/r;->a:Lo7/d0;

    iput-object p1, p0, Lk4/r;->c:Lja/i;

    return-void
.end method


# virtual methods
.method public final a()Lo7/d0;
    .locals 1

    iget-object v0, p0, Lk4/r;->a:Lo7/d0;

    return-object v0
.end method

.method public final declared-synchronized b()Lja/i;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lk4/r;->b:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk4/r;->c:Lja/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lja/m;->a:Lja/t;

    const/4 v1, 0x0

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lja/t;->l(Lja/x;)Lja/g0;

    throw v1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lk4/r;->b:Z

    iget-object v0, p0, Lk4/r;->c:Lja/i;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lw4/e;->a(Ljava/io/Closeable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method
