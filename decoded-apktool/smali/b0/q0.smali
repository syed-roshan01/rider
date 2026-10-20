.class public final Lb0/q0;
.super Ljava/lang/Object;

# interfaces
.implements Lv/y0;


# instance fields
.field public final a:Lw/h;

.field public final b:Lb0/h0;


# direct methods
.method public constructor <init>(Lw/h;Lb0/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/q0;->a:Lw/h;

    iput-object p2, p0, Lb0/q0;->b:Lb0/h0;

    return-void
.end method


# virtual methods
.method public final a(Lv/h2;FLu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lb0/p0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb0/p0;

    iget v1, v0, Lb0/p0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb0/p0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb0/p0;

    invoke-direct {v0, p0, p3}, Lb0/p0;-><init>(Lb0/q0;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lb0/p0;->a:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lb0/p0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p3, Lq/w;

    const/16 v2, 0x12

    invoke-direct {p3, p0, v2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    iput v3, v0, Lb0/p0;->c:I

    iget-object v2, p0, Lb0/q0;->a:Lw/h;

    invoke-virtual {v2, p1, p2, p3, v0}, Lw/h;->d(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p1

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    return-object p2
.end method
