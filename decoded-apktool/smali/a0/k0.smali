.class public final La0/k0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:La0/h0;

.field public final synthetic c:F


# direct methods
.method public constructor <init>(La0/h0;FLu8/e;)V
    .locals 0

    iput-object p1, p0, La0/k0;->b:La0/h0;

    iput p2, p0, La0/k0;->c:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance p1, La0/k0;

    iget-object v0, p0, La0/k0;->b:La0/h0;

    iget v1, p0, La0/k0;->c:F

    invoke-direct {p1, v0, v1, p2}, La0/k0;-><init>(La0/h0;FLu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, La0/k0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, La0/k0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, La0/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, La0/k0;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput v3, p0, La0/k0;->a:I

    iget-object p1, p0, La0/k0;->b:La0/h0;

    check-cast p1, Lz/d;

    iget v1, p1, Lz/d;->a:I

    iget v3, p0, La0/k0;->c:F

    iget-object p1, p1, Lz/d;->c:Lv/f2;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lb0/h0;

    invoke-static {p1, v3, p0}, Lf6/a;->n(Lv/f2;FLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    goto :goto_0

    :pswitch_0
    check-cast p1, Lz/g0;

    invoke-static {p1, v3, p0}, Lf6/a;->n(Lv/f2;FLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
