.class public Lt2/۟ۦۢۡۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣ۟ۤۧ:I = -0x33b


# direct methods
.method public static ۟۠ۢ۠۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw2/ۤ۠ۨۤ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/g1;

    invoke-static/range {p0 .. p0}, Ly3/e;->l(Lm0/g1;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۡۧ(D)Ljava/lang/Double;
    .locals 1

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۟()Li1/f;
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lz6/a;->p:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۧ(Ljava/lang/Object;Z)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Ll0/ۡۦۦۡ;->ۣ۟ۤ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Z)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۨ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۨ۠(Ljava/lang/Object;F)J
    .locals 2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۣۡۧۥ;->۟ۡۧ۟ۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i0;

    invoke-static {p0, p1}, Lk0/k0;->e(Lk0/i0;F)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۡ۠()Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۣۢۥۧ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzi;->zzb()Lcom/google/android/gms/internal/measurement/zzfi$zzi$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢۡۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lorg/json/JSONArray;

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۠ۦۣۦ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۟ۢ۠ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzne;->zzam()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۧۥۥ(Ljava/lang/Object;F)I
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۡ۟ۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La2/a0;

    invoke-virtual {p0, p1}, La2/a0;->g(F)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۧ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۣۧ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/z1;

    iget-object v1, p0, Ld5/z1;->d:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۨۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۣۥۣ([SIII)Ljava/lang/String;
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

.method public static ۣۣۥۥ()I
    .locals 2

    const v0, -0x71

    sget v1, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۢۡۥۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۥ۟ۡۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۥۡۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/g;

    iget v1, p0, Ld5/g;->f:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۧۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "timed_out_event"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
