.class public final Lu/d0;
.super Lw8/i;

# interfaces
.implements Lc9/f;


# instance fields
.field public a:I

.field public synthetic b:Lv/l1;

.field public synthetic c:J

.field public final synthetic d:Lu/e0;


# direct methods
.method public constructor <init>(Lu/e0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/d0;->d:Lu/e0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lv/l1;

    check-cast p2, Ld1/c;

    iget-wide v0, p2, Ld1/c;->a:J

    check-cast p3, Lu8/e;

    new-instance p2, Lu/d0;

    iget-object v2, p0, Lu/d0;->d:Lu/e0;

    invoke-direct {p2, v2, p3}, Lu/d0;-><init>(Lu/e0;Lu8/e;)V

    iput-object p1, p2, Lu/d0;->b:Lv/l1;

    iput-wide v0, p2, Lu/d0;->c:J

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-virtual {p2, p1}, Lu/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu/d0;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v4, p0, Lu/d0;->b:Lv/l1;

    iget-wide v5, p0, Lu/d0;->c:J

    iget-object p1, p0, Lu/d0;->d:Lu/e0;

    iget-boolean v1, p1, Lu/e;->w:Z

    if-eqz v1, :cond_4

    iput v3, p0, Lu/d0;->a:I

    iget-object v7, p1, Lu/e;->x:Lx/m;

    if-eqz v7, :cond_3

    iget-object v8, p1, Lu/e;->z:Lu/a;

    iget-object v9, p1, Lu/e;->A:Lt/l0;

    new-instance p1, Lu/b0;

    const/4 v10, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Lu/b0;-><init>(Lv/l1;JLx/m;Lu/a;Lc9/a;Lu8/e;)V

    invoke-static {p1, p0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    return-object v2
.end method
