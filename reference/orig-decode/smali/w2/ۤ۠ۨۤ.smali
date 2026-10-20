.class public Lw2/ۤ۠ۨۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۠ۦۣ۟:I = 0x141


# direct methods
.method public static ۣ۟۟ۢ۟([SIII)Ljava/lang/String;
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

.method public static ۣ۟۠ۡۢ()I
    .locals 2

    const v0, -0x1fb

    sget v1, Ln/۟۠ۥۥۨ;->۟ۥۧۤۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟۠ۥ()Li1/f;
    .locals 2

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lh6/g;->k0()Li1/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ly3/f;

    iget-object v1, p0, Ly3/f;->b:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_2

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const-string v0, "a"

    :cond_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_3
    if-lt v0, v4, :cond_4

    :goto_4
    array-length v0, v3

    if-lt v1, v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_1
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

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

    xor-int/2addr v4, v0

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v0, 0x1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "a"

    goto :goto_2

    :cond_4
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_4
.end method

.method public static ۟ۤۤ۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lh1/۟۟ۨۦۦ;->ۣ۟ۢۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/g6;

    iget-object v1, p0, Lk6/g6;->e:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۦۥۡۤ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۣۣۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->N:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg7/۠ۤۧ;->ۨ۟ۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/s6;

    check-cast p1, Lk6/y3;

    check-cast p2, La6/a;

    check-cast p3, Lk6/x7;

    invoke-virtual {p0, p1, p2, p3}, Lk6/s6;->y(Lk6/y3;La6/a;Lk6/x7;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/y2;

    invoke-virtual {p0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۥۣۡ(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 2

    invoke-static {}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۥۤۨۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/c7;

    iget-object v1, p0, Lk6/c7;->d:Ljava/util/HashMap;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢۤۨ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lp0/۟ۧۧۧ۟;->ۦۧ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/g1;

    iget-object v1, p0, Ld5/g1;->y:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;
    .locals 1

    invoke-static {}, Lz8/۟ۧۡۥۥ;->ۣۤۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۤۦۣ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۢۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/f1;

    iget-boolean v1, p0, Ld5/f1;->a:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥۢۨ(Ljava/lang/Object;)Lm2/l;
    .locals 1

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->۟ۤۨۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lg1/g;

    invoke-interface/range {p0 .. p0}, Lg1/g;->getLayoutDirection()Lm2/l;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۧۦۥ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Ln1/۟۠۟ۤۤ;->۟۠ۥۥۡ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۢۡۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lf4/ۡۤۡ;->ۡ۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "shizuku_permission_desc"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
