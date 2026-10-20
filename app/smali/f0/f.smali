.class public abstract Lf0/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lv0/۟ۦۣ۟ۤ;->ۢۨۨۦ:I

    xor-int/lit8 v0, v0, -0x80

    int-to-float v0, v0

    sput v0, Lf0/f;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const v1, 0x401a827a

    div-float/2addr v0, v1

    sput v0, Lf0/f;->b:F

    return-void
.end method

.method public static final a(JLy0/o;Lc9/e;Lm0/m;I)V
    .locals 10

    const/4 v7, 0x0

    check-cast p4, Lm0/q;

    const v0, 0x4f2053

    sget v1, Lh6/ۧۧۤ۟;->۠۟ۤۨ:I

    xor-int/2addr v0, v1

    invoke-static {p4, v0}, Lr1/۟ۤۤۡ۠;->ۣ۟ۡ۠ۢ(Ljava/lang/Object;I)Lm0/q;

    sget v1, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->ۣ۟ۨۢۡ:I

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
    xor-int/lit16 v0, v1, 0x1d1

    and-int/2addr v0, p5

    if-nez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p4, p0, p1}, Ld1/۟۟ۥۡۡ;->ۣۦ۠ۦ(Ljava/lang/Object;J)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x4

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v0, 0x2

    :sswitch_8
    xor-int v1, v0, p5

    and-int/2addr v0, p5

    or-int/2addr v0, v1

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    sget v2, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۥۣۣ۠:I

    const v1, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v1, 0xbf39

    goto :goto_5

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_c
    move v0, p5

    goto :goto_4

    :sswitch_d
    xor-int/lit16 v1, v2, -0x21b

    and-int/2addr v1, p5

    if-nez v1, :cond_2

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {p4, p2}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-eqz v2, :cond_3

    const v1, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v1, 0xc240

    goto :goto_6

    :sswitch_11
    const/16 v1, 0x20

    const v2, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_12
    xor-int v2, v0, v1

    and-int/2addr v0, v1

    or-int/2addr v0, v2

    :sswitch_13
    sget v2, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟ۡۡۦ:I

    const v1, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    xor-int/lit16 v1, v2, 0xb6

    and-int/2addr v1, p5

    if-nez v1, :cond_4

    const v1, 0xc5e2

    goto :goto_9

    :sswitch_15
    const v2, 0xc29d

    goto :goto_7

    :sswitch_16
    const/16 v1, 0x10

    goto :goto_8

    :cond_4
    :sswitch_17
    const v1, 0xc5c3

    goto :goto_9

    :sswitch_18
    invoke-static {p4, p3}, Lg3/۟ۥۣۣۥ;->ۡۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    if-eqz v2, :cond_5

    const v1, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_1a
    const v1, 0xc63f

    goto :goto_a

    :sswitch_1b
    const/16 v1, 0x100

    const v2, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :goto_c
    :sswitch_1c
    xor-int v2, v0, v1

    and-int/2addr v0, v1

    or-int/2addr v0, v2

    :sswitch_1d
    sget v2, Lz8/ۣۤۡۧ;->ۣ۟ۧ۟ۢ:I

    const v1, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_a

    goto :goto_d

    :sswitch_1e
    xor-int/lit16 v1, v2, -0x1f5

    and-int/2addr v1, v0

    const/16 v3, 0x92

    if-ne v1, v3, :cond_6

    const v1, 0xc9e1

    goto :goto_d

    :sswitch_1f
    const v2, 0xc69c

    goto :goto_b

    :sswitch_20
    const/16 v1, 0x80

    goto :goto_c

    :cond_6
    :sswitch_21
    const v1, 0xc9c2

    goto :goto_d

    :sswitch_22
    invoke-static {p4}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xca00

    :goto_e
    const v2, 0xca11

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_b

    goto :goto_e

    :cond_7
    :sswitch_23
    const v0, 0xca3e

    goto :goto_e

    :sswitch_24
    if-nez v1, :cond_7

    const v0, 0xca5d

    goto :goto_e

    :sswitch_25
    const v0, 0xca7c

    :goto_f
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_f

    :sswitch_26
    const v0, 0xcd26

    goto :goto_f

    :sswitch_27
    invoke-static {p4}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xcd83

    :goto_10
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_10

    :sswitch_28
    const v0, 0xcda2

    goto :goto_10

    :sswitch_29
    const v0, 0x7b4805ad

    sget v1, Lw1/ۦۣۦۧ;->۟ۥۣ۠۟:I

    xor-int/2addr v0, v1

    invoke-static {p4, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {p4, p0, p1}, Ld1/۟۟ۥۡۡ;->ۣۦ۠ۦ(Ljava/lang/Object;J)Z

    move-result v2

    invoke-static {p4}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v1, 0xcdff

    :goto_11
    const v3, 0xce10

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_e

    goto :goto_11

    :cond_8
    :sswitch_2a
    const v1, 0xce3d

    goto :goto_11

    :sswitch_2b
    if-nez v2, :cond_8

    const v1, 0xd0e7

    goto :goto_11

    :sswitch_2c
    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۠ۨۥ()Lk0/y0;

    move-result-object v2

    const v1, 0xd106

    :goto_12
    const v3, 0xd117

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_f

    goto :goto_12

    :sswitch_2d
    if-ne v0, v2, :cond_9

    const v1, 0xd163

    goto :goto_12

    :cond_9
    :sswitch_2e
    const v1, 0xd144

    goto :goto_12

    :sswitch_2f
    new-instance v0, Lf0/a;

    invoke-direct {v0, p0, p1}, Lf0/a;-><init>(J)V

    invoke-static {p4, v0}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_30
    check-cast v0, Lh0/m;

    invoke-static {p4, v7}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    invoke-static {}, Lk4/۟۠ۦ۟ۤ;->ۣ۟۠ۧۥ()Lh0/k;

    move-result-object v1

    new-instance v2, Lf0/b;

    invoke-direct {v2, p3, p2}, Lf0/b;-><init>(Lc9/e;Ly0/o;)V

    const v3, -0x56eea5e2

    sget v4, Ll9/۟ۦۥۣۢ;->ۧۢ۠۟:I

    xor-int/2addr v3, v4

    invoke-static {p4, v3, v2}, Lc1/ۣۡۢۦ;->۟ۢۤۧۢ(Ljava/lang/Object;ILjava/lang/Object;)Lu0/b;

    move-result-object v2

    sget v3, Ls2/۟ۧ۟ۧۤ;->۟ۤۥ۠ۦ:I

    xor-int/lit16 v3, v3, 0x195

    invoke-static {v0, v1, v2, p4, v3}, Lt7/۟ۡ۠ۨ۟;->ۣ۟ۡۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    :sswitch_31
    invoke-static {p4}, Lq2/ۣ۟ۢۥ۠;->ۡ۟۠ۡ(Ljava/lang/Object;)Lm0/x1;

    move-result-object v8

    const v0, 0xd182

    :goto_13
    const v1, 0xd193

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_13

    :sswitch_32
    if-eqz v8, :cond_a

    const v0, 0xd1df

    goto :goto_13

    :cond_a
    :sswitch_33
    const v0, 0xd1c0

    goto :goto_13

    :sswitch_34
    new-instance v1, Lf0/c;

    move-wide v2, p0

    move-object v4, p2

    move-object v5, p3

    move v6, p5

    invoke-direct/range {v1 .. v7}, Lf0/c;-><init>(JLjava/lang/Object;Lc9/e;II)V

    iput-object v1, v8, Lm0/x1;->d:Lc9/e;

    :sswitch_35
    return-void

    nop

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1d
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_20
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_21
        0x57 -> :sswitch_29
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
        0x7ab -> :sswitch_29
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2f
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_30
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_33
        0x4c -> :sswitch_34
        0x53 -> :sswitch_35
    .end sparse-switch
.end method

.method public static final b(Ly0/o;Lm0/m;I)V
    .locals 5

    const/4 v1, 0x2

    check-cast p1, Lm0/q;

    const v0, -0x29616c23

    sget v2, Landroidx/annotation/۟ۥۥۣۨ;->۟ۧۦۣۦ:I

    xor-int/2addr v0, v2

    invoke-static {p1, v0}, Lr1/۟ۤۤۡ۠;->ۣ۟ۡ۠ۢ(Ljava/lang/Object;I)Lm0/q;

    sget v2, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۤۢۤۥ:I

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
    xor-int/lit16 v0, v2, -0xa7

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x4

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    move v0, v1

    :sswitch_8
    xor-int v2, v0, p2

    and-int/2addr v0, p2

    or-int/2addr v0, v2

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    sget v3, Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

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
    move v0, p2

    goto :goto_4

    :sswitch_d
    xor-int/lit16 v2, v3, 0x326

    and-int/2addr v2, v0

    if-ne v2, v1, :cond_2

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {p1}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-nez v1, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_6

    :sswitch_11
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_12
    invoke-static {}, Le1/۟ۡۡۤۡ;->ۨۦۦ۟()F

    move-result v0

    invoke-static {}, Ly6/۟ۢ۟ۥۤ;->ۣ۟ۤ۠ۤ()F

    move-result v1

    invoke-static {p0, v0, v1}, Lt7/۟ۡ۠ۨ۟;->۟ۦۢۨۧ(Ljava/lang/Object;FF)Ly0/o;

    move-result-object v0

    invoke-static {}, Lc7/ۨۤۦۢ;->ۥۤۨ()Lf0/e;

    move-result-object v1

    invoke-static {v0, v1}, Lv6/۟ۦۨۦۣ;->۟ۧۡ۠۠(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣۢۨۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_13
    invoke-static {p1}, Lq2/ۣ۟ۢۥ۠;->ۡ۟۠ۡ(Ljava/lang/Object;)Lm0/x1;

    move-result-object v1

    const v0, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    if-eqz v1, :cond_4

    const v0, 0xc65e

    goto :goto_8

    :sswitch_15
    const v0, 0xc29d

    goto :goto_7

    :sswitch_16
    invoke-static {p1}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_9
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_9

    :cond_4
    :sswitch_18
    const v0, 0xc63f

    goto :goto_8

    :sswitch_19
    new-instance v0, Ly/m;

    const/4 v2, 0x1

    invoke-direct {v0, p0, p2, v2}, Ly/m;-><init>(Ly0/o;II)V

    iput-object v0, v1, Lm0/x1;->d:Lc9/e;

    :sswitch_1a
    return-void

    nop

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x13 -> :sswitch_14
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_13
    .end sparse-switch
.end method
