.class public final Ly3/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIJJ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly3/j;->a:I

    iput p2, p0, Ly3/j;->b:I

    iput-wide p3, p0, Ly3/j;->c:J

    iput-wide p5, p0, Ly3/j;->d:J

    invoke-static {}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->۟ۤۦۧۨ()I

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
    const-string v0, "cXsYratdbTV2j6v"

    invoke-static {v0}, Lv8/۟ۧۢ۟ۢ;->۟۠ۦۤۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static a(Ljava/io/File;)Ly3/j;
    .locals 9

    new-instance v8, Ljava/io/DataInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v8, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    new-instance v1, Ly3/j;

    invoke-static {v8}, Lg8/ۣۣۣ۟;->۟ۤۦۥۤ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v8}, Lg8/ۣۣۣ۟;->۟ۤۦۥۤ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v8}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۡۤۢۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v8}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۡۤۢۨ(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-direct/range {v1 .. v7}, Ly3/j;-><init>(IIJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v8}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۧ۟ۤۦ(Ljava/lang/Object;)V

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-static {v8}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۧ۟ۤۦ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    throw v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-static {v0, v1}, Lv0/۟ۤۧ۠ۧ;->ۣۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final b(Ljava/io/File;)V
    .locals 4

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۧۧ۠ۡ(Ljava/lang/Object;)Z

    new-instance v1, Ljava/io/DataOutputStream;

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_0
    invoke-static {p0}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v1, v0}, Lc1/ۣۡۢۦ;->ۡۨ۟۠(Ljava/lang/Object;I)V

    invoke-static {p0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣۦۨۡ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v1, v0}, Lc1/ۣۡۢۦ;->ۡۨ۟۠(Ljava/lang/Object;I)V

    invoke-static {p0}, Lc1/ۣۡۢۦ;->ۣ۟ۢۥۣ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->۟ۦۣ۠۟(Ljava/lang/Object;J)V

    invoke-static {p0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۥ۟ۨۧ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->۟ۦۣ۠۟(Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Ld7/ۢۧۧۢ;->ۡۢۦۣ(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-static {v1}, Ld7/ۢۧۧۢ;->ۡۢۦۣ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    throw v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-static {v0, v1}, Lv0/۟ۤۧ۠ۧ;->ۣۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne p0, p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p1, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    instance-of v3, p1, Ly3/j;

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v3, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move v0, v1

    :goto_4
    :sswitch_a
    return v0

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    check-cast p1, Ly3/j;

    invoke-static {p0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣۦۨۡ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p1}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣۦۨۡ(Ljava/lang/Object;)I

    move-result v4

    const v2, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-ne v3, v4, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {p0}, Lc1/ۣۡۢۦ;->ۣ۟ۢۥۣ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p1}, Lc1/ۣۡۢۦ;->ۣ۟ۢۥۣ(Ljava/lang/Object;)J

    move-result-wide v6

    const v2, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    cmp-long v2, v4, v6

    if-nez v2, :cond_4

    const v2, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {p0}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p1}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۦ(Ljava/lang/Object;)I

    move-result v4

    const v2, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-ne v3, v4, :cond_5

    const v2, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {p0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۥ۟ۨۧ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p1}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۥ۟ۨۧ(Ljava/lang/Object;)J

    move-result-wide v6

    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    cmp-long v2, v4, v6

    if-nez v2, :cond_6

    const v2, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_17
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_18
    const v1, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    const v1, 0xc620

    goto :goto_9

    :sswitch_1a
    move v0, v1

    goto/16 :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_a
        0xef -> :sswitch_2
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
        0x16 -> :sswitch_d
        0x35 -> :sswitch_1a
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_1a
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_a
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 12

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    const-string v6, "\u06e6\u06e5\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v10

    move v11, v10

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v10, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۧۧۧۧ:I

    const-string v1, "\u06e0\u06e3\u06e3"

    move-object v6, v1

    move v11, v10

    goto :goto_0

    :sswitch_0
    invoke-static {v8, v9}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    const-string v6, "\u06e4\u06e0\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v7, v11, -0x28d

    const-string v1, "\u06e2\u06df\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    aput-object v2, v5, v7

    const-string v1, "\u06e8\u06e5\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    aput-object v4, v5, v7

    const-string v1, "\u06e0\u06e5\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۦ(Ljava/lang/Object;)I

    move-result v10

    const-string v1, "\u06e3\u06e4\u06e1"

    move-object v6, v1

    move v11, v10

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lc1/ۣۡۢۦ;->ۣ۟ۢۥۣ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v1, "\u06e7\u06df\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v6, "\u06df\u06e8\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣۦۨۡ(Ljava/lang/Object;)I

    move-result v10

    const-string v1, "\u06e8\u06e1\u06e6"

    move-object v6, v1

    move v11, v10

    goto :goto_0

    :sswitch_8
    aput-object v0, v5, v7

    const-string v1, "\u06e7\u06e5\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۥ۟ۨۧ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v1, "\u06e2\u06e4\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    invoke-static {v11}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v6, "\u06e7\u06e5\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v7, v11, 0x99

    const-string v1, "\u06e4\u06e4\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    sget v10, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟۠ۦۤ۠:I

    const-string v1, "\u06e8\u06e2\u06e7"

    move-object v6, v1

    move v11, v10

    goto :goto_0

    :sswitch_d
    xor-int/lit16 v7, v11, 0x101

    const-string v1, "\u06df\u06df\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v11}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v6, "\u06e8\u06e3\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_f
    xor-int/lit16 v7, v11, 0xb8

    const-string v1, "\u06e4\u06e8\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_10
    sget v10, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۧ۟ۢ:I

    const-string v1, "\u06e2\u06e5\u06e2"

    move-object v6, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_11
    sget v10, Ld7/۟ۢۧۧ۠;->ۣ۟۠ۢۡ:I

    const-string v1, "\u06e3\u06e6\u06e6"

    move-object v6, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v5}, Lz7/۟ۢۧۡۥ;->ۦۤۡۦ(Ljava/lang/Object;)I

    move-result v10

    const-string v1, "\u06e6\u06df\u06e5"

    move-object v6, v1

    move v11, v10

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v8, v9}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "\u06e4\u06e6\u06df"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_14
    aput-object v3, v5, v7

    const-string v1, "\u06e4\u06e7\u06e3"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_15
    return v11

    :sswitch_data_0
    .sparse-switch
        0x1aa6ff -> :sswitch_2
        0x1aab40 -> :sswitch_f
        0x1aab80 -> :sswitch_10
        0x1ab249 -> :sswitch_8
        0x1ab2df -> :sswitch_0
        0x1ab2ff -> :sswitch_1
        0x1ab6a0 -> :sswitch_e
        0x1ab6e3 -> :sswitch_d
        0x1ab9ea -> :sswitch_6
        0x1aba67 -> :sswitch_14
        0x1aba9d -> :sswitch_4
        0x1abac0 -> :sswitch_11
        0x1abadc -> :sswitch_3
        0x1ac14c -> :sswitch_15
        0x1ac209 -> :sswitch_7
        0x1ac507 -> :sswitch_13
        0x1ac5c2 -> :sswitch_c
        0x1ac5ca -> :sswitch_5
        0x1ac90d -> :sswitch_a
        0x1ac92d -> :sswitch_b
        0x1ac94c -> :sswitch_9
        0x1ac986 -> :sswitch_12
    .end sparse-switch
.end method
