.class public Lf/۟ۤۧ۠ۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۡۡۡ:I = -0x2da


# direct methods
.method public static ۟۟۟۟۟(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Le1/ۦۣۢۥ;->ۣۨۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/o3;

    iget v1, p0, Lk0/o3;->d:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۢ۟(Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۦۣۡۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg;->zza()D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۦۤ(F)Z
    .locals 1

    invoke-static {}, Lz8/ۣۤۡۧ;->۟ۧۤۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۧۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤۤ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "gmp_app_id"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 1

    invoke-static {}, Lh7/۟۟ۧۨ۟;->۟ۡۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Lc9/c;

    check-cast p2, Ly0/o;

    check-cast p5, La2/c0;

    check-cast p6, Lf0/b1;

    check-cast p7, Lf0/a1;

    check-cast p11, Lg2/l0;

    check-cast p12, Lc9/c;

    check-cast p13, Lx/m;

    check-cast p14, Le1/n;

    check-cast p15, Lc9/f;

    check-cast p16, Lm0/m;

    invoke-static/range {p0 .. p19}, Ld9/i;->c(Ljava/lang/String;Lc9/c;Ly0/o;ZZLa2/c0;Lf0/b1;Lf0/a1;ZIILg2/l0;Lc9/c;Lx/m;Le1/n;Lc9/f;Lm0/m;III)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۤۨۤ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->۠۠ۤۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/firebase/auth/UserInfo;

    invoke-interface {p0}, Lcom/google/firebase/auth/UserInfo;->isEmailVerified()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lw2/ۤ۠ۨۤ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/q;

    iget-object v1, p0, La5/q;->b:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۤ۠(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۣ۟۠۠ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/z3;

    iget-object v1, p0, Lk6/z3;->i:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥ۠ۨ()Lf2/l;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->۟ۤۦۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lf2/l;->e:Lf2/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡ۟ۤ(Ljava/lang/Object;)La5/i0;
    .locals 2

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۠ۦۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La5/h0;

    iget-object v1, p0, La5/h0;->c:La5/i0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۢۦۦ(Ljava/lang/Object;F)Ly0/o;
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۢ۠ۢۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/o;

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢ۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ly6/۟ۤۥۥۥ;->۠۠ۤ۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "resettable_device_id_hash"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۦۡ()Lt/w1;
    .locals 1

    invoke-static {}, Ll8/ۣ۟ۧۢ۠;->۟ۦۣۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lk0/x0;->c:Lt/w1;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۥۤ()I
    .locals 2

    const v0, -0x28e

    sget v1, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣ۟۠۠ۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۥ۟ۢ(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, Lq7/۟ۢۢ۟ۧ;->۟ۡۦۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/b6;

    iget-object v1, p0, Lk6/b6;->b:Landroid/os/Bundle;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۥ۠ۦ(Ljava/lang/Object;)Lk6/y5;
    .locals 2

    invoke-static {}, Li6/ۡۤۦ;->ۤۨۨ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/d6;

    iget-object v1, p0, Lk6/d6;->c:Lk6/y5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۧۥۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lq6/ۡۨۧۨ;->۟ۢۦۦۡ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0}, Lf6/a;->x(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦ۠۠ۤ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۧۢ۟()Lf2/l;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟۠ۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lf2/l;->b:Lf2/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۧۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۣ۟ۥۧۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/e5;

    iget v1, p0, Lk6/e5;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۤۨ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۨۥۨۦ([SIII)Ljava/lang/String;
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
