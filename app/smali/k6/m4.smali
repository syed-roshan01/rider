.class public final Lk6/m4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x63

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/m4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x913s
        0x932s
        0x931s
        0x936s
        0x922s
        0x93bs
        0x923s
        0x977s
        0x933s
        0x936s
        0x923s
        0x936s
        0x977s
        0x934s
        0x938s
        0x93bs
        0x93bs
        0x932s
        0x934s
        0x923s
        0x93es
        0x938s
        0x939s
        0x977s
        0x924s
        0x923s
        0x936s
        0x923s
        0x932s
        0x977s
        0x936s
        0x93bs
        0x925s
        0x932s
        0x936s
        0x933s
        0x92es
        0x977s
        0x924s
        0x932s
        0x923s
        0x977s
        0x923s
        0x938s
        0x8b8s
        0x899s
        0x89as
        0x89ds
        0x889s
        0x890s
        0x888s
        0x8dcs
        0x898s
        0x89ds
        0x888s
        0x89ds
        0x8dcs
        0x89fs
        0x893s
        0x890s
        0x890s
        0x899s
        0x89fs
        0x888s
        0x895s
        0x893s
        0x892s
        0x8dcs
        0x895s
        0x88fs
        0x8dcs
        0x898s
        0x895s
        0x89as
        0x89as
        0x899s
        0x88es
        0x899s
        0x892s
        0x888s
        0x8dcs
        0x888s
        0x894s
        0x89ds
        0x892s
        0x8dcs
        0x89ds
        0x89fs
        0x888s
        0x889s
        0x89ds
        0x890s
        0x8dcs
        0x88fs
        0x888s
        0x89ds
        0x888s
        0x889s
        0x88fs
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk6/m4;->a:I

    iput-object p2, p0, Lk6/m4;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lk6/m4;->b:Z

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۥۡۧ۠()I

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
    const-string v0, "fCu"

    invoke-static {v0}, Lcom/google/gson/internal/bind/۟ۨۥ;->ۤۡۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۡۨۢ۠()[S
    .locals 2

    invoke-static {}, Li6/ۡۤۦ;->ۤۨۨ۠()I

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
    sget-object v0, Lk6/m4;->short:[S

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
.method public final run()V
    .locals 10

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0}, Lja/ۥۣۨ۠;->ۤۥۦۨ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, La2/۟ۡۥۦ۟;->ۦ۠ۨۡ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {p0}, Lw5/ۣۨۧ۠;->ۣ۟۠۠ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

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
    if-eqz v5, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Lg8/x1;

    invoke-static {v0}, Lw/ۥۣۡۡ;->ۣۡ۠۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/g1;

    iput-boolean v3, v0, Lg8/g1;->l:Z

    invoke-static {v0}, Lh/۟ۡۥۡۧ;->۟ۦۨۧ۟(Ljava/lang/Object;)J

    move-result-wide v6

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const-wide/16 v2, 0x0

    cmp-long v2, v6, v2

    if-lez v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lq7/۟ۢۢ۟ۧ;->۟۟ۥ۟۠(Ljava/lang/Object;)Lq6/l;

    move-result-object v0

    iput-boolean v4, v0, Lq6/l;->a:Z

    invoke-static {v0}, Lm1/ۣۡ۠ۧ;->۟ۧۧۥۤ(Ljava/lang/Object;)V

    :sswitch_6
    check-cast v1, Lg8/x1;

    invoke-static {v1}, Lw/ۥۣۡۡ;->ۣۡ۠۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/g1;

    iput-boolean v4, v0, Lg8/g1;->q:Z

    :goto_2
    :sswitch_7
    return-void

    :pswitch_0
    check-cast v1, Lg8/v0;

    invoke-static {v1}, Li4/ۨ۟ۨ;->۟۠۠ۦ۠(Ljava/lang/Object;)Le8/k;

    move-result-object v0

    invoke-static {v0, v5}, Ld9/ۥۡۧۡ;->ۥۥۧۡ(Ljava/lang/Object;Z)V

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->۟ۤ۟ۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    const-string v0, "Cbdfo0tRugAs16vlaF"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣۣۣۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    check-cast v1, Lg8/k;

    invoke-static {v1}, Lz1/۟ۦ۟۠۟;->۟ۢۥۦ۠(Ljava/lang/Object;)Lg8/v3;

    move-result-object v0

    invoke-static {v0, v5}, Ls7/ۧۤۦۤ;->ۥۡۨۡ(Ljava/lang/Object;Z)V

    goto :goto_2

    :pswitch_2
    check-cast v1, Lk6/y5;

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lt2/۟ۦۣۡۤ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v7

    const v2, 0xbe7f

    :goto_4
    const v8, 0xbe90

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v2, 0xbebd

    goto :goto_4

    :sswitch_c
    if-eqz v7, :cond_3

    const v2, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {v0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_5

    :sswitch_f
    if-eqz v2, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_10
    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    const v0, 0xc221

    goto :goto_6

    :sswitch_12
    move v2, v3

    :goto_7
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v5}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v0, Lk6/f5;->A:Ljava/lang/Boolean;

    const v0, 0xc27e

    :goto_8
    const v7, 0xc28f

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_14
    move v2, v4

    goto :goto_7

    :sswitch_15
    if-ne v2, v5, :cond_5

    const v0, 0xc2db

    goto :goto_8

    :sswitch_16
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v5}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/m4;->۟ۡۨۢ۠()[S

    move-result-object v7

    sget v8, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۦۡ۟ۡ:I

    xor-int/lit8 v8, v8, 0x10

    const/16 v9, 0x957

    invoke-static {v7, v4, v8, v9}, Lm7/ۡۢۦۢ;->ۥ۟ۨ۟([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7, v2}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_17
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lt2/۟ۦۣۡۤ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc2fa

    :goto_9
    const v7, 0xc30b

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_18
    if-eq v2, v6, :cond_6

    const v0, 0xc5e2

    goto :goto_9

    :cond_6
    :sswitch_19
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_1a
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lt2/۟ۦۣۡۤ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Z

    move-result v7

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v8

    const v2, 0xc601

    :goto_a
    const v9, 0xc612

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_1b
    if-eqz v8, :cond_7

    const v2, 0xc65e

    goto :goto_a

    :cond_7
    :sswitch_1c
    const v2, 0xc63f

    goto :goto_a

    :sswitch_1d
    invoke-static {v0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc67d

    :goto_b
    const v8, 0xc68e

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_8
    :sswitch_1e
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1f
    if-eqz v2, :cond_8

    const v0, 0xc965

    goto :goto_b

    :sswitch_20
    const v0, 0xc984

    :goto_c
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_21
    const v0, 0xc9a3

    goto :goto_c

    :sswitch_22
    move v3, v4

    :sswitch_23
    const v0, 0xca00

    :goto_d
    const v2, 0xca11

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_9
    :sswitch_24
    const v0, 0xca3e

    goto :goto_d

    :sswitch_25
    if-eq v7, v3, :cond_9

    const v0, 0xca5d

    goto :goto_d

    :sswitch_26
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v5}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v6}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0}, Lx7/۟۟ۦۨۡ;->۟ۢۡۤۡ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/m4;->۟ۡۨۢ۠()[S

    move-result-object v4

    const/16 v5, 0x2c

    sget v6, Lf0/ۣۦۦ۠;->۟ۤۡۡ۟:I

    xor-int/lit16 v6, v6, -0x317

    const/16 v7, 0x8fc

    invoke-static {v4, v5, v6, v7}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۣ۟ۡۢۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, v2, v3}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_27
    invoke-static {v1}, Lw/ۥۣۡۡ;->ۢ۟ۢۥ(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_3
    check-cast v1, Lk6/k4;

    invoke-static {v1}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۣۤۥۦ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۣۣۧۡ(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_7
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_14
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_14
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_17
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_26
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1b
        0x2d -> :sswitch_22
        0x32 -> :sswitch_1c
        0x4c -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1e
        0x35 -> :sswitch_22
        0xf3 -> :sswitch_1f
        0xfeb -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_24
        0x11 -> :sswitch_25
        0x2f -> :sswitch_27
        0x4c -> :sswitch_26
    .end sparse-switch
.end method
