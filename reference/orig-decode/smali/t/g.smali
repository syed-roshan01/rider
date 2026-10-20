.class public final Lt/g;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lt/d;

.field public final synthetic d:Lm0/l3;

.field public final synthetic e:Lm0/l3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lt/d;Lm0/l3;Lm0/l3;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lt/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Lt/g;->c:Lt/d;

    iput-object p3, p0, Lt/g;->d:Lm0/l3;

    iput-object p4, p0, Lt/g;->e:Lm0/l3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    new-instance p1, Lt/g;

    iget-object v1, p0, Lt/g;->b:Ljava/lang/Object;

    iget-object v2, p0, Lt/g;->c:Lt/d;

    iget-object v3, p0, Lt/g;->d:Lm0/l3;

    iget-object v4, p0, Lt/g;->e:Lm0/l3;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lt/g;-><init>(Ljava/lang/Object;Lt/d;Lm0/l3;Lm0/l3;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lt/g;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lt/g;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lt/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lt/g;->a:I

    iget-object v2, p0, Lt/g;->c:Lt/d;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, v2, Lt/d;->e:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lt/g;->b:Ljava/lang/Object;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lt/i;->a:I

    iget-object p1, p0, Lt/g;->d:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/n;

    iput v3, p0, Lt/g;->a:I

    invoke-static {v2, v1, p1, p0}, Lt/d;->b(Lt/d;Ljava/lang/Object;Lt/n;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget p1, Lt/i;->a:I

    iget-object p1, p0, Lt/g;->e:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc9/c;

    if-eqz p1, :cond_3

    invoke-virtual {v2}, Lt/d;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
