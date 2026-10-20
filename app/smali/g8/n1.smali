.class public abstract Lg8/n1;
.super Le8/c1;


# instance fields
.field public final a:Le8/c1;


# direct methods
.method public constructor <init>(Lg8/l3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/n1;->a:Le8/c1;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0}, Le8/j0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m(Le8/p1;Le8/h;)Le8/k;
    .locals 1

    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0, p1, p2}, Le8/j0;->m(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1
.end method

.method public final s(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0, p1, p2, p3}, Le8/c1;->s(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->t()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "delegate"

    iget-object v2, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Le8/x;
    .locals 1

    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->u()Le8/x;

    move-result-object v0

    return-object v0
.end method

.method public final v(Le8/x;Lcom/google/firebase/firestore/remote/f;)V
    .locals 1

    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0, p1, p2}, Le8/c1;->v(Le8/x;Lcom/google/firebase/firestore/remote/f;)V

    return-void
.end method
