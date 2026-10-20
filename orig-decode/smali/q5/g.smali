.class public final synthetic Lq5/g;
.super Ljava/lang/Object;

# interfaces
.implements Ls5/b;


# instance fields
.field public final synthetic a:Lq5/i;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Ll5/j;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lq5/i;Ljava/lang/Iterable;Ll5/j;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/g;->a:Lq5/i;

    iput-object p2, p0, Lq5/g;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lq5/g;->c:Ll5/j;

    iput-wide p4, p0, Lq5/g;->d:J

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lq5/g;->a:Lq5/i;

    iget-object v1, v0, Lq5/i;->c:Lr5/d;

    check-cast v1, Lr5/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lq5/g;->b:Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lr5/m;->p(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lp5/b;

    const/4 v4, 0x2

    const-string v5, "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"

    invoke-direct {v3, v1, v2, v5, v4}, Lp5/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v3}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    :goto_0
    iget-object v0, v0, Lq5/i;->g:Lt5/a;

    check-cast v0, Lt5/c;

    invoke-virtual {v0}, Lt5/c;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lq5/g;->d:J

    add-long/2addr v2, v4

    new-instance v0, Lr5/f;

    iget-object v4, p0, Lq5/g;->c:Ll5/j;

    invoke-direct {v0, v2, v3, v4}, Lr5/f;-><init>(JLl5/j;)V

    invoke-virtual {v1, v0}, Lr5/m;->e(Lr5/k;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
