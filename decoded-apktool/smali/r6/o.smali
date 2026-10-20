.class public final Lr6/o;
.super Lr6/p;


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Lr6/p;


# direct methods
.method public constructor <init>(Lr6/p;II)V
    .locals 0

    iput-object p1, p0, Lr6/o;->e:Lr6/p;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput p2, p0, Lr6/o;->c:I

    iput p3, p0, Lr6/o;->d:I

    return-void
.end method


# virtual methods
.method public final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/o;->e:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->g()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr6/o;->d:I

    invoke-static {p1, v0}, Ly3/e;->I(II)V

    iget v0, p0, Lr6/o;->c:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lr6/o;->e:Lr6/p;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i()I
    .locals 2

    iget-object v0, p0, Lr6/o;->e:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->k()I

    move-result v0

    iget v1, p0, Lr6/o;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lr6/o;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 2

    iget-object v0, p0, Lr6/o;->e:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->k()I

    move-result v0

    iget v1, p0, Lr6/o;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lr6/p;->p(I)Lr6/m;

    move-result-object p1

    return-object p1
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final r(II)Lr6/p;
    .locals 1

    iget v0, p0, Lr6/o;->d:I

    invoke-static {p1, p2, v0}, Ly3/e;->L(III)V

    iget v0, p0, Lr6/o;->c:I

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    iget-object v0, p0, Lr6/o;->e:Lr6/p;

    invoke-virtual {v0, p1, p2}, Lr6/p;->r(II)Lr6/p;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lr6/o;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr6/o;->r(II)Lr6/p;

    move-result-object p1

    return-object p1
.end method
