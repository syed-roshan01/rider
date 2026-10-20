.class public final Lcom/auto/accept/app/AutoAcceptApp;
.super Ly4/r;


# annotations
.annotation runtime Ldagger/hilt/android/HiltAndroidApp;
.end annotation


# static fields
.field public static final c:I

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/app/AutoAcceptApp;->short:[S

    return-void

    :array_0
    .array-data 2
        0xc48s
        0xc7cs
        0xc7ds
        0xc66s
        0xc48s
        0xc6as
        0xc6as
        0xc6cs
        0xc79s
        0xc7ds
        0xc48s
        0xc79s
        0xc79s
        0x4f8s
        0x4c3s
        0x4c2s
        0x4d1s
        0x4des
        0x4c0s
        0x4des
        0x48bs
        0x4c7s
        0x4c2s
        0x4d8s
        0x4dfs
        0x4ces
        0x4c5s
        0x4ces
        0x4d9s
        0x48bs
        0x4d8s
        0x4ces
        0x4dfs
        0x4des
        0x4dbs
        0x48bs
        0x4ces
        0x4d9s
        0x4d9s
        0x4c4s
        0x4d9s
        0x491s
        0x48bs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ly4/r;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "Tpxaox0CioxYbMQAMDJ7S"

    invoke-static {v0}, Lg2/۟۠ۡۡۦ;->ۣ۟۟ۢۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۤۡۢ()[S
    .locals 2

    invoke-static {}, Lg5/ۣۡۦۣ;->۟ۢۤ۟ۡ()I

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
    sget-object v0, Lcom/auto/accept/app/AutoAcceptApp;->short:[S

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
.method public final onCreate()V
    .locals 6

    invoke-super {p0}, Ly4/r;->onCreate()V

    :try_start_0
    new-instance v0, Ly4/a;

    invoke-direct {v0}, Ly4/a;-><init>()V

    invoke-static {}, La8/ۣۡۨ۠;->ۡۦۦۢ()Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Lla/f;

    invoke-direct {v2, v0}, Lla/f;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v0, Ly4/a;

    invoke-direct {v0}, Ly4/a;-><init>()V

    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۢۤ()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Lla/f;

    invoke-direct {v3, v0}, Lla/f;-><init>(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    invoke-static {}, Lr2/۠ۨۦۢ;->۟ۦ۟ۢۤ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_1
    if-gtz v1, :cond_0

    const v0, 0xbe60

    goto :goto_2

    :sswitch_2
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    const/16 v1, 0x6cc

    :goto_3
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :sswitch_4
    invoke-static {}, Lcom/auto/accept/app/AutoAcceptApp;->ۤۤۡۢ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lf/ۣ۟ۤۤ;->ۣۤۧۢ:I

    xor-int/lit16 v3, v3, -0x1f8

    const/16 v4, 0xc09

    invoke-static {v1, v2, v3, v4}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۡۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/app/AutoAcceptApp;->ۤۤۡۢ()[S

    move-result-object v2

    const/16 v3, 0xd

    sget v4, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۠ۧۨۤ:I

    xor-int/lit8 v4, v4, 0xc

    const/16 v5, 0x4ab

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۦۦۦ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :sswitch_5
    const v0, 0xbe41

    goto :goto_2

    :sswitch_6
    const-string v0, "Dr"

    invoke-static {v0}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۣ۟۠۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_1
        0xb918 -> :sswitch_7
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch
.end method
