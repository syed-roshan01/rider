.class public final synthetic Lk6/u4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lk6/t4;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x79

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/u4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x5f4s
        0x5f3s
        0x5e9s
        0x5f8s
        0x5efs
        0x5f3s
        0x5fcs
        0x5f1s
        0x5b3s
        0x5fcs
        0x5eds
        0x5eds
        0x5d0s
        0x5f8s
        0x5e9s
        0x5fcs
        0x5f9s
        0x5fcs
        0x5e9s
        0x5fcs
        0x402s
        0x41es
        0x413s
        0x406s
        0x414s
        0x41ds
        0x400s
        0x41fs
        0x82cs
        0x823s
        0x829s
        0x83fs
        0x822s
        0x824s
        0x829s
        0x9eas
        0x9fbs
        0x9f9s
        0x9f1s
        0x9fbs
        0x9fds
        0x9ffs
        0x9c5s
        0x9f4s
        0x9fbs
        0x9f7s
        0x9ffs
        0x5a3s
        0x5a9s
        0x5b4s
        0x59bs
        0x5b2s
        0x5a1s
        0x5b6s
        0x5b7s
        0x5ads
        0x5abs
        0x5aas
        0x11es
        0x10fs
        0x10fs
        0x120s
        0x109s
        0x11as
        0x10ds
        0x10cs
        0x116s
        0x110s
        0x111s
        0x21as
        0x20bs
        0x20bs
        0x224s
        0x20ds
        0x21es
        0x209s
        0x208s
        0x212s
        0x214s
        0x215s
        0x224s
        0x212s
        0x215s
        0x20fs
        0x975s
        0x968s
        0x97fs
        0x970s
        0x97cs
        0x978s
        0x965s
        0x974s
        0x94es
        0x967s
        0x974s
        0x963s
        0x962s
        0x978s
        0x97es
        0x97fs
        0x755s
        0x752s
        0x748s
        0x759s
        0x74es
        0x752s
        0x75ds
        0x750s
        0x712s
        0x74es
        0x759s
        0x751s
        0x753s
        0x748s
        0x759s
        0x77fs
        0x753s
        0x752s
        0x75as
        0x755s
        0x75bs
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/t4;Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lk6/u4;->a:I

    iput-object p1, p0, Lk6/u4;->b:Lk6/t4;

    iput-object p2, p0, Lk6/u4;->c:Ljava/lang/String;

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

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
    const-string v0, "hj7"

    invoke-static {v0}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟۟ۢۨۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۥ۠ۤ۠()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۧۦۨ۟()I

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
    sget-object v0, Lk6/u4;->short:[S

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
.method public final call()Ljava/lang/Object;
    .locals 8

    invoke-static {p0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟ۥۤۡ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lm0/۟ۤۡۤۤ;->ۦۣۤۧ(Ljava/lang/Object;)Lk6/t4;

    move-result-object v0

    invoke-static {p0}, Lm0/۟ۤۡۤۤ;->۟۠ۢ۟۠(Ljava/lang/Object;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v2, Lk6/u4;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lk6/u4;-><init>(Lk6/t4;Ljava/lang/String;I)V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzx;

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v1

    const/4 v3, 0x0

    sget v4, Lg/۟ۦۥۥۤ;->۟ۡۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x18a

    const/16 v5, 0x59d

    invoke-static {v1, v3, v4, v5}, Landroidx/core/content/ۣۣۣ۟;->ۥۣ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzx;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    :goto_0
    :sswitch_0
    return-object v0

    :pswitch_0
    invoke-static {v0}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۡۤ۠ۧ(Ljava/lang/Object;)Lk6/k;

    move-result-object v0

    invoke-static {v0, v1}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣ۟ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Lk6/a5;

    move-result-object v2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v3

    const/16 v4, 0x14

    sget v5, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۥۧۥۢ:I

    xor-int/lit16 v5, v5, -0x130

    const/16 v6, 0x472

    invoke-static {v3, v4, v5, v6}, Lc4/۟ۢۨۥۡ;->ۣ۟ۨۦۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v4

    const/16 v5, 0x1c

    sget v6, Ld9/ۡۥۣۡ;->۟ۥۥ۟۟:I

    xor-int/lit16 v6, v6, -0xf0

    const/16 v7, 0x84d

    invoke-static {v4, v5, v6, v7}, Lc7/ۨۤۦۢ;->ۣۧۦ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v3

    const/16 v4, 0x23

    sget v5, Ls8/۟ۥۨۨ;->۟ۥۣۤ۟:I

    xor-int/lit16 v5, v5, -0x294

    const/16 v6, 0x99a

    invoke-static {v3, v4, v5, v6}, Lg5/۟ۥۨۤ;->ۣ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v1}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/32 v4, -0x1437f

    sget v1, Lz8/ۣۤۡۧ;->ۣ۟ۧ۟ۢ:I

    int-to-long v6, v1

    xor-long/2addr v4, v6

    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v3

    const/16 v4, 0x2f

    sget v5, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۨۧۨ:I

    xor-int/lit16 v5, v5, 0x34f

    const/16 v6, 0x5c4

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->۟۠ۧ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v1}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x650

    :goto_1
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_1

    :sswitch_2
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_1

    :sswitch_3
    invoke-static {v2}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۣۢۤۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v3, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v1

    const/16 v4, 0x3a

    sget v5, Lz3/۟ۡ۠ۦۣ;->ۣ۠ۦۣ:I

    xor-int/lit8 v5, v5, 0x3c

    const/16 v6, 0x17f

    invoke-static {v1, v4, v5, v6}, Lh7/۟۟ۧۨ۟;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_7
    invoke-static {v2}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟ۢۤۦۥ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v3

    const/16 v4, 0x45

    sget v5, Li6/ۡۤۦ;->ۢۢۡۡ:I

    xor-int/lit16 v5, v5, -0x32b

    const/16 v6, 0x27b

    invoke-static {v3, v4, v5, v6}, Lz7/۠ۡ۟ۦ;->ۧۨۦ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v1}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lq6/ۣ۟ۢ۟ۤ;->ۥۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v2

    const/16 v3, 0x54

    sget v4, Li/ۢۥۣ۟;->ۡۤۧۥ:I

    xor-int/lit16 v4, v4, 0x212

    const/16 v5, 0x911

    invoke-static {v2, v3, v4, v5}, Lfa/ۦۣۡۢ;->۟ۧۥۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۠۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :pswitch_1
    new-instance v2, Lk6/y4;

    invoke-direct {v2, v0, v1}, Lk6/y4;-><init>(Lk6/t4;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-static {}, Lk6/u4;->۟ۥ۠ۤ۠()[S

    move-result-object v1

    const/16 v3, 0x64

    sget v4, Lk3/۟ۧ۠۠ۦ;->۟ۥۢۦۢ:I

    xor-int/lit16 v4, v4, -0x2c8

    const/16 v5, 0x73c

    invoke-static {v1, v3, v4, v5}, Ldagger/hilt/components/ۡۧ۟;->ۣۣۡ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzm;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzo;)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method
