.class public final Lk6/g6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final n:Lk6/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x66

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/g6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x2ebs
        0x2ccs
        0x2c4s
        0x2c1s
        0x2c8s
        0x2c9s
        0x28ds
        0x2d9s
        0x2c2s
        0x28ds
        0x2cas
        0x2c8s
        0x2d9s
        0x28ds
        0x2d8s
        0x2des
        0x2c8s
        0x2dfs
        0x28ds
        0x2dds
        0x2dfs
        0x2c2s
        0x2dds
        0x2c8s
        0x2dfs
        0x2d9s
        0x2c4s
        0x2c8s
        0x2des
        0x296s
        0x28ds
        0x2c3s
        0x2c2s
        0x2d9s
        0x28ds
        0x2ces
        0x2c2s
        0x2c3s
        0x2c3s
        0x2c8s
        0x2ces
        0x2d9s
        0x2c8s
        0x2c9s
        0x28ds
        0x2d9s
        0x2c2s
        0x28ds
        0x2des
        0x2c8s
        0x2dfs
        0x2dbs
        0x2c4s
        0x2ces
        0x2c8s
        0x2acs
        0x28bs
        0x283s
        0x286s
        0x28fs
        0x28es
        0x2cas
        0x29es
        0x285s
        0x2cas
        0x28ds
        0x28fs
        0x29es
        0x2cas
        0x29fs
        0x299s
        0x28fs
        0x298s
        0x2cas
        0x29as
        0x298s
        0x285s
        0x29as
        0x28fs
        0x298s
        0x29es
        0x283s
        0x28fs
        0x299s
        0x2d1s
        0x2cas
        0x298s
        0x28fs
        0x287s
        0x285s
        0x29es
        0x28fs
        0x2cas
        0x28fs
        0x292s
        0x289s
        0x28fs
        0x29as
        0x29es
        0x283s
        0x285s
        0x284s
    .end array-data
.end method

.method public constructor <init>(Lk6/s6;Ljava/lang/String;Ljava/lang/String;Lk6/x7;ZLcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lk6/g6;->a:I

    iput-object p1, p0, Lk6/g6;->n:Lk6/p2;

    iput-object p2, p0, Lk6/g6;->b:Ljava/lang/String;

    iput-object p3, p0, Lk6/g6;->c:Ljava/lang/String;

    iput-object p4, p0, Lk6/g6;->e:Ljava/lang/Object;

    iput-boolean p5, p0, Lk6/g6;->d:Z

    iput-object p6, p0, Lk6/g6;->f:Ljava/lang/Object;

    invoke-static {}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۠ۨۡ()I

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
    const-string v0, "VrK9Rxtjclrd"

    invoke-static {v0}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->۟ۡۡۥۣ(Ljava/lang/String;)Ljava/lang/String;

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

.method public constructor <init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk6/g6;->a:I

    iput-object p1, p0, Lk6/g6;->n:Lk6/p2;

    iput-object p2, p0, Lk6/g6;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lk6/g6;->b:Ljava/lang/String;

    iput-object p3, p0, Lk6/g6;->c:Ljava/lang/String;

    iput-object p4, p0, Lk6/g6;->f:Ljava/lang/Object;

    iput-boolean p5, p0, Lk6/g6;->d:Z

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

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
    const-string v0, "joLa"

    invoke-static {v0}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->۟ۦۥۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۥۤۤۡ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

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
    sget-object v0, Lk6/g6;->short:[S

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
    .locals 11

    const/4 v6, 0x0

    invoke-static {p0}, Lc3/۟ۥ۠ۡۧ;->ۢۦۡۢ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lg9/۠ۨۧۤ;->ۨۦ۟ۤ(Ljava/lang/Object;)Lk6/p2;

    move-result-object v2

    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣۣۨ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p0}, Lw2/ۤ۠ۨۤ;->۟ۤۤ۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    packed-switch v1, :pswitch_data_0

    invoke-static {p0}, Lp0/۟ۢۤۧ;->ۡۦۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    :try_start_0
    move-object v0, v2

    check-cast v0, Lk6/s6;

    move-object v1, v0

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۥۣۤ۠(Ljava/lang/Object;)Lk6/y3;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    invoke-static {p0}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

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
    if-nez v6, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_1
    move-object v0, v2

    check-cast v0, Lk6/s6;

    move-object v1, v0

    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {v1}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {}, Lk6/g6;->۟ۥۤۤۡ()[S

    move-result-object v3

    const/4 v6, 0x0

    sget v9, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۥۤۤ:I

    xor-int/lit16 v9, v9, -0xf9

    const/16 v10, 0x2ad

    invoke-static {v3, v6, v9, v10}, Le2/۟۟ۥۦ;->ۣ۟ۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v7, v8}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    check-cast v2, Lk6/s6;

    invoke-static {v2}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v2

    move-object v1, v5

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-static {v2, v1, v4}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۧ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v3, v4

    :goto_2
    const/16 v4, 0x748

    :goto_3
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_3

    :sswitch_4
    const v4, 0xbe22

    goto :goto_3

    :catch_0
    move-exception v1

    move-object v6, v1

    move-object v3, v4

    :goto_4
    const v1, 0xbe7f

    :goto_5
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_5

    :sswitch_5
    :try_start_2
    move-object v0, v2

    check-cast v0, Lk6/s6;

    move-object v1, v0

    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {v1}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {}, Lk6/g6;->۟ۥۤۤۡ()[S

    move-result-object v4

    const/16 v8, 0x37

    sget v9, La6/۟ۤۨۨ۟;->۟۠۠ۢۥ:I

    xor-int/lit16 v9, v9, -0x190

    const/16 v10, 0x2ea

    invoke-static {v4, v8, v9, v10}, Lh/ۥۦۡۧ;->ۥۣۨۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v7, v6}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    check-cast v2, Lk6/s6;

    invoke-static {v2}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v1

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-static {v1, v5, v3}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۧ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

    move-result v2

    const v1, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_6

    :sswitch_7
    if-ltz v2, :cond_1

    const v1, 0xc25f

    goto :goto_6

    :sswitch_8
    const v1, 0xbe9e

    goto :goto_5

    :sswitch_9
    :try_start_3
    move-object v0, v3

    check-cast v0, Lk6/x7;

    move-object v1, v0

    invoke-static {v1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    invoke-static {p0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۧ(Ljava/lang/Object;)Z

    move-result v1

    check-cast v3, Lk6/x7;

    invoke-static {v6, v7, v8, v1, v3}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۢۨۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lc3/۟ۡۧۢۥ;->۟ۧ۠ۧ(Ljava/lang/Object;)Landroid/os/Bundle;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v3

    :try_start_4
    move-object v0, v2

    check-cast v0, Lk6/s6;

    move-object v1, v0

    invoke-static {v1}, Lh7/۟۟ۧۨ۟;->ۧۡ۠ۢ(Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    check-cast v2, Lk6/s6;

    invoke-static {v2}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v1

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-static {v1, v5, v3}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۧ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xbefb

    :goto_7
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_a
    const v1, 0xbf1a

    goto :goto_7

    :cond_1
    :sswitch_b
    const v1, 0xc240

    goto :goto_6

    :sswitch_c
    const-string v1, "aRD6mCyXuKLZYyEpvRozf"

    invoke-static {v1}, Ly9/ۨ۠;->ۣ۠ۥۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_8
    :sswitch_d
    return-void

    :sswitch_e
    check-cast v2, Lk6/s6;

    invoke-static {v2}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v2

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-static {v2, v5, v3}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۧ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    check-cast v2, Lk6/y5;

    invoke-static {v2}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/f5;

    invoke-static {v1}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۣۢۢۦ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v2

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p0}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    check-cast v5, Ljava/lang/String;

    invoke-static {p0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۧ(Ljava/lang/Object;)Z

    move-result v7

    invoke-static {v2}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v2}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    new-instance v1, Lk6/x6;

    invoke-static {v2, v6}, Lc1/ۢۥۥ۟;->ۣ۟۠ۨۡ(Ljava/lang/Object;Z)Lk6/x7;

    move-result-object v6

    invoke-direct/range {v1 .. v7}, Lk6/x6;-><init>(Lk6/s6;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Lk6/x7;Z)V

    invoke-static {v2, v1}, Lh6/ۧۧۤ۟;->۟ۦۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :catch_1
    move-exception v1

    move-object v6, v1

    goto/16 :goto_4

    :catchall_1
    move-exception v1

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

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
        0x36 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_e
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_7
        0x32 -> :sswitch_b
        0x4c -> :sswitch_c
        0x53 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_6
        0x1f7 -> :sswitch_a
    .end sparse-switch
.end method
