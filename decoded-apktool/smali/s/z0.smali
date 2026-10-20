.class public final Ls/z0;
.super Ljava/lang/Object;

# interfaces
.implements Lt/g0;


# instance fields
.field public final a:Ls/u0;


# direct methods
.method public constructor <init>(Lm2/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls/u0;

    sget v1, Ls/a1;->a:F

    invoke-direct {v0, v1, p1}, Ls/u0;-><init>(FLm2/b;)V

    iput-object v0, p0, Ls/z0;->a:Ls/u0;

    return-void
.end method
