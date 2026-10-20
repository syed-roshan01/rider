.class public final Lf5/c;
.super Lf5/h;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xf

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/c;->short:[S

    return-void

    :array_0
    .array-data 2
        0x846s
        0x871s
        0x871s
        0x86cs
        0x871s
        0x82bs
        0x86es
        0x866s
        0x870s
        0x870s
        0x862s
        0x864s
        0x866s
        0x83es
        0x634s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/c;->a:Ljava/lang/String;

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

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
    const-string v0, "9ha2dv"

    invoke-static {v0}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->۟۠ۤ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟ۢۤۢ()[S
    .locals 2

    invoke-static {}, Lu/ۤ;->ۣ۟ۢۡۢ()I

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
    sget-object v0, Lf5/c;->short:[S

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
    instance-of v3, p1, Lf5/c;

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
    check-cast p1, Lf5/c;

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->۟ۦۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lm1/ۣۡ۠ۧ;->۟ۦۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

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

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->۟ۦۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu/ۤ;->۠ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06df\u06e4"

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

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->۟ۦۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e8\u06e6\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "\u06e8\u06df\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lf5/c;->ۣ۟ۢۤۢ()[S

    move-result-object v1

    const-string v6, "\u06e2\u06e3\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    sget v9, Lz0/ۣ۟۠ۤ۟;->ۣۣ۟ۡ:I

    const-string v1, "\u06e6\u06e7\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lf5/c;->ۣ۟ۢۤۢ()[S

    move-result-object v1

    const-string v6, "\u06e5\u06e4\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    const/16 v0, 0xe

    const/4 v1, 0x1

    const/16 v6, 0x61d

    invoke-static {v4, v0, v1, v6}, La/ۥۦۥۡ;->۟ۧ۠۟ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e5\u06e0\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x803

    invoke-static {v4, v8, v7, v1}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06df\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v7, v9, 0x3a1

    const-string v1, "\u06e1\u06e2\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v2, v5, v0}, Le1/۟ۢ۟ۤۡ;->ۥۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e6\u06e4\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_1
        0x1aaee6 -> :sswitch_5
        0x1ab2c1 -> :sswitch_2
        0x1ab9c9 -> :sswitch_0
        0x1abda4 -> :sswitch_7
        0x1abe21 -> :sswitch_4
        0x1ac1e6 -> :sswitch_8
        0x1ac247 -> :sswitch_6
        0x1ac9a1 -> :sswitch_3
    .end sparse-switch
.end method
