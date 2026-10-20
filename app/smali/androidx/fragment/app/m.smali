.class public final Landroidx/fragment/app/m;
.super Landroidx/fragment/app/l;


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Z

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/s1;Lx2/g;ZZ)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/s1;Lx2/g;)V

    iget p2, p1, Landroidx/fragment/app/s1;->a:I

    const/4 v0, 0x2

    iget-object p1, p1, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    if-ne p2, v0, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getReenterTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getEnterTransition()Ljava/lang/Object;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Landroidx/fragment/app/m;->c:Ljava/lang/Object;

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getAllowReturnTransitionOverlap()Z

    move-result p2

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getAllowEnterTransitionOverlap()Z

    move-result p2

    :goto_1
    iput-boolean p2, p0, Landroidx/fragment/app/m;->d:Z

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getReturnTransition()Ljava/lang/Object;

    move-result-object p2

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getExitTransition()Ljava/lang/Object;

    move-result-object p2

    :goto_2
    iput-object p2, p0, Landroidx/fragment/app/m;->c:Ljava/lang/Object;

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/fragment/app/m;->d:Z

    :goto_3
    if-eqz p4, :cond_5

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getSharedElementReturnTransition()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/m;->e:Ljava/lang/Object;

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getSharedElementEnterTransition()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/m;->e:Ljava/lang/Object;

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/m;->e:Ljava/lang/Object;

    :goto_4
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Landroidx/fragment/app/o1;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Landroidx/fragment/app/h1;->a:Landroidx/fragment/app/m1;

    instance-of v1, p1, Landroid/transition/Transition;

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Landroidx/fragment/app/h1;->b:Landroidx/fragment/app/o1;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroidx/fragment/app/o1;->e(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transition "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    iget-object p1, p1, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid framework Transition or AndroidX Transition"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
