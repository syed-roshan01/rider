.class public final Lh8/b;
.super Ljava/lang/Object;

# interfaces
.implements Lj8/b;


# instance fields
.field public final a:Lj8/b;

.field public final synthetic b:Lh8/c;


# direct methods
.method public constructor <init>(Lh8/c;Lj8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/b;->b:Lh8/c;

    iput-object p2, p0, Lh8/b;->a:Lj8/b;

    return-void
.end method


# virtual methods
.method public final D(La4/k;)V
    .locals 2

    iget-object v0, p0, Lh8/b;->b:Lh8/c;

    iget v1, v0, Lh8/c;->s:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lh8/c;->s:I

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1}, Lj8/b;->D(La4/k;)V

    return-void
.end method

.method public final E()V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0}, Lj8/b;->E()V

    return-void
.end method

.method public final G(ZILjava/util/List;)V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1, p2, p3}, Lj8/b;->G(ZILjava/util/List;)V

    return-void
.end method

.method public final N(IJ)V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1, p2, p3}, Lj8/b;->N(IJ)V

    return-void
.end method

.method public final R()I
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0}, Lj8/b;->R()I

    move-result v0

    return v0
.end method

.method public final X(IZI)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lh8/b;->b:Lh8/c;

    iget v1, v0, Lh8/c;->s:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lh8/c;->s:I

    :cond_0
    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1, p2, p3}, Lj8/b;->X(IZI)V

    return-void
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final bridge synthetic close()V
    .locals 0

    invoke-virtual {p0}, Lh8/b;->a()V

    return-void
.end method

.method public final d(Lj8/a;[B)V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1, p2}, Lj8/b;->d(Lj8/a;[B)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0}, Lj8/b;->flush()V

    return-void
.end method

.method public final o(ILj8/a;)V
    .locals 2

    iget-object v0, p0, Lh8/b;->b:Lh8/c;

    iget v1, v0, Lh8/c;->s:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lh8/c;->s:I

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1, p2}, Lj8/b;->o(ILj8/a;)V

    return-void
.end method

.method public final r(IILja/g;Z)V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lj8/b;->r(IILja/g;Z)V

    return-void
.end method

.method public final v(La4/k;)V
    .locals 1

    iget-object v0, p0, Lh8/b;->a:Lj8/b;

    invoke-interface {v0, p1}, Lj8/b;->v(La4/k;)V

    return-void
.end method
