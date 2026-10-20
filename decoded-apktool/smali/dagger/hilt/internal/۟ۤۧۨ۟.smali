.class public Ldagger/hilt/internal/۟ۤۧۨ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۡۥۣۡ:I = 0x2ad


# direct methods
.method public static ۣ۟۟ۤۥ()Lf2/l;
    .locals 1

    invoke-static {}, Lw4/۟ۤ۠۟ۨ;->۟ۦۤۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lf2/l;->c:Lf2/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۤ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zza()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۡ۠ۥ(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/d1;

    iget-object v1, p0, Lk0/d1;->c:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۦۣ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۨ۠ۡۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Ola & Uber auto-accept engine ready at maximum speed."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۠۟ۤ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ld1/۟ۡۨۧۢ;->ۣ۟ۡۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/q3;

    iget-wide v2, p0, Lk0/q3;->l:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۠ۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۥۥۤ(Ljava/lang/Object;FF)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/graphics/Path;

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->offset(FF)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧ۟۠ۦ(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lf0/ۣۦۦ۠;->۟ۥۥۣۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۡ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lk7/۟ۤۥۡ;->ۥۢۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/i3;

    iget v1, p0, Lk0/i3;->r:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۣۡ(Ljava/lang/Object;)Lk0/x2;
    .locals 2

    invoke-static {}, Lt2/۟ۧۢ۟ۢ;->۟ۧۢۥۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/i3;

    iget-object v1, p0, Lk0/i3;->a:Lk0/x2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۡۤ()Lm0/n1;
    .locals 1

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk0/n2;->a:Lm0/n1;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۡۤ۟(Ljava/lang/Object;)Li9/f;
    .locals 1

    invoke-static {}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۠ۥۧۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Li9/e;

    invoke-virtual {p0}, Li9/e;->e()Li9/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۧ۟ۥ(Ljava/lang/Object;)Lu1/t2;
    .locals 2

    invoke-static {}, Lf6/ۣۣۣۣ۟;->۟ۡۧ۟ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/c2;

    iget-object v1, p0, Lf0/c2;->c:Lu1/t2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۤ()I
    .locals 2

    const v0, -0xeb

    sget v1, Lc1/ۢۥۥ۟;->ۣ۠ۡ۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۡ([SIII)Ljava/lang/String;
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
