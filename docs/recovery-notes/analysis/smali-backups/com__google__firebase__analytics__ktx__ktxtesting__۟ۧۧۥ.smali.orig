.class public Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۨۢۡ:I = 0x1df


# direct methods
.method public static ۟۠۠ۤۨ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۤۥ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/app/NotificationChannel;

    invoke-virtual {p0, p1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۢۦۣ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۟۠ۦۤۨ(Ljava/lang/Object;)Lk6/b4;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟۠ۥۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/q3;

    invoke-virtual {p0}, Lk6/q3;->n()Lk6/b4;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۨ()I
    .locals 2

    const v0, 0x127

    sget v1, Lm5/ۣۢ۟ۧ;->۟ۥۧۡۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۦۡۥۦ(Ljava/lang/Object;)Lk6/y5;
    .locals 2

    invoke-static {}, Lea/۟ۦۢۦۤ;->ۣۨۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/b6;

    iget-object v1, p0, Lk6/b6;->c:Lk6/y5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/fragment/app/ۣۣۣۨ;->ۣۣۣ۟ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p7;

    check-cast p1, Lk6/s5;

    invoke-virtual {p0, p1}, Lk6/p7;->b(Lk6/s5;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۥۡۡۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lc9/a;

    check-cast p5, Lm0/m;

    invoke-static/range {p0 .. p6}, Ly3/e;->k(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ILjava/lang/String;Lc9/a;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۦۡ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/net/URLConnection;
    .locals 1

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzcd;

    check-cast p1, Ljava/net/URL;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzcd;->zza(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lm0/۟ۤۡۤۤ;->ۣ۟ۦۢۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/e;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3, p4}, Lr1/e1;->b(Ly0/o;Lc9/e;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۧۢۥ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟ۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lm0/c;

    iget v1, p0, Lm0/c;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۢۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lq/c;

    invoke-virtual {p0}, Lq/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lg2/h0;
    .locals 1

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟ۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lg2/b0;

    check-cast p1, Lg2/a0;

    check-cast p2, Lg2/j;

    check-cast p3, Lg2/o;

    check-cast p4, Lf0/v;

    check-cast p5, Lf0/v;

    invoke-static/range {p0 .. p5}, La/a;->d(Lg2/b0;Lg2/a0;Lg2/j;Lg2/o;Lf0/v;Lf0/v;)Lg2/h0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۦۡ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lv5/ۥۧ۟ۦ;->ۡ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/p;

    iget-wide v2, p0, Lk6/p;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۧۤۤۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۨۧۧ([SIII)Ljava/lang/String;
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

.method public static ۨۡۢۢ()Li1/f;
    .locals 1

    invoke-static {}, Lw2/ۤ۠ۨۤ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    sget-object v0, Lz6/a;->e:Li1/f;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
