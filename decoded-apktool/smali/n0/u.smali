.class public final Ln0/u;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/u;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Ln0/g0;-><init>(II)V

    sput-object v0, Ln0/u;->c:Ln0/u;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 1

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/c;

    invoke-virtual {p1, p4}, Ln0/h0;->a(I)I

    move-result p1

    invoke-interface {p2}, Lm0/d;->h()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v0}, Lm0/q2;->c(Lm0/c;)I

    move-result p4

    invoke-virtual {p3, p4}, Lm0/q2;->x(I)Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lm0/d;->a(ILjava/lang/Object;)V

    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo7/d0;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "insertIndex"

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

    const-string p1, "groupAnchor"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
