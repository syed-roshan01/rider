.class public final Ln0/c;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ln0/i0;

.field public final b:Ln0/i0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln0/i0;

    invoke-direct {v0}, Ln0/i0;-><init>()V

    iput-object v0, p0, Ln0/c;->a:Ln0/i0;

    new-instance v0, Ln0/i0;

    invoke-direct {v0}, Ln0/i0;-><init>()V

    iput-object v0, p0, Ln0/c;->b:Ln0/i0;

    return-void
.end method
