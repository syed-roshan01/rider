.class public Ls0/ۢۨۦ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۨۧۢۨ:I = -0x18a


# direct methods
.method public static ۟۟ۡۢۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lc1/ۣۡۢۦ;->ۣۣ۟۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf5/r;

    iget-object v1, p0, Lf5/r;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۦۣ(Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lu8/e;

    invoke-static {p0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۤۦۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۣ۟ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lk/ۣۡۤۧ;->ۦ۟ۦ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/AlarmManager;

    check-cast p1, Landroid/app/PendingIntent;

    invoke-virtual {p0, p1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p4, Lk6/x7;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk6/h5;->e(Ljava/lang/String;Ljava/lang/String;ZLk6/x7;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۟ۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۢۡ۠ۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zze()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۥۡ(Ljava/lang/Object;Ljava/lang/Object;ZJ)V
    .locals 1

    invoke-static {}, Lo2/۟ۤۨۡۥ;->ۦۦۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/p6;

    check-cast p1, Lk6/q6;

    invoke-virtual {p0, p1, p2, p3, p4}, Lk6/p6;->A(Lk6/q6;ZJ)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۢۧۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۥۣۦ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۦۡ([SIII)Ljava/lang/String;
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

.method public static ۟ۥۨ۠۠(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk9/f;

    invoke-static {p0}, Lk9/k;->G0(Lk9/f;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ln/ۣۣۢۢ;->ۨۡ۠۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/o1;

    iget-boolean v1, p0, Lk0/o1;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣ۟ۢۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Lk6/x7;

    invoke-virtual {p0, p1}, Lk6/h5;->s(Lk6/x7;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡ۠ۡۦ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Ly6/۟ۤۥۥۥ;->۠۠ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Li7/h1;

    invoke-static {p0, p1}, Li7/h1;->A(Li7/h1;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۨ(Ljava/lang/Object;F)F
    .locals 1

    invoke-static {}, Lp7/ۣۣۦۤ;->ۤۨۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lt/w;

    invoke-virtual {p0, p1}, Lt/w;->a(F)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۨ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/u;

    check-cast p1, Ly/v;

    check-cast p2, Lm0/m;

    invoke-virtual {p0, p1, p2, p3}, Ld5/u;->a(Ly/v;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۨۧ()I
    .locals 2

    const v0, -0x13e

    sget v1, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣ۟۠۠ۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۦۦ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Le2/۟ۤۢۦ;->ۣ۟ۢۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lu3/a;

    invoke-virtual {p0}, Lu3/a;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lj2/۠ۤۨۤ;->۠ۡۨۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/io/ByteArrayOutputStream;

    check-cast p1, Ly3/c;

    invoke-static {p0, p1}, Ly3/e;->P0(Ljava/io/ByteArrayOutputStream;Ly3/c;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۣ۠ۥ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lk6/f5;
    .locals 1

    invoke-static {}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۨ۠ۡۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzdd;

    check-cast p2, Ljava/lang/Long;

    invoke-static {p0, p1, p2}, Lk6/f5;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lk6/f5;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۦ۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lj3/۟ۧۧۦۤ;->ۡ۟ۥ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/e0;

    iget-boolean v1, p0, Lf0/e0;->d:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۥۨ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "time_to_live"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
