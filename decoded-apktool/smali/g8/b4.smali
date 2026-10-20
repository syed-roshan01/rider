.class public final Lg8/b4;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/p1;


# instance fields
.field public final a:Lg8/a4;

.field public b:I

.field public c:Lh8/t;

.field public d:Le8/s;

.field public e:Z

.field public final f:Lg8/z3;

.field public final g:Ljava/nio/ByteBuffer;

.field public final h:La4/q;

.field public final i:Lg8/y5;

.field public j:Z

.field public k:I

.field public l:I

.field public m:J


# direct methods
.method public constructor <init>(Lg8/a4;La4/q;Lg8/y5;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lg8/b4;->b:I

    sget-object v1, Le8/r;->a:Le8/r;

    iput-object v1, p0, Lg8/b4;->d:Le8/s;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg8/b4;->e:Z

    new-instance v1, Lg8/z3;

    invoke-direct {v1, p0}, Lg8/z3;-><init>(Lg8/b4;)V

    iput-object v1, p0, Lg8/b4;->f:Lg8/z3;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lg8/b4;->g:Ljava/nio/ByteBuffer;

    iput v0, p0, Lg8/b4;->l:I

    const-string v0, "sink"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/b4;->a:Lg8/a4;

    iput-object p2, p0, Lg8/b4;->h:La4/q;

    iput-object p3, p0, Lg8/b4;->i:Lg8/y5;

    return-void
.end method

.method public static j(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 9

    instance-of v0, p0, Le8/f0;

    const/4 v1, -0x1

    const-wide/16 v2, 0x0

    const/16 v4, 0x2000

    const/4 v5, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Le8/f0;

    check-cast p0, Ll8/a;

    iget-object v0, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/protobuf/t1;->getSerializedSize()I

    move-result v5

    iget-object v0, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    invoke-interface {v0, p1}, Lcom/google/protobuf/t1;->writeTo(Ljava/io/OutputStream;)V

    iput-object v6, p0, Ll8/a;->a:Lcom/google/protobuf/t1;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    if-eqz v0, :cond_2

    sget-object v7, Ll8/c;->a:Lcom/google/protobuf/z;

    const-string v7, "outputStream cannot be null!"

    invoke-static {p1, v7}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-array v4, v4, [B

    :goto_0
    invoke-virtual {v0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-ne v7, v1, :cond_1

    long-to-int v5, v2

    iput-object v6, p0, Ll8/a;->c:Ljava/io/ByteArrayInputStream;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v4, v5, v7}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v7, v7

    add-long/2addr v2, v7

    goto :goto_0

    :cond_2
    :goto_1
    return v5

    :cond_3
    sget v0, Ls6/g;->a:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-array v0, v4, [B

    :goto_2
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-ne v4, v1, :cond_5

    const-wide/32 p0, 0x7fffffff

    cmp-long p0, v2, p0

    if-gtz p0, :cond_4

    const/4 v5, 0x1

    :cond_4
    const-string p0, "Message size overflow: %s"

    invoke-static {v2, v3, p0, v5}, Ly3/e;->D(JLjava/lang/String;Z)V

    long-to-int p0, v2

    return p0

    :cond_5
    invoke-virtual {p1, v0, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v6, v4

    add-long/2addr v2, v6

    goto :goto_2
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 3

    iget-object v0, p0, Lg8/b4;->c:Lh8/t;

    const/4 v1, 0x0

    iput-object v1, p0, Lg8/b4;->c:Lh8/t;

    iget v1, p0, Lg8/b4;->k:I

    iget-object v2, p0, Lg8/b4;->a:Lg8/a4;

    check-cast v2, Lg8/b;

    invoke-virtual {v2, v0, p1, p2, v1}, Lg8/b;->A(Lh8/t;ZZI)V

    const/4 p1, 0x0

    iput p1, p0, Lg8/b4;->k:I

    return-void
.end method

.method public final b(Lg8/y3;Z)V
    .locals 5

    iget-object p1, p1, Lg8/y3;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh8/t;

    iget v3, v3, Lh8/t;->c:I

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg8/b4;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-object p2, p0, Lg8/b4;->h:La4/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x5

    invoke-static {p2}, La4/q;->e(I)Lh8/t;

    move-result-object p2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p2, v3, v1, v0}, Lh8/t;->a([BII)V

    if-nez v2, :cond_1

    iput-object p2, p0, Lg8/b4;->c:Lh8/t;

    return-void

    :cond_1
    iget v0, p0, Lg8/b4;->k:I

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    iget-object v4, p0, Lg8/b4;->a:Lg8/a4;

    check-cast v4, Lg8/b;

    invoke-virtual {v4, p2, v1, v1, v0}, Lg8/b;->A(Lh8/t;ZZI)V

    iput v3, p0, Lg8/b4;->k:I

    move p2, v1

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v3

    if-ge p2, v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/t;

    invoke-virtual {v4, v0, v1, v1, v1}, Lg8/b;->A(Lh8/t;ZZI)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    invoke-static {p1, v3}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/t;

    iput-object p1, p0, Lg8/b4;->c:Lh8/t;

    int-to-long p1, v2

    iput-wide p1, p0, Lg8/b4;->m:J

    return-void
.end method

.method public final c(Z)Lg8/p1;
    .locals 0

    iput-boolean p1, p0, Lg8/b4;->e:Z

    return-object p0
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lg8/b4;->j:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/b4;->j:Z

    iget-object v1, p0, Lg8/b4;->c:Lh8/t;

    if-eqz v1, :cond_0

    iget v1, v1, Lh8/t;->c:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lg8/b4;->c:Lh8/t;

    :cond_0
    invoke-virtual {p0, v0, v0}, Lg8/b4;->a(ZZ)V

    :cond_1
    return-void
.end method

.method public final d(Le8/s;)Lg8/p1;
    .locals 1

    const-string v0, "Can\'t pass an empty compressor"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/b4;->d:Le8/s;

    return-object p0
.end method

.method public final e(I)V
    .locals 2

    iget v0, p0, Lg8/b4;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "max size already set"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput p1, p0, Lg8/b4;->b:I

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lg8/b4;->j:Z

    return v0
.end method

.method public final flush()V
    .locals 2

    iget-object v0, p0, Lg8/b4;->c:Lh8/t;

    if-eqz v0, :cond_0

    iget v0, v0, Lh8/t;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lg8/b4;->a(ZZ)V

    :cond_0
    return-void
.end method

.method public final g(Ljava/io/InputStream;)V
    .locals 13

    const-string v0, "Failed to frame message"

    iget-boolean v1, p0, Lg8/b4;->j:Z

    if-nez v1, :cond_a

    iget v1, p0, Lg8/b4;->k:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lg8/b4;->k:I

    iget v1, p0, Lg8/b4;->l:I

    add-int/2addr v1, v2

    iput v1, p0, Lg8/b4;->l:I

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lg8/b4;->m:J

    iget-object v3, p0, Lg8/b4;->i:Lg8/y5;

    iget-object v4, v3, Lg8/y5;->a:[Lo7/d0;

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_0

    aget-object v8, v4, v7

    invoke-virtual {v8, v1}, Lo7/d0;->c0(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lg8/b4;->e:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg8/b4;->d:Le8/s;

    sget-object v4, Le8/r;->a:Le8/r;

    if-eq v1, v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    :try_start_0
    instance-of v1, p1, Le8/t0;

    const/4 v4, -0x1

    if-nez v1, :cond_3

    instance-of v1, p1, Ljava/io/ByteArrayInputStream;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v4

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v1

    :goto_3
    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    invoke-virtual {p0, p1}, Lg8/b4;->h(Ljava/io/InputStream;)I

    move-result p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_9

    :catch_1
    move-exception p1

    goto/16 :goto_a

    :cond_4
    invoke-virtual {p0, p1, v1}, Lg8/b4;->k(Ljava/io/InputStream;I)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    if-eq v1, v4, :cond_6

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Message length inaccurate %s != %s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Le8/c2;->l:Le8/c2;

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw v0

    :cond_6
    :goto_5
    int-to-long v7, p1

    iget-object p1, v3, Lg8/y5;->a:[Lo7/d0;

    array-length v0, p1

    move v1, v6

    :goto_6
    if-ge v1, v0, :cond_7

    aget-object v2, p1, v1

    invoke-virtual {v2, v7, v8}, Lo7/d0;->e0(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_7
    iget-wide v0, p0, Lg8/b4;->m:J

    array-length v2, p1

    move v4, v6

    :goto_7
    if-ge v4, v2, :cond_8

    aget-object v5, p1, v4

    invoke-virtual {v5, v0, v1}, Lo7/d0;->f0(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_8
    iget p1, p0, Lg8/b4;->l:I

    iget-wide v9, p0, Lg8/b4;->m:J

    iget-object v0, v3, Lg8/y5;->a:[Lo7/d0;

    array-length v11, v0

    move v12, v6

    :goto_8
    if-ge v12, v11, :cond_9

    aget-object v1, v0, v12

    move-wide v2, v9

    move-wide v4, v7

    move v6, p1

    invoke-virtual/range {v1 .. v6}, Lo7/d0;->d0(JJI)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_9
    return-void

    :goto_9
    sget-object v1, Le8/c2;->l:Le8/c2;

    invoke-virtual {v1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw v0

    :goto_a
    sget-object v1, Le8/c2;->l:Le8/c2;

    invoke-virtual {v1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw v0

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Framer already closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Ljava/io/InputStream;)I
    .locals 3

    new-instance v0, Lg8/y3;

    invoke-direct {v0, p0}, Lg8/y3;-><init>(Lg8/b4;)V

    iget-object v1, p0, Lg8/b4;->d:Le8/s;

    invoke-interface {v1, v0}, Le8/s;->a(Lg8/y3;)Ljava/io/OutputStream;

    move-result-object v1

    :try_start_0
    invoke-static {p1, v1}, Lg8/b4;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    iget v1, p0, Lg8/b4;->b:I

    if-ltz v1, :cond_1

    if-gt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Le8/c2;->k:Le8/c2;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v2, p0, Lg8/b4;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p1, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "message too large %d > %d"

    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance v0, Le8/e2;

    invoke-direct {v0, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lg8/b4;->b(Lg8/y3;Z)V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    throw p1
.end method

.method public final i([BII)V
    .locals 2

    :goto_0
    if-lez p3, :cond_2

    iget-object v0, p0, Lg8/b4;->c:Lh8/t;

    if-eqz v0, :cond_0

    iget v0, v0, Lh8/t;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lg8/b4;->a(ZZ)V

    :cond_0
    iget-object v0, p0, Lg8/b4;->c:Lh8/t;

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/b4;->h:La4/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, La4/q;->e(I)Lh8/t;

    move-result-object v0

    iput-object v0, p0, Lg8/b4;->c:Lh8/t;

    :cond_1
    iget-object v0, p0, Lg8/b4;->c:Lh8/t;

    iget v0, v0, Lh8/t;->b:I

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lg8/b4;->c:Lh8/t;

    invoke-virtual {v1, p1, p2, v0}, Lh8/t;->a([BII)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final k(Ljava/io/InputStream;I)I
    .locals 5

    const/4 v0, -0x1

    const/4 v1, 0x0

    const-string v2, "message too large %d > %d"

    if-eq p2, v0, :cond_3

    int-to-long v3, p2

    iput-wide v3, p0, Lg8/b4;->m:J

    iget v0, p0, Lg8/b4;->b:I

    if-ltz v0, :cond_1

    if-gt p2, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Le8/c2;->k:Le8/c2;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget v1, p0, Lg8/b4;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p2, v1}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, v2, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance p2, Le8/e2;

    invoke-direct {p2, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw p2

    :cond_1
    :goto_0
    iget-object v0, p0, Lg8/b4;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lg8/b4;->c:Lh8/t;

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, p2

    iget-object p2, p0, Lg8/b4;->h:La4/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La4/q;->e(I)Lh8/t;

    move-result-object p2

    iput-object p2, p0, Lg8/b4;->c:Lh8/t;

    :cond_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0, p2, v1, v0}, Lg8/b4;->i([BII)V

    iget-object p2, p0, Lg8/b4;->f:Lg8/z3;

    invoke-static {p1, p2}, Lg8/b4;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result p1

    return p1

    :cond_3
    new-instance p2, Lg8/y3;

    invoke-direct {p2, p0}, Lg8/y3;-><init>(Lg8/b4;)V

    invoke-static {p1, p2}, Lg8/b4;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result p1

    iget v0, p0, Lg8/b4;->b:I

    if-ltz v0, :cond_5

    if-gt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    sget-object p2, Le8/c2;->k:Le8/c2;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, p0, Lg8/b4;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance p2, Le8/e2;

    invoke-direct {p2, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw p2

    :cond_5
    :goto_1
    invoke-virtual {p0, p2, v1}, Lg8/b4;->b(Lg8/y3;Z)V

    return p1
.end method
