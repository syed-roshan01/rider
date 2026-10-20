.class public final Lf0/r1;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lf0/c2;

.field public final b:Lh0/v0;

.field public final c:Lg2/a0;

.field public final d:Z

.field public final e:Z

.field public final f:Lg2/s;

.field public final n:Lf0/e2;

.field public final o:Lc9/c;

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/r1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x4c4s
        0x4c6s
        0x4dbs
        0x4d7s
        0x4d1s
        0x4c7s
        0x4c7s
        0x51cs
        0x51es
        0x503s
        0x50fs
        0x509s
        0x51fs
        0x51fs
        0x541s
        0x536s
        0x501s
        0x503s
        0x507s
        0x53ds
        0x514s
        0x503s
        0x544s
        0x520s
        0x50ds
        0x502s
        0x508s
        0x51es
        0x503s
        0x505s
        0x508s
        0x543s
        0x51as
        0x505s
        0x509s
        0x51bs
        0x543s
        0x527s
        0x509s
        0x515s
        0x529s
        0x51as
        0x509s
        0x502s
        0x518s
        0x557s
        0x545s
        0x536s
    .end array-data
.end method

.method public constructor <init>(Lf0/c2;Lh0/v0;Lg2/a0;ZZLg2/s;Lf0/e2;Lf0/v;I)V
    .locals 2

    iput-object p1, p0, Lf0/r1;->a:Lf0/c2;

    iput-object p2, p0, Lf0/r1;->b:Lh0/v0;

    iput-object p3, p0, Lf0/r1;->c:Lg2/a0;

    iput-boolean p4, p0, Lf0/r1;->d:Z

    iput-boolean p5, p0, Lf0/r1;->e:Z

    iput-object p6, p0, Lf0/r1;->f:Lg2/s;

    iput-object p7, p0, Lf0/r1;->n:Lf0/e2;

    iput-object p8, p0, Lf0/r1;->o:Lc9/c;

    iput p9, p0, Lf0/r1;->p:I

    sget v0, Lj3/۟ۧۧۦۤ;->ۣۣ۠۠:I

    xor-int/lit16 v0, v0, 0x170

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۣۨ۠ۥ()I

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
    const-string v0, "6umwnueO3fMmY9rM"

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۡۧ;->۠ۡۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۟ۢۡۨۨ()[S
    .locals 2

    invoke-static {}, Lr2/۠ۦۡۤ;->ۡۨۨۢ()I

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
    sget-object v0, Lf0/r1;->short:[S

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
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    check-cast p1, Ly0/o;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-static/range {p3 .. p3}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    check-cast p2, Lm0/q;

    const v1, 0x7aa0474c

    sget v2, Lb4/ۦۣۧ۟;->ۣۣ۟ۦۦ:I

    xor-int/2addr v1, v2

    move-object/from16 v0, p2

    invoke-static {v0, v1}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    const v1, -0x1d58f56a

    sget v2, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->۟ۢۢ۟ۥ:I

    xor-int/2addr v2, v1

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static/range {p2 .. p2}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۠ۨۥ()Lk0/y0;

    move-result-object v3

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne v7, v3, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v7, Lh0/a1;

    invoke-direct {v7}, Lh0/a1;-><init>()V

    move-object/from16 v0, p2

    invoke-static {v0, v7}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    const/4 v1, 0x0

    move-object/from16 v0, p2

    invoke-static {v0, v1}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    check-cast v7, Lh0/a1;

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static/range {p2 .. p2}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ne v10, v3, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    new-instance v10, Lf0/k0;

    invoke-direct {v10}, Lf0/k0;-><init>()V

    move-object/from16 v0, p2

    invoke-static {v0, v10}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_7
    const/4 v1, 0x0

    move-object/from16 v0, p2

    invoke-static {v0, v1}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    check-cast v10, Lf0/k0;

    new-instance v13, Lf0/q1;

    const/4 v14, 0x1

    new-instance v1, Lf0/p1;

    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->۟ۡ۟ۦۧ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v2

    invoke-static {p0}, Lx5/ۡۦۦۥ;->۟۠۟ۨۢ(Ljava/lang/Object;)Lh0/v0;

    move-result-object v3

    invoke-static {p0}, Lb1/۟ۥۥ۟ۢ;->ۡۦۧۢ(Ljava/lang/Object;)Lg2/a0;

    move-result-object v4

    invoke-static {p0}, Lf0/ۣۤ۠۟;->ۤۨ۠ۦ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۦۤ۠ۡ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {p0}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟ۤۤۧ(Ljava/lang/Object;)Lg2/s;

    move-result-object v8

    invoke-static {p0}, Lh5/ۢ۠۠۟;->۟ۡۢۢۡ(Ljava/lang/Object;)Lf0/e2;

    move-result-object v9

    invoke-static {p0}, Lz2/ۢۨۨۦ;->۟ۨۤۧ(Ljava/lang/Object;)Lc9/c;

    move-result-object v11

    invoke-static {p0}, Lz3/۟ۢۢ۟ۢ;->ۣ۟ۧۦۣ(Ljava/lang/Object;)I

    move-result v12

    invoke-direct/range {v1 .. v12}, Lf0/p1;-><init>(Lf0/c2;Lh0/v0;Lg2/a0;ZZLh0/a1;Lg2/s;Lf0/e2;Lf0/k0;Lc9/c;I)V

    const-class v5, Lf0/p1;

    invoke-static {}, Lf0/r1;->۟ۢۡۨۨ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lcom/google/firebase/ktx/ۡ۟ۢ;->ۦۤۡۨ:I

    xor-int/lit16 v4, v4, 0x238

    const/16 v6, 0x4b4

    invoke-static {v2, v3, v4, v6}, Ld/۟ۤ۠ۡۨ;->ۦ۠ۥۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lf0/r1;->۟ۢۡۨۨ()[S

    move-result-object v2

    const/4 v3, 0x7

    sget v4, Lca/ۨۤۢۥ;->ۥۥۧۢ:I

    xor-int/lit16 v4, v4, 0x2d4

    const/16 v7, 0x56c

    invoke-static {v2, v3, v4, v7}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۢۦۤۧ([SIII)Ljava/lang/String;

    move-result-object v7

    move-object v2, v13

    move v3, v14

    move-object v4, v1

    invoke-direct/range {v2 .. v7}, Lf0/q1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v13}, Lo2/۟ۤۨۡۥ;->ۧۢۢۨ(Ljava/lang/Object;)Ly0/o;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method
