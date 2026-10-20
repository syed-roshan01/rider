.class public abstract Ly1/s;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ly1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly1/u;

    sget-object v1, Ly1/q;->r:Ly1/q;

    const-string v2, "TestTagsAsResourceId"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ly1/u;-><init>(Ljava/lang/String;ZLy1/q;)V

    sput-object v0, Ly1/s;->a:Ly1/u;

    return-void
.end method
