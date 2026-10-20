.class public final Lk0/a3;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lu9/d;

.field public final b:Lm0/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk0/a3;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa99s
        0xa9bs
        0xa96s
        0xa96s
        0xadas
        0xa8es
        0xa95s
        0xadas
        0xadds
        0xa88s
        0xa9fs
        0xa89s
        0xa8fs
        0xa97s
        0xa9fs
        0xadds
        0xadas
        0xa98s
        0xa9fs
        0xa9cs
        0xa95s
        0xa88s
        0xa9fs
        0xadas
        0xadds
        0xa93s
        0xa94s
        0xa8cs
        0xa95s
        0xa91s
        0xa9fs
        0xadds
        0xadas
        0xa8ds
        0xa93s
        0xa8es
        0xa92s
        0xadas
        0xa99s
        0xa95s
        0xa88s
        0xa95s
        0xa8fs
        0xa8es
        0xa93s
        0xa94s
        0xa9fs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, La7/۠ۢۧ;->ۣۨۤ()Lu9/d;

    move-result-object v0

    iput-object v0, p0, Lk0/a3;->a:Lu9/d;

    const/4 v0, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟۟۟ۨ()Lm0/o3;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۡۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lk0/a3;->b:Lm0/n1;

    invoke-static {}, Lg2/ۢۥۥۡ;->ۣ۟ۤۢۡ()I

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
    const-string v0, "Y8R"

    invoke-static {v0}, Lz3/۟ۢۢ۟ۢ;->ۢۨۥۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static b(Lk0/a3;Ljava/lang/String;Lu8/e;)Ljava/lang/Object;
    .locals 5

    const/4 v1, 0x0

    const-string v3, "\u06e7\u06e4\u06e4"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    invoke-static {p0, v2, p2}, Lj3/۟ۧۧۦۤ;->۟ۥۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "\u06e5\u06e5\u06e1"

    goto :goto_0

    :sswitch_0
    new-instance v2, Lk0/y2;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, p1, v1, v3, v4}, Lk0/y2;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    const-string v3, "\u06e4\u06e8\u06e6"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    const-string v3, "\u06e8\u06e2"

    goto :goto_0

    :sswitch_2
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdcfa -> :sswitch_0
        0x1abe41 -> :sswitch_2
        0x1ac5a7 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۟ۢۧ۟۟()[S
    .locals 2

    invoke-static {}, Lz/ۨۤۥۨ;->ۡ۠ۨۡ()I

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
    sget-object v0, Lk0/a3;->short:[S

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
.method public final a(Lk0/y2;Lu8/e;)Ljava/lang/Object;
    .locals 9

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    instance-of v1, p2, Lk0/z2;

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
    move-object v0, p2

    check-cast v0, Lk0/z2;

    invoke-static {v0}, Lx8/ۢۨۥۨ;->ۣۦ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const v1, 0x7fffffff

    xor-int/2addr v1, v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    add-int/lit8 v1, v2, 0x6

    const/high16 v2, -0x80000000

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x6

    iput v1, v0, Lk0/z2;->f:I

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Lk0/z2;

    invoke-direct {v0, p0, p2}, Lk0/z2;-><init>(Lk0/a3;Lu8/e;)V

    :sswitch_8
    invoke-static {v0}, La/ۥۡۢۨ;->ۨۥۣۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {v0}, Lx8/ۢۨۥۨ;->ۣۦ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    const v2, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v3, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    const v2, 0xbefb

    :goto_4
    const v5, 0xbf0c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eq v3, v7, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    const v1, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-ne v3, v8, :cond_4

    const v1, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v1, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۢۥۣۢ(Ljava/lang/Object;)Lu9/a;

    move-result-object v2

    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟ۨۨۤ(Ljava/lang/Object;)Lk0/a3;

    move-result-object v3

    :try_start_0
    invoke-static {v4}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_12
    move-object v1, v4

    move-object v0, v2

    :goto_7
    :try_start_1
    invoke-static {v3}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۥۧۨۢ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->۠ۤۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    check-cast v0, Lu9/d;

    invoke-static {v0, v6}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣۨۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    :goto_8
    return-object v0

    :sswitch_13
    const v0, 0xc29d

    goto :goto_6

    :catchall_0
    move-exception v0

    const v1, 0xc2fa

    :goto_9
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    const v1, 0xc5a4

    goto :goto_9

    :sswitch_15
    move-object v1, v3

    :goto_a
    :try_start_2
    invoke-static {v1}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۥۧۨۢ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->۠ۤۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    move-object v0, v2

    :goto_b
    check-cast v0, Lu9/d;

    invoke-static {v0, v6}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣۨۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v1

    :sswitch_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk0/a3;->۟ۢۧ۟۟()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/firebase/dynamicloading/ۣ۟۠ۨۢ;->ۣ۟ۦۦۦ:I

    xor-int/lit16 v3, v3, 0x2ad

    const/16 v4, 0xafa

    invoke-static {v1, v2, v3, v4}, Lr6/۟ۡ۠۟ۡ;->۟۟ۦۨ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_17
    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۢۥۣۢ(Ljava/lang/Object;)Lu9/a;

    move-result-object v2

    invoke-static {v0}, Lea/ۦۦۨۨ;->ۡۡ۟۠(Ljava/lang/Object;)Lk0/y2;

    move-result-object p1

    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟ۨۨۤ(Ljava/lang/Object;)Lk0/a3;

    move-result-object v3

    invoke-static {v4}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v4, 0xc601

    :goto_c
    const v5, 0xc612

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_8

    goto :goto_c

    :sswitch_18
    const v4, 0xc620

    goto :goto_c

    :sswitch_19
    invoke-static {v4}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    iput-object p0, v0, Lk0/z2;->a:Lk0/a3;

    iput-object p1, v0, Lk0/z2;->b:Lk0/y2;

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->ۣۡۨ۠(Ljava/lang/Object;)Lu9/d;

    move-result-object v2

    iput-object v2, v0, Lk0/z2;->c:Lu9/a;

    iput v7, v0, Lk0/z2;->f:I

    invoke-static {v2, v6, v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const v3, 0xc67d

    :goto_d
    const v5, 0xc68e

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_9

    goto :goto_d

    :cond_5
    :sswitch_1a
    const v3, 0xc6bb

    goto :goto_d

    :sswitch_1b
    if-ne v4, v1, :cond_5

    const v3, 0xc965

    goto :goto_d

    :sswitch_1c
    move-object v0, v1

    goto/16 :goto_8

    :sswitch_1d
    move-object v3, p0

    :sswitch_1e
    :try_start_3
    iput-object v3, v0, Lk0/z2;->a:Lk0/a3;

    iput-object p1, v0, Lk0/z2;->b:Lk0/y2;

    iput-object v2, v0, Lk0/z2;->c:Lu9/a;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    const/4 v4, 0x2

    iput v4, v0, Lk0/z2;->f:I

    new-instance v4, Lm9/l;

    const/4 v5, 0x1

    invoke-static {v0}, Ls0/ۢۨۦ۟;->۟۟ۨۦۣ(Ljava/lang/Object;)Lu8/e;

    move-result-object v0

    invoke-direct {v4, v5, v0}, Lm9/l;-><init>(ILu8/e;)V

    invoke-static {v4}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۨۢ۟ۢ(Ljava/lang/Object;)V

    new-instance v0, Lk0/x2;

    invoke-direct {v0, p1, v4}, Lk0/x2;-><init>(Lk0/y2;Lm9/l;)V

    invoke-static {v3}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۥۧۨۢ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v5

    invoke-static {v5, v0}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->۠ۤۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/google/firebase/installations/۠ۤۢ۟;->ۣۡۡۢ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-result-object v4

    const v0, 0xc984

    :goto_e
    const v5, 0xc995

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_a

    goto :goto_e

    :sswitch_1f
    if-ne v4, v1, :cond_6

    const v0, 0xc9e1

    goto :goto_e

    :cond_6
    :sswitch_20
    const v0, 0xc9c2

    goto :goto_e

    :sswitch_21
    move-object v0, v1

    goto/16 :goto_8

    :sswitch_22
    move-object v1, v4

    move-object v0, v2

    goto/16 :goto_7

    :catchall_2
    move-exception v0

    move-object v1, v3

    goto/16 :goto_a

    :catchall_3
    move-exception v1

    goto/16 :goto_b

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
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
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_19
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_17
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_22
        0x74 -> :sswitch_21
    .end sparse-switch
.end method
