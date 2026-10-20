.class public final Lk6/r4;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lk6/f5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/r4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x9a8s
        0x98fs
        0x987s
        0x982s
        0x98bs
        0x98as
        0x9ces
        0x99as
        0x981s
        0x9ces
        0x989s
        0x98bs
        0x99as
        0x9ces
        0x9bes
        0x98fs
        0x98ds
        0x985s
        0x98fs
        0x989s
        0x98bs
        0x9a3s
        0x98fs
        0x980s
        0x98fs
        0x989s
        0x98bs
        0x99cs
        0x9ces
        0x988s
        0x981s
        0x99cs
        0x9ces
        0x9a7s
        0x980s
        0x99ds
        0x99as
        0x98fs
        0x982s
        0x982s
        0x9ces
        0x9bcs
        0x98bs
        0x988s
        0x98bs
        0x99cs
        0x99cs
        0x98bs
        0x99cs
        0x9ces
        0x9bes
        0x982s
        0x98fs
        0x997s
        0x9ces
        0x9bds
        0x99as
        0x981s
        0x99cs
        0x98bs
        0x9ces
        0x98ds
        0x981s
        0x983s
        0x99es
        0x98fs
        0x99as
        0x987s
        0x98cs
        0x987s
        0x982s
        0x987s
        0x99as
        0x997s
        0x9ces
        0x98ds
        0x986s
        0x98bs
        0x98ds
        0x985s
        0x994s
        0x998s
        0x99as
        0x9d9s
        0x996s
        0x999s
        0x993s
        0x985s
        0x998s
        0x99es
        0x993s
        0x9d9s
        0x981s
        0x992s
        0x999s
        0x993s
        0x99es
        0x999s
        0x990s
        0x5b1s
        0x596s
        0x59es
        0x59bs
        0x592s
        0x593s
        0x5d7s
        0x583s
        0x598s
        0x5d7s
        0x585s
        0x592s
        0x583s
        0x585s
        0x59es
        0x592s
        0x581s
        0x592s
        0x5d7s
        0x5a7s
        0x59bs
        0x596s
        0x58es
        0x5d7s
        0x5a4s
        0x583s
        0x598s
        0x585s
        0x592s
        0x5d7s
        0x581s
        0x592s
        0x585s
        0x584s
        0x59es
        0x598s
        0x599s
        0x5d7s
        0x591s
        0x598s
        0x585s
        0x5d7s
        0x5bes
        0x599s
        0x584s
        0x583s
        0x596s
        0x59bs
        0x59bs
        0x5d7s
        0x5a5s
        0x592s
        0x591s
        0x592s
        0x585s
        0x585s
        0x592s
        0x585s
    .end array-data
.end method

.method public constructor <init>(Lk6/p7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh8/۟ۤۨۨۦ;->ۣۧۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v0

    iput-object v0, p0, Lk6/r4;->a:Lk6/f5;

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

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
    const-string v0, "BoFn9bnN"

    invoke-static {v0}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->۟ۦۧۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۣۡ۠ۦ()[S
    .locals 2

    invoke-static {}, Lq0/ۥۣۡۧ;->۟۠ۨۧۡ()I

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
    sget-object v0, Lk6/r4;->short:[S

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
.method public final a()Z
    .locals 7

    const/4 v0, 0x0

    invoke-static {p0}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->۟ۡۢۥۦ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v3

    :try_start_0
    invoke-static {v3}, Li6/۟۟ۦۨۧ;->۟ۤۤۧ۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ly9/ۧۨ۠ۢ;->ۣۨۨۤ(Ljava/lang/Object;)Lj/a;

    move-result-object v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {v1}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {}, Lk6/r4;->ۣۡ۠ۦ()[S

    move-result-object v2

    const/4 v4, 0x0

    sget v5, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    xor-int/lit16 v5, v5, 0x112

    const/16 v6, 0x9ee

    invoke-static {v2, v4, v5, v6}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۨۤۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return v0

    :catch_0
    move-exception v1

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const/16 v2, 0x6eb

    goto :goto_2

    :sswitch_5
    invoke-static {}, Lk6/r4;->ۣۡ۠ۦ()[S

    move-result-object v1

    const/16 v4, 0x50

    sget v5, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣ۟ۡ۟ۡ:I

    xor-int/lit16 v5, v5, -0x2bb

    const/16 v6, 0x9f7

    invoke-static {v1, v4, v5, v6}, Lu/ۣۤۧ۠;->۟ۧ۠۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    sget v4, Li6/۟۟ۦۨۧ;->۠ۦۡۡ:I

    xor-int/lit8 v4, v4, 0x4c

    invoke-static {v2, v4, v1}, Lf6/ۣۣۣۣ۟;->ۣ۟ۤۢ۠(Ljava/lang/Object;ILjava/lang/Object;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    invoke-static {v1}, Lw/ۥۣۡۡ;->ۥۣۨۢ(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    const v1, 0x4d17ab4

    if-lt v2, v1, :cond_1

    const v1, 0xbe60

    goto :goto_3

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_3

    :sswitch_8
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_9
    invoke-static {v3}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v2

    invoke-static {v2}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/r4;->ۣۡ۠ۦ()[S

    move-result-object v3

    const/16 v4, 0x63

    sget v5, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۥۧۥۢ:I

    xor-int/lit16 v5, v5, -0x11e

    const/16 v6, 0x5f7

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۢۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v2

    invoke-static {v2, v3, v1}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_3
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method
