.class public Ll/j0;
.super Landroid/widget/TextView;


# instance fields
.field public final a:Ll/p;

.field public final b:Ll/g0;

.field public final c:Ll/t;

.field public d:Ll/u;

.field public e:Z

.field public f:Lk/f;

.field public n:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 1
    invoke-direct {p0, p1, p2, v0}, Ll/j0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-static {p1}, Ll/s2;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll/j0;->e:Z

    const/4 p1, 0x0

    iput-object p1, p0, Ll/j0;->f:Lk/f;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Ll/r2;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    new-instance p1, Ll/p;

    invoke-direct {p1, p0}, Ll/p;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/j0;->a:Ll/p;

    .line 5
    invoke-virtual {p1, p2, p3}, Ll/p;->d(Landroid/util/AttributeSet;I)V

    .line 6
    new-instance p1, Ll/g0;

    invoke-direct {p1, p0}, Ll/g0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/j0;->b:Ll/g0;

    .line 7
    invoke-virtual {p1, p2, p3}, Ll/g0;->d(Landroid/util/AttributeSet;I)V

    .line 8
    invoke-virtual {p1}, Ll/g0;->b()V

    .line 9
    new-instance p1, Ll/t;

    invoke-direct {p1, p0}, Ll/t;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/j0;->c:Ll/t;

    .line 10
    invoke-direct {p0}, Ll/j0;->getEmojiTextViewHelper()Ll/u;

    move-result-object p1

    .line 11
    invoke-virtual {p1, p2, p3}, Ll/u;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic d(Ll/j0;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result p0

    return p0
.end method

.method public static synthetic e(Ll/j0;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static synthetic f(Ll/j0;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result p0

    return p0
.end method

.method public static synthetic g(Ll/j0;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Ll/u;
    .locals 1

    iget-object v0, p0, Ll/j0;->d:Ll/u;

    if-nez v0, :cond_0

    new-instance v0, Ll/u;

    invoke-direct {v0, p0}, Ll/u;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/j0;->d:Ll/u;

    :cond_0
    iget-object v0, p0, Ll/j0;->d:Ll/u;

    return-object v0
.end method

.method public static synthetic h(Ll/j0;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result p0

    return p0
.end method

.method public static synthetic i(Ll/j0;)[I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ll/j0;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result p0

    return p0
.end method

.method public static synthetic k(Ll/j0;)Landroid/view/textclassifier/TextClassifier;
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ll/j0;IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void
.end method

.method public static synthetic m(Ll/j0;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void
.end method

.method public static synthetic n(Ll/j0;Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, Ll/j0;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/p;->a()V

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/g0;->b()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0}, Ll/j0;->d(Ll/j0;)I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    iget v0, v0, Ll/q0;->e:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0}, Ll/j0;->f(Ll/j0;)I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    iget v0, v0, Ll/q0;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0}, Ll/j0;->h(Ll/j0;)I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    iget v0, v0, Ll/q0;->c:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0}, Ll/j0;->i(Ll/j0;)[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    iget-object v0, v0, Ll/q0;->f:[I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3

    sget-boolean v0, Ll/o3;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0}, Ll/j0;->j(Ll/j0;)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    iget v0, v0, Ll/q0;->a:I

    return v0

    :cond_2
    return v1
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

.method public getFirstBaselineToTopHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSuperCaller()Ll/h0;
    .locals 2

    iget-object v0, p0, Ll/j0;->f:Lk/f;

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Ll/i0;

    invoke-direct {v0, p0}, Ll/i0;-><init>(Ll/j0;)V

    iput-object v0, p0, Ll/j0;->f:Lk/f;

    goto :goto_0

    :cond_0
    new-instance v0, Lk/f;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lk/f;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ll/j0;->f:Lk/f;

    :cond_1
    :goto_0
    iget-object v0, p0, Ll/j0;->f:Lk/f;

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/j0;->a:Ll/p;

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

    iget-object v0, p0, Ll/j0;->a:Ll/p;

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

    iget-object v0, p0, Ll/j0;->b:Ll/g0;

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

    iget-object v0, p0, Ll/j0;->b:Ll/g0;

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

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Ll/j0;->o()V

    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Ll/j0;->c:Ll/t;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/textclassifier/TextClassifier;

    if-nez v1, :cond_1

    iget-object v0, v0, Ll/t;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Ll/z;->a(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0}, Ll/j0;->k(Ll/j0;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()Lz2/b;
    .locals 1

    invoke-static {p0}, Li1/b;->t(Landroid/widget/TextView;)Lz2/b;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Ll/j0;->n:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Ll/j0;->n:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    throw v1

    :cond_1
    invoke-static {p0}, Li1/b;->t(Landroid/widget/TextView;)Lz2/b;

    throw v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    iget-object v1, p0, Ll/j0;->b:Ll/g0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p1, v1}, Lz6/a;->e0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_0

    sget-boolean p2, Ll/o3;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Ll/g0;->i:Ll/q0;

    invoke-virtual {p1}, Ll/q0;->a()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-virtual {p0}, Ll/j0;->o()V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_0

    sget-boolean p2, Ll/o3;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Ll/g0;->i:Ll/q0;

    iget p2, p1, Ll/q0;->a:I

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ll/q0;->a()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Ll/j0;->getEmojiTextViewHelper()Ll/u;

    move-result-object v0

    iget-object v0, v0, Ll/u;->b:Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1}, Lx9/v;->H(Z)V

    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 2

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0, p1, p2, p3, p4}, Ll/j0;->l(Ll/j0;IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    iget-object v1, v0, Ll/q0;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Ll/q0;->i(FFF)V

    invoke-virtual {v0}, Ll/q0;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ll/q0;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 6

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-super {v0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_3

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_5

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    new-array v3, v1, [I

    if-nez p2, :cond_1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_1

    :cond_1
    iget-object v4, v0, Ll/q0;->j:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_0
    if-ge v2, v1, :cond_2

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-static {v3}, Ll/q0;->b([I)[I

    move-result-object p2

    iput-object p2, v0, Ll/q0;->f:[I

    invoke-virtual {v0}, Ll/q0;->h()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "None of the preset sizes is valid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    iput-boolean v2, v0, Ll/q0;->g:Z

    :goto_2
    invoke-virtual {v0}, Ll/q0;->g()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Ll/q0;->a()V

    :cond_5
    :goto_3
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 4

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0, p1}, Ll/j0;->m(Ll/j0;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_3

    iget-object v0, v0, Ll/g0;->i:Ll/q0;

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    iget-object p1, v0, Ll/q0;->j:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v1, 0x41400000    # 12.0f

    const/4 v2, 0x2

    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, p1, v2}, Ll/q0;->i(FFF)V

    invoke-virtual {v0}, Ll/q0;->g()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Ll/q0;->a()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown auto-size text type: "

    invoke-static {v1, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 p1, 0x0

    iput p1, v0, Ll/q0;->a:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Ll/q0;->d:F

    iput v1, v0, Ll/q0;->e:F

    iput v1, v0, Ll/q0;->c:F

    new-array v1, p1, [I

    iput-object v1, v0, Ll/q0;->f:[I

    iput-boolean p1, v0, Ll/q0;->b:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->a:Ll/p;

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

    iget-object v0, p0, Ll/j0;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->e(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 4
    invoke-static {v0, p1}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 5
    invoke-static {v0, p2}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 6
    invoke-static {v0, p3}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 7
    invoke-static {v0, p4}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 8
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Ll/j0;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 4
    invoke-static {v0, p1}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 5
    invoke-static {v0, p2}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 6
    invoke-static {v0, p3}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 7
    invoke-static {v0, p4}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 8
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Ll/j0;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Ll/g0;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/j0;->b:Ll/g0;

    if-eqz p1, :cond_0

    .line 2
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

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Ll/j0;->getEmojiTextViewHelper()Ll/u;

    move-result-object v0

    iget-object v0, v0, Ll/u;->b:Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1}, Lx9/v;->I(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Ll/j0;->getEmojiTextViewHelper()Ll/u;

    move-result-object v0

    iget-object v0, v0, Ll/u;->b:Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1}, Lx9/v;->s([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/h0;->l(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Li1/b;->G(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/h0;->e(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Li1/b;->H(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLineHeight(I)V
    .locals 2

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public setPrecomputedText(Lz2/c;)V
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    throw v1

    :cond_0
    invoke-static {p0}, Li1/b;->t(Landroid/widget/TextView;)Lz2/b;

    throw v1
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/j0;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->g(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/j0;->a:Ll/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/p;->h(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Ll/j0;->b:Ll/g0;

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

    iget-object v0, p0, Ll/j0;->b:Ll/g0;

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

    iget-object v0, p0, Ll/j0;->b:Ll/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ll/g0;->e(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Ll/j0;->c:Ll/t;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, Ll/t;->c:Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/j0;->getSuperCaller()Ll/h0;

    move-result-object v0

    check-cast v0, Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/j0;

    invoke-static {v0, p1}, Ll/j0;->n(Ll/j0;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Lz2/c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll/j0;->n:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTextMetricsParamsCompat(Lz2/b;)V
    .locals 5

    iget-object v0, p1, Lz2/b;->b:Landroid/text/TextDirectionHeuristic;

    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v4, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_2

    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_3

    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    sget-object v4, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_4

    const/4 v2, 0x4

    goto :goto_0

    :cond_4
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_5

    const/4 v2, 0x5

    goto :goto_0

    :cond_5
    if-ne v0, v3, :cond_6

    const/4 v2, 0x6

    goto :goto_0

    :cond_6
    if-ne v0, v1, :cond_7

    const/4 v2, 0x7

    :cond_7
    :goto_0
    invoke-static {p0, v2}, Le3/n;->h(Landroid/view/View;I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p1, Lz2/b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    iget v0, p1, Lz2/b;->c:I

    invoke-static {p0, v0}, Le3/o;->e(Landroid/widget/TextView;I)V

    iget p1, p1, Lz2/b;->d:I

    invoke-static {p0, p1}, Le3/o;->h(Landroid/widget/TextView;I)V

    return-void
.end method

.method public final setTextSize(IF)V
    .locals 2

    sget-boolean v0, Ll/o3;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/j0;->b:Ll/g0;

    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    iget-object v0, v1, Ll/g0;->i:Ll/q0;

    iget v1, v0, Ll/q0;->a:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, p2}, Ll/q0;->f(IF)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;I)V
    .locals 2

    iget-boolean v0, p0, Ll/j0;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-lez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lu2/f;->a:Lk/f;

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/j0;->e:Z

    if-eqz v0, :cond_3

    move-object p1, v0

    :cond_3
    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Ll/j0;->e:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ll/j0;->e:Z

    throw p1
.end method
