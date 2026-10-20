.class public final Lf5/t;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/t;->short:[S

    return-void

    :array_0
    .array-data 2
        0x632s
        0x630s
        0x63ds
        0x63ds
        0x671s
        0x625s
        0x63es
        0x671s
        0x676s
        0x623s
        0x634s
        0x622s
        0x624s
        0x63cs
        0x634s
        0x676s
        0x671s
        0x633s
        0x634s
        0x637s
        0x63es
        0x623s
        0x634s
        0x671s
        0x676s
        0x638s
        0x63fs
        0x627s
        0x63es
        0x63as
        0x634s
        0x676s
        0x671s
        0x626s
        0x638s
        0x625s
        0x639s
        0x671s
        0x632s
        0x63es
        0x623s
        0x63es
        0x624s
        0x625s
        0x638s
        0x63fs
        0x634s
        0x8des
        0x8c2s
        0x8cfs
        0x742s
        0x764s
        0x772s
        0x765s
        0x871s
        0x853s
        0x844s
        0x859s
        0x846s
        0x855s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ZLu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/t;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/t;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lf5/t;->d:Z

    sget v0, Lf4/ۡۤۡ;->۟ۡۧۢۢ:I

    xor-int/lit16 v0, v0, 0x384

    invoke-direct {p0, v0, p4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

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
    const-string v0, "S0a9j1CUJNmI8JZ2BCAQb"

    invoke-static {v0}, Lcom/google/firebase/measurement/ۢۥۤۦ;->۟ۤ۟ۨۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۢۡۨۦ()[S
    .locals 2

    invoke-static {}, Li5/ۢۤۡ;->ۣ۟۟ۦۦ()I

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
    sget-object v0, Lf5/t;->short:[S

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

    const-string v4, "\u06df\u06e7\u06e5"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۣۡۨ(Ljava/lang/Object;)Z

    move-result v1

    const-string v4, "\u06e1\u06df\u06df"

    move v3, v1

    goto :goto_0

    :sswitch_0
    new-instance p0, Lf5/t;

    invoke-direct {p0, v2, v0, v3, p2}, Lf5/t;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ZLu8/e;)V

    const-string v1, "\u06e5\u06e6\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ls6/۟ۡ۟ۧۢ;->۠ۤۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Ld8/ۣۡۡ۠;->ۢۢ۟ۤ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    const-string v4, "\u06e6\u06df\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7fd -> :sswitch_1
        0x1aae81 -> :sswitch_2
        0x1abe65 -> :sswitch_3
        0x1ac14c -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e0\u06e8\u06e3"

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, p1

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e5\u06e3\u06e1"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v5, v3}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->۟ۧۢۦۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e8\u06e0\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e0\u06e5\u06e4"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v2

    check-cast v0, Lf5/t;

    const-string v6, "\u06e6\u06e8"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v4}, Lm7/ۥۨۥ۟;->۟ۡۧۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e6\u06e1\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e6\u06e3\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcc2 -> :sswitch_1
        0x1aab7f -> :sswitch_3
        0x1abe03 -> :sswitch_4
        0x1ac185 -> :sswitch_5
        0x1ac1c8 -> :sswitch_0
        0x1ac8ee -> :sswitch_2
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣ۟ۤۧۢ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v18

    invoke-static/range {p0 .. p0}, Ld8/ۣۡۡ۠;->ۢۢ۟ۤ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v19

    const/16 v3, 0x650

    :goto_0
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v3, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v2, 0x1

    if-ne v4, v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/t;->ۢۡۨۦ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۦ۟۟:I

    xor-int/lit16 v5, v5, 0x2e8

    const/16 v6, 0x651

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۥۣۧ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_8
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    :try_start_1
    invoke-static/range {v19 .. v19}, Lr5/۟ۤۨۥۡ;->ۤۢۧۤ(Ljava/lang/Object;)La5/z;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Ls6/۟ۡ۟ۧۢ;->۠ۤۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lf5/t;->ۢۡۨۦ()[S

    move-result-object v5

    const/16 v6, 0x2f

    sget v7, Lg0/۟ۥۢۥۢ;->۟ۥۤۡۦ:I

    xor-int/lit16 v7, v7, -0x365

    const/16 v8, 0x8ab

    invoke-static {v5, v6, v7, v8}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۣۣۥۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, La5/s;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v4, v6}, La5/s;-><init>(La5/z;Ljava/lang/String;Lu8/e;)V

    invoke-static {v5}, Lm7/ۥۨۥ۟;->۟۠ۧ۠ۦ(Ljava/lang/Object;)Lp9/c;

    move-result-object v3

    new-instance v4, Lf5/s;

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۣۡۨ(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v0, v19

    invoke-direct {v4, v0, v5}, Lf5/s;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Z)V

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iput v5, v0, Lf5/t;->a:I

    move-object/from16 v0, p0

    invoke-static {v3, v4, v0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۡۢ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v4

    const v3, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v3, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ne v4, v2, :cond_2

    const v3, 0xbedc

    goto :goto_3

    :catch_0
    move-exception v2

    invoke-static/range {v19 .. v19}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {v2}, Lf4/ۡۥۣۢ;->۟۠ۨۡۧ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v2, 0xbf39

    goto :goto_4

    :sswitch_c
    if-nez v3, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_d
    move-object/from16 v2, v18

    :goto_5
    :sswitch_e
    return-object v2

    :sswitch_f
    invoke-static/range {v19 .. v19}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v2

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟ۦۡۡۢ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v2

    invoke-static {v2}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v3

    const v2, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v3, :cond_4

    const v2, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {v3}, Lr5/ۣۢ۟ۦ;->۟ۡۥۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v2, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-nez v5, :cond_5

    const v2, 0xc2db

    goto :goto_7

    :sswitch_15
    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    const v2, 0xc5a4

    goto :goto_8

    :sswitch_17
    const v2, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    const v2, 0xc620

    goto :goto_9

    :sswitch_19
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v5

    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_1a
    const v2, 0xc69c

    goto :goto_a

    :sswitch_1b
    new-instance v2, Lf5/e;

    new-instance v3, Lcom/auto/accept/data/model/UserProfile;

    invoke-static {}, Lf5/t;->ۢۡۨۦ()[S

    move-result-object v4

    const/16 v6, 0x32

    sget v7, Lr1/۟ۤۤۡ۠;->ۦۥۢ:I

    xor-int/lit16 v7, v7, 0x111

    const/16 v8, 0x717

    invoke-static {v4, v6, v7, v8}, Ll3/ۥۣۤ۟;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lf5/t;->ۢۡۨۦ()[S

    move-result-object v6

    const/16 v7, 0x36

    sget v8, Lj5/۟ۢۥۨۦ;->۟ۦۥۦۣ:I

    xor-int/lit16 v8, v8, -0x32d

    const/16 v9, 0x830

    invoke-static {v6, v7, v8, v9}, Lz7/۟۟ۨۢۢ;->ۨ۠۟ۧ([SIII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    sget v16, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->۟ۡ۠ۤۧ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x622

    move/from16 v16, v0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v17}, Lcom/auto/accept/data/model/UserProfile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILd9/f;)V

    invoke-direct {v2, v3}, Lf5/e;-><init>(Lcom/auto/accept/data/model/UserProfile;)V

    invoke-static/range {v19 .. v19}, Ld9/ۧۧۨۥ;->ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static/range {v19 .. v19}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1c
    move-object/from16 v2, v18

    goto/16 :goto_5

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
        0xb97b -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_1c
        0x4c -> :sswitch_e
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_17
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_17
        0xf3 -> :sswitch_1a
    .end sparse-switch
.end method
