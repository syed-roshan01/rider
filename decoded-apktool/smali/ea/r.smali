.class public final Lea/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final I:Lea/c0;


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:J

.field public final E:Ljava/net/Socket;

.field public final F:Lea/z;

.field public final G:Lea/l;

.field public final H:Ljava/util/LinkedHashSet;

.field public final a:Z

.field public final b:Lea/h;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public n:Z

.field public final o:Laa/f;

.field public final p:Laa/c;

.field public final q:Laa/c;

.field public final r:Laa/c;

.field public final s:La4/q;

.field public t:J

.field public u:J

.field public v:J

.field public w:J

.field public x:J

.field public final y:Lea/c0;

.field public z:Lea/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lea/c0;

    invoke-direct {v0}, Lea/c0;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lea/c0;->c(II)V

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lea/c0;->c(II)V

    sput-object v0, Lea/r;->I:Lea/c0;

    return-void
.end method

.method public constructor <init>(Lea/f;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lea/f;->a:Z

    iput-boolean v0, p0, Lea/r;->a:Z

    iget-object v1, p1, Lea/f;->g:Lea/h;

    iput-object v1, p0, Lea/r;->b:Lea/h;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lea/f;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iput-object v1, p0, Lea/r;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v3, 0x3

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    iput v3, p0, Lea/r;->f:I

    iget-object v3, p1, Lea/f;->b:Laa/f;

    iput-object v3, p0, Lea/r;->o:Laa/f;

    invoke-virtual {v3}, Laa/f;->f()Laa/c;

    move-result-object v4

    iput-object v4, p0, Lea/r;->p:Laa/c;

    invoke-virtual {v3}, Laa/f;->f()Laa/c;

    move-result-object v5

    iput-object v5, p0, Lea/r;->q:Laa/c;

    invoke-virtual {v3}, Laa/f;->f()Laa/c;

    move-result-object v3

    iput-object v3, p0, Lea/r;->r:Laa/c;

    iget-object v3, p1, Lea/f;->h:La4/q;

    iput-object v3, p0, Lea/r;->s:La4/q;

    new-instance v3, Lea/c0;

    invoke-direct {v3}, Lea/c0;-><init>()V

    if-eqz v0, :cond_1

    const/4 v5, 0x7

    const/high16 v6, 0x1000000

    invoke-virtual {v3, v5, v6}, Lea/c0;->c(II)V

    :cond_1
    iput-object v3, p0, Lea/r;->y:Lea/c0;

    sget-object v3, Lea/r;->I:Lea/c0;

    iput-object v3, p0, Lea/r;->z:Lea/c0;

    invoke-virtual {v3}, Lea/c0;->a()I

    move-result v3

    int-to-long v5, v3

    iput-wide v5, p0, Lea/r;->D:J

    iget-object v3, p1, Lea/f;->c:Ljava/net/Socket;

    if-eqz v3, :cond_5

    iput-object v3, p0, Lea/r;->E:Ljava/net/Socket;

    new-instance v3, Lea/z;

    iget-object v5, p1, Lea/f;->f:Lja/h;

    if-eqz v5, :cond_4

    invoke-direct {v3, v5, v0}, Lea/z;-><init>(Lja/h;Z)V

    iput-object v3, p0, Lea/r;->F:Lea/z;

    new-instance v3, Lea/l;

    new-instance v5, Lea/u;

    iget-object v6, p1, Lea/f;->e:Lja/i;

    if-eqz v6, :cond_3

    invoke-direct {v5, v6, v0}, Lea/u;-><init>(Lja/i;Z)V

    invoke-direct {v3, p0, v5}, Lea/l;-><init>(Lea/r;Lea/u;)V

    iput-object v3, p0, Lea/r;->G:Lea/l;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lea/r;->H:Ljava/util/LinkedHashSet;

    iget p1, p1, Lea/f;->i:I

    if-eqz p1, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    const-string p1, " ping"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lea/p;

    invoke-direct {v0, p1, p0, v2, v3}, Lea/p;-><init>(Ljava/lang/String;Lea/r;J)V

    invoke-virtual {v4, v0, v2, v3}, Laa/c;->c(Laa/a;J)V

    :cond_2
    return-void

    :cond_3
    const-string p1, "source"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string p1, "sink"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2

    :cond_5
    const-string p1, "socket"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2

    :cond_6
    const-string p1, "connectionName"

    invoke-static {p1}, Ld7/a;->D(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final M(IJ)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] windowUpdate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lea/q;

    move-object v2, v0

    move-object v4, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v2 .. v7}, Lea/q;-><init>(Ljava/lang/String;Lea/r;IJ)V

    iget-object p1, p0, Lea/r;->p:Laa/c;

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v0, p2, p3}, Laa/c;->c(Laa/a;J)V

    return-void
.end method

.method public final a(Lea/b;Lea/b;Ljava/io/IOException;)V
    .locals 3

    sget-object v0, Ly9/b;->a:[B

    :try_start_0
    invoke-virtual {p0, p1}, Lea/r;->g(Lea/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [Lea/y;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    check-cast p1, [Lea/y;

    if-eqz p1, :cond_1

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lea/y;->c(Lea/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :try_start_3
    iget-object p1, p0, Lea/r;->F:Lea/z;

    invoke-virtual {p1}, Lea/z;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Lea/r;->E:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lea/r;->p:Laa/c;

    invoke-virtual {p1}, Laa/c;->e()V

    iget-object p1, p0, Lea/r;->q:Laa/c;

    invoke-virtual {p1}, Laa/c;->e()V

    iget-object p1, p0, Lea/r;->r:Laa/c;

    invoke-virtual {p1}, Laa/c;->e()V

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final b(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Lea/b;->c:Lea/b;

    invoke-virtual {p0, v0, v0, p1}, Lea/r;->a(Lea/b;Lea/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final close()V
    .locals 3

    sget-object v0, Lea/b;->b:Lea/b;

    sget-object v1, Lea/b;->n:Lea/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lea/r;->a(Lea/b;Lea/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final declared-synchronized e(I)Lea/y;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lea/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized f(I)Lea/y;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lea/y;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final g(Lea/b;)V
    .locals 4

    iget-object v0, p0, Lea/r;->F:Lea/z;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v1, p0, Lea/r;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Lea/r;->n:Z

    iget v1, p0, Lea/r;->e:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0

    iget-object v2, p0, Lea/r;->F:Lea/z;

    sget-object v3, Ly9/b;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lea/z;->e(ILea/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final declared-synchronized p(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lea/r;->A:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lea/r;->A:J

    iget-wide p1, p0, Lea/r;->B:J

    sub-long/2addr v0, p1

    iget-object p1, p0, Lea/r;->y:Lea/c0;

    invoke-virtual {p1}, Lea/c0;->a()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lea/r;->M(IJ)V

    iget-wide p1, p0, Lea/r;->B:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lea/r;->B:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final q(IZLja/g;J)V
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, Lea/r;->F:Lea/z;

    invoke-virtual {p4, p1, v3, p3, p2}, Lea/z;->r(IILja/g;Z)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, Lea/r;->C:J

    iget-wide v6, p0, Lea/r;->D:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    iget-object v2, p0, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, Lea/r;->F:Lea/z;

    iget v4, v4, Lea/z;->d:I

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, Lea/r;->C:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lea/r;->C:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lea/r;->F:Lea/z;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, p1, v2, p3, v5}, Lea/z;->r(IILja/g;Z)V

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final u(ILea/b;)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] writeSynReset"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lea/o;

    const/4 v7, 0x1

    move-object v2, v0

    move-object v4, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lea/o;-><init>(Ljava/lang/String;Lea/r;ILjava/lang/Object;I)V

    iget-object p1, p0, Lea/r;->p:Laa/c;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Laa/c;->c(Laa/a;J)V

    return-void
.end method
