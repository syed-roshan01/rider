.class public final Li4/m;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Ls4/j;

.field public final synthetic c:Li4/o;

.field public final synthetic d:Lt4/f;

.field public final synthetic e:Li4/e;

.field public final synthetic f:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ls4/j;Li4/o;Lt4/f;Li4/e;Landroid/graphics/Bitmap;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Li4/m;->b:Ls4/j;

    iput-object p2, p0, Li4/m;->c:Li4/o;

    iput-object p3, p0, Li4/m;->d:Lt4/f;

    iput-object p4, p0, Li4/m;->e:Li4/e;

    iput-object p5, p0, Li4/m;->f:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance p1, Li4/m;

    iget-object v1, p0, Li4/m;->b:Ls4/j;

    iget-object v2, p0, Li4/m;->c:Li4/o;

    iget-object v3, p0, Li4/m;->d:Lt4/f;

    iget-object v4, p0, Li4/m;->e:Li4/e;

    iget-object v5, p0, Li4/m;->f:Landroid/graphics/Bitmap;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Li4/m;-><init>(Ls4/j;Li4/o;Lt4/f;Li4/e;Landroid/graphics/Bitmap;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Li4/m;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Li4/m;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Li4/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Li4/m;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p1, Ln4/l;

    iget-object v1, p0, Li4/m;->b:Ls4/j;

    iget-object v3, p0, Li4/m;->c:Li4/o;

    iget-object v5, v3, Li4/o;->e:Ljava/util/ArrayList;

    const/4 v6, 0x0

    iget-object v8, p0, Li4/m;->d:Lt4/f;

    iget-object v9, p0, Li4/m;->e:Li4/e;

    iget-object v3, p0, Li4/m;->f:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_2

    move v10, v2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    move v10, v3

    :goto_0
    move-object v3, p1

    move-object v4, v1

    move-object v7, v1

    invoke-direct/range {v3 .. v10}, Ln4/l;-><init>(Ls4/j;Ljava/util/List;ILs4/j;Lt4/f;Li4/e;Z)V

    iput v2, p0, Li4/m;->a:I

    invoke-virtual {p1, v1, p0}, Ln4/l;->b(Ls4/j;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object p1
.end method
