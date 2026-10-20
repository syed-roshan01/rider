.class public Lh5/۟ۦۣۣ;
.super Ljava/lang/Object;


# static fields
.field public static ۠ۦۣ۟:I = -0x17e


# direct methods
.method public static ۟۠۟ۦۥ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lz/ۨۤۥۨ;->ۡ۠ۨۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/i;

    iget-object v1, p0, Ld5/i;->e:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۠ۨۥ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lj5/۟ۢۥۨۦ;->۟۠ۦ۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/f2;

    iget-object v1, p0, Lk0/f2;->d:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۡۤۥ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۦۡۦ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/q1;

    iget-boolean v1, p0, Lk0/q1;->p:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۢ()Lk0/f1;
    .locals 1

    invoke-static {}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۧۤۧ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk0/f1;->b:Lk0/f1;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟۠ۢۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "stealth_mode"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۦۨ()Lk6/x3;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۣۣۢۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk6/x;->i:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۠۟ۤ([SIII)Ljava/lang/String;
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

.method public static ۟ۥۣۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    invoke-static {}, Lc1/ۣ۟۠ۧۤ;->ۢ۟ۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/firebase/auth/FirebaseAuth;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->signInWithEmailAndPassword(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤ۠ۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۥۤۤ۠()J
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۧۥۣ۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget-wide v0, Ll0/c;->k:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣ۠۟()Lk6/i;
    .locals 1

    invoke-static {}, Lla/۟ۢۥۧۥ;->ۣ۟ۢۤۤ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/i;->p:Lk6/i;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥۤۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfc$zzd;
    .locals 1

    invoke-static {}, Lo1/۟ۡۡۦۣ;->۟ۥۥۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/t4;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [B

    invoke-virtual {p0, p1, p2}, Lk6/t4;->t(Ljava/lang/String;[B)Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۣۡ(Ljava/lang/Object;)Lk6/z3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f5;

    invoke-virtual {p0}, Lk6/f5;->k()Lk6/z3;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۧ۟()Lcom/google/firebase/Timestamp;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۣۣۡ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Lcom/google/firebase/Timestamp;->now()Lcom/google/firebase/Timestamp;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۧۦ۟(Ljava/lang/Object;F)Z
    .locals 1

    invoke-static {}, Ls8/۟ۥۨۨ;->۟۠۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0, p1}, Lm0/q;->d(F)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۨ۟ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۥ۟۠ۥ()F
    .locals 1

    invoke-static {}, Lh7/ۣ۟ۤ۠۠;->ۧ۠ۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lk0/u3;->c:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۡۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->J:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۦۣۦۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/util/DisplayMetrics;

    iget v1, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۧۨ(JFLjava/lang/Object;)J
    .locals 2

    invoke-static {}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۥۦۥۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p3, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Lk0/p3;->c(JFLm0/m;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۧۧۤۤ()I
    .locals 2

    const v0, 0x1fc

    sget v1, Lv8/۟ۧۢ۟ۢ;->۟ۥۡۧۥ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۦۣۤۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/Locale;

    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
