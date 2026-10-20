.class public final Lk0/s2;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:I

.field public final b:Lk0/x2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk0/x2;I)V
    .locals 2

    iput p2, p0, Lk0/s2;->a:I

    iput-object p1, p0, Lk0/s2;->b:Lk0/x2;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lp5/۟ۡۧۡۨ;->۟۟۠ۢ۟()I

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
    const-string v0, "6dpbUuq"

    invoke-static {v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۦۨۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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
.method public final invoke()Ljava/lang/Object;
    .locals 6

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {}, Lz7/۟ۢۧۡۥ;->۟۠ۢ۠ۡ()Lk0/l3;

    move-result-object v2

    invoke-static {}, Lo2/۟ۤۨۡۥ;->ۦۧۧۦ()Lk0/l3;

    move-result-object v3

    invoke-static {p0}, Lz1/۟ۦ۟۠۟;->۟ۧۡۤ۟(Ljava/lang/Object;)Lk0/x2;

    move-result-object v1

    invoke-static {p0}, Lh7/۟۟ۧۨ۟;->۟ۧۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    invoke-static {v1}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v2

    invoke-static {v2}, Li9/ۨۨ۟;->۟ۦۨۥۨ(Ljava/lang/Object;)Z

    move-result v4

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
    if-eqz v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v3}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :pswitch_0
    invoke-static {v1}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v3

    invoke-static {v3}, Li9/ۨۨ۟;->۟ۦۨۥۨ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    if-eqz v4, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_5
    const v1, 0xbe41

    goto :goto_2

    :sswitch_6
    invoke-static {v3, v2}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    :sswitch_7
    return-object v0

    :pswitch_1
    packed-switch v4, :pswitch_data_2

    invoke-static {v1}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v2

    invoke-static {v2}, Li9/ۨۨ۟;->۟ۦۨۥۨ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_4

    :sswitch_9
    if-eqz v4, :cond_2

    const v1, 0xbedc

    goto :goto_4

    :sswitch_a
    invoke-static {v2, v3}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_b
    const v1, 0xbf1a

    goto :goto_5

    :pswitch_2
    invoke-static {v1}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v3

    invoke-static {v3}, Li9/ۨۨ۟;->۟ۦۨۥۨ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-eqz v4, :cond_3

    const v1, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_d
    const v1, 0xc240

    goto :goto_6

    :sswitch_e
    invoke-static {v3, v2}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_3
    invoke-static {v1}, Lv8/۟ۧۢ۟ۢ;->۟ۡۥۣ۟(Ljava/lang/Object;)Lm9/k;

    move-result-object v1

    invoke-static {v1}, Li9/ۨۨ۟;->۟ۦۨۥۨ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_f
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_10
    if-eqz v2, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_11
    invoke-static {v1, v3}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_12
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb918 -> :sswitch_7
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_5
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_7
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_7
        0x1f7 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_12
        0x54 -> :sswitch_11
        0xf1 -> :sswitch_10
    .end sparse-switch
.end method
