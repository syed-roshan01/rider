.class public final Lu9/c;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/k;
.implements Lm9/i2;


# instance fields
.field public final a:Lm9/l;

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Lu9/d;


# direct methods
.method public constructor <init>(Lu9/d;Lm9/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/c;->c:Lu9/d;

    iput-object p2, p0, Lu9/c;->a:Lm9/l;

    iput-object p3, p0, Lu9/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lr9/t;I)V
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1, p2}, Lm9/l;->a(Lr9/t;I)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0}, Lm9/l;->b()Z

    move-result v0

    return v0
.end method

.method public final d(Lm9/z;)V
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1}, Lm9/l;->d(Lm9/z;)V

    return-void
.end method

.method public final getContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    iget-object v0, v0, Lm9/l;->e:Lu8/j;

    return-object v0
.end method

.method public final k(Ljava/lang/Object;Lc9/c;)Li3/u;
    .locals 2

    check-cast p1, Lq8/l;

    new-instance p2, Lu9/b;

    const/4 v0, 0x1

    iget-object v1, p0, Lu9/c;->c:Lu9/d;

    invoke-direct {p2, v1, p0, v0}, Lu9/b;-><init>(Lu9/d;Lu9/c;I)V

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1, p2}, Lm9/l;->F(Ljava/lang/Object;Lc9/c;)Li3/u;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p2, Lu9/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v0, p0, Lu9/c;->b:Ljava/lang/Object;

    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1}, Lm9/l;->l(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final o(Lc9/c;Ljava/lang/Object;)V
    .locals 2

    sget-object p1, Lq8/l;->a:Lq8/l;

    sget-object p2, Lu9/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v0, p0, Lu9/c;->b:Ljava/lang/Object;

    iget-object v1, p0, Lu9/c;->c:Lu9/d;

    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lu9/b;

    const/4 v0, 0x0

    invoke-direct {p2, v1, p0, v0}, Lu9/b;-><init>(Lu9/d;Lu9/c;I)V

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p2, p1}, Lm9/l;->o(Lc9/c;Ljava/lang/Object;)V

    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final w(Ljava/lang/Throwable;)Li3/u;
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1}, Lm9/l;->w(Ljava/lang/Throwable;)Li3/u;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu9/c;->a:Lm9/l;

    invoke-virtual {v0, p1}, Lm9/l;->x(Ljava/lang/Object;)V

    return-void
.end method
