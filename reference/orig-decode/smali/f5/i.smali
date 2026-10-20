.class public final Lf5/i;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/i;->short:[S

    return-void

    :array_0
    .array-data 2
        0x9bes
        0x999s
        0x991s
        0x994s
        0x99ds
        0x99cs
        0x9d8s
        0x98cs
        0x997s
        0x9d8s
        0x99bs
        0x990s
        0x999s
        0x996s
        0x99fs
        0x99ds
        0x9d8s
        0x988s
        0x999s
        0x98bs
        0x98bs
        0x98fs
        0x997s
        0x98as
        0x99cs
        0x687s
        0x685s
        0x688s
        0x688s
        0x6c4s
        0x690s
        0x68bs
        0x6c4s
        0x6c3s
        0x696s
        0x681s
        0x697s
        0x691s
        0x689s
        0x681s
        0x6c3s
        0x6c4s
        0x686s
        0x681s
        0x682s
        0x68bs
        0x696s
        0x681s
        0x6c4s
        0x6c3s
        0x68ds
        0x68as
        0x692s
        0x68bs
        0x68fs
        0x681s
        0x6c3s
        0x6c4s
        0x693s
        0x68ds
        0x690s
        0x68cs
        0x6c4s
        0x687s
        0x68bs
        0x696s
        0x68bs
        0x691s
        0x690s
        0x68ds
        0x68as
        0x681s
        0x23cs
        0x21bs
        0x216s
        0x21as
        0x207s
        0x207s
        0x210s
        0x216s
        0x201s
        0x255s
        0x216s
        0x200s
        0x207s
        0x207s
        0x210s
        0x21bs
        0x201s
        0x255s
        0x205s
        0x214s
        0x206s
        0x206s
        0x202s
        0x21as
        0x207s
        0x211s
        0x55as
        0x56bs
        0x579s
        0x579s
        0x57ds
        0x565s
        0x578s
        0x56es
        0x52as
        0x569s
        0x562s
        0x56bs
        0x564s
        0x56ds
        0x56fs
        0x56es
        0x52as
        0x579s
        0x57fs
        0x569s
        0x569s
        0x56fs
        0x579s
        0x579s
        0x56cs
        0x57fs
        0x566s
        0x566s
        0x573s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V
    .locals 3

    iput-object p1, p0, Lf5/i;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/i;->c:Ljava/lang/String;

    iput-object p3, p0, Lf5/i;->d:Ljava/lang/String;

    sget v0, Lf4/ۡۥۣۢ;->ۧۥۧۥ:I

    xor-int/lit16 v0, v0, 0x3d9

    invoke-direct {p0, v0, p4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

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
    const-string v0, "euyEE4c77p2k2X3"

    invoke-static {v0}, Lt2/۟ۢ۟ۢ۟;->ۣ۟۟ۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۣۧۡ۟()[S
    .locals 2

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

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
    sget-object v0, Lf5/i;->short:[S

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

    const-string v4, "\u06e7\u06e3\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance p0, Lf5/i;

    invoke-direct {p0, v0, v2, v3, p2}, Lf5/i;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    const-string v1, "\u06e1\u06e5\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Ldagger/hilt/components/۟ۦۣۤۤ;->۟ۥۢۥۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e6\u06e4\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۡۢۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06df\u06e4\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->۟۟ۢ۟ۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa79d -> :sswitch_0
        0x1aaf3c -> :sswitch_3
        0x1ac1e4 -> :sswitch_2
        0x1ac584 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e1\u06e5\u06e8"

    move-object v2, p1

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e2\u06e2\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v4}, Lq6/ۣ۟ۢ۟ۤ;->۟۟۠ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e4\u06e0\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e2\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Lf5/i;

    const-string v6, "\u06e6\u06e0\u06e5"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e1\u06e6\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v5, v3}, Ls/ۣۡۡۧ;->ۤۢۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e5\u06e7\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf44 -> :sswitch_3
        0x1aaf63 -> :sswitch_1
        0x1ab2a8 -> :sswitch_0
        0x1ab9e9 -> :sswitch_5
        0x1aba24 -> :sswitch_4
        0x1abe81 -> :sswitch_2
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/4 v9, 0x2

    const/4 v8, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {p0}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۧ۟(Ljava/lang/Object;)I

    move-result v5

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v3

    invoke-static {}, Lf5/i;->ۣۧۡ۟()[S

    move-result-object v2

    const/4 v4, 0x0

    sget v6, Lb1/۟ۥۥ۟ۢ;->۟ۦۧۦۥ:I

    xor-int/lit16 v6, v6, 0x3ad

    const/16 v7, 0x9f8

    invoke-static {v2, v4, v6, v7}, Ll9/۟ۦۥۣۢ;->۟۟ۧۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->۟۟ۢ۟ۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v6

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
    if-eqz v5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eq v5, v8, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ne v5, v9, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    :try_start_0
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static {p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v1, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    instance-of v5, v2, Lq8/g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v1, 0xc984

    :goto_4
    const v7, 0xc995

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    xor-int/lit8 v1, v5, -0x1

    and-int/lit8 v1, v1, 0x1

    and-int/lit8 v7, v5, -0x2

    or-int/2addr v1, v7

    if-eqz v1, :cond_6

    const v1, 0xc9e1

    goto :goto_4

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v1

    const v2, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_c
    invoke-static {v6}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v1

    :sswitch_d
    const v2, 0xbf1a

    goto :goto_5

    :catch_0
    move-exception v1

    const v2, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :sswitch_e
    const v2, 0xc221

    goto :goto_6

    :sswitch_f
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/i;->ۣۧۡ۟()[S

    move-result-object v2

    const/16 v3, 0x19

    sget v4, Lh7/۟۟ۧۨ۟;->۟ۤۢۡۡ:I

    xor-int/lit16 v4, v4, -0x94

    const/16 v5, 0x6e4

    invoke-static {v2, v3, v4, v5}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->ۥۦۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_10
    :try_start_1
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static {p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v5, 0xc27e

    :goto_7
    const v7, 0xc28f

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_7

    goto :goto_7

    :sswitch_11
    instance-of v5, v2, Lq8/g;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v2, 0xc601

    :goto_8
    const v7, 0xc612

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_8

    goto :goto_8

    :sswitch_12
    if-eqz v5, :cond_4

    const v2, 0xc65e

    goto :goto_8

    :sswitch_13
    const v5, 0xc29d

    goto :goto_7

    :sswitch_14
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lp7/ۣۣۦۤ;->ۣ۟ۧۡۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_2
    invoke-static {v6}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {p0}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۡۢۨۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    iput v7, p0, Lf5/i;->a:I

    invoke-static {v2, v5, p0}, Lo1/۟ۡۡۦۣ;->ۢۥۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v5, 0xc2fa

    :goto_9
    const v7, 0xc30b

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_9

    goto :goto_9

    :sswitch_15
    if-ne v2, v1, :cond_3

    const v5, 0xc5e2

    goto :goto_9

    :cond_3
    :sswitch_16
    const v5, 0xc5c3

    goto :goto_9

    :cond_4
    :sswitch_17
    const v2, 0xc63f

    goto :goto_8

    :sswitch_18
    invoke-static {v6}, Lp7/ۣۣۦۤ;->ۣ۟ۧۡۨ(Ljava/lang/Object;)Lp9/q0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v1

    invoke-static {v6}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    :try_start_3
    invoke-static {}, Lf5/i;->ۣۧۡ۟()[S

    move-result-object v5

    const/16 v7, 0x48

    sget v8, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۡۨ۟ۨ:I

    xor-int/lit8 v8, v8, 0x6b

    const/16 v9, 0x275

    invoke-static {v5, v7, v8, v9}, Ll0/ۡۦۦۡ;->۠۟ۦۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v2, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v2, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v3

    :goto_a
    :sswitch_19
    return-object v1

    :sswitch_1a
    :try_start_4
    invoke-static {v6}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {p0}, Ldagger/hilt/components/۟ۦۣۤۤ;->۟ۥۢۥۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x2

    iput v7, p0, Lf5/i;->a:I

    invoke-static {v2, v5, p0}, Ld7/ۢۧۧۢ;->۟ۦۢ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v5, 0xc67d

    :goto_b
    const v7, 0xc68e

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_a

    goto :goto_b

    :cond_5
    :sswitch_1b
    const v5, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-ne v2, v1, :cond_5

    const v5, 0xc965

    goto :goto_b

    :cond_6
    :sswitch_1d
    const v1, 0xc9c2

    goto/16 :goto_4

    :sswitch_1e
    move-object v0, v2

    check-cast v0, Lq8/l;

    move-object v1, v0

    invoke-static {v6}, Lp7/ۣۣۦۤ;->ۣ۟ۧۡۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {}, Lf5/i;->ۣۧۡ۟()[S

    move-result-object v5

    const/16 v7, 0x62

    sget v8, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->۟ۢۥ۠ۧ:I

    xor-int/lit8 v8, v8, -0x3a

    const/16 v9, 0x50a

    invoke-static {v5, v7, v8, v9}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->۟ۧ۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1f
    invoke-static {v2}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const v1, 0xca00

    :goto_c
    const v5, 0xca11

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_b

    goto :goto_c

    :cond_7
    :sswitch_20
    const v1, 0xca3e

    goto :goto_c

    :sswitch_21
    if-eqz v2, :cond_7

    const v1, 0xca5d

    goto :goto_c

    :sswitch_22
    invoke-static {v6}, Lp7/ۣۣۦۤ;->ۣ۟ۧۡۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v5

    invoke-static {v2}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xca7c

    :goto_d
    const v7, 0xca8d

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_c

    goto :goto_d

    :sswitch_23
    if-nez v1, :cond_8

    const v2, 0xcd64

    goto :goto_d

    :cond_8
    :sswitch_24
    const v2, 0xcd45

    goto :goto_d

    :sswitch_25
    move-object v1, v4

    :sswitch_26
    invoke-static {v5, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :sswitch_27
    invoke-static {v6}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xcd83

    :goto_e
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_e

    :sswitch_28
    const v1, 0xcda2

    goto :goto_e

    :sswitch_29
    :try_start_5
    invoke-static {v6}, Lp7/ۣۣۦۤ;->ۣ۟ۧۡۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v5

    invoke-static {v1}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0xcdff

    :goto_f
    const v7, 0xce10

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_e

    goto :goto_f

    :cond_9
    :sswitch_2a
    const v2, 0xce3d

    goto :goto_f

    :sswitch_2b
    if-nez v1, :cond_9

    const v2, 0xd0e7

    goto :goto_f

    :sswitch_2c
    const v1, 0xd106

    :goto_10
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_10

    :sswitch_2d
    const v1, 0xd125

    goto :goto_10

    :sswitch_2e
    move-object v1, v4

    :sswitch_2f
    invoke-static {v5, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v6}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_30
    move-object v1, v3

    goto/16 :goto_a

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_14
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_10
        0x1f4 -> :sswitch_5
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
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_a
        0x36 -> :sswitch_1d
        0x57 -> :sswitch_1f
        0x74 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_12
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_17
        0x4c -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_11
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_9
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_19
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_21
        0x2f -> :sswitch_27
        0x4c -> :sswitch_22
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_23
        0x7ab -> :sswitch_24
        0x7c8 -> :sswitch_26
        0x7e9 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2f
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
    .end sparse-switch
.end method
