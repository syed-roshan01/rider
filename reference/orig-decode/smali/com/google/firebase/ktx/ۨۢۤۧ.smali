.class public Lcom/google/firebase/ktx/ۨۢۤۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۟۠ۨۦ:I = -0x178


# direct methods
.method public static ۟۟ۤۢۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/f6;

    iget v1, p0, Lk6/f6;->e:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۥۦ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lg5/۟ۥۨۤ;->ۣ۟ۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk/f;

    invoke-virtual {p0, p1}, Lk/f;->A(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۢۨۥ([SIII)Ljava/lang/String;
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

.method public static ۟۠ۦ۠ۡ()J
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v0

    if-ltz v0, :cond_0

    sget-wide v0, Ll0/c;->H:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۦۣ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟ۡۦۡۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۢ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lo8/۟ۢۧۢۤ;->۟ۧۢۢ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ly/i1;

    check-cast p1, Lm2/b;

    check-cast p2, Lm2/l;

    invoke-interface {p0, p1, p2}, Ly/i1;->c(Lm2/b;Lm2/l;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۥۣ()Lk6/x3;
    .locals 1

    invoke-static {}, Ld9/ۧۧۨۥ;->۠ۦۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/x;->A0:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۥۧ(Ljava/lang/Object;)Ly/i1;
    .locals 2

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/f2;

    iget-object v1, p0, Lk0/f2;->b:Ly/i1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;
    .locals 2

    invoke-static {}, Ls/ۧۥ۟۟;->۟ۢۡۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-object v1, p0, Lk6/f5;->i:Lk6/d4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۧۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lh3/ۣ۠ۡۨ;->ۥۥ۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->signOut()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۦۥۥ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, La8/ۣۡۨ۠;->۟ۡۤۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzbm()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۧۨ()J
    .locals 2

    invoke-static {}, Lu0/ۣ۟ۤ۟ۡ;->۟ۡۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    sget-wide v0, Le1/r;->b:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢۦۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lz8/ۣۤۡۧ;->۟ۧۤۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/m4;

    iget-wide v2, p0, Lk0/m4;->F:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;)F
    .locals 1

    invoke-static {}, Lp4/ۣ۟۟ۢۥ;->۟۠ۢۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly/t0;

    check-cast p1, Lm2/l;

    invoke-interface {p0, p1}, Ly/t0;->b(Lm2/l;)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟۠۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۣۣۢۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;->zza()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦۤۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۢۡۤۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/y4;

    iget v1, p0, Lk0/y4;->o:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۧ۟ۨ(J)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->ۢ۠ۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۟ۡ(Ljava/lang/Object;)Ljava/io/Serializable;
    .locals 2

    invoke-static {}, Lh3/ۣ۠ۡۨ;->ۥۥ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/n6;

    iget-object v1, p0, Lk6/n6;->b:Ljava/io/Serializable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۡۧ۠(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Ls3/۟ۧ۟ۡۢ;->۟۠ۤۨۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/u7;

    invoke-virtual {p0}, Lk6/u7;->p0()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۤۦ۠ۦ(Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lt9/ۧۦۥ۟;->ۣۣ۟ۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-static {p0, p1, p2}, Ly3/e;->e1(Landroid/os/Parcel;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۢ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr2/ۧۧۢۢ;->ۣ۟۟ۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p5, Ljava/lang/String;

    invoke-virtual/range {p0 .. p5}, Lk6/h5;->h(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۢۡۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lk6/x7;

    invoke-virtual {p0, p1, p2, p3}, Lk6/h5;->m(Ljava/lang/String;Ljava/lang/String;Lk6/x7;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۤۧ()I
    .locals 2

    const v0, -0x127

    sget v1, Ll8/ۢۦۥۢ;->ۥۤۡۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦۧۧۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 1

    invoke-static {}, La2/۟ۡۥۦ۟;->۟ۤۨ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, [Ljava/lang/Object;

    check-cast p1, Lv0/p;

    check-cast p2, Lc9/a;

    check-cast p3, Lm0/m;

    invoke-static {p0, p1, p2, p3, p4}, Lx3/c;->d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۨۡۢ()[I
    .locals 1

    invoke-static {}, Lv0/ۣۣۡۢ;->۟ۨۤۢ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk6/b8;->a:[I

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
