.class public final Ll/i;
.super Ll/e1;


# instance fields
.field public final synthetic q:Ll/j;


# direct methods
.method public constructor <init>(Ll/j;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Ll/i;->q:Ll/j;

    invoke-direct {p0, p2}, Ll/e1;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lk/n;
    .locals 1

    iget-object v0, p0, Ll/i;->q:Ll/j;

    iget-object v0, v0, Ll/j;->d:Ll/k;

    iget-object v0, v0, Ll/k;->y:Ll/f;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lk/q;->a()Lk/n;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Ll/i;->q:Ll/j;

    iget-object v0, v0, Ll/j;->d:Ll/k;

    invoke-virtual {v0}, Ll/k;->k()Z

    const/4 v0, 0x1

    return v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Ll/i;->q:Ll/j;

    iget-object v0, v0, Ll/j;->d:Ll/k;

    iget-object v1, v0, Ll/k;->A:Ll/h;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/k;->g()Z

    const/4 v0, 0x1

    return v0
.end method
