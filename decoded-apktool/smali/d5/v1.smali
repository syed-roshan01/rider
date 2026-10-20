.class public final Ld5/v1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Lc9/a;

.field public final c:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lc9/a;Lm0/g1;I)V
    .locals 2

    iput p3, p0, Ld5/v1;->a:I

    iput-object p1, p0, Ld5/v1;->b:Lc9/a;

    iput-object p2, p0, Ld5/v1;->c:Lm0/g1;

    sget v0, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->۟ۥۨۤ۠:I

    xor-int/lit16 v0, v0, 0x2e6

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lp3/۟ۢ۟۟ۥ;->ۣ۠ۧۧ()I

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
    const-string v0, "vj"

    invoke-static {v0}, Lm5/۟ۥۣۧۥ;->ۥۤۡ۠(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 13

    const/4 v8, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۠ۨۥ()Lk0/y0;

    move-result-object v4

    invoke-static {p0}, Li6/ۡۤۦ;->۟۠ۥۦ۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۟ۦۢۤۤ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v5

    invoke-static {p0}, Lz3/ۦۤۡۤ;->۟ۢ۟ۤۥ(Ljava/lang/Object;)Lc9/a;

    move-result-object v6

    packed-switch v0, :pswitch_data_0

    sget v3, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۦۥۥۨ:I

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
    xor-int/lit16 v0, v3, 0x312

    and-int/2addr v0, p2

    if-ne v0, v8, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v7

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v7, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    return-void

    :sswitch_9
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_a
    move-object v10, p1

    check-cast v10, Lm0/q;

    const v0, 0x7eb0b04e

    sget v3, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۥۤۦ:I

    xor-int/2addr v0, v3

    invoke-static {v10, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {v10, v6}, Lg3/۟ۥۣۣۥ;->ۡۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    invoke-static {v10}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v3, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v3, 0xbf39

    goto :goto_5

    :sswitch_c
    if-nez v7, :cond_2

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_d
    const v3, 0xc202

    :goto_6
    const v7, 0xc213

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    if-ne v0, v4, :cond_3

    const v3, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_f
    const v3, 0xc240

    goto :goto_6

    :sswitch_10
    new-instance v0, Ld5/u1;

    const/4 v3, 0x1

    invoke-direct {v0, v6, v5, v3}, Ld5/u1;-><init>(Lc9/a;Lm0/g1;I)V

    invoke-static {v10, v0}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_11
    check-cast v0, Lc9/a;

    invoke-static {v10, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۥۡۢۢ()Lu0/b;

    move-result-object v9

    const v3, -0x300002b7

    sget v4, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣ۟۟ۦۨ:I

    xor-int v11, v3, v4

    sget v3, Lh1/۟۟ۨۦۦ;->ۣۣ۟ۢۨ:I

    xor-int/lit16 v12, v3, -0x311

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    invoke-static/range {v0 .. v12}, Ls/ۧۥ۟۟;->۟ۤ۠ۢۧ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_4

    :pswitch_0
    sget v3, Lu/ۤ;->۠ۦۧۥ:I

    const v0, 0xc27e

    :goto_7
    const v7, 0xc28f

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_13
    xor-int/lit16 v0, v3, 0x143

    and-int/2addr v0, p2

    if-ne v0, v8, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_14
    move-object v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v7

    const v3, 0xc2fa

    :goto_8
    const v8, 0xc30b

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-nez v7, :cond_5

    const v3, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_16
    const v3, 0xc5c3

    goto :goto_8

    :sswitch_17
    const v0, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    const v0, 0xc620

    goto :goto_9

    :sswitch_19
    invoke-static {v0}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_1a
    const v0, 0xc69c

    goto :goto_a

    :sswitch_1b
    move-object v10, p1

    check-cast v10, Lm0/q;

    const v0, 0x3c4e03b7

    sget v3, Lw2/۟ۧۥۦۨ;->ۥۥ۟۠:I

    xor-int/2addr v0, v3

    invoke-static {v10, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {v10, v6}, Lg3/۟ۥۣۣۥ;->ۡۡۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    invoke-static {v10}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v3, 0xc984

    :goto_b
    const v8, 0xc995

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_a

    goto :goto_b

    :sswitch_1c
    if-nez v7, :cond_6

    const v3, 0xc9e1

    goto :goto_b

    :cond_6
    :sswitch_1d
    const v3, 0xc9c2

    goto :goto_b

    :sswitch_1e
    const v3, 0xca00

    :goto_c
    const v7, 0xca11

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_b

    goto :goto_c

    :cond_7
    :sswitch_1f
    const v3, 0xca3e

    goto :goto_c

    :sswitch_20
    if-ne v0, v4, :cond_7

    const v3, 0xca5d

    goto :goto_c

    :sswitch_21
    new-instance v0, Ld5/u1;

    invoke-direct {v0, v6, v5, v2}, Ld5/u1;-><init>(Lc9/a;Lm0/g1;I)V

    invoke-static {v10, v0}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_22
    check-cast v0, Lc9/a;

    invoke-static {v10, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۥۡ۠۠()Lu0/b;

    move-result-object v9

    const v3, -0x300000d9

    sget v4, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣۤۢ۟:I

    xor-int v11, v3, v4

    sget v3, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۥۨ۠۠:I

    xor-int/lit16 v12, v3, -0x24b

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    invoke-static/range {v0 .. v12}, Ls/ۧۥ۟۟;->۟ۤ۠ۢۧ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto/16 :goto_4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_8
        0xf3 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1d
        0x57 -> :sswitch_21
        0x74 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1f
        0x11 -> :sswitch_20
        0x2f -> :sswitch_22
        0x4c -> :sswitch_21
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Li6/ۡۤۦ;->۟۠ۥۦ۠(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣ۠۟۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣ۠۟۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
