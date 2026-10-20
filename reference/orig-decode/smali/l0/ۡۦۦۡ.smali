.class public Ll0/ۡۦۦۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۦۨۨۥ:I = -0x3c9


# direct methods
.method public static ۣ۟۟ۡۡ()Lk6/x3;
    .locals 1

    invoke-static {}, Lz1/۟ۦ۟۠۟;->۟۠ۦۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk6/x;->F0:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۤ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/v4;

    iget-object v1, p0, Lk0/v4;->e:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۦ۠(Ljava/lang/Object;I)F
    .locals 1

    invoke-static {}, Ll8/ۢۦۥۢ;->۟ۢۡۢۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lt/t;

    invoke-virtual {p0, p1}, Lt/t;->a(I)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۟()I
    .locals 2

    const v0, -0xe1

    sget v1, Ls0/ۧۧۨۥ;->ۣ۠ۢۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۤۦ۟ۢ()Lv0/p;
    .locals 1

    invoke-static {}, Lx4/۟ۤۦۥ۟;->ۣۢۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lz/g0;->A:Lv0/p;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢۤۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۠۟ۦۥ([SIII)Ljava/lang/String;
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

.method public static ۣۣۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lf/۟ۤۧ۠ۡ;->ۣۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lt/d;

    check-cast p2, Lt/n;

    check-cast p3, Lu8/e;

    invoke-static {p0, p1, p2, p3}, Lt/d;->b(Lt/d;Ljava/lang/Object;Lt/n;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢۤۨ(Ljava/lang/Object;Ljava/lang/Object;)[B
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۥ۠ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/security/MessageDigest;

    check-cast p1, [B

    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۤۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lu/ۤ;->ۣ۟ۢۡۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/z;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ld5/z;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۤ۠ۢ(JIII)J
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, Lo1/s;->b0(JIII)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۥۦۤ۠(ILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p1, Lm0/m;

    invoke-static {p0, p1}, Lf6/a;->T(ILm0/m;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۟ۨ()Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۦۨۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzb:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۡۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc7/۟ۦۣۢۦ;->۟ۦۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "app_id = ?"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧ۟ۥ()J
    .locals 4

    invoke-static {}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۟ۢ۠ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzne;->zzab()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۧۢۥ()Lv/h1;
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lv/h1;->a:Lv/h1;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
