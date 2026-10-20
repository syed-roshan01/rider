.class public final Lt/k1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc9/c;


# direct methods
.method public synthetic constructor <init>(ILc9/c;)V
    .locals 0

    iput p1, p0, Lt/k1;->a:I

    iput-object p2, p0, Lt/k1;->b:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lt/k1;->a:I

    const-wide/32 v1, 0xf4240

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, Lt/k1;->b:Lc9/c;

    :try_start_0
    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    move-object v0, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v0

    :cond_0
    :goto_0
    instance-of p1, v0, Lq8/g;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    check-cast v3, Ljava/lang/Throwable;

    return-object v3

    :pswitch_1
    check-cast p1, Lw0/n;

    iget-object v0, p0, Lt/k1;->b:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw0/i;

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    sget-object v1, Lw0/p;->c:Lw0/n;

    invoke-virtual {p1}, Lw0/i;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lw0/n;->o(I)Lw0/n;

    move-result-object v1

    sput-object v1, Lw0/p;->c:Lw0/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return-object p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_2
    check-cast p1, Lw0/n;

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    sget v1, Lw0/p;->d:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lw0/p;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v0

    iget-object v0, p0, Lt/k1;->b:Lc9/c;

    new-instance v2, Lw0/g;

    invoke-direct {v2, v1, p1, v0}, Lw0/g;-><init>(ILw0/n;Lc9/c;)V

    return-object v2

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iget p1, p0, Lt/k1;->a:I

    iget-object v0, p0, Lt/k1;->b:Lc9/c;

    packed-switch p1, :pswitch_data_1

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_4
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_5
    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    iget p1, p0, Lt/k1;->a:I

    packed-switch p1, :pswitch_data_2

    throw v3

    :pswitch_6
    throw v3

    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iget p1, p0, Lt/k1;->a:I

    iget-object v0, p0, Lt/k1;->b:Lc9/c;

    packed-switch p1, :pswitch_data_3

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :pswitch_8
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_8
    .end packed-switch
.end method
