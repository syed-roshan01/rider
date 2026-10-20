.class public abstract Ll/o;
.super Landroid/widget/AutoCompleteTextView;


# static fields
.field public static final d:[I


# instance fields
.field public final a:Ll/p;

.field public final b:Ll/g0;

.field public final c:Ll/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x1010176

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/o;->d:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    invoke-static {p1}, Ll/s2;->a(Landroid/content/Context;)V

    const v0, 0x7f030036

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Ll/r2;->a(Landroid/view/View;Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v1, Ll/o;->d:[I

    invoke-static {p1, p2, v1, v0}, Ll/z2;->I(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z2;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/z2;->D(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ll/z2;->t(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {p1}, Ll/z2;->K()V

    new-instance p1, Ll/p;

    invoke-direct {p1, p0}, Ll/p;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/o;->a:Ll/p;

    invoke-virtual {p1, p2, v0}, Ll/p;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Ll/g0;

    invoke-direct {p1, p0}, Ll/g0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/o;->b:Ll/g0;

    invoke-virtual {p1, p2, v0}, Ll/g0;->d(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Ll/g0;->b()V

    new-instance p1, Ll/t;

    invoke-direct {p1, p0}, Ll/t;-><init>(Landroid/widget/EditText;)V

    iput-object p1, p0, Ll/o;->c:Ll/t;

    iget-object v2, p1, Ll/t;->b:Ljava/lang/Object;

    check-cast v2, Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lf/a;->g:[I

    invoke-virtual {v2, p2, v3, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/16 v0, 0xe

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    move v0, v2

    :goto_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p2, p1, Ll/t;->c:Ljava/lang/Object;

    check-cast p2, Lk3/b;

    iget-object p2, p2, Lk3/b;->d:Ljava/lang/Object;

    check-cast p2, Lx9/v;

    invoke-virtual {p2, v0}, Lx9/v;->I(Z)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object p2

    instance-of v0, p2, Landroid/text/method/NumberKeyListener;

    xor-int/2addr v0, v2

    if-eqz v0, :cond_4

    invoke-super {p0}, Landroid/view/View;->isFocusable()Z

    move-result v1

    invoke-super {p0}, Landroid/view/View;->isClickable()Z

    move-result v2

    invoke-super {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v3

    invoke-super {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v4

    if-eqz v0, :cond_2

    iget-object p1, p1, Ll/t;->c:Ljava/lang/Object;

    check-cast p1, Lk3/b;

    iget-object p1, p1, Lk3/b;->d:Ljava/lang/Object;

    check-cast p1, Lx9/v;

    invoke-virtual {p1, p2}, Lx9/v;->u(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, p2

    :goto_1
    if-ne p1, p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    invoke-super {p0, v4}, Landroid/widget/TextView;->setRawInputType(I)V

    invoke-super {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    invoke-super {p0, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-super {p0, v3}, Landroid/view/View;->setLongClickable(Z)V

    :cond_4
    :goto_2
    return-void

    :goto_3
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Ll/o;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/p;->a()V

    :cond_0
    iget-object v0, p0, Ll/o;->b:Ll/g0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/g0;->b()V

    :cond_1
    return-void
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 2

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    instance-of v1, v0, Le3/r;

    if-eqz v1, :cond_0

    check-cast v0, Le3/r;

    iget-object v0, v0, Le3/r;->a:Landroid/view/ActionMode$Callback;

    :cond_0
    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/o;->a:Ll/p;

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

    iget-object v0, p0, Ll/o;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/p;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/o;->b:Ll/g0;

    iget-object v0, v0, Ll/g0;->h:Ll/t2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/t2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/o;->b:Ll/g0;

    iget-object v0, v0, Ll/g0;->h:Ll/t2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/t2;->d:Ljava/io/Serializable;

    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    invoke-super {p0, p1}, Landroid/view/View;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/o;->c:Ll/t;

    iget-object v1, v1, Ll/t;->c:Ljava/lang/Object;

    check-cast v1, Lk3/b;

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v1, Lx9/v;

    invoke-virtual {v1, v0, p1}, Lx9/v;->E(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/o;->a:Ll/p;

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

    iget-object v0, p0, Ll/o;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->e(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/o;->b:Ll/g0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/o;->b:Ll/g0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p1, p0}, Li1/b;->N(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    iget-object v0, p0, Ll/o;->c:Ll/t;

    iget-object v0, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Lk3/b;

    iget-object v0, v0, Lk3/b;->d:Ljava/lang/Object;

    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1}, Lx9/v;->I(Z)V

    return-void
.end method

.method public setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 2

    iget-object v0, p0, Ll/o;->c:Ll/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Landroid/text/method/NumberKeyListener;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Lk3/b;

    iget-object v0, v0, Lk3/b;->d:Ljava/lang/Object;

    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1}, Lx9/v;->u(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/o;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->g(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/o;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->h(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Ll/o;->b:Ll/g0;

    iget-object v1, v0, Ll/g0;->h:Ll/t2;

    if-nez v1, :cond_0

    new-instance v1, Ll/t2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ll/g0;->h:Ll/t2;

    :cond_0
    iget-object v1, v0, Ll/g0;->h:Ll/t2;

    iput-object p1, v1, Ll/t2;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v1, Ll/t2;->b:Z

    iput-object v1, v0, Ll/g0;->b:Ll/t2;

    iput-object v1, v0, Ll/g0;->c:Ll/t2;

    iput-object v1, v0, Ll/g0;->d:Ll/t2;

    iput-object v1, v0, Ll/g0;->e:Ll/t2;

    iput-object v1, v0, Ll/g0;->f:Ll/t2;

    iput-object v1, v0, Ll/g0;->g:Ll/t2;

    invoke-virtual {v0}, Ll/g0;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Ll/o;->b:Ll/g0;

    iget-object v1, v0, Ll/g0;->h:Ll/t2;

    if-nez v1, :cond_0

    new-instance v1, Ll/t2;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ll/g0;->h:Ll/t2;

    :cond_0
    iget-object v1, v0, Ll/g0;->h:Ll/t2;

    iput-object p1, v1, Ll/t2;->d:Ljava/io/Serializable;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v1, Ll/t2;->a:Z

    iput-object v1, v0, Ll/g0;->b:Ll/t2;

    iput-object v1, v0, Ll/g0;->c:Ll/t2;

    iput-object v1, v0, Ll/g0;->d:Ll/t2;

    iput-object v1, v0, Ll/g0;->e:Ll/t2;

    iput-object v1, v0, Ll/g0;->f:Ll/t2;

    iput-object v1, v0, Ll/g0;->g:Ll/t2;

    invoke-virtual {v0}, Ll/g0;->b()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Ll/o;->b:Ll/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ll/g0;->e(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
