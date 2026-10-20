.class public final Lg8/x5;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/v3;


# instance fields
.field public final a:Lg8/v3;

.field public b:Z


# direct methods
.method public constructor <init>(Lg8/v1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/x5;->a:Lg8/v3;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 1

    iget-boolean v0, p0, Lg8/x5;->b:Z

    if-eqz v0, :cond_1

    instance-of v0, p1, Ljava/io/Closeable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/io/Closeable;

    invoke-static {p1}, Lg8/s1;->b(Ljava/io/Closeable;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lg8/x5;->a:Lg8/v3;

    invoke-interface {v0, p1}, Lg8/v3;->a(Lg8/a6;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/x5;->b:Z

    iget-object v0, p0, Lg8/x5;->a:Lg8/v3;

    invoke-interface {v0, p1}, Lg8/v3;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/x5;->b:Z

    iget-object v0, p0, Lg8/x5;->a:Lg8/v3;

    invoke-interface {v0, p1}, Lg8/v3;->c(Z)V

    return-void
.end method

.method public final d(I)V
    .locals 1

    iget-object v0, p0, Lg8/x5;->a:Lg8/v3;

    invoke-interface {v0, p1}, Lg8/v3;->d(I)V

    return-void
.end method
