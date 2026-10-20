.class public final Ls4/n;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/graphics/Bitmap$Config;

.field public final c:Landroid/graphics/ColorSpace;

.field public final d:Lt4/f;

.field public final e:Lt4/e;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Lx9/q;

.field public final k:Ls4/r;

.field public final l:Ls4/o;

.field public final m:Ls4/b;

.field public final n:Ls4/b;

.field public final o:Ls4/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lt4/f;Lt4/e;ZZZLjava/lang/String;Lx9/q;Ls4/r;Ls4/o;Ls4/b;Ls4/b;Ls4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls4/n;->a:Landroid/content/Context;

    iput-object p2, p0, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    iput-object p3, p0, Ls4/n;->c:Landroid/graphics/ColorSpace;

    iput-object p4, p0, Ls4/n;->d:Lt4/f;

    iput-object p5, p0, Ls4/n;->e:Lt4/e;

    iput-boolean p6, p0, Ls4/n;->f:Z

    iput-boolean p7, p0, Ls4/n;->g:Z

    iput-boolean p8, p0, Ls4/n;->h:Z

    iput-object p9, p0, Ls4/n;->i:Ljava/lang/String;

    iput-object p10, p0, Ls4/n;->j:Lx9/q;

    iput-object p11, p0, Ls4/n;->k:Ls4/r;

    iput-object p12, p0, Ls4/n;->l:Ls4/o;

    iput-object p13, p0, Ls4/n;->m:Ls4/b;

    iput-object p14, p0, Ls4/n;->n:Ls4/b;

    iput-object p15, p0, Ls4/n;->o:Ls4/b;

    return-void
.end method

.method public static a(Ls4/n;Landroid/graphics/Bitmap$Config;)Ls4/n;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Ls4/n;->a:Landroid/content/Context;

    iget-object v3, v0, Ls4/n;->c:Landroid/graphics/ColorSpace;

    iget-object v4, v0, Ls4/n;->d:Lt4/f;

    iget-object v5, v0, Ls4/n;->e:Lt4/e;

    iget-boolean v6, v0, Ls4/n;->f:Z

    iget-boolean v7, v0, Ls4/n;->g:Z

    iget-boolean v8, v0, Ls4/n;->h:Z

    iget-object v9, v0, Ls4/n;->i:Ljava/lang/String;

    iget-object v10, v0, Ls4/n;->j:Lx9/q;

    iget-object v11, v0, Ls4/n;->k:Ls4/r;

    iget-object v12, v0, Ls4/n;->l:Ls4/o;

    iget-object v13, v0, Ls4/n;->m:Ls4/b;

    iget-object v14, v0, Ls4/n;->n:Ls4/b;

    iget-object v15, v0, Ls4/n;->o:Ls4/b;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v16, Ls4/n;

    move-object/from16 v0, v16

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v15}, Ls4/n;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lt4/f;Lt4/e;ZZZLjava/lang/String;Lx9/q;Ls4/r;Ls4/o;Ls4/b;Ls4/b;Ls4/b;)V

    return-object v16
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls4/n;

    if-eqz v1, :cond_1

    check-cast p1, Ls4/n;

    iget-object v1, p1, Ls4/n;->a:Landroid/content/Context;

    iget-object v2, p0, Ls4/n;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    iget-object v2, p1, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/n;->c:Landroid/graphics/ColorSpace;

    iget-object v2, p1, Ls4/n;->c:Landroid/graphics/ColorSpace;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->d:Lt4/f;

    iget-object v2, p1, Ls4/n;->d:Lt4/f;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->e:Lt4/e;

    iget-object v2, p1, Ls4/n;->e:Lt4/e;

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ls4/n;->f:Z

    iget-boolean v2, p1, Ls4/n;->f:Z

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ls4/n;->g:Z

    iget-boolean v2, p1, Ls4/n;->g:Z

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, Ls4/n;->h:Z

    iget-boolean v2, p1, Ls4/n;->h:Z

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/n;->i:Ljava/lang/String;

    iget-object v2, p1, Ls4/n;->i:Ljava/lang/String;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->j:Lx9/q;

    iget-object v2, p1, Ls4/n;->j:Lx9/q;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->k:Ls4/r;

    iget-object v2, p1, Ls4/n;->k:Ls4/r;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->l:Ls4/o;

    iget-object v2, p1, Ls4/n;->l:Ls4/o;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/n;->m:Ls4/b;

    iget-object v2, p1, Ls4/n;->m:Ls4/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/n;->n:Ls4/b;

    iget-object v2, p1, Ls4/n;->n:Ls4/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/n;->o:Ls4/b;

    iget-object p1, p1, Ls4/n;->o:Ls4/b;

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ls4/n;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    iget-object v3, p0, Ls4/n;->c:Landroid/graphics/ColorSpace;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Ls4/n;->d:Lt4/f;

    invoke-virtual {v3}, Lt4/f;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    mul-int/2addr v3, v1

    iget-object v2, p0, Ls4/n;->e:Lt4/e;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v3, p0, Ls4/n;->f:Z

    invoke-static {v3, v2, v1}, Ll/q;->c(ZII)I

    move-result v2

    iget-boolean v3, p0, Ls4/n;->g:Z

    invoke-static {v3, v2, v1}, Ll/q;->c(ZII)I

    move-result v2

    iget-boolean v3, p0, Ls4/n;->h:Z

    invoke-static {v3, v2, v1}, Ll/q;->c(ZII)I

    move-result v2

    iget-object v3, p0, Ls4/n;->i:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/n;->j:Lx9/q;

    iget-object v0, v0, Lx9/q;->a:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/n;->k:Ls4/r;

    iget-object v0, v0, Ls4/r;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/n;->l:Ls4/o;

    iget-object v2, v2, Ls4/o;->a:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/n;->m:Ls4/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls4/n;->n:Ls4/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls4/n;->o:Ls4/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
