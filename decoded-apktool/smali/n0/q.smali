.class public final Ln0/q;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/q;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/q;->c:Ln0/q;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lm0/n2;

    const/4 p4, 0x0

    invoke-virtual {p1, p4}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/c;

    invoke-virtual {p3}, Lm0/q2;->d()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, p1}, Lm0/n2;->e(Lm0/c;)I

    move-result p1

    invoke-virtual {p3, p2, p1}, Lm0/q2;->u(Lm0/n2;I)V

    invoke-virtual {p3}, Lm0/q2;->j()V

    return-void
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "anchor"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "from"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
