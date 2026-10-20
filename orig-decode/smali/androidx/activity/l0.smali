.class public final Landroidx/activity/l0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Landroidx/activity/l0;

.field public static final c:Landroidx/activity/l0;

.field public static final d:Landroidx/activity/l0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/activity/l0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/activity/l0;-><init>(I)V

    sput-object v0, Landroidx/activity/l0;->b:Landroidx/activity/l0;

    new-instance v0, Landroidx/activity/l0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/activity/l0;-><init>(I)V

    sput-object v0, Landroidx/activity/l0;->c:Landroidx/activity/l0;

    new-instance v0, Landroidx/activity/l0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/activity/l0;-><init>(I)V

    sput-object v0, Landroidx/activity/l0;->d:Landroidx/activity/l0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/activity/l0;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Landroidx/activity/l0;->a:I

    const/4 v1, 0x0

    const-string v2, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0800e6

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroidx/activity/k0;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Landroidx/activity/k0;

    :cond_0
    return-object v1

    :pswitch_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Landroid/view/View;

    :cond_1
    return-object v1

    :pswitch_1
    check-cast p1, Landroid/content/res/Resources;

    const-string v0, "resources"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    const/16 v0, 0x20

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
