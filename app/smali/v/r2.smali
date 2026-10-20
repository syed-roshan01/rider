.class public final Lv/r2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lv/l1;


# direct methods
.method public constructor <init>(Lv/l1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/r2;->a:Lv/l1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lv/r2;

    iget-object v0, p0, Lv/r2;->a:Lv/l1;

    invoke-direct {p1, v0, p2}, Lv/r2;-><init>(Lv/l1;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/r2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/r2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/r2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lv/r2;->a:Lv/l1;

    iput-boolean p1, v0, Lv/l1;->c:Z

    const/4 p1, 0x0

    iget-object v0, v0, Lv/l1;->d:Lu9/d;

    invoke-virtual {v0, p1}, Lu9/d;->d(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
