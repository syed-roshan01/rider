.class public final Lh0/g;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final synthetic a:Lc9/a;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lc9/a;Z)V
    .locals 0

    iput-object p1, p0, Lh0/g;->a:Lc9/a;

    iput-boolean p2, p0, Lh0/g;->b:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ly0/o;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lm0/q;

    const p3, -0xbba9706

    invoke-virtual {p2, p3}, Lm0/q;->Z(I)V

    sget-object p3, Lh0/c1;->a:Lm0/p0;

    invoke-virtual {p2, p3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lh0/b1;

    iget-wide v0, p3, Lh0/b1;->a:J

    const p3, -0x19cf55a7

    invoke-virtual {p2, p3}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v0, v1}, Lm0/q;->f(J)Z

    move-result p3

    iget-object v2, p0, Lh0/g;->a:Lc9/a;

    invoke-virtual {p2, v2}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p3, v3

    iget-boolean v3, p0, Lh0/g;->b:Z

    invoke-virtual {p2, v3}, Lm0/q;->h(Z)Z

    move-result v4

    or-int/2addr p3, v4

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez p3, :cond_0

    sget-object p3, Lm0/l;->a:Lk0/y0;

    if-ne v4, p3, :cond_1

    :cond_0
    new-instance v4, Lh0/f;

    invoke-direct {v4, v0, v1, v2, v3}, Lh0/f;-><init>(JLc9/a;Z)V

    invoke-virtual {p2, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lc9/c;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lm0/q;->t(Z)V

    invoke-static {p1, v4}, Landroidx/compose/ui/draw/a;->e(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object p1

    invoke-virtual {p2, p3}, Lm0/q;->t(Z)V

    return-object p1
.end method
