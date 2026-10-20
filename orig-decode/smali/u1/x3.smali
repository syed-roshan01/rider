.class public final Lu1/x3;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/t;
.implements Landroidx/lifecycle/u;


# instance fields
.field public final a:Lu1/w;

.field public final b:Lm0/t;

.field public c:Z

.field public d:Landroidx/lifecycle/r;

.field public e:Lc9/e;


# direct methods
.method public constructor <init>(Lu1/w;Lm0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/x3;->a:Lu1/w;

    iput-object p2, p0, Lu1/x3;->b:Lm0/t;

    sget-object p1, Lu1/q1;->a:Lu0/b;

    iput-object p1, p0, Lu1/x3;->e:Lc9/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lu1/x3;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/x3;->c:Z

    iget-object v0, p0, Lu1/x3;->a:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0800ed

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lu1/x3;->d:Landroidx/lifecycle/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    :cond_0
    iget-object v0, p0, Lu1/x3;->b:Lm0/t;

    invoke-interface {v0}, Lm0/t;->a()V

    return-void
.end method

.method public final e(Lc9/e;)V
    .locals 2

    new-instance v0, Lu/s;

    const/16 v1, 0x17

    invoke-direct {v0, v1, p0, p1}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lu1/x3;->a:Lu1/w;

    invoke-virtual {p1, v0}, Lu1/w;->setOnViewTreeOwnersAvailable(Lc9/c;)V

    return-void
.end method

.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 0

    sget-object p1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lu1/x3;->a()V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_1

    iget-boolean p1, p0, Lu1/x3;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lu1/x3;->e:Lc9/e;

    invoke-virtual {p0, p1}, Lu1/x3;->e(Lc9/e;)V

    :cond_1
    :goto_0
    return-void
.end method
