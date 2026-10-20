.class public final Lg8/x3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;
.implements Lg8/r0;


# instance fields
.field public a:Lg8/v3;

.field public b:I

.field public final c:Lg8/y5;

.field public final d:Lg8/e6;

.field public e:Le8/s;

.field public f:Lg8/t1;

.field public n:[B

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:Lg8/n0;

.field public t:Lg8/n0;

.field public u:J

.field public v:Z

.field public w:I

.field public x:I

.field public y:Z

.field public volatile z:Z


# direct methods
.method public constructor <init>(Lg8/v3;ILg8/y5;Lg8/e6;)V
    .locals 3

    sget-object v0, Le8/r;->a:Le8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput v1, p0, Lg8/x3;->p:I

    const/4 v1, 0x5

    iput v1, p0, Lg8/x3;->q:I

    new-instance v1, Lg8/n0;

    invoke-direct {v1}, Lg8/n0;-><init>()V

    iput-object v1, p0, Lg8/x3;->t:Lg8/n0;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lg8/x3;->v:Z

    const/4 v2, -0x1

    iput v2, p0, Lg8/x3;->w:I

    iput-boolean v1, p0, Lg8/x3;->y:Z

    iput-boolean v1, p0, Lg8/x3;->z:Z

    const-string v1, "sink"

    invoke-static {p1, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/x3;->a:Lg8/v3;

    iput-object v0, p0, Lg8/x3;->e:Le8/s;

    iput p2, p0, Lg8/x3;->b:I

    iput-object p3, p0, Lg8/x3;->c:Lg8/y5;

    const-string p1, "transportTracer"

    invoke-static {p4, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p4, p0, Lg8/x3;->d:Lg8/e6;

    return-void
.end method


# virtual methods
.method public final M()V
    .locals 6

    iget-object v0, p0, Lg8/x3;->s:Lg8/n0;

    invoke-virtual {v0}, Lg8/n0;->readUnsignedByte()I

    move-result v0

    and-int/lit16 v1, v0, 0xfe

    if-nez v1, :cond_3

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lg8/x3;->r:Z

    iget-object v0, p0, Lg8/x3;->s:Lg8/n0;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lg8/d;->a(I)V

    invoke-virtual {v0}, Lg8/n0;->readUnsignedByte()I

    move-result v3

    invoke-virtual {v0}, Lg8/n0;->readUnsignedByte()I

    move-result v4

    invoke-virtual {v0}, Lg8/n0;->readUnsignedByte()I

    move-result v5

    invoke-virtual {v0}, Lg8/n0;->readUnsignedByte()I

    move-result v0

    shl-int/lit8 v3, v3, 0x18

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    shl-int/lit8 v4, v5, 0x8

    or-int/2addr v3, v4

    or-int/2addr v0, v3

    iput v0, p0, Lg8/x3;->q:I

    if-ltz v0, :cond_2

    iget v3, p0, Lg8/x3;->b:I

    if-gt v0, v3, :cond_2

    iget v0, p0, Lg8/x3;->w:I

    add-int/2addr v0, v1

    iput v0, p0, Lg8/x3;->w:I

    iget-object v1, p0, Lg8/x3;->c:Lg8/y5;

    iget-object v1, v1, Lg8/y5;->a:[Lo7/d0;

    array-length v3, v1

    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v4, v1, v2

    invoke-virtual {v4, v0}, Lo7/d0;->I(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lg8/x3;->d:Lg8/e6;

    iget-object v1, v0, Lg8/e6;->b:Lg8/s2;

    invoke-interface {v1}, Lg8/s2;->a()V

    iget-object v0, v0, Lg8/e6;->a:Lg8/c6;

    check-cast v0, Lg8/k4;

    invoke-virtual {v0}, Lg8/k4;->a()J

    const/4 v0, 0x2

    iput v0, p0, Lg8/x3;->p:I

    return-void

    :cond_2
    sget-object v0, Le8/c2;->k:Le8/c2;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget v2, p0, Lg8/x3;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lg8/x3;->q:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "gRPC message exceeds maximum size %d: %d"

    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    new-instance v1, Le8/e2;

    invoke-direct {v1, v0}, Le8/e2;-><init>(Le8/c2;)V

    throw v1

    :cond_3
    sget-object v0, Le8/c2;->l:Le8/c2;

    const-string v1, "gRPC frame header malformed: reserved bits not zero"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    new-instance v1, Le8/e2;

    invoke-direct {v1, v0}, Le8/e2;-><init>(Le8/c2;)V

    throw v1
.end method

.method public final O()Z
    .locals 11

    iget-object v0, p0, Lg8/x3;->c:Lg8/y5;

    const/4 v1, 0x2

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lg8/x3;->s:Lg8/n0;

    if-nez v3, :cond_0

    new-instance v3, Lg8/n0;

    invoke-direct {v3}, Lg8/n0;-><init>()V

    iput-object v3, p0, Lg8/x3;->s:Lg8/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    move v4, v2

    goto/16 :goto_8

    :cond_0
    :goto_0
    move v3, v2

    move v4, v3

    :goto_1
    :try_start_1
    iget v5, p0, Lg8/x3;->q:I

    iget-object v6, p0, Lg8/x3;->s:Lg8/n0;

    iget v6, v6, Lg8/n0;->c:I

    sub-int/2addr v5, v6

    if-lez v5, :cond_a

    iget-object v6, p0, Lg8/x3;->f:Lg8/t1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v6, :cond_6

    :try_start_2
    iget-object v6, p0, Lg8/x3;->n:[B

    if-eqz v6, :cond_1

    iget v7, p0, Lg8/x3;->o:I

    array-length v6, v6

    if-ne v7, v6, :cond_2

    goto :goto_2

    :catchall_1
    move-exception v2

    move v10, v3

    move-object v3, v2

    move v2, v10

    goto/16 :goto_8

    :catch_0
    move-exception v2

    goto :goto_4

    :catch_1
    move-exception v2

    goto :goto_5

    :cond_1
    :goto_2
    const/high16 v6, 0x200000

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    new-array v6, v6, [B

    iput-object v6, p0, Lg8/x3;->n:[B

    iput v2, p0, Lg8/x3;->o:I

    :cond_2
    iget-object v6, p0, Lg8/x3;->n:[B

    array-length v6, v6

    iget v7, p0, Lg8/x3;->o:I

    sub-int/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget-object v6, p0, Lg8/x3;->f:Lg8/t1;

    iget-object v7, p0, Lg8/x3;->n:[B

    iget v8, p0, Lg8/x3;->o:I

    invoke-virtual {v6, v7, v8, v5}, Lg8/t1;->a([BII)I

    move-result v5

    iget-object v6, p0, Lg8/x3;->f:Lg8/t1;

    iget v7, v6, Lg8/t1;->t:I

    iput v2, v6, Lg8/t1;->t:I

    add-int/2addr v3, v7

    iget v7, v6, Lg8/t1;->u:I

    iput v2, v6, Lg8/t1;->u:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/2addr v4, v7

    if-nez v5, :cond_5

    if-lez v3, :cond_4

    iget-object v5, p0, Lg8/x3;->a:Lg8/v3;

    invoke-interface {v5, v3}, Lg8/v3;->d(I)V

    iget v5, p0, Lg8/x3;->p:I

    if-ne v5, v1, :cond_4

    iget-object v1, p0, Lg8/x3;->f:Lg8/t1;

    if-eqz v1, :cond_3

    int-to-long v5, v4

    invoke-virtual {v0, v5, v6}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v4

    iput v0, p0, Lg8/x3;->x:I

    goto :goto_3

    :cond_3
    int-to-long v4, v3

    invoke-virtual {v0, v4, v5}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v3

    iput v0, p0, Lg8/x3;->x:I

    :cond_4
    :goto_3
    return v2

    :cond_5
    :try_start_3
    iget-object v6, p0, Lg8/x3;->s:Lg8/n0;

    iget-object v7, p0, Lg8/x3;->n:[B

    iget v8, p0, Lg8/x3;->o:I

    sget-object v9, Lg8/p4;->a:Lg8/o4;

    new-instance v9, Lg8/o4;

    invoke-direct {v9, v7, v8, v5}, Lg8/o4;-><init>([BII)V

    invoke-virtual {v6, v9}, Lg8/n0;->b(Lg8/m4;)V

    iget v6, p0, Lg8/x3;->o:I

    add-int/2addr v6, v5

    iput v6, p0, Lg8/x3;->o:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_1

    :goto_4
    :try_start_4
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5

    :goto_5
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5

    :cond_6
    iget-object v6, p0, Lg8/x3;->t:Lg8/n0;

    iget v6, v6, Lg8/n0;->c:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v6, :cond_9

    if-lez v3, :cond_8

    iget-object v5, p0, Lg8/x3;->a:Lg8/v3;

    invoke-interface {v5, v3}, Lg8/v3;->d(I)V

    iget v5, p0, Lg8/x3;->p:I

    if-ne v5, v1, :cond_8

    iget-object v1, p0, Lg8/x3;->f:Lg8/t1;

    if-eqz v1, :cond_7

    int-to-long v5, v4

    invoke-virtual {v0, v5, v6}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v4

    iput v0, p0, Lg8/x3;->x:I

    goto :goto_6

    :cond_7
    int-to-long v4, v3

    invoke-virtual {v0, v4, v5}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v3

    iput v0, p0, Lg8/x3;->x:I

    :cond_8
    :goto_6
    return v2

    :cond_9
    :try_start_5
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v6, p0, Lg8/x3;->s:Lg8/n0;

    iget-object v7, p0, Lg8/x3;->t:Lg8/n0;

    invoke-virtual {v7, v5}, Lg8/n0;->t(I)Lg8/m4;

    move-result-object v5

    invoke-virtual {v6, v5}, Lg8/n0;->b(Lg8/m4;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_1

    :cond_a
    if-lez v3, :cond_c

    iget-object v2, p0, Lg8/x3;->a:Lg8/v3;

    invoke-interface {v2, v3}, Lg8/v3;->d(I)V

    iget v2, p0, Lg8/x3;->p:I

    if-ne v2, v1, :cond_c

    iget-object v1, p0, Lg8/x3;->f:Lg8/t1;

    if-eqz v1, :cond_b

    int-to-long v1, v4

    invoke-virtual {v0, v1, v2}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v4

    iput v0, p0, Lg8/x3;->x:I

    goto :goto_7

    :cond_b
    int-to-long v1, v3

    invoke-virtual {v0, v1, v2}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v3

    iput v0, p0, Lg8/x3;->x:I

    :cond_c
    :goto_7
    const/4 v0, 0x1

    return v0

    :goto_8
    if-lez v2, :cond_e

    iget-object v5, p0, Lg8/x3;->a:Lg8/v3;

    invoke-interface {v5, v2}, Lg8/v3;->d(I)V

    iget v5, p0, Lg8/x3;->p:I

    if-ne v5, v1, :cond_e

    iget-object v1, p0, Lg8/x3;->f:Lg8/t1;

    if-eqz v1, :cond_d

    int-to-long v1, v4

    invoke-virtual {v0, v1, v2}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v4

    iput v0, p0, Lg8/x3;->x:I

    goto :goto_9

    :cond_d
    int-to-long v4, v2

    invoke-virtual {v0, v4, v5}, Lg8/y5;->a(J)V

    iget v0, p0, Lg8/x3;->x:I

    add-int/2addr v0, v2

    iput v0, p0, Lg8/x3;->x:I

    :cond_e
    :goto_9
    throw v3
.end method

.method public final a(I)V
    .locals 4

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "numMessages must be > 0"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lg8/x3;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-wide v0, p0, Lg8/x3;->u:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lg8/x3;->u:J

    invoke-virtual {p0}, Lg8/x3;->p()V

    return-void
.end method

.method public final b(I)V
    .locals 0

    iput p1, p0, Lg8/x3;->b:I

    return-void
.end method

.method public final close()V
    .locals 6

    invoke-virtual {p0}, Lg8/x3;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg8/x3;->s:Lg8/n0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Lg8/n0;->c:I

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lg8/x3;->f:Lg8/t1;

    if-eqz v4, :cond_4

    if-nez v0, :cond_3

    iget-boolean v0, v4, Lg8/t1;->p:Z

    xor-int/2addr v0, v1

    const-string v5, "GzipInflatingBuffer is closed"

    invoke-static {v5, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, v4, Lg8/t1;->c:Lg8/u;

    invoke-virtual {v0}, Lg8/u;->g()I

    move-result v0

    if-nez v0, :cond_3

    iget v0, v4, Lg8/t1;->o:I

    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :cond_3
    :goto_1
    iget-object v0, p0, Lg8/x3;->f:Lg8/t1;

    invoke-virtual {v0}, Lg8/t1;->close()V

    move v0, v1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v1, p0, Lg8/x3;->t:Lg8/n0;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lg8/n0;->close()V

    :cond_5
    iget-object v1, p0, Lg8/x3;->s:Lg8/n0;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lg8/n0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    iput-object v3, p0, Lg8/x3;->f:Lg8/t1;

    iput-object v3, p0, Lg8/x3;->t:Lg8/n0;

    iput-object v3, p0, Lg8/x3;->s:Lg8/n0;

    iget-object v1, p0, Lg8/x3;->a:Lg8/v3;

    invoke-interface {v1, v0}, Lg8/v3;->c(Z)V

    return-void

    :goto_3
    iput-object v3, p0, Lg8/x3;->f:Lg8/t1;

    iput-object v3, p0, Lg8/x3;->t:Lg8/n0;

    iput-object v3, p0, Lg8/x3;->s:Lg8/n0;

    throw v0
.end method

.method public final e(Lg8/m4;)V
    .locals 5

    const-string v0, "data"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, Lg8/x3;->q()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lg8/x3;->y:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lg8/x3;->f:Lg8/t1;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-boolean v3, v1, Lg8/t1;->p:Z

    xor-int/2addr v3, v0

    const-string v4, "GzipInflatingBuffer is closed"

    invoke-static {v4, v3}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v3, v1, Lg8/t1;->a:Lg8/n0;

    invoke-virtual {v3, p1}, Lg8/n0;->b(Lg8/m4;)V

    iput-boolean v2, v1, Lg8/t1;->v:Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lg8/x3;->t:Lg8/n0;

    invoke-virtual {v1, p1}, Lg8/n0;->b(Lg8/m4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lg8/x3;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    move v0, v2

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    :goto_2
    return-void

    :goto_3
    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    :cond_3
    throw v1
.end method

.method public final f()V
    .locals 4

    invoke-virtual {p0}, Lg8/x3;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg8/x3;->f:Lg8/t1;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v2, v0, Lg8/t1;->p:Z

    xor-int/2addr v2, v1

    const-string v3, "GzipInflatingBuffer is closed"

    invoke-static {v3, v2}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, v0, Lg8/t1;->v:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg8/x3;->t:Lg8/n0;

    iget v0, v0, Lg8/n0;->c:I

    if-nez v0, :cond_2

    :goto_0
    invoke-virtual {p0}, Lg8/x3;->close()V

    goto :goto_1

    :cond_2
    iput-boolean v1, p0, Lg8/x3;->y:Z

    :goto_1
    return-void
.end method

.method public final g(Le8/s;)V
    .locals 2

    iget-object v0, p0, Lg8/x3;->f:Lg8/t1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Already set full stream decompressor"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-object p1, p0, Lg8/x3;->e:Le8/s;

    return-void
.end method

.method public final p()V
    .locals 6

    iget-boolean v0, p0, Lg8/x3;->v:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/x3;->v:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-boolean v2, p0, Lg8/x3;->z:Z

    if-nez v2, :cond_3

    iget-wide v2, p0, Lg8/x3;->u:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    invoke-virtual {p0}, Lg8/x3;->O()Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Lg8/x3;->p:I

    invoke-static {v2}, Lt/k;->e(I)I

    move-result v2

    if-eqz v2, :cond_2

    if-ne v2, v0, :cond_1

    invoke-virtual {p0}, Lg8/x3;->u()V

    iget-wide v2, p0, Lg8/x3;->u:J

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lg8/x3;->u:J

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lg8/x3;->p:I

    invoke-static {v3}, La7/a;->D(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lg8/x3;->M()V

    goto :goto_0

    :cond_3
    iget-boolean v2, p0, Lg8/x3;->z:Z

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lg8/x3;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lg8/x3;->v:Z

    return-void

    :cond_4
    :try_start_1
    iget-boolean v2, p0, Lg8/x3;->y:Z

    if-eqz v2, :cond_6

    iget-object v2, p0, Lg8/x3;->f:Lg8/t1;

    if-eqz v2, :cond_5

    iget-boolean v3, v2, Lg8/t1;->p:Z

    xor-int/2addr v0, v3

    const-string v3, "GzipInflatingBuffer is closed"

    invoke-static {v3, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-boolean v0, v2, Lg8/t1;->v:Z

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lg8/x3;->t:Lg8/n0;

    iget v0, v0, Lg8/n0;->c:I

    if-nez v0, :cond_6

    :goto_1
    invoke-virtual {p0}, Lg8/x3;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    iput-boolean v1, p0, Lg8/x3;->v:Z

    return-void

    :goto_2
    iput-boolean v1, p0, Lg8/x3;->v:Z

    throw v0
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lg8/x3;->t:Lg8/n0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/x3;->f:Lg8/t1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u()V
    .locals 9

    iget v0, p0, Lg8/x3;->w:I

    iget v1, p0, Lg8/x3;->x:I

    int-to-long v1, v1

    iget-object v3, p0, Lg8/x3;->c:Lg8/y5;

    iget-object v4, v3, Lg8/y5;->a:[Lo7/d0;

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_0

    aget-object v8, v4, v7

    invoke-virtual {v8, v1, v2, v0}, Lo7/d0;->J(JI)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iput v6, p0, Lg8/x3;->x:I

    iget-boolean v0, p0, Lg8/x3;->r:Z

    const-string v1, "buffer"

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg8/x3;->e:Le8/s;

    sget-object v2, Le8/r;->a:Le8/r;

    if-eq v0, v2, :cond_1

    :try_start_0
    iget-object v2, p0, Lg8/x3;->s:Lg8/n0;

    sget-object v4, Lg8/p4;->a:Lg8/o4;

    new-instance v4, Lg8/n4;

    invoke-direct {v4}, Ljava/io/InputStream;-><init>()V

    invoke-static {v2, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v4, Lg8/n4;->a:Lg8/m4;

    invoke-interface {v0, v4}, Le8/s;->b(Lg8/n4;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v1, Lg8/w3;

    iget v2, p0, Lg8/x3;->b:I

    invoke-direct {v1, v0, v2, v3}, Lg8/w3;-><init>(Ljava/io/InputStream;ILg8/y5;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    sget-object v0, Le8/c2;->l:Le8/c2;

    const-string v1, "Can\'t decode compressed gRPC message as compression not configured"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    new-instance v1, Le8/e2;

    invoke-direct {v1, v0}, Le8/e2;-><init>(Le8/c2;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lg8/x3;->s:Lg8/n0;

    iget v0, v0, Lg8/n0;->c:I

    int-to-long v4, v0

    iget-object v0, v3, Lg8/y5;->a:[Lo7/d0;

    array-length v2, v0

    :goto_1
    if-ge v6, v2, :cond_3

    aget-object v3, v0, v6

    invoke-virtual {v3, v4, v5}, Lo7/d0;->K(J)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lg8/x3;->s:Lg8/n0;

    sget-object v2, Lg8/p4;->a:Lg8/o4;

    new-instance v2, Lg8/n4;

    invoke-direct {v2}, Ljava/io/InputStream;-><init>()V

    invoke-static {v0, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, v2, Lg8/n4;->a:Lg8/m4;

    move-object v1, v2

    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, Lg8/x3;->s:Lg8/n0;

    iget-object v0, p0, Lg8/x3;->a:Lg8/v3;

    new-instance v2, Lg8/u;

    invoke-direct {v2, v1}, Lg8/u;-><init>(Ljava/io/InputStream;)V

    invoke-interface {v0, v2}, Lg8/v3;->a(Lg8/a6;)V

    const/4 v0, 0x1

    iput v0, p0, Lg8/x3;->p:I

    const/4 v0, 0x5

    iput v0, p0, Lg8/x3;->q:I

    return-void
.end method
