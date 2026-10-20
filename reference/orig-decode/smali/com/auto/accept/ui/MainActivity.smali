.class public final Lcom/auto/accept/ui/MainActivity;
.super Lc5/e;


# annotations
.annotation runtime Ldagger/hilt/android/AndroidEntryPoint;
.end annotation


# static fields
.field public static final n:I

.field private static final short:[S


# instance fields
.field public final e:Landroidx/lifecycle/y0;

.field public final f:Lc5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/ui/MainActivity;->short:[S

    return-void

    :array_0
    .array-data 2
        0x1a9s
        0x1b7s
        0x1b0s
        0x1bas
        0x1b1s
        0x1a9s
        0x1f0s
        0x1bas
        0x1bbs
        0x1bds
        0x1b1s
        0x1acs
        0x188s
        0x1b7s
        0x1bbs
        0x1a9s
        0xafcs
        0xae3s
        0xaefs
        0xafds
        0xaa4s
        0xaf8s
        0xaefs
        0xaf9s
        0xae5s
        0xaffs
        0xaf8s
        0xae9s
        0xaefs
        0xaf9s
        0x442s
        0x45cs
        0x45bs
        0x451s
        0x45as
        0x442s
        0x8fes
        0x8eas
        0x8fds
        0x8fds
        0x8e2s
        0x8fds
        0x8e7s
        0x8fcs
        0x8fds
        0x8fas
        0x8eds
        0x8ffs
        0x2604s
        -0x406s
        0x5d5s
        0x59as
        0x59bs
        0x5a7s
        0x590s
        0x586s
        0x580s
        0x598s
        0x590s
        0x5d5s
        0x5a6s
        0x5a1s
        0x5b4s
        0x5a7s
        0x5a1s
        0x26ebs
        -0x4ebs
        0x53as
        0x579s
        0x572s
        0x57fs
        0x579s
        0x571s
        0x54as
        0x57fs
        0x568s
        0x577s
        0x573s
        0x569s
        0x569s
        0x573s
        0x575s
        0x574s
        0x569s
        0x53as
        0x56es
        0x575s
        0x575s
        0x571s
        0x53as
        0xccfs
        0xcd1s
        0x2244s
        -0x46s
        0x195s
        0x1c7s
        0x1d0s
        0x1d6s
        0x1dds
        0x1d0s
        0x1d6s
        0x1des
        0x1f3s
        0x1das
        0x1c7s
        0x1e0s
        0x1c5s
        0x1d1s
        0x1d4s
        0x1c1s
        0x1d0s
        0x1f3s
        0x1c7s
        0x1das
        0x1d8s
        0x1f6s
        0x1d4s
        0x1d6s
        0x1dds
        0x1d0s
        0x195s
        0x1c1s
        0x1das
        0x1das
        0x1des
        0x195s
        0x27das
        -0x5dcs
        0x40bs
        0x459s
        0x44es
        0x448s
        0x443s
        0x44es
        0x448s
        0x440s
        0x47es
        0x458s
        0x44es
        0x459s
        0x478s
        0x45fs
        0x44as
        0x45fs
        0x45es
        0x458s
        0x40bs
        0x46fs
        0x462s
        0x478s
        0x47bs
        0x46as
        0x47fs
        0x468s
        0x463s
        0x46es
        0x46fs
        0x40bs
        0x442s
        0x445s
        0x40bs
        0x2271s
        -0x71s
        0x1a0s
        0x1efs
        0x1ees
        0x1d2s
        0x1e5s
        0x1f3s
        0x1f5s
        0x1eds
        0x1e5s
        0x1a0s
        0x1d4s
        0x1cfs
        0x1d4s
        0x1c1s
        0x1ccs
        0x1bas
        0x1a0s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lc5/e;-><init>()V

    new-instance v0, Lc5/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc5/h;-><init>(Landroidx/activity/p;I)V

    new-instance v1, Landroidx/lifecycle/y0;

    const-class v2, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v2}, Lf1/ۥۦ۟ۥ;->۟ۥۥۨۡ(Ljava/lang/Object;)Ld9/e;

    move-result-object v2

    new-instance v3, Lc5/h;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lc5/h;-><init>(Landroidx/activity/p;I)V

    new-instance v4, Lu/r0;

    sget v5, Lz3/۟ۡ۠ۦۣ;->ۣ۠ۦۣ:I

    xor-int/lit8 v5, v5, 0x27

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6, p0}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y0;-><init>(Ld9/e;Lc5/h;Lc5/h;Lu/r0;)V

    iput-object v1, p0, Lcom/auto/accept/ui/MainActivity;->e:Landroidx/lifecycle/y0;

    new-instance v0, Lc5/f;

    invoke-direct {v0, p0}, Lc5/f;-><init>(Lcom/auto/accept/ui/MainActivity;)V

    iput-object v0, p0, Lcom/auto/accept/ui/MainActivity;->f:Lc5/f;

    invoke-static {}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۡ۟ۨۤ()I

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
    const-string v0, "X05nPYyefEXirpOA7Td9Gff"

    invoke-static {v0}, Lg2/ۢۥۥۡ;->۟ۢ۟۟ۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۠ۥۢۦ()[S
    .locals 2

    invoke-static {}, Ls2/۟ۧ۟ۧۤ;->۟۟ۤۥۥ()I

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
    sget-object v0, Lcom/auto/accept/ui/MainActivity;->short:[S

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
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 14

    const/4 v13, 0x1

    const/4 v7, 0x0

    const/4 v12, 0x0

    invoke-super {p0, p1}, Lc5/e;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, La/ۥۦۥۡ;->ۡۧۥۤ()I

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->۟ۥۢۡۡ()I

    invoke-static {}, La3/۟ۢۨۢۥ;->۟۟ۦ۟۠()Landroidx/activity/l0;

    move-result-object v3

    new-instance v1, Landroidx/activity/m0;

    invoke-direct {v1, v12, v12, v3}, Landroidx/activity/m0;-><init>(IILc9/c;)V

    new-instance v2, Landroidx/activity/m0;

    invoke-static {}, La/ۥۦۥۡ;->ۡۧۥۤ()I

    move-result v0

    invoke-static {}, Lb/۠ۨۦۥ;->ۤۧۨ۠()I

    move-result v4

    invoke-direct {v2, v0, v4, v3}, Landroidx/activity/m0;-><init>(IILc9/c;)V

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۡۡۤ۟(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lp7/ۣۣۦۤ;->۟۟۟ۧۢ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v0

    sget v5, Landroidx/compose/ui/draw/ۧۤۡۧ;->۟ۢۤ۟ۦ:I

    xor-int/lit16 v5, v5, 0x16b

    const/16 v6, 0x1de

    invoke-static {v0, v12, v5, v6}, Ll8/ۢۦۥۢ;->۟۟۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->ۣۣ۟۟ۢ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v5

    const/16 v6, 0x10

    sget v8, Lp0/۟ۧۧۧ۟;->ۤۥ۟ۦ:I

    xor-int/lit16 v8, v8, -0x308

    const/16 v9, 0xa8a

    invoke-static {v5, v6, v8, v9}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۤۢۨۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v0}, Ld9/ۡۥۣۡ;->۟ۥۣۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v4}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->ۣۣ۟۟ۢ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v6}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v0}, Ld9/ۡۥۣۡ;->۟ۥۣۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {}, Ln9/ۤۧۧۤ;->۟ۡۤۢۦ()I

    move-result v3

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
    const/16 v0, 0x1d

    if-lt v3, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroidx/activity/v;

    invoke-direct {v0}, Landroidx/activity/v;-><init>()V

    :sswitch_3
    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v3, 0x6eb

    goto :goto_1

    :sswitch_5
    new-instance v0, Landroidx/activity/t;

    invoke-direct {v0}, Landroidx/activity/t;-><init>()V

    const/16 v3, 0x748

    :goto_2
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v3, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۡۡۤ۟(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v3

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v8

    const/16 v9, 0x1e

    sget v10, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۣ۟ۨۤ:I

    xor-int/lit16 v10, v10, -0x25a

    const/16 v11, 0x435

    invoke-static {v8, v9, v10, v11}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۦۣ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {v0 .. v6}, Lb/۠ۨۦۥ;->۟ۢۧۦۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZ)V

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۤۤۦۡ(Ljava/lang/Object;)Lc5/f;

    move-result-object v0

    invoke-static {}, La8/ۣۡۨ۠;->ۡۦۦۢ()Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {}, Li/ۢۥۣ۟;->ۣ۟ۧۡۧ()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Lla/f;

    invoke-direct {v3, v0}, Lla/f;-><init>(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :pswitch_0
    :sswitch_8
    new-instance v0, Lc5/g;

    invoke-direct {v0, p0, v13}, Lc5/g;-><init>(Lcom/auto/accept/ui/MainActivity;I)V

    new-instance v2, Lu0/b;

    const v1, 0x49b5de3c    # 1489863.5f

    sget v3, Ld2/۟ۦۡ۟ۦ;->۟۟ۥۣ۠:I

    xor-int/2addr v1, v3

    invoke-direct {v2, v1, v0, v13}, Lu0/b;-><init>(ILd9/j;Z)V

    invoke-static {}, Lr2/ۡۧۥۧ;->۟ۡۡۤ۟()Landroid/view/ViewGroup$LayoutParams;

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۡۡۤ۟(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lp7/ۣۣۦۤ;->۟۟۟ۧۢ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    const v1, 0x10203b2

    sget v3, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۦۨۦ:I

    xor-int/2addr v1, v3

    invoke-static {v0, v1}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->۟۠ۥ۠ۢ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0, v12}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۧۥۥ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    instance-of v3, v0, Lu1/r1;

    const v1, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_1
    :sswitch_9
    const v1, 0xbf39

    goto :goto_4

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    const v0, 0xca00

    :goto_5
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_1
    goto :goto_5

    :pswitch_2
    const v0, 0xca1f

    goto :goto_5

    :sswitch_b
    if-eqz v3, :cond_1

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_c
    check-cast v0, Lu1/r1;

    const v1, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    const v1, 0xc221

    goto :goto_6

    :sswitch_e
    move-object v0, v7

    :sswitch_f
    const v1, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_2
    :sswitch_10
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_11
    if-eqz v0, :cond_2

    const v1, 0xc2db

    goto :goto_7

    :sswitch_12
    invoke-static {v0, v7}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Lq6/ۡۨۧۨ;->ۥۢۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    const v0, 0xc5a4

    goto :goto_8

    :sswitch_14
    new-instance v1, Lu1/r1;

    invoke-direct {v1, p0}, Lu1/r1;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v7}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lq6/ۡۨۧۨ;->ۥۢۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۡۡۤ۟(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lp7/ۣۣۦۤ;->۟۟۟ۧۢ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lg0/۟ۥۢۥۢ;->ۣ۟ۨۥۡ(Ljava/lang/Object;)Landroidx/lifecycle/w;

    move-result-object v3

    const v0, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_15
    if-nez v3, :cond_3

    const v0, 0xc65e

    goto :goto_9

    :cond_3
    :sswitch_16
    const v0, 0xc63f

    goto :goto_9

    :sswitch_17
    invoke-static {v2, p0}, Lf1/ۥۦ۟ۥ;->ۦ۟۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_18
    invoke-static {v2}, Lv8/۟ۧۢ۟ۢ;->۟۟ۨۧ(Ljava/lang/Object;)Landroidx/lifecycle/g1;

    move-result-object v3

    const v0, 0xc67d

    :goto_a
    const v4, 0xc68e

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :cond_4
    :sswitch_19
    const v0, 0xc6bb

    goto :goto_a

    :sswitch_1a
    if-nez v3, :cond_4

    const v0, 0xc965

    goto :goto_a

    :sswitch_1b
    invoke-static {v2, p0}, Lw/ۥۣۡۡ;->ۥۣۦۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1c
    invoke-static {v2}, Lv/ۣۢ۟ۧ;->۟ۡۨۦ۟(Ljava/lang/Object;)Lb4/g;

    move-result-object v3

    const v0, 0xc984

    :goto_b
    const v4, 0xc995

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_1d
    if-nez v3, :cond_5

    const v0, 0xc9e1

    goto :goto_b

    :cond_5
    :sswitch_1e
    const v0, 0xc9c2

    goto :goto_b

    :sswitch_1f
    invoke-static {v2, p0}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۠۠ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_20
    invoke-static {}, Lr2/ۡۧۥۧ;->۟ۡۡۤ۟()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {p0, v1, v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۦۧۡۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_21
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_3
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_b
        0x7eef -> :sswitch_c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_10
        0x33 -> :sswitch_14
        0x54 -> :sswitch_12
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_21
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x2d -> :sswitch_18
        0x32 -> :sswitch_16
        0x4c -> :sswitch_17
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0x35 -> :sswitch_1c
        0xf3 -> :sswitch_1a
        0xfeb -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 5

    invoke-super {p0}, Lc5/e;->onDestroy()V

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۤۤۦۡ(Ljava/lang/Object;)Lc5/f;

    move-result-object v0

    invoke-static {}, La8/ۣۡۨ۠;->ۡۦۦۢ()Ljava/util/ArrayList;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {}, Li/ۢۥۣ۟;->ۣ۟ۧۡۧ()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Lb5/g;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lb5/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v3}, Lq6/۟ۥۦۡ۟;->۟ۢۥۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    monitor-exit v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_2
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onResume()V
    .locals 13

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v0

    const/16 v1, 0x24

    sget v4, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۣ۟۟ۡ:I

    xor-int/lit16 v4, v4, -0x305

    const/16 v5, 0x8b8

    invoke-static {v0, v1, v4, v5}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۡۢ۟([SIII)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v0

    const/16 v1, 0x30

    sget v4, Lv6/۟ۦۣۧۦ;->ۤ۟ۦۥ:I

    xor-int/lit8 v4, v4, -0x3d

    const/16 v5, 0x5f5

    invoke-static {v0, v1, v4, v5}, Lx5/ۡۦۦۥ;->۟ۨۤ۠([SIII)Ljava/lang/String;

    invoke-static {p0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۡۥۤ۟(Ljava/lang/Object;)Landroidx/lifecycle/y0;

    move-result-object v1

    invoke-static {v1}, Lc1/ۣۡۢۦ;->ۨۨۥۣ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v0}, Landroid/support/v4/app/ۥۣۡ;->ۣۧۥۧ(Ljava/lang/Object;)V

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v6

    const/16 v7, 0x41

    sget v8, Lr9/۟ۢۢۤۨ;->۟ۥۡۥۦ:I

    xor-int/lit8 v8, v8, 0x49

    const/16 v9, 0x51a

    invoke-static {v6, v7, v8, v9}, Lv8/۟ۧۢ۟ۢ;->۠ۦۥۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v6, 0x1d

    sub-long/2addr v4, v6

    sub-long/2addr v4, v2

    const-wide/16 v6, 0x1d

    add-long/2addr v4, v6

    invoke-static {v0, v4, v5}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v4

    const/16 v5, 0x5a

    sget v6, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۢۦۦ:I

    xor-int/lit8 v6, v6, -0x48

    const/16 v7, 0xca2

    invoke-static {v4, v5, v6, v7}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۨۦۦ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v6

    invoke-static {v1}, Lc1/ۣۡۢۦ;->ۨۨۥۣ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۧۨۢۢ(Ljava/lang/Object;)V

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v5

    const/16 v10, 0x5c

    sget v11, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->ۣۣۡۢ:I

    xor-int/lit16 v11, v11, 0xe8

    const/16 v12, 0x1b5

    invoke-static {v5, v10, v11, v12}, Lh0/۟ۥ۟ۡۦ;->ۣۨ۟۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v10, 0xe

    sub-long/2addr v8, v10

    sub-long v6, v8, v6

    const-wide/16 v8, 0xe

    add-long/2addr v6, v8

    invoke-static {v0, v6, v7}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {v0, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v6

    invoke-static {v1}, Lc1/ۣۡۢۦ;->ۨۨۥۣ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v0}, Lk3/ۦ۠ۢۥ;->ۣۢۤۢ(Ljava/lang/Object;)V

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v8

    const/16 v9, 0x7e

    sget v10, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۦۣۢۢ:I

    xor-int/lit16 v10, v10, 0x1be

    const/16 v11, 0x42b

    invoke-static {v8, v9, v10, v11}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟ۥۡۤۦ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v8, 0x8

    sub-long/2addr v0, v8

    sub-long/2addr v0, v6

    const-wide/16 v6, 0x8

    add-long/2addr v0, v6

    invoke-static {v5, v0, v1}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {v5, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/ui/MainActivity;->۠ۥۢۦ()[S

    move-result-object v6

    const/16 v7, 0xa1

    sget v8, Lo5/۟ۧۡۧۦ;->۟ۡۥۣۨ:I

    xor-int/lit16 v8, v8, 0x309

    const/16 v9, 0x180

    invoke-static {v6, v7, v8, v9}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۤۥۢۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v6, 0x5

    add-long/2addr v0, v6

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x5

    sub-long/2addr v0, v2

    invoke-static {v5, v0, v1}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {v5, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lj6/ۣۦۢ۠;->ۦ۟ۦۤ()I

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
    const-string v0, "Q13PFMbxSkXMv6Fylw7"

    invoke-static {v0}, Lc3/۟ۡۧۢۥ;->ۦۣۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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
