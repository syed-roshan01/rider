.class public Lc7/۟ۦۣۢۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۦ۠۟ۨ:I = -0x2fa


# direct methods
.method public static ۟۟ۤ۟ۡ(I)Lm0/l1;
    .locals 1

    invoke-static {}, Ld3/ۡۨۢۦ;->۟ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۥ()Ljava/util/Locale;
    .locals 2

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۤۤ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۠۟ۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->s:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥ۠ۡ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, La/ۨۥۥۤ;->۟ۥ۠ۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/e4;

    iget-wide v2, p0, Lk0/e4;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۤۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lz0/ۣ۟۠ۤ۟;->ۣ۟ۡۤۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/b2;

    iget v1, p0, Ld5/b2;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۨۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/g0;

    iget-object v1, p0, Ld5/g0;->c:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۢ()I
    .locals 2

    const v0, -0x258

    sget v1, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣ۟۟ۦۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۧۦۥ(I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->ۢ۠ۧۦ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Lz7/b;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۦ۟ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/util/Map;

    invoke-static {p0, p1}, Lr7/e;->c(Ljava/lang/String;Ljava/util/Map;)Lz7/b;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۟ۤۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ly/ۤۨۧ۟;->ۣۧۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/g0;

    iget v1, p0, Lf5/g0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۥۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۥۧۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۢۥۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/res/Resources;

    check-cast p1, Landroid/content/res/Configuration;

    check-cast p2, Landroid/util/DisplayMetrics;

    invoke-virtual {p0, p1, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۣۨ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۤ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/m7;

    invoke-virtual {p0}, Lk6/m7;->p()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۥۦۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, La2/۟ۡۥۦ۟;->۟ۤۨ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/e0;

    iget-object v1, p0, Lf5/e0;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦ۠ۥ([SIII)Ljava/lang/String;
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
