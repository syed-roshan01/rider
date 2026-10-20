.class public final Le8/c2;
.super Ljava/lang/Object;


# static fields
.field public static final d:Ljava/util/List;

.field public static final e:Le8/c2;

.field public static final f:Le8/c2;

.field public static final g:Le8/c2;

.field public static final h:Le8/c2;

.field public static final i:Le8/c2;

.field public static final j:Le8/c2;

.field public static final k:Le8/c2;

.field public static final l:Le8/c2;

.field public static final m:Le8/c2;

.field public static final n:Le8/j1;

.field public static final o:Le8/j1;


# instance fields
.field public final a:Le8/z1;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v0, "io.grpc.Status.failOnEqualsForTest"

    const-string v1, "false"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-static {}, Le8/z1;->values()[Le8/z1;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    iget v6, v5, Le8/z1;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Le8/c2;

    const/4 v8, 0x0

    invoke-direct {v7, v5, v8, v8}, Le8/c2;-><init>(Le8/z1;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le8/c2;

    if-nez v6, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Code value duplication between "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v6, Le8/c2;->a:Le8/z1;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " & "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le8/c2;->d:Ljava/util/List;

    sget-object v0, Le8/z1;->c:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->e:Le8/c2;

    sget-object v0, Le8/z1;->d:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->f:Le8/c2;

    sget-object v0, Le8/z1;->e:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->g:Le8/c2;

    sget-object v0, Le8/z1;->f:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->n:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->h:Le8/c2;

    sget-object v0, Le8/z1;->o:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->p:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->q:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->i:Le8/c2;

    sget-object v0, Le8/z1;->z:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->j:Le8/c2;

    sget-object v0, Le8/z1;->r:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->k:Le8/c2;

    sget-object v0, Le8/z1;->s:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->t:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->u:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->v:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    sget-object v0, Le8/z1;->w:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->l:Le8/c2;

    sget-object v0, Le8/z1;->x:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    move-result-object v0

    sput-object v0, Le8/c2;->m:Le8/c2;

    sget-object v0, Le8/z1;->y:Le8/z1;

    invoke-virtual {v0}, Le8/z1;->a()Le8/c2;

    new-instance v0, Le8/a2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Le8/j1;

    const-string v2, "grpc-status"

    invoke-direct {v1, v2, v3, v0}, Le8/j1;-><init>(Ljava/lang/String;ZLe8/k1;)V

    sput-object v1, Le8/c2;->n:Le8/j1;

    new-instance v0, Le8/b2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Le8/j1;

    const-string v2, "grpc-message"

    invoke-direct {v1, v2, v3, v0}, Le8/j1;-><init>(Ljava/lang/String;ZLe8/k1;)V

    sput-object v1, Le8/c2;->o:Le8/j1;

    return-void
.end method

.method public constructor <init>(Le8/z1;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "code"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Le8/c2;->a:Le8/z1;

    iput-object p2, p0, Le8/c2;->b:Ljava/lang/String;

    iput-object p3, p0, Le8/c2;->c:Ljava/lang/Throwable;

    return-void
.end method

.method public static b(Le8/c2;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Le8/c2;->b:Ljava/lang/String;

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le8/c2;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(I)Le8/c2;
    .locals 2

    if-ltz p0, :cond_1

    sget-object v0, Le8/c2;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lt p0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le8/c2;

    return-object p0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown code "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Le8/c2;->g:Le8/c2;

    invoke-virtual {v0, p0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/Throwable;)Le8/c2;
    .locals 2

    const-string v0, "t"

    invoke-static {p0, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_2

    instance-of v1, v0, Le8/d2;

    if-eqz v1, :cond_0

    check-cast v0, Le8/d2;

    iget-object p0, v0, Le8/d2;->a:Le8/c2;

    return-object p0

    :cond_0
    instance-of v1, v0, Le8/e2;

    if-eqz v1, :cond_1

    check-cast v0, Le8/e2;

    iget-object p0, v0, Le8/e2;->a:Le8/c2;

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v0, Le8/c2;->g:Le8/c2;

    invoke-virtual {v0, p0}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Le8/c2;
    .locals 5

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Le8/c2;->c:Ljava/lang/Throwable;

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    iget-object v2, p0, Le8/c2;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    new-instance v2, Le8/c2;

    invoke-direct {v2, v1, p1, v0}, Le8/c2;-><init>(Le8/z1;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :cond_1
    new-instance v3, Le8/c2;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v1, p1, v0}, Le8/c2;-><init>(Le8/z1;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v3
.end method

.method public final e()Z
    .locals 2

    sget-object v0, Le8/z1;->c:Le8/z1;

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Throwable;)Le8/c2;
    .locals 3

    iget-object v0, p0, Le8/c2;->c:Ljava/lang/Throwable;

    invoke-static {v0, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Le8/c2;

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    iget-object v2, p0, Le8/c2;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Le8/c2;-><init>(Le8/z1;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Le8/c2;
    .locals 3

    iget-object v0, p0, Le8/c2;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Le8/c2;

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    iget-object v2, p0, Le8/c2;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Le8/c2;-><init>(Le8/z1;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Le8/c2;->a:Le8/z1;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "description"

    iget-object v2, p0, Le8/c2;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Le8/c2;->c:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    sget-object v2, Lq6/q;->a:Ljava/lang/Object;

    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    new-instance v3, Ljava/io/PrintWriter;

    invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v2, "cause"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
