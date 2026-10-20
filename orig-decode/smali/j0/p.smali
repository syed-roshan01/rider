.class public final Lj0/p;
.super Ljava/lang/Object;


# instance fields
.field public a:Ld1/c;

.field public final b:F

.field public final c:Z

.field public d:Ljava/lang/Float;

.field public e:Ljava/lang/Float;

.field public f:Ld1/c;

.field public final g:Lt/d;

.field public final h:Lt/d;

.field public final i:Lt/d;

.field public final j:Lm9/s;

.field public final k:Lm0/n1;

.field public final l:Lm0/n1;


# direct methods
.method public constructor <init>(Ld1/c;FZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/p;->a:Ld1/c;

    iput p2, p0, Lj0/p;->b:F

    iput-boolean p3, p0, Lj0/p;->c:Z

    const/4 p1, 0x0

    invoke-static {p1}, Lt/e;->a(F)Lt/d;

    move-result-object p2

    iput-object p2, p0, Lj0/p;->g:Lt/d;

    invoke-static {p1}, Lt/e;->a(F)Lt/d;

    move-result-object p2

    iput-object p2, p0, Lj0/p;->h:Lt/d;

    invoke-static {p1}, Lt/e;->a(F)Lt/d;

    move-result-object p1

    iput-object p1, p0, Lj0/p;->i:Lt/d;

    new-instance p1, Lm9/s;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lm9/p1;-><init>(Z)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lm9/p1;->S(Lm9/f1;)V

    iput-object p1, p0, Lj0/p;->j:Lm9/s;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object p2, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p3

    iput-object p3, p0, Lj0/p;->k:Lm0/n1;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lj0/p;->l:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lj0/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj0/i;

    iget v1, v0, Lj0/i;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj0/i;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lj0/i;

    invoke-direct {v0, p0, p1}, Lj0/i;-><init>(Lj0/p;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lj0/i;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lj0/i;->d:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lj0/i;->a:Lj0/p;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lj0/i;->a:Lj0/p;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput-object p0, v0, Lj0/i;->a:Lj0/p;

    iput v6, v0, Lj0/i;->d:I

    new-instance p1, Lj0/m;

    invoke-direct {p1, p0, v7}, Lj0/m;-><init>(Lj0/p;Lu8/e;)V

    invoke-static {p1, v0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v3

    :goto_1
    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_2
    iget-object p1, v2, Lj0/p;->k:Lm0/n1;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v6}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iput-object v2, v0, Lj0/i;->a:Lj0/p;

    iput v5, v0, Lj0/i;->d:I

    iget-object p1, v2, Lj0/p;->j:Lm9/s;

    invoke-virtual {p1, v0}, Lm9/p1;->y(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    iput-object v7, v0, Lj0/i;->a:Lj0/p;

    iput v4, v0, Lj0/i;->d:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lj0/o;

    invoke-direct {p1, v2, v7}, Lj0/o;-><init>(Lj0/p;Lu8/e;)V

    invoke-static {p1, v0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    move-object p1, v3

    :goto_4
    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_5
    return-object v3
.end method
