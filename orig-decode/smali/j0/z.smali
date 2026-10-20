.class public final Lj0/z;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lj0/b0;

.field public final synthetic c:F

.field public final synthetic d:Lt/n;


# direct methods
.method public constructor <init>(Lj0/b0;FLt/n;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj0/z;->b:Lj0/b0;

    iput p2, p0, Lj0/z;->c:F

    iput-object p3, p0, Lj0/z;->d:Lt/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lj0/z;

    iget v0, p0, Lj0/z;->c:F

    iget-object v1, p0, Lj0/z;->d:Lt/n;

    iget-object v2, p0, Lj0/z;->b:Lj0/b0;

    invoke-direct {p1, v2, v0, v1, p2}, Lj0/z;-><init>(Lj0/b0;FLt/n;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj0/z;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj0/z;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj0/z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lj0/z;->a:I

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

    iget-object p1, p0, Lj0/z;->b:Lj0/b0;

    iget-object p1, p1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast p1, Lt/d;

    new-instance v1, Ljava/lang/Float;

    iget v3, p0, Lj0/z;->c:F

    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    iput v2, p0, Lj0/z;->a:I

    iget-object v2, p0, Lj0/z;->d:Lt/n;

    invoke-static {p1, v1, v2, p0}, Lt/d;->b(Lt/d;Ljava/lang/Object;Lt/n;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
