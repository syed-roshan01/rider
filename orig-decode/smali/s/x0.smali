.class public abstract Ls/x0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v0

    sput-object v0, Ls/x0;->a:Lt/d1;

    return-void
.end method

.method public static final a(JLt/e0;Ljava/lang/String;Lm0/m;II)Lm0/l3;
    .locals 4

    move-object v0, p4

    check-cast v0, Lm0/q;

    const p4, -0x1aef6ee4

    invoke-virtual {v0, p4}, Lm0/q;->Z(I)V

    and-int/lit8 p4, p6, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Ls/x0;->a:Lt/d1;

    :cond_0
    and-int/lit8 p4, p6, 0x4

    if-eqz p4, :cond_1

    const-string p3, "ColorAnimation"

    :cond_1
    const/4 p4, 0x0

    invoke-static {p0, p1}, Le1/r;->f(J)Lf1/d;

    move-result-object p6

    const v1, 0x44faf204

    invoke-virtual {v0, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v0, p6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p6

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez p6, :cond_2

    sget-object p6, Lm0/l;->a:Lk0/y0;

    if-ne v1, p6, :cond_3

    :cond_2
    sget-object p6, Ls/h0;->c:Ls/h0;

    invoke-static {p0, p1}, Le1/r;->f(J)Lf1/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Ls/h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    move-object v1, p6

    check-cast v1, Lt/x1;

    invoke-virtual {v0, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    move-object p6, v1

    check-cast p6, Lt/x1;

    new-instance v1, Le1/r;

    invoke-direct {v1, p0, p1}, Le1/r;-><init>(J)V

    and-int/lit8 p0, p5, 0xe

    or-int/lit16 p0, p0, 0x240

    shl-int/lit8 p1, p5, 0x6

    const p5, 0xe000

    and-int/2addr p5, p1

    or-int/2addr p0, p5

    const/high16 p5, 0x70000

    and-int/2addr p1, p5

    or-int v3, p0, p1

    move-object p0, v1

    move-object p1, p6

    move-object p5, v0

    move p6, v3

    invoke-static/range {p0 .. p6}, Lt/i;->b(Ljava/lang/Object;Lt/x1;Lt/n;Ljava/lang/String;Lc9/c;Lm0/m;I)Lm0/l3;

    move-result-object p0

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    return-object p0
.end method
