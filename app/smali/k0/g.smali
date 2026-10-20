.class public final Lk0/g;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# instance fields
.field public final a:F

.field public final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk0/g;->a:F

    iput p2, p0, Lk0/g;->b:F

    invoke-static {}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟ۦ۟ۡ()I

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
    const-string v0, "LRTgkzHtvDR2j7WCQAOW3za0R1fk"

    invoke-static {v0}, Lt1/ۧۦۤۧ;->۟۟ۦۨ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static final f(Ljava/util/ArrayList;Ld9/s;Lr1/l0;FLjava/util/ArrayList;Ljava/util/ArrayList;Ld9/s;Ljava/util/ArrayList;Ld9/s;Ld9/s;)V
    .locals 4

    const/4 v3, 0x0

    invoke-static {p0}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

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
    xor-int/lit8 v0, v1, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v2, v1, -0x2

    or-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p2, p3}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v1

    rsub-int/lit8 v0, v0, 0x0

    sub-int v0, v1, v0

    iput v0, p1, Ld9/s;->a:I

    :sswitch_3
    invoke-static {p4}, Laa/۟ۦۣۢۨ;->۟۠ۦۡۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v3, v0}, Lx4/۟ۤۦۥ۟;->ۥۣۣ۟(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {p6}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p5, v0}, Lu1/۟ۧۥۢ۠;->۟۟ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p1}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p7, v0}, Lu1/۟ۧۥۢ۠;->۟۟ۦۡ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p1}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-static {p6}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x2

    iput v0, p1, Ld9/s;->a:I

    invoke-static {p8}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p9}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v0

    iput v0, p8, Ld9/s;->a:I

    invoke-static {p4}, Lk2/۟ۢۦۤۤ;->۟ۨۥۦ(Ljava/lang/Object;)V

    iput v3, p9, Ld9/s;->a:I

    iput v3, p6, Ld9/s;->a:I

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
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 21

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ld9/s;

    invoke-direct {v10}, Ld9/s;-><init>()V

    new-instance v3, Ld9/s;

    invoke-direct {v3}, Ld9/s;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ld9/s;

    invoke-direct {v11}, Ld9/s;-><init>()V

    new-instance v8, Ld9/s;

    invoke-direct {v8}, Ld9/s;-><init>()V

    invoke-static/range {p0 .. p0}, Lb7/ۣ۟۟ۦ۟;->۟ۡۨۥۡ(Ljava/lang/Object;)F

    move-result v5

    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v13

    const/4 v4, 0x0

    move v12, v4

    :goto_0
    const/16 v4, 0x650

    :goto_1
    xor-int/lit16 v4, v4, 0x661

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v4, 0x68e

    goto :goto_1

    :sswitch_1
    if-ge v12, v13, :cond_0

    const/16 v4, 0x6ad

    goto :goto_1

    :sswitch_2
    move-object/from16 v0, p2

    invoke-static {v0, v12}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/i0;

    move-wide/from16 v0, p3

    invoke-static {v4, v0, v1}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v14

    invoke-static {v6}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v15

    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->ۣ۠ۡ(Ljava/lang/Object;)F

    move-result v16

    const/16 v4, 0x6cc

    :goto_2
    xor-int/lit16 v4, v4, 0x6dd

    sparse-switch v4, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-nez v15, :cond_1

    const/16 v4, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v4, 0x70a

    goto :goto_2

    :sswitch_5
    invoke-static {v11}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v17

    invoke-static {v14}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v18

    invoke-static/range {p3 .. p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v19

    const/16 v4, 0x748

    :goto_3
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    add-int/lit8 v4, v17, 0x1e

    add-int/2addr v4, v15

    add-int/lit8 v4, v4, -0x1e

    add-int/lit8 v4, v4, -0x13

    add-int v4, v4, v18

    add-int/lit8 v4, v4, 0x13

    move/from16 v0, v19

    if-gt v4, v0, :cond_2

    const v4, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_7
    const v4, 0xbe41

    goto :goto_3

    :sswitch_8
    const v4, 0xbe7f

    :goto_4
    const v15, 0xbe90

    xor-int/2addr v4, v15

    sparse-switch v4, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    invoke-static {v6}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v15

    const v4, 0xbefb

    :goto_6
    const v17, 0xbf0c

    xor-int v4, v4, v17

    sparse-switch v4, :sswitch_data_4

    goto :goto_6

    :cond_3
    :sswitch_a
    const v4, 0xbf39

    goto :goto_6

    :sswitch_b
    const v4, 0xbe9e

    goto :goto_4

    :sswitch_c
    move-object/from16 v4, p1

    invoke-static/range {v2 .. v11}, Le2/ۨۥۦۡ;->ۡۦۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :sswitch_d
    xor-int/lit8 v4, v15, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v17, v15, -0x2

    or-int v4, v4, v17

    if-eqz v4, :cond_3

    const v4, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static {v11}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v15

    rsub-int/lit8 v4, v4, 0x0

    sub-int v4, v15, v4

    iput v4, v11, Ld9/s;->a:I

    :sswitch_f
    invoke-static {v6, v14}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {v11}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1b

    invoke-static {v14}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v4, v15

    add-int/lit8 v4, v4, -0x1b

    iput v4, v11, Ld9/s;->a:I

    invoke-static {v8}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v14}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v14

    invoke-static {v4, v14}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v4

    iput v4, v8, Ld9/s;->a:I

    sget v4, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۦۣ۠:I

    xor-int/lit16 v4, v4, -0x268

    add-int/2addr v4, v12

    const v12, 0xc202

    :goto_7
    const v14, 0xc213

    xor-int/2addr v12, v14

    sparse-switch v12, :sswitch_data_5

    goto :goto_7

    :sswitch_10
    const v12, 0xc221

    goto :goto_7

    :sswitch_11
    move v12, v4

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v6}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xc27e

    :goto_8
    const v12, 0xc28f

    xor-int/2addr v4, v12

    sparse-switch v4, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_13
    const v4, 0xc2bc

    goto :goto_8

    :sswitch_14
    xor-int/lit8 v4, v5, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v12, v5, -0x2

    or-int/2addr v4, v12

    if-eqz v4, :cond_4

    const v4, 0xc2db

    goto :goto_8

    :sswitch_15
    invoke-static/range {p0 .. p0}, Lb7/ۣ۟۟ۦ۟;->۟ۡۨۥۡ(Ljava/lang/Object;)F

    move-result v5

    move-object/from16 v4, p1

    invoke-static/range {v2 .. v11}, Le2/ۨۥۦۡ;->ۡۦۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_16
    invoke-static {v10}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v4

    invoke-static/range {p3 .. p4}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۢۥۤۤ(J)I

    move-result v5

    invoke-static {v4, v5}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v8

    invoke-static {v3}, Lf/ۣ۟ۤۤ;->۟ۡۥۨۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static/range {p3 .. p4}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->ۣۤۥۦ(J)I

    move-result v4

    invoke-static {v3, v4}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v3

    new-instance v4, Lk0/f;

    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->ۣ۠ۡ(Ljava/lang/Object;)F

    move-result v7

    move-object v5, v2

    move-object/from16 v6, p1

    invoke-direct/range {v4 .. v9}, Lk0/f;-><init>(Ljava/util/ArrayList;Lr1/l0;FILjava/util/ArrayList;)V

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v0, v8, v3, v2, v4}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v2

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
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
        0x16 -> :sswitch_a
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_16
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method
