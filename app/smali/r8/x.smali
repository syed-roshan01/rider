.class public final Lr8/x;
.super Lr8/d;

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 2

    invoke-direct {p0}, Lr8/d;-><init>()V

    iput-object p1, p0, Lr8/x;->a:[Ljava/lang/Object;

    if-ltz p2, :cond_1

    array-length v0, p1

    if-gt p2, v0, :cond_0

    array-length p1, p1

    iput p1, p0, Lr8/x;->b:I

    iput p2, p0, Lr8/x;->d:I

    return-void

    :cond_0
    const-string v0, "ring buffer filled size: "

    const-string v1, " cannot be larger than the buffer size: "

    invoke-static {v0, p2, v1}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    array-length p1, p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const-string p1, "ring buffer filled size should not be negative but it is "

    invoke-static {p1, p2}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Lr8/x;->d:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lr8/x;->e()I

    move-result v0

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, Lr8/x;->c:I

    add-int/2addr v0, p1

    iget p1, p0, Lr8/x;->b:I

    rem-int/2addr v0, p1

    iget-object p1, p0, Lr8/x;->a:[Ljava/lang/Object;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    invoke-static {v2, p1, v3, v0}, Ll/q;->i(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final i(I)V
    .locals 4

    if-ltz p1, :cond_3

    iget v0, p0, Lr8/x;->d:I

    if-gt p1, v0, :cond_2

    if-lez p1, :cond_1

    iget v0, p0, Lr8/x;->c:I

    add-int v1, v0, p1

    iget v2, p0, Lr8/x;->b:I

    rem-int/2addr v1, v2

    iget-object v3, p0, Lr8/x;->a:[Ljava/lang/Object;

    if-le v0, v1, :cond_0

    invoke-static {v0, v2, v3}, Lb9/b;->O(II[Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0, v1, v3}, Lb9/b;->O(II[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v0, v1, v3}, Lb9/b;->O(II[Ljava/lang/Object;)V

    :goto_0
    iput v1, p0, Lr8/x;->c:I

    iget v0, p0, Lr8/x;->d:I

    sub-int/2addr v0, p1

    iput v0, p0, Lr8/x;->d:I

    :cond_1
    return-void

    :cond_2
    const-string v0, "n shouldn\'t be greater than the buffer size: n = "

    const-string v1, ", size = "

    invoke-static {v0, p1, v1}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v0, p0, Lr8/x;->d:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string v0, "n shouldn\'t be negative but it is "

    invoke-static {v0, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lr8/w;

    invoke-direct {v0, p0}, Lr8/w;-><init>(Lr8/x;)V

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr8/x;->e()I

    move-result v0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lr8/x;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 6

    const-string v0, "array"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v0, p1

    iget v1, p0, Lr8/x;->d:I

    if-ge v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lr8/x;->d:I

    iget v1, p0, Lr8/x;->c:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-object v4, p0, Lr8/x;->a:[Ljava/lang/Object;

    if-ge v3, v0, :cond_1

    iget v5, p0, Lr8/x;->b:I

    if-ge v1, v5, :cond_1

    .line 4
    aget-object v4, v4, v1

    aput-object v4, p1, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v3, v0, :cond_2

    .line 5
    aget-object v1, v4, v2

    aput-object v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 6
    :cond_2
    array-length v1, p1

    if-ge v0, v1, :cond_3

    const/4 v1, 0x0

    .line 7
    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method
