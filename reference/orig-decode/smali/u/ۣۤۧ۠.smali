.class public Lu/ۣۤۧ۠;
.super Ljava/lang/Object;


# static fields
.field public static ۥۨۤۥ:I = 0xc7


# direct methods
.method public static ۟۟ۧۢۧ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/x1;

    iget-object v1, p0, Ld5/x1;->a:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۦ۠()F
    .locals 1

    invoke-static {}, Lc0/ۦ۠۟ۥ;->ۦۢ۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lk0/u4;->b:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/f0;

    iget-object v1, p0, Lf0/f0;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠۟۠([SIII)Ljava/lang/String;
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

.method public static ۣ۟ۧۡ۠(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lr1/۟ۤۤۡ۠;->ۨۡ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/t1;

    iget-object v1, p0, Lf0/t1;->a:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۤۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lq6/ۡۨۧۨ;->۟ۢۦۦۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/k1;

    iget v1, p0, Lk0/k1;->p:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۠۟۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۡۥۣۢ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lq2/ۣ۟ۢۥ۠;->ۣ۟ۢ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/s;

    invoke-static {p0}, Lk6/u7;->s(Lk6/s;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۤ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۟ۢ۠ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/d5;

    iget-wide v2, p0, Lk6/d5;->a:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۢۨۤۨ(Ljava/lang/Object;)Lh0/v0;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۣ۟ۧۦۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/p;

    iget-object v1, p0, Lf0/p;->b:Lh0/v0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۤ۟ۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lr2/۠ۨۦۢ;->۟ۦ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Hide Developer Options"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥ۠ۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۤ۠;->۟ۧ۠ۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/x0;

    iget-object v1, p0, Ld5/x0;->e:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۤۦ۠(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/regex/Matcher;

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧ۟ۤ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lu1/۟ۧۥۢ۠;->ۢۡۨۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzba()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۨۤ()Li1/f;
    .locals 2

    invoke-static {}, Ld3/ۡۨۢۦ;->۟ۢۧۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lh6/g;->Y()Li1/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۧۦ()I
    .locals 2

    const v0, 0x8b

    sget v1, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟۠ۨۧۥ:I

    xor-int/2addr v0, v1

    return v0
.end method
