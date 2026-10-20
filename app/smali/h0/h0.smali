.class public final Lh0/h0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lt/d;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Lt/d;JLu8/e;)V
    .locals 0

    iput-object p1, p0, Lh0/h0;->b:Lt/d;

    iput-wide p2, p0, Lh0/h0;->c:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lh0/h0;

    iget-object v0, p0, Lh0/h0;->b:Lt/d;

    iget-wide v1, p0, Lh0/h0;->c:J

    invoke-direct {p1, v0, v1, v2, p2}, Lh0/h0;-><init>(Lt/d;JLu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lh0/h0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lh0/h0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lh0/h0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lh0/h0;->a:I

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

    new-instance p1, Ld1/c;

    iget-wide v3, p0, Lh0/h0;->c:J

    invoke-direct {p1, v3, v4}, Ld1/c;-><init>(J)V

    sget-object v1, Lh0/k0;->d:Lt/d1;

    iput v2, p0, Lh0/h0;->a:I

    iget-object v2, p0, Lh0/h0;->b:Lt/d;

    invoke-static {v2, p1, v1, p0}, Lt/d;->b(Lt/d;Ljava/lang/Object;Lt/n;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
