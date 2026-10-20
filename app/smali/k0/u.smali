.class public final Lk0/u;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Lr1/x0;

.field public final b:I

.field public final c:Lr1/x0;

.field public final d:Ly/g;

.field public final e:J

.field public final f:Lr1/x0;

.field public final n:Lr1/l0;

.field public final o:Ly/i;

.field public final p:I

.field public final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr1/x0;ILr1/x0;Ly/g;JLr1/x0;Lr1/l0;Ly/i;II)V
    .locals 3

    iput-object p1, p0, Lk0/u;->a:Lr1/x0;

    iput p2, p0, Lk0/u;->b:I

    iput-object p3, p0, Lk0/u;->c:Lr1/x0;

    iput-object p4, p0, Lk0/u;->d:Ly/g;

    iput-wide p5, p0, Lk0/u;->e:J

    iput-object p7, p0, Lk0/u;->f:Lr1/x0;

    iput-object p8, p0, Lk0/u;->n:Lr1/l0;

    iput-object p9, p0, Lk0/u;->o:Ly/i;

    iput p10, p0, Lk0/u;->p:I

    iput p11, p0, Lk0/u;->q:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۤۥۤۦ()I

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
    const-string v0, "iEFx5Zl2Db9h7kERGILQjf"

    invoke-static {v0}, Ll9/۟ۦۥۣۢ;->ۣۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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
    .locals 13

    const/4 v2, 0x0

    check-cast p1, Lr1/w0;

    invoke-static {p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۡۨۧ۟(Ljava/lang/Object;)Lr1/x0;

    move-result-object v3

    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lc4/ۡ۟۠ۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v4

    add-int/lit8 v1, v4, -0xd

    sub-int v0, v1, v0

    add-int/lit8 v0, v0, 0xd

    sget v1, Lcom/google/firebase/firestore/util/ۣۣ۠;->ۢۦۡۡ:I

    xor-int/lit16 v1, v1, -0x23b

    div-int/2addr v0, v1

    invoke-static {p1, v3, v2, v0}, Lb1/۟ۥۥ۟ۢ;->۟ۢۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-static {}, Lf4/ۦۣ۟ۦ;->ۣۢۨۧ()Ly/f;

    move-result-object v5

    invoke-static {p0}, Landroid/os/ۣۣ۟ۤۨ;->۟۠ۡۡۥ(Ljava/lang/Object;)Ly/g;

    move-result-object v1

    invoke-static {v1, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    invoke-static {p0}, Lm7/ۥۨۥ۟;->ۤۢۦۨ(Ljava/lang/Object;)Lr1/x0;

    move-result-object v7

    invoke-static {p0}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۧۧۧۡ(Ljava/lang/Object;)Lr1/x0;

    move-result-object v8

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)J

    move-result-wide v10

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
    if-eqz v6, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v10, v11}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v0

    invoke-static {v8}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/lit8 v0, v0, 0x5

    sub-int/2addr v0, v6

    add-int/lit8 v0, v0, -0x5

    sget v1, Lw0/۟ۤۧۥۥ;->ۥۢۦۣ:I

    xor-int/lit16 v1, v1, 0x136

    div-int v1, v0, v1

    invoke-static {v3}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ge v1, v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    add-int/lit8 v0, v3, 0x1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    :sswitch_6
    rsub-int/lit8 v1, v1, 0x0

    sub-int v0, v1, v0

    rsub-int/lit8 v0, v0, 0x0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v1, 0xbe22

    goto :goto_2

    :sswitch_8
    invoke-static {v10, v11}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v3

    invoke-static {v7}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v9

    const v0, 0xbe7f

    :goto_3
    const v12, 0xbe90

    xor-int/2addr v0, v12

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    add-int/lit8 v0, v6, -0x10

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x10

    add-int/lit8 v12, v3, 0x2

    sub-int/2addr v12, v9

    add-int/lit8 v12, v12, -0x2

    if-le v0, v12, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v10, v11}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v0

    add-int/lit8 v0, v0, -0x1c

    invoke-static {v7}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1c

    add-int/lit8 v0, v0, -0x3

    invoke-static {v8}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x0

    sub-int v3, v1, v3

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x3

    const v3, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    const v3, 0xbf1a

    goto :goto_4

    :sswitch_d
    invoke-static {}, Lh/ۢۢۨۨ;->۟ۡۥۣۤ()Ly/d;

    move-result-object v0

    invoke-static {v1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_5
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-eqz v1, :cond_3

    const v0, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_f
    const v0, 0xc240

    goto :goto_5

    :sswitch_10
    invoke-static {v10, v11}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    invoke-static {v8}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x5

    add-int/lit8 v0, v0, 0x19

    invoke-static {v7}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x19

    const v1, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :goto_7
    :sswitch_11
    invoke-static {p0}, Le0/ۦۣ۟۠;->۟ۥۤۢۡ(Ljava/lang/Object;)Ly/i;

    move-result-object v3

    invoke-static {v3, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xc2fa

    :goto_8
    const v6, 0xc30b

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_12
    if-eqz v5, :cond_4

    const v1, 0xc5e2

    goto :goto_8

    :sswitch_13
    const v1, 0xc29d

    goto :goto_6

    :sswitch_14
    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۥۣۦۡ()F

    move-result v0

    invoke-static {p0}, Lm4/۟ۧۤ۠;->ۣۤۧۤ(Ljava/lang/Object;)Lr1/l0;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {v3}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v0

    goto :goto_7

    :cond_4
    :sswitch_15
    const v1, 0xc5c3

    goto :goto_8

    :sswitch_16
    add-int/lit8 v1, v4, 0x12

    invoke-static {v8}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x12

    sget v2, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۧۧۧۧ:I

    xor-int/lit16 v2, v2, 0xba

    div-int/2addr v1, v2

    const v2, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v2, 0xc620

    goto :goto_9

    :sswitch_18
    invoke-static {}, Lr7/ۧ۠۠ۤ;->ۡۥ۠ۨ()Ly/e;

    move-result-object v1

    invoke-static {v3, v1}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xc67d

    :goto_a
    const v5, 0xc68e

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :cond_5
    :sswitch_19
    const v1, 0xc6bb

    goto :goto_a

    :sswitch_1a
    if-eqz v3, :cond_5

    const v1, 0xc965

    goto :goto_a

    :sswitch_1b
    invoke-static {p0}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۦ۟ۥۧ(Ljava/lang/Object;)I

    move-result v3

    const v1, 0xc984

    :goto_b
    const v5, 0xc995

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_a

    goto :goto_b

    :sswitch_1c
    if-nez v3, :cond_6

    const v1, 0xc9e1

    goto :goto_b

    :cond_6
    :sswitch_1d
    const v1, 0xc9c2

    goto :goto_b

    :sswitch_1e
    add-int/lit8 v1, v4, 0x0

    invoke-static {v8}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x0

    const v2, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_c

    :goto_d
    :pswitch_1
    :sswitch_1f
    invoke-static {p1, v8, v0, v1}, Lb1/۟ۥۥ۟ۢ;->۟ۢۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-static {v10, v11}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    invoke-static {v7}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x6

    add-int/lit8 v1, v4, -0x12

    invoke-static {v7}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x12

    sget v2, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۨۦۡ:I

    xor-int/lit16 v2, v2, -0xf4

    div-int/2addr v1, v2

    invoke-static {p1, v7, v0, v1}, Lb1/۟ۥۥ۟ۢ;->۟ۢۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :pswitch_2
    const v2, 0xca1f

    goto :goto_c

    :sswitch_20
    invoke-static {v8}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v5, v4, 0x10

    sub-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x10

    add-int/lit8 v5, v5, -0x9

    add-int/lit8 v3, v3, -0x1e

    sub-int v1, v3, v1

    add-int/lit8 v1, v1, 0x1e

    rsub-int/lit8 v1, v1, 0x0

    invoke-static {p0}, Landroidx/activity/ۣۧۧۢ;->ۣۣۧۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int/2addr v1, v3

    rsub-int/lit8 v1, v1, 0x0

    invoke-static {v2, v1}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v1

    sub-int v1, v5, v1

    add-int/lit8 v1, v1, 0x9

    goto :goto_d

    :sswitch_21
    move v1, v2

    goto :goto_d

    :sswitch_22
    move v0, v1

    goto/16 :goto_7

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_11
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_22
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_6
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1a
        0xfeb -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1d
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1e
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
