.class public final Lm0/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a1;


# static fields
.field public static final a:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lm9/m0;->a:Lt9/d;

    sget-object v0, Lr9/o;->a:Lm9/s1;

    check-cast v0, Ln9/d;

    iget-object v0, v0, Ln9/d;->f:Ln9/d;

    new-instance v1, Lm0/f0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {v0, v1}, Lz6/a;->d0(Lu8/j;Lc9/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Choreographer;

    sput-object v0, Lm0/h0;->a:Landroid/view/Choreographer;

    return-void
.end method


# virtual methods
.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ld7/a;->A(Lu8/j;Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public final T(Lc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p2, Lm0/g0;

    invoke-direct {p2, v0, p1}, Lm0/g0;-><init>(Lm9/l;Lc9/c;)V

    sget-object p1, Lm0/h0;->a:Landroid/view/Choreographer;

    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Lq/w;

    const/16 v1, 0x17

    invoke-direct {p1, p2, v1}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lm9/l;->v(Lc9/c;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->D(Lu8/h;Lu8/i;)Lu8/h;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->V(Lu8/h;Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method
