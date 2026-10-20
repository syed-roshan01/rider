.class public Ll/x;
.super Landroid/widget/ImageView;


# instance fields
.field public final a:Ll/p;

.field public final b:Ll/w;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1}, Ll/s2;->a(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll/x;->c:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Ll/r2;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Ll/p;

    invoke-direct {p1, p0}, Ll/p;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/x;->a:Ll/p;

    invoke-virtual {p1, v0, p2}, Ll/p;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Ll/w;

    invoke-direct {p1, p0}, Ll/w;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Ll/x;->b:Ll/w;

    invoke-virtual {p1, p2}, Ll/w;->b(I)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ImageView;->drawableStateChanged()V

    iget-object v0, p0, Ll/x;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/p;->a()V

    :cond_0
    iget-object v0, p0, Ll/x;->b:Ll/w;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/w;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/x;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/p;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/x;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/p;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Ll/x;->b:Ll/w;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/w;->d:Ljava/lang/Object;

    check-cast v1, Ll/t2;

    if-eqz v1, :cond_0

    iget-object v0, v1, Ll/t2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    :cond_0
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Ll/x;->b:Ll/w;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/w;->d:Ljava/lang/Object;

    check-cast v1, Ll/t2;

    if-eqz v1, :cond_0

    iget-object v0, v1, Ll/t2;->d:Ljava/io/Serializable;

    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    :cond_0
    return-object v0
.end method

.method public final hasOverlappingRendering()Z
    .locals 2

    iget-object v0, p0, Ll/x;->b:Ll/w;

    iget-object v0, v0, Ll/w;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/ImageView;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/x;->a:Ll/p;

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    iput v0, p1, Ll/p;->b:I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/p;->f(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p1}, Ll/p;->a()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Ll/x;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->e(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Ll/x;->b:Ll/w;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/w;->a()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Ll/x;->b:Ll/w;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-boolean v1, p0, Ll/x;->c:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v1

    iput v1, v0, Ll/w;->b:I

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/w;->a()V

    iget-boolean p1, p0, Ll/x;->c:Z

    if-nez p1, :cond_1

    iget-object p1, v0, Ll/w;->c:Ljava/lang/Object;

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, v0, Ll/w;->c:Ljava/lang/Object;

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v0, v0, Ll/w;->b:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    :cond_1
    return-void
.end method

.method public setImageLevel(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll/x;->c:Z

    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    iget-object v0, p0, Ll/x;->b:Ll/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/w;->c(I)V

    :cond_0
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Ll/x;->b:Ll/w;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/w;->a()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/x;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->g(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/x;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->h(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Ll/x;->b:Ll/w;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/w;->d:Ljava/lang/Object;

    check-cast v1, Ll/t2;

    if-nez v1, :cond_0

    new-instance v1, Ll/t2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ll/w;->d:Ljava/lang/Object;

    :cond_0
    iget-object v1, v0, Ll/w;->d:Ljava/lang/Object;

    check-cast v1, Ll/t2;

    iput-object p1, v1, Ll/t2;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v1, Ll/t2;->b:Z

    invoke-virtual {v0}, Ll/w;->a()V

    :cond_1
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Ll/x;->b:Ll/w;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/w;->d:Ljava/lang/Object;

    check-cast v1, Ll/t2;

    if-nez v1, :cond_0

    new-instance v1, Ll/t2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ll/w;->d:Ljava/lang/Object;

    :cond_0
    iget-object v1, v0, Ll/w;->d:Ljava/lang/Object;

    check-cast v1, Ll/t2;

    iput-object p1, v1, Ll/t2;->d:Ljava/io/Serializable;

    const/4 p1, 0x1

    iput-boolean p1, v1, Ll/t2;->a:Z

    invoke-virtual {v0}, Ll/w;->a()V

    :cond_1
    return-void
.end method
