.class public final Lr1/w;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public u:Lc9/f;


# virtual methods
.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 2

    iget-object v0, p0, Lr1/w;->u:Lc9/f;

    new-instance v1, Lm2/a;

    invoke-direct {v1, p3, p4}, Lm2/a;-><init>(J)V

    invoke-interface {v0, p1, p2, v1}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr1/k0;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LayoutModifierImpl(measureBlock="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lr1/w;->u:Lc9/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
