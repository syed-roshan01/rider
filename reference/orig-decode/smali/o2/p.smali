.class public final Lo2/p;
.super Landroidx/activity/r;


# instance fields
.field public d:Lc9/a;

.field public e:Lo2/o;

.field public final f:Landroid/view/View;

.field public final n:Lo2/n;

.field public final o:I


# direct methods
.method public constructor <init>(Lc9/a;Lo2/o;Landroid/view/View;Lm2/l;Lm2/b;Ljava/util/UUID;)V
    .locals 5

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-ge v2, v3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    const v2, 0x7f0f00a2

    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroidx/activity/r;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lo2/p;->d:Lc9/a;

    iput-object p2, p0, Lo2/p;->e:Lo2/o;

    iput-object p3, p0, Lo2/p;->f:Landroid/view/View;

    const/16 p1, 0x8

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    and-int/lit16 v0, v0, 0xf0

    iput v0, p0, Lo2/p;->o:I

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/Window;->requestFeature(I)Z

    const v2, 0x106000d

    invoke-virtual {p2, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    iget-object v2, p0, Lo2/p;->e:Lo2/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v0}, Lo1/s;->k0(Landroid/view/Window;Z)V

    new-instance v2, Lo2/n;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p2}, Lo2/n;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Dialog:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    const v3, 0x7f080057

    invoke-virtual {v2, v3, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p5, p1}, Lm2/b;->v(F)F

    move-result p1

    invoke-virtual {v2, p1}, Landroid/view/View;->setElevation(F)V

    new-instance p1, Lu1/z2;

    invoke-direct {p1, v0}, Lu1/z2;-><init>(I)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iput-object v2, p0, Lo2/p;->n:Lo2/n;

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    instance-of p2, p1, Landroid/view/ViewGroup;

    if-eqz p2, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-static {p1}, Lo2/p;->d(Landroid/view/ViewGroup;)V

    :cond_2
    invoke-virtual {p0, v2}, Landroidx/activity/r;->setContentView(Landroid/view/View;)V

    invoke-static {p3}, Lo1/s;->A(Landroid/view/View;)Landroidx/lifecycle/w;

    move-result-object p1

    invoke-static {v2, p1}, Lo1/s;->i0(Landroid/view/View;Landroidx/lifecycle/w;)V

    invoke-static {p3}, Li1/b;->p(Landroid/view/View;)Landroidx/lifecycle/g1;

    move-result-object p1

    invoke-static {v2, p1}, Li1/b;->F(Landroid/view/View;Landroidx/lifecycle/g1;)V

    invoke-static {p3}, Ly3/e;->j0(Landroid/view/View;)Lb4/g;

    move-result-object p1

    invoke-static {v2, p1}, Ly3/e;->C0(Landroid/view/View;Lb4/g;)V

    iget-object p1, p0, Lo2/p;->d:Lc9/a;

    iget-object p2, p0, Lo2/p;->e:Lo2/o;

    invoke-virtual {p0, p1, p2, p4}, Lo2/p;->e(Lc9/a;Lo2/o;Lm2/l;)V

    iget-object p1, p0, Landroidx/activity/r;->c:Landroidx/activity/i0;

    new-instance p2, Lo2/a;

    invoke-direct {p2, p0, v0}, Lo2/a;-><init>(Lo2/p;I)V

    const-string p3, "<this>"

    invoke-static {p1, p3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroidx/activity/j0;

    invoke-direct {p3, p2, v0}, Landroidx/activity/j0;-><init>(Lo2/a;Z)V

    invoke-virtual {p1, p0, p3}, Landroidx/activity/i0;->a(Landroidx/lifecycle/w;Landroidx/activity/y;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dialog has no window"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final d(Landroid/view/ViewGroup;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    instance-of v1, p0, Lo2/n;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-static {v2}, Lo2/p;->d(Landroid/view/ViewGroup;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final e(Lc9/a;Lo2/o;Lm2/l;)V
    .locals 3

    iput-object p1, p0, Lo2/p;->d:Lc9/a;

    iput-object p2, p0, Lo2/p;->e:Lo2/o;

    iget-object p1, p2, Lo2/o;->c:Lo2/v;

    iget-object p2, p0, Lo2/p;->f:Landroid/view/View;

    invoke-static {p2}, Lo2/j;->b(Landroid/view/View;)Z

    move-result p2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v1, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    move p2, v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    const/16 v2, 0x2000

    if-eqz p2, :cond_3

    move p2, v2

    goto :goto_1

    :cond_3
    const/16 p2, -0x2001

    :goto_1
    invoke-virtual {p1, p2, v2}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    if-ne p1, v1, :cond_4

    move v0, v1

    goto :goto_2

    :cond_4
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_5
    :goto_2
    iget-object p1, p0, Lo2/p;->n:Lo2/n;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    iget-boolean p2, p1, Lo2/n;->r:Z

    if-nez p2, :cond_6

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_6

    const/4 p3, -0x2

    invoke-virtual {p2, p3, p3}, Landroid/view/Window;->setLayout(II)V

    :cond_6
    iput-boolean v1, p1, Lo2/n;->r:Z

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-ge p1, p2, :cond_7

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_7

    iget p2, p0, Lo2/p;->o:I

    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_7
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lo2/p;->e:Lo2/o;

    iget-boolean v0, v0, Lo2/o;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo2/p;->d:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_0
    return p1
.end method
