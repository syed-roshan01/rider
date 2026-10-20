.class public abstract Ly3/i;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/pm/PackageManager;Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 12

    const-wide/16 v8, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e4\u06e4\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-wide v6, v8

    move-wide v10, v8

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v10, v11}, Ly3/i;->ۡ۠ۦۤ(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v0

    const-string v1, "\u06df\u06e5\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    const-wide/16 v8, 0xbd

    xor-long/2addr v8, v6

    const-string v1, "\u06e1\u06e8\u06e1"

    move-object v4, v1

    move-wide v10, v8

    goto :goto_0

    :sswitch_1
    invoke-static {p1}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e3\u06e0\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    int-to-long v6, v5

    const-string v1, "\u06e3\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v2, v0}, Ly3/i;->۟۠ۡۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    const-string v4, "\u06e2\u06e5\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    sget v5, Le2/ۨۥ۠ۨ;->ۣ۟۟ۢۨ:I

    const-string v1, "\u06e7\u06e7\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdc64 -> :sswitch_0
        0x1aa7c0 -> :sswitch_3
        0x1ab303 -> :sswitch_5
        0x1ab627 -> :sswitch_4
        0x1aba5f -> :sswitch_1
        0x1ac5ff -> :sswitch_2
    .end sparse-switch
.end method

.method public static ۟۠ۡۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/pm/PackageInfo;
    .locals 2

    invoke-static {}, Lc4/ۡ۟۠ۥ;->ۣۣۡۤ()I

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
    check-cast p0, Landroid/content/pm/PackageManager;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/content/pm/PackageManager$PackageInfoFlags;

    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object v0

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

.method public static ۡ۠ۦۤ(J)Landroid/content/pm/PackageManager$PackageInfoFlags;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

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
    invoke-static {p0, p1}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v0

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
