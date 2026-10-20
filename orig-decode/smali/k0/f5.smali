.class public abstract Lk0/f5;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/m3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm0/m3;

    invoke-static {}, Lj2/ۥ۠ۨۢ;->۟ۧ۟ۨۥ()Lk0/j0;

    move-result-object v1

    invoke-direct {v0, v1}, Lm0/m3;-><init>(Lc9/a;)V

    sput-object v0, Lk0/f5;->a:Lm0/m3;

    return-void
.end method

.method public static final a(Lk0/e5;I)La2/c0;
    .locals 3

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
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lg3/۟ۥۣۣۥ;->ۣۨۤ۟:I

    xor-int/lit16 v0, v0, -0x2f8

    add-int/2addr v0, p1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Landroidx/fragment/app/a0;-><init>()V

    throw v0

    :pswitch_0
    invoke-static {p0}, Lh3/۟ۡۥ۠۠;->ۨ۟۠ۨ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :pswitch_1
    invoke-static {p0}, Lt3/ۣ۟ۧۡ;->ۣۤۦۡ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const v1, 0xbe22

    goto :goto_2

    :pswitch_2
    invoke-static {p0}, Ld3/ۡۨۢۦ;->ۡۧ۠۠(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :pswitch_3
    :sswitch_5
    return-object v0

    :sswitch_6
    const v1, 0xbe9e

    goto :goto_3

    :pswitch_4
    invoke-static {p0}, Lo2/۟ۤۨۡۥ;->۟ۥۤ۠۠(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_7
    const v1, 0xbf1a

    goto :goto_5

    :pswitch_5
    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۤۧۤۡ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_8
    const v1, 0xc221

    goto :goto_6

    :pswitch_6
    invoke-static {p0}, Lc0/ۦۢۦۥ;->ۡۦۢۢ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_9
    const v1, 0xc29d

    goto :goto_7

    :pswitch_7
    invoke-static {p0}, Lx2/۟ۢۥ;->ۥۧۤۤ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_a
    const v1, 0xc5a4

    goto :goto_8

    :pswitch_8
    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۧۥۡۦ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_b
    const v1, 0xc620

    goto :goto_9

    :pswitch_9
    invoke-static {p0}, Lb3/۟ۧ۠ۡۥ;->ۣۦۢ۟(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :sswitch_c
    const v1, 0xc69c

    goto :goto_a

    :pswitch_a
    invoke-static {p0}, Le1/۟ۡۡۤۡ;->۟ۡۦۨۡ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xc984

    :goto_b
    const v2, 0xc995

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_a

    goto :goto_b

    :sswitch_d
    const v1, 0xc9a3

    goto :goto_b

    :pswitch_b
    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۣۢۧۤ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xca00

    :goto_c
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_1

    :pswitch_c
    goto :goto_c

    :pswitch_d
    const v1, 0xca1f

    goto :goto_c

    :pswitch_e
    invoke-static {p0}, Lh5/ۧ۟ۨۧ;->۠۠ۥ۠(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xca7c

    :goto_d
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_b

    goto :goto_d

    :sswitch_e
    const v1, 0xcd26

    goto :goto_d

    :pswitch_f
    invoke-static {p0}, Lh/۟ۡۥۡۧ;->۟۠ۤ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xcd83

    :goto_e
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_e

    :sswitch_f
    const v1, 0xcda2

    goto :goto_e

    :pswitch_10
    invoke-static {p0}, Lt8/ۦۣ۠;->ۣ۟ۡۨۦ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    const v1, 0xcdff

    :goto_f
    const v2, 0xce10

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_f

    :sswitch_10
    const v1, 0xce1e

    goto :goto_f

    :pswitch_11
    invoke-static {p0}, Landroid/support/v4/app/ۥۣۡ;->ۣ۟ۦۡ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    goto/16 :goto_4

    :sswitch_11
    const/4 v0, 0x0

    throw v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_11
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_5
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_5
        0x1f7 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_8
        0x32 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_5
        0xf1 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_a
        0x6af -> :sswitch_5
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_b
        0x32 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_5
        0xf3 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_d
        0x36 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_c
        :pswitch_c
        :pswitch_d
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_e
        0x7ab -> :sswitch_5
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_f
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_5
        0x3ef -> :sswitch_10
    .end sparse-switch
.end method
