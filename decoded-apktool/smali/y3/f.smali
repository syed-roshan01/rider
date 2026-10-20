.class public final synthetic Ly3/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ly3/f;->a:I

    iput-object p1, p0, Ly3/f;->b:Landroid/content/Context;

    invoke-static {}, Lu7/ۣ۟ۡ۟;->ۡۤۧۧ()I

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
    const-string v0, "5EzloFkZSHG71Be"

    invoke-static {v0}, Lx7/۟۟ۦۨۡ;->ۣ۠ۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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


# virtual methods
.method public final run()V
    .locals 9

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-static {p0}, Lu4/۟ۡۢۦۣ;->۟ۥۤۥۨ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lw2/ۤ۠ۨۤ;->ۣۣ۟ۢۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v8

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lm/a;

    sget v1, Lo2/۟ۤۨۡۥ;->ۣ۠ۢ:I

    xor-int/lit16 v1, v1, -0xe9

    invoke-direct {v0, v1}, Lm/a;-><init>(I)V

    invoke-static {}, Lm7/ۧۢ۟;->ۡ۠ۥۤ()Lx9/v;

    move-result-object v1

    invoke-static {v8, v0, v1, v2}, Lc7/ۨۤۦۢ;->ۣ۟ۤۥۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    invoke-static {}, Ld1/۟ۡۨۧۢ;->ۣ۟ۡۧۡ()I

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
    const-string v0, "E5S7ApzC0CpqPyW0sjZkMnc9C0Uh"

    invoke-static {v0}, Lm1/۟ۧۥ۟ۨ;->ۣ۟ۦ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, -0x27

    sget v0, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۥۤۦۨ:I

    int-to-long v6, v0

    xor-long/2addr v4, v6

    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->۟ۤۧۢۡ()Ljava/util/concurrent/TimeUnit;

    move-result-object v6

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    new-instance v0, Ly3/f;

    invoke-direct {v0, v8, v3}, Ly3/f;-><init>(Landroid/content/Context;I)V

    invoke-static {v1, v0}, Lc4/۟ۢۨۥۡ;->۟ۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

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
.end method
