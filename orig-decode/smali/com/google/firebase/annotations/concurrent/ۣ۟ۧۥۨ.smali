.class public Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۤۥۤ:I = -0x6e


# direct methods
.method public static ۟۟۟۠ۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡۤۨۧ([SIII)Ljava/lang/String;
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

.method public static ۟ۡۥۣۡ()Ly0/e;
    .locals 1

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ly0/a;->q:Ly0/e;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦ()I
    .locals 2

    const v0, -0x337

    sget v1, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۤۥۤ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۥۣۤ۠(Ljava/lang/Object;)Lk6/y3;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/s6;

    iget-object v1, p0, Lk6/s6;->d:Lk6/y3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۤۢ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ls6/۟ۡ۟ۧۢ;->ۣ۟۠ۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Malayalam"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۣۤ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۢ۠۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzav()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۧۢ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lca/ۨۤۢۥ;->ۢۥۣۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La2/k;

    invoke-virtual {p0}, La2/k;->b()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۧۤۡ(Ljava/lang/Object;)Lm0/j0;
    .locals 2

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۟ۦۥۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/x1;

    iget-object v1, p0, Lf0/x1;->c:Lm0/j0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۧۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Landroidx/annotation/۟ۥۥۣۨ;->۟۟۟ۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/b1;

    iget-wide v2, p0, Lk0/b1;->c:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۡۤۥۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣۢۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "grant_shizuku_btn"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦ۠ۤ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->۟ۤ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->r0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢ۠۠(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Ly6/۟ۢ۟ۥۤ;->ۢۥۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/g;

    iget-object v1, p0, Ld5/g;->e:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢۡ۠()Lg5/c;
    .locals 1

    invoke-static {}, Lp4/ۣ۟۟ۢۥ;->۟۠ۢۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lg5/c;->d:Lg5/c;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۧۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۤ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Ld5/o1;->h(Ljava/lang/String;Ljava/lang/String;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧ۠۟(Ljava/lang/Object;)Lg2/o;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/e0;

    iget-object v1, p0, Lf0/e0;->e:Lg2/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۟ۦۥ()Ly1/u;
    .locals 1

    invoke-static {}, Lt9/ۧۦۥ۟;->ۣۣ۟ۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ly1/r;->x:Ly1/u;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۨۢ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۣۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lg1/g;

    invoke-interface {p0}, Lg1/g;->e()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤۧۤ(Ljava/lang/Object;)Ly0/o;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->۟ۥۢۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/q;

    iget-object v1, p0, Lk0/q;->a:Ly0/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
