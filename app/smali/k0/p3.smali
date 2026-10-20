.class public abstract Lk0/p3;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ldagger/hilt/android/internal/ۣۧۨۨ;->۟ۤۨۤ۠()Lk0/j0;

    move-result-object v0

    new-instance v1, Lm0/p0;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟۟۟ۨ()Lm0/o3;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lm0/p0;-><init>(Lm0/z2;Lc9/a;)V

    sput-object v1, Lk0/p3;->a:Lm0/p0;

    return-void
.end method

.method public static final a(Ly0/o;Le1/l0;JJFFLu/w;Lu0/b;Lm0/m;II)V
    .locals 14

    check-cast p10, Lm0/q;

    const v2, -0x1ea135ab

    sget v3, Lr7/ۧ۠۠ۤ;->ۦۣۨۤ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p10

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

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
    xor-int/lit8 v2, p12, -0x2

    and-int v2, v2, p12

    if-eqz v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۢۥۢ()Ly0/l;

    move-result-object v4

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v4, p0

    :sswitch_5
    sget v3, La8/ۡۦۨۡ;->ۧۡۦۡ:I

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    xor-int/lit16 v2, v3, 0x373

    and-int v2, v2, p12

    if-eqz v2, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Landroidx/core/content/ۣۣۣ۟;->ۣۣ۟ۤ()Le1/f0;

    move-result-object v5

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    sget v3, Lr4/۟ۦۦ۠ۥ;->ۣ۠۠ۦ:I

    const v2, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v2, 0xbf39

    goto :goto_5

    :sswitch_b
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_c
    xor-int/lit16 v2, v3, 0x292

    and-int v2, v2, p12

    if-eqz v2, :cond_2

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_d
    invoke-static {}, Lv5/ۧۥۢۡ;->ۢۧۡۨ()Lm0/m3;

    move-result-object v2

    move-object/from16 v0, p10

    invoke-static {v0, v2}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk0/i0;

    invoke-static {v2}, Lk3/ۦ۠ۢۥ;->ۡۡۧ۠(Ljava/lang/Object;)J

    move-result-wide v6

    const v2, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const v2, 0xc221

    goto :goto_6

    :sswitch_f
    move-wide/from16 v6, p2

    :sswitch_10
    sget v3, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->۟۠۠۟ۦ:I

    const v2, 0xc27e

    :goto_7
    const v8, 0xc28f

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_11
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_12
    xor-int/lit16 v2, v3, 0x16a

    and-int v2, v2, p12

    if-eqz v2, :cond_3

    const v2, 0xc2db

    goto :goto_7

    :sswitch_13
    move-object/from16 v0, p10

    invoke-static {v6, v7, v0}, Lm4/۟ۧۤ۠;->ۥۦۥ(JLjava/lang/Object;)J

    move-result-wide p4

    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    const v2, 0xc5a4

    goto :goto_8

    :sswitch_15
    sget v3, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۦۣۢۢ:I

    const v2, 0xc601

    :goto_9
    const v8, 0xc612

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    xor-int/lit16 v2, v3, 0x18d

    and-int v2, v2, p12

    if-eqz v2, :cond_4

    const v2, 0xc65e

    goto :goto_9

    :cond_4
    :sswitch_17
    const v2, 0xc63f

    goto :goto_9

    :sswitch_18
    const/4 v2, 0x0

    int-to-float v0, v2

    move/from16 p6, v0

    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_19
    sget v3, Lu1/ۢۥ۠ۤ;->۠ۨ۟ۤ:I

    const v2, 0xc984

    :goto_b
    const v8, 0xc995

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :sswitch_1a
    xor-int/lit16 v2, v3, 0x22d

    and-int v2, v2, p12

    if-eqz v2, :cond_5

    const v2, 0xc9e1

    goto :goto_b

    :sswitch_1b
    const v2, 0xc69c

    goto :goto_a

    :cond_5
    :sswitch_1c
    const v2, 0xc9c2

    goto :goto_b

    :sswitch_1d
    const/4 v2, 0x0

    int-to-float v10, v2

    const v2, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_c

    :goto_d
    :pswitch_1
    sget v3, Lt2/۟ۢ۟ۢ۟;->۟ۢ۠۠ۤ:I

    const v2, 0xca7c

    :goto_e
    const v8, 0xca8d

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :sswitch_1e
    xor-int/lit16 v2, v3, 0x175

    and-int v2, v2, p12

    if-eqz v2, :cond_6

    const v2, 0xcd64

    goto :goto_e

    :pswitch_2
    const v2, 0xca1f

    goto :goto_c

    :cond_6
    :sswitch_1f
    const v2, 0xcd45

    goto :goto_e

    :sswitch_20
    const/4 v9, 0x0

    const v2, 0xcd83

    :goto_f
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_f

    :sswitch_21
    const v2, 0xcda2

    goto :goto_f

    :sswitch_22
    move-object/from16 v9, p8

    :sswitch_23
    invoke-static {}, Lh8/۟ۨۧ;->ۨۡ۟ۤ()Lm0/p0;

    move-result-object v3

    move-object/from16 v0, p10

    invoke-static {v0, v3}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm2/e;

    invoke-static {v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۧۢۦۨ(Ljava/lang/Object;)F

    move-result v2

    const/4 v8, 0x0

    sub-float v8, v8, p6

    sub-float v8, v2, v8

    invoke-static {}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣ۠ۥۦ()Lm0/p0;

    move-result-object v2

    new-instance v11, Le1/r;

    move-wide/from16 v0, p4

    invoke-direct {v11, v0, v1}, Le1/r;-><init>(J)V

    invoke-static {v2, v11}, Lu2/۟ۥۢۥۨ;->۠ۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/v1;

    move-result-object v2

    new-instance v11, Lm2/e;

    invoke-direct {v11, v8}, Lm2/e;-><init>(F)V

    invoke-static {v3, v11}, Lu2/۟ۥۢۥۨ;->۠ۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/v1;

    move-result-object v3

    const/4 v11, 0x2

    new-array v12, v11, [Lm0/v1;

    sget v11, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۡۨ۟ۨ:I

    xor-int/lit8 v11, v11, 0x71

    aput-object v2, v12, v11

    sget v2, Landroidx/profileinstaller/۠ۡۥۡ;->ۤ۟ۤۡ:I

    xor-int/lit16 v2, v2, -0x33d

    aput-object v3, v12, v2

    new-instance v3, Lk0/n3;

    move-object/from16 v11, p9

    invoke-direct/range {v3 .. v11}, Lk0/n3;-><init>(Ly0/o;Le1/l0;JFLu/w;FLu0/b;)V

    const v2, -0x43a10a9

    sget v4, Lg2/۟۠ۡۡۦ;->ۧۡۤ۠:I

    xor-int/2addr v2, v4

    move-object/from16 v0, p10

    invoke-static {v0, v2, v3}, Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(Ljava/lang/Object;ILjava/lang/Object;)Lu0/b;

    move-result-object v2

    sget v3, Li4/ۨ۟ۨ;->۟ۧ۠ۥ۟:I

    xor-int/lit16 v3, v3, 0x165

    move-object/from16 v0, p10

    invoke-static {v12, v2, v0, v3}, Lk0/p3;->۟ۦ۠ۦۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v2, 0x0

    move-object/from16 v0, p10

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    return-void

    :sswitch_24
    move/from16 v10, p7

    goto/16 :goto_d

    :sswitch_25
    move-object v5, p1

    goto/16 :goto_4

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_25
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
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_15
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_16
        0x2d -> :sswitch_19
        0x32 -> :sswitch_17
        0x4c -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0xf3 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1a
        0x36 -> :sswitch_1c
        0x57 -> :sswitch_24
        0x74 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
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
        0x36 -> :sswitch_23
    .end sparse-switch
.end method

.method public static final b(Ly0/o;Le1/l0;JLu/w;F)Ly0/o;
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    const v0, -0x1e4b5

    sget v2, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۣۨۨ۟:I

    xor-int v7, v0, v2

    move-object v0, p0

    move v2, v1

    move v3, v1

    move v4, p5

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Landroidx/core/content/ۣۣۣ۟;->۟ۡۨۧۦ(Ljava/lang/Object;FFFFLjava/lang/Object;ZI)Ly0/o;

    move-result-object v2

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۢۥۢ()Ly0/l;

    move-result-object v0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p4}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۠ۢۦۤ(Ljava/lang/Object;)Le1/n;

    move-result-object v1

    invoke-static {p4}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۤۦۣ(Ljava/lang/Object;)F

    move-result v3

    invoke-static {v3, v0, v1, p1}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۨۧۡ(FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    :sswitch_3
    invoke-static {v2, v0}, Lv7/ۢ۟ۨۦ;->ۡۧۥۢ(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    invoke-static {v0, p2, p3, p1}, La/ۨۥۥۤ;->۟ۦۢۥۥ(Ljava/lang/Object;JLjava/lang/Object;)Ly0/o;

    move-result-object v0

    invoke-static {v0, p1}, Lk2/۟ۢۦۤۤ;->ۣ۟ۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static final c(JFLm0/m;)J
    .locals 6

    check-cast p3, Lm0/q;

    const v0, 0x7bf9083e

    sget v1, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->۟ۢ۠ۨ۠:I

    xor-int/2addr v0, v1

    invoke-static {p3, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {}, Lv5/ۧۥۢۡ;->ۢۧۡۨ()Lm0/m3;

    move-result-object v0

    invoke-static {p3, v0}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/i0;

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->۟ۤۦۡۡ()Lm0/m3;

    move-result-object v1

    invoke-static {p3, v1}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-static {v1}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v0}, Lk3/ۦ۠ۢۥ;->ۡۡۧ۠(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p0, p1, v4, v5}, Lc3/۟ۥ۠ۡۧ;->۟ۡۨۥ۠(JJ)Z

    move-result v3

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v3, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0, p2}, Lt2/۟ۦۢۡۧ;->۟ۤۨۨ۠(Ljava/lang/Object;F)J

    move-result-wide p0

    :sswitch_6
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    return-wide p0

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
.end method

.method public static ۟ۦ۠ۦۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 2

    invoke-static {}, Landroid/os/ۣۣ۟ۤۨ;->۟ۧۥ۠ۡ()I

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
    check-cast p0, [Lm0/v1;

    check-cast p1, Lc9/e;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Lf6/a;->c([Lm0/v1;Lc9/e;Lm0/m;I)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

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
