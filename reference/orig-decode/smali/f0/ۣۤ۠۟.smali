.class public Lf0/ۣۤ۠۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۧۦۥ:I = 0x14c


# direct methods
.method public static ۟ۡۦۡۦ(Ljava/lang/Object;)Lcom/auto/accept/data/model/CouponData;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟۠ۥۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/l;

    iget-object v1, p0, Lf5/l;->n:Lcom/auto/accept/data/model/CouponData;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۨۤ()Ld5/l;
    .locals 1

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۠ۦۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ld5/l;->o:Ld5/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۥ۠۟([SIII)Ljava/lang/String;
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

.method public static ۣۣ۟۟۠(Ljava/lang/Object;J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Ld1/۟ۡۨۧۢ;->ۣ۟ۡۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzl(J)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۨۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣۣ۟ۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۦۤ()Li1/f;
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۡۦ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lf6/a;->q:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۧۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۤۢۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lla/۟ۢۥۧۥ;->ۣ۟ۢۤۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lr5/۟ۤۨۥۡ;->ۥ۠ۥ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/y;

    invoke-virtual {p0, p1}, La5/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۟ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۦۢۢۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/fragment/app/ۣۣۣۨ;->ۣۣۣ۟ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zzb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzf()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥۣۧ()I
    .locals 2

    const v0, -0x34a

    sget v1, Lm7/ۧۢ۟;->ۣۣ۟ۨۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦۦ۠ۤ()Lk6/x3;
    .locals 1

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۢۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/x;->e:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۡ۟(D)J
    .locals 2

    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->۟ۤۨۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly3/a;

    iget v1, p0, Ly3/a;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۤ۠;->۟ۧ۠ۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/h3;

    iget v1, p0, Lk0/h3;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۨ۠ۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lc4/۟ۦۧۦۤ;->ۡ۟۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/r1;

    iget-boolean v1, p0, Lf0/r1;->d:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥۦۡ(Ljava/lang/Object;)Lk0/a3;
    .locals 2

    invoke-static {}, Ly9/ۧۨ۠ۢ;->۟ۦۡۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/p0;

    iget-object v1, p0, Ld5/p0;->d:Lk0/a3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۠۠ۨ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۣۧ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
