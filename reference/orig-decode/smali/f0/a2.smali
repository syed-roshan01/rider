.class public final Lf0/a2;
.super Ljava/lang/Object;


# static fields
.field public static final f:La/a;

.field public static final g:Lv0/p;


# instance fields
.field public final a:Lm0/k1;

.field public final b:Lm0/k1;

.field public c:Ld1/d;

.field public d:J

.field public final e:Lm0/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La/a;

    sget v1, Lw2/۟ۧۥۦۨ;->ۥۥ۟۠:I

    xor-int/lit16 v1, v1, 0x2da

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La/a;-><init>(II)V

    sput-object v0, Lf0/a2;->f:La/a;

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۣ۟ۤۢۧ()Lf0/z1;

    move-result-object v0

    invoke-static {}, Ld9/ۥۡۧۡ;->ۣۣ۟۟ۦ()Lf0/j;

    move-result-object v1

    invoke-static {v0, v1}, Ld3/ۡۨۢۦ;->ۡۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Lv0/p;

    move-result-object v0

    sput-object v0, Lf0/a2;->g:Lv0/p;

    return-void
.end method

.method public constructor <init>(Lv/h1;F)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lv/ۣۢ۟ۧ;->۟ۧۥۥۡ(F)Lm0/k1;

    move-result-object v0

    iput-object v0, p0, Lf0/a2;->a:Lm0/k1;

    const/4 v0, 0x0

    invoke-static {v0}, Lv/ۣۢ۟ۧ;->۟ۧۥۥۡ(F)Lm0/k1;

    move-result-object v0

    iput-object v0, p0, Lf0/a2;->b:Lm0/k1;

    invoke-static {}, Ls8/۟ۥۨۨ;->ۡۥ۠۟()Ld1/d;

    move-result-object v0

    iput-object v0, p0, Lf0/a2;->c:Ld1/d;

    invoke-static {}, Lz3/۟ۡ۠ۦۣ;->ۣۣۨ()J

    move-result-wide v0

    iput-wide v0, p0, Lf0/a2;->d:J

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟۟۟ۨ()Lm0/o3;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۡۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lf0/a2;->e:Lm0/n1;

    invoke-static {}, Lc0/ۦ۠۟ۥ;->ۦۢ۠ۦ()I

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
    const-string v0, "Z9i8CDXf"

    invoke-static {v0}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟۠۟ۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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
.method public final a(Lv/h1;Ld1/d;II)V
    .locals 10

    add-int/lit8 v0, p4, 0x10

    sub-int/2addr v0, p3

    add-int/lit8 v0, v0, -0x10

    int-to-float v4, v0

    invoke-static {p0}, Landroidx/lifecycle/ۧۥۡۨ;->ۢۨ۟ۥ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۣ۟ۢۦۡ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lk7/۟ۤۥۡ;->ۢ۟ۡۥ(Ljava/lang/Object;)Ld1/d;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۟۠ۢۢ(Ljava/lang/Object;)F

    move-result v5

    invoke-static {p2}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۟۠ۢۢ(Ljava/lang/Object;)F

    move-result v2

    invoke-static {p0}, Lt8/ۦۣ۠;->ۧۥۨ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v6

    invoke-static {p2}, La8/ۡۦۨۡ;->ۧ۠ۧ(Ljava/lang/Object;)F

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
    cmpg-float v0, v2, v5

    if-nez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, La8/ۡۦۨۡ;->ۧ۠ۧ(Ljava/lang/Object;)F

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    cmpg-float v0, v1, v3

    if-nez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Ll0/ۡۦۦۡ;->ۧۢۥ()Lv/h1;

    move-result-object v3

    const v0, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-ne p1, v3, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    const/4 v0, 0x1

    const v3, 0xbefb

    :goto_4
    const v5, 0xbf0c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_b
    const v3, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-eqz v0, :cond_3

    const v3, 0xc25f

    goto :goto_6

    :sswitch_d
    const v3, 0xbf1a

    goto :goto_4

    :sswitch_e
    const/4 v0, 0x0

    goto :goto_5

    :cond_3
    :sswitch_f
    const v3, 0xc240

    goto :goto_6

    :sswitch_10
    move v1, v2

    :sswitch_11
    const v2, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_12
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-eqz v0, :cond_4

    const v2, 0xc2db

    goto :goto_7

    :sswitch_14
    invoke-static {p2}, Lr7/۟۟ۡ۟ۢ;->ۣ۟ۤ۟۟(Ljava/lang/Object;)F

    move-result v0

    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v2, 0xc5a4

    goto :goto_8

    :sswitch_16
    invoke-static {p2}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۧۦۡۡ(Ljava/lang/Object;)F

    move-result v0

    :sswitch_17
    invoke-static {v6}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v3

    int-to-float v5, p3

    const/4 v2, 0x0

    sub-float/2addr v2, v5

    sub-float v7, v3, v2

    const v2, 0xc601

    :goto_9
    const v8, 0xc612

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    cmpl-float v2, v0, v7

    if-lez v2, :cond_5

    const v2, 0xc65e

    goto :goto_9

    :cond_5
    :sswitch_19
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1a
    const/high16 v1, 0x41b00000    # 22.0f

    add-float/2addr v0, v1

    sub-float/2addr v0, v7

    const/high16 v1, 0x41b00000    # 22.0f

    sub-float/2addr v0, v1

    const v1, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1b
    invoke-static {v6}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v1

    const/4 v2, 0x0

    sub-float v0, v2, v0

    sub-float v0, v1, v0

    invoke-static {v6, v0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۣ۟ۢۦۡ(Ljava/lang/Object;F)V

    iput-object p2, p0, Lf0/a2;->c:Ld1/d;

    :sswitch_1c
    invoke-static {v6}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1, v4}, Lz3/۟ۡ۠ۦۣ;->۟ۡۧۢۨ(FFF)F

    move-result v0

    invoke-static {v6, v0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۣ۟ۢۦۡ(Ljava/lang/Object;F)V

    return-void

    :sswitch_1d
    const v1, 0xc69c

    goto :goto_a

    :sswitch_1e
    cmpg-float v8, v1, v3

    const v2, 0xc984

    :goto_c
    const v9, 0xc995

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    if-gez v8, :cond_6

    const v2, 0xc9e1

    goto :goto_c

    :cond_6
    :sswitch_20
    const v2, 0xc9c2

    goto :goto_c

    :sswitch_21
    const v2, 0xca00

    :goto_d
    const v9, 0xca11

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :cond_7
    :sswitch_22
    const v2, 0xca3e

    goto :goto_d

    :sswitch_23
    const/high16 v2, 0x40800000    # 4.0f

    add-float/2addr v2, v0

    sub-float/2addr v2, v1

    const/high16 v9, 0x40800000    # 4.0f

    sub-float/2addr v2, v9

    cmpl-float v2, v2, v5

    if-lez v2, :cond_7

    const v2, 0xca5d

    goto :goto_d

    :sswitch_24
    const v1, 0xca7c

    :goto_e
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_e

    :sswitch_25
    const v1, 0xcd26

    goto :goto_e

    :sswitch_26
    const v2, 0xcd83

    :goto_f
    const v7, 0xcd94

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :sswitch_27
    if-gez v8, :cond_8

    const v2, 0xcde0

    goto :goto_f

    :cond_8
    :sswitch_28
    const v2, 0xcdc1

    goto :goto_f

    :sswitch_29
    const v2, 0xcdff

    :goto_10
    const v7, 0xce10

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_e

    goto :goto_10

    :cond_9
    :sswitch_2a
    const v2, 0xce3d

    goto :goto_10

    :sswitch_2b
    const/high16 v2, 0x41b00000    # 22.0f

    sub-float v2, v0, v2

    sub-float/2addr v2, v1

    const/high16 v7, 0x41b00000    # 22.0f

    add-float/2addr v2, v7

    cmpg-float v2, v2, v5

    if-gtz v2, :cond_9

    const v2, 0xd0e7

    goto :goto_10

    :sswitch_2c
    const/high16 v0, 0x41f00000    # 30.0f

    sub-float v0, v1, v0

    sub-float/2addr v0, v3

    const/high16 v1, 0x41f00000    # 30.0f

    add-float/2addr v0, v1

    const v1, 0xd106

    :goto_11
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_11

    :sswitch_2d
    const v1, 0xd125

    goto :goto_11

    :sswitch_2e
    const/4 v0, 0x0

    goto/16 :goto_b

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
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
        0xb97b -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_f
        0x4c -> :sswitch_11
        0x53 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_16
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_26
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_26
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
        0x55 -> :sswitch_2e
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2e
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_1b
    .end sparse-switch
.end method
