.class public Lh1/۟۟ۨۦۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۣ۟ۢۨ:I = -0x2ef


# direct methods
.method public static ۟ۢۥۣۨ(Ljava/lang/Object;FF)Ly0/o;
    .locals 1

    invoke-static {}, Lh3/ۣ۠ۡۨ;->ۥۥ۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/o;

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/a;->m(Ly0/o;FF)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۨ۠(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lz0/ۣ۟۠ۤ۟;->ۣ۟ۡۤۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0, p1, p2}, Lk6/a5;->z(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۨ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۦۨۧۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/a5;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lc9/e;

    check-cast p3, Lg2/l0;

    check-cast p4, Lc9/e;

    check-cast p5, Lc9/e;

    check-cast p6, Lc9/e;

    check-cast p7, Lc9/e;

    check-cast p8, Lc9/e;

    check-cast p9, Lc9/e;

    check-cast p10, Lc9/e;

    check-cast p14, Lx/l;

    check-cast p15, Ly/t0;

    check-cast p16, Lk0/m4;

    check-cast p17, Lc9/e;

    check-cast p18, Lm0/m;

    invoke-static/range {p0 .. p21}, Lk0/u4;->a(Lk0/a5;Ljava/lang/String;Lc9/e;Lg2/l0;Lc9/e;Lc9/e;Lc9/e;Lc9/e;Lc9/e;Lc9/e;Lc9/e;ZZZLx/l;Ly/t0;Lk0/m4;Lc9/e;Lm0/m;III)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۢۡۥ()I
    .locals 2

    const v0, 0xe7

    sget v1, Lr6/۟ۡ۠۟ۡ;->ۣۧۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۣ۟ۢۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۥۨۦ(Ljava/lang/Object;I)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;
    .locals 1

    invoke-static {}, Ln/۟۠ۥۥۨ;->ۢۡۧ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۨ۟(Ljava/lang/Object;)La2/i;
    .locals 2

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La2/a0;

    iget-object v1, p0, La2/a0;->b:La2/i;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۟ۥۣ([SIII)Ljava/lang/String;
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

.method public static ۟ۥۢۡ۟()F
    .locals 1

    invoke-static {}, Lv0/۟ۦۣ۟ۤ;->۟ۡۡۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    sget v0, Ll0/a;->b:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۧۢ(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lj4/ۣۧۤ;->۟ۢۥۢۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/c;

    check-cast p1, Lm0/m;

    invoke-virtual {p0, p1, p2}, Ld5/c;->a(Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨ۠()La5/c0;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟ۤۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, La5/c0;->a:La5/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۦۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lz3/۟ۢۢ۟ۢ;->۟۠ۨ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠۠۠(Ljava/lang/Object;)Lk6/d4;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟۠ۦۧ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p5;

    invoke-interface {p0}, Lk6/p5;->zzj()Lk6/d4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۤۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/e0;

    iget-object v1, p0, Ld5/e0;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۧۦۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۤۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "_cmp"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۠۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۢ۠ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    iget v1, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Saving complex main event, appId, data size"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۢۤ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lh3/ۣ۟ۢۡۤ;->ۧۦۥ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/k5;

    iget v1, p0, Lk6/k5;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۠۠(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۤۨۢ۠()J
    .locals 2

    invoke-static {}, Lf0/ۣۦۦ۠;->۟ۥۥۣۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget-wide v0, Ll0/c;->r:J

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۟ۧ()Ly1/u;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۣۦۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ly1/i;->l:Ly1/u;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۨۡۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, La5/j;

    invoke-virtual {p0}, La5/j;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡۥۨ(Ljava/lang/Object;)Le0/a;
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۢۥ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/q2;

    iget-object v1, p0, Lk0/q2;->a:Le0/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۦۨۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lz8/۟ۧۡۥۥ;->ۣۤۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/q0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ld5/q0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۦ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;D)Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Ld4/۟۠۠۟ۢ;->ۦۢ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/math/BigDecimal;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzew$zzd;

    invoke-static {p0, p1, p2, p3}, Lk6/d;->e(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzew$zzd;D)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
