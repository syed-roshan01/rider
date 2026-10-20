.class public abstract Lh6/g;
.super Ljava/lang/Object;


# static fields
.field public static volatile a:Ljava/lang/ClassLoader;

.field public static volatile b:Ljava/lang/Thread;

.field public static c:Z

.field public static d:Ljava/lang/reflect/Method;

.field public static e:Li1/f;

.field public static f:Li1/f;

.field public static g:Li1/f;

.field public static h:Li1/f;

.field public static i:Li1/f;

.field public static j:Li1/f;

.field public static k:Li1/f;

.field public static l:Li1/f;

.field public static m:Li1/f;

.field public static n:Li1/f;

.field public static o:Li1/f;

.field public static p:Li1/f;

.field public static q:Li1/f;

.field public static r:Li1/f;

.field public static s:Li1/f;

.field public static t:Li1/f;


# direct methods
.method public static A([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 3

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget-wide v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(J)J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static final A0(J)D
    .locals 4

    const/16 v0, 0xb

    ushr-long v0, p0, v0

    long-to-double v0, v0

    const/16 v2, 0x800

    int-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/16 v2, 0x7ff

    and-long/2addr p0, v2

    long-to-double p0, p0

    add-double/2addr v0, p0

    return-wide v0
.end method

.method public static B([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static B0(Ljava/lang/String;)V
    .locals 4

    const-string v0, "If you wish to display this "

    const-string v1, ", use androidx.compose.foundation.Image."

    invoke-static {v0, p0, v1}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ". "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static C([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 3

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget-wide v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-virtual {p2, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static declared-synchronized C0()Ljava/lang/ClassLoader;
    .locals 2

    const-class v0, Lh6/g;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lh6/g;->a:Ljava/lang/ClassLoader;

    if-nez v1, :cond_0

    invoke-static {}, Lh6/g;->D0()Ljava/lang/ClassLoader;

    move-result-object v1

    sput-object v1, Lh6/g;->a:Ljava/lang/ClassLoader;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lh6/g;->a:Ljava/lang/ClassLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public static D(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->b(I)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->b(I)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static declared-synchronized D0()Ljava/lang/ClassLoader;
    .locals 6

    const-string v0, "Failed to get thread context classloader "

    const-class v1, Lh6/g;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lh6/g;->b:Ljava/lang/Thread;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-static {}, Lh6/g;->E0()Ljava/lang/Thread;

    move-result-object v2

    sput-object v2, Lh6/g;->b:Ljava/lang/Thread;

    sget-object v2, Lh6/g;->b:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit v1

    return-object v3

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_0
    :try_start_1
    sget-object v2, Lh6/g;->b:Ljava/lang/Thread;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v4, Lh6/g;->b:Ljava/lang/Thread;

    invoke-virtual {v4}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v4

    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "DynamiteLoaderV2CL"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v1

    return-object v3

    :goto_2
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    monitor-exit v1

    throw v0
.end method

.method public static E(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-static {p1, p2, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(J)J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->c(J)J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static declared-synchronized E0()Ljava/lang/Thread;
    .locals 12

    const-class v0, Lh6/g;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getThreadGroup()Ljava/lang/ThreadGroup;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    :try_start_1
    const-class v3, Ljava/lang/Void;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/ThreadGroup;->activeGroupCount()I

    move-result v4

    new-array v5, v4, [Ljava/lang/ThreadGroup;

    invoke-virtual {v1, v5}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/ThreadGroup;)I

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v4, :cond_2

    aget-object v8, v5, v7

    const-string v9, "dynamiteLoader"

    invoke-virtual {v8}, Ljava/lang/ThreadGroup;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_8

    :catch_0
    move-exception v1

    goto :goto_5

    :cond_2
    move-object v8, v2

    :goto_1
    if-nez v8, :cond_3

    new-instance v8, Ljava/lang/ThreadGroup;

    const-string v4, "dynamiteLoader"

    invoke-direct {v8, v1, v4}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v8}, Ljava/lang/ThreadGroup;->activeCount()I

    move-result v1

    new-array v4, v1, [Ljava/lang/Thread;

    invoke-virtual {v8, v4}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/Thread;)I

    :goto_2
    if-ge v6, v1, :cond_5

    aget-object v5, v4, v6

    const-string v7, "GmsDynamite"

    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    move-object v5, v2

    :goto_3
    if-nez v5, :cond_6

    :try_start_3
    new-instance v1, Lh6/f;

    invoke-direct {v1, v8}, Lh6/f;-><init>(Ljava/lang/ThreadGroup;)V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    move-object v5, v1

    goto :goto_7

    :catch_1
    move-exception v2

    goto :goto_6

    :catch_2
    move-exception v1

    move-object v2, v1

    move-object v1, v5

    goto :goto_6

    :goto_5
    move-object v11, v2

    move-object v2, v1

    move-object v1, v11

    :goto_6
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to enumerate thread/threadgroup "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "DynamiteLoaderV2CL"

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_6
    :goto_7
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v0

    return-object v5

    :goto_8
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static F([BILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 3

    invoke-static {p0, p1, p2}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    return p1

    :cond_0
    new-instance v1, Ljava/lang/String;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, p1, v0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v1, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static G(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 4

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_5

    const-string v1, ""

    if-nez v0, :cond_0

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, p2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    add-int/2addr p2, v0

    :goto_1
    if-ge p2, p3, :cond_4

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v0, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_3

    if-nez v0, :cond_2

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/lang/String;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, p2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_4
    :goto_2
    return p2

    :cond_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static H(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 5

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_7

    const-string v1, ""

    if-nez v0, :cond_0

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int v2, p2, v0

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/z1;->a:Lcom/google/crypto/tink/shaded/protobuf/x1;

    invoke-virtual {v3, p1, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/x1;->t0([BII)I

    move-result v3

    if-nez v3, :cond_6

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, p2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    move p2, v2

    :goto_1
    if-ge p2, p3, :cond_5

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v2, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v0, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_4

    if-nez v0, :cond_2

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    add-int v2, p2, v0

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/z1;->a:Lcom/google/crypto/tink/shaded/protobuf/x1;

    invoke-virtual {v3, p1, p2, v2}, Lcom/google/crypto/tink/shaded/protobuf/x1;->t0([BII)I

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, p2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_5
    :goto_2
    return p2

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->b()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static I([BILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    invoke-static {p0, p1, p2}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    const-string p0, ""

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    return p1

    :cond_0
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/z1;->a:Lcom/google/crypto/tink/shaded/protobuf/x1;

    invoke-virtual {v1, p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x1;->r0([BII)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static J(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 9

    ushr-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_b

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p3, 0x5

    if-ne v0, p3, :cond_0

    invoke-static {p2, p1}, Lh6/g;->l(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x4

    return p2

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->a()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o1;->c()Lcom/google/crypto/tink/shaded/protobuf/o1;

    move-result-object v6

    and-int/lit8 v0, p0, -0x8

    or-int/lit8 v7, v0, 0x4

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v2

    iget p2, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ne p2, v7, :cond_2

    move v0, p2

    move p2, v2

    goto :goto_1

    :cond_2
    move v0, p2

    move-object v1, p1

    move v3, p3

    move-object v4, v6

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lh6/g;->J(I[BIILcom/google/crypto/tink/shaded/protobuf/o1;Lcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    move v8, v0

    move v0, p2

    move p2, v8

    goto :goto_0

    :cond_3
    :goto_1
    if-gt p2, p3, :cond_4

    if-ne v0, v7, :cond_4

    invoke-virtual {p4, p0, v6}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    return p2

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_5
    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget p3, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz p3, :cond_8

    array-length p5, p1

    sub-int/2addr p5, p2

    if-gt p3, p5, :cond_7

    if-nez p3, :cond_6

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    :goto_2
    add-int/2addr p2, p3

    return p2

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_9
    invoke-static {p2, p1}, Lh6/g;->n(I[B)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p4, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x8

    return p2

    :cond_a
    invoke-static {p1, p2, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget-wide p2, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/o1;->d(ILjava/lang/Object;)V

    return p1

    :cond_b
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->a()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static K(I[BILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    and-int/lit8 p0, p0, 0x7f

    add-int/lit8 v0, p2, 0x1

    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    shl-int/lit8 p1, v1, 0x7

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    return v0

    :cond_0
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr p0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v0, p1, v0

    if-ltz v0, :cond_1

    shl-int/lit8 p1, v0, 0xe

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    return v1

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0xe

    or-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x3

    aget-byte v1, p1, v1

    if-ltz v1, :cond_2

    shl-int/lit8 p1, v1, 0x15

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    return v0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr p0, v1

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, v0

    if-ltz v0, :cond_3

    shl-int/lit8 p1, v0, 0x1c

    or-int/2addr p0, p1

    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    return p2

    :cond_3
    and-int/lit8 v0, v0, 0x7f

    shl-int/lit8 v0, v0, 0x1c

    or-int/2addr p0, v0

    :goto_0
    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    if-gez p2, :cond_4

    move p2, v0

    goto :goto_0

    :cond_4
    iput p0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    return v0
.end method

.method public static L([BILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    if-ltz p1, :cond_0

    iput p1, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    return v0

    :cond_0
    invoke-static {p1, p0, v0, p2}, Lh6/g;->K(I[BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p0

    return p0
.end method

.method public static M(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static N([BILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 9

    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    iput-wide v1, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    return v0

    :cond_0
    const-wide/16 v3, 0x7f

    and-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x2

    aget-byte v0, p0, v0

    and-int/lit8 v3, v0, 0x7f

    int-to-long v3, v3

    const/4 v5, 0x7

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    move v3, v5

    :goto_0
    if-gez v0, :cond_1

    add-int/lit8 v0, p1, 0x1

    aget-byte p1, p0, p1

    add-int/2addr v3, v5

    and-int/lit8 v4, p1, 0x7f

    int-to-long v6, v4

    shl-long/2addr v6, v3

    or-long/2addr v1, v6

    move v8, v0

    move v0, p1

    move p1, v8

    goto :goto_0

    :cond_1
    iput-wide v1, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    return p1
.end method

.method public static O(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-static {p1, p2, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, v0, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static P(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 5

    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v0, Lb3/p0;->d:Ljava/util/ArrayList;

    const v0, 0x7f0800cf

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/p0;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    new-instance v1, Lb3/p0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Lb3/p0;->a:Ljava/util/WeakHashMap;

    iput-object v3, v1, Lb3/p0;->b:Landroid/util/SparseArray;

    iput-object v3, v1, Lb3/p0;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    iget-object p0, v1, Lb3/p0;->c:Ljava/lang/ref/WeakReference;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p0, v1, Lb3/p0;->c:Ljava/lang/ref/WeakReference;

    iget-object p0, v1, Lb3/p0;->b:Landroid/util/SparseArray;

    if-nez p0, :cond_3

    new-instance p0, Landroid/util/SparseArray;

    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    iput-object p0, v1, Lb3/p0;->b:Landroid/util/SparseArray;

    :cond_3
    iget-object p0, v1, Lb3/p0;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v0

    if-ltz v0, :cond_4

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, v0}, Landroid/util/SparseArray;->removeAt(I)V

    goto :goto_0

    :cond_4
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/lang/ref/WeakReference;

    :cond_5
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-eqz p0, :cond_7

    invoke-static {p0}, Lb3/e0;->b(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_7

    const p1, 0x7f0800d0

    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    if-gez p1, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La7/a;->w(Ljava/lang/Object;)V

    throw v3

    :cond_7
    :goto_1
    move v2, v1

    :cond_8
    :goto_2
    return v2
.end method

.method public static final Q(Lp9/f;)Lp9/f;
    .locals 4

    instance-of v0, p0, Lp9/o0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lp9/j;->a:Lp9/j;

    sget-object v1, Lp9/i;->a:Lp9/i;

    instance-of v2, p0, Lp9/e;

    if-eqz v2, :cond_1

    move-object v2, p0

    check-cast v2, Lp9/e;

    iget-object v3, v2, Lp9/e;->b:Lc9/c;

    if-ne v3, v0, :cond_1

    iget-object v0, v2, Lp9/e;->c:Lc9/e;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lp9/e;

    invoke-direct {v0, p0}, Lp9/e;-><init>(Lp9/f;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static R(IILjava/math/RoundingMode;)I
    .locals 5

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_7

    div-int v0, p0, p1

    mul-int v1, p1, v0

    sub-int v1, p0, v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    xor-int/2addr p0, p1

    shr-int/lit8 p0, p0, 0x1f

    const/4 v2, 0x1

    or-int/2addr p0, v2

    sget-object v3, Lt6/a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :pswitch_0
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    sub-int/2addr p1, v1

    sub-int/2addr v1, p1

    if-nez v1, :cond_3

    sget-object p1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    if-eq p2, p1, :cond_4

    sget-object p1, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    const/4 v1, 0x0

    if-ne p2, p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    and-int/lit8 p2, v0, 0x1

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    and-int/2addr p1, v2

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_3
    if-lez v1, :cond_5

    goto :goto_2

    :pswitch_1
    if-lez p0, :cond_5

    goto :goto_2

    :pswitch_2
    if-gez p0, :cond_5

    :cond_4
    :goto_2
    :pswitch_3
    add-int/2addr v0, p0

    goto :goto_3

    :pswitch_4
    if-nez v1, :cond_6

    :cond_5
    :goto_3
    :pswitch_5
    return v0

    :cond_6
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "mode was UNNECESSARY, but rounding was necessary"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "/ by zero"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final S(Lu8/j;)V
    .locals 1

    sget-object v0, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p0, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p0

    check-cast p0, Lm9/f1;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lm9/f1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Lm9/p1;

    invoke-virtual {p0}, Lm9/p1;->H()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static final T(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static U(Lcom/google/crypto/tink/shaded/protobuf/l;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->e(I)B

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/16 v3, 0x27

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    const/16 v4, 0x20

    if-lt v2, v4, :cond_0

    const/16 v4, 0x7e

    if-gt v2, v4, :cond_0

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x7

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v2, "\\r"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v2, "\\f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string v2, "\\v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string v2, "\\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string v2, "\\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string v2, "\\b"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string v2, "\\a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\\\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "\\\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "\\\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final V(La4/c0;Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lp9/s;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp9/s;

    iget v1, v0, Lp9/s;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp9/s;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp9/s;

    invoke-direct {v0, p1}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lp9/s;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lp9/s;->d:I

    sget-object v3, Lq9/c;->b:Li3/u;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lp9/s;->b:Lp9/p;

    iget-object v0, v0, Lp9/s;->a:Ld9/u;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lq9/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p1, Ld9/u;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object v3, p1, Ld9/u;->a:Ljava/lang/Object;

    new-instance v2, Lp9/p;

    invoke-direct {v2, p1}, Lp9/p;-><init>(Ld9/u;)V

    :try_start_1
    iput-object p1, v0, Lp9/s;->a:Ld9/u;

    iput-object v2, v0, Lp9/s;->b:Lp9/p;

    iput v4, v0, Lp9/s;->d:I

    invoke-virtual {p0, v2, v0}, La4/c0;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lq9/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    iget-object v1, p1, Lq9/a;->a:Lp9/g;

    if-ne v1, p0, :cond_5

    :goto_2
    iget-object v1, v0, Ld9/u;->a:Ljava/lang/Object;

    if-eq v1, v3, :cond_4

    :goto_3
    return-object v1

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    throw p1
.end method

.method public static final W(Lp9/f;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lp9/t;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp9/t;

    iget v1, v0, Lp9/t;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp9/t;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp9/t;

    invoke-direct {v0, p2}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lp9/t;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lp9/t;->e:I

    sget-object v3, Lq9/c;->b:Li3/u;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lp9/t;->c:Lp9/r;

    iget-object p1, v0, Lp9/t;->b:Ld9/u;

    iget-object v0, v0, Lp9/t;->a:Lc9/e;

    :try_start_0
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lq9/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p2, Ld9/u;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object v3, p2, Ld9/u;->a:Ljava/lang/Object;

    new-instance v2, Lp9/r;

    invoke-direct {v2, p1, p2}, Lp9/r;-><init>(Lc9/e;Ld9/u;)V

    :try_start_1
    iput-object p1, v0, Lp9/t;->a:Lc9/e;

    iput-object p2, v0, Lp9/t;->b:Ld9/u;

    iput-object v2, v0, Lp9/t;->c:Lp9/r;

    iput v4, v0, Lp9/t;->e:I

    invoke-interface {p0, v2, v0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lq9/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, p1

    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    iget-object v1, p2, Lq9/a;->a:Lp9/g;

    if-ne v1, p0, :cond_5

    :goto_2
    iget-object v1, p1, Ld9/u;->a:Ljava/lang/Object;

    if-eq v1, v3, :cond_4

    :goto_3
    return-object v1

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Expected at least one element matching the predicate "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    throw p2
.end method

.method public static final X(J)Ljava/lang/String;
    .locals 12

    const-wide/32 v0, -0x3b9328e0

    cmp-long v0, p0, v0

    const-string v1, " s "

    const v2, 0x3b9aca00

    const v3, 0x1dcd6500

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    sub-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    const-wide/32 v4, -0xf404c

    cmp-long v0, p0, v4

    const-string v4, " ms"

    const v5, 0xf4240

    const v6, 0x7a120

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    sub-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x0

    cmp-long v0, p0, v7

    const-string v7, " \u00b5s"

    const/16 v8, 0x3e8

    const/16 v9, 0x1f4

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    sub-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-wide/32 v10, 0xf404c

    cmp-long v0, p0, v10

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    add-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const-wide/32 v7, 0x3b9328e0

    cmp-long v0, p0, v7

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    add-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    add-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/4 p1, 0x1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%6s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(format, *args)"

    invoke-static {p0, p1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final Y()Li1/f;
    .locals 12

    sget-object v0, Lh6/g;->e:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Accessibility"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    const/4 v2, 0x7

    const/high16 v3, 0x41400000    # 12.0f

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v2, v3, v4}, Lt/k;->c(IFF)Lk/f;

    move-result-object v2

    const v6, 0x3f8ccccd    # 1.1f

    const/4 v7, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const v9, 0x3f666666    # 0.9f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x40000000    # 2.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v3, -0x4099999a    # -0.9f

    const/high16 v5, -0x40000000    # -2.0f

    invoke-virtual {v2, v3, v4, v5, v4}, Lk/f;->H(FFFF)V

    invoke-virtual {v2, v5, v3, v5, v5}, Lk/f;->H(FFFF)V

    const v3, 0x3f666666    # 0.9f

    invoke-virtual {v2, v3, v5, v4, v5}, Lk/f;->H(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41a80000    # 21.0f

    const/high16 v6, 0x41100000    # 9.0f

    invoke-virtual {v2, v3, v6}, Lk/f;->D(FF)V

    const/high16 v3, -0x3f400000    # -6.0f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const/high16 v7, 0x41500000    # 13.0f

    invoke-virtual {v2, v7}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    const/high16 v3, 0x41b00000    # 22.0f

    invoke-virtual {v2, v6, v3}, Lk/f;->B(FF)V

    invoke-virtual {v2, v6, v6}, Lk/f;->B(FF)V

    const/high16 v3, 0x40400000    # 3.0f

    invoke-virtual {v2, v3, v6}, Lk/f;->B(FF)V

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v5}, Lk/f;->B(FF)V

    const/high16 v3, 0x41900000    # 18.0f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    invoke-virtual {v2, v4}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->e:Li1/f;

    return-object v0
.end method

.method public static final Z()Li1/f;
    .locals 12

    sget-object v0, Lh6/g;->f:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.ArrowBack"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41a00000    # 20.0f

    const/high16 v4, 0x41300000    # 11.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v4, 0x40fa8f5c    # 7.83f

    invoke-virtual {v2, v4}, Lk/f;->z(F)V

    const v5, 0x40b2e148    # 5.59f

    const v6, -0x3f4d1eb8    # -5.59f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    const/high16 v5, 0x41400000    # 12.0f

    const/high16 v6, 0x40800000    # 4.0f

    invoke-virtual {v2, v5, v6}, Lk/f;->B(FF)V

    const/high16 v5, -0x3f000000    # -8.0f

    const/high16 v6, 0x41000000    # 8.0f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    invoke-virtual {v2, v6, v6}, Lk/f;->C(FF)V

    const v5, 0x3fb47ae1    # 1.41f

    const v6, -0x404b851f    # -1.41f

    invoke-virtual {v2, v5, v6}, Lk/f;->C(FF)V

    const/high16 v5, 0x41500000    # 13.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->B(FF)V

    invoke-virtual {v2, v3}, Lk/f;->z(F)V

    const/high16 v3, -0x40000000    # -2.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->f:Li1/f;

    return-object v0
.end method

.method public static final a(Laa/a;Laa/c;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Laa/f;->h:Lx9/v;

    invoke-virtual {v0}, Lx9/v;->v()Ljava/util/logging/Logger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Laa/c;->b:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%-22s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(format, *args)"

    invoke-static {p1, p2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Laa/a;->a:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    return-void
.end method

.method public static final a0()Li1/f;
    .locals 17

    sget-object v0, Lh6/g;->g:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.CalendarMonth"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41980000    # 19.0f

    const/high16 v4, 0x40800000    # 4.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    const/high16 v11, 0x40000000    # 2.0f

    invoke-virtual {v2, v11}, Lk/f;->J(F)V

    const/high16 v12, -0x40000000    # -2.0f

    invoke-virtual {v2, v12}, Lk/f;->A(F)V

    invoke-virtual {v2, v11}, Lk/f;->K(F)V

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v2, v4}, Lk/f;->z(F)V

    invoke-virtual {v2, v11}, Lk/f;->J(F)V

    const/high16 v13, 0x40c00000    # 6.0f

    invoke-virtual {v2, v13}, Lk/f;->z(F)V

    invoke-virtual {v2, v11}, Lk/f;->K(F)V

    const/high16 v14, 0x40a00000    # 5.0f

    invoke-virtual {v2, v14}, Lk/f;->z(F)V

    const v5, 0x4078f5c3    # 3.89f

    const/high16 v6, 0x40800000    # 4.0f

    const v7, 0x4040a3d7    # 3.01f

    const v8, 0x409ccccd    # 4.9f

    const v9, 0x4040a3d7    # 3.01f

    const/high16 v10, 0x40c00000    # 6.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->u(FFFFFF)V

    const/high16 v4, 0x40400000    # 3.0f

    const/high16 v15, 0x41a00000    # 20.0f

    invoke-virtual {v2, v4, v15}, Lk/f;->B(FF)V

    const/4 v5, 0x0

    const v6, 0x3f8ccccd    # 1.1f

    const v7, 0x3f63d70a    # 0.89f

    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v9, 0x40000000    # 2.0f

    const/high16 v10, 0x40000000    # 2.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    const/high16 v10, 0x41600000    # 14.0f

    invoke-virtual {v2, v10}, Lk/f;->A(F)V

    const v5, 0x3f8ccccd    # 1.1f

    const/4 v6, 0x0

    const/high16 v7, 0x40000000    # 2.0f

    const v8, -0x4099999a    # -0.9f

    const/high16 v16, -0x40000000    # -2.0f

    move v11, v10

    move/from16 v10, v16

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v13}, Lk/f;->J(F)V

    const/high16 v5, 0x41a80000    # 21.0f

    const v6, 0x409ccccd    # 4.9f

    const v7, 0x41a0cccd    # 20.1f

    const/high16 v8, 0x40800000    # 4.0f

    const/high16 v9, 0x41980000    # 19.0f

    const/high16 v10, 0x40800000    # 4.0f

    invoke-virtual/range {v4 .. v10}, Lk/f;->u(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    invoke-virtual {v2, v3, v15}, Lk/f;->D(FF)V

    invoke-virtual {v2, v14}, Lk/f;->z(F)V

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v2, v3}, Lk/f;->J(F)V

    invoke-virtual {v2, v11}, Lk/f;->A(F)V

    invoke-virtual {v2, v15}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41100000    # 9.0f

    invoke-virtual {v2, v3, v11}, Lk/f;->D(FF)V

    const/high16 v4, 0x40e00000    # 7.0f

    invoke-virtual {v2, v4}, Lk/f;->z(F)V

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    const/high16 v5, 0x40000000    # 2.0f

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v11}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v6, 0x41500000    # 13.0f

    invoke-virtual {v2, v6, v11}, Lk/f;->D(FF)V

    invoke-virtual {v2, v12}, Lk/f;->A(F)V

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v11}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v7, 0x41880000    # 17.0f

    invoke-virtual {v2, v7, v11}, Lk/f;->D(FF)V

    invoke-virtual {v2, v12}, Lk/f;->A(F)V

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v11}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v8, 0x41900000    # 18.0f

    invoke-virtual {v2, v3, v8}, Lk/f;->D(FF)V

    invoke-virtual {v2, v4}, Lk/f;->z(F)V

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v8}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    invoke-virtual {v2, v6, v8}, Lk/f;->D(FF)V

    invoke-virtual {v2, v12}, Lk/f;->A(F)V

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v8}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    invoke-virtual {v2, v7, v8}, Lk/f;->D(FF)V

    invoke-virtual {v2, v12}, Lk/f;->A(F)V

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    invoke-virtual {v2, v8}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->g:Li1/f;

    return-object v0
.end method

.method public static final b(Lc9/e;)Lp9/c;
    .locals 4

    new-instance v0, Lp9/c;

    sget-object v1, Lu8/k;->a:Lu8/k;

    sget-object v2, Lo9/a;->a:Lo9/a;

    const/4 v3, -0x2

    invoke-direct {v0, p0, v1, v3, v2}, Lp9/c;-><init>(Lc9/e;Lu8/j;ILo9/a;)V

    return-object v0
.end method

.method public static final b0()Li1/f;
    .locals 12

    sget-object v0, Lh6/g;->h:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.CheckCircle"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    const/4 v2, 0x7

    const/high16 v3, 0x41400000    # 12.0f

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v2, v3, v4}, Lt/k;->c(IFF)Lk/f;

    move-result-object v2

    const v6, 0x40cf5c29    # 6.48f

    const/high16 v7, 0x40000000    # 2.0f

    const/high16 v8, 0x40000000    # 2.0f

    const v9, 0x40cf5c29    # 6.48f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x41400000    # 12.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    const v5, 0x408f5c29    # 4.48f

    const/high16 v6, 0x41200000    # 10.0f

    invoke-virtual {v2, v5, v6, v6, v6}, Lk/f;->H(FFFF)V

    const v5, -0x3f70a3d7    # -4.48f

    const/high16 v7, -0x3ee00000    # -10.0f

    invoke-virtual {v2, v6, v5, v6, v7}, Lk/f;->H(FFFF)V

    const v5, 0x418c28f6    # 17.52f

    invoke-virtual {v2, v5, v4, v3, v4}, Lk/f;->G(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41880000    # 17.0f

    invoke-virtual {v2, v6, v3}, Lk/f;->D(FF)V

    const/high16 v3, -0x3f600000    # -5.0f

    invoke-virtual {v2, v3, v3}, Lk/f;->C(FF)V

    const v3, 0x3fb47ae1    # 1.41f

    const v4, -0x404b851f    # -1.41f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    const v3, 0x4162b852    # 14.17f

    invoke-virtual {v2, v6, v3}, Lk/f;->B(FF)V

    const v3, 0x40f2e148    # 7.59f

    const v4, -0x3f0d1eb8    # -7.59f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    const/high16 v3, 0x41980000    # 19.0f

    const/high16 v4, 0x41000000    # 8.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    const/high16 v3, -0x3ef00000    # -9.0f

    const/high16 v4, 0x41100000    # 9.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->h:Li1/f;

    return-object v0
.end method

.method public static final c(Lo9/s;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "Channel was consumed, consumer had failed"

    invoke-static {v0, p1}, Ld7/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    move-object v0, p1

    :cond_1
    invoke-interface {p0, v0}, Lo9/s;->a(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final c0()Li1/f;
    .locals 14

    sget-object v0, Lh6/g;->j:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.DirectionsCar"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    const/4 v2, 0x7

    const v3, 0x41975c29    # 18.92f

    const v4, 0x40c051ec    # 6.01f

    invoke-static {v2, v3, v4}, Lt/k;->c(IFF)Lk/f;

    move-result-object v2

    const v6, 0x4195c28f    # 18.72f

    const v7, 0x40ad70a4    # 5.42f

    const v8, 0x419147ae    # 18.16f

    const/high16 v9, 0x40a00000    # 5.0f

    const/high16 v10, 0x418c0000    # 17.5f

    const/high16 v11, 0x40a00000    # 5.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    const/high16 v3, -0x3ed00000    # -11.0f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const v6, -0x40d70a3d    # -0.66f

    const/4 v7, 0x0

    const v8, -0x40651eb8    # -1.21f

    const v9, 0x3ed70a3d    # 0.42f

    const v10, -0x404a3d71    # -1.42f

    const v11, 0x3f8147ae    # 1.01f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/high16 v3, 0x40400000    # 3.0f

    const/high16 v4, 0x41400000    # 12.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    const/high16 v3, 0x41000000    # 8.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    const/4 v6, 0x0

    const v7, 0x3f0ccccd    # 0.55f

    const v8, 0x3ee66666    # 0.45f

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const v6, 0x3f0ccccd    # 0.55f

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const v9, -0x4119999a    # -0.45f

    const/high16 v11, -0x40800000    # -1.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/high16 v5, -0x40800000    # -1.0f

    invoke-virtual {v2, v5}, Lk/f;->K(F)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    const/4 v6, 0x0

    const v7, 0x3f0ccccd    # 0.55f

    const v8, 0x3ee66666    # 0.45f

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const v6, 0x3f0ccccd    # 0.55f

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const v9, -0x4119999a    # -0.45f

    const/high16 v11, -0x40800000    # -1.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/high16 v3, -0x3f000000    # -8.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    const v3, -0x3ffae148    # -2.08f

    const v4, -0x3f4051ec    # -5.99f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x40d00000    # 6.5f

    const/high16 v4, 0x41800000    # 16.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v6, -0x40ab851f    # -0.83f

    const/high16 v8, -0x40400000    # -1.5f

    const v9, -0x40d47ae1    # -0.67f

    const/high16 v10, -0x40400000    # -1.5f

    const/high16 v11, -0x40400000    # -1.5f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v5, 0x40b570a4    # 5.67f

    const/high16 v6, 0x41500000    # 13.0f

    invoke-virtual {v2, v5, v6, v3, v6}, Lk/f;->G(FFFF)V

    const/high16 v12, 0x3fc00000    # 1.5f

    const v13, 0x3f2b851f    # 0.67f

    invoke-virtual {v2, v12, v13, v12, v12}, Lk/f;->H(FFFF)V

    const v5, 0x40ea8f5c    # 7.33f

    invoke-virtual {v2, v5, v4, v3, v4}, Lk/f;->G(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x418c0000    # 17.5f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v6, -0x40ab851f    # -0.83f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/high16 v3, -0x40400000    # -1.5f

    invoke-virtual {v2, v13, v3, v12, v3}, Lk/f;->H(FFFF)V

    invoke-virtual {v2, v12, v13, v12, v12}, Lk/f;->H(FFFF)V

    const v4, -0x40d47ae1    # -0.67f

    invoke-virtual {v2, v4, v12, v3, v12}, Lk/f;->H(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x40a00000    # 5.0f

    const/high16 v4, 0x41300000    # 11.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const/high16 v5, -0x3f700000    # -4.5f

    invoke-virtual {v2, v12, v5}, Lk/f;->C(FF)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    const/high16 v5, 0x41980000    # 19.0f

    invoke-virtual {v2, v5, v4}, Lk/f;->B(FF)V

    invoke-virtual {v2, v3, v4}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->j:Li1/f;

    return-object v0
.end method

.method public static final d(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    invoke-static {v0, p0}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d0()Li1/f;
    .locals 12

    sget-object v0, Lh6/g;->k:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.ErrorOutline"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41300000    # 11.0f

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const/high16 v11, 0x40000000    # 2.0f

    invoke-virtual {v2, v11}, Lk/f;->A(F)V

    invoke-virtual {v2, v11}, Lk/f;->K(F)V

    const/high16 v4, -0x40000000    # -2.0f

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v5}, Lk/f;->D(FF)V

    invoke-virtual {v2, v11}, Lk/f;->A(F)V

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v3, 0x413fd70a    # 11.99f

    invoke-virtual {v2, v3, v11}, Lk/f;->D(FF)V

    const v5, 0x40cf0a3d    # 6.47f

    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v7, 0x40000000    # 2.0f

    const v8, 0x40cf5c29    # 6.48f

    const/high16 v9, 0x40000000    # 2.0f

    const/high16 v10, 0x41400000    # 12.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->u(FFFFFF)V

    const v4, 0x411fd70a    # 9.99f

    const/high16 v5, 0x41200000    # 10.0f

    const v6, 0x408f0a3d    # 4.47f

    invoke-virtual {v2, v6, v5, v4, v5}, Lk/f;->H(FFFF)V

    const v5, 0x418c28f6    # 17.52f

    const/high16 v6, 0x41b00000    # 22.0f

    const/high16 v7, 0x41b00000    # 22.0f

    const v8, 0x418c28f6    # 17.52f

    const/high16 v9, 0x41b00000    # 22.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->u(FFFFFF)V

    const v4, 0x418c28f6    # 17.52f

    invoke-virtual {v2, v4, v11, v3, v11}, Lk/f;->G(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41400000    # 12.0f

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v5, -0x3f728f5c    # -4.42f

    const/4 v6, 0x0

    const/high16 v7, -0x3f000000    # -8.0f

    const v8, -0x3f9ae148    # -3.58f

    const/high16 v9, -0x3f000000    # -8.0f

    const/high16 v10, -0x3f000000    # -8.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    const v3, 0x40651eb8    # 3.58f

    const/high16 v4, -0x3f000000    # -8.0f

    const/high16 v5, 0x41000000    # 8.0f

    invoke-virtual {v2, v3, v4, v5, v4}, Lk/f;->H(FFFF)V

    invoke-virtual {v2, v5, v3, v5, v5}, Lk/f;->H(FFFF)V

    const v3, -0x3f9ae148    # -3.58f

    invoke-virtual {v2, v3, v5, v4, v5}, Lk/f;->H(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->k:Li1/f;

    return-object v0
.end method

.method public static final e(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final e0()Li1/f;
    .locals 12

    sget-object v0, Lh6/g;->l:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Info"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    const/4 v2, 0x7

    const/high16 v3, 0x41400000    # 12.0f

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v2, v3, v4}, Lt/k;->c(IFF)Lk/f;

    move-result-object v2

    const v6, 0x40cf5c29    # 6.48f

    const/high16 v7, 0x40000000    # 2.0f

    const/high16 v8, 0x40000000    # 2.0f

    const v9, 0x40cf5c29    # 6.48f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x41400000    # 12.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    const v5, 0x408f5c29    # 4.48f

    const/high16 v6, 0x41200000    # 10.0f

    invoke-virtual {v2, v5, v6, v6, v6}, Lk/f;->H(FFFF)V

    const v5, -0x3f70a3d7    # -4.48f

    const/high16 v7, -0x3ee00000    # -10.0f

    invoke-virtual {v2, v6, v5, v6, v7}, Lk/f;->H(FFFF)V

    const v5, 0x418c28f6    # 17.52f

    invoke-virtual {v2, v5, v4, v3, v4}, Lk/f;->G(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41500000    # 13.0f

    const/high16 v5, 0x41880000    # 17.0f

    invoke-virtual {v2, v3, v5}, Lk/f;->D(FF)V

    const/high16 v5, -0x40000000    # -2.0f

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    const/high16 v6, -0x3f400000    # -6.0f

    invoke-virtual {v2, v6}, Lk/f;->K(F)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    const/high16 v6, 0x40c00000    # 6.0f

    invoke-virtual {v2, v6}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v6, 0x41100000    # 9.0f

    invoke-virtual {v2, v3, v6}, Lk/f;->D(FF)V

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    const/high16 v3, 0x41300000    # 11.0f

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v5}, Lk/f;->B(FF)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    invoke-virtual {v2, v4}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->l:Li1/f;

    return-object v0
.end method

.method public static final f(IIIILt4/e;)D
    .locals 4

    int-to-double v0, p2

    int-to-double v2, p0

    div-double/2addr v0, v2

    int-to-double p2, p3

    int-to-double p0, p1

    div-double/2addr p2, p0

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    goto :goto_0

    :cond_0
    new-instance p0, Landroidx/fragment/app/a0;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static g(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 7

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/f;

    invoke-static {p1, p2, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget-wide v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/f;->i(Z)V

    :goto_1
    if-ge p2, p3, :cond_3

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v5, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v5, :cond_1

    goto :goto_3

    :cond_1
    invoke-static {p1, v0, p5}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget-wide v5, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    cmp-long v0, v5, v2

    if-eqz v0, :cond_2

    move v0, v4

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/f;->i(Z)V

    goto :goto_1

    :cond_3
    :goto_3
    return p2
.end method

.method public static final g0(Lu8/j;)Lm9/f1;
    .locals 3

    sget-object v0, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p0, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    check-cast v0, Lm9/f1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h([BILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    invoke-static {p0, p1, p2}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    if-gt v0, v1, :cond_1

    if-nez v0, :cond_0

    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    return p1

    :cond_0
    invoke-static {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object p0

    iput-object p0, p2, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    add-int/2addr p1, v0

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static i(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_7

    array-length v1, p1

    sub-int/2addr v1, p2

    if-gt v0, v1, :cond_6

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    add-int/2addr p2, v0

    :goto_1
    if-ge p2, p3, :cond_5

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, v0, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p2

    iget v0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-ltz v0, :cond_4

    array-length v1, p1

    sub-int/2addr v1, p2

    if-gt v0, v1, :cond_3

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p1, p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_5
    :goto_2
    return p2

    :cond_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->e()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static final i0()Li1/f;
    .locals 17

    sget-object v0, Lh6/g;->m:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Language"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    const/4 v2, 0x7

    const v3, 0x413fd70a    # 11.99f

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v2, v3, v4}, Lt/k;->c(IFF)Lk/f;

    move-result-object v2

    const v6, 0x40cf0a3d    # 6.47f

    const/high16 v7, 0x40000000    # 2.0f

    const/high16 v8, 0x40000000    # 2.0f

    const v9, 0x40cf5c29    # 6.48f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v11, 0x41400000    # 12.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    const v5, 0x411fd70a    # 9.99f

    const/high16 v6, 0x41200000    # 10.0f

    const v7, 0x408f0a3d    # 4.47f

    invoke-virtual {v2, v7, v6, v5, v6}, Lk/f;->H(FFFF)V

    const v6, 0x418c28f6    # 17.52f

    const/high16 v7, 0x41b00000    # 22.0f

    const/high16 v8, 0x41b00000    # 22.0f

    const v9, 0x418c28f6    # 17.52f

    const/high16 v10, 0x41b00000    # 22.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    const v5, 0x418c28f6    # 17.52f

    invoke-virtual {v2, v5, v4, v3, v4}, Lk/f;->G(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v3, 0x41975c29    # 18.92f

    const/high16 v12, 0x41000000    # 8.0f

    invoke-virtual {v2, v3, v12}, Lk/f;->D(FF)V

    const v3, -0x3fc33333    # -2.95f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const v6, -0x415c28f6    # -0.32f

    const/high16 v7, -0x40600000    # -1.25f

    const v8, -0x40b851ec    # -0.78f

    const v9, -0x3fe33333    # -2.45f

    const v10, -0x404f5c29    # -1.38f

    const v11, -0x3f9c28f6    # -3.56f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v6, 0x3feb851f    # 1.84f

    const v7, 0x3f2147ae    # 0.63f

    const v8, 0x4057ae14    # 3.37f

    const v9, 0x3ff47ae1    # 1.91f

    const v10, 0x408a8f5c    # 4.33f

    const v11, 0x4063d70a    # 3.56f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v3, 0x41400000    # 12.0f

    const v5, 0x408147ae    # 4.04f

    invoke-virtual {v2, v3, v5}, Lk/f;->D(FF)V

    const v6, 0x3f547ae1    # 0.83f

    const v7, 0x3f99999a    # 1.2f

    const v8, 0x3fbd70a4    # 1.48f

    const v9, 0x4021eb85    # 2.53f

    const v10, 0x3ff47ae1    # 1.91f

    const v11, 0x407d70a4    # 3.96f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v5, -0x3f8b851f    # -3.82f

    invoke-virtual {v2, v5}, Lk/f;->A(F)V

    const v6, 0x3edc28f6    # 0.43f

    const v7, -0x4048f5c3    # -1.43f

    const v8, 0x3f8a3d71    # 1.08f

    const v9, -0x3fcf5c29    # -2.76f

    const v11, -0x3f828f5c    # -3.96f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v13, 0x408851ec    # 4.26f

    const/high16 v14, 0x41600000    # 14.0f

    invoke-virtual {v2, v13, v14}, Lk/f;->D(FF)V

    const v6, 0x40833333    # 4.1f

    const v7, 0x4155c28f    # 13.36f

    const/high16 v8, 0x40800000    # 4.0f

    const v9, 0x414b0a3d    # 12.69f

    const/high16 v10, 0x40800000    # 4.0f

    const/high16 v11, 0x41400000    # 12.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    const v5, 0x3dcccccd    # 0.1f

    const v6, -0x4051eb85    # -1.36f

    const v7, 0x3e851eb8    # 0.26f

    const/high16 v8, -0x40000000    # -2.0f

    invoke-virtual {v2, v5, v6, v7, v8}, Lk/f;->H(FFFF)V

    const v15, 0x405851ec    # 3.38f

    invoke-virtual {v2, v15}, Lk/f;->A(F)V

    const v6, -0x425c28f6    # -0.08f

    const v7, 0x3f28f5c3    # 0.66f

    const v8, -0x41f0a3d7    # -0.14f

    const v9, 0x3fa8f5c3    # 1.32f

    const v10, -0x41f0a3d7    # -0.14f

    const/high16 v11, 0x40000000    # 2.0f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/4 v6, 0x0

    const v7, 0x3f2e147b    # 0.68f

    const v8, 0x3d75c28f    # 0.06f

    const v9, 0x3fab851f    # 1.34f

    const v10, 0x3e0f5c29    # 0.14f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v13, v14}, Lk/f;->B(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v13, 0x40a28f5c    # 5.08f

    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {v2, v13, v5}, Lk/f;->D(FF)V

    const v11, 0x403ccccd    # 2.95f

    invoke-virtual {v2, v11}, Lk/f;->A(F)V

    const v6, 0x3ea3d70a    # 0.32f

    const/high16 v7, 0x3fa00000    # 1.25f

    const v8, 0x3f47ae14    # 0.78f

    const v9, 0x401ccccd    # 2.45f

    const v10, 0x3fb0a3d7    # 1.38f

    const v16, 0x4063d70a    # 3.56f

    move-object v5, v2

    move v4, v11

    move/from16 v11, v16

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v6, -0x40147ae1    # -1.84f

    const v7, -0x40deb852    # -0.63f

    const v8, -0x3fa851ec    # -3.37f

    const v9, -0x400ccccd    # -1.9f

    const v10, -0x3f7570a4    # -4.33f

    const v11, -0x3f9c28f6    # -3.56f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v5, 0x41007ae1    # 8.03f

    invoke-virtual {v2, v5, v12}, Lk/f;->D(FF)V

    invoke-virtual {v2, v13, v12}, Lk/f;->B(FF)V

    const v6, 0x3f75c28f    # 0.96f

    const v7, -0x402b851f    # -1.66f

    const v8, 0x401f5c29    # 2.49f

    const v9, -0x3fc47ae1    # -2.93f

    const v10, 0x408a8f5c    # 4.33f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v6, 0x410cf5c3    # 8.81f

    const v7, 0x40b1999a    # 5.55f

    const v8, 0x4105999a    # 8.35f

    const/high16 v9, 0x40d80000    # 6.75f

    const v10, 0x41007ae1    # 8.03f

    const/high16 v11, 0x41000000    # 8.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->u(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v5, 0x419fae14    # 19.96f

    invoke-virtual {v2, v3, v5}, Lk/f;->D(FF)V

    const v6, -0x40ab851f    # -0.83f

    const v7, -0x40666666    # -1.2f

    const v8, -0x40428f5c    # -1.48f

    const v9, -0x3fde147b    # -2.53f

    const v10, -0x400b851f    # -1.91f

    const v11, -0x3f828f5c    # -3.96f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v3, 0x40747ae1    # 3.82f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const v6, -0x4123d70a    # -0.43f

    const v7, 0x3fb70a3d    # 1.43f

    const v8, -0x4075c28f    # -1.08f

    const v9, 0x4030a3d7    # 2.76f

    const v11, 0x407d70a4    # 3.96f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v3, 0x416570a4    # 14.34f

    invoke-virtual {v2, v3, v14}, Lk/f;->D(FF)V

    const v3, 0x411a8f5c    # 9.66f

    invoke-virtual {v2, v3, v14}, Lk/f;->B(FF)V

    const v6, -0x4247ae14    # -0.09f

    const v7, -0x40d70a3d    # -0.66f

    const v8, -0x41dc28f6    # -0.16f

    const v9, -0x40570a3d    # -1.32f

    const v10, -0x41dc28f6    # -0.16f

    const/high16 v11, -0x40000000    # -2.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/4 v6, 0x0

    const v7, -0x40d1eb85    # -0.68f

    const v8, 0x3d8f5c29    # 0.07f

    const v9, -0x40533333    # -1.35f

    const v10, 0x3e23d70a    # 0.16f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v3, 0x4095c28f    # 4.68f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const v6, 0x3db851ec    # 0.09f

    const v7, 0x3f266666    # 0.65f

    const v8, 0x3e23d70a    # 0.16f

    const v9, 0x3fa8f5c3    # 1.32f

    const/high16 v11, 0x40000000    # 2.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/4 v6, 0x0

    const v7, 0x3f2e147b    # 0.68f

    const v8, -0x4270a3d7    # -0.07f

    const v9, 0x3fab851f    # 1.34f

    const v10, -0x41dc28f6    # -0.16f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v3, 0x416970a4    # 14.59f

    const v5, 0x419c7ae1    # 19.56f

    invoke-virtual {v2, v3, v5}, Lk/f;->D(FF)V

    const v6, 0x3f19999a    # 0.6f

    const v7, -0x4071eb85    # -1.11f

    const v8, 0x3f87ae14    # 1.06f

    const v9, -0x3fec28f6    # -2.31f

    const v10, 0x3fb0a3d7    # 1.38f

    const v11, -0x3f9c28f6    # -3.56f

    move-object v5, v2

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    const v6, -0x408a3d71    # -0.96f

    const v7, 0x3fd33333    # 1.65f

    const v8, -0x3fe0a3d7    # -2.49f

    const v9, 0x403b851f    # 2.93f

    const v10, -0x3f7570a4    # -4.33f

    const v11, 0x4063d70a    # 3.56f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const v3, 0x4182e148    # 16.36f

    invoke-virtual {v2, v3, v14}, Lk/f;->D(FF)V

    const v6, 0x3da3d70a    # 0.08f

    const v7, -0x40d70a3d    # -0.66f

    const v8, 0x3e0f5c29    # 0.14f

    const v9, -0x40570a3d    # -1.32f

    const v10, 0x3e0f5c29    # 0.14f

    const/high16 v11, -0x40000000    # -2.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const/4 v6, 0x0

    const v7, -0x40d1eb85    # -0.68f

    const v8, -0x428a3d71    # -0.06f

    const v9, -0x40547ae1    # -1.34f

    const v10, -0x41f0a3d7    # -0.14f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v15}, Lk/f;->A(F)V

    const v6, 0x3e23d70a    # 0.16f

    const v7, 0x3f23d70a    # 0.64f

    const v8, 0x3e851eb8    # 0.26f

    const v9, 0x3fa7ae14    # 1.31f

    const v10, 0x3e851eb8    # 0.26f

    const/high16 v11, 0x40000000    # 2.0f

    invoke-virtual/range {v5 .. v11}, Lk/f;->v(FFFFFF)V

    const v3, -0x417ae148    # -0.26f

    const v4, -0x42333333    # -0.1f

    const v5, 0x3fae147b    # 1.36f

    const/high16 v6, 0x40000000    # 2.0f

    invoke-virtual {v2, v4, v5, v3, v6}, Lk/f;->H(FFFF)V

    const v3, -0x3fa7ae14    # -3.38f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->m:Li1/f;

    return-object v0
.end method

.method public static j(I[B)D
    .locals 0

    invoke-static {p0, p1}, Lh6/g;->n(I[B)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final j0()Li1/f;
    .locals 13

    sget-object v0, Lh6/g;->n:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Logout"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41880000    # 17.0f

    const/high16 v4, 0x40e00000    # 7.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->D(FF)V

    const v4, -0x404b851f    # -1.41f

    const v5, 0x3fb47ae1    # 1.41f

    invoke-virtual {v2, v4, v5}, Lk/f;->C(FF)V

    const v4, 0x41915c29    # 18.17f

    const/high16 v5, 0x41300000    # 11.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->B(FF)V

    const/high16 v11, 0x41000000    # 8.0f

    invoke-virtual {v2, v11}, Lk/f;->z(F)V

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {v2, v4}, Lk/f;->K(F)V

    const v4, 0x4122b852    # 10.17f

    invoke-virtual {v2, v4}, Lk/f;->A(F)V

    const v4, -0x3fdae148    # -2.58f

    const v5, 0x40251eb8    # 2.58f

    invoke-virtual {v2, v4, v5}, Lk/f;->C(FF)V

    invoke-virtual {v2, v3, v3}, Lk/f;->B(FF)V

    const/high16 v3, 0x40a00000    # 5.0f

    const/high16 v4, -0x3f600000    # -5.0f

    invoke-virtual {v2, v3, v4}, Lk/f;->C(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v12, 0x40800000    # 4.0f

    invoke-virtual {v2, v12, v3}, Lk/f;->D(FF)V

    invoke-virtual {v2, v11}, Lk/f;->A(F)V

    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {v2, v4}, Lk/f;->J(F)V

    invoke-virtual {v2, v12}, Lk/f;->z(F)V

    const v5, -0x40733333    # -1.1f

    const/4 v6, 0x0

    const/high16 v7, -0x40000000    # -2.0f

    const v8, 0x3f666666    # 0.9f

    const/high16 v9, -0x40000000    # -2.0f

    const/high16 v10, 0x40000000    # 2.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-virtual {v2, v4}, Lk/f;->K(F)V

    const/4 v5, 0x0

    const v6, 0x3f8ccccd    # 1.1f

    const v7, 0x3f666666    # 0.9f

    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v9, 0x40000000    # 2.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v11}, Lk/f;->A(F)V

    const/high16 v4, -0x40000000    # -2.0f

    invoke-virtual {v2, v4}, Lk/f;->K(F)V

    invoke-virtual {v2, v12}, Lk/f;->z(F)V

    invoke-virtual {v2, v3}, Lk/f;->J(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->n:Li1/f;

    return-object v0
.end method

.method public static k(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 3

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/r;

    invoke-static {p2, p1}, Lh6/g;->n(I[B)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/r;->i(D)V

    add-int/lit8 p2, p2, 0x8

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0, p1}, Lh6/g;->n(I[B)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    invoke-virtual {p4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/r;->i(D)V

    add-int/lit8 p2, v0, 0x8

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static final k0()Li1/f;
    .locals 12

    sget-object v0, Lh6/g;->p:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.PlayArrow"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Li1/n;

    const/high16 v4, 0x41000000    # 8.0f

    const/high16 v5, 0x40a00000    # 5.0f

    invoke-direct {v3, v4, v5}, Li1/n;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Li1/z;

    const/high16 v4, 0x41600000    # 14.0f

    invoke-direct {v3, v4}, Li1/z;-><init>(F)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Li1/u;

    const/high16 v4, 0x41300000    # 11.0f

    const/high16 v5, -0x3f200000    # -7.0f

    invoke-direct {v3, v4, v5}, Li1/u;-><init>(FF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Li1/j;->c:Li1/j;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->p:Li1/f;

    return-object v0
.end method

.method public static l(I[B)I
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static final l0(Landroid/view/View;)Lg3/a;
    .locals 2

    const v0, 0x7f080094

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/a;

    if-nez v1, :cond_0

    new-instance v1, Lg3/a;

    invoke-direct {v1}, Lg3/a;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static m(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-static {p2, p1}, Lh6/g;->l(I[B)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    add-int/lit8 p2, p2, 0x4

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0, p1}, Lh6/g;->l(I[B)I

    move-result p2

    invoke-virtual {p4, p2}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    add-int/lit8 p2, v0, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static final m0()Li1/f;
    .locals 13

    sget-object v0, Lh6/g;->q:Li1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v2, "Filled.Save"

    const/4 v10, 0x0

    new-instance v0, Li1/e;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x60

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Li1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Li1/h0;->a:I

    new-instance v1, Le1/n0;

    sget-wide v2, Le1/r;->b:J

    invoke-direct {v1, v2, v3}, Le1/n0;-><init>(J)V

    new-instance v2, Lk/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lk/f;-><init>(I)V

    const/high16 v3, 0x41880000    # 17.0f

    const/high16 v11, 0x40400000    # 3.0f

    invoke-virtual {v2, v3, v11}, Lk/f;->D(FF)V

    const/high16 v3, 0x40a00000    # 5.0f

    invoke-virtual {v2, v3, v11}, Lk/f;->B(FF)V

    const v5, -0x4071eb85    # -1.11f

    const/4 v6, 0x0

    const/high16 v7, -0x40000000    # -2.0f

    const v8, 0x3f666666    # 0.9f

    const/high16 v9, -0x40000000    # -2.0f

    const/high16 v10, 0x40000000    # 2.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    const/high16 v12, 0x41600000    # 14.0f

    invoke-virtual {v2, v12}, Lk/f;->K(F)V

    const/4 v5, 0x0

    const v6, 0x3f8ccccd    # 1.1f

    const v7, 0x3f63d70a    # 0.89f

    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v9, 0x40000000    # 2.0f

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    invoke-virtual {v2, v12}, Lk/f;->A(F)V

    const v5, 0x3f8ccccd    # 1.1f

    const/4 v6, 0x0

    const/high16 v7, 0x40000000    # 2.0f

    const v8, -0x4099999a    # -0.9f

    const/high16 v10, -0x40000000    # -2.0f

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    const/high16 v4, 0x41a80000    # 21.0f

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->B(FF)V

    const/high16 v4, -0x3f800000    # -4.0f

    invoke-virtual {v2, v4, v4}, Lk/f;->C(FF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v4, 0x41400000    # 12.0f

    const/high16 v5, 0x41980000    # 19.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->D(FF)V

    const v5, -0x402b851f    # -1.66f

    const/high16 v7, -0x3fc00000    # -3.0f

    const v8, -0x40547ae1    # -1.34f

    const/high16 v9, -0x3fc00000    # -3.0f

    const/high16 v10, -0x3fc00000    # -3.0f

    move-object v4, v2

    invoke-virtual/range {v4 .. v10}, Lk/f;->v(FFFFFF)V

    const v4, 0x3fab851f    # 1.34f

    const/high16 v5, -0x3fc00000    # -3.0f

    invoke-virtual {v2, v4, v5, v11, v5}, Lk/f;->H(FFFF)V

    invoke-virtual {v2, v11, v4, v11, v11}, Lk/f;->H(FFFF)V

    const v4, -0x40547ae1    # -1.34f

    invoke-virtual {v2, v4, v11, v5, v11}, Lk/f;->H(FFFF)V

    invoke-virtual {v2}, Lk/f;->p()V

    const/high16 v4, 0x41700000    # 15.0f

    const/high16 v5, 0x41100000    # 9.0f

    invoke-virtual {v2, v4, v5}, Lk/f;->D(FF)V

    invoke-virtual {v2, v3, v5}, Lk/f;->B(FF)V

    invoke-virtual {v2, v3, v3}, Lk/f;->B(FF)V

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v2, v3}, Lk/f;->A(F)V

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v2, v3}, Lk/f;->K(F)V

    invoke-virtual {v2}, Lk/f;->p()V

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v0, v2, v1}, Li1/e;->a(Li1/e;Ljava/util/ArrayList;Le1/n0;)V

    invoke-virtual {v0}, Li1/e;->b()Li1/f;

    move-result-object v0

    sput-object v0, Lh6/g;->q:Li1/f;

    return-object v0
.end method

.method public static n(I[B)J
    .locals 7

    aget-byte v0, p1, p0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v4, p0, 0x1

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x2

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x3

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x4

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x5

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x6

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    add-int/lit8 p0, p0, 0x7

    aget-byte p0, p1, p0

    int-to-long p0, p0

    and-long/2addr p0, v2

    const/16 v2, 0x38

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final n0(Lu8/j;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    sget-object v0, Lm9/a0;->a:Lm9/a0;

    invoke-interface {p0, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    check-cast v0, Lm9/b0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lm9/b0;->p(Lu8/j;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Ld7/t;->a0(Lu8/j;Ljava/lang/Throwable;)V

    return-void

    :goto_0
    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Exception while trying to handle coroutine exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, p1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_1
    invoke-static {p0, p1}, Ld7/t;->a0(Lu8/j;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static o(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 3

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-static {p2, p1}, Lh6/g;->n(I[B)J

    move-result-wide v0

    invoke-virtual {p4, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    add-int/lit8 p2, p2, 0x8

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0, p1}, Lh6/g;->n(I[B)J

    move-result-wide v1

    invoke-virtual {p4, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    add-int/lit8 p2, v0, 0x8

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static final o0(Lu8/j;)Z
    .locals 1

    sget-object v0, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p0, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p0

    check-cast p0, Lm9/f1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lm9/f1;->b()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static p(I[B)F
    .locals 0

    invoke-static {p0, p1}, Lh6/g;->l(I[B)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method public static p0(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p4, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-static {p2, p1}, Lh6/g;->l(I[B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {p4, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i(F)V

    add-int/lit8 p2, p2, 0x4

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-static {p1, p2, p5}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget v1, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0, p1}, Lh6/g;->l(I[B)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {p4, p2}, Lcom/google/crypto/tink/shaded/protobuf/x;->i(F)V

    add-int/lit8 p2, v0, 0x4

    goto :goto_0

    :cond_1
    :goto_1
    return p2
.end method

.method public static q0(ILjava/math/RoundingMode;)I
    .locals 3

    if-lez p0, :cond_3

    sget-object v0, Lt6/a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :pswitch_0
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    const v0, -0x4afb0ccd

    ushr-int/2addr v0, p1

    rsub-int/lit8 p1, p1, 0x1f

    sub-int/2addr v0, p0

    not-int p0, v0

    not-int p0, p0

    ushr-int/lit8 p0, p0, 0x1f

    add-int/2addr p1, p0

    return p1

    :pswitch_1
    sub-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x20

    return p0

    :pswitch_2
    const/4 p1, 0x0

    if-lez p0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    add-int/lit8 v2, p0, -0x1

    and-int/2addr v2, p0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, p1

    :goto_1
    and-int p1, v1, v0

    if-eqz p1, :cond_2

    :pswitch_3
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x1f

    return p0

    :cond_2
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "mode was UNNECESSARY, but rounding was necessary"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "x ("

    const-string v1, ") must be > 0"

    invoke-static {v0, p0, v1}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Lcom/google/crypto/tink/shaded/protobuf/j1;I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 9

    and-int/lit8 v0, p1, -0x8

    or-int/lit8 v0, v0, 0x4

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v8

    move-object v1, v8

    move-object v2, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, v0

    move-object v7, p6

    invoke-static/range {v1 .. v7}, Lh6/g;->r0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p3

    invoke-interface {p0, v8}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    iput-object v8, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-interface {p5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p3, p4, :cond_1

    invoke-static {p2, p3, p6}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v4

    iget v1, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p1, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    move-object v2, p0

    move-object v3, p2

    move v5, p4

    move v6, v0

    move-object v7, p6

    invoke-static/range {v1 .. v7}, Lh6/g;->r0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v1

    invoke-interface {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    iput-object p3, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-interface {p5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move p3, v1

    goto :goto_0

    :cond_1
    :goto_1
    return p3
.end method

.method public static r0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 7

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/a1;->J(Ljava/lang/Object;[BIIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iput-object p0, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    return p1
.end method

.method public static final s(IILjava/lang/String;)Ljava/net/InetAddress;
    .locals 17

    move/from16 v0, p1

    move-object/from16 v1, p2

    const/16 v2, 0x10

    new-array v3, v2, [B

    const/4 v4, 0x0

    const/4 v5, -0x1

    move/from16 v6, p0

    move v7, v4

    move v8, v5

    move v9, v8

    :goto_0
    const/4 v10, 0x0

    if-ge v6, v0, :cond_13

    if-ne v7, v2, :cond_0

    return-object v10

    :cond_0
    add-int/lit8 v11, v6, 0x2

    const/16 v12, 0xff

    if-gt v11, v0, :cond_3

    const-string v13, "::"

    invoke-static {v6, v1, v13, v4}, Ll9/i;->g1(ILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v13

    if-eqz v13, :cond_3

    if-eq v8, v5, :cond_1

    return-object v10

    :cond_1
    add-int/lit8 v7, v7, 0x2

    if-ne v11, v0, :cond_2

    move v0, v2

    move v8, v7

    goto/16 :goto_8

    :cond_2
    move v8, v7

    move v9, v11

    goto/16 :goto_5

    :cond_3
    if-eqz v7, :cond_4

    const-string v11, ":"

    invoke-static {v6, v1, v11, v4}, Ll9/i;->g1(ILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_5

    add-int/lit8 v6, v6, 0x1

    :cond_4
    move v9, v6

    goto/16 :goto_5

    :cond_5
    const-string v11, "."

    invoke-static {v6, v1, v11, v4}, Ll9/i;->g1(ILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_f

    add-int/lit8 v6, v7, -0x2

    move v11, v6

    :goto_1
    if-ge v9, v0, :cond_e

    if-ne v11, v2, :cond_6

    goto :goto_4

    :cond_6
    if-eq v11, v6, :cond_8

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x2e

    if-eq v13, v14, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v9, v9, 0x1

    :cond_8
    move v14, v4

    move v13, v9

    :goto_2
    if-ge v13, v0, :cond_c

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v4, 0x30

    invoke-static {v15, v4}, Ld7/a;->o(II)I

    move-result v16

    if-ltz v16, :cond_c

    const/16 v2, 0x39

    invoke-static {v15, v2}, Ld7/a;->o(II)I

    move-result v2

    if-lez v2, :cond_9

    goto :goto_3

    :cond_9
    if-nez v14, :cond_a

    if-eq v9, v13, :cond_a

    goto :goto_4

    :cond_a
    mul-int/lit8 v14, v14, 0xa

    add-int/2addr v14, v15

    sub-int/2addr v14, v4

    if-le v14, v12, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v13, v13, 0x1

    const/16 v2, 0x10

    const/4 v4, 0x0

    goto :goto_2

    :cond_c
    :goto_3
    sub-int v2, v13, v9

    if-nez v2, :cond_d

    goto :goto_4

    :cond_d
    add-int/lit8 v2, v11, 0x1

    int-to-byte v4, v14

    aput-byte v4, v3, v11

    move v11, v2

    move v9, v13

    const/16 v2, 0x10

    const/4 v4, 0x0

    goto :goto_1

    :cond_e
    add-int/lit8 v0, v7, 0x2

    if-ne v11, v0, :cond_f

    add-int/lit8 v7, v7, 0x2

    const/16 v0, 0x10

    goto :goto_8

    :cond_f
    :goto_4
    return-object v10

    :goto_5
    move v6, v9

    const/4 v2, 0x0

    :goto_6
    if-ge v6, v0, :cond_10

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ly9/b;->p(C)I

    move-result v4

    if-eq v4, v5, :cond_10

    shl-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_10
    sub-int v4, v6, v9

    if-eqz v4, :cond_12

    const/4 v11, 0x4

    if-le v4, v11, :cond_11

    goto :goto_7

    :cond_11
    add-int/lit8 v4, v7, 0x1

    ushr-int/lit8 v10, v2, 0x8

    and-int/2addr v10, v12

    int-to-byte v10, v10

    aput-byte v10, v3, v7

    add-int/lit8 v7, v7, 0x2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v3, v4

    const/16 v2, 0x10

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_12
    :goto_7
    return-object v10

    :cond_13
    move v0, v2

    :goto_8
    if-eq v7, v0, :cond_15

    if-ne v8, v5, :cond_14

    return-object v10

    :cond_14
    sub-int v1, v7, v8

    rsub-int/lit8 v2, v1, 0x10

    invoke-static {v3, v8, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    rsub-int/lit8 v2, v7, 0x10

    add-int/2addr v2, v8

    const/4 v0, 0x0

    invoke-static {v3, v8, v2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_15
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public static s0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIILcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 6

    add-int/lit8 v0, p3, 0x1

    aget-byte p3, p2, p3

    if-gez p3, :cond_0

    invoke-static {p3, p2, v0, p5}, Lh6/g;->K(I[BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    iget p3, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    :cond_0
    move v3, v0

    if-ltz p3, :cond_1

    sub-int/2addr p4, v3

    if-gt p3, p4, :cond_1

    add-int/2addr p3, v3

    move-object v0, p1

    move-object v1, p0

    move-object v2, p2

    move v4, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/crypto/tink/shaded/protobuf/j1;->h(Ljava/lang/Object;[BIILcom/google/crypto/tink/shaded/protobuf/e;)V

    iput-object p0, p5, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    return p3

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static t(Lcom/google/crypto/tink/shaded/protobuf/j1;I[BIILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 7

    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object v6

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lh6/g;->s0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p3

    invoke-interface {p0, v6}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    iput-object v6, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-interface {p5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-ge p3, p4, :cond_1

    invoke-static {p2, p3, p6}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v3

    iget v0, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lcom/google/crypto/tink/shaded/protobuf/j1;->f()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    move-object v1, p0

    move-object v2, p2

    move v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lh6/g;->s0(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;[BIILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result v0

    invoke-interface {p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->b(Ljava/lang/Object;)V

    iput-object p3, p6, Lcom/google/crypto/tink/shaded/protobuf/e;->c:Ljava/lang/Object;

    invoke-interface {p5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move p3, v0

    goto :goto_0

    :cond_1
    :goto_1
    return p3
.end method

.method public static u([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 5

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/f;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_1

    invoke-static {p0, p1, p3}, Lh6/g;->N([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget-wide v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/f;->i(Z)V

    goto :goto_0

    :cond_1
    if-ne p1, v0, :cond_2

    return p1

    :cond_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static v([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/r;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p1, p0}, Lh6/g;->n(I[B)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/r;->i(D)V

    add-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static v0(Lc9/e;Lm9/a;Lm9/a;)V
    .locals 1

    :try_start_0
    invoke-static {p1, p2, p0}, Ld7/t;->M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;

    move-result-object p0

    invoke-static {p0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p0

    sget-object p1, Lq8/l;->a:Lq8/l;

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lr9/a;->l(Lu8/e;Ljava/lang/Object;Lc9/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm9/a;->resumeWith(Ljava/lang/Object;)V

    throw p0
.end method

.method public static w([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 1

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p1, p0}, Lh6/g;->l(I[B)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    add-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static final w0(La4/c0;Lr9/e;Lp9/n0;Ljava/lang/Float;)Lp9/z;
    .locals 10

    sget-object v0, Lo9/g;->j:Lo9/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lo9/f;->b:I

    const/4 v1, 0x1

    if-ge v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sub-int/2addr v0, v1

    instance-of v2, p0, Lq9/g;

    sget-object v3, Lo9/a;->a:Lo9/a;

    if-eqz v2, :cond_4

    move-object v2, p0

    check-cast v2, Lq9/g;

    invoke-virtual {v2}, Lq9/g;->e()Lp9/f;

    move-result-object v4

    if-eqz v4, :cond_4

    new-instance p0, Ly5/o;

    const/4 v5, -0x3

    iget-object v6, v2, Lq9/g;->c:Lo9/a;

    iget v7, v2, Lq9/g;->b:I

    if-eq v7, v5, :cond_1

    const/4 v5, -0x2

    if-eq v7, v5, :cond_1

    if-eqz v7, :cond_1

    move v0, v7

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    if-ne v6, v3, :cond_2

    if-nez v7, :cond_3

    :cond_2
    move v0, v5

    :cond_3
    :goto_1
    iget-object v2, v2, Lq9/g;->a:Lu8/j;

    invoke-direct {p0, v0, v2, v6, v4}, Ly5/o;-><init>(ILu8/j;Lo9/a;Lp9/f;)V

    goto :goto_2

    :cond_4
    new-instance v2, Ly5/o;

    sget-object v4, Lu8/k;->a:Lu8/k;

    invoke-direct {v2, v0, v4, v3, p0}, Ly5/o;-><init>(ILu8/j;Lo9/a;Lp9/f;)V

    move-object p0, v2

    :goto_2
    invoke-static {p3}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iget-object v2, p0, Ly5/o;->d:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Lu8/j;

    iget-object p0, p0, Ly5/o;->b:Ljava/lang/Object;

    move-object v4, p0

    check-cast v4, Lp9/f;

    sget-object p0, Lp9/g0;->a:Lp9/i0;

    invoke-static {p2, p0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    move p0, v1

    goto :goto_3

    :cond_5
    const/4 p0, 0x4

    :goto_3
    new-instance v9, Lp9/w;

    const/4 v7, 0x0

    move-object v2, v9

    move-object v3, p2

    move-object v5, v0

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lp9/w;-><init>(Lp9/h0;Lp9/f;Lp9/x;Ljava/lang/Object;Lu8/e;)V

    invoke-static {p1, v8}, Lz6/a;->W(Lm9/d0;Lu8/j;)Lu8/j;

    move-result-object p1

    const/4 p2, 0x2

    if-ne p0, p2, :cond_6

    new-instance p2, Lm9/r1;

    invoke-direct {p2, p1, v9}, Lm9/r1;-><init>(Lu8/j;Lc9/e;)V

    goto :goto_4

    :cond_6
    new-instance p2, Lm9/x1;

    invoke-direct {p2, p1, v1}, Lm9/a;-><init>(Lu8/j;Z)V

    :goto_4
    invoke-virtual {p2, p0, p2, v9}, Lm9/a;->k0(ILm9/a;Lc9/e;)V

    new-instance p0, Lp9/z;

    invoke-direct {p0, v0}, Lp9/z;-><init>(Lp9/q0;)V

    return-object p0
.end method

.method public static x([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p1, p0}, Lh6/g;->n(I[B)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    add-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static final x0(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ":"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ll9/i;->F0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz v0, :cond_b

    const-string v0, "["

    invoke-static {p0, v0, v1}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "]"

    invoke-static {p0, v0, v1}, Ll9/i;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v4, 0x1

    sub-int/2addr v0, v4

    invoke-static {v4, v0, p0}, Lh6/g;->s(IILjava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v1, v0, p0}, Lh6/g;->s(IILjava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    array-length v4, v2

    const/4 v5, 0x4

    const/16 v6, 0x10

    if-ne v4, v6, :cond_9

    move p0, v1

    move v0, p0

    :goto_1
    array-length v4, v2

    if-ge p0, v4, :cond_4

    move v4, p0

    :goto_2
    if-ge v4, v6, :cond_2

    aget-byte v7, v2, v4

    if-nez v7, :cond_2

    add-int/lit8 v7, v4, 0x1

    aget-byte v7, v2, v7

    if-nez v7, :cond_2

    add-int/lit8 v4, v4, 0x2

    goto :goto_2

    :cond_2
    sub-int v7, v4, p0

    if-le v7, v0, :cond_3

    if-lt v7, v5, :cond_3

    move v3, p0

    move v0, v7

    :cond_3
    add-int/lit8 p0, v4, 0x2

    goto :goto_1

    :cond_4
    new-instance p0, Lja/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :cond_5
    :goto_3
    array-length v4, v2

    if-ge v1, v4, :cond_8

    const/16 v4, 0x3a

    if-ne v1, v3, :cond_6

    invoke-virtual {p0, v4}, Lja/g;->h0(I)V

    add-int/2addr v1, v0

    if-ne v1, v6, :cond_5

    invoke-virtual {p0, v4}, Lja/g;->h0(I)V

    goto :goto_3

    :cond_6
    if-lez v1, :cond_7

    invoke-virtual {p0, v4}, Lja/g;->h0(I)V

    :cond_7
    aget-byte v4, v2, v1

    sget-object v5, Ly9/b;->a:[B

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    add-int/lit8 v5, v1, 0x1

    aget-byte v5, v2, v5

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v4, v5

    int-to-long v4, v4

    invoke-virtual {p0, v4, v5}, Lja/g;->j0(J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Lja/g;->Q()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    array-length v1, v2

    if-ne v1, v5, :cond_a

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid IPv6 address: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_b
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toASCII(host)"

    invoke-static {p0, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "US"

    invoke-static {v0, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {p0, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_c

    return-object v2

    :cond_c
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    move v4, v1

    :goto_4
    if-ge v4, v0, :cond_f

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x1f

    invoke-static {v5, v6}, Ld7/a;->o(II)I

    move-result v6

    if-lez v6, :cond_10

    const/16 v6, 0x7f

    invoke-static {v5, v6}, Ld7/a;->o(II)I

    move-result v6

    if-ltz v6, :cond_d

    goto :goto_5

    :cond_d
    const-string v6, " #%/:?@[\\]"

    const/4 v7, 0x6

    invoke-static {v6, v5, v1, v1, v7}, Ll9/i;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v5, v3, :cond_e

    goto :goto_5

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_f
    move-object v2, p0

    :catch_0
    :cond_10
    :goto_5
    return-object v2
.end method

.method public static y([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 1

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget p3, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr p3, p1

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-static {p1, p0}, Lh6/g;->l(I[B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->i(F)V

    add-int/lit8 p1, p1, 0x4

    goto :goto_0

    :cond_0
    if-ne p1, p3, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static y0(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lh6/g;->T(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Clip"

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lh6/g;->T(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Ellipsis"

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    invoke-static {p0, v0}, Lh6/g;->T(II)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Visible"

    goto :goto_0

    :cond_2
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method

.method public static z([BILcom/google/crypto/tink/shaded/protobuf/e0;Lcom/google/crypto/tink/shaded/protobuf/e;)I
    .locals 2

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/c0;

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v0, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    add-int/2addr v0, p1

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-static {p0, p1, p3}, Lh6/g;->L([BILcom/google/crypto/tink/shaded/protobuf/e;)I

    move-result p1

    iget v1, p3, Lcom/google/crypto/tink/shaded/protobuf/e;->a:I

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->b(I)I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    return p1

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p0

    throw p0
.end method

.method public static final z0(Lo9/t;Ljava/lang/Object;)V
    .locals 2

    invoke-interface {p0, p1}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lo9/i;

    if-nez v1, :cond_0

    check-cast v0, Lq8/l;

    goto :goto_0

    :cond_0
    new-instance v0, Lo9/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lo9/l;-><init>(Lo9/t;Ljava/lang/Object;Lu8/e;)V

    sget-object p0, Lu8/k;->a:Lu8/k;

    invoke-static {p0, v0}, Lz6/a;->d0(Lu8/j;Lc9/e;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo9/j;

    iget-object p0, p0, Lo9/j;->a:Ljava/lang/Object;

    :goto_0
    return-void
.end method


# virtual methods
.method public abstract f0()La0/q0;
.end method

.method public h0(I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lh6/g;->f0()La0/q0;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/q0;->c(I)La0/e;

    move-result-object v0

    iget v1, v0, La0/e;->a:I

    sub-int v1, p1, v1

    iget-object v0, v0, La0/e;->c:Ljava/lang/Object;

    check-cast v0, La0/o;

    invoke-interface {v0}, La0/o;->getKey()Lc9/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, La0/c;

    invoke-direct {v0, p1}, La0/c;-><init>(I)V

    :cond_1
    return-object v0
.end method

.method public abstract t0(Ljava/lang/Throwable;)V
.end method

.method public abstract u0(Li3/a0;)V
.end method
