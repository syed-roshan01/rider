.class public final Lj0/m;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lj0/p;


# direct methods
.method public constructor <init>(Lj0/p;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj0/m;->b:Lj0/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lj0/m;

    iget-object v1, p0, Lj0/m;->b:Lj0/p;

    invoke-direct {v0, v1, p2}, Lj0/m;-><init>(Lj0/p;Lu8/e;)V

    iput-object p1, v0, Lj0/m;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj0/m;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj0/m;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj0/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lj0/m;->a:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v0, Lj0/j;

    iget-object v1, p0, Lj0/m;->b:Lj0/p;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj0/j;-><init>(Lj0/p;Lu8/e;)V

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-static {p1, v2, v3, v0, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    new-instance v0, Lj0/k;

    invoke-direct {v0, v1, v2}, Lj0/k;-><init>(Lj0/p;Lu8/e;)V

    invoke-static {p1, v2, v3, v0, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    new-instance v0, Lj0/l;

    invoke-direct {v0, v1, v2}, Lj0/l;-><init>(Lj0/p;Lu8/e;)V

    invoke-static {p1, v2, v3, v0, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p1

    return-object p1
.end method
