.class public final Landroidx/fragment/app/g;
.super Ljava/lang/Object;

# interfaces
.implements Lx2/f;
.implements Ldagger/hilt/android/internal/builders/ViewWithFragmentComponentBuilder;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Li5/a;)V
    .locals 10

    new-instance v3, Lb0/l0;

    const/16 v0, 0xc

    invoke-direct {v3, v0}, Lb0/l0;-><init>(I)V

    iget-object v0, p0, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    check-cast v0, Ll5/t;

    new-instance v1, Landroidx/fragment/app/g;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Landroidx/fragment/app/g;-><init>(I)V

    iget-object v2, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    check-cast v2, Ll5/j;

    if-eqz v2, :cond_5

    iput-object v2, v1, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    iput-object p1, v1, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    iget-object p1, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const-string v2, "Null transportName"

    if-eqz p1, :cond_4

    iput-object p1, v1, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    iget-object p1, p0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    check-cast p1, Lb0/l0;

    if-eqz p1, :cond_3

    iput-object p1, v1, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    iget-object p1, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    check-cast p1, Li5/c;

    if-eqz p1, :cond_2

    iput-object p1, v1, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    const-string p1, ""

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object p1, v1, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    check-cast p1, Ll5/j;

    iget-object v4, v1, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    check-cast v5, Li5/a;

    iget-object v6, v1, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    check-cast v6, Lb0/l0;

    iget-object v1, v1, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    check-cast v1, Li5/c;

    check-cast v0, Ll5/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Li5/d;->a:Li5/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll5/j;->a()Ll/z2;

    move-result-object v8

    iget-object v9, p1, Ll5/j;->a:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ll/z2;->L(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ll/z2;->N(Li5/d;)V

    iget-object p1, p1, Ll5/j;->b:[B

    iput-object p1, v8, Ll/z2;->c:Ljava/lang/Object;

    invoke-virtual {v8}, Ll/z2;->j()Ll5/j;

    move-result-object p1

    new-instance v7, Ll/r;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Ll/r;-><init>(I)V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    iput-object v8, v7, Ll/r;->g:Ljava/lang/Object;

    iget-object v8, v0, Ll5/u;->a:Lt5/a;

    check-cast v8, Lt5/c;

    invoke-virtual {v8}, Lt5/c;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v8, v7, Ll/r;->e:Ljava/lang/Object;

    iget-object v8, v0, Ll5/u;->b:Lt5/a;

    check-cast v8, Lt5/c;

    invoke-virtual {v8}, Lt5/c;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v8, v7, Ll/r;->f:Ljava/lang/Object;

    if-eqz v4, :cond_0

    iput-object v4, v7, Ll/r;->b:Ljava/lang/Object;

    new-instance v2, Ll5/m;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v5, Li5/a;->a:Ljava/lang/Object;

    check-cast v4, Lcom/google/firebase/messaging/reporting/MessagingClientEventExtension;

    invoke-virtual {v4}, Lcom/google/firebase/messaging/reporting/MessagingClientEventExtension;->toByteArray()[B

    move-result-object v4

    invoke-direct {v2, v1, v4}, Ll5/m;-><init>(Li5/c;[B)V

    invoke-virtual {v7, v2}, Ll/r;->i(Ll5/m;)V

    const/4 v1, 0x0

    iput-object v1, v7, Ll/r;->c:Ljava/io/Serializable;

    invoke-virtual {v7}, Ll/r;->c()Ll5/i;

    move-result-object v4

    iget-object v0, v0, Ll5/u;->c:Lp5/d;

    move-object v6, v0

    check-cast v6, Lp5/c;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lp5/a;

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, v6

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lp5/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, v6, Lp5/c;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties:"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null encoding"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null transformer"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null transportContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final build()Ldagger/hilt/android/components/ViewWithFragmentComponent;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    const-class v1, Landroid/view/View;

    invoke-static {v1, v0}, Lz6/a;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    new-instance v0, Ly4/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/l;->a()V

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Animation from operation "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/s1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has been cancelled."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final view(Landroid/view/View;)Ldagger/hilt/android/internal/builders/ViewWithFragmentComponentBuilder;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    return-object p0
.end method
