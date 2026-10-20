.class public final Lh8/n;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/o0;
.implements Lh8/d;
.implements Lh8/v;


# static fields
.field public static final S:Ljava/util/Map;

.field public static final T:Ljava/util/logging/Logger;


# instance fields
.field public final A:Ljavax/net/SocketFactory;

.field public final B:Ljavax/net/ssl/SSLSocketFactory;

.field public final C:Ljavax/net/ssl/HostnameVerifier;

.field public D:I

.field public final E:Ljava/util/LinkedList;

.field public final F:Li8/b;

.field public G:Lg8/q2;

.field public H:Z

.field public I:J

.field public J:J

.field public K:Z

.field public final L:Ljava/lang/Runnable;

.field public final M:I

.field public final N:Z

.field public final O:Lg8/e6;

.field public final P:Lg8/z1;

.field public final Q:Le8/k0;

.field public final R:I

.field public final a:Ljava/net/InetSocketAddress;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Random;

.field public final e:Lq6/m;

.field public final f:I

.field public final g:Lj8/m;

.field public h:Lg8/t3;

.field public i:Lh8/e;

.field public j:Ly5/o;

.field public final k:Ljava/lang/Object;

.field public final l:Le8/q0;

.field public m:I

.field public final n:Ljava/util/HashMap;

.field public final o:Ljava/util/concurrent/Executor;

.field public final p:Lg8/r5;

.field public final q:Ljava/util/concurrent/ScheduledExecutorService;

.field public final r:I

.field public s:I

.field public t:Lk6/v6;

.field public u:Le8/c;

.field public v:Le8/c2;

.field public w:Z

.field public x:Lg8/y1;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lj8/a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lj8/a;->b:Lj8/a;

    sget-object v2, Le8/c2;->l:Le8/c2;

    const-string v3, "No error: A GRPC status of OK should have been sent"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->c:Lj8/a;

    const-string v3, "Protocol error"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->d:Lj8/a;

    const-string v3, "Internal error"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->e:Lj8/a;

    const-string v3, "Flow control error"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->f:Lj8/a;

    const-string v3, "Stream closed"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->n:Lj8/a;

    const-string v3, "Frame too large"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->o:Lj8/a;

    sget-object v3, Le8/c2;->m:Le8/c2;

    const-string v4, "Refused stream"

    invoke-virtual {v3, v4}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->p:Lj8/a;

    sget-object v3, Le8/c2;->f:Le8/c2;

    const-string v4, "Cancelled"

    invoke-virtual {v3, v4}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->q:Lj8/a;

    const-string v3, "Compression error"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->r:Lj8/a;

    const-string v3, "Connect error"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->s:Lj8/a;

    sget-object v2, Le8/c2;->k:Le8/c2;

    const-string v3, "Enhance your calm"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lj8/a;->t:Lj8/a;

    sget-object v2, Le8/c2;->i:Le8/c2;

    const-string v3, "Inadequate security"

    invoke-virtual {v2, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lh8/n;->S:Ljava/util/Map;

    const-class v0, Lh8/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lh8/n;->T:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lh8/h;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Le8/c;Le8/k0;Ll/h;)V
    .locals 5

    sget-object v0, Lg8/s1;->r:Lx9/v;

    new-instance v1, Lj8/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    iput-object v2, p0, Lh8/n;->d:Ljava/util/Random;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lh8/n;->k:Ljava/lang/Object;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Lh8/n;->n:Ljava/util/HashMap;

    const/4 v3, 0x0

    iput v3, p0, Lh8/n;->D:I

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    iput-object v3, p0, Lh8/n;->E:Ljava/util/LinkedList;

    new-instance v3, Lg8/z1;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Lg8/z1;-><init>(Le8/p0;I)V

    iput-object v3, p0, Lh8/n;->P:Lg8/z1;

    const/16 v3, 0x7530

    iput v3, p0, Lh8/n;->R:I

    const-string v3, "address"

    invoke-static {p2, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lh8/n;->a:Ljava/net/InetSocketAddress;

    iput-object p3, p0, Lh8/n;->b:Ljava/lang/String;

    iget p3, p1, Lh8/h;->q:I

    iput p3, p0, Lh8/n;->r:I

    iget p3, p1, Lh8/h;->u:I

    iput p3, p0, Lh8/n;->f:I

    iget-object p3, p1, Lh8/h;->b:Ljava/util/concurrent/Executor;

    const-string v3, "executor"

    invoke-static {p3, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lh8/n;->o:Ljava/util/concurrent/Executor;

    new-instance p3, Lg8/r5;

    iget-object v3, p1, Lh8/h;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p3, v3}, Lg8/r5;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p3, p0, Lh8/n;->p:Lg8/r5;

    iget-object p3, p1, Lh8/h;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-string v3, "scheduledExecutorService"

    invoke-static {p3, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lh8/n;->q:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p3, 0x3

    iput p3, p0, Lh8/n;->m:I

    iget-object p3, p1, Lh8/h;->f:Ljavax/net/SocketFactory;

    if-nez p3, :cond_0

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lh8/n;->A:Ljavax/net/SocketFactory;

    iget-object p3, p1, Lh8/h;->n:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p3, p0, Lh8/n;->B:Ljavax/net/ssl/SSLSocketFactory;

    iget-object p3, p1, Lh8/h;->o:Ljavax/net/ssl/HostnameVerifier;

    iput-object p3, p0, Lh8/n;->C:Ljavax/net/ssl/HostnameVerifier;

    iget-object p3, p1, Lh8/h;->p:Li8/b;

    const-string v3, "connectionSpec"

    invoke-static {p3, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lh8/n;->F:Li8/b;

    const-string p3, "stopwatchFactory"

    invoke-static {v0, p3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lh8/n;->e:Lq6/m;

    iput-object v1, p0, Lh8/n;->g:Lj8/m;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p4, :cond_1

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p4, 0x20

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const-string p4, "grpc-java-okhttp/1.57.2"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lh8/n;->c:Ljava/lang/String;

    iput-object p6, p0, Lh8/n;->Q:Le8/k0;

    iput-object p7, p0, Lh8/n;->L:Ljava/lang/Runnable;

    iget p3, p1, Lh8/h;->w:I

    iput p3, p0, Lh8/n;->M:I

    iget-object p3, p1, Lh8/h;->e:Lg8/k4;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lg8/e6;

    invoke-direct {p3}, Lg8/e6;-><init>()V

    iput-object p3, p0, Lh8/n;->O:Lg8/e6;

    const-class p3, Lh8/n;

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Le8/q0;->a(Ljava/lang/Class;Ljava/lang/String;)Le8/q0;

    move-result-object p2

    iput-object p2, p0, Lh8/n;->l:Le8/q0;

    sget-object p2, Le8/c;->b:Le8/c;

    sget-object p3, Lg8/l;->b:Le8/b;

    new-instance p4, Ljava/util/IdentityHashMap;

    const/4 p6, 0x1

    invoke-direct {p4, p6}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-virtual {p4, p3, p5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p2, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {p2}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_2

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Le8/b;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p4, p5, p3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p2, Le8/c;

    invoke-direct {p2, p4}, Le8/c;-><init>(Ljava/util/IdentityHashMap;)V

    iput-object p2, p0, Lh8/n;->u:Le8/c;

    iget-boolean p1, p1, Lh8/h;->x:Z

    iput-boolean p1, p0, Lh8/n;->N:Z

    monitor-enter v2

    :try_start_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static g(Lh8/n;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lj8/a;->c:Lj8/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lh8/n;->w(Lj8/a;)Le8/c2;

    move-result-object v1

    invoke-virtual {v1, p1}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lh8/n;->s(ILj8/a;Le8/c2;)V

    return-void
.end method

.method public static h(Lh8/n;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "\r\n"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lh8/n;->A:Ljavax/net/SocketFactory;

    if-eqz v2, :cond_0

    :try_start_1
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    invoke-virtual {v3, v2, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p2

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_8

    :cond_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    invoke-virtual {v3, v2, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    const/4 v2, 0x1

    :try_start_2
    invoke-virtual {p2, v2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    iget v3, p0, Lh8/n;->R:I

    invoke-virtual {p2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-static {p2}, Lr9/a;->p(Ljava/net/Socket;)Lja/c;

    move-result-object v3

    invoke-static {p2}, Lr9/a;->n(Ljava/net/Socket;)Lja/b;

    move-result-object v4

    invoke-static {v4}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object v4

    invoke-virtual {p0, p1, p3, p4}, Lh8/n;->i(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lv6/d;

    move-result-object p0

    iget-object p1, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast p1, Lk8/a;

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p4, "CONNECT %s:%d HTTP/1.1"

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Object;

    iget-object v7, p1, Lk8/a;->a:Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    iget p1, p1, Lk8/a;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v2

    invoke-static {p3, p4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v4, v0}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    iget-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast p1, Lk6/w4;

    invoke-virtual {p1}, Lk6/w4;->i()I

    move-result p1

    move p3, v8

    :goto_1
    if-ge p3, p1, :cond_5

    iget-object p4, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast p4, Lk6/w4;

    mul-int/lit8 v6, p3, 0x2

    if-ltz v6, :cond_2

    iget-object p4, p4, Lk6/w4;->b:Ljava/lang/Object;

    move-object v7, p4

    check-cast v7, [Ljava/lang/String;

    array-length v7, v7

    if-lt v6, v7, :cond_1

    goto :goto_2

    :cond_1
    check-cast p4, [Ljava/lang/String;

    aget-object p4, p4, v6

    goto :goto_3

    :cond_2
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_2
    move-object p4, v1

    :goto_3
    invoke-virtual {v4, p4}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    const-string p4, ": "

    invoke-virtual {v4, p4}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    iget-object p4, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast p4, Lk6/w4;

    add-int/lit8 v6, v6, 0x1

    if-ltz v6, :cond_4

    iget-object p4, p4, Lk6/w4;->b:Ljava/lang/Object;

    move-object v7, p4

    check-cast v7, [Ljava/lang/String;

    array-length v7, v7

    if-lt v6, v7, :cond_3

    goto :goto_4

    :cond_3
    check-cast p4, [Ljava/lang/String;

    aget-object p4, p4, v6

    goto :goto_5

    :cond_4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_4
    move-object p4, v1

    :goto_5
    invoke-interface {v4, p4}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    invoke-interface {v4, v0}, Lja/h;->V(Ljava/lang/String;)Lja/h;

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :catch_1
    move-exception p0

    move-object v1, p2

    goto/16 :goto_8

    :cond_5
    invoke-virtual {v4, v0}, Lja/z;->V(Ljava/lang/String;)Lja/h;

    invoke-virtual {v4}, Lja/z;->flush()V

    invoke-static {v3}, Lh8/n;->q(Lja/c;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lh0/i;->b(Ljava/lang/String;)Lh0/i;

    move-result-object p0

    :goto_6
    invoke-static {v3}, Lh8/n;->q(Lja/c;)Ljava/lang/String;

    move-result-object p1

    const-string p3, ""

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_6

    :cond_6
    iget p1, p0, Lh0/i;->b:I

    const/16 p3, 0xc8

    if-lt p1, p3, :cond_7

    const/16 p3, 0x12c

    if-ge p1, p3, :cond_7

    invoke-virtual {p2, v8}, Ljava/net/Socket;->setSoTimeout(I)V

    return-object p2

    :cond_7
    new-instance p1, Lja/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-virtual {p2}, Ljava/net/Socket;->shutdownOutput()V

    const-wide/16 p3, 0x400

    invoke-virtual {v3, p1, p3, p4}, Lja/c;->I(Lja/g;J)J
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_7

    :catch_2
    move-exception p3

    :try_start_4
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to read body: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lja/g;->n0(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :goto_7
    :try_start_5
    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :try_start_6
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p4, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lh0/i;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v8

    iget-object p0, p0, Lh0/i;->d:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    aput-object p0, v0, v2

    invoke-virtual {p1}, Lja/g;->Q()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v5

    invoke-static {p3, p4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Le8/c2;->m:Le8/c2;

    invoke-virtual {p1, p0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p0

    new-instance p1, Le8/d2;

    invoke-direct {p1, p0}, Le8/d2;-><init>(Le8/c2;)V

    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :goto_8
    if-eqz v1, :cond_8

    invoke-static {v1}, Lg8/s1;->b(Ljava/io/Closeable;)V

    :cond_8
    sget-object p1, Le8/c2;->m:Le8/c2;

    const-string p2, "Failed trying to connect with proxy"

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    invoke-virtual {p1, p0}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p0

    new-instance p1, Le8/d2;

    invoke-direct {p1, p0}, Le8/d2;-><init>(Le8/c2;)V

    throw p1
.end method

.method public static q(Lja/c;)Ljava/lang/String;
    .locals 7

    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lja/c;->I(Lja/g;J)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lja/g;->b:J

    sub-long/2addr v3, v1

    invoke-virtual {v0, v3, v4}, Lja/g;->f(J)B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, v1, v2}, Lja/g;->K(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\\n not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, v0, Lja/g;->b:J

    invoke-virtual {v0, v2, v3}, Lja/g;->i(J)Lja/j;

    move-result-object v0

    invoke-virtual {v0}, Lja/j;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static w(Lj8/a;)Le8/c2;
    .locals 3

    sget-object v0, Lh8/n;->S:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/c2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Le8/c2;->g:Le8/c2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown http2 error code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Lj8/a;->a:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final a(Lg8/o2;)V
    .locals 9

    sget-object v0, Lu6/a;->a:Lu6/a;

    iget-object v1, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lh8/n;->i:Lh8/e;

    if-eqz v2, :cond_5

    iget-boolean v2, p0, Lh8/n;->y:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lh8/n;->m()Le8/d2;

    move-result-object v2

    sget-object v4, Lg8/y1;->g:Ljava/util/logging/Logger;

    new-instance v4, Lg8/x1;

    invoke-direct {v4, p1, v2, v3}, Lg8/x1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0, v4}, Lu6/a;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v2, "Failed to execute PingCallback"

    sget-object v3, Lg8/y1;->g:Ljava/util/logging/Logger;

    invoke-virtual {v3, v0, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    monitor-exit v1

    return-void

    :catchall_1
    move-exception p1

    goto/16 :goto_5

    :cond_0
    iget-object v2, p0, Lh8/n;->x:Lg8/y1;

    if-eqz v2, :cond_1

    const-wide/16 v4, 0x0

    move-object v6, v2

    move v2, v3

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lh8/n;->d:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    iget-object v2, p0, Lh8/n;->e:Lq6/m;

    invoke-interface {v2}, Lq6/m;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq6/l;

    invoke-virtual {v2}, Lq6/l;->b()V

    new-instance v6, Lg8/y1;

    invoke-direct {v6, v4, v5, v2}, Lg8/y1;-><init>(JLq6/l;)V

    iput-object v6, p0, Lh8/n;->x:Lg8/y1;

    iget-object v2, p0, Lh8/n;->O:Lg8/e6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_2

    iget-object v2, p0, Lh8/n;->i:Lh8/e;

    const/16 v7, 0x20

    ushr-long v7, v4, v7

    long-to-int v7, v7

    long-to-int v4, v4

    invoke-virtual {v2, v7, v3, v4}, Lh8/e;->X(IZI)V

    :cond_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-enter v6

    :try_start_3
    iget-boolean v1, v6, Lg8/y1;->d:Z

    if-nez v1, :cond_3

    iget-object v1, v6, Lg8/y1;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v6

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_4

    :cond_3
    iget-object v1, v6, Lg8/y1;->e:Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    new-instance v2, Lg8/x1;

    invoke-direct {v2, p1, v1, v3}, Lg8/x1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    goto :goto_2

    :cond_4
    iget-wide v1, v6, Lg8/y1;->f:J

    new-instance v4, Lg8/w1;

    invoke-direct {v4, p1, v1, v2, v3}, Lg8/w1;-><init>(Ljava/lang/Object;JI)V

    move-object v2, v4

    :goto_2
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v0, v2}, Lu6/a;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v1, "Failed to execute PingCallback"

    sget-object v2, Lg8/y1;->g:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-void

    :goto_4
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :cond_5
    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :goto_5
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public final b()Le8/q0;
    .locals 1

    iget-object v0, p0, Lh8/n;->l:Le8/q0;

    return-object v0
.end method

.method public final c(Le8/c2;)V
    .locals 7

    invoke-virtual {p0, p1}, Lh8/n;->f(Le8/c2;)V

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh8/l;

    iget-object v3, v3, Lh8/l;->n:Lh8/k;

    new-instance v4, Le8/l1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {v3, v4, p1, v5}, Lg8/a;->h(Le8/l1;Le8/c2;Z)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/l;

    invoke-virtual {p0, v2}, Lh8/n;->o(Lh8/l;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/l;

    iget-object v3, v2, Lh8/l;->n:Lh8/k;

    sget-object v4, Lg8/i0;->d:Lg8/i0;

    new-instance v5, Le8/l1;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x1

    invoke-virtual {v3, p1, v4, v6, v5}, Lg8/a;->i(Le8/c2;Lg8/i0;ZLe8/l1;)V

    invoke-virtual {p0, v2}, Lh8/n;->o(Lh8/l;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    invoke-virtual {p0}, Lh8/n;->v()V

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d(Le8/p1;Le8/l1;Le8/h;[Le8/p;)Lg8/h0;
    .locals 18

    move-object/from16 v15, p0

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    const-string v2, "method"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "headers"

    invoke-static {v0, v2}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v15, Lh8/n;->u:Le8/c;

    new-instance v12, Lg8/y5;

    invoke-direct {v12, v1}, Lg8/y5;-><init>([Lo7/d0;)V

    array-length v4, v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v1, v5

    invoke-virtual {v6, v2, v0}, Le8/p;->s0(Le8/c;Le8/l1;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v14, v15, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    new-instance v16, Lh8/l;

    iget-object v4, v15, Lh8/n;->i:Lh8/e;

    iget-object v6, v15, Lh8/n;->j:Ly5/o;

    iget-object v7, v15, Lh8/n;->k:Ljava/lang/Object;

    iget v8, v15, Lh8/n;->r:I

    iget v9, v15, Lh8/n;->f:I

    iget-object v10, v15, Lh8/n;->b:Ljava/lang/String;

    iget-object v11, v15, Lh8/n;->c:Ljava/lang/String;

    iget-object v13, v15, Lh8/n;->O:Lg8/e6;

    iget-boolean v5, v15, Lh8/n;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v0, v5

    move-object/from16 v5, p0

    move-object/from16 v17, v14

    move-object/from16 v14, p3

    move v15, v0

    :try_start_1
    invoke-direct/range {v1 .. v15}, Lh8/l;-><init>(Le8/p1;Le8/l1;Lh8/e;Lh8/n;Ly5/o;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lg8/y5;Lg8/e6;Le8/h;Z)V

    monitor-exit v17

    return-object v16

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v17, v14

    :goto_1
    monitor-exit v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final e(Lg8/t3;)Ljava/lang/Runnable;
    .locals 8

    iput-object p1, p0, Lh8/n;->h:Lg8/t3;

    iget-boolean p1, p0, Lh8/n;->H:Z

    if-eqz p1, :cond_1

    new-instance p1, Lg8/q2;

    new-instance v1, Lg8/p2;

    invoke-direct {v1, p0}, Lg8/p2;-><init>(Lg8/o0;)V

    iget-object v2, p0, Lh8/n;->q:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v3, p0, Lh8/n;->I:J

    iget-wide v5, p0, Lh8/n;->J:J

    iget-boolean v7, p0, Lh8/n;->K:Z

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lg8/q2;-><init>(Lg8/p2;Ljava/util/concurrent/ScheduledExecutorService;JJZ)V

    iput-object p1, p0, Lh8/n;->G:Lg8/q2;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p1, Lg8/q2;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg8/q2;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    goto :goto_2

    :goto_1
    monitor-exit p1

    throw v0

    :cond_1
    :goto_2
    iget-object p1, p0, Lh8/n;->p:Lg8/r5;

    new-instance v0, Lh8/c;

    invoke-direct {v0, p1, p0}, Lh8/c;-><init>(Lg8/r5;Lh8/d;)V

    iget-object p1, p0, Lh8/n;->g:Lj8/m;

    invoke-static {v0}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object v1

    check-cast p1, Lj8/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lj8/j;

    invoke-direct {p1, v1}, Lj8/j;-><init>(Lja/z;)V

    new-instance v1, Lh8/b;

    invoke-direct {v1, v0, p1}, Lh8/b;-><init>(Lh8/c;Lj8/j;)V

    iget-object p1, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    new-instance v2, Lh8/e;

    invoke-direct {v2, p0, v1}, Lh8/e;-><init>(Lh8/d;Lh8/b;)V

    iput-object v2, p0, Lh8/n;->i:Lh8/e;

    new-instance v1, Ly5/o;

    invoke-direct {v1, p0, v2}, Ly5/o;-><init>(Lh8/v;Lh8/e;)V

    iput-object v1, p0, Lh8/n;->j:Ly5/o;

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iget-object v1, p0, Lh8/n;->p:Lg8/r5;

    new-instance v2, Ly2/a;

    const/16 v3, 0x16

    invoke-direct {v2, p0, p1, v0, v3}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lg8/r5;->execute(Ljava/lang/Runnable;)V

    :try_start_2
    invoke-virtual {p0}, Lh8/n;->r()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iget-object p1, p0, Lh8/n;->p:Lg8/r5;

    new-instance v0, Lh/a;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Lh/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lg8/r5;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return-object p1

    :catchall_1
    move-exception v0

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method

.method public final f(Le8/c2;)V
    .locals 2

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->v:Le8/c2;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lh8/n;->v:Le8/c2;

    iget-object v1, p0, Lh8/n;->h:Lg8/t3;

    invoke-interface {v1, p1}, Lg8/t3;->d(Le8/c2;)V

    invoke-virtual {p0}, Lh8/n;->v()V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lv6/d;
    .locals 19

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    new-instance v2, Lh0/i;

    invoke-direct {v2}, Lh0/i;-><init>()V

    const-string v3, "https"

    iput-object v3, v2, Lh0/i;->c:Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "host == null"

    if-eqz v3, :cond_31

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, -0x1

    if-ge v7, v5, :cond_3

    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x25

    if-eq v9, v10, :cond_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    new-instance v9, Lja/g;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v9, v6, v7, v3}, Lja/g;->m0(IILjava/lang/String;)V

    :goto_1
    if-ge v7, v5, :cond_2

    invoke-virtual {v3, v7}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    if-ne v11, v10, :cond_1

    add-int/lit8 v12, v7, 0x2

    if-ge v12, v5, :cond_1

    add-int/lit8 v13, v7, 0x1

    invoke-virtual {v3, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-static {v13}, Lk8/a;->a(C)I

    move-result v13

    invoke-virtual {v3, v12}, Ljava/lang/String;->charAt(I)C

    move-result v14

    invoke-static {v14}, Lk8/a;->a(C)I

    move-result v14

    if-eq v13, v8, :cond_1

    if-eq v14, v8, :cond_1

    shl-int/lit8 v7, v13, 0x4

    add-int/2addr v7, v14

    invoke-virtual {v9, v7}, Lja/g;->h0(I)V

    move v7, v12

    goto :goto_2

    :cond_1
    invoke-virtual {v9, v11}, Lja/g;->o0(I)V

    :goto_2
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    move-result v11

    add-int/2addr v7, v11

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lja/g;->Q()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_3
    invoke-virtual {v3, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    :goto_3
    const-string v7, "["

    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    const-string v9, ":"

    if-eqz v7, :cond_26

    const-string v7, "]"

    invoke-virtual {v5, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_26

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v11, 0x1

    sub-int/2addr v7, v11

    const/16 v12, 0x10

    new-array v13, v12, [B

    move v15, v6

    move v10, v8

    move/from16 v16, v10

    move v14, v11

    :goto_4
    if-ge v14, v7, :cond_19

    if-ne v15, v12, :cond_5

    :cond_4
    :goto_5
    const/4 v5, 0x0

    goto/16 :goto_10

    :cond_5
    add-int/lit8 v11, v14, 0x2

    const/4 v12, 0x2

    if-gt v11, v7, :cond_8

    const-string v8, "::"

    invoke-virtual {v5, v14, v8, v6, v12}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v8

    if-eqz v8, :cond_8

    const/4 v8, -0x1

    if-eq v10, v8, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v15, v15, 0x2

    if-ne v11, v7, :cond_7

    move v10, v15

    :goto_6
    const/16 v5, 0x10

    goto/16 :goto_f

    :cond_7
    move v14, v11

    move v10, v15

    :goto_7
    const/4 v8, 0x1

    goto/16 :goto_c

    :cond_8
    if-eqz v15, :cond_15

    const/4 v8, 0x1

    invoke-virtual {v5, v14, v9, v6, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_9

    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_c

    :cond_9
    const-string v11, "."

    invoke-virtual {v5, v14, v11, v6, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v8

    if-eqz v8, :cond_4

    add-int/lit8 v8, v15, -0x2

    move v12, v8

    move/from16 v11, v16

    :goto_8
    if-ge v11, v7, :cond_13

    const/16 v14, 0x10

    if-ne v12, v14, :cond_a

    goto :goto_b

    :cond_a
    if-eq v12, v8, :cond_c

    invoke-virtual {v5, v11}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v6, 0x2e

    if-eq v14, v6, :cond_b

    goto :goto_b

    :cond_b
    add-int/lit8 v11, v11, 0x1

    :cond_c
    move v6, v11

    const/4 v14, 0x0

    :goto_9
    move/from16 v17, v8

    if-ge v6, v7, :cond_10

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    move/from16 v18, v10

    const/16 v10, 0x30

    if-lt v8, v10, :cond_11

    const/16 v10, 0x39

    if-le v8, v10, :cond_d

    goto :goto_a

    :cond_d
    if-nez v14, :cond_e

    if-eq v11, v6, :cond_e

    goto :goto_b

    :cond_e
    mul-int/lit8 v14, v14, 0xa

    add-int/2addr v14, v8

    const/16 v8, 0x30

    sub-int/2addr v14, v8

    const/16 v8, 0xff

    if-le v14, v8, :cond_f

    goto :goto_b

    :cond_f
    add-int/lit8 v6, v6, 0x1

    move/from16 v8, v17

    move/from16 v10, v18

    goto :goto_9

    :cond_10
    move/from16 v18, v10

    :cond_11
    :goto_a
    sub-int v8, v6, v11

    if-nez v8, :cond_12

    goto :goto_b

    :cond_12
    add-int/lit8 v8, v12, 0x1

    int-to-byte v10, v14

    aput-byte v10, v13, v12

    move v11, v6

    move v12, v8

    move/from16 v8, v17

    move/from16 v10, v18

    const/4 v6, 0x0

    goto :goto_8

    :cond_13
    move/from16 v18, v10

    add-int/lit8 v5, v15, 0x2

    if-eq v12, v5, :cond_14

    :goto_b
    goto/16 :goto_5

    :cond_14
    add-int/lit8 v15, v15, 0x2

    move/from16 v10, v18

    goto/16 :goto_6

    :cond_15
    move/from16 v18, v10

    goto/16 :goto_7

    :goto_c
    move v6, v14

    const/4 v11, 0x0

    :goto_d
    if-ge v6, v7, :cond_17

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v17

    invoke-static/range {v17 .. v17}, Lk8/a;->a(C)I

    move-result v8

    const/4 v12, -0x1

    if-ne v8, v12, :cond_16

    goto :goto_e

    :cond_16
    shl-int/lit8 v11, v11, 0x4

    add-int/2addr v11, v8

    add-int/lit8 v6, v6, 0x1

    const/4 v8, 0x1

    const/4 v12, 0x2

    goto :goto_d

    :cond_17
    :goto_e
    sub-int v8, v6, v14

    if-eqz v8, :cond_4

    const/4 v12, 0x4

    if-le v8, v12, :cond_18

    goto/16 :goto_5

    :cond_18
    add-int/lit8 v8, v15, 0x1

    ushr-int/lit8 v12, v11, 0x8

    move/from16 v18, v6

    const/16 v6, 0xff

    and-int/2addr v6, v12

    int-to-byte v6, v6

    aput-byte v6, v13, v15

    const/4 v6, 0x2

    add-int/2addr v15, v6

    and-int/lit16 v6, v11, 0xff

    int-to-byte v6, v6

    aput-byte v6, v13, v8

    move/from16 v16, v14

    move/from16 v14, v18

    const/4 v6, 0x0

    const/4 v8, -0x1

    const/16 v12, 0x10

    goto/16 :goto_4

    :cond_19
    move/from16 v18, v10

    move v5, v12

    :goto_f
    if-eq v15, v5, :cond_1b

    const/4 v6, -0x1

    if-ne v10, v6, :cond_1a

    goto/16 :goto_5

    :cond_1a
    sub-int v6, v15, v10

    rsub-int/lit8 v7, v6, 0x10

    invoke-static {v13, v10, v13, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    rsub-int/lit8 v12, v15, 0x10

    add-int/2addr v12, v10

    const/4 v5, 0x0

    invoke-static {v13, v10, v12, v5}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_1b
    :try_start_0
    invoke-static {v13}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v5
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_10
    if-nez v5, :cond_1d

    :catch_0
    :cond_1c
    :goto_11
    const/4 v10, 0x0

    goto/16 :goto_16

    :cond_1d
    invoke-virtual {v5}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v5

    array-length v6, v5

    const/16 v7, 0x10

    if-ne v6, v7, :cond_25

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, -0x1

    :goto_12
    array-length v11, v5

    if-ge v6, v11, :cond_20

    move v11, v6

    :goto_13
    if-ge v11, v7, :cond_1e

    aget-byte v7, v5, v11

    if-nez v7, :cond_1e

    add-int/lit8 v7, v11, 0x1

    aget-byte v7, v5, v7

    if-nez v7, :cond_1e

    add-int/lit8 v11, v11, 0x2

    const/16 v7, 0x10

    goto :goto_13

    :cond_1e
    sub-int v7, v11, v6

    if-le v7, v8, :cond_1f

    move v10, v6

    move v8, v7

    :cond_1f
    add-int/lit8 v6, v11, 0x2

    const/16 v7, 0x10

    goto :goto_12

    :cond_20
    new-instance v6, Lja/g;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    :cond_21
    :goto_14
    array-length v11, v5

    if-ge v7, v11, :cond_24

    const/16 v11, 0x3a

    if-ne v7, v10, :cond_22

    invoke-virtual {v6, v11}, Lja/g;->h0(I)V

    add-int/2addr v7, v8

    const/16 v12, 0x10

    if-ne v7, v12, :cond_21

    invoke-virtual {v6, v11}, Lja/g;->h0(I)V

    goto :goto_14

    :cond_22
    const/16 v12, 0x10

    if-lez v7, :cond_23

    invoke-virtual {v6, v11}, Lja/g;->h0(I)V

    :cond_23
    aget-byte v11, v5, v7

    const/16 v13, 0xff

    and-int/2addr v11, v13

    shl-int/lit8 v11, v11, 0x8

    add-int/lit8 v14, v7, 0x1

    aget-byte v14, v5, v14

    and-int/2addr v14, v13

    or-int/2addr v11, v14

    int-to-long v14, v11

    invoke-virtual {v6, v14, v15}, Lja/g;->j0(J)V

    add-int/lit8 v7, v7, 0x2

    goto :goto_14

    :cond_24
    invoke-virtual {v6}, Lja/g;->Q()Ljava/lang/String;

    move-result-object v10

    goto :goto_16

    :cond_25
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :catch_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_26
    :try_start_1
    invoke-static {v5}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_27

    goto/16 :goto_11

    :cond_27
    const/4 v6, 0x0

    :goto_15
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_2a

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x1f

    if-le v7, v8, :cond_1c

    const/16 v8, 0x7f

    if-lt v7, v8, :cond_28

    goto/16 :goto_11

    :cond_28
    const-string v8, " #%/:?@[\\]"

    invoke-virtual {v8, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v8, -0x1

    if-eq v7, v8, :cond_29

    goto/16 :goto_11

    :cond_29
    add-int/lit8 v6, v6, 0x1

    goto :goto_15

    :cond_2a
    move-object v10, v5

    :goto_16
    if-eqz v10, :cond_30

    iput-object v10, v2, Lh0/i;->d:Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v3

    if-lez v3, :cond_2f

    const v5, 0xffff

    if-gt v3, v5, :cond_2f

    iput v3, v2, Lh0/i;->b:I

    iget-object v3, v2, Lh0/i;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2e

    iget-object v3, v2, Lh0/i;->d:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2d

    new-instance v3, Lk8/a;

    invoke-direct {v3, v2}, Lk8/a;-><init>(Lh0/i;)V

    new-instance v2, Lv6/d;

    const/16 v4, 0xd

    invoke-direct {v2, v4}, Lv6/d;-><init>(I)V

    iput-object v3, v2, Lv6/d;->b:Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v3, Lk8/a;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lk8/a;->b:I

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Host"

    invoke-virtual {v2, v4, v3}, Lv6/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "User-Agent"

    move-object/from16 v5, p0

    iget-object v4, v5, Lh8/n;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lv6/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_2b

    if-eqz v1, :cond_2b

    const-string v3, "Basic "

    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ISO-8859-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lja/j;->l([B)Lja/j;

    move-result-object v0

    invoke-virtual {v0}, Lja/j;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    const-string v1, "Proxy-Authorization"

    invoke-virtual {v2, v1, v0}, Lv6/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_17

    :catch_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2b
    :goto_17
    iget-object v0, v2, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Lk8/a;

    if-eqz v0, :cond_2c

    new-instance v0, Lv6/d;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lv6/d;-><init>(Lv6/d;I)V

    return-object v0

    :cond_2c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unexpected port: "

    invoke-static {v1, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_30
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unexpected host: "

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    move-object/from16 v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V
    .locals 3

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh8/l;

    if-eqz v1, :cond_3

    if-eqz p5, :cond_0

    iget-object p5, p0, Lh8/n;->i:Lh8/e;

    sget-object v2, Lj8/a;->p:Lj8/a;

    invoke-virtual {p5, p1, v2}, Lh8/e;->o(ILj8/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz p2, :cond_2

    iget-object p1, v1, Lh8/l;->n:Lh8/k;

    if-eqz p6, :cond_1

    goto :goto_1

    :cond_1
    new-instance p6, Le8/l1;

    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    :goto_1
    invoke-virtual {p1, p2, p3, p4, p6}, Lg8/a;->i(Le8/c2;Lg8/i0;ZLe8/l1;)V

    :cond_2
    invoke-virtual {p0}, Lh8/n;->t()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lh8/n;->v()V

    invoke-virtual {p0, v1}, Lh8/n;->o(Lh8/l;)V

    :cond_3
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final k()[Li3/v;
    .locals 7

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    new-array v1, v1, [Li3/v;

    iget-object v2, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/l;

    add-int/lit8 v5, v3, 0x1

    iget-object v4, v4, Lh8/l;->n:Lh8/k;

    iget-object v6, v4, Lh8/k;->x:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v4, v4, Lh8/k;->K:Li3/v;

    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    aput-object v4, v1, v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v5

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v1

    :cond_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public final l()I
    .locals 3

    iget-object v0, p0, Lh8/n;->b:Ljava/lang/String;

    invoke-static {v0}, Lg8/s1;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lh8/n;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method public final m()Le8/d2;
    .locals 3

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->v:Le8/c2;

    if-eqz v1, :cond_0

    new-instance v2, Le8/d2;

    invoke-direct {v2, v1}, Le8/d2;-><init>(Le8/c2;)V

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    sget-object v1, Le8/c2;->m:Le8/c2;

    const-string v2, "Connection closed"

    invoke-virtual {v1, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    new-instance v2, Le8/d2;

    invoke-direct {v2, v1}, Le8/d2;-><init>(Le8/c2;)V

    monitor-exit v0

    return-object v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final n(I)Z
    .locals 2

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lh8/n;->m:I

    if-ge p1, v1, :cond_0

    const/4 v1, 0x1

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final o(Lh8/l;)V
    .locals 4

    iget-boolean v0, p0, Lh8/n;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iput-boolean v1, p0, Lh8/n;->z:Z

    iget-object v0, p0, Lh8/n;->G:Lg8/q2;

    if-eqz v0, :cond_4

    monitor-enter v0

    :try_start_0
    iget-boolean v2, v0, Lg8/q2;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    goto :goto_2

    :cond_0
    :try_start_1
    iget v2, v0, Lg8/q2;->e:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    :cond_1
    const/4 v2, 0x1

    iput v2, v0, Lg8/q2;->e:I

    :cond_2
    iget v2, v0, Lg8/q2;->e:I

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    const/4 v2, 0x5

    iput v2, v0, Lg8/q2;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw p1

    :cond_4
    :goto_2
    iget-boolean v0, p1, Lg8/b;->e:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lh8/n;->P:Lg8/z1;

    invoke-virtual {v0, p1, v1}, Lf4/y;->f(Ljava/lang/Object;Z)V

    :cond_5
    return-void
.end method

.method public final p(Ljava/lang/Exception;)V
    .locals 2

    sget-object v0, Le8/c2;->m:Le8/c2;

    invoke-virtual {v0, p1}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    sget-object v0, Lj8/a;->d:Lj8/a;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lh8/n;->s(ILj8/a;Le8/c2;)V

    return-void
.end method

.method public final r()V
    .locals 5

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->i:Lh8/e;

    invoke-virtual {v1}, Lh8/e;->E()V

    new-instance v1, La4/k;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, La4/k;-><init>(I)V

    iget v2, p0, Lh8/n;->f:I

    const/4 v3, 0x7

    invoke-virtual {v1, v3, v2}, La4/k;->b(II)V

    iget-object v2, p0, Lh8/n;->i:Lh8/e;

    invoke-virtual {v2, v1}, Lh8/e;->v(La4/k;)V

    iget v1, p0, Lh8/n;->f:I

    const v2, 0xffff

    if-le v1, v2, :cond_0

    iget-object v3, p0, Lh8/n;->i:Lh8/e;

    sub-int/2addr v1, v2

    int-to-long v1, v1

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v1, v2}, Lh8/e;->N(IJ)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final s(ILj8/a;Le8/c2;)V
    .locals 7

    iget-object v0, p0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lh8/n;->v:Le8/c2;

    if-nez v1, :cond_0

    iput-object p3, p0, Lh8/n;->v:Le8/c2;

    iget-object v1, p0, Lh8/n;->h:Lg8/t3;

    invoke-interface {v1, p3}, Lg8/t3;->d(Le8/c2;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    iget-boolean v3, p0, Lh8/n;->w:Z

    if-nez v3, :cond_1

    iput-boolean v1, p0, Lh8/n;->w:Z

    iget-object v3, p0, Lh8/n;->i:Lh8/e;

    new-array v4, v2, [B

    invoke-virtual {v3, p2, v4}, Lh8/e;->d(Lj8/a;[B)V

    :cond_1
    iget-object p2, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v4, p1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/l;

    iget-object v4, v4, Lh8/l;->n:Lh8/k;

    sget-object v5, Lg8/i0;->b:Lg8/i0;

    new-instance v6, Le8/l1;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, p3, v5, v2, v6}, Lg8/a;->i(Le8/c2;Lg8/i0;ZLe8/l1;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh8/l;

    invoke-virtual {p0, v3}, Lh8/n;->o(Lh8/l;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-interface {p1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh8/l;

    iget-object v2, p2, Lh8/l;->n:Lh8/k;

    sget-object v3, Lg8/i0;->d:Lg8/i0;

    new-instance v4, Le8/l1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, p3, v3, v1, v4}, Lg8/a;->i(Le8/c2;Lg8/i0;ZLe8/l1;)V

    invoke-virtual {p0, p2}, Lh8/n;->o(Lh8/l;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    invoke-virtual {p0}, Lh8/n;->v()V

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final t()Z
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    iget v3, p0, Lh8/n;->D:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/l;

    invoke-virtual {p0, v0}, Lh8/n;->u(Lh8/l;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Lh8/n;->l:Le8/q0;

    iget-wide v1, v1, Le8/q0;->c:J

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Lq6/g;->b(Ljava/lang/String;J)V

    const-string v1, "address"

    iget-object v2, p0, Lh8/n;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lh8/l;)V
    .locals 7

    iget-object v0, p1, Lh8/l;->n:Lh8/k;

    iget v0, v0, Lh8/k;->L:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v4, "StreamId already assigned"

    invoke-static {v4, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lh8/n;->n:Ljava/util/HashMap;

    iget v4, p0, Lh8/n;->m:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lh8/n;->z:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lh8/n;->z:Z

    iget-object v0, p0, Lh8/n;->G:Lg8/q2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg8/q2;->b()V

    :cond_1
    iget-boolean v0, p1, Lg8/b;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh8/n;->P:Lg8/z1;

    invoke-virtual {v0, p1, v1}, Lf4/y;->f(Ljava/lang/Object;Z)V

    :cond_2
    iget-object v0, p1, Lh8/l;->n:Lh8/k;

    iget v4, p0, Lh8/n;->m:I

    iget v5, v0, Lh8/k;->L:I

    if-ne v5, v3, :cond_3

    move v3, v1

    goto :goto_1

    :cond_3
    move v3, v2

    :goto_1
    const-string v5, "the stream has been started with id %s"

    if-eqz v3, :cond_d

    iput v4, v0, Lh8/k;->L:I

    iget-object v3, v0, Lh8/k;->G:Ly5/o;

    new-instance v5, Li3/v;

    iget v6, v3, Ly5/o;->a:I

    invoke-direct {v5, v3, v4, v6, v0}, Li3/v;-><init>(Ly5/o;IILh8/k;)V

    iput-object v5, v0, Lh8/k;->K:Li3/v;

    iget-object v3, v0, Lh8/k;->M:Lh8/l;

    iget-object v3, v3, Lh8/l;->n:Lh8/k;

    iget-object v4, v3, Lg8/a;->j:Lg8/j0;

    if-eqz v4, :cond_c

    iget-object v4, v3, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-boolean v5, v3, Lg8/f;->f:Z

    xor-int/2addr v5, v1

    const-string v6, "Already allocated"

    invoke-static {v6, v5}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-boolean v1, v3, Lg8/f;->f:Z

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v1, v3, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    invoke-virtual {v3}, Lg8/f;->e()Z

    move-result v4

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_4

    iget-object v1, v3, Lg8/a;->j:Lg8/j0;

    invoke-interface {v1}, Lg8/b6;->b()V

    :cond_4
    iget-object v1, v3, Lg8/f;->c:Lg8/e6;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lg8/e6;->a:Lg8/c6;

    check-cast v1, Lg8/k4;

    invoke-virtual {v1}, Lg8/k4;->a()J

    iget-boolean v1, v0, Lh8/k;->I:Z

    if-eqz v1, :cond_7

    iget-object v1, v0, Lh8/k;->F:Lh8/e;

    iget-object v3, v0, Lh8/k;->M:Lh8/l;

    iget-boolean v3, v3, Lh8/l;->q:Z

    iget v4, v0, Lh8/k;->L:I

    iget-object v5, v0, Lh8/k;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v3, v4, v5}, Lh8/e;->G(ZILjava/util/List;)V

    iget-object v1, v0, Lh8/k;->M:Lh8/l;

    iget-object v1, v1, Lh8/l;->l:Lg8/y5;

    iget-object v1, v1, Lg8/y5;->a:[Lo7/d0;

    array-length v3, v1

    move v4, v2

    :goto_2
    if-ge v4, v3, :cond_5

    aget-object v5, v1, v4

    check-cast v5, Le8/p;

    invoke-virtual {v5}, Le8/p;->r0()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    iput-object v1, v0, Lh8/k;->y:Ljava/util/ArrayList;

    iget-object v1, v0, Lh8/k;->z:Lja/g;

    iget-wide v3, v1, Lja/g;->b:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_6

    iget-object v3, v0, Lh8/k;->G:Ly5/o;

    iget-boolean v4, v0, Lh8/k;->A:Z

    iget-object v5, v0, Lh8/k;->K:Li3/v;

    iget-boolean v6, v0, Lh8/k;->B:Z

    invoke-virtual {v3, v4, v5, v1, v6}, Ly5/o;->a(ZLi3/v;Lja/g;Z)V

    :cond_6
    iput-boolean v2, v0, Lh8/k;->I:Z

    :cond_7
    iget-object v0, p1, Lh8/l;->j:Le8/p1;

    iget-object v0, v0, Le8/p1;->a:Le8/o1;

    sget-object v1, Le8/o1;->a:Le8/o1;

    if-eq v0, v1, :cond_8

    sget-object v1, Le8/o1;->b:Le8/o1;

    if-ne v0, v1, :cond_9

    :cond_8
    iget-boolean p1, p1, Lh8/l;->q:Z

    if-eqz p1, :cond_a

    :cond_9
    iget-object p1, p0, Lh8/n;->i:Lh8/e;

    invoke-virtual {p1}, Lh8/e;->flush()V

    :cond_a
    iget p1, p0, Lh8/n;->m:I

    const v0, 0x7ffffffd

    if-lt p1, v0, :cond_b

    const p1, 0x7fffffff

    iput p1, p0, Lh8/n;->m:I

    sget-object v0, Lj8/a;->b:Lj8/a;

    sget-object v1, Le8/c2;->m:Le8/c2;

    const-string v2, "Stream ids exhausted"

    invoke-virtual {v1, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lh8/n;->s(ILj8/a;Le8/c2;)V

    goto :goto_3

    :cond_b
    add-int/lit8 p1, p1, 0x2

    iput p1, p0, Lh8/n;->m:I

    :goto_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0}, Lf6/a;->c0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v()V
    .locals 9

    iget-object v0, p0, Lh8/n;->v:Le8/c2;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lh8/n;->n:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lh8/n;->E:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-boolean v0, p0, Lh8/n;->y:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh8/n;->y:Z

    iget-object v1, p0, Lh8/n;->G:Lg8/q2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    monitor-enter v1

    :try_start_0
    iget v4, v1, Lg8/q2;->e:I

    const/4 v5, 0x6

    if-eq v4, v5, :cond_3

    iput v5, v1, Lg8/q2;->e:I

    iget-object v4, v1, Lg8/q2;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v4, :cond_2

    invoke-interface {v4, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v4, v1, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v4, :cond_3

    invoke-interface {v4, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v3, v1, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1

    throw v0

    :cond_4
    :goto_2
    iget-object v1, p0, Lh8/n;->x:Lg8/y1;

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lh8/n;->m()Le8/d2;

    move-result-object v4

    monitor-enter v1

    :try_start_1
    iget-boolean v5, v1, Lg8/y1;->d:Z

    if-eqz v5, :cond_5

    monitor-exit v1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_5
    iput-boolean v0, v1, Lg8/y1;->d:Z

    iput-object v4, v1, Lg8/y1;->e:Ljava/lang/Throwable;

    iget-object v5, v1, Lg8/y1;->c:Ljava/util/LinkedHashMap;

    iput-object v3, v1, Lg8/y1;->c:Ljava/util/LinkedHashMap;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg8/o2;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/Executor;

    new-instance v7, Lg8/x1;

    invoke-direct {v7, v6, v4, v2}, Lg8/x1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    :try_start_2
    invoke-interface {v5, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v5

    sget-object v6, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v7, "Failed to execute PingCallback"

    sget-object v8, Lg8/y1;->g:Ljava/util/logging/Logger;

    invoke-virtual {v8, v6, v7, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    :goto_4
    iput-object v3, p0, Lh8/n;->x:Lg8/y1;

    goto :goto_6

    :goto_5
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_7
    :goto_6
    iget-boolean v1, p0, Lh8/n;->w:Z

    if-nez v1, :cond_8

    iput-boolean v0, p0, Lh8/n;->w:Z

    iget-object v0, p0, Lh8/n;->i:Lh8/e;

    sget-object v1, Lj8/a;->b:Lj8/a;

    new-array v2, v2, [B

    invoke-virtual {v0, v1, v2}, Lh8/e;->d(Lj8/a;[B)V

    :cond_8
    iget-object v0, p0, Lh8/n;->i:Lh8/e;

    invoke-virtual {v0}, Lh8/e;->close()V

    :cond_9
    :goto_7
    return-void
.end method
