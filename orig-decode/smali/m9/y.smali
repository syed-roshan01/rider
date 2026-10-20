.class public final Lm9/y;
.super Lu8/b;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    sget-object p1, Lu8/f;->a:Lu8/f;

    sget-object v0, Lm9/x;->b:Lm9/x;

    invoke-direct {p0, p1, v0}, Lu8/b;-><init>(Lu8/i;Lm9/x;)V

    return-void

    :cond_0
    sget-object p1, Lm9/z;->b:Lm9/y;

    sget-object v0, Lm9/x;->c:Lm9/x;

    invoke-direct {p0, p1, v0}, Lu8/b;-><init>(Lu8/i;Lm9/x;)V

    return-void
.end method
