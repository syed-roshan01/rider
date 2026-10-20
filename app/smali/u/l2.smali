.class public final Lu/l2;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lm9/d0;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm9/d0;ZLu/p2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lu/l2;->a:I

    iput-object p1, p0, Lu/l2;->c:Lm9/d0;

    iput-boolean p2, p0, Lu/l2;->b:Z

    iput-object p3, p0, Lu/l2;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLm9/d0;La0/h0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lu/l2;->a:I

    iput-boolean p1, p0, Lu/l2;->b:Z

    iput-object p2, p0, Lu/l2;->c:Lm9/d0;

    iput-object p3, p0, Lu/l2;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)Ljava/lang/Boolean;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x3

    iget-object v2, p0, Lu/l2;->c:Lm9/d0;

    const/4 v3, 0x0

    iget v4, p0, Lu/l2;->a:I

    iget-object v5, p0, Lu/l2;->d:Ljava/lang/Object;

    packed-switch v4, :pswitch_data_0

    iget-boolean v4, p0, Lu/l2;->b:Z

    if-eqz v4, :cond_0

    move p1, p2

    :cond_0
    new-instance p2, La0/k0;

    check-cast v5, La0/h0;

    invoke-direct {p2, v5, p1, v3}, La0/k0;-><init>(La0/h0;FLu8/e;)V

    invoke-static {v2, v3, v0, p2, v1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_0
    new-instance v10, Lu/k2;

    iget-boolean v6, p0, Lu/l2;->b:Z

    move-object v7, v5

    check-cast v7, Lu/p2;

    const/4 v9, 0x0

    move-object v4, v10

    move v5, v6

    move-object v6, v7

    move v7, p2

    move v8, p1

    invoke-direct/range {v4 .. v9}, Lu/k2;-><init>(ZLu/p2;FFLu8/e;)V

    invoke-static {v2, v3, v0, v10, v1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu/l2;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/l2;->a(FF)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/l2;->a(FF)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
