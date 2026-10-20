.class public final Lja/w;
.super Lr8/d;

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final a:[Lja/j;


# direct methods
.method public constructor <init>([Lja/j;)V
    .locals 0

    invoke-direct {p0}, Lr8/d;-><init>()V

    iput-object p1, p0, Lja/w;->a:[Lja/j;

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lja/j;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lja/j;

    invoke-super {p0, p1}, Lr8/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Lja/w;->a:[Lja/j;

    array-length v0, v0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lja/w;->a:[Lja/j;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lja/j;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lja/j;

    invoke-super {p0, p1}, Lr8/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lja/j;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lja/j;

    invoke-super {p0, p1}, Lr8/d;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
