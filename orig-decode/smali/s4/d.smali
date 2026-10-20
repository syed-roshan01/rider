.class public final Ls4/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/lifecycle/r;

.field public final b:Lt4/g;

.field public final c:Lt4/e;

.field public final d:Lm9/z;

.field public final e:Lm9/z;

.field public final f:Lm9/z;

.field public final g:Lm9/z;

.field public final h:Lv4/b;

.field public final i:Lt4/d;

.field public final j:Landroid/graphics/Bitmap$Config;

.field public final k:Ljava/lang/Boolean;

.field public final l:Ljava/lang/Boolean;

.field public final m:Ls4/b;

.field public final n:Ls4/b;

.field public final o:Ls4/b;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;Lt4/g;Lt4/e;Lm9/z;Lm9/z;Lm9/z;Lm9/z;Lv4/b;Lt4/d;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Ls4/b;Ls4/b;Ls4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls4/d;->a:Landroidx/lifecycle/r;

    iput-object p2, p0, Ls4/d;->b:Lt4/g;

    iput-object p3, p0, Ls4/d;->c:Lt4/e;

    iput-object p4, p0, Ls4/d;->d:Lm9/z;

    iput-object p5, p0, Ls4/d;->e:Lm9/z;

    iput-object p6, p0, Ls4/d;->f:Lm9/z;

    iput-object p7, p0, Ls4/d;->g:Lm9/z;

    iput-object p8, p0, Ls4/d;->h:Lv4/b;

    iput-object p9, p0, Ls4/d;->i:Lt4/d;

    iput-object p10, p0, Ls4/d;->j:Landroid/graphics/Bitmap$Config;

    iput-object p11, p0, Ls4/d;->k:Ljava/lang/Boolean;

    iput-object p12, p0, Ls4/d;->l:Ljava/lang/Boolean;

    iput-object p13, p0, Ls4/d;->m:Ls4/b;

    iput-object p14, p0, Ls4/d;->n:Ls4/b;

    iput-object p15, p0, Ls4/d;->o:Ls4/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls4/d;

    if-eqz v1, :cond_1

    check-cast p1, Ls4/d;

    iget-object v1, p1, Ls4/d;->a:Landroidx/lifecycle/r;

    iget-object v2, p0, Ls4/d;->a:Landroidx/lifecycle/r;

    invoke-static {v2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->b:Lt4/g;

    iget-object v2, p1, Ls4/d;->b:Lt4/g;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->c:Lt4/e;

    iget-object v2, p1, Ls4/d;->c:Lt4/e;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/d;->d:Lm9/z;

    iget-object v2, p1, Ls4/d;->d:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->e:Lm9/z;

    iget-object v2, p1, Ls4/d;->e:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->f:Lm9/z;

    iget-object v2, p1, Ls4/d;->f:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->g:Lm9/z;

    iget-object v2, p1, Ls4/d;->g:Lm9/z;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->h:Lv4/b;

    iget-object v2, p1, Ls4/d;->h:Lv4/b;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->i:Lt4/d;

    iget-object v2, p1, Ls4/d;->i:Lt4/d;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/d;->j:Landroid/graphics/Bitmap$Config;

    iget-object v2, p1, Ls4/d;->j:Landroid/graphics/Bitmap$Config;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/d;->k:Ljava/lang/Boolean;

    iget-object v2, p1, Ls4/d;->k:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->l:Ljava/lang/Boolean;

    iget-object v2, p1, Ls4/d;->l:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls4/d;->m:Ls4/b;

    iget-object v2, p1, Ls4/d;->m:Ls4/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/d;->n:Ls4/b;

    iget-object v2, p1, Ls4/d;->n:Ls4/b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls4/d;->o:Ls4/b;

    iget-object p1, p1, Ls4/d;->o:Ls4/b;

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ls4/d;->a:Landroidx/lifecycle/r;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->b:Lt4/g;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->c:Lt4/e;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->d:Lm9/z;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v0

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->e:Lm9/z;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v0

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->f:Lm9/z;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    move v2, v0

    :goto_5
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->g:Lm9/z;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    move v2, v0

    :goto_6
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->h:Lv4/b;

    if-eqz v2, :cond_7

    const-class v2, Lv4/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    move v2, v0

    :goto_7
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->i:Lt4/d;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    move v2, v0

    :goto_8
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->j:Landroid/graphics/Bitmap$Config;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_9

    :cond_9
    move v2, v0

    :goto_9
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->k:Ljava/lang/Boolean;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_a

    :cond_a
    move v2, v0

    :goto_a
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->l:Ljava/lang/Boolean;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_b

    :cond_b
    move v2, v0

    :goto_b
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->m:Ls4/b;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_c

    :cond_c
    move v2, v0

    :goto_c
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->n:Ls4/b;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_d

    :cond_d
    move v2, v0

    :goto_d
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ls4/d;->o:Ls4/b;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_e
    add-int/2addr v1, v0

    return v1
.end method
