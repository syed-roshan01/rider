.class public final Ln4/g;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Ln4/i;

.field public final synthetic c:Ls4/j;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ls4/n;

.field public final synthetic f:Li4/e;

.field public final synthetic n:Lq4/c;

.field public final synthetic o:Ln4/l;


# direct methods
.method public constructor <init>(Ln4/i;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lq4/c;Ln4/l;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/g;->b:Ln4/i;

    iput-object p2, p0, Ln4/g;->c:Ls4/j;

    iput-object p3, p0, Ln4/g;->d:Ljava/lang/Object;

    iput-object p4, p0, Ln4/g;->e:Ls4/n;

    iput-object p5, p0, Ln4/g;->f:Li4/e;

    iput-object p6, p0, Ln4/g;->n:Lq4/c;

    iput-object p7, p0, Ln4/g;->o:Ln4/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 9

    new-instance p1, Ln4/g;

    iget-object v1, p0, Ln4/g;->b:Ln4/i;

    iget-object v2, p0, Ln4/g;->c:Ls4/j;

    iget-object v3, p0, Ln4/g;->d:Ljava/lang/Object;

    iget-object v4, p0, Ln4/g;->e:Ls4/n;

    iget-object v5, p0, Ln4/g;->f:Li4/e;

    iget-object v6, p0, Ln4/g;->n:Lq4/c;

    iget-object v7, p0, Ln4/g;->o:Ln4/l;

    move-object v0, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Ln4/g;-><init>(Ln4/i;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lq4/c;Ln4/l;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ln4/g;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Ln4/g;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Ln4/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Ln4/g;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v3, p0, Ln4/g;->b:Ln4/i;

    iget-object v4, p0, Ln4/g;->c:Ls4/j;

    iget-object v5, p0, Ln4/g;->d:Ljava/lang/Object;

    iget-object v6, p0, Ln4/g;->e:Ls4/n;

    iget-object v7, p0, Ln4/g;->f:Li4/e;

    iput v2, p0, Ln4/g;->a:I

    move-object v8, p0

    invoke-static/range {v3 .. v8}, Ln4/i;->b(Ln4/i;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ln4/a;

    iget-object v0, p0, Ln4/g;->b:Ln4/i;

    iget-object v0, v0, Ln4/i;->c:Lq4/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ln4/g;->c:Ls4/j;

    iget-object v1, v1, Ls4/j;->t:Ls4/b;

    iget-boolean v1, v1, Ls4/b;->b:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Ln4/g;->n:Lq4/c;

    if-nez v1, :cond_4

    :cond_3
    :goto_1
    move v0, v3

    goto :goto_3

    :cond_4
    iget-object v0, v0, Lq4/e;->a:Li4/i;

    check-cast v0, Li4/o;

    iget-object v0, v0, Li4/o;->b:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq4/f;

    if-eqz v0, :cond_3

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    iget-object v1, p1, Ln4/a;->a:Landroid/graphics/drawable/Drawable;

    instance-of v6, v1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v6, :cond_6

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_2

    :cond_6
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    iget-boolean v7, p1, Ln4/a;->b:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const-string v8, "coil#is_sampled"

    invoke-interface {v6, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, p1, Ln4/a;->d:Ljava/lang/String;

    if-eqz v7, :cond_8

    const-string v8, "coil#disk_cache_key"

    invoke-interface {v6, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v7, v5, Lq4/c;->b:Ljava/util/Map;

    invoke-static {v7}, Ly3/e;->G0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    new-instance v8, Lq4/c;

    iget-object v9, v5, Lq4/c;->a:Ljava/lang/String;

    invoke-direct {v8, v9, v7}, Lq4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v6}, Ly3/e;->G0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    iget-object v0, v0, Lq4/f;->a:Lq4/l;

    invoke-interface {v0, v8, v1, v6}, Lq4/l;->c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;)V

    move v0, v2

    :goto_3
    iget-object v7, p1, Ln4/a;->a:Landroid/graphics/drawable/Drawable;

    iget-object v8, p0, Ln4/g;->c:Ls4/j;

    iget-object v9, p1, Ln4/a;->c:Lk4/f;

    if-eqz v0, :cond_9

    move-object v10, v5

    goto :goto_4

    :cond_9
    move-object v10, v4

    :goto_4
    iget-object v11, p1, Ln4/a;->d:Ljava/lang/String;

    iget-boolean v12, p1, Ln4/a;->b:Z

    sget-object p1, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    iget-object p1, p0, Ln4/g;->o:Ln4/l;

    instance-of v0, p1, Ln4/l;

    if-eqz v0, :cond_a

    iget-boolean p1, p1, Ln4/l;->g:Z

    if-eqz p1, :cond_a

    move v13, v2

    goto :goto_5

    :cond_a
    move v13, v3

    :goto_5
    new-instance p1, Ls4/q;

    move-object v6, p1

    invoke-direct/range {v6 .. v13}, Ls4/q;-><init>(Landroid/graphics/drawable/Drawable;Ls4/j;Lk4/f;Lq4/c;Ljava/lang/String;ZZ)V

    return-object p1
.end method
