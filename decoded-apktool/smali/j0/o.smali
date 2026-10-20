.class public final Lj0/o;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lj0/p;


# direct methods
.method public constructor <init>(Lj0/p;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj0/o;->b:Lj0/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lj0/o;

    iget-object v1, p0, Lj0/o;->b:Lj0/p;

    invoke-direct {v0, v1, p2}, Lj0/o;-><init>(Lj0/p;Lu8/e;)V

    iput-object p1, v0, Lj0/o;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj0/o;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj0/o;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj0/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lj0/o;->a:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v0, Lj0/n;

    iget-object v1, p0, Lj0/o;->b:Lj0/p;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj0/n;-><init>(Lj0/p;Lu8/e;)V

    const/4 v1, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p1

    return-object p1
.end method
