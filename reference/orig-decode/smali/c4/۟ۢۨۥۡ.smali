.class public Lc4/۟ۢۨۥۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۥۧۨۧ:I = -0x3a3


# direct methods
.method public static ۟۠۠ۡۤ(Ljava/lang/Object;)Lk6/s5;
    .locals 2

    invoke-static {}, Lja/ۥۣۨ۠;->۟ۡۨ۠ۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/h6;

    iget-object v1, p0, Lk6/h6;->e:Lk6/s5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۠ۡۦ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->ۣ۟ۡ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/d5;

    iget-boolean v1, p0, Lk6/d5;->b:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->m:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۤ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۠۟ۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "ad_services_version"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۢۦ()Lk6/x3;
    .locals 1

    invoke-static {}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥۦۥ۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk6/x;->w:Lk6/x3;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢ۠(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۨ۟۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۦۣۧۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzh()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۦۥ([SIII)Ljava/lang/String;
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

.method public static ۟ۤۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;
    .locals 1

    invoke-static {}, Landroid/support/v4/app/۟۟۠ۡۥ;->۟ۡۨۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p2, Lc9/e;

    invoke-static {p0, p1, p2}, Lo1/c0;->a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۟ۤ(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->ۧ۠۠ۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p1, Lc9/c;

    check-cast p2, Ly0/o;

    check-cast p3, Lc9/e;

    check-cast p5, Lk0/q3;

    check-cast p6, Lx/m;

    check-cast p7, Lm0/m;

    invoke-static/range {p0 .. p9}, Lk0/u3;->a(ZLc9/c;Ly0/o;Lc9/e;ZLk0/q3;Lx/m;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/concurrent/ThreadPoolExecutor;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۢۦ۠(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۢۡۤۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/c1;

    iget-boolean v1, p0, Lk0/c1;->c:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۧۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ld9/ۣ۟۠ۢۡ;->۟۟ۧ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-boolean v1, p0, Lk6/p7;->t:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۨۡۨ()Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۥۤۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpg;->zzf()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۥۧۧ()Lk0/l0;
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۤۦۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/l0;->p:Lk0/l0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۤۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/os/IInterface;
    .locals 1

    invoke-static {}, Ld7/۟ۢۧۧ۠;->ۡۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/IBinder;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣ۟ۤ()I
    .locals 2

    const v0, 0xfb

    sget v1, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->ۧۦۦۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦ۠ۨۨ(J)I
    .locals 1

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/p;->M0(J)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۢۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۨ۟ۦۦ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroid/support/v4/app/۟۟۠ۡۥ;->۟ۡۨۡۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/d1;

    iget v1, p0, Lk0/d1;->a:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
