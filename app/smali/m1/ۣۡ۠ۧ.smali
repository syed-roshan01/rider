.class public Lm1/ۣۡ۠ۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۥۦۨۤ:I = 0x216


# direct methods
.method public static ۟۟ۧ۟ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟۠ۢۨۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lea/ۦۦۨۨ;->۟ۤۦ۠ۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۢۢ([SIII)Ljava/lang/String;
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

.method public static ۟ۤ۟۟۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۥ۟ۤۧ()Lk6/h;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۣ۟ۥۧۧ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/h;->a:Lk6/h;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lg4/۠ۤۢۥ;->ۨۡۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf5/c;

    iget-object v1, p0, Lf5/c;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥۨۥ()I
    .locals 2

    const v0, 0xc2

    sget v1, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟۟ۥۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۧۧۥۤ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lf4/ۡۥۣۢ;->ۣۧۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lq6/l;

    invoke-virtual {p0}, Lq6/l;->b()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۦۡۤ()[Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۦۣۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk6/t5;->e:[Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, La2/ۢۦۧۦ;->ۤۦۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/o0;

    invoke-virtual {p0, p1}, Ld5/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡۥ(Ljava/lang/Object;)[I
    .locals 2

    invoke-static {}, Lr2/ۧۧۢۢ;->ۣ۟۟ۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/q2;

    iget-object v1, p0, Lm0/q2;->b:[I

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۥۢ۠(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lw/ۥۣۡۡ;->ۣ۟۟ۥ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzo()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۡۦ(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/regex/Matcher;

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ll8/ۢۦۥۢ;->۟ۢۡۢۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzad()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۠۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ll8/ۢۦۥۢ;->۟ۢۡۢۢ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "com.google.android.gms.measurement.AppMeasurementJobService"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/u;

    iget-object v1, p0, Lk6/u;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥۢۦ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۡۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/b2;

    iget-object v1, p0, Ld5/b2;->p:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۨۥۧ()Lu0/b;
    .locals 1

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/o0;->b:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lg2/ۢۥۥۡ;->ۣ۟ۤۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/c3;

    iget v1, p0, Lk0/c3;->o:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۨۢ(Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 2

    invoke-static {}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۦۣۤۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->B:Ljava/util/HashMap;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/p5;

    invoke-interface {p0}, Lk6/p5;->zza()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۤۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lu/ۣۤۧ۠;->ۣۨۧۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/m0;

    iget v1, p0, Ld5/m0;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
