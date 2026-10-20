.class public final Lea/p;
.super Laa/a;


# instance fields
.field public final synthetic e:Lea/r;

.field public final synthetic f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lea/r;J)V
    .locals 0

    iput-object p2, p0, Lea/p;->e:Lea/r;

    iput-wide p3, p0, Lea/p;->f:J

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 9

    iget-object v0, p0, Lea/p;->e:Lea/r;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lea/p;->e:Lea/r;

    iget-wide v2, v1, Lea/r;->u:J

    iget-wide v4, v1, Lea/r;->t:J

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    const/4 v6, 0x0

    if-gez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const-wide/16 v7, 0x1

    add-long/2addr v4, v7

    iput-wide v4, v1, Lea/r;->t:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v2, v6

    :goto_0
    monitor-exit v0

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lea/r;->b(Ljava/io/IOException;)V

    const-wide/16 v0, -0x1

    goto :goto_2

    :cond_1
    :try_start_1
    iget-object v0, v1, Lea/r;->F:Lea/z;

    invoke-virtual {v0, v3, v6, v6}, Lea/z;->X(IZI)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v1, v0}, Lea/r;->b(Ljava/io/IOException;)V

    :goto_1
    iget-wide v0, p0, Lea/p;->f:J

    :goto_2
    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
