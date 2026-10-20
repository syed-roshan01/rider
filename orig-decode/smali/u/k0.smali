.class public final Lu/k0;
.super Ljava/lang/Object;

# interfaces
.implements Lu/i1;


# static fields
.field public static final a:Lu/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu/k0;->a:Lu/k0;

    return-void
.end method


# virtual methods
.method public final a(Lx/l;Lm0/m;)Lu/j1;
    .locals 6

    check-cast p2, Lm0/q;

    const v0, 0x64593183

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lo7/d0;->o(Lx/l;Lm0/m;I)Lm0/g1;

    move-result-object v1

    const v2, 0x47eb0cb0    # 120345.375f

    invoke-virtual {p2, v2}, Lm0/q;->Z(I)V

    const v2, -0x1d58f75c

    invoke-virtual {p2, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lm0/l;->a:Lk0/y0;

    if-ne v2, v3, :cond_0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v4, Lm0/o3;->a:Lm0/o3;

    invoke-static {v2, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v2

    invoke-virtual {p2, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    check-cast v2, Lm0/g1;

    const v4, 0x730f7c94

    invoke-virtual {p2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p2, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1

    if-ne v5, v3, :cond_2

    :cond_1
    new-instance v5, Lx/j;

    const/4 v4, 0x0

    invoke-direct {v5, p1, v2, v4}, Lx/j;-><init>(Lx/l;Lm0/g1;Lu8/e;)V

    invoke-virtual {p2, v5}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    check-cast v5, Lc9/e;

    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    invoke-static {p1, v5, p2}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    invoke-static {p1, p2, v0}, Lm9/e0;->u(Lx/l;Lm0/m;I)Lm0/g1;

    move-result-object v4

    const v5, 0x44faf204

    invoke-virtual {p2, v5}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez p1, :cond_3

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, Lu/j0;

    invoke-direct {v5, v1, v2, v4}, Lu/j0;-><init>(Lm0/g1;Lm0/g1;Lm0/g1;)V

    invoke-virtual {p2, v5}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    check-cast v5, Lu/j0;

    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    return-object v5
.end method
