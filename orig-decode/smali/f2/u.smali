.class public final Lf2/u;
.super Ljava/lang/Object;


# instance fields
.field public final a:La4/q;

.field public final b:Le2/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La4/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf2/u;->a:La4/q;

    new-instance v0, Le2/b;

    invoke-direct {v0}, Le2/b;-><init>()V

    iput-object v0, p0, Lf2/u;->b:Le2/b;

    return-void
.end method
