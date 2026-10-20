.class public abstract Lg8/o1;
.super Le8/j0;


# instance fields
.field public final a:Le8/j0;


# direct methods
.method public constructor <init>(Le8/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/o1;->a:Le8/j0;

    return-void
.end method


# virtual methods
.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/o1;->a:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lg8/o1;->a:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->n()V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lg8/o1;->a:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->p()V

    return-void
.end method

.method public q(Le8/i;)V
    .locals 1

    iget-object v0, p0, Lg8/o1;->a:Le8/j0;

    invoke-virtual {v0, p1}, Le8/j0;->q(Le8/i;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "delegate"

    iget-object v2, p0, Lg8/o1;->a:Le8/j0;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
