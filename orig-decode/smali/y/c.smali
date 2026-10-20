.class public final Ly/c;
.super Ljava/lang/Object;

# interfaces
.implements Ly/i1;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Lm0/n1;

.field public final d:Lm0/n1;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly/c;->a:I

    iput-object p2, p0, Ly/c;->b:Ljava/lang/String;

    sget-object p1, Lu2/c;->e:Lu2/c;

    sget-object p2, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Ly/c;->c:Lm0/n1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Ly/c;->d:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a(Lm2/b;Lm2/l;)I
    .locals 0

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object p1

    iget p1, p1, Lu2/c;->a:I

    return p1
.end method

.method public final b(Lm2/b;)I
    .locals 0

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object p1

    iget p1, p1, Lu2/c;->d:I

    return p1
.end method

.method public final c(Lm2/b;Lm2/l;)I
    .locals 0

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object p1

    iget p1, p1, Lu2/c;->c:I

    return p1
.end method

.method public final d(Lm2/b;)I
    .locals 0

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object p1

    iget p1, p1, Lu2/c;->b:I

    return p1
.end method

.method public final e()Lu2/c;
    .locals 1

    iget-object v0, p0, Ly/c;->c:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/c;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly/c;

    iget p1, p1, Ly/c;->a:I

    iget v1, p0, Ly/c;->a:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final f(Lb3/u1;I)V
    .locals 2

    iget v0, p0, Ly/c;->a:I

    if-eqz p2, :cond_0

    and-int/2addr p2, v0

    if-eqz p2, :cond_1

    :cond_0
    iget-object p2, p1, Lb3/u1;->a:Lb3/r1;

    invoke-virtual {p2, v0}, Lb3/r1;->f(I)Lu2/c;

    move-result-object p2

    iget-object v1, p0, Ly/c;->c:Lm0/n1;

    invoke-virtual {v1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lb3/u1;->a:Lb3/r1;

    invoke-virtual {p1, v0}, Lb3/r1;->p(I)Z

    move-result p1

    iget-object p2, p0, Ly/c;->d:Lm0/n1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ly/c;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ly/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object v1

    iget v1, v1, Lu2/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object v2

    iget v2, v2, Lu2/c;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object v2

    iget v2, v2, Lu2/c;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly/c;->e()Lu2/c;

    move-result-object v1

    iget v1, v1, Lu2/c;->d:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, La7/a;->o(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
