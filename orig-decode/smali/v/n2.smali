.class public final Lv/n2;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:J

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lo1/u;


# direct methods
.method public constructor <init>(Lo1/u;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/n2;->e:Lo1/u;

    invoke-direct {p0, p2}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lv/n2;

    iget-object v1, p0, Lv/n2;->e:Lo1/u;

    invoke-direct {v0, v1, p2}, Lv/n2;-><init>(Lo1/u;Lu8/e;)V

    iput-object p1, v0, Lv/n2;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/n2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/n2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/n2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/n2;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lv/n2;->b:J

    iget-object v1, p0, Lv/n2;->d:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-wide v4, v3

    move-object v3, v1

    move-object v1, v0

    move-object v0, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/n2;->d:Ljava/lang/Object;

    check-cast p1, Lo1/h0;

    iget-object v1, p0, Lv/n2;->e:Lo1/u;

    iget-wide v3, v1, Lo1/u;->b:J

    invoke-virtual {p1}, Lo1/h0;->g()Lu1/y2;

    move-result-object v1

    invoke-interface {v1}, Lu1/y2;->c()V

    const-wide/16 v5, 0x28

    add-long/2addr v5, v3

    move-object v1, p1

    move-wide v3, v5

    move-object p1, p0

    :goto_0
    iput-object v1, p1, Lv/n2;->d:Ljava/lang/Object;

    iput-wide v3, p1, Lv/n2;->b:J

    iput v2, p1, Lv/n2;->c:I

    const/4 v5, 0x3

    invoke-static {v1, p1, v5}, Lv/k3;->c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_2

    return-object v0

    :cond_2
    move-object v8, v0

    move-object v0, p1

    move-object p1, v5

    move-wide v4, v3

    move-object v3, v1

    move-object v1, v8

    :goto_1
    check-cast p1, Lo1/u;

    iget-wide v6, p1, Lo1/u;->b:J

    cmp-long v6, v6, v4

    if-ltz v6, :cond_3

    return-object p1

    :cond_3
    move-object p1, v0

    move-object v0, v1

    move-object v1, v3

    move-wide v3, v4

    goto :goto_0
.end method
