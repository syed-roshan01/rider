.class public final Ly/q0;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:Lc9/c;

.field public v:Z


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 2

    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget p3, p2, Lr1/x0;->a:I

    iget p4, p2, Lr1/x0;->b:I

    new-instance v0, Lb/g;

    const/4 v1, 0x6

    invoke-direct {v0, p0, p1, p2, v1}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p3, p4, p2, v0}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method
