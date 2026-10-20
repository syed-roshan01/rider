.class public final Lca/a;
.super Ljava/lang/Object;

# interfaces
.implements Lx9/t;


# instance fields
.field public final a:Lx9/k;


# direct methods
.method public constructor <init>(Lx9/n;)V
    .locals 1

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/a;->a:Lx9/k;

    return-void
.end method


# virtual methods
.method public final a(Lca/f;)Lx9/b0;
    .locals 10

    iget-object v0, p1, Lca/f;->e:Ll/r;

    invoke-virtual {v0}, Ll/r;->h()Lx9/y;

    move-result-object v1

    iget-object v2, v0, Ll/r;->e:Ljava/lang/Object;

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    const-string v5, "Content-Length"

    iget-object v6, v0, Ll/r;->d:Ljava/lang/Object;

    check-cast v6, Lx9/q;

    const-string v7, "Host"

    invoke-virtual {v6, v7}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_0

    iget-object v6, v0, Ll/r;->b:Ljava/lang/Object;

    check-cast v6, Lx9/s;

    invoke-static {v6, v2}, Ly9/b;->t(Lx9/s;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v7, v6}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v6, v0, Ll/r;->d:Ljava/lang/Object;

    check-cast v6, Lx9/q;

    const-string v7, "Connection"

    invoke-virtual {v6, v7}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    const-string v6, "Keep-Alive"

    invoke-virtual {v1, v7, v6}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v6, v0, Ll/r;->d:Ljava/lang/Object;

    check-cast v6, Lx9/q;

    const-string v7, "Accept-Encoding"

    invoke-virtual {v6, v7}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "gzip"

    if-nez v6, :cond_2

    iget-object v6, v0, Ll/r;->d:Ljava/lang/Object;

    check-cast v6, Lx9/q;

    const-string v9, "Range"

    invoke-virtual {v6, v9}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    invoke-virtual {v1, v7, v8}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    :cond_2
    iget-object v6, v0, Ll/r;->b:Ljava/lang/Object;

    check-cast v6, Lx9/s;

    iget-object v7, p0, Lca/a;->a:Lx9/k;

    move-object v9, v7

    check-cast v9, Lx9/n;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "url"

    invoke-static {v6, v9}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Ll/r;->d:Ljava/lang/Object;

    check-cast v6, Lx9/q;

    const-string v9, "User-Agent"

    invoke-virtual {v6, v9}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v6, "okhttp/4.12.0"

    invoke-virtual {v1, v9, v6}, Lx9/y;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Lx9/y;->a()Ll/r;

    move-result-object v1

    invoke-virtual {p1, v1}, Lca/f;->b(Ll/r;)Lx9/b0;

    move-result-object p1

    iget-object v1, v0, Ll/r;->b:Ljava/lang/Object;

    check-cast v1, Lx9/s;

    iget-object v6, p1, Lx9/b0;->f:Lx9/q;

    invoke-static {v7, v1, v6}, Lca/e;->b(Lx9/k;Lx9/s;Lx9/q;)V

    invoke-virtual {p1}, Lx9/b0;->e()Lx9/a0;

    move-result-object v1

    iput-object v0, v1, Lx9/a0;->a:Ll/r;

    if-eqz v2, :cond_4

    const-string v0, "Content-Encoding"

    invoke-static {p1, v0}, Lx9/b0;->b(Lx9/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p1}, Lca/e;->a(Lx9/b0;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p1, Lx9/b0;->n:Lk4/o;

    if-eqz v2, :cond_4

    new-instance v7, Lja/q;

    check-cast v2, Lx9/c0;

    iget-object v2, v2, Lx9/c0;->c:Lja/i;

    invoke-direct {v7, v2}, Lja/q;-><init>(Lja/g0;)V

    invoke-virtual {v6}, Lx9/q;->k()Lx9/p;

    move-result-object v2

    invoke-virtual {v2, v0}, Lx9/p;->d(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lx9/p;->d(Ljava/lang/String;)V

    invoke-virtual {v2}, Lx9/p;->c()Lx9/q;

    move-result-object v0

    invoke-virtual {v0}, Lx9/q;->k()Lx9/p;

    move-result-object v0

    iput-object v0, v1, Lx9/a0;->f:Lx9/p;

    const-string v0, "Content-Type"

    invoke-static {p1, v0}, Lx9/b0;->b(Lx9/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lx9/c0;

    invoke-static {v7}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v2

    invoke-direct {v0, p1, v3, v4, v2}, Lx9/c0;-><init>(Ljava/lang/String;JLja/a0;)V

    iput-object v0, v1, Lx9/a0;->g:Lk4/o;

    :cond_4
    invoke-virtual {v1}, Lx9/a0;->a()Lx9/b0;

    move-result-object p1

    return-object p1
.end method
