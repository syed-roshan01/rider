.class public final Lk0/h3;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Lk0/x2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk0/x2;I)V
    .locals 3

    iput p2, p0, Lk0/h3;->a:I

    iput-object p1, p0, Lk0/h3;->b:Lk0/x2;

    sget v0, Landroid/support/v4/app/۟۟۠ۡۥ;->۟ۢۤۢ۠:I

    xor-int/lit16 v0, v0, 0x3c0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

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
    const-string v0, "JVuZ1lsID1NbdceSDBuLHg"

    invoke-static {v0}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->۟ۡۤۤۨ(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 25

    invoke-static/range {p0 .. p0}, Lf0/ۣۤ۠۟;->ۣۨۤ۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static/range {p0 .. p0}, Lu4/ۧۦۦۧ;->۟ۦۣۨۢ(Ljava/lang/Object;)Lk0/x2;

    move-result-object v2

    packed-switch v0, :pswitch_data_0

    sget v1, Lu/ۤ;->۠ۦۧۥ:I

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
    xor-int/lit16 v0, v1, 0x14b

    and-int v0, v0, p2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

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
    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

    move-result v1

    const v0, 0xc27e

    :goto_5
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_9
    const v0, 0xc2bc

    goto :goto_5

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_b
    move-object/from16 v6, p1

    check-cast v6, Lm0/q;

    const v0, -0x7aa2e7ca

    sget v1, Lx7/۟۟ۦۨۡ;->۟ۦۣۢۥ:I

    xor-int/2addr v0, v1

    invoke-static {v6, v0}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {v6, v2}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v6}, Ls2/۟ۧ۟ۧۤ;->۠ۥۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v1, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :cond_3
    :sswitch_c
    const v1, 0xbf39

    goto :goto_6

    :sswitch_d
    if-nez v3, :cond_3

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۠ۨۥ()Lk0/y0;

    move-result-object v3

    const v1, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_f
    if-ne v0, v3, :cond_4

    const v1, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_10
    const v1, 0xc240

    goto :goto_7

    :sswitch_11
    new-instance v0, Lk0/s2;

    const/4 v1, 0x2

    invoke-direct {v0, v2, v1}, Lk0/s2;-><init>(Lk0/x2;I)V

    invoke-static {v6, v0}, Ly9/ۧۨ۠ۢ;->ۣۤۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_12
    check-cast v0, Lc9/a;

    const/4 v1, 0x0

    invoke-static {v6, v1}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {}, Lq7/۟ۢۡ۟۟;->ۨۦۣۨ()Lu0/b;

    move-result-object v5

    const v7, -0x3035d

    sget v8, La0/ۣ۟ۤۨۧ;->۟ۦ۟ۥۣ:I

    xor-int/2addr v7, v8

    sget v8, Ls6/۟ۡ۟ۧۢ;->ۧۢۢ۠:I

    xor-int/lit16 v8, v8, -0x3a3

    invoke-static/range {v0 .. v8}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۦ۠۟۠(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_4

    :sswitch_13
    if-ltz v1, :cond_2

    const v0, 0xc2db

    goto :goto_5

    :sswitch_14
    const-string v0, "D7vQbT8fK1SVCp8BBvj"

    invoke-static {v0}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟ۥۥۢۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_8
    :sswitch_15
    return-void

    :pswitch_0
    sget v1, Lt2/۟ۦۣۡۤ;->۟ۡۥۢ۟:I

    const v0, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_16
    xor-int/lit16 v0, v1, -0x11e

    and-int v0, v0, p2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_5

    const v0, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_18
    move-object/from16 v0, p1

    check-cast v0, Lm0/q;

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    if-nez v3, :cond_6

    const v1, 0xc65e

    goto :goto_a

    :cond_6
    :sswitch_1a
    const v1, 0xc63f

    goto :goto_a

    :sswitch_1b
    const v0, 0xc67d

    :goto_b
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :sswitch_1c
    invoke-static {v2}, Lr/۠ۡ۠;->۟ۡۧۦۨ(Ljava/lang/Object;)Lk0/y2;

    move-result-object v0

    invoke-static {v0}, Ll9/۟ۦۥۣۢ;->ۣ۟ۤ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v21, 0x1fda9

    sget v24, Lq2/ۣ۟ۢۥ۠;->۟۟ۧۢۨ:I

    xor-int v24, v24, v21

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۢۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;JJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;JIZIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    goto :goto_8

    :sswitch_1d
    const v0, 0xc69c

    goto :goto_b

    :sswitch_1e
    invoke-static {v0}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v0, 0xc984

    :goto_c
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    const v0, 0xc9a3

    goto :goto_c

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
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
        0xe -> :sswitch_8
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x12 -> :sswitch_9
        0x33 -> :sswitch_15
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_15
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lf0/ۣۤ۠۟;->ۣۨۤ۠(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->ۧ۠ۤ۠(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->ۧ۠ۤ۠(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
