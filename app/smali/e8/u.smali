.class public final Le8/u;
.super Le8/d;


# instance fields
.field public final a:Le8/e;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Le8/d;

.field public final d:Le8/b0;

.field public final synthetic e:Le8/v;


# direct methods
.method public constructor <init>(Le8/v;Le8/e;Ljava/util/concurrent/Executor;Le8/d;Le8/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/u;->e:Le8/v;

    iput-object p2, p0, Le8/u;->a:Le8/e;

    iput-object p3, p0, Le8/u;->b:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Le8/u;->c:Le8/d;

    const-string p1, "context"

    invoke-static {p5, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p5, p0, Le8/u;->d:Le8/b0;

    return-void
.end method


# virtual methods
.method public final a(Le8/l1;)V
    .locals 7

    iget-object v0, p0, Le8/u;->d:Le8/b0;

    invoke-virtual {v0}, Le8/b0;->a()Le8/b0;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Le8/u;->e:Le8/v;

    iget-object v2, v2, Le8/v;->b:Le8/f;

    iget-object v3, p0, Le8/u;->a:Le8/e;

    iget-object v4, p0, Le8/u;->b:Ljava/util/concurrent/Executor;

    new-instance v5, Le8/t;

    iget-object v6, p0, Le8/u;->c:Le8/d;

    invoke-direct {v5, v6, p1}, Le8/t;-><init>(Le8/d;Le8/l1;)V

    invoke-virtual {v2, v3, v4, v5}, Le8/f;->applyRequestMetadata(Le8/e;Ljava/util/concurrent/Executor;Le8/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, Le8/b0;->c(Le8/b0;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v1}, Le8/b0;->c(Le8/b0;)V

    throw p1
.end method

.method public final b(Le8/c2;)V
    .locals 1

    iget-object v0, p0, Le8/u;->c:Le8/d;

    invoke-virtual {v0, p1}, Le8/d;->b(Le8/c2;)V

    return-void
.end method
