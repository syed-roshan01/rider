.class public final Lf0/y1;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final a:Lf0/a2;

.field public final b:Z

.field public final c:Lx/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/a2;ZLx/m;)V
    .locals 2

    iput-object p1, p0, Lf0/y1;->a:Lf0/a2;

    iput-boolean p2, p0, Lf0/y1;->b:Z

    iput-object p3, p0, Lf0/y1;->c:Lx/m;

    sget v0, Lc1/ۢۥۥ۟;->ۣ۠ۡ۟:I

    xor-int/lit16 v0, v0, 0x337

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

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
    const-string v0, "2u"

    invoke-static {v0}, Lc1/ۢۥۥ۟;->ۣۨۢ(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v8, 0x0

    check-cast p1, Ly0/o;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-static {p3}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    check-cast p2, Lm0/q;

    const v0, 0x3001dcce

    sget v1, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    xor-int/2addr v0, v1

    invoke-static {p2, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {}, Lh3/ۣ۠ۡۨ;->۟ۧۥۣۢ()Lm0/m3;

    move-result-object v0

    invoke-static {p2, v0}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lg/۟ۦۥۥۤ;->ۥۦ۟ۧ()Lm2/l;

    move-result-object v2

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
    if-ne v1, v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    move v1, v4

    :goto_2
    invoke-static {p0}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->۟ۧۧۢ۠(Ljava/lang/Object;)Lf0/a2;

    move-result-object v7

    invoke-static {v7}, Ln7/۟ۡۢۦ;->ۡۥۧ۠(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    invoke-static {v0}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv/h1;

    invoke-static {}, Ll0/ۡۦۦۡ;->ۧۢۥ()Lv/h1;

    move-result-object v5

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eq v0, v5, :cond_1

    const v2, 0xbe60

    goto :goto_3

    :sswitch_6
    move v1, v8

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_3

    :sswitch_8
    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_4

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_b
    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_c
    move v5, v4

    :goto_6
    const v0, -0x49a6dcbe

    sget v1, Lc7/ۨۤۦۢ;->ۥ۟ۧۢ:I

    xor-int/2addr v0, v1

    invoke-static {p2, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {p2, v7}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p2}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۠ۨۥ()Lk0/y0;

    move-result-object v6

    const v1, 0xc27e

    :goto_7
    const v9, 0xc28f

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :cond_3
    :sswitch_d
    const v1, 0xc2bc

    goto :goto_7

    :sswitch_e
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_f
    const v0, 0xc202

    :goto_8
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :sswitch_10
    const v0, 0xc221

    goto :goto_8

    :sswitch_11
    move v5, v8

    goto :goto_6

    :sswitch_12
    if-nez v2, :cond_3

    const v1, 0xc2db

    goto :goto_7

    :sswitch_13
    const v1, 0xc2fa

    :goto_9
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    if-ne v0, v6, :cond_4

    const v1, 0xc5e2

    goto :goto_9

    :cond_4
    :sswitch_15
    const v1, 0xc5c3

    goto :goto_9

    :sswitch_16
    new-instance v0, Lq/w;

    sget v1, Lb7/ۣ۟۟ۦ۟;->۟ۥ۟ۢۨ:I

    xor-int/lit16 v1, v1, 0x15b

    invoke-direct {v0, v7, v1}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, v0}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_17
    check-cast v0, Lc9/c;

    invoke-static {p2, v8}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v1, 0xac19c90

    sget v2, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۤۥۤ:I

    xor-int/2addr v1, v2

    invoke-static {p2, v1}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {v0, p2}, Landroidx/preference/۟ۤۥۦۧ;->ۦۣ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    const v0, 0x1d58f7b3

    sget v1, Ld9/ۡۥۣۡ;->۟ۥۥ۟۟:I

    xor-int/2addr v0, v1

    invoke-static {p2, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {p2}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v1, 0xc601

    :goto_a
    const v9, 0xc612

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-ne v0, v6, :cond_5

    const v1, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_19
    const v1, 0xc63f

    goto :goto_a

    :sswitch_1a
    new-instance v0, Lv/y;

    new-instance v1, Lv/s0;

    invoke-direct {v1, v2, v4}, Lv/s0;-><init>(Lm0/l3;I)V

    invoke-direct {v0, v1}, Lv/y;-><init>(Lc9/c;)V

    invoke-static {p2, v0}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1b
    invoke-static {p2, v8}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    check-cast v0, Lv/f2;

    invoke-static {p2, v8}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v1, 0x1e7b2a96

    sget v2, Lt9/ۧۦۥ۟;->ۣ۟ۦۣ:I

    xor-int/2addr v1, v2

    invoke-static {p2, v1}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    invoke-static {p2, v7}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    invoke-static {p2}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v2, 0xc67d

    :goto_b
    const v11, 0xc68e

    xor-int/2addr v2, v11

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :cond_6
    :sswitch_1c
    const v2, 0xc6bb

    goto :goto_b

    :sswitch_1d
    xor-int v2, v9, v10

    and-int v11, v9, v10

    or-int/2addr v2, v11

    if-nez v2, :cond_6

    const v2, 0xc965

    goto :goto_b

    :sswitch_1e
    const v2, 0xc984

    :goto_c
    const v9, 0xc995

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    if-ne v1, v6, :cond_7

    const v2, 0xc9e1

    goto :goto_c

    :cond_7
    :sswitch_20
    const v2, 0xc9c2

    goto :goto_c

    :sswitch_21
    new-instance v1, Lf0/x1;

    invoke-direct {v1, v0, v7}, Lf0/x1;-><init>(Lv/f2;Lf0/a2;)V

    invoke-static {p2, v1}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_22
    invoke-static {p2, v8}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    check-cast v1, Lf0/x1;

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۢۥۢ()Ly0/l;

    move-result-object v0

    invoke-static {v7}, Ln7/۟ۡۢۦ;->ۡۥۧ۠(Ljava/lang/Object;)Lm0/n1;

    move-result-object v2

    invoke-static {v2}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv/h1;

    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۦۦۢۤ(Ljava/lang/Object;)Z

    move-result v9

    const v6, 0xca00

    :goto_d
    const v10, 0xca11

    xor-int/2addr v6, v10

    sparse-switch v6, :sswitch_data_b

    goto :goto_d

    :cond_8
    :sswitch_23
    const v6, 0xca3e

    goto :goto_d

    :sswitch_24
    if-eqz v9, :cond_8

    const v6, 0xca5d

    goto :goto_d

    :sswitch_25
    invoke-static {v7}, Landroidx/lifecycle/ۧۥۡۨ;->ۢۨ۟ۥ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v6

    invoke-static {v6}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v7

    const v6, 0xca7c

    :goto_e
    const v9, 0xca8d

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_c

    goto :goto_e

    :sswitch_26
    const/4 v6, 0x0

    cmpg-float v6, v7, v6

    if-nez v6, :cond_9

    const v6, 0xcd64

    goto :goto_e

    :cond_9
    :sswitch_27
    const v6, 0xcd45

    goto :goto_e

    :sswitch_28
    const v4, 0xcd83

    :goto_f
    const v6, 0xcd94

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_d

    goto :goto_f

    :sswitch_29
    const v4, 0xcda2

    goto :goto_f

    :sswitch_2a
    const v6, 0xcdff

    :goto_10
    const v7, 0xce10

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_e

    goto :goto_10

    :goto_11
    :sswitch_2b
    invoke-static {p0}, Lea/ۦۦۨۨ;->ۨۥۦ۠(Ljava/lang/Object;)Lx/m;

    move-result-object v7

    move-object v6, v3

    invoke-static/range {v0 .. v7}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->۟ۧۨۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v0

    invoke-static {p2, v8}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    return-object v0

    :sswitch_2c
    const v6, 0xce1e

    goto :goto_10

    :sswitch_2d
    move v4, v8

    goto :goto_11

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x12 -> :sswitch_d
        0x33 -> :sswitch_16
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_17
        0x6e9 -> :sswitch_16
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
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_22
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_23
        0x11 -> :sswitch_24
        0x2f -> :sswitch_2d
        0x4c -> :sswitch_25
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_26
        0x7ab -> :sswitch_27
        0x7c8 -> :sswitch_2a
        0x7e9 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_29
        0x36 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2b
        0x3ef -> :sswitch_2c
    .end sparse-switch
.end method
