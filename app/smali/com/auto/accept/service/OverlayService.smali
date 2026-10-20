.class public final Lcom/auto/accept/service/OverlayService;
.super Landroid/app/Service;


# static fields
.field public static final $stable:I = 0x8

.field private static final CHANNEL_ID:Ljava/lang/String;

.field public static final Companion:Lb5/d;

.field private static final NOTIFICATION_ID:I = 0x3e9

.field private static final TAG:Ljava/lang/String;

.field private static final short:[S


# instance fields
.field private connectivityManager:Landroid/net/ConnectivityManager;

.field private final fareReceiver:Lb5/e;

.field private fareText:Landroid/widget/TextView;

.field private initialTouchX:F

.field private initialTouchY:F

.field private initialX:I

.field private initialY:I

.field private networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

.field private networkStatusText:Landroid/widget/TextView;

.field private overlayView:Landroid/view/View;

.field private statusText:Landroid/widget/TextView;

.field private stopButton:Landroid/widget/TextView;

.field private windowManager:Landroid/view/WindowManager;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x244

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/service/OverlayService;->short:[S

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/annotation/۟ۦۤ۟ۤ;->ۢۥۡۧ:I

    xor-int/lit8 v2, v2, -0x45

    const/16 v3, 0x80f

    invoke-static {v0, v1, v2, v3}, Lq2/ۣ۟ۢۥ۠;->۠ۨۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/OverlayService;->CHANNEL_ID:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0xf

    sget v2, Ll3/ۥۣۤ۟;->ۧۥۤۢ:I

    xor-int/lit8 v2, v2, 0x37

    const/16 v3, 0xa0b

    invoke-static {v0, v1, v2, v3}, Lv/ۣۢ۟ۧ;->ۣۤۨۢ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/OverlayService;->TAG:Ljava/lang/String;

    new-instance v0, Lb5/d;

    invoke-direct {v0}, Lb5/d;-><init>()V

    sput-object v0, Lcom/auto/accept/service/OverlayService;->Companion:Lb5/d;

    return-void

    :array_0
    .array-data 2
        0x860s
        0x879s
        0x86as
        0x87ds
        0x863s
        0x86es
        0x876s
        0x850s
        0x86cs
        0x867s
        0x86es
        0x861s
        0x861s
        0x86as
        0x863s
        0xa44s
        0xa7ds
        0xa6es
        0xa79s
        0xa67s
        0xa6as
        0xa72s
        0xa58s
        0xa6es
        0xa79s
        0xa7ds
        0xa62s
        0xa68s
        0xa6es
        0x32cs
        0x335s
        0x326s
        0x331s
        0x32fs
        0x322s
        0x33as
        0x31cs
        0x320s
        0x32bs
        0x322s
        0x32ds
        0x32ds
        0x326s
        0x32fs
        0x213s
        0x228s
        0x225s
        0x224s
        0x261s
        0x200s
        0x222s
        0x222s
        0x224s
        0x231s
        0x235s
        0x224s
        0x233s
        0x261s
        0x200s
        0x222s
        0x235s
        0x228s
        0x237s
        0x224s
        0x88as
        0x8a8s
        0x8a9s
        0x8aes
        0x8b3s
        0x8a8s
        0x8b5s
        0x8aes
        0x8a9s
        0x8a0s
        0x8e7s
        0x8a1s
        0x8a8s
        0x8b5s
        0x8e7s
        0x8b5s
        0x8aes
        0x8a3s
        0x8a2s
        0x8e7s
        0x8b5s
        0x8a2s
        0x8b6s
        0x8b2s
        0x8a2s
        0x8b4s
        0x8b3s
        0x8b4s
        0x4d2s
        0x4c5s
        0x4d9s
        0x4dcs
        0x4d4s
        0x498s
        0x49es
        0x49es
        0x49es
        0x499s
        0xaeas
        0xad1s
        0xadcs
        0xadds
        0xa98s
        0xaf9s
        0xadbs
        0xadbs
        0xadds
        0xac8s
        0xaccs
        0xadds
        0xacas
        0xa98s
        0xaf7s
        0xaces
        0xadds
        0xacas
        0xad4s
        0xad9s
        0xac1s
        0x1c0s
        0x1d9s
        0x1cas
        0x1dds
        0x1c3s
        0x1ces
        0x1d6s
        0x1f0s
        0x1ccs
        0x1c7s
        0x1ces
        0x1c1s
        0x1c1s
        0x1cas
        0x1c3s
        0x5d5s
        0x5ees
        0x5e9s
        0x5f1s
        0x5f5s
        0x5a6s
        0x5f2s
        0x5ees
        0x5e3s
        0x5a6s
        0x5e0s
        0x5eas
        0x5e9s
        0x5e7s
        0x5f2s
        0x5efs
        0x5e8s
        0x5e1s
        0x5a6s
        0x5e9s
        0x5f0s
        0x5e3s
        0x5f4s
        0x5eas
        0x5e7s
        0x5ffs
        0x5a6s
        0x5f1s
        0x5efs
        0x5e2s
        0x5e1s
        0x5e3s
        0x5f2s
        0x8cds
        0x8f4s
        0x8e7s
        0x8f0s
        0x8ees
        0x8e3s
        0x8fbs
        0x8d1s
        0x8e7s
        0x8f0s
        0x8f4s
        0x8ebs
        0x8e1s
        0x8e7s
        0x2c4s
        0x2ffs
        0x2f2s
        0x2f3s
        0x2b6s
        0x2d7s
        0x2f5s
        0x2f5s
        0x2f3s
        0x2e6s
        0x2e2s
        0x2f3s
        0x2e4s
        -0x2551s
        -0x2290s
        0x2b2s
        0x2d3s
        0x2d1s
        0x2c6s
        0x2dbs
        0x2c4s
        0x2d7s
        0x2258s
        0x22f5s
        0x241as
        0x7c3s
        0x7b0s
        0x7b7s
        0x7acs
        0x7b3s
        0x2c37s
        0xb02s
        0xb61s
        0xb4es
        0xb4ds
        0xb51s
        0xb47s
        0x760s
        0x759s
        0x74as
        0x75ds
        0x743s
        0x74es
        0x756s
        0x70fs
        0x759s
        0x746s
        0x74as
        0x758s
        0x70fs
        0x74es
        0x74bs
        0x74bs
        0x74as
        0x74bs
        0x3afs
        0x388s
        0x380s
        0x385s
        0x38cs
        0x38ds
        0x3c9s
        0x39ds
        0x386s
        0x3c9s
        0x388s
        0x38ds
        0x38ds
        0x3c9s
        0x386s
        0x39fs
        0x38cs
        0x39bs
        0x385s
        0x388s
        0x390s
        0x3d3s
        0x3c9s
        0xa3es
        0xa22s
        0xa23s
        0xa39s
        0xa6es
        0xa7as
        0x13ds
        0x121s
        0x120s
        0x13as
        0x16ds
        0x179s
        0x513s
        0x547s
        0x556s
        0x545s
        0x556s
        0x55as
        0x544s
        0x4e3s
        0x4ffs
        0x4fes
        0x4e4s
        0x4b3s
        0x4a7s
        0x5d9s
        0x5cfs
        0x5d8s
        0x5dcs
        0x5c3s
        0x5c9s
        0x5cfs
        0x5f5s
        0x5cfs
        0x5c4s
        0x5cbs
        0x5c8s
        0x5c6s
        0x5cfs
        0x5ces
        0x1eds
        0x1e1s
        0x1e3s
        0x1a0s
        0x1efs
        0x1fbs
        0x1fas
        0x1e1s
        0x1a0s
        0x1efs
        0x1eds
        0x1eds
        0x1ebs
        0x1fes
        0x1fas
        0x1a0s
        0x1c8s
        0x1cfs
        0x1dcs
        0x1cbs
        0x1d1s
        0x1cas
        0x1cbs
        0x1das
        0x1cbs
        0x1cds
        0x1das
        0x1cbs
        0x1cas
        0x625s
        0x629s
        0x62bs
        0x668s
        0x627s
        0x633s
        0x632s
        0x629s
        0x668s
        0x627s
        0x625s
        0x625s
        0x623s
        0x636s
        0x632s
        0x668s
        0x615s
        0x603s
        0x614s
        0x610s
        0x60fs
        0x605s
        0x603s
        0x619s
        0x615s
        0x612s
        0x607s
        0x612s
        0x613s
        0x615s
        -0x2ec9s
        -0x2918s
        0x92as
        0x94bs
        0x949s
        0x95es
        0x943s
        0x95cs
        0x94fs
        -0x2dd1s
        -0x28das
        0xa32s
        0xa5ds
        0xa54s
        0xa54s
        0x2603s
        0x5das
        0x5a9s
        0x5aes
        0x5b5s
        0x5aas
        0x212ds
        0x4bbs
        0x4c8s
        0x4cfs
        0x4das
        0x4c9s
        0x4cfs
        0xba5s
        0xb9cs
        0xb8fs
        0xb98s
        0xb86s
        0xb8bs
        0xb93s
        0xbb9s
        0xb8fs
        0xb98s
        0xb9cs
        0xb83s
        0xb89s
        0xb8fs
        0x95es
        0x967s
        0x974s
        0x963s
        0x97ds
        0x970s
        0x968s
        0x931s
        0x962s
        0x974s
        0x963s
        0x967s
        0x978s
        0x972s
        0x974s
        0x931s
        0x972s
        0x963s
        0x974s
        0x970s
        0x965s
        0x974s
        0x975s
        0x1e3s
        0x1fds
        0x1fas
        0x1f0s
        0x1fbs
        0x1e3s
        0xc7es
        0xc65s
        0xc7cs
        0xc7cs
        0xc30s
        0xc73s
        0xc71s
        0xc7es
        0xc7es
        0xc7fs
        0xc64s
        0xc30s
        0xc72s
        0xc75s
        0xc30s
        0xc73s
        0xc71s
        0xc63s
        0xc64s
        0xc30s
        0xc64s
        0xc7fs
        0xc30s
        0xc7es
        0xc7fs
        0xc7es
        0xc3ds
        0xc7es
        0xc65s
        0xc7cs
        0xc7cs
        0xc30s
        0xc64s
        0xc69s
        0xc60s
        0xc75s
        0xc30s
        0xc71s
        0xc7es
        0xc74s
        0xc62s
        0xc7fs
        0xc79s
        0xc74s
        0xc3es
        0xc66s
        0xc79s
        0xc75s
        0xc67s
        0xc3es
        0xc47s
        0xc79s
        0xc7es
        0xc74s
        0xc7fs
        0xc67s
        0xc5ds
        0xc71s
        0xc7es
        0xc71s
        0xc77s
        0xc75s
        0xc62s
        0x555s
        0x543s
        0x554s
        0x550s
        0x54fs
        0x545s
        0x543s
        0x579s
        0x543s
        0x548s
        0x547s
        0x544s
        0x54as
        0x543s
        0x542s
        0x201s
        0x238s
        0x22bs
        0x23cs
        0x222s
        0x22fs
        0x237s
        0x21ds
        0x22bs
        0x23cs
        0x238s
        0x227s
        0x22ds
        0x22bs
        0x2acs
        0x283s
        0x28as
        0x28es
        0x281s
        0x29as
        0x29fs
        0x2cfs
        0x28as
        0x29ds
        0x29ds
        0x280s
        0x29ds
        0x2d5s
        0x2cfs
        0x6bfs
        0x686s
        0x695s
        0x682s
        0x69cs
        0x691s
        0x689s
        0x6d0s
        0x683s
        0x695s
        0x682s
        0x686s
        0x699s
        0x693s
        0x695s
        0x6d0s
        0x694s
        0x695s
        0x683s
        0x684s
        0x682s
        0x69fs
        0x689s
        0x695s
        0x694s
        0x81bs
        0x80ds
        0x81as
        0x81es
        0x801s
        0x80bs
        0x80ds
        0x837s
        0x80ds
        0x806s
        0x809s
        0x80as
        0x804s
        0x80ds
        0x80cs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lb5/e;

    invoke-direct {v0, p0}, Lb5/e;-><init>(Lcom/auto/accept/service/OverlayService;)V

    iput-object v0, p0, Lcom/auto/accept/service/OverlayService;->fareReceiver:Lb5/e;

    invoke-static {}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۢ۠ۧۦ()I

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
    const-string v0, "FZW9"

    invoke-static {v0}, Lz1/۟ۦ۟۠۟;->ۢۡۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static synthetic a(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/auto/accept/service/OverlayService;->۟ۦۢ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getFareText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣۣۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getNetworkStatusText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۥۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$updateStatusDisplay(Lcom/auto/accept/service/OverlayService;Z)V
    .locals 3

    invoke-static {p0, p1}, Lcom/auto/accept/service/OverlayService;->۟ۦۡۥۣ(Ljava/lang/Object;Z)V

    invoke-static {}, Landroidx/fragment/app/ۣۣۣۨ;->ۣۣۣ۟ۥ()I

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
    const-string v0, "YTbbr5BId7gbpS6Hwotczsc"

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟ۥۡۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static synthetic b(Lcom/auto/accept/service/OverlayService;Landroid/view/WindowManager$LayoutParams;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-static {p0, p1, p2, p3}, Lcom/auto/accept/service/OverlayService;->ۨۨۨۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final buildNotification()Landroid/app/Notification;
    .locals 14

    const/4 v12, 0x0

    const/4 v1, 0x0

    const-string v10, "\u06e8\u06e4\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move-object v9, v1

    move v11, v12

    move v13, v12

    :goto_0
    invoke-static {v10}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v11, v13, -0x12e

    const/16 v1, 0x5c

    const/16 v8, 0x4b0

    invoke-static {v9, v1, v11, v8}, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟ۥۥۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v10, "\u06e5\u06e0"

    move-object v8, v1

    goto :goto_0

    :sswitch_0
    const/high16 v1, 0x7f0c0000

    iput v1, v7, Landroid/app/Notification;->icon:I

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    const-string v10, "\u06e4\u06e6\u06e4"

    move-object v9, v1

    goto :goto_0

    :sswitch_1
    iput-object v2, v0, Lq2/x;->f:Ljava/lang/CharSequence;

    sget v13, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟ۤ۟ۦ:I

    const-string v1, "\u06e2\u06e1\u06e1"

    move-object v10, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v13, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۣ۟ۨ۟:I

    const-string v10, "\u06e7\u06e1\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    const/4 v1, -0x1

    iput v1, v0, Lq2/x;->j:I

    const-class v1, Lcom/auto/accept/ui/MainActivity;

    const-string v10, "\u06e2\u06e4\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    sget v13, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۧ۟ۢ:I

    const-string v10, "\u06df\u06df\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_5
    iput-object v5, v0, Lq2/x;->e:Ljava/lang/CharSequence;

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    const-string v10, "\u06e5\u06e1\u06e4"

    move-object v9, v1

    goto :goto_0

    :sswitch_6
    sget v13, Ln/ۣۣۢۢ;->ۧۡۦ۟:I

    xor-int/lit8 v11, v13, 0x3d

    const-string v1, "\u06e3\u06df"

    move-object v10, v1

    goto :goto_0

    :sswitch_7
    new-instance v0, Lq2/x;

    invoke-direct {v0, p0, v8}, Lq2/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۥۢۦۣ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v1

    const-string v10, "\u06df\u06e8\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    sget v13, Lea/ۦۦۨۨ;->۟۠ۧ۠۟:I

    xor-int/lit16 v11, v13, 0x2ea

    const-string v1, "\u06df\u06e5\u06e7"

    move-object v10, v1

    goto :goto_0

    :sswitch_9
    xor-int/lit16 v11, v13, 0x188

    const/4 v1, 0x1

    invoke-static {v0, v11, v1}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۤ۠ۨۥ(Ljava/lang/Object;IZ)V

    const-string v1, "\u06e6\u06e0\u06e4"

    move-object v10, v1

    goto :goto_0

    :sswitch_a
    iput-object v3, v0, Lq2/x;->g:Landroid/app/PendingIntent;

    invoke-static {v0}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۣ۟۟ۦۤ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v1

    const-string v10, "\u06e6\u06df\u06df"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_b
    xor-int/lit16 v11, v13, -0x283

    const/16 v1, 0x1d

    const/16 v8, 0x343

    invoke-static {v9, v1, v11, v8}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۣ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v10, "\u06e3\u06e2\u06e8"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x2c

    const/16 v5, 0x241

    invoke-static {v9, v1, v11, v5}, Lj4/ۣۧۤ;->۟ۥۦۡۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lx0/ۣ۠۟۠;->ۣۡۨۥ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    const-string v10, "\u06e8\u06e6\u06e6"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_d
    invoke-static {v7, v8}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v7

    :sswitch_e
    const/16 v1, 0x40

    const/16 v2, 0x8c7

    invoke-static {v9, v1, v11, v2}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->۟۟ۧۧۨ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lx0/ۣ۠۟۠;->ۣۡۨۥ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    const-string v10, "\u06e0\u06e6\u06e2"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    sget v13, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۥۧۥۢ:I

    const-string v10, "\u06df\u06df"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_10
    const v1, 0x4000043

    xor-int v11, v1, v13

    invoke-static {p0, v12, v6, v11}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۦ۠ۤۤ(Ljava/lang/Object;ILjava/lang/Object;I)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v10, "\u06e7\u06e7\u06e2"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc5c -> :sswitch_e
        0xdc9b -> :sswitch_d
        0x1aa700 -> :sswitch_b
        0x1aa7c1 -> :sswitch_c
        0x1aa818 -> :sswitch_0
        0x1aab9c -> :sswitch_1
        0x1ab282 -> :sswitch_9
        0x1ab2dd -> :sswitch_2
        0x1ab669 -> :sswitch_7
        0x1abaa2 -> :sswitch_8
        0x1abdc8 -> :sswitch_6
        0x1ac146 -> :sswitch_f
        0x1ac16a -> :sswitch_3
        0x1ac547 -> :sswitch_10
        0x1ac602 -> :sswitch_a
        0x1ac96b -> :sswitch_4
        0x1ac9a8 -> :sswitch_5
    .end sparse-switch
.end method

.method public static synthetic c(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/auto/accept/service/OverlayService;->۟ۡۤۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final createNotificationChannel()V
    .locals 13

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v8, "\u06e3\u06e2\u06e4"

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, v0

    move-object v6, v0

    move-object v7, v0

    move v9, v10

    move v11, v10

    move v12, v10

    :goto_0
    invoke-static {v8}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    new-instance v0, Landroid/app/NotificationChannel;

    invoke-direct {v0, v6, v3, v9}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v8, "\u06e7\u06e4\u06e7"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v11, v12, -0x377

    const-string v0, "\u06e3\u06e4\u06e7"

    move-object v8, v0

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x66

    const/16 v3, 0xab8

    invoke-static {v7, v0, v9, v3}, Lk7/۟ۤۥۡ;->ۢۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v8, "\u06e6\u06df\u06e0"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    const-class v0, Landroid/app/NotificationManager;

    const-string v8, "\u06e2\u06e1\u06e8"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const-string v8, "\u06e7\u06e2\u06e7"

    move-object v7, v0

    goto :goto_0

    :sswitch_4
    invoke-static {v5, v4}, Le9/ۧۧۡ;->ۧ۟۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e0\u06e3\u06e5"

    move-object v8, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v2}, Lr6/۟ۡ۠۟ۡ;->ۦۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e7\u06e7\u06e7"

    move-object v8, v0

    goto :goto_0

    :sswitch_6
    invoke-static {v4, v10}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->۟۠۠ۤۨ(Ljava/lang/Object;Z)V

    const-string v0, "\u06e0\u06e4\u06e1"

    move-object v8, v0

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v9, v12, -0x175

    const-string v0, "\u06e2\u06e6\u06e6"

    move-object v8, v0

    goto :goto_0

    :sswitch_8
    sget v12, Lv5/ۥۧ۟ۦ;->۠۟ۨۢ:I

    const-string v0, "\u06e4\u06e7\u06e1"

    move-object v8, v0

    goto :goto_0

    :sswitch_9
    sget v12, Lz1/۟ۦ۟۠۟;->ۢۥۦۢ:I

    const-string v0, "\u06e4\u06e6\u06e4"

    move-object v8, v0

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const-string v8, "\u06e6\u06e0\u06e7"

    move-object v7, v0

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v11, v12, -0x304

    const-string v0, "\u06e7\u06e0\u06df"

    move-object v8, v0

    goto :goto_0

    :sswitch_c
    invoke-static {v4, v6}, Lcom/google/firebase/annotations/ۣۢۢۦ;->ۣ۟ۢ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e8\u06df\u06e6"

    move-object v8, v0

    goto :goto_0

    :sswitch_d
    sget v12, Lc3/۟ۥ۠ۡۧ;->ۣ۟ۢۥۢ:I

    const-string v0, "\u06e2\u06e4\u06e8"

    move-object v8, v0

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v9, v12, -0x321

    const-string v0, "\u06e3\u06e7\u06e3"

    move-object v8, v0

    goto :goto_0

    :sswitch_f
    const/16 v0, 0x7b

    const/16 v6, 0x1af

    invoke-static {v7, v0, v11, v6}, Ld9/ۡۥۣۡ;->ۥۧۡۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v8, "\u06df\u06e6\u06e1"

    move-object v6, v0

    goto/16 :goto_0

    :sswitch_10
    const/16 v0, 0x8a

    const/16 v6, 0x586

    invoke-static {v7, v0, v11, v6}, Lk4/۟۠ۦ۟ۤ;->۟۟ۥۦۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v8, "\u06e2\u06e5\u06e6"

    move-object v6, v0

    goto/16 :goto_0

    :sswitch_11
    sget v12, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۣۣ:I

    const-string v0, "\u06e4\u06df\u06e7"

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_12
    move-object v0, v1

    check-cast v0, Landroid/app/NotificationManager;

    const-string v8, "\u06e6\u06df\u06e4"

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const-string v8, "\u06e0\u06e1\u06e2"

    move-object v7, v0

    goto/16 :goto_0

    :sswitch_14
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aab01 -> :sswitch_d
        0x1aab42 -> :sswitch_14
        0x1aab5d -> :sswitch_2
        0x1ab289 -> :sswitch_5
        0x1ab2e6 -> :sswitch_e
        0x1ab303 -> :sswitch_c
        0x1ab322 -> :sswitch_a
        0x1ab665 -> :sswitch_13
        0x1ab6a6 -> :sswitch_10
        0x1ab6ff -> :sswitch_1
        0x1ab9cc -> :sswitch_7
        0x1abaa2 -> :sswitch_b
        0x1ababe -> :sswitch_0
        0x1ac147 -> :sswitch_11
        0x1ac14b -> :sswitch_4
        0x1ac16d -> :sswitch_9
        0x1ac526 -> :sswitch_f
        0x1ac56c -> :sswitch_8
        0x1ac5aa -> :sswitch_3
        0x1ac607 -> :sswitch_12
        0x1ac8cf -> :sswitch_6
    .end sparse-switch
.end method

.method private final createOverlayView()V
    .locals 13

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0xab

    sget v2, Ld7/ۢۧۧۢ;->۟ۢۧۤۦ:I

    xor-int/lit8 v2, v2, -0x73

    const/16 v3, 0x882

    invoke-static {v0, v1, v2, v3}, Lq2/ۣ۟ۢۥ۠;->۠ۨۥۡ([SIII)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    const/16 v3, 0x7f6

    const/16 v4, 0x108

    sget v5, Lz7/۟ۢۧۡۥ;->ۧۡۦۧ:I

    xor-int/lit16 v5, v5, 0x210

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/16 v1, 0x14

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    const/16 v1, 0xc8

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v2, v1}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->۟ۡۤۢۧ(Ljava/lang/Object;I)V

    sget v1, Lv7/ۤۦۧ۟;->۠ۡ۟:I

    xor-int/lit16 v1, v1, 0x178

    sget v3, Lz/ۨۤۥۨ;->ۡۡۧۤ:I

    xor-int/lit16 v3, v3, -0x231

    invoke-static {v2, v3, v1, v3, v1}, Ln9/ۤۧۧۤ;->ۣۣ۟ۨۢ(Ljava/lang/Object;IIII)V

    const v1, -0x19eee789

    sget v4, Lr9/۟ۢۢۤۨ;->۟ۥۡۥۦ:I

    xor-int/2addr v1, v4

    invoke-static {v2, v1}, Lx7/۟۟ۦۨۡ;->ۢۦۧ۟(Ljava/lang/Object;I)V

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v2, v1}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->۠ۦۡ(Ljava/lang/Object;F)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v4

    const/16 v5, 0xb9

    sget v7, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۣ۟ۤۡۧ:I

    xor-int/lit16 v7, v7, -0xa6

    const/16 v8, 0x296

    invoke-static {v4, v5, v7, v8}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣۣۨۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x1f184b

    sget v5, Landroidx/annotation/۟ۦۤ۟ۤ;->ۢۥۡۧ:I

    xor-int/2addr v4, v5

    invoke-static {v1, v4}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v1, v4}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۦۦۣۨ(Ljava/lang/Object;F)V

    invoke-static {}, Lp4/ۣ۟۟ۢۥ;->۟ۦۤۨۢ()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۥۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Lb7/ۣ۟۟ۦ۟;->ۢۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v5

    const/16 v7, 0xc6

    sget v8, Le1/ۦۣۢۥ;->ۣۣ۟ۧۥ:I

    xor-int/lit16 v8, v8, -0x36b

    const/16 v9, 0x292

    invoke-static {v5, v7, v8, v9}, Lq0/ۥۣۡۧ;->۟ۤۨۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, -0xb35249

    sget v7, Lj6/ۣۦۢ۠;->۟۠ۢۡۦ:I

    xor-int/2addr v5, v7

    invoke-static {v1, v5}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    const/high16 v5, 0x41300000    # 11.0f

    invoke-static {v1, v5}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۦۦۣۨ(Ljava/lang/Object;F)V

    iput-object v1, p0, Lcom/auto/accept/service/OverlayService;->statusText:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lb7/ۣ۟۟ۦ۟;->ۢۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, -0xa817

    sget v7, Lx4/ۣۡۢ۠;->۟ۤۤۧۤ:I

    xor-int/2addr v5, v7

    invoke-static {v1, v5}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    const/high16 v7, 0x41100000    # 9.0f

    invoke-static {v1, v7}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۦۦۣۨ(Ljava/lang/Object;F)V

    sget v7, Ld1/ۣۧۡۡ;->ۧ۠ۦۣ:I

    xor-int/lit16 v7, v7, 0xc4

    invoke-static {v1, v7}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۣ۟ۡۧۡ(Ljava/lang/Object;I)V

    iput-object v1, p0, Lcom/auto/accept/service/OverlayService;->networkStatusText:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lb7/ۣ۟۟ۦ۟;->ۢۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v8

    const/16 v9, 0xcf

    sget v10, Ld9/ۧۧۨۥ;->۟ۥۧۤ۠:I

    xor-int/lit16 v10, v10, -0x98

    const/16 v11, 0x2e1

    invoke-static {v8, v9, v10, v11}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۢ۟۟ۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v8, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۧ۟ۤ:I

    xor-int/lit16 v8, v8, -0x301

    invoke-static {v1, v8}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    const/high16 v9, 0x41900000    # 18.0f

    invoke-static {v1, v9}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۦۦۣۨ(Ljava/lang/Object;F)V

    invoke-static {v1, v4}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۥۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/auto/accept/service/OverlayService;->fareText:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lb7/ۣ۟۟ۦ۟;->ۢۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v9

    const/16 v10, 0xd1

    sget v11, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۦۣۧ:I

    xor-int/lit16 v11, v11, 0xe3

    const/16 v12, 0x7e3

    invoke-static {v9, v10, v11, v12}, Lz2/ۢۨۨۦ;->۟۠ۢۡۨ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v8}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    const/high16 v9, 0x41300000    # 11.0f

    invoke-static {v1, v9}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۦۦۣۨ(Ljava/lang/Object;F)V

    invoke-static {v1, v4}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۥۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v5}, Lx7/۟۟ۦۨۡ;->ۢۦۧ۟(Ljava/lang/Object;I)V

    invoke-static {v1, v3, v7, v3, v7}, Lq9/۟ۧۦۤۨ;->ۡۦ۟(Ljava/lang/Object;IIII)V

    sget v3, Ly6/۟ۤۥۥۥ;->ۣۤ۟ۧ:I

    xor-int/lit16 v3, v3, 0x18c

    invoke-static {v1, v3}, Lr4/۟ۦۦ۠ۥ;->ۤۡ۟ۢ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    sget v5, Li9/ۨۨ۟;->ۣ۟۠ۡۤ:I

    xor-int/lit16 v5, v5, 0x269

    invoke-direct {v4, v8, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static {v1, v4}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->ۥۣۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lb5/b;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lb5/b;-><init>(Lcom/auto/accept/service/OverlayService;I)V

    invoke-static {v1, v4}, Lfa/ۣ۟ۥۤ;->ۣ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/auto/accept/service/OverlayService;->stopButton:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lb7/ۣ۟۟ۦ۟;->ۢۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v4

    const/16 v5, 0xd7

    sget v8, Li/ۢۥۣ۟;->ۡۤۧۥ:I

    xor-int/lit16 v8, v8, 0x205

    const/16 v9, 0xb22

    invoke-static {v4, v5, v8, v9}, Lj2/۠ۤۨۤ;->۟۟ۥۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x635c5e

    sget v5, Lq5/۟ۥۣۢۨ;->ۦۣۤ:I

    xor-int/2addr v4, v5

    invoke-static {v1, v4}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    const/high16 v4, 0x41100000    # 9.0f

    invoke-static {v1, v4}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۦۦۣۨ(Ljava/lang/Object;F)V

    invoke-static {v1, v3}, Lr4/۟ۦۦ۠ۥ;->ۤۡ۟ۢ(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v3, v7, v4, v5}, Lq9/۟ۧۦۤۨ;->ۡۦ۟(Ljava/lang/Object;IIII)V

    new-instance v3, Lb5/b;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lb5/b;-><init>(Lcom/auto/accept/service/OverlayService;I)V

    invoke-static {v1, v3}, Lfa/ۣ۟ۥۤ;->ۣ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Lb7/ۣ۟۟ۦ۟;->ۢۡۦۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lb5/c;

    invoke-direct {v1, p0, v0}, Lb5/c;-><init>(Lcom/auto/accept/service/OverlayService;Landroid/view/WindowManager$LayoutParams;)V

    invoke-static {v2, v1}, Lm7/ۥۨۥ۟;->ۧ۠ۨۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/auto/accept/service/OverlayService;->overlayView:Landroid/view/View;

    :try_start_0
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۦۣۧۥ(Ljava/lang/Object;)Landroid/view/WindowManager;

    move-result-object v3

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
    if-eqz v3, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v3, v2, v0}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۡۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catch_0
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
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0xde

    sget v2, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۣ۟۠ۨ۟:I

    xor-int/lit16 v2, v2, -0x2ce

    const/16 v3, 0x72f

    invoke-static {v0, v1, v2, v3}, Ld1/۟۟ۥۡۡ;->۟ۥۢۤۧ([SIII)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_6
    invoke-static {}, Ll2/ۦۣ۠ۥ;->ۤ۠ۤۦ()I

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_1
    :sswitch_7
    const v0, 0xbf39

    goto :goto_5

    :sswitch_8
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_9
    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    const/16 v2, 0xf0

    sget v3, Lf1/ۥۦ۟ۥ;->۟ۥ۠ۥ:I

    xor-int/lit16 v3, v3, 0x1b3

    const/16 v4, 0x3e9

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۤۡۧۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, v6}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :sswitch_a
    if-ltz v1, :cond_1

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_b
    const-string v0, "8EP4kFZSYbyUcA5ju4GXSa"

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۦۥۣ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_c
    return-void

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
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_7
        0x35 -> :sswitch_c
        0x1f7 -> :sswitch_a
        0x7eef -> :sswitch_b
    .end sparse-switch
.end method

.method private static final createOverlayView$lambda$10$lambda$9(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0x107

    sget v2, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۧ۠ۡ۟:I

    xor-int/lit16 v2, v2, -0x32a

    const/16 v3, 0xa4a

    invoke-static {v0, v1, v2, v3}, Lm5/ۣۢ۟ۧ;->۠ۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->۟ۥۧۦۥ(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟۟ۦۦ()I

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
    const-string v0, "Qai9vqQTIFl0hDYVsb6YY"

    invoke-static {v0}, Lu/ۤ;->ۦۡۦۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method private static final createOverlayView$lambda$11(Lcom/auto/accept/service/OverlayService;Landroid/view/WindowManager$LayoutParams;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/high16 v5, 0x41f00000    # 30.0f

    const/high16 v4, 0x41100000    # 9.0f

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0x10d

    sget v2, Lx4/۟ۤۦۥ۟;->ۧۤۦ۠:I

    xor-int/lit16 v2, v2, 0x12f

    const/16 v3, 0x149

    invoke-static {v0, v1, v2, v3}, Ls0/ۢۨۦ۟;->۟ۥۥۦۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0x113

    sget v2, Ldagger/hilt/components/ۡۧ۟;->ۣۨۢۤ:I

    xor-int/lit16 v2, v2, 0x203

    const/16 v3, 0x537

    invoke-static {v0, v1, v2, v3}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۟ۥ۟۠ۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Lh5/ۢ۠۠۟;->ۥۣۤۢ(Ljava/lang/Object;)I

    move-result v2

    const/4 v0, 0x1

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
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v1, 0x2

    if-eq v2, v1, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۧۤ۠ۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p3}, Ls2/۟ۧ۟ۧۤ;->۟ۤ۠ۥۦ(Ljava/lang/Object;)F

    move-result v2

    sub-float/2addr v2, v4

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۧۥۣۤ(Ljava/lang/Object;)F

    move-result v3

    sub-float/2addr v2, v3

    add-float/2addr v2, v4

    float-to-int v2, v2

    rsub-int/lit8 v2, v2, 0x0

    sub-int/2addr v1, v2

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۨۡۥ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p3}, Lm7/ۧۢ۟;->۟۠ۨۨۥ(Ljava/lang/Object;)F

    move-result v2

    add-float/2addr v2, v5

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۨۢۥۥ(Ljava/lang/Object;)F

    move-result v3

    sub-float/2addr v2, v3

    sub-float/2addr v2, v5

    float-to-int v2, v2

    rsub-int/lit8 v2, v2, 0x0

    sub-int/2addr v1, v2

    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۦۣۧۥ(Ljava/lang/Object;)Landroid/view/WindowManager;

    move-result-object v2

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v2, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v2, p2, p1}, Lv0/۟ۤۧ۠ۧ;->ۣۣۢۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_b
    return v0

    :sswitch_c
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_d
    invoke-static {p1}, Lv0/۟ۦۣ۟ۤ;->۠۠۟ۧ(Ljava/lang/Object;)I

    move-result v1

    iput v1, p0, Lcom/auto/accept/service/OverlayService;->initialX:I

    invoke-static {p1}, Lh1/۟۟ۨۦۦ;->ۢ۠۠(Ljava/lang/Object;)I

    move-result v1

    iput v1, p0, Lcom/auto/accept/service/OverlayService;->initialY:I

    invoke-static {p3}, Ls2/۟ۧ۟ۧۤ;->۟ۤ۠ۥۦ(Ljava/lang/Object;)F

    move-result v1

    iput v1, p0, Lcom/auto/accept/service/OverlayService;->initialTouchX:F

    invoke-static {p3}, Lm7/ۧۢ۟;->۟۠ۨۨۥ(Ljava/lang/Object;)F

    move-result v1

    iput v1, p0, Lcom/auto/accept/service/OverlayService;->initialTouchY:F

    goto :goto_5

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_b
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_c
    .end sparse-switch
.end method

.method private static final createOverlayView$lambda$8$lambda$7(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V
    .locals 5

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0x11a

    sget v2, Ln/۟۠ۥۥۨ;->۟ۥۧۤۧ:I

    xor-int/lit16 v2, v2, 0x2e4

    const/16 v3, 0x497

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟ۥۡۤۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    const/16 v2, 0x120

    sget v3, La6/۟ۤۨۨ۟;->۟۠۠ۢۥ:I

    xor-int/lit16 v3, v3, -0x1b0

    const/16 v4, 0x5aa

    invoke-static {v1, v2, v3, v4}, Lv9/۟۟ۤۥ;->ۣ۟ۢۡۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v2

    invoke-static {v0}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    xor-int/lit8 v3, v2, -0x1

    and-int/lit8 v3, v3, 0x1

    and-int/lit8 v4, v2, -0x2

    or-int/2addr v3, v4

    invoke-static {v0, v1, v3}, Lz0/ۣ۟۠ۤ۟;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {v0}, Lk2/۟ۢۦۤۤ;->ۧۧۥ۟(Ljava/lang/Object;)V

    xor-int/lit8 v0, v2, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v1, v2, -0x2

    or-int/2addr v0, v1

    invoke-static {p0, v0}, Lcom/auto/accept/service/OverlayService;->۟ۦۡۥۣ(Ljava/lang/Object;Z)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "kF2yKAiN1"

    invoke-static {v0}, Lv0/ۣۣۡۢ;->۟ۦ۠ۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method private final registerReceivers()V
    .locals 5

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v2, 0x12f

    sget v3, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۤۨ۠:I

    xor-int/lit16 v3, v3, 0xf1

    const/16 v4, 0x18e

    invoke-static {v0, v2, v3, v4}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣۣۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ls/ۧۥ۟۟;->ۨۧۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v2, 0x14c

    sget v3, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۨۧۨ:I

    xor-int/lit16 v3, v3, 0x35a

    const/16 v4, 0x646

    invoke-static {v0, v2, v3, v4}, Lc7/۟ۦۣۢۦ;->ۨۦ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ls/ۧۥ۟۟;->ۨۧۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ln9/ۤۧۧۤ;->۟ۡۤۢۦ()I

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
    const/16 v0, 0x21

    if-lt v2, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣۢۤۨ(Ljava/lang/Object;)Lb5/e;

    move-result-object v0

    sget v2, Lx7/۟ۤۡ۟ۦ;->۟ۧۦۦ۠:I

    xor-int/lit16 v2, v2, -0x22a

    invoke-static {p0, v0, v1, v2}, Lt2/۟ۢ۟ۢ۟;->۟ۦ۟ۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/Intent;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣۢۤۨ(Ljava/lang/Object;)Lb5/e;

    move-result-object v0

    invoke-static {p0, v0, v1}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟۟ۦۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    :sswitch_5
    return-void

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
.end method

.method private final setupNetworkMonitor()V
    .locals 3

    const-class v0, Landroid/net/ConnectivityManager;

    invoke-static {p0, v0}, Lr6/۟ۡ۠۟ۡ;->ۦۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lcom/auto/accept/service/OverlayService;->connectivityManager:Landroid/net/ConnectivityManager;

    new-instance v0, Lr4/h;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lr4/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/auto/accept/service/OverlayService;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    sget v1, Lk7/۟ۤۥۡ;->۟۟۟ۤۡ:I

    xor-int/lit16 v1, v1, 0xff

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۨ۟ۥ(Ljava/lang/Object;I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۡۡۡۤ(Ljava/lang/Object;)Landroid/net/NetworkRequest;

    move-result-object v1

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣ۟ۦ(Ljava/lang/Object;)Landroid/net/ConnectivityManager;

    move-result-object v2

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
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۦۥ۟ۤ(Ljava/lang/Object;)Landroid/net/ConnectivityManager$NetworkCallback;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->۟ۧۧۤ۠(Ljava/lang/Object;)V

    invoke-static {v2, v1, v0}, Lm5/۟ۥۣۧۥ;->ۣ۟ۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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

.method private final updateStatusDisplay(Z)V
    .locals 7

    const v2, -0xa8de

    const v1, -0xb350b0

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣ۟ۦۡ۟(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v4

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
    if-eqz p1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v3, 0x16a

    sget v5, Lcom/google/firebase/encoders/config/ۣۧۦ;->ۡۤۧۤ:I

    xor-int/lit16 v5, v5, -0x26d

    const/16 v6, 0x90a

    invoke-static {v0, v3, v5, v6}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۣ۟۟۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    const v3, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    invoke-static {v4, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_9
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣ۟ۦۡ۟(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_5

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_3

    :sswitch_c
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v3, 0x173

    sget v5, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۤۢۧۢ:I

    xor-int/lit16 v5, v5, 0x164

    const/16 v6, 0xa12

    invoke-static {v0, v3, v5, v6}, Lf4/ۡۤۡ;->ۢۧۢۨ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :sswitch_d
    if-eqz v3, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v0, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-eqz p1, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_6

    :sswitch_11
    const v0, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_12
    move v0, v1

    :goto_8
    invoke-static {v3, v0}, Li9/ۨۨ۟;->ۤۤ۟ۥ(Ljava/lang/Object;I)V

    :sswitch_13
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۤۢۢ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v4

    const v0, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    if-nez v4, :cond_4

    const v0, 0xc5e2

    goto :goto_9

    :sswitch_15
    const v0, 0xc29d

    goto :goto_7

    :sswitch_16
    move v0, v2

    goto :goto_8

    :cond_4
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_18
    const v0, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    const v0, 0xc620

    goto :goto_a

    :sswitch_1a
    const v0, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_5
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-eqz p1, :cond_5

    const v0, 0xc965

    goto :goto_b

    :sswitch_1d
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v3, 0x179

    sget v5, Lcom/google/firebase/measurement/ۧۤۦۧ;->۟ۧۤۡۨ:I

    xor-int/lit16 v5, v5, -0x372

    const/16 v6, 0x5fa

    invoke-static {v0, v3, v5, v6}, Lc6/۟ۧۧ۠ۤ;->ۢۦۡۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const v3, 0xc984

    :goto_c
    const v5, 0xc995

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_a

    goto :goto_c

    :sswitch_1e
    const v3, 0xc9a3

    goto :goto_c

    :sswitch_1f
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v3, 0x17f

    sget v5, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۣ۟ۧ۟ۢ:I

    xor-int/lit8 v5, v5, 0x65

    const/16 v6, 0x49b

    invoke-static {v0, v3, v5, v6}, Lj6/ۣۦۢ۠;->ۣ۟۠ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_20
    invoke-static {v4, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟۟ۤۥۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_21
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۤۢۢ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    const v0, 0xca00

    :goto_d
    const v4, 0xca11

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_6
    :sswitch_22
    const v0, 0xca3e

    goto :goto_d

    :sswitch_23
    if-eqz v3, :cond_6

    const v0, 0xca5d

    goto :goto_d

    :sswitch_24
    const v0, 0xca7c

    :goto_e
    const v4, 0xca8d

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_25
    if-eqz p1, :cond_7

    const v0, 0xcd64

    goto :goto_e

    :cond_7
    :sswitch_26
    const v0, 0xcd45

    goto :goto_e

    :sswitch_27
    const v0, 0xcd83

    :goto_f
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_f

    :sswitch_28
    const v0, 0xcda2

    goto :goto_f

    :sswitch_29
    move v2, v1

    :sswitch_2a
    invoke-static {v3, v2}, Lx7/۟۟ۦۨۡ;->ۢۦۧ۟(Ljava/lang/Object;I)V

    :sswitch_2b
    return-void

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
        0x36 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_2b
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_2a
    .end sparse-switch
.end method

.method public static ۟ۡۤ۠ۤ(Ljava/lang/Object;)Landroid/app/Notification;
    .locals 2

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0}, Lcom/auto/accept/service/OverlayService;->buildNotification()Landroid/app/Notification;

    move-result-object v0

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

.method public static ۟ۡۤۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ls0/ۧۧۨۥ;->ۦۦۤ۠()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    check-cast p1, Landroid/view/View;

    invoke-static {p0, p1}, Lcom/auto/accept/service/OverlayService;->createOverlayView$lambda$8$lambda$7(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

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

.method public static ۟ۡۦۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0}, Lcom/auto/accept/service/OverlayService;->setupNetworkMonitor()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

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

.method public static ۟ۢۧۡۥ(Ljava/lang/Object;)V
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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0}, Lcom/auto/accept/service/OverlayService;->createNotificationChannel()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

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

.method public static ۣ۟ۦۡ۟(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۦۨ۠()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->statusText:Landroid/widget/TextView;

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

.method public static ۟ۤ۠ۥۤ(Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0}, Lcom/auto/accept/service/OverlayService;->createOverlayView()V

    :sswitch_3
    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۦۥ۟()I

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
    const-string v0, "BCoDDJCfa28wFXrMDKOM"

    invoke-static {v0}, Lg2/ۢۥۥۡ;->۟ۢ۟۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

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
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۢۢ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lw5/ۢۤۢ۠;->ۣۢۧۨ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->stopButton:Landroid/widget/TextView;

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

.method public static ۟ۦۡۥۣ(Ljava/lang/Object;Z)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/OverlayService;->updateStatusDisplay(Z)V

    :sswitch_3
    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

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
    const-string v0, "7cHEkGYwFWD9Ug8aa0Exm9e"

    invoke-static {v0}, Lk/ۣۡۤۧ;->ۣۧ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

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
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۢ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟ۡۦ۟()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    check-cast p1, Landroid/view/View;

    invoke-static {p0, p1}, Lcom/auto/accept/service/OverlayService;->createOverlayView$lambda$10$lambda$9(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

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

.method public static ۟ۦۣۧۥ(Ljava/lang/Object;)Landroid/view/WindowManager;
    .locals 2

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->windowManager:Landroid/view/WindowManager;

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

.method public static ۠ۤۢۡ(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Ld9/ۧۧۨۥ;->۠ۦۢۡ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->overlayView:Landroid/view/View;

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

.method public static ۣۢۤۨ(Ljava/lang/Object;)Lb5/e;
    .locals 2

    invoke-static {}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۢۥۦۧ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->fareReceiver:Lb5/e;

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

.method public static ۣ۟ۦ(Ljava/lang/Object;)Landroid/net/ConnectivityManager;
    .locals 2

    invoke-static {}, Lp8/ۡۤ;->ۦ۠ۢۧ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->connectivityManager:Landroid/net/ConnectivityManager;

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

.method public static ۣۣۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lm0/۟ۤۡۤۤ;->ۣ۟ۦۢۥ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->fareText:Landroid/widget/TextView;

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

.method public static ۤۥۢ۠()[S
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lcom/auto/accept/service/OverlayService;->short:[S

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

.method public static ۥۧۡ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۣۣ۟ۥ۠()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->networkStatusText:Landroid/widget/TextView;

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

.method public static ۦۥ۟ۤ(Ljava/lang/Object;)Landroid/net/ConnectivityManager$NetworkCallback;
    .locals 2

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget-object v0, p0, Lcom/auto/accept/service/OverlayService;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

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

.method public static ۦۧۢۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lz3/۟ۡ۠ۦۣ;->ۡۤ۟۟()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0}, Lcom/auto/accept/service/OverlayService;->registerReceivers()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

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

.method public static ۧۤ۠ۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, La8/ۣۡۨ۠;->۟ۡۤۧۨ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget v0, p0, Lcom/auto/accept/service/OverlayService;->initialX:I

    :sswitch_3
    return v0

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

.method public static ۧۥۣۤ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lm9/۟ۤۢۦ۠;->ۦۦۢ۟()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget v0, p0, Lcom/auto/accept/service/OverlayService;->initialTouchX:F

    :sswitch_3
    return v0

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

.method public static ۨۡۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۤۥۦۣ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget v0, p0, Lcom/auto/accept/service/OverlayService;->initialY:I

    :sswitch_3
    return v0

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

.method public static ۨۢۥۥ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Ld2/۟ۦۡ۟ۦ;->ۣۧۡۧ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    iget v0, p0, Lcom/auto/accept/service/OverlayService;->initialTouchY:F

    :sswitch_3
    return v0

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

.method public static ۨۨۨۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣ۟ۢۥۤ()I

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
    check-cast p0, Lcom/auto/accept/service/OverlayService;

    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    check-cast p2, Landroid/view/View;

    check-cast p3, Landroid/view/MotionEvent;

    invoke-static {p0, p1, p2, p3}, Lcom/auto/accept/service/OverlayService;->createOverlayView$lambda$11(Lcom/auto/accept/service/OverlayService;Landroid/view/WindowManager$LayoutParams;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    :sswitch_3
    return v0

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
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 10

    const/16 v9, 0x194

    const/4 v7, 0x0

    const/4 v0, 0x0

    const-string v5, "\u06df\u06df\u06df"

    move-object v2, v0

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const-string v5, "\u06e8\u06e4\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    sget v8, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۠ۧۨۤ:I

    xor-int/lit16 v6, v8, 0x3fb

    const-string v0, "\u06e0\u06df\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    sget v8, Le9/ۧۧۡ;->۟۟ۤ۠۟:I

    const-string v5, "\u06e6\u06e5\u06e0"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    sget v8, Lx5/ۡۦۦۥ;->۟ۥ۟۠ۢ:I

    xor-int/lit16 v6, v8, 0x8a

    const-string v0, "\u06e4\u06df\u06df"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    sget v8, Lc7/۟ۦۣۢۦ;->۟ۦ۠۟ۨ:I

    xor-int/lit16 v6, v8, -0x2ef

    const-string v0, "\u06e5\u06e7\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۡۦۥ(Ljava/lang/Object;)V

    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v5, "\u06e4\u06e2\u06e3"

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x186

    const/16 v4, 0xbea

    invoke-static {v3, v0, v6, v4}, Ld5/ۣۦۢۢ;->ۣۧۥۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const-string v5, "\u06e6\u06df\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_6
    invoke-static {p0, v4}, Ld4/۟۠۠۟ۢ;->۟ۤ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const-string v5, "\u06e8\u06e0\u06e0"

    move-object v3, v0

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۤ۠ۥۤ(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۦۧۢۥ(Ljava/lang/Object;)V

    const-string v0, "\u06e5\u06e3\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_8
    move-object v0, v1

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/auto/accept/service/OverlayService;->windowManager:Landroid/view/WindowManager;

    const-string v0, "\u06e4\u06e6\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_9
    const/16 v0, 0x911

    invoke-static {v3, v9, v6, v0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣ۟۠ۦۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۢۧۡۥ(Ljava/lang/Object;)V

    const-string v5, "\u06e3\u06e5\u06e1"

    move-object v4, v0

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v6, v8, -0x306

    const/16 v0, 0x1ab

    invoke-static {v3, v0, v6, v9}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۣ۟ۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u06e5\u06e3\u06e0"

    move-object v4, v0

    goto/16 :goto_0

    :sswitch_b
    xor-int/lit16 v6, v8, -0xcc

    const/16 v0, 0x1f0

    const/16 v4, 0x526

    invoke-static {v3, v0, v6, v4}, Ls2/۟ۧ۟ۧۤ;->۟ۤۧۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u06e7\u06e6\u06e3"

    move-object v4, v0

    goto/16 :goto_0

    :sswitch_c
    sget v8, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۦۢۢ:I

    xor-int/lit16 v6, v8, 0x128

    const-string v0, "\u06e4\u06df\u06e7"

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۡۤ۠ۤ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    invoke-static {p0, v6, v0}, Lr/۠ۡ۠;->ۦ۠ۨۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v0, "\u06e6\u06e0\u06e5"

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_e
    const/16 v0, 0x1b1

    const/16 v4, 0xc10

    invoke-static {v3, v0, v6, v4}, Ll8/ۣ۟ۧۢ۠;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lh3/۟ۡۥ۠۠;->۟۠۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "\u06e5\u06e3\u06e1"

    move-object v4, v0

    goto/16 :goto_0

    :sswitch_f
    invoke-static {v2, v4, v7}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    invoke-static {p0, v0}, Lcom/auto/accept/service/OverlayService;->۟ۦۡۥۣ(Ljava/lang/Object;Z)V

    const-string v0, "\u06e2\u06e6\u06e6"

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    sget v8, Lr2/ۡۧۥۧ;->ۧۤۧ:I

    const-string v5, "\u06e2\u06e4\u06e3"

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaac7 -> :sswitch_d
        0x1ab2e1 -> :sswitch_b
        0x1ab322 -> :sswitch_11
        0x1ab6bf -> :sswitch_0
        0x1ab9c4 -> :sswitch_e
        0x1ab9cc -> :sswitch_5
        0x1aba25 -> :sswitch_10
        0x1abaa2 -> :sswitch_7
        0x1abe02 -> :sswitch_6
        0x1abe03 -> :sswitch_8
        0x1abe09 -> :sswitch_4
        0x1abe81 -> :sswitch_9
        0x1ac149 -> :sswitch_3
        0x1ac16b -> :sswitch_1
        0x1ac201 -> :sswitch_a
        0x1ac5e4 -> :sswitch_f
        0x1ac8e8 -> :sswitch_2
        0x1ac966 -> :sswitch_c
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 6

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0x1ff

    sget v2, Ld5/ۣۦۢۢ;->ۣۣ۟ۢۢ:I

    xor-int/lit16 v2, v2, -0x22f

    const/16 v3, 0x24e

    invoke-static {v0, v1, v2, v3}, Ls0/ۢۨۦ۟;->۟ۥۥۦۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    :try_start_0
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۠ۤۢۡ(Ljava/lang/Object;)Landroid/view/View;

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->۟ۦۣۧۥ(Ljava/lang/Object;)Landroid/view/WindowManager;

    move-result-object v3

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
    invoke-static {v3, v1}, Lh/۟ۡۥۡۧ;->۟ۢۦۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catch_0
    move-exception v0

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    const/16 v3, 0x20d

    sget v4, Landroidx/compose/ui/input/key/ۣۢۥۢ;->۟ۧۡۧ۠:I

    xor-int/lit16 v4, v4, -0xed

    const/16 v5, 0x2ef

    invoke-static {v1, v3, v4, v5}, Lp0/۟ۧۧۧ۟;->۟۟ۡ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, v2}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_8
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v0

    const/16 v1, 0x21c

    sget v2, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    xor-int/lit16 v2, v2, 0x15b

    const/16 v3, 0x6f0

    invoke-static {v0, v1, v2, v3}, Lz3/۟ۡ۠ۦۣ;->ۣۢ۠ۦ([SIII)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

    move-result v1

    const v0, 0xc2fa

    :goto_4
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_9
    if-gtz v1, :cond_4

    const v0, 0xc5e2

    goto :goto_4

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_b
    :try_start_1
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣۢۤۨ(Ljava/lang/Object;)Lb5/e;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۦۥ۟ۤ(Ljava/lang/Object;)Landroid/net/ConnectivityManager$NetworkCallback;

    move-result-object v1

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :cond_2
    :sswitch_c
    const v0, 0xbf39

    goto :goto_5

    :sswitch_d
    if-eqz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {p0}, Lcom/auto/accept/service/OverlayService;->ۣ۟ۦ(Ljava/lang/Object;)Landroid/net/ConnectivityManager;

    move-result-object v3

    const v0, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_f
    if-eqz v3, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_6

    :sswitch_11
    invoke-static {v3, v1}, Lf6/ۣۣۣۣ۟;->ۧۥۢۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_12
    const v0, 0xc29d

    goto :goto_7

    :cond_4
    :sswitch_13
    const v0, 0xc5c3

    goto :goto_4

    :sswitch_14
    const-string v0, "ba3sifDf1GaNuwkrwfLkupUWA"

    invoke-static {v0}, Lv7/ۢ۟ۨۦ;->۟ۢۡۡۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_15
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x1f1 -> :sswitch_9
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_15
        0x6e9 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_8
        0xf1 -> :sswitch_12
    .end sparse-switch
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 9

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v8, "\u06e8\u06e6\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v8}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/4 v0, 0x1

    return v0

    :sswitch_0
    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v8, "\u06e7\u06e6\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/auto/accept/service/OverlayService;->ۤۥۢ۠()[S

    move-result-object v1

    const-string v8, "\u06e6\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v0, v5}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v1

    const-string v8, "\u06e6\u06e3\u06e0"

    move v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v4}, Lcom/auto/accept/service/OverlayService;->۟ۦۡۥۣ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e5\u06e5"

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v1, v7, 0x31c

    const-string v8, "\u06e4\u06e6\u06e6"

    move v6, v1

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x235

    const/16 v1, 0x868

    invoke-static {v3, v0, v6, v1}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۡۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e0\u06e5\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    sget v1, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۠ۧ۠ۤ:I

    const-string v8, "\u06e2\u06e0\u06e5"

    move v7, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcbf -> :sswitch_6
        0x1aab7d -> :sswitch_2
        0x1ab267 -> :sswitch_4
        0x1abaa4 -> :sswitch_5
        0x1ac1c3 -> :sswitch_3
        0x1ac5e8 -> :sswitch_1
        0x1ac9a8 -> :sswitch_0
    .end sparse-switch
.end method
