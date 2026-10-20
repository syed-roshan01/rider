.class public final La4/r0;
.super Lb3/c;


# instance fields
.field public final d:La4/s0;


# direct methods
.method public constructor <init>(La4/s0;)V
    .locals 0

    invoke-direct {p0}, Lb3/c;-><init>()V

    iput-object p1, p0, La4/r0;->d:La4/s0;

    return-void
.end method


# virtual methods
.method public final g(Landroid/view/View;Lc3/k;)V
    .locals 1

    iget-object v0, p0, Lb3/c;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object p2, p2, Lc3/k;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object p2, p0, La4/r0;->d:La4/s0;

    iget-object v0, p2, La4/s0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p2, p2, La4/s0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()La4/e0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()La4/e0;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final h(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lb3/c;->h(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p1, p0, La4/r0;->d:La4/s0;

    iget-object p2, p1, La4/s0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->l()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iget-object p1, p1, La4/s0;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()La4/e0;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()La4/e0;

    move-result-object p1

    iget-object p1, p1, La4/e0;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->a:La4/l0;

    :cond_1
    return p3
.end method
