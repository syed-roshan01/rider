.class public final Ld5/b1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Lc9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lc9/a;I)V
    .locals 2

    iput p2, p0, Ld5/b1;->a:I

    iput-object p1, p0, Ld5/b1;->b:Lc9/a;

    sget v0, Lcom/google/firebase/encoders/config/ۣۧۦ;->ۡۤۧۤ:I

    xor-int/lit16 v0, v0, -0x268

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۢ۠۠۟()I

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
    const-string v0, "brL4Wdgm"

    invoke-static {v0}, Lx5/ۡۦۦۥ;->ۥۣۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
    .locals 9

    const/4 v5, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-static {p0}, Landroidx/core/content/ۣۣۣ۟;->ۣۧۢۤ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    sget v3, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۥ۠:I

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
    xor-int/lit16 v0, v3, -0x2dd

    and-int/2addr v0, p2

    if-ne v0, v5, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v4, :cond_1

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
    invoke-static {p0}, Lk7/۟ۤۥۡ;->ۣ۟ۤۡۤ(Ljava/lang/Object;)Lc9/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۣۧ۟ۤ()Lu0/b;

    move-result-object v5

    const v3, -0x3026b

    sget v4, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۥۣۣ۠:I

    xor-int v7, v3, v4

    sget v3, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۨۦۡ:I

    xor-int/lit16 v8, v3, -0xf0

    move-object v3, v1

    move-object v4, v1

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۦ۠۟۠(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_4

    :pswitch_0
    sget v3, Lia/۟۠ۡۦ۟;->۟ۥۥۧۡ:I

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
    xor-int/lit8 v0, v3, 0x74

    and-int/2addr v0, p2

    if-ne v0, v5, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_d
    move-object v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const v3, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    if-nez v4, :cond_3

    const v3, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_f
    const v3, 0xc240

    goto :goto_6

    :sswitch_10
    const v0, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_11
    invoke-static {p0}, Lk7/۟ۤۥۡ;->ۣ۟ۤۡۤ(Ljava/lang/Object;)Lc9/a;

    move-result-object v0

    invoke-static {}, Lp0/۟ۢۤۧ;->ۨ۠۠۟()Lu0/b;

    move-result-object v5

    const v3, -0x30036

    sget v4, Lq1/۠۠ۤ;->ۣۣ۟ۡۤ:I

    xor-int v7, v3, v4

    sget v3, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->ۣ۟ۦ۟ۨ:I

    xor-int/lit16 v8, v3, -0xdb

    move-object v3, v1

    move-object v4, v1

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۦ۠۟۠(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_4

    :sswitch_12
    const v0, 0xc29d

    goto :goto_7

    :sswitch_13
    invoke-static {v0}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    const v0, 0xc5a4

    goto :goto_8

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
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_8
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Landroidx/core/content/ۣۣۣ۟;->ۣۧۢۤ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lp8/۟۟ۢ۟ۢ;->ۣۣۣ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lp8/۟۟ۢ۟ۢ;->ۣۣۣ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
