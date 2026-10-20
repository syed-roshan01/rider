.class public final Ln8/d;
.super Le8/z0;


# instance fields
.field public final synthetic c:Ln8/f;


# direct methods
.method public constructor <init>(Ln8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/d;->c:Ln8/f;

    return-void
.end method


# virtual methods
.method public final c(Le8/c2;)V
    .locals 3

    iget-object v0, p0, Ln8/d;->c:Ln8/f;

    iget-object v0, v0, Ln8/f;->d:Le8/j0;

    sget-object v1, Le8/x;->c:Le8/x;

    new-instance v2, Ln8/c;

    invoke-direct {v2, p1}, Ln8/c;-><init>(Le8/c2;)V

    invoke-virtual {v0, v1, v2}, Le8/j0;->r(Le8/x;Lz6/a;)V

    return-void
.end method

.method public final d(Le8/w0;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 0

    return-void
.end method
