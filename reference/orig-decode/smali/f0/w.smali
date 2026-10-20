.class public final Lf0/w;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lc0/f;

.field public final c:Lg2/a0;

.field public final d:Lf0/c2;

.field public final e:Lf0/d2;

.field public final f:Lg2/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/w;->short:[S

    return-void

    :array_0
    .array-data 2
        0x903s
        0x901s
        0x90cs
        0x90cs
        0x940s
        0x914s
        0x90fs
        0x940s
        0x947s
        0x912s
        0x905s
        0x913s
        0x915s
        0x90ds
        0x905s
        0x947s
        0x940s
        0x902s
        0x905s
        0x906s
        0x90fs
        0x912s
        0x905s
        0x940s
        0x947s
        0x909s
        0x90es
        0x916s
        0x90fs
        0x90bs
        0x905s
        0x947s
        0x940s
        0x917s
        0x909s
        0x914s
        0x908s
        0x940s
        0x903s
        0x90fs
        0x912s
        0x90fs
        0x915s
        0x914s
        0x909s
        0x90es
        0x905s
    .end array-data
.end method

.method public constructor <init>(Lc0/f;Lg2/a0;Lf0/c2;Lf0/d2;Lg2/s;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf0/w;->b:Lc0/f;

    iput-object p2, p0, Lf0/w;->c:Lg2/a0;

    iput-object p3, p0, Lf0/w;->d:Lf0/c2;

    iput-object p4, p0, Lf0/w;->e:Lf0/d2;

    iput-object p5, p0, Lf0/w;->f:Lg2/s;

    sget v0, Lr2/ۧۧۢۢ;->ۥۦۦ:I

    xor-int/lit16 v0, v0, 0x2da

    invoke-direct {p0, v0, p6}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

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
    const-string v0, "Zi0RuSBUhS9bt5x30JbAeljD9vw"

    invoke-static {v0}, Lcom/google/firebase/ktx/ۨۢۤۧ;->۟۠ۦۦۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۣۡۨ۟()[S
    .locals 2

    invoke-static {}, Lr5/۟ۤۨۥۡ;->ۥ۠ۥ۟()I

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
    sget-object v0, Lf0/w;->short:[S

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
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06df\u06e2\u06e1"

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move-object v2, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Lr1/۟ۤۤۡ۠;->ۢۡۦ۟(Ljava/lang/Object;)Lf0/d2;

    move-result-object v4

    const-string v0, "\u06e8\u06e3\u06e7"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Ls3/۟ۧ۟ۡۢ;->ۣ۟ۧۨۥ(Ljava/lang/Object;)Lg2/a0;

    move-result-object v2

    const-string v0, "\u06e7\u06e6\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lc0/ۦ۠۟ۥ;->ۤۤۤۨ(Ljava/lang/Object;)Lc0/f;

    move-result-object v1

    const-string v0, "\u06e2\u06e8\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Lf0/w;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lf0/w;-><init>(Lc0/f;Lg2/a0;Lf0/c2;Lf0/d2;Lg2/s;Lu8/e;)V

    const-string v6, "\u06e3\u06df\u06e3"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lx5/ۡۦۦۥ;->ۣ۟ۡۧۨ(Ljava/lang/Object;)Lg2/s;

    move-result-object v5

    const-string v0, "\u06e1\u06e5\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۨۢۥۢ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v3

    const-string v0, "\u06df\u06e7\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aa75e -> :sswitch_1
        0x1aaf3f -> :sswitch_2
        0x1ab359 -> :sswitch_0
        0x1ab607 -> :sswitch_5
        0x1ac5e2 -> :sswitch_4
        0x1ac94c -> :sswitch_3
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e0\u06e6\u06e0"

    move-object v1, p1

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e5\u06e5\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e0\u06e7"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v5}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->۟۟۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e3\u06e1\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v2

    check-cast v0, Lf0/w;

    const-string v6, "\u06e4\u06e5\u06e7"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v4, v3}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->۠ۨۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e5\u06df\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e6\u06e3\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_3
        0x1ab642 -> :sswitch_5
        0x1aba86 -> :sswitch_4
        0x1abd8c -> :sswitch_2
        0x1abe48 -> :sswitch_0
        0x1ac1c9 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const/4 v5, 0x1

    const/4 v10, 0x0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->ۣ۠۠۠(Ljava/lang/Object;)I

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
    if-ne v3, v5, :cond_1

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

    invoke-static {}, Lf0/w;->ۣۡۨ۟()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۤۢۤۥ:I

    xor-int/lit16 v3, v3, -0x88

    const/16 v4, 0x960

    invoke-static {v1, v2, v3, v4}, Le2/ۨۥۦۡ;->ۣ۟۟۠ۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۨۢۥۢ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v0

    invoke-static {v0}, Li6/ۡۤۦ;->۟ۢ۠ۡ۠(Ljava/lang/Object;)Lf0/j1;

    move-result-object v3

    invoke-static {p0}, Lr1/۟ۤۤۡ۠;->ۢۡۦ۟(Ljava/lang/Object;)Lf0/d2;

    move-result-object v0

    invoke-static {v0}, Ln/ۣۣۢۢ;->۟ۧ۟ۨۥ(Ljava/lang/Object;)La2/a0;

    move-result-object v4

    iput v5, p0, Lf0/w;->a:I

    invoke-static {p0}, Ls3/۟ۧ۟ۡۢ;->ۣ۟ۧۨۥ(Ljava/lang/Object;)Lg2/a0;

    move-result-object v0

    invoke-static {v0}, Lh6/ۧۧۤ۟;->ۣ۟ۡ۠۠(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lx2/۟ۢۥ;->۠ۧۤ۟(J)I

    move-result v0

    invoke-static {p0}, Lx5/ۡۦۦۥ;->ۣ۟ۡۧۨ(Ljava/lang/Object;)Lg2/s;

    move-result-object v5

    invoke-static {v5, v0}, Ld4/۟۠۠۟ۢ;->ۤۧۥ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v4}, Lu7/ۣ۟ۡ۟;->۠ۡۤ۟(Ljava/lang/Object;)La2/z;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۥۣۡۢ(Ljava/lang/Object;)La2/e;

    move-result-object v0

    invoke-static {v0}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v6

    const v0, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ge v5, v6, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v4, v5}, Lb7/۟۟ۤۤۤ;->ۣ۟ۢۦ۟(Ljava/lang/Object;I)Ld1/d;

    move-result-object v0

    const v3, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    invoke-static {p0}, Lc0/ۦ۠۟ۥ;->ۤۤۤۨ(Ljava/lang/Object;)Lc0/f;

    move-result-object v3

    invoke-static {v3, v0, p0}, Lh/۟ۡۥۡۧ;->۟ۥۤۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v3, 0xc2fa

    :goto_6
    const v4, 0xc30b

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    if-ne v0, v2, :cond_4

    const v3, 0xc5e2

    goto :goto_6

    :sswitch_e
    const v3, 0xbf1a

    goto :goto_4

    :sswitch_f
    const v0, 0xc202

    :goto_7
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_10
    if-eqz v5, :cond_3

    const v0, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_11
    const v0, 0xc240

    goto :goto_7

    :sswitch_12
    add-int/lit8 v0, v5, 0x16

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x16

    invoke-static {v4, v0}, Lb7/۟۟ۤۤۤ;->ۣ۟ۢۦ۟(Ljava/lang/Object;I)Ld1/d;

    move-result-object v0

    const v3, 0xc27e

    :goto_8
    const v4, 0xc28f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    const v3, 0xc29d

    goto :goto_8

    :sswitch_14
    invoke-static {v3}, Ld9/ۡۥۣۡ;->ۧ۠ۦۦ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    invoke-static {v3}, Lg8/ۣۣۣ۟;->۟ۤۡۨ۟(Ljava/lang/Object;)Lm2/b;

    move-result-object v4

    invoke-static {v3}, Lo2/۟ۤۨۡۥ;->۟ۡۧۢ۟(Ljava/lang/Object;)Lf2/d;

    move-result-object v3

    invoke-static {v0, v4, v3}, Lw4/۟ۤ۠۟ۨ;->ۣۣۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v4

    new-instance v0, Ld1/d;

    const/high16 v3, 0x3f800000    # 1.0f

    const-wide v6, 0xffffffffL

    const-wide/16 v8, -0x1

    xor-long/2addr v6, v8

    xor-long/2addr v6, v4

    and-long/2addr v4, v6

    long-to-int v4, v4

    int-to-float v4, v4

    invoke-direct {v0, v10, v10, v3, v4}, Ld1/d;-><init>(FFFF)V

    goto :goto_5

    :cond_4
    :sswitch_15
    const v3, 0xc5c3

    goto :goto_6

    :sswitch_16
    const v3, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v3, 0xc620

    goto :goto_9

    :sswitch_18
    move-object v0, v1

    :sswitch_19
    const v3, 0xc67d

    :goto_a
    const v4, 0xc68e

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_9

    goto :goto_a

    :cond_5
    :sswitch_1a
    const v3, 0xc6bb

    goto :goto_a

    :sswitch_1b
    if-ne v0, v2, :cond_5

    const v3, 0xc965

    goto :goto_a

    :sswitch_1c
    move-object v1, v2

    :sswitch_1d
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
        0xb97b -> :sswitch_1d
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
        0x1f1 -> :sswitch_d
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_c
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch
.end method
