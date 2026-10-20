.class public final Lc0/n;
.super Ljava/lang/Object;

# interfaces
.implements Lc0/d;


# instance fields
.field public final synthetic a:Lt1/m;


# direct methods
.method public constructor <init>(Lt1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/n;->a:Lt1/m;

    return-void
.end method


# virtual methods
.method public final x(Lr1/s;Lc9/a;Lu8/e;)Ljava/lang/Object;
    .locals 3

    sget-object p3, Lu1/y0;->f:Lm0/m3;

    iget-object v0, p0, Lc0/n;->a:Lt1/m;

    invoke-static {v0, p3}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    sget-wide v0, Ld1/c;->b:J

    invoke-interface {p1, v0, v1}, Lr1/s;->P(J)J

    move-result-wide v0

    invoke-interface {p2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0, v1}, Ld1/d;->g(J)Ld1/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance p2, Landroid/graphics/Rect;

    iget v0, p1, Ld1/d;->a:F

    float-to-int v0, v0

    iget v1, p1, Ld1/d;->b:F

    float-to-int v1, v1

    iget v2, p1, Ld1/d;->c:F

    float-to-int v2, v2

    iget p1, p1, Ld1/d;->d:F

    float-to-int p1, p1

    invoke-direct {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 p1, 0x0

    invoke-virtual {p3, p2, p1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    :cond_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
