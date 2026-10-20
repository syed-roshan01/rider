.class public final Lba/k;
.super Lea/h;


# instance fields
.field public final b:Lx9/d0;

.field public c:Ljava/net/Socket;

.field public d:Ljava/net/Socket;

.field public e:Lx9/o;

.field public f:Lx9/x;

.field public g:Lea/r;

.field public h:Lja/a0;

.field public i:Lja/z;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:J


# direct methods
.method public constructor <init>(Lba/l;Lx9/d0;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "route"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lba/k;->b:Lx9/d0;

    const/4 p1, 0x1

    iput p1, p0, Lba/k;->o:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lba/k;->p:Ljava/util/ArrayList;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lba/k;->q:J

    return-void
.end method

.method public static d(Lx9/w;Lx9/d0;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lx9/d0;->a:Lx9/a;

    iget-object v1, v0, Lx9/a;->h:Ljava/net/ProxySelector;

    iget-object v0, v0, Lx9/a;->i:Lx9/s;

    invoke-virtual {v0}, Lx9/s;->g()Ljava/net/URI;

    move-result-object v0

    iget-object v2, p1, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    iget-object p0, p0, Lx9/w;->F:Lk6/w4;

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(Lea/r;Lea/c0;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Lea/c0;->a:I

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p2, Lea/c0;->b:[I

    const/4 p2, 0x4

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    iput p1, p0, Lba/k;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Lea/y;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lea/b;->f:Lea/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lea/y;->c(Lea/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final c(IIIZLba/i;Lx9/n;)V
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    const-string v10, "proxy"

    const-string v11, "inetSocketAddress"

    const-string v0, "call"

    invoke-static {v8, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lba/k;->f:Lx9/x;

    if-nez v0, :cond_d

    iget-object v0, v7, Lba/k;->b:Lx9/d0;

    iget-object v0, v0, Lx9/d0;->a:Lx9/a;

    iget-object v0, v0, Lx9/a;->k:Ljava/util/List;

    new-instance v12, Lk6/f4;

    invoke-direct {v12, v0}, Lk6/f4;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lba/k;->b:Lx9/d0;

    iget-object v1, v1, Lx9/d0;->a:Lx9/a;

    iget-object v2, v1, Lx9/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v2, :cond_2

    sget-object v1, Lx9/i;->f:Lx9/i;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Lba/k;->b:Lx9/d0;

    iget-object v0, v0, Lx9/d0;->a:Lx9/a;

    iget-object v0, v0, Lx9/a;->i:Lx9/s;

    iget-object v0, v0, Lx9/s;->d:Ljava/lang/String;

    sget-object v1, Lfa/m;->a:Lfa/m;

    sget-object v1, Lfa/m;->a:Lfa/m;

    invoke-virtual {v1, v0}, Lfa/m;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lba/m;

    new-instance v2, Ljava/net/UnknownServiceException;

    const-string v3, "CLEARTEXT communication to "

    const-string v4, " not permitted by network security policy"

    invoke-static {v3, v0, v4}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lba/m;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, Lba/m;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lba/m;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lx9/a;->j:Ljava/util/List;

    sget-object v1, Lx9/x;->f:Lx9/x;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_0
    const/4 v13, 0x0

    move-object v14, v13

    :goto_1
    :try_start_0
    iget-object v0, v7, Lba/k;->b:Lx9/d0;

    iget-object v1, v0, Lx9/d0;->a:Lx9/a;

    iget-object v1, v1, Lx9/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_4

    iget-object v0, v0, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_4

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, Lba/k;->f(IIILba/i;Lx9/n;)V

    iget-object v0, v7, Lba/k;->c:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_2

    :catch_0
    move-exception v0

    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_5

    :cond_4
    move/from16 v1, p1

    move/from16 v2, p2

    :try_start_1
    invoke-virtual {p0, v1, v2, v8, v9}, Lba/k;->e(IILba/i;Lx9/n;)V

    :goto_2
    invoke-virtual {p0, v12, v8, v9}, Lba/k;->g(Lk6/f4;Lba/i;Lx9/n;)V

    iget-object v0, v7, Lba/k;->b:Lx9/d0;

    iget-object v3, v0, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    iget-object v0, v0, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-static {v3, v11}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v10}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    iget-object v0, v7, Lba/k;->b:Lx9/d0;

    iget-object v1, v0, Lx9/d0;->a:Lx9/a;

    iget-object v1, v1, Lx9/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_6

    iget-object v0, v0, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_6

    iget-object v0, v7, Lba/k;->c:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    new-instance v0, Lba/m;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lba/m;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_6
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, Lba/k;->q:J

    return-void

    :catch_1
    move-exception v0

    :goto_5
    iget-object v3, v7, Lba/k;->d:Ljava/net/Socket;

    if-eqz v3, :cond_7

    invoke-static {v3}, Ly9/b;->c(Ljava/net/Socket;)V

    :cond_7
    iget-object v3, v7, Lba/k;->c:Ljava/net/Socket;

    if-eqz v3, :cond_8

    invoke-static {v3}, Ly9/b;->c(Ljava/net/Socket;)V

    :cond_8
    iput-object v13, v7, Lba/k;->d:Ljava/net/Socket;

    iput-object v13, v7, Lba/k;->c:Ljava/net/Socket;

    iput-object v13, v7, Lba/k;->h:Lja/a0;

    iput-object v13, v7, Lba/k;->i:Lja/z;

    iput-object v13, v7, Lba/k;->e:Lx9/o;

    iput-object v13, v7, Lba/k;->f:Lx9/x;

    iput-object v13, v7, Lba/k;->g:Lea/r;

    const/4 v3, 0x1

    iput v3, v7, Lba/k;->o:I

    iget-object v4, v7, Lba/k;->b:Lx9/d0;

    iget-object v5, v4, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    iget-object v4, v4, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-static {v5, v11}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v10}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v14, :cond_9

    new-instance v14, Lba/m;

    invoke-direct {v14, v0}, Lba/m;-><init>(Ljava/io/IOException;)V

    goto :goto_6

    :cond_9
    iget-object v4, v14, Lba/m;->a:Ljava/io/IOException;

    invoke-static {v4, v0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object v0, v14, Lba/m;->b:Ljava/io/IOException;

    :goto_6
    if-eqz p4, :cond_b

    iput-boolean v3, v12, Lk6/f4;->c:Z

    iget-boolean v3, v12, Lk6/f4;->b:Z

    if-eqz v3, :cond_b

    instance-of v3, v0, Ljava/net/ProtocolException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljava/io/InterruptedIOException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/security/cert/CertificateException;

    if-nez v3, :cond_b

    :cond_a
    instance-of v3, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v3, :cond_b

    instance-of v0, v0, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_b

    goto/16 :goto_1

    :cond_b
    throw v14

    :cond_c
    new-instance v0, Lba/m;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lba/m;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(IILba/i;Lx9/n;)V
    .locals 4

    iget-object v0, p0, Lba/k;->b:Lx9/d0;

    iget-object v1, v0, Lx9/d0;->b:Ljava/net/Proxy;

    iget-object v0, v0, Lx9/d0;->a:Lx9/a;

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v3, Lba/j;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lx9/a;->b:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_1
    iput-object v0, p0, Lba/k;->c:Ljava/net/Socket;

    iget-object v1, p0, Lba/k;->b:Lx9/d0;

    iget-object v1, v1, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p4, "call"

    invoke-static {p3, p4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "inetSocketAddress"

    invoke-static {v1, p3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, Lfa/m;->a:Lfa/m;

    sget-object p2, Lfa/m;->a:Lfa/m;

    iget-object p3, p0, Lba/k;->b:Lx9/d0;

    iget-object p3, p3, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p2, v0, p3, p1}, Lfa/m;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v0}, Lr9/a;->p(Ljava/net/Socket;)Lja/c;

    move-result-object p1

    invoke-static {p1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object p1

    iput-object p1, p0, Lba/k;->h:Lja/a0;

    invoke-static {v0}, Lr9/a;->n(Ljava/net/Socket;)Lja/b;

    move-result-object p1

    invoke-static {p1}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object p1

    iput-object p1, p0, Lba/k;->i:Lja/z;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to connect to "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Lba/k;->b:Lx9/d0;

    iget-object p4, p4, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final f(IIILba/i;Lx9/n;)V
    .locals 14

    move-object v0, p0

    move/from16 v1, p2

    new-instance v2, Lx9/y;

    invoke-direct {v2}, Lx9/y;-><init>()V

    iget-object v3, v0, Lba/k;->b:Lx9/d0;

    iget-object v4, v3, Lx9/d0;->a:Lx9/a;

    iget-object v4, v4, Lx9/a;->i:Lx9/s;

    const-string v5, "url"

    invoke-static {v4, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Lx9/y;->a:Lx9/s;

    const-string v4, "CONNECT"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Lx9/y;->d(Ljava/lang/String;Lx9/z;)V

    iget-object v3, v3, Lx9/d0;->a:Lx9/a;

    iget-object v4, v3, Lx9/a;->i:Lx9/s;

    const/4 v6, 0x1

    invoke-static {v4, v6}, Ly9/b;->t(Lx9/s;Z)Ljava/lang/String;

    move-result-object v4

    const-string v7, "Host"

    invoke-virtual {v2, v7, v4}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Proxy-Connection"

    const-string v7, "Keep-Alive"

    invoke-virtual {v2, v4, v7}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "User-Agent"

    const-string v7, "okhttp/4.12.0"

    invoke-virtual {v2, v4, v7}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lx9/y;->a()Ll/r;

    move-result-object v2

    new-instance v4, Lx9/a0;

    invoke-direct {v4}, Lx9/a0;-><init>()V

    iput-object v2, v4, Lx9/a0;->a:Ll/r;

    sget-object v7, Lx9/x;->c:Lx9/x;

    iput-object v7, v4, Lx9/a0;->b:Lx9/x;

    const/16 v7, 0x197

    iput v7, v4, Lx9/a0;->c:I

    const-string v8, "Preemptive Authenticate"

    iput-object v8, v4, Lx9/a0;->d:Ljava/lang/String;

    sget-object v8, Ly9/b;->c:Lx9/c0;

    iput-object v8, v4, Lx9/a0;->g:Lk4/o;

    const-wide/16 v8, -0x1

    iput-wide v8, v4, Lx9/a0;->k:J

    iput-wide v8, v4, Lx9/a0;->l:J

    iget-object v10, v4, Lx9/a0;->f:Lx9/p;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "Proxy-Authenticate"

    invoke-static {v11}, Lq8/k;->c(Ljava/lang/String;)V

    const-string v12, "OkHttp-Preemptive"

    invoke-static {v12, v11}, Lq8/k;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Lx9/p;->d(Ljava/lang/String;)V

    invoke-virtual {v10, v11, v12}, Lx9/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lx9/a0;->a()Lx9/b0;

    iget-object v4, v3, Lx9/a;->f:Lx9/b;

    check-cast v4, Lx9/n;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, Ll/r;->b:Ljava/lang/Object;

    check-cast v4, Lx9/s;

    move v10, p1

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    invoke-virtual {p0, p1, v1, v11, v12}, Lba/k;->e(IILba/i;Lx9/n;)V

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "CONNECT "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v6}, Ly9/b;->t(Lx9/s;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " HTTP/1.1"

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v0, Lba/k;->h:Lja/a0;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v10, v0, Lba/k;->i:Lja/z;

    invoke-static {v10}, Ld7/a;->j(Ljava/lang/Object;)V

    new-instance v11, Lda/h;

    invoke-direct {v11, v5, p0, v6, v10}, Lda/h;-><init>(Lx9/w;Lba/k;Lja/i;Lja/h;)V

    iget-object v5, v6, Lja/a0;->a:Lja/g0;

    invoke-interface {v5}, Lja/g0;->c()Lja/i0;

    move-result-object v5

    int-to-long v12, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v12, v13, v1}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    iget-object v5, v10, Lja/z;->a:Lja/e0;

    invoke-interface {v5}, Lja/e0;->c()Lja/i0;

    move-result-object v5

    move/from16 v12, p3

    int-to-long v12, v12

    invoke-virtual {v5, v12, v13, v1}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    iget-object v5, v2, Ll/r;->d:Ljava/lang/Object;

    check-cast v5, Lx9/q;

    invoke-virtual {v11, v5, v4}, Lda/h;->j(Lx9/q;Ljava/lang/String;)V

    invoke-virtual {v11}, Lda/h;->c()V

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, Lda/h;->g(Z)Lx9/a0;

    move-result-object v4

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    iput-object v2, v4, Lx9/a0;->a:Ll/r;

    invoke-virtual {v4}, Lx9/a0;->a()Lx9/b0;

    move-result-object v2

    invoke-static {v2}, Ly9/b;->i(Lx9/b0;)J

    move-result-wide v4

    cmp-long v8, v4, v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v4, v5}, Lda/h;->i(J)Lda/e;

    move-result-object v4

    const v5, 0x7fffffff

    invoke-static {v4, v5, v1}, Ly9/b;->r(Lja/g0;ILjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {v4}, Lda/e;->close()V

    :goto_0
    const/16 v1, 0xc8

    iget v2, v2, Lx9/b0;->d:I

    if-eq v2, v1, :cond_2

    if-ne v2, v7, :cond_1

    iget-object v1, v3, Lx9/a;->f:Lx9/b;

    check-cast v1, Lx9/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to authenticate with proxy"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Unexpected response code for CONNECT: "

    invoke-static {v3, v2}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v6, Lja/a0;->b:Lja/g;

    invoke-virtual {v1}, Lja/g;->B()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v10, Lja/z;->b:Lja/g;

    invoke-virtual {v1}, Lja/g;->B()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final g(Lk6/f4;Lba/i;Lx9/n;)V
    .locals 10

    iget-object v0, p0, Lba/k;->b:Lx9/d0;

    iget-object v0, v0, Lx9/d0;->a:Lx9/a;

    iget-object v1, v0, Lx9/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v2, Lx9/x;->c:Lx9/x;

    if-nez v1, :cond_1

    iget-object p1, v0, Lx9/a;->j:Ljava/util/List;

    sget-object p2, Lx9/x;->f:Lx9/x;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lba/k;->c:Ljava/net/Socket;

    iput-object p1, p0, Lba/k;->d:Ljava/net/Socket;

    iput-object p2, p0, Lba/k;->f:Lx9/x;

    invoke-virtual {p0}, Lba/k;->l()V

    return-void

    :cond_0
    iget-object p1, p0, Lba/k;->c:Ljava/net/Socket;

    iput-object p1, p0, Lba/k;->d:Ljava/net/Socket;

    iput-object v2, p0, Lba/k;->f:Lx9/x;

    return-void

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "call"

    invoke-static {p2, p3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "Hostname "

    const-string p3, "\n              |Hostname "

    iget-object v0, p0, Lba/k;->b:Lx9/d0;

    iget-object v0, v0, Lx9/d0;->a:Lx9/a;

    iget-object v1, v0, Lx9/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v4, p0, Lba/k;->c:Ljava/net/Socket;

    iget-object v5, v0, Lx9/a;->i:Lx9/s;

    iget-object v6, v5, Lx9/s;->d:Ljava/lang/String;

    iget v5, v5, Lx9/s;->e:I

    const/4 v7, 0x1

    invoke-virtual {v1, v4, v6, v5, v7}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v1, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Lk6/f4;->a(Ljavax/net/ssl/SSLSocket;)Lx9/i;

    move-result-object p1

    iget-boolean v4, p1, Lx9/i;->b:Z

    if-eqz v4, :cond_2

    sget-object v4, Lfa/m;->a:Lfa/m;

    sget-object v4, Lfa/m;->a:Lfa/m;

    iget-object v5, v0, Lx9/a;->i:Lx9/s;

    iget-object v5, v5, Lx9/s;->d:Ljava/lang/String;

    iget-object v6, v0, Lx9/a;->j:Ljava/util/List;

    invoke-virtual {v4, v1, v5, v6}, Lfa/m;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v3, v1

    goto/16 :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v4

    const-string v5, "sslSocketSession"

    invoke-static {v4, v5}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lq8/k;->h(Ljavax/net/ssl/SSLSession;)Lx9/o;

    move-result-object v5

    iget-object v6, v0, Lx9/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v8, v0, Lx9/a;->i:Lx9/s;

    iget-object v8, v8, Lx9/s;->d:Ljava/lang/String;

    invoke-interface {v6, v8, v4}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lx9/o;->a()Ljava/util/List;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v7

    if-eqz v2, :cond_3

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p1, p2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, v0, Lx9/a;->i:Lx9/s;

    iget-object p3, p3, Lx9/s;->d:Ljava/lang/String;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified:\n              |    certificate: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lx9/f;->c:Lx9/f;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "sha256/"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lja/j;->d:Lja/j;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    const-string v3, "publicKey.encoded"

    invoke-static {v0, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lfa/l;->k([B)Lja/j;

    move-result-object v0

    const-string v3, "SHA-256"

    invoke-virtual {v0, v3}, Lja/j;->c(Ljava/lang/String;)Lja/j;

    move-result-object v0

    invoke-virtual {v0}, Lja/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    DN: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p3

    invoke-interface {p3}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    subjectAltNames: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p3, 0x7

    invoke-static {p1, p3}, Lia/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lia/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    check-cast p3, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, p3}, Lr8/p;->P0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lz6/a;->r0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v0, Lx9/a;->i:Lx9/s;

    iget-object p2, p2, Lx9/s;->d:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not verified (no certificates)"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p2, v0, Lx9/a;->e:Lx9/f;

    invoke-static {p2}, Ld7/a;->j(Ljava/lang/Object;)V

    new-instance p3, Lx9/o;

    iget-object v4, v5, Lx9/o;->a:Lx9/e0;

    iget-object v6, v5, Lx9/o;->b:Lx9/g;

    iget-object v7, v5, Lx9/o;->c:Ljava/util/List;

    new-instance v8, Lz/p;

    const/16 v9, 0x9

    invoke-direct {v8, p2, v5, v0, v9}, Lz/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p3, v4, v6, v7, v8}, Lx9/o;-><init>(Lx9/e0;Lx9/g;Ljava/util/List;Lc9/a;)V

    iput-object p3, p0, Lba/k;->e:Lx9/o;

    iget-object p3, v0, Lx9/a;->i:Lx9/s;

    iget-object p3, p3, Lx9/s;->d:Ljava/lang/String;

    new-instance v0, Lu1/z0;

    const/16 v4, 0xf

    invoke-direct {v0, p0, v4}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3, v0}, Lx9/f;->a(Ljava/lang/String;Lc9/a;)V

    iget-boolean p1, p1, Lx9/i;->b:Z

    if-eqz p1, :cond_5

    sget-object p1, Lfa/m;->a:Lfa/m;

    sget-object p1, Lfa/m;->a:Lfa/m;

    invoke-virtual {p1, v1}, Lfa/m;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v3

    :cond_5
    iput-object v1, p0, Lba/k;->d:Ljava/net/Socket;

    invoke-static {v1}, Lr9/a;->p(Ljava/net/Socket;)Lja/c;

    move-result-object p1

    invoke-static {p1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object p1

    iput-object p1, p0, Lba/k;->h:Lja/a0;

    invoke-static {v1}, Lr9/a;->n(Ljava/net/Socket;)Lja/b;

    move-result-object p1

    invoke-static {p1}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object p1

    iput-object p1, p0, Lba/k;->i:Lja/z;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lx9/v;->r(Ljava/lang/String;)Lx9/x;

    move-result-object v2

    :cond_6
    iput-object v2, p0, Lba/k;->f:Lx9/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lfa/m;->a:Lfa/m;

    sget-object p1, Lfa/m;->a:Lfa/m;

    invoke-virtual {p1, v1}, Lfa/m;->a(Ljavax/net/ssl/SSLSocket;)V

    iget-object p1, p0, Lba/k;->f:Lx9/x;

    sget-object p2, Lx9/x;->e:Lx9/x;

    if-ne p1, p2, :cond_7

    invoke-virtual {p0}, Lba/k;->l()V

    :cond_7
    return-void

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v3, :cond_8

    sget-object p2, Lfa/m;->a:Lfa/m;

    sget-object p2, Lfa/m;->a:Lfa/m;

    invoke-virtual {p2, v3}, Lfa/m;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_8
    if-eqz v3, :cond_9

    invoke-static {v3}, Ly9/b;->c(Ljava/net/Socket;)V

    :cond_9
    throw p1
.end method

.method public final h(Lx9/a;Ljava/util/List;)Z
    .locals 8

    const-string v0, "address"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly9/b;->a:[B

    iget-object v0, p0, Lba/k;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lba/k;->o:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_9

    iget-boolean v0, p0, Lba/k;->j:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lba/k;->b:Lx9/d0;

    iget-object v1, v0, Lx9/d0;->a:Lx9/a;

    invoke-virtual {v1, p1}, Lx9/a;->a(Lx9/a;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p1, Lx9/a;->i:Lx9/s;

    iget-object v3, v1, Lx9/s;->d:Ljava/lang/String;

    iget-object v4, v0, Lx9/d0;->a:Lx9/a;

    iget-object v5, v4, Lx9/a;->i:Lx9/s;

    iget-object v5, v5, Lx9/s;->d:Ljava/lang/String;

    invoke-static {v3, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    return v5

    :cond_2
    iget-object v3, p0, Lba/k;->g:Lea/r;

    if-nez v3, :cond_3

    return v2

    :cond_3
    if-eqz p2, :cond_9

    check-cast p2, Ljava/lang/Iterable;

    instance-of v3, p2, Ljava/util/Collection;

    if-eqz v3, :cond_4

    move-object v3, p2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx9/d0;

    iget-object v6, v3, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v6

    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v6, v7, :cond_5

    iget-object v6, v0, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v6

    if-ne v6, v7, :cond_5

    iget-object v3, v3, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    iget-object v6, v0, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    invoke-static {v6, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object p2, Lia/c;->a:Lia/c;

    iget-object v0, p1, Lx9/a;->d:Ljavax/net/ssl/HostnameVerifier;

    if-eq v0, p2, :cond_6

    return v2

    :cond_6
    sget-object p2, Ly9/b;->a:[B

    iget-object p2, v4, Lx9/a;->i:Lx9/s;

    iget v0, p2, Lx9/s;->e:I

    iget v3, v1, Lx9/s;->e:I

    if-eq v3, v0, :cond_7

    goto :goto_1

    :cond_7
    iget-object p2, p2, Lx9/s;->d:Ljava/lang/String;

    iget-object v0, v1, Lx9/s;->d:Ljava/lang/String;

    invoke-static {v0, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_0

    :cond_8
    iget-boolean p2, p0, Lba/k;->k:Z

    if-nez p2, :cond_9

    iget-object p2, p0, Lba/k;->e:Lx9/o;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lx9/o;->a()Ljava/util/List;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v5

    if-eqz v1, :cond_9

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p2, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-static {v0, p2}, Lia/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p2

    if-eqz p2, :cond_9

    :goto_0
    :try_start_0
    iget-object p1, p1, Lx9/a;->e:Lx9/f;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p2, p0, Lba/k;->e:Lx9/o;

    invoke-static {p2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lx9/o;->a()Ljava/util/List;

    move-result-object p2

    const-string v1, "hostname"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "peerCertificates"

    invoke-static {p2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz/p;

    const/16 v3, 0x8

    invoke-direct {v1, p1, p2, v0, v3}, Lz/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0, v1}, Lx9/f;->a(Ljava/lang/String;Lc9/a;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v5

    :catch_0
    :cond_9
    :goto_1
    return v2
.end method

.method public final i(Z)Z
    .locals 9

    sget-object v0, Ly9/b;->a:[B

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lba/k;->c:Ljava/net/Socket;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v3, p0, Lba/k;->d:Ljava/net/Socket;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v4, p0, Lba/k;->h:Lja/a0;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    iget-object v2, p0, Lba/k;->g:Lea/r;

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    monitor-enter v2

    :try_start_0
    iget-boolean p1, v2, Lea/r;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit v2

    goto :goto_0

    :cond_1
    :try_start_1
    iget-wide v3, v2, Lea/r;->w:J

    iget-wide v7, v2, Lea/r;->v:J

    cmp-long p1, v3, v7

    if-gez p1, :cond_2

    iget-wide v3, v2, Lea/r;->x:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v0, v3

    if-ltz p1, :cond_2

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    monitor-exit v2

    move v5, v6

    :goto_0
    return v5

    :goto_1
    monitor-exit v2

    throw p1

    :cond_3
    monitor-enter p0

    :try_start_2
    iget-wide v7, p0, Lba/k;->q:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    sub-long/2addr v0, v7

    monitor-exit p0

    const-wide v7, 0x2540be400L

    cmp-long v0, v0, v7

    if-ltz v0, :cond_4

    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v4}, Lja/a0;->B()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    xor-int/2addr v0, v6

    :try_start_5
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    move v5, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_0
    move v5, v6

    :catch_1
    :goto_2
    return v5

    :cond_4
    return v6

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_3
    return v5
.end method

.method public final j(Lx9/w;Lca/f;)Lca/d;
    .locals 6

    iget-object v0, p0, Lba/k;->d:Ljava/net/Socket;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Lba/k;->h:Lja/a0;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v2, p0, Lba/k;->i:Lja/z;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v3, p0, Lba/k;->g:Lea/r;

    if-eqz v3, :cond_0

    new-instance v0, Lea/s;

    invoke-direct {v0, p1, p0, p2, v3}, Lea/s;-><init>(Lx9/w;Lba/k;Lca/f;Lea/r;)V

    goto :goto_0

    :cond_0
    iget v3, p2, Lca/f;->g:I

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, v1, Lja/a0;->a:Lja/g0;

    invoke-interface {v0}, Lja/g0;->c()Lja/i0;

    move-result-object v0

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    iget-object v0, v2, Lja/z;->a:Lja/e0;

    invoke-interface {v0}, Lja/e0;->c()Lja/i0;

    move-result-object v0

    iget p2, p2, Lca/f;->h:I

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    new-instance v0, Lda/h;

    invoke-direct {v0, p1, p0, v1, v2}, Lda/h;-><init>(Lx9/w;Lba/k;Lja/i;Lja/h;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized k()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lba/k;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()V
    .locals 9

    iget-object v0, p0, Lba/k;->d:Ljava/net/Socket;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Lba/k;->h:Lja/a0;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v2, p0, Lba/k;->i:Lja/z;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, Lea/f;

    sget-object v5, Laa/f;->i:Laa/f;

    invoke-direct {v4, v5}, Lea/f;-><init>(Laa/f;)V

    iget-object v6, p0, Lba/k;->b:Lx9/d0;

    iget-object v6, v6, Lx9/d0;->a:Lx9/a;

    iget-object v6, v6, Lx9/a;->i:Lx9/s;

    iget-object v6, v6, Lx9/s;->d:Ljava/lang/String;

    const-string v7, "peerName"

    invoke-static {v6, v7}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, Lea/f;->c:Ljava/net/Socket;

    iget-boolean v0, v4, Lea/f;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Ly9/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "MockWebServer "

    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v6, "<set-?>"

    invoke-static {v0, v6}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, Lea/f;->d:Ljava/lang/String;

    iput-object v1, v4, Lea/f;->e:Lja/i;

    iput-object v2, v4, Lea/f;->f:Lja/h;

    iput-object p0, v4, Lea/f;->g:Lea/h;

    iput v3, v4, Lea/f;->i:I

    new-instance v0, Lea/r;

    invoke-direct {v0, v4}, Lea/r;-><init>(Lea/f;)V

    iput-object v0, p0, Lba/k;->g:Lea/r;

    sget-object v1, Lea/r;->I:Lea/c0;

    iget v2, v1, Lea/c0;->a:I

    and-int/lit8 v2, v2, 0x10

    const/4 v4, 0x4

    if-eqz v2, :cond_1

    iget-object v1, v1, Lea/c0;->b:[I

    aget v1, v1, v4

    goto :goto_1

    :cond_1
    const v1, 0x7fffffff

    :goto_1
    iput v1, p0, Lba/k;->o:I

    iget-object v1, v0, Lea/r;->F:Lea/z;

    const-string v2, ">> CONNECTION "

    monitor-enter v1

    :try_start_0
    iget-boolean v6, v1, Lea/z;->e:Z

    if-nez v6, :cond_a

    iget-boolean v6, v1, Lea/z;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_2

    monitor-exit v1

    goto :goto_3

    :cond_2
    :try_start_1
    sget-object v6, Lea/z;->n:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lea/e;->a:Lja/j;

    invoke-virtual {v2}, Lja/j;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v7}, Ly9/b;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_3
    :goto_2
    iget-object v2, v1, Lea/z;->a:Lja/h;

    sget-object v6, Lea/e;->a:Lja/j;

    invoke-interface {v2, v6}, Lja/h;->z(Lja/j;)Lja/h;

    iget-object v2, v1, Lea/z;->a:Lja/h;

    invoke-interface {v2}, Lja/h;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    :goto_3
    iget-object v1, v0, Lea/r;->F:Lea/z;

    iget-object v2, v0, Lea/r;->y:Lea/c0;

    monitor-enter v1

    :try_start_2
    const-string v6, "settings"

    invoke-static {v2, v6}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v6, v1, Lea/z;->e:Z

    if-nez v6, :cond_9

    iget v6, v2, Lea/c0;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x6

    invoke-virtual {v1, v3, v6, v4, v3}, Lea/z;->b(IIII)V

    move v6, v3

    :goto_4
    const/16 v7, 0xa

    if-ge v6, v7, :cond_7

    const/4 v7, 0x1

    shl-int/2addr v7, v6

    iget v8, v2, Lea/c0;->a:I

    and-int/2addr v7, v8

    if-eqz v7, :cond_6

    if-eq v6, v4, :cond_5

    const/4 v7, 0x7

    if-eq v6, v7, :cond_4

    move v7, v6

    goto :goto_5

    :cond_4
    move v7, v4

    goto :goto_5

    :cond_5
    const/4 v7, 0x3

    :goto_5
    iget-object v8, v1, Lea/z;->a:Lja/h;

    invoke-interface {v8, v7}, Lja/h;->m(I)Lja/h;

    iget-object v7, v1, Lea/z;->a:Lja/h;

    iget-object v8, v2, Lea/c0;->b:[I

    aget v8, v8, v6

    invoke-interface {v7, v8}, Lja/h;->s(I)Lja/h;

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_6
    :goto_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    iget-object v2, v1, Lea/z;->a:Lja/h;

    invoke-interface {v2}, Lja/h;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object v1, v0, Lea/r;->y:Lea/c0;

    invoke-virtual {v1}, Lea/c0;->a()I

    move-result v1

    const v2, 0xffff

    if-eq v1, v2, :cond_8

    iget-object v4, v0, Lea/r;->F:Lea/z;

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v4, v3, v1, v2}, Lea/z;->N(IJ)V

    :cond_8
    invoke-virtual {v5}, Laa/f;->f()Laa/c;

    move-result-object v1

    iget-object v2, v0, Lea/r;->d:Ljava/lang/String;

    iget-object v0, v0, Lea/r;->G:Lea/l;

    new-instance v4, Laa/b;

    invoke-direct {v4, v3, v0, v2}, Laa/b;-><init>(ILjava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v4, v2, v3}, Laa/c;->c(Laa/a;J)V

    return-void

    :cond_9
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_7
    monitor-exit v1

    throw v0

    :cond_a
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_8
    monitor-exit v1

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lba/k;->b:Lx9/d0;

    iget-object v2, v1, Lx9/d0;->a:Lx9/a;

    iget-object v2, v2, Lx9/a;->i:Lx9/s;

    iget-object v2, v2, Lx9/s;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lx9/d0;->a:Lx9/a;

    iget-object v2, v2, Lx9/a;->i:Lx9/s;

    iget v2, v2, Lx9/s;->e:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", proxy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lx9/d0;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " hostAddress="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lx9/d0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lba/k;->e:Lx9/o;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lx9/o;->b:Lx9/g;

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "none"

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lba/k;->f:Lx9/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
