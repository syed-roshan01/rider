.class public final Ll/a0;
.super Lt2/b;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/ref/WeakReference;

.field public final synthetic h:Ll/g0;


# direct methods
.method public constructor <init>(Ll/g0;IILjava/lang/ref/WeakReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/a0;->h:Ll/g0;

    iput p2, p0, Ll/a0;->e:I

    iput p3, p0, Ll/a0;->f:I

    iput-object p4, p0, Ll/a0;->g:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final e(Landroid/graphics/Typeface;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    const/4 v0, -0x1

    iget v1, p0, Ll/a0;->e:I

    if-eq v1, v0, :cond_1

    iget v0, p0, Ll/a0;->f:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v1, v0}, Ll/f0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Ll/a0;->h:Ll/g0;

    iget-boolean v1, v0, Ll/g0;->m:Z

    if-eqz v1, :cond_3

    iput-object p1, v0, Ll/g0;->l:Landroid/graphics/Typeface;

    iget-object v1, p0, Ll/a0;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    sget-object v2, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v1}, Lb3/e0;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, v0, Ll/g0;->j:I

    new-instance v3, Ll/b0;

    invoke-direct {v3, v0, v1, p1, v2}, Ll/b0;-><init>(Ll/g0;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    iget v0, v0, Ll/g0;->j:I

    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    :goto_1
    return-void
.end method
