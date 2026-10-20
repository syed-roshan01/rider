.class public final Ly1/u;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lc9/e;

.field public c:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly1/q;->t:Ly1/q;

    .line 1
    invoke-direct {p0, p1, v0}, Ly1/u;-><init>(Ljava/lang/String;Lc9/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lc9/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/u;->a:Ljava/lang/String;

    iput-object p2, p0, Ly1/u;->b:Lc9/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLy1/q;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p3}, Ly1/u;-><init>(Ljava/lang/String;Lc9/e;)V

    iput-boolean p2, p0, Ly1/u;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ly1/v;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ly1/j;

    invoke-virtual {p1, p0, p2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessibilityKey: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly1/u;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
