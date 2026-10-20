.class public abstract Lcom/google/crypto/tink/shaded/protobuf/l;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# static fields
.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/k;

.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/i;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/f0;->b:[B

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;-><init>([B)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-direct {v0, v1, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;-><init>(II)V

    :goto_0
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/l;->c:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method public static g(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Beginning index larger than ending index: "

    const-string v1, ", "

    invoke-static {v0, p0, v1, p1}, Ll/q;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "End index: "

    const-string v1, " >= "

    invoke-static {v0, p1, v1, p2}, Ll/q;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Beginning index: "

    const-string v0, " < 0"

    invoke-static {p2, p0, v0}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method

.method public static i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;
    .locals 3

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->g(III)I

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/k;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/l;->c:Lcom/google/crypto/tink/shaded/protobuf/i;

    iget v2, v2, Lcom/google/crypto/tink/shaded/protobuf/i;->a:I

    packed-switch v2, :pswitch_data_0

    new-array v0, p2, [B

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :pswitch_0
    invoke-static {p0, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    :goto_0
    invoke-direct {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/k;-><init>([B)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public abstract e(I)B
.end method

.method public final hashCode()I
    .locals 6

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:I

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v0

    move-object v1, p0

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->p()I

    move-result v2

    move v4, v0

    move v3, v2

    :goto_0
    add-int v5, v2, v0

    if-ge v3, v5, :cond_0

    mul-int/lit8 v4, v4, 0x1f

    iget-object v5, v1, Lcom/google/crypto/tink/shaded/protobuf/k;->d:[B

    aget-byte v5, v5, v3

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v4, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:I

    :cond_2
    return v0
.end method

.method public abstract k([BI)V
.end method

.method public abstract n(I)B
.end method

.method public final o()[B
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/f0;->b:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    invoke-virtual {p0, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->k([BI)V

    return-object v1
.end method

.method public abstract size()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v2

    const/16 v4, 0x32

    if-gt v2, v4, :cond_0

    invoke-static {p0}, Lh6/g;->U(Lcom/google/crypto/tink/shaded/protobuf/l;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object v4, p0

    check-cast v4, Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->size()I

    move-result v5

    const/16 v6, 0x2f

    invoke-static {v3, v6, v5}, Lcom/google/crypto/tink/shaded/protobuf/l;->g(III)I

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    goto :goto_0

    :cond_1
    new-instance v5, Lcom/google/crypto/tink/shaded/protobuf/j;

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->p()I

    move-result v6

    iget-object v4, v4, Lcom/google/crypto/tink/shaded/protobuf/k;->d:[B

    invoke-direct {v5, v4, v6, v3}, Lcom/google/crypto/tink/shaded/protobuf/j;-><init>([BII)V

    move-object v3, v5

    :goto_0
    invoke-static {v3}, Lh6/g;->U(Lcom/google/crypto/tink/shaded/protobuf/l;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "<ByteString@%s size=%d contents=\"%s\">"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
