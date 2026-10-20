.class public Lw4/۟ۤ۠۟ۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۨۧۦ۠:I = 0x2f8


# direct methods
.method public static ۟۟۟ۦۡ(Ljava/lang/Object;)Lk6/r4;
    .locals 2

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/p7;

    iget-object v1, p0, Lk6/p7;->k:Lk6/r4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۟ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ls8/۟ۥۨۨ;->۟۠۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "trigger_uri"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۟ۤۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۨ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Filter Saved \u2713"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۢۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ls0/ۢۨۦ۟;->ۣۡۨۧ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "Skip rides outside your km range"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥۡ(Ljava/lang/Object;)Lm0/g1;
    .locals 2

    invoke-static {}, Ld2/۟ۦۡ۟ۦ;->ۣۧۡۧ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ld5/b2;

    iget-object v1, p0, Ld5/b2;->f:Lm0/g1;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۥۡ۠(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lc3/۟ۡۧۢۥ;->۟ۧ۟ۤۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk6/r;

    iget-wide v2, p0, Lk6/r;->g:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;
    .locals 1

    invoke-static {}, Lr2/ۧۧۢۢ;->ۣ۟۟ۨۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk0/c0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lk0/c0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۠۠۠(Ljava/lang/Object;)Lk0/y;
    .locals 2

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lk0/i0;

    iget-object v1, p0, Lk0/i0;->M:Lk0/y;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۨۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw4/ۥۧۡۥ;->ۧۢۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Minimum Fare Filter (\u20b9)"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۢۢ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۤۨۥۣ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lg3/۟ۥۣۣۥ;->۟ۤۡۧۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/TreeSet;

    invoke-virtual {p0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۧۧ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟۠ۢۦۧ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzfc$zzc$zza;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzc$zza;->zzd()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢۥۦ(Ljava/lang/Object;)Lk6/f4;
    .locals 2

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->۟ۤۨۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lk6/d4;

    iget-object v1, p0, Lk6/d4;->l:Lk6/f4;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۤۢۡ()I
    .locals 2

    const v0, -0x3a3

    sget v1, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۤۢۧۢ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۟ۧۡ۟ۡ(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟ۧۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Le1/۟ۡۡۤۡ;->۟ۦۣۦۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast p1, Lc9/a;

    check-cast p2, Lm0/m;

    invoke-static {p0, p1, p2, p3}, Ly3/e;->e(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lc9/a;Lm0/m;I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۧ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;
    .locals 1

    invoke-static {}, Lw1/ۦۣۦۧ;->ۨۦۥۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۤۡ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    invoke-static {}, Lm1/ۣۡ۠ۧ;->۟ۦۥۨۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lk6/a5;

    iget-object v1, p0, Lk6/a5;->t:Ljava/util/ArrayList;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۦۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->ۦ۠ۤ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lf0/s1;

    iget v1, p0, Lf0/s1;->b:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۣۣ۟۟۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, La2/c0;

    check-cast p1, Lm2/b;

    check-cast p2, Lf2/d;

    invoke-static {p0, p1, p2}, Lf0/o1;->b(La2/c0;Lm2/b;Lf2/d;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡ۠ۡ()Lk0/t;
    .locals 1

    invoke-static {}, Ln9/ۤۧۧۤ;->ۢۦ۠۠()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lk0/t;->f:Lk0/t;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۢۨ(Ljava/lang/Object;)Lk6/s5;
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/processedrootsentinel/۟ۥ۠۠۠;->۟ۥۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lk6/y5;

    iget-object v1, p0, Lk6/y5;->k:Lk6/s5;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۥۣۨ(Ljava/lang/Object;FJJJLjava/lang/Object;Ljava/lang/Object;FLjava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۦ۟ۡۧ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ly0/o;

    check-cast p8, Lc9/e;

    check-cast p9, La2/c0;

    check-cast p11, Ly/i;

    check-cast p12, Ly/g;

    check-cast p15, Lc9/e;

    check-cast p16, Lc9/e;

    check-cast p17, Lm0/m;

    invoke-static/range {p0 .. p19}, Lk0/x;->c(Ly0/o;FJJJLc9/e;La2/c0;FLy/i;Ly/g;IZLc9/e;Lc9/e;Lm0/m;II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۥۣ۟ۢ([SIII)Ljava/lang/String;
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
