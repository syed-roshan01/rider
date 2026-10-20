.class public final Lo1/f;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lq/l;

.field public final b:Lo1/w;


# direct methods
.method public constructor <init>(Lq/l;Lo1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/f;->a:Lq/l;

    iput-object p2, p0, Lo1/f;->b:Lo1/w;

    return-void
.end method


# virtual methods
.method public final a(J)Z
    .locals 7

    iget-object v0, p0, Lo1/f;->b:Lo1/w;

    iget-object v0, v0, Lo1/w;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lo1/x;

    iget-wide v5, v5, Lo1/x;->a:J

    invoke-static {v5, v6, p1, p2}, Lo1/t;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Lo1/x;

    if-eqz v4, :cond_2

    iget-boolean v2, v4, Lo1/x;->h:Z

    :cond_2
    return v2
.end method
