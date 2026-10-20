.class public final Lb3/q1;
.super Lb3/p1;


# static fields
.field public static final q:Lb3/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lb2/t;->f()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lb3/u1;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lb3/u1;

    move-result-object v0

    sput-object v0, Lb3/q1;->q:Lb3/u1;

    return-void
.end method

.method public constructor <init>(Lb3/u1;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb3/p1;-><init>(Lb3/u1;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public f(I)Lu2/c;
    .locals 1

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lb3/t1;->a(I)I

    move-result p1

    invoke-static {v0, p1}, Lb2/t;->w(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lu2/c;->c(Landroid/graphics/Insets;)Lu2/c;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Lu2/c;
    .locals 1

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lb3/t1;->a(I)I

    move-result p1

    invoke-static {v0, p1}, Lb2/t;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lu2/c;->c(Landroid/graphics/Insets;)Lu2/c;

    move-result-object p1

    return-object p1
.end method

.method public p(I)Z
    .locals 1

    iget-object v0, p0, Lb3/m1;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lb3/t1;->a(I)I

    move-result p1

    invoke-static {v0, p1}, Lb2/t;->t(Landroid/view/WindowInsets;I)Z

    move-result p1

    return p1
.end method
