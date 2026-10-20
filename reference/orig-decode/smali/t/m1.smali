.class public final Lt/m1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/l3;


# instance fields
.field public final a:Lt/q1;

.field public b:Lc9/c;

.field public c:Lc9/c;

.field public final synthetic d:Lt/n1;


# direct methods
.method public constructor <init>(Lt/n1;Lt/q1;Lc9/c;Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/m1;->d:Lt/n1;

    iput-object p2, p0, Lt/m1;->a:Lt/q1;

    iput-object p3, p0, Lt/m1;->b:Lc9/c;

    iput-object p4, p0, Lt/m1;->c:Lc9/c;

    return-void
.end method


# virtual methods
.method public final b(Lt/o1;)V
    .locals 4

    iget-object v0, p0, Lt/m1;->c:Lc9/c;

    invoke-interface {p1}, Lt/o1;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lt/m1;->d:Lt/n1;

    iget-object v1, v1, Lt/n1;->c:Lt/u1;

    invoke-virtual {v1}, Lt/u1;->d()Z

    move-result v1

    iget-object v2, p0, Lt/m1;->a:Lt/q1;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lt/m1;->c:Lc9/c;

    invoke-interface {p1}, Lt/o1;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lt/m1;->b:Lc9/c;

    invoke-interface {v3, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/e0;

    invoke-virtual {v2, v1, v0, p1}, Lt/q1;->e(Ljava/lang/Object;Ljava/lang/Object;Lt/e0;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lt/m1;->b:Lc9/c;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/e0;

    invoke-virtual {v2, v0, p1}, Lt/q1;->f(Ljava/lang/Object;Lt/e0;)V

    :goto_0
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt/m1;->d:Lt/n1;

    iget-object v0, v0, Lt/n1;->c:Lt/u1;

    invoke-virtual {v0}, Lt/u1;->c()Lt/o1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt/m1;->b(Lt/o1;)V

    iget-object v0, p0, Lt/m1;->a:Lt/q1;

    iget-object v0, v0, Lt/q1;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
