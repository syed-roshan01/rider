.class public final Ld5/j1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Landroid/content/Context;

.field public final c:Lm0/g1;

.field public final d:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x50

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/j1;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa8ds
        0xa8fs
        0xa82s
        0xa82s
        0xaces
        0xa9as
        0xa81s
        0xaces
        0xac9s
        0xa9cs
        0xa8bs
        0xa9ds
        0xa9bs
        0xa83s
        0xa8bs
        0xac9s
        0xaces
        0xa8cs
        0xa8bs
        0xa88s
        0xa81s
        0xa9cs
        0xa8bs
        0xaces
        0xac9s
        0xa87s
        0xa80s
        0xa98s
        0xa81s
        0xa85s
        0xa8bs
        0xac9s
        0xaces
        0xa99s
        0xa87s
        0xa9as
        0xa86s
        0xaces
        0xa8ds
        0xa81s
        0xa9cs
        0xa81s
        0xa9bs
        0xa9as
        0xa87s
        0xa80s
        0xa8bs
        0x4d7s
        0x4d5s
        0x4dfs
        0x494s
        0x4c9s
        0x4d2s
        0x4d3s
        0x4c0s
        0x4cfs
        0x4d1s
        0x4cfs
        0x494s
        0x4cas
        0x4c8s
        0x4d3s
        0x4ccs
        0x4d3s
        0x4d6s
        0x4dfs
        0x4dds
        0x4dfs
        0x4des
        0x494s
        0x4dbs
        0x4cas
        0x4d3s
        0xa74s
        0xa78s
        0xa79s
        0xa63s
        0xa72s
        0xa6fs
        0xa63s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/g1;Lm0/g1;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Ld5/j1;->b:Landroid/content/Context;

    iput-object p2, p0, Ld5/j1;->c:Lm0/g1;

    iput-object p3, p0, Ld5/j1;->d:Lm0/g1;

    sget v0, Lm0/۟ۤۡۤۤ;->ۢ۟ۨۢ:I

    xor-int/lit16 v0, v0, 0x32b

    invoke-direct {p0, v0, p4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۣۧ۟ۦ()I

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
    const-string v0, "SIznMyZMvpZG58R"

    invoke-static {v0}, Lj3/۟ۧۧۦۤ;->۟۠ۦۧۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۡۧۥۨ()[S
    .locals 2

    invoke-static {}, Ld1/ۣۧۡۡ;->ۢۨ۠۠()I

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
    sget-object v0, Ld5/j1;->short:[S

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e1\u06e7\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lr/۠ۡ۠;->۟۟ۦۥۢ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v1

    const-string v4, "\u06e5\u06e8\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lh5/ۧ۟ۨۧ;->ۨ۟ۢۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e7\u06e2\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    new-instance p0, Ld5/j1;

    invoke-direct {p0, v0, v2, v3, p2}, Ld5/j1;-><init>(Landroid/content/Context;Lm0/g1;Lm0/g1;Lu8/e;)V

    const-string v1, "\u06df\u06e8\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v1

    const-string v4, "\u06e3\u06e0\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa81c -> :sswitch_3
        0x1ab629 -> :sswitch_0
        0x1abea4 -> :sswitch_2
        0x1ac566 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e2\u06e3\u06e5"

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, v0

    move-object v2, p1

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0, v5, v3}, Lh/۟ۡۥۡۧ;->ۣ۠ۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e0\u06e2\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e6\u06e1"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e8\u06e5\u06e7"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Ld5/j1;

    const-string v6, "\u06e4\u06df\u06e6"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v4}, Lx8/ۢۨۥۨ;->ۣ۟ۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e0\u06e5\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e6\u06e3\u06e5"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_3
        0x1aab22 -> :sswitch_2
        0x1aab7b -> :sswitch_5
        0x1ab2c4 -> :sswitch_4
        0x1ab9cb -> :sswitch_0
        0x1ac1c8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/4 v3, 0x1

    const/4 v1, 0x0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v5

    invoke-static {p0}, Ls3/۟ۧ۟ۡۢ;->ۣۢۡۥ(Ljava/lang/Object;)I

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v2, v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Ld5/j1;->۟ۡۧۥۨ()[S

    move-result-object v2

    sget v3, Lg/۟ۧ۠ۤ;->ۦۥۡۦ:I

    xor-int/lit16 v3, v3, 0x3f7

    const/16 v4, 0xaee

    invoke-static {v2, v1, v3, v4}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->۟ۡۥۨۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    :sswitch_9
    invoke-static {}, Lm5/ۣۢ۟ۧ;->ۨ۠ۡۡ()Z

    move-result v0

    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0}, Lr/۠ۡ۠;->۟۟ۦۥۢ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld5/j1;->۟ۡۧۥۨ()[S

    move-result-object v0

    const/16 v2, 0x2f

    sget v4, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۢۡۤ:I

    xor-int/lit16 v4, v4, 0x12c

    const/16 v6, 0x4ba

    invoke-static {v0, v2, v4, v6}, Lu/ۣۤۧ۠;->۟ۧ۠۟۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ld5/j1;->۟ۡۧۥۨ()[S

    move-result-object v0

    const/16 v2, 0x49

    sget v4, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۥۧ:I

    xor-int/lit16 v4, v4, -0x303

    const/16 v7, 0xa17

    invoke-static {v0, v2, v4, v7}, Lz0/ۣ۟۠ۤ۟;->۟۠۠۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lh5/ۧ۟ۨۧ;->ۨ۟ۢۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_0
    invoke-static {}, Lj4/ۣۧۤ;->ۧۦۡ()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_a
    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v2, 0xbf39

    goto :goto_5

    :sswitch_c
    const v2, 0xbe9e

    goto :goto_3

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_4

    :sswitch_d
    if-eqz v0, :cond_2

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_e
    :try_start_1
    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->۟ۢۥ۟ۧ()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result v4

    const v2, 0xc202

    :goto_6
    const v8, 0xc213

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-nez v4, :cond_3

    const v2, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v2, 0xc240

    goto :goto_6

    :sswitch_11
    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :sswitch_12
    move v2, v3

    :goto_8
    const v4, 0xc2fa

    :goto_9
    const v8, 0xc30b

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_7

    goto :goto_9

    :sswitch_13
    if-eqz v0, :cond_4

    const v4, 0xc5e2

    goto :goto_9

    :sswitch_14
    const v2, 0xc29d

    goto :goto_7

    :sswitch_15
    move v2, v1

    goto :goto_8

    :cond_4
    :sswitch_16
    const v4, 0xc5c3

    goto :goto_9

    :sswitch_17
    const v4, 0xc601

    :goto_a
    const v8, 0xc612

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-eqz v2, :cond_5

    const v4, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_19
    const v4, 0xc63f

    goto :goto_a

    :sswitch_1a
    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۢۢۡ۠()Lg5/c;

    move-result-object v0

    const v2, 0xc67d

    :goto_b
    const v4, 0xc68e

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :goto_c
    :pswitch_0
    :sswitch_1b
    invoke-static {p0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput v3, p0, Ld5/j1;->a:I

    const-wide/16 v6, -0x4ec

    sget v0, Ly9/ۧۨ۠ۢ;->۟ۧۧ۠ۨ:I

    int-to-long v8, v0

    xor-long/2addr v6, v8

    invoke-static {v6, v7, p0}, Lg0/۟ۥۢۥۢ;->ۣۣ۟۟ۧ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xd106

    :goto_d
    const v4, 0xd117

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :sswitch_1c
    if-ne v2, v5, :cond_8

    const v0, 0xd163

    goto :goto_d

    :sswitch_1d
    const v2, 0xc69c

    goto :goto_b

    :sswitch_1e
    const v2, 0xc984

    :goto_e
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :sswitch_1f
    if-eqz v0, :cond_6

    const v2, 0xc9e1

    goto :goto_e

    :cond_6
    :sswitch_20
    const v2, 0xc9c2

    goto :goto_e

    :sswitch_21
    invoke-static {}, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۦۣۧۢ()Lg5/c;

    move-result-object v0

    const v2, 0xca00

    :goto_f
    const v4, 0xca11

    xor-int/2addr v2, v4

    packed-switch v2, :pswitch_data_0

    :pswitch_1
    goto :goto_f

    :pswitch_2
    const v2, 0xca1f

    goto :goto_f

    :sswitch_22
    :try_start_2
    invoke-static {v7}, Lt2/۟ۦۣۡۤ;->ۧۧۤۨ(Ljava/lang/Object;)Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v6, v2}, Lg5/۟ۥۨۤ;->ۣ۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/pm/PackageInfo;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const v0, 0xca7c

    :goto_10
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_c

    goto :goto_10

    :sswitch_23
    const v0, 0xcd26

    goto :goto_10

    :catch_1
    move-exception v0

    invoke-static {v7}, Lt2/۟ۦۣۡۤ;->ۧۧۤۨ(Ljava/lang/Object;)Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {v0, v6}, Lj2/۠ۤۨۤ;->۟ۦۦۡ۠(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v2

    const v0, 0xcd83

    :goto_11
    const v4, 0xcd94

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_d

    goto :goto_11

    :sswitch_24
    if-eqz v2, :cond_7

    const v0, 0xcde0

    goto :goto_11

    :cond_7
    :sswitch_25
    const v0, 0xcdc1

    goto :goto_11

    :sswitch_26
    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۨۢۦۡ()Lg5/c;

    move-result-object v0

    const v2, 0xcdff

    :goto_12
    const v4, 0xce10

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_e

    goto :goto_12

    :sswitch_27
    const v2, 0xce1e

    goto :goto_12

    :sswitch_28
    invoke-static {}, Lv0/ۣۣۡۢ;->ۣ۟ۧۧۤ()Lg5/c;

    move-result-object v0

    goto/16 :goto_c

    :cond_8
    :sswitch_29
    const v0, 0xd144

    goto/16 :goto_d

    :catch_2
    move-exception v2

    const v2, 0xd182

    :goto_13
    const v4, 0xd193

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_f

    goto :goto_13

    :sswitch_2a
    const v2, 0xd1a1

    goto :goto_13

    :sswitch_2b
    return-object v5

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
        0xe -> :sswitch_a
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_15
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1e
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x32 -> :sswitch_29
        0x53 -> :sswitch_9
        0x74 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_22
        0x74 -> :sswitch_21
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_23
        0x7ab -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_24
        0x36 -> :sswitch_25
        0x55 -> :sswitch_28
        0x74 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_1b
        0x3ef -> :sswitch_27
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_15
    .end sparse-switch
.end method
