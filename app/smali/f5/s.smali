.class public final Lf5/s;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/s;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3cas
        0x3c5s
        0x3cfs
        0x3d9s
        0x3c4s
        0x3c2s
        0x3cfs
        0x3f4s
        0x3c2s
        0x3cfs
        0x188s
        0x1b4s
        0x1bds
        0x1b9s
        0x1abs
        0x1bds
        0x1f8s
        0x1b4s
        0x1b7s
        0x1bfs
        0x1b1s
        0x1b6s
        0x1f8s
        0x1bes
        0x1aas
        0x1b7s
        0x1b5s
        0x1f8s
        0x1a1s
        0x1b7s
        0x1ads
        0x1aas
        0x1f8s
        0x1aas
        0x1bds
        0x1bfs
        0x1b1s
        0x1abs
        0x1acs
        0x1bds
        0x1aas
        0x1bds
        0x1bcs
        0x1f8s
        0x1bcs
        0x1bds
        0x1aes
        0x1b1s
        0x1bbs
        0x1bds
        0x1f3s
        0x1d5s
        0x1c3s
        0x1d4s
        0x66es
        0x64cs
        0x65bs
        0x646s
        0x659s
        0x64as
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/s;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-boolean p2, p0, Lf5/s;->b:Z

    invoke-static {}, Lv5/ۧۥۢۡ;->ۥۢۡ۠()I

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
    const-string v0, "42KSlEbXqy"

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->ۧۧۢۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡۧۨ۟()[S
    .locals 2

    invoke-static {}, Ll9/۟ۦۥۣۢ;->ۤۦ۠()I

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
    sget-object v0, Lf5/s;->short:[S

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
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 20

    check-cast p1, Lq8/h;

    invoke-static/range {p1 .. p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lq8/g;

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v18

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۦۤۦۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v19

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
    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v6, v4, -0x2

    or-int/2addr v2, v6

    if-eqz v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v2, v3

    check-cast v2, Lcom/auto/accept/data/model/UserProfile;

    invoke-static/range {v19 .. v19}, Lg2/ۢۥۥۡ;->ۤۨۤۢ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۢۧۦ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v4

    invoke-static {}, Lf5/s;->ۡۧۨ۟()[S

    move-result-object v6

    const/4 v7, 0x0

    sget v8, Lw/ۥۣۡۡ;->ۣ۟ۢۢۧ:I

    xor-int/lit16 v8, v8, 0x375

    const/16 v9, 0x3ab

    invoke-static {v6, v7, v8, v9}, Lz/ۨۤۥۨ;->ۡۥۥۣ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lp7/ۣۣۦۤ;->ۣۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x6cc

    :goto_1
    xor-int/lit16 v6, v6, 0x6dd

    sparse-switch v6, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v4, :cond_1

    const/16 v6, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v6, 0x70a

    goto :goto_1

    :sswitch_5
    move-object v4, v5

    :sswitch_6
    invoke-static {v2}, Lo4/۟۟ۡۧۤ;->ۧۡۡۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    invoke-static/range {v19 .. v19}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v8

    const/16 v6, 0x748

    :goto_2
    xor-int/lit16 v6, v6, 0x759

    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-lez v7, :cond_2

    const v6, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v6, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {v2}, Lo4/۟۟ۡۧۤ;->ۧۡۡۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v4, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v4, 0xbebd

    goto :goto_3

    :sswitch_b
    if-nez v6, :cond_3

    const v4, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static/range {v19 .. v19}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {v2}, Ld9/ۧۧۨۥ;->۠ۤۧۦ(Ljava/lang/Object;)V

    invoke-static {}, Ldagger/hilt/internal/ۡۡۨۦ;->۟ۦۦ۟ۥ()Lf5/f;

    move-result-object v2

    invoke-static {v8, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lf5/s;->ۡۧۨ۟()[S

    move-result-object v2

    const/16 v3, 0xa

    sget v4, Lk8/ۣ۠ۨۤ;->۟۠ۢ۟ۨ:I

    xor-int/lit16 v4, v4, 0x306

    const/16 v5, 0x1d8

    invoke-static {v2, v3, v4, v5}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->۠ۦۡۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {v19 .. v19}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v18

    :goto_4
    return-object v2

    :sswitch_d
    invoke-static {v2}, Lh3/۟ۡۥ۠۠;->۟ۡۤۧۦ(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۥۥۡ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v6

    invoke-static {v6, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lv6/۟ۦۨۦۣ;->۟ۥۢۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۥۥ۠۟(Ljava/lang/Object;)Lp9/q0;

    move-result-object v7

    invoke-static {v7, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v10

    move-object/from16 v0, v19

    invoke-static {v0, v10, v11}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->ۨۦۥۥ(Ljava/lang/Object;J)V

    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v10

    const v4, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v4, 0xbf39

    goto :goto_5

    :sswitch_f
    const-wide/16 v12, 0x0

    cmp-long v4, v10, v12

    if-lez v4, :cond_4

    const v4, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v12

    const v4, 0xc202

    :goto_6
    const v7, 0xc213

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    cmp-long v4, v10, v12

    if-gtz v4, :cond_5

    const v4, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_12
    const v4, 0xc240

    goto :goto_6

    :sswitch_13
    invoke-static/range {p0 .. p0}, La/ۥۡۢۨ;->ۣ۟۠ۥۣ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xc27e

    :goto_7
    const v9, 0xc28f

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_14
    const v4, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-eqz v7, :cond_6

    const v4, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v6, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0xc2fa

    :goto_8
    const v6, 0xc30b

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    const v4, 0xc5a4

    goto :goto_8

    :sswitch_18
    invoke-static/range {v19 .. v19}, Ld9/ۨۧۧۦ;->ۣۧ۟ۢ(Ljava/lang/Object;)V

    move-object/from16 v2, v18

    goto/16 :goto_4

    :sswitch_19
    invoke-static {v2}, Ld9/ۣ۟۠ۢۡ;->ۦۥۣۤ(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0xc601

    :goto_9
    const v7, 0xc612

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    if-eqz v6, :cond_7

    const v4, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1b
    const v4, 0xc63f

    goto :goto_9

    :sswitch_1c
    new-instance v4, Lf5/a;

    invoke-direct {v4, v2}, Lf5/a;-><init>(Lcom/auto/accept/data/model/UserProfile;)V

    invoke-static {v8, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xc67d

    :goto_a
    const v4, 0xc68e

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :goto_b
    :pswitch_0
    :sswitch_1d
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static/range {v19 .. v19}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v4, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1e
    invoke-static {v3}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    const v2, 0xca7c

    :goto_c
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    if-eqz v3, :cond_9

    const v2, 0xcd64

    goto :goto_c

    :sswitch_20
    const v2, 0xc69c

    goto :goto_a

    :sswitch_21
    invoke-static {v2}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟۠ۡ۠ۦ(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0xc984

    :goto_d
    const v7, 0xc995

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_b

    goto :goto_d

    :sswitch_22
    if-eqz v6, :cond_8

    const v4, 0xc9e1

    goto :goto_d

    :cond_8
    :sswitch_23
    const v4, 0xc9c2

    goto :goto_d

    :sswitch_24
    new-instance v4, Lf5/e;

    invoke-direct {v4, v2}, Lf5/e;-><init>(Lcom/auto/accept/data/model/UserProfile;)V

    invoke-static {v8, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xca00

    :goto_e
    const v4, 0xca11

    xor-int/2addr v2, v4

    packed-switch v2, :pswitch_data_0

    :pswitch_1
    goto :goto_e

    :pswitch_2
    const v2, 0xca1f

    goto :goto_e

    :sswitch_25
    new-instance v4, Lf5/g;

    invoke-direct {v4, v2}, Lf5/g;-><init>(Lcom/auto/accept/data/model/UserProfile;)V

    invoke-static {v8, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    :cond_9
    :sswitch_26
    const v2, 0xcd45

    goto :goto_c

    :sswitch_27
    invoke-static/range {v19 .. v19}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {v2}, Lf4/ۡۥۣۢ;->۟۠ۨۡۧ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xcd83

    :goto_f
    const v4, 0xcd94

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_c

    goto :goto_f

    :sswitch_28
    if-nez v3, :cond_a

    const v2, 0xcde0

    goto :goto_f

    :cond_a
    :sswitch_29
    const v2, 0xcdc1

    goto :goto_f

    :sswitch_2a
    move-object/from16 v2, v18

    goto/16 :goto_4

    :sswitch_2b
    invoke-static/range {v19 .. v19}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v4

    invoke-static {v4}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟ۦۡۡۢ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v2

    invoke-static {v2}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v3

    const v2, 0xcdff

    :goto_10
    const v6, 0xce10

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_d

    goto :goto_10

    :cond_b
    :sswitch_2c
    const v2, 0xce3d

    goto :goto_10

    :sswitch_2d
    if-eqz v3, :cond_b

    const v2, 0xd0e7

    goto :goto_10

    :sswitch_2e
    invoke-static {v3}, Lr5/ۣۢ۟ۦ;->۟ۡۥۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xd106

    :goto_11
    const v6, 0xd117

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_e

    goto :goto_11

    :sswitch_2f
    if-nez v2, :cond_c

    const v3, 0xd163

    goto :goto_11

    :cond_c
    :sswitch_30
    const v3, 0xd144

    goto :goto_11

    :sswitch_31
    const v2, 0xd182

    :goto_12
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_12

    :sswitch_32
    const v2, 0xd1a1

    goto :goto_12

    :sswitch_33
    const v3, 0xd1fe

    :goto_13
    const v5, 0xd20f

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_10

    goto :goto_13

    :sswitch_34
    const v3, 0xd4a8

    goto :goto_13

    :sswitch_35
    move-object v5, v2

    :sswitch_36
    invoke-static {v4}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟ۦۡۡۢ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v2

    invoke-static {v2}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v3

    const v2, 0xd505

    :goto_14
    const v4, 0xd516

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_11

    goto :goto_14

    :sswitch_37
    if-eqz v3, :cond_d

    const v2, 0xd562

    goto :goto_14

    :cond_d
    :sswitch_38
    const v2, 0xd543

    goto :goto_14

    :sswitch_39
    invoke-static {v3}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->ۣۢۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v2, 0xd581

    :goto_15
    const v3, 0xd592

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_12

    goto :goto_15

    :sswitch_3a
    if-nez v4, :cond_e

    const v2, 0xd869

    goto :goto_15

    :cond_e
    :sswitch_3b
    const v2, 0xd5bf

    goto :goto_15

    :sswitch_3c
    const v2, 0xd888

    :goto_16
    const v3, 0xd899

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_13

    goto :goto_16

    :sswitch_3d
    const v2, 0xd8a7

    goto :goto_16

    :sswitch_3e
    const v2, 0xd904

    :goto_17
    const v3, 0xd915

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_14

    goto :goto_17

    :sswitch_3f
    const v2, 0xd923

    goto :goto_17

    :sswitch_40
    invoke-static {}, Lf5/s;->ۡۧۨ۟()[S

    move-result-object v2

    const/16 v3, 0x32

    sget v4, Lx7/۟ۤۡ۟ۦ;->۟ۧۦۦ۠:I

    xor-int/lit16 v4, v4, -0x22a

    const/16 v6, 0x1a6

    invoke-static {v2, v3, v4, v6}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۨۨ([SIII)Ljava/lang/String;

    move-result-object v4

    const v2, 0xd980

    :goto_18
    const v3, 0xd991

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_15

    goto :goto_18

    :sswitch_41
    const v2, 0xdc2a

    goto :goto_18

    :sswitch_42
    new-instance v2, Lf5/e;

    new-instance v3, Lcom/auto/accept/data/model/UserProfile;

    invoke-static {}, Lf5/s;->ۡۧۨ۟()[S

    move-result-object v6

    const/16 v7, 0x36

    sget v8, Lg5/ۣۡۦۣ;->ۥۥۨۡ:I

    xor-int/lit16 v8, v8, -0x376

    const/16 v9, 0x62f

    invoke-static {v6, v7, v8, v9}, Lg9/۠ۨۧۤ;->۟ۢۥۨۤ([SIII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    sget v16, Lm4/۟ۧۤ۠;->۟ۥۡۨۧ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x4f9

    move/from16 v16, v0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v17}, Lcom/auto/accept/data/model/UserProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILd9/f;)V

    invoke-direct {v2, v3}, Lf5/e;-><init>(Lcom/auto/accept/data/model/UserProfile;)V

    invoke-static/range {v19 .. v19}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static/range {v19 .. v19}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_43
    move-object/from16 v2, v18

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1e
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
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_19
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_18
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x2d -> :sswitch_21
        0x32 -> :sswitch_1b
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0xf3 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xf1 -> :sswitch_1f
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_43
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_22
        0x36 -> :sswitch_23
        0x57 -> :sswitch_25
        0x74 -> :sswitch_24
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_29
        0x55 -> :sswitch_2b
        0x74 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_2c
        0x2d -> :sswitch_36
        0x3ef -> :sswitch_2d
        0x1ef7 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_30
        0x53 -> :sswitch_33
        0x74 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_34
        0x6a7 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_38
        0x55 -> :sswitch_40
        0x74 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3a
        0x2d -> :sswitch_3e
        0x32 -> :sswitch_3b
        0xdfb -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_3d
        0x3e -> :sswitch_40
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3f
        0x36 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_41
        0x5bb -> :sswitch_3e
    .end sparse-switch
.end method
