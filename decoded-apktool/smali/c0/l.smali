.class public final Lc0/l;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lc0/m;

.field public final synthetic c:Lr1/s;

.field public final synthetic d:Lc9/a;

.field public final synthetic e:Lc9/a;


# direct methods
.method public constructor <init>(Lc0/m;Lr1/s;Lc9/a;Lc9/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lc0/l;->b:Lc0/m;

    iput-object p2, p0, Lc0/l;->c:Lr1/s;

    iput-object p3, p0, Lc0/l;->d:Lc9/a;

    iput-object p4, p0, Lc0/l;->e:Lc9/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance v6, Lc0/l;

    iget-object v1, p0, Lc0/l;->b:Lc0/m;

    iget-object v2, p0, Lc0/l;->c:Lr1/s;

    iget-object v3, p0, Lc0/l;->d:Lc9/a;

    iget-object v4, p0, Lc0/l;->e:Lc9/a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lc0/l;-><init>(Lc0/m;Lr1/s;Lc9/a;Lc9/a;Lu8/e;)V

    iput-object p1, v6, Lc0/l;->a:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lc0/l;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lc0/l;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lc0/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/l;->a:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v0, Lc0/j;

    iget-object v1, p0, Lc0/l;->b:Lc0/m;

    iget-object v2, p0, Lc0/l;->c:Lr1/s;

    iget-object v3, p0, Lc0/l;->d:Lc9/a;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lc0/j;-><init>(Lc0/m;Lr1/s;Lc9/a;Lu8/e;)V

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {p1, v4, v2, v0, v3}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    new-instance v0, Lc0/k;

    iget-object v5, p0, Lc0/l;->e:Lc9/a;

    invoke-direct {v0, v1, v5, v4}, Lc0/k;-><init>(Lc0/m;Lc9/a;Lu8/e;)V

    invoke-static {p1, v4, v2, v0, v3}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p1

    return-object p1
.end method
