.class public final La0/z;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La0/a0;

.field public final c:Lm0/l1;

.field public final d:Lm0/l1;

.field public final e:Lm0/n1;

.field public final f:Lm0/n1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;La0/a0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/z;->a:Ljava/lang/Object;

    iput-object p2, p0, La0/z;->b:La0/a0;

    const/4 p1, -0x1

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, La0/z;->c:Lm0/l1;

    const/4 p1, 0x0

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, La0/z;->d:Lm0/l1;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, La0/z;->e:Lm0/n1;

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, La0/z;->f:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a()La0/z;
    .locals 3

    iget-object v0, p0, La0/z;->d:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, La0/z;->b:La0/a0;

    iget-object v1, v1, La0/a0;->a:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, La0/z;->f:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/z;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La0/z;->a()La0/z;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, La0/z;->e:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lm0/u2;->f(I)V

    return-object p0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, La0/z;->d:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lm0/u2;->f(I)V

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La0/z;->b:La0/a0;

    iget-object v0, v0, La0/a0;->a:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, La0/z;->e:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La0/z;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La0/z;->b()V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Release should only be called once"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
