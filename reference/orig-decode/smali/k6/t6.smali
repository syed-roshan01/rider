.class public final Lk6/t6;
.super Lk6/n;


# static fields
.field private static final short:[S


# instance fields
.field public final e:I

.field public final f:Lk6/s6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x50

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/t6;->short:[S

    return-void

    :array_0
    .array-data 2
        0xcdcs
        0xce9s
        0xcfbs
        0xce3s
        0xcfbs
        0xca8s
        0xce0s
        0xce9s
        0xcfes
        0xceds
        0xca8s
        0xceas
        0xceds
        0xceds
        0xce6s
        0xca8s
        0xcf9s
        0xcfds
        0xceds
        0xcfds
        0xceds
        0xcecs
        0xca8s
        0xcees
        0xce7s
        0xcfas
        0xca8s
        0xce9s
        0xca8s
        0xce4s
        0xce7s
        0xce6s
        0xcefs
        0xca8s
        0xcfcs
        0xce1s
        0xce5s
        0xceds
        0x5d7s
        0x5f0s
        0x5ffs
        0x5fds
        0x5eas
        0x5f7s
        0x5e8s
        0x5f7s
        0x5eas
        0x5e7s
        0x5b2s
        0x5bes
        0x5fas
        0x5f7s
        0x5eds
        0x5fds
        0x5f1s
        0x5f0s
        0x5f0s
        0x5fbs
        0x5fds
        0x5eas
        0x5f7s
        0x5f0s
        0x5f9s
        0x5bes
        0x5f8s
        0x5ecs
        0x5f1s
        0x5f3s
        0x5bes
        0x5eas
        0x5f6s
        0x5fbs
        0x5bes
        0x5eds
        0x5fbs
        0x5ecs
        0x5e8s
        0x5f7s
        0x5fds
        0x5fbs
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/s6;Lk6/p5;I)V
    .locals 3

    iput p3, p0, Lk6/t6;->e:I

    iput-object p1, p0, Lk6/t6;->f:Lk6/s6;

    invoke-direct {p0, p2}, Lk6/n;-><init>(Lk6/p5;)V

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۨۢۨۢ()I

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
    const-string v0, "xNrNLpUnUNBwcl7km808W"

    invoke-static {v0}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟۠۟ۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟ۦۣۤ۠()[S
    .locals 2

    invoke-static {}, La8/ۣۡۨ۠;->۟ۡۤۧۨ()I

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
    sget-object v0, Lk6/t6;->short:[S

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
    .locals 6

    invoke-static {p0}, Lr7/ۧ۠۠ۤ;->ۣۨۦۥ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Le1/۟ۢ۟ۤۡ;->ۣۢ۟۟(Ljava/lang/Object;)Lk6/s6;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/t6;->۟ۦۣۤ۠()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lr1/۟ۤۤۡ۠;->ۦۥۢ:I

    xor-int/lit16 v3, v3, 0x133

    const/16 v4, 0xc88

    invoke-static {v1, v2, v3, v4}, Li/ۣۢۦ۠;->ۧۢۥۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lja/ۥۣۨ۠;->ۢۦۨ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lv6/۟ۦۨۦۣ;->ۦۧۥۣ()I

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
    const-string v0, "6xiHYNGUSUFNqB"

    invoke-static {v0}, Lg/۟ۧ۠ۤ;->۟ۦۥۤۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    invoke-static {v1}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Lu3/ۣۡۡۢ;->۟۟ۦ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/t6;->۟ۦۣۤ۠()[S

    move-result-object v2

    const/16 v3, 0x26

    sget v4, La3/۟ۢۨۢۥ;->ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc4

    const/16 v5, 0x59e

    invoke-static {v2, v3, v4, v5}, Lu1/۟ۧۥۢ۠;->ۨۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lo1/۟ۡۡۦۣ;->ۣۣ۟ۧۨ(Ljava/lang/Object;)V

    goto :goto_1

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
