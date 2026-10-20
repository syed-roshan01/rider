.class public final Lt/q1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/l3;


# instance fields
.field public final a:Lt/x1;

.field public final b:Lm0/n1;

.field public final c:Lm0/n1;

.field public final d:Lm0/n1;

.field public final e:Lm0/n1;

.field public final f:Lm0/m1;

.field public final n:Lm0/n1;

.field public final o:Lm0/n1;

.field public p:Lt/t;

.field public final q:Lt/d1;

.field public final synthetic r:Lt/u1;


# direct methods
.method public constructor <init>(Lt/u1;Ljava/lang/Object;Lt/t;Lt/x1;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/q1;->r:Lt/u1;

    iput-object p4, p0, Lt/q1;->a:Lt/x1;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lt/q1;->b:Lm0/n1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v1, v2, v3}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v3

    invoke-static {v3, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v3

    iput-object v3, p0, Lt/q1;->c:Lm0/n1;

    new-instance v3, Lt/l1;

    invoke-virtual {p0}, Lt/q1;->c()Lt/e0;

    move-result-object v5

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v4, v3

    move-object v6, p4

    move-object v7, p2

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    invoke-static {v3, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lt/q1;->d:Lm0/n1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lt/q1;->e:Lm0/n1;

    sget v0, Lm0/b;->b:I

    new-instance v0, Lm0/m1;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4}, Lm0/m1;-><init>(J)V

    iput-object v0, p0, Lt/q1;->f:Lm0/m1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lt/q1;->n:Lm0/n1;

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/q1;->o:Lm0/n1;

    iput-object p3, p0, Lt/q1;->p:Lt/t;

    sget-object p1, Lt/i2;->a:Ljava/util/Map;

    invoke-interface {p1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p3, p4, Lt/x1;->a:Lc9/c;

    invoke-interface {p3, p2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt/t;

    invoke-virtual {p2}, Lt/t;->b()I

    move-result p3

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_0

    invoke-virtual {p2, p4, p1}, Lt/t;->e(IF)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt/q1;->a:Lt/x1;

    iget-object p1, p1, Lt/x1;->b:Lc9/c;

    invoke-interface {p1, p2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :cond_1
    const/4 p1, 0x3

    invoke-static {v1, v2, p1}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p1

    iput-object p1, p0, Lt/q1;->q:Lt/d1;

    return-void
.end method

.method public static d(Lt/q1;Ljava/lang/Object;ZI)V
    .locals 7

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lt/q1;->o:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    move-object v3, p1

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lt/q1;->c()Lt/e0;

    move-result-object p1

    instance-of p1, p1, Lt/d1;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lt/q1;->c()Lt/e0;

    move-result-object p1

    :goto_0
    move-object v1, p1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lt/q1;->q:Lt/d1;

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lt/q1;->c()Lt/e0;

    move-result-object p1

    goto :goto_0

    :goto_2
    new-instance p1, Lt/l1;

    iget-object v2, p0, Lt/q1;->a:Lt/x1;

    iget-object p2, p0, Lt/q1;->b:Lm0/n1;

    invoke-virtual {p2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lt/q1;->p:Lt/t;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lt/l1;-><init>(Lt/n;Lt/x1;Ljava/lang/Object;Ljava/lang/Object;Lt/t;)V

    iget-object p2, p0, Lt/q1;->d:Lm0/n1;

    invoke-virtual {p2, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p0, p0, Lt/q1;->r:Lt/u1;

    iget-object p1, p0, Lt/u1;->g:Lm0/n1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lt/u1;->h:Lw0/u;

    invoke-virtual {p1}, Lw0/u;->size()I

    move-result p2

    const/4 p3, 0x0

    const-wide/16 v0, 0x0

    :goto_3
    if-ge p3, p2, :cond_4

    invoke-virtual {p1, p3}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt/q1;

    invoke-virtual {v2}, Lt/q1;->b()Lt/l1;

    move-result-object v3

    iget-wide v3, v3, Lt/l1;->h:J

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-wide v3, p0, Lt/u1;->k:J

    invoke-virtual {v2}, Lt/q1;->b()Lt/l1;

    move-result-object v5

    invoke-virtual {v5, v3, v4}, Lt/l1;->b(J)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v2, Lt/q1;->o:Lm0/n1;

    invoke-virtual {v6, v5}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lt/q1;->b()Lt/l1;

    move-result-object v5

    invoke-virtual {v5, v3, v4}, Lt/l1;->f(J)Lt/t;

    move-result-object v3

    iput-object v3, v2, Lt/q1;->p:Lt/t;

    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_4
    iget-object p0, p0, Lt/u1;->g:Lm0/n1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final b()Lt/l1;
    .locals 1

    iget-object v0, p0, Lt/q1;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/l1;

    return-object v0
.end method

.method public final c()Lt/e0;
    .locals 1

    iget-object v0, p0, Lt/q1;->c:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/e0;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;Lt/e0;)V
    .locals 1

    iget-object v0, p0, Lt/q1;->b:Lm0/n1;

    invoke-virtual {v0, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lt/q1;->c:Lm0/n1;

    invoke-virtual {v0, p3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lt/q1;->b()Lt/l1;

    move-result-object p3

    iget-object p3, p3, Lt/l1;->c:Ljava/lang/Object;

    invoke-static {p3, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lt/q1;->b()Lt/l1;

    move-result-object p3

    iget-object p3, p3, Lt/l1;->d:Ljava/lang/Object;

    invoke-static {p3, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-static {p0, p1, p3, p2}, Lt/q1;->d(Lt/q1;Ljava/lang/Object;ZI)V

    return-void
.end method

.method public final f(Ljava/lang/Object;Lt/e0;)V
    .locals 3

    iget-object v0, p0, Lt/q1;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lt/q1;->n:Lm0/n1;

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lt/q1;->c:Lm0/n1;

    invoke-virtual {p1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lt/q1;->e:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x1

    xor-int/2addr p2, v0

    const/4 v1, 0x0

    invoke-static {p0, v1, p2, v0}, Lt/q1;->d(Lt/q1;Ljava/lang/Object;ZI)V

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lt/q1;->r:Lt/u1;

    iget-object p1, p1, Lt/u1;->e:Lm0/m1;

    invoke-virtual {p1}, Lm0/w2;->d()J

    move-result-wide v0

    iget-object p1, p0, Lt/q1;->f:Lm0/m1;

    invoke-virtual {p1, v0, v1}, Lm0/w2;->f(J)V

    invoke-virtual {v2, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt/q1;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "current value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lt/q1;->o:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt/q1;->b:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lt/q1;->c()Lt/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
