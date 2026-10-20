.class public final Lea/s;
.super Ljava/lang/Object;

# interfaces
.implements Lca/d;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lba/k;

.field public final b:Lca/f;

.field public final c:Lea/r;

.field public volatile d:Lea/y;

.field public final e:Lx9/x;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly9/b;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lea/s;->g:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly9/b;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lea/s;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lx9/w;Lba/k;Lca/f;Lea/r;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lea/s;->a:Lba/k;

    iput-object p3, p0, Lea/s;->b:Lca/f;

    iput-object p4, p0, Lea/s;->c:Lea/r;

    sget-object p2, Lx9/x;->f:Lx9/x;

    iget-object p1, p1, Lx9/w;->y:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lx9/x;->e:Lx9/x;

    :goto_0
    iput-object p2, p0, Lea/s;->e:Lx9/x;

    return-void
.end method


# virtual methods
.method public final a(Lx9/b0;)J
    .locals 2

    invoke-static {p1}, Lca/e;->a(Lx9/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ly9/b;->i(Lx9/b0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final b(Lx9/b0;)Lja/g0;
    .locals 0

    iget-object p1, p0, Lea/s;->d:Lea/y;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p1, p1, Lea/y;->i:Lea/w;

    return-object p1
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lea/s;->d:Lea/y;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lea/y;->f()Lea/v;

    move-result-object v0

    invoke-virtual {v0}, Lea/v;->close()V

    return-void
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lea/s;->f:Z

    iget-object v0, p0, Lea/s;->d:Lea/y;

    if-eqz v0, :cond_0

    sget-object v1, Lea/b;->n:Lea/b;

    invoke-virtual {v0, v1}, Lea/y;->e(Lea/b;)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lea/s;->c:Lea/r;

    iget-object v0, v0, Lea/r;->F:Lea/z;

    invoke-virtual {v0}, Lea/z;->flush()V

    return-void
.end method

.method public final e(Ll/r;J)Lja/e0;
    .locals 0

    iget-object p1, p0, Lea/s;->d:Lea/y;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lea/y;->f()Lea/v;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ll/r;)V
    .locals 14

    iget-object v0, p0, Lea/s;->d:Lea/y;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Ll/r;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p1, Ll/r;->d:Ljava/lang/Object;

    check-cast v2, Lx9/q;

    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lx9/q;->size()I

    move-result v4

    const/4 v5, 0x4

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Lea/c;

    sget-object v6, Lea/c;->f:Lja/j;

    iget-object v7, p1, Ll/r;->c:Ljava/io/Serializable;

    check-cast v7, Ljava/lang/String;

    invoke-direct {v4, v6, v7}, Lea/c;-><init>(Lja/j;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lea/c;

    sget-object v6, Lea/c;->g:Lja/j;

    iget-object v7, p1, Ll/r;->b:Ljava/lang/Object;

    check-cast v7, Lx9/s;

    const-string v8, "url"

    invoke-static {v7, v8}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lx9/s;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lx9/s;->d()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x3f

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :cond_1
    invoke-direct {v4, v6, v8}, Lea/c;-><init>(Lja/j;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v4, "Host"

    iget-object v6, p1, Ll/r;->d:Ljava/lang/Object;

    check-cast v6, Lx9/q;

    invoke-virtual {v6, v4}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    new-instance v6, Lea/c;

    sget-object v7, Lea/c;->i:Lja/j;

    invoke-direct {v6, v7, v4}, Lea/c;-><init>(Lja/j;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v4, Lea/c;

    sget-object v6, Lea/c;->h:Lja/j;

    iget-object p1, p1, Ll/r;->b:Ljava/lang/Object;

    check-cast p1, Lx9/s;

    iget-object p1, p1, Lx9/s;->a:Ljava/lang/String;

    invoke-direct {v4, v6, p1}, Lea/c;-><init>(Lja/j;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lx9/q;->size()I

    move-result p1

    move v4, v0

    :goto_0
    if-ge v4, p1, :cond_5

    invoke-virtual {v2, v4}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "US"

    invoke-static {v7, v8}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v6, v7}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lea/s;->g:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "te"

    invoke-static {v6, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v2, v4}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "trailers"

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_3
    new-instance v7, Lea/c;

    invoke-virtual {v2, v4}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Lea/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lea/s;->c:Lea/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    xor-int/lit8 v2, v0, 0x1

    const/4 v10, 0x0

    iget-object v4, p1, Lea/r;->F:Lea/z;

    monitor-enter v4

    :try_start_0
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget v6, p1, Lea/r;->f:I

    const v7, 0x3fffffff    # 1.9999999f

    if-le v6, v7, :cond_6

    sget-object v6, Lea/b;->f:Lea/b;

    invoke-virtual {p1, v6}, Lea/r;->g(Lea/b;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_6
    :goto_1
    iget-boolean v6, p1, Lea/r;->n:Z

    if-nez v6, :cond_d

    iget v12, p1, Lea/r;->f:I

    add-int/lit8 v6, v12, 0x2

    iput v6, p1, Lea/r;->f:I

    new-instance v13, Lea/y;

    const/4 v11, 0x0

    move-object v6, v13

    move v7, v12

    move-object v8, p1

    move v9, v2

    invoke-direct/range {v6 .. v11}, Lea/y;-><init>(ILea/r;ZZLx9/q;)V

    invoke-virtual {v13}, Lea/y;->h()Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p1, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_7
    :try_start_2
    monitor-exit p1

    iget-object v6, p1, Lea/r;->F:Lea/z;

    monitor-enter v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-boolean v7, v6, Lea/z;->e:Z

    if-nez v7, :cond_c

    iget-object v7, v6, Lea/z;->f:Lj8/e;

    invoke-virtual {v7, v3}, Lj8/e;->f(Ljava/util/List;)V

    iget-object v3, v6, Lea/z;->c:Lja/g;

    iget-wide v7, v3, Lja/g;->b:J

    iget v3, v6, Lea/z;->d:I

    int-to-long v9, v3

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    cmp-long v3, v7, v9

    if-nez v3, :cond_8

    move v0, v5

    :cond_8
    if-eqz v2, :cond_9

    or-int/lit8 v0, v0, 0x1

    :cond_9
    long-to-int v2, v9

    invoke-virtual {v6, v12, v2, v1, v0}, Lea/z;->b(IIII)V

    iget-object v0, v6, Lea/z;->a:Lja/h;

    iget-object v1, v6, Lea/z;->c:Lja/g;

    invoke-interface {v0, v1, v9, v10}, Lja/e0;->b0(Lja/g;J)V

    if-lez v3, :cond_a

    sub-long/2addr v7, v9

    invoke-virtual {v6, v12, v7, v8}, Lea/z;->g(IJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_a
    :goto_2
    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v4

    iget-object p1, p1, Lea/r;->F:Lea/z;

    invoke-virtual {p1}, Lea/z;->flush()V

    iput-object v13, p0, Lea/s;->d:Lea/y;

    iget-boolean p1, p0, Lea/s;->f:Z

    if-nez p1, :cond_b

    iget-object p1, p0, Lea/s;->d:Lea/y;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p1, p1, Lea/y;->k:Lea/x;

    iget-object v0, p0, Lea/s;->b:Lca/f;

    iget v0, v0, Lca/f;->g:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    iget-object p1, p0, Lea/s;->d:Lea/y;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p1, p1, Lea/y;->l:Lea/x;

    iget-object v0, p0, Lea/s;->b:Lca/f;

    iget v0, v0, Lca/f;->h:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    return-void

    :cond_b
    iget-object p1, p0, Lea/s;->d:Lea/y;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    sget-object v0, Lea/b;->n:Lea/b;

    invoke-virtual {p1, v0}, Lea/y;->e(Lea/b;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    :try_start_6
    monitor-exit v6

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_d
    :try_start_7
    new-instance v0, Lea/a;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_4
    :try_start_8
    monitor-exit p1

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_5
    monitor-exit v4

    throw p1
.end method

.method public final g(Z)Lx9/a0;
    .locals 11

    iget-object v0, p0, Lea/s;->d:Lea/y;

    if-eqz v0, :cond_8

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lea/y;->k:Lea/x;

    invoke-virtual {v1}, Lja/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v1, v0, Lea/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lea/y;->m:Lea/b;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lea/y;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :try_start_2
    iget-object v1, v0, Lea/y;->k:Lea/x;

    invoke-virtual {v1}, Lea/x;->l()V

    iget-object v1, v0, Lea/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_6

    iget-object v1, v0, Lea/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "headersQueue.removeFirst()"

    invoke-static {v1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lx9/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object v0, p0, Lea/s;->e:Lx9/x;

    const-string v2, "protocol"

    invoke-static {v0, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Lx9/q;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v4

    move v6, v5

    :goto_1
    if-ge v6, v3, :cond_3

    invoke-virtual {v1, v6}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v6}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, ":status"

    invoke-static {v8, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "HTTP/1.1 "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lx9/v;->F(Ljava/lang/String;)Lca/h;

    move-result-object v7

    goto :goto_2

    :cond_1
    sget-object v10, Lea/s;->h:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, "name"

    invoke-static {v8, v10}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "value"

    invoke-static {v9, v10}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, Ll9/i;->o1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    if-eqz v7, :cond_5

    new-instance v1, Lx9/a0;

    invoke-direct {v1}, Lx9/a0;-><init>()V

    iput-object v0, v1, Lx9/a0;->b:Lx9/x;

    iget v0, v7, Lca/h;->b:I

    iput v0, v1, Lx9/a0;->c:I

    iget-object v0, v7, Lca/h;->c:Ljava/lang/String;

    const-string v3, "message"

    invoke-static {v0, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Lx9/a0;->d:Ljava/lang/String;

    new-array v0, v5, [Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    new-instance v2, Lx9/p;

    invoke-direct {v2}, Lx9/p;-><init>()V

    iget-object v3, v2, Lx9/p;->a:Ljava/util/ArrayList;

    const-string v5, "<this>"

    invoke-static {v3, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "elements"

    invoke-static {v0, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lb9/b;->E([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iput-object v2, v1, Lx9/a0;->f:Lx9/p;

    if-eqz p1, :cond_4

    iget p1, v1, Lx9/a0;->c:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v1

    :goto_3
    return-object v4

    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_6
    :try_start_3
    iget-object p1, v0, Lea/y;->n:Ljava/io/IOException;

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    new-instance p1, Lea/d0;

    iget-object v1, v0, Lea/y;->m:Lea/b;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-direct {p1, v1}, Lea/d0;-><init>(Lea/b;)V

    :goto_4
    throw p1

    :goto_5
    iget-object v1, v0, Lea/y;->k:Lea/x;

    invoke-virtual {v1}, Lea/x;->l()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_6
    monitor-exit v0

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()Lba/k;
    .locals 1

    iget-object v0, p0, Lea/s;->a:Lba/k;

    return-object v0
.end method
