.class public final Lk6/h7;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public a:J

.field public b:J

.field public final c:Lk6/f6;

.field public final d:Lk6/d7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/h7;->short:[S

    return-void

    :array_0
    .array-data 2
        0xbd6s
        0xbe6s
        0xbf7s
        0xbe0s
        0xbe0s
        0xbebs
        0xba5s
        0xbe0s
        0xbfds
        0xbf5s
        0xbeas
        0xbf6s
        0xbe0s
        0xbe1s
        0xba5s
        0xbe3s
        0xbeas
        0xbf7s
        0xba5s
        0xbe9s
        0xbe0s
        0xbf6s
        0xbf6s
        0xba5s
        0xbf1s
        0xbeds
        0xbe4s
        0xbebs
        0xba5s
        0xbb4s
        0xbb5s
        0xbb5s
        0xbb5s
        0xba5s
        0xbe8s
        0xbf6s
        0xbabs
        0xba5s
        0xbc0s
        0xbf3s
        0xbe0s
        0xbebs
        0xbf1s
        0xba5s
        0xbebs
        0xbeas
        0xbf1s
        0xba5s
        0xbf6s
        0xbe0s
        0xbebs
        0xbf1s
        0xbabs
        0xba5s
        0xbf1s
        0xbecs
        0xbe8s
        0xbe0s
        0x863s
        0x854s
        0x852s
        0x85es
        0x843s
        0x855s
        0x858s
        0x85fs
        0x856s
        0x811s
        0x844s
        0x842s
        0x854s
        0x843s
        0x811s
        0x854s
        0x85fs
        0x856s
        0x850s
        0x856s
        0x854s
        0x85cs
        0x854s
        0x85fs
        0x845s
        0x81ds
        0x811s
        0x85cs
        0x842s
        0xadfs
        0xae5s
        0xaf4s
        0x9a5s
        0x9b1s
        0x9b0s
        0x9abs
        0xcc0s
        0xcfas
    .end array-data
.end method

.method public constructor <init>(Lk6/d7;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/h7;->d:Lk6/d7;

    new-instance v1, Lk6/f6;

    invoke-static {p1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v0, v2}, Lk6/f6;-><init>(Ljava/lang/Object;Lk6/f5;I)V

    iput-object v1, p0, Lk6/h7;->c:Lk6/f6;

    invoke-static {p1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v0

    iput-wide v0, p0, Lk6/h7;->a:J

    iput-wide v0, p0, Lk6/h7;->b:J

    invoke-static {}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۣۣۧۨ()I

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
    const-string v0, "tLtPrQmmGClhQMJcUj"

    invoke-static {v0}, Lcom/google/firebase/ktx/ۨۢۤۧ;->۟۠ۦۦۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۣۨۨۢ()[S
    .locals 2

    invoke-static {}, Lf/۟ۤۧ۠ۡ;->ۣۥۤ()I

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
    sget-object v0, Lk6/h7;->short:[S

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
.method public final a(ZZJ)Z
    .locals 9

    invoke-static {p0}, Landroid/support/v4/app/ۥۣۡ;->ۤ۠ۡۨ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v3}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    invoke-static {}, Ld1/ۣۣ۟ۢۨ;->ۢ۟ۦۧ()Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->ۤۤۢۧ()Lk6/x3;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

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
    invoke-static {v3}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lt2/۟ۦۣۡۤ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v3}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {v3}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    invoke-static {v1}, Ldagger/hilt/android/internal/ۣۧۨۨ;->۟۠ۢۤۦ(Ljava/lang/Object;)Lk6/p4;

    move-result-object v0

    invoke-static {v0, v4, v5}, Lt8/ۦۣ۠;->ۣۡ۟ۨ(Ljava/lang/Object;J)V

    :sswitch_9
    const-wide/16 v0, 0x1d

    add-long/2addr v0, p3

    invoke-static {p0}, Lv0/ۣ۟۟ۤۧ;->ۨۡ۠ۧ(Ljava/lang/Object;)J

    move-result-wide v4

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x1d

    sub-long/2addr v0, v4

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v2, 0xbebd

    goto :goto_3

    :sswitch_b
    if-nez p1, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_c
    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_d
    const v2, 0xbf39

    goto :goto_4

    :sswitch_e
    const-wide/16 v4, 0x3e8

    cmp-long v2, v0, v4

    if-gez v2, :cond_4

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_f
    invoke-static {v3}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v2

    invoke-static {v0, v1}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {}, Lk6/h7;->ۣۨۨۢ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lz1/۟ۦ۟۠۟;->ۢۥۦۢ:I

    xor-int/lit16 v4, v4, -0x337

    const/16 v5, 0xb85

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟۟ۡۢۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_5
    return v0

    :sswitch_10
    const v2, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    if-nez p2, :cond_5

    const v2, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_12
    const v2, 0xc240

    goto :goto_6

    :sswitch_13
    const-wide/16 v0, 0x17

    sub-long v0, p3, v0

    invoke-static {p0}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۣۣۣۡ(Ljava/lang/Object;)J

    move-result-wide v4

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x17

    add-long/2addr v0, v4

    iput-wide p3, p0, Lk6/h7;->b:J

    :sswitch_14
    invoke-static {v3}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v2

    invoke-static {v0, v1}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v2}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v2

    invoke-static {}, Lk6/h7;->ۣۨۨۢ()[S

    move-result-object v5

    const/16 v6, 0x3a

    sget v7, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣۣۤۤ:I

    xor-int/lit16 v7, v7, -0x1ba

    const/16 v8, 0x831

    invoke-static {v5, v6, v7, v8}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->ۧۨۧۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v4}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lk6/h7;->ۣۨۨۢ()[S

    move-result-object v4

    const/16 v5, 0x57

    sget v6, Lc1/ۢۥۥ۟;->ۣ۠ۡ۟:I

    xor-int/lit16 v6, v6, 0x337

    const/16 v7, 0xa80

    invoke-static {v4, v5, v6, v7}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۣ۟ۨۡۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v0, v1}, Lz7/۠ۡ۟ۦ;->ۥۢۧۥ(Ljava/lang/Object;Ljava/lang/Object;J)V

    invoke-static {v3}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v3}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    xor-int/lit8 v4, v0, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v0, v0, -0x2

    or-int/2addr v0, v4

    invoke-static {v1, v0}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۣ۟ۡ۟۠(Ljava/lang/Object;Z)Lk6/q6;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v2, v1}, Lw6/۟ۥۧۡۨ;->ۨ۠۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Z)V

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_15
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_16
    if-nez p2, :cond_6

    const v0, 0xc2db

    goto :goto_7

    :sswitch_17
    invoke-static {v3}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۣۣ۟ۡ۠(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {}, Lk6/h7;->ۣۨۨۢ()[S

    move-result-object v1

    const/16 v3, 0x5a

    sget v4, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->۟۟ۥۢۡ:I

    xor-int/lit16 v4, v4, -0x326

    const/16 v5, 0x9c4

    invoke-static {v1, v3, v4, v5}, Lw6/۟ۥۧۡۨ;->۠ۤۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lk6/h7;->ۣۨۨۢ()[S

    move-result-object v3

    const/16 v4, 0x5e

    sget v5, Landroidx/annotation/۟ۥۥۣۨ;->۟ۧۦۣۦ:I

    xor-int/lit16 v5, v5, -0x244

    const/16 v6, 0xc9f

    invoke-static {v3, v4, v5, v6}, Ld7/ۢۧۧۢ;->ۧۡۢ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3, v2}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۣۡ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_18
    iput-wide p3, p0, Lk6/h7;->a:J

    invoke-static {p0}, Lf/ۣ۟ۤۤ;->ۣ۟ۢۦ(Ljava/lang/Object;)Lk6/f6;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۥۣ۟ۢ(Ljava/lang/Object;)V

    const-wide/32 v2, 0x36edda

    sget v1, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣۧۡۨ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Le1/۟ۢ۟ۤۡ;->۟ۡ۟ۤۧ(Ljava/lang/Object;J)V

    const/4 v0, 0x1

    goto/16 :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
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
        0x2d -> :sswitch_10
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_18
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch
.end method
