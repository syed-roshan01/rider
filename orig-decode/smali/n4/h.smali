.class public final Ln4/h;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ljava/util/List;

.field public b:Ls4/n;

.field public c:I

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic n:Ln4/i;

.field public final synthetic o:Ln4/a;

.field public final synthetic p:Ls4/n;

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Li4/e;

.field public final synthetic s:Ls4/j;


# direct methods
.method public constructor <init>(Ln4/i;Ln4/a;Ls4/n;Ljava/util/List;Li4/e;Ls4/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/h;->n:Ln4/i;

    iput-object p2, p0, Ln4/h;->o:Ln4/a;

    iput-object p3, p0, Ln4/h;->p:Ls4/n;

    iput-object p4, p0, Ln4/h;->q:Ljava/util/List;

    iput-object p5, p0, Ln4/h;->r:Li4/e;

    iput-object p6, p0, Ln4/h;->s:Ls4/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 9

    new-instance v8, Ln4/h;

    iget-object v1, p0, Ln4/h;->n:Ln4/i;

    iget-object v2, p0, Ln4/h;->o:Ln4/a;

    iget-object v3, p0, Ln4/h;->p:Ls4/n;

    iget-object v4, p0, Ln4/h;->q:Ljava/util/List;

    iget-object v5, p0, Ln4/h;->r:Li4/e;

    iget-object v6, p0, Ln4/h;->s:Ls4/j;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ln4/h;-><init>(Ln4/i;Ln4/a;Ls4/n;Ljava/util/List;Li4/e;Ls4/j;Lu8/e;)V

    iput-object p1, v8, Ln4/h;->f:Ljava/lang/Object;

    return-object v8
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ln4/h;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Ln4/h;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Ln4/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v0, p0, Ln4/h;->e:I

    iget-object v1, p0, Ln4/h;->r:Li4/e;

    iget-object v2, p0, Ln4/h;->o:Ln4/a;

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v3, :cond_0

    iget v0, p0, Ln4/h;->d:I

    iget v4, p0, Ln4/h;->c:I

    iget-object v5, p0, Ln4/h;->b:Ls4/n;

    iget-object v6, p0, Ln4/h;->a:Ljava/util/List;

    check-cast v6, Ljava/util/List;

    iget-object v7, p0, Ln4/h;->f:Ljava/lang/Object;

    check-cast v7, Lm9/d0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-interface {v7}, Lm9/d0;->q()Lu8/j;

    move-result-object v8

    invoke-static {v8}, Lh6/g;->S(Lu8/j;)V

    add-int/2addr v4, v3

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Ln4/h;->f:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lm9/d0;

    iget-object p1, v2, Ln4/a;->a:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Ln4/h;->n:Ln4/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v5, p0, Ln4/h;->p:Ls4/n;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    if-nez v4, :cond_2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_2
    sget-object v6, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v6}, Lb9/b;->F(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object p1, v0

    goto :goto_0

    :cond_3
    iget-object v0, v5, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    iget-object v4, v5, Ls4/n;->d:Lt4/f;

    iget-object v6, v5, Ls4/n;->e:Lt4/e;

    iget-boolean v8, v5, Ls4/n;->f:Z

    invoke-static {p1, v0, v4, v6, v8}, Lw4/g;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lt4/f;Lt4/e;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, p0, Ln4/h;->q:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x0

    :goto_1
    if-lt v4, v0, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ln4/h;->s:Ls4/j;

    iget-object v0, v0, Ls4/j;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-boolean p1, v2, Ln4/a;->b:Z

    new-instance v0, Ln4/a;

    iget-object v3, v2, Ln4/a;->c:Lk4/f;

    iget-object v2, v2, Ln4/a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v3, v2}, Ln4/a;-><init>(Landroid/graphics/drawable/Drawable;ZLk4/f;Ljava/lang/String;)V

    return-object v0

    :cond_4
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    iget-object p1, v5, Ls4/n;->d:Lt4/f;

    iput-object v7, p0, Ln4/h;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iput-object v6, p0, Ln4/h;->a:Ljava/util/List;

    iput-object v5, p0, Ln4/h;->b:Ls4/n;

    iput v4, p0, Ln4/h;->c:I

    iput v0, p0, Ln4/h;->d:I

    iput v3, p0, Ln4/h;->e:I

    const/4 p1, 0x0

    throw p1
.end method
