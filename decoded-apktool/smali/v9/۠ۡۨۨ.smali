.class public Lv9/۠ۡۨۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۨ۠ۡۡ:I = -0x342


# direct methods
.method public static ۣ۟ۥۣۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۢۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/l4;

    iget-object v1, p0, Lk6/l4;->g:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨ۟۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۤۢۤ(Ljava/lang/Object;)Lx/m;
    .locals 2

    invoke-static {}, Ls8/ۣۡۡ۠;->ۨۡ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/u1;

    iget-object v1, p0, Lf0/u1;->f:Lx/m;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤ۠ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ll3/ۥۣۤ۟;->ۡۥۨۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Failed to insert/update event aggregates (got -1). appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۧۨ()Lk6/x3;
    .locals 1

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۟ۦۥۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk6/x;->M:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟۠۠([SIII)Ljava/lang/String;
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

.method public static ۟ۦ۠ۨۥ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Ll2/ۦۣ۠ۥ;->ۤ۠ۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->R0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧ۠ۥۦ(Ljava/lang/Object;)Lk6/q6;
    .locals 2

    invoke-static {}, Lq6/ۣ۟ۢ۟ۤ;->۟۠ۧ۠ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->E:Lk6/q6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۢ۠۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lz1/۟ۦ۟۠۟;->۟۠ۦۧ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La5/c;

    iget-object v1, p0, La5/c;->d:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۨ۠()Ljava/nio/charset/Charset;
    .locals 1

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ll9/a;->a:Ljava/nio/charset/Charset;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۧ۠۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->۟ۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/a;

    iget-wide v2, p0, Lf0/a;->a:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۡۥۧۤ(Ljava/lang/Object;)Lq8/f;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-virtual/range {p0 .. p0}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->m()Lq8/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۣۢ(Ljava/lang/Object;)Lb0/a0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۦ۟۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lb0/h0;

    iget-object v1, p0, Lb0/h0;->e:Lb0/a0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۡۡ()J
    .locals 4

    invoke-static {}, Lfa/ۦۣۡۢ;->ۧۦۣ۟()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {}, Le5/a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lca/ۨۤۢۥ;->ۢۥۣۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/r0;

    iget v1, p0, Lf0/r0;->d:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lm3/۟ۦۦۡۢ;->۟ۢ۟ۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Ola accept timers remove"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroid/support/v4/app/۟۟۠ۡۥ;->۟ۡۨۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/r5;

    iget-object v1, p0, Lk6/r5;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۢۦ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lz3/۟ۢۢ۟ۢ;->۟۠ۨ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "app_version"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۢۨ()I
    .locals 2

    const v0, -0xd4

    sget v1, La0/ۣ۟ۤۨۧ;->۟ۦ۟ۥۣ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۥۡ۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ly6/۟ۢ۟ۥۤ;->ۢۥۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/w2;

    iget-boolean v1, p0, Lk0/w2;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦۤ۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf0/j1;

    iget-boolean v1, p0, Lf0/j1;->e:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۟ۤ(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lorg/json/JSONArray;

    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۤۤۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 1

    invoke-static {}, Lm5/۟ۥۣۧۥ;->ۡۡۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld6/a;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Landroid/content/Intent;

    check-cast p3, Landroid/content/ServiceConnection;

    invoke-virtual {p0, p1, p2, p3, p4}, Ld6/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
