.class public final Lg8/z;
.super Le8/i;


# instance fields
.field public final d:Lg8/b0;

.field public final e:Lg8/c6;


# direct methods
.method public constructor <init>(Lg8/b0;Lg8/c6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/z;->d:Lg8/b0;

    const-string p1, "time"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/z;->e:Lg8/c6;

    return-void
.end method

.method public static g(I)Ljava/util/logging/Level;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    return-object p0

    :cond_0
    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p0

    :cond_1
    sget-object p0, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lg8/z;->d:Lg8/b0;

    iget-object v1, v0, Lg8/b0;->b:Le8/q0;

    invoke-static {p1}, Lg8/z;->g(I)Ljava/util/logging/Level;

    move-result-object v2

    sget-object v3, Lg8/b0;->c:Ljava/util/logging/Logger;

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v1, v2, p2}, Lg8/b0;->a(Le8/q0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lg8/z;->f(I)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    const/4 v7, 0x0

    if-eqz p1, :cond_4

    sub-int/2addr p1, v1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    sget-object p1, Le8/l0;->a:Le8/l0;

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_2
    sget-object p1, Le8/l0;->c:Le8/l0;

    goto :goto_0

    :cond_3
    sget-object p1, Le8/l0;->b:Le8/l0;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lg8/z;->e:Lg8/c6;

    check-cast p1, Lg8/k4;

    invoke-virtual {p1}, Lg8/k4;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v1, "description"

    invoke-static {p2, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "timestampNanos"

    invoke-static {p1, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Le8/m0;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    move-object v3, p2

    invoke-direct/range {v2 .. v8}, Le8/m0;-><init>(Ljava/lang/String;Le8/l0;JLe8/p0;Le8/p0;)V

    iget-object p1, v0, Lg8/b0;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_4
    const/4 p1, 0x0

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public final varargs b(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Lg8/z;->g(I)Ljava/util/logging/Level;

    move-result-object v0

    invoke-virtual {p0, p1}, Lg8/z;->f(I)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lg8/b0;->c:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p2, p3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p0, p1, p2}, Lg8/z;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final f(I)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lg8/z;->d:Lg8/b0;

    iget-object v0, p1, Lg8/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return v1
.end method
