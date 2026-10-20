.class public Lh3/ۣ۟ۢۡۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۦۣ۠ۧ:I = -0x15c


# direct methods
.method public static ۟۠۟ۦۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/d0;

    invoke-virtual {p0, p1}, Lf5/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۡ۠(Ljava/lang/Object;)Landroid/content/SharedPreferences;
    .locals 1

    invoke-static {}, Lh8/۟ۤۨۨۦ;->ۧۡۤۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lo1/s;->D(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۤۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۤ۟ۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۢۡ۠ۧ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "fare_filter"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۣۨ(Ljava/lang/Object;)Lk6/q3;
    .locals 2

    invoke-static {}, Lg/۟ۧ۠ۤ;->ۢۢۥۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/o0;

    iget-object v1, p0, Lk6/o0;->c:Lk6/q3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡ۠۟۠(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ld3/ۡۨۢۦ;->۟ۢۧۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/s;

    iget v1, p0, Lf0/s;->p:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۢ۠(Ljava/lang/Object;)Lu1/i;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۦۣۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/u2;

    iget-object v1, p0, Lk0/u2;->c:Lu1/i;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣۡ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->ۣ۟ۡ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzk()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۠ۢ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۤۢۧ([SIII)Ljava/lang/String;
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

.method public static ۤۧۥۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/o1;

    iget-boolean v1, p0, Lk0/o1;->s:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥ۠ۤ۟(Ljava/lang/Object;FFI)Ly0/o;
    .locals 1

    invoke-static {}, Lv5/ۥۧ۟ۦ;->ۡ۠ۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lr1/o;

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/a;->p(Lr1/o;FFI)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۤ۠ۥ(Ljava/lang/Object;)Lr1/i1;
    .locals 2

    invoke-static {}, Lp3/۟ۢ۟۟ۥ;->ۣ۠ۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/h2;

    iget-object v1, p0, Lk0/h2;->a:Lr1/i1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۧ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    invoke-static {}, Lp3/۟ۢ۟۟ۥ;->ۣ۠ۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/k;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Long;

    check-cast p5, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-virtual/range {p0 .. p5}, Lk6/k;->H(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzfi$zze;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۡۥۣ(Ljava/lang/Object;)Lc9/a;
    .locals 2

    invoke-static {}, Ly6/۟ۤۥۥۥ;->۠۠ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/h1;

    iget-object v1, p0, Ld5/h1;->c:Lc9/a;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۦۤ(Ljava/lang/Object;)Lc0/f;
    .locals 2

    invoke-static {}, Lg7/۠ۤۧ;->ۨ۟ۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/u;

    iget-object v1, p0, Lf0/u;->t:Lc0/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۥ۟()I
    .locals 2

    const v0, 0x3c2

    sget v1, Lm7/ۧۢ۟;->ۣۣ۟ۨۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۦ۠۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/i7;

    iget-wide v2, p0, Lk6/i7;->b:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۨۨ۟ۥ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)Ly0/o;
    .locals 1

    invoke-static {}, Lj3/۟ۧۧۦۤ;->ۡ۟ۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p2, Lx/m;

    check-cast p3, Lu/i1;

    check-cast p5, Ly1/g;

    check-cast p6, Lc9/a;

    invoke-static/range {p0 .. p6}, Ld7/t;->r0(Ly0/o;ZLx/m;Lu/i1;ZLy1/g;Lc9/a;)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
