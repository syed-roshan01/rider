.class public Lr2/ۧۧۢۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۥۦۦ:I = 0x2d8


# direct methods
.method public static ۟۟ۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lu4/ۧۦۦۧ;->۟ۤۦۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۨۤ()I
    .locals 2

    const v0, 0x3eb

    sget v1, Ly9/ۨ۠;->ۡۤۨۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۡۦۣۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/p0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ld5/p0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ۠ۢ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۧۧۢ;->۟ۢۥۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->j:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢ۟ۢ(Ljava/lang/Object;)Lh2/d;
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۧۦۨ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/x;

    iget-object v1, p0, La2/x;->k:Lh2/d;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡۧ۠(Ljava/lang/Object;)Lk6/n;
    .locals 1

    invoke-static {}, Lp8/ۡۤ;->ۦ۠ۢۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/j7;

    invoke-virtual {p0}, Lk6/j7;->u()Lk6/n;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۡۧۤ()La2/c0;
    .locals 1

    invoke-static {}, Lv6/۟ۦۣۧۦ;->۟۟۠۟ۤ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ll0/u;->g:La2/c0;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۣۤۤۧ()J
    .locals 4

    invoke-static {}, La0/ۣ۟ۤۨۧ;->ۣۧۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, La4/q;->h()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۥۡۥۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lx7/۟۟ۦۨۡ;->ۨۨۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/u;

    iget-object v1, p0, La5/u;->a:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۡۦۤ(Ljava/lang/Object;)Lm0/n1;
    .locals 2

    invoke-static {}, Ly9/ۧۨ۠ۢ;->۟ۦۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lt/o;

    iget-object v1, p0, Lt/o;->b:Lm0/n1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۣۨۥ(Ljava/lang/Object;)Landroid/content/res/Configuration;
    .locals 1

    invoke-static {}, Lx5/ۡۦۦۥ;->ۣ۟۠ۡۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/res/Resources;

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥ۟ۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۥۥ۠ۥ([SIII)Ljava/lang/String;
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

.method public static ۥۦۤۦ(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->ۣۣ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/t;

    iget-object v1, p0, Lk6/t;->i:Ljava/lang/Long;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۡۧۡ(Ljava/lang/Object;Ljava/lang/Object;)Lq8/f;
    .locals 1

    invoke-static {}, Landroidx/core/content/ۣۣۣ۟;->ۣۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p1, Ljava/io/Serializable;

    invoke-static {p0, p1}, Lz6/a;->n0(Ljava/lang/Object;Ljava/io/Serializable;)Lq8/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lr/۠ۡ۠;->۟ۡۨۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/h5;

    check-cast p1, Landroid/os/Bundle;

    check-cast p2, Lk6/x7;

    invoke-virtual {p0, p1, p2}, Lk6/h5;->c(Landroid/os/Bundle;Lk6/x7;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۤۤۧ()Ljava/util/logging/Logger;
    .locals 1

    invoke-static {}, Lm5/ۣۢ۟ۧ;->۟ۧۥ۠۟()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/google/protobuf/v;->d:Ljava/util/logging/Logger;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦۥۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lb1/۟ۥۥ۟ۢ;->ۦۤۧۤ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "1"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧ۠ۢۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lf/۟ۤۧ۠ۡ;->ۣۥۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/c;

    iget-object v1, p0, Lf0/c;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۥۥ۠(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, La7/۠ۢۧ;->ۣۤ۟ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->G:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۦۢۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Ll8/ۢۦۥۢ;->۟ۢۡۢۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
