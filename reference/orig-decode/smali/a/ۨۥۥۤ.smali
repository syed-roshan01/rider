.class public La/ۨۥۥۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۠ۥ۟ۧ:I = -0xc


# direct methods
.method public static ۟۠ۨۤۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzab()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    invoke-static {}, Lf0/ۣۤ۠۟;->۟ۦۥۣۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/firebase/firestore/DocumentReference;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/DocumentReference;->set(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۟ۥ۟([SIII)Ljava/lang/String;
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

.method public static ۟ۥ۠ۧۤ()I
    .locals 2

    const v0, 0x65

    sget v1, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۥۤ۠۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۥۡ۟(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lb7/۟۟ۤۤۤ;->۟ۦۣۣۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/protobuf/v;

    check-cast p2, Lcom/google/protobuf/t1;

    check-cast p3, Lcom/google/protobuf/i2;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/v;->C0(ILcom/google/protobuf/t1;Lcom/google/protobuf/i2;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۢۥۥ(Ljava/lang/Object;JLjava/lang/Object;)Ly0/o;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۤۥۦۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p3, Le1/l0;

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/a;->e(Ly0/o;JLe1/l0;)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۨۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc4/ۡ۟۠ۥ;->ۣۣۡۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, " AND retry_count =  2147483647 LIMIT 1"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦۣ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۡۨ(Ljava/lang/Object;)Ljava/nio/channels/FileChannel;
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۣۣۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/io/RandomAccessFile;

    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۤ۠ۤ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->ۣۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/k2;

    iget-object v1, p0, Ld5/k2;->c:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦۣ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lg/۟۠ۡۨۨ;->ۣۣ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p1, Lc9/c;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦ۟ۦۣ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lk2/۟ۢۦۤۤ;->۟ۦۣۤ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzg()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۥۨ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦۧ۠ۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟ۢۤۡ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly3/d;

    invoke-interface {p0}, Ly3/d;->i()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧ۠ۡ(Ljava/lang/Object;)Le1/l0;
    .locals 2

    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/e;

    iget-object v1, p0, Lk0/e;->f:Le1/l0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lv5/ۥۧ۟ۦ;->ۡ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/d;

    iget-wide v2, p0, Lk0/d;->f:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method
