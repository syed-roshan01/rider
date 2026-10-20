.class public final Ln8/f;
.super Ln8/a;


# static fields
.field public static final l:Lg8/p;


# instance fields
.field public final c:Ln8/d;

.field public final d:Le8/j0;

.field public e:Le8/i;

.field public f:Le8/z0;

.field public g:Le8/i;

.field public h:Le8/z0;

.field public i:Le8/x;

.field public j:Lz6/a;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg8/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg8/p;-><init>(I)V

    sput-object v0, Ln8/f;->l:Lg8/p;

    return-void
.end method

.method public constructor <init>(Ln8/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln8/d;

    invoke-direct {v0, p0}, Ln8/d;-><init>(Ln8/f;)V

    iput-object v0, p0, Ln8/f;->c:Ln8/d;

    iput-object v0, p0, Ln8/f;->f:Le8/z0;

    iput-object v0, p0, Ln8/f;->h:Le8/z0;

    iput-object p1, p0, Ln8/f;->d:Le8/j0;

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 1

    iget-object v0, p0, Ln8/f;->h:Le8/z0;

    invoke-virtual {v0}, Le8/z0;->f()V

    iget-object v0, p0, Ln8/f;->f:Le8/z0;

    invoke-virtual {v0}, Le8/z0;->f()V

    return-void
.end method

.method public final g()Le8/z0;
    .locals 2

    iget-object v0, p0, Ln8/f;->h:Le8/z0;

    iget-object v1, p0, Ln8/f;->c:Ln8/d;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ln8/f;->f:Le8/z0;

    :cond_0
    return-object v0
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Ln8/f;->i:Le8/x;

    iget-object v1, p0, Ln8/f;->j:Lz6/a;

    iget-object v2, p0, Ln8/f;->d:Le8/j0;

    invoke-virtual {v2, v0, v1}, Le8/j0;->r(Le8/x;Lz6/a;)V

    iget-object v0, p0, Ln8/f;->f:Le8/z0;

    invoke-virtual {v0}, Le8/z0;->f()V

    iget-object v0, p0, Ln8/f;->h:Le8/z0;

    iput-object v0, p0, Ln8/f;->f:Le8/z0;

    iget-object v0, p0, Ln8/f;->g:Le8/i;

    iput-object v0, p0, Ln8/f;->e:Le8/i;

    iget-object v0, p0, Ln8/f;->c:Ln8/d;

    iput-object v0, p0, Ln8/f;->h:Le8/z0;

    const/4 v0, 0x0

    iput-object v0, p0, Ln8/f;->g:Le8/i;

    return-void
.end method
