.class public final Lk3/h;
.super Lx9/v;


# instance fields
.field public final n:Lk3/g;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lx9/v;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lk3/g;

    invoke-direct {v0, p1}, Lk3/g;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk3/h;->n:Lk3/g;

    return-void
.end method


# virtual methods
.method public final H(Z)V
    .locals 1

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lk3/h;->n:Lk3/g;

    invoke-virtual {v0, p1}, Lk3/g;->H(Z)V

    return-void
.end method

.method public final I(Z)V
    .locals 2

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lk3/h;->n:Lk3/g;

    if-eqz v0, :cond_0

    iput-boolean p1, v1, Lk3/g;->p:Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Lk3/g;->I(Z)V

    :goto_0
    return-void
.end method

.method public final K(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lk3/h;->n:Lk3/g;

    invoke-virtual {v0, p1}, Lk3/g;->K(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method

.method public final s([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lk3/h;->n:Lk3/g;

    invoke-virtual {v0, p1}, Lk3/g;->s([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, Lk3/h;->n:Lk3/g;

    iget-boolean v0, v0, Lk3/g;->p:Z

    return v0
.end method
