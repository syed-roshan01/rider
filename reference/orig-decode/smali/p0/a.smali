.class public final Lp0/a;
.super Lr8/d;

# interfaces
.implements Lp0/b;


# instance fields
.field public final a:Lp0/b;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lp0/b;II)V
    .locals 0

    invoke-direct {p0}, Lr8/d;-><init>()V

    iput-object p1, p0, Lp0/a;->a:Lp0/b;

    iput p2, p0, Lp0/a;->b:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p2, p3, p1}, Lz6/a;->l(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lp0/a;->c:I

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Lp0/a;->c:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp0/a;->c:I

    invoke-static {p1, v0}, Lz6/a;->h(II)V

    iget v0, p0, Lp0/a;->b:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lp0/a;->a:Lp0/b;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    iget v0, p0, Lp0/a;->c:I

    invoke-static {p1, p2, v0}, Lz6/a;->l(III)V

    new-instance v0, Lp0/a;

    iget v1, p0, Lp0/a;->b:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Lp0/a;->a:Lp0/b;

    invoke-direct {v0, p2, p1, v1}, Lp0/a;-><init>(Lp0/b;II)V

    return-object v0
.end method
