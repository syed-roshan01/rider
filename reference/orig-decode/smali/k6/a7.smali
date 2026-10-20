.class public final Lk6/a7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lk6/z6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x63

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/a7;->short:[S

    return-void

    :array_0
    .array-data 2
        0x49fs
        0x493s
        0x491s
        0x4d2s
        0x49bs
        0x493s
        0x493s
        0x49bs
        0x490s
        0x499s
        0x4d2s
        0x49ds
        0x492s
        0x498s
        0x48es
        0x493s
        0x495s
        0x498s
        0x4d2s
        0x49bs
        0x491s
        0x48fs
        0x4d2s
        0x491s
        0x499s
        0x49ds
        0x48fs
        0x489s
        0x48es
        0x499s
        0x491s
        0x499s
        0x492s
        0x488s
        0x4d2s
        0x4bds
        0x48cs
        0x48cs
        0x4b1s
        0x499s
        0x49ds
        0x48fs
        0x489s
        0x48es
        0x499s
        0x491s
        0x499s
        0x492s
        0x488s
        0x4afs
        0x499s
        0x48es
        0x48as
        0x495s
        0x49fs
        0x499s
        0xc6as
        0xc47s
        0xc5ds
        0xc4ds
        0xc41s
        0xc40s
        0xc40s
        0xc4bs
        0xc4ds
        0xc5as
        0xc4bs
        0xc4as
        0xc0es
        0xc48s
        0xc5cs
        0xc41s
        0xc43s
        0xc0es
        0xc4as
        0xc4bs
        0xc58s
        0xc47s
        0xc4ds
        0xc4bs
        0xc0es
        0xc63s
        0xc4bs
        0xc4fs
        0xc5ds
        0xc5bs
        0xc5cs
        0xc4bs
        0xc43s
        0xc4bs
        0xc40s
        0xc5as
        0xc7ds
        0xc4bs
        0xc5cs
        0xc58s
        0xc47s
        0xc4ds
        0xc4bs
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/z6;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lk6/a7;->a:I

    iput-object p1, p0, Lk6/a7;->b:Lk6/z6;

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

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
    const-string v0, "bQhZgi4vMKx4IlKH20m9MBe5"

    invoke-static {v0}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۥۤ۠ۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦۨۨ۟()[S
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟ۥۨ۠()I

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
    sget-object v0, Lk6/a7;->short:[S

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
    .locals 8

    const/4 v7, 0x0

    invoke-static {p0}, Li/ۣۢۦ۠;->۟ۥۦۡۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Ls0/ۧۧۨۥ;->ۣۥۣۦ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    invoke-static {v1}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Lf4/ۦۣ۟ۦ;->۟۟۠۠ۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lk6/a7;->۟ۦۨۨ۟()[S

    move-result-object v1

    const/4 v4, 0x0

    sget v5, Lz/۟ۥۣۣ۠;->۟ۨۢۦ:I

    xor-int/lit16 v5, v5, -0x296

    const/16 v6, 0x4fc

    invoke-static {v1, v4, v5, v6}, La2/ۢۦۧۦ;->ۣۣۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۥۣۤ۠(Ljava/lang/Object;)Lk6/y3;

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
    iput-object v7, v2, Lk6/s6;->d:Lk6/y3;

    invoke-static {v2}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/a7;->۟ۦۨۨ۟()[S

    move-result-object v1

    const/16 v4, 0x38

    sget v5, Lja/ۥۣۨ۠;->۟۟ۧۡ۟:I

    xor-int/lit16 v5, v5, 0x156

    const/16 v6, 0xc2e

    invoke-static {v1, v4, v5, v6}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۣ۟ۡۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1, v3}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v2}, Lr4/۟ۦۦ۠ۥ;->۟ۦۨۧۢ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

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
    const-string v0, "xJxFvrpMEuHHCoPb8ViB8Wi4t"

    invoke-static {v0}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->۟۠ۥۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_7
    return-void

    :pswitch_0
    invoke-static {v1}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    iput-object v7, v0, Lk6/s6;->d:Lk6/y3;

    invoke-static {v0}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۟ۧۦۧۢ(Ljava/lang/Object;)V

    goto :goto_2

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method
