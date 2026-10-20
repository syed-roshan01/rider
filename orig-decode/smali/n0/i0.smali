.class public final Ln0/i0;
.super Ljava/lang/Object;


# instance fields
.field public a:[Ln0/g0;

.field public b:I

.field public c:[I

.field public d:I

.field public e:[Ljava/lang/Object;

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [Ln0/g0;

    iput-object v1, p0, Ln0/i0;->a:[Ln0/g0;

    new-array v1, v0, [I

    iput-object v1, p0, Ln0/i0;->c:[I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ln0/i0;->e:[Ljava/lang/Object;

    return-void
.end method

.method public static final a(Ln0/i0;I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    rsub-int/lit8 p0, p1, 0x20

    const/4 p1, -0x1

    ushr-int p0, p1, p0

    :goto_0
    return p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Ln0/i0;->b:I

    iput v0, p0, Ln0/i0;->d:I

    iget-object v1, p0, Ln0/i0;->e:[Ljava/lang/Object;

    iget v2, p0, Ln0/i0;->f:I

    invoke-static {v0, v2, v1}, Lb9/b;->O(II[Ljava/lang/Object;)V

    iput v0, p0, Ln0/i0;->f:I

    return-void
.end method

.method public final c(Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 5

    invoke-virtual {p0}, Ln0/i0;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ln0/h0;

    invoke-direct {v0, p0}, Ln0/h0;-><init>(Ln0/i0;)V

    :goto_0
    iget-object v1, v0, Ln0/h0;->d:Ln0/i0;

    iget-object v2, v1, Ln0/i0;->a:[Ln0/g0;

    iget v3, v0, Ln0/h0;->a:I

    aget-object v2, v2, v3

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v2, v0, p1, p2, p3}, Ln0/g0;->a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V

    iget v2, v0, Ln0/h0;->a:I

    iget v3, v1, Ln0/i0;->b:I

    if-lt v2, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v1, Ln0/i0;->a:[Ln0/g0;

    aget-object v2, v3, v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v3, v0, Ln0/h0;->b:I

    iget v4, v2, Ln0/g0;->a:I

    add-int/2addr v3, v4

    iput v3, v0, Ln0/h0;->b:I

    iget v3, v0, Ln0/h0;->c:I

    iget v2, v2, Ln0/g0;->b:I

    add-int/2addr v3, v2

    iput v3, v0, Ln0/h0;->c:I

    iget v2, v0, Ln0/h0;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Ln0/h0;->a:I

    iget v1, v1, Ln0/i0;->b:I

    if-ge v2, v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ln0/i0;->b()V

    return-void
.end method

.method public final d()Z
    .locals 1

    iget v0, p0, Ln0/i0;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Z
    .locals 1

    iget v0, p0, Ln0/i0;->b:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f()Ln0/g0;
    .locals 2

    iget-object v0, p0, Ln0/i0;->a:[Ln0/g0;

    iget v1, p0, Ln0/i0;->b:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final g(Ln0/g0;)V
    .locals 4

    iget v0, p1, Ln0/g0;->a:I

    iget v1, p1, Ln0/g0;->b:I

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Ln0/i0;->h(Ln0/g0;)V

    return-void

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot push "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " without arguments because it expects "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ints and "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " objects."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Ln0/g0;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Ln0/i0;->g:I

    iput v0, p0, Ln0/i0;->h:I

    iget v0, p0, Ln0/i0;->b:I

    iget-object v1, p0, Ln0/i0;->a:[Ln0/g0;

    array-length v2, v1

    const/16 v3, 0x400

    const-string v4, "copyOf(this, newSize)"

    if-ne v0, v2, :cond_1

    if-le v0, v3, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    add-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ln0/g0;

    iput-object v0, p0, Ln0/i0;->a:[Ln0/g0;

    :cond_1
    iget v0, p0, Ln0/i0;->d:I

    iget v1, p1, Ln0/g0;->a:I

    add-int/2addr v0, v1

    iget-object v2, p0, Ln0/i0;->c:[I

    array-length v5, v2

    if-le v0, v5, :cond_4

    if-le v5, v3, :cond_2

    move v6, v3

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    add-int/2addr v5, v6

    if-ge v5, v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v5

    :goto_2
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-static {v0, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ln0/i0;->c:[I

    :cond_4
    iget v0, p0, Ln0/i0;->f:I

    iget v2, p1, Ln0/g0;->b:I

    add-int/2addr v0, v2

    iget-object v5, p0, Ln0/i0;->e:[Ljava/lang/Object;

    array-length v6, v5

    if-le v0, v6, :cond_7

    if-le v6, v3, :cond_5

    goto :goto_3

    :cond_5
    move v3, v6

    :goto_3
    add-int/2addr v6, v3

    if-ge v6, v0, :cond_6

    goto :goto_4

    :cond_6
    move v0, v6

    :goto_4
    invoke-static {v5, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ln0/i0;->e:[Ljava/lang/Object;

    :cond_7
    iget-object v0, p0, Ln0/i0;->a:[Ln0/g0;

    iget v3, p0, Ln0/i0;->b:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ln0/i0;->b:I

    aput-object p1, v0, v3

    iget p1, p0, Ln0/i0;->d:I

    add-int/2addr p1, v1

    iput p1, p0, Ln0/i0;->d:I

    iget p1, p0, Ln0/i0;->f:I

    add-int/2addr p1, v2

    iput p1, p0, Ln0/i0;->f:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
