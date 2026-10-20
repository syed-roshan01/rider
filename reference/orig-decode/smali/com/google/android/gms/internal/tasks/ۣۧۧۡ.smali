.class public Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;
.super Ljava/lang/Object;


# static fields
.field public static ۟۠۟ۨۡ:I = -0x18e


# direct methods
.method public static ۣ۟۟ۧ۠([SIII)Ljava/lang/String;
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

.method public static ۣ۟۠۟۟(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۡۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ld5/w;

    iget-object v1, p0, Ld5/w;->c:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۢۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣ۟ۡ۠ۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/p1;

    iget-boolean v1, p0, Lk0/p1;->u:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->ۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ۟۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۣۧ۟ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzaj()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨ۠(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->ۢ۠ۨۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۥۥۨ(Ljava/lang/Object;)La5/z;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۣۧ۠ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/q;

    iget-object v1, p0, La5/q;->a:La5/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤۥۢ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/l;

    iget-wide v2, p0, Lk6/l;->e:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۧۦ()Le0/e;
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۢۨۨۦ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Lk0/p2;->e:Le0/e;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۨۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۡۨۦۥ(Ljava/lang/Object;)Lk6/p6;
    .locals 2

    invoke-static {}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۢۨۨۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/f5;

    iget-object v1, p0, Lk6/f5;->o:Lk6/p6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۧ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/x;

    iget-wide v2, p0, La2/x;->l:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۢۡ۠ۧ()I
    .locals 2

    const v0, 0x20e

    sget v1, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۤۧ۟ۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣۢۢ۠()Le0/e;
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/p2;->b:Le0/e;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۥۧۦ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk/f;

    invoke-virtual {p0, p1}, Lk/f;->z(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۨۡ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟ۡۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->u()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۨۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۦۡ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/y3;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p4, Lk6/x7;

    invoke-interface {p0, p1, p2, p3, p4}, Lk6/y3;->e(Ljava/lang/String;Ljava/lang/String;ZLk6/x7;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۡ(Ljava/lang/Object;)Lk0/x2;
    .locals 2

    invoke-static {}, Lx0/ۣ۠۟۠;->ۣ۟ۡۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/t2;

    iget-object v1, p0, Lk0/t2;->b:Lk0/x2;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۤ۠()Lu3/a;
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۢۥ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Lu3/a;->a:Lu3/a;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۨۨ۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lg2/h0;

    check-cast p1, Lg2/a0;

    check-cast p2, Lg2/a0;

    invoke-virtual {p0, p1, p2}, Lg2/h0;->a(Lg2/a0;Lg2/a0;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۥۣۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/u0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ld5/u0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۢۥۧ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;
    .locals 1

    invoke-static {}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۧۨۡ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/content/res/Resources;

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۧۢۡ(Ljava/lang/Object;III)V
    .locals 1

    invoke-static {}, Lw2/۟ۧۥۦۨ;->۟ۥۡۡۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lm0/q2;

    invoke-virtual {p0, p1, p2, p3}, Lm0/q2;->C(III)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
