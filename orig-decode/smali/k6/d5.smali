.class public final Lk6/d5;
.super Ljava/util/concurrent/FutureTask;

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Lk6/z4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/d5;->short:[S

    return-void

    :array_0
    .array-data 2
        0x5e6s
        0x5d3s
        0x5c1s
        0x5d9s
        0x5c1s
        0x592s
        0x5dbs
        0x5dcs
        0x5d6s
        0x5d7s
        0x5cas
        0x592s
        0x5dds
        0x5c4s
        0x5d7s
        0x5c0s
        0x5d4s
        0x5des
        0x5dds
        0x5c5s
        0x464s
        0x451s
        0x443s
        0x45bs
        0x410s
        0x455s
        0x448s
        0x453s
        0x455s
        0x440s
        0x444s
        0x459s
        0x45fs
        0x45es
        0x410s
        0x45fs
        0x45es
        0x410s
        0x447s
        0x45fs
        0x442s
        0x45bs
        0x455s
        0x442s
        0x410s
        0x444s
        0x458s
        0x442s
        0x455s
        0x451s
        0x454s
        0x401s
        0x434s
        0x426s
        0x43es
        0x426s
        0x475s
        0x43cs
        0x43bs
        0x431s
        0x430s
        0x42ds
        0x475s
        0x43as
        0x423s
        0x430s
        0x427s
        0x433s
        0x439s
        0x43as
        0x422s
        0x344s
        0x367s
        0x37fs
        0x330s
        0x364s
        0x371s
        0x363s
        0x37bs
        0x363s
        0x330s
        0x363s
        0x378s
        0x371s
        0x362s
        0x375s
        0x330s
        0x364s
        0x378s
        0x375s
        0x330s
        0x363s
        0x371s
        0x37ds
        0x375s
        0x330s
        0x379s
        0x37es
        0x374s
        0x375s
        0x368s
        0x33es
        0x330s
        0x379s
        0x37es
        0x374s
        0x375s
        0x368s
    .end array-data
.end method

.method public constructor <init>(Lk6/z4;Ljava/lang/Runnable;ZLjava/lang/String;)V
    .locals 5

    iput-object p1, p0, Lk6/d5;->d:Lk6/z4;

    invoke-static {}, Lh7/ۣ۟ۤ۠۠;->ۨۥۣۡ()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣ۟۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-static {}, Lw2/۟ۧۥۦۨ;->ۢۡۧۧ()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-static {v0}, Lk4/۟۠ۦ۟ۤ;->۟ۦۦ۟(Ljava/lang/Object;)J

    move-result-wide v2

    iput-wide v2, p0, Lk6/d5;->a:J

    iput-object p4, p0, Lk6/d5;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lk6/d5;->b:Z

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
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/d5;->۟ۦۣۡۡ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lm7/ۥۨۥ۟;->۠ۡۡۦ:I

    xor-int/lit16 v3, v3, 0x318

    const/16 v4, 0x5b2

    invoke-static {v1, v2, v3, v4}, Lb7/۟۟ۤۤۤ;->ۣ۟۠ۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lr4/۟ۦۦ۠ۥ;->ۣ۠ۦ۠()I

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
    const-string v0, "w0xVNiPSAsOulfNeQe"

    invoke-static {v0}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣ۟ۤۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public constructor <init>(Lk6/z4;Ljava/util/concurrent/Callable;Z)V
    .locals 6

    iput-object p1, p0, Lk6/d5;->d:Lk6/z4;

    invoke-static {}, Lh7/ۣ۟ۤ۠۠;->ۨۥۣۡ()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    invoke-static {v0, p2}, La2/۟ۡۥۦ۟;->۟ۢۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {}, Lw2/۟ۧۥۦۨ;->ۢۡۧۧ()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-static {v0}, Lk4/۟۠ۦ۟ۤ;->۟ۦۦ۟(Ljava/lang/Object;)J

    move-result-wide v2

    iput-wide v2, p0, Lk6/d5;->a:J

    invoke-static {}, Lk6/d5;->۟ۦۣۡۡ()[S

    move-result-object v0

    const/16 v1, 0x14

    sget v4, Lk1/ۨ۟ۧۡ;->۟ۡۥۥ۠:I

    xor-int/lit16 v4, v4, 0x32c

    const/16 v5, 0x430

    invoke-static {v0, v1, v4, v5}, Ld7/۟ۢۧۧ۠;->۟ۢ۠ۡ۟([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/d5;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lk6/d5;->b:Z

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
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/d5;->۟ۦۣۡۡ()[S

    move-result-object v1

    const/16 v2, 0x33

    sget v3, Landroid/support/v4/app/ۥۣۡ;->ۣ۟ۤۡۥ:I

    xor-int/lit16 v3, v3, 0x2e7

    const/16 v4, 0x455

    invoke-static {v1, v2, v3, v4}, Lq6/ۣ۟ۢ۟ۤ;->ۧۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lu7/ۣ۟ۡ۟;->ۡۤۧۧ()I

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
    const-string v0, "UPEsekLsy2LTa9kKUm9szIdFL5i3"

    invoke-static {v0}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۠ۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۟ۦۣۡۡ()[S
    .locals 2

    invoke-static {}, Lfa/ۦۣۡۢ;->ۧۦۣ۟()I

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
    sget-object v0, Lk6/d5;->short:[S

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
.method public final compareTo(Ljava/lang/Object;)I
    .locals 8

    const/4 v1, 0x1

    check-cast p1, Lk6/d5;

    invoke-static {p1}, Lc4/۟ۢۨۥۡ;->۟۠۠ۡۦ(Ljava/lang/Object;)Z

    move-result v3

    sget v0, Lh/ۢۢۨۨ;->۟ۥۧ۠۟:I

    xor-int/lit16 v0, v0, 0x1e9

    invoke-static {p0}, Lc4/۟ۢۨۥۡ;->۟۠۠ۡۦ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eq v4, v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v4, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    move v0, v1

    :goto_2
    :sswitch_6
    return v0

    :sswitch_7
    invoke-static {p0}, Lu/ۣۤۧ۠;->ۢ۠ۤ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p1}, Lu/ۣۤۧ۠;->ۢ۠ۤ(Ljava/lang/Object;)J

    move-result-wide v6

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    cmp-long v2, v4, v6

    if-gez v2, :cond_2

    const v2, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbe41

    goto :goto_3

    :sswitch_a
    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    move v0, v1

    goto :goto_2

    :sswitch_e
    invoke-static {p0}, Lj5/۟ۢۥۨۦ;->۟ۥۨۤۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/d5;->۟ۦۣۡۡ()[S

    move-result-object v1

    const/16 v2, 0x47

    sget v3, Lk/ۣۡۤۧ;->ۤۧۨۦ:I

    xor-int/lit16 v3, v3, 0x122

    const/16 v6, 0x310

    invoke-static {v1, v2, v3, v6}, Ly9/ۨ۠;->ۥۣۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0}, Lk3/ۦ۠ۢۥ;->۟ۡ۠ۡ۟(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1, v2}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_e
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method public final setException(Ljava/lang/Throwable;)V
    .locals 6

    const/4 v1, 0x0

    const-string v5, "\u06e6\u06e6\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->۟ۥۣ۠۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e1\u06e3\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    const-string v1, "\u06e3\u06e3\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    const-string v1, "\u06e8\u06e1\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lj5/۟ۢۥۨۦ;->۟ۥۨۤۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v1

    const-string v5, "\u06e1\u06e5\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v4, p1}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e6\u06df\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v3}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    const-string v5, "\u06e3\u06e0\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaeff -> :sswitch_1
        0x1aaf44 -> :sswitch_4
        0x1ab683 -> :sswitch_5
        0x1ac148 -> :sswitch_0
        0x1ac227 -> :sswitch_2
        0x1ac907 -> :sswitch_3
    .end sparse-switch
.end method
