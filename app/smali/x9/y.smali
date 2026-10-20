.class public final Lx9/y;
.super Ljava/lang/Object;


# instance fields
.field public a:Lx9/s;

.field public b:Ljava/lang/String;

.field public c:Lx9/p;

.field public d:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lx9/y;->d:Ljava/util/LinkedHashMap;

    const-string v0, "GET"

    iput-object v0, p0, Lx9/y;->b:Ljava/lang/String;

    new-instance v0, Lx9/p;

    invoke-direct {v0}, Lx9/p;-><init>()V

    iput-object v0, p0, Lx9/y;->c:Lx9/p;

    return-void
.end method


# virtual methods
.method public final a()Ll/r;
    .locals 7

    iget-object v1, p0, Lx9/y;->a:Lx9/s;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lx9/y;->b:Ljava/lang/String;

    iget-object v0, p0, Lx9/y;->c:Lx9/p;

    invoke-virtual {v0}, Lx9/p;->c()Lx9/q;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v0, p0, Lx9/y;->d:Ljava/util/LinkedHashMap;

    sget-object v5, Ly9/b;->a:[B

    const-string v5, "<this>"

    invoke-static {v0, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v0, Lr8/s;->a:Lr8/s;

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v5}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string v5, "{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }"

    invoke-static {v0, v5}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    new-instance v6, Ll/r;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/r;-><init>(Lx9/s;Ljava/lang/String;Lx9/q;Lx9/z;Ljava/util/Map;)V

    return-object v6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lx9/c;)V
    .locals 2

    const-string v0, "cacheControl"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx9/c;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "Cache-Control"

    if-nez v0, :cond_0

    iget-object p1, p0, Lx9/y;->c:Lx9/p;

    invoke-virtual {p1, v1}, Lx9/p;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1, p1}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx9/y;->c:Lx9/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lq8/k;->c(Ljava/lang/String;)V

    invoke-static {p2, p1}, Lq8/k;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lx9/p;->d(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lx9/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Lx9/z;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_3

    const-string p2, "method "

    const-string v0, "POST"

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const-string v0, "PUT"

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PATCH"

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PROPPATCH"

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "REPORT"

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iput-object p1, p0, Lx9/y;->b:Ljava/lang/String;

    return-void

    :cond_2
    const-string v0, " must have a request body."

    invoke-static {p2, p1, v0}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.isEmpty() == true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
