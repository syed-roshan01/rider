.class public final Lm0/o2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Le9/a;


# instance fields
.field public final a:Lm0/n2;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(IILm0/n2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lm0/o2;->a:Lm0/n2;

    iput p1, p0, Lm0/o2;->b:I

    iput p2, p0, Lm0/o2;->c:I

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 6

    iget-object v0, p0, Lm0/o2;->a:Lm0/n2;

    iget v1, v0, Lm0/n2;->n:I

    iget v2, p0, Lm0/o2;->c:I

    if-ne v1, v2, :cond_3

    iget-object v1, v0, Lm0/n2;->p:Ljava/util/HashMap;

    const/4 v2, 0x0

    iget v3, p0, Lm0/o2;->b:I

    if-eqz v1, :cond_2

    iget-boolean v4, v0, Lm0/n2;->f:Z

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    if-ltz v3, :cond_0

    iget v4, v0, Lm0/n2;->b:I

    if-ge v3, v4, :cond_0

    iget-object v5, v0, Lm0/n2;->o:Ljava/util/ArrayList;

    invoke-static {v5, v3, v4}, Ld7/t;->q0(Ljava/util/ArrayList;II)I

    move-result v4

    if-ltz v4, :cond_0

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/c;

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/s0;

    goto :goto_0

    :cond_1
    const-string v0, "use active SlotWriter to crate an anchor for location instead"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_0
    new-instance v1, Lm0/r0;

    add-int/lit8 v2, v3, 0x1

    iget-object v4, v0, Lm0/n2;->a:[I

    invoke-static {v4, v3}, Ld7/t;->s([II)I

    move-result v4

    add-int/2addr v4, v3

    invoke-direct {v1, v2, v4, v0}, Lm0/r0;-><init>(IILm0/n2;)V

    return-object v1

    :cond_3
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
