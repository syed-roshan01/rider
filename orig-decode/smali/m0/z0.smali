.class public final Lm0/z0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/l3;


# instance fields
.field public final a:Lq8/i;


# direct methods
.method public constructor <init>(Lc9/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq8/i;

    invoke-direct {v0, p1}, Lq8/i;-><init>(Lc9/a;)V

    iput-object v0, p0, Lm0/z0;->a:Lq8/i;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm0/z0;->a:Lq8/i;

    invoke-virtual {v0}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
