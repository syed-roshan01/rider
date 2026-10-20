.class public final Lj4/j;
.super Ljava/lang/Object;

# interfaces
.implements Lu4/a;
.implements Lt4/g;


# instance fields
.field public final synthetic a:Lj4/l;


# direct methods
.method public synthetic constructor <init>(Lj4/l;)V
    .locals 0

    iput-object p1, p0, Lj4/j;->a:Lj4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    new-instance v0, Lj4/d;

    iget-object v1, p0, Lj4/j;->a:Lj4/l;

    if-eqz p1, :cond_0

    invoke-virtual {v1, p1}, Lj4/l;->j(Landroid/graphics/drawable/Drawable;)Lh1/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Lj4/d;-><init>(Lh1/c;)V

    invoke-virtual {v1, v0}, Lj4/l;->k(Lj4/f;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Li4/l;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj4/j;->a:Lj4/l;

    iget-object v0, v0, Lj4/l;->n:Lp9/q0;

    new-instance v1, La4/c0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, La4/c0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, p1}, Lh6/g;->V(La4/c0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()V
    .locals 0

    return-void
.end method
