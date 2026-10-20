.class public Lg8/ۣۣۣ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۢ۟ۥ:I = -0x3b3


# direct methods
.method public static ۟۟ۤۡ۟()Z
    .locals 2

    invoke-static {}, Lv0/۟ۦۣ۟ۤ;->۟ۡۡۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznp;->zze()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri$Builder;
    .locals 1

    invoke-static {}, Lf/ۣ۟ۤۤ;->ۦۤۥ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/net/Uri$Builder;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠۠ۡۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lt7/۟ۡ۠ۨ۟;->ۣۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/g0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/g0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۨۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lz7/۟ۢۧۡۥ;->۠ۡۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/s4;

    iget-boolean v1, p0, Lk0/s4;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/startup/ۨۤ۟ۡ;->۟ۥۣۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/d1;

    iget-object v1, p0, Ld5/d1;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۢۡۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/۠ۤۢ۟;->ۡۥۣ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/j0;

    iget-object v1, p0, Lf0/j0;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۤۤ(Ljava/lang/Object;)La5/j;
    .locals 2

    invoke-static {}, Lg/۟۠ۡۨۨ;->ۣۣ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/h;

    iget-object v1, p0, La5/h;->b:La5/j;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۦ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۡۨۢ(Ljava/lang/Object;J)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lm7/ۥۨۥ۟;->۟ۡ۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/k;

    invoke-virtual {p0, p1, p2}, Lk6/k;->y(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۦ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/x;

    iget-wide v2, p0, La2/x;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۨ۟(Ljava/lang/Object;)Lm2/b;
    .locals 2

    invoke-static {}, Ld2/۟ۦۡ۟ۦ;->ۣۧۡۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/j1;

    iget-object v1, p0, Lf0/j1;->g:Lm2/b;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۥۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Ll0/ۤ۠ۧ;->۟ۦ۟ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/io/DataInputStream;

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۟۟ۢ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->ۢ۠ۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zzc;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zzc;->zzg()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۧۨۦ()F
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟ۤۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lk0/u4;->h:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۡۤ(IILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-static {}, Le1/ۦۣۢۥ;->ۣۨۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p2, Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۤۧۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۤۨ۟ۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/b4;

    iget-boolean v1, p0, Lk6/b4;->d:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۡۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->۟ۢۦ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/s;

    invoke-virtual {p0, p1}, La5/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۥۥۢ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۣۢۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/q4;

    iget-wide v2, p0, Lk0/q4;->c:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣۧۤۧ([SIII)Ljava/lang/String;
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

.method public static ۨۢۢۨ()I
    .locals 2

    const v0, -0x67

    sget v1, Ly/۟ۤۥۨ;->۟ۢۡۧۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۥ۠ۢ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lh3/ۣ۠ۡۨ;->ۥۥ۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lz4/d;

    iget-object v1, p0, Lz4/d;->N:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
