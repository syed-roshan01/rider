.class public final Lk0/x2;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lk0/y2;

.field public final b:Lm9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk0/y2;Lm9/l;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/x2;->a:Lk0/y2;

    iput-object p2, p0, Lk0/x2;->b:Lm9/k;

    invoke-static {}, Le2/۟ۤۢۦ;->ۣ۟ۢۢۡ()I

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
    const-string v0, "vHy7519W6loXYIPUhGzKr"

    invoke-static {v0}, Lg/۟ۧ۠ۤ;->۟ۦۥۤۤ(Ljava/lang/String;)Ljava/lang/String;

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
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p1, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const-class v2, Lk0/x2;

    if-eq v2, v3, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move v0, v1

    :goto_4
    :sswitch_a
    return v0

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    check-cast p1, Lk0/x2;

    invoke-static {p0}, Lr/۠ۡ۠;->۟ۡۧۦۨ(Ljava/lang/Object;)Lk0/y2;

    move-result-object v2

    invoke-static {p1}, Lr/۠ۡ۠;->۟ۡۧۦۨ(Ljava/lang/Object;)Lk0/y2;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-nez v3, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    move v0, v1

    goto :goto_4

    :sswitch_10
    invoke-static {p0}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v2

    invoke-static {p1}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    if-nez v3, :cond_4

    const v2, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_12
    const v2, 0xc240

    goto :goto_6

    :sswitch_13
    move v0, v1

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_a
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_a
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e0\u06e4\u06e1"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v4, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۣ۟ۡۤۤ:I

    const-string v1, "\u06df\u06e3\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v5, v4, 0x5c

    const-string v1, "\u06e4\u06df\u06e6"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_1
    mul-int v4, v6, v7

    const-string v1, "\u06df\u06e2\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lr/۠ۡ۠;->۟ۡۧۦۨ(Ljava/lang/Object;)Lk0/y2;

    move-result-object v0

    const-string v1, "\u06e1\u06e5\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0}, Lj2/۠ۤۨۤ;->۟۠ۢۦۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v1, "\u06e4\u06e4"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_4
    add-int/lit8 v5, v6, 0x7

    const-string v1, "\u06e1\u06df\u06e0"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_5
    add-int v5, v7, v4

    const-string v1, "\u06e4\u06df\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v1

    const-string v3, "\u06e2\u06df\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v2}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v1, "\u06e8\u06e5\u06df"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_8
    add-int/lit8 v5, v6, -0x7

    const-string v1, "\u06df\u06e2\u06e4"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_9
    return v7

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa760 -> :sswitch_6
        0x1aa761 -> :sswitch_9
        0x1aa77b -> :sswitch_0
        0x1aab5d -> :sswitch_2
        0x1aae82 -> :sswitch_5
        0x1aaf3d -> :sswitch_3
        0x1ab246 -> :sswitch_7
        0x1ab9c7 -> :sswitch_8
        0x1ab9cb -> :sswitch_1
        0x1ac982 -> :sswitch_4
    .end sparse-switch
.end method
