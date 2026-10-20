.class public final Lm9/p;
.super Lm9/h1;

# interfaces
.implements Lm9/o;


# instance fields
.field public final e:Lm9/q;


# direct methods
.method public constructor <init>(Lm9/p1;)V
    .locals 0

    invoke-direct {p0}, Lr9/j;-><init>()V

    iput-object p1, p0, Lm9/p;->e:Lm9/q;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lm9/j1;->m()Lm9/p1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm9/p1;->D(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/p;->n(Ljava/lang/Throwable;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lm9/j1;->m()Lm9/p1;

    move-result-object p1

    iget-object v0, p0, Lm9/p;->e:Lm9/q;

    check-cast v0, Lm9/p1;

    invoke-virtual {v0, p1}, Lm9/p1;->z(Ljava/lang/Object;)Z

    return-void
.end method
