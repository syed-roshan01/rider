.class public final Lu1/f3;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;

.field public final b:Ljava/lang/ref/ReferenceQueue;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/ref/Reference;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lu1/f3;->a:Lo0/i;

    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lu1/f3;->b:Ljava/lang/ref/ReferenceQueue;

    return-void
.end method
