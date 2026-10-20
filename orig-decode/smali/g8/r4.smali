.class public final Lg8/r4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/s4;


# direct methods
.method public synthetic constructor <init>(Lg8/s4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/r4;->a:I

    iput-object p1, p0, Lg8/r4;->b:Lg8/s4;

    return-void
.end method

.method public synthetic constructor <init>(Lg8/s4;II)V
    .locals 0

    iput p2, p0, Lg8/r4;->a:I

    const/4 p3, 0x1

    if-eq p2, p3, :cond_0

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lg8/r4;-><init>(Lg8/s4;I)V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1, p3}, Lg8/r4;-><init>(Lg8/s4;I)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lg8/r4;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lg8/r4;->b:Lg8/s4;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Lg8/s4;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lg8/r4;

    invoke-direct {v3, v2, v1, v1}, Lg8/r4;-><init>(Lg8/s4;II)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-boolean v0, v2, Lg8/s4;->f:Z

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iput-object v3, v2, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, v2, Lg8/s4;->d:Lq6/l;

    invoke-virtual {v4, v0}, Lq6/l;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    iget-wide v6, v2, Lg8/s4;->e:J

    sub-long/2addr v6, v4

    const-wide/16 v4, 0x0

    cmp-long v4, v6, v4

    if-lez v4, :cond_1

    new-instance v3, Lg8/r4;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4, v1}, Lg8/r4;-><init>(Lg8/s4;II)V

    iget-object v1, v2, Lg8/s4;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1, v3, v6, v7, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, v2, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_1
    iput-boolean v1, v2, Lg8/s4;->f:Z

    iput-object v3, v2, Lg8/s4;->g:Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, v2, Lg8/s4;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
