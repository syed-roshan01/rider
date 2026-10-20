.class public final Lk0/f;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lr1/l0;

.field public final c:F

.field public final d:I

.field public final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lr1/l0;FILjava/util/ArrayList;)V
    .locals 2

    iput-object p1, p0, Lk0/f;->a:Ljava/util/List;

    iput-object p2, p0, Lk0/f;->b:Lr1/l0;

    iput p3, p0, Lk0/f;->c:F

    iput p4, p0, Lk0/f;->d:I

    iput-object p5, p0, Lk0/f;->e:Ljava/util/List;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ly9/ۧۨ۠ۢ;->۟ۦۡۥۣ()I

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
    const-string v0, "3wQc"

    invoke-static {v0}, Lg/۟۠ۡۨۨ;->۠ۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v8, 0x0

    check-cast p1, Lr1/w0;

    invoke-static {p0}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۦ۠ۤۤ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lq7/۟ۢۢ۟ۧ;->۟۠ۨ۟ۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v11

    move v7, v8

    :goto_0
    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_1
    if-ge v7, v11, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_2
    invoke-static {v10, v7}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    invoke-static {v6}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v12

    new-array v3, v12, [I

    move v4, v8

    :goto_2
    invoke-static {p0}, Lc1/ۣ۟۠ۧۤ;->۠۠ۤۧ(Ljava/lang/Object;)Lr1/l0;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_3
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_3

    :sswitch_3
    if-ge v4, v12, :cond_1

    const/16 v0, 0x729

    goto :goto_3

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_3

    :sswitch_5
    invoke-static {v6, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/x0;

    invoke-static {v0}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v6}, Lh1/۟۟ۨۦۦ;->۟ۦۡۦۦ(Ljava/lang/Object;)I

    move-result v9

    const/16 v0, 0x748

    :goto_4
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_4

    :sswitch_6
    if-ge v4, v9, :cond_2

    const v0, 0xbe60

    goto :goto_4

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_4

    :sswitch_8
    invoke-static {p0}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->۟۟ۨۥ۠(Ljava/lang/Object;)F

    move-result v0

    invoke-static {v1, v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v0

    const v1, 0xbe7f

    :goto_5
    const v9, 0xbe90

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_3

    goto :goto_5

    :goto_6
    :sswitch_9
    add-int/lit8 v1, v5, 0x1a

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1a

    aput v0, v3, v4

    sget v0, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۣ۟ۨ۟:I

    xor-int/lit8 v0, v0, 0x42

    add-int/2addr v0, v4

    const v1, 0xbefb

    :goto_7
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_7

    :sswitch_a
    move v4, v0

    goto :goto_2

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_5

    :sswitch_c
    move v0, v8

    goto :goto_6

    :sswitch_d
    const v1, 0xbf1a

    goto :goto_7

    :sswitch_e
    invoke-static {}, Lh/ۢۢۨۨ;->۟ۡۥۣۤ()Ly/d;

    move-result-object v0

    new-array v5, v12, [I

    move v4, v8

    :sswitch_f
    const v9, 0xc202

    :goto_8
    const v13, 0xc213

    xor-int/2addr v9, v13

    sparse-switch v9, :sswitch_data_5

    goto :goto_8

    :sswitch_10
    if-ge v4, v12, :cond_3

    const v9, 0xc25f

    goto :goto_8

    :cond_3
    :sswitch_11
    const v9, 0xc240

    goto :goto_8

    :sswitch_12
    aput v8, v5, v4

    sget v9, Lu1/ۢۥ۠ۤ;->۠ۨ۟ۤ:I

    xor-int/lit16 v9, v9, 0x20c

    add-int/2addr v4, v9

    const v9, 0xc27e

    :goto_9
    const v13, 0xc28f

    xor-int/2addr v9, v13

    sparse-switch v9, :sswitch_data_6

    goto :goto_9

    :sswitch_13
    const v9, 0xc29d

    goto :goto_9

    :sswitch_14
    invoke-static {v1}, Lm9/۟ۤۢۦ۠;->۟ۦۣۧۡ(Ljava/lang/Object;)Lm2/l;

    move-result-object v4

    invoke-static/range {v0 .. v5}, Lz3/۟ۡ۠ۦۣ;->۟۟۠ۢۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    move v3, v8

    :goto_a
    const v0, 0xc2fa

    :goto_b
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_b

    :sswitch_15
    if-ge v3, v4, :cond_4

    const v0, 0xc5e2

    goto :goto_b

    :cond_4
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_b

    :sswitch_17
    invoke-static {v6, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/x0;

    aget v9, v5, v3

    invoke-static {p0}, Lr6/۟ۡ۠۟ۡ;->ۦۥۣ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v7}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-static {v1}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p1, v0, v9, v1}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۦۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;II)V

    sget v0, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۤۦۨ:I

    xor-int/lit8 v0, v0, 0x68

    add-int/2addr v0, v3

    const v1, 0xc601

    :goto_c
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_8

    goto :goto_c

    :sswitch_18
    const v1, 0xc620

    goto :goto_c

    :sswitch_19
    move v3, v0

    goto :goto_a

    :sswitch_1a
    sget v0, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۦۣ۠:I

    xor-int/lit16 v0, v0, -0x268

    add-int/2addr v0, v7

    const v1, 0xc67d

    :goto_d
    const v3, 0xc68e

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_9

    goto :goto_d

    :sswitch_1b
    move v7, v0

    goto/16 :goto_0

    :sswitch_1c
    const v1, 0xc69c

    goto :goto_d

    :sswitch_1d
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_e
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
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1c
    .end sparse-switch
.end method
