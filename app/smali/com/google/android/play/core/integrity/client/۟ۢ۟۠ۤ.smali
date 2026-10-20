.class public Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۥ۠:I = -0x2d8


# direct methods
.method public static ۟۟ۢ۟ۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf5/i;

    iget-object v1, p0, Lf5/i;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۧۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟۠۠۟ۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۢۥۤ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/d;

    invoke-virtual {p0}, Lk6/d;->g()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۢۧ([SIII)Ljava/lang/String;
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

.method public static ۟۠ۥۢۥ()I
    .locals 2

    const v0, -0x23b

    sget v1, Ll3/ۥۣۤ۟;->ۧۥۤۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۡ۠۟ۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lg5/ۣۡۦۣ;->۟ۢۤ۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/h4;

    iget v1, p0, Lk0/h4;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۡ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۢۧ۠(J)F
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->ۥۢۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Ld1/c;->e(J)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۥۡ(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Ln7/۟ۡۢۦ;->۠ۧۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->h0:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦۨۥ()Li4/a;
    .locals 1

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Li4/a;->a:Li4/a;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥۨۨ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzby;
    .locals 1

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۣۣ۟ۥ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/IBinder;

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzcb;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/zzby;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣ۟۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lz/۟ۥۣۣ۠;->۟ۢۧۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/v2;

    iget v1, p0, Lk0/v2;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟ۧ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i4;

    iget-object v1, p0, Lk0/i4;->a:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۡۤۦ(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Ls2/۟ۧ۟ۧۤ;->۟۟ۤۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/SupportedApp$Companion;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/SupportedApp$Companion;->getALL_APPS()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ln8/ۢۡۨۨ;->ۢ۟ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lz4/b;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz4/b;->b(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥ۟۟ۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lj5/۟ۢۥۨۦ;->۟۠ۦ۟ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzd;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzd;->zza()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۦۣ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lj3/۟ۧۧۦۤ;->ۡ۟ۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->H:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۥۦ۠ۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/l5;

    iget-object v1, p0, Lk6/l5;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۡۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ly6/۟ۢ۟ۥۤ;->ۢۥۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lu8/e;

    invoke-interface {p0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
