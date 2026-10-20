.class public final Lk0/c0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lt/d;

.field public final c:F

.field public final d:Z

.field public final e:Lk0/d0;

.field public final f:Lx/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk0/c0;->short:[S

    return-void

    :array_0
    .array-data 2
        0xc75s
        0xc77s
        0xc7as
        0xc7as
        0xc36s
        0xc62s
        0xc79s
        0xc36s
        0xc31s
        0xc64s
        0xc73s
        0xc65s
        0xc63s
        0xc7bs
        0xc73s
        0xc31s
        0xc36s
        0xc74s
        0xc73s
        0xc70s
        0xc79s
        0xc64s
        0xc73s
        0xc36s
        0xc31s
        0xc7fs
        0xc78s
        0xc60s
        0xc79s
        0xc7ds
        0xc73s
        0xc31s
        0xc36s
        0xc61s
        0xc7fs
        0xc62s
        0xc7es
        0xc36s
        0xc75s
        0xc79s
        0xc64s
        0xc79s
        0xc63s
        0xc62s
        0xc7fs
        0xc78s
        0xc73s
    .end array-data
.end method

.method public constructor <init>(Lt/d;FZLk0/d0;Lx/k;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lk0/c0;->b:Lt/d;

    iput p2, p0, Lk0/c0;->c:F

    iput-boolean p3, p0, Lk0/c0;->d:Z

    iput-object p4, p0, Lk0/c0;->e:Lk0/d0;

    iput-object p5, p0, Lk0/c0;->f:Lx/k;

    sget v0, Lu1/۟ۧۥۢ۠;->۟ۥ۟۟ۡ:I

    xor-int/lit16 v0, v0, -0xd6

    invoke-direct {p0, v0, p6}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

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
    const-string v0, "ortg"

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۧۧۤۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۦۡۧ۠()[S
    .locals 2

    invoke-static {}, Lt2/۟ۦۢۡۧ;->ۣۣۥۥ()I

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
    sget-object v0, Lk0/c0;->short:[S

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

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v6, "\u06e7\u06df\u06df"

    move-object v4, v0

    move-object v1, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-object p0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۣۤ۠۠(Ljava/lang/Object;)Lk0/d0;

    move-result-object v4

    const-string v0, "\u06e4\u06e4\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/startup/ۨۤ۟ۡ;->ۨۡۥۤ(Ljava/lang/Object;)Lx/k;

    move-result-object v5

    const-string v0, "\u06e4\u06e0\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Lk0/c0;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lk0/c0;-><init>(Lt/d;FZLk0/d0;Lx/k;Lu8/e;)V

    const-string v6, "\u06e2\u06e6\u06df"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lg4/۠ۤۢۥ;->ۧۤۢ(Ljava/lang/Object;)Z

    move-result v3

    const-string v0, "\u06e7\u06e5\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۥۥۥ(Ljava/lang/Object;)Lt/d;

    move-result-object v1

    const-string v0, "\u06e5\u06e8\u06e7"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Ll6/ۥۦۣ۟;->ۨۦۥ۟(Ljava/lang/Object;)F

    move-result v2

    const-string v0, "\u06e4\u06e2\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1ab9e3 -> :sswitch_2
        0x1aba26 -> :sswitch_3
        0x1aba5f -> :sswitch_1
        0x1abea4 -> :sswitch_5
        0x1ac507 -> :sswitch_4
        0x1ac5c8 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e1\u06e4\u06e6"

    move-object v3, v0

    move-object v4, v0

    move-object v2, v0

    move-object v1, p1

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e5\u06e6\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e2\u06e5\u06e5"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v2

    check-cast v0, Lk0/c0;

    const-string v6, "\u06df\u06e3\u06e5"

    move-object p0, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e3\u06e5\u06e7"

    move-object v3, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v5, v4}, Lw4/۟ۤ۠۟ۨ;->۟ۢۢ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e8\u06e8\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v3}, Lg/۟ۧ۠ۤ;->ۦۥۣۣ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e7\u06e2\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa781 -> :sswitch_2
        0x1aaf23 -> :sswitch_0
        0x1ab6c5 -> :sswitch_4
        0x1abe67 -> :sswitch_3
        0x1ac567 -> :sswitch_5
        0x1ac9e3 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v8, 0x2

    const/4 v6, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {p0}, Lq0/ۥۣۡۧ;->۟ۢ۠ۤ۠(Ljava/lang/Object;)I

    move-result v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eq v2, v6, :cond_1

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
    if-ne v2, v8, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :goto_5
    return-object v0

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk0/c0;->ۦۡۧ۠()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lg/۟ۧ۠ۤ;->ۦۥۡۦ:I

    xor-int/lit16 v3, v3, 0x3f7

    const/16 v4, 0xc16

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟۠۠۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۥۥۥ(Ljava/lang/Object;)Lt/d;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->ۤۢۢۧ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    invoke-static {v0}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/e;

    invoke-static {v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۧۢۦۨ(Ljava/lang/Object;)F

    move-result v0

    invoke-static {p0}, Ll6/ۥۦۣ۟;->ۨۦۥ۟(Ljava/lang/Object;)F

    move-result v4

    invoke-static {v0, v4}, Lr5/۟ۤۨۥۡ;->۟۠ۢ۠ۨ(FF)Z

    move-result v2

    const v0, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-nez v2, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_6

    :sswitch_11
    invoke-static {p0}, Lg4/۠ۤۢۥ;->ۧۤۢ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-nez v2, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_14
    new-instance v0, Lm2/e;

    invoke-direct {v0, v4}, Lm2/e;-><init>(F)V

    iput v6, p0, Lk0/c0;->a:I

    invoke-static {v3, v0, p0}, Ln9/ۤۧۧۤ;->۠ۥۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-ne v2, v1, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_17
    move-object v0, v1

    goto/16 :goto_5

    :sswitch_18
    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->ۤۢۢۧ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    invoke-static {v0}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/e;

    invoke-static {v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۧۢۦۨ(Ljava/lang/Object;)F

    move-result v2

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۣۤ۠۠(Ljava/lang/Object;)Lk0/d0;

    move-result-object v5

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۤ۠ۧۤ(Ljava/lang/Object;)F

    move-result v0

    invoke-static {v2, v0}, Lr5/۟ۤۨۥۡ;->۟۠ۢ۠ۨ(FF)Z

    move-result v6

    const v0, 0xc601

    :goto_9
    const v7, 0xc612

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    if-eqz v6, :cond_6

    const v0, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1a
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1b
    new-instance v0, Lx/o;

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->۠ۧ۠ۤ()J

    move-result-wide v6

    invoke-direct {v0, v6, v7}, Lx/o;-><init>(J)V

    const v2, 0xc67d

    :goto_a
    const v5, 0xc68e

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :goto_b
    :pswitch_0
    :sswitch_1c
    iput v8, p0, Lk0/c0;->a:I

    invoke-static {p0}, Landroidx/startup/ۨۤ۟ۡ;->ۨۡۥۤ(Ljava/lang/Object;)Lx/k;

    move-result-object v2

    invoke-static {v3, v4, v0, v2, p0}, Le0/ۦۣ۟۠;->ۣ۟ۢۢۦ(Ljava/lang/Object;FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xcdff

    :goto_c
    const v3, 0xce10

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :cond_7
    :sswitch_1d
    const v0, 0xce3d

    goto :goto_c

    :sswitch_1e
    const v2, 0xc69c

    goto :goto_a

    :sswitch_1f
    invoke-static {v5}, Lv6/۟ۦۨۦۣ;->ۣۤ۠ۡ(Ljava/lang/Object;)F

    move-result v0

    invoke-static {v2, v0}, Lr5/۟ۤۨۥۡ;->۟۠ۢ۠ۨ(FF)Z

    move-result v6

    const v0, 0xc984

    :goto_d
    const v7, 0xc995

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :sswitch_20
    if-eqz v6, :cond_8

    const v0, 0xc9e1

    goto :goto_d

    :cond_8
    :sswitch_21
    const v0, 0xc9c2

    goto :goto_d

    :sswitch_22
    new-instance v0, Lx/h;

    invoke-direct {v0}, Lx/h;-><init>()V

    const v2, 0xca00

    :goto_e
    const v5, 0xca11

    xor-int/2addr v2, v5

    packed-switch v2, :pswitch_data_0

    :pswitch_1
    goto :goto_e

    :pswitch_2
    const v2, 0xca1f

    goto :goto_e

    :sswitch_23
    invoke-static {v5}, Ls0/ۧۧۨۥ;->ۣ۟۟ۨۤ(Ljava/lang/Object;)F

    move-result v0

    invoke-static {v2, v0}, Lr5/۟ۤۨۥۡ;->۟۠ۢ۠ۨ(FF)Z

    move-result v2

    const v0, 0xca7c

    :goto_f
    const v5, 0xca8d

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_c

    goto :goto_f

    :sswitch_24
    if-eqz v2, :cond_9

    const v0, 0xcd64

    goto :goto_f

    :cond_9
    :sswitch_25
    const v0, 0xcd45

    goto :goto_f

    :sswitch_26
    new-instance v0, Lx/d;

    invoke-direct {v0}, Lx/d;-><init>()V

    const v2, 0xcd83

    :goto_10
    const v5, 0xcd94

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_d

    goto :goto_10

    :sswitch_27
    const v2, 0xcda2

    goto :goto_10

    :sswitch_28
    const/4 v0, 0x0

    goto :goto_b

    :sswitch_29
    if-ne v2, v1, :cond_7

    const v0, 0xd0e7

    goto :goto_c

    :sswitch_2a
    move-object v0, v1

    goto/16 :goto_5

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
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
        0x16 -> :sswitch_a
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_18
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_a
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xe -> :sswitch_1d
        0x2d -> :sswitch_a
        0x3ef -> :sswitch_29
        0x1ef7 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_21
        0x57 -> :sswitch_23
        0x74 -> :sswitch_22
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_1c
    .end sparse-switch
.end method
