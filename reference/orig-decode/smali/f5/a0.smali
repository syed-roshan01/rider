.class public final Lf5/a0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Lf5/a0;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/a0;->short:[S

    new-instance v0, Lf5/a0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf5/a0;-><init>(I)V

    sput-object v0, Lf5/a0;->a:Lf5/a0;

    return-void

    nop

    :array_0
    .array-data 2
        0x108s
        0x115s
    .end array-data
.end method

.method public static ۣۤۥۧ()[S
    .locals 2

    invoke-static {}, Lo2/۟ۤۨۡۥ;->ۦۦۦۧ()I

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
    sget-object v0, Lf5/a0;->short:[S

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v13, "\u06df\u06e5\u06e5"

    move-object v3, v0

    move-object v1, p1

    :goto_0
    invoke-static {v13}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v0, -0x2

    const-string v13, "\u06e2\u06e0\u06e3"

    move v8, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Lm9/f1;

    const-string v13, "\u06e2\u06df\u06e7"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    sget v0, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۤۥۡ۠:I

    const-string v13, "\u06e1\u06e5\u06e0"

    move v11, v0

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v0, v11, -0x38e

    const-string v13, "\u06e2\u06e5\u06e5"

    move v12, v0

    goto :goto_0

    :sswitch_3
    instance-of v0, v1, Lm9/b1;

    const-string v13, "\u06e6\u06e8\u06e0"

    move v7, v0

    goto :goto_0

    :sswitch_4
    xor-int/lit8 v0, v7, -0x1

    const-string v13, "\u06e2\u06e0"

    move v8, v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lf5/a0;->ۣۤۥۧ()[S

    move-result-object v0

    const-string v13, "\u06df\u06e3\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v5}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e4\u06e5\u06e4"

    move-object v13, v0

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x0

    const/16 v5, 0x161

    invoke-static {v4, v0, v12, v5}, Ln/۟۠ۥۥۨ;->۟ۥۥۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v13, "\u06e2\u06e0\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_8
    or-int v0, v10, v9

    const-string v13, "\u06e5\u06e8\u06e5"

    move v8, v0

    goto :goto_0

    :sswitch_9
    invoke-static {v8}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v13, "\u06e8\u06e7\u06e7"

    move-object v3, v0

    goto :goto_0

    :sswitch_a
    move-object v0, v2

    check-cast v0, Lm9/p1;

    const-string v13, "\u06e5\u06e1\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_b
    invoke-static {v6}, Lp7/ۣۣۦۤ;->۟۟ۧۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e0\u06e8\u06e5"

    move-object v13, v0

    goto :goto_0

    :sswitch_c
    and-int/lit8 v0, v8, 0x1

    const-string v13, "\u06e2\u06e4\u06e4"

    move v10, v0

    goto :goto_0

    :sswitch_d
    and-int v0, v8, v7

    const-string v13, "\u06e1\u06e8\u06e4"

    move v9, v0

    goto :goto_0

    :sswitch_e
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdc3e -> :sswitch_c
        0x1aa77f -> :sswitch_1
        0x1aa7bf -> :sswitch_0
        0x1aabdd -> :sswitch_3
        0x1aaf3c -> :sswitch_2
        0x1aaf9d -> :sswitch_4
        0x1ab24a -> :sswitch_5
        0x1ab265 -> :sswitch_d
        0x1ab269 -> :sswitch_6
        0x1ab2e2 -> :sswitch_8
        0x1ab302 -> :sswitch_7
        0x1aba83 -> :sswitch_a
        0x1abdc4 -> :sswitch_b
        0x1abea2 -> :sswitch_9
        0x1ac9c8 -> :sswitch_e
    .end sparse-switch
.end method
