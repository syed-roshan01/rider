.class public final Lu1/o0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lu1/o0;

.field public static final c:Lu1/o0;

.field public static final d:Lu1/o0;

.field public static final e:Lu1/o0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu1/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu1/o0;-><init>(I)V

    sput-object v0, Lu1/o0;->b:Lu1/o0;

    new-instance v0, Lu1/o0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu1/o0;-><init>(I)V

    sput-object v0, Lu1/o0;->c:Lu1/o0;

    new-instance v0, Lu1/o0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lu1/o0;-><init>(I)V

    sput-object v0, Lu1/o0;->d:Lu1/o0;

    new-instance v0, Lu1/o0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lu1/o0;-><init>(I)V

    sput-object v0, Lu1/o0;->e:Lu1/o0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu1/o0;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu1/o0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lu1/v1;

    check-cast p2, Landroid/graphics/Matrix;

    invoke-interface {p1, p2}, Lu1/v1;->I(Landroid/graphics/Matrix;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    check-cast p1, Lm0/q;

    invoke-virtual {p1}, Lm0/q;->G()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm0/q;->U()V

    :cond_1
    :goto_0
    return-object v0

    :pswitch_2
    check-cast p1, Ly1/o;

    check-cast p2, Ly1/o;

    invoke-virtual {p1}, Ly1/o;->h()Ly1/j;

    move-result-object p1

    sget-object v0, Ly1/r;->n:Ly1/u;

    sget-object v1, Lu1/q0;->c:Lu1/q0;

    invoke-virtual {p1, v0, v1}, Ly1/j;->i(Ly1/u;Lc9/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p2}, Ly1/o;->h()Ly1/j;

    move-result-object p2

    invoke-virtual {p2, v0, v1}, Ly1/j;->i(Ly1/u;Lc9/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
