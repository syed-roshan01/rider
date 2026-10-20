.class public final Lr8/c;
.super Lr8/d;

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final a:Lr8/d;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lr8/d;II)V
    .locals 1

    const-string v0, "list"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lr8/d;-><init>()V

    iput-object p1, p0, Lr8/c;->a:Lr8/d;

    iput p2, p0, Lr8/c;->b:I

    invoke-virtual {p1}, Lr8/a;->e()I

    move-result p1

    invoke-static {p2, p3, p1}, Lq8/k;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lr8/c;->c:I

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Lr8/c;->c:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lr8/c;->c:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, Lr8/c;->b:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lr8/c;->a:Lr8/d;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

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
