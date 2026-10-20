.class public final Lc1/q;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Lo0/i;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lc1/q;->a:Ljava/util/LinkedHashMap;

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Lc9/a;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lc1/q;->b:Lo0/i;

    return-void
.end method

.method public static final a(Lc1/q;)V
    .locals 6

    iget-object v0, p0, Lc1/q;->b:Lo0/i;

    iget v1, v0, Lo0/i;->c:I

    const/4 v2, 0x0

    if-lez v1, :cond_1

    iget-object v3, v0, Lo0/i;->a:[Ljava/lang/Object;

    move v4, v2

    :cond_0
    aget-object v5, v3, v4

    check-cast v5, Lc9/a;

    invoke-interface {v5}, Lc9/a;->invoke()Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v1, :cond_0

    :cond_1
    invoke-virtual {v0}, Lo0/i;->g()V

    iget-object v0, p0, Lc1/q;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iput-boolean v2, p0, Lc1/q;->c:Z

    return-void
.end method

.method public static final b(Lc1/q;)V
    .locals 4

    iget-object v0, p0, Lc1/q;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc1/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/compose/ui/focus/a;->E(Lc1/p;)Lc1/q;

    move-result-object v3

    iget-object v3, v3, Lc1/q;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc1/o;

    if-eqz v3, :cond_0

    iput-object v3, v2, Lc1/p;->w:Lc1/o;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "committing a node that was not updated in the current transaction"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc1/q;->c:Z

    return-void
.end method
