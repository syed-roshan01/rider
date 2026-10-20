.class public abstract Ln3/g;
.super Ln3/j;


# direct methods
.method public constructor <init>(ILandroidx/fragment/app/d0;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    const-string v1, "fragment"

    if-eq p1, v0, :cond_0

    invoke-static {p2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Ln3/j;-><init>(Landroidx/fragment/app/d0;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Ln3/j;-><init>(Landroidx/fragment/app/d0;Ljava/lang/String;)V

    return-void
.end method
