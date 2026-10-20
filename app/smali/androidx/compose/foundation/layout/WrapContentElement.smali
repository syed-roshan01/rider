.class final Landroidx/compose/foundation/layout/WrapContentElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:Z

.field public final d:Lc9/e;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IZLs/i;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:I

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/layout/WrapContentElement;->d:Lc9/e;

    iput-object p4, p0, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroidx/compose/foundation/layout/WrapContentElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/layout/WrapContentElement;

    iget v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:I

    iget v3, p1, Landroidx/compose/foundation/layout/WrapContentElement;->b:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    iget-object p1, p1, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    invoke-static {v2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    invoke-static {v2, v0, v1}, Ll/q;->c(ZII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Ly/n1;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:I

    iput v1, v0, Ly/n1;->u:I

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iput-boolean v1, v0, Ly/n1;->v:Z

    iget-object v1, p0, Landroidx/compose/foundation/layout/WrapContentElement;->d:Lc9/e;

    iput-object v1, v0, Ly/n1;->w:Lc9/e;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Ly/n1;

    iget v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->b:I

    iput v0, p1, Ly/n1;->u:I

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->c:Z

    iput-boolean v0, p1, Ly/n1;->v:Z

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement;->d:Lc9/e;

    iput-object v0, p1, Ly/n1;->w:Lc9/e;

    return-void
.end method
