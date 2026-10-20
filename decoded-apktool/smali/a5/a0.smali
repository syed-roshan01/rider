.class public final La5/a0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:La5/a0;

.field public static final c:La5/a0;

.field private static final short:[S


# instance fields
.field public final a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    const/16 v0, 0x5b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, La5/a0;->short:[S

    new-instance v0, La5/a0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La5/a0;-><init>(I)V

    sput-object v0, La5/a0;->b:La5/a0;

    new-instance v0, La5/a0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La5/a0;-><init>(I)V

    sput-object v0, La5/a0;->c:La5/a0;

    return-void

    :array_0
    .array-data 2
        0x734s
        0x735s
        0x733s
        0x73fs
        0x734s
        0x735s
        0x778s
        0x77es
        0x77es
        0x77es
        0x779s
        0xc0fs
        0xc26s
        0xc3cs
        0xc5es
        0xc0ds
        0xc26s
        0xc23s
        0xc58s
        0xc22s
        0xc17s
        0xc57s
        0xc14s
        0xc34s
        0xc39s
        0xc20s
        0xc5fs
        0xc0ds
        0xc03s
        0xc38s
        0xc00s
        0xc0as
        0xc17s
        0xc5bs
        0xc19s
        0xc37s
        0xc36s
        0xc02s
        0xc5es
        0xc0cs
        0xc3ds
        0xc5bs
        0xc1es
        0xc0cs
        0xc07s
        0xc57s
        0xc18s
        0xc0ds
        0xc03s
        0xc3cs
        0xc02s
        0xc0ds
        0xc07s
        0xc57s
        0xc14s
        0xc0as
        0xc29s
        0xc28s
        0xc5es
        0xc0as
        0xc36s
        0xc23s
        0xc53s
        0x1a6s
        0x19as
        0x1ads
        0x19bs
        0x1a1s
        0x1bfs
        0x1a1s
        0x1b8s
        0x1bas
        0x19ds
        0x1a6s
        0x1c5s
        0x1b9s
        0x19ds
        0x19cs
        0x1c4s
        0x1b8s
        0x1b3s
        0x1b6s
        0x1c6s
        0x1bas
        0x1a3s
        0x1bas
        0x18ds
        0x1bas
        0x18ds
        0x190s
        0x1cas
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 2

    iput p1, p0, La5/a0;->a:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lx5/ۡۦۦۥ;->ۣ۟۠ۡۢ()I

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
    const-string v0, "Wc5QHEw3ClHFdJ"

    invoke-static {v0}, Ls3/۟ۧ۟ۡۢ;->ۧۦۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۣۢ()[S
    .locals 2

    invoke-static {}, Lp7/ۣۣۦۤ;->ۤۨۧۨ()I

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
    sget-object v0, La5/a0;->short:[S

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
.method public final a()Ljava/lang/String;
    .locals 6

    const/4 v5, 0x0

    invoke-static {p0}, Le2/۟۟ۥۦ;->۟۟۟ۤۢ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, La5/a0;->ۣۢ()[S

    move-result-object v1

    sget v2, Lcom/google/firebase/abt/ۢۦۨۤ;->ۨ۠ۧ۟:I

    xor-int/lit8 v2, v2, -0x55

    const/16 v3, 0x750

    invoke-static {v1, v5, v2, v3}, Lu4/۟ۡۢۦۣ;->۟ۡۥۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣۢۤۦ()Lq8/i;

    invoke-static {}, La5/a0;->ۣۢ()[S

    move-result-object v0

    const/16 v2, 0xb

    sget v3, Lc1/ۣ۟۠ۧۤ;->۟ۥ۟۟ۥ:I

    xor-int/lit16 v3, v3, -0x210

    const/16 v4, 0xc6e

    invoke-static {v0, v2, v3, v4}, Ld7/۟ۢۧۧ۠;->۟ۢ۠ۡ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lz7/۠ۡ۟ۦ;->ۤۧ۠ۢ(Ljava/lang/Object;I)[B

    move-result-object v2

    invoke-static {v2, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lv9/۠ۡۨۨ;->۟ۧۥۨ۠()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣۢۤۦ()Lq8/i;

    invoke-static {}, La5/a0;->ۣۢ()[S

    move-result-object v0

    const/16 v2, 0x3f

    sget v3, Landroidx/profileinstaller/۠ۡۥۡ;->ۤ۟ۤۡ:I

    xor-int/lit16 v3, v3, -0x322

    const/16 v4, 0x1f7

    invoke-static {v0, v2, v3, v4}, Le9/ۧۧۡ;->ۧۢ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lz7/۠ۡ۟ۦ;->ۤۧ۠ۢ(Ljava/lang/Object;I)[B

    move-result-object v2

    invoke-static {v2, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lv9/۠ۡۨۨ;->۟ۧۥۨ۠()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Le2/۟۟ۥۦ;->۟۟۟ۤۢ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Landroid/os/ۣۣ۟ۤۨ;->۠ۥۣۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {p0}, Landroid/os/ۣۣ۟ۤۨ;->۠ۥۣۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
