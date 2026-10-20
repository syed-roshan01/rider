.class public final Landroidx/fragment/app/w;
.super Ljava/lang/Object;

# interfaces
.implements Lo/a;
.implements Lx2/f;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/w;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Landroidx/fragment/app/w;->a:Ljava/lang/Object;

    check-cast p1, Landroidx/fragment/app/d0;

    iget-object v0, p1, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    instance-of v1, v0, Ld/j;

    if-eqz v1, :cond_0

    check-cast v0, Ld/j;

    invoke-interface {v0}, Ld/j;->getActivityResultRegistry()Ld/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->requireActivity()Landroidx/fragment/app/g0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/p;->getActivityResultRegistry()Ld/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/w;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/s1;

    invoke-virtual {v0}, Landroidx/fragment/app/s1;->a()V

    return-void
.end method
