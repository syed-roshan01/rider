.class public final Lf5/y;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/y;->short:[S

    return-void

    :array_0
    .array-data 2
        0xc3es
        0xc19s
        0xc11s
        0xc14s
        0xc1ds
        0xc1cs
        0xc58s
        0xc0cs
        0xc17s
        0xc58s
        0xc0es
        0xc1ds
        0xc0as
        0xc11s
        0xc1es
        0xc01s
        0xc58s
        0xc19s
        0xc1bs
        0xc1bs
        0xc17s
        0xc0ds
        0xc16s
        0xc0cs
        0xc56s
        0xc58s
        0xc2cs
        0xc0as
        0xc01s
        0xc58s
        0xc19s
        0xc1fs
        0xc19s
        0xc11s
        0xc16s
        0xc56s
        0x53es
        0x53cs
        0x531s
        0x531s
        0x57ds
        0x529s
        0x532s
        0x57ds
        0x57as
        0x52fs
        0x538s
        0x52es
        0x528s
        0x530s
        0x538s
        0x57as
        0x57ds
        0x53fs
        0x538s
        0x53bs
        0x532s
        0x52fs
        0x538s
        0x57ds
        0x57as
        0x534s
        0x533s
        0x52bs
        0x532s
        0x536s
        0x538s
        0x57as
        0x57ds
        0x52as
        0x534s
        0x529s
        0x535s
        0x57ds
        0x53es
        0x532s
        0x52fs
        0x532s
        0x528s
        0x529s
        0x534s
        0x533s
        0x538s
        0xc0as
        0xc1cs
        0xc0bs
        0xc0fs
        0xc10s
        0xc1as
        0xc1cs
        0xc26s
        0xc1cs
        0xc17s
        0xc18s
        0xc1bs
        0xc15s
        0xc1cs
        0xc1ds
        0x48es
        0x48fs
        0x494s
        0x4c0s
        0x486s
        0x48fs
        0x495s
        0x48es
        0x484s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/y;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/y;->c:Ljava/lang/String;

    sget v0, Lh5/ۢ۠۠۟;->ۣ۟ۧ۟ۦ:I

    xor-int/lit16 v0, v0, 0xae

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

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
    const-string v0, "DFZGK"

    invoke-static {v0}, Lh5/۟ۦۣۣ;->۟ۥۤ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟ۡ۟ۡ۠()[S
    .locals 2

    invoke-static {}, Lq7/۟ۢۡ۟۟;->۟ۦۣۢۦ()I

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
    sget-object v0, Lf5/y;->short:[S

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
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e3\u06e7\u06e6"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, La2/ۢۦۧۦ;->ۣۣ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e7\u06e2\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    new-instance p0, Lf5/y;

    invoke-direct {p0, v0, v2, p2}, Lf5/y;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V

    const-string v1, "\u06e7\u06e8\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Le7/ۧ۠ۧ;->۠ۤۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e8\u06e5\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1ab702 -> :sswitch_1
        0x1ac56d -> :sswitch_0
        0x1ac621 -> :sswitch_2
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e6\u06e5\u06e8"

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, p1

    move-object v2, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-object v1

    :sswitch_0
    invoke-static {p0, v4, v5}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣ۟ۡۧۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e4\u06e5\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e6\u06e3\u06e1"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e8\u06e8\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lf5/y;

    const-string v6, "\u06e4\u06e2\u06e7"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e8\u06e5\u06e5"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v3}, Ly/۟ۤۥۨ;->ۣۣ۟ۨ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e2\u06e7\u06df"

    move-object v6, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aba29 -> :sswitch_2
        0x1aba83 -> :sswitch_3
        0x1ac1c4 -> :sswitch_4
        0x1ac209 -> :sswitch_1
        0x1ac988 -> :sswitch_0
        0x1ac9e4 -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const/4 v8, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    invoke-static {p0}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->۟ۤۢۤۨ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Lf5/y;->۟ۡ۟ۡ۠()[S

    move-result-object v3

    const/4 v5, 0x0

    sget v6, Lx5/ۡۦۦۥ;->۟ۥ۟۠ۢ:I

    xor-int/lit16 v6, v6, 0x91

    const/16 v7, 0xc78

    invoke-static {v3, v5, v6, v7}, Lj4/ۣۧۤ;->۟ۥۦۡۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0}, Le7/ۧ۠ۧ;->۠ۤۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v6

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
    if-ne v4, v8, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static {p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

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

    invoke-static {}, Lf5/y;->۟ۡ۟ۡ۠()[S

    move-result-object v3

    const/16 v4, 0x24

    sget v5, Lw9/۟۠۠ۢ۟;->ۨۤۨۧ:I

    xor-int/lit16 v5, v5, 0xf9

    const/16 v6, 0x55d

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->۟ۡۦۣۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {v6}, Lr5/۟ۤۨۥۡ;->ۤۢۧۤ(Ljava/lang/Object;)La5/z;

    move-result-object v3

    invoke-static {p0}, La2/ۢۦۧۦ;->ۣۣ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x1

    iput v7, p0, Lf5/y;->a:I

    const/4 v7, 0x1

    invoke-static {v3, v4, v7, p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟ۡۥۥۢ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v4, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ne v3, v2, :cond_2

    const v4, 0xbedc

    goto :goto_3

    :sswitch_b
    instance-of v4, v3, Lq8/g;

    const v2, 0xbefb

    :goto_4
    const v7, 0xbf0c

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v7, v4, -0x2

    or-int/2addr v2, v7

    if-eqz v2, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    move-object v0, v3

    check-cast v0, Lcom/auto/accept/data/model/UserProfile;

    move-object v2, v0

    invoke-static {v2}, Ld9/ۣ۟۠ۢۡ;->ۦۥۣۤ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xc202

    :goto_5
    const v8, 0xc213

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-nez v7, :cond_4

    const v4, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v4, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v2}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟۠ۡ۠ۦ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xc27e

    :goto_6
    const v8, 0xc28f

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_12
    const v4, 0xc2bc

    goto :goto_6

    :sswitch_13
    if-nez v7, :cond_5

    const v4, 0xc2db

    goto :goto_6

    :sswitch_14
    const v2, 0xc2fa

    :goto_7
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    const v2, 0xc5a4

    goto :goto_7

    :sswitch_16
    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v8

    const v4, 0xc601

    :goto_8
    const v7, 0xc612

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_8

    goto :goto_8

    :sswitch_17
    const-wide/16 v10, 0x0

    cmp-long v4, v8, v10

    if-lez v4, :cond_6

    const v4, 0xc65e

    goto :goto_8

    :cond_6
    :sswitch_18
    const v4, 0xc63f

    goto :goto_8

    :sswitch_19
    invoke-static {v2}, Lw2/ۧۦۧ;->۟ۤۢۡۤ(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v10

    const v2, 0xc67d

    :goto_9
    const v4, 0xc68e

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :cond_7
    :sswitch_1a
    const v2, 0xc6bb

    goto :goto_9

    :sswitch_1b
    cmp-long v2, v8, v10

    if-gtz v2, :cond_7

    const v2, 0xc965

    goto :goto_9

    :sswitch_1c
    invoke-static {v6}, Ld9/ۨۧۧۦ;->ۣۧ۟ۢ(Ljava/lang/Object;)V

    const v2, 0xc984

    :goto_a
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_1d
    const v2, 0xc9a3

    goto :goto_a

    :sswitch_1e
    invoke-static {v6}, Lf6/ۦۣۦ۟;->۟۟ۨۦ۟(Ljava/lang/Object;)Lz4/d;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟ۧۢ۠ۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-static {}, Lf5/y;->۟ۡ۟ۡ۠()[S

    move-result-object v4

    const/16 v7, 0x53

    sget v8, Lh8/۟ۤۨۨۦ;->ۣۤۡۦ:I

    xor-int/lit16 v8, v8, 0x237

    const/16 v9, 0xc79

    invoke-static {v4, v7, v8, v9}, Ld9/ۨۧۧۦ;->ۨۤۨ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x1

    invoke-static {v2, v4, v7}, Lz0/ۣ۟۠ۤ۟;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-static {v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-static {v6}, Lg2/ۢۥۥۡ;->ۤۨۤۢ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v2

    new-instance v4, Landroid/content/Intent;

    const-class v7, Lcom/auto/accept/service/KeepAliveService;

    invoke-direct {v4, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v2, v4}, Lg7/۠ۤۧ;->۟ۧۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/ComponentName;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const v2, 0xca00

    :goto_b
    const v4, 0xca11

    xor-int/2addr v2, v4

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_b

    :goto_c
    :pswitch_1
    :sswitch_1f
    :try_start_3
    invoke-static {v3}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    const v2, 0xca7c

    :goto_d
    const v4, 0xca8d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :sswitch_20
    if-eqz v3, :cond_8

    const v2, 0xcd64

    goto :goto_d

    :pswitch_2
    const v2, 0xca1f

    goto :goto_b

    :sswitch_21
    invoke-static {v6}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->۟۠ۢ۠ۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Ld9/ۨۧۧۦ;->ۣۧ۟ۢ(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_c

    :catch_0
    move-exception v2

    invoke-static {v6}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_22
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v2

    :sswitch_23
    return-object v2

    :cond_8
    :sswitch_24
    const v2, 0xcd45

    goto :goto_d

    :sswitch_25
    :try_start_4
    invoke-static {v3}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v3, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_c

    goto :goto_e

    :sswitch_26
    if-nez v2, :cond_9

    const v3, 0xcde0

    goto :goto_e

    :cond_9
    :sswitch_27
    const v3, 0xcdc1

    goto :goto_e

    :sswitch_28
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v2

    :sswitch_29
    invoke-static {}, Lf5/y;->۟ۡ۟ۡ۠()[S

    move-result-object v3

    const/16 v4, 0x62

    sget v7, Lcom/google/android/gms/common/ۦۢۨ;->ۦۢۥۧ:I

    xor-int/lit16 v7, v7, 0x255

    const/16 v8, 0x4e0

    invoke-static {v3, v4, v7, v8}, Landroidx/startup/ۨۤ۟ۡ;->ۣۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v3

    const v2, 0xcdff

    :goto_f
    const v4, 0xce10

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :cond_a
    :sswitch_2a
    const v2, 0xce3d

    goto :goto_f

    :sswitch_2b
    if-eqz v3, :cond_a

    const v2, 0xd0e7

    goto :goto_f

    :sswitch_2c
    invoke-static {v6}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->۟۠ۢ۠ۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Ld9/ۨۧۧۦ;->ۣۧ۟ۢ(Ljava/lang/Object;)V

    const v2, 0xd106

    :goto_10
    const v3, 0xd117

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_10

    :sswitch_2d
    const v2, 0xd125

    goto :goto_10

    :sswitch_2e
    invoke-static {v6}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const v2, 0xd182

    :goto_11
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_11

    :sswitch_2f
    const v2, 0xd1a1

    goto :goto_11

    :catch_1
    move-exception v2

    const v2, 0xd1fe

    :goto_12
    const v4, 0xd20f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_10

    goto :goto_12

    :sswitch_30
    const v2, 0xd4a8

    goto :goto_12

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
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_b
        0x4c -> :sswitch_23
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_1f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_16
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_21
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1e
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_24
        0x7c8 -> :sswitch_22
        0x7e9 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_27
        0x55 -> :sswitch_29
        0x74 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2e
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_22
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_30
        0x6a7 -> :sswitch_1f
    .end sparse-switch
.end method
