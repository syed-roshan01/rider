.class public final Lk6/x3;
.super Ljava/lang/Object;


# static fields
.field public static final g:Ljava/lang/Object;

.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lk6/w3;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x36

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/x3;->short:[S

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lk6/x3;->g:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 2
        0x1d4s
        0x1e3s
        0x1e0s
        0x1f4s
        0x1e3s
        0x1f5s
        0x1ees
        0x1efs
        0x1e8s
        0x1e1s
        0x1a6s
        0x1e0s
        0x1eas
        0x1e7s
        0x1e1s
        0x1a6s
        0x1e5s
        0x1e7s
        0x1e5s
        0x1ees
        0x1e3s
        0x1a6s
        0x1ebs
        0x1f3s
        0x1f5s
        0x1f2s
        0x1a6s
        0x1e4s
        0x1e3s
        0x1a6s
        0x1e2s
        0x1e9s
        0x1e8s
        0x1e3s
        0x1a6s
        0x1e9s
        0x1e8s
        0x1a6s
        0x1e7s
        0x1a6s
        0x1f1s
        0x1e9s
        0x1f4s
        0x1eds
        0x1e3s
        0x1f4s
        0x1a6s
        0x1f2s
        0x1ees
        0x1f4s
        0x1e3s
        0x1e7s
        0x1e2s
        0x1a8s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lk6/w3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk6/x3;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lk6/x3;->f:Ljava/lang/Object;

    iput-object p1, p0, Lk6/x3;->a:Ljava/lang/String;

    iput-object p2, p0, Lk6/x3;->c:Ljava/lang/Object;

    iput-object p3, p0, Lk6/x3;->d:Ljava/lang/Object;

    iput-object p4, p0, Lk6/x3;->b:Lk6/w3;

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۥۡۧ۠()I

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
    const-string v0, "M7Dv6t5BciscBKjEsOYrX7B"

    invoke-static {v0}, Lga/۟ۢۧ۟ۦ;->۟۟ۤۨۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۟ۡۨۤۢ()[S
    .locals 2

    invoke-static {}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥۡۦ()I

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
    sget-object v0, Lk6/x3;->short:[S

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۨ۟ۢۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

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
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lg0/۟ۥۢۥۢ;->۟ۤۢۤۡ()Lk6/h;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lja/ۥۣۨ۠;->ۣ۟ۨۧ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    :sswitch_6
    return-object p1

    :sswitch_7
    invoke-static {}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->۟ۦۨ۠۠()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_1
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->ۢۤ۟ۢ()Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {p0}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۣ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-nez v1, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {p0}, Lja/ۥۣۨ۠;->ۣ۟ۨۧ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_e
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v0

    const v1, 0xc202

    :goto_7
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    const v1, 0xc221

    goto :goto_7

    :sswitch_10
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_11
    invoke-static {p0}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۣ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :sswitch_12
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lb/۠ۨۦۥ;->۟ۧۢۥۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_13
    invoke-static {v3}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc27e

    :goto_8
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-eqz v1, :cond_4

    const v0, 0xc2db

    goto :goto_8

    :sswitch_16
    invoke-static {v3}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/x3;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->ۢۤ۟ۢ()Z
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v2

    const v1, 0xc2fa

    :goto_9
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :sswitch_17
    if-nez v2, :cond_5

    const v1, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_18
    const v1, 0xc5c3

    goto :goto_9

    :sswitch_19
    const/4 v1, 0x0

    :try_start_3
    invoke-static {v0}, Lk1/ۨ۟ۧۡ;->ۥۢۤ۟(Ljava/lang/Object;)Lk6/w3;

    move-result-object v4

    const v2, 0xc601

    :goto_a
    const v5, 0xc612

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_1a
    if-eqz v4, :cond_6

    const v2, 0xc65e

    goto :goto_a

    :cond_6
    :sswitch_1b
    const v2, 0xc63f

    goto :goto_a

    :sswitch_1c
    invoke-static {v4}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۥۨ۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v1

    :sswitch_1d
    :try_start_4
    invoke-static {}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->۟ۦۨ۠۠()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    iput-object v1, v0, Lk6/x3;->f:Ljava/lang/Object;

    monitor-exit v2

    const v0, 0xc67d

    :goto_b
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :sswitch_1e
    const v0, 0xc69c

    goto :goto_b

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    const v0, 0xca00

    :goto_c
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_c

    :pswitch_1
    :sswitch_1f
    invoke-static {p0}, Lk1/ۨ۟ۧۡ;->ۥۢۤ۟(Ljava/lang/Object;)Lk6/w3;

    move-result-object v1

    const v0, 0xc984

    :goto_d
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :sswitch_20
    if-nez v1, :cond_7

    const v0, 0xc9e1

    goto :goto_d

    :sswitch_21
    :try_start_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk6/x3;->۟ۡۨۤۢ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lw5/ۢۤۢ۠;->۟ۥۤۧ۠:I

    xor-int/lit16 v3, v3, 0x103

    const/16 v4, 0x186

    invoke-static {v1, v2, v3, v4}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟۟ۦۣۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_0

    :cond_7
    :sswitch_22
    const v0, 0xc9c2

    goto :goto_d

    :sswitch_23
    invoke-static {p0}, Lja/ۥۣۨ۠;->ۣ۟ۨۧ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_24
    :try_start_8
    invoke-static {v1}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۥۨ۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_1

    move-result-object p1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    invoke-static {p0}, Lja/ۥۣۨ۠;->ۣ۟ۨۧ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :catch_2
    move-exception v0

    invoke-static {p0}, Lja/ۥۣۨ۠;->ۣ۟ۨۧ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :sswitch_25
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw v0

    :catchall_2
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    throw v0

    :pswitch_2
    const v0, 0xca1f

    goto :goto_c

    :catch_3
    move-exception v2

    const v2, 0xca7c

    :goto_e
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :sswitch_26
    const v2, 0xcd26

    goto :goto_e

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
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
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_12
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_11
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1f
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_21
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x2d -> :sswitch_1d
        0x32 -> :sswitch_1b
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_13
        0xf3 -> :sswitch_1e
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_22
        0x57 -> :sswitch_24
        0x74 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_26
        0x7ab -> :sswitch_1d
    .end sparse-switch
.end method
