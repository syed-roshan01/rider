.class public final Lcom/auto/accept/service/KeepAliveService;
.super Landroid/app/Service;


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x88

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/service/KeepAliveService;->short:[S

    return-void

    :array_0
    .array-data 2
        0x930s
        0x92bs
        0x926s
        0x927s
        0x91ds
        0x923s
        0x921s
        0x921s
        0x927s
        0x932s
        0x936s
        0x927s
        0x930s
        0x91ds
        0x929s
        0x927s
        0x927s
        0x932s
        0x923s
        0x92es
        0x92bs
        0x934s
        0x927s
        0x4f7s
        0x4ccs
        0x4c1s
        0x4c0s
        0x485s
        0x4e4s
        0x4c6s
        0x4c6s
        0x4c0s
        0x4d5s
        0x4d1s
        0x4c0s
        0x4d7s
        0x485s
        0x4e4s
        0x4c6s
        0x4d1s
        0x4ccs
        0x4d3s
        0x4c0s
        0x9f3s
        0x9dds
        0x9dds
        0x9c8s
        0x9cbs
        0x998s
        0x9eas
        0x9d1s
        0x9dcs
        0x9dds
        0x998s
        0x9f9s
        0x9dbs
        0x9dbs
        0x9dds
        0x9c8s
        0x9ccs
        0x9dds
        0x9cas
        0x998s
        0x9cas
        0x9cds
        0x9d6s
        0x9d6s
        0x9d1s
        0x9d6s
        0x9dfs
        0x998s
        0x9d1s
        0x9d6s
        0x998s
        0x9ccs
        0x9d0s
        0x9dds
        0x998s
        0x9das
        0x9d9s
        0x9dbs
        0x9d3s
        0x9dfs
        0x9cas
        0x9d7s
        0x9cds
        0x9d6s
        0x9dcs
        0x533s
        0x511s
        0x510s
        0x517s
        0x50as
        0x511s
        0x50cs
        0x517s
        0x510s
        0x519s
        0x55es
        0x518s
        0x511s
        0x50cs
        0x55es
        0x50cs
        0x517s
        0x51as
        0x51bs
        0x55es
        0x50cs
        0x51bs
        0x50fs
        0x50bs
        0x51bs
        0x50ds
        0x50as
        0x50ds
        0x550s
        0x550s
        0x550s
        0x383s
        0x395s
        0x382s
        0x386s
        0x399s
        0x393s
        0x395s
        0x468s
        0x47fs
        0x463s
        0x466s
        0x46es
        0x422s
        0x424s
        0x424s
        0x424s
        0x423s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۣۣۤۦ()I

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
    const-string v0, "0WoF56B0CFXXbeoV"

    invoke-static {v0}, Lx7/۟۟ۦۨۡ;->ۣ۠ۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۥۥۤۦ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟۠۠ۦۨ()I

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
    sget-object v0, Lcom/auto/accept/service/KeepAliveService;->short:[S

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
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final onCreate()V
    .locals 9

    const/4 v8, 0x0

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {}, Lcom/auto/accept/service/KeepAliveService;->ۥۥۤۦ()[S

    move-result-object v0

    sget v1, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->۟ۢۥ۠ۧ:I

    xor-int/lit8 v1, v1, -0x34

    const/16 v2, 0x942

    invoke-static {v0, v8, v1, v2}, Lz7/۠ۡ۟ۦ;->ۧۨۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/KeepAliveService;->ۥۥۤۦ()[S

    move-result-object v0

    const/16 v1, 0x17

    sget v3, Lc7/ۨۤۦۢ;->ۥ۟ۧۢ:I

    xor-int/lit16 v3, v3, -0x33e

    const/16 v4, 0x4a5

    invoke-static {v0, v1, v3, v4}, Lh1/۟۟ۨۦۦ;->۟ۥ۟ۥۣ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۨۥۣۢ:I

    xor-int/lit16 v4, v0, -0x13b

    new-instance v5, Landroid/app/NotificationChannel;

    invoke-direct {v5, v2, v3, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {}, Lcom/auto/accept/service/KeepAliveService;->ۥۥۤۦ()[S

    move-result-object v0

    const/16 v1, 0x2b

    sget v6, Lb7/ۣ۟۟ۦ۟;->۟ۥ۟ۢۨ:I

    xor-int/lit16 v6, v6, 0x163

    const/16 v7, 0x9b8

    invoke-static {v0, v1, v6, v7}, Ln7/۟ۡۢۦ;->۟ۢۧۡۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/google/firebase/annotations/ۣۢۢۦ;->ۣ۟ۢ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v8}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->۟۠۠ۤۨ(Ljava/lang/Object;Z)V

    const-class v0, Landroid/app/NotificationManager;

    invoke-static {p0, v0}, Lr6/۟ۡ۠۟ۡ;->ۦۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

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
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v5}, Le9/ۧۧۡ;->ۧ۟۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/auto/accept/ui/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, -0x200002ab

    sget v5, Lv8/۟ۧۢ۟ۢ;->۟ۥۡۧۥ:I

    xor-int/2addr v1, v5

    invoke-static {v0, v1}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣۣۢۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    const v1, -0xc0001a0

    sget v5, Lx2/۟ۢۥ;->۟ۧۤۨۨ:I

    xor-int/2addr v1, v5

    invoke-static {p0, v8, v0, v1}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۦ۠ۤۤ(Ljava/lang/Object;ILjava/lang/Object;I)Landroid/app/PendingIntent;

    move-result-object v0

    new-instance v1, Lq2/x;

    invoke-direct {v1, p0, v2}, Lq2/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v3}, Lx0/ۣ۠۟۠;->ۣۡۨۥ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v1, Lq2/x;->e:Ljava/lang/CharSequence;

    invoke-static {}, Lcom/auto/accept/service/KeepAliveService;->ۥۥۤۦ()[S

    move-result-object v2

    const/16 v3, 0x58

    sget v5, Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I

    xor-int/lit16 v5, v5, 0x332

    const/16 v6, 0x57e

    invoke-static {v2, v3, v5, v6}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lx0/ۣ۠۟۠;->ۣۡۨۥ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v1, Lq2/x;->f:Ljava/lang/CharSequence;

    invoke-static {v1}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۥۢۦۣ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v2

    const v3, 0x7f070078

    iput v3, v2, Landroid/app/Notification;->icon:I

    iput-object v0, v1, Lq2/x;->g:Landroid/app/PendingIntent;

    const/4 v0, 0x1

    invoke-static {v1, v4, v0}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۤ۠ۨۥ(Ljava/lang/Object;IZ)V

    const/4 v0, -0x1

    iput v0, v1, Lq2/x;->j:I

    invoke-static {}, Lcom/auto/accept/service/KeepAliveService;->ۥۥۤۦ()[S

    move-result-object v0

    const/16 v2, 0x77

    sget v3, Lg/۟ۧ۠ۤ;->ۦۥۡۦ:I

    xor-int/lit16 v3, v3, 0x3df

    const/16 v4, 0x3f0

    invoke-static {v0, v2, v3, v4}, Le8/۟۠ۦ۟ۢ;->۟ۦۣۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lq2/x;->n:Ljava/lang/String;

    invoke-static {v1}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۣ۟۟ۦۤ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/KeepAliveService;->ۥۥۤۦ()[S

    move-result-object v1

    const/16 v2, 0x7e

    sget v3, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/lit16 v3, v3, 0x2c2

    const/16 v4, 0x40a

    invoke-static {v1, v2, v3, v4}, Ld9/ۥۡۧۡ;->ۨۥ۟ۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Lr9/۟ۢۢۤۨ;->۟ۥۡۥۦ:I

    xor-int/lit16 v1, v1, 0x3b9

    invoke-static {p0, v1, v0}, Lr/۠ۡ۠;->ۦ۠ۨۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۢ۟ۤۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "8d3595rCuNA8cNaOFpZj5BZrwpM"

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۨۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_7
    return-void

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

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lh7/ۣ۟ۤ۠۠;->ۡۨۥۨ(Ljava/lang/Object;I)V

    invoke-static {}, Lg8/ۣۣۣ۟;->ۨۢۢۨ()I

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
    const-string v0, "3TC9Z93TH49Hs1opUJ8V6xI"

    invoke-static {v0}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟ۡۨۥۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
