.class public final Lk6/c7;
.super Lk6/m7;


# static fields
.field private static final short:[S


# instance fields
.field public final d:Ljava/util/HashMap;

.field public final e:Lk6/p4;

.field public final f:Lk6/p4;

.field public final g:Lk6/p4;

.field public final h:Lk6/p4;

.field public final i:Lk6/p4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xae

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/c7;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa00s
        0xa0ds
        0xa1fs
        0xa18s
        0xa33s
        0xa08s
        0xa09s
        0xa00s
        0xa09s
        0xa18s
        0xa09s
        0xa33s
        0xa1fs
        0xa18s
        0xa0ds
        0xa00s
        0xa09s
        0xbd6s
        0xbd5s
        0xbd7s
        0xbdfs
        0xbdbs
        0xbd2s
        0xbd2s
        0x75ds
        0x750s
        0x742s
        0x745s
        0x76es
        0x744s
        0x741s
        0x75ds
        0x75es
        0x750s
        0x755s
        0x858s
        0x855s
        0x847s
        0x840s
        0x86bs
        0x841s
        0x844s
        0x858s
        0x85bs
        0x855s
        0x850s
        0x86bs
        0x855s
        0x840s
        0x840s
        0x851s
        0x859s
        0x844s
        0x840s
        0x916s
        0x912s
        0x91fs
        0x915s
        0x912s
        0x91cs
        0x913s
        0x90fs
        0x924s
        0x914s
        0x91ds
        0x91ds
        0x908s
        0x91es
        0x90fs
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc0bs
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc0bs
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc0bs
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc0bs
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0xc16s
        0x7eas
        0x7ffs
        0x7fcs
        0x7fds
        0x797s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x53as
        0x527s
        0x527s
        0x527s
        0x527s
        0x53as
        0x527s
        0x527s
        0x527s
        0x527s
        0x53as
        0x527s
        0x527s
        0x527s
        0x527s
        0x53as
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x527s
        0x24as
        0x271s
        0x27es
        0x27ds
        0x273s
        0x27as
        0x23fs
        0x26bs
        0x270s
        0x23fs
        0x278s
        0x27as
        0x26bs
        0x23fs
        0x27es
        0x27bs
        0x269s
        0x27as
        0x26ds
        0x26bs
        0x276s
        0x26cs
        0x276s
        0x271s
        0x278s
        0x23fs
        0x276s
        0x27bs
    .end array-data
.end method

.method public constructor <init>(Lk6/p7;)V
    .locals 8

    invoke-direct {p0, p1}, Lk6/m7;-><init>(Lk6/p7;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk6/c7;->d:Ljava/util/HashMap;

    invoke-static {p0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lr5/۟ۤۨۥۡ;->۠ۦۦۦ:I

    xor-int/lit8 v3, v3, 0x13

    const/16 v4, 0xa6c

    invoke-static {v1, v2, v3, v4}, Lh5/ۧ۟ۨۧ;->ۢ۟ۡۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, 0x23d

    sget v4, Lv5/ۧۥۢۡ;->ۣۧ۟ۨ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    new-instance v4, Lk6/p4;

    invoke-direct {v4, v0, v1, v2, v3}, Lk6/p4;-><init>(Lk6/l4;Ljava/lang/String;J)V

    iput-object v4, p0, Lk6/c7;->e:Lk6/p4;

    new-instance v0, Lk6/p4;

    invoke-static {p0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v4

    const/16 v5, 0x11

    sget v6, Lh0/۟ۥ۟ۡۦ;->ۢ۟۠ۥ:I

    xor-int/lit16 v6, v6, 0x266

    const/16 v7, 0xbb4

    invoke-static {v4, v5, v6, v7}, Lz7/۠ۡ۟ۦ;->ۧۨۦ۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4, v2, v3}, Lk6/p4;-><init>(Lk6/l4;Ljava/lang/String;J)V

    iput-object v0, p0, Lk6/c7;->f:Lk6/p4;

    new-instance v0, Lk6/p4;

    invoke-static {p0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v4

    const/16 v5, 0x18

    sget v6, Lc1/ۣۢۧۨ;->ۣ۟ۡ۠ۦ:I

    xor-int/lit16 v6, v6, -0x375

    const/16 v7, 0x731

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->۠ۥۤۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4, v2, v3}, Lk6/p4;-><init>(Lk6/l4;Ljava/lang/String;J)V

    iput-object v0, p0, Lk6/c7;->g:Lk6/p4;

    new-instance v0, Lk6/p4;

    invoke-static {p0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v4

    const/16 v5, 0x23

    sget v6, Lu4/ۧۦۦۧ;->ۣۡۤۡ:I

    xor-int/lit16 v6, v6, -0x10c

    const/16 v7, 0x834

    invoke-static {v4, v5, v6, v7}, Ly9/ۨ۠;->ۥۣۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4, v2, v3}, Lk6/p4;-><init>(Lk6/l4;Ljava/lang/String;J)V

    iput-object v0, p0, Lk6/c7;->h:Lk6/p4;

    new-instance v0, Lk6/p4;

    invoke-static {p0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v4

    const/16 v5, 0x36

    sget v6, Ld1/۟۟ۥۡۡ;->ۣ۟ۤ۟۟:I

    xor-int/lit16 v6, v6, 0x225

    const/16 v7, 0x97b

    invoke-static {v4, v5, v6, v7}, Ldagger/hilt/internal/ۡۡۨۦ;->۟ۦۦۦۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v4, v2, v3}, Lk6/p4;-><init>(Lk6/l4;Ljava/lang/String;J)V

    iput-object v0, p0, Lk6/c7;->i:Lk6/p4;

    invoke-static {}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۧۤۧ()I

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
    const-string v0, "Zma2651ZppDmARv233K8zddu5uxl"

    invoke-static {v0}, Lw2/ۧۦۧ;->ۢۨۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۦۢۧۡ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۠ۥۧۢ()I

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
    sget-object v0, Lk6/c7;->short:[S

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

.method public final s(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6

    const/4 v4, 0x1

    invoke-static {p0}, Ld9/ۡۥۣۡ;->ۤۥۢۨ(Ljava/lang/Object;)V

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
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0, p1}, Lx7/۟ۤۡ۟ۦ;->ۢۥۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lcom/auto/accept/service/۟۠ۧۧۢ;->۟ۦۥۨۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v0

    const/16 v1, 0x45

    sget v2, Lo5/۟ۧۡۧۦ;->۟ۡۥۣۨ:I

    xor-int/lit16 v2, v2, 0x33e

    const/16 v3, 0xc26

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۣ۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    invoke-static {}, Lo1/۟ۡۡۦۣ;->ۨۢۥ۠()Ljava/security/MessageDigest;

    move-result-object v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v2, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, 0x0

    :goto_3
    return-object v0

    :sswitch_9
    invoke-static {}, Le7/ۧ۠ۧ;->۟ۥۣۦۣ()Ljava/util/Locale;

    move-result-object v1

    new-instance v3, Ljava/math/BigInteger;

    invoke-static {v0}, Lm7/ۥۨۥ۟;->ۣۢۤ(Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v2, v0}, Ll0/ۡۦۦۡ;->ۡۢۤۨ(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v0

    invoke-direct {v3, v4, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    new-array v0, v4, [Ljava/lang/Object;

    sget v2, Lt9/ۧۦۥ۟;->ۣ۟ۦۣ:I

    xor-int/lit16 v2, v2, 0x1f2

    aput-object v3, v0, v2

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v2

    const/16 v3, 0x69

    sget v4, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۥۤۤ:I

    xor-int/lit16 v4, v4, -0xcb

    const/16 v5, 0x7cf

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->ۨۨۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟۠ۦۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

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
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public final t(Ljava/lang/String;)Landroid/util/Pair;
    .locals 18

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Ld9/ۡۥۣۡ;->ۤۥۢۨ(Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v2

    check-cast v2, Le6/c;

    invoke-static {v2}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Lw2/ۤ۠ۨۤ;->ۡۥۣۡ(Ljava/lang/Object;)Ljava/util/HashMap;

    move-result-object v8

    move-object/from16 v0, p1

    invoke-static {v8, v0}, Lf6/ۣۣۣۣ۟;->ۤۡۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk6/b7;

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
    if-eqz v2, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->۠ۦۧ(Ljava/lang/Object;)J

    move-result-wide v10

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    cmp-long v3, v6, v10

    if-gez v3, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v2}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->۟۠۠۟ۡ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v4

    new-instance v3, Landroid/util/Pair;

    invoke-static {v2}, La2/۟ۡۥۦ۟;->ۦۧۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v3

    :goto_2
    return-object v2

    :sswitch_6
    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    const-wide/16 v10, 0x0

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۧۢۢۡ()Lk6/x3;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v3, v0, v4}, Lp8/۟۟ۢ۟ۢ;->۟ۡ۠ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v12

    sub-long/2addr v10, v12

    sub-long v10, v6, v10

    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v3

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->۟ۥۤۧۦ()Lk6/x3;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v3, v0, v4}, Lp8/۟۟ۢ۟ۢ;->۟ۡ۠ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v12

    const/16 v3, 0x748

    :goto_3
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    const-wide/16 v14, 0x0

    cmp-long v3, v12, v14

    if-lez v3, :cond_2

    const v3, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_8
    const v3, 0xbe41

    goto :goto_3

    :sswitch_9
    :try_start_1
    invoke-static/range {p0 .. p0}, Lf4/ۦۣ۟ۦ;->۟۟۠۠ۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۤۡۦۢ(Ljava/lang/Object;)Lm0/z1;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v2

    const v3, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_4

    :sswitch_a
    move-object v3, v2

    :goto_5
    const v2, 0xc601

    :goto_6
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_6

    :sswitch_b
    if-nez v3, :cond_5

    const v2, 0xc65e

    goto :goto_6

    :sswitch_c
    const v3, 0xbe9e

    goto :goto_4

    :catch_0
    move-exception v2

    const v3, 0xbefb

    :goto_7
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_d
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v3

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v4

    const/16 v6, 0x92

    sget v7, Lz2/ۢۨۨۦ;->۟ۡ۟ۦ:I

    xor-int/lit16 v7, v7, -0x2fb

    const/16 v9, 0x21f

    invoke-static {v4, v6, v7, v9}, Lk4/۟۠ۦ۟ۤ;->۟۟ۥۦۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Lw9/۟۠۠ۢ۟;->ۣۣۥۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v3

    invoke-static {v3, v4, v2}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lk6/b7;

    const/4 v3, 0x0

    invoke-direct {v2, v10, v11, v5, v3}, Lk6/b7;-><init>(JLjava/lang/String;Z)V

    :goto_8
    :pswitch_0
    move-object/from16 v0, p1

    invoke-static {v8, v0, v2}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->۟۠۠۟ۡ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v4

    new-instance v3, Landroid/util/Pair;

    invoke-static {v2}, La2/۟ۡۥۦ۟;->ۦۧۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v3

    goto/16 :goto_2

    :sswitch_e
    const v3, 0xbf1a

    goto :goto_7

    :catch_1
    move-exception v3

    const v3, 0xc202

    :goto_9
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_6

    goto :goto_9

    :sswitch_f
    if-eqz v2, :cond_3

    const v3, 0xc25f

    goto :goto_9

    :cond_3
    :sswitch_10
    const v3, 0xc240

    goto :goto_9

    :sswitch_11
    :try_start_2
    invoke-static {v2}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->۠ۦۧ(Ljava/lang/Object;)J

    move-result-wide v14

    const v3, 0xc27e

    :goto_a
    const v4, 0xc28f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_7

    goto :goto_a

    :cond_4
    :sswitch_12
    const v3, 0xc2bc

    goto :goto_a

    :sswitch_13
    const-wide/16 v16, 0x0

    sub-long v16, v16, v14

    sub-long v16, v12, v16

    cmp-long v3, v6, v16

    if-gez v3, :cond_4

    const v3, 0xc2db

    goto :goto_a

    :sswitch_14
    new-instance v3, Landroid/util/Pair;

    invoke-static {v2}, La2/۟ۡۥۦ۟;->ۦۧۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->۟۠۠۟ۡ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v3

    goto/16 :goto_2

    :sswitch_15
    const/4 v2, 0x0

    const v3, 0xc2fa

    :goto_b
    const v4, 0xc30b

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_8

    goto :goto_b

    :sswitch_16
    const v3, 0xc5a4

    goto :goto_b

    :sswitch_17
    move-object v3, v2

    goto/16 :goto_5

    :sswitch_18
    invoke-static/range {p0 .. p0}, Lf4/ۦۣ۟ۦ;->۟۟۠۠ۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۤۡۦۢ(Ljava/lang/Object;)Lm0/z1;

    move-result-object v2

    move-object v3, v2

    goto/16 :goto_5

    :cond_5
    :sswitch_19
    const v2, 0xc63f

    goto/16 :goto_6

    :sswitch_1a
    new-instance v2, Landroid/util/Pair;

    invoke-static {}, Lk6/c7;->ۦۢۧۡ()[S

    move-result-object v3

    const/16 v4, 0x6e

    sget v6, Lk1/ۨ۟ۧۡ;->۟ۡۥۥ۠:I

    xor-int/lit16 v6, v6, 0x317

    const/16 v7, 0x517

    invoke-static {v3, v4, v6, v7}, Lw2/۟ۧۥۦۨ;->ۨۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_1b
    invoke-static {v3}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۦۣۨۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v4, 0xc67d

    :goto_c
    const v6, 0xc68e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_9

    goto :goto_c

    :cond_6
    :sswitch_1c
    const v4, 0xc6bb

    goto :goto_c

    :sswitch_1d
    if-eqz v2, :cond_6

    const v4, 0xc965

    goto :goto_c

    :sswitch_1e
    new-instance v4, Lk6/b7;

    invoke-static {v3}, Lg2/۟۠ۡۡۦ;->ۣۡ۠۠(Ljava/lang/Object;)Z

    move-result v3

    invoke-direct {v4, v10, v11, v2, v3}, Lk6/b7;-><init>(JLjava/lang/String;Z)V

    const v2, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_d

    :sswitch_1f
    const v2, 0xc9a3

    goto :goto_d

    :sswitch_20
    move-object v2, v4

    goto/16 :goto_8

    :sswitch_21
    new-instance v2, Lk6/b7;

    invoke-static {v3}, Lg2/۟۠ۡۡۦ;->ۣۡ۠۠(Ljava/lang/Object;)Z

    move-result v3

    invoke-direct {v2, v10, v11, v5, v3}, Lk6/b7;-><init>(JLjava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const v3, 0xca00

    :goto_e
    const v4, 0xca11

    xor-int/2addr v3, v4

    packed-switch v3, :pswitch_data_0

    :pswitch_1
    goto :goto_e

    :pswitch_2
    const v3, 0xca1f

    goto :goto_e

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_18
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x13 -> :sswitch_b
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_15
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
