.class public final Lf0/s1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final c:Lm0/g1;

.field public final d:J

.field public final e:Lx/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/s1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x80as
        0x808s
        0x805s
        0x805s
        0x849s
        0x81ds
        0x806s
        0x849s
        0x84es
        0x81bs
        0x80cs
        0x81as
        0x81cs
        0x804s
        0x80cs
        0x84es
        0x849s
        0x80bs
        0x80cs
        0x80fs
        0x806s
        0x81bs
        0x80cs
        0x849s
        0x84es
        0x800s
        0x807s
        0x81fs
        0x806s
        0x802s
        0x80cs
        0x84es
        0x849s
        0x81es
        0x800s
        0x81ds
        0x801s
        0x849s
        0x80as
        0x806s
        0x81bs
        0x806s
        0x81cs
        0x81ds
        0x800s
        0x807s
        0x80cs
    .end array-data
.end method

.method public constructor <init>(Lm0/g1;JLx/m;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf0/s1;->c:Lm0/g1;

    iput-wide p2, p0, Lf0/s1;->d:J

    iput-object p4, p0, Lf0/s1;->e:Lx/m;

    sget v0, Lj3/۟ۧۧۦۤ;->ۣۣ۠۠:I

    xor-int/lit16 v0, v0, 0x171

    invoke-direct {p0, v0, p5}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lx4/ۣۡۢ۠;->ۡ۟۠ۥ()I

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
    const-string v0, "bzupPtqF5LlV4RvNgPeVaCMfPx"

    invoke-static {v0}, La8/ۡۦۨۡ;->ۦۨۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۠ۢۢۨ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۢ۠ۢۤ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf0/s1;->short:[S

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
    .locals 6

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const-string v5, "\u06e5\u06e1\u06e6"

    move-object v4, v0

    move-object v1, v0

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۥۦۧۡ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v1

    const-string v0, "\u06e4\u06e3\u06e2"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lf0/s1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lf0/s1;-><init>(Lm0/g1;JLx/m;Lu8/e;)V

    const-string v5, "\u06e1\u06e0\u06e0"

    move-object p0, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lf1/ۥۦ۟ۥ;->۟۠۠ۤۤ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06e2\u06e0\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۣ۠ۥۧ(Ljava/lang/Object;)Lx/m;

    move-result-object v4

    const-string v0, "\u06e2\u06df\u06df"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaea1 -> :sswitch_3
        0x1ab242 -> :sswitch_0
        0x1ab266 -> :sswitch_2
        0x1aba43 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e5\u06e4\u06e8"

    move-object v3, v0

    move-object v1, v0

    move-object v2, p1

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lf0/s1;

    const-string v6, "\u06e7\u06e1\u06e6"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e0\u06e3\u06e1"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e5\u06e8\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e4\u06e7\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v3, v4}, Ld9/ۧۧۨۥ;->ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e1\u06e8\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v5}, Lr/۠ۡ۠;->۟ۥۦ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06df\u06e3\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa782 -> :sswitch_5
        0x1aab3e -> :sswitch_1
        0x1abac4 -> :sswitch_4
        0x1abe29 -> :sswitch_0
        0x1abea0 -> :sswitch_3
        0x1ac54c -> :sswitch_2
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v8, 0x2

    const/4 v6, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    invoke-static {p0}, Lw4/۟ۤ۠۟ۨ;->ۣ۠ۦۧ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۣ۠ۥۧ(Ljava/lang/Object;)Lx/m;

    move-result-object v4

    invoke-static {p0}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۥۦۧۡ(Ljava/lang/Object;)Lm0/g1;

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
    if-eq v3, v6, :cond_1

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
    if-ne v3, v8, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۤۤۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/o;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {v1, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :goto_4
    return-object v0

    :sswitch_a
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf0/s1;->۠ۢۢۨ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->۟ۤۦۡۤ:I

    xor-int/lit16 v3, v3, -0x21b

    const/16 v4, 0x869

    invoke-static {v1, v2, v3, v4}, Lo4/۟۟ۡۧۤ;->۟۟ۡۦۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_c
    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۤۤۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/g1;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v3, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_d
    const/4 v3, 0x0

    invoke-static {v0, v3}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_e
    new-instance v0, Lx/o;

    invoke-static {p0}, Lf1/ۥۦ۟ۥ;->۟۠۠ۤۤ(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-direct {v0, v6, v7}, Lx/o;-><init>(J)V

    const v3, 0xc601

    :goto_7
    const v5, 0xc612

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    if-eqz v4, :cond_6

    const v3, 0xc65e

    goto :goto_7

    :sswitch_10
    const v3, 0xbf1a

    goto :goto_5

    :sswitch_11
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v1}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/o;

    const v3, 0xc202

    :goto_8
    const v5, 0xc213

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_6

    goto :goto_8

    :sswitch_12
    if-eqz v0, :cond_3

    const v3, 0xc25f

    goto :goto_8

    :cond_3
    :sswitch_13
    const v3, 0xc240

    goto :goto_8

    :sswitch_14
    new-instance v3, Lx/n;

    invoke-direct {v3, v0}, Lx/n;-><init>(Lx/o;)V

    const v0, 0xc27e

    :goto_9
    const v5, 0xc28f

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :cond_4
    :sswitch_15
    const v0, 0xc2bc

    goto :goto_9

    :sswitch_16
    if-eqz v4, :cond_4

    const v0, 0xc2db

    goto :goto_9

    :sswitch_17
    iput-object v1, p0, Lf0/s1;->a:Ljava/lang/Object;

    iput v6, p0, Lf0/s1;->b:I

    invoke-static {v4, v3, p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۨۧۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v0, 0xc2fa

    :goto_a
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-ne v3, v2, :cond_5

    const v0, 0xc5e2

    goto :goto_a

    :cond_5
    :sswitch_19
    const v0, 0xc5c3

    goto :goto_a

    :sswitch_1a
    move-object v0, v2

    goto/16 :goto_4

    :sswitch_1b
    move-object v0, v1

    goto :goto_6

    :cond_6
    :sswitch_1c
    const v3, 0xc63f

    goto :goto_7

    :sswitch_1d
    iput-object v0, p0, Lf0/s1;->a:Ljava/lang/Object;

    iput v8, p0, Lf0/s1;->b:I

    invoke-static {v4, v0, p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۨۧۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const v3, 0xc67d

    :goto_b
    const v5, 0xc68e

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_9

    goto :goto_b

    :cond_7
    :sswitch_1e
    const v3, 0xc6bb

    goto :goto_b

    :sswitch_1f
    if-ne v4, v2, :cond_7

    const v3, 0xc965

    goto :goto_b

    :sswitch_20
    move-object v0, v2

    goto/16 :goto_4

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
        0x1d7 -> :sswitch_c
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x13 -> :sswitch_f
        0x2d -> :sswitch_9
        0x32 -> :sswitch_1c
        0x4c -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1e
        0x35 -> :sswitch_9
        0xf3 -> :sswitch_1f
        0xfeb -> :sswitch_20
    .end sparse-switch
.end method
