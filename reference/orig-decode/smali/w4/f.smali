.class public final Lw4/f;
.super Ljava/lang/Object;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Lx9/e;

.field public final b:Lm9/k;


# direct methods
.method public constructor <init>(Lba/i;Lm9/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/f;->a:Lx9/e;

    iput-object p2, p0, Lw4/f;->b:Lm9/k;

    return-void
.end method


# virtual methods
.method public final a(Lba/i;Ljava/io/IOException;)V
    .locals 0

    iget-boolean p1, p1, Lba/i;->w:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lw4/f;->b:Lm9/k;

    invoke-static {p2}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    :try_start_0
    iget-object p1, p0, Lw4/f;->a:Lx9/e;

    check-cast p1, Lba/i;

    invoke-virtual {p1}, Lba/i;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
