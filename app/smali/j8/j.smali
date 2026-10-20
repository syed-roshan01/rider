.class public final Lj8/j;
.super Ljava/lang/Object;

# interfaces
.implements Lj8/b;


# instance fields
.field public final a:Lja/h;

.field public final b:Z

.field public final c:Lja/g;

.field public final d:Lj8/e;

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>(Lja/z;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/j;->a:Lja/h;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj8/j;->b:Z

    new-instance p1, Lja/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/j;->c:Lja/g;

    new-instance v0, Lj8/e;

    invoke-direct {v0, p1}, Lj8/e;-><init>(Lja/g;)V

    iput-object v0, p0, Lj8/j;->d:Lj8/e;

    const/16 p1, 0x4000

    iput p1, p0, Lj8/j;->e:I

    return-void
.end method


# virtual methods
.method public final declared-synchronized D(La4/k;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_1

    iget v0, p0, Lj8/j;->e:I

    iget v1, p1, La4/k;->a:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_0

    iget-object p1, p1, La4/k;->d:[I

    const/4 v0, 0x5

    aget v0, p1, v0

    :cond_0
    iput v0, p0, Lj8/j;->e:I

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v0, v1, p1}, Lj8/j;->a(IIBB)V

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized E()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lj8/j;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lj8/k;->a:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ">> CONNECTION %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v3, Lj8/k;->b:Lja/j;

    invoke-virtual {v3}, Lja/j;->e()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lj8/j;->a:Lja/h;

    sget-object v1, Lj8/k;->b:Lja/j;

    invoke-virtual {v1}, Lja/j;->s()[B

    move-result-object v1

    invoke-interface {v0, v1}, Lja/h;->F([B)Lja/h;

    iget-object v0, p0, Lj8/j;->a:Lja/h;

    invoke-interface {v0}, Lja/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized G(ZILjava/util/List;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p2, p3, p1}, Lj8/j;->b(ILjava/util/List;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized N(IJ)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, p2, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x4

    const/16 v2, 0x8

    invoke-virtual {p0, p1, v0, v2, v1}, Lj8/j;->a(IIBB)V

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    long-to-int p2, p2

    invoke-interface {p1, p2}, Lja/h;->s(I)Lja/h;

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p3, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final R()I
    .locals 1

    iget v0, p0, Lj8/j;->e:I

    return v0
.end method

.method public final declared-synchronized X(IZI)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x6

    invoke-virtual {p0, v0, v1, v2, p2}, Lj8/j;->a(IIBB)V

    iget-object p2, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p2, p1}, Lja/h;->s(I)Lja/h;

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1, p3}, Lja/h;->s(I)Lja/h;

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final a(IIBB)V
    .locals 2

    sget-object v0, Lj8/k;->a:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-static {v1, p1, p2, p3, p4}, Lj8/h;->a(ZIIBB)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lj8/j;->e:I

    if-gt p2, v0, :cond_2

    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    ushr-int/lit8 v0, p2, 0x10

    and-int/lit16 v0, v0, 0xff

    iget-object v1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {v1, v0}, Lja/h;->C(I)Lja/h;

    ushr-int/lit8 v0, p2, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-interface {v1, v0}, Lja/h;->C(I)Lja/h;

    and-int/lit16 p2, p2, 0xff

    invoke-interface {v1, p2}, Lja/h;->C(I)Lja/h;

    and-int/lit16 p2, p3, 0xff

    invoke-interface {v1, p2}, Lja/h;->C(I)Lja/h;

    and-int/lit16 p2, p4, 0xff

    invoke-interface {v1, p2}, Lja/h;->C(I)Lja/h;

    const p2, 0x7fffffff

    and-int/2addr p1, p2

    invoke-interface {v1, p1}, Lja/h;->s(I)Lja/h;

    return-void

    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p4, "reserved bit set: %s"

    invoke-static {p3, p4, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p4, "FRAME_SIZE_ERROR length > %d: %d"

    invoke-static {p3, p4, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b(ILjava/util/List;Z)V
    .locals 10

    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lj8/j;->d:Lj8/e;

    invoke-virtual {v0, p2}, Lj8/e;->f(Ljava/util/List;)V

    iget-object p2, p0, Lj8/j;->c:Lja/g;

    iget-wide v0, p2, Lja/g;->b:J

    iget v2, p0, Lj8/j;->e:I

    int-to-long v2, v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    int-to-long v3, v2

    cmp-long v5, v0, v3

    const/4 v6, 0x0

    const/4 v7, 0x4

    if-nez v5, :cond_0

    move v8, v7

    goto :goto_0

    :cond_0
    move v8, v6

    :goto_0
    if-eqz p3, :cond_1

    or-int/lit8 p3, v8, 0x1

    int-to-byte v8, p3

    :cond_1
    const/4 p3, 0x1

    invoke-virtual {p0, p1, v2, p3, v8}, Lj8/j;->a(IIBB)V

    iget-object p3, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p3, p2, v3, v4}, Lja/e0;->b0(Lja/g;J)V

    if-lez v5, :cond_3

    sub-long/2addr v0, v3

    :goto_1
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    iget v4, p0, Lj8/j;->e:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v4, v4

    int-to-long v8, v4

    sub-long/2addr v0, v8

    cmp-long v2, v0, v2

    if-nez v2, :cond_2

    move v2, v7

    goto :goto_2

    :cond_2
    move v2, v6

    :goto_2
    const/16 v3, 0x9

    invoke-virtual {p0, p1, v4, v3, v2}, Lj8/j;->a(IIBB)V

    invoke-interface {p3, p2, v8, v9}, Lja/e0;->b0(Lja/g;J)V

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lj8/j;->f:Z

    iget-object v0, p0, Lj8/j;->a:Lja/h;

    invoke-interface {v0}, Lja/e0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d(Lj8/a;[B)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_2

    iget v0, p1, Lj8/a;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    array-length v0, p2

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    invoke-virtual {p0, v2, v0, v1, v2}, Lj8/j;->a(IIBB)V

    iget-object v0, p0, Lj8/j;->a:Lja/h;

    invoke-interface {v0, v2}, Lja/h;->s(I)Lja/h;

    iget-object v0, p0, Lj8/j;->a:Lja/h;

    iget p1, p1, Lj8/a;->a:I

    invoke-interface {v0, p1}, Lja/h;->s(I)Lja/h;

    array-length p1, p2

    if-lez p1, :cond_0

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1, p2}, Lja/h;->F([B)Lja/h;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    const-string p1, "errorCode.httpCode == -1"

    new-array p2, v2, [Ljava/lang/Object;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized flush()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj8/j;->a:Lja/h;

    invoke-interface {v0}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized o(ILj8/a;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_1

    iget v0, p2, Lj8/a;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x3

    invoke-virtual {p0, p1, v1, v2, v0}, Lj8/j;->a(IIBB)V

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    iget p2, p2, Lj8/a;->a:I

    invoke-interface {p1, p2}, Lja/h;->s(I)Lja/h;

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized r(IILja/g;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    const/4 p4, 0x1

    int-to-byte p4, p4

    goto :goto_0

    :cond_0
    move p4, v0

    :goto_0
    invoke-virtual {p0, p1, p2, v0, p4}, Lj8/j;->a(IIBB)V

    if-lez p2, :cond_1

    iget-object p1, p0, Lj8/j;->a:Lja/h;

    int-to-long v0, p2

    invoke-interface {p1, p3, v0, v1}, Lja/e0;->b0(Lja/g;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized v(La4/k;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lj8/j;->f:Z

    if-nez v0, :cond_4

    iget v0, p1, La4/k;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v0, v2, v1}, Lj8/j;->a(IIBB)V

    :goto_0
    const/16 v0, 0xa

    if-ge v1, v0, :cond_3

    invoke-virtual {p1, v1}, La4/k;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-ne v1, v2, :cond_1

    const/4 v0, 0x3

    goto :goto_1

    :cond_1
    const/4 v0, 0x7

    if-ne v1, v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iget-object v3, p0, Lj8/j;->a:Lja/h;

    invoke-interface {v3, v0}, Lja/h;->m(I)Lja/h;

    iget-object v0, p0, Lj8/j;->a:Lja/h;

    iget-object v3, p1, La4/k;->d:[I

    aget v3, v3, v1

    invoke-interface {v0, v3}, Lja/h;->s(I)Lja/h;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lj8/j;->a:Lja/h;

    invoke-interface {p1}, Lja/h;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1
.end method
