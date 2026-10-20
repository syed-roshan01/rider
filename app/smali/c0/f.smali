.class public final Lc0/f;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Lc0/g;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lc0/f;->a:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a(Ld1/d;Lu8/e;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lc0/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lc0/e;

    iget v1, v0, Lc0/e;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc0/e;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, Lc0/e;

    invoke-direct {v0, p0, p2}, Lc0/e;-><init>(Lc0/f;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lc0/e;->e:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lc0/e;->n:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lc0/e;->d:I

    iget v2, v0, Lc0/e;->c:I

    iget-object v5, v0, Lc0/e;->b:[Ljava/lang/Object;

    iget-object v6, v0, Lc0/e;->a:Ld1/d;

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p2, v6

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p2, p0, Lc0/f;->a:Lo0/i;

    iget v2, p2, Lo0/i;->c:I

    if-lez v2, :cond_8

    iget-object p2, p2, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v5, 0x0

    move-object v11, p2

    move-object p2, p1

    move p1, v5

    move-object v5, v11

    :cond_3
    aget-object v6, v5, p1

    check-cast v6, Lc0/g;

    iput-object p2, v0, Lc0/e;->a:Ld1/d;

    iput-object v5, v0, Lc0/e;->b:[Ljava/lang/Object;

    iput v2, v0, Lc0/e;->c:I

    iput p1, v0, Lc0/e;->d:I

    iput v4, v0, Lc0/e;->n:I

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lc0/c;->a:Ls1/i;

    invoke-interface {v6, v7}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc0/d;

    if-nez v7, :cond_4

    iget-object v7, v6, Lc0/a;->u:Lc0/n;

    :cond_4
    invoke-virtual {v6}, Lc0/a;->G0()Lr1/s;

    move-result-object v8

    if-nez v8, :cond_6

    :cond_5
    move-object v6, v3

    goto :goto_1

    :cond_6
    new-instance v9, Lu/r0;

    const/4 v10, 0x2

    invoke-direct {v9, v10, p2, v6}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7, v8, v9, v0}, Lc0/d;->x(Lr1/s;Lc9/a;Lu8/e;)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lv8/a;->a:Lv8/a;

    if-ne v6, v7, :cond_5

    :goto_1
    if-ne v6, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    add-int/2addr p1, v4

    if-lt p1, v2, :cond_3

    :cond_8
    return-object v3
.end method
