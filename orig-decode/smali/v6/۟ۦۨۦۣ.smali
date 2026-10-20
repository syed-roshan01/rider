.class public Lv6/۟ۦۨۦۣ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۥۧۥۧ:I = -0xba


# direct methods
.method public static ۣ۟۠ۤۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡ۠ۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Li1/j0;
    .locals 1

    invoke-static {}, Ln1/۟۠۟ۤۤ;->۟۠ۥۥۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Li1/f;

    check-cast p1, Lm0/m;

    invoke-static {p0, p1}, Li1/b;->E(Li1/f;Lm0/m;)Li1/j0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟۠ۢۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۤۧ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۦۧ۟(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lj9/۠۠ۨ;->ۥۣۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-wide v2, p0, Lk0/i0;->c:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤ۠ۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣ۟ۢۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/i0;

    iget-object v1, p0, Lf0/i0;->a:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۡۤ([SIII)Ljava/lang/String;
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

.method public static ۟ۥۢۡۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/۟ۥۧۡۨ;->۟ۦۣ۟ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/UserProfile;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/UserProfile;->getPlanType()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۟ۤۧ()Ld5/l;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/layout/ۢۡۤۤ;->ۣ۟۟ۨ۟()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ld5/l;->e:Ld5/l;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢ۠۠(Ljava/lang/Object;)Lcom/google/firebase/messaging/RemoteMessage$Notification;
    .locals 1

    invoke-static {}, Ly9/ۨ۠;->ۥۣۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۤۢۦۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lk6/a5;->p(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۡ۠۠(Ljava/lang/Object;Ljava/lang/Object;)Ly0/o;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۦۨۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p1, Lc9/f;

    invoke-static {p0, p1}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۨۡ(Ljava/lang/Object;FF)V
    .locals 1

    invoke-static {}, Lw9/۟۠۠ۢ۟;->ۣ۟ۤۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk/f;

    invoke-virtual {p0, p1, p2}, Lk/f;->D(FF)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۧ۠ۦ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۥۡۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/c0;

    iget-object v1, p0, Ld5/c0;->e:Ljava/util/Map;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۧۡۧ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ll9/۟ۦۥۣۢ;->ۤۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۥۢۥ(Ljava/lang/Object;)Lr1/s;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/c2;

    iget-object v1, p0, Lf0/c2;->h:Lr1/s;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۨۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۦۤۢ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lf5/f0;

    iget-object v1, p0, Lf5/f0;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۠ۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lh8/۟ۨۧ;->ۣ۟ۢۨۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/d0;

    iget v1, p0, Lk0/d0;->d:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۧۤ(Ljava/lang/Object;)Lr1/x0;
    .locals 2

    invoke-static {}, Lb7/۟۟ۤۤۤ;->۟ۦۣۣۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/t1;

    iget-object v1, p0, Lk0/t1;->p:Lr1/x0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۧۥۣ()I
    .locals 2

    const v0, 0x14b

    sget v1, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۥ۠:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۧۧۨۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw4/ۥۧۡۥ;->ۧۢۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Location Filter"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۡۧ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Ld1/ۣۧۡۡ;->ۢۨ۠۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/l;

    iget-wide v2, p0, Lk0/l;->r:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method
