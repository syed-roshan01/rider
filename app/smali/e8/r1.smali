.class public final Le8/r1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Le8/c2;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le8/c2;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le8/r1;->b:Ljava/lang/Object;

    const-string v0, "status"

    .line 3
    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Le8/r1;->a:Le8/c2;

    .line 4
    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "cannot use OK status: %s"

    invoke-static {p1, v1, v0}, Ly3/e;->E(Ljava/lang/Object;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/r1;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Le8/r1;->a:Le8/c2;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Le8/r1;

    if-eq v3, v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Le8/r1;

    iget-object v2, p0, Le8/r1;->a:Le8/c2;

    iget-object v3, p1, Le8/r1;->a:Le8/c2;

    invoke-static {v2, v3}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Le8/r1;->b:Ljava/lang/Object;

    iget-object p1, p1, Le8/r1;->b:Ljava/lang/Object;

    invoke-static {v2, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Le8/r1;->a:Le8/c2;

    iget-object v1, p0, Le8/r1;->b:Ljava/lang/Object;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Le8/r1;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v1

    const-string v2, "config"

    invoke-virtual {v1, v0, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "error"

    iget-object v2, p0, Le8/r1;->a:Le8/c2;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
