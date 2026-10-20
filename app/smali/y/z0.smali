.class public abstract Ly/z0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ly/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v1, 0x1

    sget-object v2, Ly/k;->a:Ly/d;

    const/4 v0, 0x0

    int-to-float v4, v0

    sget-object v0, Ly0/a;->f:Ly0/f;

    new-instance v5, Ly/z;

    invoke-direct {v5, v0}, Ly/z;-><init>(Ly0/c;)V

    new-instance v6, Ly/w0;

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ly/w0;-><init>(ILy/g;Ly/i;FLy/a0;)V

    sput-object v6, Ly/z0;->a:Ly/w0;

    return-void
.end method

.method public static final a(Ly/g;Ly0/f;Lm0/m;)Lr1/j0;
    .locals 9

    check-cast p2, Lm0/q;

    const v0, -0x31efee4e

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    sget-object v0, Ly/k;->a:Ly/d;

    invoke-static {p0, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->f:Ly0/f;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ly/z0;->a:Ly/w0;

    goto :goto_0

    :cond_0
    const v0, 0x1e7b2b64

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne v2, v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    invoke-interface {p0}, Ly/g;->a()F

    move-result v7

    new-instance v8, Ly/z;

    invoke-direct {v8, p1}, Ly/z;-><init>(Ly0/c;)V

    new-instance v2, Ly/w0;

    const/4 v6, 0x0

    move-object v3, v2

    move-object v5, p0

    invoke-direct/range {v3 .. v8}, Ly/w0;-><init>(ILy/g;Ly/i;FLy/a0;)V

    invoke-virtual {p2, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p2, v1}, Lm0/q;->t(Z)V

    move-object p0, v2

    check-cast p0, Lr1/j0;

    :goto_0
    invoke-virtual {p2, v1}, Lm0/q;->t(Z)V

    return-object p0
.end method
