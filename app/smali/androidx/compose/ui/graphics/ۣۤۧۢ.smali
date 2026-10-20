.class public Landroidx/compose/ui/graphics/ۣۤۧۢ;
.super Ljava/lang/Object;


# static fields
.field public static ۧۥۡ۠:I = -0x9a


# direct methods
.method public static ۣۣ۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lr4/۟ۦۦ۠ۥ;->ۣ۠ۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/SharedPreferences;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۣۤ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟۠ۦۤ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠۠ۡۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟۠ۦۧ۟()I
    .locals 2

    const v0, 0x92

    sget v1, Lga/۟ۢۧ۟ۦ;->ۤۥۢۧ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟ۡۤۤ()J
    .locals 4

    invoke-static {}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->۠ۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzne;->zzy()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۦ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۨ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/AppConfig;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/AppConfig;->getPlanPrice1Week()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lv7/ۤۦۧ۟;->ۣ۟ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lo8/c;

    iget-object v1, p0, Lo8/c;->c:Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۢ(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۟ۦۥۨۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0}, Lk6/a5;->J()Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۨۤۥ(Ljava/lang/Object;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;
    .locals 2

    invoke-static {}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟ۤۢۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, La5/i0;

    iget-object v1, p0, La5/i0;->a:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۡ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lq6/۟ۥۦۡ۟;->۟ۦۥۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/u4;

    iget-object v1, p0, Lk6/u4;->c:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۤۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, La3/۟ۢۨۢۥ;->ۣ۟۟ۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/os/Parcel;

    invoke-virtual {p0}, Landroid/os/Parcel;->dataSize()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/u7;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Landroid/os/Bundle;

    check-cast p4, Ljava/util/List;

    invoke-virtual/range {p0 .. p5}, Lk6/u7;->L(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۨۧۤ([SIII)Ljava/lang/String;
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

.method public static ۠ۧۢ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۣۢۡۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/net/Uri;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡ۟ۦ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۡۨ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)Lf2/w;
    .locals 1

    invoke-static {}, Lf4/ۦۣ۟ۦ;->۟ۡۤۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf2/f;

    check-cast p1, Lf2/e;

    check-cast p2, Lf2/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Lf2/f;->b(Lf2/e;Lf2/l;II)Lf2/w;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۧ۠۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣ۟ۧۦ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lh0/v0;

    invoke-virtual {p0}, Lh0/v0;->m()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۨۢۨ(Ljava/lang/Object;)Lk6/o6;
    .locals 2

    invoke-static {}, Ld9/ۧۧۨۥ;->۠ۦۢۡ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->h:Lk6/o6;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۢۡ()Ld5/m;
    .locals 1

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ld5/m;->p:Ld5/m;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥۧۥ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lk3/ۦ۠ۢۥ;->۟ۤۡۢ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۡ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    .locals 1

    invoke-static {}, Lw9/۟۠۠ۢ۟;->ۣ۟ۤۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۨۤۥ()Lu0/b;
    .locals 1

    invoke-static {}, Lr1/۟ۤۤۡ۠;->ۨۡ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Ld5/q;->b:Lu0/b;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧ۠ۤ۟(Ljava/lang/Object;)Lm0/r1;
    .locals 1

    invoke-static {}, Ll8/ۣ۟ۧۢ۠;->۟ۦۣۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lm0/q;

    invoke-virtual {p0}, Lm0/q;->C()Lm0/r1;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۦۣۧ(Ljava/lang/Object;)Lk0/y;
    .locals 1

    invoke-static {}, Ll6/ۥۦۣ۟;->ۤۤ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/i0;

    invoke-static {p0}, Lk0/z;->e(Lk0/i0;)Lk0/y;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
