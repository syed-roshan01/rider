.class public final La0/r0;
.super Ljava/lang/Object;

# interfaces
.implements La0/u;


# instance fields
.field public final a:Lq/r;

.field public final b:[Ljava/lang/Object;

.field public final c:I


# direct methods
.method public constructor <init>(Li9/g;Lh6/g;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Lh6/g;->f0()La0/q0;

    move-result-object p2

    iget v0, p1, Li9/e;->a:I

    if-ltz v0, :cond_3

    iget v1, p2, La0/q0;->b:I

    add-int/lit8 v1, v1, -0x1

    iget p1, p1, Li9/e;->b:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge p1, v0, :cond_0

    sget-object p1, Lq/u;->a:Lq/r;

    const-string p2, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"

    invoke-static {p1, p2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La0/r0;->a:Lq/r;

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    iput-object p2, p0, La0/r0;->b:[Ljava/lang/Object;

    iput p1, p0, La0/r0;->c:I

    goto :goto_1

    :cond_0
    sub-int v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iput-object v2, p0, La0/r0;->b:[Ljava/lang/Object;

    iput v0, p0, La0/r0;->c:I

    new-instance v2, Lq/r;

    invoke-direct {v2, v1}, Lq/r;-><init>(I)V

    new-instance v1, Ls/o;

    invoke-direct {v1, v0, p1, v2, p0}, Ls/o;-><init>(IILq/r;La0/r0;)V

    invoke-virtual {p2, v0}, La0/q0;->b(I)V

    invoke-virtual {p2, p1}, La0/q0;->b(I)V

    if-lt p1, v0, :cond_2

    iget-object p2, p2, La0/q0;->a:Lo0/i;

    invoke-static {v0, p2}, Lf6/a;->l(ILo0/i;)I

    move-result v0

    iget-object v3, p2, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v3, v3, v0

    check-cast v3, La0/e;

    iget v3, v3, La0/e;->a:I

    :goto_0
    if-gt v3, p1, :cond_1

    iget-object v4, p2, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v4, v4, v0

    check-cast v4, La0/e;

    invoke-virtual {v1, v4}, Ls/o;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget v4, v4, La0/e;->b:I

    add-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput-object v2, p0, La0/r0;->a:Lq/r;

    :goto_1
    return-void

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "toIndex ("

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") should be not smaller than fromIndex ("

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "negative nearestRange.first"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La0/r0;->c:I

    sub-int/2addr p1, v0

    if-ltz p1, :cond_0

    const-string v0, "<this>"

    iget-object v1, p0, La0/r0;->b:[Ljava/lang/Object;

    invoke-static {v1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    aget-object p1, v1, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, La0/r0;->a:Lq/r;

    invoke-virtual {v0, p1}, Lq/r;->d(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, v0, Lq/r;->c:[I

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method
