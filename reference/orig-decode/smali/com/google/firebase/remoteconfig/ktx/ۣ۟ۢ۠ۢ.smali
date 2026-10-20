.class public Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۢۢۧۢ:I = -0x38


# direct methods
.method public static ۟۟ۨۤ۟()Lk0/l0;
    .locals 1

    invoke-static {}, Lk8/ۣ۠ۨۤ;->۟ۧۧۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lk0/l0;->v:Lk0/l0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۨۨ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Ld2/۟ۦۡ۟ۦ;->ۣۧۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/w0;

    iget-object v1, p0, Ld5/w0;->e:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۨۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۧۤۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ll2/ۦۣ۠ۥ;->ۤ۠ۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/j4;

    invoke-virtual {p0}, Lk6/j4;->t()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥ۟ۡ([SIII)Ljava/lang/String;
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

.method public static ۟ۤۥۧۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۡۧۡۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzg;->zzb()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۧۢ()I
    .locals 2

    const v0, 0xdf

    sget v1, Lf0/ۣۤ۠۟;->۟ۧۦۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۣۡۦ()La2/c0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣۡۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ll0/u;->a:La2/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۤ۟۟()J
    .locals 4

    invoke-static {}, Lm1/۟ۧۥ۟ۨ;->ۧۥۣۣ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۡ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤ۠ۥۥ(Ljava/lang/Object;)La2/c0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۢ۠ۧۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/i;

    iget-object v1, p0, Lf0/i;->c:La2/c0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۤۨ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/a2;

    invoke-virtual {p0}, Lk0/a2;->invoke()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۨۥۣ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lq0/ۥۣۡۧ;->۟۠ۨۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Alert on Accept"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۢۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->ۨۤۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly3/c;

    iget-object v1, p0, Ly3/c;->b:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡۥ(Ljava/lang/Object;)Ljava/security/SecureRandom;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/u7;

    invoke-virtual {p0}, Lk6/u7;->x0()Ljava/security/SecureRandom;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۥۣۧ()[Ljava/lang/String;
    .locals 1

    invoke-static {}, Lm5/۟ۥۣۧۥ;->ۡۡۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/k;->m:[Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦۤ۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/v3;

    iget-boolean v1, p0, Lk0/v3;->a:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۢ۟ۡ()Lk0/m0;
    .locals 1

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk0/m0;->q:Lk0/m0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۥۦ۟(Ljava/lang/Object;)Lk6/p6;
    .locals 2

    invoke-static {}, Lt2/۟ۢ۟ۢ۟;->۠ۤۦۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/r6;

    iget-object v1, p0, Lk6/r6;->b:Lk6/p6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦۥۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ll0/ۤ۠ۧ;->۟ۦ۟ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/h0;

    iget v1, p0, La5/h0;->d:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
