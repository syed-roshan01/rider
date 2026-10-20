.class public abstract Lw0/i0;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:Lw0/i0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v0

    iput v0, p0, Lw0/i0;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(Lw0/i0;)V
.end method

.method public abstract b()Lw0/i0;
.end method
