.class public Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۢۦۣۥ:I = -0x8f


# direct methods
.method public static ۟۟ۤ۠ۧ(I)V
    .locals 1

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0}, Lla/g;->g(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۥ۠ۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lr1/۟ۤۤۡ۠;->ۨۡ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/q3;

    iget-wide v2, p0, Lk0/q3;->o:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۠ۥۧۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/k;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lk6/k;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۧ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lp4/ۣ۟۟ۢۥ;->۟۠ۢۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥ۟ۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

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

    move-result-object v3

    const-string v0, "a"

    :cond_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_3
    if-lt v0, v4, :cond_4

    :goto_4
    array-length v0, v3

    if-lt v1, v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "a"

    goto :goto_2

    :cond_4
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_4
.end method

.method public static ۣ۟ۢ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/d2;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Lk0/d2;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۥۣ۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/y5;

    iget-boolean v1, p0, Lk6/y5;->i:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۤۧ([SIII)Ljava/lang/String;
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

.method public static ۟ۤۡۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۥۢۨۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lr2/۠ۨۦۢ;->۟ۦ۟ۢۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/a2;

    iget-wide v2, p0, Lf0/a2;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۥۦۥۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/k;

    check-cast p1, Lk6/a5;

    invoke-virtual {p0, p1}, Lk6/k;->M(Lk6/a5;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۨۢۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ld8/ۣۡۡ۠;->۟۠ۧۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Play sound when ride is accepted"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۦۨ(Ljava/lang/Object;Ljava/lang/Object;JZZ)V
    .locals 1

    invoke-static {}, Ls0/ۢۨۦ۟;->ۣۡۨۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/y5;

    check-cast p1, Lk6/s5;

    invoke-static/range {p0 .. p5}, Lk6/y5;->K(Lk6/y5;Lk6/s5;JZZ)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۠ۢۡ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۧۡۥۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/f1;

    iget-object v1, p0, Ld5/f1;->d:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۠ۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۣۧۡ(Ljava/lang/Object;)Lc9/a;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۧۥۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/u1;

    iget-object v1, p0, Ld5/u1;->b:Lc9/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۡۥۤ()I
    .locals 2

    const v0, 0x25

    sget v1, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۧۧۦۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۡۨۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۧۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Got multiple records for user property, expected one. appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۧ۟ۦ()I
    .locals 1

    invoke-static {}, Lv0/ۣ۟۟ۤۧ;->ۡۡۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/measurement/zzcc;->zza:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۧۤۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۣۣ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/u1;

    iget-boolean v1, p0, Lk0/u1;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۟ۧۥ(Ljava/lang/Object;)[Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟۟۠ۤۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lx9/i;

    iget-object v1, p0, Lx9/i;->c:[Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۥۢ(Ljava/lang/Object;)Lt1/s1;
    .locals 2

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lt1/x0;

    iget-object v1, p0, Lt1/x0;->d:Lt1/s1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۤۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lh3/ۣ۟ۢۡۤ;->ۧۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "shizuku_notice"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۡ(Ljava/lang/Object;)La5/i0;
    .locals 2

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۠ۦۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La5/h0;

    iget-object v1, p0, La5/h0;->a:La5/i0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
