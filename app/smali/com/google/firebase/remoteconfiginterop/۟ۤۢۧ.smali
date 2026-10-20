.class public Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣۤۤ:I = -0x1a5


# direct methods
.method public static ۟۟ۡۢۢ([SIII)Ljava/lang/String;
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

.method public static ۟۟ۨ۠ۥ()I
    .locals 2

    const v0, -0xe

    sget v1, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۡۥۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟۟ۨۨۧ(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, La2/۟ۡۥۦ۟;->۟ۤۨ۟۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzao()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۥۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡ۠ۦ۟(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lt7/۟ۡ۠ۨ۟;->ۣۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/u1;

    iget v1, p0, Lk0/u1;->c:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۣۨ()F
    .locals 1

    invoke-static {}, Ls/ۣۡۡۧ;->ۣ۟ۦ۟۟()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, Lk0/u4;->e:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Runnable;
    .locals 1

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzcm;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/measurement/zzcm;->zza(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢ۠ۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lz4/d;

    iget-object v1, p0, Lz4/d;->c:Landroid/content/SharedPreferences;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟ۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/x7;

    iget-wide v2, p0, Lk6/x7;->e:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۨۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/g3;

    iget-wide v2, p0, Lk0/g3;->n:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣۡۦۡ()Li1/f;
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lh6/g;->o:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۡۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۤۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/d2;

    iget-object v1, p0, Lk0/d2;->p:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->g:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۥ۠ۡۧ()Lcom/google/android/gms/internal/measurement/zzew$zze$zza;
    .locals 2

    invoke-static {}, La/ۥۡۢۨ;->۟ۨۢۧ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzc()Lcom/google/android/gms/internal/measurement/zzew$zze$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۤ۠ۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦۧۡ۟(Ljava/lang/Object;I)[B
    .locals 1

    invoke-static {}, Lg2/۟۠ۡۡۦ;->ۨۡۤۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/io/InputStream;

    invoke-static {p0, p1}, Lo1/s;->d0(Ljava/io/InputStream;I)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۨۢۨ(Ljava/lang/Object;)Lq/f;
    .locals 2

    invoke-static {}, Lb/۠ۨۦۥ;->۟۟۠۠ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/t4;

    iget-object v1, p0, Lk6/t4;->n:Lq/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۢۨ۟()Lw0/i;
    .locals 2

    invoke-static {}, Lb8/ۣ۟ۨۢۥ;->ۣ۟۠۠ۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۥۧ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lg8/ۣۣۣ۟;->ۨۢۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/y0;

    iget v1, p0, Ld5/y0;->n:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦۨۤ()Lk0/o2;
    .locals 1

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/o2;->b:Lk0/o2;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Le1/ۦۣۢۥ;->ۣۨۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzi()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
