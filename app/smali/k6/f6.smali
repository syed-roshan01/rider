.class public final Lk6/f6;
.super Lk6/n;


# static fields
.field private static final short:[S


# instance fields
.field public final e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x24

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/f6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x39es
        0x3b9s
        0x3acs
        0x3bfs
        0x3b9s
        0x3a4s
        0x3a3s
        0x3aas
        0x3eds
        0x3b8s
        0x3bds
        0x3a1s
        0x3a2s
        0x3acs
        0x3a9s
        0x3eds
        0x3abs
        0x3bfs
        0x3a2s
        0x3a0s
        0x3eds
        0x389s
        0x3a8s
        0x3a1s
        0x3acs
        0x3b4s
        0x3a8s
        0x3a9s
        0x39fs
        0x3b8s
        0x3a3s
        0x3a3s
        0x3acs
        0x3afs
        0x3a1s
        0x3a8s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lk6/f5;I)V
    .locals 2

    iput p3, p0, Lk6/f6;->e:I

    iput-object p1, p0, Lk6/f6;->f:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lk6/n;-><init>(Lk6/p5;)V

    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

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
    const-string v0, "aS"

    invoke-static {v0}, Lu/ۤ;->ۦۡۦۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۡ۟ۥۣ()[S
    .locals 2

    invoke-static {}, Lh7/ۥۥۢ۟;->ۦ۠ۤۤ()I

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
    sget-object v0, Lk6/f6;->short:[S

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
.method public final c()V
    .locals 7

    const/4 v6, 0x0

    invoke-static {p0}, Lcom/google/firebase/ktx/ۨۢۤۧ;->۟۟ۤۢۡ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lea/ۦۦۨۨ;->۟ۤۡۡ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lk6/j7;

    invoke-static {v0}, Lm0/۟ۤۡۤۤ;->ۤۦ۠ۢ(Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {}, Lk6/f6;->ۡ۟ۥۣ()[S

    move-result-object v2

    sget v3, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->۟ۢۥۣ۟:I

    xor-int/lit16 v3, v3, -0x329

    const/16 v4, 0x3cd

    invoke-static {v2, v6, v3, v4}, Lb7/ۣ۟۟ۦ۟;->۟ۤۧۡ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lo8/۟ۢۧۢۤ;->ۤۢۨ۟(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lg2/۟۠ۡۡۦ;->ۣۤۡۤ(Ljava/lang/Object;)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "xkVcVKOlD3X1yDtft7qu0IZem"

    invoke-static {v0}, Lb3/۟ۧ۠ۡۥ;->ۣۣ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    check-cast v0, Lk6/h7;

    invoke-static {v0}, Landroid/support/v4/app/ۥۣۡ;->ۤ۠ۡۨ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v0}, Landroid/support/v4/app/ۥۣۡ;->ۤ۠ۡۨ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v1

    check-cast v1, Le6/c;

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v4

    invoke-static {v0, v6, v6, v4, v5}, Lw4/ۥۧۡۥ;->ۣۧۤ۟(Ljava/lang/Object;ZZJ)Z

    invoke-static {v2}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۧۡ۟ۨ(Ljava/lang/Object;)Lk6/q;

    move-result-object v1

    invoke-static {v2}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->ۡۤ۟۟()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۧ۟ۡ(Ljava/lang/Object;J)V

    goto :goto_1

    :pswitch_1
    check-cast v0, Lk6/y5;

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/f5;

    invoke-static {v1}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۠ۡۧ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {v0}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۨۦۥۢ(Ljava/lang/Object;)Lk6/f6;

    move-result-object v0

    const-wide/16 v2, 0x46f

    sget v1, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->ۦۥۧۤ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Le1/۟ۢ۟ۤۡ;->۟ۡ۟ۤۧ(Ljava/lang/Object;J)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        0x1d7 -> :sswitch_3
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method
