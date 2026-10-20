.class public final Lk6/p6;
.super Lk6/p2;


# static fields
.field private static final short:[S


# instance fields
.field public volatile c:Lk6/q6;

.field public volatile d:Lk6/q6;

.field public e:Lk6/q6;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public g:Landroid/app/Activity;

.field public volatile h:Z

.field public volatile i:Lk6/q6;

.field public j:Lk6/q6;

.field public k:Z

.field public final l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/p6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x598s
        0x5bas
        0x5ads
        0x5b0s
        0x5afs
        0x5b0s
        0x5ads
        0x5a0s
        0xba3s
        0xbd1s
        0x5eas
        0x5e6s
        0x5e4s
        0x5a7s
        0x5ees
        0x5e6s
        0x5e6s
        0x5ees
        0x5e5s
        0x5ecs
        0x5a7s
        0x5e8s
        0x5f9s
        0x5f9s
        0x5d6s
        0x5e4s
        0x5ecs
        0x5e8s
        0x5fas
        0x5fcs
        0x5fbs
        0x5ecs
        0x5e4s
        0x5ecs
        0x5e7s
        0x5fds
        0x5a7s
        0x5fas
        0x5eas
        0x5fbs
        0x5ecs
        0x5ecs
        0x5e7s
        0x5d6s
        0x5fas
        0x5ecs
        0x5fbs
        0x5ffs
        0x5e0s
        0x5eas
        0x5ecs
        0x284s
        0x28bs
        0x287s
        0x28fs
        0xb0fs
        0xb18s
        0xb1bs
        0xb18s
        0xb0fs
        0xb0fs
        0xb18s
        0xb0fs
        0xb22s
        0xb13s
        0xb1cs
        0xb10s
        0xb18s
        0x30as
        0x307s
        0x702s
        0x72ds
        0x733s
        0x4bbs
        0x494s
        0x487s
        0x499s
        0x4b6s
        0x4afs
        0x992s
        0x9a0s
        0x9bes
        0x9b9s
        0x3ads
        0x3bcs
        0x3bcs
        0x612s
        0x606s
        0x607s
        0x61cs
        0xa9bs
        0xab2s
        0xab7s
    .end array-data
.end method

.method public constructor <init>(Lk6/f5;)V
    .locals 2

    invoke-direct {p0, p1}, Lk6/p2;-><init>(Lk6/f5;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk6/p6;->l:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lk6/p6;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lfa/ۢۤۢ۟;->۟ۦۣۢۨ()I

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
    const-string v0, "ggNZWz4Dsja38R9vWzM"

    invoke-static {v0}, Ll2/ۦۣ۠ۥ;->ۥۧۡۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۧۧۦۡ()[S
    .locals 2

    invoke-static {}, Lm4/۟ۧۤ۠;->ۨ۟ۦ۟()I

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
    sget-object v0, Lk6/p6;->short:[S

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
.method public final A(Lk6/q6;ZJ)V
    .locals 7

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۧۡ۟ۨ(Ljava/lang/Object;)Lk6/q;

    move-result-object v2

    invoke-static {p0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۧ۟ۡ(Ljava/lang/Object;J)V

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
    invoke-static {p1}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۣۧۢۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    move v0, v1

    :sswitch_8
    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۡۡ۠ۡ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v2

    invoke-static {v2}, Lp8/۟۟ۢ۟ۢ;->ۣۣ۠ۥ(Ljava/lang/Object;)Lk6/h7;

    move-result-object v2

    invoke-static {v2, v0, p2, p3, p4}, Lw4/ۥۧۡۥ;->ۣۧۤ۟(Ljava/lang/Object;ZZJ)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz p1, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_e
    iput-boolean v1, p1, Lk6/q6;->d:Z

    :sswitch_f
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
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
        0x16 -> :sswitch_c
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch
.end method

.method public final B(Landroid/app/Activity;)Lk6/q6;
    .locals 6

    invoke-static {p1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۣ۟ۢۢۨ(Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0, p1}, Lx2/۟ۢۥ;->۟ۦۦۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/q6;

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
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Lk6/q6;

    const/4 v1, 0x0

    invoke-static {p1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->۟ۥۢۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v3

    invoke-static {v3}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۥۥۧ۟(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-direct {v0, v1, v2, v4, v5}, Lk6/q6;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۣ۟ۢۢۨ(Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۟ۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_3
    invoke-static {p0}, Le0/ۦۣ۟۠;->۟۠ۤۡ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {p0}, Le0/ۦۣ۟۠;->۟۠ۤۡ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    :sswitch_7
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public final u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v(Ljava/lang/Class;)Ljava/lang/String;
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x0

    invoke-static {p1}, Lea/ۦۦۨۨ;->۟ۢۤۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v0

    sget v1, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣ۟۠۠ۧ:I

    xor-int/lit16 v1, v1, 0x109

    const/16 v2, 0x5d9

    invoke-static {v0, v5, v1, v2}, Lc3/۟ۡۧۢۥ;->۟ۡۦۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    :sswitch_3
    return-object v0

    :sswitch_4
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v0

    const/16 v2, 0x8

    sget v3, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->۟ۢۢۤۦ:I

    xor-int/lit16 v3, v3, -0x14a

    const/16 v4, 0xbff

    invoke-static {v0, v2, v3, v4}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۟ۥ۟۠ۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/ۥۣۡۡ;->ۣ۟ۧۤۨ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-lez v2, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    array-length v0, v1

    sget v2, Lt3/ۣ۟ۧۡ;->۟ۦ۟ۤ۟:I

    xor-int/lit16 v2, v2, -0x208

    add-int/2addr v0, v2

    aget-object v0, v1, v0

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v1, 0xbe22

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v0

    :sswitch_a
    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {v1, v6}, Ls0/ۧۧۨۥ;->۟ۨۤۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    const v1, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_b
    const v1, 0xbebd

    goto :goto_4

    :sswitch_c
    if-le v2, v3, :cond_2

    const v1, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {v1, v6}, Ls0/ۧۧۨۥ;->۟ۨۤۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v5, v1}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->۠ۥ۟۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

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
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_3
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method public final w(Z)Lk6/q6;
    .locals 2

    invoke-static {p0}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

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
    invoke-static {p0}, Lk1/ۨ۟ۧۡ;->ۣ۟ۢۧ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    :goto_1
    :sswitch_3
    return-object v0

    :sswitch_4
    invoke-static {p0}, Lk1/ۨ۟ۧۡ;->ۣ۟ۢۧ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-eqz v0, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lz3/۟ۡ۠ۦۣ;->۟ۦۣۧۤ(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    goto :goto_1

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
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_3
    .end sparse-switch
.end method

.method public final x(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    invoke-static {p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez p2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v0

    const/16 v1, 0xa

    sget v2, Lf0/ۣۤ۠۟;->۟ۧۦۥ:I

    xor-int/lit16 v2, v2, 0x165

    const/16 v3, 0x589

    invoke-static {v0, v1, v2, v3}, Lu1/۟ۧۥۢ۠;->ۨۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->۟ۦ۠۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    new-instance v0, Lk6/q6;

    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v3, 0x33

    sget v4, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۡ۠۟ۦ:I

    xor-int/lit16 v4, v4, -0xaa

    const/16 v5, 0x2ea

    invoke-static {v2, v3, v4, v5}, Lv6/۟ۦۨۦۣ;->۟ۥۡۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۡۤۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v3

    const/16 v4, 0x37

    sget v5, Landroid/support/v4/app/ۥۣۡ;->ۣ۟ۤۡۥ:I

    xor-int/lit16 v5, v5, 0x2fe

    const/16 v6, 0xb7d

    invoke-static {v3, v4, v5, v6}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۣ۠۠۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۡۤۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v4

    const/16 v5, 0x44

    sget v6, Lv6/۟ۦۨۦۣ;->۟ۥۧۥۧ:I

    xor-int/lit16 v6, v6, -0xbc

    const/16 v7, 0x363

    invoke-static {v4, v5, v6, v7}, Ld8/ۣۡۡ۠;->ۣۢۡۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۤۢۡۥ(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lk6/q6;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۣ۟ۢۢۨ(Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۟ۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public final y(Landroid/app/Activity;Lk6/q6;Z)V
    .locals 9

    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->۟ۥۦ۟ۧ(Ljava/lang/Object;)Lk6/q6;

    move-result-object v1

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lw1/ۦۣۦۧ;->۟ۦۢۧ۟(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    move-object v8, v0

    :goto_1
    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_2

    :sswitch_4
    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->۟ۥۦ۟ۧ(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    const v1, 0xbe22

    goto :goto_3

    :sswitch_6
    move-object v8, v0

    goto :goto_1

    :sswitch_7
    invoke-static {p2}, Lt7/۟ۡ۠ۨ۟;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_1
    :sswitch_8
    const v0, 0xbebd

    goto :goto_4

    :sswitch_9
    if-nez v1, :cond_1

    const v0, 0xbedc

    goto :goto_4

    :sswitch_a
    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v0, 0xbf39

    goto :goto_5

    :sswitch_c
    if-eqz p1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_d
    invoke-static {p1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->۟ۥۢۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :sswitch_e
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v0, 0xc221

    goto :goto_6

    :sswitch_10
    const/4 v2, 0x0

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_11
    const v0, 0xc29d

    goto :goto_7

    :sswitch_12
    new-instance v0, Lk6/q6;

    invoke-static {p2}, Ld2/۟ۦۡ۟ۦ;->ۣ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lw5/ۣۨۧ۠;->ۥ۟ۡ(Ljava/lang/Object;)J

    move-result-wide v3

    invoke-static {p2}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۧ۟ۢ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {p2}, Ll9/۟ۦۥۣۢ;->ۡ۠ۢۨ(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lk6/q6;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_14
    move-object v2, v0

    :goto_9
    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->۟ۥۦ۟ۧ(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    iput-object v0, p0, Lk6/p6;->d:Lk6/q6;

    iput-object v2, p0, Lk6/p6;->c:Lk6/q6;

    invoke-static {p0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v4

    invoke-static {p0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v7

    new-instance v0, Lk6/j6;

    move-object v1, p0

    move-object v3, v8

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lk6/j6;-><init>(Lk6/p6;Lk6/q6;Lk6/q6;JZ)V

    invoke-static {v7, v0}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_15
    move-object v2, p2

    goto :goto_9

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_15
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_e
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_14
    .end sparse-switch
.end method

.method public final z(Lk6/q6;Lk6/q6;JZLandroid/os/Bundle;)V
    .locals 15

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    const/4 v3, 0x0

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
    if-eqz p2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static/range {p1 .. p1}, Lw5/ۣۨۧ۠;->ۥ۟ۡ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static/range {p2 .. p2}, Lw5/ۣۨۧ۠;->ۥ۟ۡ(Ljava/lang/Object;)J

    move-result-wide v6

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    cmp-long v2, v6, v4

    if-nez v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static/range {p2 .. p2}, Lt7/۟ۡ۠ۨ۟;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lt7/۟ۡ۠ۨ۟;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lr/۠ۡ۠;->ۡۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v4, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static/range {p2 .. p2}, Ld2/۟ۦۡ۟ۦ;->ۣ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Ld2/۟ۦۡ۟ۦ;->ۣ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lr/۠ۡ۠;->ۡۡۡۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v4, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    const/4 v2, 0x1

    :sswitch_d
    const v4, 0xc27e

    :goto_5
    const v5, 0xc28f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5

    goto :goto_5

    :cond_4
    :sswitch_e
    const v4, 0xc2bc

    goto :goto_5

    :sswitch_f
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_10
    const/4 v2, 0x0

    const v4, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_6

    goto :goto_6

    :sswitch_11
    const v4, 0xc221

    goto :goto_6

    :sswitch_12
    if-eqz p5, :cond_4

    const v4, 0xc2db

    goto :goto_5

    :sswitch_13
    invoke-static {p0}, Lk1/ۨ۟ۧۡ;->ۣ۟ۢۧ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v5

    const v4, 0xc2fa

    :goto_7
    const v6, 0xc30b

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_7

    goto :goto_7

    :sswitch_14
    if-eqz v5, :cond_5

    const v4, 0xc5e2

    goto :goto_7

    :cond_5
    :sswitch_15
    const v4, 0xc5c3

    goto :goto_7

    :sswitch_16
    const/4 v3, 0x1

    move v8, v3

    :goto_8
    const v3, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    if-eqz v2, :cond_6

    const v3, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_18
    const v3, 0xc63f

    goto :goto_9

    :sswitch_19
    new-instance v5, Landroid/os/Bundle;

    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :cond_7
    :sswitch_1a
    const v2, 0xc6bb

    goto :goto_a

    :sswitch_1b
    if-eqz p6, :cond_7

    const v2, 0xc965

    goto :goto_a

    :sswitch_1c
    move-object/from16 v0, p6

    invoke-direct {v5, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :pswitch_0
    const v2, 0xc984

    :goto_b
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :sswitch_1d
    const v2, 0xc9a3

    goto :goto_b

    :sswitch_1e
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const v2, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_1
    goto :goto_c

    :pswitch_2
    const v2, 0xca1f

    goto :goto_c

    :sswitch_1f
    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v5, v2}, Lw6/۟ۥۧۡۨ;->ۨ۠۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Z)V

    const v2, 0xca7c

    :goto_d
    const v3, 0xca8d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :sswitch_20
    if-eqz p2, :cond_8

    const v2, 0xcd64

    goto :goto_d

    :cond_8
    :sswitch_21
    const v2, 0xcd45

    goto :goto_d

    :sswitch_22
    invoke-static/range {p2 .. p2}, Ld2/۟ۦۡ۟ۦ;->ۣ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v2, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_c

    goto :goto_e

    :sswitch_23
    if-eqz v3, :cond_9

    const v2, 0xcde0

    goto :goto_e

    :cond_9
    :sswitch_24
    const v2, 0xcdc1

    goto :goto_e

    :sswitch_25
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v4, 0x46

    sget v6, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۡۥۧ:I

    xor-int/lit16 v6, v6, -0x23d

    const/16 v7, 0x75d

    invoke-static {v2, v4, v6, v7}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟۠ۤۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2, v3}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣۣ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_26
    invoke-static/range {p2 .. p2}, Lt7/۟ۡ۠ۨ۟;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v2, 0xcdff

    :goto_f
    const v4, 0xce10

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :cond_a
    :sswitch_27
    const v2, 0xce3d

    goto :goto_f

    :sswitch_28
    if-eqz v3, :cond_a

    const v2, 0xd0e7

    goto :goto_f

    :sswitch_29
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v4, 0x49

    sget v6, Lz1/۟ۦ۟۠۟;->ۢۥۦۢ:I

    xor-int/lit16 v6, v6, -0x310

    const/16 v7, 0x4e4

    invoke-static {v2, v4, v6, v7}, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->ۡۦۦۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2, v3}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣۣ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_2a
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v3, 0x4c

    sget v4, Ly6/۟ۢ۟ۥۤ;->ۣ۟ۥۣۢ:I

    xor-int/lit16 v4, v4, 0x24c

    const/16 v6, 0x4c6

    invoke-static {v2, v3, v4, v6}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣ۟ۨ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lw5/ۣۨۧ۠;->ۥ۟ۡ(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-static {v5, v2, v6, v7}, Lz7/۠ۡ۟ۦ;->ۥۢۧۥ(Ljava/lang/Object;Ljava/lang/Object;J)V

    :sswitch_2b
    const v2, 0xd106

    :goto_10
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_10

    :sswitch_2c
    if-eqz v8, :cond_b

    const v2, 0xd163

    goto :goto_10

    :cond_b
    :sswitch_2d
    const v2, 0xd144

    goto :goto_10

    :sswitch_2e
    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۡۡ۠ۡ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v2

    invoke-static {v2}, Lp8/۟۟ۢ۟ۢ;->ۣۣ۠ۥ(Ljava/lang/Object;)Lk6/h7;

    move-result-object v2

    const-wide/16 v6, 0x1d

    add-long v6, v6, p3

    invoke-static {v2}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۣۣۣۡ(Ljava/lang/Object;)J

    move-result-wide v10

    sub-long/2addr v6, v10

    const-wide/16 v10, 0x1d

    sub-long/2addr v6, v10

    move-wide/from16 v0, p3

    iput-wide v0, v2, Lk6/h7;->b:J

    const v2, 0xd182

    :goto_11
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_11

    :sswitch_2f
    const-wide/16 v2, 0x0

    cmp-long v2, v6, v2

    if-lez v2, :cond_c

    const v2, 0xd1df

    goto :goto_11

    :cond_c
    :sswitch_30
    const v2, 0xd1c0

    goto :goto_11

    :sswitch_31
    invoke-static {p0}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v2

    invoke-static {v2, v5, v6, v7}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۡۨۢ۟(Ljava/lang/Object;Ljava/lang/Object;J)V

    :sswitch_32
    invoke-static {p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v2

    invoke-static {v2}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xd1fe

    :goto_12
    const v4, 0xd20f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_10

    goto :goto_12

    :sswitch_33
    if-nez v3, :cond_d

    const v2, 0xd4e6

    goto :goto_12

    :cond_d
    :sswitch_34
    const v2, 0xd4c7

    goto :goto_12

    :sswitch_35
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v3, 0x4f

    sget v4, Lc0/ۦۢۦۥ;->۟۟ۥۡۦ:I

    xor-int/lit16 v4, v4, 0x2b5

    const/16 v6, 0x9cd

    invoke-static {v2, v3, v4, v6}, Lp5/۟ۡۧۡۨ;->۠ۢۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v6, 0x3ae

    sget v3, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->۟ۧۡۡۥ:I

    int-to-long v10, v3

    xor-long/2addr v6, v10

    invoke-static {v5, v2, v6, v7}, Lz7/۠ۡ۟ۦ;->ۥۢۧۥ(Ljava/lang/Object;Ljava/lang/Object;J)V

    :sswitch_36
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۧ۟ۢ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xd505

    :goto_13
    const v4, 0xd516

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_11

    goto :goto_13

    :sswitch_37
    if-eqz v3, :cond_e

    const v2, 0xd562

    goto :goto_13

    :cond_e
    :sswitch_38
    const v2, 0xd543

    goto :goto_13

    :sswitch_39
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v3, 0x53

    sget v4, Ln8/ۢۡۨۨ;->۠۟ۢۦ:I

    xor-int/lit16 v4, v4, -0xb9

    const/16 v6, 0x3cc

    invoke-static {v2, v3, v4, v6}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۢۨۡۢ([SIII)Ljava/lang/String;

    move-result-object v3

    :sswitch_3a
    const v2, 0xd581

    :goto_14
    const v4, 0xd592

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_12

    goto :goto_14

    :sswitch_3b
    const v2, 0xd5a0

    goto :goto_14

    :sswitch_3c
    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v2

    const/16 v3, 0x56

    sget v4, Lea/۟ۦۢۦۤ;->ۢۢۨۥ:I

    xor-int/lit16 v4, v4, -0x14f

    const/16 v6, 0x673

    invoke-static {v2, v3, v4, v6}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۡ۟ۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    const v2, 0xd888

    :goto_15
    const v4, 0xd899

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_13

    goto :goto_15

    :sswitch_3d
    const v2, 0xd8a7

    goto :goto_15

    :sswitch_3e
    invoke-static {p0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v2

    check-cast v2, Le6/c;

    invoke-static {v2}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v10

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۧ۟ۢ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xd904

    :goto_16
    const v6, 0xd915

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_14

    goto :goto_16

    :sswitch_3f
    if-eqz v4, :cond_f

    const v2, 0xd961

    goto :goto_16

    :cond_f
    :sswitch_40
    const v2, 0xd942

    goto :goto_16

    :sswitch_41
    invoke-static/range {p1 .. p1}, Ll9/۟ۦۥۣۢ;->ۡ۠ۢۨ(Ljava/lang/Object;)J

    move-result-wide v6

    const v2, 0xd980

    :goto_17
    const v4, 0xd991

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_15

    goto :goto_17

    :sswitch_42
    const-wide/16 v12, 0x0

    cmp-long v2, v6, v12

    if-eqz v2, :cond_10

    const v2, 0xdc68

    goto :goto_17

    :cond_10
    :sswitch_43
    const v2, 0xdc49

    goto :goto_17

    :sswitch_44
    const v2, 0xdc87

    :goto_18
    const v4, 0xdc98

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_16

    goto :goto_18

    :sswitch_45
    const v2, 0xdca6

    goto :goto_18

    :sswitch_46
    move-wide v6, v10

    :sswitch_47
    invoke-static {p0}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۣۣ۟ۡ۠(Ljava/lang/Object;)Lk6/y5;

    move-result-object v2

    invoke-static {}, Lk6/p6;->ۧۧۦۡ()[S

    move-result-object v4

    const/16 v9, 0x5a

    sget v10, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣۨ۠ۥ:I

    xor-int/lit16 v10, v10, 0x32a

    const/16 v11, 0xac4

    invoke-static {v4, v9, v10, v11}, Lh0/۟ۥ۟ۡۦ;->ۣۨ۟۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {v2 .. v7}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۣ۟۟ۡۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;J)V

    :sswitch_48
    const v2, 0xdd03

    :goto_19
    const v3, 0xdd14

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_17

    goto :goto_19

    :sswitch_49
    if-eqz v8, :cond_11

    const v2, 0x170090

    goto :goto_19

    :cond_11
    :sswitch_4a
    const v2, 0xdd41

    goto :goto_19

    :sswitch_4b
    invoke-static {p0}, Lk1/ۨ۟ۧۡ;->ۣ۟ۢۧ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v2

    const/4 v3, 0x1

    move-wide/from16 v0, p3

    invoke-static {p0, v2, v3, v0, v1}, Ls0/ۢۨۦ۟;->ۣ۟ۢۥۡ(Ljava/lang/Object;Ljava/lang/Object;ZJ)V

    :sswitch_4c
    move-object/from16 v0, p1

    iput-object v0, p0, Lk6/p6;->e:Lk6/q6;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۧ۟ۢ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0x1700af

    :goto_1a
    const v4, 0x1700c0

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_18

    goto :goto_1a

    :cond_12
    :sswitch_4d
    const v2, 0x1700ed

    goto :goto_1a

    :sswitch_4e
    if-eqz v3, :cond_12

    const v2, 0x17010c

    goto :goto_1a

    :sswitch_4f
    move-object/from16 v0, p1

    iput-object v0, p0, Lk6/p6;->j:Lk6/q6;

    :sswitch_50
    invoke-static {p0}, Lr1/۟ۤۤۡ۠;->۟ۧ۟۠۠(Ljava/lang/Object;)Lk6/s6;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v2}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    new-instance v3, Ll/h;

    sget v4, Le2/ۨۥۦۡ;->۟۠ۢۢۧ:I

    xor-int/lit16 v4, v4, 0x213

    move-object/from16 v0, p1

    invoke-direct {v3, v4, v2, v0}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lh6/ۧۧۤ۟;->۟ۦۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v3

    const v2, 0x17012b

    :goto_1b
    const v4, 0x17013c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_19

    goto :goto_1b

    :sswitch_51
    if-ltz v3, :cond_13

    const v2, 0x170188

    goto :goto_1b

    :cond_13
    :sswitch_52
    const v2, 0x170169

    goto :goto_1b

    :sswitch_53
    const-string v2, "KBUrMGQW"

    invoke-static {v2}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۨۡۥۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_54
    return-void

    :sswitch_55
    move v8, v3

    goto/16 :goto_8

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
        0x1d7 -> :sswitch_c
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
        0x2d -> :sswitch_10
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x12 -> :sswitch_e
        0x33 -> :sswitch_55
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_55
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_48
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1e
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_21
        0x7c8 -> :sswitch_2b
        0x7e9 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_23
        0x36 -> :sswitch_24
        0x55 -> :sswitch_26
        0x74 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_27
        0x2d -> :sswitch_2a
        0x3ef -> :sswitch_28
        0x1ef7 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_2d
        0x53 -> :sswitch_32
        0x74 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_30
        0x4c -> :sswitch_31
        0x53 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_36
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_38
        0x55 -> :sswitch_3c
        0x74 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3b
        0x32 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_3d
        0x3e -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3f
        0x36 -> :sswitch_40
        0x57 -> :sswitch_46
        0x74 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_42
        0x5bb -> :sswitch_43
        0x5d8 -> :sswitch_46
        0x5f9 -> :sswitch_44
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x1f -> :sswitch_45
        0x3e -> :sswitch_47
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x17 -> :sswitch_49
        0x36 -> :sswitch_4a
        0x55 -> :sswitch_4c
        0x17dd84 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0xe -> :sswitch_4d
        0x2d -> :sswitch_50
        0x6f -> :sswitch_4e
        0x1cc -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x17 -> :sswitch_51
        0x55 -> :sswitch_54
        0x76 -> :sswitch_52
        0xb4 -> :sswitch_53
    .end sparse-switch
.end method
