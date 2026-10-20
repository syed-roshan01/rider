.class public abstract Lk6/m7;
.super Lk6/k7;


# static fields
.field private static final short:[S


# instance fields
.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x25

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/m7;->short:[S

    return-void

    :array_0
    .array-data 2
        0x8b4s
        0x895s
        0x88es
        0x8das
        0x893s
        0x894s
        0x893s
        0x88es
        0x893s
        0x89bs
        0x896s
        0x893s
        0x880s
        0x89fs
        0x89es
        0x5e9s
        0x5cbs
        0x5c4s
        0x58ds
        0x5des
        0x58as
        0x5c3s
        0x5c4s
        0x5c3s
        0x5des
        0x5c3s
        0x5cbs
        0x5c6s
        0x5c3s
        0x5d0s
        0x5cfs
        0x58as
        0x5des
        0x5dds
        0x5c3s
        0x5c9s
        0x5cfs
    .end array-data
.end method

.method public constructor <init>(Lk6/p7;)V
    .locals 3

    invoke-direct {p0, p1}, Lk6/k7;-><init>(Lk6/p7;)V

    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->ۤۢۨ۟(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Landroid/os/ۣۣ۟ۤۨ;->۟ۦ۠ۥ(Ljava/lang/Object;)I

    move-result v1

    sget v2, Lv/ۣۢ۟ۧ;->ۣ۠ۨۤ:I

    xor-int/lit16 v2, v2, 0x3c5

    add-int/2addr v1, v2

    iput v1, v0, Lk6/p7;->r:I

    invoke-static {}, Ln7/۟ۡۢۦ;->۠ۧۦ()I

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
    const-string v0, "UVQyWjXJC"

    invoke-static {v0}, Lh4/۟ۧۢۡۦ;->ۥۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۢۢ۟ۡ()[S
    .locals 2

    invoke-static {}, Lw5/ۣۨۧ۠;->ۣۥۦۧ()I

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
    sget-object v0, Lk6/m7;->short:[S

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
.method public final p()V
    .locals 5

    invoke-static {p0}, Lw/ۥۣۡۡ;->ۧ۠ۤۢ(Ljava/lang/Object;)Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk6/m7;->ۢۢ۟ۡ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Ld8/ۣۡۡ۠;->ۨۧۧۡ:I

    xor-int/lit16 v3, v3, -0x2e6

    const/16 v4, 0x8fa

    invoke-static {v1, v2, v3, v4}, Lg2/ۢۥۥۡ;->ۡ۟ۡۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method public final q()V
    .locals 5

    invoke-static {p0}, Lw/ۥۣۡۡ;->ۧ۠ۤۢ(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Ld9/ۧۧۨۥ;->ۥۣ۠ۧ(Ljava/lang/Object;)Z

    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->ۤۢۨ۟(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->۠ۤۨ(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, -0x12

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x12

    iput v1, v0, Lk6/p7;->s:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk6/m7;->c:Z

    return-void

    :sswitch_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk6/m7;->ۢۢ۟ۡ()[S

    move-result-object v1

    const/16 v2, 0xf

    sget v3, Lh/ۢۢۨۨ;->۟ۥۧ۠۟:I

    xor-int/lit16 v3, v3, -0x200

    const/16 v4, 0x5aa

    invoke-static {v1, v2, v3, v4}, Lh5/۟ۦۣۣ;->۟ۤ۠۟ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public abstract r()Z
.end method
