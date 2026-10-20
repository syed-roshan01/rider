.class public Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۦۡ۠ۥ:I = 0x217


# direct methods
.method public static ۟۟۠ۢۢ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۣۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld1/d;

    iget v1, p0, Ld1/d;->a:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۦ۟(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lz4/d;

    invoke-virtual {p0}, Lz4/d;->a()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۟۠([SIII)Ljava/lang/String;
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

.method public static ۟۟ۦۢۡ()Lf5/a0;
    .locals 1

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lf5/a0;->a:Lf5/a0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/m1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/m1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۢۡ(Ljava/lang/Object;)Lc9/c;
    .locals 2

    invoke-static {}, Lg3/۟ۥۣۣۥ;->۟ۤۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/a1;

    iget-object v1, p0, Lf0/a1;->a:Lc9/c;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۡ(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Lx4/۟ۤۦۥ۟;->ۣۢۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/u;

    iget-object v1, p0, Lf0/u;->r:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۤۥ(Ljava/lang/Object;)[Ljava/lang/String;
    .locals 1

    invoke-static {}, Lv6/۟ۦۣۧۦ;->۟۟۠۟ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljavax/net/ssl/SSLSocket;

    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۥۦ(I)I
    .locals 1

    invoke-static {}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۥۡۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0}, Lcom/google/protobuf/v;->m0(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣ۟ۥ(Ljava/lang/Object;)Lk6/c5;
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/ۣۨۥۣ;->۠ۡۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/z4;

    iget-object v1, p0, Lk6/z4;->c:Lk6/c5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۣۡ(J)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lr5/ۣۢ۟ۦ;->۠ۥۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    invoke-static {}, Lz2/ۢۨۨۦ;->ۦۥۨۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۧۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡۧ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۠ۡۨۢ()J
    .locals 4

    invoke-static {}, Lu/ۣۤۧ۠;->ۣۨۧۦ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Le5/a;->e()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦۥۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, La8/ۣۡۨ۠;->۟ۡۤۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Grant Display Over Other Apps"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۥۤۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/f0;

    iget v1, p0, Lf0/f0;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۦۣۢ()Lk0/l0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/ktx/ۡ۟ۢ;->ۡۧ۠۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/l0;->d:Lk0/l0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۠۠()J
    .locals 2

    invoke-static {}, Lh7/ۥۥۢ۟;->ۦ۠ۤۤ()I

    move-result v0

    if-lez v0, :cond_0

    sget-wide v0, Ll0/c;->n:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۤۦۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۥۨ۠۟()I
    .locals 2

    const v0, -0x309

    sget v1, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->ۧۤۨۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦ۟۠۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lx4/۟ۤۦۥ۟;->ۣۢۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/f0;

    iget v1, p0, Lk0/f0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۧۨ()Li1/f;
    .locals 1

    invoke-static {}, Lw6/۟ۥۧۡۨ;->ۧۥۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lf6/a;->w:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۥۨ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/k2;

    iget-object v1, p0, Ld5/k2;->o:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۨۡ۠(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۦۣۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/w2;

    invoke-virtual {p0}, Lm0/w2;->d()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۨۦ۟ۦ()F
    .locals 1

    invoke-static {}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۣ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, Ll0/q;->d:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
