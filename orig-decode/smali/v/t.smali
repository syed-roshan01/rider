.class public final Lv/t;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ld9/r;

.field public b:Lt/o;

.field public c:I

.field public final synthetic d:F

.field public final synthetic e:Lv/u;

.field public final synthetic f:Lv/r1;


# direct methods
.method public constructor <init>(FLv/u;Lv/r1;Lu8/e;)V
    .locals 0

    iput p1, p0, Lv/t;->d:F

    iput-object p2, p0, Lv/t;->e:Lv/u;

    iput-object p3, p0, Lv/t;->f:Lv/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lv/t;

    iget-object v0, p0, Lv/t;->e:Lv/u;

    iget-object v1, p0, Lv/t;->f:Lv/r1;

    iget v2, p0, Lv/t;->d:F

    invoke-direct {p1, v2, v0, v1, p2}, Lv/t;-><init>(FLv/u;Lv/r1;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/t;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/t;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/t;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lv/t;->b:Lt/o;

    iget-object v1, p0, Lv/t;->a:Ld9/r;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget p1, p0, Lv/t;->d:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v3

    if-lez v1, :cond_3

    new-instance v1, Ld9/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput p1, v1, Ld9/r;->a:F

    new-instance v4, Ld9/r;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    invoke-static {v3, p1}, Lt/e;->b(FF)Lt/o;

    move-result-object p1

    :try_start_1
    iget-object v7, p0, Lv/t;->e:Lv/u;

    iget-object v9, v7, Lv/u;->a:Lt/y;

    new-instance v10, Lt/a;

    iget-object v5, p0, Lv/t;->f:Lv/r1;

    const/4 v8, 0x2

    move-object v3, v10

    move-object v6, v1

    invoke-direct/range {v3 .. v8}, Lt/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v1, p0, Lv/t;->a:Ld9/r;

    iput-object p1, p0, Lv/t;->b:Lt/o;

    iput v2, p0, Lv/t;->c:I

    const/4 v2, 0x0

    invoke-static {p1, v9, v2, v10, p0}, Lt/e;->e(Lt/o;Lt/y;ZLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_0
    move-object v0, p1

    :catch_1
    invoke-virtual {v0}, Lt/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v1, Ld9/r;->a:F

    :cond_2
    :goto_0
    iget p1, v1, Ld9/r;->a:F

    :cond_3
    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    return-object v0
.end method
