.class public final Ln0/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lm0/q;

.field public b:Ln0/a;

.field public c:Z

.field public final d:Lm0/t0;

.field public e:Z

.field public f:I

.field public g:I

.field public final h:Lm0/k3;

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>(Lm0/q;Ln0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/b;->a:Lm0/q;

    iput-object p2, p0, Ln0/b;->b:Ln0/a;

    new-instance p1, Lm0/t0;

    invoke-direct {p1}, Lm0/t0;-><init>()V

    iput-object p1, p0, Ln0/b;->d:Lm0/t0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln0/b;->e:Z

    new-instance p1, Lm0/k3;

    invoke-direct {p1}, Lm0/k3;-><init>()V

    iput-object p1, p0, Ln0/b;->h:Lm0/k3;

    const/4 p1, -0x1

    iput p1, p0, Ln0/b;->i:I

    iput p1, p0, Ln0/b;->j:I

    iput p1, p0, Ln0/b;->k:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Lu0/c;)V
    .locals 11

    iget-object v0, p0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_7

    sget-object v1, Ln0/f;->c:Ln0/f;

    iget-object v0, v0, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v0, v1}, Ln0/i0;->h(Ln0/g0;)V

    invoke-static {v0, v2, p1}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p2}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    iget p2, v0, Ln0/i0;->g:I

    iget v3, v1, Ln0/g0;->a:I

    invoke-static {v0, v3}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v4

    iget v5, v1, Ln0/g0;->b:I

    if-ne p2, v4, :cond_0

    iget p2, v0, Ln0/i0;->h:I

    invoke-static {v0, v5}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v4

    if-ne p2, v4, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, p1

    move v6, v4

    :goto_0
    const-string v7, ", "

    if-ge v4, v3, :cond_3

    shl-int v8, v2, v4

    iget v9, v0, Ln0/i0;->g:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_2

    if-lez v6, :cond_1

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v1, v4}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v3, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p2, v3}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move v8, p1

    :goto_1
    if-ge p1, v5, :cond_6

    shl-int v9, v2, p1

    iget v10, v0, Ln0/i0;->h:I

    and-int/2addr v9, v10

    if-eqz v9, :cond_5

    if-lez v6, :cond_4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1, p1}, Ln0/f;->c(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    :cond_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error while pushing "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Not all arguments were provided. Missing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " int arguments ("

    const-string v2, ") and "

    invoke-static {v0, v6, v1, p2, v2}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, " object arguments ("

    const-string v1, ")."

    invoke-static {v0, v8, p2, p1, v1}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    :goto_2
    return-void
.end method

.method public final b(Lm0/b1;Lm0/u;Lm0/c1;Lm0/c1;)V
    .locals 9

    iget-object v0, p0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ln0/g;->c:Ln0/g;

    iget-object v0, v0, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v0, v1}, Ln0/i0;->h(Ln0/g0;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, p1}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p2}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    const/4 p2, 0x3

    invoke-static {v0, p2, p4}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    const/4 p2, 0x2

    invoke-static {v0, p2, p3}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    iget p2, v0, Ln0/i0;->g:I

    iget p3, v1, Ln0/g0;->a:I

    invoke-static {v0, p3}, Ln0/i0;->a(Ln0/i0;I)I

    move-result p4

    iget v3, v1, Ln0/g0;->b:I

    if-ne p2, p4, :cond_0

    iget p2, v0, Ln0/i0;->h:I

    invoke-static {v0, v3}, Ln0/i0;->a(Ln0/i0;I)I

    move-result p4

    if-ne p2, p4, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    move p4, v2

    move v4, p4

    :goto_0
    const-string v5, ", "

    if-ge p4, p3, :cond_3

    shl-int v6, p1, p4

    iget v7, v0, Ln0/i0;->g:I

    and-int/2addr v6, v7

    if-eqz v6, :cond_2

    if-lez v4, :cond_1

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v1, p4}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    :cond_2
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p2, p3}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    move v6, v2

    :goto_1
    if-ge v2, v3, :cond_6

    shl-int v7, p1, v2

    iget v8, v0, Ln0/i0;->h:I

    and-int/2addr v7, v8

    if-eqz v7, :cond_5

    if-lez v4, :cond_4

    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1, v2}, Ln0/g;->c(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Error while pushing "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ". Not all arguments were provided. Missing "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " int arguments ("

    const-string v0, ") and "

    invoke-static {p3, v4, p4, p2, v0}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, " object arguments ("

    const-string p4, ")."

    invoke-static {p3, v6, p2, p1, p4}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c(Lu0/c;Lm0/c;)V
    .locals 11

    invoke-virtual {p0}, Ln0/b;->f()V

    iget-object v0, p0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ln0/i;->c:Ln0/i;

    iget-object v0, v0, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v0, v1}, Ln0/i0;->h(Ln0/g0;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, p1}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p2}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    iget p2, v0, Ln0/i0;->g:I

    iget v3, v1, Ln0/g0;->a:I

    invoke-static {v0, v3}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v4

    iget v5, v1, Ln0/g0;->b:I

    if-ne p2, v4, :cond_0

    iget p2, v0, Ln0/i0;->h:I

    invoke-static {v0, v5}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v4

    if-ne p2, v4, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v2

    move v6, v4

    :goto_0
    const-string v7, ", "

    if-ge v4, v3, :cond_3

    shl-int v8, p1, v4

    iget v9, v0, Ln0/i0;->g:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_2

    if-lez v6, :cond_1

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v1, v4}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v3, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p2, v3}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move v8, v2

    :goto_1
    if-ge v2, v5, :cond_6

    shl-int v9, p1, v2

    iget v10, v0, Ln0/i0;->h:I

    and-int/2addr v9, v10

    if-eqz v9, :cond_5

    if-lez v6, :cond_4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1, v2}, Ln0/i;->c(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error while pushing "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Not all arguments were provided. Missing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " int arguments ("

    const-string v2, ") and "

    invoke-static {v0, v6, v1, p2, v2}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, " object arguments ("

    const-string v1, ")."

    invoke-static {v0, v8, p2, p1, v1}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final d(Ln0/a;Lu0/c;)V
    .locals 11

    iget-object v0, p0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v1}, Ln0/i0;->e()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Ln0/e;->c:Ln0/e;

    iget-object v0, v0, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v0, v1}, Ln0/i0;->h(Ln0/g0;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, p1}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p2}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    iget p2, v0, Ln0/i0;->g:I

    iget v3, v1, Ln0/g0;->a:I

    invoke-static {v0, v3}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v4

    iget v5, v1, Ln0/g0;->b:I

    if-ne p2, v4, :cond_0

    iget p2, v0, Ln0/i0;->h:I

    invoke-static {v0, v5}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v4

    if-ne p2, v4, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v2

    move v6, v4

    :goto_0
    const-string v7, ", "

    if-ge v4, v3, :cond_3

    shl-int v8, p1, v4

    iget v9, v0, Ln0/i0;->g:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_2

    if-lez v6, :cond_1

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v1, v4}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v3, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p2, v3}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move v8, v2

    :goto_1
    if-ge v2, v5, :cond_6

    shl-int v9, p1, v2

    iget v10, v0, Ln0/i0;->h:I

    and-int/2addr v9, v10

    if-eqz v9, :cond_5

    if-lez v6, :cond_4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1, v2}, Ln0/e;->c(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error while pushing "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Not all arguments were provided. Missing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " int arguments ("

    const-string v2, ") and "

    invoke-static {v0, v6, v1, p2, v2}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, " object arguments ("

    const-string v1, ")."

    invoke-static {v0, v8, p2, p1, v1}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    :goto_2
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ln0/b;->h:Lm0/k3;

    iget-object v1, v0, Lm0/k3;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lm0/k3;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget v0, p0, Ln0/b;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ln0/b;->g:I

    :goto_0
    return-void
.end method

.method public final f()V
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Ln0/b;->g:I

    const-string v2, ")."

    const-string v3, " object arguments ("

    const-string v4, ") and "

    const-string v5, " int arguments ("

    const-string v6, ". Not all arguments were provided. Missing "

    const-string v7, "Error while pushing "

    const-string v8, "StringBuilder().apply(builderAction).toString()"

    const-string v9, ", "

    const/4 v10, 0x0

    if-lez v1, :cond_7

    iget-object v12, v0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Ln0/e0;->c:Ln0/e0;

    iget-object v12, v12, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v12, v13}, Ln0/i0;->h(Ln0/g0;)V

    invoke-static {v12, v10, v1}, Lf6/a;->f0(Ln0/i0;II)V

    iget v1, v12, Ln0/i0;->g:I

    iget v14, v13, Ln0/g0;->a:I

    invoke-static {v12, v14}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v15

    iget v11, v13, Ln0/g0;->b:I

    if-ne v1, v15, :cond_0

    iget v1, v12, Ln0/i0;->h:I

    invoke-static {v12, v11}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v15

    if-ne v1, v15, :cond_0

    iput v10, v0, Ln0/b;->g:I

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move v15, v10

    :goto_0
    if-ge v15, v14, :cond_3

    const/16 v16, 0x1

    shl-int v18, v16, v15

    move/from16 v19, v14

    iget v14, v12, Ln0/i0;->g:I

    and-int v14, v18, v14

    if-eqz v14, :cond_2

    if-lez v10, :cond_1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v13, v15}, Ln0/e0;->b(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    :cond_2
    add-int/lit8 v15, v15, 0x1

    move/from16 v14, v19

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const/4 v0, 0x0

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v11, :cond_6

    const/16 v16, 0x1

    shl-int v17, v16, v15

    move/from16 v18, v11

    iget v11, v12, Ln0/i0;->h:I

    and-int v11, v17, v11

    if-eqz v11, :cond_5

    if-lez v10, :cond_4

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v13, v15}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    :cond_5
    add-int/lit8 v15, v15, 0x1

    move/from16 v11, v18

    goto :goto_1

    :cond_6
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v8}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v10, v5, v1, v4}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8, v0, v3, v9, v2}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    move-object/from16 v0, p0

    :goto_2
    iget-object v1, v0, Ln0/b;->h:Lm0/k3;

    iget-object v10, v1, Lm0/k3;->a:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    const/4 v11, 0x1

    xor-int/2addr v10, v11

    if-eqz v10, :cond_12

    iget-object v10, v0, Ln0/b;->b:Ln0/a;

    iget-object v1, v1, Lm0/k3;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v11

    new-array v12, v11, [Ljava/lang/Object;

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v11, :cond_8

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    aput-object v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v11, :cond_9

    const/4 v11, 0x1

    const/16 v16, 0x1

    goto :goto_4

    :cond_9
    const/4 v11, 0x1

    const/16 v16, 0x0

    :goto_4
    xor-int/lit8 v13, v16, 0x1

    if-eqz v13, :cond_11

    sget-object v11, Ln0/j;->c:Ln0/j;

    iget-object v10, v10, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v10, v11}, Ln0/i0;->h(Ln0/g0;)V

    const/4 v13, 0x0

    invoke-static {v10, v13, v12}, Lf6/a;->g0(Ln0/i0;ILjava/lang/Object;)V

    iget v12, v10, Ln0/i0;->g:I

    iget v14, v11, Ln0/g0;->a:I

    invoke-static {v10, v14}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v15

    iget v13, v11, Ln0/g0;->b:I

    if-ne v12, v15, :cond_a

    iget v12, v10, Ln0/i0;->h:I

    invoke-static {v10, v13}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v15

    if-ne v12, v15, :cond_a

    goto/16 :goto_7

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_5
    if-ge v12, v14, :cond_d

    const/16 v16, 0x1

    shl-int v18, v16, v12

    iget v0, v10, Ln0/i0;->g:I

    and-int v0, v18, v0

    if-eqz v0, :cond_c

    if-lez v15, :cond_b

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    invoke-virtual {v11, v12}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v15, v15, 0x1

    :cond_c
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_6
    if-ge v12, v13, :cond_10

    const/16 v16, 0x1

    shl-int v17, v16, v12

    move/from16 v18, v13

    iget v13, v10, Ln0/i0;->h:I

    and-int v13, v17, v13

    if-eqz v13, :cond_f

    if-lez v15, :cond_e

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    invoke-virtual {v11, v12}, Ln0/j;->c(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v14, v14, 0x1

    :cond_f
    add-int/lit8 v12, v12, 0x1

    move/from16 v13, v18

    goto :goto_6

    :cond_10
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8, v15, v5, v0, v4}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8, v14, v3, v1, v2}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    :goto_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_12
    return-void
.end method

.method public final g()V
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Ln0/b;->l:I

    if-lez v1, :cond_f

    iget v2, v0, Ln0/b;->i:I

    const-string v3, ")."

    const-string v4, " object arguments ("

    const-string v5, ") and "

    const-string v6, " int arguments ("

    const-string v7, ". Not all arguments were provided. Missing "

    const-string v8, "Error while pushing "

    const-string v9, "StringBuilder().apply(builderAction).toString()"

    const-string v10, ", "

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-ltz v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Ln0/b;->f()V

    iget-object v14, v0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, Ln0/x;->c:Ln0/x;

    iget-object v14, v14, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v14, v15}, Ln0/i0;->h(Ln0/g0;)V

    invoke-static {v14, v12, v2}, Lf6/a;->f0(Ln0/i0;II)V

    invoke-static {v14, v13, v1}, Lf6/a;->f0(Ln0/i0;II)V

    iget v1, v14, Ln0/i0;->g:I

    iget v2, v15, Ln0/g0;->a:I

    invoke-static {v14, v2}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v12

    iget v13, v15, Ln0/g0;->b:I

    if-ne v1, v12, :cond_0

    iget v1, v14, Ln0/i0;->h:I

    invoke-static {v14, v13}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v12

    if-ne v1, v12, :cond_0

    iput v11, v0, Ln0/b;->i:I

    :goto_0
    const/4 v1, 0x0

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v11, v2, :cond_3

    const/16 v17, 0x1

    shl-int v18, v17, v11

    move/from16 v19, v2

    iget v2, v14, Ln0/i0;->g:I

    and-int v2, v18, v2

    if-eqz v2, :cond_2

    if-lez v12, :cond_1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v15, v11}, Ln0/x;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    :cond_2
    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v19

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v13, :cond_6

    const/16 v16, 0x1

    shl-int v18, v16, v11

    move/from16 v19, v13

    iget v13, v14, Ln0/i0;->h:I

    and-int v13, v18, v13

    if-eqz v13, :cond_5

    if-lez v12, :cond_4

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v15, v11}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    :cond_5
    add-int/lit8 v11, v11, 0x1

    move/from16 v13, v19

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v12, v6, v1, v5}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9, v0, v4, v2, v3}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget v2, v0, Ln0/b;->k:I

    iget v12, v0, Ln0/b;->j:I

    invoke-virtual/range {p0 .. p0}, Ln0/b;->f()V

    iget-object v13, v0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Ln0/t;->c:Ln0/t;

    iget-object v13, v13, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v13, v14}, Ln0/i0;->h(Ln0/g0;)V

    const/4 v15, 0x1

    invoke-static {v13, v15, v2}, Lf6/a;->f0(Ln0/i0;II)V

    const/4 v2, 0x0

    invoke-static {v13, v2, v12}, Lf6/a;->f0(Ln0/i0;II)V

    const/4 v2, 0x2

    invoke-static {v13, v2, v1}, Lf6/a;->f0(Ln0/i0;II)V

    iget v1, v13, Ln0/i0;->g:I

    iget v2, v14, Ln0/g0;->a:I

    invoke-static {v13, v2}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v12

    iget v15, v14, Ln0/g0;->b:I

    if-ne v1, v12, :cond_8

    iget v1, v13, Ln0/i0;->h:I

    invoke-static {v13, v15}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v12

    if-ne v1, v12, :cond_8

    iput v11, v0, Ln0/b;->j:I

    iput v11, v0, Ln0/b;->k:I

    goto/16 :goto_0

    :goto_3
    iput v1, v0, Ln0/b;->l:I

    goto/16 :goto_6

    :cond_8
    const/4 v1, 0x0

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    move v12, v1

    :goto_4
    if-ge v12, v2, :cond_b

    const/16 v17, 0x1

    shl-int v18, v17, v12

    iget v0, v13, Ln0/i0;->g:I

    and-int v0, v18, v0

    if-eqz v0, :cond_a

    if-lez v1, :cond_9

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {v14, v12}, Ln0/t;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    :cond_a
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    goto :goto_4

    :cond_b
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v15, :cond_e

    const/16 v16, 0x1

    shl-int v17, v16, v12

    move/from16 v18, v15

    iget v15, v13, Ln0/i0;->h:I

    and-int v15, v17, v15

    if-eqz v15, :cond_d

    if-lez v1, :cond_c

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    invoke-virtual {v14, v12}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    :cond_d
    add-int/lit8 v12, v12, 0x1

    move/from16 v15, v18

    goto :goto_5

    :cond_e
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v1, v6, v0, v5}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9, v11, v4, v2, v3}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    :goto_6
    return-void
.end method

.method public final h(Z)V
    .locals 12

    iget-object v0, p0, Ln0/b;->a:Lm0/q;

    if-eqz p1, :cond_0

    iget-object p1, v0, Lm0/q;->F:Lm0/m2;

    iget p1, p1, Lm0/m2;->i:I

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lm0/q;->F:Lm0/m2;

    iget p1, p1, Lm0/m2;->g:I

    :goto_0
    iget v0, p0, Ln0/b;->f:I

    sub-int v0, p1, v0

    if-ltz v0, :cond_9

    if-lez v0, :cond_8

    iget-object v1, p0, Ln0/b;->b:Ln0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ln0/d;->c:Ln0/d;

    iget-object v1, v1, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v1, v2}, Ln0/i0;->h(Ln0/g0;)V

    const/4 v3, 0x0

    invoke-static {v1, v3, v0}, Lf6/a;->f0(Ln0/i0;II)V

    iget v0, v1, Ln0/i0;->g:I

    iget v4, v2, Ln0/g0;->a:I

    invoke-static {v1, v4}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v5

    iget v6, v2, Ln0/g0;->b:I

    if-ne v0, v5, :cond_1

    iget v0, v1, Ln0/i0;->h:I

    invoke-static {v1, v6}, Ln0/i0;->a(Ln0/i0;I)I

    move-result v5

    if-ne v0, v5, :cond_1

    iput p1, p0, Ln0/b;->f:I

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    move v0, v3

    move v5, v0

    :goto_1
    const/4 v7, 0x1

    const-string v8, ", "

    if-ge v0, v4, :cond_4

    shl-int/2addr v7, v0

    iget v9, v1, Ln0/i0;->g:I

    and-int/2addr v7, v9

    if-eqz v7, :cond_3

    if-lez v5, :cond_2

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v2, v0}, Ln0/d;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Ll/q;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move v9, v3

    :goto_2
    if-ge v3, v6, :cond_7

    shl-int v10, v7, v3

    iget v11, v1, Ln0/i0;->h:I

    and-int/2addr v10, v11

    if-eqz v10, :cond_6

    if-lez v5, :cond_5

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v2, v3}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v9, v9, 0x1

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Error while pushing "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ". Not all arguments were provided. Missing "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " int arguments ("

    const-string v3, ") and "

    invoke-static {v0, v5, v2, p1, v3}, Ll/q;->t(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, " object arguments ("

    const-string v2, ")."

    invoke-static {v0, v9, p1, v1, v2}, Ll/q;->m(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_3
    return-void

    :cond_9
    const-string p1, "Tried to seek backward"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(II)V
    .locals 1

    if-lez p2, :cond_2

    if-ltz p1, :cond_1

    iget v0, p0, Ln0/b;->i:I

    if-ne v0, p1, :cond_0

    iget p1, p0, Ln0/b;->l:I

    add-int/2addr p1, p2

    iput p1, p0, Ln0/b;->l:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ln0/b;->g()V

    iput p1, p0, Ln0/b;->i:I

    iput p2, p0, Ln0/b;->l:I

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid remove index "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method
