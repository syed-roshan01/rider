.class public final synthetic Lf0/q1;
.super Ld9/h;

# interfaces
.implements Lc9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const/4 v4, 0x0

    const/high16 v8, -0x80000000

    const/4 v3, 0x1

    const/4 v2, 0x0

    check-cast p1, Lm1/b;

    invoke-static {p1}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۦۡۥۦ(Ljava/lang/Object;)Landroid/view/KeyEvent;

    move-result-object v6

    invoke-static {p0}, Lja/ۥۣۨ۠;->۟ۥۦۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/p1;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {v6}, La0/ۣ۟ۤۨۧ;->ۨۥۨۦ(Ljava/lang/Object;)I

    move-result v5

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
    if-nez v5, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v6}, Lh/۟ۡۥۡۧ;->ۣ۟ۧ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lc7/ۨۤۦۢ;->ۨ۠ۥۢ(I)Z

    move-result v5

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v5, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lo4/۟۟ۡۧۤ;->ۣ۟ۤۢۢ(Ljava/lang/Object;)Lf0/k0;

    move-result-object v5

    invoke-static {v5}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {v6}, Lh/۟ۡۥۡۧ;->ۣ۟ۧ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    xor-int/lit8 v1, v7, -0x1

    xor-int/2addr v1, v8

    and-int/2addr v1, v8

    if-eqz v1, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    xor-int v1, v8, v7

    and-int/2addr v1, v7

    invoke-static {v1}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v5, Lf0/k0;->a:Ljava/lang/Integer;

    const v1, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move-object v1, v2

    :goto_4
    :sswitch_a
    const v5, 0xc601

    :goto_5
    const v7, 0xc612

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_4

    goto :goto_5

    :sswitch_b
    if-eqz v1, :cond_6

    const v5, 0xc65e

    goto :goto_5

    :sswitch_c
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_d
    invoke-static {v5}, Lcom/google/firebase/components/ۧ۠ۤۤ;->ۣۨۤۡ(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v8

    const v1, 0xbefb

    :goto_6
    const v9, 0xbf0c

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :cond_3
    :sswitch_e
    const v1, 0xbf39

    goto :goto_6

    :sswitch_f
    if-eqz v8, :cond_3

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_10
    iput-object v2, v5, Lf0/k0;->a:Ljava/lang/Integer;

    invoke-static {v8}, Ln9/ۤۧۧۤ;->ۣۣۧ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1, v7}, Le2/ۨۥۦۡ;->۟ۡۨۥ۠(II)I

    move-result v1

    invoke-static {v1}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v8

    const v5, 0xc202

    :goto_7
    const v9, 0xc213

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_6

    goto :goto_7

    :sswitch_11
    if-nez v8, :cond_4

    const v5, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_12
    const v5, 0xc240

    goto :goto_7

    :sswitch_13
    move-object v1, v2

    :sswitch_14
    const v5, 0xc27e

    :goto_8
    const v8, 0xc28f

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_7

    goto :goto_8

    :cond_5
    :sswitch_15
    const v5, 0xc2bc

    goto :goto_8

    :sswitch_16
    if-nez v1, :cond_5

    const v5, 0xc2db

    goto :goto_8

    :sswitch_17
    invoke-static {v7}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    const v5, 0xc2fa

    :goto_9
    const v7, 0xc30b

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    const v5, 0xc5a4

    goto :goto_9

    :sswitch_19
    invoke-static {v7}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_4

    :cond_6
    :sswitch_1a
    const v5, 0xc63f

    goto/16 :goto_5

    :sswitch_1b
    invoke-static {v1}, Ln9/ۤۧۧۤ;->ۣۣۧ۠(Ljava/lang/Object;)I

    move-result v5

    new-instance v1, Lg2/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v7, v5}, Ld9/ۡۥۣۡ;->ۨ۠ۧۡ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5, v3}, Lg2/a;-><init>(Ljava/lang/String;I)V

    const v5, 0xc67d

    :goto_a
    const v7, 0xc68e

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1c
    invoke-static {v0}, Lfa/ۣ۟ۥۤ;->ۥۦ۟ۧ(Ljava/lang/Object;)Lh0/a1;

    move-result-object v7

    invoke-static {v0}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۢۦۦ۠(Ljava/lang/Object;)Z

    move-result v8

    const v5, 0xc984

    :goto_c
    const v9, 0xc995

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_a

    goto :goto_c

    :sswitch_1d
    if-eqz v1, :cond_7

    const v5, 0xc9e1

    goto :goto_c

    :sswitch_1e
    const v5, 0xc69c

    goto :goto_a

    :sswitch_1f
    move-object v1, v2

    goto :goto_b

    :cond_7
    :sswitch_20
    const v5, 0xc9c2

    goto :goto_c

    :sswitch_21
    const v5, 0xca00

    :goto_d
    const v6, 0xca11

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_b

    goto :goto_d

    :cond_8
    :sswitch_22
    const v5, 0xca3e

    goto :goto_d

    :sswitch_23
    if-eqz v8, :cond_8

    const v5, 0xca5d

    goto :goto_d

    :sswitch_24
    invoke-static {v1}, Li6/ۡۤۦ;->۟ۡۤۥۣ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lh4/ۣ۟ۢۢۡ;->ۣ۟ۡ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v7, Lh0/a1;->a:Ljava/lang/Float;

    const v0, 0xca7c

    :goto_e
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_25
    const v0, 0xcd26

    goto :goto_e

    :sswitch_26
    move v0, v3

    :goto_f
    const v1, 0xcd83

    :goto_10
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_10

    :sswitch_27
    const v1, 0xcda2

    goto :goto_10

    :sswitch_28
    move v0, v4

    goto :goto_f

    :sswitch_29
    move v4, v0

    :goto_11
    :sswitch_2a
    invoke-static {v4}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :sswitch_2b
    invoke-static {v6}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->۟۠ۡۧۧ(Ljava/lang/Object;)I

    move-result v1

    sget v2, Lf/۟ۤۧ۠ۡ;->ۣۡۡۡ:I

    xor-int/lit16 v2, v2, -0x2dc

    invoke-static {v1, v2}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۡۦۤۤ(II)Z

    move-result v2

    const v1, 0xcdff

    :goto_12
    const v5, 0xce10

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_e

    goto :goto_12

    :cond_9
    :sswitch_2c
    const v1, 0xce3d

    goto :goto_12

    :sswitch_2d
    if-nez v2, :cond_9

    const v1, 0xd0e7

    goto :goto_12

    :sswitch_2e
    const v0, 0xd106

    :goto_13
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_13

    :sswitch_2f
    const v0, 0xd125

    goto :goto_13

    :sswitch_30
    invoke-static {v0}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۨ۠ۧۤ(Ljava/lang/Object;)Lf0/u0;

    move-result-object v1

    invoke-static {v1, v6}, Lh7/ۥۥۢ۟;->۟ۥۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Lf0/t0;

    move-result-object v2

    const v1, 0xd182

    :goto_14
    const v5, 0xd193

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_10

    goto :goto_14

    :sswitch_31
    if-eqz v2, :cond_a

    const v1, 0xd1df

    goto :goto_14

    :cond_a
    :sswitch_32
    const v1, 0xd1c0

    goto :goto_14

    :sswitch_33
    invoke-static {v2}, Ll3/ۥۣۤ۟;->۟ۡۦۦ(Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xd1fe

    :goto_15
    const v6, 0xd20f

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_11

    goto :goto_15

    :sswitch_34
    if-eqz v5, :cond_b

    const v1, 0xd4e6

    goto :goto_15

    :cond_b
    :sswitch_35
    const v1, 0xd4c7

    goto :goto_15

    :sswitch_36
    const v1, 0xd505

    :goto_16
    const v5, 0xd516

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_12

    goto :goto_16

    :sswitch_37
    if-nez v8, :cond_c

    const v1, 0xd562

    goto :goto_16

    :cond_c
    :sswitch_38
    const v1, 0xd543

    goto :goto_16

    :sswitch_39
    const v0, 0xd581

    :goto_17
    const v1, 0xd592

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_13

    goto :goto_17

    :sswitch_3a
    const v0, 0xd5a0

    goto :goto_17

    :sswitch_3b
    new-instance v4, Ld9/q;

    invoke-direct {v4}, Ld9/q;-><init>()V

    iput-boolean v3, v4, Ld9/q;->a:Z

    new-instance v1, Lb/g;

    sget v5, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۡۨ۟ۨ:I

    xor-int/lit8 v5, v5, 0x7f

    invoke-direct {v1, v2, v0, v4, v5}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0}, Lja/ۥۣۨ۠;->۟ۥۧ۟ۧ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v2

    invoke-static {v2}, Lz3/۟ۡ۠ۦۣ;->۟۟ۡ۠۟(Ljava/lang/Object;)Lf0/d2;

    move-result-object v2

    invoke-static {v0}, Ld5/ۣۦۢۢ;->۟ۤ۠ۥۨ(Ljava/lang/Object;)Lg2/a0;

    move-result-object v5

    new-instance v6, Lh0/r0;

    invoke-static {v0}, Lw2/ۧۦۧ;->ۣ۠ۡ۠(Ljava/lang/Object;)Lg2/s;

    move-result-object v8

    invoke-direct {v6, v5, v8, v2, v7}, Lh0/r0;-><init>(Lg2/a0;Lg2/s;Lf0/d2;Lh0/a1;)V

    invoke-static {v1, v6}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۤۢۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Lh3/۟ۡۥ۠۠;->ۣۢۨ۟(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static {v5}, Lh6/ۧۧۤ۟;->ۣ۟ۡ۠۠(Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Le2/ۨۥۦۡ;->ۤۡۡۦ(JJ)Z

    move-result v2

    const v1, 0xd888

    :goto_18
    const v7, 0xd899

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_14

    goto :goto_18

    :sswitch_3c
    if-eqz v2, :cond_d

    const v1, 0xd8e5

    goto :goto_18

    :cond_d
    :sswitch_3d
    const v1, 0xd8c6

    goto :goto_18

    :sswitch_3e
    invoke-static {v6}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۨۦ۟ۤ(Ljava/lang/Object;)La2/e;

    move-result-object v1

    invoke-static {v5}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۥۡۤ(Ljava/lang/Object;)La2/e;

    move-result-object v2

    invoke-static {v1, v2}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xd904

    :goto_19
    const v7, 0xd915

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_15

    goto :goto_19

    :sswitch_3f
    if-nez v2, :cond_e

    const v1, 0xd961

    goto :goto_19

    :cond_e
    :sswitch_40
    const v1, 0xd942

    goto :goto_19

    :sswitch_41
    invoke-static {v6}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۨۦ۟ۤ(Ljava/lang/Object;)La2/e;

    move-result-object v1

    invoke-static {v6}, Lh3/۟ۡۥ۠۠;->ۣۢۨ۟(Ljava/lang/Object;)J

    move-result-wide v6

    sget v2, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣ۟ۡ۟ۡ:I

    xor-int/lit16 v2, v2, -0x2ae

    invoke-static {v5, v1, v6, v7, v2}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۧۤۧۤ(Ljava/lang/Object;Ljava/lang/Object;JI)Lg2/a0;

    move-result-object v1

    invoke-static {v0}, La8/ۣۡۨ۠;->۟ۡۤ۟(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {v2, v1}, Ld9/ۡۥۣۡ;->۟ۥۣۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_42
    invoke-static {v0}, Lc3/۟ۡۧۢۥ;->ۣ۟ۤۢ(Ljava/lang/Object;)Lf0/e2;

    move-result-object v1

    const v0, 0xd980

    :goto_1a
    const v2, 0xd991

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_16

    goto :goto_1a

    :sswitch_43
    if-eqz v1, :cond_f

    const v0, 0xdc68

    goto :goto_1a

    :cond_f
    :sswitch_44
    const v0, 0xdc49

    goto :goto_1a

    :sswitch_45
    iput-boolean v3, v1, Lf0/e2;->f:Z

    :sswitch_46
    invoke-static {v4}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۥۢۡ۟(Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_11

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_1f
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x13 -> :sswitch_b
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_19
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_a
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_20
        0x57 -> :sswitch_2b
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_28
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2c
        0x2d -> :sswitch_30
        0x3ef -> :sswitch_2d
        0x1ef7 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_31
        0x32 -> :sswitch_32
        0x4c -> :sswitch_33
        0x53 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_34
        0x6a7 -> :sswitch_35
        0x6c8 -> :sswitch_3b
        0x6e9 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_38
        0x55 -> :sswitch_3b
        0x74 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3a
        0x32 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3d
        0x5f -> :sswitch_41
        0x7c -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3f
        0x36 -> :sswitch_40
        0x57 -> :sswitch_42
        0x74 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_43
        0x5bb -> :sswitch_44
        0x5d8 -> :sswitch_46
        0x5f9 -> :sswitch_45
    .end sparse-switch
.end method
