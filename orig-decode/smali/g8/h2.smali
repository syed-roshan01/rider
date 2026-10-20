.class public final Lg8/h2;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/t3;


# instance fields
.field public final a:Lg8/o0;

.field public b:Z

.field public final synthetic c:Lg8/j2;


# direct methods
.method public constructor <init>(Lg8/j2;Lg8/f2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/h2;->c:Lg8/j2;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg8/h2;->b:Z

    iput-object p2, p0, Lg8/h2;->a:Lg8/o0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-boolean v0, p0, Lg8/h2;->b:Z

    const-string v1, "transportShutdown() must be called before transportTerminated()."

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/h2;->c:Lg8/j2;

    iget-object v1, v0, Lg8/j2;->j:Le8/i;

    iget-object v2, p0, Lg8/h2;->a:Lg8/o0;

    invoke-interface {v2}, Le8/p0;->b()Le8/q0;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "{0} Terminated"

    const/4 v5, 0x2

    invoke-virtual {v1, v5, v4, v3}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v0, Lg8/j2;->h:Le8/n0;

    iget-object v1, v1, Le8/n0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v2}, Le8/p0;->b()Le8/q0;

    move-result-object v3

    iget-wide v3, v3, Le8/q0;->c:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/p0;

    new-instance v1, Lg8/c2;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lg8/c2;-><init>(Lg8/j2;Lg8/o0;Z)V

    iget-object v0, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lg8/g2;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg8/g2;-><init>(Lg8/h2;I)V

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Z)V
    .locals 3

    iget-object v0, p0, Lg8/h2;->c:Lg8/j2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lg8/c2;

    iget-object v2, p0, Lg8/h2;->a:Lg8/o0;

    invoke-direct {v1, v0, v2, p1}, Lg8/c2;-><init>(Lg8/j2;Lg8/o0;Z)V

    iget-object p1, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {p1, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lg8/h2;->c:Lg8/j2;

    iget-object v1, v0, Lg8/j2;->j:Le8/i;

    const/4 v2, 0x2

    const-string v3, "READY"

    invoke-virtual {v1, v2, v3}, Le8/i;->a(ILjava/lang/String;)V

    new-instance v1, Lg8/g2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lg8/g2;-><init>(Lg8/h2;I)V

    iget-object v0, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Le8/c2;)V
    .locals 5

    iget-object v0, p0, Lg8/h2;->c:Lg8/j2;

    iget-object v1, v0, Lg8/j2;->j:Le8/i;

    iget-object v2, p0, Lg8/h2;->a:Lg8/o0;

    invoke-interface {v2}, Le8/p0;->b()Le8/q0;

    move-result-object v2

    invoke-static {p1}, Lg8/j2;->j(Le8/c2;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "{0} SHUTDOWN with {1}"

    const/4 v4, 0x2

    invoke-virtual {v1, v4, v3, v2}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg8/h2;->b:Z

    new-instance v1, Lg8/x1;

    const/16 v2, 0x13

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {p1, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
