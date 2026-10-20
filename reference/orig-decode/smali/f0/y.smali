.class public final Lf0/y;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Lf0/c2;

.field public final b:Lc1/k;

.field public final c:Z

.field public final d:Lh0/v0;

.field public final e:Lg2/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/c2;Lc1/k;ZLh0/v0;Lg2/s;)V
    .locals 2

    iput-object p1, p0, Lf0/y;->a:Lf0/c2;

    iput-object p2, p0, Lf0/y;->b:Lc1/k;

    iput-boolean p3, p0, Lf0/y;->c:Z

    iput-object p4, p0, Lf0/y;->d:Lh0/v0;

    iput-object p5, p0, Lf0/y;->e:Lg2/s;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ll0/ۡۦۦۡ;->ۣ۟ۤ۟()I

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
    const-string v0, "HK1tr7N"

    invoke-static {v0}, Lv0/۟ۦۣ۟ۤ;->ۨۧ۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ld1/c;

    invoke-static {p1}, Laa/۟ۦۣۢۨ;->۠۟ۢۤ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p0}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۥۦۦۡ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {p0}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟ۤۢ۟ۡ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v4

    invoke-static {v4}, Lj2/ۥ۠ۨۢ;->۟ۡۦۥۦ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lb3/۟ۧ۠ۡۥ;->ۤ۠ۧۥ(Ljava/lang/Object;)Lc1/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۣۧۦۨ(Ljava/lang/Object;)Z

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    xor-int/lit8 v0, v1, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v5, v1, -0x2

    or-int/2addr v0, v5

    if-eqz v0, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {v4}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۡۧ۟ۥ(Ljava/lang/Object;)Lu1/t2;

    move-result-object v0

    const v1, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v0, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    check-cast v0, Lu1/u1;

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟۠ۨ۠۟(Ljava/lang/Object;)Lg2/b0;

    move-result-object v5

    invoke-static {v5}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lz7/۠ۡ۟ۦ;->۟۟ۡۧۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/h0;

    const v1, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v1, 0xbf39

    goto :goto_4

    :sswitch_c
    if-eqz v0, :cond_3

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_d
    invoke-static {v5}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->۟ۤۨۢ(Ljava/lang/Object;)Lg2/v;

    move-result-object v0

    check-cast v0, Lg2/e0;

    invoke-static {}, La/ۥۡۢۨ;->۟ۤ۠ۧۦ()Lg2/c0;

    move-result-object v1

    invoke-static {v0, v1}, Lq9/۟ۧۦۤۨ;->۟ۢۧ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_e
    invoke-static {v4}, Lj2/ۥ۠ۨۢ;->۟ۡۦۥۦ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_5
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v1, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v4}, Lo4/۟۟ۡۧۤ;->ۣۤۢ۠(Ljava/lang/Object;)Lf0/o0;

    move-result-object v1

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۣۡۧۨ()Lf0/o0;

    move-result-object v5

    const v0, 0xc27e

    :goto_6
    const v6, 0xc28f

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_13
    if-eq v1, v5, :cond_5

    const v0, 0xc2db

    goto :goto_6

    :sswitch_14
    invoke-static {v4}, Lz3/۟ۡ۠ۦۣ;->۟۟ۡ۠۟(Ljava/lang/Object;)Lf0/d2;

    move-result-object v1

    const v0, 0xc2fa

    :goto_7
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    if-eqz v1, :cond_6

    const v0, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_17
    const/4 v0, 0x1

    invoke-static {v1, v2, v3, v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->۟۟ۤۥۡ(Ljava/lang/Object;JZ)I

    move-result v0

    invoke-static {p0}, Ll8/ۢۦۥۢ;->ۥۧۤۥ(Ljava/lang/Object;)Lg2/s;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۣۨ۠ۤ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {v4}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۣۥۦۥ(Ljava/lang/Object;)Lg2/j;

    move-result-object v1

    invoke-static {v1}, Ls/ۣۡۡۧ;->۟ۦۣۨۨ(Ljava/lang/Object;)Lg2/a0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v0}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۢۤۧ(II)J

    move-result-wide v6

    sget v0, Lm1/۟ۧۥ۟ۨ;->۟ۤۢۤۧ:I

    xor-int/lit16 v0, v0, -0x2cb

    invoke-static {v1, v2, v6, v7, v0}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۧۤۧۤ(Ljava/lang/Object;Ljava/lang/Object;JI)Lg2/a0;

    move-result-object v0

    invoke-static {v4}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۡۨۦۥ(Ljava/lang/Object;)Lf0/v;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۧۢۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Li6/ۡۤۦ;->۟ۢ۠ۡ۠(Ljava/lang/Object;)Lf0/j1;

    move-result-object v0

    invoke-static {v0}, Ld2/۟ۦۡ۟ۦ;->ۨۤۧۤ(Ljava/lang/Object;)La2/e;

    move-result-object v0

    invoke-static {v0}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v1

    const v0, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_18
    if-lez v1, :cond_7

    const v0, 0xc65e

    goto :goto_8

    :cond_7
    :sswitch_19
    const v0, 0xc63f

    goto :goto_8

    :sswitch_1a
    invoke-static {}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۠۟ۥۥ()Lf0/o0;

    move-result-object v0

    invoke-static {v4}, Lm5/ۣۢ۟ۧ;->ۤۢۧۤ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->۠ۤۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc67d

    :goto_9
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :goto_a
    :sswitch_1b
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_1c
    const v0, 0xc69c

    goto :goto_9

    :sswitch_1d
    new-instance v0, Ld1/c;

    invoke-direct {v0, v2, v3}, Ld1/c;-><init>(J)V

    invoke-static {p0}, Landroidx/startup/ۨۤ۟ۡ;->ۣ۟ۤۡۤ(Ljava/lang/Object;)Lh0/v0;

    move-result-object v1

    invoke-static {v1, v0}, Le1/ۦۣۢۥ;->۠ۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_1d
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1c
    .end sparse-switch
.end method
