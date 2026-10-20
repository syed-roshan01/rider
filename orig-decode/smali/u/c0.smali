.class public final Lu/c0;
.super Lt1/o;

# interfaces
.implements Lt1/p1;
.implements Lm1/c;


# instance fields
.field public final A:Lu/g0;

.field public final B:Lu/e0;

.field public w:Lx/m;

.field public x:Z

.field public y:Lc9/a;

.field public final z:Lu/a;


# direct methods
.method public constructor <init>(Lx/m;ZLjava/lang/String;Ly1/g;Lc9/a;)V
    .locals 2

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput-object p1, p0, Lu/c0;->w:Lx/m;

    iput-boolean p2, p0, Lu/c0;->x:Z

    iput-object p5, p0, Lu/c0;->y:Lc9/a;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    iput-object v0, p0, Lu/c0;->z:Lu/a;

    new-instance v1, Lu/g0;

    invoke-direct {v1}, Ly0/n;-><init>()V

    iput-boolean p2, v1, Lu/g0;->u:Z

    iput-object p3, v1, Lu/g0;->v:Ljava/lang/String;

    iput-object p4, v1, Lu/g0;->w:Ly1/g;

    iput-object p5, v1, Lu/g0;->x:Lc9/a;

    const/4 p3, 0x0

    iput-object p3, v1, Lu/g0;->y:Ljava/lang/String;

    iput-object p3, v1, Lu/g0;->z:Lc9/a;

    invoke-virtual {p0, v1}, Lt1/o;->G0(Ly0/n;)V

    iput-object v1, p0, Lu/c0;->A:Lu/g0;

    new-instance p3, Lu/e0;

    invoke-direct {p3, p2, p1, p5, v0}, Lu/e;-><init>(ZLx/m;Lc9/a;Lu/a;)V

    invoke-virtual {p0, p3}, Lt1/o;->G0(Ly0/n;)V

    iput-object p3, p0, Lu/c0;->B:Lu/e0;

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 0

    invoke-virtual {p0}, Lu/c0;->H0()V

    return-void
.end method

.method public final H0()V
    .locals 6

    iget-object v0, p0, Lu/c0;->z:Lu/a;

    iget-object v1, v0, Lu/a;->b:Lx/o;

    if-eqz v1, :cond_0

    new-instance v2, Lx/n;

    invoke-direct {v2, v1}, Lx/n;-><init>(Lx/o;)V

    iget-object v1, p0, Lu/c0;->w:Lx/m;

    invoke-virtual {v1, v2}, Lx/m;->b(Lx/k;)V

    :cond_0
    iget-object v1, v0, Lu/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx/o;

    iget-object v4, p0, Lu/c0;->w:Lx/m;

    new-instance v5, Lx/n;

    invoke-direct {v5, v3}, Lx/n;-><init>(Lx/o;)V

    invoke-virtual {v4, v5}, Lx/m;->b(Lx/k;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    iput-object v2, v0, Lu/a;->b:Lx/o;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    return-void
.end method

.method public final M(Landroid/view/KeyEvent;)Z
    .locals 9

    iget-boolean v0, p0, Lu/c0;->x:Z

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Lu/c0;->z:Lu/a;

    if-eqz v0, :cond_0

    sget v0, Lu/h0;->b:I

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result v0

    const/4 v6, 0x2

    invoke-static {v0, v6}, Lz6/a;->B(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lu/h0;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v5, Lu/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v6

    invoke-static {v6}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v6

    new-instance v8, Lm1/a;

    invoke-direct {v8, v6, v7}, Lm1/a;-><init>(J)V

    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lx/o;

    iget-wide v6, v5, Lu/a;->c:J

    invoke-direct {v0, v6, v7}, Lx/o;-><init>(J)V

    iget-object v5, v5, Lu/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v6

    new-instance p1, Lm1/a;

    invoke-direct {p1, v6, v7}, Lm1/a;-><init>(J)V

    invoke-interface {v5, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object p1

    new-instance v5, Lu/b;

    invoke-direct {v5, p0, v0, v2}, Lu/b;-><init>(Lu/c0;Lx/o;Lu8/e;)V

    invoke-static {p1, v2, v3, v5, v1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :goto_0
    move v3, v4

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lu/c0;->x:Z

    if-eqz v0, :cond_2

    sget v0, Lu/h0;->b:I

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result v0

    invoke-static {v0, v4}, Lz6/a;->B(II)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lu/h0;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v5, Lu/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v5

    new-instance p1, Lm1/a;

    invoke-direct {p1, v5, v6}, Lm1/a;-><init>(J)V

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx/o;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object v0

    new-instance v5, Lu/c;

    invoke-direct {v5, p0, p1, v2}, Lu/c;-><init>(Lu/c0;Lx/o;Lu8/e;)V

    invoke-static {v0, v2, v3, v5, v1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_1
    iget-object p1, p0, Lu/c0;->y:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_2
    :goto_1
    return v3
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Lu/c0;->B:Lu/e0;

    invoke-virtual {v0}, Lu/e;->b0()V

    return-void
.end method

.method public final bridge synthetic l(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 1

    iget-object v0, p0, Lu/c0;->B:Lu/e0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu/e;->y(Lo1/k;Lo1/l;J)V

    return-void
.end method
