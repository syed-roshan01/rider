.class public final Lf0/e2;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public b:Ll/t;

.field public c:Ll/t;

.field public d:I

.field public e:Ljava/lang/Long;

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x186a0

    iput v0, p0, Lf0/e2;->a:I

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

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
    const-string v0, "veLa2KoKsENW04RUJ"

    invoke-static {v0}, Lk3/ۦ۠ۢۥ;->ۥۣ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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


# virtual methods
.method public final a(Lg2/a0;)V
    .locals 5

    const/4 v1, 0x0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf0/e2;->f:Z

    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۢۥۡۦ(Ljava/lang/Object;)Ll/t;

    move-result-object v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/a0;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v0, v1

    :sswitch_5
    invoke-static {p1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p1}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۥۡۤ(Ljava/lang/Object;)La2/e;

    move-result-object v0

    invoke-static {v0}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۢۥۡۦ(Ljava/lang/Object;)Ll/t;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v2}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/a0;

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v0, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {v0}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۥۡۤ(Ljava/lang/Object;)La2/e;

    move-result-object v0

    invoke-static {v0}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v2, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v2, 0xc221

    goto :goto_5

    :sswitch_10
    move-object v0, v1

    :sswitch_11
    invoke-static {v3, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_4
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_13
    if-eqz v2, :cond_4

    const v0, 0xc2db

    goto :goto_6

    :sswitch_14
    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۢۥۡۦ(Ljava/lang/Object;)Ll/t;

    move-result-object v1

    const v0, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    if-nez v1, :cond_5

    const v0, 0xc5e2

    goto :goto_7

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_17
    const v0, 0xc601

    :goto_8
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_18
    const v0, 0xc620

    goto :goto_8

    :sswitch_19
    iput-object p1, v1, Ll/t;->c:Ljava/lang/Object;

    :sswitch_1a
    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

    move-result v1

    const v0, 0xc67d

    :goto_9
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :cond_6
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_9

    :sswitch_1c
    if-ltz v1, :cond_6

    const v0, 0xc965

    goto :goto_9

    :sswitch_1d
    const-string v0, "3WdOP1q7yoMpGLuhDy6PX3L"

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۠ۦۣ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :goto_a
    :sswitch_1e
    return-void

    :sswitch_1f
    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۢۥۡۦ(Ljava/lang/Object;)Ll/t;

    move-result-object v0

    new-instance v2, Ll/t;

    sget v3, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟ۤ۟ۦ:I

    xor-int/lit16 v3, v3, 0x189

    invoke-direct {v2, v3, v0, p1}, Ll/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Lf0/e2;->b:Ll/t;

    iput-object v1, p0, Lf0/e2;->c:Ll/t;

    invoke-static {p0}, Lo2/۟ۤۨۡۥ;->۟ۦۡۡۢ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۥۡۤ(Ljava/lang/Object;)La2/e;

    move-result-object v2

    invoke-static {v2}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x0

    sub-int v0, v2, v0

    rsub-int/lit8 v2, v0, 0x0

    iput v2, p0, Lf0/e2;->d:I

    invoke-static {p0}, Lh5/ۢ۠۠۟;->۟ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    const v0, 0xc984

    :goto_b
    const v4, 0xc995

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_20
    if-le v2, v3, :cond_7

    const v0, 0xc9e1

    goto :goto_b

    :cond_7
    :sswitch_21
    const v0, 0xc9c2

    goto :goto_b

    :sswitch_22
    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۢۥۡۦ(Ljava/lang/Object;)Ll/t;

    move-result-object v2

    const v0, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :cond_8
    :sswitch_23
    const v0, 0xca3e

    goto :goto_c

    :sswitch_24
    if-eqz v2, :cond_8

    const v0, 0xca5d

    goto :goto_c

    :sswitch_25
    invoke-static {v2}, Le2/۟۟ۥۦ;->ۤۨۢۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/t;

    const v3, 0xca7c

    :goto_d
    const v4, 0xca8d

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_c

    goto :goto_d

    :sswitch_26
    const v3, 0xcd26

    goto :goto_d

    :sswitch_27
    move-object v0, v1

    :sswitch_28
    const v3, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_d

    goto :goto_e

    :sswitch_29
    if-nez v0, :cond_9

    const v3, 0xcde0

    goto :goto_e

    :cond_9
    :sswitch_2a
    const v3, 0xcdc1

    goto :goto_e

    :sswitch_2b
    const v0, 0xcdff

    :goto_f
    const v1, 0xce10

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_f

    :sswitch_2c
    const v0, 0xce1e

    goto :goto_f

    :sswitch_2d
    move-object v2, v0

    :sswitch_2e
    const v0, 0xd106

    :goto_10
    const v3, 0xd117

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_f

    goto :goto_10

    :sswitch_2f
    if-eqz v2, :cond_a

    const v0, 0xd163

    goto :goto_10

    :cond_a
    :sswitch_30
    const v0, 0xd144

    goto :goto_10

    :sswitch_31
    invoke-static {v2}, Le2/۟۟ۥۦ;->ۤۨۢۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/t;

    const v3, 0xd182

    :goto_11
    const v4, 0xd193

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_10

    goto :goto_11

    :sswitch_32
    if-eqz v0, :cond_b

    const v3, 0xd1df

    goto :goto_11

    :cond_b
    :sswitch_33
    const v3, 0xd1c0

    goto :goto_11

    :sswitch_34
    invoke-static {v0}, Le2/۟۟ۥۦ;->ۤۨۢۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/t;

    const v3, 0xd1fe

    :goto_12
    const v4, 0xd20f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_11

    goto :goto_12

    :sswitch_35
    const v3, 0xd4a8

    goto :goto_12

    :sswitch_36
    move-object v0, v1

    :sswitch_37
    const v3, 0xd505

    :goto_13
    const v4, 0xd516

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_12

    goto :goto_13

    :sswitch_38
    if-eqz v0, :cond_c

    const v3, 0xd562

    goto :goto_13

    :cond_c
    :sswitch_39
    const v3, 0xd543

    goto :goto_13

    :sswitch_3a
    invoke-static {v2}, Le2/۟۟ۥۦ;->ۤۨۢۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/t;

    const v2, 0xd581

    :goto_14
    const v3, 0xd592

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_13

    goto :goto_14

    :sswitch_3b
    const v2, 0xd5a0

    goto :goto_14

    :sswitch_3c
    const v0, 0xd888

    :goto_15
    const v3, 0xd899

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_14

    goto :goto_15

    :sswitch_3d
    if-nez v2, :cond_d

    const v0, 0xd8e5

    goto :goto_15

    :cond_d
    :sswitch_3e
    const v0, 0xd8c6

    goto :goto_15

    :sswitch_3f
    const v0, 0xd904

    :goto_16
    const v1, 0xd915

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_15

    goto :goto_16

    :sswitch_40
    const v0, 0xd923

    goto :goto_16

    :sswitch_41
    iput-object v1, v2, Ll/t;->b:Ljava/lang/Object;

    goto/16 :goto_a

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
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_1e
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_10
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_1f
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1a
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
        0x11 -> :sswitch_20
        0x36 -> :sswitch_21
        0x57 -> :sswitch_1e
        0x74 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_23
        0x11 -> :sswitch_24
        0x2f -> :sswitch_27
        0x4c -> :sswitch_25
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_26
        0x7ab -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_29
        0x36 -> :sswitch_2a
        0x55 -> :sswitch_2e
        0x74 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_1e
        0x3ef -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_30
        0x53 -> :sswitch_36
        0x74 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_33
        0x4c -> :sswitch_34
        0x53 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_35
        0x6a7 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_38
        0x32 -> :sswitch_39
        0x55 -> :sswitch_3c
        0x74 -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3b
        0x32 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3d
        0x3e -> :sswitch_3e
        0x5f -> :sswitch_41
        0x7c -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_40
        0x36 -> :sswitch_1e
    .end sparse-switch
.end method
