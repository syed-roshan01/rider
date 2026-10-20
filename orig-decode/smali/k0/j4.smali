.class public final Lk0/j4;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Lc9/e;

.field public final c:Lc9/e;

.field public final d:Lc9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lc9/e;Lc9/e;Lc9/f;I)V
    .locals 2

    iput p4, p0, Lk0/j4;->a:I

    iput-object p1, p0, Lk0/j4;->b:Lc9/e;

    iput-object p2, p0, Lk0/j4;->c:Lc9/e;

    iput-object p3, p0, Lk0/j4;->d:Lc9/f;

    sget v0, Lh3/ۣ۠ۡۨ;->ۣ۟ۡۥۨ:I

    xor-int/lit16 v0, v0, -0x260

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

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
    const-string v0, "CO5Rff"

    invoke-static {v0}, Landroidx/fragment/app/ۣۣۣۨ;->ۥۣۧ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    invoke-static/range {p0 .. p0}, Lt9/ۧۦۥ۟;->۟ۥۣۣ۠(Ljava/lang/Object;)I

    move-result v2

    invoke-static/range {p0 .. p0}, Lz/ۨۤۥۨ;->ۨۤۧ۠(Ljava/lang/Object;)Lc9/e;

    move-result-object v4

    packed-switch v2, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static/range {p2 .. p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v3

    sget v5, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->۠ۦۢۨ:I

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
    xor-int/lit16 v2, v5, -0x339

    and-int/2addr v2, v3

    const/4 v6, 0x2

    if-ne v2, v6, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object/from16 v2, p1

    check-cast v2, Lm0/q;

    invoke-static {v2}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v5

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v5, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v2}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v2

    :goto_5
    return-object v2

    :sswitch_9
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۤۢۢۥ()Landroidx/compose/foundation/layout/FillElement;

    move-result-object v5

    check-cast p1, Lm0/q;

    const v2, -0x3d4877f6

    sget v3, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۦۢۢ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-static/range {p0 .. p0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۧۨ۟ۦ(Ljava/lang/Object;)Lc9/e;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-static {v0, v6}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int v7, v2, v3

    and-int/2addr v2, v3

    or-int/2addr v7, v2

    invoke-static/range {p0 .. p0}, Ld9/ۡۥۣۡ;->ۣ۟ۤۨ۠(Ljava/lang/Object;)Lc9/f;

    move-result-object v8

    move-object/from16 v0, p1

    invoke-static {v0, v8}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    invoke-static/range {p1 .. p1}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v3, 0xbefb

    :goto_6
    const v10, 0xbf0c

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_b
    const v3, 0xbf39

    goto :goto_6

    :sswitch_c
    xor-int v3, v7, v9

    and-int v10, v7, v9

    or-int/2addr v3, v10

    if-nez v3, :cond_2

    const v3, 0xc1e3

    goto :goto_6

    :sswitch_d
    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۠ۨۥ()Lk0/y0;

    move-result-object v7

    const v3, 0xc202

    :goto_7
    const v9, 0xc213

    xor-int/2addr v3, v9

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_e
    if-ne v2, v7, :cond_3

    const v3, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_f
    const v3, 0xc240

    goto :goto_7

    :sswitch_10
    new-instance v2, Lk0/j4;

    const/4 v3, 0x0

    invoke-direct {v2, v4, v6, v8, v3}, Lk0/j4;-><init>(Lc9/e;Lc9/e;Lc9/f;I)V

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_11
    check-cast v2, Lc9/e;

    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    sget v3, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    xor-int/lit16 v3, v3, 0xe2

    const/4 v4, 0x0

    move-object/from16 v0, p1

    invoke-static {v5, v2, v0, v3, v4}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->ۡۦۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto/16 :goto_4

    :pswitch_0
    move-object/from16 v5, p1

    check-cast v5, Lr1/i1;

    check-cast p2, Lm2/a;

    invoke-static/range {p2 .. p2}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۥۢۨۦ(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v13

    invoke-static {}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۣ۟ۥۦۣ()Lk0/l4;

    move-result-object v2

    invoke-static {v5, v2, v4}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۧۤۤۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v14}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v15

    new-instance v7, Ld9/s;

    invoke-direct {v7}, Ld9/s;-><init>()V

    const v2, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_12
    const v2, 0xc2bc

    goto :goto_8

    :sswitch_13
    if-lez v15, :cond_4

    const v2, 0xc2db

    goto :goto_8

    :sswitch_14
    div-int v2, v13, v15

    iput v2, v7, Ld9/s;->a:I

    :sswitch_15
    const/4 v2, 0x0

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v14}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v6

    const/4 v2, 0x0

    move v3, v2

    :goto_9
    const v2, 0xc2fa

    :goto_a
    const v10, 0xc30b

    xor-int/2addr v2, v10

    sparse-switch v2, :sswitch_data_7

    goto :goto_a

    :sswitch_16
    if-ge v3, v6, :cond_5

    const v2, 0xc5e2

    goto :goto_a

    :cond_5
    :sswitch_17
    const v2, 0xc5c3

    goto :goto_a

    :sswitch_18
    invoke-static {v14, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/i0;

    invoke-static {v4}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v2, v10}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->۟ۧۥۡۨ(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {v2, v4}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v2

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v4

    sget v2, La/ۥۡۢۨ;->۟۟ۡۨۤ:I

    xor-int/lit8 v2, v2, -0x78

    add-int/2addr v2, v3

    const v3, 0xc601

    :goto_b
    const v10, 0xc612

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_8

    goto :goto_b

    :sswitch_19
    const v3, 0xc620

    goto :goto_b

    :sswitch_1a
    move v3, v2

    goto :goto_9

    :sswitch_1b
    invoke-static {v4}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v10

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v14}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v14}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v6

    const/4 v2, 0x0

    move v3, v2

    :goto_c
    const v2, 0xc67d

    :goto_d
    const v11, 0xc68e

    xor-int/2addr v2, v11

    sparse-switch v2, :sswitch_data_9

    goto :goto_d

    :cond_6
    :sswitch_1c
    const v2, 0xc6bb

    goto :goto_d

    :sswitch_1d
    if-ge v3, v6, :cond_6

    const v2, 0xc965

    goto :goto_d

    :sswitch_1e
    invoke-static {v14, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/i0;

    invoke-static {v7}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v11, v11, v10, v10}, Ll3/ۥۣۤ۟;->ۡۦۢۨ(IIII)J

    move-result-wide v16

    move-wide/from16 v0, v16

    invoke-static {v2, v0, v1}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v2

    invoke-static {v4, v2}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget v2, Lr7/ۧ۠۠ۤ;->ۦۣۨۤ:I

    xor-int/lit16 v2, v2, 0x327

    add-int/2addr v2, v3

    const v3, 0xc984

    :goto_e
    const v11, 0xc995

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_a

    goto :goto_e

    :sswitch_1f
    const v3, 0xc9a3

    goto :goto_e

    :sswitch_20
    move v3, v2

    goto :goto_c

    :sswitch_21
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_f
    const v2, 0xca00

    :goto_10
    const v6, 0xca11

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_b

    goto :goto_10

    :cond_7
    :sswitch_22
    const v2, 0xca3e

    goto :goto_10

    :sswitch_23
    if-ge v3, v15, :cond_7

    const v2, 0xca5d

    goto :goto_10

    :sswitch_24
    new-instance v6, Lm2/e;

    invoke-static {v14, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/i0;

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->ۡۦ۠(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {v7}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v2, v11}, Lc3/۟ۡۧۢۥ;->ۣۡ۟ۧ(II)I

    move-result v2

    invoke-static {v5, v2}, Lp4/ۣ۟۟ۢۥ;->۟ۢۡۨۧ(Ljava/lang/Object;I)F

    move-result v2

    const/high16 v11, 0x41900000    # 18.0f

    sub-float/2addr v2, v11

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۡۨۡۡ()F

    move-result v11

    const/16 v16, 0x2

    move/from16 v0, v16

    int-to-float v0, v0

    move/from16 v16, v0

    mul-float v11, v11, v16

    sub-float/2addr v2, v11

    const/high16 v11, 0x41900000    # 18.0f

    add-float/2addr v2, v11

    invoke-direct {v6, v2}, Lm2/e;-><init>(F)V

    new-instance v2, Lm2/e;

    sget v11, Lm4/۟ۧۤ۠;->۟ۥۡۨۧ:I

    xor-int/lit16 v11, v11, 0x361

    int-to-float v11, v11

    invoke-direct {v2, v11}, Lm2/e;-><init>(F)V

    invoke-static {v6, v2}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟۠ۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v16

    const v11, 0xca7c

    :goto_11
    const v17, 0xca8d

    xor-int v11, v11, v17

    sparse-switch v11, :sswitch_data_c

    goto :goto_11

    :sswitch_25
    if-ltz v16, :cond_8

    const v11, 0xcd64

    goto :goto_11

    :cond_8
    :sswitch_26
    const v11, 0xcd45

    goto :goto_11

    :sswitch_27
    const v2, 0xcd83

    :goto_12
    const v11, 0xcd94

    xor-int/2addr v2, v11

    sparse-switch v2, :sswitch_data_d

    goto :goto_12

    :sswitch_28
    const v2, 0xcda2

    goto :goto_12

    :sswitch_29
    move-object v2, v6

    :sswitch_2a
    new-instance v6, Lk0/d4;

    invoke-static {v7}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v5, v11}, Lp4/ۣ۟۟ۢۥ;->۟ۢۡۨۧ(Ljava/lang/Object;I)F

    move-result v11

    int-to-float v0, v3

    move/from16 v16, v0

    mul-float v11, v11, v16

    invoke-static {v7}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v16

    move/from16 v0, v16

    invoke-static {v5, v0}, Lp4/ۣ۟۟ۢۥ;->۟ۢۡۨۧ(Ljava/lang/Object;I)F

    move-result v16

    invoke-static {v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۧۢۦۨ(Ljava/lang/Object;)F

    move-result v2

    move/from16 v0, v16

    invoke-direct {v6, v11, v0, v2}, Lk0/d4;-><init>(FFF)V

    invoke-static {v12, v6}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget v2, Ln/۟۠ۥۥۨ;->۟ۥۧۤۧ:I

    xor-int/lit16 v2, v2, 0x2e3

    add-int/2addr v2, v3

    const v3, 0xcdff

    :goto_13
    const v6, 0xce10

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_e

    goto :goto_13

    :sswitch_2b
    move v3, v2

    goto/16 :goto_f

    :sswitch_2c
    const v3, 0xce1e

    goto :goto_13

    :sswitch_2d
    new-instance v3, Lk0/i4;

    invoke-static/range {p0 .. p0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۧۨ۟ۦ(Ljava/lang/Object;)Lc9/e;

    move-result-object v6

    invoke-static/range {p0 .. p0}, Ld9/ۡۥۣۡ;->ۣ۟ۤۨ۠(Ljava/lang/Object;)Lc9/f;

    move-result-object v11

    invoke-direct/range {v3 .. v13}, Lk0/i4;-><init>(Ljava/util/ArrayList;Lr1/i1;Lc9/e;Ld9/s;JILc9/f;Ljava/util/ArrayList;I)V

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v2

    invoke-static {v5, v13, v10, v2, v3}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v2

    goto/16 :goto_5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_a
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
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_11
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
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_2d
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_2a
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2b
        0x3ef -> :sswitch_2c
    .end sparse-switch
.end method
