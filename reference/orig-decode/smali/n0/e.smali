.class public final Ln0/e;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/e;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/e;->c:Ln0/e;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Lu0/c;->a:I

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p1, v1}, Ln0/h0;->b(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/a;

    if-lez v0, :cond_1

    new-instance v1, Lm0/i1;

    invoke-direct {v1, p2, v0}, Lm0/i1;-><init>(Lm0/d;I)V

    move-object p2, v1

    :cond_1
    invoke-virtual {p1, p2, p3, p4}, Ln0/a;->a(Lm0/d;Lm0/q2;Lm0/w;)V

    return-void
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "changes"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Ld9/i;->o(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "effectiveNodeIndex"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Ln0/g0;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
