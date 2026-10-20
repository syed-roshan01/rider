.class public final Ll4/h;
.super Lja/m;


# instance fields
.field public final b:Lja/m;


# direct methods
.method public constructor <init>(Lja/t;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/h;->b:Lja/m;

    return-void
.end method


# virtual methods
.method public final a(Lja/x;)Lja/e0;
    .locals 1

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->a(Lja/x;)Lja/e0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lja/x;Lja/x;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1, p2}, Lja/m;->b(Lja/x;Lja/x;)V

    return-void
.end method

.method public final c(Lja/x;)V
    .locals 1

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->c(Lja/x;)V

    return-void
.end method

.method public final d(Lja/x;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->d(Lja/x;)V

    return-void
.end method

.method public final g(Lja/x;)Ljava/util/List;
    .locals 3

    const-string v0, "dir"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->g(Lja/x;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lja/x;

    const-string v2, "path"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_1

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    :cond_1
    return-object v0
.end method

.method public final i(Lja/x;)Lja/l;
    .locals 9

    const-string v0, "path"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->i(Lja/x;)Lja/l;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v3, p1, Lja/l;->c:Lja/x;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v1, p1, Lja/l;->a:Z

    iget-boolean v2, p1, Lja/l;->b:Z

    iget-object v4, p1, Lja/l;->d:Ljava/lang/Long;

    iget-object v5, p1, Lja/l;->e:Ljava/lang/Long;

    iget-object v6, p1, Lja/l;->f:Ljava/lang/Long;

    iget-object v7, p1, Lja/l;->g:Ljava/lang/Long;

    const-string v0, "extras"

    iget-object v8, p1, Lja/l;->h:Ljava/util/Map;

    invoke-static {v8, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lja/l;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lja/l;-><init>(ZZLja/x;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V

    :goto_0
    return-object p1
.end method

.method public final j(Lja/x;)Lja/s;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->j(Lja/x;)Lja/s;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lja/x;)Lja/e0;
    .locals 5

    invoke-virtual {p1}, Lja/x;->b()Lja/x;

    move-result-object v0

    iget-object v1, p0, Ll4/h;->b:Lja/m;

    if-eqz v0, :cond_2

    new-instance v2, Lr8/l;

    invoke-direct {v2}, Lr8/l;-><init>()V

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lja/m;->f(Lja/x;)Z

    move-result v3

    if-nez v3, :cond_1

    iget v3, v2, Lr8/l;->c:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Lr8/l;->n(I)V

    iget v3, v2, Lr8/l;->a:I

    if-nez v3, :cond_0

    iget-object v3, v2, Lr8/l;->b:[Ljava/lang/Object;

    const-string v4, "<this>"

    invoke-static {v3, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v3, v3

    nop

    :cond_0
    add-int/lit8 v3, v3, -0x1

    iput v3, v2, Lr8/l;->a:I

    iget-object v4, v2, Lr8/l;->b:[Ljava/lang/Object;

    aput-object v0, v4, v3

    iget v3, v2, Lr8/l;->c:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lr8/l;->c:I

    invoke-virtual {v0}, Lja/x;->b()Lja/x;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lja/x;

    const-string v3, "dir"

    invoke-static {v2, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lja/m;->c(Lja/x;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p1}, Lja/m;->k(Lja/x;)Lja/e0;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lja/x;)Lja/g0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, p1}, Lja/m;->l(Lja/x;)Lja/g0;

    move-result-object p1

    return-object p1
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Ll4/h;

    invoke-static {v1}, Ld9/v;->a(Ljava/lang/Class;)Ld9/e;

    move-result-object v1

    invoke-virtual {v1}, Ld9/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll4/h;->b:Lja/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ll4/h;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
