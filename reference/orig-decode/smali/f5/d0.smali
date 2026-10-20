.class public final Lf5/d0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/d0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x344s
        0x346s
        0x34bs
        0x34bs
        0x307s
        0x353s
        0x348s
        0x307s
        0x300s
        0x355s
        0x342s
        0x354s
        0x352s
        0x34as
        0x342s
        0x300s
        0x307s
        0x345s
        0x342s
        0x341s
        0x348s
        0x355s
        0x342s
        0x307s
        0x300s
        0x34es
        0x349s
        0x351s
        0x348s
        0x34cs
        0x342s
        0x300s
        0x307s
        0x350s
        0x34es
        0x353s
        0x34fs
        0x307s
        0x344s
        0x348s
        0x355s
        0x348s
        0x352s
        0x353s
        0x34es
        0x349s
        0x342s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;[BLu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/d0;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Lf5/d0;->c:Ljava/lang/String;

    iput-object p3, p0, Lf5/d0;->d:[B

    sget v0, Lb7/۟۟ۤۤۤ;->۟ۧۡۦۦ:I

    xor-int/lit16 v0, v0, -0x98

    invoke-direct {p0, v0, p4}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۧ۠۠ۨ()I

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
    const-string v0, "liIQCxW2Vfe34U1E"

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۧۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟ۡ۟۠()[S
    .locals 2

    invoke-static {}, Lh3/۟ۡۥ۠۠;->۟۠ۨ۠۠()I

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
    sget-object v0, Lf5/d0;->short:[S

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

    const-string v4, "\u06e3\u06e7\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Ls8/ۣۡۡ۠;->ۣ۟ۢۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e1\u06e4\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lz7/۟۟ۨۢۢ;->۟ۢۦۥۧ(Ljava/lang/Object;)[B

    move-result-object v1

    const-string v4, "\u06e6\u06e1\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    new-instance p0, Lf5/d0;

    invoke-direct {p0, v0, v2, v3, p2}, Lf5/d0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;[BLu8/e;)V

    const-string v1, "\u06e5\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->ۣۨۥۣ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e1\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1e -> :sswitch_1
        0x1aaf1d -> :sswitch_0
        0x1abdc8 -> :sswitch_3
        0x1ac185 -> :sswitch_2
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e2\u06e8\u06e4"

    move-object v3, v0

    move-object v1, p1

    move-object v2, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e1\u06e1\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v4}, Lh3/ۣ۟ۢۡۤ;->۟۠۟ۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e1\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e0\u06e7\u06e2"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e3\u06e0\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lf5/d0;

    const-string v6, "\u06e1\u06e3"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v5, v3}, Lv0/ۣۣۡۢ;->۟ۤۥۤۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e2\u06df\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_1
        0xdc24 -> :sswitch_5
        0x1aabbb -> :sswitch_0
        0x1aaec5 -> :sswitch_4
        0x1ab246 -> :sswitch_3
        0x1ab35e -> :sswitch_2
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v4, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v1

    invoke-static {p0}, Lz/۟ۥۣۣ۠;->۟ۤۢۢۥ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->ۣۨۥۣ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

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

    check-cast p1, Lq8/h;

    invoke-static {p1}, Ln/ۣۣۢۢ;->ۥ۟ۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

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

    invoke-static {}, Lf5/d0;->ۣ۟ۡ۟۠()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->۟۟ۥۢۡ:I

    xor-int/lit16 v3, v3, -0x30f

    const/16 v4, 0x327

    invoke-static {v1, v2, v3, v4}, Ls7/۟ۢ۟ۤۧ;->۟ۧۦۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v3}, Lr5/۟ۤۨۥۡ;->ۤۢۧۤ(Ljava/lang/Object;)La5/z;

    move-result-object v0

    iput v4, p0, Lf5/d0;->a:I

    invoke-static {p0}, Ls8/ۣۡۡ۠;->ۣ۟ۢۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lz7/۟۟ۨۢۢ;->۟ۢۦۥۧ(Ljava/lang/Object;)[B

    move-result-object v4

    invoke-static {v0, v2, v4, p0}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣۧۨۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ne v0, v1, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    move-object v0, v1

    :goto_4
    return-object v0

    :sswitch_c
    instance-of v2, v0, Lq8/g;

    const v1, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v1, 0xbf39

    goto :goto_5

    :sswitch_e
    xor-int/lit8 v1, v2, -0x1

    and-int/lit8 v1, v1, 0x1

    and-int/lit8 v4, v2, -0x2

    or-int/2addr v1, v4

    if-eqz v1, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_f
    check-cast v0, Ljava/lang/String;

    invoke-static {v3}, Lp3/۟ۢ۟۟ۥ;->ۧ۠ۦۧ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v1, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_10
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    goto :goto_4

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
        0xb97b -> :sswitch_c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch
.end method
