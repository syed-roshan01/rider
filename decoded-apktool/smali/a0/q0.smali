.class public final La0/q0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;

.field public b:I

.field public c:La0/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [La0/e;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, La0/q0;->a:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a(ILa0/o;)V
    .locals 2

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, La0/e;

    iget v1, p0, La0/q0;->b:I

    invoke-direct {v0, p2, v1, p1}, La0/e;-><init>(La0/o;II)V

    iget p2, p0, La0/q0;->b:I

    add-int/2addr p2, p1

    iput p2, p0, La0/q0;->b:I

    iget-object p1, p0, La0/q0;->a:Lo0/i;

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string p2, "size should be >=0, but was "

    invoke-static {p2, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b(I)V
    .locals 3

    if-ltz p1, :cond_0

    iget v0, p0, La0/q0;->b:I

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index "

    const-string v2, ", size "

    invoke-static {v1, p1, v2}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v1, p0, La0/q0;->b:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(I)La0/e;
    .locals 3

    invoke-virtual {p0, p1}, La0/q0;->b(I)V

    iget-object v0, p0, La0/q0;->c:La0/e;

    if-eqz v0, :cond_0

    iget v1, v0, La0/e;->b:I

    iget v2, v0, La0/e;->a:I

    add-int/2addr v1, v2

    if-ge p1, v1, :cond_0

    if-gt v2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La0/q0;->a:Lo0/i;

    invoke-static {p1, v0}, Lf6/a;->l(ILo0/i;)I

    move-result p1

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    aget-object p1, v0, p1

    move-object v0, p1

    check-cast v0, La0/e;

    iput-object v0, p0, La0/q0;->c:La0/e;

    :goto_0
    return-object v0
.end method
