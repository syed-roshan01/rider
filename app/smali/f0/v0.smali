.class public final synthetic Lf0/v0;
.super Ld9/o;


# static fields
.field public static final o:Lf0/v0;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x3c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/v0;->short:[S

    invoke-static {}, Lf0/v0;->ۦ۠ۢۤ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Ly6/۟ۢ۟ۥۤ;->ۣ۟ۥۣۢ:I

    xor-int/lit16 v2, v2, 0x242

    const/16 v3, 0xb72

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۡۦۥۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lf0/v0;->ۦ۠ۢۤ()[S

    move-result-object v0

    const/16 v1, 0xd

    sget v2, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۥۨ۠۠:I

    xor-int/lit16 v2, v2, -0x39c

    const/16 v4, 0x9c8

    invoke-static {v0, v1, v2, v4}, Lf4/ۡۥۣۢ;->ۣۤۡۢ([SIII)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lf0/v0;

    invoke-static {}, Lc7/ۨۤۦۢ;->۟ۡۤۢۨ()Ld9/b;

    move-result-object v1

    const-class v2, Landroidx/compose/ui/input/key/a;

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lf0/v0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lf0/v0;->o:Lf0/v0;

    return-void

    nop

    :array_0
    .array-data 2
        0xb1bs
        0xb01s
        0xb31s
        0xb06s
        0xb00s
        0xb1es
        0xb22s
        0xb00s
        0xb17s
        0xb01s
        0xb01s
        0xb17s
        0xb16s
        0x9a1s
        0x9bbs
        0x98bs
        0x9bcs
        0x9bas
        0x9a4s
        0x998s
        0x9bas
        0x9ads
        0x9bbs
        0x9bbs
        0x9ads
        0x9acs
        0x9e5s
        0x992s
        0x9a5s
        0x9a7s
        0x9a3s
        0x999s
        0x9b0s
        0x9a7s
        0x9e0s
        0x984s
        0x9a9s
        0x9a6s
        0x9acs
        0x9bas
        0x9a7s
        0x9a1s
        0x9acs
        0x9e7s
        0x9bes
        0x9a1s
        0x9ads
        0x9bfs
        0x9e7s
        0x983s
        0x9ads
        0x9b1s
        0x98ds
        0x9bes
        0x9ads
        0x9a6s
        0x9bcs
        0x9f3s
        0x9e1s
        0x992s
    .end array-data
.end method

.method public static ۦ۠ۢۤ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۡۦۤ()I

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
    sget-object v0, Lf0/v0;->short:[S

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
