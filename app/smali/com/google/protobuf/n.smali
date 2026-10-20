.class public abstract Lcom/google/protobuf/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# static fields
.field public static final b:Lcom/google/protobuf/m;

.field public static final c:Lcom/google/protobuf/j;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/protobuf/m;

    sget-object v1, Lcom/google/protobuf/y0;->b:[B

    invoke-direct {v0, v1}, Lcom/google/protobuf/m;-><init>([B)V

    sput-object v0, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    invoke-static {}, Lcom/google/protobuf/e;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/protobuf/j;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/google/protobuf/j;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/j;

    invoke-direct {v0, v1, v1}, Lcom/google/protobuf/j;-><init>(II)V

    :goto_0
    sput-object v0, Lcom/google/protobuf/n;->c:Lcom/google/protobuf/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/n;->a:I

    return-void
.end method

.method public static g(Ljava/util/Iterator;I)Lcom/google/protobuf/n;
    .locals 8

    const/4 v0, 0x1

    if-lt p1, v0, :cond_d

    if-ne p1, v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/n;

    goto/16 :goto_2

    :cond_0
    ushr-int/lit8 v1, p1, 0x1

    invoke-static {p0, v1}, Lcom/google/protobuf/n;->g(Ljava/util/Iterator;I)Lcom/google/protobuf/n;

    move-result-object v2

    sub-int/2addr p1, v1

    invoke-static {p0, p1}, Lcom/google/protobuf/n;->g(Ljava/util/Iterator;I)Lcom/google/protobuf/n;

    move-result-object p0

    invoke-virtual {v2}, Lcom/google/protobuf/n;->size()I

    move-result p1

    const v1, 0x7fffffff

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result p1

    if-lt v1, p1, :cond_c

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result p1

    if-nez p1, :cond_1

    move-object p0, v2

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v2}, Lcom/google/protobuf/n;->size()I

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/google/protobuf/n;->size()I

    move-result p1

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v1

    add-int/2addr v1, p1

    const/4 p1, 0x0

    const/16 v3, 0x80

    if-ge v1, v3, :cond_5

    invoke-virtual {v2}, Lcom/google/protobuf/n;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v1

    add-int v3, v0, v1

    new-array v4, v3, [B

    invoke-virtual {v2}, Lcom/google/protobuf/n;->size()I

    move-result v5

    invoke-static {p1, v0, v5}, Lcom/google/protobuf/n;->n(III)I

    invoke-static {p1, v0, v3}, Lcom/google/protobuf/n;->n(III)I

    if-lez v0, :cond_3

    invoke-virtual {v2, p1, v4, p1, v0}, Lcom/google/protobuf/n;->p(I[BII)V

    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v2

    invoke-static {p1, v1, v2}, Lcom/google/protobuf/n;->n(III)I

    invoke-static {v0, v3, v3}, Lcom/google/protobuf/n;->n(III)I

    if-lez v1, :cond_4

    invoke-virtual {p0, p1, v4, v0, v1}, Lcom/google/protobuf/n;->p(I[BII)V

    :cond_4
    new-instance p0, Lcom/google/protobuf/m;

    invoke-direct {p0, v4}, Lcom/google/protobuf/m;-><init>([B)V

    goto/16 :goto_2

    :cond_5
    instance-of v4, v2, Lcom/google/protobuf/h2;

    if-eqz v4, :cond_9

    move-object v4, v2

    check-cast v4, Lcom/google/protobuf/h2;

    iget-object v5, v4, Lcom/google/protobuf/h2;->f:Lcom/google/protobuf/n;

    invoke-virtual {v5}, Lcom/google/protobuf/n;->size()I

    move-result v6

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v7

    add-int/2addr v7, v6

    iget-object v6, v4, Lcom/google/protobuf/h2;->e:Lcom/google/protobuf/n;

    if-ge v7, v3, :cond_8

    invoke-virtual {v5}, Lcom/google/protobuf/n;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v1

    add-int v2, v0, v1

    new-array v3, v2, [B

    invoke-virtual {v5}, Lcom/google/protobuf/n;->size()I

    move-result v4

    invoke-static {p1, v0, v4}, Lcom/google/protobuf/n;->n(III)I

    invoke-static {p1, v0, v2}, Lcom/google/protobuf/n;->n(III)I

    if-lez v0, :cond_6

    invoke-virtual {v5, p1, v3, p1, v0}, Lcom/google/protobuf/n;->p(I[BII)V

    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v4

    invoke-static {p1, v1, v4}, Lcom/google/protobuf/n;->n(III)I

    invoke-static {v0, v2, v2}, Lcom/google/protobuf/n;->n(III)I

    if-lez v1, :cond_7

    invoke-virtual {p0, p1, v3, v0, v1}, Lcom/google/protobuf/n;->p(I[BII)V

    :cond_7
    new-instance p0, Lcom/google/protobuf/m;

    invoke-direct {p0, v3}, Lcom/google/protobuf/m;-><init>([B)V

    new-instance p1, Lcom/google/protobuf/h2;

    invoke-direct {p1, v6, p0}, Lcom/google/protobuf/h2;-><init>(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)V

    :goto_0
    move-object p0, p1

    goto :goto_2

    :cond_8
    invoke-virtual {v6}, Lcom/google/protobuf/n;->q()I

    move-result p1

    invoke-virtual {v5}, Lcom/google/protobuf/n;->q()I

    move-result v3

    if-le p1, v3, :cond_9

    invoke-virtual {p0}, Lcom/google/protobuf/n;->q()I

    move-result p1

    iget v3, v4, Lcom/google/protobuf/h2;->o:I

    if-le v3, p1, :cond_9

    new-instance p1, Lcom/google/protobuf/h2;

    invoke-direct {p1, v5, p0}, Lcom/google/protobuf/h2;-><init>(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)V

    new-instance p0, Lcom/google/protobuf/h2;

    invoke-direct {p0, v6, p1}, Lcom/google/protobuf/h2;-><init>(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)V

    goto :goto_2

    :cond_9
    invoke-virtual {v2}, Lcom/google/protobuf/n;->q()I

    move-result p1

    invoke-virtual {p0}, Lcom/google/protobuf/n;->q()I

    move-result v3

    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, v0

    invoke-static {p1}, Lcom/google/protobuf/h2;->D(I)I

    move-result p1

    if-lt v1, p1, :cond_a

    new-instance p1, Lcom/google/protobuf/h2;

    invoke-direct {p1, v2, p0}, Lcom/google/protobuf/h2;-><init>(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)V

    goto :goto_0

    :cond_a
    new-instance p1, Lk6/w4;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lk6/w4;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Lk6/w4;->f(Lcom/google/protobuf/n;)V

    invoke-virtual {p1, p0}, Lk6/w4;->f(Lcom/google/protobuf/n;)V

    iget-object p0, p1, Lk6/w4;->b:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/n;

    :goto_1
    iget-object v0, p1, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p1, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/n;

    new-instance v1, Lcom/google/protobuf/h2;

    invoke-direct {v1, v0, p0}, Lcom/google/protobuf/h2;-><init>(Lcom/google/protobuf/n;Lcom/google/protobuf/n;)V

    move-object p0, v1

    goto :goto_1

    :cond_b
    :goto_2
    return-object p0

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ByteString would be too long: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/protobuf/n;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "length (%s) must be >= 1"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static k(II)V
    .locals 3

    add-int/lit8 v0, p0, 0x1

    sub-int v0, p1, v0

    or-int/2addr v0, p0

    if-gez v0, :cond_1

    if-gez p0, :cond_0

    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "Index < 0: "

    invoke-static {v0, p0}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "Index > length: "

    const-string v2, ", "

    invoke-static {v1, p0, v2, p1}, Ll/q;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public static n(III)I
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

.method public static o([BII)Lcom/google/protobuf/m;
    .locals 3

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/protobuf/n;->n(III)I

    new-instance v1, Lcom/google/protobuf/m;

    sget-object v2, Lcom/google/protobuf/n;->c:Lcom/google/protobuf/j;

    iget v2, v2, Lcom/google/protobuf/j;->a:I

    packed-switch v2, :pswitch_data_0

    new-array v0, p2, [B

    const/4 v2, 0x0

    invoke-static {p0, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :pswitch_0
    invoke-static {p0, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    :goto_0
    invoke-direct {v1, v0}, Lcom/google/protobuf/m;-><init>([B)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public abstract A(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public final B()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/google/protobuf/y0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/protobuf/n;->A(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public abstract C(Lcom/google/protobuf/n2;)V
.end method

.method public abstract e()Ljava/nio/ByteBuffer;
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/protobuf/n;->a:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/protobuf/n;->w(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lcom/google/protobuf/n;->a:I

    :cond_1
    return v0
.end method

.method public abstract i(I)B
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/n;->u()Lcom/google/protobuf/i;

    move-result-object v0

    return-object v0
.end method

.method public abstract p(I[BII)V
.end method

.method public abstract q()I
.end method

.method public abstract r(I)B
.end method

.method public abstract s()Z
.end method

.method public abstract size()I
.end method

.method public abstract t()Z
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v2

    const/16 v4, 0x32

    if-gt v2, v4, :cond_0

    invoke-static {p0}, Lcom/google/protobuf/n2;->N(Lcom/google/protobuf/n;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v4, 0x2f

    invoke-virtual {p0, v3, v4}, Lcom/google/protobuf/n;->y(II)Lcom/google/protobuf/n;

    move-result-object v3

    invoke-static {v3}, Lcom/google/protobuf/n2;->N(Lcom/google/protobuf/n;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "<ByteString@%s size=%d contents=\"%s\">"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/google/protobuf/i;
    .locals 1

    new-instance v0, Lcom/google/protobuf/h;

    invoke-direct {v0, p0}, Lcom/google/protobuf/h;-><init>(Lcom/google/protobuf/n;)V

    return-object v0
.end method

.method public abstract v()Lcom/google/protobuf/s;
.end method

.method public abstract w(III)I
.end method

.method public abstract x(III)I
.end method

.method public abstract y(II)Lcom/google/protobuf/n;
.end method

.method public final z()[B
    .locals 3

    invoke-virtual {p0}, Lcom/google/protobuf/n;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/protobuf/y0;->b:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2, v0}, Lcom/google/protobuf/n;->p(I[BII)V

    return-object v1
.end method
