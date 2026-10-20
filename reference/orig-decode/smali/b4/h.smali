.class public final Lb4/h;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lb4/h;

.field public static final c:Lb4/h;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lb4/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb4/h;-><init>(I)V

    sput-object v0, Lb4/h;->b:Lb4/h;

    new-instance v0, Lb4/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb4/h;-><init>(I)V

    sput-object v0, Lb4/h;->c:Lb4/h;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb4/h;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb4/h;->a:I

    const/4 v1, 0x0

    const-string v2, "view"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0800e7

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lb4/g;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lb4/g;

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

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
