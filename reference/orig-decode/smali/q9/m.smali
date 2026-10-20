.class public final Lq9/m;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:Ld9/u;

.field public final synthetic b:Lm9/d0;

.field public final synthetic c:Lq9/o;

.field public final synthetic d:Lp9/g;


# direct methods
.method public constructor <init>(Ld9/u;Lm9/d0;Lq9/o;Lp9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/m;->a:Ld9/u;

    iput-object p2, p0, Lq9/m;->b:Lm9/d0;

    iput-object p3, p0, Lq9/m;->c:Lq9/o;

    iput-object p4, p0, Lq9/m;->d:Lp9/g;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lq9/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq9/l;

    iget v1, v0, Lq9/l;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq9/l;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq9/l;

    invoke-direct {v0, p0, p2}, Lq9/l;-><init>(Lq9/m;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lq9/l;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lq9/l;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lq9/l;->b:Ljava/lang/Object;

    iget-object v0, v0, Lq9/l;->a:Lq9/m;

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p2, p0, Lq9/m;->a:Ld9/u;

    iget-object p2, p2, Ld9/u;->a:Ljava/lang/Object;

    check-cast p2, Lm9/f1;

    if-eqz p2, :cond_3

    new-instance v2, Lt/y0;

    const/4 v4, 0x5

    invoke-direct {v2, v4}, Lt/y0;-><init>(I)V

    invoke-interface {p2, v2}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, Lq9/l;->a:Lq9/m;

    iput-object p1, v0, Lq9/l;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v3, v0, Lq9/l;->e:I

    check-cast p2, Lm9/p1;

    invoke-virtual {p2, v0}, Lm9/p1;->W(Lu8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Lq9/m;->a:Ld9/u;

    new-instance v1, Lq9/k;

    iget-object v2, v0, Lq9/m;->d:Lp9/g;

    iget-object v4, v0, Lq9/m;->c:Lq9/o;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, p1, v5}, Lq9/k;-><init>(Lq9/o;Lp9/g;Ljava/lang/Object;Lu8/e;)V

    iget-object p1, v0, Lq9/m;->b:Lm9/d0;

    const/4 v0, 0x4

    invoke-static {p1, v5, v0, v1, v3}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p1

    iput-object p1, p2, Ld9/u;->a:Ljava/lang/Object;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
