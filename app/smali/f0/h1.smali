.class public final Lf0/h1;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public b:Lo1/u;

.field public c:I

.field public d:Ljava/lang/Object;

.field public final e:Lf0/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/h1;->short:[S

    return-void

    :array_0
    .array-data 2
        0xb8es
        0xb8cs
        0xb81s
        0xb81s
        0xbcds
        0xb99s
        0xb82s
        0xbcds
        0xbcas
        0xb9fs
        0xb88s
        0xb9es
        0xb98s
        0xb80s
        0xb88s
        0xbcas
        0xbcds
        0xb8fs
        0xb88s
        0xb8bs
        0xb82s
        0xb9fs
        0xb88s
        0xbcds
        0xbcas
        0xb84s
        0xb83s
        0xb9bs
        0xb82s
        0xb86s
        0xb88s
        0xbcas
        0xbcds
        0xb9as
        0xb84s
        0xb99s
        0xb85s
        0xbcds
        0xb8es
        0xb82s
        0xb9fs
        0xb82s
        0xb98s
        0xb99s
        0xb84s
        0xb83s
        0xb88s
    .end array-data
.end method

.method public constructor <init>(Lf0/k1;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf0/h1;->e:Lf0/k1;

    invoke-direct {p0, p2}, Lw8/h;-><init>(Lu8/e;)V

    invoke-static {}, Lz3/۟ۡ۠ۦۣ;->ۡۤ۟۟()I

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
    const-string v0, "ekCUKbZp8lrffhM"

    invoke-static {v0}, Lc3/۟ۥ۠ۡۧ;->ۤۧۦۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۟ۨۦ()[S
    .locals 2

    invoke-static {}, Lt2/۟ۦۣۡۤ;->ۣ۟ۦۣ()I

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
    sget-object v0, Lf0/h1;->short:[S

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
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e2\u06e4"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    iput-object p1, p0, Lf0/h1;->d:Ljava/lang/Object;

    const-string v1, "\u06e3\u06e3\u06e3"

    goto :goto_0

    :sswitch_0
    new-instance p0, Lf0/h1;

    invoke-direct {p0, v0, p2}, Lf0/h1;-><init>(Lf0/k1;Lu8/e;)V

    const-string v1, "\u06e4\u06e1\u06e6"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lf0/ۣۦۦ۠;->۟ۢ۟ۥۢ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v0

    const-string v1, "\u06e1\u06e5\u06e0"

    goto :goto_0

    :sswitch_2
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf3c -> :sswitch_0
        0x1ab683 -> :sswitch_2
        0x1abde7 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e0\u06e0\u06e0"

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v2, p1

    move-object v1, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lf0/h1;

    const-string v6, "\u06e2\u06e4\u06e8"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v2

    check-cast v0, Lo1/h0;

    const-string v6, "\u06e6\u06e5\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v3, v4}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e0\u06e2\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e1\u06e0\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e8\u06e4"

    move-object v4, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v5}, Lo5/۟ۧۡۧۦ;->ۧۥۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e6\u06e1\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae0 -> :sswitch_0
        0x1aaea5 -> :sswitch_4
        0x1ab2e6 -> :sswitch_2
        0x1abae0 -> :sswitch_1
        0x1ac187 -> :sswitch_5
        0x1ac205 -> :sswitch_3
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v2, 0x1

    const/4 v6, 0x0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v3

    invoke-static {p0}, Lm4/۟ۧۤ۠;->ۦۤۨۢ(Ljava/lang/Object;)I

    move-result v1

    sget v0, Ln7/۟ۤ۠۟ۥ;->۟۠۠ۤۥ:I

    xor-int/lit16 v7, v0, -0x2e8

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
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eq v1, v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ne v1, v7, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lr6/۟ۡ۠۟ۡ;->ۣۤۤ۟(Ljava/lang/Object;)Lo1/u;

    move-result-object v4

    invoke-static {p0}, Lc1/ۣۢۧۨ;->ۣ۟ۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/h0;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move-object v2, v3

    move-object v1, p1

    move-object v5, v0

    :goto_4
    move-object v0, v1

    check-cast v0, Lo1/k;

    invoke-static {v0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->۟ۥۥۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v9

    move v1, v6

    :goto_5
    const v0, 0xc2fa

    :goto_6
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :sswitch_a
    if-ge v1, v9, :cond_5

    const v0, 0xc5e2

    goto :goto_6

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf0/h1;->ۣ۟۟ۨۦ()[S

    move-result-object v1

    sget v2, Ls3/۟ۧ۟ۡۢ;->۟۠ۨۨ۠:I

    xor-int/lit16 v2, v2, -0x337

    const/16 v3, 0xbed

    invoke-static {v1, v6, v2, v3}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۡۤۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_d
    invoke-static {p0}, Lc1/ۣۢۧۨ;->ۣ۟ۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/h0;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v1, 0xbefb

    :goto_7
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_e
    move-object v1, p1

    move-object v2, v0

    :goto_8
    move-object v0, v1

    check-cast v0, Lo1/u;

    invoke-static {v0}, Lh3/۟ۡۥ۠۠;->۟ۤۤۥۦ(Ljava/lang/Object;)J

    invoke-static {p0}, Lf0/ۣۦۦ۠;->۟ۢ۟ۥۢ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->ۣ۟ۢۨ۠(Ljava/lang/Object;)V

    move-object v5, v2

    :goto_9
    iput-object v5, p0, Lf0/h1;->d:Ljava/lang/Object;

    iput-object v0, p0, Lf0/h1;->b:Lo1/u;

    iput v7, p0, Lf0/h1;->c:I

    invoke-static {}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟۟۠۠ۡ()Lo1/l;

    move-result-object v1

    invoke-static {v5, v1, p0}, Ll9/۟ۦۥۣۢ;->ۤۦۣۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v2, 0xc27e

    :goto_a
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_a

    :cond_3
    :sswitch_f
    const v2, 0xc2bc

    goto :goto_a

    :sswitch_10
    const v1, 0xbf1a

    goto :goto_7

    :sswitch_11
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {p0}, Lc1/ۣۢۧۨ;->ۣ۟ۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/h0;

    iput-object v0, p0, Lf0/h1;->d:Ljava/lang/Object;

    iput v2, p0, Lf0/h1;->c:I

    invoke-static {v0, p0, v7}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۥۣ(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    const v2, 0xc202

    :goto_b
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_b

    :sswitch_12
    if-ne v1, v3, :cond_4

    const v2, 0xc25f

    goto :goto_b

    :cond_4
    :sswitch_13
    const v2, 0xc240

    goto :goto_b

    :sswitch_14
    if-ne v1, v3, :cond_3

    const v2, 0xc2db

    goto :goto_a

    :sswitch_15
    move-object v2, v3

    move-object v4, v0

    goto/16 :goto_4

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto/16 :goto_6

    :sswitch_17
    invoke-static {v8, v1}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/u;

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->۟۠ۢۡۦ(Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static {v4}, Lo5/۟ۧۡۧۦ;->۟۠ۢۡۦ(Ljava/lang/Object;)J

    move-result-wide v12

    invoke-static {v10, v11, v12, v13}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۦۢ۟ۤ(JJ)Z

    move-result v10

    const v3, 0xc601

    :goto_c
    const v11, 0xc612

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_8

    goto :goto_c

    :sswitch_18
    if-eqz v10, :cond_6

    const v3, 0xc65e

    goto :goto_c

    :cond_6
    :sswitch_19
    const v3, 0xc63f

    goto :goto_c

    :sswitch_1a
    invoke-static {v0}, Li4/ۨ۟ۨ;->۟ۢ۟۠ۦ(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc67d

    :goto_d
    const v10, 0xc68e

    xor-int/2addr v0, v10

    sparse-switch v0, :sswitch_data_9

    goto :goto_d

    :cond_7
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_d

    :sswitch_1c
    if-eqz v3, :cond_7

    const v0, 0xc965

    goto :goto_d

    :sswitch_1d
    const v0, 0xc984

    :goto_e
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_e

    :sswitch_1e
    const v0, 0xc9a3

    goto :goto_e

    :sswitch_1f
    move-object v0, v4

    move-object v3, v2

    goto/16 :goto_9

    :sswitch_20
    sget v0, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->۟ۢ۟ۡۨ:I

    xor-int/lit16 v0, v0, 0x121

    add-int/2addr v0, v1

    const v1, 0xca00

    :goto_f
    const v3, 0xca11

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_f

    :pswitch_1
    move v1, v0

    goto/16 :goto_5

    :pswitch_2
    const v1, 0xca1f

    goto :goto_f

    :sswitch_21
    invoke-static {p0}, Lf0/ۣۦۦ۠;->۟ۢ۟ۥۢ(Ljava/lang/Object;)Lf0/k1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->۠ۥۣ۟(Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v3

    :sswitch_22
    return-object v3

    :sswitch_23
    move-object v2, v0

    goto/16 :goto_8

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_d
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
        0x1f1 -> :sswitch_a
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_21
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_15
        0x54 -> :sswitch_22
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_22
        0x53 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_20
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
