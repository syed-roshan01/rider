.class public final Ln4/l;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ls4/j;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Ls4/j;

.field public final e:Lt4/f;

.field public final f:Li4/e;

.field public final g:Z


# direct methods
.method public constructor <init>(Ls4/j;Ljava/util/List;ILs4/j;Lt4/f;Li4/e;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/l;->a:Ls4/j;

    iput-object p2, p0, Ln4/l;->b:Ljava/util/List;

    iput p3, p0, Ln4/l;->c:I

    iput-object p4, p0, Ln4/l;->d:Ls4/j;

    iput-object p5, p0, Ln4/l;->e:Lt4/f;

    iput-object p6, p0, Ln4/l;->f:Li4/e;

    iput-boolean p7, p0, Ln4/l;->g:Z

    return-void
.end method


# virtual methods
.method public final a(Ls4/j;Ln4/j;)V
    .locals 4

    iget-object v0, p1, Ls4/j;->a:Landroid/content/Context;

    iget-object v1, p0, Ln4/l;->a:Ls4/j;

    iget-object v2, v1, Ls4/j;->a:Landroid/content/Context;

    const-string v3, "Interceptor \'"

    if-ne v0, v2, :cond_4

    sget-object v0, Ls4/l;->a:Ls4/l;

    iget-object v2, p1, Ls4/j;->b:Ljava/lang/Object;

    if-eq v2, v0, :cond_3

    iget-object v0, v1, Ls4/j;->c:Lu4/a;

    iget-object v2, p1, Ls4/j;->c:Lu4/a;

    if-ne v2, v0, :cond_2

    iget-object v0, v1, Ls4/j;->A:Landroidx/lifecycle/r;

    iget-object v2, p1, Ls4/j;->A:Landroidx/lifecycle/r;

    if-ne v2, v0, :cond_1

    iget-object v0, v1, Ls4/j;->B:Lt4/g;

    iget-object p1, p1, Ls4/j;->B:Lt4/g;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s lifecycle."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s target."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot set the request\'s data to null."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' cannot modify the request\'s context."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b(Ls4/j;Lu8/e;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Ln4/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ln4/k;

    iget v1, v0, Ln4/k;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln4/k;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln4/k;

    invoke-direct {v0, p0, p2}, Ln4/k;-><init>(Ln4/l;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Ln4/k;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Ln4/k;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ln4/k;->b:Ln4/j;

    iget-object v0, v0, Ln4/k;->a:Ln4/l;

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p2, p0, Ln4/l;->b:Ljava/util/List;

    iget v2, p0, Ln4/l;->c:I

    if-lez v2, :cond_3

    add-int/lit8 v4, v2, -0x1

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln4/j;

    invoke-virtual {p0, p1, v4}, Ln4/l;->a(Ls4/j;Ln4/j;)V

    :cond_3
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln4/j;

    add-int/lit8 v7, v2, 0x1

    iget-object v9, p0, Ln4/l;->e:Lt4/f;

    new-instance v2, Ln4/l;

    iget-object v5, p0, Ln4/l;->a:Ls4/j;

    iget-object v6, p0, Ln4/l;->b:Ljava/util/List;

    iget-object v10, p0, Ln4/l;->f:Li4/e;

    iget-boolean v11, p0, Ln4/l;->g:Z

    move-object v4, v2

    move-object v8, p1

    invoke-direct/range {v4 .. v11}, Ln4/l;-><init>(Ls4/j;Ljava/util/List;ILs4/j;Lt4/f;Li4/e;Z)V

    iput-object p0, v0, Ln4/k;->a:Ln4/l;

    iput-object p2, v0, Ln4/k;->b:Ln4/j;

    iput v3, v0, Ln4/k;->e:I

    move-object p1, p2

    check-cast p1, Ln4/i;

    invoke-virtual {p1, v2, v0}, Ln4/i;->d(Ln4/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_1
    check-cast p2, Ls4/k;

    invoke-virtual {p2}, Ls4/k;->b()Ls4/j;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ln4/l;->a(Ls4/j;Ln4/j;)V

    return-object p2
.end method
