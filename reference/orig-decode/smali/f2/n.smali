.class public final Lf2/n;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lx9/v;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Lx9/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lx9/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    :goto_0
    iput-object v0, p0, Lf2/n;->a:Lx9/v;

    return-void
.end method
