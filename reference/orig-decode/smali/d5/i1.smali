.class public final Ld5/i1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/i1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x728s
        0x733s
        0x71es
        0x725s
        0x728s
        0x739s
        0x71ds
        0x72es
        0x72es
        0x73ds
        0x725s
        0x774s
        0x772s
        0x772s
        0x772s
        0x775s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iput p1, p0, Ld5/i1;->a:I

    iput-object p2, p0, Ld5/i1;->b:Ljava/lang/Object;

    iput-object p3, p0, Ld5/i1;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۧۨۡ۟()I

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
    const-string v0, "1QZzGphwLpbILXJOQ3253THRQHzm"

    invoke-static {v0}, Ll8/ۣ۟ۧۢ۠;->ۤۡۤ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۣ۟ۡ۠ۦ()[S
    .locals 2

    invoke-static {}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۦۡۦ۠()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Ld5/i1;->short:[S

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/16 v7, 0x200

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v2

    invoke-static {p0}, Lu8/ۨۡ۠;->۟ۦۣۡ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۡۢۨۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0}, Lr2/۠ۦۡۤ;->۟ۦۣ۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v3, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    packed-switch v3, :pswitch_data_1

    check-cast v0, Lu9/d;

    invoke-static {v0, v1}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣۨۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    move-object v0, v2

    :goto_2
    return-object v0

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :pswitch_0
    check-cast v0, Ln9/d;

    invoke-static {v0}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۢۧۧۦ(Ljava/lang/Object;)Landroid/os/Handler;

    move-result-object v3

    move-object v0, v1

    check-cast v0, Ljava/lang/Runnable;

    invoke-static {v3, v0}, Lc4/۟ۦۧۦۤ;->ۥۧۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    packed-switch v3, :pswitch_data_2

    check-cast v0, Lu9/d;

    invoke-static {v0, v1}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣۨۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_3
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_3

    :sswitch_2
    const/16 v0, 0x6eb

    goto :goto_3

    :pswitch_2
    check-cast v0, Ln9/d;

    invoke-static {v0}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۢۧۧۦ(Ljava/lang/Object;)Landroid/os/Handler;

    move-result-object v0

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lc4/۟ۦۧۦۤ;->ۥۧۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    move-object v0, v2

    goto :goto_2

    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    invoke-static {p1}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v2

    check-cast v0, Lc9/c;

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v2}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۡۥۣۡ;->۟ۥۣۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :pswitch_4
    check-cast p1, Landroid/net/Uri;

    const/16 v3, 0x748

    :goto_4
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_4

    :sswitch_4
    if-eqz p1, :cond_0

    const v3, 0xbe60

    goto :goto_4

    :cond_0
    :sswitch_5
    const v3, 0xbe41

    goto :goto_4

    :sswitch_6
    check-cast v0, Landroid/content/Context;

    check-cast v1, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :try_start_0
    invoke-static {v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۢۧۦ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, p1}, Lz/ۨۤۥۨ;->۟۟ۢۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۢۦۣۨ(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    const v3, 0xbe7f

    :goto_5
    const v5, 0xbe90

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_3

    goto :goto_5

    :cond_1
    :sswitch_7
    const v3, 0xbebd

    goto :goto_5

    :sswitch_8
    if-eqz v4, :cond_1

    const v3, 0xbedc

    goto :goto_5

    :sswitch_9
    invoke-static {v4}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۧ۟ۤۦ(Ljava/lang/Object;)V

    :sswitch_a
    const v3, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_b
    const v3, 0xbf39

    goto :goto_6

    :sswitch_c
    if-eqz v0, :cond_2

    const v3, 0xc1e3

    goto :goto_6

    :sswitch_d
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v0}, Lj5/۟ۢۥۨۦ;->ۣ۟ۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    const v3, 0xc202

    :goto_7
    const v6, 0xc213

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_e
    if-gt v5, v7, :cond_3

    const v3, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_f
    const v3, 0xc240

    goto :goto_7

    :sswitch_10
    invoke-static {v0}, La/ۥۡۢۨ;->ۣۣۤۥ(Ljava/lang/Object;)I

    move-result v5

    const v3, 0xc27e

    :goto_8
    const v6, 0xc28f

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_11
    const v3, 0xc2bc

    goto :goto_8

    :sswitch_12
    if-le v5, v7, :cond_4

    const v3, 0xc2db

    goto :goto_8

    :sswitch_13
    int-to-float v3, v7

    invoke-static {v0}, Lj5/۟ۢۥۨۦ;->ۣ۟ۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v0}, La/ۥۡۢۨ;->ۣۣۤۥ(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v5, v6}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v3, v5

    invoke-static {v0}, Lj5/۟ۢۥۨۦ;->ۣ۟ۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v3

    float-to-int v5, v5

    invoke-static {v0}, La/ۥۡۢۨ;->ۣۣۤۥ(Ljava/lang/Object;)I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v3, v6

    float-to-int v3, v3

    const/4 v6, 0x1

    invoke-static {v0, v5, v3, v6}, Ld5/ۣۦۢۢ;->۟ۢۡۥ(Ljava/lang/Object;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    :sswitch_14
    invoke-static {v0}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->۟ۧۧۤ۠(Ljava/lang/Object;)V

    invoke-static {}, Lq7/۟ۢۡ۟۟;->۟ۦ۟ۨ۠()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v3

    sget v5, Lc4/۟ۦۧۦۤ;->۟ۥۢۦۨ:I

    xor-int/lit16 v5, v5, 0x2cc

    invoke-static {v0, v3, v5, v4}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۥۢۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Z

    invoke-static {v4}, Lq1/۠۠ۤ;->ۣۧۡۦ(Ljava/lang/Object;)[B

    move-result-object v3

    invoke-static {}, Ld5/i1;->ۣ۟ۡ۠ۦ()[S

    move-result-object v0

    const/4 v4, 0x0

    sget v5, Landroidx/activity/ۣۧۧۢ;->ۤۧۥ:I

    xor-int/lit16 v5, v5, -0x1a1

    const/16 v6, 0x75c

    invoke-static {v0, v4, v5, v6}, Lv0/ۣۣۡۢ;->ۣۦ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {v1}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v0

    invoke-static {v0}, Lh1/۟۟ۨۦۦ;->ۥۨۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v0, 0xc2fa

    :goto_9
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    if-nez v4, :cond_5

    const v0, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_17
    const v0, 0xc601

    :goto_a
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    const v0, 0xc620

    goto :goto_a

    :sswitch_19
    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v0

    new-instance v5, Lf5/d0;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v4, v3, v6}, Lf5/d0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;[BLu8/e;)V

    const/4 v1, 0x0

    const/4 v3, 0x0

    sget v4, La/ۥۡۢۨ;->۟۟ۡۨۤ:I

    xor-int/lit8 v4, v4, -0x76

    invoke-static {v0, v1, v3, v5, v4}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_1a
    move-object v0, v2

    goto/16 :goto_2

    :catch_0
    move-exception v0

    const v0, 0xc67d

    :goto_b
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :sswitch_1b
    const v0, 0xc69c

    goto :goto_b

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb918 -> :sswitch_1a
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_5
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0x2d -> :sswitch_a
        0x4c -> :sswitch_9
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_1a
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_14
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1b
    .end sparse-switch
.end method
