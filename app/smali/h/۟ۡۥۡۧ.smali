.class public Lh/۟ۡۥۡۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟ۧ۟ۤ:I = -0x3e2


# direct methods
.method public static ۣ۟۟ۧۤ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/os/Parcel;
    .locals 1

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzbu;

    check-cast p2, Landroid/os/Parcel;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzbu;->zza(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۧۤ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lw6/۟ۥۧۡۨ;->ۧۥۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/nio/channels/FileLock;

    invoke-virtual {p0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ly/ۤۨۧ۟;->ۣۧۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly3/j;

    invoke-virtual {p0, p1}, Ly3/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤ(Ljava/lang/Object;)La2/c0;
    .locals 2

    invoke-static {}, Lk7/۟ۤۥۡ;->ۥۢۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/e5;

    iget-object v1, p0, Lk0/e5;->l:La2/c0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۢ۠ۨۥ(Ljava/lang/Object;I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lg/۟ۧ۠ۤ;->ۢۢۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zze(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۟۠ۤۤۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/ViewManager;

    check-cast p1, Landroid/view/View;

    invoke-interface {p0, p1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۧ۟ۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Li9/ۨۨ۟;->ۦۧۢۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/KeyEvent;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۢۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Le2/۟۟ۥۦ;->ۥۦۡۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/n5;

    iget v1, p0, Lk6/n5;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lg2/ۢۥۥۡ;->ۣ۟ۤۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lc0/f;

    check-cast p1, Ld1/d;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lc0/f;->a(Ld1/d;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۣۥ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfi$zzn$zza;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣ۠۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ld/۟ۤ۠ۡۨ;->ۦۢۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "data"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۧ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۡۦۣۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lg8/g1;

    iget-wide v2, p0, Lg8/g1;->i:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/j1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ld5/j1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢ۠ۢ([SIII)Ljava/lang/String;
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

.method public static ۣۡۥ۟()I
    .locals 2

    const v0, -0x62

    sget v1, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۡۦۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/a4;

    iget-object v1, p0, Lk0/a4;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۢۤۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟ۡۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Service Stopped"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
