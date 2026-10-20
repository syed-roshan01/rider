.class public final Ls4/c;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lm9/z;

.field public final b:Lm9/z;

.field public final c:Lm9/z;

.field public final d:Lm9/z;

.field public final e:Lv4/b;

.field public final f:Lt4/d;

.field public final g:Landroid/graphics/Bitmap$Config;

.field public final h:Z

.field public final i:Z

.field public final j:Landroid/graphics/drawable/Drawable;

.field public final k:Landroid/graphics/drawable/Drawable;

.field public final l:Landroid/graphics/drawable/Drawable;

.field public final m:Ls4/b;

.field public final n:Ls4/b;

.field public final o:Ls4/b;


# direct methods
.method public constructor <init>()V
    .locals 6

    sget-object v0, Lm9/m0;->a:Lt9/d;

    sget-object v0, Lr9/o;->a:Lm9/s1;

    check-cast v0, Ln9/d;

    iget-object v0, v0, Ln9/d;->f:Ln9/d;

    sget-object v1, Lm9/m0;->b:Lt9/c;

    sget-object v2, Lv4/b;->a:Lv4/a;

    sget-object v3, Lt4/d;->c:Lt4/d;

    sget-object v4, Lw4/e;->b:Landroid/graphics/Bitmap$Config;

    sget-object v5, Ls4/b;->c:Ls4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls4/c;->a:Lm9/z;

    iput-object v1, p0, Ls4/c;->b:Lm9/z;

    iput-object v1, p0, Ls4/c;->c:Lm9/z;

    iput-object v1, p0, Ls4/c;->d:Lm9/z;

    iput-object v2, p0, Ls4/c;->e:Lv4/b;

    iput-object v3, p0, Ls4/c;->f:Lt4/d;

    iput-object v4, p0, Ls4/c;->g:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls4/c;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls4/c;->i:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ls4/c;->j:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Ls4/c;->k:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Ls4/c;->l:Landroid/graphics/drawable/Drawable;

    iput-object v5, p0, Ls4/c;->m:Ls4/b;

    iput-object v5, p0, Ls4/c;->n:Ls4/b;

    iput-object v5, p0, Ls4/c;->o:Ls4/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls4/c;

    if-eqz v1, :cond_1

    check-cast p1, Ls4/c;

    iget-object v1, p1, Ls4/c;->a:Lm9/z;

    iget-object v2, p0, Ls4/c;->a:Lm9/z;

    invoke-static {v2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->b:Lm9/z;

    iget-object v2, p1, Ls4/c;->b:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->c:Lm9/z;

    iget-object v2, p1, Ls4/c;->c:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->d:Lm9/z;

    iget-object v2, p1, Ls4/c;->d:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->e:Lv4/b;

    iget-object v2, p1, Ls4/c;->e:Lv4/b;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->f:Lt4/d;

    iget-object v2, p1, Ls4/c;->f:Lt4/d;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/c;->g:Landroid/graphics/Bitmap$Config;

    iget-object v2, p1, Ls4/c;->g:Landroid/graphics/Bitmap$Config;

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ls4/c;->h:Z

    iget-boolean v2, p1, Ls4/c;->h:Z

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ls4/c;->i:Z

    iget-boolean v2, p1, Ls4/c;->i:Z

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/c;->j:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Ls4/c;->j:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->k:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Ls4/c;->k:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->l:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Ls4/c;->l:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/c;->m:Ls4/b;

    iget-object v2, p1, Ls4/c;->m:Ls4/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/c;->n:Ls4/b;

    iget-object v2, p1, Ls4/c;->n:Ls4/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/c;->o:Ls4/b;

    iget-object p1, p1, Ls4/c;->o:Ls4/b;

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ls4/c;->a:Lm9/z;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/c;->b:Lm9/z;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/c;->c:Lm9/z;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/c;->d:Lm9/z;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/c;->e:Lv4/b;

    check-cast v0, Lv4/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v0, Lv4/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/c;->f:Lt4/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/c;->g:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ls4/c;->h:Z

    invoke-static {v2, v0, v1}, Ll/q;->c(ZII)I

    move-result v0

    iget-boolean v2, p0, Ls4/c;->i:Z

    invoke-static {v2, v0, v1}, Ll/q;->c(ZII)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ls4/c;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ls4/c;->k:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ls4/c;->l:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/c;->m:Ls4/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/c;->n:Ls4/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ls4/c;->o:Ls4/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
