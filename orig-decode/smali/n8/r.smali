.class public final Ln8/r;
.super Ln8/u;


# instance fields
.field public final s:Le8/c2;


# direct methods
.method public constructor <init>(Le8/c2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "status"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ln8/r;->s:Le8/c2;

    return-void
.end method


# virtual methods
.method public final B0(Ln8/u;)Z
    .locals 2

    instance-of v0, p1, Ln8/r;

    if-eqz v0, :cond_1

    check-cast p1, Ln8/r;

    iget-object v0, p1, Ln8/r;->s:Le8/c2;

    iget-object v1, p0, Ln8/r;->s:Le8/c2;

    invoke-static {v1, v0}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Le8/c2;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Ln8/r;->s:Le8/c2;

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final Y(Lg8/j4;)Le8/v0;
    .locals 1

    iget-object p1, p0, Ln8/r;->s:Le8/c2;

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Le8/v0;->e:Le8/v0;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Le8/v0;->a(Le8/c2;)Le8/v0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lq6/g;

    const-class v1, Ln8/r;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq6/g;-><init>(Ljava/lang/String;)V

    const-string v1, "status"

    iget-object v2, p0, Ln8/r;->s:Le8/c2;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
