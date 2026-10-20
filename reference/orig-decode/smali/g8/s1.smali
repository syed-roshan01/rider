.class public abstract Lg8/s1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Ljava/util/Set;

.field public static final c:Le8/g1;

.field public static final d:Le8/g1;

.field public static final e:Le8/j1;

.field public static final f:Le8/g1;

.field public static final g:Le8/j1;

.field public static final h:Le8/g1;

.field public static final i:Le8/g1;

.field public static final j:Le8/g1;

.field public static final k:Le8/g1;

.field public static final l:J

.field public static final m:Lg8/l4;

.field public static final n:Lv6/d;

.field public static final o:Lg8/q1;

.field public static final p:Lr7/e;

.field public static final q:Lr7/e;

.field public static final r:Lx9/v;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-class v0, Lg8/s1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/s1;->a:Ljava/util/logging/Logger;

    sget-object v0, Le8/z1;->c:Le8/z1;

    sget-object v1, Le8/z1;->f:Le8/z1;

    sget-object v2, Le8/z1;->o:Le8/z1;

    sget-object v3, Le8/z1;->p:Le8/z1;

    sget-object v4, Le8/z1;->s:Le8/z1;

    sget-object v5, Le8/z1;->t:Le8/z1;

    sget-object v6, Le8/z1;->u:Le8/z1;

    sget-object v7, Le8/z1;->y:Le8/z1;

    filled-new-array/range {v1 .. v7}, [Le8/z1;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lg8/s1;->b:Ljava/util/Set;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    new-instance v0, Lx9/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    new-instance v1, Le8/g1;

    const-string v2, "grpc-timeout"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->c:Le8/g1;

    sget-object v0, Le8/l1;->d:Lx9/v;

    new-instance v1, Le8/g1;

    const-string v2, "grpc-encoding"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->d:Le8/g1;

    new-instance v1, Lx9/v;

    invoke-direct {v1}, Lx9/v;-><init>()V

    const-string v2, "grpc-accept-encoding"

    invoke-static {v2, v1}, Le8/r0;->a(Ljava/lang/String;Lx9/v;)Le8/j1;

    move-result-object v1

    sput-object v1, Lg8/s1;->e:Le8/j1;

    new-instance v1, Le8/g1;

    const-string v2, "content-encoding"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->f:Le8/g1;

    new-instance v1, Lx9/v;

    invoke-direct {v1}, Lx9/v;-><init>()V

    const-string v2, "accept-encoding"

    invoke-static {v2, v1}, Le8/r0;->a(Ljava/lang/String;Lx9/v;)Le8/j1;

    move-result-object v1

    sput-object v1, Lg8/s1;->g:Le8/j1;

    new-instance v1, Le8/g1;

    const-string v2, "content-length"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->h:Le8/g1;

    new-instance v1, Le8/g1;

    const-string v2, "content-type"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->i:Le8/g1;

    new-instance v1, Le8/g1;

    const-string v2, "te"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->j:Le8/g1;

    new-instance v1, Le8/g1;

    const-string v2, "user-agent"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lg8/s1;->k:Le8/g1;

    sget-object v0, Lq6/c;->v:Lq6/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    sput-wide v3, Lg8/s1;->l:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    new-instance v0, Lg8/l4;

    invoke-direct {v0}, Lg8/l4;-><init>()V

    sput-object v0, Lg8/s1;->m:Lg8/l4;

    new-instance v0, Lv6/d;

    const/4 v1, 0x0

    const/16 v2, 0x8

    const-string v3, "io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER"

    invoke-direct {v0, v2, v3, v1}, Lv6/d;-><init>(ILjava/lang/Object;Ljava/io/Serializable;)V

    sput-object v0, Lg8/s1;->n:Lv6/d;

    new-instance v0, Lg8/q1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg8/s1;->o:Lg8/q1;

    new-instance v0, Lr7/e;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/s1;->p:Lr7/e;

    new-instance v0, Lr7/e;

    const/16 v1, 0x16

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/s1;->q:Lr7/e;

    new-instance v0, Lx9/v;

    invoke-direct {v0, v2}, Lx9/v;-><init>(I)V

    sput-object v0, Lg8/s1;->r:Lx9/v;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/net/URI;
    .locals 7

    const-string v0, "authority"

    invoke-static {p0, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Ljava/net/URI;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid authority: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static b(Ljava/io/Closeable;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v1, "exception caught in closeQuietly"

    sget-object v2, Lg8/s1;->a:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static c(Le8/h;Le8/l1;IZ)[Le8/p;
    .locals 4

    iget-object v0, p0, Le8/h;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    new-array v2, v2, [Le8/p;

    sget-object v3, Le8/h;->k:Le8/h;

    new-instance v3, Le8/o;

    invoke-direct {v3, p0, p2, p3}, Le8/o;-><init>(Le8/h;IZ)V

    const/4 p0, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-ge p0, p2, :cond_0

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le8/n;

    invoke-virtual {p2, v3, p1}, Le8/n;->a(Le8/o;Le8/l1;)Le8/p;

    move-result-object p2

    aput-object p2, v2, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    sget-object p0, Lg8/s1;->o:Lg8/q1;

    aput-object p0, v2, v1

    return-object v2
.end method

.method public static d(Ljava/net/InetSocketAddress;)Ljava/lang/String;
    .locals 4

    :try_start_0
    const-class v0, Ljava/net/InetSocketAddress;

    const-string v1, "getHostString"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Lu6/c;
    .locals 9

    const/4 v6, 0x0

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v1, p0, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    new-instance v3, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v7, 0x0

    invoke-direct {v3, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    new-instance v7, Lu6/c;

    move-object v0, v7

    move-object v2, p0

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Lu6/c;-><init>(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-object v7
.end method

.method public static f(Le8/v0;Z)Lg8/k0;
    .locals 5

    iget-object v0, p0, Le8/v0;->a:Le8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Le8/x0;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/j2;

    iget-object v2, v0, Lg8/j2;->v:Lg8/u3;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lg8/j2;->k:Le8/h2;

    new-instance v3, Lg8/a2;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lg8/a2;-><init>(Lg8/j2;I)V

    invoke-virtual {v2, v3}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_1
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_3

    iget-object p0, p0, Le8/v0;->b:Le8/n;

    if-nez p0, :cond_2

    return-object v2

    :cond_2
    new-instance p1, Lg8/k1;

    invoke-direct {p1, p0, v2}, Lg8/k1;-><init>(Le8/n;Lg8/u3;)V

    return-object p1

    :cond_3
    iget-object v0, p0, Le8/v0;->c:Le8/c2;

    invoke-virtual {v0}, Le8/c2;->e()Z

    move-result v2

    if-nez v2, :cond_5

    iget-boolean p0, p0, Le8/v0;->d:Z

    if-eqz p0, :cond_4

    new-instance p0, Lg8/k1;

    invoke-static {v0}, Lg8/s1;->h(Le8/c2;)Le8/c2;

    move-result-object p1

    sget-object v0, Lg8/i0;->c:Lg8/i0;

    invoke-direct {p0, p1, v0}, Lg8/k1;-><init>(Le8/c2;Lg8/i0;)V

    return-object p0

    :cond_4
    if-nez p1, :cond_5

    new-instance p0, Lg8/k1;

    invoke-static {v0}, Lg8/s1;->h(Le8/c2;)Le8/c2;

    move-result-object p1

    sget-object v0, Lg8/i0;->a:Lg8/i0;

    invoke-direct {p0, p1, v0}, Lg8/k1;-><init>(Le8/c2;Lg8/i0;)V

    return-object p0

    :cond_5
    return-object v1
.end method

.method public static g(I)Le8/c2;
    .locals 3

    const/16 v0, 0x64

    if-lt p0, v0, :cond_0

    const/16 v0, 0xc8

    if-ge p0, v0, :cond_0

    sget-object v0, Le8/z1;->w:Le8/z1;

    goto :goto_0

    :cond_0
    const/16 v0, 0x190

    if-eq p0, v0, :cond_5

    const/16 v0, 0x191

    if-eq p0, v0, :cond_4

    const/16 v0, 0x193

    if-eq p0, v0, :cond_3

    const/16 v0, 0x194

    if-eq p0, v0, :cond_2

    const/16 v0, 0x1ad

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1af

    if-eq p0, v0, :cond_5

    packed-switch p0, :pswitch_data_0

    sget-object v0, Le8/z1;->e:Le8/z1;

    goto :goto_0

    :cond_1
    :pswitch_0
    sget-object v0, Le8/z1;->x:Le8/z1;

    goto :goto_0

    :cond_2
    sget-object v0, Le8/z1;->v:Le8/z1;

    goto :goto_0

    :cond_3
    sget-object v0, Le8/z1;->q:Le8/z1;

    goto :goto_0

    :cond_4
    sget-object v0, Le8/z1;->z:Le8/z1;

    goto :goto_0

    :cond_5
    sget-object v0, Le8/z1;->w:Le8/z1;

    :goto_0
    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HTTP status code "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1f6
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static h(Le8/c2;)Le8/c2;
    .locals 3

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ly3/e;->H(Z)V

    iget-object v0, p0, Le8/c2;->a:Le8/z1;

    sget-object v1, Lg8/s1;->b:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Le8/c2;->l:Le8/c2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inappropriate status code from control plane: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Le8/c2;->a:Le8/z1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le8/c2;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    iget-object p0, p0, Le8/c2;->c:Ljava/lang/Throwable;

    invoke-virtual {v0, p0}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p0

    :cond_1
    return-object p0
.end method
