.class public final Lk0/a4;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk0/a4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x7ecs
        0x7c0s
        0x7c3s
        0x7c3s
        0x7cas
        0x7ccs
        0x7dbs
        0x7c6s
        0x7c0s
        0x7c1s
        0x78fs
        0x7ccs
        0x7c0s
        0x7c1s
        0x7dbs
        0x7ces
        0x7c6s
        0x7c1s
        0x7dcs
        0x78fs
        0x7c1s
        0x7c0s
        0x78fs
        0x7cas
        0x7c3s
        0x7cas
        0x7c2s
        0x7cas
        0x7c1s
        0x7dbs
        0x78fs
        0x7c2s
        0x7ces
        0x7dbs
        0x7ccs
        0x7c7s
        0x7c6s
        0x7c1s
        0x7c8s
        0x78fs
        0x7dbs
        0x7c7s
        0x7cas
        0x78fs
        0x7dfs
        0x7dds
        0x7cas
        0x7cbs
        0x7c6s
        0x7ccs
        0x7ces
        0x7dbs
        0x7cas
        0x781s
        0x408s
        0x419s
        0x404s
        0x408s
        0xb81s
        0xb8bs
        0xb87s
        0xb86s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk0/a4;->a:I

    iput-object p2, p0, Lk0/a4;->b:Ljava/lang/Object;

    iput-object p3, p0, Lk0/a4;->c:Ljava/lang/Object;

    invoke-static {}, Ld1/ۣۧۡۡ;->ۢۨ۠۠()I

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
    const-string v0, "kskxiAFxiZ4FmFHPd4fc0Yum"

    invoke-static {v0}, Lh3/ۣ۠ۡۨ;->ۥۦۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۣۢۤۧ()[S
    .locals 2

    invoke-static {}, Lv6/۟ۦۨۦۣ;->ۦۧۥۣ()I

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
    sget-object v0, Lk0/a4;->short:[S

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
    .locals 15

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v12

    const/4 v11, 0x0

    invoke-static {p0}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۢۤۢ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Le9/ۧۧۡ;->ۤۨۢۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {p0}, Lh/۟ۡۥۡۧ;->ۢۡۦۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    packed-switch v3, :pswitch_data_0

    check-cast v2, Lo2/r;

    move-object v3, v9

    check-cast v3, Lm2/l;

    invoke-static {v2, v3}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣ۟۟ۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۡ۠ۧ۟()Lo2/b;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v0, v2, v3, v12, v4}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v2

    :goto_0
    return-object v2

    :pswitch_0
    check-cast v2, Lc9/e;

    invoke-static {}, Lk0/a4;->ۣۢۤۧ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟۟ۥۡ:I

    xor-int/lit16 v5, v5, 0x360

    const/16 v6, 0x7af

    invoke-static {v3, v4, v5, v6}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->۟ۧۤۢ۟([SIII)Ljava/lang/String;

    move-result-object v13

    const/16 v3, 0x650

    :goto_1
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v3, 0x68e

    goto :goto_1

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v3, 0x6ad

    goto :goto_1

    :sswitch_2
    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    const/4 v2, 0x0

    move v3, v2

    :goto_2
    const/16 v2, 0x6cc

    :goto_3
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_3

    :sswitch_3
    if-ge v3, v4, :cond_1

    const/16 v2, 0x729

    goto :goto_3

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_3

    :sswitch_5
    move-object/from16 v0, p2

    invoke-static {v0, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lr1/i0;

    invoke-static {v10}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/a4;->ۣۢۤۧ()[S

    move-result-object v5

    const/16 v6, 0x36

    sget v7, Lz7/۟ۢۧۡۥ;->ۧۡۦۧ:I

    xor-int/lit16 v7, v7, -0x217

    const/16 v8, 0x47c

    invoke-static {v5, v6, v7, v8}, Lc1/ۣۡۢۦ;->۟ۢۦۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v2, 0x748

    :goto_4
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_4

    :sswitch_6
    if-eqz v5, :cond_2

    const v2, 0xbe60

    goto :goto_4

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_4

    :sswitch_8
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget v2, Lv0/ۣۣۡۢ;->۟ۧۦۧ۟:I

    xor-int/lit16 v8, v2, -0x321

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v8}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤ۟(JIIIII)J

    move-result-wide v2

    invoke-static {v10, v2, v3}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v3

    const v2, 0xbe7f

    :goto_5
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_5

    :goto_6
    :sswitch_9
    check-cast v9, Lc9/e;

    const v2, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_7

    :sswitch_a
    if-eqz v9, :cond_3

    const v2, 0xc25f

    goto :goto_7

    :sswitch_b
    const v2, 0xbe9e

    goto :goto_5

    :sswitch_c
    sget v2, La8/ۣۡۨ۠;->ۣ۟ۧۢ۟:I

    xor-int/lit16 v2, v2, -0x1b6

    add-int/2addr v2, v3

    const v3, 0xbefb

    :goto_8
    const v5, 0xbf0c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_5

    goto :goto_8

    :sswitch_d
    move v3, v2

    goto/16 :goto_2

    :sswitch_e
    const v3, 0xbf1a

    goto :goto_8

    :sswitch_f
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v13}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_10
    const/4 v3, 0x0

    goto :goto_6

    :cond_3
    :sswitch_11
    const v2, 0xc240

    goto :goto_7

    :sswitch_12
    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v6

    const/4 v2, 0x0

    move v4, v2

    :goto_9
    const v2, 0xc27e

    :goto_a
    const v5, 0xc28f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_a

    :cond_4
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_a

    :sswitch_14
    if-ge v4, v6, :cond_4

    const v2, 0xc2db

    goto :goto_a

    :sswitch_15
    move-object/from16 v0, p2

    invoke-static {v0, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/i0;

    invoke-static {v2}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {}, Lk0/a4;->ۣۢۤۧ()[S

    move-result-object v7

    const/16 v8, 0x3a

    sget v9, Lx7/۟۟ۦۨۡ;->۟ۦۣۢۥ:I

    xor-int/lit8 v9, v9, 0x78

    const/16 v10, 0xbe8

    invoke-static {v7, v8, v9, v10}, Lca/ۨۤۢۥ;->۟ۥۢۢۡ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v5, 0xc2fa

    :goto_b
    const v8, 0xc30b

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_7

    goto :goto_b

    :sswitch_16
    if-eqz v7, :cond_5

    const v5, 0xc5e2

    goto :goto_b

    :cond_5
    :sswitch_17
    const v5, 0xc5c3

    goto :goto_b

    :sswitch_18
    move-wide/from16 v0, p3

    invoke-static {v2, v0, v1}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v4

    const v2, 0xc601

    :goto_c
    const v5, 0xc612

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8

    goto :goto_c

    :sswitch_19
    const v2, 0xc620

    goto :goto_c

    :sswitch_1a
    sget v2, Lcom/google/firebase/۟ۥۧۡۨ;->ۣۣۧ۠:I

    xor-int/lit16 v2, v2, 0x1ac

    add-int/2addr v2, v4

    const v4, 0xc67d

    :goto_d
    const v5, 0xc68e

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_9

    goto :goto_d

    :sswitch_1b
    move v4, v2

    goto :goto_9

    :sswitch_1c
    const v4, 0xc69c

    goto :goto_d

    :sswitch_1d
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v13}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_1e
    const/4 v4, 0x0

    :sswitch_1f
    const v2, 0xc984

    :goto_e
    const v5, 0xc995

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_a

    goto :goto_e

    :sswitch_20
    if-eqz v3, :cond_6

    const v2, 0xc9e1

    goto :goto_e

    :cond_6
    :sswitch_21
    const v2, 0xc9c2

    goto :goto_e

    :sswitch_22
    invoke-static {v3}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v2

    const v5, 0xca00

    :goto_f
    const v6, 0xca11

    xor-int/2addr v5, v6

    packed-switch v5, :pswitch_data_1

    :pswitch_1
    goto :goto_f

    :goto_10
    :pswitch_2
    const v5, 0xca7c

    :goto_11
    const v6, 0xca8d

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_b

    goto :goto_11

    :sswitch_23
    if-eqz v4, :cond_7

    const v5, 0xcd64

    goto :goto_11

    :pswitch_3
    const v5, 0xca1f

    goto :goto_f

    :sswitch_24
    const/4 v2, 0x0

    goto :goto_10

    :cond_7
    :sswitch_25
    const v5, 0xcd45

    goto :goto_11

    :sswitch_26
    invoke-static {v4}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v5

    const v6, 0xcd83

    :goto_12
    const v7, 0xcd94

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_c

    goto :goto_12

    :sswitch_27
    const v6, 0xcda2

    goto :goto_12

    :sswitch_28
    const/4 v5, 0x0

    :sswitch_29
    invoke-static {v2, v5}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v6

    const v2, 0xcdff

    :goto_13
    const v5, 0xce10

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_d

    goto :goto_13

    :cond_8
    :sswitch_2a
    const v2, 0xce3d

    goto :goto_13

    :sswitch_2b
    if-eqz v3, :cond_8

    const v2, 0xd0e7

    goto :goto_13

    :sswitch_2c
    const v2, 0xd106

    :goto_14
    const v5, 0xd117

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_e

    goto :goto_14

    :sswitch_2d
    if-eqz v4, :cond_9

    const v2, 0xd163

    goto :goto_14

    :cond_9
    :sswitch_2e
    const v2, 0xd144

    goto :goto_14

    :sswitch_2f
    invoke-static {}, Lo4/۟۟ۡۧۤ;->۟ۨۡ()F

    move-result v2

    const v5, 0xd182

    :goto_15
    const v7, 0xd193

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_f

    goto :goto_15

    :sswitch_30
    const v5, 0xd1a1

    goto :goto_15

    :sswitch_31
    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۦ۠ۡۥ()F

    move-result v2

    :sswitch_32
    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v7

    const v2, 0xd1fe

    :goto_16
    const v5, 0xd20f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_10

    goto :goto_16

    :sswitch_33
    if-eqz v4, :cond_a

    const v2, 0xd4e6

    goto :goto_16

    :cond_a
    :sswitch_34
    const v2, 0xd4c7

    goto :goto_16

    :sswitch_35
    invoke-static {v4}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    const v5, 0xd505

    :goto_17
    const v8, 0xd516

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_11

    goto :goto_17

    :sswitch_36
    const v5, 0xd524

    goto :goto_17

    :sswitch_37
    const/4 v2, 0x0

    :sswitch_38
    const v5, 0xd581

    :goto_18
    const v8, 0xd592

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_12

    goto :goto_18

    :sswitch_39
    if-eqz v3, :cond_b

    const v5, 0xd869

    goto :goto_18

    :cond_b
    :sswitch_3a
    const v5, 0xd5bf

    goto :goto_18

    :sswitch_3b
    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v5

    :goto_19
    rsub-int/lit8 v5, v5, 0x0

    sub-int/2addr v2, v5

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۥۤ۟ۥ()J

    move-result-wide v8

    move-object/from16 v0, p1

    invoke-static {v0, v8, v9}, Lj9/۠۠ۨ;->ۣ۟ۤۢ۟(Ljava/lang/Object;J)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x0

    sub-int/2addr v2, v5

    invoke-static {v7, v2}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v7

    const v2, 0xd888

    :goto_1a
    const v5, 0xd899

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_13

    goto :goto_1a

    :sswitch_3c
    if-eqz v3, :cond_c

    const v2, 0xd8e5

    goto :goto_1a

    :cond_c
    :sswitch_3d
    const v2, 0xd8c6

    goto :goto_1a

    :sswitch_3e
    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۣۤ۠ۥ()Lr1/o;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v8

    const v2, 0xd904

    :goto_1b
    const v5, 0xd915

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_14

    goto :goto_1b

    :sswitch_3f
    const v2, 0xd923

    goto :goto_1b

    :sswitch_40
    const/4 v8, 0x0

    :sswitch_41
    const v2, 0xd980

    :goto_1c
    const v5, 0xd991

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_15

    goto :goto_1c

    :sswitch_42
    if-eqz v3, :cond_d

    const v2, 0xdc68

    goto :goto_1c

    :cond_d
    :sswitch_43
    const v2, 0xdc49

    goto :goto_1c

    :sswitch_44
    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->۟ۢۨ۠ۡ()Lr1/o;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v9

    const v2, 0xdc87

    :goto_1d
    const v5, 0xdc98

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_16

    goto :goto_1d

    :sswitch_45
    const v2, 0xdca6

    goto :goto_1d

    :sswitch_46
    const/4 v9, 0x0

    :sswitch_47
    new-instance v2, Lk0/z3;

    move-object/from16 v5, p1

    invoke-direct/range {v2 .. v9}, Lk0/z3;-><init>(Lr1/x0;Lr1/x0;Lr1/l0;IILjava/lang/Integer;Ljava/lang/Integer;)V

    move-object/from16 v0, p1

    invoke-static {v0, v6, v7, v12, v2}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v2

    goto/16 :goto_0

    :sswitch_48
    move v5, v11

    goto/16 :goto_19

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_f
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_a
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_1d
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
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
        0x32 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_21
        0x57 -> :sswitch_24
        0x74 -> :sswitch_22
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_3
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_23
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_31
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_31
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_37
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_39
        0x2d -> :sswitch_48
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3d
        0x5f -> :sswitch_40
        0x7c -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3f
        0x36 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_42
        0x5bb -> :sswitch_43
        0x5d8 -> :sswitch_46
        0x5f9 -> :sswitch_44
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x1f -> :sswitch_45
        0x3e -> :sswitch_47
    .end sparse-switch
.end method
