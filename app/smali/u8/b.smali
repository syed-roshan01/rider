.class public abstract Lu8/b;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/i;


# instance fields
.field public final a:Lc9/c;

.field public final b:Lu8/i;


# direct methods
.method public constructor <init>(Lu8/i;Lm9/x;)V
    .locals 1

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu8/b;->a:Lc9/c;

    instance-of p2, p1, Lu8/b;

    if-eqz p2, :cond_0

    check-cast p1, Lu8/b;

    iget-object p1, p1, Lu8/b;->b:Lu8/i;

    :cond_0
    iput-object p1, p0, Lu8/b;->b:Lu8/i;

    return-void
.end method
