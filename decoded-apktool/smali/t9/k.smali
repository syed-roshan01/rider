.class public final Lt9/k;
.super Lm9/z;


# static fields
.field public static final c:Lt9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt9/k;

    invoke-direct {v0}, Lm9/z;-><init>()V

    sput-object v0, Lt9/k;->c:Lt9/k;

    return-void
.end method


# virtual methods
.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lt9/d;->d:Lt9/d;

    sget-object v0, Lt9/j;->h:Lx9/v;

    iget-object p1, p1, Lt9/g;->c:Lt9/b;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lt9/b;->b(Ljava/lang/Runnable;Lx9/v;Z)V

    return-void
.end method

.method public final e0(I)Lm9/z;
    .locals 1

    invoke-static {p1}, Lh6/g;->d(I)V

    sget v0, Lt9/j;->d:I

    if-lt p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lm9/z;->e0(I)Lm9/z;

    move-result-object p1

    return-object p1
.end method
