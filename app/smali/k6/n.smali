.class public abstract Lk6/n;
.super Ljava/lang/Object;


# static fields
.field public static volatile d:Lcom/google/android/gms/internal/measurement/zzcp;

.field private static final short:[S


# instance fields
.field public final a:Lk6/p5;

.field public final b:Ll/h;

.field public volatile c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x25

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/n;->short:[S

    return-void

    :array_0
    .array-data 2
        0x781s
        0x7a6s
        0x7aes
        0x7abs
        0x7a2s
        0x7a3s
        0x7e7s
        0x7b3s
        0x7a8s
        0x7e7s
        0x7b4s
        0x7a4s
        0x7afs
        0x7a2s
        0x7a3s
        0x7b2s
        0x7abs
        0x7a2s
        0x7e7s
        0x7a3s
        0x7a2s
        0x7abs
        0x7a6s
        0x7bes
        0x7a2s
        0x7a3s
        0x7e7s
        0x7b7s
        0x7a8s
        0x7b4s
        0x7b3s
        0x7e9s
        0x7e7s
        0x7b3s
        0x7aes
        0x7aas
        0x7a2s
    .end array-data
.end method

.method public constructor <init>(Lk6/p5;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    iput-object p1, p0, Lk6/n;->a:Lk6/p5;

    new-instance v0, Ll/h;

    sget v1, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۢۢۧۢ:I

    xor-int/lit8 v1, v1, -0x35

    invoke-direct {v0, v1, p0, p1}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lk6/n;->b:Ll/h;

    invoke-static {}, Landroidx/preference/۟ۤۥۦۧ;->ۣۡۡۡ()I

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
    const-string v0, "Y3Mb"

    invoke-static {v0}, Landroid/os/ۣۣ۟ۤۨ;->۠ۤۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۧۧۧ۠()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۥ۠ۥ()I

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
    sget-object v0, Lk6/n;->short:[S

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
.method public final a()V
    .locals 6

    const/4 v1, 0x0

    const-string v3, "\u06e6\u06e1"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v2}, Lc4/۟ۦۧۦۤ;->ۥۧۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e5\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۣۣ۟۠ۧ(Ljava/lang/Object;)Landroid/os/Handler;

    move-result-object v0

    const-string v1, "\u06e3\u06e5\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lf4/ۡۥۣۢ;->ۥ۠ۦ۟(Ljava/lang/Object;)Ll/h;

    move-result-object v1

    const-string v3, "\u06e6\u06e1\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lk6/n;->c:J

    const-string v1, "\u06e5\u06e6\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_2
        0x1ab6c0 -> :sswitch_1
        0x1ab6c1 -> :sswitch_3
        0x1abe60 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(J)V
    .locals 5

    invoke-static {p0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۥۣ۟ۢ(Ljava/lang/Object;)V

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
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/startup/ۨۤ۟ۡ;->۠۠ۤۧ(Ljava/lang/Object;)Lk6/p5;

    move-result-object v0

    invoke-static {v0}, Lw5/ۣۨۧ۠;->۟ۤۥۡۡ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v0

    iput-wide v0, p0, Lk6/n;->c:J

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۣۣ۟۠ۧ(Ljava/lang/Object;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p0}, Lf4/ۡۥۣۢ;->ۥ۠ۦ۟(Ljava/lang/Object;)Ll/h;

    move-result-object v1

    invoke-static {v0, v1, p1, p2}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    move-result v1

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
    invoke-static {p0}, Landroidx/startup/ۨۤ۟ۡ;->۠۠ۤۧ(Ljava/lang/Object;)Lk6/p5;

    move-result-object v0

    invoke-static {v0}, Lh1/۟۟ۨۦۦ;->۟ۧ۠۠۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/n;->۟ۧۧۧ۠()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->۠۠ۢ۟:I

    xor-int/lit8 v3, v3, -0x1e

    const/16 v4, 0x7c7

    invoke-static {v1, v2, v3, v4}, Lh3/۟ۡۥ۠۠;->۟۠۟ۨ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method public abstract c()V
.end method

.method public final d()Landroid/os/Handler;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۡۡ۠ۢ()Lcom/google/android/gms/internal/measurement/zzcp;

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
    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۡۡ۠ۢ()Lcom/google/android/gms/internal/measurement/zzcp;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    const-class v2, Lk6/n;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۡۡ۠ۢ()Lcom/google/android/gms/internal/measurement/zzcp;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcp;

    invoke-static {p0}, Landroidx/startup/ۨۤ۟ۡ;->۠۠ۤۧ(Ljava/lang/Object;)Lk6/p5;

    move-result-object v1

    invoke-static {v1}, Lm1/ۣۡ۠ۧ;->ۦۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۠ۡ۟ۧ(Ljava/lang/Object;)Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcp;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lk6/n;->d:Lcom/google/android/gms/internal/measurement/zzcp;

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    const v0, 0xbe22

    goto :goto_3

    :catchall_0
    move-exception v0

    const v1, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :sswitch_8
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :sswitch_9
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_a
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۡۡ۠ۢ()Lcom/google/android/gms/internal/measurement/zzcp;

    move-result-object v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

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
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch
.end method
