.class public final Lf0/c1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lo1/z;

.field public final c:Lf0/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/c1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x834s
        0x836s
        0x83bs
        0x83bs
        0x877s
        0x823s
        0x838s
        0x877s
        0x870s
        0x825s
        0x832s
        0x824s
        0x822s
        0x83as
        0x832s
        0x870s
        0x877s
        0x835s
        0x832s
        0x831s
        0x838s
        0x825s
        0x832s
        0x877s
        0x870s
        0x83es
        0x839s
        0x821s
        0x838s
        0x83cs
        0x832s
        0x870s
        0x877s
        0x820s
        0x83es
        0x823s
        0x83fs
        0x877s
        0x834s
        0x838s
        0x825s
        0x838s
        0x822s
        0x823s
        0x83es
        0x839s
        0x832s
    .end array-data
.end method

.method public constructor <init>(Lo1/z;Lf0/k1;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf0/c1;->b:Lo1/z;

    iput-object p2, p0, Lf0/c1;->c:Lf0/k1;

    sget v0, Landroidx/fragment/app/ۣۣۣۨ;->ۥۧۤ۠:I

    xor-int/lit8 v0, v0, 0x5b

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

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
    const-string v0, "somdd0SnQ5p5CzY3c87AoyErvQ7D"

    invoke-static {v0}, Lh0/۟ۥ۟ۡۦ;->ۣۨۥ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۧ۟ۤ۠()[S
    .locals 2

    invoke-static {}, Lk7/۟ۤۥۡ;->ۥۢۥۣ()I

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
    sget-object v0, Lf0/c1;->short:[S

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e4\u06e7\u06e8"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance p0, Lf0/c1;

    invoke-direct {p0, v0, v2, p2}, Lf0/c1;-><init>(Lo1/z;Lf0/k1;Lu8/e;)V

    const-string v1, "\u06e1\u06e1\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, La0/ۣ۟ۤۨۧ;->۟ۥۦۧۤ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v1

    const-string v3, "\u06e5\u06df\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۢ۟ۡ(Ljava/lang/Object;)Lo1/z;

    move-result-object v0

    const-string v1, "\u06e6\u06e5\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aaec2 -> :sswitch_2
        0x1abac5 -> :sswitch_1
        0x1ac202 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e6\u06e0\u06e0"

    move-object v2, p1

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lf0/c1;

    const-string v6, "\u06df\u06e7\u06e5"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v4}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->۟۟ۦۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e2\u06e3\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e5\u06e1\u06e4"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e1\u06e0"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v5, v3}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۣ۟۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e3\u06e0\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e7\u06e6\u06e6"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_4
        0x1aa7fd -> :sswitch_1
        0x1ab2c0 -> :sswitch_5
        0x1abdc8 -> :sswitch_0
        0x1ac166 -> :sswitch_2
        0x1ac5e7 -> :sswitch_3
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v4, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    invoke-static {p0}, La2/۟ۡۥۦ۟;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v1

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
    if-eqz v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v3, v4, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf0/c1;->۟ۧ۟ۤ۠()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lz8/ۣۤۡۧ;->ۣ۟ۧ۟ۢ:I

    xor-int/lit16 v3, v3, -0x301

    const/16 v4, 0x857

    invoke-static {v1, v2, v3, v4}, Lf/ۣ۟ۤۤ;->ۡۤۧ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    iput v4, p0, Lf0/c1;->a:I

    new-instance v0, Lf0/h1;

    invoke-static {p0}, La0/ۣ۟ۤۨۧ;->۟ۥۦۧۤ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Lf0/h1;-><init>(Lf0/k1;Lu8/e;)V

    invoke-static {p0}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۢ۟ۡ(Ljava/lang/Object;)Lo1/z;

    move-result-object v3

    invoke-static {v3, v0, p0}, Lr5/۟ۤۨۥۡ;->۟ۦۧ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v3, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v3, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ne v0, v2, :cond_2

    const v3, 0xbedc

    goto :goto_3

    :sswitch_b
    const v3, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    const v3, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    if-ne v0, v2, :cond_3

    const v3, 0xc25f

    goto :goto_6

    :sswitch_e
    const v3, 0xbf1a

    goto :goto_4

    :sswitch_f
    move-object v0, v1

    goto :goto_5

    :cond_3
    :sswitch_10
    const v3, 0xc240

    goto :goto_6

    :sswitch_11
    move-object v1, v2

    :sswitch_12
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
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
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_12
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch
.end method
