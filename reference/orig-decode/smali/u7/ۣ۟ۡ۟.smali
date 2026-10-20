.class public Lu7/ۣ۟ۡ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟۠۠ۤۤ:I = -0x357


# direct methods
.method public static ۟۟۠۠ۤ([SIII)Ljava/lang/String;
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

.method public static ۟۟ۢ۟ۨ(Ljava/lang/Object;)Lk6/f;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۧۦۨ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-object v1, p0, Lk6/f5;->g:Lk6/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lf0/ۣۤ۠۟;->۟ۦۥۣۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lv/l1;

    check-cast p1, Lu8/e;

    invoke-virtual {p0, p1}, Lv/l1;->b(Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۥۤ()Lb/e;
    .locals 1

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۢۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lb/e;->b:Lb/e;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۤۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۢۧۦۦ(I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۣۣۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Lf6/a;->i0(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۠ۨ(Ljava/lang/Object;I)Lcom/google/android/gms/internal/measurement/zzfi$zzj;
    .locals 1

    invoke-static {}, Lx8/ۢۨۥۨ;->۟۟ۢ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۤ۟(Ljava/lang/Object;)La2/z;
    .locals 2

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La2/a0;

    iget-object v1, p0, La2/a0;->a:La2/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/math/BigDecimal;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۣۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/math/BigDecimal;

    check-cast p1, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۤۧۧ()I
    .locals 2

    const v0, 0x160

    sget v1, Landroid/support/v4/app/ۥۣۡ;->ۣ۟ۤۡۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۡۦۨۢ(Ljava/lang/Object;)Lf2/k;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۥۣۦ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La2/x;

    iget-object v1, p0, La2/x;->e:Lf2/k;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۤۡ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۦ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/z5;

    iget-object v1, p0, Lk6/z5;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lv5/ۧۥۢۡ;->ۥۢۡ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/r;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf5/r;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۟۟ۥ()Lk6/x3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->ۥۣۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk6/x;->K0:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۤۡۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_0

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_1

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-gtz v3, :cond_2

    :goto_3
    array-length v2, v0

    if-lt v1, v2, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

    :cond_0
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

    :cond_1
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

    :cond_2
    const/4 v5, -0x1

    aget-byte v6, v0, v5

    rem-int v7, v5, v4

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    goto :goto_2

    :cond_3
    const-string v1, ""

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method

.method public static ۣۨۢ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/m2;

    iget v1, p0, Lk0/m2;->f:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۥۥۦ(Ljava/lang/Object;)Lc9/h;
    .locals 2

    invoke-static {}, Lm3/۟ۦۦۡۢ;->۟ۢ۟ۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/y4;

    iget-object v1, p0, Lk0/y4;->n:Lc9/h;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
