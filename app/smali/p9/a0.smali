.class public final Lp9/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/o0;


# instance fields
.field public final a:Lp9/c0;

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:Lu8/e;


# direct methods
.method public constructor <init>(Lp9/c0;JLjava/lang/Object;Lm9/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/a0;->a:Lp9/c0;

    iput-wide p2, p0, Lp9/a0;->b:J

    iput-object p4, p0, Lp9/a0;->c:Ljava/lang/Object;

    iput-object p5, p0, Lp9/a0;->d:Lu8/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lp9/a0;->a:Lp9/c0;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lp9/a0;->b:J

    invoke-virtual {v0}, Lp9/c0;->o()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    monitor-exit v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, v0, Lp9/c0;->o:[Ljava/lang/Object;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v2, p0, Lp9/a0;->b:J

    long-to-int v4, v2

    array-length v5, v1

    add-int/lit8 v5, v5, -0x1

    and-int/2addr v4, v5

    aget-object v4, v1, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v4, p0, :cond_1

    monitor-exit v0

    goto :goto_0

    :cond_1
    :try_start_2
    sget-object v4, Lp9/d0;->a:Li3/u;

    invoke-static {v1, v2, v3, v4}, Lp9/d0;->b([Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0}, Lp9/c0;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
