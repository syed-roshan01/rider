.class public final Lg8/j1;
.super Lg8/d4;


# instance fields
.field public b:Z

.field public final c:Le8/c2;

.field public final d:Lg8/i0;

.field public final e:[Le8/p;


# direct methods
.method public constructor <init>(Le8/c2;Lg8/i0;[Le8/p;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    iput-object p1, p0, Lg8/j1;->c:Le8/c2;

    iput-object p2, p0, Lg8/j1;->d:Lg8/i0;

    iput-object p3, p0, Lg8/j1;->e:[Le8/p;

    return-void
.end method

.method public constructor <init>(Le8/c2;[Le8/p;)V
    .locals 1

    sget-object v0, Lg8/i0;->a:Lg8/i0;

    .line 1
    invoke-direct {p0, p1, v0, p2}, Lg8/j1;-><init>(Le8/c2;Lg8/i0;[Le8/p;)V

    return-void
.end method


# virtual methods
.method public final f(Lg8/u;)V
    .locals 2

    const-string v0, "error"

    iget-object v1, p0, Lg8/j1;->c:Le8/c2;

    invoke-virtual {p1, v1, v0}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progress"

    iget-object v1, p0, Lg8/j1;->d:Lg8/i0;

    invoke-virtual {p1, v1, v0}, Lg8/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final j(Lg8/j0;)V
    .locals 5

    iget-boolean v0, p0, Lg8/j1;->b:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "already started"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-boolean v1, p0, Lg8/j1;->b:Z

    iget-object v0, p0, Lg8/j1;->e:[Le8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lg8/j1;->c:Le8/c2;

    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4, v3}, Lo7/d0;->j0(Le8/c2;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lg8/j1;->d:Lg8/i0;

    invoke-interface {p1, v3, v1, v0}, Lg8/j0;->c(Le8/c2;Lg8/i0;Le8/l1;)V

    return-void
.end method
