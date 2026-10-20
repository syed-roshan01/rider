.class public final Lk0/d3;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk0/d3;->short:[S

    return-void

    :array_0
    .array-data 2
        0x7eds
        0x7efs
        0x7f8s
        0x7e5s
        0x7e3s
        0x7e2s
        0xb38s
        0xb35s
        0xb2fs
        0xb31s
        0xb35s
        0xb2fs
        0xb2fs
        0xb1ds
        0xb3fs
        0xb28s
        0xb35s
        0xb33s
        0xb32s
        0x564s
        0x575s
        0x568s
        0x564s
        0x1e1s
        0x1c0s
        0x18fs
        0x1cds
        0x1ces
        0x1dcs
        0x1cas
        0x1c3s
        0x1c6s
        0x1c1s
        0x1cas
        0x1dcs
        0x18fs
        0x1c9s
        0x1c0s
        0x1dds
        0x18fs
        0x1dbs
        0x1cas
        0x1d7s
        0x1dbs
        0xb30s
        0xb1cs
        0xb1fs
        0xb1fs
        0xb16s
        0xb10s
        0xb07s
        0xb1as
        0xb1cs
        0xb1ds
        0xb53s
        0xb10s
        0xb1cs
        0xb1ds
        0xb07s
        0xb12s
        0xb1as
        0xb1ds
        0xb00s
        0xb53s
        0xb1ds
        0xb1cs
        0xb53s
        0xb16s
        0xb1fs
        0xb16s
        0xb1es
        0xb16s
        0xb1ds
        0xb07s
        0xb53s
        0xb1es
        0xb12s
        0xb07s
        0xb10s
        0xb1bs
        0xb1as
        0xb1ds
        0xb14s
        0xb53s
        0xb07s
        0xb1bs
        0xb16s
        0xb53s
        0xb03s
        0xb01s
        0xb16s
        0xb17s
        0xb1as
        0xb10s
        0xb12s
        0xb07s
        0xb16s
        0xb5ds
    .end array-data
.end method

.method public static ۨۡۧ()[S
    .locals 2

    invoke-static {}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣۣ۟ۥ۠()I

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
    sget-object v0, Lk0/d3;->short:[S

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
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 19

    invoke-static/range {p3 .. p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v2

    invoke-static {}, Li6/ۡۤۦ;->ۥۤۡۤ()F

    move-result v3

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {v2, v3}, Lc3/۟ۡۧۢۥ;->ۣۡ۟ۧ(II)I

    move-result v16

    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v6

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    const/4 v5, 0x0

    const/16 v2, 0x650

    :goto_1
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_1

    :sswitch_1
    if-ge v4, v6, :cond_0

    const/16 v2, 0x6ad

    goto :goto_1

    :sswitch_2
    move-object/from16 v0, p2

    invoke-static {v0, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Lr1/i0;

    invoke-static {v2}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/d3;->ۨۡۧ()[S

    move-result-object v7

    const/4 v8, 0x0

    sget v9, Le2/ۨۥ۠ۨ;->ۣ۟۟ۢۨ:I

    xor-int/lit16 v9, v9, 0xbb

    const/16 v10, 0x78c

    invoke-static {v7, v8, v9, v10}, Lr2/ۡۧۥۧ;->ۥ۠۠۟([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-eqz v7, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_5
    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    const v2, 0xbe22

    goto :goto_3

    :sswitch_7
    move-object v2, v3

    :goto_4
    check-cast v2, Lr1/i0;

    const v3, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_5

    :cond_2
    :sswitch_8
    const v3, 0xbf39

    goto :goto_5

    :sswitch_9
    sget v2, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۦۡ۠ۥ:I

    xor-int/lit16 v2, v2, 0x216

    add-int/2addr v2, v4

    const v3, 0xbe7f

    :goto_6
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_6

    :sswitch_a
    move v4, v2

    goto :goto_0

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_6

    :sswitch_c
    const/4 v2, 0x0

    goto :goto_4

    :sswitch_d
    if-eqz v2, :cond_2

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_e
    move-wide/from16 v0, p3

    invoke-static {v2, v0, v1}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v2

    const v3, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    const v3, 0xc221

    goto :goto_7

    :sswitch_10
    move-object v11, v2

    :goto_8
    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v6

    const/4 v2, 0x0

    move v4, v2

    :goto_9
    const v2, 0xc27e

    :goto_a
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_a

    :cond_3
    :sswitch_11
    const v2, 0xc2bc

    goto :goto_a

    :sswitch_12
    const/4 v2, 0x0

    move-object v11, v2

    goto :goto_8

    :sswitch_13
    if-ge v4, v6, :cond_3

    const v2, 0xc2db

    goto :goto_a

    :sswitch_14
    move-object/from16 v0, p2

    invoke-static {v0, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Lr1/i0;

    invoke-static {v2}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/d3;->ۨۡۧ()[S

    move-result-object v7

    const/4 v8, 0x6

    sget v9, Lea/ۦۦۨۨ;->۟۠ۧ۠۟:I

    xor-int/lit16 v9, v9, 0x2f3

    const/16 v10, 0xb5c

    invoke-static {v7, v8, v9, v10}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->۠ۧۤۢ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xc2fa

    :goto_b
    const v8, 0xc30b

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_7

    goto :goto_b

    :sswitch_15
    if-eqz v7, :cond_4

    const v2, 0xc5e2

    goto :goto_b

    :cond_4
    :sswitch_16
    const v2, 0xc5c3

    goto :goto_b

    :sswitch_17
    const v2, 0xc601

    :goto_c
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_c

    :sswitch_18
    const v2, 0xc620

    goto :goto_c

    :sswitch_19
    move-object v2, v3

    :goto_d
    check-cast v2, Lr1/i0;

    const v3, 0xc984

    :goto_e
    const v4, 0xc995

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_9

    goto :goto_e

    :sswitch_1a
    if-eqz v2, :cond_5

    const v3, 0xc9e1

    goto :goto_e

    :sswitch_1b
    sget v2, Lrikka/shizuku/۟ۤۦ۟ۦ;->۠ۦۣۨ:I

    xor-int/lit16 v2, v2, 0x34a

    add-int/2addr v2, v4

    const v3, 0xc67d

    :goto_f
    const v4, 0xc68e

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_a

    goto :goto_f

    :sswitch_1c
    move v4, v2

    goto/16 :goto_9

    :sswitch_1d
    const v3, 0xc69c

    goto :goto_f

    :sswitch_1e
    const/4 v2, 0x0

    goto :goto_d

    :cond_5
    :sswitch_1f
    const v3, 0xc9c2

    goto :goto_e

    :sswitch_20
    move-wide/from16 v0, p3

    invoke-static {v2, v0, v1}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v2

    move-object v12, v2

    :goto_10
    const v2, 0xca00

    :goto_11
    const v3, 0xca11

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_11

    :cond_6
    :sswitch_21
    const v2, 0xca3e

    goto :goto_11

    :sswitch_22
    if-eqz v11, :cond_6

    const v2, 0xca5d

    goto :goto_11

    :sswitch_23
    invoke-static {v11}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v2

    const v3, 0xca7c

    :goto_12
    const v4, 0xca8d

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_c

    goto :goto_12

    :sswitch_24
    const v3, 0xcd26

    goto :goto_12

    :sswitch_25
    move v13, v2

    :goto_13
    const v2, 0xcd83

    :goto_14
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_14

    :sswitch_26
    if-eqz v11, :cond_7

    const v2, 0xcde0

    goto :goto_14

    :sswitch_27
    const/4 v2, 0x0

    move v13, v2

    goto :goto_13

    :cond_7
    :sswitch_28
    const v2, 0xcdc1

    goto :goto_14

    :sswitch_29
    invoke-static {v11}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    const v3, 0xcdff

    :goto_15
    const v4, 0xce10

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_e

    goto :goto_15

    :sswitch_2a
    move v10, v2

    :goto_16
    const v2, 0xd106

    :goto_17
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_17

    :sswitch_2b
    if-eqz v12, :cond_8

    const v2, 0xd163

    goto :goto_17

    :sswitch_2c
    const v3, 0xce1e

    goto :goto_15

    :sswitch_2d
    const/4 v2, 0x0

    move v10, v2

    goto :goto_16

    :cond_8
    :sswitch_2e
    const v2, 0xd144

    goto :goto_17

    :sswitch_2f
    invoke-static {v12}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v2

    const v3, 0xd182

    :goto_18
    const v4, 0xd193

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_10

    goto :goto_18

    :sswitch_30
    const v3, 0xd1a1

    goto :goto_18

    :sswitch_31
    move v14, v2

    :goto_19
    const v2, 0xd1fe

    :goto_1a
    const v3, 0xd20f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_11

    goto :goto_1a

    :sswitch_32
    if-eqz v12, :cond_9

    const v2, 0xd4e6

    goto :goto_1a

    :sswitch_33
    const/4 v2, 0x0

    move v14, v2

    goto :goto_19

    :cond_9
    :sswitch_34
    const v2, 0xd4c7

    goto :goto_1a

    :sswitch_35
    invoke-static {v12}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    const v3, 0xd505

    :goto_1b
    const v4, 0xd516

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_12

    goto :goto_1b

    :sswitch_36
    const v3, 0xd524

    goto :goto_1b

    :sswitch_37
    move v15, v2

    :goto_1c
    const v2, 0xd581

    :goto_1d
    const v3, 0xd592

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_13

    goto :goto_1d

    :sswitch_38
    if-nez v14, :cond_a

    const v2, 0xd869

    goto :goto_1d

    :sswitch_39
    const/4 v2, 0x0

    move v15, v2

    goto :goto_1c

    :cond_a
    :sswitch_3a
    const v2, 0xd5bf

    goto :goto_1d

    :sswitch_3b
    invoke-static {}, Landroidx/profileinstaller/۠ۡۥۡ;->۟۠ۦ۟ۡ()F

    move-result v2

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v2

    const v3, 0xd888

    :goto_1e
    const v4, 0xd899

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_14

    goto :goto_1e

    :sswitch_3c
    const v3, 0xd8a7

    goto :goto_1e

    :sswitch_3d
    const/4 v2, 0x0

    :sswitch_3e
    add-int/lit8 v3, v16, -0x4

    sub-int/2addr v3, v13

    add-int/lit8 v3, v3, 0x4

    add-int/lit8 v3, v3, 0xd

    sub-int/2addr v3, v14

    add-int/lit8 v3, v3, -0xd

    add-int/lit8 v3, v3, -0x3

    sub-int v2, v3, v2

    add-int/lit8 v2, v2, 0x3

    invoke-static/range {p3 .. p4}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۢۥۤۤ(J)I

    move-result v5

    const v3, 0xd904

    :goto_1f
    const v4, 0xd915

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_15

    goto :goto_1f

    :sswitch_3f
    if-ge v2, v5, :cond_b

    const v3, 0xd961

    goto :goto_1f

    :cond_b
    :sswitch_40
    const v3, 0xd942

    goto :goto_1f

    :sswitch_41
    const v2, 0xd980

    :goto_20
    const v3, 0xd991

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_16

    goto :goto_20

    :sswitch_42
    const v2, 0xdc2a

    goto :goto_20

    :sswitch_43
    move v5, v2

    :sswitch_44
    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    const/4 v2, 0x0

    move v3, v2

    :goto_21
    const v2, 0xdc87

    :goto_22
    const v6, 0xdc98

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_17

    goto :goto_22

    :sswitch_45
    if-ge v3, v4, :cond_c

    const v2, 0xdce4

    goto :goto_22

    :cond_c
    :sswitch_46
    const v2, 0xdcc5

    goto :goto_22

    :sswitch_47
    move-object/from16 v0, p2

    invoke-static {v0, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lr1/i0;

    invoke-static {v9}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/d3;->ۨۡۧ()[S

    move-result-object v6

    const/16 v7, 0x13

    sget v8, Lv/ۣۢ۟ۧ;->ۣ۠ۨۤ:I

    xor-int/lit16 v8, v8, 0x3c0

    const/16 v17, 0x510

    move/from16 v0, v17

    invoke-static {v6, v7, v8, v0}, Lr/۠ۡ۠;->۟ۢۢۥۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xdd03

    :goto_23
    const v7, 0xdd14

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_18

    goto :goto_23

    :sswitch_48
    if-eqz v6, :cond_d

    const v2, 0x170090

    goto :goto_23

    :cond_d
    :sswitch_49
    const v2, 0xdd41

    goto :goto_23

    :sswitch_4a
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x9

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v8}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤ۟(JIIIII)J

    move-result-wide v2

    invoke-static {v9, v2, v3}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v3

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۣۤ۠ۥ()Lr1/o;

    move-result-object v7

    invoke-static {v3, v7}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v8

    invoke-static {}, Lk0/d3;->ۨۡۧ()[S

    move-result-object v2

    const/16 v4, 0x17

    sget v5, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->۟ۦۡ۠ۧ:I

    xor-int/lit16 v5, v5, -0xc4

    const/16 v6, 0x1af

    invoke-static {v2, v4, v5, v6}, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟ۥۥۦ([SIII)Ljava/lang/String;

    move-result-object v4

    const v2, 0x1700af

    :goto_24
    const v5, 0x1700c0

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_19

    goto :goto_24

    :cond_e
    :sswitch_4b
    const v2, 0x1700ed

    goto :goto_24

    :sswitch_4c
    const/high16 v2, -0x80000000

    if-eq v8, v2, :cond_e

    const v2, 0x17010c

    goto :goto_24

    :sswitch_4d
    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->۟ۢۨ۠ۡ()Lr1/o;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const v2, 0x17012b

    :goto_25
    const v6, 0x17013c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1a

    goto :goto_25

    :sswitch_4e
    const/high16 v2, -0x80000000

    if-eq v5, v2, :cond_f

    const v2, 0x170188

    goto :goto_25

    :cond_f
    :sswitch_4f
    const v2, 0x170169

    goto :goto_25

    :sswitch_50
    const v2, 0x1701a7

    :goto_26
    const v4, 0x1701b8

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1b

    goto :goto_26

    :sswitch_51
    if-ne v8, v5, :cond_10

    const v2, 0x17048f

    goto :goto_26

    :cond_10
    :sswitch_52
    const v2, 0x170470

    goto :goto_26

    :sswitch_53
    const/4 v2, 0x1

    const v4, 0x1704ae

    :goto_27
    const v5, 0x1704bf

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1c

    goto :goto_27

    :sswitch_54
    const v4, 0x1704cd

    goto :goto_27

    :sswitch_55
    const/4 v2, 0x0

    :sswitch_56
    add-int/lit8 v4, v16, 0xb

    sub-int/2addr v4, v14

    add-int/lit8 v6, v4, -0xb

    const v4, 0x17052a

    :goto_28
    const v5, 0x17053b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1d

    goto :goto_28

    :sswitch_57
    if-eqz v2, :cond_11

    const v4, 0x170812

    goto :goto_28

    :cond_11
    :sswitch_58
    const v4, 0x170568

    goto :goto_28

    :sswitch_59
    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->۟ۡۢۢۧ()F

    move-result v2

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v10, v15}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v4

    invoke-static {v2, v4}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v5

    add-int/lit8 v2, v5, 0x1f

    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v2, v4

    add-int/lit8 v2, v2, -0x1f

    sget v4, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۢۡۤ:I

    xor-int/lit16 v4, v4, 0x134

    div-int v4, v2, v4

    const v2, 0x170831

    :goto_29
    const v9, 0x170842

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_1e

    goto :goto_29

    :cond_12
    :sswitch_5a
    const v2, 0x17086f

    goto :goto_29

    :sswitch_5b
    if-eqz v11, :cond_12

    const v2, 0x17088e

    goto :goto_29

    :sswitch_5c
    invoke-static {v11, v7}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    const v2, 0x1708ad

    :goto_2a
    const v9, 0x1708be

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_1f

    goto :goto_2a

    :sswitch_5d
    const/high16 v2, -0x80000000

    if-eq v7, v2, :cond_13

    const v2, 0x17090a

    goto :goto_2a

    :cond_13
    :sswitch_5e
    const v2, 0x1708eb

    goto :goto_2a

    :sswitch_5f
    add-int/lit8 v2, v8, -0x1b

    add-int/2addr v2, v4

    add-int/lit8 v2, v2, 0x1b

    add-int/lit8 v2, v2, -0x15

    sub-int/2addr v2, v7

    add-int/lit8 v2, v2, 0x15

    const v7, 0x170929

    :goto_2b
    const v8, 0x17093a

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_20

    goto :goto_2b

    :sswitch_60
    const v7, 0x170bd3

    goto :goto_2b

    :sswitch_61
    const/4 v2, 0x0

    :sswitch_62
    const v7, 0x170c30

    :goto_2c
    const v8, 0x170c41

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_21

    goto :goto_2c

    :sswitch_63
    move v14, v5

    move v10, v2

    :goto_2d
    const v2, 0x17102f

    :goto_2e
    const v5, 0x171040

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_22

    goto :goto_2e

    :cond_14
    :sswitch_64
    const v2, 0x17106d

    goto :goto_2e

    :sswitch_65
    const v7, 0x170c4f

    goto :goto_2c

    :sswitch_66
    invoke-static {}, La7/۠ۢۧ;->۟ۥۨۨۦ()F

    move-result v2

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v2

    add-int/lit8 v2, v2, 0x9

    sub-int/2addr v2, v8

    add-int/lit8 v4, v2, -0x9

    invoke-static {}, Lc1/ۣۡۢۦ;->۟۟ۦۦ()F

    move-result v2

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x0

    sub-int v5, v4, v5

    invoke-static {v2, v5}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v5

    const v2, 0x170cac

    :goto_2f
    const v7, 0x170cbd

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_23

    goto :goto_2f

    :sswitch_67
    if-eqz v11, :cond_15

    const v2, 0x170f94

    goto :goto_2f

    :cond_15
    :sswitch_68
    const v2, 0x170cea

    goto :goto_2f

    :sswitch_69
    add-int/lit8 v2, v5, -0xb

    invoke-static {v11}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v7

    sub-int/2addr v2, v7

    add-int/lit8 v2, v2, 0xb

    sget v7, Ld9/ۥۡۧۡ;->۟ۡۨ:I

    xor-int/lit16 v7, v7, 0x350

    div-int/2addr v2, v7

    const v7, 0x170fb3

    :goto_30
    const v8, 0x170fc4

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_24

    goto :goto_30

    :goto_31
    :sswitch_6a
    move v14, v5

    move v10, v2

    goto :goto_2d

    :sswitch_6b
    const v7, 0x170fd2

    goto :goto_30

    :sswitch_6c
    const/4 v2, 0x0

    goto :goto_31

    :sswitch_6d
    if-eqz v12, :cond_14

    const v2, 0x17108c

    goto :goto_2e

    :sswitch_6e
    add-int/lit8 v2, v14, -0x2

    invoke-static {v12}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    sub-int/2addr v2, v5

    add-int/lit8 v2, v2, 0x2

    sget v5, Lc4/ۡ۟۠ۥ;->۟ۦۣ۟۟:I

    xor-int/lit16 v5, v5, -0xdc

    div-int v7, v2, v5

    const v2, 0x1710ab

    :goto_32
    const v5, 0x1710bc

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_25

    goto :goto_32

    :sswitch_6f
    const v2, 0x171355

    goto :goto_32

    :sswitch_70
    const/4 v7, 0x0

    :sswitch_71
    new-instance v2, Lk0/c3;

    add-int/lit8 v5, v6, 0xf

    sub-int/2addr v5, v13

    add-int/lit8 v9, v5, -0xf

    move-object v5, v12

    move-object v8, v11

    invoke-direct/range {v2 .. v10}, Lk0/c3;-><init>(Lr1/x0;ILr1/x0;IILr1/x0;II)V

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v3

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-static {v0, v1, v14, v3, v2}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v2

    return-object v2

    :sswitch_72
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_73
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_74
    sget v2, Lcom/google/firebase/۟ۥۧۡۨ;->ۣۣۧ۠:I

    xor-int/lit16 v2, v2, 0x1ac

    add-int/2addr v2, v3

    const v3, 0x1713b2

    :goto_33
    const v6, 0x1713c3

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_26

    goto :goto_33

    :sswitch_75
    move v3, v2

    goto/16 :goto_21

    :sswitch_76
    const v3, 0x1713d1

    goto :goto_33

    :sswitch_77
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-static {}, Lk0/d3;->ۨۡۧ()[S

    move-result-object v3

    const/16 v4, 0x2c

    sget v5, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۥۤۦۨ:I

    xor-int/lit8 v5, v5, -0x11

    const/16 v6, 0xb73

    invoke-static {v3, v4, v5, v6}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۣۢۧ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_78
    move-object v12, v5

    goto/16 :goto_10

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x16 -> :sswitch_8
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_1e
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x11 -> :sswitch_1a
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_78
        0x74 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_27
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_28
        0x55 -> :sswitch_2d
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x3ef -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_33
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_32
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_39
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_38
        0x2d -> :sswitch_3d
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3f
        0x36 -> :sswitch_40
        0x57 -> :sswitch_43
        0x74 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_42
        0x5bb -> :sswitch_44
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_45
        0x3e -> :sswitch_46
        0x5d -> :sswitch_77
        0x7c -> :sswitch_47
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_48
        0x36 -> :sswitch_49
        0x55 -> :sswitch_74
        0x17dd84 -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4b
        0x2d -> :sswitch_73
        0x6f -> :sswitch_4c
        0x1cc -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4e
        0x55 -> :sswitch_72
        0x76 -> :sswitch_4f
        0xb4 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_51
        0x537 -> :sswitch_53
        0x5c8 -> :sswitch_55
        0x5e9 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_54
        0x72 -> :sswitch_56
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_57
        0x53 -> :sswitch_66
        0x72 -> :sswitch_58
        0xd29 -> :sswitch_59
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_5a
        0x2d -> :sswitch_61
        0x73 -> :sswitch_5b
        0xcc -> :sswitch_5c
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5d
        0x55 -> :sswitch_61
        0x72 -> :sswitch_5e
        0x1b4 -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_60
        0x2e9 -> :sswitch_62
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_63
        0x71 -> :sswitch_65
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0xe -> :sswitch_64
        0x2d -> :sswitch_70
        0x6f -> :sswitch_6d
        0xcc -> :sswitch_6e
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x11 -> :sswitch_67
        0x57 -> :sswitch_6c
        0x76 -> :sswitch_68
        0x329 -> :sswitch_69
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0x16 -> :sswitch_6a
        0x77 -> :sswitch_6b
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_6f
        0x3e9 -> :sswitch_71
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_75
        0x71 -> :sswitch_76
    .end sparse-switch
.end method
