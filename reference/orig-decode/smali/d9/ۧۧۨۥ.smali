.class public Ld9/ۧۧۨۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۥۧۤ۠:I = -0x96


# direct methods
.method public static ۣ۟۠ۨۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۦۨۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡۢۡ۟(Ljava/lang/String;)Ljava/lang/String;
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

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-gtz v3, :cond_2

    :goto_3
    array-length v2, v0

    if-lt v1, v2, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

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
    const/4 v5, -0x1

    aget-byte v6, v0, v5

    rem-int v7, v5, v4

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v0, v5

    goto :goto_2

    :cond_3
    const-string v1, ""

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method

.method public static ۣ۟ۡۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lc4/۟ۦۧۦۤ;->ۡ۟۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧۨۦ(Ljava/lang/Object;)Lw0/u;
    .locals 2

    invoke-static {}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->۠۠ۤۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/b0;

    iget-object v1, p0, Lk0/b0;->c:Lw0/u;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lh5/ۧ۟ۨۧ;->ۥۥ۟ۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/j5;

    iget-object v1, p0, Lk6/j5;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۡۢ(Ljava/lang/Object;)Lb0/h0;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۣۧ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/w0;

    iget-object v1, p0, Ld5/w0;->a:Lb0/h0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۤۡ()Lt/w;
    .locals 1

    invoke-static {}, Lp8/ۡۤ;->ۦ۠ۢۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lt/d0;->a:Lt/w;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۢ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۨۤۢ(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, Ll0/ۡۦۦۡ;->ۣ۟ۤ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/pm/ApplicationInfo;

    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۧۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lh3/۟ۡۥ۠۠;->۟۠ۨ۠۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/j;

    invoke-virtual {p0}, La5/j;->f()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۦۢۡ()I
    .locals 2

    const v0, -0x1d1

    sget v1, Lx4/۟ۤۦۥ۟;->ۧۤۦ۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۢۡۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۢ۠۠۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast p1, Ljava/util/Map;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Ld5/o1;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/util/Map;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۤۨۦ([SIII)Ljava/lang/String;
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

.method public static ۥۣ۠ۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lw2/ۧۦۧ;->ۣۡ۟ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/m7;

    invoke-virtual {p0}, Lk6/m7;->r()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۤ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/security/cert/Certificate;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۨ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/security/cert/CertificateFactory;

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣۨۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/s1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lf0/s1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۧۡۢ(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Lfa/ۦۣۡۢ;->ۧۦۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->g:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۧۦۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/y3;

    check-cast p1, Lk6/x7;

    invoke-interface {p0, p1}, Lk6/y3;->s(Lk6/x7;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۥ۠ۡ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 2

    invoke-static {}, Lg4/۠ۤۢۥ;->ۨۡۥۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/b0;

    iget-object v1, p0, Ld5/b0;->p:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۧۨۤ(IIILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p3, [Ljava/lang/Object;

    check-cast p4, [Ljava/lang/Object;

    invoke-static {p0, p1, p2, p3, p4}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
