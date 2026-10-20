.class public final Lg8/d3;
.super Le8/i;


# instance fields
.field public final d:Lg8/c3;

.field public final e:Le8/j0;

.field public final synthetic f:Lg8/l3;


# direct methods
.method public constructor <init>(Lg8/l3;Lg8/c3;Le8/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/d3;->f:Lg8/l3;

    iput-object p2, p0, Lg8/d3;->d:Lg8/c3;

    const-string p1, "resolver"

    invoke-static {p3, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lg8/d3;->e:Le8/j0;

    return-void
.end method


# virtual methods
.method public final d(Le8/c2;)V
    .locals 3

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "the error status must not be OK"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    new-instance v1, Lg8/x1;

    const/16 v2, 0x14

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Le8/s1;)V
    .locals 3

    iget-object v0, p0, Lg8/d3;->f:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    new-instance v1, Lg8/x1;

    const/16 v2, 0x15

    invoke-direct {v1, v2, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
