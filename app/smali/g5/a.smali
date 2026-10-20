.class public final Lg5/a;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x27

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lg5/a;->short:[S

    return-void

    :array_0
    .array-data 2
        0x86as
        0x847s
        0x848s
        0x841s
        0x853s
        0x847s
        0x841s
        0x843s
        0x86fs
        0x852s
        0x843s
        0x84bs
        0x80es
        0x845s
        0x849s
        0x842s
        0x843s
        0x81bs
        0x463s
        0x46fs
        0x421s
        0x42es
        0x422s
        0x42as
        0x472s
        0xb8bs
        0xb87s
        0xbc9s
        0xbc6s
        0xbd3s
        0xbces
        0xbd1s
        0xbc2s
        0xbe9s
        0xbc6s
        0xbcas
        0xbc2s
        0xb9as
        0x467s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lg5/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lg5/a;->c:Ljava/lang/String;

    invoke-static {}, Lr4/۟ۦۦ۠ۥ;->ۣ۠ۦ۠()I

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
    const-string v0, "UsocAObNnjFeyCGFu"

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->۠ۡ۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟۟۟ۧۥ()[S
    .locals 2

    invoke-static {}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۧۤۧ()I

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
    sget-object v0, Lg5/a;->short:[S

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
    .locals 5

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
    instance-of v3, p1, Lg5/a;

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
    check-cast p1, Lg5/a;

    invoke-static {p1}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    :sswitch_b
    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->ۤۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lx7/۟ۤۡ۟ۦ;->ۤۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbebd

    goto :goto_4

    :sswitch_d
    if-nez v3, :cond_3

    const v2, 0xbedc

    goto :goto_4

    :sswitch_e
    move v0, v1

    goto :goto_2

    :sswitch_f
    invoke-static {p0}, Lv0/۟ۤۧ۠ۧ;->۟ۡۡ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lv0/۟ۤۧ۠ۧ;->۟ۡۡ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v2, 0xbf39

    goto :goto_5

    :sswitch_11
    if-nez v3, :cond_4

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_12
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
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_6
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 6

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e6\u06e1"

    move v2, v3

    move v4, v3

    move v5, v3

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v3, v5, -0x227

    const-string v1, "\u06e0\u06e3\u06e5"

    move v4, v3

    goto :goto_0

    :sswitch_0
    add-int/lit8 v3, v5, 0xb

    const-string v1, "\u06e3\u06e6\u06e3"

    move v4, v3

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e8\u06e0\u06e5"

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lv0/۟ۤۧ۠ۧ;->۟ۡۡ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e6\u06e7\u06e7"

    goto :goto_0

    :sswitch_3
    invoke-static {v0}, Lu/ۤ;->۠ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    const-string v1, "\u06e8\u06e7\u06e3"

    goto :goto_0

    :sswitch_4
    mul-int v3, v2, v4

    const-string v1, "\u06e7\u06e0\u06df"

    move v5, v3

    goto :goto_0

    :sswitch_5
    invoke-static {v0, v5, v4}, Lw2/ۧۦۧ;->۟ۥۨۨۦ(Ljava/lang/Object;II)I

    move-result v2

    const-string v1, "\u06e0\u06e8\u06e5"

    goto :goto_0

    :sswitch_6
    add-int v3, v4, v2

    const-string v1, "\u06df\u06e7\u06e7"

    move v5, v3

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->ۤۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e7\u06e5"

    goto :goto_0

    :sswitch_8
    invoke-static {v0}, Lu/ۤ;->۠ۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    const-string v1, "\u06e1\u06e1\u06e7"

    move v5, v3

    goto :goto_0

    :sswitch_9
    add-int/lit8 v3, v5, -0xb

    const-string v1, "\u06e5\u06e4\u06e0"

    move v4, v3

    goto :goto_0

    :sswitch_a
    sget v3, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->ۣۢۡ:I

    const-string v1, "\u06e0\u06e8\u06e7"

    move v5, v3

    goto :goto_0

    :sswitch_b
    return v4

    :sswitch_data_0
    .sparse-switch
        0x1aa7ff -> :sswitch_0
        0x1aab42 -> :sswitch_4
        0x1aabdd -> :sswitch_2
        0x1aaec7 -> :sswitch_9
        0x1aaf5c -> :sswitch_1
        0x1ab340 -> :sswitch_5
        0x1ab6e0 -> :sswitch_b
        0x1abe21 -> :sswitch_6
        0x1ac246 -> :sswitch_8
        0x1ac526 -> :sswitch_7
        0x1ac8ed -> :sswitch_3
        0x1ac9c4 -> :sswitch_a
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e1\u06e3\u06e3"

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

    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e1\u06e1\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lg5/a;->۟۟۟ۧۥ()[S

    move-result-object v1

    const-string v6, "\u06df\u06df\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    sget v9, Lk2/۟ۢۦۤۤ;->ۥۢۧۤ:I

    const-string v1, "\u06e7\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e1\u06e7\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "\u06e4\u06e2\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lx7/۟ۤۡ۟ۦ;->ۤۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x12

    const/16 v5, 0x44f

    invoke-static {v4, v1, v7, v5}, Lt2/۟ۦۢۡۧ;->ۣۣۥۣ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e6\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lv0/۟ۤۧ۠ۧ;->۟ۡۡ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e2\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e4\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lg5/a;->۟۟۟ۧۥ()[S

    move-result-object v1

    const-string v6, "\u06e8\u06e5\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    const/16 v1, 0x19

    const/16 v5, 0xba7

    invoke-static {v4, v1, v7, v5}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۡۡ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e2\u06e1\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lg5/a;->۟۟۟ۧۥ()[S

    move-result-object v1

    const-string v6, "\u06e1\u06e1\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e5\u06e8\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    const/16 v1, 0x26

    const/4 v2, 0x1

    const/16 v6, 0x44e

    invoke-static {v4, v1, v2, v6}, Lk8/ۣ۠ۨۤ;->ۣۤۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e7\u06e7\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۤۢۦ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e8\u06e8"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_e
    sget v9, Le1/۟ۡۡۤۡ;->۟ۡ۠ۤۧ:I

    const-string v1, "\u06e4\u06e6\u06e2"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_f
    xor-int/lit16 v7, v9, -0x159

    const-string v1, "\u06e0\u06e8\u06e4"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v0, v5, v2}, Le1/۟ۢ۟ۤۡ;->ۥۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e4\u06e2"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lg5/a;->۟۟۟ۧۥ()[S

    move-result-object v1

    const-string v6, "\u06df\u06e0"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_12
    xor-int/lit16 v7, v9, 0x318

    const-string v1, "\u06e4\u06e5\u06e8"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_13
    sget v9, Lu1/ۢۥ۠ۤ;->۠ۨ۟ۤ:I

    const-string v1, "\u06e6\u06e6\u06e7"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_14
    const/16 v1, 0x826

    invoke-static {v4, v8, v7, v1}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۡۦۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e8"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_15
    xor-int/lit16 v7, v9, 0x200

    const-string v1, "\u06e8\u06e1\u06e1"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_16
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_1
        0xdbe9 -> :sswitch_7
        0xdc80 -> :sswitch_0
        0xdca3 -> :sswitch_3
        0xdcc2 -> :sswitch_2
        0xdcdc -> :sswitch_12
        0x1aa706 -> :sswitch_13
        0x1aabdc -> :sswitch_5
        0x1aaec0 -> :sswitch_e
        0x1aaec2 -> :sswitch_a
        0x1aaf01 -> :sswitch_11
        0x1aaf7e -> :sswitch_4
        0x1ab282 -> :sswitch_b
        0x1aba23 -> :sswitch_d
        0x1aba2a -> :sswitch_8
        0x1aba62 -> :sswitch_16
        0x1aba87 -> :sswitch_14
        0x1abaa0 -> :sswitch_f
        0x1abe9c -> :sswitch_6
        0x1ac227 -> :sswitch_15
        0x1ac600 -> :sswitch_10
        0x1ac908 -> :sswitch_9
        0x1ac982 -> :sswitch_c
    .end sparse-switch
.end method
