.class public final Lr8/w;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;
.implements Le9/a;


# instance fields
.field public a:Lr8/z;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public final synthetic e:Lr8/x;


# direct methods
.method public constructor <init>(Lr8/x;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr8/w;->e:Lr8/x;

    sget-object v0, Lr8/z;->b:Lr8/z;

    iput-object v0, p0, Lr8/w;->a:Lr8/z;

    invoke-virtual {p1}, Lr8/x;->e()I

    move-result v0

    iput v0, p0, Lr8/w;->c:I

    iget p1, p1, Lr8/x;->c:I

    iput p1, p0, Lr8/w;->d:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 6

    iget-object v0, p0, Lr8/w;->a:Lr8/z;

    sget-object v1, Lr8/z;->d:Lr8/z;

    if-eq v0, v1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v3, :cond_1

    iput-object v1, p0, Lr8/w;->a:Lr8/z;

    iget v0, p0, Lr8/w;->c:I

    if-nez v0, :cond_0

    sget-object v0, Lr8/z;->c:Lr8/z;

    iput-object v0, p0, Lr8/w;->a:Lr8/z;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lr8/w;->e:Lr8/x;

    iget-object v3, v1, Lr8/x;->a:[Ljava/lang/Object;

    iget v5, p0, Lr8/w;->d:I

    aget-object v3, v3, v5

    iput-object v3, p0, Lr8/w;->b:Ljava/lang/Object;

    sget-object v3, Lr8/z;->a:Lr8/z;

    iput-object v3, p0, Lr8/w;->a:Lr8/z;

    add-int/2addr v5, v2

    iget v1, v1, Lr8/x;->b:I

    rem-int/2addr v5, v1

    iput v5, p0, Lr8/w;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lr8/w;->c:I

    :goto_0
    iget-object v0, p0, Lr8/w;->a:Lr8/z;

    sget-object v1, Lr8/z;->a:Lr8/z;

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v4

    :cond_2
    :goto_1
    return v2

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr8/w;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lr8/z;->b:Lr8/z;

    iput-object v0, p0, Lr8/w;->a:Lr8/z;

    iget-object v0, p0, Lr8/w;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final c()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final bridge synthetic hasNext()Z
    .locals 1

    invoke-virtual {p0}, Lr8/w;->a()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr8/w;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic remove()V
    .locals 1

    invoke-virtual {p0}, Lr8/w;->c()V

    const/4 v0, 0x0

    throw v0
.end method
