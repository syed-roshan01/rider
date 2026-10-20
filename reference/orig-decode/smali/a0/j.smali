.class public final La0/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [La0/i;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, La0/j;->a:Lo0/i;

    return-void
.end method
