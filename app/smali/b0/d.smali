.class public final Lb0/d;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:Lo1/u;

.field public c:Lo1/u;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lb0/h0;


# direct methods
.method public constructor <init>(Lb0/h0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lb0/d;->f:Lb0/h0;

    invoke-direct {p0, p2}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lb0/d;

    iget-object v1, p0, Lb0/d;->f:Lb0/h0;

    invoke-direct {v0, v1, p2}, Lb0/d;-><init>(Lb0/h0;Lu8/e;)V

    iput-object p1, v0, Lb0/d;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lb0/d;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lb0/d;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lb0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lb0/d;->d:I

    sget-object v2, Lo1/l;->a:Lo1/l;

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Lb0/d;->c:Lo1/u;

    iget-object v3, p0, Lb0/d;->b:Lo1/u;

    iget-object v6, p0, Lb0/d;->e:Ljava/lang/Object;

    check-cast v6, Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v3

    move-object v3, v1

    move-object v1, v0

    move-object v0, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lb0/d;->e:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lb0/d;->e:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lo1/h0;

    iput-object v1, p0, Lb0/d;->e:Ljava/lang/Object;

    iput v3, p0, Lb0/d;->d:I

    invoke-static {v1, v5, v2, p0}, Lv/k3;->b(Lo1/h0;ZLo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lo1/u;

    sget-wide v6, Ld1/c;->b:J

    iget-object v3, p0, Lb0/d;->f:Lb0/h0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Ld1/c;

    invoke-direct {v8, v6, v7}, Ld1/c;-><init>(J)V

    iget-object v3, v3, Lb0/h0;->a:Lm0/n1;

    invoke-virtual {v3, v8}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const/4 v3, 0x0

    move-object v6, v1

    move-object v1, v3

    move-object v3, p1

    move-object p1, p0

    :goto_1
    if-nez v1, :cond_7

    iput-object v6, p1, Lb0/d;->e:Ljava/lang/Object;

    iput-object v3, p1, Lb0/d;->b:Lo1/u;

    iput-object v1, p1, Lb0/d;->c:Lo1/u;

    iput v4, p1, Lb0/d;->d:I

    invoke-virtual {v6, v2, p1}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_4

    return-object v0

    :cond_4
    move-object v12, v0

    move-object v0, p1

    move-object p1, v7

    move-object v7, v6

    move-object v6, v3

    move-object v3, v1

    move-object v1, v12

    :goto_2
    check-cast p1, Lo1/k;

    iget-object v8, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    move v10, v5

    :goto_3
    if-ge v10, v9, :cond_6

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo1/u;

    invoke-static {v11}, Lm9/e0;->s(Lo1/u;)Z

    move-result v11

    if-nez v11, :cond_5

    move-object p1, v0

    move-object v0, v1

    move-object v1, v3

    move-object v3, v6

    move-object v6, v7

    goto :goto_1

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    iget-object p1, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo1/u;

    move-object v3, v6

    move-object v6, v7

    move-object v12, v1

    move-object v1, p1

    move-object p1, v0

    move-object v0, v12

    goto :goto_1

    :cond_7
    iget-wide v2, v3, Lo1/u;->c:J

    iget-wide v0, v1, Lo1/u;->c:J

    invoke-static {v0, v1, v2, v3}, Ld1/c;->f(JJ)J

    move-result-wide v0

    iget-object p1, p1, Lb0/d;->f:Lb0/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    iget-object p1, p1, Lb0/h0;->a:Lm0/n1;

    invoke-virtual {p1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
