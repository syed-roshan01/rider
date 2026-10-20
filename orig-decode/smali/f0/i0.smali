.class public final Lf0/i0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ljava/lang/Object;

.field public final b:Lo1/z;

.field public final c:Lf0/k1;

.field public final d:Lh0/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo1/z;Lf0/k1;Lh0/v0;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf0/i0;->b:Lo1/z;

    iput-object p2, p0, Lf0/i0;->c:Lf0/k1;

    iput-object p3, p0, Lf0/i0;->d:Lh0/v0;

    sget v0, Lc0/ۦ۠۟ۥ;->ۣۨۤ۠:I

    xor-int/lit16 v0, v0, -0x350

    invoke-direct {p0, v0, p4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۡۡۧ()I

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
    const-string v0, "iPdeTm1LUYbjS0O"

    invoke-static {v0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۣ۠ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e5\u06e4\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۣۥۣ۠(Ljava/lang/Object;)Lh0/v0;

    move-result-object v1

    const-string v4, "\u06e8\u06e0\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    iput-object p1, p0, Lf0/i0;->a:Ljava/lang/Object;

    const-string v1, "\u06e6\u06e6\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    new-instance p0, Lf0/i0;

    invoke-direct {p0, v0, v2, v3, p2}, Lf0/i0;-><init>(Lo1/z;Lf0/k1;Lh0/v0;Lu8/e;)V

    const-string v1, "\u06e4\u06e5\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lg7/۠ۤۧ;->۟ۥ۟ۧۧ(Ljava/lang/Object;)Lo1/z;

    move-result-object v0

    const-string v1, "\u06e3\u06e3\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۧ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v1

    const-string v4, "\u06e5\u06e5\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab683 -> :sswitch_1
        0x1aba7f -> :sswitch_0
        0x1abe26 -> :sswitch_3
        0x1ac226 -> :sswitch_4
        0x1ac8f0 -> :sswitch_2
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e6\u06e8\u06df"

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, p1

    move-object v2, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-object v5

    :sswitch_0
    invoke-static {p0, v5}, Lo4/۟۟ۡۧۤ;->ۣ۟ۧ۠۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e1\u06e7\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e4\u06e5\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v4, v3}, Lc4/۟ۦۧۦۤ;->ۥۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e5\u06e2\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lf0/i0;

    const-string v6, "\u06e8\u06e8\u06e1"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e5\u06df\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06df\u06df\u06e2"

    move-object v3, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa702 -> :sswitch_2
        0x1aba87 -> :sswitch_5
        0x1abd8c -> :sswitch_0
        0x1abde3 -> :sswitch_3
        0x1ac25d -> :sswitch_1
        0x1ac9e1 -> :sswitch_4
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v13, 0x1

    const/4 v10, 0x0

    const/4 v2, 0x0

    const-string v12, "\u06e5\u06e5\u06e6"

    move-object v0, v2

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v1, p1

    move-object v7, v2

    move-object v8, v2

    move v9, v10

    move v11, v10

    :goto_0
    invoke-static {v12}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    invoke-static {v1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const-string v10, "\u06e4\u06e0\u06e5"

    move-object v12, v10

    goto :goto_0

    :sswitch_0
    new-instance v3, Lf0/g0;

    invoke-direct {v3, v6, v4, v2}, Lf0/g0;-><init>(Lo1/z;Lf0/k1;Lu8/e;)V

    const-string v10, "\u06e1\u06e1\u06e3"

    move-object v12, v10

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v10, v9, -0x299

    const-string v12, "\u06e3\u06e7\u06e8"

    move v11, v10

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v2, v11, v5, v13}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    const-string v10, "\u06e8\u06e5\u06e7"

    move-object v12, v10

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۣۥۣ۠(Ljava/lang/Object;)Lh0/v0;

    move-result-object v7

    const-string v10, "\u06e7\u06e5\u06e3"

    move-object v12, v10

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v8

    const-string v10, "\u06e5\u06e5\u06e2"

    move-object v12, v10

    goto :goto_0

    :sswitch_5
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v10, "\u06df\u06e4\u06e7"

    move-object v12, v10

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lv6/۟ۦۨۦۣ;->ۣ۟ۤ۠ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v10, "\u06e3\u06e0\u06e5"

    move-object v12, v10

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lg7/۠ۤۧ;->۟ۥ۟ۧۧ(Ljava/lang/Object;)Lo1/z;

    move-result-object v6

    const-string v10, "\u06e1\u06e5\u06e8"

    move-object v12, v10

    goto :goto_0

    :sswitch_8
    sget v9, Lg9/۠ۨۧۤ;->ۡۢ۟۟:I

    const-string v10, "\u06df\u06e5\u06e0"

    move-object v12, v10

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    const-string v10, "\u06e0\u06e6\u06e0"

    move-object v12, v10

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۧ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v4

    const-string v10, "\u06e4\u06e4"

    move-object v12, v10

    goto :goto_0

    :sswitch_b
    invoke-static {v0, v2, v11, v3, v13}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    const-string v10, "\u06e5\u06e3\u06e8"

    move-object v12, v10

    goto :goto_0

    :sswitch_c
    new-instance v5, Lf0/h0;

    invoke-direct {v5, v6, v7, v2}, Lf0/h0;-><init>(Lo1/z;Lh0/v0;Lu8/e;)V

    const-string v10, "\u06e0\u06e2\u06e0"

    move-object v12, v10

    goto :goto_0

    :sswitch_d
    return-object v8

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0x1aa7a2 -> :sswitch_7
        0x1aa7ba -> :sswitch_1
        0x1aab1e -> :sswitch_2
        0x1aaec3 -> :sswitch_8
        0x1aaf44 -> :sswitch_a
        0x1ab628 -> :sswitch_5
        0x1ab704 -> :sswitch_b
        0x1ab9e9 -> :sswitch_6
        0x1abe0a -> :sswitch_3
        0x1abe42 -> :sswitch_d
        0x1abe46 -> :sswitch_9
        0x1ac5c5 -> :sswitch_c
        0x1ac98a -> :sswitch_4
    .end sparse-switch
.end method
