.class public final synthetic Lb3/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:Lb3/m;

.field public final synthetic b:Landroidx/lifecycle/q;

.field public final synthetic c:Lb3/o;


# direct methods
.method public synthetic constructor <init>(Lb3/m;Landroidx/lifecycle/q;Lb3/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/k;->a:Lb3/m;

    iput-object p2, p0, Lb3/k;->b:Landroidx/lifecycle/q;

    iput-object p3, p0, Lb3/k;->c:Lb3/o;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 5

    iget-object p1, p0, Lb3/k;->a:Lb3/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroidx/lifecycle/p;->Companion:Landroidx/lifecycle/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lb3/k;->b:Landroidx/lifecycle/q;

    const-string v1, "state"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    goto :goto_0

    :cond_1
    sget-object v1, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    goto :goto_0

    :cond_2
    sget-object v1, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    :goto_0
    iget-object v2, p1, Lb3/m;->a:Ljava/lang/Runnable;

    iget-object v3, p1, Lb3/m;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v4, p0, Lb3/k;->c:Lb3/o;

    if-ne p2, v1, :cond_3

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_3
    sget-object v1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    if-ne p2, v1, :cond_4

    invoke-virtual {p1, v4}, Lb3/m;->b(Lb3/o;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Landroidx/lifecycle/n;->a(Landroidx/lifecycle/q;)Landroidx/lifecycle/p;

    move-result-object p1

    if-ne p2, p1, :cond_5

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_5
    :goto_1
    return-void
.end method
