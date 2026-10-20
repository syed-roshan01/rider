.class public final Lv/q;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lv/s;

.field public final synthetic d:Lm9/f1;


# direct methods
.method public constructor <init>(Lv/s;Lm9/f1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/q;->c:Lv/s;

    iput-object p2, p0, Lv/q;->d:Lm9/f1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lv/q;

    iget-object v1, p0, Lv/q;->c:Lv/s;

    iget-object v2, p0, Lv/q;->d:Lm9/f1;

    invoke-direct {v0, v1, v2, p2}, Lv/q;-><init>(Lv/s;Lm9/f1;Lu8/e;)V

    iput-object p1, v0, Lv/q;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/q;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/q;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/q;->a:I

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

    iget-object p1, p0, Lv/q;->b:Ljava/lang/Object;

    check-cast p1, Lv/r1;

    iget-object v1, p0, Lv/q;->c:Lv/s;

    iget-object v3, v1, Lv/s;->F:Lv/m3;

    invoke-static {v1}, Lv/s;->G0(Lv/s;)F

    move-result v4

    iput v4, v3, Lv/m3;->e:F

    new-instance v3, Lb/g;

    iget-object v4, p0, Lv/q;->d:Lm9/f1;

    const/4 v5, 0x4

    invoke-direct {v3, v1, p1, v4, v5}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p1, Lt/l0;

    invoke-direct {p1, v1, v5}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lv/q;->a:I

    iget-object v1, v1, Lv/s;->F:Lv/m3;

    invoke-virtual {v1, v3, p1, p0}, Lv/m3;->a(Lb/g;Lt/l0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
