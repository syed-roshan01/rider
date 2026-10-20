.class public final Ln0/i;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/i;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/i;->c:Ln0/i;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 7

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/c;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/c;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Lm0/q2;->c(Lm0/c;)I

    move-result p1

    iget v2, p3, Lm0/q2;->r:I

    if-ge v2, p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, p4

    :goto_0
    invoke-static {v2}, Lm0/s;->l(Z)V

    invoke-static {p3, p2, p1}, Lm9/e0;->J(Lm0/q2;Lm0/d;I)V

    iget v2, p3, Lm0/q2;->r:I

    iget v3, p3, Lm0/q2;->t:I

    :goto_1
    if-ltz v3, :cond_1

    iget-object v4, p3, Lm0/q2;->b:[I

    invoke-virtual {p3, v3}, Lm0/q2;->o(I)I

    move-result v5

    invoke-static {v4, v5}, Ld7/t;->v([II)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p3, Lm0/q2;->b:[I

    invoke-virtual {p3, v4, v3}, Lm0/q2;->y([II)I

    move-result v3

    goto :goto_1

    :cond_1
    add-int/2addr v3, v1

    move v4, p4

    :goto_2
    if-ge v3, v2, :cond_5

    invoke-virtual {p3, v2, v3}, Lm0/q2;->q(II)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p3, Lm0/q2;->b:[I

    invoke-virtual {p3, v3}, Lm0/q2;->o(I)I

    move-result v6

    invoke-static {v5, v6}, Ld7/t;->v([II)Z

    move-result v5

    if-eqz v5, :cond_2

    move v4, p4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v5, p3, Lm0/q2;->b:[I

    invoke-virtual {p3, v3}, Lm0/q2;->o(I)I

    move-result v6

    invoke-static {v5, v6}, Ld7/t;->v([II)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v1

    goto :goto_3

    :cond_4
    iget-object v5, p3, Lm0/q2;->b:[I

    invoke-virtual {p3, v3}, Lm0/q2;->o(I)I

    move-result v6

    invoke-static {v5, v6}, Ld7/t;->x([II)I

    move-result v5

    :goto_3
    add-int/2addr v4, v5

    invoke-virtual {p3, v3}, Lm0/q2;->p(I)I

    move-result v5

    add-int/2addr v3, v5

    goto :goto_2

    :cond_5
    :goto_4
    iget v2, p3, Lm0/q2;->r:I

    if-ge v2, p1, :cond_8

    invoke-virtual {p3, p1, v2}, Lm0/q2;->q(II)Z

    move-result v2

    if-eqz v2, :cond_7

    iget v2, p3, Lm0/q2;->r:I

    iget v3, p3, Lm0/q2;->s:I

    if-ge v2, v3, :cond_6

    iget-object v3, p3, Lm0/q2;->b:[I

    invoke-virtual {p3, v2}, Lm0/q2;->o(I)I

    move-result v2

    invoke-static {v3, v2}, Ld7/t;->v([II)Z

    move-result v2

    if-eqz v2, :cond_6

    iget v2, p3, Lm0/q2;->r:I

    invoke-virtual {p3, v2}, Lm0/q2;->x(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, Lm0/d;->b(Ljava/lang/Object;)V

    move v4, p4

    :cond_6
    invoke-virtual {p3}, Lm0/q2;->I()V

    goto :goto_4

    :cond_7
    invoke-virtual {p3}, Lm0/q2;->E()I

    move-result v2

    add-int/2addr v4, v2

    goto :goto_4

    :cond_8
    if-ne v2, p1, :cond_9

    move p4, v1

    :cond_9
    invoke-static {p4}, Lm0/s;->l(Z)V

    iput v4, v0, Lu0/c;->a:I

    return-void
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "effectiveNodeIndexOut"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "anchor"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
