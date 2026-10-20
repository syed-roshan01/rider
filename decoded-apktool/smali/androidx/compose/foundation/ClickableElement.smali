.class final Landroidx/compose/foundation/ClickableElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lx/m;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ly1/g;

.field public final f:Lc9/a;


# direct methods
.method public constructor <init>(Lx/m;ZLjava/lang/String;Ly1/g;Lc9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/ClickableElement;->b:Lx/m;

    iput-boolean p2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/foundation/ClickableElement;->e:Ly1/g;

    iput-object p5, p0, Landroidx/compose/foundation/ClickableElement;->f:Lc9/a;

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

    const-class v3, Landroidx/compose/foundation/ClickableElement;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Landroidx/compose/foundation/ClickableElement;

    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->b:Lx/m;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->b:Lx/m;

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/ClickableElement;->c:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->e:Ly1/g;

    iget-object v3, p1, Landroidx/compose/foundation/ClickableElement;->e:Ly1/g;

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/ClickableElement;->f:Lc9/a;

    iget-object p1, p1, Landroidx/compose/foundation/ClickableElement;->f:Lc9/a;

    invoke-static {v2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v1

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->b:Lx/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    invoke-static {v2, v0, v1}, Ll/q;->c(ZII)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Landroidx/compose/foundation/ClickableElement;->e:Ly1/g;

    if-eqz v3, :cond_1

    iget v2, v3, Ly1/g;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->f:Lc9/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final l()Ly0/n;
    .locals 7

    new-instance v6, Lu/c0;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->b:Lx/m;

    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    iget-object v3, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->e:Ly1/g;

    iget-object v5, p0, Landroidx/compose/foundation/ClickableElement;->f:Lc9/a;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lu/c0;-><init>(Lx/m;ZLjava/lang/String;Ly1/g;Lc9/a;)V

    return-object v6
.end method

.method public final m(Ly0/n;)V
    .locals 5

    check-cast p1, Lu/c0;

    iget-object v0, p1, Lu/c0;->w:Lx/m;

    iget-object v1, p0, Landroidx/compose/foundation/ClickableElement;->b:Lx/m;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lu/c0;->H0()V

    iput-object v1, p1, Lu/c0;->w:Lx/m;

    :cond_0
    iget-boolean v0, p1, Lu/c0;->x:Z

    iget-boolean v2, p0, Landroidx/compose/foundation/ClickableElement;->c:Z

    if-eq v0, v2, :cond_2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lu/c0;->H0()V

    :cond_1
    iput-boolean v2, p1, Lu/c0;->x:Z

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/ClickableElement;->f:Lc9/a;

    iput-object v0, p1, Lu/c0;->y:Lc9/a;

    iget-object v3, p1, Lu/c0;->A:Lu/g0;

    iput-boolean v2, v3, Lu/g0;->u:Z

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->d:Ljava/lang/String;

    iput-object v4, v3, Lu/g0;->v:Ljava/lang/String;

    iget-object v4, p0, Landroidx/compose/foundation/ClickableElement;->e:Ly1/g;

    iput-object v4, v3, Lu/g0;->w:Ly1/g;

    iput-object v0, v3, Lu/g0;->x:Lc9/a;

    const/4 v4, 0x0

    iput-object v4, v3, Lu/g0;->y:Ljava/lang/String;

    iput-object v4, v3, Lu/g0;->z:Lc9/a;

    iget-object p1, p1, Lu/c0;->B:Lu/e0;

    iput-boolean v2, p1, Lu/e;->w:Z

    iput-object v0, p1, Lu/e;->y:Lc9/a;

    iput-object v1, p1, Lu/e;->x:Lx/m;

    return-void
.end method
