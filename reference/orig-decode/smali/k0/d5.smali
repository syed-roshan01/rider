.class public final Lk0/d5;
.super Ljava/lang/Object;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JJJJJ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lk0/d5;->a:J

    iput-wide p3, p0, Lk0/d5;->b:J

    iput-wide p5, p0, Lk0/d5;->c:J

    iput-wide p7, p0, Lk0/d5;->d:J

    iput-wide p9, p0, Lk0/d5;->e:J

    invoke-static {}, Lh1/۟۟ۨۦۦ;->ۣ۟ۢۡۥ()I

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
    const-string v0, "4a3rn6KBi"

    invoke-static {v0}, Ld9/ۡۥۣۡ;->ۣۨۤۧ(Ljava/lang/String;)Ljava/lang/String;

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
    .locals 6

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
    instance-of v3, p1, Lk0/d5;

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v3, :cond_2

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
    check-cast p1, Lk0/d5;

    invoke-static {p1}, Lj2/۠ۤۨۤ;->۟ۥۣۢۥ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p0}, Lj2/۠ۤۨۤ;->۟ۥۣۢۥ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5, v2, v3}, Lc3/۟ۥ۠ۡۧ;->۟ۡۨۥ۠(JJ)Z

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
    invoke-static {p0}, Landroidx/annotation/۟ۥۥۣۨ;->۠۟ۧۧ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p1}, Landroidx/annotation/۟ۥۥۣۨ;->۠۟ۧۧ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lc3/۟ۥ۠ۡۧ;->۟ۡۨۥ۠(JJ)Z

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

    :sswitch_14
    invoke-static {p0}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۥ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p1}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۥ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lc3/۟ۥ۠ۡۧ;->۟ۡۨۥ۠(JJ)Z

    move-result v3

    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_15
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_16
    if-nez v3, :cond_5

    const v2, 0xc2db

    goto :goto_7

    :sswitch_17
    move v0, v1

    goto :goto_4

    :sswitch_18
    invoke-static {p0}, Lb8/ۣ۟ۨۢۥ;->۟ۥۣۤۢ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p1}, Lb8/ۣ۟ۨۢۥ;->۟ۥۣۤۢ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lc3/۟ۥ۠ۡۧ;->۟ۡۨۥ۠(JJ)Z

    move-result v3

    const v2, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_19
    if-nez v3, :cond_6

    const v2, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_1a
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_1b
    move v0, v1

    goto/16 :goto_4

    :sswitch_1c
    invoke-static {p0}, Lp7/ۣۣۦۤ;->ۣۤۡۡ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p1}, Lp7/ۣۣۦۤ;->ۣۤۡۡ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lc3/۟ۥ۠ۡۧ;->۟ۡۨۥ۠(JJ)Z

    move-result v3

    const v2, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_1d
    if-nez v3, :cond_7

    const v2, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1e
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1f
    move v0, v1

    goto/16 :goto_4

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
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_18
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_19
        0x6af -> :sswitch_1a
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1d
        0x2d -> :sswitch_a
        0x32 -> :sswitch_1e
        0x4c -> :sswitch_1f
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 7

    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    const-string v0, "\u06e0\u06e4\u06e1"

    move v1, v4

    move v5, v4

    move v6, v4

    :goto_0
    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    rsub-int/lit8 v1, v6, 0x0

    const-string v0, "\u06e1\u06e0\u06e7"

    goto :goto_0

    :sswitch_0
    mul-int v4, v5, v1

    const-string v0, "\u06df\u06e6\u06e4"

    move v6, v4

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v3}, Lc1/ۣۢۧۨ;->۟ۧ۠ۤ۠(J)I

    move-result v4

    const-string v0, "\u06e2\u06e3\u06df"

    move v5, v4

    goto :goto_0

    :sswitch_2
    sget v4, Lc1/ۣۢۧۨ;->ۣ۟ۡ۠ۦ:I

    const-string v0, "\u06df\u06e2\u06e7"

    move v6, v4

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v3, v6, v1}, Lz/۟ۥۣۣ۠;->ۣۨۤۡ(JII)I

    move-result v4

    const-string v0, "\u06e0\u06e2\u06e4"

    move v5, v4

    goto :goto_0

    :sswitch_4
    invoke-static {v2, v3}, Lc1/ۣۢۧۨ;->۟ۧ۠ۤ۠(J)I

    move-result v4

    const-string v0, "\u06e2\u06e4"

    move v6, v4

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lp0/۟ۢۤۧ;->۟ۥ۟ۢۥ()I

    move-result v4

    const-string v0, "\u06e3\u06e4\u06e8"

    move v5, v4

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/annotation/۟ۥۥۣۨ;->۠۟ۧۧ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06e2\u06e6\u06e2"

    goto :goto_0

    :sswitch_7
    sub-int v4, v5, v1

    const-string v0, "\u06e3\u06e7"

    move v6, v4

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->ۥ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06df\u06e1\u06e2"

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lb8/ۣ۟ۨۢۥ;->۟ۥۣۤۢ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06e2\u06e5\u06e8"

    goto :goto_0

    :sswitch_a
    invoke-static {v2, v3, v5, v1}, Lz/۟ۥۣۣ۠;->ۣۨۤۡ(JII)I

    move-result v4

    const-string v0, "\u06e7\u06e5\u06e0"

    move v6, v4

    goto :goto_0

    :sswitch_b
    invoke-static {p0}, Lp7/ۣۣۦۤ;->ۣۤۡۡ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06e1\u06e3\u06e0"

    goto :goto_0

    :sswitch_c
    invoke-static {p0}, Lj2/۠ۤۨۤ;->۟ۥۣۢۥ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06df\u06e6\u06e5"

    goto :goto_0

    :sswitch_d
    xor-int/lit16 v1, v6, -0x361

    const-string v0, "\u06df\u06e2"

    goto :goto_0

    :sswitch_e
    invoke-static {v2, v3, v6, v1}, Lz/۟ۥۣۣ۠;->ۣۨۤۡ(JII)I

    move-result v4

    const-string v0, "\u06e1\u06e4\u06e4"

    move v5, v4

    goto :goto_0

    :sswitch_f
    return v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc64 -> :sswitch_f
        0x1aa740 -> :sswitch_a
        0x1aa764 -> :sswitch_d
        0x1aa7dd -> :sswitch_6
        0x1aa7de -> :sswitch_1
        0x1aab22 -> :sswitch_8
        0x1aab5d -> :sswitch_5
        0x1aaea8 -> :sswitch_7
        0x1aaefe -> :sswitch_4
        0x1aaf21 -> :sswitch_b
        0x1ab2be -> :sswitch_2
        0x1ab305 -> :sswitch_e
        0x1ab31e -> :sswitch_3
        0x1ab6a7 -> :sswitch_c
        0x1ac5c2 -> :sswitch_9
    .end sparse-switch
.end method
