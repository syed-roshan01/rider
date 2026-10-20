.class public final Lea/u;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final e:Lx9/v;

.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lja/i;

.field public final b:Z

.field public final c:Lea/t;

.field public final d:Lj8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx9/v;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx9/v;-><init>(II)V

    sput-object v0, Lea/u;->e:Lx9/v;

    const-class v0, Lea/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(Http2::class.java.name)"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lea/u;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lja/i;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/u;->a:Lja/i;

    iput-boolean p2, p0, Lea/u;->b:Z

    new-instance p2, Lea/t;

    invoke-direct {p2, p1}, Lea/t;-><init>(Lja/i;)V

    iput-object p2, p0, Lea/u;->c:Lea/t;

    new-instance p1, Lj8/d;

    invoke-direct {p1, p2}, Lj8/d;-><init>(Lea/t;)V

    iput-object p1, p0, Lea/u;->d:Lj8/d;

    return-void
.end method


# virtual methods
.method public final a(ZLea/l;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "handler"

    invoke-static {v0, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v1, Lea/u;->a:Lja/i;

    const-wide/16 v4, 0x9

    invoke-interface {v3, v4, v5}, Lja/i;->S(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v1, Lea/u;->a:Lja/i;

    invoke-static {v3}, Ly9/b;->q(Lja/i;)I

    move-result v3

    const/16 v4, 0x4000

    if-gt v3, v4, :cond_2e

    iget-object v5, v1, Lea/u;->a:Lja/i;

    invoke-interface {v5}, Lja/i;->readByte()B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    iget-object v6, v1, Lea/u;->a:Lja/i;

    invoke-interface {v6}, Lja/i;->readByte()B

    move-result v6

    and-int/lit16 v7, v6, 0xff

    iget-object v8, v1, Lea/u;->a:Lja/i;

    invoke-interface {v8}, Lja/i;->readInt()I

    move-result v8

    const v9, 0x7fffffff

    and-int v13, v8, v9

    sget-object v9, Lea/u;->f:Ljava/util/logging/Logger;

    sget-object v10, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v9, v10}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v10

    const/4 v15, 0x1

    if-eqz v10, :cond_0

    invoke-static {v13, v3, v5, v7, v15}, Lea/e;->a(IIIIZ)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/4 v9, 0x4

    if-eqz p1, :cond_3

    if-ne v5, v9, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a SETTINGS frame but was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lea/e;->b:[Ljava/lang/String;

    array-length v4, v3

    if-ge v5, v4, :cond_2

    aget-object v3, v3, v5

    goto :goto_0

    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "0x%02x"

    invoke-static {v4, v3}, Ly9/b;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/4 v14, 0x2

    const/16 v10, 0x8

    const-wide/16 v11, 0x0

    packed-switch v5, :pswitch_data_0

    iget-object v0, v1, Lea/u;->a:Lja/i;

    int-to-long v2, v3

    invoke-interface {v0, v2, v3}, Lja/i;->l(J)V

    :cond_4
    :goto_2
    move v2, v15

    goto/16 :goto_c

    :pswitch_0
    if-ne v3, v9, :cond_8

    iget-object v2, v1, Lea/u;->a:Lja/i;

    invoke-interface {v2}, Lja/i;->readInt()I

    move-result v2

    int-to-long v2, v2

    const-wide/32 v4, 0x7fffffff

    and-long/2addr v2, v4

    cmp-long v4, v2, v11

    if-eqz v4, :cond_7

    if-nez v13, :cond_5

    iget-object v4, v0, Lea/l;->b:Lea/r;

    monitor-enter v4

    :try_start_1
    iget-wide v5, v4, Lea/r;->D:J

    add-long/2addr v5, v2

    iput-wide v5, v4, Lea/r;->D:J

    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_5
    iget-object v0, v0, Lea/l;->b:Lea/r;

    invoke-virtual {v0, v13}, Lea/r;->e(I)Lea/y;

    move-result-object v5

    if-eqz v5, :cond_4

    monitor-enter v5

    :try_start_2
    iget-wide v6, v5, Lea/y;->f:J

    add-long/2addr v6, v2

    iput-wide v6, v5, Lea/y;->f:J

    if-lez v4, :cond_6

    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_6
    monitor-exit v5

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "windowSizeIncrement was 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    invoke-static {v2, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    if-lt v3, v10, :cond_f

    if-nez v13, :cond_e

    iget-object v4, v1, Lea/u;->a:Lja/i;

    invoke-interface {v4}, Lja/i;->readInt()I

    move-result v4

    iget-object v5, v1, Lea/u;->a:Lja/i;

    invoke-interface {v5}, Lja/i;->readInt()I

    move-result v5

    sub-int/2addr v3, v10

    invoke-static {}, Lea/b;->values()[Lea/b;

    move-result-object v6

    array-length v7, v6

    move v8, v2

    :goto_3
    if-ge v8, v7, :cond_a

    aget-object v9, v6, v8

    iget v10, v9, Lea/b;->a:I

    if-ne v10, v5, :cond_9

    move-object v10, v9

    goto :goto_4

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_a
    const/4 v10, 0x0

    :goto_4
    if-eqz v10, :cond_d

    sget-object v5, Lja/j;->d:Lja/j;

    if-lez v3, :cond_b

    iget-object v5, v1, Lea/u;->a:Lja/i;

    int-to-long v6, v3

    invoke-interface {v5, v6, v7}, Lja/i;->i(J)Lja/j;

    move-result-object v5

    :cond_b
    const-string v3, "debugData"

    invoke-static {v5, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lja/j;->d()I

    iget-object v3, v0, Lea/l;->b:Lea/r;

    monitor-enter v3

    :try_start_3
    iget-object v5, v3, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v6, v2, [Lea/y;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    iput-boolean v15, v3, Lea/r;->n:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v3

    check-cast v5, [Lea/y;

    array-length v3, v5

    :goto_5
    if-ge v2, v3, :cond_4

    aget-object v6, v5, v2

    iget v7, v6, Lea/y;->a:I

    if-le v7, v4, :cond_c

    invoke-virtual {v6}, Lea/y;->g()Z

    move-result v7

    if-eqz v7, :cond_c

    sget-object v7, Lea/b;->f:Lea/b;

    invoke-virtual {v6, v7}, Lea/y;->j(Lea/b;)V

    iget-object v7, v0, Lea/l;->b:Lea/r;

    iget v6, v6, Lea/y;->a:I

    invoke-virtual {v7, v6}, Lea/r;->f(I)Lea/y;

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY unexpected error code: "

    invoke-static {v2, v5}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY length < 8: "

    invoke-static {v2, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    if-ne v3, v10, :cond_15

    if-nez v13, :cond_14

    iget-object v2, v1, Lea/u;->a:Lja/i;

    invoke-interface {v2}, Lja/i;->readInt()I

    move-result v2

    iget-object v3, v1, Lea/u;->a:Lja/i;

    invoke-interface {v3}, Lja/i;->readInt()I

    move-result v3

    and-int/lit8 v4, v6, 0x1

    if-eqz v4, :cond_13

    iget-object v3, v0, Lea/l;->b:Lea/r;

    monitor-enter v3

    const-wide/16 v4, 0x1

    if-eq v2, v15, :cond_12

    if-eq v2, v14, :cond_11

    const/4 v0, 0x3

    if-eq v2, v0, :cond_10

    goto :goto_6

    :cond_10
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_7

    :cond_11
    iget-wide v6, v3, Lea/r;->w:J

    add-long/2addr v6, v4

    iput-wide v6, v3, Lea/r;->w:J

    goto :goto_6

    :cond_12
    iget-wide v6, v3, Lea/r;->u:J

    add-long/2addr v6, v4

    iput-wide v6, v3, Lea/r;->u:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_6
    monitor-exit v3

    goto/16 :goto_2

    :goto_7
    monitor-exit v3

    throw v0

    :cond_13
    iget-object v4, v0, Lea/l;->b:Lea/r;

    iget-object v4, v4, Lea/r;->p:Laa/c;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lea/l;->b:Lea/r;

    iget-object v6, v6, Lea/r;->d:Ljava/lang/String;

    const-string v7, " ping"

    invoke-static {v5, v6, v7}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, v0, Lea/l;->b:Lea/r;

    new-instance v6, Lea/j;

    invoke-direct {v6, v5, v0, v2, v3}, Lea/j;-><init>(Ljava/lang/String;Lea/r;II)V

    invoke-virtual {v4, v6, v11, v12}, Laa/c;->c(Laa/a;J)V

    goto/16 :goto_2

    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING length != 8: "

    invoke-static {v2, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    invoke-virtual {v1, v0, v3, v7, v13}, Lea/u;->g(Lea/l;III)V

    goto/16 :goto_2

    :pswitch_4
    if-nez v13, :cond_24

    and-int/lit8 v5, v6, 0x1

    if-eqz v5, :cond_17

    if-nez v3, :cond_16

    goto/16 :goto_2

    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    rem-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_23

    new-instance v5, Lea/c0;

    invoke-direct {v5}, Lea/c0;-><init>()V

    invoke-static {v2, v3}, Lz6/a;->s0(II)Li9/g;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lz6/a;->j0(Li9/g;I)Li9/e;

    move-result-object v2

    iget v3, v2, Li9/e;->a:I

    iget v6, v2, Li9/e;->b:I

    iget v2, v2, Li9/e;->c:I

    if-lez v2, :cond_18

    if-le v3, v6, :cond_19

    :cond_18
    if-gez v2, :cond_22

    if-gt v6, v3, :cond_22

    :cond_19
    :goto_8
    iget-object v7, v1, Lea/u;->a:Lja/i;

    invoke-interface {v7}, Lja/i;->readShort()S

    move-result v8

    sget-object v10, Ly9/b;->a:[B

    const v10, 0xffff

    and-int/2addr v8, v10

    invoke-interface {v7}, Lja/i;->readInt()I

    move-result v7

    if-eq v8, v14, :cond_1f

    const/4 v10, 0x3

    if-eq v8, v10, :cond_1e

    if-eq v8, v9, :cond_1c

    const/4 v13, 0x5

    if-eq v8, v13, :cond_1a

    goto :goto_9

    :cond_1a
    if-lt v7, v4, :cond_1b

    const v13, 0xffffff

    if-gt v7, v13, :cond_1b

    goto :goto_9

    :cond_1b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    invoke-static {v2, v7}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    if-ltz v7, :cond_1d

    const/4 v8, 0x7

    goto :goto_9

    :cond_1d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    move v8, v9

    goto :goto_9

    :cond_1f
    const/4 v10, 0x3

    if-eqz v7, :cond_21

    if-ne v7, v15, :cond_20

    goto :goto_9

    :cond_20
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    :goto_9
    invoke-virtual {v5, v8, v7}, Lea/c0;->c(II)V

    if-eq v3, v6, :cond_22

    add-int/2addr v3, v2

    goto :goto_8

    :cond_22
    iget-object v2, v0, Lea/l;->b:Lea/r;

    iget-object v3, v2, Lea/r;->p:Laa/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lea/r;->d:Ljava/lang/String;

    const-string v6, " applyAndAckSettings"

    invoke-static {v4, v2, v6}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lea/k;

    invoke-direct {v4, v2, v0, v5}, Lea/k;-><init>(Ljava/lang/String;Lea/l;Lea/c0;)V

    invoke-virtual {v3, v4, v11, v12}, Laa/c;->c(Laa/a;J)V

    goto/16 :goto_2

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS length % 6 != 0: "

    invoke-static {v2, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    if-ne v3, v9, :cond_2a

    if-eqz v13, :cond_29

    iget-object v3, v1, Lea/u;->a:Lja/i;

    invoke-interface {v3}, Lja/i;->readInt()I

    move-result v3

    invoke-static {}, Lea/b;->values()[Lea/b;

    move-result-object v4

    array-length v5, v4

    :goto_a
    if-ge v2, v5, :cond_26

    aget-object v6, v4, v2

    iget v7, v6, Lea/b;->a:I

    if-ne v7, v3, :cond_25

    move-object v14, v6

    goto :goto_b

    :cond_25
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_26
    const/4 v14, 0x0

    :goto_b
    if-eqz v14, :cond_28

    iget-object v0, v0, Lea/l;->b:Lea/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v13, :cond_27

    and-int/lit8 v2, v8, 0x1

    if-nez v2, :cond_27

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onReset"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lea/o;

    const/4 v4, 0x0

    move-object v10, v3

    move-wide v5, v11

    move-object v11, v2

    move-object v12, v0

    move v2, v15

    move v15, v4

    invoke-direct/range {v10 .. v15}, Lea/o;-><init>(Ljava/lang/String;Lea/r;ILjava/lang/Object;I)V

    iget-object v0, v0, Lea/r;->q:Laa/c;

    invoke-virtual {v0, v3, v5, v6}, Laa/c;->c(Laa/a;J)V

    goto :goto_c

    :cond_27
    move v2, v15

    invoke-virtual {v0, v13}, Lea/r;->f(I)Lea/y;

    move-result-object v0

    if-eqz v0, :cond_2d

    invoke-virtual {v0, v14}, Lea/y;->j(Lea/b;)V

    goto :goto_c

    :cond_28
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM unexpected error code: "

    invoke-static {v2, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM length: "

    const-string v4, " != 4"

    invoke-static {v2, v3, v4}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    move v2, v15

    const/4 v0, 0x5

    if-ne v3, v0, :cond_2c

    if-eqz v13, :cond_2b

    iget-object v0, v1, Lea/u;->a:Lja/i;

    invoke-interface {v0}, Lja/i;->readInt()I

    invoke-interface {v0}, Lja/i;->readByte()B

    goto :goto_c

    :cond_2b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY length: "

    const-string v4, " != 5"

    invoke-static {v2, v3, v4}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    move v2, v15

    invoke-virtual {v1, v0, v3, v7, v13}, Lea/u;->f(Lea/l;III)V

    goto :goto_c

    :pswitch_8
    move v2, v15

    invoke-virtual {v1, v0, v3, v7, v13}, Lea/u;->e(Lea/l;III)V

    :cond_2d
    :goto_c
    return v2

    :cond_2e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR: "

    invoke-static {v2, v3}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

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

.method public final b(Lea/l;)V
    .locals 4

    const-string v0, "handler"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lea/u;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lea/u;->a(ZLea/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Required SETTINGS preface not received"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lea/e;->a:Lja/j;

    iget-object v0, p1, Lja/j;->a:[B

    array-length v0, v0

    int-to-long v0, v0

    iget-object v2, p0, Lea/u;->a:Lja/i;

    invoke-interface {v2, v0, v1}, Lja/i;->i(J)Lja/j;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v2, Lea/u;->f:Ljava/util/logging/Logger;

    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "<< CONNECTION "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lja/j;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ly9/b;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v0}, Lja/j;->t()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expected a connection header but was "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lea/u;->a:Lja/i;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final e(Lea/l;III)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p3

    move/from16 v5, p4

    if-eqz v5, :cond_f

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    and-int/lit8 v3, v2, 0x20

    if-nez v3, :cond_e

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_1

    iget-object v3, v1, Lea/u;->a:Lja/i;

    invoke-interface {v3}, Lja/i;->readByte()B

    move-result v3

    sget-object v7, Ly9/b;->a:[B

    and-int/lit16 v3, v3, 0xff

    move v9, v3

    move/from16 v3, p2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    const/4 v9, 0x0

    :goto_1
    invoke-static {v3, v2, v9}, Lx9/v;->D(III)I

    move-result v7

    iget-object v2, v1, Lea/u;->a:Lja/i;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "source"

    invoke-static {v2, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lea/l;->b:Lea/r;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_2

    and-int/lit8 v3, v5, 0x1

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    const-wide/16 v10, 0x0

    if-eqz v3, :cond_3

    iget-object v0, v0, Lea/l;->b:Lea/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lja/g;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    int-to-long v3, v7

    invoke-interface {v2, v3, v4}, Lja/i;->S(J)V

    invoke-interface {v2, v6, v3, v4}, Lja/g0;->I(Lja/g;J)J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v12, Lea/m;

    move-object v2, v12

    move-object v4, v0

    move/from16 v5, p4

    invoke-direct/range {v2 .. v8}, Lea/m;-><init>(Ljava/lang/String;Lea/r;ILja/g;IZ)V

    iget-object v0, v0, Lea/r;->q:Laa/c;

    invoke-virtual {v0, v12, v10, v11}, Laa/c;->c(Laa/a;J)V

    goto/16 :goto_9

    :cond_3
    iget-object v3, v0, Lea/l;->b:Lea/r;

    invoke-virtual {v3, v5}, Lea/r;->e(I)Lea/y;

    move-result-object v3

    if-nez v3, :cond_4

    iget-object v3, v0, Lea/l;->b:Lea/r;

    sget-object v4, Lea/b;->c:Lea/b;

    invoke-virtual {v3, v5, v4}, Lea/r;->u(ILea/b;)V

    iget-object v0, v0, Lea/l;->b:Lea/r;

    int-to-long v3, v7

    invoke-virtual {v0, v3, v4}, Lea/r;->p(J)V

    invoke-interface {v2, v3, v4}, Lja/i;->l(J)V

    goto/16 :goto_9

    :cond_4
    sget-object v0, Ly9/b;->a:[B

    iget-object v0, v3, Lea/y;->i:Lea/w;

    int-to-long v12, v7

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v14, v12

    :goto_3
    cmp-long v5, v14, v10

    if-lez v5, :cond_c

    iget-object v5, v0, Lea/w;->f:Lea/y;

    monitor-enter v5

    :try_start_0
    iget-boolean v7, v0, Lea/w;->b:Z

    iget-object v4, v0, Lea/w;->d:Lja/g;

    iget-wide v10, v4, Lja/g;->b:J

    add-long/2addr v10, v14

    move/from16 p1, v7

    iget-wide v6, v0, Lea/w;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    cmp-long v6, v10, v6

    if-lez v6, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    monitor-exit v5

    if-eqz v6, :cond_6

    invoke-interface {v2, v14, v15}, Lja/i;->l(J)V

    iget-object v0, v0, Lea/w;->f:Lea/y;

    sget-object v2, Lea/b;->e:Lea/b;

    invoke-virtual {v0, v2}, Lea/y;->e(Lea/b;)V

    goto :goto_8

    :cond_6
    if-eqz p1, :cond_7

    invoke-interface {v2, v14, v15}, Lja/i;->l(J)V

    goto :goto_8

    :cond_7
    iget-object v5, v0, Lea/w;->c:Lja/g;

    invoke-interface {v2, v5, v14, v15}, Lja/g0;->I(Lja/g;J)J

    move-result-wide v5

    const-wide/16 v10, -0x1

    cmp-long v7, v5, v10

    if-eqz v7, :cond_b

    sub-long/2addr v14, v5

    iget-object v5, v0, Lea/w;->f:Lea/y;

    monitor-enter v5

    :try_start_1
    iget-boolean v6, v0, Lea/w;->e:Z

    if-eqz v6, :cond_8

    iget-object v6, v0, Lea/w;->c:Lja/g;

    invoke-virtual {v6}, Lja/g;->a()V

    const-wide/16 v16, 0x0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_8
    iget-object v6, v0, Lea/w;->d:Lja/g;

    iget-wide v10, v6, Lja/g;->b:J

    const-wide/16 v16, 0x0

    cmp-long v7, v10, v16

    if-nez v7, :cond_9

    const/4 v7, 0x1

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    :goto_5
    iget-object v10, v0, Lea/w;->c:Lja/g;

    invoke-virtual {v6, v10}, Lja/g;->g0(Lja/g0;)V

    if-eqz v7, :cond_a

    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_a
    :goto_6
    monitor-exit v5

    move-wide/from16 v10, v16

    goto :goto_3

    :goto_7
    monitor-exit v5

    throw v0

    :cond_b
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_c
    sget-object v2, Ly9/b;->a:[B

    iget-object v0, v0, Lea/w;->f:Lea/y;

    iget-object v0, v0, Lea/y;->b:Lea/r;

    invoke-virtual {v0, v12, v13}, Lea/r;->p(J)V

    :goto_8
    if-eqz v8, :cond_d

    sget-object v0, Ly9/b;->b:Lx9/q;

    const/4 v2, 0x1

    invoke-virtual {v3, v0, v2}, Lea/y;->i(Lx9/q;Z)V

    :cond_d
    :goto_9
    iget-object v0, v1, Lea/u;->a:Lja/i;

    int-to-long v2, v9

    invoke-interface {v0, v2, v3}, Lja/i;->l(J)V

    return-void

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(Lea/l;III)V
    .locals 10

    if-eqz p4, :cond_9

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x8

    if-eqz v3, :cond_1

    iget-object v3, p0, Lea/u;->a:Lja/i;

    invoke-interface {v3}, Lja/i;->readByte()B

    move-result v3

    sget-object v4, Ly9/b;->a:[B

    and-int/lit16 v3, v3, 0xff

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, p3, 0x20

    if-eqz v4, :cond_2

    iget-object v4, p0, Lea/u;->a:Lja/i;

    invoke-interface {v4}, Lja/i;->readInt()I

    invoke-interface {v4}, Lja/i;->readByte()B

    sget-object v4, Ly9/b;->a:[B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, -0x5

    :cond_2
    invoke-static {p2, p3, v3}, Lx9/v;->D(III)I

    move-result p2

    iget-object v4, p0, Lea/u;->c:Lea/t;

    iput p2, v4, Lea/t;->e:I

    iput p2, v4, Lea/t;->b:I

    iput v3, v4, Lea/t;->f:I

    iput p3, v4, Lea/t;->c:I

    iput p4, v4, Lea/t;->d:I

    iget-object p2, p0, Lea/u;->d:Lj8/d;

    invoke-virtual {p2}, Lj8/d;->k()V

    iget-object p3, p2, Lj8/d;->d:Ljava/util/ArrayList;

    iget p2, p2, Lj8/d;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-static {p3}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    :goto_2
    move-object v7, p2

    goto :goto_3

    :pswitch_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, Lea/l;->b:Lea/r;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p4, :cond_3

    and-int/lit8 p2, p4, 0x1

    if-nez p2, :cond_3

    move v1, v2

    :cond_3
    const-wide/16 p2, 0x0

    const/16 v9, 0x5b

    if-eqz v1, :cond_4

    iget-object p1, p1, Lea/l;->b:Lea/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lea/n;

    move-object v3, v1

    move-object v5, p1

    move v6, p4

    move v8, v0

    invoke-direct/range {v3 .. v8}, Lea/n;-><init>(Ljava/lang/String;Lea/r;ILjava/util/List;Z)V

    iget-object p1, p1, Lea/r;->q:Laa/c;

    invoke-virtual {p1, v1, p2, p3}, Laa/c;->c(Laa/a;J)V

    goto/16 :goto_4

    :cond_4
    iget-object p1, p1, Lea/l;->b:Lea/r;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p4}, Lea/r;->e(I)Lea/y;

    move-result-object v1

    if-nez v1, :cond_8

    iget-boolean v1, p1, Lea/r;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    monitor-exit p1

    goto :goto_4

    :cond_5
    :try_start_1
    iget v1, p1, Lea/r;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p4, v1, :cond_6

    monitor-exit p1

    goto :goto_4

    :cond_6
    :try_start_2
    rem-int/lit8 v1, p4, 0x2

    iget v3, p1, Lea/r;->f:I

    rem-int/lit8 v3, v3, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v1, v3, :cond_7

    monitor-exit p1

    goto :goto_4

    :cond_7
    :try_start_3
    invoke-static {v7}, Ly9/b;->s(Ljava/util/List;)Lx9/q;

    move-result-object v8

    new-instance v1, Lea/y;

    const/4 v6, 0x0

    move-object v3, v1

    move v4, p4

    move-object v5, p1

    move v7, v0

    invoke-direct/range {v3 .. v8}, Lea/y;-><init>(ILea/r;ZZLx9/q;)V

    iput p4, p1, Lea/r;->e:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p1, Lea/r;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lea/r;->o:Laa/f;

    invoke-virtual {v0}, Laa/f;->f()Laa/c;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p1, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "] onStream"

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance v3, Lea/i;

    invoke-direct {v3, p4, p1, v1, v2}, Lea/i;-><init>(Ljava/lang/String;Lea/r;Ljava/lang/Object;I)V

    invoke-virtual {v0, v3, p2, p3}, Laa/c;->c(Laa/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p1

    goto :goto_4

    :catchall_0
    move-exception p2

    goto :goto_5

    :cond_8
    monitor-exit p1

    invoke-static {v7}, Ly9/b;->s(Ljava/util/List;)Lx9/q;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lea/y;->i(Lx9/q;Z)V

    :goto_4
    return-void

    :goto_5
    monitor-exit p1

    throw p2

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lea/l;III)V
    .locals 9

    if-eqz p4, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Lea/u;->a:Lja/i;

    invoke-interface {v0}, Lja/i;->readByte()B

    move-result v0

    sget-object v1, Ly9/b;->a:[B

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lea/u;->a:Lja/i;

    invoke-interface {v1}, Lja/i;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int v6, v1, v2

    add-int/lit8 p2, p2, -0x4

    invoke-static {p2, p3, v0}, Lx9/v;->D(III)I

    move-result p2

    iget-object v1, p0, Lea/u;->c:Lea/t;

    iput p2, v1, Lea/t;->e:I

    iput p2, v1, Lea/t;->b:I

    iput v0, v1, Lea/t;->f:I

    iput p3, v1, Lea/t;->c:I

    iput p4, v1, Lea/t;->d:I

    iget-object p2, p0, Lea/u;->d:Lj8/d;

    invoke-virtual {p2}, Lj8/d;->k()V

    iget-object p3, p2, Lj8/d;->d:Ljava/util/ArrayList;

    iget p2, p2, Lj8/d;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-static {p3}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    :goto_1
    move-object v7, p2

    goto :goto_2

    :pswitch_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p1, Lea/l;->b:Lea/r;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v5

    :try_start_0
    iget-object p1, v5, Lea/r;->H:Ljava/util/LinkedHashSet;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lea/b;->c:Lea/b;

    invoke-virtual {v5, v6, p1}, Lea/r;->u(ILea/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :try_start_1
    iget-object p1, v5, Lea/r;->H:Ljava/util/LinkedHashSet;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v5

    iget-object p1, v5, Lea/r;->q:Laa/c;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, v5, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x5b

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] onRequest"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance p2, Lea/o;

    const/4 v8, 0x2

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Lea/o;-><init>(Ljava/lang/String;Lea/r;ILjava/lang/Object;I)V

    const-wide/16 p3, 0x0

    invoke-virtual {p1, p2, p3, p4}, Laa/c;->c(Laa/a;J)V

    :goto_3
    return-void

    :goto_4
    monitor-exit v5

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
