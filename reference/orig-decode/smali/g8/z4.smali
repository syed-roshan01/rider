.class public final Lg8/z4;
.super Le8/p;


# instance fields
.field public final synthetic A:Lg8/y2;

.field public final y:Lg8/g5;

.field public z:J


# direct methods
.method public constructor <init>(Lg8/y2;Lg8/g5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/z4;->A:Lg8/y2;

    iput-object p2, p0, Lg8/z4;->y:Lg8/g5;

    return-void
.end method


# virtual methods
.method public final f0(J)V
    .locals 8

    iget-object v0, p0, Lg8/z4;->A:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->o:Lg8/c5;

    iget-object v0, v0, Lg8/c5;->f:Lg8/g5;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg8/z4;->A:Lg8/y2;

    iget-object v0, v0, Lg8/y2;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg8/z4;->A:Lg8/y2;

    iget-object v1, v1, Lg8/y2;->o:Lg8/c5;

    iget-object v1, v1, Lg8/c5;->f:Lg8/g5;

    if-nez v1, :cond_7

    iget-object v1, p0, Lg8/z4;->y:Lg8/g5;

    iget-boolean v2, v1, Lg8/g5;->b:Z

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    iget-wide v2, p0, Lg8/z4;->z:J

    add-long/2addr v2, p1

    iput-wide v2, p0, Lg8/z4;->z:J

    iget-object p1, p0, Lg8/z4;->A:Lg8/y2;

    iget-wide v4, p1, Lg8/y2;->t:J

    cmp-long p2, v2, v4

    if-gtz p2, :cond_2

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    iget-wide v6, p1, Lg8/y2;->k:J

    cmp-long p2, v2, v6

    const/4 v6, 0x1

    if-lez p2, :cond_3

    iput-boolean v6, v1, Lg8/g5;->c:Z

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lg8/y2;->j:Lg8/o;

    sub-long/2addr v2, v4

    iget-object p1, p1, Lg8/o;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    iget-object v1, p0, Lg8/z4;->A:Lg8/y2;

    iget-wide v2, p0, Lg8/z4;->z:J

    iput-wide v2, v1, Lg8/y2;->t:J

    iget-wide v1, v1, Lg8/y2;->l:J

    cmp-long p1, p1, v1

    if-lez p1, :cond_4

    iget-object p1, p0, Lg8/z4;->y:Lg8/g5;

    iput-boolean v6, p1, Lg8/g5;->c:Z

    :cond_4
    :goto_0
    iget-object p1, p0, Lg8/z4;->y:Lg8/g5;

    iget-boolean p2, p1, Lg8/g5;->c:Z

    if-eqz p2, :cond_5

    iget-object p2, p0, Lg8/z4;->A:Lg8/y2;

    invoke-virtual {p2, p1}, Lg8/y2;->s(Lg8/g5;)Lb3/a1;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lb3/a1;->run()V

    :cond_6
    return-void

    :cond_7
    :goto_2
    :try_start_1
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
