.class public final Lf5/b;
.super Lf5/h;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/b;->short:[S

    return-void

    :array_0
    .array-data 2
        0x288s
        0x280s
        0x28cs
        0x284s
        0x281s
        0x30bs
        0x323s
        0x32fs
        0x327s
        0x322s
        0x300s
        0x321s
        0x33as
        0x318s
        0x32bs
        0x33cs
        0x327s
        0x328s
        0x327s
        0x32bs
        0x32as
        0x366s
        0x32bs
        0x323s
        0x32fs
        0x327s
        0x322s
        0x373s
        0x3c7s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lf5/b;->۟ۦ۟ۢ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣۣۤۤ:I

    xor-int/lit16 v2, v2, -0x1a2

    const/16 v3, 0x2ed

    invoke-static {v0, v1, v2, v3}, Lw0/۟ۤۧۥۥ;->ۢ۠ۥۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/b;->a:Ljava/lang/String;

    invoke-static {}, Ld7/۟ۢۧۧ۠;->ۡۥۤ()I

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
    const-string v0, "hUhICeHO"

    invoke-static {v0}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۢۡۡ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦ۟ۢ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf5/b;->short:[S

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
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne p0, p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    instance-of v3, p1, Lf5/b;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    move v0, v1

    :goto_2
    :sswitch_6
    return v0

    :sswitch_7
    check-cast p1, Lf5/b;

    invoke-static {p0}, Lb7/۟۟ۤۤۤ;->۟ۧۦۣ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lb7/۟۟ۤۤۤ;->۟ۧۦۣ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-nez v3, :cond_2

    const v2, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbe41

    goto :goto_3

    :sswitch_a
    move v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_6
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lb7/۟۟ۤۤۤ;->۟ۧۦۣ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu/ۤ;->۠ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e5\u06e8\u06e2"

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

    invoke-static {}, Lf5/b;->۟ۦ۟ۢ()[S

    move-result-object v1

    const-string v6, "\u06e3\u06e5\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lf5/b;->۟ۦ۟ۢ()[S

    move-result-object v1

    const-string v6, "\u06e2\u06e2\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    sget v7, Ldagger/hilt/internal/ۡۡۨۦ;->ۤۤ۠ۨ:I

    const-string v1, "\u06e6\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "\u06e4\u06e5\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v8, v7, 0xc6

    const-string v1, "\u06e6\u06e7\u06e6"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_4
    invoke-static {v2, v5, v3}, Le1/۟ۢ۟ۤۡ;->ۥۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e4\u06e5\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    const/4 v1, 0x5

    const/16 v5, 0x34e

    invoke-static {v4, v1, v9, v5}, Ll6/ۥۦۣ۟;->ۧۨۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e6\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lb7/۟۟ۤۤۤ;->۟ۧۦۣ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e3\u06e2\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    const/16 v1, 0x1c

    const/4 v3, 0x1

    const/16 v6, 0x3ee

    invoke-static {v4, v1, v3, v6}, Ld7/ۢۧۧۢ;->ۧۡۢ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e3\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_3
        0x1ab29f -> :sswitch_1
        0x1ab6c5 -> :sswitch_7
        0x1aba81 -> :sswitch_8
        0x1aba85 -> :sswitch_6
        0x1abe01 -> :sswitch_4
        0x1abe5f -> :sswitch_2
        0x1abe9f -> :sswitch_0
        0x1ac245 -> :sswitch_5
    .end sparse-switch
.end method
