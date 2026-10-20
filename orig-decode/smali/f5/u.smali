.class public final Lf5/u;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:J

.field public b:I

.field public final c:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x97

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/u;->short:[S

    return-void

    :array_0
    .array-data 2
        0x2272s
        -0x74s
        0x1a3s
        0x1e4s
        0x1e6s
        0x1f7s
        0x1d6s
        0x1f0s
        0x1e6s
        0x1f1s
        0x1d3s
        0x1f1s
        0x1ecs
        0x1e5s
        0x1eas
        0x1efs
        0x1e6s
        0x1a3s
        0x1f7s
        0x1ecs
        0x1ecs
        0x1e8s
        0x1a3s
        0x2a7s
        0x2b9s
        0x5a6s
        0x5a4s
        0x5a9s
        0x5a9s
        0x5e5s
        0x5b1s
        0x5aas
        0x5e5s
        0x5e2s
        0x5b7s
        0x5a0s
        0x5b6s
        0x5b0s
        0x5a8s
        0x5a0s
        0x5e2s
        0x5e5s
        0x5a7s
        0x5a0s
        0x5a3s
        0x5aas
        0x5b7s
        0x5a0s
        0x5e5s
        0x5e2s
        0x5acs
        0x5abs
        0x5b3s
        0x5aas
        0x5aes
        0x5a0s
        0x5e2s
        0x5e5s
        0x5b2s
        0x5acs
        0x5b1s
        0x5ads
        0x5e5s
        0x5a6s
        0x5aas
        0x5b7s
        0x5aas
        0x5b0s
        0x5b1s
        0x5acs
        0x5abs
        0x5a0s
        0x27c6s
        -0x5c8s
        0x417s
        0x445s
        0x452s
        0x454s
        0x45fs
        0x452s
        0x454s
        0x45cs
        0x462s
        0x444s
        0x452s
        0x445s
        0x464s
        0x443s
        0x456s
        0x443s
        0x442s
        0x444s
        0x417s
        0x464s
        0x463s
        0x476s
        0x465s
        0x463s
        0x267es
        -0x480s
        0x5afs
        0x5e9s
        0x5eas
        0x5fbs
        0x5ecs
        0x5e7s
        0x5dds
        0x5eas
        0x5e2s
        0x5e0s
        0x5fbs
        0x5eas
        0x5ccs
        0x5e0s
        0x5e1s
        0x5e9s
        0x5e6s
        0x5e8s
        0x5afs
        0x5fbs
        0x5e0s
        0x5e0s
        0x5e4s
        0x5afs
        0x711s
        0x707s
        0x701s
        0x73ds
        0x712s
        0x70es
        0x703s
        0x70cs
        0x73ds
        0x707s
        0x71as
        0x712s
        0x70bs
        0x710s
        0x71bs
        0x73ds
        0x70fs
        0x711s
        0xab0s
        0xab1s
        0xaaas
        0xafes
        0xab8s
        0xab1s
        0xaabs
        0xab0s
        0xabas
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/u;->c:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/u;->d:Ljava/lang/String;

    sget v0, Lfa/ۢۤۢ۟;->ۢ۠۟ۧ:I

    xor-int/lit8 v0, v0, -0x78

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lk/ۣۡۤۧ;->ۦ۟ۦ۟()I

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
    const-string v0, "2uYfdqOlWAaC8638JmPnxOL5c0M7D"

    invoke-static {v0}, Lt2/۟ۦۢۡۧ;->ۣ۠ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟۟ۦۧۥ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۦۡ۠ۨ()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf5/u;->short:[S

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e7\u06e0\u06e4"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Ly9/ۨ۠;->ۤۡۡۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e8\u06e0\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lz8/ۣۤۡۧ;->۟ۦ۠۟ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e4\u06e3\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    new-instance p0, Lf5/u;

    invoke-direct {p0, v0, v2, p2}, Lf5/u;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V

    const-string v1, "\u06e1\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aaec1 -> :sswitch_2
        0x1aba40 -> :sswitch_1
        0x1ac8e9 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e6\u06e4\u06e2"

    move-object v1, p1

    move-object v3, v0

    move-object v4, v0

    move-object v2, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e4\u06e0"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v3, v4}, La6/۟ۤۨۨ۟;->۟ۥۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e6\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v5}, Lc7/ۨۤۦۢ;->۠ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e7\u06e7\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e0\u06e1\u06e2"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e1\u06e5\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v2

    check-cast v0, Lf5/u;

    const-string v6, "\u06e4\u06e5\u06e7"

    move-object p0, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbe -> :sswitch_4
        0x1aab01 -> :sswitch_1
        0x1aba60 -> :sswitch_0
        0x1aba86 -> :sswitch_2
        0x1ac1e4 -> :sswitch_3
        0x1ac5ff -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lv7/ۤۦۧ۟;->۠ۡ۟:I

    xor-int/lit16 v4, v4, 0x17f

    const/16 v5, 0x183

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۣ۟ۨۡۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->۟ۥۤۥۧ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v3

    const/16 v5, 0x17

    sget v6, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->۟ۡۡۢۢ:I

    xor-int/lit16 v6, v6, 0x2e9

    const/16 v8, 0x2ca

    invoke-static {v3, v5, v6, v8}, Lz1/۟ۦ۟۠۟;->۟ۥ۟ۥۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static/range {p0 .. p0}, Ly9/ۨ۠;->ۤۡۡۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v9

    const/16 v3, 0x650

    :goto_0
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v3, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v2, 0x1

    if-ne v4, v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static/range {p0 .. p0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۨ۟۟ۤ(Ljava/lang/Object;)J

    move-result-wide v4

    :try_start_0
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static/range {p1 .. p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v3

    const/16 v4, 0x19

    sget v5, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۥۣ۟ۧ:I

    xor-int/lit16 v5, v5, -0x30b

    const/16 v6, 0x5c5

    invoke-static {v3, v4, v5, v6}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۥۣۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_8
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    invoke-static {v9}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧ۠ۦ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v3

    const/16 v4, 0x48

    sget v5, Lf4/ۡۤۡ;->۟ۡۧۢۢ:I

    xor-int/lit16 v5, v5, 0x39c

    const/16 v6, 0x437

    invoke-static {v3, v4, v5, v6}, La6/۟ۤۨۨ۟;->ۦۣ۠ۥ([SIII)Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    invoke-static {v9}, Ly/ۤۨۧ۟;->ۣ۟ۧۦۨ(Ljava/lang/Object;)V

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v6

    const/16 v12, 0x62

    sget v13, Lo4/۟۟ۡۧۤ;->ۡۤۨۧ:I

    xor-int/lit16 v13, v13, -0x16e

    const/16 v14, 0x58f

    invoke-static {v6, v12, v13, v14}, Ld4/۟۠۠۟ۢ;->۟ۤۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v12, 0x1a

    add-long/2addr v10, v12

    sub-long v4, v10, v4

    const-wide/16 v10, 0x1a

    sub-long/2addr v4, v10

    invoke-static {v3, v4, v5}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {v3, v8}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v9}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧ۠ۦ(Ljava/lang/Object;)Ljava/lang/String;

    :try_start_1
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    invoke-static {v9}, Lr5/۟ۤۨۥۡ;->ۤۢۧۤ(Ljava/lang/Object;)La5/z;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lz8/ۣۤۡۧ;->۟ۦ۠۟ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p0

    iput-wide v4, v0, Lf5/u;->a:J

    const/4 v10, 0x1

    move-object/from16 v0, p0

    iput v10, v0, Lf5/u;->b:I

    const/4 v10, 0x1

    move-object/from16 v0, p0

    invoke-static {v3, v6, v10, v0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟ۡۥۥۢ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v6, 0xbe7f

    :goto_3
    const v10, 0xbe90

    xor-int/2addr v6, v10

    sparse-switch v6, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v6, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ne v3, v2, :cond_2

    const v6, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v9}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧ۠ۦ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {v9}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۥۥۡ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v6

    :try_start_2
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v10

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v12, 0x1c

    sub-long/2addr v10, v12

    sub-long v4, v10, v4

    const-wide/16 v10, 0x1c

    add-long/2addr v4, v10

    invoke-static {v2, v4, v5}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {v2, v8}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    instance-of v4, v3, Lq8/g;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    invoke-static {}, Ldagger/hilt/internal/ۡۡۨۦ;->۟ۦۦ۟ۥ()Lf5/f;

    move-result-object v5

    invoke-static {v9}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v7

    invoke-static {v9}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->۟۠ۢ۠ۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v8

    invoke-static {v9}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v10

    const v2, 0xbefb

    :goto_4
    const v11, 0xbf0c

    xor-int/2addr v2, v11

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v11, v4, -0x2

    or-int/2addr v2, v11

    if-eqz v2, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    :try_start_3
    move-object v0, v3

    check-cast v0, Lcom/auto/accept/data/model/UserProfile;

    move-object v2, v0

    invoke-static {v2}, Lh3/۟ۡۥ۠۠;->۟ۡۤۧۦ(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v6, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۥۥ۠۟(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lv6/۟ۦۨۦۣ;->۟ۥۢۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v4, v11}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->۟ۥۦۨۦ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v12

    new-instance v11, Ljava/lang/Long;

    invoke-direct {v11, v12, v13}, Ljava/lang/Long;-><init>(J)V

    invoke-static {v4, v11}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Lf6/ۦۣۦ۟;->۟۟ۨۦ۟(Ljava/lang/Object;)Lz4/d;

    move-result-object v4

    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v12

    invoke-static {v4}, Lr1/۟ۤۤۡ۠;->۟ۡۤۦ۠(Ljava/lang/Object;)Lz4/b;

    move-result-object v4

    invoke-static {v4}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v9

    const/16 v11, 0x7c

    sget v14, Lh8/۟ۤۨۨۦ;->ۣۤۡۦ:I

    xor-int/lit16 v14, v14, 0x22a

    const/16 v15, 0x762

    invoke-static {v9, v11, v14, v15}, Lc7/ۨۤۦۢ;->ۣۧۦ۟([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9, v12, v13}, Lq6/ۡۨۧۨ;->ۦۦۢۡ(Ljava/lang/Object;Ljava/lang/Object;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-static {v4}, Lk2/۟ۢۦۤۤ;->ۧۧۥ۟(Ljava/lang/Object;)V

    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v12

    const v4, 0xc202

    :goto_5
    const v9, 0xc213

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const-wide/16 v14, 0x0

    cmp-long v4, v12, v14

    if-lez v4, :cond_4

    const v4, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v4, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v12

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v14

    const v4, 0xc27e

    :goto_6
    const v9, 0xc28f

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_12
    const v4, 0xc2bc

    goto :goto_6

    :sswitch_13
    cmp-long v4, v12, v14

    if-gtz v4, :cond_5

    const v4, 0xc2db

    goto :goto_6

    :sswitch_14
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v6, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_15
    invoke-static {v2}, Ld9/ۣ۟۠ۢۡ;->ۦۥۣۤ(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0xc2fa

    :goto_7
    const v9, 0xc30b

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_7

    goto :goto_7

    :sswitch_16
    if-eqz v6, :cond_6

    const v4, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_17
    const v4, 0xc5c3

    goto :goto_7

    :sswitch_18
    invoke-static {v7}, Ld9/ۧۧۨۥ;->۠ۤۧۦ(Ljava/lang/Object;)V

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v8, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xc601

    :goto_8
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_8

    :sswitch_19
    const v2, 0xc620

    goto :goto_8

    :sswitch_1a
    invoke-static {v2}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟۠ۡ۠ۦ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xc67d

    :goto_9
    const v6, 0xc68e

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :cond_7
    :sswitch_1b
    const v2, 0xc6bb

    goto :goto_9

    :sswitch_1c
    if-nez v4, :cond_7

    const v2, 0xc965

    goto :goto_9

    :sswitch_1d
    invoke-static {v7}, Ld9/ۧۧۨۥ;->۠ۤۧۦ(Ljava/lang/Object;)V

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v8, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1e
    invoke-static {v3}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    const v2, 0xc984

    :goto_a
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_1f
    if-eqz v3, :cond_8

    const v2, 0xc9e1

    goto :goto_a

    :cond_8
    :sswitch_20
    const v2, 0xc9c2

    goto :goto_a

    :sswitch_21
    invoke-static {v3}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xca00

    :goto_b
    const v4, 0xca11

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_b

    goto :goto_b

    :cond_9
    :sswitch_22
    const v3, 0xca3e

    goto :goto_b

    :sswitch_23
    if-nez v2, :cond_9

    const v3, 0xca5d

    goto :goto_b

    :sswitch_24
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v2

    :sswitch_25
    invoke-static {}, Lf5/u;->۟۟ۦۧۥ()[S

    move-result-object v3

    const/16 v4, 0x8e

    sget v6, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۨۧۨ:I

    xor-int/lit16 v6, v6, 0x34d

    const/16 v9, 0xade

    invoke-static {v3, v4, v6, v9}, Landroidx/profileinstaller/۠ۡۥۡ;->ۣ۟ۨۡۨ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v3

    const v2, 0xca7c

    :goto_c
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_c

    goto :goto_c

    :sswitch_26
    if-eqz v3, :cond_a

    const v2, 0xcd64

    goto :goto_c

    :cond_a
    :sswitch_27
    const v2, 0xcd45

    goto :goto_c

    :sswitch_28
    invoke-static {v7}, Ld9/ۧۧۨۥ;->۠ۤۧۦ(Ljava/lang/Object;)V

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v8, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :sswitch_29
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v2

    :sswitch_2a
    return-object v2

    :catch_0
    move-exception v2

    const v2, 0xcd83

    :goto_d
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_d

    :sswitch_2b
    const v2, 0xcda2

    goto :goto_d

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
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
        0xe -> :sswitch_9
        0x2d -> :sswitch_b
        0x4c -> :sswitch_2a
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_1e
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_15
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_1e
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_29
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_25
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_26
        0x7ab -> :sswitch_27
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2b
        0x36 -> :sswitch_29
    .end sparse-switch
.end method
