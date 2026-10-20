.class public abstract Lo9/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lo9/k;

.field public static final b:I

.field public static final c:I

.field public static final d:Li3/u;

.field public static final e:Li3/u;

.field public static final f:Li3/u;

.field public static final g:Li3/u;

.field public static final h:Li3/u;

.field public static final i:Li3/u;

.field public static final j:Li3/u;

.field public static final k:Li3/u;

.field public static final l:Li3/u;

.field public static final m:Li3/u;

.field public static final n:Li3/u;

.field public static final o:Li3/u;

.field public static final p:Li3/u;

.field public static final q:Li3/u;

.field public static final r:Li3/u;

.field public static final s:Li3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lo9/k;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lo9/k;-><init>(JLo9/k;Lo9/c;I)V

    sput-object v6, Lo9/e;->a:Lo9/k;

    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lo9/e;->b:I

    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v1, 0x2710

    invoke-static {v0, v1, v2, v2, v3}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lo9/e;->c:I

    new-instance v0, Li3/u;

    const-string v1, "BUFFERED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->d:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->e:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->f:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->g:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "POISONED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->h:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->i:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->j:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->k:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->l:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->m:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->n:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->o:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->p:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->q:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->r:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/e;->s:Li3/u;

    return-void
.end method

.method public static final a(Lm9/k;Ljava/lang/Object;Lc9/c;)Z
    .locals 0

    invoke-interface {p0, p1, p2}, Lm9/k;->k(Ljava/lang/Object;Lc9/c;)Li3/u;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lm9/k;->x(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
