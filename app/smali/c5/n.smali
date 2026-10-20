.class public final Lc5/n;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lc5/n;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lc5/n;

    iget-object v0, p0, Lc5/n;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-direct {p1, v0, p2}, Lc5/n;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lc5/n;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lc5/n;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lc5/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lc5/n;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object p1, p1, Lcom/auto/accept/ui/viewmodel/MainViewModel;->q0:Lp9/q0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lp9/q0;->i(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
