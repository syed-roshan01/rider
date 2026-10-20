.class public final Lf0/c0;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final a:Lg2/s;

.field public final b:Z

.field public final c:Lg2/a0;

.field public final d:Lh0/v0;

.field public final e:Lf0/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lg2/s;ZLg2/a0;Lh0/v0;Lf0/c2;)V
    .locals 2

    iput-object p1, p0, Lf0/c0;->a:Lg2/s;

    iput-boolean p2, p0, Lf0/c0;->b:Z

    iput-object p3, p0, Lf0/c0;->c:Lg2/a0;

    iput-object p4, p0, Lf0/c0;->d:Lh0/v0;

    iput-object p5, p0, Lf0/c0;->e:Lf0/c2;

    sget v0, Lk4/۟۠ۦ۟ۤ;->ۨۦۢ۠:I

    xor-int/lit16 v0, v0, -0x348

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۟ۢ۠ۥ()I

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
    const-string v0, "w8TShLi2Cm6H5fUsDUSlzJ6kTn"

    invoke-static {v0}, Lia/۟۠ۡۦ۟;->ۣ۟۟۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

    check-cast p1, Ljava/lang/Number;

    invoke-static {p1}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v0

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    check-cast p3, Ljava/lang/Boolean;

    invoke-static {p3}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {p0}, Lh6/ۧۧۤ۟;->ۦۣۨۥ(Ljava/lang/Object;)Lg2/s;

    move-result-object v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v3, v0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۣۨ۠ۤ(Ljava/lang/Object;I)I

    move-result v0

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v4, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {p0}, Lc3/۟ۥ۠ۡۧ;->ۣۡ۠ۦ(Ljava/lang/Object;)Z

    move-result v5

    const/4 v2, 0x0

    const v3, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v3, 0xbf39

    goto :goto_5

    :sswitch_b
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_c
    invoke-static {v3, v1}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۣۨ۠ۤ(Ljava/lang/Object;I)I

    move-result v1

    goto :goto_4

    :sswitch_d
    if-nez v5, :cond_2

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v0, 0xc221

    goto :goto_6

    :sswitch_10
    move v0, v2

    :goto_7
    :sswitch_11
    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :sswitch_12
    invoke-static {p0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣۡۡۦ(Ljava/lang/Object;)Lg2/a0;

    move-result-object v5

    invoke-static {v5}, Lh6/ۧۧۤ۟;->ۣ۟ۡ۠۠(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۥ۠۠ۤ()I

    const/16 v3, 0x20

    shr-long v8, v6, v3

    long-to-int v8, v8

    const v3, 0xc27e

    :goto_8
    const v9, 0xc28f

    xor-int/2addr v3, v9

    sparse-switch v3, :sswitch_data_6

    goto :goto_8

    :cond_3
    :sswitch_13
    const v3, 0xc2bc

    goto :goto_8

    :sswitch_14
    if-ne v0, v8, :cond_3

    const v3, 0xc2db

    goto :goto_8

    :sswitch_15
    const-wide v8, 0xffffffffL

    const-wide/16 v10, -0x1

    xor-long/2addr v8, v10

    xor-long/2addr v8, v6

    and-long/2addr v6, v8

    long-to-int v6, v6

    const v3, 0xc2fa

    :goto_9
    const v7, 0xc30b

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_7

    goto :goto_9

    :sswitch_16
    if-ne v1, v6, :cond_4

    const v3, 0xc5e2

    goto :goto_9

    :cond_4
    :sswitch_17
    const v3, 0xc5c3

    goto :goto_9

    :sswitch_18
    const v0, 0xc601

    :goto_a
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    const v0, 0xc620

    goto :goto_a

    :sswitch_1a
    move v0, v2

    goto :goto_7

    :sswitch_1b
    invoke-static {v0, v1}, Lc3/۟ۡۧۢۥ;->ۣۡ۟ۧ(II)I

    move-result v6

    invoke-static {}, La3/۟ۢۨۢۥ;->ۣ۟ۡ۠ۢ()Lf0/o0;

    move-result-object v7

    invoke-static {p0}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۟ۡۦۨ۠(Ljava/lang/Object;)Lh0/v0;

    move-result-object v8

    const v3, 0xc67d

    :goto_b
    const v9, 0xc68e

    xor-int/2addr v3, v9

    sparse-switch v3, :sswitch_data_9

    goto :goto_b

    :cond_5
    :sswitch_1c
    const v3, 0xc6bb

    goto :goto_b

    :sswitch_1d
    if-ltz v6, :cond_5

    const v3, 0xc965

    goto :goto_b

    :sswitch_1e
    invoke-static {v0, v1}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v6

    invoke-static {v5}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۨۥۡۤ(Ljava/lang/Object;)La2/e;

    move-result-object v5

    invoke-static {v5}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v9

    const v3, 0xc984

    :goto_c
    const v10, 0xc995

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    if-gt v6, v9, :cond_6

    const v3, 0xc9e1

    goto :goto_c

    :cond_6
    :sswitch_20
    const v3, 0xc9c2

    goto :goto_c

    :sswitch_21
    const v2, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :cond_7
    :sswitch_22
    const v2, 0xca3e

    goto :goto_d

    :sswitch_23
    if-nez v4, :cond_7

    const v2, 0xca5d

    goto :goto_d

    :sswitch_24
    const v2, 0xca7c

    :goto_e
    const v3, 0xca8d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_e

    :sswitch_25
    if-ne v0, v1, :cond_8

    const v2, 0xcd64

    goto :goto_e

    :cond_8
    :sswitch_26
    const v2, 0xcd45

    goto :goto_e

    :sswitch_27
    const v2, 0xcd83

    :goto_f
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_f

    :sswitch_28
    const v2, 0xcda2

    goto :goto_f

    :sswitch_29
    const/4 v2, 0x1

    invoke-static {v8, v2}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۤۤ۠ۡ(Ljava/lang/Object;Z)V

    const v2, 0xcdff

    :goto_10
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_10

    :goto_11
    :sswitch_2a
    invoke-static {p0}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۧۤۦ(Ljava/lang/Object;)Lf0/c2;

    move-result-object v2

    invoke-static {v2}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۡۨۦۥ(Ljava/lang/Object;)Lf0/v;

    move-result-object v2

    new-instance v3, Lg2/a0;

    invoke-static {v0, v1}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۢۤۧ(II)J

    move-result-wide v0

    const/4 v4, 0x0

    invoke-direct {v3, v5, v0, v1, v4}, Lg2/a0;-><init>(La2/e;JLa2/b0;)V

    invoke-static {v2, v3}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۧۢۨۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const v1, 0xd106

    :goto_12
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_12

    :sswitch_2b
    const v1, 0xd125

    goto :goto_12

    :sswitch_2c
    const v2, 0xce1e

    goto :goto_10

    :sswitch_2d
    const/4 v2, 0x0

    invoke-static {v8, v2}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۥۦۢۥ(Ljava/lang/Object;Z)V

    invoke-static {v8, v7}, Lla/۟ۢۥۧۥ;->ۣۣ۟ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_11

    :sswitch_2e
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۥۦۢۥ(Ljava/lang/Object;Z)V

    invoke-static {v8, v7}, Lla/۟ۢۥۧۥ;->ۣۣ۟ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    move v0, v2

    goto/16 :goto_7

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
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_2e
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_2e
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_2d
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x3ef -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_11
    .end sparse-switch
.end method
