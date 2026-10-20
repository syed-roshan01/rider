.class public final Lg8/n3;
.super Le8/d1;


# static fields
.field public static final A:Lg8/l1;

.field public static final B:Le8/e0;

.field public static final C:Le8/w;

.field public static final x:Ljava/util/logging/Logger;

.field public static final y:J

.field public static final z:J


# instance fields
.field public final a:Lg8/l1;

.field public final b:Lg8/l1;

.field public final c:Ljava/util/ArrayList;

.field public final d:Le8/u1;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Le8/e0;

.field public final h:Le8/w;

.field public final i:J

.field public final j:I

.field public final k:I

.field public final l:J

.field public final m:J

.field public final n:Z

.field public final o:Le8/n0;

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public final v:Lh8/g;

.field public final w:Lg8/m3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lg8/n3;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lg8/n3;->y:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lg8/n3;->z:J

    sget-object v0, Lg8/s1;->p:Lr7/e;

    new-instance v1, Lg8/l1;

    invoke-direct {v1, v0}, Lg8/l1;-><init>(Lr7/e;)V

    sput-object v1, Lg8/n3;->A:Lg8/l1;

    sget-object v0, Le8/e0;->d:Le8/e0;

    sput-object v0, Lg8/n3;->B:Le8/e0;

    sget-object v0, Le8/w;->b:Le8/w;

    sput-object v0, Lg8/n3;->C:Le8/w;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh8/g;Lk6/w4;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lg8/n3;->A:Lg8/l1;

    iput-object v0, p0, Lg8/n3;->a:Lg8/l1;

    iput-object v0, p0, Lg8/n3;->b:Lg8/l1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/n3;->c:Ljava/util/ArrayList;

    sget-object v0, Le8/v1;->e:Ljava/util/logging/Logger;

    const-class v0, Le8/v1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le8/v1;->f:Le8/v1;

    if-nez v1, :cond_2

    const-class v1, Le8/t1;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-class v3, Lg8/h1;

    sget-boolean v4, Lg8/h1;->x:Z

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_2
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v5, "Unable to find DNS NameResolver"

    sget-object v6, Le8/v1;->e:Ljava/util/logging/Logger;

    invoke-virtual {v6, v4, v5, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    const-class v3, Le8/t1;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    new-instance v4, Lr7/e;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lr7/e;-><init>(Ll/q;)V

    check-cast v2, Ljava/util/List;

    invoke-static {v1, v2, v3, v4}, Lz6/a;->S(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;Lr7/e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Le8/v1;->e:Ljava/util/logging/Logger;

    const-string v3, "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration"

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_1
    new-instance v2, Le8/v1;

    invoke-direct {v2}, Le8/v1;-><init>()V

    sput-object v2, Le8/v1;->f:Le8/v1;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/t1;

    sget-object v3, Le8/v1;->e:Ljava/util/logging/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Service loader found "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    sget-object v3, Le8/v1;->f:Le8/v1;

    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Le8/t1;->P()Z

    move-result v4

    const-string v5, "isAvailable() returned false"

    invoke-static {v5, v4}, Ly3/e;->G(Ljava/lang/String;Z)V

    iget-object v4, v3, Le8/v1;->c:Ljava/util/LinkedHashSet;

    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v3

    goto :goto_2

    :catchall_1
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_1
    sget-object v1, Le8/v1;->f:Le8/v1;

    invoke-virtual {v1}, Le8/v1;->a()V

    :cond_2
    sget-object v1, Le8/v1;->f:Le8/v1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    iget-object v0, v1, Le8/v1;->a:Le8/u1;

    iput-object v0, p0, Lg8/n3;->d:Le8/u1;

    const-string v0, "pick_first"

    iput-object v0, p0, Lg8/n3;->f:Ljava/lang/String;

    sget-object v0, Lg8/n3;->B:Le8/e0;

    iput-object v0, p0, Lg8/n3;->g:Le8/e0;

    sget-object v0, Lg8/n3;->C:Le8/w;

    iput-object v0, p0, Lg8/n3;->h:Le8/w;

    sget-wide v0, Lg8/n3;->y:J

    iput-wide v0, p0, Lg8/n3;->i:J

    const/4 v0, 0x5

    iput v0, p0, Lg8/n3;->j:I

    iput v0, p0, Lg8/n3;->k:I

    const-wide/32 v0, 0x1000000

    iput-wide v0, p0, Lg8/n3;->l:J

    const-wide/32 v0, 0x100000

    iput-wide v0, p0, Lg8/n3;->m:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/n3;->n:Z

    sget-object v1, Le8/n0;->e:Le8/n0;

    iput-object v1, p0, Lg8/n3;->o:Le8/n0;

    iput-boolean v0, p0, Lg8/n3;->p:Z

    iput-boolean v0, p0, Lg8/n3;->q:Z

    iput-boolean v0, p0, Lg8/n3;->r:Z

    iput-boolean v0, p0, Lg8/n3;->s:Z

    iput-boolean v0, p0, Lg8/n3;->t:Z

    iput-boolean v0, p0, Lg8/n3;->u:Z

    const-string v0, "target"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/n3;->e:Ljava/lang/String;

    iput-object p2, p0, Lg8/n3;->v:Lh8/g;

    iput-object p3, p0, Lg8/n3;->w:Lg8/m3;

    return-void

    :goto_3
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public final a()Le8/c1;
    .locals 24

    move-object/from16 v8, p0

    new-instance v9, Lg8/p3;

    new-instance v10, Lg8/l3;

    iget-object v0, v8, Lg8/n3;->v:Lh8/g;

    iget-object v0, v0, Lh8/g;->a:Lh8/i;

    iget-wide v1, v0, Lh8/i;->h:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v1, v3

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move/from16 v16, v3

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    :goto_0
    new-instance v4, Lh8/h;

    iget-object v12, v0, Lh8/i;->c:Lg8/l1;

    iget-object v13, v0, Lh8/i;->d:Lg8/l1;

    iget v1, v0, Lh8/i;->g:I

    invoke-static {v1}, Lt/k;->e(I)I

    move-result v1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    move-object v14, v5

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    iget v0, v0, Lh8/i;->g:I

    invoke-static {v0}, La7/a;->G(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Unknown negotiation type: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :try_start_0
    iget-object v1, v0, Lh8/i;->e:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v1, :cond_3

    const-string v1, "Default"

    sget-object v6, Li8/k;->d:Li8/k;

    iget-object v6, v6, Li8/k;->a:Ljava/security/Provider;

    invoke-static {v1, v6}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, v0, Lh8/i;->e:Ljavax/net/ssl/SSLSocketFactory;

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_d

    :cond_3
    :goto_1
    iget-object v1, v0, Lh8/i;->e:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v14, v1

    :goto_2
    iget-object v15, v0, Lh8/i;->f:Li8/b;

    iget-wide v6, v0, Lh8/i;->h:J

    iget-wide v2, v0, Lh8/i;->i:J

    iget v11, v0, Lh8/i;->j:I

    iget v1, v0, Lh8/i;->k:I

    iget-object v0, v0, Lh8/i;->b:Lg8/k4;

    move/from16 v21, v11

    move-object v11, v4

    move-wide/from16 v17, v6

    move-wide/from16 v19, v2

    move/from16 v22, v1

    move-object/from16 v23, v0

    invoke-direct/range {v11 .. v23}, Lh8/h;-><init>(Lg8/l1;Lg8/l1;Ljavax/net/ssl/SSLSocketFactory;Li8/b;ZJJIILg8/k4;)V

    new-instance v6, Lr7/e;

    const/16 v0, 0x14

    const/4 v1, 0x0

    invoke-direct {v6, v0, v1}, Lr7/e;-><init>(II)V

    sget-object v0, Lg8/s1;->p:Lr7/e;

    new-instance v7, Lg8/l1;

    invoke-direct {v7, v0}, Lg8/l1;-><init>(Lr7/e;)V

    sget-object v11, Lg8/s1;->r:Lx9/v;

    new-instance v12, Ljava/util/ArrayList;

    iget-object v0, v8, Lg8/n3;->c:Ljava/util/ArrayList;

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-class v0, Le8/j0;

    monitor-enter v0

    monitor-exit v0

    iget-boolean v0, v8, Lg8/n3;->q:Z

    if-eqz v0, :cond_4

    :try_start_1
    const-string v0, "io.grpc.census.InternalCensusStatsAccessor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getClientInterceptor"

    const/4 v3, 0x4

    new-array v13, v3, [Ljava/lang/Class;

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v14, v13, v1

    const/4 v15, 0x1

    aput-object v14, v13, v15

    const/4 v15, 0x2

    aput-object v14, v13, v15

    const/16 v16, 0x3

    aput-object v14, v13, v16

    invoke-virtual {v0, v2, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    iget-boolean v3, v8, Lg8/n3;->r:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v1, 0x0

    aput-object v3, v2, v1

    iget-boolean v3, v8, Lg8/n3;->s:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v13, 0x1

    aput-object v3, v2, v13

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v3, v2, v15

    iget-boolean v3, v8, Lg8/n3;->t:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v16

    invoke-virtual {v0, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_5

    :catch_4
    move-exception v0

    goto :goto_6

    :goto_3
    sget-object v2, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v13, "Unable to apply census stats"

    invoke-virtual {v2, v3, v13, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_4
    sget-object v2, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v13, "Unable to apply census stats"

    invoke-virtual {v2, v3, v13, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_5
    sget-object v2, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v13, "Unable to apply census stats"

    invoke-virtual {v2, v3, v13, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_6
    sget-object v2, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v13, "Unable to apply census stats"

    invoke-virtual {v2, v3, v13, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_7
    iget-boolean v0, v8, Lg8/n3;->u:Z

    if-eqz v0, :cond_5

    :try_start_2
    const-string v0, "io.grpc.census.InternalCensusTracingAccessor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getClientInterceptor"

    const/4 v1, 0x0

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_5

    goto :goto_c

    :catch_5
    move-exception v0

    goto :goto_8

    :catch_6
    move-exception v0

    goto :goto_9

    :catch_7
    move-exception v0

    goto :goto_a

    :catch_8
    move-exception v0

    goto :goto_b

    :goto_8
    sget-object v1, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Unable to apply census stats"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :goto_9
    sget-object v1, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Unable to apply census stats"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :goto_a
    sget-object v1, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Unable to apply census stats"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :goto_b
    sget-object v1, Lg8/n3;->x:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Unable to apply census stats"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_c
    move-object v1, v10

    move-object/from16 v2, p0

    move-object v3, v4

    move-object v4, v6

    move-object v5, v7

    move-object v6, v11

    move-object v7, v12

    invoke-direct/range {v1 .. v7}, Lg8/l3;-><init>(Lg8/n3;Lh8/h;Lr7/e;Lg8/l1;Lx9/v;Ljava/util/ArrayList;)V

    invoke-direct {v9, v10}, Lg8/p3;-><init>(Lg8/l3;)V

    return-object v9

    :goto_d
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "TLS Provider failure"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
