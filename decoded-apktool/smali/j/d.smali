.class public final Lj/d;
.super Ljava/lang/Object;


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Landroid/content/res/ColorStateList;

.field public C:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic D:Lj/e;

.field public final a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Lj/e;Landroid/view/Menu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d;->D:Lj/e;

    const/4 p1, 0x0

    iput-object p1, p0, Lj/d;->B:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Lj/d;->C:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Lj/d;->a:Landroid/view/Menu;

    const/4 p1, 0x0

    iput p1, p0, Lj/d;->b:I

    iput p1, p0, Lj/d;->c:I

    iput p1, p0, Lj/d;->d:I

    iput p1, p0, Lj/d;->e:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj/d;->f:Z

    iput-boolean p1, p0, Lj/d;->g:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj/d;->D:Lj/e;

    iget-object v0, v0, Lj/e;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p2, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Cannot instantiate class: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "SupportMenuInflater"

    invoke-static {p3, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Landroid/view/MenuItem;)V
    .locals 7

    iget-boolean v0, p0, Lj/d;->s:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lj/d;->t:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lj/d;->u:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lj/d;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lj/d;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lj/d;->m:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    iget v0, p0, Lj/d;->v:I

    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    :cond_1
    iget-object v0, p0, Lj/d;->y:Ljava/lang/String;

    iget-object v1, p0, Lj/d;->D:Lj/e;

    if-eqz v0, :cond_4

    iget-object v0, v1, Lj/e;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lj/c;

    iget-object v4, v1, Lj/e;->d:Ljava/lang/Object;

    if-nez v4, :cond_2

    iget-object v4, v1, Lj/e;->c:Landroid/content/Context;

    invoke-static {v4}, Lj/e;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lj/e;->d:Ljava/lang/Object;

    :cond_2
    iget-object v4, v1, Lj/e;->d:Ljava/lang/Object;

    iget-object v5, p0, Lj/d;->y:Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v4, v0, Lj/c;->a:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    :try_start_0
    sget-object v6, Lj/c;->c:[Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    iput-object v6, v0, Lj/c;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Landroid/view/InflateException;

    const-string v1, "Couldn\'t resolve menu item onClick handler "

    const-string v2, " in class "

    invoke-static {v1, v5, v2}, La7/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iget v0, p0, Lj/d;->r:I

    const/4 v4, 0x2

    if-lt v0, v4, :cond_5

    instance-of v0, p1, Lk/m;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lk/m;

    iget v4, v0, Lk/m;->x:I

    and-int/lit8 v4, v4, -0x5

    or-int/lit8 v4, v4, 0x4

    iput v4, v0, Lk/m;->x:I

    :cond_5
    iget-object v0, p0, Lj/d;->x:Ljava/lang/String;

    if-eqz v0, :cond_6

    sget-object v2, Lj/e;->e:[Ljava/lang/Class;

    iget-object v1, v1, Lj/e;->a:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v2, v1}, Lj/d;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    move v2, v3

    :cond_6
    iget v0, p0, Lj/d;->w:I

    if-lez v0, :cond_8

    if-nez v2, :cond_7

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    goto :goto_2

    :cond_7
    const-string v0, "SupportMenuInflater"

    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_2
    iget-object v0, p0, Lj/d;->z:Ljava/lang/CharSequence;

    instance-of v1, p1, Lw2/b;

    if-eqz v1, :cond_9

    move-object v2, p1

    check-cast v2, Lw2/b;

    invoke-interface {v2, v0}, Lw2/b;->setContentDescription(Ljava/lang/CharSequence;)Lw2/b;

    goto :goto_3

    :cond_9
    invoke-static {p1, v0}, Lb3/n;->h(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :goto_3
    iget-object v0, p0, Lj/d;->A:Ljava/lang/CharSequence;

    if-eqz v1, :cond_a

    move-object v2, p1

    check-cast v2, Lw2/b;

    invoke-interface {v2, v0}, Lw2/b;->setTooltipText(Ljava/lang/CharSequence;)Lw2/b;

    goto :goto_4

    :cond_a
    invoke-static {p1, v0}, Lb3/n;->m(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :goto_4
    iget-char v0, p0, Lj/d;->n:C

    iget v2, p0, Lj/d;->o:I

    if-eqz v1, :cond_b

    move-object v3, p1

    check-cast v3, Lw2/b;

    invoke-interface {v3, v0, v2}, Lw2/b;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    goto :goto_5

    :cond_b
    invoke-static {p1, v0, v2}, Lb3/n;->g(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :goto_5
    iget-char v0, p0, Lj/d;->p:C

    iget v2, p0, Lj/d;->q:I

    if-eqz v1, :cond_c

    move-object v3, p1

    check-cast v3, Lw2/b;

    invoke-interface {v3, v0, v2}, Lw2/b;->setNumericShortcut(CI)Landroid/view/MenuItem;

    goto :goto_6

    :cond_c
    invoke-static {p1, v0, v2}, Lb3/n;->k(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :goto_6
    iget-object v0, p0, Lj/d;->C:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_e

    if-eqz v1, :cond_d

    move-object v2, p1

    check-cast v2, Lw2/b;

    invoke-interface {v2, v0}, Lw2/b;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    goto :goto_7

    :cond_d
    invoke-static {p1, v0}, Lb3/n;->j(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    :cond_e
    :goto_7
    iget-object v0, p0, Lj/d;->B:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_10

    if-eqz v1, :cond_f

    check-cast p1, Lw2/b;

    invoke-interface {p1, v0}, Lw2/b;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    goto :goto_8

    :cond_f
    invoke-static {p1, v0}, Lb3/n;->i(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    :cond_10
    :goto_8
    return-void
.end method
