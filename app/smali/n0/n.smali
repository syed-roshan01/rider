.class public final Ln0/n;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/n;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/n;->c:Ln0/n;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p1}, Lm0/q2;->c(Lm0/c;)I

    move-result p1

    invoke-virtual {p3, p1}, Lm0/q2;->k(I)V

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
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
