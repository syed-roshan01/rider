.class public final Lq9/u;
.super Lw8/c;

# interfaces
.implements Lp9/g;


# instance fields
.field public final a:Lp9/g;

.field public final b:Lu8/j;

.field public final c:I

.field public d:Lu8/j;

.field public e:Lu8/e;


# direct methods
.method public constructor <init>(Lp9/g;Lu8/j;)V
    .locals 2

    sget-object v0, Lq9/r;->a:Lq9/r;

    sget-object v1, Lu8/k;->a:Lu8/k;

    invoke-direct {p0, v0, v1}, Lw8/c;-><init>(Lu8/e;Lu8/j;)V

    iput-object p1, p0, Lq9/u;->a:Lp9/g;

    iput-object p2, p0, Lq9/u;->b:Lu8/j;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Lq9/t;->a:Lq9/t;

    invoke-interface {p2, p1, v0}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lq9/u;->c:I

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0, p2, p1}, Lq9/u;->h(Lu8/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, Lq9/p;

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lq9/p;-><init>(Lu8/j;Ljava/lang/Throwable;)V

    iput-object v0, p0, Lq9/u;->d:Lu8/j;

    throw p1
.end method

.method public final getCallerFrame()Lw8/d;
    .locals 2

    iget-object v0, p0, Lq9/u;->e:Lu8/e;

    instance-of v1, v0, Lw8/d;

    if-eqz v1, :cond_0

    check-cast v0, Lw8/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lq9/u;->d:Lu8/j;

    if-nez v0, :cond_0

    sget-object v0, Lu8/k;->a:Lu8/k;

    :cond_0
    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h(Lu8/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    invoke-static {v0}, Lh6/g;->S(Lu8/j;)V

    iget-object v1, p0, Lq9/u;->d:Lu8/j;

    if-eq v1, v0, :cond_2

    instance-of v2, v1, Lq9/p;

    if-nez v2, :cond_1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ls/i;

    const/16 v3, 0xd

    invoke-direct {v2, p0, v3}, Ls/i;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1, v2}, Lu8/j;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget v2, p0, Lq9/u;->c:I

    if-ne v1, v2, :cond_0

    iput-object v0, p0, Lq9/u;->d:Lu8/j;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Flow invariant is violated:\n\t\tFlow was collected in "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq9/u;->b:Lu8/j;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n\t\tbut emission happened in "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    check-cast v1, Lq9/p;

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lq9/p;->a:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", but then emission attempt of value \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lz6/a;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Lq9/u;->e:Lu8/e;

    sget-object p1, Lq9/w;->a:Lc9/f;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    iget-object v1, p0, Lq9/u;->a:Lp9/g;

    invoke-static {v1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1, p2, p0}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    invoke-static {p1, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-object p2, p0, Lq9/u;->e:Lu8/e;

    :cond_3
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lq8/h;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lq9/p;

    invoke-virtual {p0}, Lq9/u;->getContext()Lu8/j;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lq9/p;-><init>(Lu8/j;Ljava/lang/Throwable;)V

    iput-object v1, p0, Lq9/u;->d:Lu8/j;

    :cond_0
    iget-object v0, p0, Lq9/u;->e:Lu8/e;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public final releaseIntercepted()V
    .locals 0

    invoke-super {p0}, Lw8/c;->releaseIntercepted()V

    return-void
.end method
