.class public final Landroidx/compose/ui/semantics/AppendedSemanticsElement;
.super Lt1/u0;

# interfaces
.implements Ly1/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;",
        "Ly1/k;"
    }
.end annotation


# instance fields
.field public final b:Z

.field public final c:Lc9/c;


# direct methods
.method public constructor <init>(Lc9/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    iput-object p1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    iget-boolean v1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    iget-boolean v3, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    iget-object p1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final k()Ly1/j;
    .locals 2

    new-instance v0, Ly1/j;

    invoke-direct {v0}, Ly1/j;-><init>()V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    iput-boolean v1, v0, Ly1/j;->b:Z

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final l()Ly0/n;
    .locals 4

    new-instance v0, Ly1/c;

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    iget-boolean v2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ly1/c;-><init>(ZZLc9/c;)V

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Ly1/c;

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    iput-boolean v0, p1, Ly1/c;->u:Z

    iget-object v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    iput-object v0, p1, Ly1/c;->w:Lc9/c;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AppendedSemanticsElement(mergeDescendants="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", properties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->c:Lc9/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
