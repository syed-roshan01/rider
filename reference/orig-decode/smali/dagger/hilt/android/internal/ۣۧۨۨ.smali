.class public Ldagger/hilt/android/internal/ۣۧۨۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟۟ۦۨ:I = -0x2b7


# direct methods
.method public static ۟۠۠۠ۥ(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟۟ۨۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۤۦ(Ljava/lang/Object;)Lk6/p4;
    .locals 2

    invoke-static {}, Lx4/ۣۡۢ۠;->ۡ۟۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/l4;

    iget-object v1, p0, Lk6/l4;->o:Lk6/p4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۧۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    check-cast p1, Landroid/os/Parcelable;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzbw;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۡۢ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۢۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/w5;

    iget-object v1, p0, Lk6/w5;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨۥۥ(Ljava/lang/Object;)Landroid/app/AlarmManager;
    .locals 2

    invoke-static {}, Lf4/ۡۤۡ;->ۡ۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/j7;

    iget-object v1, p0, Lk6/j7;->d:Landroid/app/AlarmManager;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lc1/ۣۡۢۦ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۤ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/pm/ServiceInfo;
    .locals 1

    invoke-static {}, Ln8/ۢۡۨۨ;->ۢ۟ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/pm/PackageManager;

    check-cast p1, Landroid/content/ComponentName;

    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۧ۠(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۧ۠۠ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/l2;

    iget-object v1, p0, Lk0/l2;->d:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۦ۠ۦ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟۠ۦۤ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzc()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۥۡ()Z
    .locals 2

    invoke-static {}, Landroidx/compose/ui/draw/ۧۤۡۧ;->ۣۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqj;->zza()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۤ۠()Lk0/j0;
    .locals 1

    invoke-static {}, Le2/۟۟ۥۦ;->ۥۦۡۥ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/j0;->o:Lk0/j0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۤۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۦۤۦۥ(Ljava/lang/Object;)Lh0/v0;
    .locals 2

    invoke-static {}, Lm4/۟ۧۤ۠;->ۨ۟ۦ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/h0;

    iget-object v1, p0, Lf0/h0;->c:Lh0/v0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۢۨ([SIII)Ljava/lang/String;
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

.method public static ۣ۟ۧۧ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/c;

    iget-object v1, p0, Lf0/c;->e:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۥ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lfa/ۦۣۡۢ;->ۧۦۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/r;

    invoke-virtual {p0}, Lk6/r;->q()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۣۤ()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lm9/e0;->C()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢ۠ۦۧ()I
    .locals 2

    const v0, 0x2a7

    sget v1, Lt9/ۧۦۥ۟;->ۣ۟ۦۣ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۥۣۧ()I
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۤۦۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Ll0/d;->g:I

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۣ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)D
    .locals 2

    invoke-static {}, Lg/۟۠ۡۨۨ;->ۣۣ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/f;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lk6/x3;

    invoke-virtual {p0, p1, p2}, Lk6/f;->m(Ljava/lang/String;Lk6/x3;)D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦ۠ۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۨۢۢۦ(Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۥۡۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Lk6/d4;->p(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
