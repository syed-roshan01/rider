.class public final Lk6/q7;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/i4;
.implements Lk6/w7;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lk6/p7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/q7;->short:[S

    return-void

    :array_0
    .array-data 2
        0x9e8s
        0x9d9s
        0x9d9s
        0x9e0s
        0x9cds
        0x989s
        0x9c7s
        0x9c6s
        0x9dds
        0x989s
        0x9c2s
        0x9c7s
        0x9c6s
        0x9des
        0x9c7s
        0x989s
        0x9des
        0x9c1s
        0x9ccs
        0x9c7s
        0x989s
        0x9c5s
        0x9c6s
        0x9ces
        0x9ces
        0x9c0s
        0x9c7s
        0x9ces
        0x989s
        0x9ccs
        0x9dfs
        0x9ccs
        0x9c7s
        0x9dds
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/p7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/q7;->a:Lk6/p7;

    invoke-static {}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۢۡۤۡ()I

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
    const-string v0, "UxUaeoTk6ks7XlVBYv3"

    invoke-static {v0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥ۠ۢۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۥۧۨ۠()[S
    .locals 2

    invoke-static {}, Lk/ۣۡۤۧ;->ۦ۟ۦ۟()I

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
    sget-object v0, Lk6/q7;->short:[S

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
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06df\u06df\u06e3"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Ldagger/hilt/migration/۟ۦۨۥۣ;->۟۟ۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e6\u06e3"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۡۧ۠ۨ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    const-string v1, "\u06e8\u06e5\u06e7"

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa703 -> :sswitch_0
        0x1abe62 -> :sswitch_1
    .end sparse-switch
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۠۟ۡ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {p0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۡۧ۠ۨ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v2

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
    invoke-static {v2}, Lh8/۟ۤۨۨۦ;->ۣۧۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v1}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/q7;->ۥۧۨ۠()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lm0/۟ۤۡۤۤ;->ۢ۟ۨۢ:I

    xor-int/lit16 v3, v3, 0x30b

    const/16 v4, 0x9a9

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->ۡۦۦۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1, p2}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {v2}, Lz3/۟ۡ۠ۦۣ;->ۨۥۧۦ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v6

    new-instance v0, Lk/e;

    sget v1, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟۟ۦ:I

    xor-int/lit16 v5, v1, -0xf6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v6, v0}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method
