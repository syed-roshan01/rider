.class public final Lk6/l6;
.super Lk6/o5;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static p(Ljava/net/HttpURLConnection;)[B
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {p0}, La0/ۣ۟ۤۨۧ;->۟۟ۦۢۢ(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v1

    const/16 v0, 0x400

    new-array v3, v0, [B

    :sswitch_0
    invoke-static {v1, v3}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->ۡۤۢۧ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-lez v4, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x0

    invoke-static {v2, v3, v0, v4}, Ln/۟۠ۥۥۨ;->ۣۧ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;II)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v2, 0xbe22

    goto :goto_2

    :sswitch_6
    invoke-static {v2}, Lq1/۠۠ۤ;->ۣۧۡۦ(Ljava/lang/Object;)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    invoke-static {v1}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۧ۟ۤۦ(Ljava/lang/Object;)V

    return-object v0

    :sswitch_7
    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_8
    const v2, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v1, :cond_1

    const v2, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v1}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۧ۟ۤۦ(Ljava/lang/Object;)V

    :sswitch_b
    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_b
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
