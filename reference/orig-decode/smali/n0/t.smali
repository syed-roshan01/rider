.class public final Ln0/t;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/t;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/t;->c:Ln0/t;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 1

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ln0/h0;->a(I)I

    move-result p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Ln0/h0;->a(I)I

    move-result p4

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ln0/h0;->a(I)I

    move-result p1

    invoke-interface {p2, p3, p4, p1}, Lm0/d;->e(III)V

    return-void
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo7/d0;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "from"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo7/d0;->t(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "to"

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lo7/d0;->t(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "count"

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, Ln0/g0;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
