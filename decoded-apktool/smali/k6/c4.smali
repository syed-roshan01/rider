.class public final Lk6/c4;
.super Ljava/lang/Object;


# static fields
.field public static final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final d:Ljava/util/concurrent/atomic/AtomicReference;

.field private static final short:[S


# instance fields
.field public final a:Lk6/g5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/c4;->short:[S

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lk6/c4;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lk6/c4;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lk6/c4;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    nop

    :array_0
    .array-data 2
        0x82fs
        0x2d0s
        0xa0es
        0xa39s
        0xa22s
        0xa28s
        0xa20s
        0xa29s
        0xa17s
        0xa37s
        0x603s
        0x60fs
        0x70es
        0x6f6s
        0x6d6s
        0xb3cs
        0xb21s
        0xb3as
        0xb34s
        0xb3as
        0xb3ds
        0xb6es
        0x670s
        0x632s
        0x63ds
        0x631s
        0x639s
        0x661s
        0xc7cs
        0xc20s
        0xc31s
        0xc22s
        0xc31s
        0xc3ds
        0xc23s
        0xc6ds
        0x3efs
        0x3e9s
        0x931s
        0xac8s
        0xac4s
        0x941s
        0x5eas
        0x5d0s
        0x5cds
        0x5c5s
        0x5eas
        0x12fs
        0x132s
        0x13as
        0x12fs
        0x138s
        0x123s
        0x127s
        0x12fs
        0x124s
        0x13es
        0x115s
        0x123s
        0x12es
        0x162s
        0xa2bs
    .end array-data
.end method

.method public constructor <init>(Lk6/g5;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/c4;->a:Lk6/g5;

    invoke-static {}, Landroidx/activity/ۣۧۧۢ;->۟ۢۥۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "oP0aNkXdwLSM2TDrUPpINq"

    invoke-static {v0}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->۟ۡۥۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static c(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/String;
    .locals 7

    const/4 v1, 0x0

    const/4 v0, 0x1

    invoke-static {p3}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    array-length v3, p1

    array-length v4, p2

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne v3, v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move v0, v1

    :sswitch_5
    invoke-static {v0}, Le2/۟۟ۥۦ;->۠ۥۣۦ(Z)V

    :sswitch_6
    array-length v2, p1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-ge v1, v2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    aget-object v2, p1, v1

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eq p0, v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    const v0, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_d
    const v0, 0xbf39

    goto :goto_4

    :sswitch_e
    if-eqz p0, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_f
    invoke-static {p0, v2}, Lf0/ۣۤ۠۟;->ۨۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-eqz v2, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_5

    :sswitch_12
    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_13
    monitor-enter p3

    :try_start_0
    invoke-static {p3}, Lz7/۠ۡ۟ۦ;->۟۟ۡۧۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v2, 0xc601

    :goto_7
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_7

    :sswitch_14
    if-nez v0, :cond_5

    const v2, 0xc65e

    goto :goto_7

    :sswitch_15
    const v0, 0xc29d

    goto :goto_6

    :sswitch_16
    sget v0, La8/ۡۦۨۡ;->ۧۡۦۡ:I

    xor-int/lit16 v0, v0, 0x370

    add-int/2addr v1, v0

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_8

    :cond_5
    :sswitch_18
    const v2, 0xc63f

    goto :goto_7

    :sswitch_19
    :try_start_1
    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p3, v0}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xc67d

    :goto_9
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :sswitch_1a
    move-object v2, v0

    :goto_a
    aget-object v3, v2, v1

    const v0, 0xca00

    :goto_b
    const v4, 0xca11

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :cond_6
    :sswitch_1b
    const v0, 0xca3e

    goto :goto_b

    :sswitch_1c
    const v2, 0xc69c

    goto :goto_9

    :catchall_0
    move-exception v0

    const v1, 0xc984

    :goto_c
    const v2, 0xc995

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_b

    goto :goto_c

    :sswitch_1d
    const v1, 0xc9a3

    goto :goto_c

    :sswitch_1e
    if-nez v3, :cond_6

    const v0, 0xca5d

    goto :goto_b

    :sswitch_1f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, p2, v1

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/16 v6, 0x807

    invoke-static {v3, v4, v5, v6}, Lp4/ۣ۟۟ۢۥ;->ۦۣۨۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-object v3, p1, v1

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/16 v6, 0x2f9

    invoke-static {v3, v4, v5, v6}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣ۟۠ۨۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    :sswitch_20
    aget-object p0, v2, v1

    monitor-exit p3

    :sswitch_21
    return-object p0

    :sswitch_22
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :sswitch_23
    move-object v2, v0

    goto :goto_a

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_21
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_13
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_16
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x13 -> :sswitch_14
        0x2d -> :sswitch_23
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_6
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xe -> :sswitch_1b
        0x11 -> :sswitch_1e
        0x2f -> :sswitch_20
        0x4c -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_22
    .end sparse-switch
.end method

.method public static ۟ۤۤۤۤ()[S
    .locals 2

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lk6/c4;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 8

    const/4 v7, 0x1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {p0}, Lfa/ۢۤۢ۟;->ۣۣ۟ۨۥ(Ljava/lang/Object;)Lk6/g5;

    move-result-object v0

    invoke-static {v0}, Le0/ۦۣ۟۠;->۟ۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {p1}, Lx8/ۢۨۥۨ;->ۣۥۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/4 v1, 0x2

    sget v3, Ln7/۟ۤ۠۟ۥ;->۟۠۠ۤۥ:I

    xor-int/lit16 v3, v3, -0x2ee

    const/16 v4, 0xa4c

    invoke-static {v0, v1, v3, v4}, La8/ۣۡۨ۠;->ۣ۟۟۠ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lc1/ۣۢۧۨ;->ۤۧۢ۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lf0/ۣۤ۠۟;->ۧ۠۠ۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbe41

    goto :goto_3

    :sswitch_b
    invoke-static {v3}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2}, Lw/ۥۣۡۡ;->ۣۨۥ۠(Ljava/lang/Object;)I

    move-result v4

    const v1, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbebd

    goto :goto_4

    :sswitch_d
    const/16 v1, 0x8

    if-eq v4, v1, :cond_3

    const v1, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v1

    const/16 v4, 0xa

    sget v5, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۥۣ۟ۧ:I

    xor-int/lit16 v5, v5, -0x328

    const/16 v6, 0x62f

    invoke-static {v1, v4, v5, v6}, Lf6/ۦۣۦ۟;->۟ۤۥ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :sswitch_f
    invoke-static {p0, v0}, Ls2/۟ۧ۟ۧۤ;->ۥ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v1

    const/16 v4, 0xc

    const/16 v5, 0x733

    invoke-static {v1, v4, v7, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۥ۠۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {p1, v0}, La8/ۡۦۨۡ;->ۣ۟ۡ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Landroid/os/Bundle;

    const v1, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v1, 0xbf39

    goto :goto_5

    :sswitch_11
    if-eqz v4, :cond_4

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_12
    new-array v1, v7, [Ljava/lang/Object;

    sget v4, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۡۨ۟ۨ:I

    xor-int/lit8 v4, v4, 0x71

    aput-object v0, v1, v4

    invoke-static {p0, v1}, Lv0/۟ۤۧ۠ۧ;->۟ۦۣ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_13
    const v1, 0xc221

    goto :goto_6

    :sswitch_14
    instance-of v4, v0, [Ljava/lang/Object;

    const v1, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_15
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_16
    if-eqz v4, :cond_5

    const v1, 0xc2db

    goto :goto_7

    :sswitch_17
    check-cast v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lv0/۟ۤۧ۠ۧ;->۟ۦۣ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_18
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_19
    instance-of v4, v0, Ljava/util/ArrayList;

    const v1, 0xc601

    :goto_9
    const v5, 0xc612

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    if-eqz v4, :cond_6

    const v1, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1b
    const v1, 0xc63f

    goto :goto_9

    :sswitch_1c
    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0}, Lf1/ۥۦ۟ۥ;->ۣۢۤ۠(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lv0/۟ۤۧ۠ۧ;->۟ۦۣ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc67d

    :goto_a
    const v4, 0xc68e

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1d
    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0xc984

    :goto_c
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1e
    const v0, 0xc9a3

    goto :goto_c

    :sswitch_1f
    const v1, 0xc69c

    goto :goto_a

    :sswitch_20
    invoke-static {v0}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۥۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_b

    :sswitch_21
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v1, 0xd

    sget v3, Lm7/ۧۢ۟;->ۣۣ۟ۨۧ:I

    xor-int/lit16 v3, v3, 0x210

    const/16 v4, 0x68b

    invoke-static {v0, v1, v3, v4}, Lq6/ۡۨۧۨ;->ۣۣۤۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_21
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_14
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_19
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x2d -> :sswitch_20
        0x32 -> :sswitch_1b
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0xf3 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_8
    .end sparse-switch
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 p1, 0x0

    :goto_1
    :sswitch_3
    return-object p1

    :sswitch_4
    invoke-static {p0}, Lfa/ۢۤۢ۟;->ۣۣ۟ۨۥ(Ljava/lang/Object;)Lk6/g5;

    move-result-object v0

    invoke-static {v0}, Le0/ۦۣ۟۠;->۟ۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۣۣۣۧ()[Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lv7/ۢ۟ۨۦ;->ۡ۠ۥۣ()[Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟ۧۡۡ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۣۣۣۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_3
    .end sparse-switch
.end method

.method public final d(Lk6/v;)Ljava/lang/String;
    .locals 6

    invoke-static {p0}, Lfa/ۢۤۢ۟;->ۣۣ۟ۨۥ(Ljava/lang/Object;)Lk6/g5;

    move-result-object v1

    invoke-static {v1}, Le0/ۦۣ۟۠;->۟ۤۦ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۠ۧ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v3, 0xf

    sget v4, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۢۢۧۢ:I

    xor-int/lit8 v4, v4, -0x31

    const/16 v5, 0xb53

    invoke-static {v0, v3, v4, v5}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۣ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lx7/۟۟ۦۨۡ;->ۣ۟ۡۤۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v3, 0x16

    sget v4, Lv8/۟ۧۢ۟ۢ;->۟ۥۡۧۥ:I

    xor-int/lit16 v4, v4, -0x2ad

    const/16 v5, 0x65c

    invoke-static {v0, v3, v4, v5}, Lr2/۠ۨۦۢ;->ۤۢۦ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lf6/ۦۣۦ۟;->ۣۣ۟ۡ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->۠ۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v3, 0x1c

    sget v4, Lw4/ۥۧۡۥ;->ۣۣ۟ۥۤ:I

    xor-int/lit16 v4, v4, 0x355

    const/16 v5, 0xc50

    invoke-static {v0, v3, v4, v5}, La/ۨۥۥۤ;->۟ۥ۟ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lj2/ۥ۠ۨۢ;->ۣۤ۟ۢ(Ljava/lang/Object;)Lk6/s;

    move-result-object v3

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-nez v3, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    const/4 v0, 0x0

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    const v1, 0xbe22

    goto :goto_3

    :sswitch_8
    invoke-static {v1}, Le0/ۦۣ۟۠;->۟ۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_4

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_b
    invoke-static {v3}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۨۤ۠(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lx8/ۢۨۥۨ;->ۣۥۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_c
    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_d
    const v1, 0xbf1a

    goto :goto_5

    :sswitch_e
    invoke-static {v3}, Ls7/ۧۤۦۤ;->ۧ۟۟ۢ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {p0, v0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۥۣۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_e
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch
.end method

.method public final e([Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    const/4 v8, 0x1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v1, 0x24

    sget v2, Li9/ۨۨ۟;->ۣ۟۠ۡۤ:I

    xor-int/lit16 v2, v2, -0x26b

    const/16 v3, 0x3b4

    invoke-static {v0, v1, v2, v3}, Lr1/۟ۤۤۡ۠;->ۣۢۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v1, 0x26

    const/16 v2, 0x96a

    invoke-static {v0, v1, v8, v2}, Lv8/۟ۧۢ۟ۢ;->۠ۦۥۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v4, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    const/16 v0, 0x6cc

    :goto_3
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_3

    :sswitch_4
    if-ge v1, v4, :cond_1

    const/16 v0, 0x729

    goto :goto_3

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_3

    :sswitch_6
    aget-object v0, p1, v1

    instance-of v5, v0, Landroid/os/Bundle;

    const/16 v2, 0x748

    :goto_4
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_4

    :sswitch_7
    if-eqz v5, :cond_2

    const v2, 0xbe60

    goto :goto_4

    :cond_2
    :sswitch_8
    const v2, 0xbe41

    goto :goto_4

    :sswitch_9
    check-cast v0, Landroid/os/Bundle;

    invoke-static {p0, v0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۥۣۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v2, 0xbe7f

    :goto_5
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_5

    :goto_6
    :sswitch_a
    const v2, 0xbefb

    :goto_7
    const v5, 0xbf0c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_4

    goto :goto_7

    :cond_3
    :sswitch_b
    const v2, 0xbf39

    goto :goto_7

    :sswitch_c
    const v2, 0xbe9e

    goto :goto_5

    :sswitch_d
    invoke-static {v0}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۥۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :sswitch_e
    if-eqz v0, :cond_3

    const v2, 0xc1e3

    goto :goto_7

    :sswitch_f
    invoke-static {v3}, Lw/ۥۣۡۡ;->ۣۨۥ۠(Ljava/lang/Object;)I

    move-result v5

    const v2, 0xc202

    :goto_8
    const v6, 0xc213

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_5

    goto :goto_8

    :sswitch_10
    if-eq v5, v8, :cond_4

    const v2, 0xc25f

    goto :goto_8

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_8

    :sswitch_12
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v2

    const/16 v5, 0x27

    sget v6, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۣ۟ۡۤۤ:I

    xor-int/lit8 v6, v6, 0x41

    const/16 v7, 0xae4

    invoke-static {v2, v5, v6, v7}, Lcom/google/firebase/measurement/ۧۤۦۧ;->۟ۤۢ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :sswitch_13
    invoke-static {v3, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :sswitch_14
    sget v0, Ls8/۟ۥۨۨ;->۟ۥۣۤ۟:I

    xor-int/lit16 v0, v0, -0x29f

    add-int/2addr v0, v1

    const v1, 0xc27e

    :goto_9
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_9

    :sswitch_15
    move v1, v0

    goto/16 :goto_2

    :sswitch_16
    const v1, 0xc29d

    goto :goto_9

    :sswitch_17
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v1, 0x29

    const/16 v2, 0x91c

    invoke-static {v0, v1, v8, v2}, Landroid/support/v4/app/ۥۣۡ;->ۣ۠ۧۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_17
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_14
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0xf1 -> :sswitch_16
    .end sparse-switch
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 p1, 0x0

    :goto_1
    :sswitch_3
    return-object p1

    :sswitch_4
    invoke-static {p0}, Lfa/ۢۤۢ۟;->ۣۣ۟ۨۥ(Ljava/lang/Object;)Lk6/g5;

    move-result-object v0

    invoke-static {v0}, Le0/ۦۣ۟۠;->۟ۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lf/ۣ۟ۤۤ;->۟۟ۨۧۨ()[Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۣۣ۠۟()[Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lt7/۟ۡ۠ۨ۟;->ۢۢۡۡ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۣۣۣۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_3
    .end sparse-switch
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 p1, 0x0

    :goto_1
    :sswitch_3
    return-object p1

    :sswitch_4
    invoke-static {p0}, Lfa/ۢۤۢ۟;->ۣۣ۟ۨۥ(Ljava/lang/Object;)Lk6/g5;

    move-result-object v0

    invoke-static {v0}, Le0/ۦۣ۟۠;->۟ۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v1, 0x2a

    sget v2, Ln/۟۠ۥۥۨ;->۟ۥۧۤۧ:I

    xor-int/lit16 v2, v2, 0x2e7

    const/16 v3, 0x5b5

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->۟ۤ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lv6/۟ۦۨۦۣ;->ۣ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v0

    const/16 v1, 0x2f

    sget v2, Lm4/۟ۧۤ۠;->۟ۥۡۨۧ:I

    xor-int/lit16 v2, v2, 0x377

    const/16 v3, 0x14a

    invoke-static {v0, v1, v2, v3}, Lp8/ۡۤ;->۟۟ۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lk6/c4;->۟ۤۤۤۤ()[S

    move-result-object v1

    const/16 v2, 0x3d

    const/4 v3, 0x1

    const/16 v4, 0xa02

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/installations/۠ۤۢ۟;->ۣ۟ۤۥۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ld7/ۢۧۧۢ;->۟۟ۧۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :sswitch_b
    invoke-static {}, Lj2/۠ۤۨۤ;->ۦۦۤۢ()[Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۠ۦۡۤ()[Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lt7/۟ۡ۠ۨ۟;->۟ۥۣۥۥ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۣۣۣۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method
