.class public final Le8/d0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Le8/s;

.field public final b:Z


# direct methods
.method public constructor <init>(Le8/s;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "decompressor"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Le8/d0;->a:Le8/s;

    iput-boolean p2, p0, Le8/d0;->b:Z

    return-void
.end method
