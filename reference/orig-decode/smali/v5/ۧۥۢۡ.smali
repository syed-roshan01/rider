.class public Lv5/ۧۥۢۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۧ۟ۨ:I = 0x23d


# direct methods
.method public static ۟ۢ۟ۧۢ(Ljava/lang/String;)Ljava/lang/String;
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

    move-result-object v3

    array-length v4, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_2
    if-lt v0, v4, :cond_2

    :goto_3
    array-length v0, v3

    if-lt v1, v0, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

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
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_3
.end method

.method public static ۟ۢۢۤۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟۟۟ۥ()Z
    .locals 2

    invoke-static {}, Ld8/ۣۡۡ۠;->۟۠ۧۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqd;->zzc()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣ۟ۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/ۦۢۨ;->۟۠ۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/j6;

    iget v1, p0, Lk6/j6;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟۟ۡ۟۟;->۟ۤ۟ۢ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۢۡ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzb;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۡۧۡۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzt()Lcom/google/android/gms/internal/measurement/zzfi$zzb;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۧۤ([SIII)Ljava/lang/String;
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

.method public static ۡ۠ۢ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۤ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/v0;

    iget v1, p0, Lk0/v0;->e:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۤۥ(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Li6/ۡۤۦ;->ۤۨۨ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->v:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۦۦۨ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ld1/ۣۧۡۡ;->ۢۨ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->o0()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۦ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lg/۟ۦۥۥۤ;->ۥۤۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzew$zzf;

    check-cast p2, Lk6/d4;

    invoke-static {p0, p1, p2}, Lk6/d;->d(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzew$zzf;Lk6/d4;)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۧۡۨ()Lm0/m3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk0/k0;->a:Lm0/m3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۨۤ(ZII)I
    .locals 1

    invoke-static {}, Lz7/۟ۢۧۡۥ;->۠ۡۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1, p2}, Ll/q;->c(ZII)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۠ۧ(Ljava/lang/Object;)Lk6/s6;
    .locals 2

    invoke-static {}, Landroidx/core/app/ۣۥۢۧ;->ۢۥۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/u6;

    iget-object v1, p0, Lk6/u6;->c:Lk6/s6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۢ۠۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/j1;

    iget v1, p0, Lf0/j1;->c:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۨۨ(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 2

    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/d;

    iget-object v1, p0, Lk6/d;->d:Ljava/lang/Boolean;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۢۡ۠()I
    .locals 2

    const v0, 0xe7

    sget v1, Lh5/ۧ۟ۨۧ;->ۨۨ۟ۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۥۨۨۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;
    .locals 1

    invoke-static {}, Ls2/۟ۧ۟ۧۤ;->۟۟ۤۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "adid_reporting_enabled"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۡ۟(Ljava/lang/Object;)Lk6/t4;
    .locals 2

    invoke-static {}, Lj5/۟ۢۥۨۦ;->۟۠ۦ۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/y4;

    iget-object v1, p0, Lk6/y4;->b:Lk6/t4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
