.class public final synthetic Lk6/z5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final c:Lk6/y5;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk6/y5;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lk6/z5;->a:I

    iput-object p1, p0, Lk6/z5;->c:Lk6/y5;

    iput-object p2, p0, Lk6/z5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Le9/ۧۧۡ;->ۨۦ۟ۥ()I

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
    const-string v0, "TQK3znVBxAFyBahfXussaA"

    invoke-static {v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۥۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method private final a()V
    .locals 5

    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v3

    invoke-static {v3}, Lw0/۟ۤۧۥۥ;->ۥۡۥۢ(Ljava/lang/Object;)Lk6/z3;

    move-result-object v3

    invoke-static {v3}, Le7/ۧ۠ۧ;->ۣ۟ۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Landroidx/activity/ۣۧۧۢ;->ۣۤۡ۠()Lk6/x3;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۟ۥۨ۟ۡ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

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
    check-cast p0, Lk6/z5;

    invoke-direct {p0}, Lk6/z5;->a()V

    :sswitch_3
    invoke-static {}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۤۤۥۣ()I

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
    const-string v0, "vXWUC"

    invoke-static {v0}, La7/۠ۢۧ;->۟ۥۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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
.method public final run()V
    .locals 6

    invoke-static {p0}, Ll8/ۢۦۥۢ;->ۥۥۤۦ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v3

    invoke-static {v3}, Lw0/۟ۤۧۥۥ;->ۥۡۥۢ(Ljava/lang/Object;)Lk6/z3;

    move-result-object v3

    invoke-static {v3}, Le7/ۧ۠ۧ;->ۣ۟ۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lr6/ۥۡۥۥ;->ۤۦ۟۟()Lk6/x3;

    move-result-object v4

    invoke-static {v1, v3, v4}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۥۣۣ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)D

    move-result-wide v4

    invoke-static {v4, v5}, Lt2/۟ۦۢۡۧ;->ۣ۟ۡۡۧ(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    monitor-exit v2

    invoke-static {}, Lm3/۟ۦۦۡۢ;->۟ۢ۟ۦۦ()I

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
    const-string v0, "gzX8Bsr7hhksLdXR2pEZBXJAU"

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۟ۢ۠۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    throw v0

    :sswitch_5
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    monitor-enter v2

    :try_start_2
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v3

    invoke-static {v3}, Lw0/۟ۤۧۥۥ;->ۥۡۥۢ(Ljava/lang/Object;)Lk6/z3;

    move-result-object v3

    invoke-static {v3}, Le7/ۧ۠ۧ;->ۣ۟ۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lv9/۠ۡۨۨ;->۟ۤۦۧۨ()Lk6/x3;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lp8/۟۟ۢ۟ۢ;->۟ۡ۠ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    monitor-exit v2

    goto :goto_1

    :catchall_2
    move-exception v0

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    const v1, 0xbe22

    goto :goto_3

    :catchall_3
    move-exception v0

    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    throw v0

    :sswitch_7
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :pswitch_1
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    monitor-enter v2

    :try_start_4
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v3

    invoke-static {v3}, Lw0/۟ۤۧۥۥ;->ۥۡۥۢ(Ljava/lang/Object;)Lk6/z3;

    move-result-object v3

    invoke-static {v3}, Le7/ۧ۠ۧ;->ۣ۟ۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۟ۡۢ۟ۧ()Lk6/x3;

    move-result-object v4

    invoke-static {v1, v3, v4}, La/ۥۡۢۨ;->۟۟ۦۦۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    monitor-exit v2

    goto/16 :goto_1

    :catchall_4
    move-exception v0

    const v1, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :sswitch_8
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw v0

    :sswitch_9
    const v1, 0xbe9e

    goto :goto_4

    :catchall_5
    move-exception v0

    :try_start_6
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :pswitch_2
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    monitor-enter v2

    :try_start_7
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v3

    invoke-static {v3}, Lw0/۟ۤۧۥۥ;->ۥۡۥۢ(Ljava/lang/Object;)Lk6/z3;

    move-result-object v3

    invoke-static {v3}, Le7/ۧ۠ۧ;->ۣ۟ۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۟ۥۨ()Lk6/x3;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۢۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ld9/ۧۧۨۥ;->ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :try_start_8
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    monitor-exit v2

    goto/16 :goto_1

    :catchall_6
    move-exception v0

    const v1, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_a
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    throw v0

    :sswitch_b
    const v1, 0xbf1a

    goto :goto_5

    :catchall_7
    move-exception v0

    :try_start_9
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۢۤۡۡ(Ljava/lang/Object;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :pswitch_3
    invoke-static {p0}, Lk6/z5;->۟ۥۨ۟ۡ(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_4
    invoke-static {p0}, Lu7/ۣ۟ۡ۟;->ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-static {p0}, Ll2/ۦۣ۠ۥ;->ۨۤۢۡ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {v0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {v1}, Ld/۟ۤ۠ۡۨ;->ۣۦ۠۠(Ljava/lang/Object;)Li3/a0;

    move-result-object v1

    invoke-static {v1}, Lc6/۟ۧۧ۠ۤ;->ۣۧ۠۠(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v4

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->۟ۧ۟۠۠(Ljava/lang/Object;)Lk6/s6;

    move-result-object v1

    const v0, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-nez v4, :cond_1

    const v0, 0xc25f

    goto :goto_6

    :cond_1
    :sswitch_d
    const v0, 0xc240

    goto :goto_6

    :sswitch_e
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    :sswitch_f
    invoke-static {v1}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    new-instance v0, Lk/e;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lc1/ۢۥۥ۟;->ۣ۟۠ۨۡ(Ljava/lang/Object;Z)Lk6/x7;

    move-result-object v3

    sget v5, Lv/ۣۢ۟ۧ;->ۣ۠ۨۤ:I

    xor-int/lit16 v5, v5, 0x3c6

    invoke-direct/range {v0 .. v5}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v0}, Lh6/ۧۧۤ۟;->۟ۦۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x1f7 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_f
    .end sparse-switch
.end method
