.class public final Lg2/e0;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/v;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lg2/p;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Z

.field public e:Lc9/c;

.field public f:Lc9/c;

.field public g:Lg2/a0;

.field public h:Lg2/o;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lq8/c;

.field public k:Landroid/graphics/Rect;

.field public final l:Lg2/e;

.field public final m:Lo0/i;

.field public n:Landroidx/activity/d;


# direct methods
.method public constructor <init>(Landroid/view/View;Lo1/b0;)V
    .locals 5

    new-instance v0, Lg2/q;

    invoke-direct {v0, p1}, Lg2/q;-><init>(Landroid/view/View;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v1

    new-instance v2, Lg2/f0;

    invoke-direct {v2, v1}, Lg2/f0;-><init>(Landroid/view/Choreographer;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/e0;->a:Landroid/view/View;

    iput-object v0, p0, Lg2/e0;->b:Lg2/p;

    iput-object v2, p0, Lg2/e0;->c:Ljava/util/concurrent/Executor;

    sget-object p1, Lg2/d;->d:Lg2/d;

    iput-object p1, p0, Lg2/e0;->e:Lc9/c;

    sget-object p1, Lg2/d;->e:Lg2/d;

    iput-object p1, p0, Lg2/e0;->f:Lc9/c;

    new-instance p1, Lg2/a0;

    sget-wide v1, La2/b0;->b:J

    const-string v3, ""

    const/4 v4, 0x4

    invoke-direct {p1, v3, v1, v2, v4}, Lg2/a0;-><init>(Ljava/lang/String;JI)V

    iput-object p1, p0, Lg2/e0;->g:Lg2/a0;

    sget-object p1, Lg2/o;->f:Lg2/o;

    iput-object p1, p0, Lg2/e0;->h:Lg2/o;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg2/e0;->i:Ljava/util/ArrayList;

    sget-object p1, Lq8/d;->a:[Lq8/d;

    new-instance p1, Lu1/z0;

    invoke-direct {p1, p0, v4}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object p1

    iput-object p1, p0, Lg2/e0;->j:Lq8/c;

    new-instance p1, Lg2/e;

    invoke-direct {p1, p2, v0}, Lg2/e;-><init>(Lo1/b0;Lg2/q;)V

    iput-object p1, p0, Lg2/e0;->l:Lg2/e;

    new-instance p1, Lo0/i;

    const/16 p2, 0x10

    new-array p2, p2, [Lg2/c0;

    invoke-direct {p1, p2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lg2/e0;->m:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a(Lg2/c0;)V
    .locals 1

    iget-object v0, p0, Lg2/e0;->m:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object p1, p0, Lg2/e0;->n:Landroidx/activity/d;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/activity/d;

    const/4 v0, 0x7

    invoke-direct {p1, p0, v0}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lg2/e0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lg2/e0;->n:Landroidx/activity/d;

    :cond_0
    return-void
.end method
