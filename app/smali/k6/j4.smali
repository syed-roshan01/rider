.class public final Lk6/j4;
.super Lk6/m7;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/j4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x372s
        0x37es
        0x37fs
        0x37fs
        0x374s
        0x372s
        0x365s
        0x378s
        0x367s
        0x378s
        0x365s
        0x368s
    .end array-data
.end method

.method public static s(Ljava/net/HttpURLConnection;)[B
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

.method public static ۦۦ۟۟()[S
    .locals 2

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۢۧۡ()I

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
    sget-object v0, Lk6/j4;->short:[S

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
.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t()Z
    .locals 5

    const/4 v2, 0x0

    invoke-static {p0}, Lc7/۟ۦۣۢۦ;->ۥۣۨ۠(Ljava/lang/Object;)V

    invoke-static {p0}, Lf4/ۦۣ۟ۦ;->۟۟۠۠ۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lk6/j4;->ۦۦ۟۟()[S

    move-result-object v1

    sget v3, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۥۧۥۢ:I

    xor-int/lit16 v3, v3, -0x12c

    const/16 v4, 0x311

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->۠ۢۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ld4/۟۠۠۟ۢ;->۟ۤ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    const/16 v3, 0x650

    :goto_0
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v3, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    invoke-static {v0}, Ld/۟ۤ۠ۡۨ;->۟ۥۢ۟۟(Ljava/lang/Object;)Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_5
    invoke-static {v0}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۤۨۡۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    const/4 v0, 0x1

    :goto_4
    return v0

    :sswitch_9
    move v0, v2

    goto :goto_4

    :catch_0
    move-exception v0

    const v0, 0xbe7f

    :goto_5
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_5

    :sswitch_a
    move-object v0, v1

    goto :goto_1

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_5

    :sswitch_c
    move-object v0, v1

    goto :goto_1

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
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_b
    .end sparse-switch
.end method
