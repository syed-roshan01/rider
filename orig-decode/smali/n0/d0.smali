.class public final Ln0/d0;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/d0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Ln0/g0;-><init>(II)V

    sput-object v0, Ln0/d0;->c:Ln0/d0;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 2

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2}, Ln0/h0;->a(I)I

    move-result p1

    instance-of p2, v0, Lm0/j2;

    if-eqz p2, :cond_0

    move-object p2, v0

    check-cast p2, Lm0/j2;

    iget-object p2, p2, Lm0/j2;->a:Lm0/i2;

    iget-object v1, p4, Lm0/w;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget p2, p3, Lm0/q2;->r:I

    invoke-virtual {p3, v0, p2, p1}, Lm0/q2;->D(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lm0/j2;

    if-eqz p2, :cond_1

    check-cast p1, Lm0/j2;

    iget-object p1, p1, Lm0/j2;->a:Lm0/i2;

    iget-object p2, p4, Lm0/w;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lm0/x1;

    if-eqz p2, :cond_3

    check-cast p1, Lm0/x1;

    iget-object p2, p1, Lm0/x1;->b:Lm0/y1;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Lm0/y1;->b()V

    :cond_2
    const/4 p2, 0x0

    iput-object p2, p1, Lm0/x1;->b:Lm0/y1;

    iput-object p2, p1, Lm0/x1;->f:Lq/r;

    iput-object p2, p1, Lm0/x1;->g:Lq/s;

    :cond_3
    :goto_0
    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo7/d0;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "groupSlotIndex"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "value"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
