.class public final Lr6/b0;
.super Lr6/p;


# instance fields
.field public final synthetic c:Lr6/c0;


# direct methods
.method public constructor <init>(Lr6/c0;)V
    .locals 0

    iput-object p1, p0, Lr6/b0;->c:Lr6/c0;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lr6/b0;->c:Lr6/c0;

    iget v1, v0, Lr6/c0;->n:I

    invoke-static {p1, v1}, Ly3/e;->I(II)V

    mul-int/lit8 p1, p1, 0x2

    iget v1, v0, Lr6/c0;->f:I

    add-int v2, p1, v1

    iget-object v0, v0, Lr6/c0;->e:[Ljava/lang/Object;

    aget-object v2, v0, v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v0, v2, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lr6/b0;->c:Lr6/c0;

    iget v0, v0, Lr6/c0;->n:I

    return v0
.end method
