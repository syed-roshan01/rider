.class public abstract Lk0/x0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/w1;

.field public static final b:Lt/w1;

.field public static final c:Lt/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lt/w;

    const v1, 0x3ecccccd    # 0.4f

    const v2, 0x3f19999a    # 0.6f

    invoke-direct {v0, v1, v2}, Lt/w;-><init>(FF)V

    invoke-static {}, Ld9/ۧۧۨۥ;->۟ۦۤۡ()Lt/w;

    move-result-object v1

    sget v2, Lv0/ۣۣۡۢ;->۟ۧۦۧ۟:I

    xor-int/lit16 v2, v2, -0x354

    sget v3, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۦۧۨۤ:I

    xor-int/lit16 v3, v3, -0x3b6

    new-instance v4, Lt/w1;

    invoke-direct {v4, v2, v1, v3}, Lt/w1;-><init>(ILt/a0;I)V

    sput-object v4, Lk0/x0;->a:Lt/w1;

    new-instance v1, Lt/w1;

    sget v4, Lcom/google/firebase/۟ۥۧۡۨ;->ۣۣۧ۠:I

    xor-int/lit16 v4, v4, 0x13b

    invoke-direct {v1, v4, v0, v3}, Lt/w1;-><init>(ILt/a0;I)V

    sput-object v1, Lk0/x0;->b:Lt/w1;

    new-instance v1, Lt/w1;

    invoke-direct {v1, v2, v0, v3}, Lt/w1;-><init>(ILt/a0;I)V

    sput-object v1, Lk0/x0;->c:Lt/w1;

    return-void
.end method

.method public static final a(Lt/d;FLx/k;Lx/k;Lu8/e;)Ljava/lang/Object;
    .locals 5

    const/4 v1, 0x0

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
    if-eqz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    instance-of v3, p3, Lx/o;

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->ۧۦۥۨ()Lt/w1;

    move-result-object v0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :pswitch_0
    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    instance-of v3, p3, Lx/b;

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v3, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :sswitch_b
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_c
    instance-of v3, p3, Lx/h;

    const v2, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_d
    if-eqz v3, :cond_3

    const v2, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_e
    const v2, 0xc240

    goto :goto_5

    :sswitch_f
    const v1, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :sswitch_10
    const v1, 0xc29d

    goto :goto_6

    :sswitch_11
    instance-of v3, p3, Lx/d;

    const v2, 0xc2fa

    :goto_7
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_7

    :sswitch_12
    if-eqz v3, :cond_4

    const v2, 0xc5e2

    goto :goto_7

    :cond_4
    :sswitch_13
    const v2, 0xc5c3

    goto :goto_7

    :sswitch_14
    const v1, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_8

    :sswitch_15
    const v1, 0xc620

    goto :goto_8

    :sswitch_16
    const v0, 0xc67d

    :goto_9
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :cond_5
    :sswitch_17
    const v0, 0xc6bb

    goto :goto_9

    :sswitch_18
    if-eqz p2, :cond_5

    const v0, 0xc965

    goto :goto_9

    :sswitch_19
    instance-of v3, p2, Lx/o;

    invoke-static {}, La/ۥۦۥۡ;->۠ۧۢۥ()Lt/w1;

    move-result-object v0

    const v2, 0xc984

    :goto_a
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_1a
    if-eqz v3, :cond_6

    const v2, 0xc9e1

    goto :goto_a

    :cond_6
    :sswitch_1b
    const v2, 0xc9c2

    goto :goto_a

    :sswitch_1c
    const v1, 0xca00

    :goto_b
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_1
    goto :goto_b

    :pswitch_2
    const v1, 0xca1f

    goto :goto_b

    :sswitch_1d
    instance-of v3, p2, Lx/b;

    const v2, 0xca7c

    :goto_c
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :sswitch_1e
    if-eqz v3, :cond_7

    const v2, 0xcd64

    goto :goto_c

    :cond_7
    :sswitch_1f
    const v2, 0xcd45

    goto :goto_c

    :sswitch_20
    const v1, 0xcd83

    :goto_d
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_d

    :sswitch_21
    const v1, 0xcda2

    goto :goto_d

    :sswitch_22
    instance-of v3, p2, Lx/h;

    const v2, 0xcdff

    :goto_e
    const v4, 0xce10

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d

    goto :goto_e

    :cond_8
    :sswitch_23
    const v2, 0xce3d

    goto :goto_e

    :sswitch_24
    if-eqz v3, :cond_8

    const v2, 0xd0e7

    goto :goto_e

    :sswitch_25
    invoke-static {}, Lf/۟ۤۧ۠ۡ;->ۣۢۦۡ()Lt/w1;

    move-result-object v0

    const v1, 0xd106

    :goto_f
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_e

    goto :goto_f

    :sswitch_26
    const v1, 0xd125

    goto :goto_f

    :sswitch_27
    instance-of v3, p2, Lx/d;

    const v2, 0xd182

    :goto_10
    const v4, 0xd193

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_f

    goto :goto_10

    :sswitch_28
    if-eqz v3, :cond_9

    const v2, 0xd1df

    goto :goto_10

    :cond_9
    :sswitch_29
    const v2, 0xd1c0

    goto :goto_10

    :sswitch_2a
    const v1, 0xd1fe

    :goto_11
    const v2, 0xd20f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_11

    :sswitch_2b
    const v1, 0xd4a8

    goto :goto_11

    :sswitch_2c
    move-object v0, v1

    :sswitch_2d
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v1

    const v2, 0xd505

    :goto_12
    const v3, 0xd516

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_11

    goto :goto_12

    :sswitch_2e
    if-eqz v0, :cond_a

    const v2, 0xd562

    goto :goto_12

    :cond_a
    :sswitch_2f
    const v2, 0xd543

    goto :goto_12

    :sswitch_30
    new-instance v2, Lm2/e;

    invoke-direct {v2, p1}, Lm2/e;-><init>(F)V

    invoke-static {p0, v2, v0, p4}, Ll0/ۡۦۦۡ;->ۣۣۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v3

    const v2, 0xd581

    :goto_13
    const v4, 0xd592

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_12

    goto :goto_13

    :sswitch_31
    if-ne v0, v3, :cond_b

    const v2, 0xd869

    goto :goto_13

    :cond_b
    :sswitch_32
    const v2, 0xd5bf

    goto :goto_13

    :sswitch_33
    move-object v0, v1

    :goto_14
    :sswitch_34
    return-object v0

    :sswitch_35
    new-instance v0, Lm2/e;

    invoke-direct {v0, p1}, Lm2/e;-><init>(F)V

    invoke-static {p0, v0, p4}, Ln9/ۤۧۧۤ;->۠ۥۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v3

    const v2, 0xd888

    :goto_15
    const v4, 0xd899

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_13

    goto :goto_15

    :sswitch_36
    if-ne v0, v3, :cond_c

    const v2, 0xd8e5

    goto :goto_15

    :cond_c
    :sswitch_37
    const v2, 0xd8c6

    goto :goto_15

    :sswitch_38
    move-object v0, v1

    goto :goto_14

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_16
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
        0xb97b -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_c
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_5
        0x1f7 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_e
        0x4c -> :sswitch_f
        0x53 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_5
        0xf1 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_2c
        0x6e9 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x32 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_17
        0x35 -> :sswitch_2c
        0xf3 -> :sswitch_18
        0xfeb -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1a
        0x36 -> :sswitch_1b
        0x57 -> :sswitch_1d
        0x74 -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_1e
        0x7ab -> :sswitch_1f
        0x7c8 -> :sswitch_22
        0x7e9 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_21
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_23
        0x2d -> :sswitch_27
        0x3ef -> :sswitch_24
        0x1ef7 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_28
        0x32 -> :sswitch_29
        0x4c -> :sswitch_2a
        0x53 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_2b
        0x6a7 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_2e
        0x32 -> :sswitch_2f
        0x55 -> :sswitch_35
        0x74 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_31
        0x2d -> :sswitch_33
        0x32 -> :sswitch_32
        0xdfb -> :sswitch_34
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_36
        0x3e -> :sswitch_37
        0x5f -> :sswitch_38
        0x7c -> :sswitch_34
    .end sparse-switch
.end method
