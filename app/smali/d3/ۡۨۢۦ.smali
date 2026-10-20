.class public Ld3/ۡۨۢۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۣ۟ۡۧۤ:I = -0x398


# direct methods
.method public static ۟۟ۢۢۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟۠ۡۨ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0, p1, p2}, Lk6/a5;->B(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۢۤۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ldagger/hilt/android/migration/۟ۢۡۧۦ;->ۢۡۦۧ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/h0;

    iget v1, p0, Lf0/h0;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۦۨ()I
    .locals 2

    const v0, 0xba

    sget v1, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۥۢۥۣ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۢۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri$Builder;
    .locals 1

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/net/Uri$Builder;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠۟۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->۟ۢۦۦ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Failed to insert event filter (got -1). appId"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۥۦ(Ljava/lang/Object;)Ljava/nio/charset/Charset;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۣ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۦۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, La2/۟ۡۥۦ۟;->۟ۤۨ۟۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Subscription Time Remaining"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۡۨ()Lm0/m3;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->۟ۥۣۤۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lj4/o;->a:Lm0/m3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۡۡ([SIII)Ljava/lang/String;
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

.method public static ۣ۠ۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۧ۠۠ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "AcceptPro"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۢۧ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Lr/۠ۡ۠;->۟ۡۨۥۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/o1;

    iget-object v1, p0, Lk0/o1;->z:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Lv0/p;
    .locals 1

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->ۧۡۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lc9/e;

    check-cast p1, Lc9/c;

    invoke-static {p0, p1}, Lm9/e0;->F(Lc9/e;Lc9/c;)Lv0/p;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۧ۠۠(Ljava/lang/Object;)La2/c0;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟۟ۨۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/e5;

    iget-object v1, p0, Lk0/e5;->g:La2/c0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۨ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lv0/ۣ۟۟ۤۧ;->ۡۡۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/b4;

    invoke-virtual {p0}, Lk6/b4;->y()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۨۨۧ(Ljava/lang/Object;)Lu6/b;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۣ۟ۧۦۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lw3/d;

    invoke-virtual {p0}, Lw3/d;->b()Lu6/b;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۣ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۦ۠ۡ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->ۢ۠ۢۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/y;

    iget-wide v2, p0, Lk0/y;->d:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۦ۠ۢۥ(JF)J
    .locals 2

    invoke-static {}, Ll0/ۤ۠ۧ;->۟ۦ۟ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1, p2}, Le1/r;->b(JF)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method
