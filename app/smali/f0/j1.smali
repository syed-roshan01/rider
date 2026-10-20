.class public final Lf0/j1;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:La2/e;

.field public final b:La2/c0;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:Lm2/b;

.field public final h:Lf2/d;

.field public final i:Ljava/util/List;

.field public j:La2/k;

.field public k:Lm2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x34

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/j1;->short:[S

    return-void

    :array_0
    .array-data 2
        0xc4es
        0xc4as
        0xc4ds
        0xc6fs
        0xc4as
        0xc4ds
        0xc46s
        0xc50s
        0xc03s
        0xc44s
        0xc51s
        0xc46s
        0xc42s
        0xc57s
        0xc46s
        0xc51s
        0xc03s
        0xc57s
        0xc4bs
        0xc42s
        0xc4ds
        0xc03s
        0xc4es
        0xc42s
        0xc5bs
        0xc6fs
        0xc4as
        0xc4ds
        0xc46s
        0xc50s
        0x256s
        0x257s
        0x218s
        0x255s
        0x251s
        0x256s
        0x274s
        0x251s
        0x256s
        0x25ds
        0x24bs
        0x1bfs
        0x1bes
        0x1f1s
        0x1bcs
        0x1b0s
        0x1a9s
        0x19ds
        0x1b8s
        0x1bfs
        0x1b4s
        0x1a2s
    .end array-data
.end method

.method public constructor <init>(La2/e;La2/c0;IIZILm2/b;Lf2/d;Ljava/util/List;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/j1;->a:La2/e;

    iput-object p2, p0, Lf0/j1;->b:La2/c0;

    iput p3, p0, Lf0/j1;->c:I

    iput p4, p0, Lf0/j1;->d:I

    iput-boolean p5, p0, Lf0/j1;->e:Z

    iput p6, p0, Lf0/j1;->f:I

    iput-object p7, p0, Lf0/j1;->g:Lm2/b;

    iput-object p8, p0, Lf0/j1;->h:Lf2/d;

    iput-object p9, p0, Lf0/j1;->i:Ljava/util/List;

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
    if-lez p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-lez p4, :cond_1

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
    if-gt p4, p3, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lw2/ۤ۠ۨۤ;->ۣ۟۠ۡۢ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ltz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const-string v0, "WhgVjvB4cZU"

    invoke-static {v0}, Lw2/ۧۦۧ;->ۢۨۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_c
    return-void

    :sswitch_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {}, Lf0/j1;->۟ۦۣۢۧ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Ly9/ۨ۠;->ۡۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3a1

    const/16 v4, 0xc23

    invoke-static {v1, v2, v3, v4}, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۦۧۡ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {}, Lf0/j1;->۟ۦۣۢۧ()[S

    move-result-object v1

    const/16 v2, 0x1e

    sget v3, Ld5/ۣۦۢۢ;->ۣۣ۟ۢۢ:I

    xor-int/lit16 v3, v3, -0x22c

    const/16 v4, 0x238

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۤۧ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {}, Lf0/j1;->۟ۦۣۢۧ()[S

    move-result-object v1

    const/16 v2, 0x29

    sget v3, Lh4/ۣ۟ۢۢۡ;->ۣ۟ۡۡۨ:I

    xor-int/lit8 v3, v3, 0x19

    const/16 v4, 0x1d1

    invoke-static {v1, v2, v3, v4}, Lp7/ۣۣۦۤ;->ۣۨۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_e
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method public static ۟ۦۣۢۧ()[S
    .locals 2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->ۣۤ۠()I

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
    sget-object v0, Lf0/j1;->short:[S

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
.method public final a(Lm2/l;)V
    .locals 6

    invoke-static {p0}, Lm0/۟ۤۡۤۤ;->۟ۢۡۡ۠(Ljava/lang/Object;)La2/k;

    move-result-object v0

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
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lz2/ۢۨۨۦ;->ۢۨۢۥ(Ljava/lang/Object;)Lm2/l;

    move-result-object v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne p1, v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۣ۠ۧۢ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    iput-object p1, p0, Lf0/j1;->k:Lm2/l;

    invoke-static {p0}, Ld2/۟ۦۡ۟ۦ;->ۨۤۧۤ(Ljava/lang/Object;)La2/e;

    move-result-object v1

    invoke-static {p0}, Ld9/ۡۥۣۡ;->ۧ۠ۦۦ(Ljava/lang/Object;)La2/c0;

    move-result-object v0

    invoke-static {v0, p1}, Lf0/ۣۦۦ۠;->۟۠۠۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)La2/c0;

    move-result-object v2

    invoke-static {p0}, Lg8/ۣۣۣ۟;->۟ۤۡۨ۟(Ljava/lang/Object;)Lm2/b;

    move-result-object v4

    invoke-static {p0}, Lo2/۟ۤۨۡۥ;->۟ۡۧۢ۟(Ljava/lang/Object;)Lf2/d;

    move-result-object v5

    new-instance v0, La2/k;

    invoke-static {p0}, Lq9/۟ۧۦۤۨ;->۟ۦۣ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct/range {v0 .. v5}, La2/k;-><init>(La2/e;La2/c0;Ljava/util/List;Lm2/b;Lf2/d;)V

    :sswitch_9
    iput-object v0, p0, Lf0/j1;->j:La2/k;

    return-void

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
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method
