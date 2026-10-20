.class public final Ly/a;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lr1/a;

.field public final synthetic b:F

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Lr1/x0;

.field public final synthetic n:I


# direct methods
.method public constructor <init>(Lr1/a;FIIILr1/x0;I)V
    .locals 0

    iput-object p1, p0, Ly/a;->a:Lr1/a;

    iput p2, p0, Ly/a;->b:F

    iput p3, p0, Ly/a;->c:I

    iput p4, p0, Ly/a;->d:I

    iput p5, p0, Ly/a;->e:I

    iput-object p6, p0, Ly/a;->f:Lr1/x0;

    iput p7, p0, Ly/a;->n:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Lr1/w0;

    iget-object v0, p0, Ly/a;->a:Lr1/a;

    instance-of v0, v0, Lr1/o;

    iget-object v1, p0, Ly/a;->f:Lr1/x0;

    iget v2, p0, Ly/a;->e:I

    iget v3, p0, Ly/a;->c:I

    const/high16 v4, 0x7fc00000    # Float.NaN

    iget v5, p0, Ly/a;->b:F

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move v7, v6

    goto :goto_0

    :cond_0
    invoke-static {v5, v4}, Lm2/e;->a(FF)Z

    move-result v7

    if-nez v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    iget v7, p0, Ly/a;->d:I

    sub-int/2addr v7, v2

    iget v8, v1, Lr1/x0;->a:I

    sub-int/2addr v7, v8

    :goto_0
    if-nez v0, :cond_2

    move v3, v6

    goto :goto_1

    :cond_2
    invoke-static {v5, v4}, Lm2/e;->a(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget v0, p0, Ly/a;->n:I

    sub-int/2addr v0, v2

    iget v2, v1, Lr1/x0;->b:I

    sub-int v3, v0, v2

    :goto_1
    invoke-static {p1, v1, v7, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
