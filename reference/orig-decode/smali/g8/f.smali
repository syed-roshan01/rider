.class public abstract Lg8/f;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/j;
.implements Lg8/v3;


# instance fields
.field public a:Lg8/r0;

.field public final b:Ljava/lang/Object;

.field public final c:Lg8/e6;

.field public final d:Lg8/x3;

.field public e:I

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(ILg8/y5;Lg8/e6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg8/f;->b:Ljava/lang/Object;

    const-string v0, "transportTracer"

    invoke-static {p3, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Lg8/f;->c:Lg8/e6;

    new-instance v0, Lg8/x3;

    invoke-direct {v0, p0, p1, p2, p3}, Lg8/x3;-><init>(Lg8/v3;ILg8/y5;Lg8/e6;)V

    iput-object v0, p0, Lg8/f;->d:Lg8/x3;

    iput-object v0, p0, Lg8/f;->a:Lg8/r0;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 1

    move-object v0, p0

    check-cast v0, Lg8/a;

    iget-object v0, v0, Lg8/a;->j:Lg8/j0;

    invoke-interface {v0, p1}, Lg8/b6;->a(Lg8/a6;)V

    return-void
.end method

.method public final e()Z
    .locals 3

    iget-object v0, p0, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg8/f;->f:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lg8/f;->e:I

    const v2, 0x8000

    if-ge v1, v2, :cond_0

    iget-boolean v1, p0, Lg8/f;->g:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
