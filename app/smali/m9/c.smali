.class public final Lm9/c;
.super Lm9/j1;


# static fields
.field public static final o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _disposer:Ljava/lang/Object;

.field public final e:Lm9/k;

.field public f:Lm9/o0;

.field public final synthetic n:Lm9/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_disposer"

    const-class v2, Lm9/c;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm9/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm9/e;Lm9/l;)V
    .locals 0

    iput-object p1, p0, Lm9/c;->n:Lm9/e;

    invoke-direct {p0}, Lr9/j;-><init>()V

    iput-object p2, p0, Lm9/c;->e:Lm9/k;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/c;->n(Ljava/lang/Throwable;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lm9/c;->e:Lm9/k;

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Lm9/k;->w(Ljava/lang/Throwable;)Li3/u;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {v0, p1}, Lm9/k;->x(Ljava/lang/Object;)V

    sget-object p1, Lm9/c;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm9/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lm9/d;->b()V

    goto :goto_1

    :cond_0
    sget-object p1, Lm9/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    iget-object v1, p0, Lm9/c;->n:Lm9/e;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, v1, Lm9/e;->a:[Lm9/h0;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    invoke-interface {v4}, Lm9/h0;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method
