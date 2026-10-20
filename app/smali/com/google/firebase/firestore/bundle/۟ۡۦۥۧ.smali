.class public Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۨۦۡ:I = -0xf2


# direct methods
.method public static ۟۟۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;JJFFLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lz0/ۣ۟۠ۤ۟;->ۣ۟ۡۤۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Le1/l0;

    check-cast p8, Lu/w;

    check-cast p9, Lu0/b;

    check-cast p10, Lm0/m;

    invoke-static/range {p0 .. p12}, Lk0/p3;->a(Ly0/o;Le1/l0;JJFFLu/w;Lu0/b;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟۟ۦۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟۠ۢۤ۟(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/e6;

    iget-object v1, p0, Lk6/e6;->d:Landroid/os/Bundle;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۥۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->۟۠ۡ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-object v1, p0, Lk6/f5;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۤ۠ۤ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۣۣۧۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/p1;

    iget-object v1, p0, Lk0/p1;->r:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۦۨ(Ljava/lang/Object;)Lc9/a;
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۡۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/y1;

    iget-object v1, p0, Ld5/y1;->e:Lc9/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۢ۟(Ljava/lang/Object;I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lg/۟۠ۡۨۨ;->ۣۣ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzh(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۡۧ()Z
    .locals 2

    invoke-static {}, Lm7/ۥۨۥ۟;->۟ۡ۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzps;->zzd()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨ۠ۨ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lk/ۣۡۤۧ;->ۦ۟ۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ly1/v;

    invoke-static {p0, p1}, Ly1/t;->d(Ly1/v;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠۟ۦۤ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->۟ۤۤۤ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/m2;

    iget-object v1, p0, Lk0/m2;->b:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۦ۟(Ljava/lang/Object;)Lm9/d0;
    .locals 2

    invoke-static {}, Lx0/ۣ۠۟۠;->ۣ۟ۡۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/w0;

    iget-object v1, p0, Ld5/w0;->c:Lm9/d0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۦ۠ۧ([SIII)Ljava/lang/String;
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

.method public static ۡۤۥۣ(Ljava/lang/Object;)Lg2/s;
    .locals 2

    invoke-static {}, Lc4/۟ۦۧۦۤ;->ۡ۟۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/t;

    iget-object v1, p0, Lf0/t;->x:Lg2/s;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۧۦ()I
    .locals 2

    const v0, -0x317

    sget v1, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۢۥۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۧۢۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/q6;

    iget-boolean v1, p0, Lk6/q6;->d:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۦۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۟ۦۥۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/u7;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lk6/u7;->i0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۣ۟ۥۧۧ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr2/۠ۨۦۢ;->۟ۦ۟ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/p;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/p;->P0(Lcom/google/crypto/tink/shaded/protobuf/l;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۧۤۥ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lm5/۟ۥۣۧۥ;->ۡۡۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/f4;

    iget-boolean v1, p0, Lk6/f4;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Landroid/os/Bundle;

    check-cast p2, Lk6/x7;

    invoke-virtual {p0, p1, p2}, Lk6/h5;->c(Landroid/os/Bundle;Lk6/x7;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۧۧ۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۢۨۨۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf2/l;

    iget v1, p0, Lf2/l;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
