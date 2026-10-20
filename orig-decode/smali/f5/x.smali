.class public final Lf5/x;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x52

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/x;->short:[S

    return-void

    :array_0
    .array-data 2
        0xc70s
        0xc72s
        0xc7fs
        0xc7fs
        0xc33s
        0xc67s
        0xc7cs
        0xc33s
        0xc34s
        0xc61s
        0xc76s
        0xc60s
        0xc66s
        0xc7es
        0xc76s
        0xc34s
        0xc33s
        0xc71s
        0xc76s
        0xc75s
        0xc7cs
        0xc61s
        0xc76s
        0xc33s
        0xc34s
        0xc7as
        0xc7ds
        0xc65s
        0xc7cs
        0xc78s
        0xc76s
        0xc34s
        0xc33s
        0xc64s
        0xc7as
        0xc67s
        0xc7bs
        0xc33s
        0xc70s
        0xc7cs
        0xc61s
        0xc7cs
        0xc66s
        0xc67s
        0xc7as
        0xc7ds
        0xc76s
        0x4ces
        0x4e9s
        0x4e1s
        0x4e4s
        0x4eds
        0x4ecs
        0x4a8s
        0x4fcs
        0x4e7s
        0x4a8s
        0x4fbs
        0x4eds
        0x4e6s
        0x4ecs
        0x4a8s
        0x4fes
        0x4eds
        0x4fas
        0x4e1s
        0x4ees
        0x4e1s
        0x4ebs
        0x4e9s
        0x4fcs
        0x4e1s
        0x4e7s
        0x4e6s
        0x4a8s
        0x4eds
        0x4e5s
        0x4e9s
        0x4e1s
        0x4e4s
        0x4b2s
        0x4a8s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/x;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    sget v0, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/lit16 v0, v0, 0x2ca

    invoke-direct {p0, v0, p2}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۢۥ۟۠()I

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
    const-string v0, "xWIRKxUs00z"

    invoke-static {v0}, Lg5/۟ۥۨۤ;->۟ۦۧ۠ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۥۨۢۨ()[S
    .locals 2

    invoke-static {}, Lv9/۟۟ۤۥ;->ۣ۟۟ۧ۠()I

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
    sget-object v0, Lf5/x;->short:[S

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

    const-string v1, "\u06e1\u06e0\u06e2"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lo1/۟ۡۡۦۣ;->۟ۦۦ۟۠(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e7\u06e8\u06e4"

    goto :goto_0

    :sswitch_0
    new-instance p0, Lf5/x;

    invoke-direct {p0, v0, p2}, Lf5/x;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    const-string v1, "\u06e7\u06e4\u06e2"

    goto :goto_0

    :sswitch_1
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1ac5a5 -> :sswitch_1
        0x1ac623 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e8\u06e6\u06e8"

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

    const-string v6, "\u06e1\u06e4\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e7\u06e0\u06e8"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4, v5}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->ۣۢۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e3\u06e3\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v3}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۤۢ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e3\u06e0\u06e7"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lf5/x;

    const-string v6, "\u06e6\u06e4\u06e8"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e1\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_1
        0x1aaf25 -> :sswitch_4
        0x1ab62a -> :sswitch_5
        0x1ab686 -> :sswitch_3
        0x1ac1ea -> :sswitch_0
        0x1ac52f -> :sswitch_2
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v4, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v0

    invoke-static {p0}, Ll8/ۢۦۥۢ;->ۣ۟ۤ۠۠(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lo1/۟ۡۡۦۣ;->۟ۦۦ۟۠(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

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
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v2, v4, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
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
    move-object v0, p1

    :goto_3
    check-cast v0, Ljava/lang/Void;

    :sswitch_8
    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xc2fa

    :goto_4
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    const v0, 0xc5a4

    goto :goto_4

    :catch_0
    move-exception v0

    const v1, 0xbe7f

    :goto_5
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_a
    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {}, Lf5/x;->۟ۥۨۢۨ()[S

    move-result-object v3

    const/16 v4, 0x2f

    sget v5, La6/۟ۤۨۨ۟;->۟۠۠ۢۥ:I

    xor-int/lit16 v5, v5, -0x184

    const/16 v6, 0x488

    invoke-static {v3, v4, v5, v6}, Lh3/۟ۡۥ۠۠;->۟۠۟ۨ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_b
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :sswitch_c
    return-object v0

    :sswitch_d
    const v1, 0xbe9e

    goto :goto_5

    :sswitch_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/x;->۟ۥۨۢۨ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lj9/۠۠ۨ;->۟ۢۦۤۡ:I

    xor-int/lit16 v3, v3, 0x368

    const/16 v4, 0xc13

    invoke-static {v1, v2, v3, v4}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۣ۟ۢۤۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_f
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {v3}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v1

    invoke-static {v1}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟ۦۡۡۢ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-static {v1}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v2

    const v1, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :cond_2
    :sswitch_10
    const v1, 0xbf39

    goto :goto_6

    :sswitch_11
    if-eqz v2, :cond_2

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_12
    invoke-static {v2}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۣۣ۠ۧ(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    const v1, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    if-eqz v2, :cond_3

    const v1, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_14
    const v1, 0xc240

    goto :goto_7

    :sswitch_15
    const/4 v1, 0x1

    iput v1, p0, Lf5/x;->a:I

    invoke-static {v2, p0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->ۡۤ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object p1

    const v1, 0xc27e

    :goto_8
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :cond_4
    :sswitch_16
    const v1, 0xc2bc

    goto :goto_8

    :sswitch_17
    if-ne p1, v0, :cond_4

    const v1, 0xc2db

    goto :goto_8

    :sswitch_18
    move-object v0, p1

    goto/16 :goto_3

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
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x1f1 -> :sswitch_9
        0x6af -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_16
        0x33 -> :sswitch_18
        0x54 -> :sswitch_c
        0xf1 -> :sswitch_17
    .end sparse-switch
.end method
