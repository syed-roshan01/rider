.class public final Lz/d0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lz/g0;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lz/g0;IILu8/e;)V
    .locals 0

    iput-object p1, p0, Lz/d0;->a:Lz/g0;

    iput p2, p0, Lz/d0;->b:I

    iput p3, p0, Lz/d0;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lz/d0;

    iget v0, p0, Lz/d0;->b:I

    iget v1, p0, Lz/d0;->c:I

    iget-object v2, p0, Lz/d0;->a:Lz/g0;

    invoke-direct {p1, v2, v0, v1, p2}, Lz/d0;-><init>(Lz/g0;IILu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lz/d0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lz/d0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lz/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lz/d0;->a:Lz/g0;

    iget-object v0, p1, Lz/g0;->c:Lz/z;

    iget v1, p0, Lz/d0;->b:I

    iget v2, p0, Lz/d0;->c:I

    invoke-virtual {v0, v1, v2}, Lz/z;->a(II)V

    const/4 v1, 0x0

    iput-object v1, v0, Lz/z;->d:Ljava/lang/Object;

    iget-object v0, p1, Lz/g0;->p:Lz/j;

    iget-object v1, v0, Lz/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    sget-object v1, La0/d;->b:La0/d;

    iput-object v1, v0, Lz/j;->b:La0/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lz/g0;->m:Lr1/a1;

    if-eqz p1, :cond_0

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->j()V

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
