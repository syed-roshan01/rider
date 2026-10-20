.class public final Lcom/auto/accept/service/BootReceiver;
.super Landroid/content/BroadcastReceiver;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/service/BootReceiver;->short:[S

    return-void

    :array_0
    .array-data 2
        0x751s
        0x75ds
        0x75cs
        0x746s
        0x757s
        0x74as
        0x746s
        0x854s
        0x853s
        0x849s
        0x858s
        0x853s
        0x849s
        0x756s
        0x759s
        0x753s
        0x745s
        0x758s
        0x75es
        0x753s
        0x719s
        0x75es
        0x759s
        0x743s
        0x752s
        0x759s
        0x743s
        0x719s
        0x756s
        0x754s
        0x743s
        0x75es
        0x758s
        0x759s
        0x719s
        0x775s
        0x778s
        0x778s
        0x763s
        0x768s
        0x774s
        0x778s
        0x77as
        0x767s
        0x77bs
        0x772s
        0x763s
        0x772s
        0x773s
        0x600s
        0x62ds
        0x62ds
        0x636s
        0x610s
        0x627s
        0x621s
        0x627s
        0x62bs
        0x634s
        0x627s
        0x630s
        0xb73s
        0xb5es
        0xb5es
        0xb45s
        0xb11s
        0xb52s
        0xb5es
        0xb5cs
        0xb41s
        0xb5ds
        0xb54s
        0xb45s
        0xb54s
        0xb55s
        0xb11s
        0xb1cs
        0xb11s
        0xb50s
        0xb52s
        0xb52s
        0xb54s
        0xb42s
        0xb42s
        0xb58s
        0xb53s
        0xb58s
        0xb5ds
        0xb58s
        0xb45s
        0xb48s
        0xb11s
        0xb42s
        0xb54s
        0xb43s
        0xb47s
        0xb58s
        0xb52s
        0xb54s
        0xb11s
        0xb43s
        0xb54s
        0xb42s
        0xb45s
        0xb50s
        0xb43s
        0xb45s
        0xb42s
        0xb11s
        0xb50s
        0xb44s
        0xb45s
        0xb5es
        0xb5cs
        0xb50s
        0xb45s
        0xb58s
        0xb52s
        0xb50s
        0xb5ds
        0xb5ds
        0xb48s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    invoke-static {}, Ln/۟۠ۥۥۨ;->ۢۡۧ۠()I

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
    const-string v0, "iVjHxGPyU6d36WHqP6XFHp"

    invoke-static {v0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۡۥ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟ۦ۟۠ۡ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۦ۟ۥۤ()I

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
    sget-object v0, Lcom/auto/accept/service/BootReceiver;->short:[S

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
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    invoke-static {}, Lcom/auto/accept/service/BootReceiver;->۟ۦ۟۠ۡ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Lu7/ۣ۟ۡ۟;->۟۠۠ۤۤ:I

    xor-int/lit16 v2, v2, -0x352

    const/16 v3, 0x732

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->۟ۧ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/BootReceiver;->۟ۦ۟۠ۡ()[S

    move-result-object v0

    const/4 v1, 0x7

    sget v2, Landroidx/compose/ui/draw/ۧۤۡۧ;->۟ۢۤ۟ۦ:I

    xor-int/lit16 v2, v2, 0x17d

    const/16 v3, 0x83d

    invoke-static {v0, v1, v2, v3}, La6/۟ۤۨۨ۟;->ۦۣ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Ld5/ۣۦۢۢ;->ۦۡ۠۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/BootReceiver;->۟ۦ۟۠ۡ()[S

    move-result-object v1

    const/16 v2, 0xd

    sget v3, Lg2/۟۠ۡۡۦ;->ۧۡۤ۠:I

    xor-int/lit16 v3, v3, 0x140

    const/16 v4, 0x737

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۣ۟۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {}, Lcom/auto/accept/service/BootReceiver;->۟ۦ۟۠ۡ()[S

    move-result-object v0

    const/16 v1, 0x31

    sget v2, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۤۥۤ:I

    xor-int/lit8 v2, v2, -0x62

    const/16 v3, 0x642

    invoke-static {v0, v1, v2, v3}, Le2/ۨۥ۠ۨ;->۟ۧ۠ۢۢ([SIII)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/BootReceiver;->۟ۦ۟۠ۡ()[S

    move-result-object v0

    const/16 v1, 0x3d

    sget v2, Lz/۟ۥۣۣ۠;->۟ۨۢۦ:I

    xor-int/lit16 v2, v2, -0x291

    const/16 v3, 0xb31

    invoke-static {v0, v1, v2, v3}, Lt1/ۧۦۤۧ;->ۣۧۢۥ([SIII)Ljava/lang/String;

    :sswitch_3
    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۣۤۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "Ntc5xBmj2gYpzO"

    invoke-static {v0}, Lh4/ۣ۟ۢۢۡ;->ۢۧۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

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
