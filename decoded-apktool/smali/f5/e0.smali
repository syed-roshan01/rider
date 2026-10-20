.class public final Lf5/e0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/e0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x253s
        0x251s
        0x25cs
        0x25cs
        0x210s
        0x244s
        0x25fs
        0x210s
        0x217s
        0x242s
        0x255s
        0x243s
        0x245s
        0x25ds
        0x255s
        0x217s
        0x210s
        0x252s
        0x255s
        0x256s
        0x25fs
        0x242s
        0x255s
        0x210s
        0x217s
        0x259s
        0x25es
        0x246s
        0x25fs
        0x25bs
        0x255s
        0x217s
        0x210s
        0x247s
        0x259s
        0x244s
        0x258s
        0x210s
        0x253s
        0x25fs
        0x242s
        0x25fs
        0x245s
        0x244s
        0x259s
        0x25es
        0x255s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/e0;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/e0;->c:Ljava/lang/String;

    iput-object p3, p0, Lf5/e0;->d:Ljava/lang/String;

    iput-object p4, p0, Lf5/e0;->e:Ljava/lang/String;

    sget v0, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۣ۟۟ۡ:I

    xor-int/lit16 v0, v0, -0x30b

    invoke-direct {p0, v0, p5}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟۟ۦۦ()I

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
    const-string v0, "okKrph9C6y9lWjIckm"

    invoke-static {v0}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->۟ۦۡ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟۟ۢۢۦ()[S
    .locals 2

    invoke-static {}, La7/۠ۢۧ;->ۣۤ۟ۤ()I

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
    sget-object v0, Lf5/e0;->short:[S

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
    .locals 6

    const/4 v0, 0x0

    const-string v5, "\u06e7\u06e3\u06e5"

    move-object v2, v0

    move-object v1, v0

    move-object v4, v0

    move-object v3, v0

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-object p0

    :sswitch_0
    invoke-static {p0}, Lj5/۟ۢۥۨۦ;->۟ۥۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    const-string v0, "\u06e7\u06df\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lm7/ۥۨۥ۟;->ۣ۟ۧۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "\u06e1\u06e2\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->۟ۧۥۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "\u06e6\u06e6\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lc7/۟ۦۣۢۦ;->ۨۥۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\u06e8\u06e3\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Lf5/e0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lf5/e0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    const-string v5, "\u06e6\u06e3\u06e7"

    move-object p0, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaee7 -> :sswitch_3
        0x1ac224 -> :sswitch_4
        0x1ac50f -> :sswitch_1
        0x1ac589 -> :sswitch_0
        0x1ac94c -> :sswitch_2
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e6\u06e6\u06e4"

    move-object v2, p1

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lf5/e0;

    const-string v6, "\u06e3\u06e6\u06e1"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e0\u06df\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۥۧ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e3\u06e0\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e6\u06e5"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e6\u06e2\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v3}, Lh6/ۧۧۤ۟;->ۣۤۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e7\u06e5\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaac5 -> :sswitch_4
        0x1ab6de -> :sswitch_0
        0x1abaa3 -> :sswitch_1
        0x1ac1a7 -> :sswitch_2
        0x1ac224 -> :sswitch_3
        0x1ac5c2 -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v6

    invoke-static {p0}, Lcom/google/firebase/ktx/ۡ۟ۢ;->ۣۨۡ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lj5/۟ۢۥۨۦ;->۟ۥۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v7

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
    if-ne v1, v5, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    check-cast p1, Lq8/h;

    invoke-static {p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/e0;->۟۟ۢۢۦ()[S

    move-result-object v1

    sget v2, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    xor-int/lit16 v2, v2, 0xcb

    const/16 v3, 0x230

    invoke-static {v1, v4, v2, v3}, Lg5/ۣۡۦۣ;->ۣ۟ۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v7}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۢۡ۠۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lr9/۟ۢۢۤۨ;->ۨۤۥۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, v8}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->۟ۥۦۨۦ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۟ۡۡۨۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣۢۤۥ(Ljava/lang/Object;)J

    move-result-wide v2

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move v4, v5

    :sswitch_d
    invoke-static {v7}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->ۦۡ۠ۦ(Ljava/lang/Object;)La4/q;

    move-result-object v0

    invoke-static {p0}, Lm7/ۥۨۥ۟;->ۣ۟ۧۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lc7/۟ۦۣۢۦ;->ۨۥۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->۟ۧۥۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput v5, p0, Lf5/e0;->a:I

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lh6/ۧۧۤ۟;->ۧۧۡ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-ne v1, v6, :cond_3

    const v0, 0xc25f

    goto :goto_5

    :sswitch_f
    const v0, 0xbf1a

    goto :goto_4

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_5

    :sswitch_11
    move-object v0, v6

    :goto_6
    return-object v0

    :sswitch_12
    instance-of v2, v1, Lq8/g;

    const v0, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_14
    xor-int/lit8 v0, v2, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v3, v2, -0x2

    or-int/2addr v0, v3

    if-eqz v0, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_15
    move-object v0, v1

    check-cast v0, Lcom/auto/accept/data/model/CouponData;

    invoke-static {v7}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۥۦۨ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v2

    invoke-static {v2, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lr9/۟ۢۢۤۨ;->ۨۤۥۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, v8}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_16
    invoke-static {v1}, Lz1/۟ۦ۟۠۟;->ۦ۟ۥۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    if-eqz v1, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_18
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_19
    invoke-static {v7}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۥۦۨ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, v8}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7}, Lr9/۟ۢۢۤۨ;->ۨۤۥۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v1, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1a
    invoke-static {v7}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۢۡ۠۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    goto :goto_6

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
        0xb97b -> :sswitch_12
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_d
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_16
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_19
    .end sparse-switch
.end method
