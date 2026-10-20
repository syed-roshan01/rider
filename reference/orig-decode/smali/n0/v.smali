.class public final Ln0/v;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/v;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/v;->c:Ln0/v;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/i2;

    iget-object p2, p4, Lm0/w;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
