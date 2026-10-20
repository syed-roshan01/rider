.class public Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۧۧ۠ۥ:I = 0x3c4


# direct methods
.method public static ۟۠ۢ۟۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡۧۡۤ()I
    .locals 2

    const v0, -0x26

    sget v1, Ld7/ۢۧۧۢ;->۟ۢۧۤۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۢۦ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Landroid/os/ۣۣ۟ۤۨ;->۟ۧۥ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0, p1, p2}, Lk6/a5;->y(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۦ۠(Ljava/lang/Object;FJFI)V
    .locals 1

    invoke-static {}, Landroid/support/v4/app/ۥۣۡ;->ۣ۠۠ۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lg1/g;

    invoke-static/range {p0 .. p5}, Lk0/b2;->d(Lg1/g;FJFI)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۤۢۨ()La2/c0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۡۦۢۧ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ll0/u;->i:La2/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۦۡ(Ljava/lang/Object;)Lc5/f;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/MainActivity;

    iget-object v1, p0, Lcom/auto/accept/ui/MainActivity;->f:Lc5/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦ۠ۨ(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, La6/۟ۤۨۨ۟;->ۥۣۤۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzb()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠۠ۦ(ZLjava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;JJLjava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۣۣۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p1, Lc9/a;

    check-cast p2, Ly0/o;

    check-cast p4, Lc9/e;

    check-cast p5, Lc9/e;

    check-cast p10, Lx/m;

    check-cast p11, Lm0/m;

    invoke-static/range {p0 .. p13}, Lk0/c4;->b(ZLc9/a;Ly0/o;ZLc9/e;Lc9/e;JJLx/m;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۦ۠ۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Error updating daily counts. appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۤ(Ljava/lang/Object;)Lv6/j;
    .locals 1

    invoke-static {}, Lfa/ۢۤۢ۟;->۟ۦۣۢۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Li7/i1;

    invoke-static {p0}, Lv6/j;->a(Li7/i1;)Lv6/j;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟ۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lm7/ۧۢ۟;->ۤۧ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۣ([SIII)Ljava/lang/String;
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

.method public static ۣۡۡۦ(Ljava/lang/Object;)Lg2/a0;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/c0;

    iget-object v1, p0, Lf0/c0;->c:Lg2/a0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۤ۠۟()Lu0/b;
    .locals 1

    invoke-static {}, Lu1/۟ۧۥۢ۠;->ۢۡۨۧ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Ld5/o;->a:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۧۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lf4/ۦۣ۟ۦ;->۟ۡۤۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Select Your Plan"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۡۢ(Ljava/lang/Object;)Lc9/c;
    .locals 2

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/h;

    iget-object v1, p0, Lf0/h;->b:Lc9/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥ۠ۥ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lu4/۟ۡۢۦۣ;->ۣۣۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۡۨ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۨۨۧ۠()Lt/w;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lt/c0;->b:Lt/w;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۨۨۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۢ۠۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/v1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/v1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
