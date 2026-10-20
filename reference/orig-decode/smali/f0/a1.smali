.class public final Lf0/a1;
.super Ljava/lang/Object;


# static fields
.field public static final g:Lf0/a1;


# instance fields
.field public final a:Lc9/c;

.field public final b:Lc9/c;

.field public final c:Lc9/c;

.field public final d:Lc9/c;

.field public final e:Lc9/c;

.field public final f:Lc9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/a1;

    invoke-direct {v0}, Lf0/a1;-><init>()V

    sput-object v0, Lf0/a1;->g:Lf0/a1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf0/a1;->a:Lc9/c;

    iput-object v0, p0, Lf0/a1;->b:Lc9/c;

    iput-object v0, p0, Lf0/a1;->c:Lc9/c;

    iput-object v0, p0, Lf0/a1;->d:Lc9/c;

    iput-object v0, p0, Lf0/a1;->e:Lc9/c;

    iput-object v0, p0, Lf0/a1;->f:Lc9/c;

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

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
    const-string v0, "oqVYCHCxvfgLuG7F"

    invoke-static {v0}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->ۦۦۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

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
    if-ne p0, p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    instance-of v3, p1, Lf0/a1;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    move v0, v1

    :goto_2
    :sswitch_6
    return v0

    :sswitch_7
    check-cast p1, Lf0/a1;

    invoke-static {p1}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۠ۥۢۡ(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {p0}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۠ۥۢۡ(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    invoke-static {v3, v2}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v3, :cond_2

    const v2, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {p0}, Landroidx/compose/ui/draw/ۧۤۡۧ;->۟ۦۥۣۨ(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {p1}, Landroidx/compose/ui/draw/ۧۤۡۧ;->۟ۦۥۣۨ(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v2, 0xbebd

    goto :goto_4

    :sswitch_c
    if-eqz v3, :cond_3

    const v2, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {p0}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۤۤۤۤ(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {p1}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۤۤۤۤ(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v2, 0xbf39

    goto :goto_5

    :sswitch_f
    if-eqz v3, :cond_4

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {p0}, La2/ۢۦۧۦ;->ۤ۠۠ۡ(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {p1}, La2/ۢۦۧۦ;->ۤ۠۠ۡ(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc202

    :goto_6
    const v4, 0xc213

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    if-eqz v3, :cond_5

    const v2, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_12
    const v2, 0xc240

    goto :goto_6

    :sswitch_13
    invoke-static {p0}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۟۠ۢ۟ۧ(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {p1}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۟۠ۢ۟ۧ(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_14
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_15
    if-eqz v3, :cond_6

    const v2, 0xc2db

    goto :goto_7

    :sswitch_16
    invoke-static {p0}, Lh4/۟ۧۢۡۦ;->۟ۤ۠ۡ۟(Ljava/lang/Object;)Lc9/c;

    move-result-object v2

    invoke-static {p1}, Lh4/۟ۧۢۡۦ;->۟ۤ۠ۡ۟(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    if-eqz v3, :cond_7

    const v2, 0xc5e2

    goto :goto_8

    :cond_7
    :sswitch_18
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_19
    const v1, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    const v1, 0xc620

    goto :goto_9

    :sswitch_1b
    move v0, v1

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
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
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_1b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_1b
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_1b
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_6
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 14

    const/4 v1, 0x0

    invoke-static {p0}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۠ۥۢۡ(Ljava/lang/Object;)Lc9/c;

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move v0, v1

    :sswitch_5
    sget v7, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->۟ۤۨۦۧ:I

    invoke-static {p0}, Landroidx/compose/ui/draw/ۧۤۡۧ;->۟ۦۥۣۨ(Ljava/lang/Object;)Lc9/c;

    move-result-object v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v3, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v3}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    const v3, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    sget v8, Lh8/۟ۨۧ;->ۨ۟ۧ:I

    invoke-static {p0}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۤۤۤۤ(Ljava/lang/Object;)Lc9/c;

    move-result-object v4

    const v3, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v3, 0xbf39

    goto :goto_5

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_3

    :sswitch_c
    move v2, v1

    goto :goto_4

    :sswitch_d
    if-eqz v4, :cond_2

    const v3, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {v4}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v4, 0xc221

    goto :goto_6

    :sswitch_10
    move v3, v1

    :sswitch_11
    sget v9, Le2/ۨۥۦۡ;->۟۠ۢۢۧ:I

    invoke-static {p0}, La2/ۢۦۧۦ;->ۤ۠۠ۡ(Ljava/lang/Object;)Lc9/c;

    move-result-object v5

    const v4, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v4, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-eqz v5, :cond_3

    const v4, 0xc2db

    goto :goto_7

    :sswitch_14
    invoke-static {v5}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v4

    const v5, 0xc2fa

    :goto_8
    const v6, 0xc30b

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v5, 0xc5a4

    goto :goto_8

    :sswitch_16
    move v4, v1

    :sswitch_17
    sget v10, Ldagger/hilt/android/migration/۟ۢۡۧۦ;->ۨۧۡۨ:I

    invoke-static {p0}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۟۠ۢ۟ۧ(Ljava/lang/Object;)Lc9/c;

    move-result-object v6

    const v5, 0xc601

    :goto_9
    const v11, 0xc612

    xor-int/2addr v5, v11

    sparse-switch v5, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    if-eqz v6, :cond_4

    const v5, 0xc65e

    goto :goto_9

    :cond_4
    :sswitch_19
    const v5, 0xc63f

    goto :goto_9

    :sswitch_1a
    invoke-static {v6}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    const v6, 0xc67d

    :goto_a
    const v11, 0xc68e

    xor-int/2addr v6, v11

    sparse-switch v6, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1b
    sget v11, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    invoke-static {p0}, Lh4/۟ۧۢۡۦ;->۟ۤ۠ۡ۟(Ljava/lang/Object;)Lc9/c;

    move-result-object v12

    const v6, 0xc984

    :goto_c
    const v13, 0xc995

    xor-int/2addr v6, v13

    sparse-switch v6, :sswitch_data_a

    goto :goto_c

    :sswitch_1c
    if-eqz v12, :cond_5

    const v6, 0xc9e1

    goto :goto_c

    :sswitch_1d
    const v6, 0xc69c

    goto :goto_a

    :sswitch_1e
    move v5, v1

    goto :goto_b

    :cond_5
    :sswitch_1f
    const v6, 0xc9c2

    goto :goto_c

    :sswitch_20
    invoke-static {v12}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۤ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    :sswitch_21
    xor-int/lit16 v6, v7, 0x307

    mul-int/2addr v0, v6

    add-int/lit8 v0, v0, 0x13

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x13

    xor-int/lit16 v2, v8, 0x11d

    mul-int/2addr v0, v2

    rsub-int/lit8 v2, v3, 0x0

    sub-int/2addr v0, v2

    xor-int/lit16 v2, v9, 0x207

    mul-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x18

    add-int/2addr v0, v4

    add-int/lit8 v0, v0, 0x18

    xor-int/lit16 v2, v10, -0x31a

    mul-int/2addr v0, v2

    rsub-int/lit8 v0, v0, 0x0

    sub-int/2addr v0, v5

    rsub-int/lit8 v0, v0, 0x0

    xor-int/lit16 v2, v11, 0xfb

    mul-int/2addr v0, v2

    rsub-int/lit8 v1, v1, 0x0

    sub-int/2addr v0, v1

    return v0

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
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_16
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_21
        0x74 -> :sswitch_20
    .end sparse-switch
.end method
