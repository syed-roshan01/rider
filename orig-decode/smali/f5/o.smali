.class public final Lf5/o;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:Landroid/app/Application;

.field public b:J

.field public c:I

.field public final d:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/o;->short:[S

    return-void

    :array_0
    .array-data 2
        0x27afs
        -0x5afs
        0x47es
        0x438s
        0x43bs
        0x42as
        0x43ds
        0x436s
        0x40cs
        0x43bs
        0x433s
        0x431s
        0x42as
        0x43bs
        0x41ds
        0x431s
        0x430s
        0x438s
        0x437s
        0x439s
        0x464s
        0x47es
        0x438s
        0x43bs
        0x42as
        0x43ds
        0x436s
        0x41fs
        0x430s
        0x43as
        0x41fs
        0x43ds
        0x42as
        0x437s
        0x428s
        0x43fs
        0x42as
        0x43bs
        0x47es
        0x42as
        0x431s
        0x431s
        0x435s
        0x47es
        0x6f6s
        0x6ecs
        0x6e0s
        0x6fds
        0x6fas
        0x6ebs
        0x6fes
        0x64ds
        0x64fs
        0x642s
        0x642s
        0x60es
        0x65as
        0x641s
        0x60es
        0x609s
        0x65cs
        0x64bs
        0x65ds
        0x65bs
        0x643s
        0x64bs
        0x609s
        0x60es
        0x64cs
        0x64bs
        0x648s
        0x641s
        0x65cs
        0x64bs
        0x60es
        0x609s
        0x647s
        0x640s
        0x658s
        0x641s
        0x645s
        0x64bs
        0x609s
        0x60es
        0x659s
        0x647s
        0x65as
        0x646s
        0x60es
        0x64ds
        0x641s
        0x65cs
        0x641s
        0x65bs
        0x65as
        0x647s
        0x640s
        0x64bs
        0x7f0s
        0x7fcs
        0x7fds
        0x7fds
        0x7f6s
        0x7f0s
        0x7e7s
        0x7fas
        0x7e5s
        0x7fas
        0x7e7s
        0x7eas
        0x738s
        0x723s
        0x73as
        0x73as
        0x776s
        0x735s
        0x737s
        0x738s
        0x738s
        0x739s
        0x722s
        0x776s
        0x734s
        0x733s
        0x776s
        0x735s
        0x737s
        0x725s
        0x722s
        0x776s
        0x722s
        0x739s
        0x776s
        0x738s
        0x739s
        0x738s
        0x77bs
        0x738s
        0x723s
        0x73as
        0x73as
        0x776s
        0x722s
        0x72fs
        0x726s
        0x733s
        0x776s
        0x737s
        0x738s
        0x732s
        0x724s
        0x739s
        0x73fs
        0x732s
        0x778s
        0x738s
        0x733s
        0x722s
        0x778s
        0x715s
        0x739s
        0x738s
        0x738s
        0x733s
        0x735s
        0x722s
        0x73fs
        0x720s
        0x73fs
        0x722s
        0x72fs
        0x71bs
        0x737s
        0x738s
        0x737s
        0x731s
        0x733s
        0x724s
        0x2aa7s
        -0x8a7s
        0x976s
        0x930s
        0x933s
        0x922s
        0x935s
        0x93es
        0x904s
        0x933s
        0x93bs
        0x939s
        0x922s
        0x933s
        0x915s
        0x939s
        0x938s
        0x930s
        0x93fs
        0x931s
        0x96cs
        0x976s
        0x935s
        0x937s
        0x93as
        0x93as
        0x93fs
        0x938s
        0x931s
        0x976s
        0x930s
        0x933s
        0x922s
        0x935s
        0x93es
        0x917s
        0x938s
        0x932s
        0x917s
        0x935s
        0x922s
        0x93fs
        0x920s
        0x937s
        0x922s
        0x933s
        0x978s
        0x978s
        0x978s
        0xb96s
        0xb88s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/o;->d:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    sget v0, Lw2/ۧۦۧ;->۟۟ۦۨۥ:I

    xor-int/lit16 v0, v0, -0x135

    invoke-direct {p0, v0, p2}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۢۧۨ()I

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
    const-string v0, "9v2VvZU0LpqGzZJK1YR"

    invoke-static {v0}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->ۥۣۨۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۤۥۥ()[S
    .locals 2

    invoke-static {}, Ls8/۟ۥۨۨ;->۟۠۟()I

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
    sget-object v0, Lf5/o;->short:[S

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
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e1\u06e0"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object p0

    :sswitch_0
    new-instance p0, Lf5/o;

    invoke-direct {p0, v0, p2}, Lf5/o;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    const-string v1, "\u06e0\u06e4\u06df"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۣۣۨ۠(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e0\u06e0\u06e8"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaae8 -> :sswitch_0
        0x1ac546 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e8\u06e1\u06e0"

    move-object v3, v0

    move-object v1, v0

    move-object v4, v0

    move-object v2, p1

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e6\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Lf5/o;

    const-string v6, "\u06df\u06e3\u06e7"

    move-object p0, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e5\u06e7\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v3, v4}, Ls/ۣۡۡۧ;->ۦۦۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e0\u06e7"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e8\u06df\u06e6"

    move-object v3, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v5}, Lt1/ۧۦۤۧ;->ۣۢۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e0\u06e0\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0x1aa783 -> :sswitch_1
        0x1aaadf -> :sswitch_5
        0x1abaa6 -> :sswitch_2
        0x1abe84 -> :sswitch_4
        0x1ac907 -> :sswitch_3
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lq6/ۡۨۧۨ;->ۣۣ۟۠ۨ:I

    xor-int/lit16 v4, v4, 0x23c

    const/16 v5, 0x45e

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣۣ۠ۢ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lk1/ۨ۟ۧۡ;->ۥۣ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v5

    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v2

    const/16 v6, 0x2c

    sget v8, Lh/۟ۡۥۡۧ;->۟۟ۧ۟ۤ:I

    xor-int/lit16 v8, v8, -0x3e7

    const/16 v9, 0x6bf

    invoke-static {v2, v6, v8, v9}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣۣۦۧ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۣۣۨ۠(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v11

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v2, 0x6ad

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
    invoke-static/range {p0 .. p0}, Li4/ۨ۟ۨ;->۟ۢۤۡ۟(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static/range {p0 .. p0}, Lk7/۟ۤۥۡ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v2

    :try_start_0
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static/range {p1 .. p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    const/16 v4, 0x748

    :goto_2
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v4, 0xbe22

    goto :goto_2

    :sswitch_7
    move-object v6, v2

    :goto_3
    :try_start_1
    invoke-static {v11}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧ۠ۦ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v14, 0x9

    sub-long/2addr v12, v14

    sub-long v8, v12, v8

    const-wide/16 v12, 0x9

    add-long/2addr v8, v12

    invoke-static {v2, v8, v9}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v4

    const/16 v7, 0xe3

    sget v8, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۤۥۡ۠:I

    xor-int/lit16 v8, v8, -0x38e

    const/16 v9, 0xbfb

    invoke-static {v4, v7, v8, v9}, Lz1/۟ۦ۟۠۟;->۟ۥ۟ۥۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    instance-of v4, v3, Lq8/g;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    const v2, 0xc984

    :goto_4
    const v7, 0xc995

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :sswitch_8
    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v7, v4, -0x2

    or-int/2addr v2, v7

    if-eqz v2, :cond_7

    const v2, 0xc9e1

    goto :goto_4

    :sswitch_9
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v3

    const/16 v4, 0x33

    sget v5, Lv6/۟ۦۨۦۣ;->۟ۥۧۥۧ:I

    xor-int/lit16 v5, v5, -0x97

    const/16 v6, 0x62e

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_a
    invoke-static/range {p1 .. p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v11}, Lg2/ۢۥۥۡ;->ۤۨۤۢ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v4

    invoke-static {}, Lh7/ۥۥۢ۟;->ۨ۟ۡ۠()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v10}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xbe7f

    :goto_5
    const v8, 0xbe90

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v2, 0xbebd

    goto :goto_5

    :sswitch_c
    if-eqz v6, :cond_2

    const v2, 0xbedc

    goto :goto_5

    :sswitch_d
    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v2

    const/16 v6, 0x62

    sget v8, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۣ۟ۡۤۤ:I

    xor-int/lit8 v8, v8, 0x4f

    const/16 v9, 0x793

    invoke-static {v2, v6, v8, v9}, Ld3/ۡۨۢۦ;->۟ۨۡۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Ld4/۟۠۠۟ۢ;->۟ۤ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v6

    const/16 v8, 0x6e

    sget v9, Lrikka/shizuku/۟ۤۦ۟ۦ;->۠ۦۣۨ:I

    xor-int/lit16 v9, v9, 0x30f

    const/16 v12, 0x756

    invoke-static {v6, v8, v9, v12}, Lf/ۣ۟ۤۤ;->ۡۤۧ۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lh3/۟ۡۥ۠۠;->۟۠۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v2, Landroid/net/ConnectivityManager;

    invoke-static {v2}, Lx8/ۢۨۥۨ;->ۦۤۤۤ(Ljava/lang/Object;)Landroid/net/Network;

    move-result-object v8

    const v6, 0xbefb

    :goto_6
    const v9, 0xbf0c

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_5

    goto :goto_6

    :cond_3
    :sswitch_e
    const v6, 0xbf39

    goto :goto_6

    :sswitch_f
    if-eqz v8, :cond_3

    const v6, 0xc1e3

    goto :goto_6

    :sswitch_10
    invoke-static {v2, v8}, Lq2/ۣ۟ۢۥ۠;->۟۠ۤ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/NetworkCapabilities;

    move-result-object v2

    const v6, 0xc202

    :goto_7
    const v8, 0xc213

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_6

    goto :goto_7

    :sswitch_11
    const v6, 0xc221

    goto :goto_7

    :sswitch_12
    const/4 v2, 0x0

    :sswitch_13
    const v6, 0xc27e

    :goto_8
    const v8, 0xc28f

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_7

    goto :goto_8

    :cond_4
    :sswitch_14
    const v6, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_4

    const v6, 0xc2db

    goto :goto_8

    :sswitch_16
    sget v6, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->۠ۡۤ۠:I

    xor-int/lit16 v6, v6, -0x1ed

    invoke-static {v2, v6}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۧۧۡۡ(Ljava/lang/Object;I)Z

    move-result v6

    const v2, 0xc2fa

    :goto_9
    const v8, 0xc30b

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const/4 v2, 0x1

    if-ne v6, v2, :cond_5

    const v2, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_18
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_19
    const v2, 0xc601

    :goto_a
    const v6, 0xc612

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_1a
    const v2, 0xc620

    goto :goto_a

    :sswitch_1b
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lf5/n;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v6}, Lf5/n;-><init>(Landroid/app/Application;I)V

    invoke-static {v2, v3}, Ld1/ۣۧۡۡ;->۟ۥ۟۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-object v2, v5

    :goto_b
    return-object v2

    :sswitch_1c
    :try_start_2
    invoke-static {v11}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۧ۠ۦ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lf5/o;->ۤۥۥ()[S

    move-result-object v2

    const/16 v6, 0xb2

    sget v8, Lx2/۟ۢۥ;->۟ۧۤۨۨ:I

    xor-int/lit16 v8, v8, -0x1af

    const/16 v9, 0x956

    invoke-static {v2, v6, v8, v9}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۤۥ([SIII)Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v8

    invoke-static {v11}, Le9/ۧۧۡ;->ۣ۟۠ۨۧ(Ljava/lang/Object;)La5/i0;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v4, v0, Lf5/o;->a:Landroid/app/Application;

    move-object/from16 v0, p0

    iput-wide v8, v0, Lf5/o;->b:J

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lf5/o;->c:I

    move-object/from16 v0, p0

    invoke-static {v2, v0}, Lj2/۠ۤۨۤ;->۟ۢۤۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v2

    const v6, 0xc67d

    :goto_c
    const v12, 0xc68e

    xor-int/2addr v6, v12

    sparse-switch v6, :sswitch_data_a

    goto :goto_c

    :cond_6
    :sswitch_1d
    const v6, 0xc6bb

    goto :goto_c

    :sswitch_1e
    if-ne v2, v3, :cond_6

    const v6, 0xc965

    goto :goto_c

    :sswitch_1f
    move-object v2, v3

    goto :goto_b

    :cond_7
    :sswitch_20
    const v2, 0xc9c2

    goto/16 :goto_4

    :sswitch_21
    :try_start_3
    move-object v0, v3

    check-cast v0, Lcom/auto/accept/data/model/AppConfig;

    move-object v2, v0

    invoke-static {}, Lh7/ۥۥۢ۟;->ۨ۟ۡ۠()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v10}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xca00

    :goto_d
    const v8, 0xca11

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_b

    goto :goto_d

    :cond_8
    :sswitch_22
    const v4, 0xca3e

    goto :goto_d

    :sswitch_23
    if-eqz v7, :cond_8

    const v4, 0xca5d

    goto :goto_d

    :sswitch_24
    invoke-static {v2}, Lc7/ۨۤۦۢ;->ۡۦۦ۠(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xca7c

    :goto_e
    const v8, 0xca8d

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_c

    goto :goto_e

    :sswitch_25
    if-nez v7, :cond_9

    const v4, 0xcd64

    goto :goto_e

    :cond_9
    :sswitch_26
    const v4, 0xcd45

    goto :goto_e

    :sswitch_27
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Lf5/n;

    const/4 v7, 0x1

    invoke-direct {v4, v6, v7}, Lf5/n;-><init>(Landroid/app/Application;I)V

    invoke-static {v2, v4}, Ld1/ۣۧۡۡ;->۟ۥ۟۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0xcd83

    :goto_f
    const v4, 0xcd94

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :sswitch_28
    const v2, 0xcda2

    goto :goto_f

    :sswitch_29
    invoke-static {v2}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۦۨۧ۟(Ljava/lang/Object;)I

    move-result v7

    const v4, 0xcdff

    :goto_10
    const v8, 0xce10

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_e

    goto :goto_10

    :cond_a
    :sswitch_2a
    const v4, 0xce3d

    goto :goto_10

    :sswitch_2b
    const/4 v4, 0x6

    if-le v7, v4, :cond_a

    const v4, 0xd0e7

    goto :goto_10

    :sswitch_2c
    const/4 v4, 0x1

    const v7, 0xd106

    :goto_11
    const v8, 0xd117

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_f

    goto :goto_11

    :sswitch_2d
    const v7, 0xd125

    goto :goto_11

    :sswitch_2e
    const/4 v4, 0x0

    :sswitch_2f
    invoke-static {v2}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->ۡۢۤۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v8, Ljava/lang/Integer;

    const/4 v9, 0x6

    invoke-direct {v8, v9}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v7, v8}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۡ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const v7, 0xd182

    :goto_12
    const v9, 0xd193

    xor-int/2addr v7, v9

    sparse-switch v7, :sswitch_data_10

    goto :goto_12

    :sswitch_30
    if-eqz v8, :cond_b

    const v7, 0xd1df

    goto :goto_12

    :cond_b
    :sswitch_31
    const v7, 0xd1c0

    goto :goto_12

    :sswitch_32
    const/4 v4, 0x1

    move v7, v4

    :goto_13
    invoke-static {v2}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۦۨۧ۟(Ljava/lang/Object;)I

    move-result v8

    const v4, 0xd1fe

    :goto_14
    const v9, 0xd20f

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_11

    goto :goto_14

    :sswitch_33
    const/4 v4, 0x6

    if-le v8, v4, :cond_c

    const v4, 0xd4e6

    goto :goto_14

    :cond_c
    :sswitch_34
    const v4, 0xd4c7

    goto :goto_14

    :sswitch_35
    const v4, 0xd505

    :goto_15
    const v7, 0xd516

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_12

    goto :goto_15

    :sswitch_36
    const v4, 0xd524

    goto :goto_15

    :sswitch_37
    const v4, 0xd581

    :goto_16
    const v8, 0xd592

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_13

    goto :goto_16

    :sswitch_38
    if-eqz v7, :cond_d

    const v4, 0xd869

    goto :goto_16

    :cond_d
    :sswitch_39
    const v4, 0xd5bf

    goto :goto_16

    :sswitch_3a
    invoke-static {v11}, Lr2/ۧۧۢۢ;->ۧۥۥ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Lp8/ۡۤ;->ۧۢ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۤ۠۟ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Lv0/۟ۤۧ۠ۧ;->۟ۥۤۧۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Ld7/ۢۧۧۢ;->ۢۡۡۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Lx8/ۢۨۥۨ;->ۣۣۨۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->۟ۡ۟ۡ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۢۢۤۤ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->۟ۧۦۧۤ(Ljava/lang/Object;)Z

    move-result v7

    invoke-static {v7}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3b
    invoke-static {v2}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->ۥۦۢۤ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xd888

    :goto_17
    const v8, 0xd899

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_14

    goto :goto_17

    :sswitch_3c
    xor-int/lit8 v4, v7, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v8, v7, -0x2

    or-int/2addr v4, v8

    if-eqz v4, :cond_e

    const v4, 0xd8e5

    goto :goto_17

    :cond_e
    :sswitch_3d
    const v4, 0xd8c6

    goto :goto_17

    :sswitch_3e
    invoke-static {v11}, Lg2/ۢۥۥۡ;->ۤۨۤۢ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v4

    invoke-static {v4}, Lt2/۟ۦۣۡۤ;->ۧۧۤۨ(Ljava/lang/Object;)Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-static {v2}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->ۥۦۢۤ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    :sswitch_3f
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v9

    const v4, 0xd904

    :goto_18
    const v12, 0xd915

    xor-int/2addr v4, v12

    sparse-switch v4, :sswitch_data_15

    goto :goto_18

    :sswitch_40
    if-eqz v9, :cond_f

    const v4, 0xd961

    goto :goto_18

    :cond_f
    :sswitch_41
    const v4, 0xd942

    goto :goto_18

    :sswitch_42
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v9, 0x0

    :try_start_4
    invoke-static {v7, v4, v9}, Lg5/۟ۥۨۤ;->ۣ۟ۤ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/pm/PackageInfo;

    invoke-static {v11}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->۟ۢۡۥۤ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v9

    invoke-static {v9, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :sswitch_43
    :try_start_5
    invoke-static {v2}, Lu8/ۨۡ۠;->ۡۧۢۢ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xd980

    :goto_19
    const v8, 0xd991

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_16

    goto :goto_19

    :sswitch_44
    if-eqz v7, :cond_10

    const v4, 0xdc68

    goto :goto_19

    :cond_10
    :sswitch_45
    const v4, 0xdc49

    goto :goto_19

    :sswitch_46
    invoke-static {v11}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۧۦ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_47
    invoke-static {v11}, Lj4/ۣۧۤ;->ۧۥۦۧ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xdc87

    :goto_1a
    const v8, 0xdc98

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_17

    goto :goto_1a

    :sswitch_48
    if-nez v7, :cond_11

    const v4, 0xdce4

    goto :goto_1a

    :cond_11
    :sswitch_49
    const v4, 0xdcc5

    goto :goto_1a

    :sswitch_4a
    invoke-static {v2}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۣۧۡ۠(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0xdd03

    :goto_1b
    const v8, 0xdd14

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_18

    goto :goto_1b

    :sswitch_4b
    if-eqz v7, :cond_12

    const v4, 0x170090

    goto :goto_1b

    :cond_12
    :sswitch_4c
    const v4, 0xdd41

    goto :goto_1b

    :sswitch_4d
    invoke-static {v2}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->۟ۦۦ۟ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    const v4, 0x1700af

    :goto_1c
    const v8, 0x1700c0

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_19

    goto :goto_1c

    :cond_13
    :sswitch_4e
    const v4, 0x1700ed

    goto :goto_1c

    :sswitch_4f
    if-lez v7, :cond_13

    const v4, 0x17010c

    goto :goto_1c

    :sswitch_50
    invoke-static {v11}, Ln8/ۢۡۨۨ;->ۣۡ۠۟(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->۟ۦۦ۟ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۠۠ۤۦ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lm5/ۣۢ۟ۧ;->ۡۦۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Lm4/۟ۧۤ۠;->۟ۢۧ۟ۢ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->ۣ۟۟۠۟(Ljava/lang/Object;)I

    move-result v7

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v7}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v4, v8}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۣ۟ۧۤۤ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v4, v7}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x1

    iput-boolean v4, v11, Lcom/auto/accept/ui/viewmodel/MainViewModel;->I:Z

    :sswitch_51
    invoke-static {v11}, Lj4/ۣۧۤ;->ۧۥۦۧ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0x17012b

    :goto_1d
    const v8, 0x17013c

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_1a

    goto :goto_1d

    :sswitch_52
    if-nez v7, :cond_14

    const v4, 0x170188

    goto :goto_1d

    :cond_14
    :sswitch_53
    const v4, 0x170169

    goto :goto_1d

    :sswitch_54
    invoke-static {v2}, Lv6/۟ۦۣۧۦ;->ۣ۟۠۟۠(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0x1701a7

    :goto_1e
    const v8, 0x1701b8

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_1b

    goto :goto_1e

    :sswitch_55
    if-eqz v7, :cond_15

    const v4, 0x17048f

    goto :goto_1e

    :cond_15
    :sswitch_56
    const v4, 0x170470

    goto :goto_1e

    :sswitch_57
    invoke-static {v2}, Lv7/ۤۦۧ۟;->۟ۡۡۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    const v4, 0x1704ae

    :goto_1f
    const v8, 0x1704bf

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_1c

    goto :goto_1f

    :sswitch_58
    if-lez v7, :cond_16

    const v4, 0x17050b

    goto :goto_1f

    :cond_16
    :sswitch_59
    const v4, 0x1704ec

    goto :goto_1f

    :sswitch_5a
    invoke-static {v11}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->ۢۧۢۤ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v4

    invoke-static {v2}, Lv7/ۤۦۧ۟;->۟ۡۡۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Lc1/ۣۡۢۦ;->ۡۨۢۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iput-boolean v2, v11, Lcom/auto/accept/ui/viewmodel/MainViewModel;->I:Z

    :sswitch_5b
    invoke-static {v3}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    const v2, 0x17052a

    :goto_20
    const v4, 0x17053b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1d

    goto :goto_20

    :sswitch_5c
    if-eqz v3, :cond_17

    const v2, 0x170812

    goto :goto_20

    :cond_17
    :sswitch_5d
    const v2, 0x170568

    goto :goto_20

    :sswitch_5e
    invoke-static {}, Lh7/ۥۥۢ۟;->ۨ۟ۡ۠()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2, v10}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0x170831

    :goto_21
    const v4, 0x170842

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1e

    goto :goto_21

    :cond_18
    :sswitch_5f
    const v2, 0x17086f

    goto :goto_21

    :sswitch_60
    if-eqz v3, :cond_18

    const v2, 0x17088e

    goto :goto_21

    :sswitch_61
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lf5/n;

    sget v4, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->ۣۣ۠۠:I

    xor-int/lit16 v4, v4, 0x3ce

    invoke-direct {v3, v6, v4}, Lf5/n;-><init>(Landroid/app/Application;I)V

    invoke-static {v2, v3}, Ld1/ۣۧۡۡ;->۟ۥ۟۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const v2, 0x1708ad

    :goto_22
    const v3, 0x1708be

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1f

    goto :goto_22

    :sswitch_62
    const v2, 0x1708cc

    goto :goto_22

    :catch_0
    move-exception v3

    :goto_23
    invoke-static {}, Lh7/ۥۥۢ۟;->ۨ۟ۡ۠()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3, v10}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v4

    const v3, 0x170929

    :goto_24
    const v6, 0x17093a

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_20

    goto :goto_24

    :sswitch_63
    if-eqz v4, :cond_19

    const v3, 0x170c11

    goto :goto_24

    :cond_19
    :sswitch_64
    const v3, 0x170bf2

    goto :goto_24

    :sswitch_65
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Lf5/n;

    sget v6, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۣۧ۟ۢ:I

    xor-int/lit16 v6, v6, -0x1e4

    invoke-direct {v4, v2, v6}, Lf5/n;-><init>(Landroid/app/Application;I)V

    invoke-static {v3, v4}, Ld1/ۣۧۡۡ;->۟ۥ۟۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_66
    move-object v2, v5

    goto/16 :goto_b

    :catch_1
    move-exception v4

    const v4, 0x170c30

    :goto_25
    const v9, 0x170c41

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_21

    goto :goto_25

    :sswitch_67
    const v4, 0x170c4f

    goto :goto_25

    :catch_2
    move-exception v2

    move-object v2, v4

    goto :goto_23

    :catch_3
    move-exception v2

    move-object v2, v6

    goto :goto_23

    :sswitch_68
    move v7, v4

    goto/16 :goto_13

    :sswitch_69
    move-object v3, v2

    move-object v6, v4

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_a
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
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_8
        0x36 -> :sswitch_20
        0x57 -> :sswitch_5b
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_1c
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1d
        0x35 -> :sswitch_69
        0xf3 -> :sswitch_1e
        0xfeb -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_29
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2e
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
        0x4c -> :sswitch_32
        0x53 -> :sswitch_68
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_37
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_38
        0x2d -> :sswitch_3b
        0x32 -> :sswitch_39
        0xdfb -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3d
        0x5f -> :sswitch_43
        0x7c -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_40
        0x36 -> :sswitch_41
        0x57 -> :sswitch_43
        0x74 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_44
        0x5bb -> :sswitch_45
        0x5d8 -> :sswitch_47
        0x5f9 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_48
        0x3e -> :sswitch_49
        0x5d -> :sswitch_51
        0x7c -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_4b
        0x36 -> :sswitch_4c
        0x55 -> :sswitch_51
        0x17dd84 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4e
        0x2d -> :sswitch_51
        0x6f -> :sswitch_4f
        0x1cc -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_52
        0x55 -> :sswitch_5b
        0x76 -> :sswitch_53
        0xb4 -> :sswitch_54
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_55
        0x537 -> :sswitch_57
        0x5c8 -> :sswitch_5b
        0x5e9 -> :sswitch_56
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_58
        0x53 -> :sswitch_5b
        0x72 -> :sswitch_59
        0x1b4 -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_5c
        0x53 -> :sswitch_66
        0x72 -> :sswitch_5d
        0xd29 -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_5f
        0x2d -> :sswitch_66
        0x73 -> :sswitch_60
        0xcc -> :sswitch_61
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_62
        0x72 -> :sswitch_66
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_63
        0x2c8 -> :sswitch_66
        0x2e9 -> :sswitch_64
        0x52b -> :sswitch_65
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_3f
        0x71 -> :sswitch_67
    .end sparse-switch
.end method
