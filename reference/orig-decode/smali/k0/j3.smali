.class public final Lk0/j3;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 2

    iput p2, p0, Lk0/j3;->a:I

    iput-object p1, p0, Lk0/j3;->b:Ljava/lang/Object;

    sget v0, Lz7/۟ۢۧۡۥ;->ۧۡۦۧ:I

    xor-int/lit16 v0, v0, -0x212

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۟۠ۤۤۧ()I

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
    const-string v0, "FXinvwMauPP61LNF5lBoym64VjL"

    invoke-static {v0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥ۠ۢۡ(Ljava/lang/String;)Ljava/lang/String;

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
    .locals 27

    invoke-static/range {p0 .. p0}, Lb4/ۦۣۧ۟;->ۨۨۧۦ(Ljava/lang/Object;)I

    move-result v2

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->۟ۥۧۢۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    packed-switch v2, :pswitch_data_0

    check-cast p1, Ly0/o;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-static/range {p3 .. p3}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    check-cast p2, Lm0/q;

    const v2, 0x5bdded9c

    sget v3, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۦۧۨۤ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    check-cast v1, Lk0/d4;

    invoke-static {v1}, Lc6/۟ۧۧ۠ۤ;->۟ۡۢۡۡ(Ljava/lang/Object;)F

    move-result v2

    invoke-static {}, Ld9/ۧۧۨۥ;->۟ۦۤۡ()Lt/w;

    move-result-object v3

    sget v4, Ld9/ۣ۟۠ۢۡ;->ۦۧ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1c6

    const/16 v5, 0xfa

    const/4 v6, 0x0

    invoke-static {v5, v6, v3, v4}, Lb7/۟۟ۤۤۤ;->ۣۢۨۧ(IILjava/lang/Object;I)Lt/w1;

    move-result-object v5

    const/4 v6, 0x0

    move-object/from16 v0, p2

    invoke-static {v2, v5, v0, v6}, Lm0/۟ۤۡۤۤ;->ۨۤۢۢ(FLjava/lang/Object;Ljava/lang/Object;I)Lm0/l3;

    move-result-object v2

    const/16 v5, 0xfa

    const/4 v6, 0x0

    invoke-static {v5, v6, v3, v4}, Lb7/۟۟ۤۤۤ;->ۣۢۨۧ(IILjava/lang/Object;I)Lt/w1;

    move-result-object v3

    invoke-static {v1}, Lx7/۟۟ۦۨۡ;->۟ۦ۠ۦۡ(Ljava/lang/Object;)F

    move-result v1

    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-static {v1, v3, v0, v4}, Lm0/۟ۤۡۤۤ;->ۨۤۢۢ(FLjava/lang/Object;Ljava/lang/Object;I)Lm0/l3;

    move-result-object v1

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۟ۤۢۢۥ()Landroidx/compose/foundation/layout/FillElement;

    move-result-object v3

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lv7/ۢ۟ۨۦ;->ۡۧۥۢ(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v3

    invoke-static {}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟۠ۥۣۨ()Ly0/g;

    move-result-object v4

    invoke-static {v3, v4}, Lv0/۟ۤۧ۠ۧ;->ۣ۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;

    move-result-object v3

    invoke-static {v1}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/e;

    invoke-static {v1}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۧۢۦۨ(Ljava/lang/Object;)F

    move-result v1

    const/4 v4, 0x0

    int-to-float v4, v4

    invoke-static {v3, v1, v4}, Lk3/۟ۧ۠۠ۦ;->ۣۨۧ۟(Ljava/lang/Object;FF)Ly0/o;

    move-result-object v3

    invoke-static {v2}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/e;

    invoke-static {v1}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟ۧۢۦۨ(Ljava/lang/Object;)F

    move-result v1

    invoke-static {v3, v1}, Lu0/ۣ۟ۤ۟ۡ;->۠ۦ(Ljava/lang/Object;F)Ly0/o;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    :goto_0
    return-object v1

    :pswitch_0
    check-cast p1, Ly/a1;

    move-object/from16 v22, p2

    check-cast v22, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-static/range {p3 .. p3}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v3

    sget v4, Ls/ۣۡۡۧ;->۟ۥ۠ۥۡ:I

    const/16 v2, 0x650

    :goto_1
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_1

    :sswitch_1
    xor-int/lit16 v2, v4, -0x1fd

    and-int/2addr v2, v3

    const/16 v5, 0x10

    if-ne v2, v5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_1

    :sswitch_2
    move-object/from16 v2, v22

    check-cast v2, Lm0/q;

    invoke-static {v2}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۧۨۤ۠(Ljava/lang/Object;)Z

    move-result v4

    const/16 v3, 0x6cc

    :goto_2
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-nez v4, :cond_1

    const/16 v3, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v3, 0x70a

    goto :goto_2

    :sswitch_5
    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    const v2, 0xbe22

    goto :goto_3

    :sswitch_7
    invoke-static {v2}, Lx5/ۡۦۦۥ;->۟ۥۦ۟(Ljava/lang/Object;)V

    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_8
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v1

    goto :goto_0

    :sswitch_9
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_a
    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, -0x1fe5b

    sget v26, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣۣۤۤ:I

    xor-int v25, v25, v26

    invoke-static/range {v1 .. v25}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۢۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;JJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;JIZIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    goto :goto_5

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
.end method
