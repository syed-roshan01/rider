.class public Lo4/۟۟ۡۧۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۡۤۨۧ:I = -0x178


# direct methods
.method public static ۟۟ۡۦۡ([SIII)Ljava/lang/String;
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

.method public static ۣ۟۠ۢۨ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, La8/ۡۦۨۡ;->ۣ۠۠ۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۢۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lu4/۟ۡۢۦۣ;->ۣۣۧۧ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "Error querying database."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۡۢ(J)I
    .locals 1

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1}, Lcom/google/protobuf/v;->o0(J)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۢۡ(Ljava/lang/Object;)Lk6/x7;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۤۤۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/i5;

    iget-object v1, p0, Lk6/i5;->b:Lk6/x7;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۢۢ(Ljava/lang/Object;)Lf0/k0;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۤۤۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lf0/p1;

    iget-object v1, p0, Lf0/p1;->i:Lf0/k0;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    invoke-static {}, Lh7/ۥۥۢ۟;->ۦ۠ۤۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->setDefaultsAsync(Ljava/util/Map;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۣۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lv5/ۧۥۢۡ;->ۥۢۡ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lf0/h;

    iget-boolean v1, p0, Lf0/h;->t:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۠۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lq6/ۣ۟ۢ۟ۤ;->۟۠ۧ۠ۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/i0;

    invoke-virtual {p0, p1}, Lf0/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۡ()F
    .locals 1

    invoke-static {}, Lr2/۠ۦۡۤ;->ۡۨۨۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget v0, Lk0/c4;->b:F

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۢۢ(Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lm7/ۧۢ۟;->ۤۧ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/protobuf/v;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/v;->A0(II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۤ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/FileInputStream;
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۦۨۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ly3/b;

    check-cast p1, Landroid/content/res/AssetManager;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ly3/b;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣۢ(Ljava/lang/Object;Z)Landroid/os/Bundle;
    .locals 1

    invoke-static {}, Ls6/۟ۡ۟ۧۢ;->ۣ۟۠ۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-static {p0, p1}, Lk6/r7;->u(Ljava/util/Map;Z)Landroid/os/Bundle;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۢ۠(Ljava/lang/Object;)Lf0/o0;
    .locals 1

    invoke-static {}, Lz0/ۣ۟۠ۤ۟;->ۣ۟ۡۤۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/c2;

    invoke-virtual {p0}, Lf0/c2;->a()Lf0/o0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۦ۟ۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣۦۧۥ()I
    .locals 2

    const v0, 0xad

    sget v1, Lcom/google/firebase/installations/۠ۤۢ۟;->ۤۤۤۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤ۟ۥۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۡ۟ۨۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk0/b5;

    iget v1, p0, Lk0/b5;->z:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۧۤ(Ljava/lang/Object;J)V
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->ۤۡۥۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/a5;

    invoke-virtual {p0, p1, p2}, Lk6/a5;->A(J)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۢ۠ۦ(Ljava/lang/Object;)Lp9/z;
    .locals 2

    invoke-static {}, Ls6/۟ۡ۟ۧۢ;->ۣ۟۠ۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v1, p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;->O0:Lp9/z;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۥۥ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lz2/ۢۨۨۦ;->ۦۥۨۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzl()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣ()Ly0/o;
    .locals 2

    invoke-static {}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۦۣۤۧ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Landroidx/compose/foundation/layout/c;->l()Ly0/o;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۟ۤۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lx8/ۢۨۥۨ;->۟۟ۢ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Service not registered/enabled"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦۦۣ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lv9/۠ۡۨۨ;->ۣۤۢۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/net/HttpURLConnection;

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۧۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ls7/۟ۢ۟ۤۧ;->ۣۢۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzdd;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdd;->zzf:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧ۠ۧ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۧۡۡۡ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->ۤۡۥۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/auto/accept/data/model/UserProfile;

    invoke-virtual {p0}, Lcom/auto/accept/data/model/UserProfile;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
