.class public abstract Lj0/v;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt/w1;

    sget-object v1, Lt/d0;->c:Lt/b0;

    const/4 v2, 0x2

    const/16 v3, 0xf

    invoke-direct {v0, v3, v1, v2}, Lt/w1;-><init>(ILt/a0;I)V

    sput-object v0, Lj0/v;->a:Lt/w1;

    return-void
.end method

.method public static final a(ZFJLm0/m;II)Lj0/e;
    .locals 0

    check-cast p4, Lm0/q;

    const p5, 0x61769d80

    invoke-virtual {p4, p5}, Lm0/q;->Z(I)V

    and-int/lit8 p5, p6, 0x1

    if-eqz p5, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 p5, p6, 0x2

    if-eqz p5, :cond_1

    const/high16 p1, 0x7fc00000    # Float.NaN

    :cond_1
    and-int/lit8 p5, p6, 0x4

    if-eqz p5, :cond_2

    sget-wide p2, Le1/r;->g:J

    :cond_2
    new-instance p5, Le1/r;

    invoke-direct {p5, p2, p3}, Le1/r;-><init>(J)V

    invoke-static {p5, p4}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    new-instance p5, Lm2/e;

    invoke-direct {p5, p1}, Lm2/e;-><init>(F)V

    const p6, 0x1e7b2b64

    invoke-virtual {p4, p6}, Lm0/q;->Z(I)V

    invoke-virtual {p4, p3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p4, p5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p3, p5

    invoke-virtual {p4}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_3

    sget-object p3, Lm0/l;->a:Lk0/y0;

    if-ne p5, p3, :cond_4

    :cond_3
    new-instance p5, Lj0/e;

    invoke-direct {p5, p0, p1, p2}, Lj0/g;-><init>(ZFLm0/g1;)V

    invoke-virtual {p4, p5}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_4
    const/4 p0, 0x0

    invoke-virtual {p4, p0}, Lm0/q;->t(Z)V

    check-cast p5, Lj0/e;

    invoke-virtual {p4, p0}, Lm0/q;->t(Z)V

    return-object p5
.end method
