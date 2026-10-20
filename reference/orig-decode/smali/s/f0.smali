.class public final Ls/f0;
.super Ljava/lang/Object;

# interfaces
.implements Ls/e0;


# instance fields
.field public final a:Lm0/n1;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm2/k;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lm2/k;-><init>(J)V

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Ls/f0;->a:Lm0/n1;

    return-void
.end method
