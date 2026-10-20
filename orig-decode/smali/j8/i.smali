.class public final Lj8/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Lja/i;

.field public final b:Lj8/g;

.field public final c:Lj8/d;


# direct methods
.method public constructor <init>(Lja/a0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/i;->a:Lja/i;

    new-instance v0, Lj8/g;

    invoke-direct {v0, p1}, Lj8/g;-><init>(Lja/a0;)V

    iput-object v0, p0, Lj8/i;->b:Lj8/g;

    new-instance p1, Lj8/d;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lj8/d;-><init>(Lj8/g;I)V

    iput-object p1, p0, Lj8/i;->c:Lj8/d;

    return-void
.end method


# virtual methods
.method public final a(Lk6/v6;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v1, Lj8/i;->a:Lja/i;

    const-wide/16 v4, 0x9

    invoke-interface {v3, v4, v5}, Lja/i;->S(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v1, Lj8/i;->a:Lja/i;

    invoke-static {v3}, Lj8/k;->a(Lja/i;)I

    move-result v3

    const/4 v4, 0x0

    if-ltz v3, :cond_1e

    const/16 v5, 0x4000

    if-gt v3, v5, :cond_1e

    iget-object v5, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v5}, Lja/i;->readByte()B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    iget-object v6, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v6}, Lja/i;->readByte()B

    move-result v6

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    iget-object v7, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v7}, Lja/i;->readInt()I

    move-result v7

    const v8, 0x7fffffff

    and-int v10, v7, v8

    sget-object v7, Lj8/k;->a:Ljava/util/logging/Logger;

    sget-object v8, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v7, v8}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v8

    const/4 v15, 0x1

    if-eqz v8, :cond_0

    invoke-static {v15, v10, v3, v5, v6}, Lj8/h;->a(ZIIBB)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/16 v7, 0x8

    const-wide/16 v8, 0x0

    packed-switch v5, :pswitch_data_0

    iget-object v0, v1, Lj8/i;->a:Lja/i;

    int-to-long v2, v3

    invoke-interface {v0, v2, v3}, Lja/i;->l(J)V

    move v5, v15

    goto/16 :goto_e

    :pswitch_0
    const/4 v5, 0x4

    if-ne v3, v5, :cond_8

    iget-object v3, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v3}, Lja/i;->readInt()I

    move-result v3

    int-to-long v5, v3

    const-wide/32 v11, 0x7fffffff

    and-long/2addr v5, v11

    cmp-long v3, v5, v8

    if-eqz v3, :cond_7

    iget-object v7, v0, Lk6/v6;->c:Ljava/lang/Object;

    check-cast v7, Lv6/d;

    invoke-virtual {v7, v15, v10, v5, v6}, Lv6/d;->l(IIJ)V

    if-nez v3, :cond_2

    const-string v2, "Received 0 flow control window increment."

    if-nez v10, :cond_1

    iget-object v0, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    invoke-static {v0, v2}, Lh8/n;->g(Lh8/n;Ljava/lang/String;)V

    move v3, v15

    goto/16 :goto_1

    :cond_1
    iget-object v0, v0, Lk6/v6;->e:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lh8/n;

    sget-object v0, Le8/c2;->l:Le8/c2;

    invoke-virtual {v0, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v11

    sget-object v12, Lg8/i0;->a:Lg8/i0;

    const/4 v13, 0x0

    sget-object v14, Lj8/a;->c:Lj8/a;

    const/4 v0, 0x0

    move v3, v15

    move-object v15, v0

    invoke-virtual/range {v9 .. v15}, Lh8/n;->j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V

    goto :goto_1

    :cond_2
    move v3, v15

    iget-object v7, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v7, Lh8/n;

    iget-object v7, v7, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v7

    if-nez v10, :cond_3

    :try_start_1
    iget-object v0, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->j:Ly5/o;

    long-to-int v2, v5

    invoke-virtual {v0, v4, v2}, Ly5/o;->d(Li3/v;I)V

    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    iget-object v4, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v4, Lh8/n;

    iget-object v4, v4, Lh8/n;->n:Ljava/util/HashMap;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/l;

    if-eqz v4, :cond_4

    iget-object v8, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v8, Lh8/n;

    iget-object v8, v8, Lh8/n;->j:Ly5/o;

    iget-object v4, v4, Lh8/l;->n:Lh8/k;

    iget-object v9, v4, Lh8/k;->x:Ljava/lang/Object;

    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, v4, Lh8/k;->K:Li3/v;

    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    long-to-int v5, v5

    :try_start_3
    invoke-virtual {v8, v4, v5}, Ly5/o;->d(Li3/v;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v0

    :cond_4
    iget-object v4, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v4, Lh8/n;

    invoke-virtual {v4, v10}, Lh8/n;->n(I)Z

    move-result v4

    if-nez v4, :cond_5

    move v2, v3

    :cond_5
    :goto_0
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v2, :cond_6

    iget-object v0, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Received window_update for unknown stream: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lh8/n;->g(Lh8/n;Ljava/lang/String;)V

    :cond_6
    :goto_1
    move v5, v3

    goto/16 :goto_e

    :goto_2
    :try_start_6
    monitor-exit v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    :cond_7
    const-string v0, "windowSizeIncrement was 0"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :cond_8
    const-string v0, "TYPE_WINDOW_UPDATE length !=4: %s"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :pswitch_1
    move v5, v15

    if-lt v3, v7, :cond_13

    if-nez v10, :cond_12

    iget-object v6, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v6}, Lja/i;->readInt()I

    move-result v10

    invoke-interface {v6}, Lja/i;->readInt()I

    move-result v11

    sub-int/2addr v3, v7

    invoke-static {}, Lj8/a;->values()[Lj8/a;

    move-result-object v7

    array-length v12, v7

    :goto_3
    if-ge v2, v12, :cond_a

    aget-object v13, v7, v2

    iget v14, v13, Lj8/a;->a:I

    if-ne v14, v11, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    move-object v13, v4

    :goto_4
    if-eqz v13, :cond_11

    sget-object v2, Lja/j;->d:Lja/j;

    if-lez v3, :cond_b

    int-to-long v2, v3

    invoke-interface {v6, v2, v3}, Lja/i;->i(J)Lja/j;

    move-result-object v2

    :cond_b
    iget-object v3, v0, Lk6/v6;->c:Ljava/lang/Object;

    check-cast v3, Lv6/d;

    invoke-virtual {v3, v5, v10, v13, v2}, Lv6/d;->h(IILj8/a;Lja/j;)V

    sget-object v3, Lj8/a;->s:Lj8/a;

    iget-object v6, v0, Lk6/v6;->e:Ljava/lang/Object;

    if-ne v13, v3, :cond_c

    invoke-virtual {v2}, Lja/j;->t()Ljava/lang/String;

    move-result-object v3

    sget-object v7, Lh8/n;->T:Ljava/util/logging/Logger;

    sget-object v11, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v12, "%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v11, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-string v0, "too_many_pings"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object v0, v6

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->L:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_c
    iget v0, v13, Lj8/a;->a:I

    int-to-long v11, v0

    sget-object v0, Lg8/r1;->d:[Lg8/r1;

    array-length v3, v0

    int-to-long v13, v3

    cmp-long v3, v11, v13

    if-gez v3, :cond_e

    cmp-long v3, v11, v8

    if-gez v3, :cond_d

    goto :goto_5

    :cond_d
    long-to-int v3, v11

    aget-object v0, v0, v3

    goto :goto_6

    :cond_e
    :goto_5
    move-object v0, v4

    :goto_6
    if-nez v0, :cond_f

    sget-object v0, Lg8/r1;->c:Lg8/r1;

    iget-object v0, v0, Lg8/r1;->b:Le8/c2;

    iget-object v0, v0, Le8/c2;->a:Le8/z1;

    iget v0, v0, Le8/z1;->a:I

    invoke-static {v0}, Le8/c2;->c(I)Le8/c2;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "Unrecognized HTTP/2 error code: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    goto :goto_7

    :cond_f
    iget-object v0, v0, Lg8/r1;->b:Le8/c2;

    :goto_7
    const-string v3, "Received Goaway"

    invoke-virtual {v0, v3}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    invoke-virtual {v2}, Lja/j;->d()I

    move-result v3

    if-lez v3, :cond_10

    invoke-virtual {v2}, Lja/j;->t()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    :cond_10
    check-cast v6, Lh8/n;

    sget-object v2, Lh8/n;->S:Ljava/util/Map;

    invoke-virtual {v6, v10, v4, v0}, Lh8/n;->s(ILj8/a;Le8/c2;)V

    goto/16 :goto_e

    :cond_11
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "TYPE_GOAWAY unexpected error code: %d"

    invoke-static {v2, v0}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :cond_12
    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "TYPE_GOAWAY streamId != 0"

    invoke-static {v2, v0}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :cond_13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "TYPE_GOAWAY length < 8: %s"

    invoke-static {v2, v0}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :pswitch_2
    move v5, v15

    if-ne v3, v7, :cond_1a

    if-nez v10, :cond_19

    iget-object v3, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v3}, Lja/i;->readInt()I

    move-result v3

    iget-object v7, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v7}, Lja/i;->readInt()I

    move-result v7

    and-int/2addr v6, v5

    if-eqz v6, :cond_14

    move v15, v5

    goto :goto_8

    :cond_14
    move v15, v2

    :goto_8
    int-to-long v8, v3

    const/16 v6, 0x20

    shl-long/2addr v8, v6

    int-to-long v10, v7

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    or-long/2addr v8, v10

    iget-object v6, v0, Lk6/v6;->c:Ljava/lang/Object;

    check-cast v6, Lv6/d;

    invoke-virtual {v6, v5, v8, v9}, Lv6/d;->i(IJ)V

    if-nez v15, :cond_15

    iget-object v2, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    iget-object v6, v2, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v6

    :try_start_7
    iget-object v0, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->i:Lh8/e;

    invoke-virtual {v0, v3, v5, v7}, Lh8/e;->X(IZI)V

    monitor-exit v6

    goto/16 :goto_e

    :catchall_2
    move-exception v0

    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v0

    :cond_15
    iget-object v3, v0, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v3, Lh8/n;

    iget-object v3, v3, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_8
    iget-object v0, v0, Lk6/v6;->e:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lh8/n;

    iget-object v6, v6, Lh8/n;->x:Lg8/y1;

    if-eqz v6, :cond_17

    move-object v6, v0

    check-cast v6, Lh8/n;

    iget-object v6, v6, Lh8/n;->x:Lg8/y1;

    iget-wide v6, v6, Lg8/y1;->a:J

    cmp-long v6, v6, v8

    if-nez v6, :cond_16

    move-object v6, v0

    check-cast v6, Lh8/n;

    iget-object v6, v6, Lh8/n;->x:Lg8/y1;

    check-cast v0, Lh8/n;

    iput-object v4, v0, Lh8/n;->x:Lg8/y1;

    goto :goto_a

    :cond_16
    sget-object v6, Lh8/n;->T:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "Received unexpected ping ack. Expecting %d, got %d"

    const/4 v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->x:Lg8/y1;

    iget-wide v13, v0, Lg8/y1;->a:J

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v12, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v12, v5

    invoke-static {v10, v11, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v7, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_9

    :catchall_3
    move-exception v0

    goto :goto_d

    :cond_17
    sget-object v0, Lh8/n;->T:Ljava/util/logging/Logger;

    const-string v6, "Received unexpected ping ack. No ping outstanding"

    invoke-virtual {v0, v6}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    :goto_9
    move-object v6, v4

    :goto_a
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-eqz v6, :cond_1d

    monitor-enter v6

    :try_start_9
    iget-boolean v0, v6, Lg8/y1;->d:Z

    if-eqz v0, :cond_18

    monitor-exit v6

    goto/16 :goto_e

    :catchall_4
    move-exception v0

    goto :goto_c

    :cond_18
    iput-boolean v5, v6, Lg8/y1;->d:Z

    iget-object v0, v6, Lg8/y1;->b:Lq6/l;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3}, Lq6/l;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v7

    iput-wide v7, v6, Lg8/y1;->f:J

    iget-object v0, v6, Lg8/y1;->c:Ljava/util/LinkedHashMap;

    iput-object v4, v6, Lg8/y1;->c:Ljava/util/LinkedHashMap;

    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/o2;

    new-instance v6, Lg8/w1;

    invoke-direct {v6, v0, v7, v8, v2}, Lg8/w1;-><init>(Ljava/lang/Object;JI)V

    :try_start_a
    invoke-interface {v4, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_b

    :catchall_5
    move-exception v0

    move-object v4, v0

    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v6, "Failed to execute PingCallback"

    sget-object v9, Lg8/y1;->g:Ljava/util/logging/Logger;

    invoke-virtual {v9, v0, v6, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_b

    :goto_c
    :try_start_b
    monitor-exit v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    throw v0

    :goto_d
    :try_start_c
    monitor-exit v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    throw v0

    :cond_19
    const-string v0, "TYPE_PING streamId != 0"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :cond_1a
    const-string v0, "TYPE_PING length != 8: %s"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :pswitch_3
    move v5, v15

    invoke-virtual {v1, v0, v3, v6, v10}, Lj8/i;->f(Lk6/v6;IBI)V

    goto :goto_e

    :pswitch_4
    move v5, v15

    invoke-virtual {v1, v0, v3, v6, v10}, Lj8/i;->p(Lk6/v6;IBI)V

    goto :goto_e

    :pswitch_5
    move v5, v15

    invoke-virtual {v1, v0, v3, v10}, Lj8/i;->g(Lk6/v6;II)V

    goto :goto_e

    :pswitch_6
    move v5, v15

    const/4 v6, 0x5

    if-ne v3, v6, :cond_1c

    if-eqz v10, :cond_1b

    iget-object v2, v1, Lj8/i;->a:Lja/i;

    invoke-interface {v2}, Lja/i;->readInt()I

    invoke-interface {v2}, Lja/i;->readByte()B

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_e

    :cond_1b
    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    invoke-static {v2, v0}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :cond_1c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "TYPE_PRIORITY length: %d != 5"

    invoke-static {v2, v0}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :pswitch_7
    move v5, v15

    invoke-virtual {v1, v0, v3, v6, v10}, Lj8/i;->e(Lk6/v6;IBI)V

    goto :goto_e

    :pswitch_8
    move v5, v15

    invoke-virtual {v1, v0, v3, v6, v10}, Lj8/i;->b(Lk6/v6;IBI)V

    :cond_1d
    :goto_e
    return v5

    :cond_1e
    const-string v0, "FRAME_SIZE_ERROR: %s"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v4

    :catch_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lk6/v6;IBI)V
    .locals 9

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v2, p3, 0x20

    if-nez v2, :cond_5

    and-int/lit8 v2, p3, 0x8

    if-eqz v2, :cond_1

    iget-object v2, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v2}, Lja/i;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-short v2, v2

    move v8, v2

    goto :goto_1

    :cond_1
    move v8, v1

    :goto_1
    invoke-static {p2, p3, v8}, Lj8/k;->b(IBS)I

    move-result p2

    iget-object p3, p0, Lj8/i;->a:Lja/i;

    iget-object v2, p1, Lk6/v6;->c:Ljava/lang/Object;

    check-cast v2, Lv6/d;

    const/4 v3, 0x1

    invoke-interface {p3}, Lja/i;->A()Lja/g;

    move-result-object v5

    move v4, p4

    move v6, p2

    move v7, v0

    invoke-virtual/range {v2 .. v7}, Lv6/d;->g(IILja/g;IZ)V

    iget-object v2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    iget-object v3, v2, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v2, v2, Lh8/n;->n:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/l;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v2, :cond_3

    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    invoke-virtual {v0, p4}, Lh8/n;->n(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    iget-object v2, v2, Lh8/n;->i:Lh8/e;

    sget-object v3, Lj8/a;->f:Lj8/a;

    invoke-virtual {v2, p4, v3}, Lh8/e;->o(ILj8/a;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v2, p2

    invoke-interface {p3, v2, v3}, Lja/i;->l(J)V

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_2
    iget-object p1, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p1, Lh8/n;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Received data for unknown stream: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lh8/n;->g(Lh8/n;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    int-to-long v3, p2

    invoke-interface {p3, v3, v4}, Lja/i;->S(J)V

    new-instance p4, Lja/g;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    invoke-interface {p3}, Lja/i;->A()Lja/g;

    move-result-object p3

    invoke-virtual {p4, p3, v3, v4}, Lja/g;->b0(Lja/g;J)V

    iget-object p3, v2, Lh8/l;->n:Lh8/k;

    iget-object p3, p3, Lh8/k;->J:Lo8/c;

    sget-object p3, Lo8/b;->a:Lo8/a;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p3, Lh8/n;

    iget-object p3, p3, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter p3

    :try_start_3
    iget-object v2, v2, Lh8/l;->n:Lh8/k;

    invoke-virtual {v2, p4, v0}, Lh8/k;->p(Lja/g;Z)V

    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_2
    iget-object p3, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p3, Lh8/n;

    iget p4, p3, Lh8/n;->s:I

    add-int/2addr p4, p2

    iput p4, p3, Lh8/n;->s:I

    int-to-float p2, p4

    iget p4, p3, Lh8/n;->f:I

    int-to-float p4, p4

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p4, v0

    cmpl-float p2, p2, p4

    if-ltz p2, :cond_4

    iget-object p2, p3, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter p2

    :try_start_4
    iget-object p3, p1, Lk6/v6;->e:Ljava/lang/Object;

    move-object p4, p3

    check-cast p4, Lh8/n;

    iget-object p4, p4, Lh8/n;->i:Lh8/e;

    check-cast p3, Lh8/n;

    iget p3, p3, Lh8/n;->s:I

    int-to-long v2, p3

    invoke-virtual {p4, v1, v2, v3}, Lh8/e;->N(IJ)V

    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object p1, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p1, Lh8/n;

    iput v1, p1, Lh8/n;->s:I

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :cond_4
    :goto_3
    iget-object p1, p0, Lj8/i;->a:Lja/i;

    int-to-long p2, v8

    invoke-interface {p1, p2, p3}, Lja/i;->l(J)V

    return-void

    :catchall_2
    move-exception p1

    :try_start_6
    monitor-exit p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1

    :cond_5
    const-string p1, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final e(Lk6/v6;IBI)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p4, :cond_c

    and-int/lit8 v2, p3, 0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v4, p3, 0x8

    if-eqz v4, :cond_1

    iget-object v4, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v4}, Lja/i;->readByte()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-short v4, v4

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    and-int/lit8 v5, p3, 0x20

    if-eqz v5, :cond_2

    iget-object v5, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v5}, Lja/i;->readInt()I

    invoke-interface {v5}, Lja/i;->readByte()B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, -0x5

    :cond_2
    invoke-static {p2, p3, v4}, Lj8/k;->b(IBS)I

    move-result p2

    iget-object v5, p0, Lj8/i;->b:Lj8/g;

    iput p2, v5, Lj8/g;->e:I

    iput p2, v5, Lj8/g;->b:I

    iput-short v4, v5, Lj8/g;->f:S

    iput-byte p3, v5, Lj8/g;->c:B

    iput p4, v5, Lj8/g;->d:I

    iget-object p2, p0, Lj8/i;->c:Lj8/d;

    invoke-virtual {p2}, Lj8/d;->k()V

    iget-object p3, p2, Lj8/d;->d:Ljava/util/ArrayList;

    iget p2, p2, Lj8/d;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-static {p3}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :pswitch_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    :goto_2
    iget-object p3, p1, Lk6/v6;->c:Ljava/lang/Object;

    check-cast p3, Lv6/d;

    invoke-virtual {p3}, Lv6/d;->f()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p3, Lv6/d;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/logging/Logger;

    iget-object p3, p3, Lv6/d;->c:Ljava/lang/Object;

    check-cast p3, Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, La7/a;->H(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " HEADERS: streamId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " headers="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " endStream="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, p3, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_3
    iget-object p3, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p3, Lh8/n;

    iget p3, p3, Lh8/n;->M:I

    const v4, 0x7fffffff

    if-eq p3, v4, :cond_6

    const-wide/16 v4, 0x0

    move p3, v1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    if-ge p3, v6, :cond_4

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj8/c;

    iget-object v7, v6, Lj8/c;->a:Lja/j;

    invoke-virtual {v7}, Lja/j;->d()I

    move-result v7

    add-int/lit8 v7, v7, 0x20

    iget-object v6, v6, Lj8/c;->b:Lja/j;

    invoke-virtual {v6}, Lja/j;->d()I

    move-result v6

    add-int/2addr v6, v7

    int-to-long v6, v6

    add-long/2addr v4, v6

    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_4
    const-wide/32 v6, 0x7fffffff

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int p3, v4

    iget-object v4, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v4, Lh8/n;

    iget v4, v4, Lh8/n;->M:I

    if-le p3, v4, :cond_6

    sget-object v0, Le8/c2;->k:Le8/c2;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Response %s metadata larger than %d: %d"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    if-eqz v2, :cond_5

    const-string v8, "trailer"

    goto :goto_4

    :cond_5
    const-string v8, "header"

    :goto_4
    aput-object v8, v7, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v7, v3

    const/4 v4, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v7, v4

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    :cond_6
    iget-object p3, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p3, Lh8/n;

    iget-object p3, p3, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter p3

    :try_start_0
    iget-object v4, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v4, Lh8/n;

    iget-object v4, v4, Lh8/n;->n:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/l;

    if-nez v4, :cond_8

    iget-object p2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p4}, Lh8/n;->n(I)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p2, Lh8/n;

    iget-object p2, p2, Lh8/n;->i:Lh8/e;

    sget-object v0, Lj8/a;->f:Lj8/a;

    invoke-virtual {p2, p4, v0}, Lh8/e;->o(ILj8/a;)V

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_7
    move v1, v3

    goto :goto_5

    :cond_8
    if-nez v0, :cond_9

    iget-object v0, v4, Lh8/l;->n:Lh8/k;

    iget-object v0, v0, Lh8/k;->J:Lo8/c;

    sget-object v0, Lo8/b;->a:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v4, Lh8/l;->n:Lh8/k;

    invoke-virtual {v0, p2, v2}, Lh8/k;->q(Ljava/util/List;Z)V

    goto :goto_5

    :cond_9
    if-nez v2, :cond_a

    iget-object p2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p2, Lh8/n;

    iget-object p2, p2, Lh8/n;->i:Lh8/e;

    sget-object v2, Lj8/a;->p:Lj8/a;

    invoke-virtual {p2, p4, v2}, Lh8/e;->o(ILj8/a;)V

    :cond_a
    iget-object p2, v4, Lh8/l;->n:Lh8/k;

    new-instance v2, Le8/l1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, v2, v0, v1}, Lg8/a;->h(Le8/l1;Le8/c2;Z)V

    :goto_5
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_b

    iget-object p1, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p1, Lh8/n;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Received header for unknown stream: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lh8/n;->g(Lh8/n;Ljava/lang/String;)V

    :cond_b
    return-void

    :goto_6
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_c
    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lk6/v6;IBI)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p4, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-eqz v1, :cond_0

    iget-object v0, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v0}, Lja/i;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    :cond_0
    iget-object v1, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v1}, Lja/i;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    add-int/lit8 p2, p2, -0x4

    invoke-static {p2, p3, v0}, Lj8/k;->b(IBS)I

    move-result p2

    iget-object v2, p0, Lj8/i;->b:Lj8/g;

    iput p2, v2, Lj8/g;->e:I

    iput p2, v2, Lj8/g;->b:I

    iput-short v0, v2, Lj8/g;->f:S

    iput-byte p3, v2, Lj8/g;->c:B

    iput p4, v2, Lj8/g;->d:I

    iget-object p2, p0, Lj8/i;->c:Lj8/d;

    invoke-virtual {p2}, Lj8/d;->k()V

    iget-object p3, p2, Lj8/d;->d:Ljava/util/ArrayList;

    iget p2, p2, Lj8/d;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-static {p3}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :pswitch_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object p3, p1, Lk6/v6;->c:Ljava/lang/Object;

    check-cast p3, Lv6/d;

    invoke-virtual {p3}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p3, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object p3, p3, Lv6/d;->c:Ljava/lang/Object;

    check-cast p3, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x1

    invoke-static {v3}, La7/a;->H(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " PUSH_PROMISE: streamId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " promisedStreamId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " headers="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p3, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_1
    iget-object p2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p2, Lh8/n;

    iget-object p2, p2, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object p1, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p1, Lh8/n;

    iget-object p1, p1, Lh8/n;->i:Lh8/e;

    sget-object p3, Lj8/a;->c:Lj8/a;

    invoke-virtual {p1, p4, p3}, Lh8/e;->o(ILj8/a;)V

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lk6/v6;II)V
    .locals 10

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-ne p2, v2, :cond_8

    const/4 v2, 0x0

    if-eqz p3, :cond_7

    iget-object v4, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v4}, Lja/i;->readInt()I

    move-result v4

    invoke-static {}, Lj8/a;->values()[Lj8/a;

    move-result-object v5

    array-length v6, v5

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    iget v9, v8, Lj8/a;->a:I

    if-ne v9, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v3

    :goto_1
    if-eqz v8, :cond_6

    iget-object v3, p1, Lk6/v6;->c:Ljava/lang/Object;

    check-cast v3, Lv6/d;

    const/4 v4, 0x1

    invoke-virtual {v3, v4, p3, v8}, Lv6/d;->j(IILj8/a;)V

    invoke-static {v8}, Lh8/n;->w(Lj8/a;)Le8/c2;

    move-result-object v3

    const-string v5, "Rst Stream"

    invoke-virtual {v3, v5}, Le8/c2;->a(Ljava/lang/String;)Le8/c2;

    move-result-object v3

    iget-object v5, v3, Le8/c2;->a:Le8/z1;

    sget-object v6, Le8/z1;->d:Le8/z1;

    if-eq v5, v6, :cond_3

    sget-object v6, Le8/z1;->n:Le8/z1;

    if-ne v5, v6, :cond_2

    goto :goto_2

    :cond_2
    move v4, v2

    :cond_3
    :goto_2
    iget-object v2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    iget-object v7, v2, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    iget-object v2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v2, Lh8/n;

    iget-object v2, v2, Lh8/n;->n:Ljava/util/HashMap;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/l;

    if-eqz v2, :cond_5

    iget-object v2, v2, Lh8/l;->n:Lh8/k;

    iget-object v2, v2, Lh8/k;->J:Lo8/c;

    sget-object v2, Lo8/b;->a:Lo8/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    sget-object v2, Lj8/a;->o:Lj8/a;

    if-ne v8, v2, :cond_4

    sget-object v2, Lg8/i0;->b:Lg8/i0;

    :goto_3
    move-object v5, v2

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_4
    sget-object v2, Lg8/i0;->a:Lg8/i0;

    goto :goto_3

    :goto_4
    const/4 v6, 0x0

    const/4 v8, 0x0

    move v1, p3

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Lh8/n;->j(ILe8/c2;Lg8/i0;ZLj8/a;Le8/l1;)V

    :cond_5
    monitor-exit v7

    return-void

    :goto_5
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    const-string v0, "TYPE_RST_STREAM unexpected error code: %d"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3

    :cond_7
    const-string v0, "TYPE_RST_STREAM streamId == 0"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3

    :cond_8
    const-string v0, "TYPE_RST_STREAM length: %d != 4"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3
.end method

.method public final p(Lk6/v6;IBI)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p4, :cond_e

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :cond_1
    rem-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_d

    new-instance p3, La4/k;

    invoke-direct {p3, p4}, La4/k;-><init>(I)V

    move v2, v1

    :goto_0
    const/4 v3, 0x4

    const/4 v4, 0x7

    if-ge v2, p2, :cond_6

    iget-object v5, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v5}, Lja/i;->readShort()S

    move-result v5

    iget-object v6, p0, Lj8/i;->a:Lja/i;

    invoke-interface {v6}, Lja/i;->readInt()I

    move-result v6

    packed-switch v5, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    const/16 v3, 0x4000

    if-lt v6, v3, :cond_2

    const v3, 0xffffff

    if-gt v6, v3, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :pswitch_1
    if-ltz v6, :cond_3

    move v3, v4

    goto :goto_2

    :cond_3
    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :pswitch_2
    if-eqz v6, :cond_5

    if-ne v6, p4, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :cond_5
    :goto_1
    :pswitch_3
    move v3, v5

    :goto_2
    :pswitch_4
    invoke-virtual {p3, v3, v6}, La4/k;->b(II)V

    :goto_3
    add-int/lit8 v2, v2, 0x6

    goto :goto_0

    :cond_6
    iget-object p2, p1, Lk6/v6;->c:Ljava/lang/Object;

    check-cast p2, Lv6/d;

    invoke-virtual {p2, p4, p3}, Lv6/d;->k(ILa4/k;)V

    iget-object p2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p2, Lh8/n;

    iget-object v2, p2, Lh8/n;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {p3, v3}, La4/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p3, La4/k;->d:[I

    aget p2, p2, v3

    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iput p2, v0, Lh8/n;->D:I

    :cond_7
    invoke-virtual {p3, v4}, La4/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p3, La4/k;->d:[I

    aget p2, p2, v4

    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->j:Ly5/o;

    invoke-virtual {v0, p2}, Ly5/o;->c(I)Z

    move-result p2

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_8
    move p2, v1

    :goto_4
    iget-boolean v0, p1, Lk6/v6;->b:Z

    if-eqz v0, :cond_9

    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->h:Lg8/t3;

    invoke-interface {v0}, Lg8/t3;->c()V

    iput-boolean v1, p1, Lk6/v6;->b:Z

    :cond_9
    iget-object v0, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast v0, Lh8/n;

    iget-object v0, v0, Lh8/n;->i:Lh8/e;

    invoke-virtual {v0, p3}, Lh8/e;->D(La4/k;)V

    if-eqz p2, :cond_a

    iget-object p2, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p2, Lh8/n;

    iget-object p2, p2, Lh8/n;->j:Ly5/o;

    invoke-virtual {p2}, Ly5/o;->e()V

    :cond_a
    iget-object p1, p1, Lk6/v6;->e:Ljava/lang/Object;

    check-cast p1, Lh8/n;

    invoke-virtual {p1}, Lh8/n;->t()Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget p1, p3, La4/k;->a:I

    and-int/lit8 p2, p1, 0x2

    if-eqz p2, :cond_c

    iget-object p2, p3, La4/k;->d:[I

    aget p2, p2, p4

    if-ltz p2, :cond_c

    iget-object p3, p0, Lj8/i;->c:Lj8/d;

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_b

    goto :goto_5

    :cond_b
    const/4 p2, -0x1

    :goto_5
    iput p2, p3, Lj8/d;->b:I

    iput p2, p3, Lj8/d;->c:I

    invoke-virtual {p3}, Lj8/d;->a()V

    :cond_c
    return-void

    :goto_6
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_d
    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :cond_e
    const-string p1, "TYPE_SETTINGS streamId != 0"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
