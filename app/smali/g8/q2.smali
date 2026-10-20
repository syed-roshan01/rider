.class public final Lg8/q2;
.super Ljava/lang/Object;


# static fields
.field public static final l:J


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Lq6/l;

.field public final c:Lg8/p2;

.field public final d:Z

.field public e:I

.field public f:Ljava/util/concurrent/ScheduledFuture;

.field public g:Ljava/util/concurrent/ScheduledFuture;

.field public final h:Lg8/r2;

.field public final i:Lg8/r2;

.field public final j:J

.field public final k:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    sput-wide v3, Lg8/q2;->l:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    return-void
.end method

.method public constructor <init>(Lg8/p2;Ljava/util/concurrent/ScheduledExecutorService;JJZ)V
    .locals 5

    new-instance v0, Lq6/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput v1, p0, Lg8/q2;->e:I

    new-instance v2, Lg8/r2;

    new-instance v3, Lg8/n2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lg8/n2;-><init>(Lg8/q2;I)V

    invoke-direct {v2, v3}, Lg8/r2;-><init>(Ljava/lang/Runnable;)V

    iput-object v2, p0, Lg8/q2;->h:Lg8/r2;

    new-instance v2, Lg8/r2;

    new-instance v3, Lg8/n2;

    invoke-direct {v3, p0, v1}, Lg8/n2;-><init>(Lg8/q2;I)V

    invoke-direct {v2, v3}, Lg8/r2;-><init>(Ljava/lang/Runnable;)V

    iput-object v2, p0, Lg8/q2;->i:Lg8/r2;

    iput-object p1, p0, Lg8/q2;->c:Lg8/p2;

    const-string p1, "scheduler"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/q2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v0, p0, Lg8/q2;->b:Lq6/l;

    iput-wide p3, p0, Lg8/q2;->j:J

    iput-wide p5, p0, Lg8/q2;->k:J

    iput-boolean p7, p0, Lg8/q2;->d:Z

    iput-boolean v4, v0, Lq6/l;->a:Z

    invoke-virtual {v0}, Lq6/l;->b()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg8/q2;->b:Lq6/l;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lq6/l;->a:Z

    invoke-virtual {v0}, Lq6/l;->b()V

    iget v0, p0, Lg8/q2;->e:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x3

    iput v0, p0, Lg8/q2;->e:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v3, 0x5

    const/4 v4, 0x4

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_5

    :cond_1
    iget-object v0, p0, Lg8/q2;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_2
    iget v0, p0, Lg8/q2;->e:I

    const/4 v4, 0x1

    if-ne v0, v3, :cond_3

    iput v4, p0, Lg8/q2;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_1
    iput v2, p0, Lg8/q2;->e:I

    iget-object v0, p0, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_4

    move v1, v4

    :cond_4
    const-string v0, "There should be no outstanding pingFuture"

    invoke-static {v0, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/q2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lg8/q2;->i:Lg8/r2;

    iget-wide v2, p0, Lg8/q2;->j:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 8

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lg8/q2;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lg8/q2;->e:I

    iget-object v0, p0, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/q2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lg8/q2;->i:Lg8/r2;

    iget-wide v2, p0, Lg8/q2;->j:J

    iget-object v4, p0, Lg8/q2;->b:Lq6/l;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v5}, Lq6/l;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    sub-long/2addr v2, v6

    invoke-interface {v0, v1, v2, v3, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lg8/q2;->g:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    const/4 v0, 0x4

    iput v0, p0, Lg8/q2;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method
