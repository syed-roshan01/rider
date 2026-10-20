.class public Le1/۟ۢ۟ۤۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۨ۠ۡ۟:I = 0x2e4


# direct methods
.method public static ۣ۟۟ۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۤ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/accessibilityservice/AccessibilityService;

    check-cast p1, Landroid/accessibilityservice/AccessibilityServiceInfo;

    invoke-virtual {p0, p1}, Landroid/accessibilityservice/AccessibilityService;->setServiceInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡ۟ۤۧ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lt2/۟ۢ۟ۢ۟;->۠ۤۦۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/n;

    invoke-virtual {p0, p1, p2}, Lk6/n;->b(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢ۠۟ۤ(Ljava/lang/Object;)Ll2/r;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La2/p;

    iget-object v1, p0, La2/p;->i:Ll2/r;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢۨ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۢۥ۟(Ljava/lang/Object;Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Lj2/ۥ۠ۨۢ;->ۣۢۡۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly/t0;

    check-cast p1, Lm2/l;

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/a;->e(Ly/t0;Lm2/l;)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۥۤ(Ljava/lang/Object;)Lg2/i0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟۟ۨ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/e0;

    iget-object v1, p0, Lf0/e0;->a:Lg2/i0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣ۠ۡ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->۟ۤ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/i2;

    iget-object v1, p0, Lk0/i2;->n:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۥۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ly6/۟ۤۥۥۥ;->۠۠ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/g0;

    iget-object v1, p0, Lf5/g0;->d:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۧۧ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lu8/ۨۡ۠;->ۨۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/a2;

    iget-object v1, p0, Ld5/a2;->d:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۦۨۥ(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Ld1/۟ۡۨۧۢ;->ۣ۟ۡۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/t;

    iget-object v1, p0, Lf0/t;->o:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۧۥۨ()I
    .locals 2

    const v0, -0x318

    sget v1, Ldagger/hilt/components/۟ۦۣۤۤ;->ۨ۟۠ۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۢ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->ۨۢۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->i:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۟۟(Ljava/lang/Object;)Lk6/s6;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟۠ۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/t6;

    iget-object v1, p0, Lk6/t6;->f:Lk6/s6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۥۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->ۣۡۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۟ۥ([SIII)Ljava/lang/String;
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
