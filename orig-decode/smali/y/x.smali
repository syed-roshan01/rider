.class public final Ly/x;
.super Ljava/lang/Object;

# interfaces
.implements Ls1/d;


# instance fields
.field public final b:Lc9/c;

.field public c:Ly/i1;


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/x;->b:Lc9/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ly/x;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ly/x;

    iget-object p1, p1, Ly/x;->b:Lc9/c;

    iget-object v0, p0, Ly/x;->b:Lc9/c;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final g(Ls1/h;)V
    .locals 1

    sget-object v0, Ly/l1;->a:Ls1/i;

    invoke-interface {p1, v0}, Ls1/h;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly/i1;

    iget-object v0, p0, Ly/x;->c:Ly/i1;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ly/x;->c:Ly/i1;

    iget-object v0, p0, Ly/x;->b:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ly/x;->b:Lc9/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
