.class public final Lv/t1;
.super Lw8/i;

# interfaces
.implements Lc9/f;


# instance fields
.field public synthetic a:J

.field public final synthetic b:Lv/u1;


# direct methods
.method public constructor <init>(Lv/u1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/t1;->b:Lv/u1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lm9/d0;

    check-cast p2, Lm2/p;

    iget-wide p1, p2, Lm2/p;->a:J

    check-cast p3, Lu8/e;

    new-instance v0, Lv/t1;

    iget-object v1, p0, Lv/t1;->b:Lv/u1;

    invoke-direct {v0, v1, p3}, Lv/t1;-><init>(Lv/u1;Lu8/e;)V

    iput-wide p1, v0, Lv/t1;->a:J

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-virtual {v0, p1}, Lv/t1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-wide v0, p0, Lv/t1;->a:J

    iget-object p1, p0, Lv/t1;->b:Lv/u1;

    iget-object v2, p1, Lv/u1;->x:Ln1/d;

    iget-object v2, v2, Ln1/d;->b:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm9/d0;

    if-eqz v2, :cond_0

    new-instance v3, Lv/s1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v0, v1, v4}, Lv/s1;-><init>(Lv/u1;JLu8/e;)V

    const/4 p1, 0x3

    const/4 v0, 0x0

    invoke-static {v2, v4, v0, v3, p1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
