.class public final Lf0/m1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lt/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/m1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x281s
        0x283s
        0x28es
        0x28es
        0x2c2s
        0x296s
        0x28ds
        0x2c2s
        0x2c5s
        0x290s
        0x287s
        0x291s
        0x297s
        0x28fs
        0x287s
        0x2c5s
        0x2c2s
        0x280s
        0x287s
        0x284s
        0x28ds
        0x290s
        0x287s
        0x2c2s
        0x2c5s
        0x28bs
        0x28cs
        0x294s
        0x28ds
        0x289s
        0x287s
        0x2c5s
        0x2c2s
        0x295s
        0x28bs
        0x296s
        0x28as
        0x2c2s
        0x281s
        0x28ds
        0x290s
        0x28ds
        0x297s
        0x296s
        0x28bs
        0x28cs
        0x287s
    .end array-data
.end method

.method public constructor <init>(Lt/d;Lu8/e;)V
    .locals 3

    iput-object p1, p0, Lf0/m1;->b:Lt/d;

    sget v0, Lcom/google/firebase/firestore/util/ۣۣ۠;->ۢۦۡۡ:I

    xor-int/lit16 v0, v0, -0x23b

    invoke-direct {p0, v0, p2}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟ۡۦ۟()I

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
    const-string v0, "D48kyScWep"

    invoke-static {v0}, Lj3/۟ۧۧۦۤ;->۟۠ۦۧۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۧ۠۠ۤ()[S
    .locals 2

    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->ۣ۟ۡ۠()I

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
    sget-object v0, Lf0/m1;->short:[S

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

    const-string v1, "\u06e3\u06e2\u06e0"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance p0, Lf0/m1;

    invoke-direct {p0, v0, p2}, Lf0/m1;-><init>(Lt/d;Lu8/e;)V

    const-string v1, "\u06df\u06e8"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣ۟ۥۦۢ(Ljava/lang/Object;)Lt/d;

    move-result-object v0

    const-string v1, "\u06e2\u06e4\u06e0"

    goto :goto_0

    :sswitch_1
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_1
        0x1ab661 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e4\u06e3\u06e7"

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, p1

    move-object v2, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e3\u06e7\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e5\u06e1\u06e0"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۣ۟ۢۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e7\u06e2\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5, v3}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۟ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e1\u06e2\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Lf0/m1;

    const-string v6, "\u06e3\u06e1\u06e8"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e6\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaee2 -> :sswitch_3
        0x1ab6ff -> :sswitch_1
        0x1aba48 -> :sswitch_0
        0x1abaa2 -> :sswitch_2
        0x1abdc4 -> :sswitch_4
        0x1ac567 -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v5, 0x1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/ۣۡۧۥ;->ۣۧۤ۟(Ljava/lang/Object;)I

    move-result v2

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
    if-ne v2, v5, :cond_1

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
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf0/m1;->ۧ۠۠ۤ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Ldagger/hilt/components/ۡۧ۟;->ۣۨۢۤ:I

    xor-int/lit16 v3, v3, 0x22b

    const/16 v4, 0x2e2

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۧۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {}, Ll6/ۣۧۧۧ;->۟۠ۡۧۤ()Lf0/m0;

    move-result-object v1

    new-instance v2, Lf0/l1;

    invoke-static {p0}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣ۟ۥۦۢ(Ljava/lang/Object;)Lt/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lf0/l1;-><init>(Lt/d;Lu8/e;)V

    iput v5, p0, Lf0/m1;->a:I

    invoke-static {v1, v2, p0}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->۟ۦۨۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ne v2, v0, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :sswitch_c
    return-object v0

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
        0x4c -> :sswitch_c
        0xef -> :sswitch_a
    .end sparse-switch
.end method
