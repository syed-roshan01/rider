.class public final Lm9/l1;
.super Lm9/j1;


# instance fields
.field public final e:Lm9/p1;

.field public final f:Lm9/m1;

.field public final n:Lm9/p;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm9/p1;Lm9/m1;Lm9/p;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lr9/j;-><init>()V

    iput-object p1, p0, Lm9/l1;->e:Lm9/p1;

    iput-object p2, p0, Lm9/l1;->f:Lm9/m1;

    iput-object p3, p0, Lm9/l1;->n:Lm9/p;

    iput-object p4, p0, Lm9/l1;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/l1;->n(Ljava/lang/Throwable;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 7

    iget-object p1, p0, Lm9/l1;->e:Lm9/p1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lm9/l1;->n:Lm9/p;

    invoke-static {v0}, Lm9/p1;->a0(Lr9/j;)Lm9/p;

    move-result-object v0

    iget-object v1, p0, Lm9/l1;->f:Lm9/m1;

    iget-object v2, p0, Lm9/l1;->o:Ljava/lang/Object;

    if-eqz v0, :cond_2

    :cond_0
    new-instance v3, Lm9/l1;

    invoke-direct {v3, p1, v1, v0, v2}, Lm9/l1;-><init>(Lm9/p1;Lm9/m1;Lm9/p;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    iget-object v6, v0, Lm9/p;->e:Lm9/q;

    invoke-static {v6, v4, v3, v5}, Lz6/a;->N(Lm9/f1;ZLm9/j1;I)Lm9/o0;

    move-result-object v3

    sget-object v4, Lm9/u1;->a:Lm9/u1;

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm9/p1;->a0(Lr9/j;)Lm9/p;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_2
    invoke-virtual {p1, v1, v2}, Lm9/p1;->G(Lm9/m1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm9/p1;->t(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
