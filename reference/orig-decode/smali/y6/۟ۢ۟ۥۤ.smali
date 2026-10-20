.class public Ly6/۟ۢ۟ۥۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۥۣۢ:I = 0x24f


# direct methods
.method public static ۟۟ۢ۟ۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lla/۟ۢۥۧۥ;->ۣ۟ۢۤۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-boolean v1, p0, Lk6/f5;->x:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۤ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ld1/ۣۣ۟ۢۨ;->ۨۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/x6;

    iget-object v1, p0, Lk6/x6;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۤۢ()Ljava/util/List;
    .locals 2

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/auto/accept/data/model/SupportedApp;->access$getALL_APPS$cp()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۧۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->۟ۤ۟ۢ۟()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Shizuku service is running. Tap below to pair & authorize."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۧۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lv0/ۣ۟۟ۤۧ;->ۡۡۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/b5;

    iget v1, p0, Lk0/b5;->A:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)I
    .locals 1

    invoke-static {}, Ll8/ۣ۟ۧۢ۠;->۟ۦۣۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/u1;

    check-cast p1, Lt1/c1;

    check-cast p2, Ljava/util/List;

    check-cast p4, Lk0/l0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk0/u1;->g(Lt1/c1;Ljava/util/List;ILk0/l0;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۠ۤ()F
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۡۦۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Lf0/f;->a:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۦ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lv0/ۣۣۡۢ;->۟ۨۤۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "service_stopped"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۤ۠(Ljava/lang/Object;)Lk0/a5;
    .locals 2

    invoke-static {}, Lcom/google/firebase/ktx/ۡ۟ۢ;->ۡۧ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/r4;

    iget-object v1, p0, Lk0/r4;->t:Lk0/a5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, La/ۨۥۥۤ;->۟ۥ۠ۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lh8/k;

    check-cast p1, Le8/l1;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lh8/k;->l(Lh8/k;Le8/l1;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۡ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-string v3, ""

    const-string v2, ""

    move v1, v0

    :goto_0
    const/16 v4, 0xf

    if-lt v1, v4, :cond_0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    array-length v3, v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v0, v3, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    const/16 v6, 0xa

    int-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-int v4, v4

    xor-int/2addr v4, v1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, -0x2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    const/4 v5, -0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_2
    aget-byte v5, v1, v0

    rem-int v6, v0, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public static ۠ۥ۟ۡ(Ljava/lang/Object;)Lk6/c4;
    .locals 1

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۡۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f5;

    invoke-virtual {p0}, Lk6/f5;->l()Lk6/c4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۡ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۢۥۡ()I
    .locals 2

    const v0, -0xac

    sget v1, Le7/ۧ۠ۧ;->۟۟ۥۣۤ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۥۢۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "filter_id"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۤ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "day"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۢۦ([SIII)Ljava/lang/String;
    .locals 3

    .prologue
    .line 25
    new-array v1, p2, [C

    .line 26
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 27
    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۥۣۣۨ()Ld5/m;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۤ۠;->۟ۧ۠ۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ld5/m;->e:Ld5/m;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۟۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۣۣۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/y5;

    iget-object v1, p0, Lk6/y5;->h:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
