.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzht;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzho;


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzho;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    .line 1
    const/16 v0, 0x18

    return v0
.end method

.method public final bridge synthetic zza(Ljava/nio/ByteBuffer;[B[B)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzho;->zza(Ljava/nio/ByteBuffer;[B[B)V

    return-void
.end method

.method public final bridge synthetic zza([BLjava/nio/ByteBuffer;)[B
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzho;->zza([BLjava/nio/ByteBuffer;)[B

    move-result-object p1

    return-object p1
.end method

.method public final zza([II)[I
    .locals 11

    .line 4
    array-length v0, p1

    const/4 v1, 0x5

    const/4 v2, 0x6

    if-ne v0, v2, :cond_0

    const/16 v0, 0x10

    new-array v3, v0, [I

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzho;->zza:[I

    new-array v0, v0, [I

    .line 5
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzhk;->zza([I[I)V

    const/4 v4, 0x0

    .line 6
    aget v5, p1, v4

    const/16 v6, 0xc

    aput v5, v0, v6

    const/4 v5, 0x1

    .line 7
    aget v5, p1, v5

    const/16 v7, 0xd

    aput v5, v0, v7

    const/4 v5, 0x2

    .line 8
    aget v5, p1, v5

    const/16 v8, 0xe

    aput v5, v0, v8

    const/4 v5, 0x3

    .line 9
    aget v5, p1, v5

    const/16 v9, 0xf

    aput v5, v0, v9

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzhk;->zza([I)V

    aget v5, v0, v6

    const/4 v10, 0x4

    aput v5, v0, v10

    aget v5, v0, v7

    aput v5, v0, v1

    aget v5, v0, v8

    aput v5, v0, v2

    const/4 v2, 0x7

    aget v5, v0, v9

    aput v5, v0, v2

    const/16 v2, 0x8

    .line 11
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    .line 12
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzhk;->zza([I[I)V

    aput p2, v3, v6

    aput v4, v3, v7

    .line 13
    aget p2, p1, v10

    aput p2, v3, v8

    .line 14
    aget p1, p1, v1

    aput p1, v3, v9

    return-object v3

    .line 15
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    array-length p1, p1

    shl-int/2addr p1, v1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"

    .line 17
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
