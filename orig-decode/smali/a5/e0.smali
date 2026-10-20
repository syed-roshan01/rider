.class public final synthetic La5/e0;
.super Ljava/lang/Object;

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, La5/e0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x2d6s
        0x2c7s
        0x2dfs
        0x2d2s
        0x2cbs
        0x288s
        0x2cfs
        0x2c8s
        0xb27s
        0xb36s
        0xb2es
        0xb23s
        0xb3as
        0xb79s
        0xb34s
        0xb38s
        0xb3as
    .end array-data
.end method

.method public static ۣۨۧ۠()[S
    .locals 2

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, La5/e0;->short:[S

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
.method public final verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 5

    const/4 v0, 0x0

    invoke-static {p1}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->۟ۧۧۤ۠(Ljava/lang/Object;)V

    invoke-static {}, La5/e0;->ۣۨۧ۠()[S

    move-result-object v1

    sget v2, Ln7/۟ۤ۠۟ۥ;->۟۠۠ۤۥ:I

    xor-int/lit16 v2, v2, -0x2ee

    const/16 v3, 0x2a6

    invoke-static {v1, v0, v2, v3}, Ld9/ۣ۟۠ۢۡ;->ۨۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lf4/ۡۤۡ;->۟ۥۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v2

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
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, La5/e0;->ۣۨۧ۠()[S

    move-result-object v1

    const/16 v2, 0x8

    sget v3, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟۟ۧۥۦ:I

    xor-int/lit16 v3, v3, -0x2b3

    const/16 v4, 0xb57

    invoke-static {v1, v2, v3, v4}, Lt3/ۣ۟ۧۡ;->۟ۢۦ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lf4/ۡۤۡ;->۟ۥۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v2

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
    const/4 v0, 0x1

    :sswitch_6
    return v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method
