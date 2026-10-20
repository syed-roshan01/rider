.class public final Lf5/f0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x78

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/f0;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa6fs
        0xa3fs
        0xa23s
        0xa22s
        0xa38s
        0xa6fs
        0xa6fs
        0xa39s
        0xa2es
        0xa28s
        0xa2es
        0xa22s
        0xa3ds
        0xa2es
        0xa39s
        0x13ds
        0x118s
        0x102s
        0x105s
        0x151s
        0x119s
        0x110s
        0x102s
        0x151s
        0x11cs
        0x11es
        0x103s
        0x114s
        0x151s
        0x105s
        0x119s
        0x110s
        0x11fs
        0x151s
        0x11es
        0x11fs
        0x114s
        0x151s
        0x114s
        0x11ds
        0x114s
        0x11cs
        0x114s
        0x11fs
        0x105s
        0x15fs
        0x334s
        0x311s
        0x30bs
        0x30cs
        0x358s
        0x311s
        0x30bs
        0x358s
        0x31ds
        0x315s
        0x308s
        0x30cs
        0x301s
        0x356s
        0x96fs
        0x943s
        0x940s
        0x940s
        0x949s
        0x94fs
        0x958s
        0x945s
        0x943s
        0x942s
        0x90cs
        0x944s
        0x94ds
        0x95fs
        0x90cs
        0x941s
        0x943s
        0x95es
        0x949s
        0x90cs
        0x958s
        0x944s
        0x94ds
        0x942s
        0x90cs
        0x943s
        0x942s
        0x949s
        0x90cs
        0x949s
        0x940s
        0x949s
        0x941s
        0x949s
        0x942s
        0x958s
        0x902s
        0xa00s
        0xa2cs
        0xa2fs
        0xa2fs
        0xa26s
        0xa20s
        0xa37s
        0xa2as
        0xa2cs
        0xa2ds
        0xa63s
        0xa2as
        0xa30s
        0xa63s
        0xa26s
        0xa2es
        0xa33s
        0xa37s
        0xa3as
        0xa6ds
        0x373s
        0x36ds
        0x379s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 2

    iput p1, p0, Lf5/f0;->a:I

    iput-object p2, p0, Lf5/f0;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lf5/f0;->b:Z

    sget v0, Lq6/ۡۨۧۨ;->ۣۣ۟۠ۨ:I

    xor-int/lit16 v0, v0, 0x212

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lf0/ۣۤ۠۟;->۟ۦۥۣۧ()I

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
    const-string v0, "P7YKtmw3ud"

    invoke-static {v0}, Lj9/۠۠ۨ;->ۡۥۥۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Z)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lf5/f0;->a:I

    iput-boolean p2, p0, Lf5/f0;->b:Z

    iput-object p1, p0, Lf5/f0;->c:Ljava/lang/Object;

    sget v0, Lr7/۟۟ۡ۟ۢ;->۟ۢۤۥۢ:I

    xor-int/lit16 v0, v0, -0x37a

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lf0/ۣۤ۠۟;->۟ۦۥۣۧ()I

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
    const-string v0, "QdKD71DgGk0wj1G8R"

    invoke-static {v0}, Lp0/۟ۧۧۧ۟;->ۨۨۥۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۣۧۥۨ()[S
    .locals 2

    invoke-static {}, Lc6/۟ۧۧ۠ۤ;->ۣۥۣ۟()I

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
    sget-object v0, Lf5/f0;->short:[S

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
.method public final a(ILjava/lang/CharSequence;)Lq8/f;
    .locals 12

    invoke-static {p0}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->۠ۡۧۤ(Ljava/lang/Object;)I

    move-result v2

    const/4 v1, 0x0

    const/4 v8, 0x0

    invoke-static {p0}, Lv6/۟ۦۨۦۣ;->ۣۨۨۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lf5/f0;->ۣۧۥۨ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Lh7/۟۟ۧۨ۟;->۟ۤۢۡۡ:I

    xor-int/lit16 v5, v5, -0xb4

    const/16 v6, 0xa4b

    invoke-static {v3, v4, v5, v6}, Li5/ۢۤۡ;->ۨۧۡۥ([SIII)Ljava/lang/String;

    move-result-object v3

    packed-switch v2, :pswitch_data_0

    invoke-static {p2, v3}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۥۨۨۧ(Ljava/lang/Object;)Z

    move-result v5

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
    if-nez v5, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v6}, Lm1/ۣۡ۠ۧ;->۟۠ۢۨۤ(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    check-cast v6, Ljava/lang/Iterable;

    instance-of v1, v6, Ljava/util/List;

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    check-cast v6, Ljava/util/List;

    invoke-static {v6}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

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
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v0, 0xbf39

    goto :goto_4

    :sswitch_d
    const/4 v0, 0x1

    if-ne v1, v0, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_e
    const/4 v0, 0x0

    invoke-static {v6, v0}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    const v1, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v1, 0xc221

    goto :goto_5

    :sswitch_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {}, Lf5/f0;->ۣۧۥۨ()[S

    move-result-object v1

    const/16 v2, 0xf

    sget v3, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->ۣۡ۠ۤ:I

    xor-int/lit16 v3, v3, 0x138

    const/16 v4, 0x171

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۣ۟۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_11
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-static {}, Lf5/f0;->ۣۧۥۨ()[S

    move-result-object v1

    const/16 v2, 0x2e

    sget v3, Lz8/۟ۧۡۥۥ;->ۦ۠ۤ۟:I

    xor-int/lit16 v3, v3, -0x34f

    const/16 v4, 0x378

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->ۦۧۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_12
    invoke-static {v6}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_14
    if-eqz v2, :cond_5

    const v0, 0xc2db

    goto :goto_6

    :sswitch_15
    invoke-static {v1}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_16
    if-nez v2, :cond_6

    const v1, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_17
    const v1, 0xc5c3

    goto :goto_7

    :sswitch_18
    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    sget v2, Lm9/۟ۤۢۦ۠;->ۥۣۤ۠:I

    xor-int/lit16 v2, v2, 0x13d

    invoke-static {p2, v0, p1, v1, v2}, Lh/ۥۦۡۧ;->۟ۢ۟ۢۤ(Ljava/lang/Object;Ljava/lang/Object;IZI)I

    move-result v2

    const v1, 0xc601

    :goto_8
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_8

    goto :goto_8

    :sswitch_19
    if-gez v2, :cond_7

    const v1, 0xc65e

    goto :goto_8

    :cond_7
    :sswitch_1a
    const v1, 0xc63f

    goto :goto_8

    :sswitch_1b
    const v0, 0xc67d

    :goto_9
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :sswitch_1c
    const/4 v0, 0x0

    move-object v1, v0

    :goto_a
    :sswitch_1d
    const v0, 0x170fb3

    :goto_b
    const v2, 0x170fc4

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :cond_8
    :sswitch_1e
    const v0, 0x170ff1

    goto :goto_b

    :sswitch_1f
    const v0, 0xc69c

    goto :goto_9

    :sswitch_20
    new-instance v1, Lq8/f;

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc984

    :goto_c
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :sswitch_21
    const v0, 0xc9a3

    goto :goto_c

    :sswitch_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {}, Lf5/f0;->ۣۧۥۨ()[S

    move-result-object v1

    const/16 v2, 0x3c

    sget v3, Lz8/ۣۤۡۧ;->ۣ۟ۧ۟ۢ:I

    xor-int/lit16 v3, v3, -0x30b

    const/16 v4, 0x92c

    invoke-static {v1, v2, v3, v4}, Landroidx/preference/۟ۤۥۦۧ;->۟ۥۥۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_23
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-static {}, Lf5/f0;->ۣۧۥۨ()[S

    move-result-object v1

    const/16 v2, 0x61

    sget v3, Lr9/۟ۢۢۤۨ;->۟ۥۡۥۦ:I

    xor-int/lit8 v3, v3, 0x44

    const/16 v4, 0xa43

    invoke-static {v1, v2, v3, v4}, Ln8/ۢۡۨۨ;->۟ۢۦۡۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_24
    const v0, 0xca00

    :goto_d
    const v1, 0xca11

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_d

    :cond_9
    :sswitch_25
    const v0, 0xca3e

    goto :goto_d

    :sswitch_26
    if-gez p1, :cond_9

    const v0, 0xca5d

    goto :goto_d

    :sswitch_27
    const/4 p1, 0x0

    :sswitch_28
    new-instance v0, Li9/g;

    invoke-static {p2}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۣۡۧ۟(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Li9/g;-><init>(III)V

    instance-of v1, p2, Ljava/lang/String;

    invoke-static {v0}, Ldagger/hilt/components/ۡۧ۟;->ۣ۟ۢۡ۟(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v0}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۟ۥۡۥۣ(Ljava/lang/Object;)I

    move-result v10

    const v0, 0xca7c

    :goto_e
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_d

    goto :goto_e

    :sswitch_29
    if-eqz v1, :cond_a

    const v0, 0xcd64

    goto :goto_e

    :cond_a
    :sswitch_2a
    const v0, 0xcd45

    goto :goto_e

    :sswitch_2b
    const v0, 0xcd83

    :goto_f
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_f

    :sswitch_2c
    if-lez v9, :cond_b

    const v0, 0xcde0

    goto :goto_f

    :cond_b
    :sswitch_2d
    const v0, 0xcdc1

    goto :goto_f

    :sswitch_2e
    const v0, 0xcdff

    :goto_10
    const v1, 0xce10

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_10

    :cond_c
    :sswitch_2f
    const v0, 0xce3d

    goto :goto_10

    :sswitch_30
    if-le p1, v10, :cond_c

    const v0, 0xd0e7

    goto :goto_10

    :sswitch_31
    const v0, 0xd106

    :goto_11
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_11

    :sswitch_32
    if-gez v9, :cond_d

    const v0, 0xd163

    goto :goto_11

    :cond_d
    :sswitch_33
    const v0, 0xd144

    goto :goto_11

    :sswitch_34
    const v0, 0xd182

    :goto_12
    const v1, 0xd193

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_11

    goto :goto_12

    :sswitch_35
    if-gt v10, p1, :cond_e

    const v0, 0xd1df

    goto :goto_12

    :cond_e
    :sswitch_36
    const v0, 0xd1c0

    goto :goto_12

    :sswitch_37
    move v1, p1

    :goto_13
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v11

    :sswitch_38
    invoke-static {v11}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xd1fe

    :goto_14
    const v3, 0xd20f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_12

    goto :goto_14

    :sswitch_39
    if-eqz v2, :cond_f

    const v0, 0xd4e6

    goto :goto_14

    :cond_f
    :sswitch_3a
    const v0, 0xd4c7

    goto :goto_14

    :sswitch_3b
    invoke-static {v11}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v3, v7

    check-cast v3, Ljava/lang/String;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v3}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v2

    invoke-static/range {v0 .. v5}, Lr5/۟ۤۨۥۡ;->ۦۣۤۤ(IIILjava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v2

    const v0, 0xd505

    :goto_15
    const v3, 0xd516

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_13

    goto :goto_15

    :sswitch_3c
    if-eqz v2, :cond_10

    const v0, 0xd562

    goto :goto_15

    :cond_10
    :sswitch_3d
    const v0, 0xd543

    goto :goto_15

    :sswitch_3e
    const v0, 0xd581

    :goto_16
    const v2, 0xd592

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_14

    goto :goto_16

    :sswitch_3f
    const v0, 0xd5a0

    goto :goto_16

    :sswitch_40
    move-object v0, v7

    :goto_17
    check-cast v0, Ljava/lang/String;

    const v2, 0xd888

    :goto_18
    const v3, 0xd899

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_15

    goto :goto_18

    :sswitch_41
    if-eqz v0, :cond_11

    const v2, 0xd8e5

    goto :goto_18

    :sswitch_42
    const/4 v0, 0x0

    goto :goto_17

    :cond_11
    :sswitch_43
    const v2, 0xd8c6

    goto :goto_18

    :sswitch_44
    new-instance v2, Lq8/f;

    invoke-static {v1}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xd904

    :goto_19
    const v1, 0xd915

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_16

    goto :goto_19

    :sswitch_45
    const v0, 0xd923

    goto :goto_19

    :sswitch_46
    move-object v1, v2

    goto/16 :goto_a

    :sswitch_47
    const v0, 0xd980

    :goto_1a
    const v2, 0xd991

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_17

    goto :goto_1a

    :sswitch_48
    if-eq v1, v10, :cond_12

    const v0, 0xdc68

    goto :goto_1a

    :cond_12
    :sswitch_49
    const v0, 0xdc49

    goto :goto_1a

    :sswitch_4a
    add-int/lit8 v0, v1, 0x1e

    add-int/2addr v0, v9

    add-int/lit8 p1, v0, -0x1e

    const v0, 0xdc87

    :goto_1b
    const v1, 0xdc98

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_18

    goto :goto_1b

    :sswitch_4b
    const v0, 0xdca6

    goto :goto_1b

    :sswitch_4c
    move v1, p1

    goto/16 :goto_13

    :sswitch_4d
    const v0, 0xdd03

    :goto_1c
    const v1, 0xdd14

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_19

    goto :goto_1c

    :sswitch_4e
    if-lez v9, :cond_13

    const v0, 0x170090

    goto :goto_1c

    :cond_13
    :sswitch_4f
    const v0, 0xdd41

    goto :goto_1c

    :sswitch_50
    const v0, 0x1700af

    :goto_1d
    const v1, 0x1700c0

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1a

    goto :goto_1d

    :cond_14
    :sswitch_51
    const v0, 0x1700ed

    goto :goto_1d

    :sswitch_52
    if-le p1, v10, :cond_14

    const v0, 0x17010c

    goto :goto_1d

    :sswitch_53
    const v0, 0x17012b

    :goto_1e
    const v1, 0x17013c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1b

    goto :goto_1e

    :sswitch_54
    if-gez v9, :cond_15

    const v0, 0x170188

    goto :goto_1e

    :cond_15
    :sswitch_55
    const v0, 0x170169

    goto :goto_1e

    :sswitch_56
    const v0, 0x1701a7

    :goto_1f
    const v1, 0x1701b8

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1c

    goto :goto_1f

    :sswitch_57
    if-gt v10, p1, :cond_16

    const v0, 0x17048f

    goto :goto_1f

    :cond_16
    :sswitch_58
    const v0, 0x170470

    goto :goto_1f

    :sswitch_59
    move v3, p1

    :goto_20
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v11

    :sswitch_5a
    invoke-static {v11}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0x1704ae

    :goto_21
    const v2, 0x1704bf

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_1d

    goto :goto_21

    :sswitch_5b
    if-eqz v1, :cond_17

    const v0, 0x17050b

    goto :goto_21

    :cond_17
    :sswitch_5c
    const v0, 0x1704ec

    goto :goto_21

    :sswitch_5d
    invoke-static {v11}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v0, v7

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lx4/ۣۡۢ۠;->ۡۨۨ۟(Ljava/lang/Object;ILjava/lang/Object;IIZ)Z

    move-result v1

    const v0, 0x17052a

    :goto_22
    const v2, 0x17053b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_1e

    goto :goto_22

    :sswitch_5e
    if-eqz v1, :cond_18

    const v0, 0x170812

    goto :goto_22

    :cond_18
    :sswitch_5f
    const v0, 0x170568

    goto :goto_22

    :sswitch_60
    const v0, 0x170831

    :goto_23
    const v1, 0x170842

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1f

    goto :goto_23

    :sswitch_61
    move-object v0, v7

    :goto_24
    check-cast v0, Ljava/lang/String;

    const v1, 0x1708ad

    :goto_25
    const v2, 0x1708be

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_20

    goto :goto_25

    :sswitch_62
    if-eqz v0, :cond_19

    const v1, 0x17090a

    goto :goto_25

    :sswitch_63
    const v0, 0x170850

    goto :goto_23

    :sswitch_64
    const/4 v0, 0x0

    goto :goto_24

    :cond_19
    :sswitch_65
    const v1, 0x1708eb

    goto :goto_25

    :sswitch_66
    new-instance v1, Lq8/f;

    invoke-static {v3}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x170929

    :goto_26
    const v2, 0x17093a

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_21

    goto :goto_26

    :sswitch_67
    const v0, 0x170bd3

    goto :goto_26

    :sswitch_68
    const v0, 0x170c30

    :goto_27
    const v1, 0x170c41

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_22

    goto :goto_27

    :cond_1a
    :sswitch_69
    const v0, 0x170c6e

    goto :goto_27

    :sswitch_6a
    if-eq v3, v10, :cond_1a

    const v0, 0x170c8d

    goto :goto_27

    :sswitch_6b
    rsub-int/lit8 v0, v9, 0x0

    sub-int p1, v3, v0

    const v0, 0x170cac

    :goto_28
    const v1, 0x170cbd

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_23

    goto :goto_28

    :sswitch_6c
    const v0, 0x170ccb

    goto :goto_28

    :sswitch_6d
    move v3, p1

    goto/16 :goto_20

    :sswitch_6e
    if-eqz v1, :cond_8

    const v0, 0x171010

    goto/16 :goto_b

    :sswitch_6f
    invoke-static {v1}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v0, Lq8/f;

    invoke-static {v1}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_29
    return-object v0

    :pswitch_0
    invoke-static {p2, v3}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, [C

    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۥۨۨۧ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p1, p2, v2, v0}, Lb3/۟ۧ۠ۡۥ;->۟ۦۥۥ(ILjava/lang/Object;ZLjava/lang/Object;)I

    move-result v2

    const v0, 0x17102f

    :goto_2a
    const v3, 0x171040

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_24

    goto :goto_2a

    :cond_1b
    :sswitch_70
    const v0, 0x17106d

    goto :goto_2a

    :sswitch_71
    if-gez v2, :cond_1b

    const v0, 0x17108c

    goto :goto_2a

    :sswitch_72
    const v0, 0x1710ab

    :goto_2b
    const v2, 0x1710bc

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_25

    goto :goto_2b

    :sswitch_73
    const v0, 0x171355

    goto :goto_2b

    :sswitch_74
    move-object v0, v1

    goto :goto_29

    :sswitch_75
    new-instance v0, Lq8/f;

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_29

    :sswitch_76
    move-object v0, v8

    goto :goto_29

    :sswitch_77
    move v3, p1

    goto/16 :goto_20

    :sswitch_78
    move v1, p1

    goto/16 :goto_13

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_24
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_24
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_12
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_11
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_23
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_22
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_20
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x16 -> :sswitch_1e
        0x35 -> :sswitch_76
        0x77 -> :sswitch_6e
        0x1fd4 -> :sswitch_6f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xe -> :sswitch_25
        0x11 -> :sswitch_26
        0x2f -> :sswitch_28
        0x4c -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xf1 -> :sswitch_29
        0x7ab -> :sswitch_2a
        0x7c8 -> :sswitch_4d
        0x7e9 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x17 -> :sswitch_2c
        0x36 -> :sswitch_2d
        0x55 -> :sswitch_31
        0x74 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0xe -> :sswitch_2f
        0x2d -> :sswitch_78
        0x3ef -> :sswitch_30
        0x1ef7 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_33
        0x53 -> :sswitch_1c
        0x74 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x11 -> :sswitch_35
        0x32 -> :sswitch_36
        0x4c -> :sswitch_37
        0x53 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x3f1 -> :sswitch_39
        0x6a7 -> :sswitch_3a
        0x6c8 -> :sswitch_42
        0x6e9 -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3c
        0x32 -> :sswitch_3d
        0x55 -> :sswitch_38
        0x74 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x13 -> :sswitch_3f
        0x32 -> :sswitch_40
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_41
        0x3e -> :sswitch_43
        0x5f -> :sswitch_47
        0x7c -> :sswitch_44
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_45
        0x36 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x11 -> :sswitch_48
        0x5bb -> :sswitch_49
        0x5d8 -> :sswitch_1c
        0x5f9 -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x1f -> :sswitch_4b
        0x3e -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x17 -> :sswitch_4e
        0x36 -> :sswitch_4f
        0x55 -> :sswitch_53
        0x17dd84 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0xe -> :sswitch_51
        0x2d -> :sswitch_77
        0x6f -> :sswitch_52
        0x1cc -> :sswitch_53
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_54
        0x55 -> :sswitch_1c
        0x76 -> :sswitch_55
        0xb4 -> :sswitch_56
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x1f -> :sswitch_57
        0x537 -> :sswitch_59
        0x5c8 -> :sswitch_1c
        0x5e9 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_5b
        0x53 -> :sswitch_64
        0x72 -> :sswitch_5c
        0x1b4 -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x11 -> :sswitch_5e
        0x53 -> :sswitch_5a
        0x72 -> :sswitch_5f
        0xd29 -> :sswitch_60
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x12 -> :sswitch_61
        0x73 -> :sswitch_63
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_62
        0x55 -> :sswitch_68
        0x72 -> :sswitch_65
        0x1b4 -> :sswitch_66
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x13 -> :sswitch_67
        0x2e9 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0xe -> :sswitch_69
        0x2f -> :sswitch_1c
        0x71 -> :sswitch_6a
        0xcc -> :sswitch_6b
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x11 -> :sswitch_6c
        0x76 -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_70
        0x2d -> :sswitch_75
        0x6f -> :sswitch_71
        0xcc -> :sswitch_72
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_73
        0x3e9 -> :sswitch_74
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {p0}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->۠ۡۧۤ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu8/j;

    check-cast p2, Lu8/h;

    invoke-static {p1, p2}, Lw5/ۢۤۢ۠;->ۥۧۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lu8/j;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0, v0, p1}, Lr5/ۣۢ۟ۦ;->ۤۥۥۧ(Ljava/lang/Object;ILjava/lang/Object;)Lq8/f;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0, v0, p1}, Lr5/ۣۢ۟ۦ;->ۤۥۥۧ(Ljava/lang/Object;ILjava/lang/Object;)Lq8/f;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-static {p1}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    check-cast p2, Ljava/lang/String;

    invoke-static {}, Lf5/f0;->ۣۧۥۨ()[S

    move-result-object v0

    const/16 v1, 0x75

    sget v2, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۦۥۥۨ:I

    xor-int/lit16 v2, v2, 0x31a

    const/16 v3, 0x31e

    invoke-static {v0, v1, v2, v3}, Lg4/۠ۤۢۥ;->۟ۢۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lr6/ۥۡۥۥ;->۟ۥۨۨۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_2
    invoke-static {p0}, Lv6/۟ۦۨۦۣ;->ۣۨۨۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v0}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣ۟ۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, p2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
