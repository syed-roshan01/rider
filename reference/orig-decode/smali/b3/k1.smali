.class public final Lb3/k1;
.super Lb3/j1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb3/j1;-><init>()V

    return-void
.end method

.method public constructor <init>(Lb3/u1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lb3/j1;-><init>(Lb3/u1;)V

    return-void
.end method


# virtual methods
.method public c(ILu2/c;)V
    .locals 1

    invoke-static {p1}, Lb3/t1;->a(I)I

    move-result p1

    invoke-virtual {p2}, Lu2/c;->d()Landroid/graphics/Insets;

    move-result-object p2

    iget-object v0, p0, Lb3/j1;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0, p1, p2}, Lb2/t;->m(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
