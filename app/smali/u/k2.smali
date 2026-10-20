.class public final Lu/k2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Z

.field public final synthetic c:Lu/p2;

.field public final synthetic d:F

.field public final synthetic e:F


# direct methods
.method public constructor <init>(ZLu/p2;FFLu8/e;)V
    .locals 0

    iput-boolean p1, p0, Lu/k2;->b:Z

    iput-object p2, p0, Lu/k2;->c:Lu/p2;

    iput p3, p0, Lu/k2;->d:F

    iput p4, p0, Lu/k2;->e:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    new-instance p1, Lu/k2;

    iget-boolean v1, p0, Lu/k2;->b:Z

    iget-object v2, p0, Lu/k2;->c:Lu/p2;

    iget v3, p0, Lu/k2;->d:F

    iget v4, p0, Lu/k2;->e:F

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lu/k2;-><init>(ZLu/p2;FFLu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu/k2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu/k2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu/k2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu/k2;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lu/k2;->b:Z

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState"

    iget-object v4, p0, Lu/k2;->c:Lu/p2;

    if-eqz p1, :cond_3

    invoke-static {v4, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, p0, Lu/k2;->a:I

    iget p1, p0, Lu/k2;->d:F

    invoke-static {v4, p1, p0}, Lf6/a;->n(Lv/f2;FLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    invoke-static {v4, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, p0, Lu/k2;->a:I

    iget p1, p0, Lu/k2;->e:F

    invoke-static {v4, p1, p0}, Lf6/a;->n(Lv/f2;FLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
