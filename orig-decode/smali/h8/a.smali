.class public final Lh8/a;
.super Lg8/q0;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lh8/c;


# direct methods
.method public constructor <init>(Lh8/c;I)V
    .locals 1

    iput p2, p0, Lh8/a;->c:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    iput-object p1, p0, Lh8/a;->d:Lh8/c;

    invoke-direct {p0, p1}, Lg8/q0;-><init>(Lh8/c;)V

    invoke-static {}, Lo8/b;->c()V

    return-void

    :cond_0
    iput-object p1, p0, Lh8/a;->d:Lh8/c;

    invoke-direct {p0, p1}, Lg8/q0;-><init>(Lh8/c;)V

    invoke-static {}, Lo8/b;->c()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget v0, p0, Lh8/a;->c:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lo8/b;->d()V

    :try_start_0
    invoke-static {}, Lo8/b;->b()V

    iget-object v2, p0, Lh8/a;->d:Lh8/c;

    iget-object v2, v2, Lh8/c;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v3, p0, Lh8/a;->d:Lh8/c;

    iget-object v3, v3, Lh8/c;->b:Lja/g;

    iget-wide v4, v3, Lja/g;->b:J

    invoke-virtual {v0, v3, v4, v5}, Lja/g;->b0(Lja/g;J)V

    iget-object v3, p0, Lh8/a;->d:Lh8/c;

    iput-boolean v1, v3, Lh8/c;->n:Z

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, v3, Lh8/c;->p:Lja/e0;

    iget-wide v2, v0, Lja/g;->b:J

    invoke-interface {v1, v0, v2, v3}, Lja/e0;->b0(Lja/g;J)V

    iget-object v0, p0, Lh8/a;->d:Lh8/c;

    iget-object v0, v0, Lh8/c;->p:Lja/e0;

    invoke-interface {v0}, Lja/e0;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    :try_start_5
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0

    :pswitch_0
    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lo8/b;->d()V

    :try_start_6
    invoke-static {}, Lo8/b;->b()V

    iget-object v2, p0, Lh8/a;->d:Lh8/c;

    iget-object v2, v2, Lh8/c;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    iget-object v3, p0, Lh8/a;->d:Lh8/c;

    iget-object v3, v3, Lh8/c;->b:Lja/g;

    invoke-virtual {v3}, Lja/g;->b()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lja/g;->b0(Lja/g;J)V

    iget-object v3, p0, Lh8/a;->d:Lh8/c;

    iput-boolean v1, v3, Lh8/c;->f:Z

    iget v1, v3, Lh8/c;->t:I

    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    iget-object v2, v3, Lh8/c;->p:Lja/e0;

    iget-wide v3, v0, Lja/g;->b:J

    invoke-interface {v2, v0, v3, v4}, Lja/e0;->b0(Lja/g;J)V

    iget-object v0, p0, Lh8/a;->d:Lh8/c;

    iget-object v0, v0, Lh8/c;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    iget-object v2, p0, Lh8/a;->d:Lh8/c;

    iget v3, v2, Lh8/c;->t:I

    sub-int/2addr v3, v1

    iput v3, v2, Lh8/c;->t:I

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_3
    move-exception v1

    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_2

    :catchall_5
    move-exception v0

    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :goto_2
    :try_start_e
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_3

    :catchall_6
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
