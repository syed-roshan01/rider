.class public final Landroidx/lifecycle/h1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Landroidx/lifecycle/h1;

.field public static final c:Landroidx/lifecycle/h1;

.field public static final d:Landroidx/lifecycle/h1;

.field public static final e:Landroidx/lifecycle/h1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/h1;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/h1;->b:Landroidx/lifecycle/h1;

    new-instance v0, Landroidx/lifecycle/h1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/lifecycle/h1;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/h1;->c:Landroidx/lifecycle/h1;

    new-instance v0, Landroidx/lifecycle/h1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/lifecycle/h1;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/h1;->d:Landroidx/lifecycle/h1;

    new-instance v0, Landroidx/lifecycle/h1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/lifecycle/h1;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/h1;->e:Landroidx/lifecycle/h1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/lifecycle/h1;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Landroid/view/View;
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h1;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v0, "view"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Landroid/view/View;

    :cond_0
    return-object v1

    :pswitch_0
    const-string v0, "currentView"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Landroid/view/View;

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h1;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    const-string v0, "view"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0800e8

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroidx/lifecycle/g1;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Landroidx/lifecycle/g1;

    :cond_0
    return-object v1

    :pswitch_0
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h1;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroid/view/View;

    const-string v0, "viewParent"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0800e5

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroidx/lifecycle/w;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Landroidx/lifecycle/w;

    :cond_1
    return-object v1

    :pswitch_2
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h1;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
