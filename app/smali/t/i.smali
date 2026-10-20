.class public abstract Lt/i;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lt/i2;->a:Ljava/util/Map;

    sget v0, Ld1/f;->d:I

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0, v0}, Ld7/t;->j(FF)J

    new-instance v1, Ld1/f;

    sget v1, Ld1/c;->e:I

    invoke-static {v0, v0}, Ld9/i;->f(FF)J

    new-instance v0, Ld1/c;

    sget v0, Lm2/i;->c:I

    const/4 v0, 0x1

    invoke-static {v0, v0}, Li1/b;->c(II)J

    new-instance v0, Lm2/i;

    return-void
.end method

.method public static final a(FLt/w1;Lm0/m;I)Lm0/l3;
    .locals 7

    check-cast p2, Lm0/q;

    const v0, -0x53df67ee

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    const-string v3, "DpAnimation"

    const/4 v4, 0x0

    new-instance v0, Lm2/e;

    invoke-direct {v0, p0}, Lm2/e;-><init>(F)V

    sget-object v1, Lt/y1;->c:Lt/x1;

    and-int/lit8 p0, p3, 0xe

    shl-int/lit8 v2, p3, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr p0, v2

    shl-int/lit8 p3, p3, 0x6

    const v2, 0xe000

    and-int/2addr v2, p3

    or-int/2addr p0, v2

    const/high16 v2, 0x70000

    and-int/2addr p3, v2

    or-int v6, p0, p3

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v0 .. v6}, Lt/i;->b(Ljava/lang/Object;Lt/x1;Lt/n;Ljava/lang/String;Lc9/c;Lm0/m;I)Lm0/l3;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lm0/q;->t(Z)V

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Lt/x1;Lt/n;Ljava/lang/String;Lc9/c;Lm0/m;I)Lm0/l3;
    .locals 10

    move-object v0, p0

    move-object v1, p5

    check-cast v1, Lm0/q;

    const v2, -0x76dfbb5c

    invoke-virtual {v1, v2}, Lm0/q;->Z(I)V

    sget-object v2, Lm0/l;->a:Lk0/y0;

    const v3, -0x1d58f75c

    invoke-virtual {v1, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-ne v4, v2, :cond_0

    sget-object v4, Lm0/o3;->a:Lm0/o3;

    invoke-static {v5, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v4

    invoke-virtual {v1, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Lm0/q;->t(Z)V

    check-cast v4, Lm0/g1;

    invoke-virtual {v1, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_1

    new-instance v7, Lt/d;

    move-object v8, p1

    invoke-direct {v7, p0, p1, v5}, Lt/d;-><init>(Ljava/lang/Object;Lt/x1;Ljava/lang/Object;)V

    invoke-virtual {v1, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v1, v6}, Lm0/q;->t(Z)V

    check-cast v7, Lt/d;

    move-object v8, p4

    invoke-static {p4, v1}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v8

    move-object v9, p2

    invoke-static {p2, v1}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v9

    invoke-virtual {v1, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    const/4 v2, -0x1

    const/4 v3, 0x6

    invoke-static {v2, v5, v3}, Lz6/a;->a(ILo9/a;I)Lo9/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v1, v6}, Lm0/q;->t(Z)V

    check-cast v3, Lo9/g;

    new-instance v2, Lt/f;

    invoke-direct {v2, v3, p0}, Lt/f;-><init>(Lo9/g;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    new-instance v0, Lt/h;

    const/4 v2, 0x0

    move-object p0, v0

    move-object p1, v3

    move-object p2, v7

    move-object p3, v9

    move-object p4, v8

    move-object p5, v2

    invoke-direct/range {p0 .. p5}, Lt/h;-><init>(Lo9/g;Lt/d;Lm0/l3;Lm0/l3;Lu8/e;)V

    invoke-static {v3, v0, v1}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-interface {v4}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/l3;

    if-nez v0, :cond_3

    iget-object v0, v7, Lt/d;->c:Lt/o;

    :cond_3
    invoke-virtual {v1, v6}, Lm0/q;->t(Z)V

    return-object v0
.end method
