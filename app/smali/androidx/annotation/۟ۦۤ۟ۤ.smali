.class public Landroidx/annotation/۟ۦۤ۟ۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۢۥۡۧ:I = -0x4c


# direct methods
.method public static ۟۟۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lw0/c;
    .locals 1

    invoke-static {}, Lr2/ۧۧۢۢ;->ۣ۟۟ۨۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lw0/c;

    check-cast p1, Lc9/c;

    check-cast p2, Lc9/c;

    invoke-virtual {p0, p1, p2}, Lw0/c;->A(Lc9/c;Lc9/c;)Lw0/c;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۦ۠(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;
    .locals 1

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۣۧ۟ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;->zzd()Lcom/google/android/gms/internal/measurement/zzfi$zzg$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۢ۠(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Lu0/ۣ۟ۤ۟ۡ;->۟ۡۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ld5/i;

    iget-object v1, p0, Ld5/i;->c:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۧۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "daily_events_count"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦ۟۟(Ljava/lang/Object;)La5/z;
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, La5/v;

    iget-object v1, p0, La5/v;->b:La5/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ۠ۥ()I
    .locals 2

    const v0, 0xf0

    sget v1, Lg9/۠ۨۧۤ;->ۡۢ۟۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۤۥۥۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 1

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/firebase/firestore/DocumentSnapshot;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/DocumentSnapshot;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۦۧۤ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->K0:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟ۢۤۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۦ۠ۡ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Le1/۟ۢ۟ۤۡ;->ۡۧۥۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/w1;

    iget-object v1, p0, Lk0/w1;->e:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۢۨ(F)I
    .locals 1

    invoke-static {}, Ls0/ۧۧۨۥ;->ۦۦۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p0}, Ld9/i;->n(F)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۡ۟۠(Ljava/lang/Object;)Lc9/f;
    .locals 2

    invoke-static {}, Lc1/ۣۢۧۨ;->ۡۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk0/z0;

    iget-object v1, p0, Lk0/z0;->b:Lc9/f;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢۢ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤۤ۟ۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "triggered_timestamp"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۢۨ(Ljava/lang/Object;I)Landroid/content/Intent;
    .locals 1

    invoke-static {}, Lz2/ۢۨۨۦ;->ۦۥۨۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ly/۟ۤۥۨ;->ۡ۟ۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۥ۟ۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lia/۟۠ۡۦ۟;->ۦ۟۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/w4;

    iget v1, p0, Lk0/w4;->t:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦ۟ۥ(Ljava/lang/Object;)Lm0/l3;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۧۥۢ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ld5/u;

    iget-object v1, p0, Ld5/u;->e:Lm0/l3;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۦۧۧ(Ljava/lang/Object;)Ljava/util/EnumMap;
    .locals 2

    invoke-static {}, Lv0/۟ۦۣ۟ۤ;->۟ۡۡۧۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/o;

    iget-object v1, p0, Lk6/o;->e:Ljava/util/EnumMap;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦ۠ۢ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۦ۠ۧۦ(J)J
    .locals 2

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۦ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦۦ۟([SIII)Ljava/lang/String;
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

.method public static ۦۧ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟ۢۤۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/Reader;

    invoke-static {p0}, Lz6/a;->a0(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۡۢۢ(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟ۤۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzaq()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۤۧ(Ljava/lang/Object;)Lc9/e;
    .locals 2

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۣۣۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/r4;

    iget-object v1, p0, Lk0/r4;->p:Lc9/e;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦ۟ۥ(Ljava/lang/Object;)Lp9/q0;
    .locals 2

    invoke-static {}, Lz8/ۣۤۡۧ;->۟ۧۤۤۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->J:Lp9/q0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۥۨ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۨۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟۠۠ۦۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lu9/d;

    invoke-virtual {p0, p1}, Lu9/d;->d(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
