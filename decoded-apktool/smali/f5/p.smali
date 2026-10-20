.class public final Lf5/p;
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

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/p;->short:[S

    return-void

    :array_0
    .array-data 2
        0x19as
        0x198s
        0x195s
        0x195s
        0x1d9s
        0x18ds
        0x196s
        0x1d9s
        0x1des
        0x18bs
        0x19cs
        0x18as
        0x18cs
        0x194s
        0x19cs
        0x1des
        0x1d9s
        0x19bs
        0x19cs
        0x19fs
        0x196s
        0x18bs
        0x19cs
        0x1d9s
        0x1des
        0x190s
        0x197s
        0x18fs
        0x196s
        0x192s
        0x19cs
        0x1des
        0x1d9s
        0x18es
        0x190s
        0x18ds
        0x191s
        0x1d9s
        0x19as
        0x196s
        0x18bs
        0x196s
        0x18cs
        0x18ds
        0x190s
        0x197s
        0x19cs
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/p;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/p;->c:Ljava/lang/String;

    sget v0, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۦۣۢۢ:I

    xor-int/lit16 v0, v0, 0x19f

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->ۢۧۦۨ()I

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
    const-string v0, "bLGMhiDabLh"

    invoke-static {v0}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۢۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۣ۟۟۠ۤ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->۟ۦۣۧ۟()I

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
    sget-object v0, Lf5/p;->short:[S

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

    const-string v3, "\u06e2\u06e7\u06e5"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/iid/ۥۣۣۡ;->۟ۤۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e7\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۤ۠ۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e5\u06e5\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    new-instance p0, Lf5/p;

    invoke-direct {p0, v0, v2, p2}, Lf5/p;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V

    const-string v1, "\u06df\u06e8\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0xdcde -> :sswitch_1
        0x1aa81d -> :sswitch_2
        0x1ab340 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e1\u06e2\u06e8"

    move-object v2, p1

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e7\u06e6\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Lf5/p;

    const-string v6, "\u06df\u06df\u06e5"

    move-object p0, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4}, Laa/ۣۣ۟۟;->۟ۤۢۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e8\u06e6\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5, v3}, Li/ۢۥۣ۟;->۟۟ۡۡ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e2\u06e8\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e3\u06df\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e5\u06e5\u06e1"

    move-object v4, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa705 -> :sswitch_4
        0x1aaee7 -> :sswitch_3
        0x1ab35c -> :sswitch_0
        0x1abe41 -> :sswitch_1
        0x1ac5e6 -> :sswitch_2
        0x1ac9a8 -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v4, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {p0}, Lm0/۟ۤۡۤۤ;->ۧۢ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۤ۠ۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v3

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
    if-ne v2, v4, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
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

    :sswitch_8
    check-cast v0, Ljava/lang/String;

    invoke-static {v3}, Lp3/۟ۢ۟۟ۥ;->ۧ۠ۦۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v1, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :goto_3
    return-object v0

    :sswitch_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/p;->ۣ۟۟۠ۤ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/android/gms/common/ۦۢۨ;->ۦۢۥۧ:I

    xor-int/lit16 v3, v3, 0x273

    const/16 v4, 0x1f9

    invoke-static {v1, v2, v3, v4}, La2/۟ۡۥۦ۟;->ۥۤ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_a
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v3}, Lr5/۟ۤۨۥۡ;->ۤۢۧۤ(Ljava/lang/Object;)La5/z;

    move-result-object v0

    iput v4, p0, Lf5/p;->a:I

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lcom/google/firebase/ktx/ۡ۟ۢ;->۟ۧۡ۟ۧ()Lt9/c;

    move-result-object v0

    new-instance v2, La5/n;

    invoke-static {p0}, Lcom/google/firebase/iid/ۥۣۣۡ;->۟ۤۥۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, La5/n;-><init>(Ljava/lang/String;Lu8/e;)V

    invoke-static {v0, v2, p0}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->۟ۦۨۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v2, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_b
    const v2, 0xbebd

    goto :goto_4

    :sswitch_c
    if-ne v0, v1, :cond_2

    const v2, 0xbedc

    goto :goto_4

    :sswitch_d
    move-object v0, v1

    goto :goto_3

    nop

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
        0xe -> :sswitch_b
        0x2d -> :sswitch_8
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch
.end method
