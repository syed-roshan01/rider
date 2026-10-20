.class public final Ll4/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ll4/f;

.field public b:Z

.field public final synthetic c:Ll4/j;


# direct methods
.method public constructor <init>(Ll4/j;Ll4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/g;->c:Ll4/j;

    iput-object p2, p0, Ll4/g;->a:Ll4/f;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-boolean v0, p0, Ll4/g;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll4/g;->b:Z

    iget-object v0, p0, Ll4/g;->c:Ll4/j;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll4/g;->a:Ll4/f;

    iget v2, v1, Ll4/f;->h:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll4/f;->h:I

    if-nez v2, :cond_0

    iget-boolean v2, v1, Ll4/f;->f:Z

    if-eqz v2, :cond_0

    sget-object v2, Ll4/j;->x:Ll9/d;

    invoke-virtual {v0, v1}, Ll4/j;->P(Ll4/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method
