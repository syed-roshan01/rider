.class public final Lv/q1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:F

.field public final synthetic d:Lt/n;

.field public final synthetic e:Ld9/r;


# direct methods
.method public constructor <init>(FLt/n;Ld9/r;Lu8/e;)V
    .locals 0

    iput p1, p0, Lv/q1;->c:F

    iput-object p2, p0, Lv/q1;->d:Lt/n;

    iput-object p3, p0, Lv/q1;->e:Ld9/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    new-instance v0, Lv/q1;

    iget-object v1, p0, Lv/q1;->d:Lt/n;

    iget-object v2, p0, Lv/q1;->e:Ld9/r;

    iget v3, p0, Lv/q1;->c:F

    invoke-direct {v0, v3, v1, v2, p2}, Lv/q1;-><init>(FLt/n;Ld9/r;Lu8/e;)V

    iput-object p1, v0, Lv/q1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/q1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/q1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/q1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/q1;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/q1;->b:Ljava/lang/Object;

    check-cast p1, Lv/r1;

    new-instance v1, Lv/p1;

    iget-object v3, p0, Lv/q1;->e:Ld9/r;

    const/4 v4, 0x0

    invoke-direct {v1, v3, p1, v4}, Lv/p1;-><init>(Ld9/r;Lv/r1;I)V

    iput v2, p0, Lv/q1;->a:I

    iget p1, p0, Lv/q1;->c:F

    iget-object v2, p0, Lv/q1;->d:Lt/n;

    invoke-static {p1, v2, v1, p0}, Lt/e;->d(FLt/n;Lv/p1;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
