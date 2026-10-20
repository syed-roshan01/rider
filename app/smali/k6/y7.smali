.class public final Lk6/y7;
.super Landroid/content/BroadcastReceiver;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lk6/f5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd0

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/y7;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa4ds
        0xa7cs
        0xa7cs
        0xa2cs
        0xa7es
        0xa69s
        0xa6fs
        0xa69s
        0xa65s
        0xa7as
        0xa69s
        0xa7es
        0xa2cs
        0xa6fs
        0xa6ds
        0xa60s
        0xa60s
        0xa69s
        0xa68s
        0xa2cs
        0xa7bs
        0xa65s
        0xa78s
        0xa64s
        0xa2cs
        0xa62s
        0xa79s
        0xa60s
        0xa60s
        0xa2cs
        0xa65s
        0xa62s
        0xa78s
        0xa69s
        0xa62s
        0xa78s
        0xa60s
        0xa51s
        0xa51s
        0xa01s
        0xa53s
        0xa44s
        0xa42s
        0xa44s
        0xa48s
        0xa57s
        0xa44s
        0xa53s
        0xa01s
        0xa42s
        0xa40s
        0xa4ds
        0xa4ds
        0xa44s
        0xa45s
        0xa01s
        0xa56s
        0xa48s
        0xa55s
        0xa49s
        0xa01s
        0xa4fs
        0xa54s
        0xa4ds
        0xa4ds
        0xa01s
        0xa40s
        0xa42s
        0xa55s
        0xa48s
        0xa4es
        0xa4fs
        0xcf8s
        0xcf4s
        0xcf6s
        0xcb5s
        0xcfcs
        0xcf4s
        0xcf4s
        0xcfcs
        0xcf7s
        0xcfes
        0xcb5s
        0xcfas
        0xcf5s
        0xcffs
        0xce9s
        0xcf4s
        0xcf2s
        0xcffs
        0xcb5s
        0xcfcs
        0xcf6s
        0xce8s
        0xcb5s
        0xcf6s
        0xcfes
        0xcfas
        0xce8s
        0xcees
        0xce9s
        0xcfes
        0xcf6s
        0xcfes
        0xcf5s
        0xcefs
        0xcb5s
        0xccfs
        0xcc9s
        0xcd2s
        0xcdcs
        0xcdcs
        0xcdes
        0xcc9s
        0xcc8s
        0xcc4s
        0xcdas
        0xccds
        0xcdas
        0xcd2s
        0xcd7s
        0xcdas
        0xcd9s
        0xcd7s
        0xcdes
        0x2d0s
        0x2e1s
        0x2e1s
        0x2b1s
        0x2e3s
        0x2f4s
        0x2f2s
        0x2f4s
        0x2f8s
        0x2e7s
        0x2f4s
        0x2e3s
        0x2b1s
        0x2f2s
        0x2f0s
        0x2fds
        0x2fds
        0x2f4s
        0x2f5s
        0x2b1s
        0x2e6s
        0x2f8s
        0x2e5s
        0x2f9s
        0x2b1s
        0x2e4s
        0x2ffs
        0x2fas
        0x2ffs
        0x2fes
        0x2e6s
        0x2ffs
        0x2b1s
        0x2f0s
        0x2f2s
        0x2e5s
        0x2f8s
        0x2fes
        0x2ffs
        0x2cfs
        0x2fes
        0x2fes
        0x2aes
        0x2fcs
        0x2ebs
        0x2eds
        0x2ebs
        0x2e7s
        0x2f8s
        0x2ebs
        0x2fcs
        0x2aes
        0x2e0s
        0x2e1s
        0x2fas
        0x2e7s
        0x2e8s
        0x2e7s
        0x2ebs
        0x2eas
        0x2aes
        0x2fas
        0x2fcs
        0x2e7s
        0x2e9s
        0x2e9s
        0x2ebs
        0x2fcs
        0x2fds
        0x2aes
        0x2efs
        0x2fcs
        0x2ebs
        0x2aes
        0x2efs
        0x2f8s
        0x2efs
        0x2e7s
        0x2e2s
        0x2efs
        0x2ecs
        0x2e2s
        0x2ebs
    .end array-data
.end method

.method public constructor <init>(Lk6/f5;)V
    .locals 3

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Lk6/y7;->a:Lk6/f5;

    invoke-static {}, Lb8/ۣ۟ۨۢۥ;->ۣ۟۠۠ۡ()I

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
    const-string v0, "6u"

    invoke-static {v0}, Lr5/ۣۢ۟ۦ;->ۣۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۣۨۥۦ()[S
    .locals 2

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

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
    sget-object v0, Lk6/y7;->short:[S

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
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->۟۠ۦ۟ۡ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v1

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
    if-nez p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/y7;->ۣۨۥۦ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Ln7/۟ۡۢۦ;->ۧ۟ۢۨ:I

    xor-int/lit8 v3, v3, -0x2c

    const/16 v4, 0xa0c

    invoke-static {v1, v2, v3, v4}, Ld3/ۡۨۢۦ;->۟ۨۡۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lja/ۥۣۨ۠;->ۢۦۨ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Le2/ۨۥ۠ۨ;->ۤۧۢۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "s2v433xp4boOq4E3"

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->ۣ۟ۦۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {p2}, Ld5/ۣۦۢۢ;->ۦۡ۠۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-nez v2, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {v1}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/y7;->ۣۨۥۦ()[S

    move-result-object v1

    const/16 v2, 0x24

    sget v3, Ll0/ۡۦۦۡ;->ۦۨۨۥ:I

    xor-int/lit16 v3, v3, -0x3ed

    const/16 v4, 0xa21

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lja/ۥۣۨ۠;->ۢۦۨ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_b
    invoke-static {}, Lk6/y7;->ۣۨۥۦ()[S

    move-result-object v0

    const/16 v3, 0x48

    sget v4, Li/ۢۥۣ۟;->ۡۤۧۥ:I

    xor-int/lit16 v4, v4, 0x237

    const/16 v5, 0xc9b

    invoke-static {v0, v3, v4, v5}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->ۡۤۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۢ۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_4

    :sswitch_d
    if-nez v2, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {v1}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/y7;->ۣۨۥۦ()[S

    move-result-object v1

    const/16 v2, 0x7d

    sget v3, Lz1/۟ۦ۟۠۟;->ۢۥۦۢ:I

    xor-int/lit16 v3, v3, -0x32c

    const/16 v4, 0x291

    invoke-static {v1, v2, v3, v4}, Lv6/۟ۦۨۦۣ;->۟ۥۡۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lja/ۥۣۨ۠;->ۢۦۨ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_f
    invoke-static {}, Lc1/ۣۡۢۦ;->ۣۢۥۣ()Z

    move-result v2

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xbf39

    goto :goto_5

    :sswitch_11
    if-eqz v2, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_12
    invoke-static {v1}, Lu7/ۣ۟ۡ۟;->۟۟ۢ۟ۨ(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {}, Li4/ۨ۟ۨ;->ۣۨۨۢ()Lk6/x3;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_13
    if-nez v2, :cond_5

    const v0, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_14
    const v0, 0xc240

    goto :goto_6

    :sswitch_15
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_16
    const v0, 0xc29d

    goto :goto_7

    :sswitch_17
    invoke-static {v1}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/y7;->ۣۨۥۦ()[S

    move-result-object v2

    const/16 v3, 0xa4

    sget v4, Lc4/ۡ۟۠ۥ;->۟ۦۣ۟۟:I

    xor-int/lit16 v4, v4, -0xf6

    const/16 v5, 0x28e

    invoke-static {v2, v3, v4, v5}, Ldagger/hilt/android/internal/ۣۧۨۨ;->۟ۦۧۢۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lv5/ۥۧ۟ۦ;->ۣ۟۟۠۟(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    new-instance v2, Lh/a;

    sget v3, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->۟ۤۤۨۤ:I

    xor-int/lit16 v3, v3, -0x86

    invoke-direct {v2, v1, v3}, Lh/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
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
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
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
        0x35 -> :sswitch_6
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_6
        0xf1 -> :sswitch_16
    .end sparse-switch
.end method
