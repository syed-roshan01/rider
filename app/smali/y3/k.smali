.class public abstract Ly3/k;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroidx/concurrent/futures/o;

.field public static final b:Ljava/lang/Object;

.field public static c:La4/q;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ly3/k;->short:[S

    new-instance v0, Landroidx/concurrent/futures/o;

    invoke-direct {v0}, Landroidx/concurrent/futures/o;-><init>()V

    sput-object v0, Ly3/k;->a:Landroidx/concurrent/futures/o;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly3/k;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Ly3/k;->c:La4/q;

    return-void

    nop

    :array_0
    .array-data 2
        0x92bs
        0x960s
        0x965s
        0x970s
        0x965s
        0x92bs
        0x969s
        0x96ds
        0x977s
        0x967s
        0x92bs
        0x974s
        0x976s
        0x96bs
        0x962s
        0x96ds
        0x968s
        0x961s
        0x977s
        0x92bs
        0x976s
        0x961s
        0x962s
        0x92bs
        0x2ffs
        0x2fds
        0x2e6s
        0x2e2s
        0x2ees
        0x2fds
        0x2f6s
        0x2a1s
        0x2ffs
        0x2fds
        0x2e0s
        0x2e9s
        0x250s
        0x21bs
        0x21es
        0x20bs
        0x21es
        0x250s
        0x212s
        0x216s
        0x20cs
        0x21cs
        0x250s
        0x20fs
        0x20ds
        0x210s
        0x219s
        0x216s
        0x213s
        0x21as
        0x20cs
        0x250s
        0x21cs
        0x20as
        0x20ds
        0x250s
        0x24fs
        0x250s
        0x4cds
        0x4cfs
        0x4d4s
        0x4d0s
        0x4dcs
        0x4cfs
        0x4c4s
        0x493s
        0x4cds
        0x4cfs
        0x4d2s
        0x4dbs
        0x6cas
        0x6c8s
        0x6d5s
        0x6dcs
        0x6d3s
        0x6d6s
        0x6dfs
        0x6f3s
        0x6d4s
        0x6c9s
        0x6ces
        0x6dbs
        0x6d6s
        0x6d6s
        0x6dfs
        0x6des
    .end array-data
.end method

.method public static a(Landroid/content/Context;)J
    .locals 3

    invoke-static {p0}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۣ۟ۡۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lt2/۟ۦۣۡۤ;->ۧۧۤۨ(Ljava/lang/Object;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {}, Ln9/ۤۧۧۤ;->۟ۡۤۢۦ()I

    move-result v2

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
    const/16 v0, 0x21

    if-lt v2, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1, p0}, Lja/ۥۣۨ۠;->ۧۧۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۢۦ۠(Ljava/lang/Object;)J

    move-result-wide v0

    :goto_1
    return-wide v0

    :sswitch_3
    invoke-static {p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lg5/۟ۥۨۤ;->ۣ۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۢۦ۠(Ljava/lang/Object;)J

    move-result-wide v0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static b()La4/q;
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e6\u06e8\u06e7"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object v2

    :sswitch_0
    sput-object v2, Ly3/k;->c:La4/q;

    const-string v1, "\u06e7\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lu/ۤ;->ۣ۟۟ۦ۟()Landroidx/concurrent/futures/o;

    move-result-object v0

    const-string v1, "\u06e3\u06e1\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Le2/۟۟ۥۦ;->ۣ۟ۦ۟()La4/q;

    move-result-object v1

    const-string v3, "\u06e5\u06e3\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۣۣ۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e3\u06e1\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    new-instance v1, La4/q;

    invoke-direct {v1}, La4/q;-><init>()V

    const-string v3, "\u06e6\u06e0\u06e2"

    move-object v2, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab641 -> :sswitch_3
        0x1ab642 -> :sswitch_2
        0x1ac168 -> :sswitch_0
        0x1ac265 -> :sswitch_4
        0x1ac50c -> :sswitch_1
    .end sparse-switch
.end method

.method public static c(Landroid/content/Context;Z)V
    .locals 16

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
    if-nez p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Le2/۟۟ۥۦ;->ۣ۟ۦ۟()La4/q;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۥۧۨ()Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez p1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    :try_start_0
    invoke-static {}, Le2/۟۟ۥۦ;->ۣ۟ۦ۟()La4/q;

    move-result-object v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    monitor-exit v10

    :goto_4
    :sswitch_c
    return-void

    :catchall_0
    move-exception v0

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_d
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :sswitch_e
    const v1, 0xbf1a

    goto :goto_5

    :sswitch_f
    :try_start_1
    invoke-static {}, Ln9/ۤۧۧۤ;->۟ۡۤۢۦ()I

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    const/16 v0, 0x1c

    if-lt v1, v0, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_6

    :sswitch_12
    const v0, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_14
    const/16 v0, 0x1e

    if-ne v1, v0, :cond_5

    const v0, 0xc2db

    goto :goto_7

    :sswitch_15
    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    const v0, 0xc5a4

    goto :goto_8

    :sswitch_17
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-static {}, Ly3/k;->ۤ۠ۢۡ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Le1/۟ۢ۟ۤۡ;->ۨ۠ۡ۟:I

    xor-int/lit16 v4, v4, 0x2fc

    const/16 v5, 0x904

    invoke-static {v2, v3, v4, v5}, La7/۠ۢۧ;->ۦۣۧۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ly3/k;->ۤ۠ۢۡ()[S

    move-result-object v2

    const/16 v3, 0x18

    sget v4, Ld3/ۡۨۢۦ;->ۣ۟ۡۧۤ:I

    xor-int/lit16 v4, v4, -0x39c

    const/16 v5, 0x28f

    invoke-static {v2, v3, v4, v5}, Lm9/۟ۤۢۦ۠;->ۥۡۥۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Lz3/۟ۡ۠ۦۣ;->ۦۧۦ۠(Ljava/lang/Object;)J

    move-result-wide v12

    invoke-static {v0}, Lh0/۟ۥ۟ۡۦ;->۟ۥۥۨۦ(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const v0, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    if-eqz v1, :cond_6

    const v0, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_19
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1a
    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :cond_7
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_a

    :sswitch_1c
    const-wide/16 v0, 0x0

    cmp-long v0, v12, v0

    if-lez v0, :cond_7

    const v0, 0xc965

    goto :goto_a

    :sswitch_1d
    const/4 v0, 0x1

    const v1, 0xc984

    :goto_b
    const v3, 0xc995

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_a

    goto :goto_b

    :sswitch_1e
    const v1, 0xc9a3

    goto :goto_b

    :sswitch_1f
    move v9, v0

    :goto_c
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-static {}, Ly3/k;->ۤ۠ۢۡ()[S

    move-result-object v3

    const/16 v4, 0x24

    sget v5, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->ۣۣۡۢ:I

    xor-int/lit16 v5, v5, 0xd0

    const/16 v6, 0x27f

    invoke-static {v3, v4, v5, v6}, Lz7/۟ۢۧۡۥ;->ۣ۟ۧۢۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ly3/k;->ۤ۠ۢۡ()[S

    move-result-object v3

    const/16 v4, 0x3e

    sget v5, Lh5/۟ۦۣۣ;->۠ۦۣ۟:I

    xor-int/lit16 v5, v5, -0x172

    const/16 v6, 0x4bd

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟۟ۦۢۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Lz3/۟ۡ۠ۦۣ;->ۦۧۦ۠(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-static {v0}, Lh0/۟ۥ۟ۡۦ;->۟ۥۥۨۦ(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    const v0, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_8
    :sswitch_20
    const v0, 0xca3e

    goto :goto_d

    :sswitch_21
    const/4 v0, 0x0

    move v9, v0

    goto :goto_c

    :sswitch_22
    if-eqz v1, :cond_8

    const v0, 0xca5d

    goto :goto_d

    :sswitch_23
    const v0, 0xca7c

    :goto_e
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_9

    const v0, 0xcd64

    goto :goto_e

    :cond_9
    :sswitch_25
    const v0, 0xcd45

    goto :goto_e

    :sswitch_26
    const/4 v0, 0x1

    const v1, 0xcd83

    :goto_f
    const v3, 0xcd94

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_d

    goto :goto_f

    :sswitch_27
    const v1, 0xcda2

    goto :goto_f

    :sswitch_28
    move v8, v0

    :goto_10
    :try_start_2
    invoke-static/range {p0 .. p0}, Lj2/ۥ۠ۨۢ;->ۣ۟ۧۨ۟(Ljava/lang/Object;)J
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-wide v4

    :try_start_3
    new-instance v11, Ljava/io/File;

    invoke-static/range {p0 .. p0}, Le2/۟ۤۢۦ;->ۥۡۥۦ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v0

    invoke-static {}, Ly3/k;->ۤ۠ۢۡ()[S

    move-result-object v1

    const/16 v3, 0x4a

    sget v14, Ls/ۣۡۡۧ;->۟ۥ۠ۥۡ:I

    xor-int/lit16 v14, v14, -0x1fe

    const/16 v15, 0x6ba

    invoke-static {v1, v3, v14, v15}, Lm7/ۧۢ۟;->ۧۨۨۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v11}, Lh0/۟ۥ۟ۡۦ;->۟ۥۥۨۦ(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    const v0, 0xcdff

    :goto_11
    const v3, 0xce10

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_e

    goto :goto_11

    :cond_a
    :sswitch_29
    const v0, 0xce3d

    goto :goto_11

    :sswitch_2a
    const/4 v0, 0x0

    move v8, v0

    goto :goto_10

    :sswitch_2b
    if-eqz v1, :cond_a

    const v0, 0xd0e7

    goto :goto_11

    :sswitch_2c
    :try_start_4
    invoke-static {v11}, Le9/ۧۧۡ;->۟ۡۨۤۦ(Ljava/lang/Object;)Ly3/j;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    const v1, 0xd106

    :goto_12
    const v3, 0xd117

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_f

    goto :goto_12

    :sswitch_2d
    const v1, 0xd125

    goto :goto_12

    :catch_0
    move-exception v0

    :try_start_5
    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۣ۟۟ۧ۟()La4/q;

    monitor-exit v10

    invoke-static {}, Ll8/ۣ۟ۧۢ۠;->۟ۦۣۡۨ()I

    move-result v1

    const v0, 0xd182

    :goto_13
    const v2, 0xd193

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_10

    goto :goto_13

    :sswitch_2e
    if-ltz v1, :cond_b

    const v0, 0xd1df

    goto :goto_13

    :cond_b
    :sswitch_2f
    const v0, 0xd1c0

    goto :goto_13

    :sswitch_30
    const-string v0, "FWoZV5J"

    invoke-static {v0}, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->۟۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_4

    :sswitch_31
    const/4 v0, 0x0

    :sswitch_32
    const v1, 0xd1fe

    :goto_14
    const v3, 0xd20f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_11

    goto :goto_14

    :sswitch_33
    if-eqz v0, :cond_c

    const v1, 0xd4e6

    goto :goto_14

    :cond_c
    :sswitch_34
    const v1, 0xd4c7

    goto :goto_14

    :sswitch_35
    invoke-static {v0}, Lc1/ۣۡۢۦ;->ۣ۟ۢۥۣ(Ljava/lang/Object;)J

    move-result-wide v14

    const v1, 0xd505

    :goto_15
    const v3, 0xd516

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_12

    goto :goto_15

    :sswitch_36
    cmp-long v1, v14, v4

    if-nez v1, :cond_d

    const v1, 0xd562

    goto :goto_15

    :cond_d
    :sswitch_37
    const v1, 0xd543

    goto :goto_15

    :sswitch_38
    invoke-static {v0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣۦۨۡ(Ljava/lang/Object;)I

    move-result v1

    const v3, 0xd581

    :goto_16
    const v14, 0xd592

    xor-int/2addr v3, v14

    sparse-switch v3, :sswitch_data_13

    goto :goto_16

    :sswitch_39
    const/4 v3, 0x2

    if-ne v1, v3, :cond_e

    const v3, 0xd869

    goto :goto_16

    :cond_e
    :sswitch_3a
    const v3, 0xd5bf

    goto :goto_16

    :sswitch_3b
    const v1, 0xd888

    :goto_17
    const v3, 0xd899

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_14

    goto :goto_17

    :sswitch_3c
    const v1, 0xd8a7

    goto :goto_17

    :sswitch_3d
    const v2, 0xd904

    :goto_18
    const v3, 0xd915

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_15

    goto :goto_18

    :sswitch_3e
    const v2, 0xd923

    goto :goto_18

    :sswitch_3f
    const v1, 0xd980

    :goto_19
    const v3, 0xd991

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_16

    goto :goto_19

    :sswitch_40
    if-eqz v9, :cond_f

    const v1, 0xdc68

    goto :goto_19

    :cond_f
    :sswitch_41
    const v1, 0xdc49

    goto :goto_19

    :sswitch_42
    const/4 v1, 0x1

    const v2, 0xdc87

    :goto_1a
    const v3, 0xdc98

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_17

    goto :goto_1a

    :sswitch_43
    const v2, 0xdca6

    goto :goto_1a

    :sswitch_44
    const v1, 0xdd03

    :goto_1b
    const v3, 0xdd14

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_18

    goto :goto_1b

    :sswitch_45
    if-eqz v8, :cond_10

    const v1, 0x170090

    goto :goto_1b

    :cond_10
    :sswitch_46
    const v1, 0xdd41

    goto :goto_1b

    :sswitch_47
    const/4 v1, 0x2

    :goto_1c
    :sswitch_48
    const v2, 0x1700af

    :goto_1d
    const v3, 0x1700c0

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_19

    goto :goto_1d

    :cond_11
    :sswitch_49
    const v2, 0x1700ed

    goto :goto_1d

    :sswitch_4a
    if-eqz p1, :cond_11

    const v2, 0x17010c

    goto :goto_1d

    :sswitch_4b
    const v2, 0x17012b

    :goto_1e
    const v3, 0x17013c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1e

    :sswitch_4c
    if-eqz v8, :cond_12

    const v2, 0x170188

    goto :goto_1e

    :cond_12
    :sswitch_4d
    const v2, 0x170169

    goto :goto_1e

    :sswitch_4e
    const v2, 0x1701a7

    :goto_1f
    const v3, 0x1701b8

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1b

    goto :goto_1f

    :sswitch_4f
    const/4 v2, 0x1

    if-eq v1, v2, :cond_13

    const v2, 0x17048f

    goto :goto_1f

    :cond_13
    :sswitch_50
    const v2, 0x170470

    goto :goto_1f

    :sswitch_51
    const/4 v1, 0x2

    :sswitch_52
    const v2, 0x1704ae

    :goto_20
    const v3, 0x1704bf

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1c

    goto :goto_20

    :sswitch_53
    if-eqz v0, :cond_14

    const v2, 0x17050b

    goto :goto_20

    :cond_14
    :sswitch_54
    const v2, 0x1704ec

    goto :goto_20

    :sswitch_55
    invoke-static {v0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣۦۨۡ(Ljava/lang/Object;)I

    move-result v3

    const v2, 0x17052a

    :goto_21
    const v8, 0x17053b

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_1d

    goto :goto_21

    :sswitch_56
    const/4 v2, 0x2

    if-ne v3, v2, :cond_15

    const v2, 0x170812

    goto :goto_21

    :cond_15
    :sswitch_57
    const v2, 0x170568

    goto :goto_21

    :sswitch_58
    const v2, 0x170831

    :goto_22
    const v3, 0x170842

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1e

    goto :goto_22

    :cond_16
    :sswitch_59
    const v2, 0x17086f

    goto :goto_22

    :sswitch_5a
    const/4 v2, 0x1

    if-ne v1, v2, :cond_16

    const v2, 0x17088e

    goto :goto_22

    :sswitch_5b
    invoke-static {v0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۥ۟ۨۧ(Ljava/lang/Object;)J

    move-result-wide v8

    const v2, 0x1708ad

    :goto_23
    const v3, 0x1708be

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1f

    goto :goto_23

    :sswitch_5c
    cmp-long v2, v12, v8

    if-gez v2, :cond_17

    const v2, 0x17090a

    goto :goto_23

    :cond_17
    :sswitch_5d
    const v2, 0x1708eb

    goto :goto_23

    :sswitch_5e
    const/4 v3, 0x3

    const v1, 0x170929

    :goto_24
    const v2, 0x17093a

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_20

    goto :goto_24

    :sswitch_5f
    const v1, 0x170bd3

    goto :goto_24

    :sswitch_60
    move v3, v1

    :sswitch_61
    new-instance v1, Ly3/j;

    const/4 v2, 0x1

    invoke-direct/range {v1 .. v7}, Ly3/j;-><init>(IIJJ)V

    const v2, 0x170c30

    :goto_25
    const v3, 0x170c41

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_21

    goto :goto_25

    :cond_18
    :sswitch_62
    const v2, 0x170c6e

    goto :goto_25

    :sswitch_63
    if-eqz v0, :cond_18

    const v2, 0x170c8d

    goto :goto_25

    :sswitch_64
    invoke-static {v0, v1}, Lh/۟ۡۥۡۧ;->۟۟ۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v2

    const v0, 0x170cac

    :goto_26
    const v3, 0x170cbd

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_22

    goto :goto_26

    :sswitch_65
    if-nez v2, :cond_19

    const v0, 0x170f94

    goto :goto_26

    :cond_19
    :sswitch_66
    const v0, 0x170cea

    goto :goto_26

    :sswitch_67
    :try_start_6
    invoke-static {v1, v11}, Lg0/۟ۥۢۥۢ;->ۣ۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :sswitch_68
    :try_start_7
    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۣ۟۟ۧ۟()La4/q;

    monitor-exit v10

    goto/16 :goto_4

    :catch_1
    move-exception v0

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۣ۟۟ۧ۟()La4/q;

    monitor-exit v10

    goto/16 :goto_4

    :sswitch_69
    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۣ۟۟ۧ۟()La4/q;

    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_4

    :catch_2
    move-exception v0

    const v0, 0x170fb3

    :goto_27
    const v1, 0x170fc4

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_23

    goto :goto_27

    :sswitch_6a
    const v0, 0x170fd2

    goto :goto_27

    :sswitch_6b
    move v1, v2

    goto/16 :goto_1c

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
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_f
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_69
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_17
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_69
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_21
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_22
        0x2f -> :sswitch_2a
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_2a
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_29
        0x2d -> :sswitch_31
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2e
        0x32 -> :sswitch_2f
        0x4c -> :sswitch_30
        0x53 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_3f
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_37
        0x55 -> :sswitch_3f
        0x74 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_39
        0x2d -> :sswitch_3d
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3e
        0x36 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_40
        0x5bb -> :sswitch_41
        0x5d8 -> :sswitch_44
        0x5f9 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_43
        0x3e -> :sswitch_48
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_45
        0x36 -> :sswitch_46
        0x55 -> :sswitch_6b
        0x17dd84 -> :sswitch_47
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_49
        0x2d -> :sswitch_52
        0x6f -> :sswitch_4a
        0x1cc -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4c
        0x55 -> :sswitch_52
        0x76 -> :sswitch_4d
        0xb4 -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_4f
        0x537 -> :sswitch_51
        0x5c8 -> :sswitch_52
        0x5e9 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_53
        0x53 -> :sswitch_60
        0x72 -> :sswitch_54
        0x1b4 -> :sswitch_55
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_56
        0x53 -> :sswitch_60
        0x72 -> :sswitch_57
        0xd29 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_59
        0x2d -> :sswitch_60
        0x73 -> :sswitch_5a
        0xcc -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5c
        0x55 -> :sswitch_60
        0x72 -> :sswitch_5d
        0x1b4 -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_5f
        0x2e9 -> :sswitch_61
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_62
        0x2f -> :sswitch_67
        0x71 -> :sswitch_63
        0xcc -> :sswitch_64
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_65
        0x57 -> :sswitch_68
        0x76 -> :sswitch_66
        0x329 -> :sswitch_67
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_68
        0x77 -> :sswitch_6a
    .end sparse-switch
.end method

.method public static ۤ۠ۢۡ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۥ۠ۥ()I

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
    sget-object v0, Ly3/k;->short:[S

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
