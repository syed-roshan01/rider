.class public final Lm0/i1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/d;


# instance fields
.field public final a:Lm0/d;

.field public final b:I

.field public c:I


# direct methods
.method public constructor <init>(Lm0/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/i1;->a:Lm0/d;

    iput p2, p0, Lm0/i1;->b:I

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lm0/i1;->c:I

    if-nez v0, :cond_0

    iget v0, p0, Lm0/i1;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr p1, v0

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0, p1, p2}, Lm0/d;->a(ILjava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lm0/i1;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lm0/i1;->c:I

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0, p1}, Lm0/d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lm0/i1;->c:I

    if-nez v0, :cond_0

    iget v0, p0, Lm0/i1;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr p1, v0

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0, p1, p2}, Lm0/d;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public final clear()V
    .locals 1

    const-string v0, "Clear is not valid on OffsetApplier"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final e(III)V
    .locals 1

    iget v0, p0, Lm0/i1;->c:I

    if-nez v0, :cond_0

    iget v0, p0, Lm0/i1;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr p1, v0

    add-int/2addr p2, v0

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0, p1, p2, p3}, Lm0/d;->e(III)V

    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0}, Lm0/d;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g(II)V
    .locals 1

    iget v0, p0, Lm0/i1;->c:I

    if-nez v0, :cond_0

    iget v0, p0, Lm0/i1;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr p1, v0

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0, p1, p2}, Lm0/d;->g(II)V

    return-void
.end method

.method public final h()V
    .locals 1

    iget v0, p0, Lm0/i1;->c:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lm0/i1;->c:I

    iget-object v0, p0, Lm0/i1;->a:Lm0/d;

    invoke-interface {v0}, Lm0/d;->h()V

    return-void

    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
