.class public final Lk0/g2;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Lb3/s;

.field public final c:Lc9/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lb3/s;Lc9/e;I)V
    .locals 2

    iput p3, p0, Lk0/g2;->a:I

    iput-object p1, p0, Lk0/g2;->b:Lb3/s;

    iput-object p2, p0, Lk0/g2;->c:Lc9/e;

    sget v0, Le1/۟ۡۡۤۡ;->۟ۡ۠ۤۧ:I

    xor-int/lit16 v0, v0, -0x15e

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

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
    const-string v0, "9ZNWb5vSurLGYfS"

    invoke-static {v0}, Lr2/ۧۧۢۢ;->ۥۥ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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
    .locals 7

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {p0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->ۣۣ۟ۢۦ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lt9/ۧۦۥ۟;->۟ۦۢ۟ۢ(Ljava/lang/Object;)Lc9/e;

    move-result-object v2

    invoke-static {p0}, Lu4/۟ۡۢۦۣ;->ۣ۟ۦۧۨ(Ljava/lang/Object;)Lb3/s;

    move-result-object v3

    packed-switch v0, :pswitch_data_0

    sget v1, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣ۟۠۠ۧ:I

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
    xor-int/lit16 v0, v1, 0x102

    and-int/2addr v0, p2

    if-ne v0, v5, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v4, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

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
    invoke-static {}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۦ۟ۧۢ()Lm0/m3;

    move-result-object v0

    invoke-static {v0, v3}, Lu2/۟ۥۢۥۨ;->۠ۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/v1;

    move-result-object v0

    invoke-static {v0, v2, p1, v6}, Lr2/۠ۨۦۢ;->۟ۥۣۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_4

    :pswitch_0
    sget v1, Lr5/۟ۤۨۥۡ;->۠ۦۦۦ:I

    const v0, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v0, 0xbf39

    goto :goto_5

    :sswitch_c
    xor-int/lit8 v0, v1, 0x1

    and-int/2addr v0, p2

    if-ne v0, v5, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_d
    move-object v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    if-nez v4, :cond_3

    const v1, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_f
    const v1, 0xc240

    goto :goto_6

    :sswitch_10
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_11
    invoke-static {}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۦ۟ۧۢ()Lm0/m3;

    move-result-object v0

    invoke-static {v0, v3}, Lu2/۟ۥۢۥۨ;->۠ۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/v1;

    move-result-object v0

    invoke-static {v0, v2, p1, v6}, Lr2/۠ۨۦۢ;->۟ۥۣۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    :sswitch_12
    invoke-static {}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۥۦۥۧ()I

    move-result v1

    const v0, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    if-gtz v1, :cond_4

    const v0, 0xc65e

    goto :goto_8

    :sswitch_14
    const v0, 0xc29d

    goto :goto_7

    :sswitch_15
    invoke-static {v0}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_9
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    const v0, 0xc5a4

    goto :goto_9

    :cond_4
    :sswitch_17
    const v0, 0xc63f

    goto :goto_8

    :sswitch_18
    const-string v0, "SOwPuGgauaV"

    invoke-static {v0}, La/ۥۦۥۡ;->ۤۢ۠ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x13 -> :sswitch_13
        0x2d -> :sswitch_8
        0x32 -> :sswitch_17
        0x4c -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_12
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->ۣۣ۟ۢۦ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lt2/۟ۧۢ۟ۢ;->ۣۣۢۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lt2/۟ۧۢ۟ۢ;->ۣۣۢۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
