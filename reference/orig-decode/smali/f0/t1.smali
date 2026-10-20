.class public final Lf0/t1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:Lm0/g1;

.field public b:I

.field public final c:Lm0/g1;

.field public final d:Z

.field public final e:Lx/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/t1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x57bs
        0x579s
        0x574s
        0x574s
        0x538s
        0x56cs
        0x577s
        0x538s
        0x53fs
        0x56as
        0x57ds
        0x56bs
        0x56ds
        0x575s
        0x57ds
        0x53fs
        0x538s
        0x57as
        0x57ds
        0x57es
        0x577s
        0x56as
        0x57ds
        0x538s
        0x53fs
        0x571s
        0x576s
        0x56es
        0x577s
        0x573s
        0x57ds
        0x53fs
        0x538s
        0x56fs
        0x571s
        0x56cs
        0x570s
        0x538s
        0x57bs
        0x577s
        0x56as
        0x577s
        0x56ds
        0x56cs
        0x571s
        0x576s
        0x57ds
    .end array-data
.end method

.method public constructor <init>(Lm0/g1;ZLx/m;Lu8/e;)V
    .locals 3

    iput-object p1, p0, Lf0/t1;->c:Lm0/g1;

    iput-boolean p2, p0, Lf0/t1;->d:Z

    iput-object p3, p0, Lf0/t1;->e:Lx/m;

    sget v0, Lt2/۟ۧۢ۟ۢ;->ۨ۟ۧۡ:I

    xor-int/lit16 v0, v0, 0x324

    invoke-direct {p0, v0, p4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۡۨ()I

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
    const-string v0, "qXU76oxqDQ181Kqm05gjudf"

    invoke-static {v0}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->۟ۦ۟۠ۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۤ۠ۨۧ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۢۡ۠ۧ()I

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
    sget-object v0, Lf0/t1;->short:[S

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
    .locals 5

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-string v4, "\u06e5\u06e0\u06e5"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lq0/۟ۧۤۧ;->۟۠ۤۨۤ(Ljava/lang/Object;)Z

    move-result v1

    const-string v4, "\u06e2\u06e0\u06e4"

    move v3, v1

    goto :goto_0

    :sswitch_0
    new-instance p0, Lf0/t1;

    invoke-direct {p0, v0, v3, v2, p2}, Lf0/t1;-><init>(Lm0/g1;ZLx/m;Lu8/e;)V

    const-string v1, "\u06e8\u06e5\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lw2/۟ۧۥۦۨ;->ۣ۠ۦۦ(Ljava/lang/Object;)Lx/m;

    move-result-object v1

    const-string v4, "\u06e5\u06e5\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Li4/ۨ۟ۨ;->ۧ۠ۦۥ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    const-string v1, "\u06e8\u06e8\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab266 -> :sswitch_1
        0x1abe46 -> :sswitch_2
        0x1ac986 -> :sswitch_3
        0x1ac9df -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06df\u06e8\u06e2"

    move-object v3, v0

    move-object v4, v0

    move-object v2, v0

    move-object v5, v0

    move-object v1, p1

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-object v1

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06df\u06e6\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e0\u06e3\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v2

    check-cast v0, Lf0/t1;

    const-string v6, "\u06e7\u06e0\u06e4"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v5}, Lcom/google/firebase/ktx/ۡ۟ۢ;->۠ۡۥ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e4\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e8\u06e7\u06e0"

    move-object v4, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v3, v4}, Lt7/۟ۡ۠ۨ۟;->۟ۤ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e8\u06e3\u06e7"

    move-object v6, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7dc -> :sswitch_3
        0x1aa819 -> :sswitch_1
        0x1aab42 -> :sswitch_4
        0x1ac52b -> :sswitch_0
        0x1ac94c -> :sswitch_2
        0x1ac9c1 -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v3

    invoke-static {p0}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۣ۟۠۠ۡ(Ljava/lang/Object;)I

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
    if-ne v1, v6, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lu/ۣۤۧ۠;->ۣ۟ۧۡ۠(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf0/t1;->ۤ۠ۨۧ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lw0/۟ۤۧۥۥ;->ۥۢۦۣ:I

    xor-int/lit16 v3, v3, 0x11b

    const/16 v4, 0x518

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟۟ۡۢۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {p0}, Li4/ۨ۟ۨ;->ۧ۠ۦۥ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/o;

    const v1, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v0, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {p0}, Lq0/۟ۧۤۧ;->۟۠ۤۨۤ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xbefb

    :goto_4
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v4, :cond_3

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_e
    new-instance v1, Lx/p;

    invoke-direct {v1, v0}, Lx/p;-><init>(Lx/o;)V

    const v0, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v0, 0xc221

    goto :goto_5

    :sswitch_10
    move-object v0, v1

    :goto_6
    invoke-static {p0}, Lw2/۟ۧۥۦۨ;->ۣ۠ۦۦ(Ljava/lang/Object;)Lx/m;

    move-result-object v4

    const v1, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_11
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_12
    new-instance v1, Lx/n;

    invoke-direct {v1, v0}, Lx/n;-><init>(Lx/o;)V

    move-object v0, v1

    goto :goto_6

    :sswitch_13
    if-eqz v4, :cond_4

    const v1, 0xc2db

    goto :goto_7

    :sswitch_14
    iput-object v2, p0, Lf0/t1;->a:Lm0/g1;

    iput v6, p0, Lf0/t1;->b:I

    invoke-static {v4, v0, p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۨۧۥۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-ne v1, v3, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_17
    move-object v0, v3

    :goto_9
    return-object v0

    :sswitch_18
    move-object v0, v2

    :sswitch_19
    move-object v2, v0

    :sswitch_1a
    const/4 v0, 0x0

    invoke-static {v2, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1b
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    goto :goto_9

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
        0xb97b -> :sswitch_19
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_1b
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_1a
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_17
    .end sparse-switch
.end method
