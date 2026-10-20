.class public final synthetic Lk6/c6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/c6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x994s
        0x9b2s
        0x9a8s
        0x9afs
        0x9a6s
        0x9e1s
        0x9a5s
        0x9a4s
        0x9b7s
        0x9a4s
        0x9ads
        0x9aes
        0x9b1s
        0x9a4s
        0x9b3s
        0x9e1s
        0x9a2s
        0x9aes
        0x9afs
        0x9b2s
        0x9a4s
        0x9afs
        0x9b5s
        0x9e1s
        0x9aes
        0x9afs
        0x9ads
        0x9b8s
        0x9fas
        0x9e1s
        0x9a6s
        0x9aes
        0x9aes
        0x9a6s
        0x9ads
        0x9a4s
        0x9e1s
        0x9a0s
        0x9b1s
        0x9b1s
        0x9e1s
        0x9a8s
        0x9a5s
        0x9e1s
        0x9a7s
        0x9aes
        0x9b4s
        0x9afs
        0x9a5s
    .end array-data
.end method

.method public constructor <init>(Lk6/p6;Lk6/q6;J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lk6/c6;->a:I

    iput-object p1, p0, Lk6/c6;->d:Ljava/lang/Object;

    iput-object p2, p0, Lk6/c6;->c:Ljava/lang/Object;

    iput-wide p3, p0, Lk6/c6;->b:J

    invoke-static {}, Lb7/ۣ۟۟ۦ۟;->ۣۣۡ۠()I

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
    const-string v0, "lXlKukgF"

    invoke-static {v0}, Lt2/۟ۧۢ۟ۢ;->۟۠ۢۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public synthetic constructor <init>(Lk6/y5;Landroid/os/Bundle;J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk6/c6;->a:I

    iput-object p1, p0, Lk6/c6;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk6/c6;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lk6/c6;->b:J

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۤ۠;->۟ۧ۠ۦ۟()I

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
    const-string v0, "vxFBAzJl4T0ITR8In"

    invoke-static {v0}, Lr2/۠ۨۦۢ;->ۨۤۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۢۢۧ۟()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/ۣۨۥۣ;->۠ۡۡۤ()I

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
    sget-object v0, Lk6/c6;->short:[S

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

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {p0}, Lp5/۟ۡۧۡۨ;->ۣۢۢۨ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->۟ۤۢۨ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/p6;

    invoke-static {p0}, Lr7/۟۟ۡ۟ۢ;->۠ۥۥۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/q6;

    invoke-static {p0}, Ll8/ۢۦۥۢ;->۟ۥۧۤۨ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v0, v1, v6, v2, v3}, Ls0/ۢۨۦ۟;->ۣ۟ۢۥۡ(Ljava/lang/Object;Ljava/lang/Object;ZJ)V

    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->۟ۤۢۨ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/p6;

    iput-object v4, v0, Lk6/p6;->e:Lk6/q6;

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->۟ۧ۟۠۠(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v0}, Lw2/ۧۦۧ;->ۨۥۡۨ(Ljava/lang/Object;)V

    new-instance v1, Ll/h;

    sget v2, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۢۢ۟۟:I

    xor-int/lit16 v2, v2, -0xad

    invoke-direct {v1, v2, v0, v4}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lh6/ۧۧۤ۟;->۟ۦۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lk8/ۣ۠ۨۤ;->۟ۧۧۢۦ()I

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
    const-string v0, "FnxFrH1k"

    invoke-static {v0}, Lz7/۟ۢۧۡۥ;->۟ۡ۠۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    invoke-static {p0}, Lr7/۟۟ۡ۟ۢ;->۠ۥۥۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/y5;

    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->۟ۤۢۨ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-static {p0}, Ll8/ۢۦۥۢ;->۟ۥۧۤۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۥۡۥۢ(Ljava/lang/Object;)Lk6/z3;

    move-result-object v2

    invoke-static {v2}, Lx4/۟ۤۦۥ۟;->ۡۨۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۠۟ۡ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {v0, v1, v6, v4, v5}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۣ۟ۧۤ(Ljava/lang/Object;Ljava/lang/Object;IJ)V

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    const v0, 0xbe22

    goto :goto_3

    :sswitch_8
    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/c6;->ۢۢۧ۟()[S

    move-result-object v1

    sget v2, Le2/۟۟ۥۦ;->۟ۢ۠ۨۥ:I

    xor-int/lit16 v2, v2, -0x2c6

    const/16 v3, 0x9c1

    invoke-static {v1, v6, v2, v3}, Lu/ۣۤۧ۠;->۟ۧ۠۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lx7/۟۟ۦۨۡ;->۟ۢۡۤۡ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

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
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method
