.class public final La5/c0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:La5/c0;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x17

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, La5/c0;->short:[S

    new-instance v0, La5/c0;

    sget v1, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۦ:I

    xor-int/lit16 v1, v1, 0x1c9

    invoke-direct {v0, v1}, La5/c0;-><init>(I)V

    sput-object v0, La5/c0;->a:La5/c0;

    return-void

    nop

    :array_0
    .array-data 2
        0x86cs
        0x831s
        0x83es
        0x83fs
        0x83es
        0x829s
        0x83ds
        0x83fs
        0x825s
        0x823s
        0x870s
        0x820s
        0x831s
        0x822s
        0x831s
        0x83ds
        0x835s
        0x824s
        0x835s
        0x822s
        0x870s
        0x861s
        0x86es
    .end array-data
.end method

.method public static ۣ۟ۤۤۨ()[S
    .locals 2

    invoke-static {}, Lp3/۟ۢ۟۟ۥ;->ۣ۠ۧۧ()I

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
    sget-object v0, La5/c0;->short:[S

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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/4 v8, 0x0

    const/4 v0, 0x0

    const-string v6, "\u06e7\u06df\u06e2"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    const-string v6, "\u06e5\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v1}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v9

    const-string v0, "\u06df\u06e6\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e8\u06e5\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, La5/c0;->ۣ۟ۤۤۨ()[S

    move-result-object v0

    const-string v6, "\u06e0\u06e5\u06e6"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    const-string v6, "\u06e4\u06e7\u06df"

    move-object v4, v0

    goto :goto_0

    :sswitch_4
    invoke-static {v4, v3}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e7\u06df\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x850

    invoke-static {v2, v8, v7, v0}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۥۨۡۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v6, "\u06e8\u06e8\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_6
    sget v9, Lcom/google/android/gms/common/ۦۢۨ;->ۦۢۥۧ:I

    const-string v0, "\u06e4\u06e2\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v7, v9, 0x24b

    const-string v0, "\u06e5\u06e7\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_8
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0xdca1 -> :sswitch_0
        0x1aa7dd -> :sswitch_3
        0x1aab81 -> :sswitch_6
        0x1aba21 -> :sswitch_7
        0x1ababc -> :sswitch_2
        0x1abe80 -> :sswitch_5
        0x1ac509 -> :sswitch_1
        0x1ac98b -> :sswitch_8
        0x1ac9e2 -> :sswitch_4
    .end sparse-switch
.end method
