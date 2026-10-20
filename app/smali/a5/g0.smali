.class public final La5/g0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lq8/i;

.field public static final b:Lq8/i;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x12

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, La5/g0;->short:[S

    new-instance v0, Lq8/i;

    invoke-static {}, Lj3/۟ۧۧۦۤ;->ۤۨۧۥ()La5/a0;

    move-result-object v1

    invoke-direct {v0, v1}, Lq8/i;-><init>(Lc9/a;)V

    sput-object v0, La5/g0;->a:Lq8/i;

    new-instance v0, Lq8/i;

    invoke-static {}, Lq2/ۣ۟ۢۥ۠;->ۥ۟ۦۨ()La5/a0;

    move-result-object v1

    invoke-direct {v0, v1}, Lq8/i;-><init>(Lc9/a;)V

    sput-object v0, La5/g0;->b:Lq8/i;

    return-void

    :array_0
    .array-data 2
        0x85fs
        0x85es
        0x84cs
        0x827s
        0x832s
        0x631s
        0x62as
        0x616s
        0x631s
        0x637s
        0x62cs
        0x62bs
        0x622s
        0x66ds
        0x66bs
        0x66bs
        0x66bs
        0x66cs
    .end array-data
.end method

.method public static final a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6

    const/4 v5, 0x0

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
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v0, 0x400

    :try_start_0
    new-array v3, v0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_5
    :try_start_1
    invoke-static {v2, v3}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->ۡۤۢۧ(Ljava/lang/Object;Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const/4 v0, -0x1

    if-eq v4, v0, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v1, v3, v0, v4}, Ln/۟۠ۥۥۨ;->ۣۧ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    const v0, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v0

    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    :try_start_3
    invoke-static {v2}, Lh5/ۧ۟ۨۧ;->ۦۦۧ(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :sswitch_b
    throw v0

    :sswitch_c
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_d
    :try_start_4
    invoke-static {v2}, Lh5/ۧ۟ۨۧ;->ۦۦۧ(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :sswitch_e
    invoke-static {}, La5/g0;->۟ۤ()[S

    move-result-object v0

    sget v2, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->۟ۥۡۥۣ:I

    xor-int/lit16 v2, v2, -0x1df

    const/16 v3, 0x80a

    invoke-static {v0, v5, v2, v3}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۣ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lq2/ۣ۟ۢۥ۠;->ۢۤۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, La5/g0;->۟ۤ()[S

    move-result-object v1

    const/4 v2, 0x5

    sget v3, Ly9/ۨ۠;->ۡۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3b4

    const/16 v4, 0x645

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۣ۟ۡۨۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_f
    return-object v0

    :catch_0
    move-exception v0

    const v0, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    const v0, 0xc221

    goto :goto_5

    :catch_1
    move-exception v0

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_11
    const v0, 0xc29d

    goto :goto_6

    :catch_2
    move-exception v1

    const v1, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_12
    const v1, 0xc5a4

    goto :goto_7

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
        0x36 -> :sswitch_f
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
        0xe -> :sswitch_5
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_e
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_b
    .end sparse-switch
.end method

.method public static ۟ۤ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۢۥۤ۠()I

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
    sget-object v0, La5/g0;->short:[S

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
