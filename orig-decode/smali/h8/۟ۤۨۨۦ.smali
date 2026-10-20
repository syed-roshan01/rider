.class public Lh8/۟ۤۨۨۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۤۡۦ:I = 0x238


# direct methods
.method public static ۟۟۠ۢۡ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Ld9/ۥۡۧۡ;->۟ۥۦ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/f1;

    iget-object v1, p0, Ld5/f1;->b:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟۠ۤۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh/ۥۦۡۧ;->ۥ۟ۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "config_fetched_time"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۤۨ۟([SIII)Ljava/lang/String;
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

.method public static ۟ۡ۟۠ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۡ۠ۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۧۦۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/d1;

    iget v1, p0, Lk0/d1;->f:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢ۠ۥ()Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpa;->zze()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۥۡۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/x0;

    iget-object v1, p0, Ld5/x0;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۦ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/f4;

    iget v1, p0, Lk6/f4;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۦۧ(Ljava/lang/Object;Ljava/lang/Object;JJLjava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lu0/ۣ۟ۤ۟ۡ;->۟ۡۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/f4;

    check-cast p1, Lk0/f1;

    check-cast p6, Lc9/f;

    check-cast p8, Lc9/h;

    check-cast p9, Lm0/m;

    invoke-virtual/range {p0 .. p10}, Lk0/f4;->b(Lk0/f1;JJLc9/f;ZLc9/h;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۥۣ۟(Ljava/lang/Object;)Ll2/o;
    .locals 2

    invoke-static {}, Landroidx/preference/۟ۤۥۦۧ;->ۣۡۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/x;

    iget-object v1, p0, La2/x;->a:Ll2/o;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۡۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/t3;

    iget v1, p0, Lk0/t3;->s:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠(Ljava/lang/Object;I)I
    .locals 1

    invoke-static {}, Lh7/ۣ۟ۤ۠۠;->ۧ۠ۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۢۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu0/ۣ۟ۤ۟ۡ;->۟ۡۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "session_stitching_token"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡ۟ۢ(Ljava/lang/Object;)Lk6/h5;
    .locals 2

    invoke-static {}, Landroid/os/ۣۣ۟ۤۨ;->۟ۧۥ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/i5;

    iget-object v1, p0, Lk6/i5;->c:Lk6/h5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۨۧۢ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ll3/ۥۣۤ۟;->ۡۥۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzne;->zzan()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۦۨ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۥۡۧ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/n3;

    iget v1, p0, Lk0/n3;->d:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤ۟ۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/b0;

    iget-boolean v1, p0, La5/b0;->a:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۤۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/database/Cursor;

    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۡ۟ۨ(Ljava/lang/Object;)Lk6/w4;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->۟۠ۡ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/t4;

    iget-object v1, p0, Lk6/t4;->k:Lk6/w4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۣۣۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۠ۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/d1;

    invoke-virtual {p0, p1}, Lf0/d1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۡۤۧ()I
    .locals 2

    const v0, 0x39a

    sget v1, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۢۢۧۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۧۤۢ(Ljava/lang/Object;)Lk6/f5;
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۢۥۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->l:Lk6/f5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۢ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۣۦۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/o;

    iget v1, p0, La5/o;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۟ۢۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟۟۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/n1;

    iget-boolean v1, p0, Lk0/n1;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
