.class public final Lu/a0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lx/o;

.field public b:I

.field public final synthetic c:Lc9/a;

.field public final synthetic d:J

.field public final synthetic e:Lx/m;

.field public final synthetic f:Lu/a;


# direct methods
.method public constructor <init>(Lc9/a;JLx/m;Lu/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/a0;->c:Lc9/a;

    iput-wide p2, p0, Lu/a0;->d:J

    iput-object p4, p0, Lu/a0;->e:Lx/m;

    iput-object p5, p0, Lu/a0;->f:Lu/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance p1, Lu/a0;

    iget-object v1, p0, Lu/a0;->c:Lc9/a;

    iget-wide v2, p0, Lu/a0;->d:J

    iget-object v4, p0, Lu/a0;->e:Lx/m;

    iget-object v5, p0, Lu/a0;->f:Lu/a;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lu/a0;-><init>(Lc9/a;JLx/m;Lu/a;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu/a0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu/a0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu/a0;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lu/a0;->a:Lx/o;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/a0;->c:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-wide v4, Lu/h0;->a:J

    iput v3, p0, Lu/a0;->b:I

    invoke-static {v4, v5, p0}, Ld7/t;->P(JLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    new-instance p1, Lx/o;

    iget-wide v3, p0, Lu/a0;->d:J

    invoke-direct {p1, v3, v4}, Lx/o;-><init>(J)V

    iput-object p1, p0, Lu/a0;->a:Lx/o;

    iput v2, p0, Lu/a0;->b:I

    iget-object v1, p0, Lu/a0;->e:Lx/m;

    invoke-virtual {v1, p1, p0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    :goto_1
    iget-object p1, p0, Lu/a0;->f:Lu/a;

    iput-object v0, p1, Lu/a;->b:Lx/o;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
