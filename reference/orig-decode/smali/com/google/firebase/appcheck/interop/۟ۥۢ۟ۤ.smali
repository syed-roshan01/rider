.class public Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۨۢۦ:I = 0x2f0


# direct methods
.method public static ۣ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟۟ۨۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/h1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/h1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۨۡ()Lj8/a;
    .locals 1

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lj8/a;->d:Lj8/a;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦۢۡ()Li1/f;
    .locals 2

    invoke-static {}, Lv9/۟۟ۤۥ;->ۣ۟۟ۧ۠()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lh6/g;->c0()Li1/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨ۠ۤ([SIII)Ljava/lang/String;
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

.method public static ۟ۤۦ۟ۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۦ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۥۡۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/y;

    iget-object v1, p0, Ld5/y;->b:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->۟ۤۤۤ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, La7/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۣ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

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

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v1, v3, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

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
    aget-byte v5, v0, v1

    rem-int v6, v1, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2
.end method

.method public static ۣۤ۟ۡ()I
    .locals 2

    const v0, -0x36e

    sget v1, Lg5/ۣۡۦۣ;->ۥۥۨۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦۥۢ()La2/c0;
    .locals 1

    invoke-static {}, La0/ۣ۟ۤۨۧ;->ۣۧۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ll0/u;->b:La2/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۥۣۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lh4/۟ۧۢۡۦ;->ۨ۟ۤۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/v6;

    iget-object v1, p0, Lk6/v6;->e:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۧۢ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, La8/ۡۦۨۡ;->ۣ۠۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzs()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۧۨ(Ljava/lang/Object;J)J
    .locals 2

    invoke-static {}, Lq9/۟ۧۦۤۨ;->۟ۤۧۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/d2;

    invoke-virtual {p0, p1, p2}, Lf0/d2;->d(J)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۦۨۨۤ(Ljava/lang/Object;)Lv/f2;
    .locals 2

    invoke-static {}, Lh3/ۣ۟ۢۡۤ;->ۧۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/x1;

    iget-object v1, p0, Lf0/x1;->a:Lv/f2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۠ۨۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۠ۨۤۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/k0;

    iget-boolean v1, p0, Ld5/k0;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۡ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lv8/۟ۧۢ۟ۢ;->ۨۥۦۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/ContentValues;

    invoke-static {p0, p1}, Lk6/k;->F(Landroid/content/ContentValues;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۦۦ۟(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->ۨۤۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/d4;

    iget v1, p0, Lk0/d4;->c:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
