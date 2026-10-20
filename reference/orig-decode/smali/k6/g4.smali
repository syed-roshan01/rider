.class public final Lk6/g4;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:J

.field public d:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/g4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x11cs
        0x101s
        0x11as
        0x114s
        0x11as
        0x11ds
        0x14es
        0x9ads
        0x9efs
        0x9e0s
        0x9ecs
        0x9e4s
        0x9bcs
        0x953s
        0x90fs
        0x91es
        0x90ds
        0x91es
        0x912s
        0x90cs
        0x942s
    .end array-data
.end method

.method public static b(Lk6/v;)Lk6/g4;
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    const-string v6, "\u06e7\u06e2\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lf6/ۦۣۦ۟;->ۣۣ۟ۡ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e5\u06e4\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lx7/۟۟ۦۨۡ;->ۣ۟ۡۤۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lg5/۟ۥۨۤ;->ۣۢۤۨ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v1, "\u06e8\u06e3\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v5}, Ls7/ۧۤۦۤ;->ۧ۟۟ۢ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v1

    const-string v6, "\u06e6\u06e0\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    iput-object v2, v4, Lk6/g4;->b:Ljava/lang/String;

    const-string v1, "\u06e3\u06e6\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lj2/ۥ۠ۨۢ;->ۣۤ۟ۢ(Ljava/lang/Object;)Lk6/s;

    move-result-object v1

    const-string v6, "\u06e7\u06e1\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    iput-object v0, v4, Lk6/g4;->a:Ljava/lang/String;

    const-string v1, "\u06e3\u06e1\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    iput-wide v8, v4, Lk6/g4;->c:J

    const-string v1, "\u06e6\u06df\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    new-instance v1, Lk6/g4;

    invoke-direct {v1}, Lk6/g4;-><init>()V

    const-string v6, "\u06e2\u06df\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    iput-object v3, v4, Lk6/g4;->d:Landroid/os/Bundle;

    const-string v1, "\u06e3\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_3
        0xdc64 -> :sswitch_1
        0x1ab247 -> :sswitch_5
        0x1ab649 -> :sswitch_0
        0x1ab6e5 -> :sswitch_8
        0x1abe26 -> :sswitch_4
        0x1ac14d -> :sswitch_9
        0x1ac165 -> :sswitch_7
        0x1ac54c -> :sswitch_2
        0x1ac947 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۟ۧۧۢۨ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤۡ()I

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
    sget-object v0, Lk6/g4;->short:[S

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
.method public final a()Lk6/v;
    .locals 10

    const/4 v0, 0x0

    const-wide/16 v4, 0x0

    const-string v9, "\u06e5\u06e5\u06e2"

    move-object v2, v0

    move-object v3, v0

    move-object v6, v0

    move-object v7, v0

    move-object v1, v0

    move-object v8, v0

    :goto_0
    invoke-static {v9}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۢۧۢ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    const-string v9, "\u06e7\u06e0\u06df"

    move-object v8, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lu1/ۢۥ۠ۤ;->ۣ۟۠ۡ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e7\u06e1\u06df"

    move-object v9, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lk6/v;

    invoke-direct/range {v0 .. v5}, Lk6/v;-><init>(Ljava/lang/String;Lk6/s;Ljava/lang/String;J)V

    const-string v9, "\u06e1\u06e5\u06e8"

    move-object v7, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lq6/۟ۥۦۡ۟;->۟ۧۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "\u06e8\u06e0\u06e2"

    move-object v9, v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    const-string v9, "\u06e0\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    new-instance v2, Lk6/s;

    invoke-direct {v2, v6}, Lk6/s;-><init>(Landroid/os/Bundle;)V

    const-string v0, "\u06e4\u06e3\u06e7"

    move-object v9, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lx7/۟۟ۦۨۡ;->ۣ۟ۧۤۧ(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v0, "\u06e2\u06e8\u06e4"

    move-object v9, v0

    goto :goto_0

    :sswitch_6
    return-object v7

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_4
        0x1aaf44 -> :sswitch_6
        0x1ab35e -> :sswitch_1
        0x1aba48 -> :sswitch_0
        0x1abe42 -> :sswitch_2
        0x1ac526 -> :sswitch_3
        0x1ac545 -> :sswitch_5
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e3\u06e6\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v3, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e2\u06e0\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    sget v7, Ls8/۟ۥۨۨ;->۟ۥۣۤ۟:I

    const-string v1, "\u06e1\u06e3\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v9, v7, -0x299

    const-string v1, "\u06e1\u06e4\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    sget v7, Lr7/۟۟ۡ۟ۢ;->۟ۢۤۥۢ:I

    const-string v1, "\u06e7\u06e6\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lk6/g4;->۟ۧۧۢۨ()[S

    move-result-object v1

    const-string v6, "\u06e3\u06e6\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v3, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e6\u06e4\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    sget v7, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    const-string v1, "\u06df\u06e2\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v2}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۥۡ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e3\u06e5\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lu1/ۢۥ۠ۤ;->ۣ۟۠ۡ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e2\u06df\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    const/4 v1, 0x7

    const/16 v5, 0x981

    invoke-static {v4, v1, v9, v5}, Lp5/۟ۡۧۡۨ;->۠ۢۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e7\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lk6/g4;->۟ۧۧۢۨ()[S

    move-result-object v1

    const-string v6, "\u06df\u06e6\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v9, v7, 0x144

    const-string v1, "\u06e6\u06e2\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v3, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06df\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit16 v9, v7, -0x374

    const-string v1, "\u06e0\u06e2\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_d
    const/16 v1, 0xd

    const/16 v5, 0x97f

    invoke-static {v4, v1, v9, v5}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟۟ۡۢۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e6\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "\u06e6\u06df\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_f
    invoke-static {v3, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e7\u06e8\u06e5"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Lk6/g4;->۟ۧۧۢۨ()[S

    move-result-object v1

    const-string v6, "\u06e6\u06e1\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {p0}, Lq6/۟ۥۦۡ۟;->۟ۧۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e0\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v3}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e7\u06e3\u06e7"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {p0}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۢۧۢ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v1

    const-string v6, "\u06e6\u06e2\u06e5"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_14
    const/16 v1, 0x173

    invoke-static {v4, v8, v9, v1}, Lq7/۟ۢۡ۟۟;->ۦۣۣ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e2\u06e0\u06e5"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v3, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e2\u06e4\u06e1"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_16
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_3
        0x1aa721 -> :sswitch_b
        0x1aa760 -> :sswitch_a
        0x1aa7d9 -> :sswitch_0
        0x1aab26 -> :sswitch_d
        0x1aaefe -> :sswitch_1
        0x1aaf25 -> :sswitch_14
        0x1ab244 -> :sswitch_f
        0x1ab264 -> :sswitch_11
        0x1ab267 -> :sswitch_e
        0x1ab2df -> :sswitch_4
        0x1ab6c2 -> :sswitch_9
        0x1ab6de -> :sswitch_2
        0x1ab6e5 -> :sswitch_13
        0x1abe65 -> :sswitch_15
        0x1ac149 -> :sswitch_7
        0x1ac188 -> :sswitch_5
        0x1ac1a9 -> :sswitch_6
        0x1ac1ac -> :sswitch_8
        0x1ac1e4 -> :sswitch_12
        0x1ac58b -> :sswitch_16
        0x1ac5e6 -> :sswitch_c
        0x1ac624 -> :sswitch_10
    .end sparse-switch
.end method
