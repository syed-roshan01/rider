.class public final Lb3/g0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public a:Lb3/u1;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lb3/t;


# direct methods
.method public constructor <init>(Landroid/view/View;Lb3/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lb3/g0;->b:Landroid/view/View;

    iput-object p2, p0, Lb3/g0;->c:Lb3/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lb3/g0;->a:Lb3/u1;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    invoke-static {p1, p2}, Lb3/u1;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lb3/u1;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, p0, Lb3/g0;->c:Lb3/t;

    const/16 v3, 0x1e

    if-ge v1, v3, :cond_0

    iget-object v4, p0, Lb3/g0;->b:Landroid/view/View;

    invoke-static {p2, v4}, Lb3/h0;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, Lb3/g0;->a:Lb3/u1;

    invoke-virtual {v0, p2}, Lb3/u1;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    check-cast v2, Ly/g0;

    invoke-virtual {v2, p1, v0}, Ly/g0;->a(Landroid/view/View;Lb3/u1;)Lb3/u1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/u1;->b()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, Lb3/g0;->a:Lb3/u1;

    check-cast v2, Ly/g0;

    invoke-virtual {v2, p1, v0}, Ly/g0;->a(Landroid/view/View;Lb3/u1;)Lb3/u1;

    move-result-object p2

    if-lt v1, v3, :cond_1

    invoke-virtual {p2}, Lb3/u1;->b()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p1}, Lb3/f0;->c(Landroid/view/View;)V

    invoke-virtual {p2}, Lb3/u1;->b()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
