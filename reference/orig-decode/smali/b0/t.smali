.class public final Lb0/t;
.super Ljava/lang/Object;

# interfaces
.implements La0/s;


# instance fields
.field public final a:Lb0/h0;

.field public final b:Lh6/g;

.field public final c:La0/u;


# direct methods
.method public constructor <init>(Lb0/h0;Lb0/r;La0/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/t;->a:Lb0/h0;

    iput-object p2, p0, Lb0/t;->b:Lh6/g;

    iput-object p3, p0, Lb0/t;->c:La0/u;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb0/t;->c:La0/u;

    invoke-interface {v0, p1}, La0/u;->a(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb0/t;->b:Lh6/g;

    invoke-virtual {v0, p1}, Lh6/g;->h0(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lb0/t;->c:La0/u;

    invoke-interface {v0, p1}, La0/u;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lb0/t;->b:Lh6/g;

    invoke-virtual {v0}, Lh6/g;->f0()La0/q0;

    move-result-object v0

    iget v0, v0, La0/q0;->b:I

    return v0
.end method

.method public final e(ILjava/lang/Object;Lm0/m;I)V
    .locals 7

    check-cast p3, Lm0/q;

    const v0, -0x479b9c4d

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    iget-object v0, p0, Lb0/t;->a:Lb0/h0;

    iget-object v2, v0, Lb0/h0;->A:La0/a0;

    new-instance v0, Lt/o0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lt/o0;-><init>(Ljava/lang/Object;II)V

    const v1, 0x441527a7

    invoke-static {p3, v1, v0}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v3

    shl-int/lit8 v0, p4, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v5, v0, 0xe08

    move-object v0, p2

    move v1, p1

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Lf6/a;->g(Ljava/lang/Object;ILa0/a0;Lc9/e;Lm0/m;I)V

    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance v6, Lz/l;

    const/4 v5, 0x1

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lz/l;-><init>(La0/s;ILjava/lang/Object;II)V

    iput-object v6, p3, Lm0/x1;->d:Lc9/e;

    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lb0/t;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lb0/t;

    iget-object p1, p1, Lb0/t;->b:Lh6/g;

    iget-object v0, p0, Lb0/t;->b:Lh6/g;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lb0/t;->b:Lh6/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
