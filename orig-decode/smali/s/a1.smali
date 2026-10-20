.class public abstract Ls/a1;
.super Ljava/lang/Object;


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    sput v0, Ls/a1;->a:F

    return-void
.end method

.method public static final a(Lm0/m;)Lt/y;
    .locals 3

    check-cast p0, Lm0/q;

    const v0, 0x35e8bf9b

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {p0, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v2, 0x44faf204

    invoke-virtual {p0, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    if-ne v2, v1, :cond_1

    :cond_0
    new-instance v1, Ls/z0;

    invoke-direct {v1, v0}, Ls/z0;-><init>(Lm2/b;)V

    new-instance v2, Lt/y;

    invoke-direct {v2, v1}, Lt/y;-><init>(Ls/z0;)V

    invoke-virtual {p0, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm0/q;->t(Z)V

    check-cast v2, Lt/y;

    invoke-virtual {p0, v0}, Lm0/q;->t(Z)V

    return-object v2
.end method
