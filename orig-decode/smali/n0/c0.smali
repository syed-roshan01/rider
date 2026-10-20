.class public final Ln0/c0;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/c0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/c0;->c:Ln0/c0;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p3

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc9/e;

    invoke-interface {p2}, Lm0/d;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2, p3}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
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
    const/4 v0, 0x1

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "block"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
