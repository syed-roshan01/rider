.class public final Lw3/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lx3/c;


# direct methods
.method public constructor <init>(Lx3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/d;->a:Lx3/c;

    return-void
.end method


# virtual methods
.method public a(Lx3/a;)Lu6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            ")",
            "Lu6/b;"
        }
    .end annotation

    const-string v0, "deletionRequest"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public b()Lu6/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lu6/b;"
        }
    .end annotation

    sget-object v0, Lm9/m0;->a:Lt9/d;

    invoke-static {v0}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object v0

    new-instance v1, Lw3/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lw3/a;-><init>(Lw3/d;Lu8/e;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v1, v3}, Lz6/a;->e(Lm9/d0;Ln9/d;Lc9/e;I)Lm9/i0;

    move-result-object v0

    invoke-static {v0}, Lo1/s;->j(Lm9/i0;)Landroidx/concurrent/futures/m;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;)Lu6/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Lu6/b;"
        }
    .end annotation

    const-string v0, "attributionSource"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm9/m0;->a:Lt9/d;

    invoke-static {v0}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object v0

    new-instance v1, Lw3/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lw3/b;-><init>(Lw3/d;Landroid/net/Uri;Landroid/view/InputEvent;Lu8/e;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, Lz6/a;->e(Lm9/d0;Ln9/d;Lc9/e;I)Lm9/i0;

    move-result-object p1

    invoke-static {p1}, Lo1/s;->j(Lm9/i0;)Landroidx/concurrent/futures/m;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/net/Uri;)Lu6/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lu6/b;"
        }
    .end annotation

    const-string v0, "trigger"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm9/m0;->a:Lt9/d;

    invoke-static {v0}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object v0

    new-instance v1, Lw3/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lw3/c;-><init>(Lw3/d;Landroid/net/Uri;Lu8/e;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, Lz6/a;->e(Lm9/d0;Ln9/d;Lc9/e;I)Lm9/i0;

    move-result-object p1

    invoke-static {p1}, Lo1/s;->j(Lm9/i0;)Landroidx/concurrent/futures/m;

    move-result-object p1

    return-object p1
.end method

.method public e(Lx3/d;)Lu6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/d;",
            ")",
            "Lu6/b;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public f(Lx3/e;)Lu6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/e;",
            ")",
            "Lu6/b;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
