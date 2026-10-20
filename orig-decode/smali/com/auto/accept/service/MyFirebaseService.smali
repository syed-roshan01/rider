.class public final Lcom/auto/accept/service/MyFirebaseService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;


# static fields
.field public static final $stable:I

.field private static final CHANNEL_ID:Ljava/lang/String;

.field public static final Companion:Lb5/a;

.field private static final TAG:Ljava/lang/String;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xd1

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/service/MyFirebaseService;->short:[S

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Lv5/ۥۧ۟ۦ;->۠۟ۨۢ:I

    xor-int/lit16 v2, v2, -0x348

    const/16 v3, 0x9f7

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟ۥۡۤۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/MyFirebaseService;->CHANNEL_ID:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    const/16 v1, 0x10

    sget v2, Ld8/ۣۡۡ۠;->ۨۧۧۡ:I

    xor-int/lit16 v2, v2, -0x2fc

    const/16 v3, 0x1d4

    invoke-static {v0, v1, v2, v3}, Lu2/۟ۥۢۥۨ;->ۥۢۥۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/MyFirebaseService;->TAG:Ljava/lang/String;

    new-instance v0, Lb5/a;

    invoke-direct {v0}, Lb5/a;-><init>()V

    sput-object v0, Lcom/auto/accept/service/MyFirebaseService;->Companion:Lb5/a;

    return-void

    :array_0
    .array-data 2
        0x9b3s
        0x992s
        0x991s
        0x996s
        0x982s
        0x99bs
        0x983s
        0x9b4s
        0x99fs
        0x996s
        0x999s
        0x999s
        0x992s
        0x99bs
        0x9bes
        0x993s
        0x199s
        0x1ads
        0x192s
        0x1bds
        0x1a6s
        0x1b1s
        0x1b6s
        0x1b5s
        0x1a7s
        0x1b1s
        0x187s
        0x1b1s
        0x1a6s
        0x1a2s
        0x1bds
        0x1b7s
        0x1b1s
        0xc3fs
        0xc1es
        0xc1ds
        0xc1as
        0xc0es
        0xc17s
        0xc0fs
        0xc38s
        0xc13s
        0xc1as
        0xc15s
        0xc15s
        0xc1es
        0xc17s
        0xc32s
        0xc1fs
        0x7c1s
        0x7e0s
        0x7e3s
        0x7e4s
        0x7f0s
        0x7e9s
        0x7f1s
        0x7a5s
        0x7c6s
        0x7eds
        0x7e4s
        0x7ebs
        0x7ebs
        0x7e0s
        0x7e9s
        0xad1s
        0xac7s
        0xaccs
        0xac6s
        0xaf0s
        0xac7s
        0xac5s
        0xacbs
        0xad1s
        0xad6s
        0xad0s
        0xac3s
        0xad6s
        0xacbs
        0xacds
        0xaccs
        0xaf6s
        0xacds
        0xaf1s
        0xac7s
        0xad0s
        0xad4s
        0xac7s
        0xad0s
        0xa98s
        0xa82s
        0x90bs
        0x93fs
        0x900s
        0x92fs
        0x934s
        0x923s
        0x924s
        0x927s
        0x935s
        0x923s
        0x915s
        0x923s
        0x934s
        0x930s
        0x92fs
        0x925s
        0x923s
        0x8f5s
        0x8e2s
        0x8eas
        0x8e8s
        0x8f3s
        0x8e2s
        0x8cas
        0x8e2s
        0x8f4s
        0x8f4s
        0x8e6s
        0x8e0s
        0x8e2s
        0x6f9s
        0x6cds
        0x6d0s
        0x6d2s
        0x685s
        0x69fs
        0xbc2s
        0xbf6s
        0xbc9s
        0xbe6s
        0xbfds
        0xbeas
        0xbeds
        0xbees
        0xbfcs
        0xbeas
        0xbdcs
        0xbeas
        0xbfds
        0xbf9s
        0xbe6s
        0xbecs
        0xbeas
        0x656s
        0x67es
        0x668s
        0x668s
        0x67as
        0x67cs
        0x67es
        0x63bs
        0x655s
        0x674s
        0x66fs
        0x672s
        0x67ds
        0x672s
        0x678s
        0x67as
        0x66fs
        0x672s
        0x674s
        0x675s
        0x63bs
        0x659s
        0x674s
        0x67fs
        0x662s
        0x621s
        0x63bs
        0x183s
        0x198s
        0x19cs
        0x192s
        0x199s
        0x6a0s
        0x697s
        0x694s
        0x680s
        0x697s
        0x681s
        0x69as
        0x697s
        0x696s
        0x6d2s
        0x686s
        0x69ds
        0x699s
        0x697s
        0x69cs
        0x6c8s
        0x6d2s
        0x2f3s
        0x2c7s
        0x2f8s
        0x2d7s
        0x2ccs
        0x2dbs
        0x2dcs
        0x2dfs
        0x2cds
        0x2dbs
        0x2eds
        0x2dbs
        0x2ccs
        0x2c8s
        0x2d7s
        0x2dds
        0x2dbs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۢ۠ۢۤ()I

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
    const-string v0, "aPE4FRUgxSXyxYp7"

    invoke-static {v0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡۤ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method private final sendNotification(Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    const/4 v9, 0x0

    const/4 v0, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const-string v13, "\u06e8\u06e2\u06e5"

    move-object v1, v0

    :goto_0
    invoke-static {v13}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    sget v12, Ll6/ۥۦۣ۟;->ۣۡۧۧ:I

    const v0, 0x400019f

    xor-int/2addr v0, v12

    const-string v13, "\u06e0\u06e7\u06e5"

    move v11, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v1, v11}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->۟ۨ۟ۤ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v0, Ld7/۟ۢۧۧ۠;->ۣ۟۠ۢۡ:I

    const-string v13, "\u06df\u06e1\u06e7"

    move v12, v0

    goto :goto_0

    :sswitch_1
    sget v12, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->ۣ۟ۦ۟ۨ:I

    xor-int/lit16 v0, v12, -0xc8

    const-string v13, "\u06e5\u06e7\u06e8"

    move v11, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۣ۟۟ۦۤ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v4, v8, v0}, Lf6/ۣۣۣۣ۟;->۟۟ۨۤۦ(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v13, "\u06e6\u06e5\u06e4"

    move-object v8, v0

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v0, v12, -0x1cf

    const/16 v11, 0x31

    const/16 v13, 0x785

    invoke-static {v10, v11, v0, v13}, Lh0/۟ۥ۟ۡۦ;->ۣۨ۟۠([SIII)Ljava/lang/String;

    move-result-object p1

    const-string v13, "\u06e5\u06e5\u06df"

    move v11, v0

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v0, v12, 0x145

    const/4 v11, 0x1

    invoke-static {v3, v0, v11}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۤ۠ۨۥ(Ljava/lang/Object;IZ)V

    const-string v13, "\u06e7\u06e6\u06e5"

    move v11, v0

    goto :goto_0

    :sswitch_5
    const-class v9, Lcom/auto/accept/ui/MainActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v13, "\u06e6\u06e8\u06e0"

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    new-instance v0, Lq2/x;

    invoke-direct {v0, p0, v6}, Lq2/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۥۢۦۣ(Ljava/lang/Object;)Landroid/app/Notification;

    move-result-object v8

    const-string v13, "\u06df\u06e1\u06e6"

    move-object v3, v0

    goto :goto_0

    :sswitch_7
    iput-object v5, v3, Lq2/x;->f:Ljava/lang/CharSequence;

    sget v0, Li4/ۨ۟ۨ;->۟ۧ۠ۥ۟:I

    const-string v13, "\u06e4\u06e7\u06e0"

    move v12, v0

    goto :goto_0

    :sswitch_8
    invoke-static {p0, v9}, Lr6/۟ۡ۠۟ۡ;->ۦۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    const-string v13, "\u06e2\u06e8\u06e6"

    move-object v4, v0

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    sget v12, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۤۢ۠ۧ:I

    const-string v13, "\u06e2\u06e5\u06df"

    move-object v10, v0

    goto :goto_0

    :sswitch_a
    iput-object v7, v3, Lq2/x;->g:Landroid/app/PendingIntent;

    const-class v0, Landroid/app/NotificationManager;

    const-string v13, "\u06e2\u06e1\u06df"

    move-object v9, v0

    goto/16 :goto_0

    :sswitch_b
    new-instance v0, Landroid/app/NotificationChannel;

    invoke-direct {v0, v6, p1, v11}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {v4, v0}, Le9/ۧۧۡ;->ۧ۟۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e0\u06e5\u06e4"

    move-object v13, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    sget v12, Lq5/۟ۥۣۢۨ;->ۦۣۤ:I

    const-string v13, "\u06e0\u06e3\u06e7"

    move-object v10, v0

    goto/16 :goto_0

    :sswitch_d
    iput-object v2, v3, Lq2/x;->e:Ljava/lang/CharSequence;

    invoke-static/range {p2 .. p2}, Lx0/ۣ۠۟۠;->ۣۡۨۥ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    const-string v13, "\u06e2\u06e0\u06e1"

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit8 v11, v12, -0x1f

    const/16 v0, 0x21

    const/16 v6, 0xc7b

    invoke-static {v10, v0, v11, v6}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۢۨۡۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v13, "\u06e7\u06e0\u06e6"

    move-object v6, v0

    goto/16 :goto_0

    :sswitch_f
    const/high16 v0, 0x7f0c0000

    iput v0, v8, Landroid/app/Notification;->icon:I

    invoke-static {p1}, Lx0/ۣ۠۟۠;->ۣۡۨۥ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    const-string v13, "\u06e7\u06e4"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_10
    const v0, 0x44000102

    xor-int v11, v0, v12

    const/4 v0, 0x0

    invoke-static {p0, v0, v1, v11}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۦ۠ۤۤ(Ljava/lang/Object;ILjava/lang/Object;I)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v13, "\u06e2\u06e0\u06e5"

    move-object v7, v0

    goto/16 :goto_0

    :sswitch_11
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdd -> :sswitch_d
        0x1aa744 -> :sswitch_f
        0x1aa745 -> :sswitch_10
        0x1aab44 -> :sswitch_e
        0x1aab7f -> :sswitch_2
        0x1aabbe -> :sswitch_0
        0x1ab263 -> :sswitch_7
        0x1ab267 -> :sswitch_c
        0x1ab280 -> :sswitch_8
        0x1ab2fc -> :sswitch_3
        0x1ab360 -> :sswitch_9
        0x1ababd -> :sswitch_4
        0x1abe3f -> :sswitch_1
        0x1abe86 -> :sswitch_b
        0x1ac205 -> :sswitch_11
        0x1ac52d -> :sswitch_6
        0x1ac5e6 -> :sswitch_a
        0x1ac92b -> :sswitch_5
    .end sparse-switch
.end method

.method private final sendRegistrationToServer(Ljava/lang/String;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v1

    const/16 v2, 0x40

    sget v3, Lf/ۣ۟ۤۤ;->ۣۤۧۢ:I

    xor-int/lit16 v3, v3, -0x1e1

    const/16 v4, 0xaa2

    invoke-static {v1, v2, v3, v4}, Li4/ۨ۟ۨ;->ۣۨۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    const/16 v1, 0x5a

    sget v2, Lq6/ۣ۟ۢ۟ۤ;->ۡ۠ۢۦ:I

    xor-int/lit16 v2, v2, -0x290

    const/16 v3, 0x946

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->۟ۥۢۨ۠([SIII)Ljava/lang/String;

    invoke-static {}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۟ۢ۠ۥ()I

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
    const-string v0, "XfswYzK2O9Kd5jMjkKsNhoAVrj"

    invoke-static {v0}, Lk4/۟۠ۦ۟ۤ;->ۢۨۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۟ۦۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۣ۟۟۟ۧ()I

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
    check-cast p0, Lcom/auto/accept/service/MyFirebaseService;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/MyFirebaseService;->sendRegistrationToServer(Ljava/lang/String;)V

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

.method public static ۣۥۣۧ()[S
    .locals 2

    invoke-static {}, Lj2/ۥ۠ۨۢ;->ۣۢۡۧ()I

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
    sget-object v0, Lcom/auto/accept/service/MyFirebaseService;->short:[S

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

.method public static ۦ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lh/ۢۢۨۨ;->ۡۦ۟ۡ()I

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
    check-cast p0, Lcom/auto/accept/service/MyFirebaseService;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lcom/auto/accept/service/MyFirebaseService;->sendNotification(Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

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
    const-string v0, "YuXo1uECG5mw3Dl5JV"

    invoke-static {v0}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->ۨۡۡۡ(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 7

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    const/16 v1, 0x6b

    sget v2, Ld1/ۣۧۡۡ;->ۧ۠ۦۣ:I

    xor-int/lit16 v2, v2, 0xc1

    const/16 v3, 0x887

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۨ۟ۢۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V

    invoke-static {p1}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۣ۟ۢۡ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v2

    const/16 v3, 0x78

    sget v4, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۧۧۦۨ:I

    xor-int/lit16 v4, v4, 0x23a

    const/16 v5, 0x6bf

    invoke-static {v2, v3, v4, v5}, La2/۟ۡۥۦ۟;->ۥۤ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v0

    const/16 v1, 0x7e

    sget v2, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟۟ۦ:I

    xor-int/lit16 v2, v2, -0xe2

    const/16 v3, 0xb8f

    invoke-static {v0, v1, v2, v3}, Lb7/ۣ۟۟ۦ۟;->۟ۤۧۡ۟([SIII)Ljava/lang/String;

    invoke-static {p1}, Lv6/۟ۦۨۦۣ;->۟ۦۢ۠۠(Ljava/lang/Object;)Lcom/google/firebase/messaging/RemoteMessage$Notification;

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
    invoke-static {v1}, Lm7/ۥۨۥ۟;->۟ۢۥۥۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v3

    const/16 v4, 0x8f

    sget v5, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۣ۟ۤۡۧ:I

    xor-int/lit16 v5, v5, -0xb4

    const/16 v6, 0x61b

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۣۣۥۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, La/ۥۦۥۡ;->۟ۤۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lm7/ۥۨۥ۟;->۟ۢۥۥۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/auto/accept/service/MyFirebaseService;->ۦ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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

.method public onNewToken(Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e8\u06e3\u06df"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e2\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p1}, Lv9/۟۟ۤۥ;->ۣۣۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    const-string v1, "\u06e1\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/16 v0, 0xaa

    const/16 v1, 0x1f7

    invoke-static {v2, v0, v4, v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۣۡۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e0\u06e8\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    const/16 v0, 0xaf

    const/16 v1, 0x6f2

    invoke-static {v2, v0, v4, v1}, Lg8/ۣۣۣ۟;->ۣۧۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06df\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v5, Landroidx/annotation/۟ۦۤ۟ۤ;->ۢۥۡۧ:I

    const-string v1, "\u06e0\u06df\u06e1"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_4
    sget v5, Lf/ۣ۟ۤۤ;->ۣۤۧۢ:I

    const-string v1, "\u06e8\u06e7\u06e4"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_5
    sget v5, Lia/۟۠ۡۦ۟;->۟ۥۥۧۡ:I

    const-string v1, "\u06e2\u06e3\u06e1"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_6
    xor-int/lit8 v4, v6, -0x4f

    const-string v1, "\u06df\u06e2\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onNewToken(Ljava/lang/String;)V

    const-string v1, "\u06e7\u06e8\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v1

    const-string v3, "\u06e4\u06e4\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v1

    const-string v3, "\u06e2\u06df\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit8 v4, v6, 0x6e

    const-string v1, "\u06e1\u06e7\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    const/16 v1, 0xc0

    const/16 v3, 0x2be

    invoke-static {v2, v1, v4, v3}, Lh4/۟ۧۢۡۦ;->ۣ۟ۡۨۦ([SIII)Ljava/lang/String;

    const-string v1, "\u06e8\u06e1\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_c
    invoke-static {p0, p1}, Lcom/auto/accept/service/MyFirebaseService;->۟ۦۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_d
    invoke-static {}, Lcom/auto/accept/service/MyFirebaseService;->ۣۥۣۧ()[S

    move-result-object v1

    const-string v3, "\u06e8\u06df\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_e
    xor-int/lit16 v4, v6, -0x1ec

    const-string v1, "\u06df\u06e6"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdbe7 -> :sswitch_2
        0xdc42 -> :sswitch_f
        0x1aa75d -> :sswitch_1
        0x1aaac2 -> :sswitch_6
        0x1aaec3 -> :sswitch_9
        0x1aaf80 -> :sswitch_b
        0x1ab249 -> :sswitch_5
        0x1ab2c0 -> :sswitch_a
        0x1aba22 -> :sswitch_7
        0x1aba68 -> :sswitch_4
        0x1ac623 -> :sswitch_8
        0x1ac8cb -> :sswitch_3
        0x1ac907 -> :sswitch_c
        0x1ac944 -> :sswitch_d
        0x1ac9c5 -> :sswitch_e
    .end sparse-switch
.end method
