.class public final Lq9/p;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/j;


# instance fields
.field public final a:Ljava/lang/Throwable;

.field public final synthetic b:Lu8/j;


# direct methods
.method public constructor <init>(Lu8/j;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq9/p;->a:Ljava/lang/Throwable;

    iput-object p1, p0, Lq9/p;->b:Lu8/j;

    return-void
.end method


# virtual methods
.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    iget-object v0, p0, Lq9/p;->b:Lu8/j;

    invoke-interface {v0, p1}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq9/p;->b:Lu8/j;

    invoke-interface {v0, p1, p2}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 1

    iget-object v0, p0, Lq9/p;->b:Lu8/j;

    invoke-interface {v0, p1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 1

    iget-object v0, p0, Lq9/p;->b:Lu8/j;

    invoke-interface {v0, p1}, Lu8/j;->u(Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method
