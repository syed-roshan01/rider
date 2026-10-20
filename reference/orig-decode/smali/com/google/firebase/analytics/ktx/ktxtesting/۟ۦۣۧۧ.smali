.class public Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣ۟ۨۧ:I = 0x381


# direct methods
.method public static ۟۟ۢۡۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lt3/ۣ۟ۧۡ;->ۣ۟ۧۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/pm/ServiceInfo;

    iget-object v1, p0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۦ()I
    .locals 2

    const v0, -0xd0

    sget v1, Lq0/۟ۧۤۧ;->ۢۧۧۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟۠ۦۥۤ()Lcom/google/android/gms/internal/measurement/zzcd;
    .locals 2

    invoke-static {}, Lw5/ۣۨۧ۠;->ۣۥۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzcd;->zza()Lcom/google/android/gms/internal/measurement/zzcd;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۤ۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۠ۦۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/n4;

    iget-boolean v1, p0, Lk6/n4;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۡۡ()F
    .locals 1

    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lk0/c4;->c:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۢۥ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Lm7/ۥۨۥ۟;->۟ۡ۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/c3;

    iget-object v1, p0, Lk0/c3;->c:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡ۟ۨ(Ljava/lang/Object;)Lk6/q;
    .locals 1

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/f5;

    invoke-virtual {p0}, Lk6/f5;->i()Lk6/q;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۧۧ(Ljava/lang/Object;Ljava/lang/Object;J)Lr1/k0;
    .locals 1

    invoke-static {}, Lh5/ۢ۠۠۟;->۟ۦ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/i2;

    check-cast p1, Lr1/i1;

    invoke-virtual {p0, p1, p2, p3}, Lk0/i2;->a(Lr1/i1;J)Lr1/k0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu8/ۨۡ۠;->ۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۡۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lla/۟ۢۥۧۥ;->ۣ۟ۢۤۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld1/d;

    iget v1, p0, Ld1/d;->c:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۨۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۡۥ۟(Ljava/lang/Object;)Lg2/l0;
    .locals 2

    invoke-static {}, Lz8/۟ۧۡۥۥ;->ۣۤۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/t;

    iget-object v1, p0, Lf0/t;->n:Lg2/l0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۤۢ۠([SIII)Ljava/lang/String;
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

.method public static ۡۥۤۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lj6/ۣۦۢ۠;->ۦ۟ۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/v0;

    iget v1, p0, Lk0/v0;->f:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۠۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->ۧۦۦۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/l1;

    iget-boolean v1, p0, Lk0/l1;->t:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥ۠ۡ()Lk6/r5;
    .locals 1

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk6/r5;->e:Lk6/r5;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۤۨۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;
    .locals 1

    invoke-static {}, Ld9/ۥۡۧۡ;->۟ۥۦ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۡ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lu8/ۨۡ۠;->ۨۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/y5;

    iget-wide v2, p0, Lk6/y5;->m:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۨۧ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->ۧۡۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/z3;

    iget-object v1, p0, Lk6/z3;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۧۧۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
