.class public final Lk6/d6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lk6/y5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/d6;->short:[S

    return-void

    :array_0
    .array-data 2
        0xcf2s
        0xcc4s
        0xcd2s
        0xcd2s
        0xcc8s
        0xcces
        0xccfs
        0xc81s
        0xcd5s
        0xcc8s
        0xcccs
        0xcc4s
        0xcces
        0xcd4s
        0xcd5s
        0xc81s
        0xcc5s
        0xcd4s
        0xcd3s
        0xcc0s
        0xcd5s
        0xcc8s
        0xcces
        0xccfs
        0xc81s
        0xcd2s
        0xcc4s
        0xcd5s
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/y5;JI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lk6/d6;->a:I

    iput-object p1, p0, Lk6/d6;->c:Lk6/y5;

    iput-wide p2, p0, Lk6/d6;->b:J

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

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
    const-string v0, "GDBitIcb9LrKR32lhAV"

    invoke-static {v0}, Ld4/۟۠۠۟ۢ;->ۦۧۤ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۣۥۦۥ()[S
    .locals 2

    invoke-static {}, Landroid/support/v4/app/۟۟۠ۡۥ;->۟ۡۨۡۥ()I

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
    sget-object v0, Lk6/d6;->short:[S

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
    .locals 6

    invoke-static {p0}, Lv8/۟ۧۢ۟ۢ;->۟ۧۤ۠ۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lf/۟ۤۧ۠ۡ;->ۤۥ۠ۦ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v1

    invoke-static {p0}, Lb/۠ۨۦۥ;->ۣۣ۟ۧ۠(Ljava/lang/Object;)J

    move-result-wide v2

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    invoke-static {v1, v2, v3, v0}, Li6/۟۟ۦۨۧ;->۠ۦ۠ۢ(Ljava/lang/Object;JZ)V

    invoke-static {v1}, Lr1/۟ۤۤۡ۠;->۟ۧ۟۠۠(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-static {v0, v1}, Lp7/ۣۣۦۤ;->۟ۧۦۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_0
    invoke-static {v1}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۣۧۤۢ(Ljava/lang/Object;)Lk6/p4;

    move-result-object v0

    invoke-static {v0, v2, v3}, Lt8/ۦۣ۠;->ۣۡ۟ۨ(Ljava/lang/Object;J)V

    invoke-static {v1}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0}, Lw9/۟۠۠ۢ۟;->ۣۣۥۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/d6;->ۣۥۦۥ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lu4/ۧۦۦۧ;->ۣۡۤۡ:I

    xor-int/lit16 v4, v4, -0x105

    const/16 v5, 0xca1

    invoke-static {v2, v3, v4, v5}, Lr2/ۧۧۢۢ;->ۥۥ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
