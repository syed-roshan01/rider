.class public final synthetic Lb3/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:Lb3/m;

.field public final synthetic b:Lb3/o;


# direct methods
.method public synthetic constructor <init>(Lb3/m;Lb3/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/j;->a:Lb3/m;

    iput-object p2, p0, Lb3/j;->b:Lb3/o;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 1

    sget-object p1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    iget-object v0, p0, Lb3/j;->a:Lb3/m;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lb3/j;->b:Lb3/o;

    invoke-virtual {v0, p1}, Lb3/m;->b(Lb3/o;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method
