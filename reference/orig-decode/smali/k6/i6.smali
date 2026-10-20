.class public final Lk6/i6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lk6/y5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa0

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/i6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x971s
        0x970s
        0x95fs
        0x97ds
        0x96as
        0x977s
        0x968s
        0x977s
        0x96as
        0x967s
        0x95ds
        0x96cs
        0x97bs
        0x97fs
        0x96as
        0x97bs
        0x97as
        0x770s
        0x77cs
        0x77es
        0x73ds
        0x772s
        0x77ds
        0x777s
        0x761s
        0x77cs
        0x77as
        0x777s
        0x73ds
        0x765s
        0x776s
        0x77ds
        0x777s
        0x77as
        0x77ds
        0x774s
        0x73ds
        0x761s
        0x776s
        0x775s
        0x776s
        0x761s
        0x761s
        0x772s
        0x77fs
        0x74cs
        0x766s
        0x761s
        0x77fs
        0x18as
        0x19es
        0x9ads
        0x9b9s
        0x9b8s
        0x9a3s
        0xbb9s
        0xbaes
        0xbads
        0xbaes
        0xbb9s
        0xbb9s
        0xbaes
        0xbb9s
        0x8d6s
        0x8eas
        0x8f0s
        0x8eds
        0x8f5s
        0x8e3s
        0x8e0s
        0x8ees
        0x8e7s
        0x8a2s
        0x8e1s
        0x8e3s
        0x8f7s
        0x8e5s
        0x8eas
        0x8f6s
        0x8a2s
        0x8ebs
        0x8ecs
        0x8a2s
        0x8eds
        0x8ecs
        0x8c3s
        0x8e1s
        0x8f6s
        0x8ebs
        0x8f4s
        0x8ebs
        0x8f6s
        0x8fbs
        0x8c1s
        0x8f0s
        0x8e7s
        0x8e3s
        0x8f6s
        0x8e7s
        0x8e6s
        0x30es
        0x303s
        0x4ebs
        0x4e4s
        0x4e8s
        0x4e0s
        0xcdbs
        0xcccs
        0xccfs
        0xcccs
        0xcdbs
        0xcdbs
        0xcccs
        0xcdbs
        0xcf6s
        0xcc7s
        0xcc8s
        0xcc4s
        0xcccs
        0x54es
        0x542s
        0x540s
        0x503s
        0x54as
        0x542s
        0x542s
        0x54as
        0x541s
        0x548s
        0x503s
        0x54cs
        0x55ds
        0x55ds
        0x572s
        0x540s
        0x548s
        0x54cs
        0x55es
        0x558s
        0x55fs
        0x548s
        0x540s
        0x548s
        0x543s
        0x559s
        0x503s
        0x55es
        0x54es
        0x55fs
        0x548s
        0x548s
        0x543s
        0x572s
        0x55es
        0x548s
        0x55fs
        0x55bs
        0x544s
        0x54es
        0x548s
    .end array-data
.end method

.method public constructor <init>(Lk6/y5;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/i6;->a:Lk6/y5;

    invoke-static {}, Ld5/ۣۦۢۢ;->ۤ۠ۧۤ()I

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
    const-string v0, "9R2byfulIjEDnJlCj9bUESY"

    invoke-static {v0}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۧۥۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۠ۡۨ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟۠ۥۨۢ()I

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
    sget-object v0, Lk6/i6;->short:[S

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
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    const/4 v2, 0x0

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v6

    :try_start_0
    invoke-static {v6}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v1

    const/4 v3, 0x0

    sget v4, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۤۦۨ:I

    xor-int/lit8 v4, v4, 0x78

    const/16 v5, 0x91e

    invoke-static {v1, v3, v4, v5}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->۟ۥۢۨ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lp8/۟۟ۢ۟ۢ;->ۦۢۦ۠(Ljava/lang/Object;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    invoke-static {v6}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۥۡ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    return-void

    :sswitch_3
    :try_start_1
    invoke-static {v1}, Lr5/ۣۢ۟ۦ;->۟ۥۣۥ۟(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v3

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v3, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {v3}, Lh5/ۢ۠۠۟;->ۡۦۤۡ(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    if-eqz v4, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_3

    :sswitch_9
    const v0, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_a
    const v0, 0xc984

    :goto_5
    const v4, 0xc995

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_b
    if-eqz v3, :cond_5

    const v0, 0xc9e1

    goto :goto_5

    :sswitch_c
    const v0, 0xbe9e

    goto :goto_4

    :catchall_0
    move-exception v0

    const v1, 0xbefb

    :goto_6
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    invoke-static {v6}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    invoke-static {v1, p1, p2}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۥۡ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v0

    :sswitch_e
    const v1, 0xbf1a

    goto :goto_6

    :catch_0
    move-exception v0

    const v1, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_f
    const v1, 0xc221

    goto :goto_7

    :sswitch_10
    :try_start_2
    invoke-static {v1}, Lf1/ۥۦ۟ۥ;->ۣ۠ۨۨ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v3

    const v0, 0xc27e

    :goto_8
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :cond_3
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_12
    if-eqz v3, :cond_3

    const v0, 0xc2db

    goto :goto_8

    :sswitch_13
    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v0

    const/16 v4, 0x11

    sget v5, Lc1/ۣ۟۠ۧۤ;->۟ۥ۟۟ۥ:I

    xor-int/lit16 v5, v5, -0x21c

    const/16 v7, 0x713

    invoke-static {v0, v4, v5, v7}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۡۤۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۠۟ۡ(Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xc2fa

    :goto_9
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_14
    if-nez v4, :cond_4

    const v0, 0xc5e2

    goto :goto_9

    :cond_4
    :sswitch_15
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_16
    invoke-static {v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۧ۟۟ۡ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v3

    const v0, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_17
    const v0, 0xc620

    goto :goto_a

    :sswitch_18
    const/4 v3, 0x0

    const v0, 0xc67d

    :goto_b
    const v4, 0xc68e

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_19
    const v0, 0xc69c

    goto :goto_b

    :cond_5
    :sswitch_1a
    const v0, 0xc9c2

    goto/16 :goto_5

    :sswitch_1b
    invoke-static {v3}, Lh5/ۢ۠۠۟;->ۡۦۤۡ(Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xca00

    :goto_c
    const v5, 0xca11

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :cond_6
    :sswitch_1c
    const v0, 0xca3e

    goto :goto_c

    :sswitch_1d
    if-nez v4, :cond_6

    const v0, 0xca5d

    goto :goto_c

    :sswitch_1e
    const v0, 0xca7c

    :goto_d
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_d

    :sswitch_1f
    const v0, 0xcd26

    goto :goto_d

    :sswitch_20
    invoke-static {v6}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    invoke-static {v1}, Lia/۟۠ۡۦ۟;->ۧۦ۠ۨ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_d

    goto :goto_e

    :sswitch_21
    if-eqz v1, :cond_7

    const v0, 0xcde0

    goto :goto_e

    :cond_7
    :sswitch_22
    const v0, 0xcdc1

    goto :goto_e

    :sswitch_23
    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v0

    const/16 v1, 0x31

    sget v4, Lg4/۠ۤۢۥ;->ۣۣ۟ۢۡ:I

    xor-int/lit16 v4, v4, -0xd3

    const/16 v5, 0x1ed

    invoke-static {v0, v1, v4, v5}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۣۣ۟ۤ۟([SIII)Ljava/lang/String;

    move-result-object v4

    :sswitch_24
    const v0, 0xcdff

    :goto_f
    const v1, 0xce10

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_f

    :sswitch_25
    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v0

    const/16 v1, 0x37

    sget v5, La8/ۣۡۨ۠;->ۣ۟ۧۢ۟:I

    xor-int/lit16 v5, v5, -0x1bd

    const/16 v7, 0xbcb

    invoke-static {v0, v1, v5, v7}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۦۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, La8/ۣۡۨ۠;->ۣ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v0, 0xd182

    :goto_10
    const v1, 0xd193

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_10

    :sswitch_26
    if-nez p2, :cond_8

    const v0, 0xd1df

    goto :goto_10

    :sswitch_27
    const v0, 0xce1e

    goto :goto_f

    :sswitch_28
    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v0

    const/16 v1, 0x33

    sget v4, La8/ۡۦۨۡ;->ۧۡۦۡ:I

    xor-int/lit16 v4, v4, 0x375

    const/16 v5, 0x9cc

    invoke-static {v0, v1, v4, v5}, Lh5/ۧ۟ۨۧ;->ۢ۟ۡۧ([SIII)Ljava/lang/String;

    move-result-object v4

    const v0, 0xd106

    :goto_11
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_11

    :sswitch_29
    const v0, 0xd125

    goto :goto_11

    :cond_8
    :sswitch_2a
    const v0, 0xd1c0

    goto :goto_10

    :sswitch_2b
    const/4 v2, 0x1

    :sswitch_2c
    const v0, 0xd1fe

    :goto_12
    const v1, 0xd20f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_11

    goto :goto_12

    :sswitch_2d
    const v0, 0xd4a8

    goto :goto_12

    :sswitch_2e
    const v0, 0xd505

    :goto_13
    const v1, 0xd516

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_12

    goto :goto_13

    :sswitch_2f
    const v0, 0xd524

    goto :goto_13

    :sswitch_30
    invoke-static {v6}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v7

    new-instance v0, Landroidx/fragment/app/h;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/h;-><init>(Lk6/i6;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v7, v0}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v6}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۥۡ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_31
    invoke-static {v6}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۥۡ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_32
    :try_start_3
    invoke-static {v6}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {v1}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v2

    const/16 v3, 0x3f

    sget v4, Ly/ۤۨۧ۟;->۟ۡ۟ۦ۠:I

    xor-int/lit8 v4, v4, -0x40

    const/16 v5, 0x882

    invoke-static {v2, v3, v4, v5}, Lm7/ۡۢۦۢ;->ۥ۟ۨ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v6}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۥۡ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

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
        0x1d7 -> :sswitch_10
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_10
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
        0x11 -> :sswitch_b
        0x36 -> :sswitch_1a
        0x57 -> :sswitch_31
        0x74 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_18
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_9
        0xf3 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1c
        0x11 -> :sswitch_1d
        0x2f -> :sswitch_20
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1f
        0x7ab -> :sswitch_31
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_21
        0x36 -> :sswitch_22
        0x55 -> :sswitch_28
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_25
        0x3ef -> :sswitch_27
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_2a
        0x4c -> :sswitch_2b
        0x53 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_29
        0x32 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_2d
        0x6a7 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2f
        0x32 -> :sswitch_2c
    .end sparse-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 4

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    invoke-static {v1}, Lr/۠ۡ۠;->ۣۣ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {v1}, Ls/ۣۡۡۧ;->ۧۦۣ۟(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v3

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
    if-ne p1, v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x0

    iput-object v0, v1, Lk6/p6;->g:Landroid/app/Activity;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const v1, 0xbe22

    goto :goto_2

    :sswitch_5
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_6
    const v0, 0xbebd

    goto :goto_3

    :sswitch_7
    if-nez v2, :cond_1

    const v0, 0xbedc

    goto :goto_3

    :sswitch_8
    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_9
    invoke-static {}, Lh1/۟۟ۨۦۦ;->ۣ۟ۢۡۥ()I

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_a
    if-ltz v1, :cond_2

    const v0, 0xc25f

    goto :goto_6

    :sswitch_b
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_c
    invoke-static {v1}, Lea/۟ۦۢۦۤ;->ۣ۟ۢۢۨ(Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0, p1}, Lw2/ۧۦۧ;->ۨۤۨۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_2
    :sswitch_d
    const v0, 0xc240

    goto :goto_6

    :sswitch_e
    const-string v0, "dhy6M5qfqIoY2"

    invoke-static {v0}, Ld5/ۣۦۢۢ;->۟ۦۣ۠ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_f
    return-void

    :sswitch_10
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

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
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_10
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0x2d -> :sswitch_c
        0x4c -> :sswitch_8
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_a
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_f
    .end sparse-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 8

    const/4 v7, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    invoke-static {v1}, Lr/۠ۡ۠;->ۣۣ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, v1, Lk6/p6;->k:Z

    const/4 v0, 0x1

    iput-boolean v0, v1, Lk6/p6;->h:Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v2

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v4

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
    if-nez v4, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    iput-object v7, v1, Lk6/p6;->c:Lk6/q6;

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    new-instance v4, Lk6/o0;

    invoke-direct {v4, v1, v2, v3, v5}, Lk6/o0;-><init>(Lk6/q3;JI)V

    invoke-static {v0, v4}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v1, p1}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۡۦۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    invoke-static {v1}, Lx7/۟ۤۡ۟ۦ;->۟ۥۦ۟ۧ(Ljava/lang/Object;)Lk6/q6;

    move-result-object v4

    iput-object v4, v1, Lk6/p6;->d:Lk6/q6;

    iput-object v7, v1, Lk6/p6;->c:Lk6/q6;

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v4

    new-instance v5, Lk6/c6;

    invoke-direct {v5, v1, v0, v2, v3}, Lk6/c6;-><init>(Lk6/p6;Lk6/q6;J)V

    invoke-static {v4, v5}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_5
    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۡۡ۠ۡ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v2

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    new-instance v4, Lk6/f7;

    invoke-direct {v4, v1, v2, v3, v6}, Lk6/f7;-><init>(Lk6/d7;JI)V

    invoke-static {v0, v4}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lv6/۟ۦۣۧۦ;->۟۟۠۟ۤ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const-string v0, "uHvHnQrVH7Z"

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->۟۟ۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_9
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

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

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 7

    const/4 v6, 0x1

    const/4 v5, 0x0

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۡۡ۠ۡ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v2

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    new-instance v4, Lk6/f7;

    invoke-direct {v4, v1, v2, v3, v6}, Lk6/f7;-><init>(Lk6/d7;JI)V

    invoke-static {v0, v4}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    invoke-static {v1}, Lr/۠ۡ۠;->ۣۣ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, v1, Lk6/p6;->k:Z

    invoke-static {v1}, Ls/ۣۡۡۧ;->ۧۦۣ۟(Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object v3

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
    if-eq p1, v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Lr/۠ۡ۠;->ۣۣ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object p1, v1, Lk6/p6;->g:Landroid/app/Activity;

    const/4 v0, 0x0

    iput-boolean v0, v1, Lk6/p6;->h:Z

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x0

    iput-object v0, v1, Lk6/p6;->i:Lk6/q6;

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    new-instance v3, Lk6/r6;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lk6/r6;-><init>(Lk6/p6;I)V

    invoke-static {v0, v3}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :sswitch_8
    const v1, 0xbe9e

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :sswitch_9
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_4

    :sswitch_b
    if-nez v2, :cond_2

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_c
    invoke-static {v1}, Le0/ۦۣ۟۠;->۟۠ۤۡ۠(Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    iput-object v0, v1, Lk6/p6;->c:Lk6/q6;

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    new-instance v2, Lk6/r6;

    invoke-direct {v2, v1, v5}, Lk6/r6;-><init>(Lk6/p6;I)V

    invoke-static {v0, v2}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_d
    const v0, 0xc221

    goto :goto_5

    :sswitch_e
    invoke-static {v1, p1}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۡۦۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Lk6/q6;

    move-result-object v0

    invoke-static {v1, p1, v0, v5}, Li5/ۢۤۡ;->ۤۨۨۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۧۡ۟ۨ(Ljava/lang/Object;)Lk6/q;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v2

    invoke-static {v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    new-instance v4, Lk6/o0;

    invoke-direct {v4, v1, v2, v3, v5}, Lk6/o0;-><init>(Lk6/q3;JI)V

    invoke-static {v0, v4}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
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
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_b
        0x7eef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_f
    .end sparse-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 6

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦ۟۟(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Ll8/ۢۦۥۢ;->۠ۢۧ(Ljava/lang/Object;)Lk6/p6;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

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
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-nez p2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    return-void

    :sswitch_9
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_a
    invoke-static {v1}, Lea/۟ۦۢۦۤ;->ۣ۟ۢۢۨ(Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0, p1}, Lx2/۟ۢۥ;->۟ۦۦۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/q6;

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v1, 0xbf39

    goto :goto_5

    :sswitch_c
    if-nez v0, :cond_2

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_d
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const v0, 0xc221

    goto :goto_6

    :sswitch_f
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v2

    const/16 v3, 0x64

    sget v4, Lq1/۠۠ۤ;->ۣۣ۟ۡۤ:I

    xor-int/lit8 v4, v4, -0x38

    const/16 v5, 0x367

    invoke-static {v2, v3, v4, v5}, Lg7/۠ۤۧ;->۟ۤ۠ۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lw5/ۣۨۧ۠;->ۥ۟ۡ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Lz7/۠ۡ۟ۦ;->ۥۢۧۥ(Ljava/lang/Object;Ljava/lang/Object;J)V

    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v2

    const/16 v3, 0x66

    sget v4, Lv5/ۧۥۢۡ;->ۣۧ۟ۨ:I

    xor-int/lit16 v4, v4, 0x239

    const/16 v5, 0x485

    invoke-static {v2, v3, v4, v5}, Ls0/ۧۧۨۥ;->۟۠ۡ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ld2/۟ۦۡ۟ۦ;->ۣ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣۣ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v2

    const/16 v3, 0x6a

    sget v4, Landroidx/startup/ۨۤ۟ۡ;->ۤۢۢۥ:I

    xor-int/lit16 v4, v4, 0x3c2

    const/16 v5, 0xca9

    invoke-static {v2, v3, v4, v5}, Landroid/support/v4/app/ۥۣۡ;->ۣ۠ۧۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lt7/۟ۡ۠ۨ۟;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣۣ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lk6/i6;->ۣ۟۠ۡۨ()[S

    move-result-object v0

    const/16 v2, 0x77

    sget v3, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۨۧۨ:I

    xor-int/lit16 v3, v3, 0x36d

    const/16 v4, 0x52d

    invoke-static {v0, v2, v3, v4}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣ۟۠ۨۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, v1}, La3/۟ۢۨۢۥ;->ۡۡۨۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4

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
        0x36 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_8
    .end sparse-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lh8/۟ۤۨۨۦ;->ۧۡۤۧ()I

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
    const-string v0, "pNJE2zwGx"

    invoke-static {v0}, Ld7/ۢۧۧۢ;->ۣ۟ۢۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lj5/۟ۢۥۨۦ;->۟۠ۦ۟ۡ()I

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
    const-string v0, "R8kK3R5gNVrc9023xFOE7xcFHRPM"

    invoke-static {v0}, Lx7/۟۟ۦۨۡ;->ۣ۠ۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
