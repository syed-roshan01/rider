.class public Lr4/۟ۦۦ۠ۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۠۠ۦ:I = 0x296


# direct methods
.method public static ۟۠ۢ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/os/Parcelable$Creator;

    check-cast p1, Landroid/os/Parcel;

    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۡۦ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->۟ۢ۟ۤۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzbr()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/math/BigDecimal;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۣۨ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/math/BigDecimal;

    check-cast p1, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۨ۠()F
    .locals 1

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll0/i;->a:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧۢۦ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۣۣ۟ۥ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/r;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Lk0/r;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦ۟ۢ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۦ۠۠ۢ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۢۥۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/i4;

    iget-object v1, p0, Lk0/i4;->c:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۦۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/۟ۥۧۡۨ;->۟ۦۣ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/p1;

    iget-object v1, p0, Lk0/p1;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۧۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->ۣ۟ۡ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/s6;

    invoke-virtual {p0}, Lk6/s6;->A()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۥ۟ۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Ll8/ۣ۟ۧۢ۠;->۟ۦۣۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzb;->zzd()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۥۥ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/t3;

    iget-boolean v1, p0, Lk0/t3;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۧۨ()Ljava/nio/charset/Charset;
    .locals 1

    invoke-static {}, Lq6/۟ۥۦۡ۟;->۟ۦۥۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۦ۠()I
    .locals 2

    const v0, 0x1b9

    sget v1, Lx2/۟ۢۥ;->۟ۧۤۨۨ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۠ۦۣۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, La8/ۡۦۨۡ;->ۣ۠۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢۥۦ([SIII)Ljava/lang/String;
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

.method public static ۣۡۨۨ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Lf/۟ۤۧ۠ۡ;->ۣۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->p0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۥۣ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤۡ۟ۢ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۤۥ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۦ۟ۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/w0;

    iget-object v1, p0, Ld5/w0;->p:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۤ۟۟(Ljava/lang/Object;)Lk6/z3;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣ۟۠ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-object v1, p0, Lk6/f5;->w:Lk6/z3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۥۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, La/ۥۦۥۡ;->ۡۡۤ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/database/sqlite/SQLiteDatabase;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/content/ContentValues;

    check-cast p3, Ljava/lang/String;

    check-cast p4, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢ۟ۢ(Ljava/lang/Object;)Lcom/google/protobuf/n;
    .locals 2

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۦ۠ۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/protobuf/h2;

    iget-object v1, p0, Lcom/google/protobuf/h2;->e:Lcom/google/protobuf/n;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۧ۟ۢ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟۟۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/TreeMap;

    invoke-virtual {p0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧ۠ۥۨ()Z
    .locals 2

    invoke-static {}, La8/ۡۦۨۡ;->ۣ۠۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqe;->zza()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۡ۟۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/ۧۥۡۨ;->۟۟ۤۡ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/y4;

    iget-boolean v1, p0, Lk0/y4;->f:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۡۢۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ls8/ۣۡۡ۠;->ۨۡ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/EnumMap;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۨ۟ۥ(Ljava/lang/Object;)Lc9/a;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟۟۠ۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/b0;

    iget-object v1, p0, Ld5/b0;->o:Lc9/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
