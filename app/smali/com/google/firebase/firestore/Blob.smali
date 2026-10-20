.class public Lcom/google/firebase/firestore/Blob;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/google/firebase/firestore/Blob;",
        ">;"
    }
.end annotation


# instance fields
.field private final bytes:Lcom/google/protobuf/n;


# direct methods
.method private constructor <init>(Lcom/google/protobuf/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    return-void
.end method

.method public static fromByteString(Lcom/google/protobuf/n;)Lcom/google/firebase/firestore/Blob;
    .locals 1

    const-string v0, "Provided ByteString must not be null."

    invoke-static {p0, v0}, Lcom/google/firebase/firestore/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/firebase/firestore/Blob;

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/Blob;-><init>(Lcom/google/protobuf/n;)V

    return-object v0
.end method

.method public static fromBytes([B)Lcom/google/firebase/firestore/Blob;
    .locals 3

    const-string v0, "Provided bytes array must not be null."

    invoke-static {p0, v0}, Lcom/google/firebase/firestore/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/firebase/firestore/Blob;

    sget-object v1, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v1}, Lcom/google/protobuf/n;->o([BII)Lcom/google/protobuf/m;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/Blob;-><init>(Lcom/google/protobuf/n;)V

    return-object v0
.end method


# virtual methods
.method public compareTo(Lcom/google/firebase/firestore/Blob;)I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    .line 2
    iget-object p1, p1, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/util/Util;->compareByteStrings(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/firebase/firestore/Blob;

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/Blob;->compareTo(Lcom/google/firebase/firestore/Blob;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/firebase/firestore/Blob;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    check-cast p1, Lcom/google/firebase/firestore/Blob;

    iget-object p1, p1, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/n;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    invoke-virtual {v0}, Lcom/google/protobuf/n;->hashCode()I

    move-result v0

    return v0
.end method

.method public toByteString()Lcom/google/protobuf/n;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    return-object v0
.end method

.method public toBytes()[B
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    invoke-virtual {v0}, Lcom/google/protobuf/n;->z()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Blob { bytes="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/firebase/firestore/Blob;->bytes:Lcom/google/protobuf/n;

    invoke-static {v1}, Lcom/google/firebase/firestore/util/Util;->toDebugString(Lcom/google/protobuf/n;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
