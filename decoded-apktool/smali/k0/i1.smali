.class public final Lk0/i1;
.super Ly0/n;

# interfaces
.implements Lt1/m;
.implements Lt1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 7

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟۟ۧۡۡ()J

    move-result-wide v4

    invoke-static {p2, p3, p4}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v3

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۢۢۤۨ(Ljava/lang/Object;)Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۧۨۢ()Lm0/m3;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/profileinstaller/۟۟۟ۧۦ;->ۥۤۡۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v0, 0x0

    :sswitch_8
    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v0, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v3}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v4, v5}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۟۟ۢۢ(J)F

    move-result v2

    invoke-static {p1, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v1, v2}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v1

    const v2, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    const v2, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    if-eqz v0, :cond_3

    const v2, 0xc25f

    goto :goto_6

    :sswitch_e
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_f
    invoke-static {v3}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_5

    :cond_3
    :sswitch_10
    const v2, 0xc240

    goto :goto_6

    :sswitch_11
    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v4, v5}, Lv0/۟ۦۣ۟ۤ;->ۨ۟ۤۦ(J)F

    move-result v2

    invoke-static {p1, v2}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۤ۠ۤ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v0, v2}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v0

    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_12
    new-instance v2, Ly/h0;

    invoke-direct {v2, v1, v3, v0}, Ly/h0;-><init>(ILr1/x0;I)V

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v3

    invoke-static {p1, v1, v0, v3, v2}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v0

    return-object v0

    :sswitch_13
    const v2, 0xc29d

    goto :goto_7

    :sswitch_14
    invoke-static {v3}, Lm1/۟ۧۥ۟ۨ;->ۡۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_8

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
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
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
        0x11 -> :sswitch_d
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_13
    .end sparse-switch
.end method
