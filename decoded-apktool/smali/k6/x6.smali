.class public final Lk6/x6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Lk6/x7;

.field public final f:Z

.field public final n:Lk6/s6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x78

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/x6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x8ads
        0x8e9s
        0x8e0s
        0x8e2s
        0x8e4s
        0x8e6s
        0x8fcs
        0x8acs
        0x8a5s
        0x8c3s
        0x8e4s
        0x8ecs
        0x8e9s
        0x8e0s
        0x8e1s
        0x8a5s
        0x8f1s
        0x8eas
        0x8a5s
        0x8e2s
        0x8e0s
        0x8f1s
        0x8a5s
        0x8f0s
        0x8f6s
        0x8e0s
        0x8f7s
        0x8a5s
        0x8f5s
        0x8f7s
        0x8eas
        0x8f5s
        0x8e0s
        0x8f7s
        0x8f1s
        0x8ecs
        0x8e0s
        0x8f6s
        0x8bes
        0x8a5s
        0x8ebs
        0x8eas
        0x8f1s
        0x8a5s
        0x8e6s
        0x8eas
        0x8ebs
        0x8ebs
        0x8e0s
        0x8e6s
        0x8f1s
        0x8e0s
        0x8e1s
        0x8a5s
        0x8f1s
        0x8eas
        0x8a5s
        0x8f6s
        0x8e0s
        0x8f7s
        0x8f3s
        0x8ecs
        0x8e6s
        0x8e0s
        0x78ds
        0x7c9s
        0x7c0s
        0x7c2s
        0x7c4s
        0x7c6s
        0x7dcs
        0x78cs
        0x785s
        0x7e3s
        0x7c4s
        0x7ccs
        0x7c9s
        0x7c0s
        0x7c1s
        0x785s
        0x7d1s
        0x7cas
        0x785s
        0x7c2s
        0x7c0s
        0x7d1s
        0x785s
        0x7d0s
        0x7d6s
        0x7c0s
        0x7d7s
        0x785s
        0x7d5s
        0x7d7s
        0x7cas
        0x7d5s
        0x7c0s
        0x7d7s
        0x7d1s
        0x7ccs
        0x7c0s
        0x7d6s
        0x79es
        0x785s
        0x7d7s
        0x7c0s
        0x7c8s
        0x7cas
        0x7d1s
        0x7c0s
        0x785s
        0x7c0s
        0x7dds
        0x7c6s
        0x7c0s
        0x7d5s
        0x7d1s
        0x7ccs
        0x7cas
        0x7cbs
    .end array-data
.end method

.method public constructor <init>(Lk6/s6;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Lk6/x7;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/x6;->n:Lk6/s6;

    iput-object p2, p0, Lk6/x6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    iput-object v0, p0, Lk6/x6;->b:Ljava/lang/String;

    iput-object p3, p0, Lk6/x6;->c:Ljava/lang/String;

    iput-object p4, p0, Lk6/x6;->d:Ljava/lang/String;

    iput-object p5, p0, Lk6/x6;->e:Lk6/x7;

    iput-boolean p6, p0, Lk6/x6;->f:Z

    invoke-static {}, Lt2/۟ۧۢ۟ۢ;->۟ۧۢۥۧ()I

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
    const-string v0, "HNdqq4fnAQ9DTbAPZtyjKaSFpSW"

    invoke-static {v0}, Lz/ۨۤۥۨ;->ۢۢۧۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۣۤۢ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤۡ()I

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
    sget-object v0, Lk6/x6;->short:[S

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
.method public final run()V
    .locals 7

    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۥۧۨۨ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۥۣۤ۠(Ljava/lang/Object;)Lk6/y3;

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
    if-nez v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/x6;->ۣۣۤۢ()[S

    move-result-object v1

    const/4 v3, 0x0

    sget v4, Lw2/۟ۧۥۦۨ;->ۥۥ۟۠:I

    xor-int/lit16 v4, v4, 0x282

    const/16 v5, 0x885

    invoke-static {v1, v3, v4, v5}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۦۣ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lz/ۨۤۥۨ;->ۧ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۡۢۧۦ(Ljava/lang/Object;)Lk6/h4;

    move-result-object v3

    invoke-static {p0}, Lea/ۦۦۨۨ;->۟۠ۨۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Ly6/۟ۢ۟ۥۤ;->۟۟ۢۤ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v1, v3, v4, v5}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->۟ۢۨۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣۡۢۥ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :sswitch_3
    return-void

    :catchall_0
    move-exception v0

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const/16 v1, 0x6eb

    goto :goto_2

    :catchall_1
    move-exception v0

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    const v1, 0xbe22

    goto :goto_3

    :catch_0
    move-exception v0

    const v1, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :sswitch_6
    :try_start_2
    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۥۧۨۨ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {v1}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {}, Lk6/x6;->ۣۣۤۢ()[S

    move-result-object v3

    const/16 v4, 0x40

    sget v5, Lk4/۟۠ۦ۟ۤ;->ۨۦۢ۠:I

    xor-int/lit16 v5, v5, -0x37d

    const/16 v6, 0x7a5

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->ۡۦۦۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lz/ۨۤۥۨ;->ۧ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۡۢۧۦ(Ljava/lang/Object;)Lk6/h4;

    move-result-object v4

    invoke-static {p0}, Lea/ۦۦۨۨ;->۟۠ۨۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v3, v4, v5, v0}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->۟ۢۨۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣۡۢۥ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    :sswitch_7
    monitor-exit v2

    invoke-static {}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۢۧۨ()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    const v0, 0xc2fa

    :goto_5
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_8
    if-ltz v1, :cond_2

    const v0, 0xc5e2

    goto :goto_5

    :sswitch_9
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_a
    :try_start_4
    invoke-static {p0}, Lz/ۨۤۥۨ;->ۧ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۠۟ۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :cond_1
    :sswitch_b
    const v0, 0xbf39

    goto :goto_6

    :sswitch_c
    if-eqz v1, :cond_1

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_d
    invoke-static {p0}, Lu4/۟ۡۢۦۣ;->ۨۥۥۣ(Ljava/lang/Object;)Lk6/x7;

    move-result-object v0

    invoke-static {v0}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Lea/ۦۦۨۨ;->۟۠ۨۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ly6/۟ۢ۟ۥۤ;->۟۟ۢۤ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->ۢۢۡۤ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {p0}, Lu4/۟ۡۢۦۣ;->ۨۥۥۣ(Ljava/lang/Object;)Lk6/x7;

    move-result-object v6

    invoke-static {v3, v1, v4, v5, v6}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۢۨۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_e
    const v0, 0xc221

    goto :goto_7

    :sswitch_f
    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Lz/ۨۤۥۨ;->ۧ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lea/ۦۦۨۨ;->۟۠ۨۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Ly6/۟ۢ۟ۥۤ;->۟۟ۢۤ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->ۢۢۡۤ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v3, v1, v4, v5, v6}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->۟ۦۤۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_10
    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۥۧۨۨ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Lh7/۟۟ۧۨ۟;->ۧۡ۠ۢ(Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    const v0, 0xc27e

    :goto_8
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_11
    const v0, 0xc29d

    goto :goto_8

    :cond_2
    :sswitch_12
    const v0, 0xc5c3

    goto/16 :goto_5

    :sswitch_13
    const-string v0, "w5lQfay1bwG"

    invoke-static {v0}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۢۥۥۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_14
    invoke-static {p0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۡۥۦ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    throw v0

    :sswitch_15
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_14
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x1f1 -> :sswitch_8
        0x6af -> :sswitch_12
        0x6c8 -> :sswitch_3
        0x6e9 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_7
        0xf1 -> :sswitch_11
    .end sparse-switch
.end method
