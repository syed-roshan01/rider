.class public final Ly5/l;
.super Ly5/m;


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>(IILandroid/os/Bundle;I)V
    .locals 1

    iput p4, p0, Ly5/l;->e:I

    const/4 v0, 0x1

    if-eq p4, v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Ly5/m;-><init>(IILandroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-direct {p0, p1, v0, p3}, Ly5/m;-><init>(IILandroid/os/Bundle;)V

    return-void
.end method
