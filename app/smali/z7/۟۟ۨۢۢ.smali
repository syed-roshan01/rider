.class public Lz7/۟۟ۨۢۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۥۡ۠:I = -0x14c


# direct methods
.method public static ۣ۟۟ۢ۟(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۤۦۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Ld5/o1;->j(ILm0/m;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۧۧ۠(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzew$zzc;
    .locals 1

    invoke-static {}, Ll8/ۣ۟ۧۢ۠;->۟ۦۣۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zze;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzb()Lcom/google/android/gms/internal/measurement/zzew$zzc;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۡۢ()I
    .locals 2

    const v0, 0x3ad

    sget v1, Ld4/۟۠۠۟ۢ;->ۣ۟ۢۧۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۡ۠ۦۤ(Ljava/lang/String;)Ljava/lang/String;
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

    move-result-object v3

    array-length v4, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_2
    if-lt v0, v4, :cond_2

    :goto_3
    array-length v0, v3

    if-lt v1, v0, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_3
.end method

.method public static ۟ۢۦۥۧ(Ljava/lang/Object;)[B
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟ۤ۠۠ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/d0;

    iget-object v1, p0, Lf5/d0;->d:[B

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۡۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۤۥۧ۟()I
    .locals 1

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, La2/y;->e:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lp0/۟ۧۧۧ۟;->ۦۧ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La5/d0;

    iget v1, p0, La5/d0;->e:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡ۟ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "auto"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣ۠ۤ()Lk0/j0;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟۟۠ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk0/j0;->b:Lk0/j0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟۠ۥۨۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/u7;

    check-cast p1, Landroid/os/Bundle;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lk6/u7;->D(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)I
    .locals 1

    invoke-static {}, Lq6/۟ۥۦۡ۟;->۟ۦۥۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/u1;

    check-cast p1, Lt1/c1;

    check-cast p2, Ljava/util/List;

    check-cast p4, Lk0/l0;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk0/u1;->f(Lt1/c1;Ljava/util/List;ILk0/l0;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۟۠ۤ(Ljava/lang/Object;)Lk0/f1;
    .locals 2

    invoke-static {}, Ln7/۟ۡۢۦ;->۠ۧۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/y4;

    iget-object v1, p0, Lk0/y4;->b:Lk0/f1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۟ۧۨ(Ljava/lang/Object;I)Lorg/json/JSONObject;
    .locals 1

    invoke-static {}, Lp5/۟ۡۧۡۨ;->۟۟۠ۢ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lorg/json/JSONArray;

    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۤۡ۠(Ljava/lang/Object;)Le0/a;
    .locals 2

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/q2;

    iget-object v1, p0, Lk0/q2;->b:Le0/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۥۤۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk/f;

    invoke-virtual {p0}, Lk/f;->p()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦ۠۟۠(Ljava/lang/Object;IJ)V
    .locals 1

    invoke-static {}, Lg2/۟۠ۡۡۦ;->ۨۡۤۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/p;->Y0(IJ)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۨۧۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ln8/ۢۡۨۨ;->ۢ۟ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/b5;

    iget-wide v2, p0, Lk0/b5;->r:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۧۨۧۥ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lw2/ۤ۠ۨۤ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/q4;

    iget v1, p0, Lk0/q4;->b:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۠۟ۧ([SIII)Ljava/lang/String;
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
