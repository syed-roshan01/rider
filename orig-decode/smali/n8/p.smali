.class public final Ln8/p;
.super Le8/z0;


# static fields
.field public static final k:Le8/b;


# instance fields
.field public final c:Ln8/h;

.field public final d:Le8/h2;

.field public final e:Ln8/f;

.field public final f:Lg8/c6;

.field public final g:Ljava/util/concurrent/ScheduledExecutorService;

.field public h:Lv6/d;

.field public i:Ljava/lang/Long;

.field public final j:Le8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le8/b;

    const-string v1, "addressTrackerKey"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ln8/p;->k:Le8/b;

    return-void
.end method

.method public constructor <init>(Le8/j0;)V
    .locals 4

    sget-object v0, Lg8/c6;->a:Lg8/k4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Le8/j0;->i()Le8/i;

    move-result-object v1

    iput-object v1, p0, Ln8/p;->j:Le8/i;

    new-instance v2, Ln8/e;

    invoke-direct {v2, p0, p1}, Ln8/e;-><init>(Ln8/p;Le8/j0;)V

    new-instance v3, Ln8/f;

    invoke-direct {v3, v2}, Ln8/f;-><init>(Ln8/e;)V

    iput-object v3, p0, Ln8/p;->e:Ln8/f;

    new-instance v2, Ln8/h;

    invoke-direct {v2}, Ln8/h;-><init>()V

    iput-object v2, p0, Ln8/p;->c:Ln8/h;

    invoke-virtual {p1}, Le8/j0;->l()Le8/h2;

    move-result-object v2

    const-string v3, "syncContext"

    invoke-static {v2, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Ln8/p;->d:Le8/h2;

    invoke-virtual {p1}, Le8/j0;->j()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    const-string v2, "timeService"

    invoke-static {p1, v2}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ln8/p;->g:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v0, p0, Ln8/p;->f:Lg8/c6;

    const/4 p1, 0x1

    const-string v0, "OutlierDetection lb created."

    invoke-virtual {v1, p1, v0}, Le8/i;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static g(Ljava/util/List;)Z
    .locals 4

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/g0;

    iget-object v2, v2, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    if-le v1, v3, :cond_0

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    return v0
.end method

.method public static h(Ln8/h;I)Ljava/util/ArrayList;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lr6/k;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/g;

    invoke-virtual {v1}, Ln8/g;->c()J

    move-result-wide v2

    int-to-long v4, p1

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a(Le8/w0;)Z
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Ln8/p;->j:Le8/i;

    const/4 v4, 0x1

    const-string v5, "Received resolution result: {0}"

    invoke-virtual {v3, v4, v5, v2}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v1, Le8/w0;->c:Ljava/lang/Object;

    check-cast v2, Ln8/j;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v6, v1, Le8/w0;->a:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le8/g0;

    iget-object v8, v8, Le8/g0;->a:Ljava/util/List;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    iget-object v7, v0, Ln8/p;->c:Ln8/h;

    invoke-virtual {v7}, Lr6/k;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    iget-object v8, v7, Ln8/h;->a:Ljava/util/HashMap;

    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ln8/g;

    iput-object v2, v9, Ln8/g;->a:Ln8/j;

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/SocketAddress;

    iget-object v9, v7, Ln8/h;->a:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    new-instance v10, Ln8/g;

    invoke-direct {v10, v2}, Ln8/g;-><init>(Ln8/j;)V

    invoke-virtual {v9, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v5, v2, Ln8/j;->g:Lg8/t5;

    iget-object v5, v5, Lg8/t5;->a:Le8/a1;

    iget-object v8, v0, Ln8/p;->e:Ln8/f;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "newBalancerFactory"

    invoke-static {v5, v9}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v8, Ln8/f;->g:Le8/i;

    invoke-virtual {v5, v9}, Le8/a1;->equals(Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_4

    goto :goto_3

    :cond_4
    iget-object v9, v8, Ln8/f;->h:Le8/z0;

    invoke-virtual {v9}, Le8/z0;->f()V

    iget-object v9, v8, Ln8/f;->c:Ln8/d;

    iput-object v9, v8, Ln8/f;->h:Le8/z0;

    iput-object v10, v8, Ln8/f;->g:Le8/i;

    sget-object v9, Le8/x;->a:Le8/x;

    iput-object v9, v8, Ln8/f;->i:Le8/x;

    sget-object v9, Ln8/f;->l:Lg8/p;

    iput-object v9, v8, Ln8/f;->j:Lz6/a;

    iget-object v9, v8, Ln8/f;->e:Le8/i;

    invoke-virtual {v5, v9}, Le8/a1;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    new-instance v9, Ln8/e;

    invoke-direct {v9, v8}, Ln8/e;-><init>(Ln8/f;)V

    invoke-virtual {v5, v9}, Le8/i;->c(Le8/j0;)Le8/z0;

    move-result-object v11

    iput-object v11, v9, Ln8/e;->b:Ljava/lang/Object;

    iput-object v11, v8, Ln8/f;->h:Le8/z0;

    iput-object v5, v8, Ln8/f;->g:Le8/i;

    iget-boolean v5, v8, Ln8/f;->k:Z

    if-nez v5, :cond_6

    invoke-virtual {v8}, Ln8/f;->h()V

    :cond_6
    :goto_3
    iget-object v5, v2, Ln8/j;->e:Lp/a;

    const/4 v9, 0x0

    if-nez v5, :cond_9

    iget-object v5, v2, Ln8/j;->f:Lp/a;

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    iget-object v3, v0, Ln8/p;->h:Lv6/d;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lv6/d;->c()V

    iput-object v10, v0, Ln8/p;->i:Ljava/lang/Long;

    iget-object v3, v7, Ln8/h;->a:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln8/g;

    invoke-virtual {v5}, Ln8/g;->e()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v5}, Ln8/g;->g()V

    :cond_8
    iput v9, v5, Ln8/g;->e:I

    goto :goto_4

    :cond_9
    :goto_5
    iget-object v5, v0, Ln8/p;->i:Ljava/lang/Long;

    iget-object v10, v2, Ln8/j;->a:Ljava/lang/Long;

    if-nez v5, :cond_a

    move-object v5, v10

    goto :goto_6

    :cond_a
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iget-object v5, v0, Ln8/p;->f:Lg8/c6;

    check-cast v5, Lg8/k4;

    invoke-virtual {v5}, Lg8/k4;->a()J

    move-result-wide v13

    iget-object v5, v0, Ln8/p;->i:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    sub-long/2addr v13, v15

    sub-long/2addr v11, v13

    const-wide/16 v13, 0x0

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :goto_6
    iget-object v11, v0, Ln8/p;->h:Lv6/d;

    if-eqz v11, :cond_b

    invoke-virtual {v11}, Lv6/d;->c()V

    iget-object v7, v7, Ln8/h;->a:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ln8/g;

    iget-object v12, v11, Ln8/g;->b:Lv6/d;

    invoke-virtual {v12}, Lv6/d;->n()V

    iget-object v11, v11, Ln8/g;->c:Lv6/d;

    invoke-virtual {v11}, Lv6/d;->n()V

    goto :goto_7

    :cond_b
    new-instance v15, Ly2/a;

    const/16 v7, 0x17

    invoke-direct {v15, v0, v2, v3, v7}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    sget-object v22, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, v0, Ln8/p;->g:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v13, v0, Ln8/p;->d:Le8/h2;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Le8/g2;

    invoke-direct {v5, v15}, Le8/g2;-><init>(Ljava/lang/Runnable;)V

    new-instance v7, Le8/f2;

    move-object v12, v7

    move-object v14, v5

    move-wide/from16 v16, v20

    invoke-direct/range {v12 .. v17}, Le8/f2;-><init>(Le8/h2;Le8/g2;Ly2/a;J)V

    move-object/from16 v16, v3

    move-object/from16 v17, v7

    invoke-interface/range {v16 .. v22}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v3

    new-instance v7, Lv6/d;

    invoke-direct {v7, v5, v3, v9}, Lv6/d;-><init>(Le8/g2;Ljava/util/concurrent/ScheduledFuture;I)V

    iput-object v7, v0, Ln8/p;->h:Lv6/d;

    :cond_c
    sget-object v3, Le8/c;->b:Le8/c;

    iget-object v1, v1, Le8/w0;->b:Le8/c;

    iget-object v2, v2, Ln8/j;->g:Lg8/t5;

    iget-object v2, v2, Lg8/t5;->b:Ljava/lang/Object;

    new-instance v3, Le8/w0;

    check-cast v6, Ljava/util/List;

    invoke-direct {v3, v6, v1, v2}, Le8/w0;-><init>(Ljava/util/List;Le8/c;Ljava/lang/Object;)V

    invoke-virtual {v8, v3}, Ln8/a;->d(Le8/w0;)V

    return v4
.end method

.method public final c(Le8/c2;)V
    .locals 1

    iget-object v0, p0, Ln8/p;->e:Ln8/f;

    invoke-virtual {v0, p1}, Ln8/a;->c(Le8/c2;)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Ln8/p;->e:Ln8/f;

    invoke-virtual {v0}, Ln8/f;->f()V

    return-void
.end method
