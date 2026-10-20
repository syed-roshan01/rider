.class public Lm7/ۧۢ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣ۟ۨۧ:I = 0x212


# direct methods
.method public static ۟۠ۡۢ۠(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lg4/۠ۤۢۥ;->ۨۡۥۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/k;

    iget-object v1, p0, Lf5/k;->p:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨۨۥ(Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Lq7/۟ۢۢ۟ۧ;->۟ۡۦۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/MotionEvent;

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡۦۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lf4/ۦۣ۟ۦ;->۟ۡۤۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/w4;

    iget v1, p0, Lk0/w4;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۣۤ()Lu0/b;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۤۥ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ld5/n;->j:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۟۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣۢۢ۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Open Developer Settings"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۧ(Ljava/lang/Object;FI)Le1/e0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-static {p0, p1, p2}, La4/q;->j(Ljava/util/List;FI)Le1/e0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۡۡ(Ljava/lang/Object;)Lm9/d0;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۧۧۢ;->۟ۢۥۣ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/v0;

    iget-object v1, p0, Ld5/v0;->r:Lm9/d0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢۡ()Lu0/b;
    .locals 1

    invoke-static {}, Ld1/۟۟ۥۡۡ;->ۨۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ld5/n;->g:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤۦ۠(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۡۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/d0;

    iget v1, p0, Lk0/d0;->a:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۥۨ(Ljava/lang/Object;)Lh0/v0;
    .locals 2

    invoke-static {}, Lq9/۟ۧۦۤۨ;->۟ۤۧۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/j0;

    iget-object v1, p0, Lf0/j0;->d:Lh0/v0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡ۠ۥۤ()Lx9/v;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۣۦۡ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ly3/e;->a:Lx9/v;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡۤ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zze;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzh()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->ۣ۟ۡ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۡۧ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۦۤ۟ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/l0;

    iget-object v1, p0, Ld5/l0;->b:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۧ۠()I
    .locals 2

    const v0, -0xa1

    sget v1, Lg/۟ۧ۠ۤ;->ۦۥۡۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۨۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lt/u1;

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠ۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lu3/ۣۡۡۢ;->ۡ۟ۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly3/b;

    iget-object v1, p0, Ly3/b;->e:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥۥۨ()[B
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟۟ۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ly3/e;->h:[B

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۠ۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦۣۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lx5/ۡۦۦۥ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/u;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, La5/u;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۧۢۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۨۨۨ([SIII)Ljava/lang/String;
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
