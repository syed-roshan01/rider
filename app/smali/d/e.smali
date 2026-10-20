.class public final Ld/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ld/c;

.field public final synthetic c:Le/b;

.field public final synthetic d:Ld/i;


# direct methods
.method public constructor <init>(Ld/i;Ljava/lang/String;Ld/c;Le/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/e;->d:Ld/i;

    iput-object p2, p0, Ld/e;->a:Ljava/lang/String;

    iput-object p3, p0, Ld/e;->b:Ld/c;

    iput-object p4, p0, Ld/e;->c:Le/b;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 4

    sget-object p1, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    iget-object v0, p0, Ld/e;->a:Ljava/lang/String;

    iget-object v1, p0, Ld/e;->d:Ld/i;

    if-eqz p1, :cond_1

    iget-object p1, v1, Ld/i;->e:Ljava/util/HashMap;

    new-instance p2, Ld/g;

    iget-object v2, p0, Ld/e;->c:Le/b;

    iget-object v3, p0, Ld/e;->b:Ld/c;

    invoke-direct {p2, v2, v3}, Ld/g;-><init>(Le/b;Ld/c;)V

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v1, Ld/i;->f:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3, p2}, Ld/c;->a(Ljava/lang/Object;)V

    :cond_0
    iget-object p1, v1, Ld/i;->g:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Ld/b;

    if-eqz p2, :cond_3

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object p1, p2, Ld/b;->b:Landroid/content/Intent;

    iget p2, p2, Ld/b;->a:I

    invoke-virtual {v2, p1, p2}, Le/b;->c(Landroid/content/Intent;I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v3, p1}, Ld/c;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v1, Ld/i;->e:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object p1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v1, v0}, Ld/i;->f(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
