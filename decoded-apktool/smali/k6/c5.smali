.class public final Lk6/c5;
.super Ljava/lang/Thread;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/concurrent/BlockingQueue;

.field public c:Z

.field public final d:Lk6/z4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x46

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/c5;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa33s
        0xa64s
        0xa72s
        0xa60s
        0xa33s
        0xa7as
        0xa7ds
        0xa67s
        0xa76s
        0xa61s
        0xa61s
        0xa66s
        0xa63s
        0xa67s
        0xa76s
        0xa77s
        0xa1es
        0xa28s
        0xa2fs
        0xa2fs
        0xa38s
        0xa33s
        0xa29s
        0xa7ds
        0xa2es
        0xa3es
        0xa35s
        0xa38s
        0xa39s
        0xa28s
        0xa31s
        0xa38s
        0xa2fs
        0xa7ds
        0xa29s
        0xa35s
        0xa2fs
        0xa38s
        0xa3cs
        0xa39s
        0xa7ds
        0xa34s
        0xa2es
        0xa7ds
        0xa33s
        0xa38s
        0xa34s
        0xa29s
        0xa35s
        0xa38s
        0xa2fs
        0xa7ds
        0xa2as
        0xa32s
        0xa2fs
        0xa36s
        0xa38s
        0xa2fs
        0xa7ds
        0xa33s
        0xa32s
        0xa2fs
        0xa7ds
        0xa33s
        0xa38s
        0xa29s
        0xa2as
        0xa32s
        0xa2fs
        0xa36s
    .end array-data
.end method

.method public constructor <init>(Lk6/z4;Ljava/lang/String;Ljava/util/concurrent/BlockingQueue;)V
    .locals 2

    iput-object p1, p0, Lk6/c5;->d:Lk6/z4;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk6/c5;->c:Z

    invoke-static {p3}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk6/c5;->a:Ljava/lang/Object;

    iput-object p3, p0, Lk6/c5;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-static {p0, p2}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->۠ۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۢ۟ۤۨ()I

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
    const-string v0, "wr"

    invoke-static {v0}, Lx0/ۣ۠۟۠;->۟ۢۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۟ۤۧ۠۟()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۤۥ۟ۨ()I

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
    sget-object v0, Lk6/c5;->short:[S

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
.method public final a(Ljava/lang/InterruptedException;)V
    .locals 6

    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {p0}, Ly9/ۧۨ۠ۢ;->ۦۦۥۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lk6/c5;->۟ۤۧ۠۟()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lx8/ۢۨۥۨ;->ۣ۟۟ۨ۠:I

    xor-int/lit16 v4, v4, 0x294

    const/16 v5, 0xa13

    invoke-static {v2, v3, v4, v5}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟۠۠۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lt0/ۣ۟۠ۡۢ;->ۣۧ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lja/ۥۣۨ۠;->ۢۦۨ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "1Cnh82FN6j6N2wl8WiYgw"

    invoke-static {v0}, Lh6/ۧۧۤ۟;->۟۠۠ۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final b()V
    .locals 6

    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣ۠ۡ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->۟ۢۧۦ۠(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Lf4/ۦۣ۟ۦ;->۟۟ۧۧۧ(Ljava/lang/Object;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟ۦ۠ۦۥ(Ljava/lang/Object;)V

    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣ۠ۡ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lv6/۟ۦۨۦۣ;->۠ۧۡۧ(Ljava/lang/Object;)V

    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۥۣ۟ۥ(Ljava/lang/Object;)Lk6/c5;

    move-result-object v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne p0, v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x0

    iput-object v0, v1, Lk6/z4;->c:Lk6/c5;

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v1}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۢۧ۠ۦ(Ljava/lang/Object;)Lk6/c5;

    move-result-object v3

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-ne p0, v3, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    const/4 v0, 0x0

    iput-object v0, v1, Lk6/z4;->d:Lk6/c5;

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_b
    const/4 v0, 0x1

    iput-boolean v0, p0, Lk6/c5;->c:Z

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    const v0, 0xc221

    goto :goto_6

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/c5;->۟ۤۧ۠۟()[S

    move-result-object v1

    const/16 v3, 0x10

    sget v4, Lc3/۟ۥ۠ۡۧ;->ۣ۟ۢۥۢ:I

    xor-int/lit16 v4, v4, -0x304

    const/16 v5, 0xa5d

    invoke-static {v1, v3, v4, v5}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۦۣ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    const v1, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_f
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :sswitch_10
    const v1, 0xc29d

    goto :goto_7

    :sswitch_11
    :try_start_1
    monitor-exit v2

    invoke-static {}, Lm7/ۥۨۥ۟;->۟ۡ۟ۤ۠()I

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_12
    if-ltz v1, :cond_3

    const v0, 0xc5e2

    goto :goto_8

    :cond_3
    :sswitch_13
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_14
    const-string v0, "pEc"

    invoke-static {v0}, Lu1/ۢۥ۠ۤ;->ۡۥۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :sswitch_15
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_15
        0x6e9 -> :sswitch_14
    .end sparse-switch
.end method

.method public final run()V
    .locals 8

    const/4 v0, 0x0

    :sswitch_0
    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_3
    :try_start_0
    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v1

    invoke-static {v1}, Lf4/ۦۣ۟ۦ;->۟۟ۧۧۧ(Ljava/lang/Object;)Ljava/util/concurrent/Semaphore;

    move-result-object v1

    invoke-static {v1}, Lh3/ۣ۠ۡۨ;->۟۠ۤۨ۠(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v1, 0x6eb

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-static {p0, v1}, Lt2/۟ۦۣۡۤ;->۟ۡۨۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v1, 0xbe22

    goto :goto_2

    :sswitch_6
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۥۣۢ۟()I

    move-result v0

    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۣۨۡۨ(I)I

    move-result v2

    :sswitch_7
    invoke-static {p0}, Ll3/ۥۣۤ۟;->ۣۣۡ۟(Ljava/lang/Object;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۥۣۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d5;

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v0, :cond_1

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v0}, Lc4/۟ۢۨۥۡ;->۟۠۠ۡۦ(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_2
    :sswitch_b
    const v1, 0xbf39

    goto :goto_4

    :sswitch_c
    if-eqz v3, :cond_2

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_d
    const v1, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    const v1, 0xc221

    goto :goto_5

    :sswitch_f
    move v1, v2

    :goto_6
    invoke-static {v1}, Lg2/ۢۥۥۡ;->ۣ۟ۢۧۨ(I)V

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->ۣ۟۠ۦۧ(Ljava/lang/Object;)V

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_10
    const v0, 0xc29d

    goto :goto_7

    :sswitch_11
    const/16 v1, 0xa

    goto :goto_6

    :catchall_0
    move-exception v0

    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_12
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_13
    invoke-static {p0}, Lw4/ۥۤ۟۠;->ۣ۟ۦۢۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p0}, Ll3/ۥۣۤ۟;->ۣۣۡ۟(Ljava/lang/Object;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-static {v0}, Le2/۟۟ۥۦ;->۟ۤۡۧۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_14
    if-nez v1, :cond_3

    const v0, 0xc65e

    goto :goto_9

    :cond_3
    :sswitch_15
    const v0, 0xc63f

    goto :goto_9

    :sswitch_16
    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {p0}, Lw4/ۥۤ۟۠;->ۣ۟ۦۢۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v4, -0x77d2

    sget v1, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۥۣۧ۟:I

    int-to-long v6, v1

    xor-long/2addr v4, v6

    invoke-static {v0, v4, v5}, Lw2/ۤ۠ۨۤ;->ۥۧۦۥ(Ljava/lang/Object;J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_17
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->ۨۧۥۣ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣ۠ۡ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-static {p0}, Ll3/ۥۣۤ۟;->ۣۣۡ۟(Ljava/lang/Object;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-static {v0}, Le2/۟۟ۥۦ;->۟ۤۡۧۢ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-result-object v1

    const v0, 0xca00

    :goto_c
    const v4, 0xca11

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :cond_4
    :sswitch_18
    const v0, 0xca3e

    goto :goto_c

    :sswitch_19
    const v0, 0xc69c

    goto :goto_a

    :catchall_1
    move-exception v0

    const v1, 0xc984

    :goto_d
    const v2, 0xc995

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_b

    goto :goto_d

    :sswitch_1a
    const v1, 0xc9a3

    goto :goto_d

    :catch_1
    move-exception v0

    :try_start_7
    invoke-static {p0, v0}, Lt2/۟ۦۣۡۤ;->۟ۡۨۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_b

    :sswitch_1b
    if-nez v1, :cond_4

    const v0, 0xca5d

    goto :goto_c

    :sswitch_1c
    :try_start_8
    invoke-static {p0}, Lw4/ۥۧۡۥ;->۟ۦۣ۟ۤ(Ljava/lang/Object;)V

    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    invoke-static {p0}, Lw4/ۥۧۡۥ;->۟ۦۣ۟ۤ(Ljava/lang/Object;)V

    return-void

    :catchall_2
    move-exception v0

    const v1, 0xca7c

    :goto_e
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_e

    :sswitch_1d
    const v1, 0xcd26

    goto :goto_e

    :sswitch_1e
    :try_start_9
    monitor-exit v3

    const v0, 0xcd83

    :goto_f
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_f

    :sswitch_1f
    const v0, 0xcda2

    goto :goto_f

    :sswitch_20
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :sswitch_21
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :sswitch_22
    invoke-static {p0}, Lw4/ۥۧۡۥ;->۟ۦۣ۟ۤ(Ljava/lang/Object;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_0
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_13
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_7
        0xf1 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_22
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_14
        0x2d -> :sswitch_17
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_17
        0xf3 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xe -> :sswitch_18
        0x11 -> :sswitch_1b
        0x2f -> :sswitch_1e
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1a
        0x36 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1d
        0x7ab -> :sswitch_20
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_1f
        0x36 -> :sswitch_7
    .end sparse-switch
.end method
