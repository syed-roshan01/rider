.class public final Lc5/t;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final synthetic c:Lm0/l3;

.field public final synthetic d:Lm0/l3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/l3;Lm0/l3;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lc5/t;->a:Landroid/content/Context;

    iput-object p2, p0, Lc5/t;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p3, p0, Lc5/t;->c:Lm0/l3;

    iput-object p4, p0, Lc5/t;->d:Lm0/l3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    new-instance p1, Lc5/t;

    iget-object v1, p0, Lc5/t;->a:Landroid/content/Context;

    iget-object v2, p0, Lc5/t;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v3, p0, Lc5/t;->c:Lm0/l3;

    iget-object v4, p0, Lc5/t;->d:Lm0/l3;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lc5/t;-><init>(Landroid/content/Context;Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/l3;Lm0/l3;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lc5/t;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lc5/t;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lc5/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lc5/t;->c:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc5/t;->d:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x1

    iget-object v1, p0, Lc5/t;->a:Landroid/content/Context;

    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, Lc5/t;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object p1, p1, Lcom/auto/accept/ui/viewmodel/MainViewModel;->d0:Lp9/q0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lp9/q0;->i(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
