.class public final Lf5/w;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x63

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/w;->short:[S

    return-void

    :array_0
    .array-data 2
        0xad2s
        0xaf5s
        0xafds
        0xaf8s
        0xaf1s
        0xaf0s
        0xab4s
        0xae0s
        0xafbs
        0xab4s
        0xae7s
        0xaf1s
        0xafas
        0xaf0s
        0xab4s
        0xae6s
        0xaf1s
        0xae7s
        0xaf1s
        0xae0s
        0xab4s
        0xaf1s
        0xaf9s
        0xaf5s
        0xafds
        0xaf8s
        0x552s
        0x550s
        0x55ds
        0x55ds
        0x511s
        0x545s
        0x55es
        0x511s
        0x516s
        0x543s
        0x554s
        0x542s
        0x544s
        0x55cs
        0x554s
        0x516s
        0x511s
        0x553s
        0x554s
        0x557s
        0x55es
        0x543s
        0x554s
        0x511s
        0x516s
        0x558s
        0x55fs
        0x547s
        0x55es
        0x55as
        0x554s
        0x516s
        0x511s
        0x546s
        0x558s
        0x545s
        0x559s
        0x511s
        0x552s
        0x55es
        0x543s
        0x55es
        0x544s
        0x545s
        0x558s
        0x55fs
        0x554s
        0xb0es
        0xb3fs
        0xb2ds
        0xb2ds
        0xb29s
        0xb31s
        0xb2cs
        0xb3as
        0xb7es
        0xb2cs
        0xb3bs
        0xb2ds
        0xb3bs
        0xb2as
        0xb7es
        0xb3bs
        0xb33s
        0xb3fs
        0xb37s
        0xb32s
        0xb7es
        0xb2ds
        0xb3bs
        0xb30s
        0xb2as
        0xb7fs
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/w;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/w;->c:Ljava/lang/String;

    sget v0, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->۟ۤۤۨۤ:I

    xor-int/lit16 v0, v0, -0x8f

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lt2/۟ۦۣۡۤ;->ۣ۟ۦۣ()I

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
    const-string v0, "qsJmTgWzs9E6guvRHYnuaZ9"

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۦۢۤۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۣ۠ۤۡ()[S
    .locals 2

    invoke-static {}, Lr/۠ۡ۠;->۟ۡۨۥۤ()I

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
    sget-object v0, Lf5/w;->short:[S

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
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e4\u06e6\u06df"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance p0, Lf5/w;

    invoke-direct {p0, v0, v2, p2}, Lf5/w;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V

    const-string v1, "\u06e4\u06e6\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۦۧۥۥ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e6\u06e7\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣۣ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e3\u06e0\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aba9d -> :sswitch_0
        0x1abaa3 -> :sswitch_2
        0x1ac240 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e8\u06e1\u06e8"

    move-object v2, p1

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lf5/w;

    const-string v6, "\u06df\u06df\u06e5"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v3, v4}, Lk8/ۣ۠ۨۤ;->۟ۨ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e8\u06e5\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e2\u06e4\u06e8"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۠ۥۣۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e1\u06e7\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e8\u06e2\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e5\u06e8\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa705 -> :sswitch_4
        0x1aaf7e -> :sswitch_5
        0x1ab2e6 -> :sswitch_3
        0x1abea1 -> :sswitch_2
        0x1ac90f -> :sswitch_1
        0x1ac92e -> :sswitch_0
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v7, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {p0}, Lh4/ۣ۟ۢۢۡ;->۟ۦۣۧ۠(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Lf5/w;->ۣ۠ۤۡ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v5, Lo5/۟ۧۡۧۦ;->۟ۡۥۣۨ:I

    xor-int/lit16 v5, v5, 0x300

    const/16 v6, 0xa94

    invoke-static {v2, v3, v5, v6}, Lp8/ۡۤ;->۟۟ۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۦۧۥۥ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v5

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
    if-eqz v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v4, v7, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static {p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v1

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    invoke-static {v5}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v1

    :sswitch_8
    const v2, 0xbe9e

    goto :goto_3

    :catch_0
    move-exception v1

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_9
    :try_start_1
    invoke-static {v5}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v1}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    const v2, 0xc984

    :goto_5
    const v6, 0xc995

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_a
    if-nez v1, :cond_6

    const v2, 0xc9e1

    goto :goto_5

    :sswitch_b
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/w;->ۣ۠ۤۡ()[S

    move-result-object v2

    const/16 v3, 0x1a

    sget v4, Landroidx/profileinstaller/۠ۡۥۡ;->ۤ۟ۤۡ:I

    xor-int/lit16 v4, v4, -0x313

    const/16 v5, 0x531

    invoke-static {v2, v3, v4, v5}, Ld1/۟ۡۨۧۢ;->۟ۢۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_d
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v5}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_2
    invoke-static {v5}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {p0}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣۣ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    iput v6, p0, Lf5/w;->a:I

    invoke-static {v2, v4, p0}, Ls/ۣۡۡۧ;->۠ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v4, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6

    goto :goto_6

    :sswitch_e
    if-ne v2, v1, :cond_2

    const v4, 0xc25f

    goto :goto_6

    :cond_2
    :sswitch_f
    const v4, 0xc240

    goto :goto_6

    :sswitch_10
    instance-of v4, v2, Lq8/g;

    const v1, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :cond_3
    :sswitch_11
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_12
    xor-int/lit8 v1, v4, -0x1

    and-int/lit8 v1, v1, 0x1

    and-int/lit8 v6, v4, -0x2

    or-int/2addr v1, v6

    if-eqz v1, :cond_3

    const v1, 0xc2db

    goto :goto_7

    :sswitch_13
    move-object v0, v2

    check-cast v0, Lq8/l;

    move-object v1, v0

    invoke-static {v5}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {}, Lf5/w;->ۣ۠ۤۡ()[S

    move-result-object v4

    const/16 v6, 0x49

    sget v7, Lq6/ۡۨۧۨ;->ۣۣ۟۠ۨ:I

    xor-int/lit16 v7, v7, 0x20a

    const/16 v8, 0xb5e

    invoke-static {v4, v6, v7, v8}, Le1/۟ۡۡۤۡ;->۟ۥۦۧۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_14
    invoke-static {v2}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const v1, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_8

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_4

    const v1, 0xc5e2

    goto :goto_8

    :cond_4
    :sswitch_16
    const v1, 0xc5c3

    goto :goto_8

    :sswitch_17
    invoke-static {v5}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xc601

    :goto_9
    const v6, 0xc612

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :sswitch_18
    if-nez v1, :cond_5

    const v2, 0xc65e

    goto :goto_9

    :cond_5
    :sswitch_19
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1a
    move-object v1, v3

    :sswitch_1b
    invoke-static {v4, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :sswitch_1c
    invoke-static {v5}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_a

    goto :goto_a

    :goto_b
    :sswitch_1d
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v1

    :sswitch_1e
    return-object v1

    :sswitch_1f
    const v1, 0xc69c

    goto :goto_a

    :cond_6
    :sswitch_20
    const v2, 0xc9c2

    goto/16 :goto_5

    :sswitch_21
    const v1, 0xca00

    :goto_c
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_c

    :pswitch_1
    move-object v1, v3

    :sswitch_22
    :try_start_3
    invoke-static {v4, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v5}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    :pswitch_2
    const v1, 0xca1f

    goto :goto_c

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_d
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
        0xb97b -> :sswitch_10
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_a
        0x36 -> :sswitch_20
        0x57 -> :sswitch_22
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_1e
        0x53 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_14
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1d
        0xf3 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
