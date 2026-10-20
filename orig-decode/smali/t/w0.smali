.class public abstract Lt/w0;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public final b:Lq/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12c

    iput v0, p0, Lt/w0;->a:I

    sget v0, Lq/i;->a:I

    new-instance v0, Lq/p;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lq/p;-><init>(I)V

    iput-object v0, p0, Lt/w0;->b:Lq/p;

    return-void
.end method
