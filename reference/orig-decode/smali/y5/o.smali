.class public final Ly5/o;
.super Ljava/lang/Object;


# static fields
.field public static e:Ly5/o;


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILu8/j;Lo9/a;Lp9/f;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ly5/o;->b:Ljava/lang/Object;

    iput p1, p0, Ly5/o;->a:I

    iput-object p3, p0, Ly5/o;->c:Ljava/lang/Object;

    iput-object p2, p0, Ly5/o;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly5/k;

    invoke-direct {v0, p0}, Ly5/k;-><init>(Ly5/o;)V

    iput-object v0, p0, Ly5/o;->d:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Ly5/o;->a:I

    iput-object p2, p0, Ly5/o;->c:Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ly5/o;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh8/v;Lh8/e;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "transport"

    .line 4
    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ly5/o;->b:Ljava/lang/Object;

    iput-object p2, p0, Ly5/o;->c:Ljava/lang/Object;

    const p1, 0xffff

    iput p1, p0, Ly5/o;->a:I

    .line 5
    new-instance p2, Li3/v;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p2, p0, v0, p1, v1}, Li3/v;-><init>(Ly5/o;IILh8/k;)V

    iput-object p2, p0, Ly5/o;->d:Ljava/lang/Object;

    return-void
.end method

.method public static declared-synchronized f(Landroid/content/Context;)Ly5/o;
    .locals 4

    const-class v0, Ly5/o;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly5/o;->e:Ly5/o;

    if-nez v1, :cond_0

    new-instance v1, Ly5/o;

    invoke-static {}, Lcom/google/android/gms/internal/cloudmessaging/zze;->zza()Lcom/google/android/gms/internal/cloudmessaging/zzb;

    new-instance v2, Lm/c;

    const-string v3, "MessengerIpcClient"

    invoke-direct {v2, v3}, Lm/c;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {v3, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-static {v2}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ly5/o;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    sput-object v1, Ly5/o;->e:Ly5/o;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Ly5/o;->e:Ly5/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final a(ZLi3/v;Lja/g;Z)V
    .locals 4

    const-string v0, "source"

    invoke-static {p3, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Li3/v;->e()I

    move-result v0

    invoke-virtual {p2}, Li3/v;->a()Z

    move-result v1

    iget-wide v2, p3, Lja/g;->b:J

    long-to-int v2, v2

    if-nez v1, :cond_0

    if-lt v0, v2, :cond_0

    invoke-virtual {p2, v2, p3, p1}, Li3/v;->f(ILja/g;Z)V

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    if-lez v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Li3/v;->f(ILja/g;Z)V

    :cond_1
    iget-wide v0, p3, Lja/g;->b:J

    long-to-int v0, v0

    iget-object v1, p2, Li3/v;->e:Ljava/lang/Object;

    check-cast v1, Lja/g;

    int-to-long v2, v0

    invoke-virtual {v1, p3, v2, v3}, Lja/g;->b0(Lja/g;J)V

    iget-boolean p3, p2, Li3/v;->d:Z

    or-int/2addr p1, p3

    iput-boolean p1, p2, Li3/v;->d:Z

    :goto_0
    if-eqz p4, :cond_2

    invoke-virtual {p0}, Ly5/o;->b()V

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ly5/o;->c:Ljava/lang/Object;

    check-cast v0, Lj8/b;

    invoke-interface {v0}, Lj8/b;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(I)Z
    .locals 5

    if-ltz p1, :cond_2

    iget v0, p0, Ly5/o;->a:I

    sub-int v0, p1, v0

    iput p1, p0, Ly5/o;->a:I

    iget-object p1, p0, Ly5/o;->b:Ljava/lang/Object;

    check-cast p1, Lh8/v;

    check-cast p1, Lh8/n;

    invoke-virtual {p1}, Lh8/n;->k()[Li3/v;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    invoke-virtual {v4, v0}, Li3/v;->b(I)I

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid initial window size: "

    invoke-static {v1, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Li3/v;I)V
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Ly5/o;->d:Ljava/lang/Object;

    check-cast p1, Li3/v;

    invoke-virtual {p1, p2}, Li3/v;->b(I)I

    invoke-virtual {p0}, Ly5/o;->e()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Li3/v;->b(I)I

    new-instance p2, Lx9/v;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Li3/v;->e()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Li3/v;->g(ILx9/v;)V

    iget p1, p2, Lx9/v;->a:I

    if-lez p1, :cond_1

    invoke-virtual {p0}, Ly5/o;->b()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 13

    iget-object v0, p0, Ly5/o;->b:Ljava/lang/Object;

    check-cast v0, Lh8/v;

    check-cast v0, Lh8/n;

    invoke-virtual {v0}, Lh8/n;->k()[Li3/v;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    iget-object v2, p0, Ly5/o;->d:Ljava/lang/Object;

    check-cast v2, Li3/v;

    iget v2, v2, Li3/v;->b:I

    array-length v3, v1

    :goto_0
    const/4 v4, 0x0

    if-lez v3, :cond_3

    if-lez v2, :cond_3

    int-to-float v5, v2

    int-to-float v6, v3

    div-float/2addr v5, v6

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v5, v5

    move v6, v4

    move v7, v6

    :goto_1
    if-ge v7, v3, :cond_2

    if-lez v2, :cond_2

    aget-object v8, v1, v7

    iget v9, v8, Li3/v;->b:I

    iget-object v10, v8, Li3/v;->e:Ljava/lang/Object;

    move-object v11, v10

    check-cast v11, Lja/g;

    iget-wide v11, v11, Lja/g;->b:J

    long-to-int v11, v11

    invoke-static {v9, v11}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    iget v11, v8, Li3/v;->c:I

    sub-int/2addr v9, v11

    invoke-static {v9, v5}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-lez v9, :cond_0

    iget v11, v8, Li3/v;->c:I

    add-int/2addr v11, v9

    iput v11, v8, Li3/v;->c:I

    sub-int/2addr v2, v9

    :cond_0
    iget v9, v8, Li3/v;->b:I

    check-cast v10, Lja/g;

    iget-wide v10, v10, Lja/g;->b:J

    long-to-int v10, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    iget v10, v8, Li3/v;->c:I

    sub-int/2addr v9, v10

    if-lez v9, :cond_1

    add-int/lit8 v9, v6, 0x1

    aput-object v8, v1, v6

    move v6, v9

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    move v3, v6

    goto :goto_0

    :cond_3
    new-instance v1, Lx9/v;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lh8/n;->k()[Li3/v;

    move-result-object v0

    array-length v2, v0

    move v3, v4

    :goto_2
    if-ge v3, v2, :cond_4

    aget-object v5, v0, v3

    iget v6, v5, Li3/v;->c:I

    invoke-virtual {v5, v6, v1}, Li3/v;->g(ILx9/v;)V

    iput v4, v5, Li3/v;->c:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    iget v0, v1, Lx9/v;->a:I

    if-lez v0, :cond_5

    invoke-virtual {p0}, Ly5/o;->b()V

    :cond_5
    return-void
.end method

.method public final declared-synchronized g(Ly5/l;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "MessengerIpcClient"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ly5/m;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Queueing "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessengerIpcClient"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Ly5/o;->d:Ljava/lang/Object;

    check-cast v0, Ly5/k;

    invoke-virtual {v0, p1}, Ly5/k;->d(Ly5/l;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ly5/k;

    invoke-direct {v0, p0}, Ly5/k;-><init>(Ly5/o;)V

    iput-object v0, p0, Ly5/o;->d:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ly5/k;->d(Ly5/l;)Z

    :cond_1
    iget-object p1, p1, Ly5/m;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method
