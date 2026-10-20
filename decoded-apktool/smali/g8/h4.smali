.class public final Lg8/h4;
.super Le8/z0;


# instance fields
.field public final c:Le8/j0;

.field public d:Le8/x0;

.field public e:Le8/x;


# direct methods
.method public constructor <init>(Le8/j0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le8/x;->d:Le8/x;

    iput-object v0, p0, Lg8/h4;->e:Le8/x;

    const-string v0, "helper"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/h4;->c:Le8/j0;

    return-void
.end method


# virtual methods
.method public final a(Le8/w0;)Z
    .locals 6

    iget-object v0, p1, Le8/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v1, Le8/c2;->m:Le8/c2;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NameResolver returned no usable address. addrs="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", attrs="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Le8/w0;->b:Le8/c;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg8/h4;->c(Le8/c2;)V

    return v2

    :cond_0
    iget-object p1, p1, Le8/w0;->c:Ljava/lang/Object;

    instance-of v1, p1, Lg8/f4;

    if-eqz v1, :cond_1

    check-cast p1, Lg8/f4;

    iget-object p1, p1, Lg8/f4;->a:Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;Ljava/util/Random;)V

    move-object v0, p1

    :cond_1
    iget-object p1, p0, Lg8/h4;->d:Le8/x0;

    const/4 v1, 0x1

    if-nez p1, :cond_2

    sget-object p1, Le8/c;->b:Le8/c;

    const/4 v3, 0x2

    filled-new-array {v2, v3}, [I

    move-result-object v3

    const-class v4, Ljava/lang/Object;

    invoke-static {v4, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v1

    const-string v5, "addrs is empty"

    invoke-static {v5, v4}, Ly3/e;->G(Ljava/lang/String;Z)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v4, Le8/u0;

    invoke-direct {v4, v0, p1, v3, v2}, Le8/u0;-><init>(Ljava/util/List;Le8/c;[[Ljava/lang/Object;I)V

    iget-object p1, p0, Lg8/h4;->c:Le8/j0;

    invoke-virtual {p1, v4}, Le8/j0;->h(Le8/u0;)Le8/x0;

    move-result-object v0

    new-instance v2, Lg8/v2;

    invoke-direct {v2, p0, v0}, Lg8/v2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Le8/x0;->h(Le8/y0;)V

    iput-object v0, p0, Lg8/h4;->d:Le8/x0;

    sget-object v2, Le8/x;->a:Le8/x;

    new-instance v3, Lg8/g4;

    const/4 v4, 0x0

    invoke-static {v0, v4}, Le8/v0;->b(Le8/x0;Ln8/m;)Le8/v0;

    move-result-object v4

    invoke-direct {v3, v4}, Lg8/g4;-><init>(Le8/v0;)V

    iput-object v2, p0, Lg8/h4;->e:Le8/x;

    invoke-virtual {p1, v2, v3}, Le8/j0;->r(Le8/x;Lz6/a;)V

    invoke-virtual {v0}, Le8/x0;->f()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v0}, Le8/x0;->i(Ljava/util/List;)V

    :goto_0
    return v1
.end method

.method public final c(Le8/c2;)V
    .locals 2

    iget-object v0, p0, Lg8/h4;->d:Le8/x0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le8/x0;->g()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/h4;->d:Le8/x0;

    :cond_0
    sget-object v0, Le8/x;->c:Le8/x;

    new-instance v1, Lg8/g4;

    invoke-static {p1}, Le8/v0;->a(Le8/c2;)Le8/v0;

    move-result-object p1

    invoke-direct {v1, p1}, Lg8/g4;-><init>(Le8/v0;)V

    iput-object v0, p0, Lg8/h4;->e:Le8/x;

    iget-object p1, p0, Lg8/h4;->c:Le8/j0;

    invoke-virtual {p1, v0, v1}, Le8/j0;->r(Le8/x;Lz6/a;)V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lg8/h4;->d:Le8/x0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le8/x0;->f()V

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lg8/h4;->d:Le8/x0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le8/x0;->g()V

    :cond_0
    return-void
.end method
